package GenerateBarn;

//DATA CLASS
public class Horse {
	
	//FIELDS
	String name;
	String breed;
	float height;
	Rider rider;
	
	//CONSTRUCTOR
	public Horse(String n, float h, String b) {
		this.name = n;
		this.height = h;
		this.breed = b;
	}

}
