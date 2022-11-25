package GettersAndSettersExamples;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

	public static void main(String[] args) {
		Disease polio = new Disease("Polio", false);
		Disease flu = new Disease("Influenza", true);
		Disease malaria = new Disease("Malaria", true);
		Disease cancer = new Disease("Cancer", false);
		
		// Input all object class into a list
		List<Disease> diseases = new ArrayList<>();
		diseases.add(polio);
		diseases.add(flu);
		diseases.add(malaria);
		diseases.add(cancer);
		
		cancer.setCurable(true);
		
		// Iterate every disease on the list
		System.out.println("Curable Diseases: ");
		for(Disease disease: diseases) {
			if(disease.isCurable()) {
				System.out.println("*" + disease.getName());
			}
		}

	}

}
