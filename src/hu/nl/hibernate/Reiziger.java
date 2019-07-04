package hu.nl.hibernate;

import java.util.Date;

public class Reiziger {
	private int reizigerID;
	private String voorletter;
	private String tussenvoegsel;
	private String achternaam;
	private Date gbdatum;

	public Reiziger() {}

	public int getReizigerId() {
		return this.reizigerID;
	}

	public void setReizigerId(int reizigerID) {
		this.reizigerID = reizigerID;
	}

	public String getVoorletters() {
		return this.voorletter;
	}

	public void setVoorletters(String v) {
		this.voorletter = v;
	}

	public String getTussenvoegsel() {
		return this.tussenvoegsel;
	}

	public void setTussenvoegsel(String tvoeg) {
		this.tussenvoegsel = tvoeg;
	}

	public String getAchternaam() {
		return this.achternaam;
	}

	public void setAchternaam(String achter) {
		this.achternaam = achter;
	}

	public Date getGeboortedatum() {
		return this.gbdatum;
	}

	public void setGeboortedatum(Date gbdatum) {
		this.gbdatum = gbdatum;
	}
}