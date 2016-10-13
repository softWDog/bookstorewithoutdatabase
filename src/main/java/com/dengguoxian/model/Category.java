package com.dengguoxian.model;

import java.io.Serializable;

public class Category implements Serializable {
	private static final long serialVersionUID = 868324321453228877L;
	private int id;
	private String name;

	public Category() {
		super();
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
