package com.ibm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Create an Object in Spring Container 
public class Alien {
	
	private int aid ;
	private String aname;
	private String tech;
	@Autowired // Inject the Object Dependency implicitly 
	private Laptop laptop;
	
	
	public Alien() {
		super();
		System.out.println("Object Created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("in Show");
		laptop.compile();
		
	}

	
}
