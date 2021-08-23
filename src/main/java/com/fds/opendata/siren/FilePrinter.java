package com.fds.opendata.siren;

import java.io.File;
import java.nio.charset.Charset;

public class FilePrinter {

	public void read(File f, Charset charset) throws ReaderException {

		new FileLineReader(f, charset, (line) -> {
			System.out.println(line);
			return true;
		});

	}

}
