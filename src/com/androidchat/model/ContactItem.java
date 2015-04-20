package com.androidchat.model;

public class ContactItem {
	String nama;
	String nomor;
	String email;
	boolean active = false;

	public ContactItem(String nama, String nomor, String email, boolean active) {
		this.nama = nama;
		this.nomor = nomor;
		this.email = email;
		this.active = active;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
