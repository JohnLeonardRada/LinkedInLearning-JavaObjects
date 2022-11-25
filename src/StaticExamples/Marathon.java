package StaticExamples;

public class Marathon {

	public static void main(String[] args) {
		Athlete mike = new Athlete("Mike", 10);
		Athlete wolf = new Athlete("Wolf", 14);
		
		mike.setMarathonLocation("Boston");
		wolf.setMarathonLocation("London");
		
		System.out.println(mike);
		System.out.println(wolf);
		
		System.out.println("Runners in race: " + Athlete.getRunnersInRace());
	}

}
