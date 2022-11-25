package InsideClassesExercises;

public class Cat {
	
	private String name; 
	private int lives = 9;
	
	public Cat(String name) {
		this.name = name;
	}
	
	void meow() {
		System.out.println("meeeeeeeeoooowwwwwwww!!!");
	}
	
	void kill() {
		lives--;
		if(lives > 0) {
			System.out.println("I'm alive bitch, I still have " + lives + " lives left.");
		}else if (lives == 1) {
			System.out.println("That's overkill nyeoww");
		}else {
			System.out.println("DEAD CAT :<");
		}
	}
	
	public void printName() {
		if(name == null) {
			System.out.println("I don't know my own name.");
		}else {
			System.out.println("My name is " + name + ". Meowww!");
		}
	}

	public static void main(String[] args) {
		
		Cat neko = new Cat("Neko");
		neko.meow();
		neko.printName();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();
		neko.kill();

	}

}
