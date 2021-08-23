package com.fds.opendata.siren;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fds.opendata.siren.dao.SirenStockEtablissement;

public class SirenCsvReaderStockEtablissementAtOnce {

	private final File f;
	private final Charset charset;
	private final CallbackReadEntry cb;

	public SirenCsvReaderStockEtablissementAtOnce(final File f, final Charset charset, final CallbackReadEntry cb) {
		this.f = f;
		this.charset = charset;
		this.cb = cb;
	}

	public List<SirenStockEtablissement> read() throws ReaderException {
		final CsvMapper csvMapper = new CsvMapper();
		final CsvSchema schema = CsvSchema.emptySchema().withHeader();
		final ObjectReader oReader = csvMapper.readerWithTypedSchemaFor(SirenStockEtablissement.class).with(schema);
		final List<SirenStockEtablissement> records = new ArrayList<>();

		try (final Reader reader = new FileReader(f, charset)) {
			final MappingIterator<SirenStockEtablissement> mi = oReader.readValues(reader);
			boolean keepGoing = true;
			while (mi.hasNext() && keepGoing) {
				final SirenStockEtablissement current = mi.next();
				keepGoing = cb.accept(current);
			}
		} catch (final FileNotFoundException e) {
			throw new ReaderException(e);
		} catch (final Exception e) {
			throw new ReaderException(e);
		}

		return records;
	}

	public static interface CallbackReadEntry {
		public boolean accept(SirenStockEtablissement entry) throws ReaderException;
	}

}
