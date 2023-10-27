package com.example.web;

import java.util.HashMap;
import java.util.Map;

public class Hero {
	private String name;
	private String secretIdentity;
	private String vulnerability;

	public Hero(String name, String secretIdentity, String vulnerability) {
		this.name = name;
		this.vulnerability = vulnerability;
		this.secretIdentity = secretIdentity;
	}
	
	static public Map<String, Hero> generateData() {
		Map<String, Hero> heroes = new HashMap<String, Hero>();
		heroes.put("Batman", new Hero("Batman", "Bruce Wayne", "No Killing Rule"));
		heroes.put("Superman", new Hero("Superman", "Clark Kent", "Kryptonite"));
		heroes.put("Spider-Man", new Hero("Spider-Man", "Peter Parker", "Lack of Tall Buildings"));
		heroes.put("Wonder Woman", new Hero ("Wonder Woman", "Diana Prince", "Piercing Weapons")); 
		heroes.put("The Flash", new Hero("The Flash", "Barry Allen","Ice"));
		return heroes;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSecretIdentity() {
		return secretIdentity;
	}
	
	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}
	
	public String getVulnerability() {
		return vulnerability;
	}
	
	public void setVulnerability (String vulnerability) {
		this.vulnerability = vulnerability;
	}
}