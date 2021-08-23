package com.fds.tests.opendata.siren;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.fds.opendata.siren.FilePrinter;
import com.fds.opendata.siren.ReaderException;
import com.fds.opendata.siren.SirenCsvReaderAccumulator;
import com.fds.opendata.siren.SirenCsvReaderStockEtablissementSingles;
import com.fds.opendata.siren.dao.SirenStockEtablissement;
import com.fds.opendata.siren.utils.ReadFileFromClasspath;

@RunWith(JUnitPlatform.class)
public class MainTests {

	@Test
	public void helloTest() {
		Assertions.assertTrue(true);
	}

	@Test
	public void readFileUtf10Le() throws ReaderException {
		new FilePrinter().read(new ReadFileFromClasspath().getFile("first10.csv"), Charset.forName("UTF-16"));
	}

	@Test
	public void readEt10() throws ReaderException {
		final List<SirenStockEtablissement> records = new SirenCsvReaderAccumulator()
				.read(new ReadFileFromClasspath().getFile("first10.csv"), Charset.forName("UTF-16"));
		System.out.println(records);
	}

	@Test
	public void readEtFull() throws ReaderException {
		System.out.println("reading 5gb");
		new SirenCsvReaderStockEtablissementSingles(new File(
				"C:\\Users\\micka\\MickFiles\\FDS\\opendata\\siren\\Sirene Fichier StockEtablissement du 01 août 2021\\StockEtablissement_utf8.csv"),
				Charset.forName("UTF-16"), (entry) -> true).read();
		// System.out.println(records);
		System.out.println("done");
	}
}
