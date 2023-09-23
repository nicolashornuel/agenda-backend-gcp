package com.nho.model;

public enum CalendarEventType {
	COMMENT("comment"), ANNIVERSAIRE("anniversaire"), FAMILY("family");

	private String libelle;

	CalendarEventType(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

}
