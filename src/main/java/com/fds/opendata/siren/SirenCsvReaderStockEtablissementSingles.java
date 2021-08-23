package com.fds.opendata.siren;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fds.opendata.siren.FileLineReader.CallbackReadLine;
import com.fds.opendata.siren.dao.SirenStockEtablissement;

public class SirenCsvReaderStockEtablissementSingles {

	private final File f;
	private final Charset charset;
	private final CallbackReadEntry cb;

	public SirenCsvReaderStockEtablissementSingles(final File f, final Charset charset, final CallbackReadEntry cb) {
		this.f = f;
		this.charset = charset;
		this.cb = cb;
	}

	public void read() throws ReaderException {
		final CsvMapper csvMapper = new CsvMapper();

		final CsvSchema csvSchema = csvMapper
                .typedSchemaFor(SirenStockEtablissement.class)
                .withHeader()
                .withColumnSeparator(',')
                .withComments();
        
		final ObjectReader oReader = csvMapper.readerWithTypedSchemaFor(SirenStockEtablissement.class).with(csvSchema);

		new FileLineReader(f, charset, new CallbackReadLineImpl(cb, oReader)).read();

	}
	
	private static final class CallbackReadLineImpl implements CallbackReadLine {

		private final CallbackReadEntry cb;
		private final ObjectReader oReader;

		public CallbackReadLineImpl(final CallbackReadEntry cb, final ObjectReader oReader) {
			super();
			this.cb = cb;
			this.oReader = oReader;
		}

		@Override
		public boolean accept(final String line) throws ReaderException {
			try {
				final SirenStockEtablissement record = oReader.readValue(line);
				System.out.println(record);
				return cb.accept(record);
			} catch (IOException e1) {
				throw new ReaderException(e1);
			}
		}
		
	}

	public static interface CallbackReadEntry {
		public boolean accept(SirenStockEtablissement entry) throws ReaderException;
	}

}
