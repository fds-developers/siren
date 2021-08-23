package com.fds.opendata.siren;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class FileLineReader {

	private final File f;
	private final Charset charset;
	private final CallbackReadLine cb;

	public FileLineReader(final File f, final Charset charset, final CallbackReadLine cb) {
		this.f = f;
		this.charset = charset;
		this.cb = cb;
	}

	public void read() throws ReaderException {

		try (final LineIterator it = FileUtils.lineIterator(f, "UTF-8")) {
			boolean keepGoing = true;
			
		    while (it.hasNext() && keepGoing) {
		        final String line = it.nextLine();
		        keepGoing = cb.accept(line);
		    }
		} catch (final IOException e1) {
			throw new ReaderException(e1);
		}

	}

	public static interface CallbackReadLine {
		public boolean accept(String line) throws ReaderException;
	}
}
