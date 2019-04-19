package com.pkyou.Sample.Entyties;

import java.io.Serializable;

public class IndoorCheckItemEntity implements Serializable {
	private static final long serialVersionUID = -6556793741331167103L;
	private int id;
	private int itemId;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
