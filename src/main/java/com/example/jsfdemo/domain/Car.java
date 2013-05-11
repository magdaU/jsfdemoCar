package com.example.jsfdemo.domain;

public class Car {
	
	private int id;
	private String name;
	private String registerNumber;
	private Person owner;
	private int ownerId;
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
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
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	
}
