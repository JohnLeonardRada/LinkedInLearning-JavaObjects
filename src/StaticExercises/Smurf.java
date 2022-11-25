package StaticExercises;

public class Smurf {

	private static String name;
	private static int smurfetteCount;
	private static int papaSmurfCount;
	
	public static Smurf createSmurf(String name) {

		if(Smurf.name != name) {
			System.out.println("Creating " + name + " Smurf");
		}
		
		return new Smurf(name);

	}

	public Smurf(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}
	
	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}
	
	
}
