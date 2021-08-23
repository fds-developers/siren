package com.fds.opendata.siren.utils;

import java.io.File;
import java.net.URL;

public final class ReadFileFromClasspath {

	public File getFile(final String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);

		if (resource == null) {
			throw new IllegalArgumentException("file not found!");
		} else {
			return new File(resource.getFile());
		}
	}
}