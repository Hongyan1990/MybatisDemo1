package com.mybatis.po;

import java.util.Map;

public class Gamer {
	private int id;
	private String name;
	private int profession;
	private Map professionalAttributes;
	
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
	public int getProfession() {
		return profession;
	}
	public void setProfession(int profession) {
		this.profession = profession;
	}
	public Map getProfessionalAttributes() {
		return professionalAttributes;
	}
	public void setProfessionalAttributes(Map professionalAttributes) {
		this.professionalAttributes = professionalAttributes;
	}
	
	
}
