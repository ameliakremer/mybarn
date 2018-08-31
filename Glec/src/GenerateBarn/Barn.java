package GenerateBarn;
import java.util.ArrayList;

//DATA CLASS
public class Barn {
	
	//FIELDS
	public ArrayList<Horse> horses = new ArrayList<Horse>();
	public ArrayList<Rider> riders = new ArrayList<Rider>(); 
	
	//SETTERS
	public void addHorse(Horse s) {
		horses.add(s);
	}
	
	public void addRider(Rider r) {
		riders.add(r);
	}
	
	//PRINTING VALUES
	public void printRiders() {
		System.out.println("Riders at Glec:");
		for(Rider r : this.riders){
			System.out.println(r.name + " " + r.age + ": " + r.horse.name);
		}
		System.out.println("\n");
	}
	
	public void printHorses() {
		System.out.println("Horses at Glec:");
		for(Horse h : this.horses) {
			System.out.println(h.breed + " - " + h.name + " " + h.height);
		}
	}
	
	//GETS
	public ArrayList<Horse> getHorses() {
		return this.horses;
	}
	
	public ArrayList<Rider> getRiders() {
		return this.riders;
	}
	
	public Horse getTallestHorse() {
		Horse biggestHorse = horses.get(0);
		for(Horse h : horses) {
			if(h.height > biggestHorse.height) {
				biggestHorse = h;
			}
		}
		return biggestHorse;
	}
} 
