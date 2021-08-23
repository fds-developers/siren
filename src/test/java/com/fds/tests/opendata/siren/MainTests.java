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
	public void readEtSampleHeader() throws ReaderException {
		SirenCsvReaderStockEtablissementSingles reader = new SirenCsvReaderStockEtablissementSingles(null, null, null);
		new SirenCsvReaderStockEtablissementSingles.CallbackReadLineImpl((entry) -> true, reader.getoReader()).accept("siren,nic,siret,statutDiffusionEtablissement,dateCreationEtablissement,trancheEffectifsEtablissement,anneeEffectifsEtablissement,activitePrincipaleRegistreMetiersEtablissement,dateDernierTraitementEtablissement,etablissementSiege,nombrePeriodesEtablissement,complementAdresseEtablissement,numeroVoieEtablissement,indiceRepetitionEtablissement,typeVoieEtablissement,libelleVoieEtablissement,codePostalEtablissement,libelleCommuneEtablissement,libelleCommuneEtrangerEtablissement,distributionSpecialeEtablissement,codeCommuneEtablissement,codeCedexEtablissement,libelleCedexEtablissement,codePaysEtrangerEtablissement,libellePaysEtrangerEtablissement,complementAdresse2Etablissement,numeroVoie2Etablissement,indiceRepetition2Etablissement,typeVoie2Etablissement,libelleVoie2Etablissement,codePostal2Etablissement,libelleCommune2Etablissement,libelleCommuneEtranger2Etablissement,distributionSpeciale2Etablissement,codeCommune2Etablissement,codeCedex2Etablissement,libelleCedex2Etablissement,codePaysEtranger2Etablissement,libellePaysEtranger2Etablissement,dateDebut,etatAdministratifEtablissement,enseigne1Etablissement,enseigne2Etablissement,enseigne3Etablissement,denominationUsuelleEtablissement,activitePrincipaleEtablissement,nomenclatureActivitePrincipaleEtablissement,caractereEmployeurEtablissement");
		
	}

	@Test
	public void readEtSampleEntry() throws ReaderException {
		SirenCsvReaderStockEtablissementSingles reader = new SirenCsvReaderStockEtablissementSingles(null, null, null);
		new SirenCsvReaderStockEtablissementSingles.CallbackReadLineImpl((entry) -> true, reader.getoReader()).accept("000325175,00016,00032517500016,O,2000-09-26,,,3212ZZ,2015-03-18T00:58:59,false,3,,,,,MANIHI COTE MONTAGNE TUAMOTU,98770,MANIHI,,,98727,,,,,,,,,,,,,,,,,,,2009-05-27,F,,,,,32.12Z,NAFRev2,N");
	}

	@Test
	public void readEtFull() throws ReaderException {
		System.out.println("reading 5gb");
		new SirenCsvReaderStockEtablissementSingles(new File(
				"C:\\Users\\micka\\MickFiles\\FDS\\opendata\\siren\\Sirene Fichier StockEtablissement du 01 août 2021\\StockEtablissement_utf8.csv"),
				Charset.forName("UTF-8"), (entry) -> true).read();
		// System.out.println(records);
		System.out.println("done");
	}
}
