package PolymorphismExercises;

import java.util.List;

public class Doctor {

	public static void main(String[] args) {
		GeneralPracticioner generalPractioner = new GeneralPracticioner();
		Surgeon surgeon = new Surgeon();
		
		List<Doctor> doctors = List.of(generalPractioner, surgeon);
		for(Doctor doctor2:  doctors) {
			doctor2.doMedicine();
		}
		
		generalPractioner.makeHouseCalls();
		surgeon.performSurgery();
	}
	
	void doMedicine() {
		System.out.println("Treating Patients.");
	}
}
