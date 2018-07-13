
public class Platypus {
	private String name;
	
	Platypus() {
		name = "rob";
	}
	
	Platypus(String name) {
		this.name=name;
	}
	
	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
}
