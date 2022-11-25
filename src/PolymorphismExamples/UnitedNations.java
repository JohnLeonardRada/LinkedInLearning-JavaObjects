package PolymorphismExamples;

import java.util.List;

public class UnitedNations {
	
	public static void main(String[] args) {
		Country country = new Country();
		Ireland ireland = new Ireland();
		Brazil brazil = new Brazil();
		
		List<Country> countries = List.of(country, ireland, brazil);
		
		for(Country country2: countries) {
			country2.dance();
		}
	}
}
