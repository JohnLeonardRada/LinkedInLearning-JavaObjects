package PolymorphismExercises;

public class Surgeon extends Doctor{

	void doMedicine() {
		System.out.println("Surgeon: Treating Patients.");
	}
	
	void performSurgery() {
		System.out.println("Performing Surgery");
	}
}
