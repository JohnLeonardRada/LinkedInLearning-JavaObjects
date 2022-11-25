package InsideClassesExamples;

public class Pond {
	
	public static void main(String[] args) {
		
		Duck mobyDuck = new Duck("Moby", 90/3, "celery");
		Duck wolfgangDuck = new Duck("Wolfgang", 60/3, "pizza");
		
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.quack();
		System.out.println(mobyDuck);
		
		wolfgangDuck.waddle();
		wolfgangDuck.quack();
		System.out.println(wolfgangDuck);
	}
}
