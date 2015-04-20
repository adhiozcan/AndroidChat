package com.androidchat.model;

public class GroupItem {
	String nama_group;
	String admin;
	String time_created;
	int size;

	public GroupItem(String nama_group, String admin,
			String time_created, int size) {
		this.nama_group = nama_group;
		this.admin = admin;
		this.time_created = time_created;
		this.size = size;
	}

	public String getNama_group() {
		return nama_group;
	}

	public void setNama_group(String nama_group) {
		this.nama_group = nama_group;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getTime_created() {
		return time_created;
	}

	public void setTime_created(String time_created) {
		this.time_created = time_created;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
