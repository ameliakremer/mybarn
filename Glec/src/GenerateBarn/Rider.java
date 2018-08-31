package GenerateBarn;

//DATA CLASS
public class Rider {
	
	//FIELDS
	String name;
	Horse horse;
	int age;
	
	//CONSTRUCTOR
	public Rider(String n, Horse h, int a) {
		this.name = n;
		this.horse = h;
		this.age = a;
	}
}
