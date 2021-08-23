package com.fds.opendata.siren.dao;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "siren", "nic", "siret", "statutDiffusionEtablissement", "dateCreationEtablissement",
		"trancheEffectifsEtablissement", "anneeEffectifsEtablissement",
		"activitePrincipaleRegistreMetiersEtablissement", "dateDernierTraitementEtablissement", "etablissementSiege",
		"nombrePeriodesEtablissement", "complementAdresseEtablissement", "numeroVoieEtablissement",
		"indiceRepetitionEtablissement", "typeVoieEtablissement", "libelleVoieEtablissement", "codePostalEtablissement",
		"libelleCommuneEtablissement", "libelleCommuneEtrangerEtablissement", "distributionSpecialeEtablissement",
		"codeCommuneEtablissement", "codeCedexEtablissement", "libelleCedexEtablissement",
		"codePaysEtrangerEtablissement", "libellePaysEtrangerEtablissement", "complementAdresse2Etablissement",
		"numeroVoie2Etablissement", "indiceRepetition2Etablissement", "typeVoie2Etablissement",
		"libelleVoie2Etablissement", "codePostal2Etablissement", "libelleCommune2Etablissement",
		"libelleCommuneEtranger2Etablissement", "distributionSpeciale2Etablissement", "codeCommune2Etablissement",
		"codeCedex2Etablissement", "libelleCedex2Etablissement", "codePaysEtranger2Etablissement",
		"libellePaysEtranger2Etablissement", "dateDebut", "etatAdministratifEtablissement", "enseigne1Etablissement",
		"enseigne2Etablissement", "enseigne3Etablissement", "denominationUsuelleEtablissement",
		"activitePrincipaleEtablissement", "nomenclatureActivitePrincipaleEtablissement",
		"caractereEmployeurEtablissement" })
public class SirenStockEtablissement {
	private String siren, nic, siret, statutDiffusionEtablissement, dateCreationEtablissement,
			trancheEffectifsEtablissement, anneeEffectifsEtablissement, activitePrincipaleRegistreMetiersEtablissement,
			dateDernierTraitementEtablissement, etablissementSiege, nombrePeriodesEtablissement,
			complementAdresseEtablissement, numeroVoieEtablissement, indiceRepetitionEtablissement,
			typeVoieEtablissement, libelleVoieEtablissement, codePostalEtablissement, libelleCommuneEtablissement,
			libelleCommuneEtrangerEtablissement, distributionSpecialeEtablissement, codeCommuneEtablissement,
			codeCedexEtablissement, libelleCedexEtablissement, codePaysEtrangerEtablissement,
			libellePaysEtrangerEtablissement, complementAdresse2Etablissement, numeroVoie2Etablissement,
			indiceRepetition2Etablissement, typeVoie2Etablissement, libelleVoie2Etablissement, codePostal2Etablissement,
			libelleCommune2Etablissement, libelleCommuneEtranger2Etablissement, distributionSpeciale2Etablissement,
			codeCommune2Etablissement, codeCedex2Etablissement, libelleCedex2Etablissement,
			codePaysEtranger2Etablissement, libellePaysEtranger2Etablissement, dateDebut,
			etatAdministratifEtablissement, enseigne1Etablissement, enseigne2Etablissement, enseigne3Etablissement,
			denominationUsuelleEtablissement, activitePrincipaleEtablissement,
			nomenclatureActivitePrincipaleEtablissement, caractereEmployeurEtablissement;

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getStatutDiffusionEtablissement() {
		return statutDiffusionEtablissement;
	}

	public void setStatutDiffusionEtablissement(String statutDiffusionEtablissement) {
		this.statutDiffusionEtablissement = statutDiffusionEtablissement;
	}

	public String getDateCreationEtablissement() {
		return dateCreationEtablissement;
	}

	public void setDateCreationEtablissement(String dateCreationEtablissement) {
		this.dateCreationEtablissement = dateCreationEtablissement;
	}

	public String getTrancheEffectifsEtablissement() {
		return trancheEffectifsEtablissement;
	}

	public void setTrancheEffectifsEtablissement(String trancheEffectifsEtablissement) {
		this.trancheEffectifsEtablissement = trancheEffectifsEtablissement;
	}

	public String getAnneeEffectifsEtablissement() {
		return anneeEffectifsEtablissement;
	}

	public void setAnneeEffectifsEtablissement(String anneeEffectifsEtablissement) {
		this.anneeEffectifsEtablissement = anneeEffectifsEtablissement;
	}

	public String getActivitePrincipaleRegistreMetiersEtablissement() {
		return activitePrincipaleRegistreMetiersEtablissement;
	}

	public void setActivitePrincipaleRegistreMetiersEtablissement(
			String activitePrincipaleRegistreMetiersEtablissement) {
		this.activitePrincipaleRegistreMetiersEtablissement = activitePrincipaleRegistreMetiersEtablissement;
	}

	public String getDateDernierTraitementEtablissement() {
		return dateDernierTraitementEtablissement;
	}

	public void setDateDernierTraitementEtablissement(String dateDernierTraitementEtablissement) {
		this.dateDernierTraitementEtablissement = dateDernierTraitementEtablissement;
	}

	public String getEtablissementSiege() {
		return etablissementSiege;
	}

	public void setEtablissementSiege(String etablissementSiege) {
		this.etablissementSiege = etablissementSiege;
	}

	public String getNombrePeriodesEtablissement() {
		return nombrePeriodesEtablissement;
	}

	public void setNombrePeriodesEtablissement(String nombrePeriodesEtablissement) {
		this.nombrePeriodesEtablissement = nombrePeriodesEtablissement;
	}

	public String getComplementAdresseEtablissement() {
		return complementAdresseEtablissement;
	}

	public void setComplementAdresseEtablissement(String complementAdresseEtablissement) {
		this.complementAdresseEtablissement = complementAdresseEtablissement;
	}

	public String getNumeroVoieEtablissement() {
		return numeroVoieEtablissement;
	}

	public void setNumeroVoieEtablissement(String numeroVoieEtablissement) {
		this.numeroVoieEtablissement = numeroVoieEtablissement;
	}

	public String getIndiceRepetitionEtablissement() {
		return indiceRepetitionEtablissement;
	}

	public void setIndiceRepetitionEtablissement(String indiceRepetitionEtablissement) {
		this.indiceRepetitionEtablissement = indiceRepetitionEtablissement;
	}

	public String getTypeVoieEtablissement() {
		return typeVoieEtablissement;
	}

	public void setTypeVoieEtablissement(String typeVoieEtablissement) {
		this.typeVoieEtablissement = typeVoieEtablissement;
	}

	public String getLibelleVoieEtablissement() {
		return libelleVoieEtablissement;
	}

	public void setLibelleVoieEtablissement(String libelleVoieEtablissement) {
		this.libelleVoieEtablissement = libelleVoieEtablissement;
	}

	public String getCodePostalEtablissement() {
		return codePostalEtablissement;
	}

	public void setCodePostalEtablissement(String codePostalEtablissement) {
		this.codePostalEtablissement = codePostalEtablissement;
	}

	public String getLibelleCommuneEtablissement() {
		return libelleCommuneEtablissement;
	}

	public void setLibelleCommuneEtablissement(String libelleCommuneEtablissement) {
		this.libelleCommuneEtablissement = libelleCommuneEtablissement;
	}

	public String getLibelleCommuneEtrangerEtablissement() {
		return libelleCommuneEtrangerEtablissement;
	}

	public void setLibelleCommuneEtrangerEtablissement(String libelleCommuneEtrangerEtablissement) {
		this.libelleCommuneEtrangerEtablissement = libelleCommuneEtrangerEtablissement;
	}

	public String getDistributionSpecialeEtablissement() {
		return distributionSpecialeEtablissement;
	}

	public void setDistributionSpecialeEtablissement(String distributionSpecialeEtablissement) {
		this.distributionSpecialeEtablissement = distributionSpecialeEtablissement;
	}

	public String getCodeCommuneEtablissement() {
		return codeCommuneEtablissement;
	}

	public void setCodeCommuneEtablissement(String codeCommuneEtablissement) {
		this.codeCommuneEtablissement = codeCommuneEtablissement;
	}

	public String getCodeCedexEtablissement() {
		return codeCedexEtablissement;
	}

	public void setCodeCedexEtablissement(String codeCedexEtablissement) {
		this.codeCedexEtablissement = codeCedexEtablissement;
	}

	public String getLibelleCedexEtablissement() {
		return libelleCedexEtablissement;
	}

	public void setLibelleCedexEtablissement(String libelleCedexEtablissement) {
		this.libelleCedexEtablissement = libelleCedexEtablissement;
	}

	public String getCodePaysEtrangerEtablissement() {
		return codePaysEtrangerEtablissement;
	}

	public void setCodePaysEtrangerEtablissement(String codePaysEtrangerEtablissement) {
		this.codePaysEtrangerEtablissement = codePaysEtrangerEtablissement;
	}

	public String getLibellePaysEtrangerEtablissement() {
		return libellePaysEtrangerEtablissement;
	}

	public void setLibellePaysEtrangerEtablissement(String libellePaysEtrangerEtablissement) {
		this.libellePaysEtrangerEtablissement = libellePaysEtrangerEtablissement;
	}

	public String getComplementAdresse2Etablissement() {
		return complementAdresse2Etablissement;
	}

	public void setComplementAdresse2Etablissement(String complementAdresse2Etablissement) {
		this.complementAdresse2Etablissement = complementAdresse2Etablissement;
	}

	public String getNumeroVoie2Etablissement() {
		return numeroVoie2Etablissement;
	}

	public void setNumeroVoie2Etablissement(String numeroVoie2Etablissement) {
		this.numeroVoie2Etablissement = numeroVoie2Etablissement;
	}

	public String getIndiceRepetition2Etablissement() {
		return indiceRepetition2Etablissement;
	}

	public void setIndiceRepetition2Etablissement(String indiceRepetition2Etablissement) {
		this.indiceRepetition2Etablissement = indiceRepetition2Etablissement;
	}

	public String getTypeVoie2Etablissement() {
		return typeVoie2Etablissement;
	}

	public void setTypeVoie2Etablissement(String typeVoie2Etablissement) {
		this.typeVoie2Etablissement = typeVoie2Etablissement;
	}

	public String getLibelleVoie2Etablissement() {
		return libelleVoie2Etablissement;
	}

	public void setLibelleVoie2Etablissement(String libelleVoie2Etablissement) {
		this.libelleVoie2Etablissement = libelleVoie2Etablissement;
	}

	public String getCodePostal2Etablissement() {
		return codePostal2Etablissement;
	}

	public void setCodePostal2Etablissement(String codePostal2Etablissement) {
		this.codePostal2Etablissement = codePostal2Etablissement;
	}

	public String getLibelleCommune2Etablissement() {
		return libelleCommune2Etablissement;
	}

	public void setLibelleCommune2Etablissement(String libelleCommune2Etablissement) {
		this.libelleCommune2Etablissement = libelleCommune2Etablissement;
	}

	public String getLibelleCommuneEtranger2Etablissement() {
		return libelleCommuneEtranger2Etablissement;
	}

	public void setLibelleCommuneEtranger2Etablissement(String libelleCommuneEtranger2Etablissement) {
		this.libelleCommuneEtranger2Etablissement = libelleCommuneEtranger2Etablissement;
	}

	public String getDistributionSpeciale2Etablissement() {
		return distributionSpeciale2Etablissement;
	}

	public void setDistributionSpeciale2Etablissement(String distributionSpeciale2Etablissement) {
		this.distributionSpeciale2Etablissement = distributionSpeciale2Etablissement;
	}

	public String getCodeCommune2Etablissement() {
		return codeCommune2Etablissement;
	}

	public void setCodeCommune2Etablissement(String codeCommune2Etablissement) {
		this.codeCommune2Etablissement = codeCommune2Etablissement;
	}

	public String getCodeCedex2Etablissement() {
		return codeCedex2Etablissement;
	}

	public void setCodeCedex2Etablissement(String codeCedex2Etablissement) {
		this.codeCedex2Etablissement = codeCedex2Etablissement;
	}

	public String getLibelleCedex2Etablissement() {
		return libelleCedex2Etablissement;
	}

	public void setLibelleCedex2Etablissement(String libelleCedex2Etablissement) {
		this.libelleCedex2Etablissement = libelleCedex2Etablissement;
	}

	public String getCodePaysEtranger2Etablissement() {
		return codePaysEtranger2Etablissement;
	}

	public void setCodePaysEtranger2Etablissement(String codePaysEtranger2Etablissement) {
		this.codePaysEtranger2Etablissement = codePaysEtranger2Etablissement;
	}

	public String getLibellePaysEtranger2Etablissement() {
		return libellePaysEtranger2Etablissement;
	}

	public void setLibellePaysEtranger2Etablissement(String libellePaysEtranger2Etablissement) {
		this.libellePaysEtranger2Etablissement = libellePaysEtranger2Etablissement;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getEtatAdministratifEtablissement() {
		return etatAdministratifEtablissement;
	}

	public void setEtatAdministratifEtablissement(String etatAdministratifEtablissement) {
		this.etatAdministratifEtablissement = etatAdministratifEtablissement;
	}

	public String getEnseigne1Etablissement() {
		return enseigne1Etablissement;
	}

	public void setEnseigne1Etablissement(String enseigne1Etablissement) {
		this.enseigne1Etablissement = enseigne1Etablissement;
	}

	public String getEnseigne2Etablissement() {
		return enseigne2Etablissement;
	}

	public void setEnseigne2Etablissement(String enseigne2Etablissement) {
		this.enseigne2Etablissement = enseigne2Etablissement;
	}

	public String getEnseigne3Etablissement() {
		return enseigne3Etablissement;
	}

	public void setEnseigne3Etablissement(String enseigne3Etablissement) {
		this.enseigne3Etablissement = enseigne3Etablissement;
	}

	public String getDenominationUsuelleEtablissement() {
		return denominationUsuelleEtablissement;
	}

	public void setDenominationUsuelleEtablissement(String denominationUsuelleEtablissement) {
		this.denominationUsuelleEtablissement = denominationUsuelleEtablissement;
	}

	public String getActivitePrincipaleEtablissement() {
		return activitePrincipaleEtablissement;
	}

	public void setActivitePrincipaleEtablissement(String activitePrincipaleEtablissement) {
		this.activitePrincipaleEtablissement = activitePrincipaleEtablissement;
	}

	public String getNomenclatureActivitePrincipaleEtablissement() {
		return nomenclatureActivitePrincipaleEtablissement;
	}

	public void setNomenclatureActivitePrincipaleEtablissement(String nomenclatureActivitePrincipaleEtablissement) {
		this.nomenclatureActivitePrincipaleEtablissement = nomenclatureActivitePrincipaleEtablissement;
	}

	public String getCaractereEmployeurEtablissement() {
		return caractereEmployeurEtablissement;
	}

	public void setCaractereEmployeurEtablissement(String caractereEmployeurEtablissement) {
		this.caractereEmployeurEtablissement = caractereEmployeurEtablissement;
	}

	@Override
	public String toString() {
		return "SirenStockEtablissement [siren=" + siren + ", nic=" + nic + ", siret=" + siret
				+ ", statutDiffusionEtablissement=" + statutDiffusionEtablissement + ", dateCreationEtablissement="
				+ dateCreationEtablissement + ", trancheEffectifsEtablissement=" + trancheEffectifsEtablissement
				+ ", anneeEffectifsEtablissement=" + anneeEffectifsEtablissement
				+ ", activitePrincipaleRegistreMetiersEtablissement=" + activitePrincipaleRegistreMetiersEtablissement
				+ ", dateDernierTraitementEtablissement=" + dateDernierTraitementEtablissement + ", etablissementSiege="
				+ etablissementSiege + ", nombrePeriodesEtablissement=" + nombrePeriodesEtablissement
				+ ", complementAdresseEtablissement=" + complementAdresseEtablissement + ", numeroVoieEtablissement="
				+ numeroVoieEtablissement + ", indiceRepetitionEtablissement=" + indiceRepetitionEtablissement
				+ ", typeVoieEtablissement=" + typeVoieEtablissement + ", libelleVoieEtablissement="
				+ libelleVoieEtablissement + ", codePostalEtablissement=" + codePostalEtablissement
				+ ", libelleCommuneEtablissement=" + libelleCommuneEtablissement
				+ ", libelleCommuneEtrangerEtablissement=" + libelleCommuneEtrangerEtablissement
				+ ", distributionSpecialeEtablissement=" + distributionSpecialeEtablissement
				+ ", codeCommuneEtablissement=" + codeCommuneEtablissement + ", codeCedexEtablissement="
				+ codeCedexEtablissement + ", libelleCedexEtablissement=" + libelleCedexEtablissement
				+ ", codePaysEtrangerEtablissement=" + codePaysEtrangerEtablissement
				+ ", libellePaysEtrangerEtablissement=" + libellePaysEtrangerEtablissement
				+ ", complementAdresse2Etablissement=" + complementAdresse2Etablissement + ", numeroVoie2Etablissement="
				+ numeroVoie2Etablissement + ", indiceRepetition2Etablissement=" + indiceRepetition2Etablissement
				+ ", typeVoie2Etablissement=" + typeVoie2Etablissement + ", libelleVoie2Etablissement="
				+ libelleVoie2Etablissement + ", codePostal2Etablissement=" + codePostal2Etablissement
				+ ", libelleCommune2Etablissement=" + libelleCommune2Etablissement
				+ ", libelleCommuneEtranger2Etablissement=" + libelleCommuneEtranger2Etablissement
				+ ", distributionSpeciale2Etablissement=" + distributionSpeciale2Etablissement
				+ ", codeCommune2Etablissement=" + codeCommune2Etablissement + ", codeCedex2Etablissement="
				+ codeCedex2Etablissement + ", libelleCedex2Etablissement=" + libelleCedex2Etablissement
				+ ", codePaysEtranger2Etablissement=" + codePaysEtranger2Etablissement
				+ ", libellePaysEtranger2Etablissement=" + libellePaysEtranger2Etablissement + ", dateDebut="
				+ dateDebut + ", etatAdministratifEtablissement=" + etatAdministratifEtablissement
				+ ", enseigne1Etablissement=" + enseigne1Etablissement + ", enseigne2Etablissement="
				+ enseigne2Etablissement + ", enseigne3Etablissement=" + enseigne3Etablissement
				+ ", denominationUsuelleEtablissement=" + denominationUsuelleEtablissement
				+ ", activitePrincipaleEtablissement=" + activitePrincipaleEtablissement
				+ ", nomenclatureActivitePrincipaleEtablissement=" + nomenclatureActivitePrincipaleEtablissement
				+ ", caractereEmployeurEtablissement=" + caractereEmployeurEtablissement + "]";
	}

}
