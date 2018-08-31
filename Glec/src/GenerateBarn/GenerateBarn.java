package GenerateBarn;

//CONTROLLING CLASS
public class GenerateBarn {

	public static void main(String[] args) {
		
		//VARIABLES
		Barn myBarn = new Barn();
		Horse major = new Horse("Major", 13.3f, "Haflinger");
		Horse delgado = new Horse("Delgado", 16.1f, "Thoroughbred");
		Horse sammy = new Horse("Sammy", 14.1f, "Pinto Arabian");
		Horse rowan = new Horse("Rowan", 16.2f, "Olendburg");
		Horse james = new Horse("James", 16f, "Thoroughbred");
		
		Rider millie = new Rider("Millie", major, 12);
		Rider annabee = new Rider("Annabee", delgado,19);
		Rider izzie = new Rider("Izzie", sammy, 12);
		Rider frankie = new Rider("Frankie", rowan, 18); 
		Rider darby = new Rider("Darby", james, 19);
		
		major.rider = millie;
		delgado.rider = annabee;
		sammy.rider = izzie;
		rowan.rider = frankie;
		james.rider = darby;
		
		
		
		//RIDERS
		myBarn.addRider(millie);
		myBarn.addRider(annabee);
		myBarn.addRider(izzie);
		myBarn.addRider(frankie);
		myBarn.addRider(darby);
		
		
		
		//HORSES
		myBarn.addHorse(major);
		myBarn.addHorse(delgado);
		myBarn.addHorse(sammy);
		myBarn.addHorse(rowan);
		myBarn.addHorse(james);
		
		myBarn.printRiders();
		myBarn.printHorses();
		System.out.println("\n" + myBarn.getTallestHorse().name + " is the tallest horse at Glec. Congrats to " + myBarn.getTallestHorse().rider.name + "!");
		
	}

}
