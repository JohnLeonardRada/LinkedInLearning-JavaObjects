package GettersAndSettersExamples;

public class Taco {
	
	private String filling;
	private String tortilla;
	
	public String getFilling() {
		return filling;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}
	public String getTortilla() {
		return tortilla;
	}
	public void setTortilla(String tortilla) {
		this.tortilla = tortilla;
	}
	
	public static void main(String[] args) {
		
		Taco taco = new Taco();
		taco.setFilling("Carne Asada");
		System.out.println(taco.getFilling());
	}
	
}
