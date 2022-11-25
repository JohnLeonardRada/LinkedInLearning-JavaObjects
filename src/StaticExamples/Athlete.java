package StaticExamples;

public class Athlete {
	
	private String name;
	private int speed;
	private static String marathonLocation;
	private int bibNumber;
	private static int runnersInRace;
	
	public Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		runnersInRace++;
		this.bibNumber = runnersInRace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getMarathonLocation() {
		return marathonLocation;
	}

	public void setMarathonLocation(String marathonLocation) {
		this.marathonLocation = marathonLocation;
	}
	
	public static int getRunnersInRace() {
		return runnersInRace;
	}

	public static void setRunnersInRace(int runnersInRace) {
		Athlete.runnersInRace = runnersInRace;
	}

	@Override
	public String toString() {
		return "Athlete " + name + " is running at " + speed + " miles per hour at " + marathonLocation + " " + bibNumber;
	}
	
	
}
