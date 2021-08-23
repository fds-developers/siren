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

public class SirenCsvReaderAccumulator {

	public List<SirenStockEtablissement> read(File f, Charset charset)
			throws ReaderException {
		final CsvMapper csvMapper = new CsvMapper();
		final CsvSchema schema = CsvSchema.emptySchema().withHeader();
		final ObjectReader oReader = csvMapper.readerWithTypedSchemaFor(SirenStockEtablissement.class).with(schema);
		final List<SirenStockEtablissement> records = new ArrayList<>();

		try (final Reader reader = new FileReader(f, charset)) {
			final MappingIterator<SirenStockEtablissement> mi = oReader.readValues(reader);
			while (mi.hasNext()) {
				final SirenStockEtablissement current = mi.next();
				records.add(current);
			}
		} catch (final FileNotFoundException e) {
			throw new ReaderException(e);
		} catch (final Exception e) {
			throw new ReaderException(e);
		}

		return records;
	}

}
