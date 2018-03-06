package com.revature.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Genre  implements Serializable {

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(String name) {
		super();
		this.name = name;
	}

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	
	private String name;
	
	
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


	@Override
	public String toString() {
		return "Genre [name=" + name + "]";
	}
}
