package zoo.app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import zoo.animal.*;

/*******************************************************
Programmer Rohan Oelofse
Date written: 2023.04.15
GitHub: https://github.com/RohanOelofse/JavaProjects
 ******************************************************/

/**
 * @author Rohan Oelofse
 *
 */
public class Zoo_Keeper_App {
	
	/**
	 * Sets the format of dates
	 */
	private final static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);
	
	/**
	 * Creates a list to store all animals
	 */
	private static List<Animal> animals = new ArrayList<Animal>();

	/**
	 * List that stores all animals
	 */
	public Zoo_Keeper_App() {
		Zoo_Keeper_App.animals = new ArrayList<Animal>();
	}

	/**
	 * Main method that creates all the animals and stores them in a list
	 * 
	 * @param args No command line input args are used for this application
	 * @throws Exception Exception numerous methods could throw errors back to main
	 */
	public static void main(String[] args) throws Exception {
	    
		

		try {
			/*Animal a1 = new Animal();
			Animal a2 = new Animal("12-31-2022", (float) 10.5);
			
			LocalDate birthdate = LocalDate.parse("11-30-2022", FORMAT);
			Animal a3 = new Animal(birthdate, (float) 5.5);
			
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			
			System.out.println();
			
			System.out.println(a1.getBirthdateStr() + " " + a1.getWeight());
			System.out.println(a2.getBirthdateStr() + " " + a2.getWeight());
			System.out.println(a3.getBirthdateStr() + " " + a3.getWeight());
			*/
			
			/*
			Bird b1 = new Bird();
			Bird b2 = new Bird("12-31-2022", (float) 1.5);
			Bird b3 = new Bird("11-23-2021", (float) 1.2, (float) 2.0);
			
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3.getWingsan());
			*/
			
			/*
			Fish f1 = new Fish();
			Fish f2 = new Fish("12-31-2022", (float) 1.5);
			Fish f3 = new Fish("11-23-2021", (float) 1.2, Water.FRESH);
			
			System.out.println(f1);
			System.out.println(f2);
			System.out.println(f3.getWater());
			*/
			
			Chicken c1 = new Chicken();
			Chicken c2 = new Chicken("12-31-2022", (float) 1.5);
			Chicken c3 = new Chicken("11-23-2021", (float) 1.2, (float) 2.0);
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3.getWingsan());
			
			Sparrow s1 = new Sparrow();
			Sparrow s2 = new Sparrow("12-31-2022", (float) 1.5);
			Sparrow s3 = new Sparrow("11-23-2021", (float) 1.2, (float) 2.0);
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3.getWingsan());
			
			Guppy g1 = new Guppy();
			Guppy g2 = new Guppy("12-31-2022", (float) 1.5);
			Guppy g3 = new Guppy("11-23-2021", (float) 1.2, "SALT");
			
			System.out.println(g1);
			System.out.println(g2);
			System.out.println(g3.getWater());
			
			FlyingFish ff1 = new FlyingFish();
			FlyingFish ff2 = new FlyingFish("12-31-2022", (float) 1.5);
			FlyingFish ff3 = new FlyingFish("11-23-2021", (float) 1.2, "fresh");
			
			System.out.println(ff1);
			System.out.println(ff2);
			System.out.println(ff3.getWater());
			
			Zoo_Keeper_App.animals.add(c1);
			Zoo_Keeper_App.animals.add(c2);
			Zoo_Keeper_App.animals.add(c3);
			
			Zoo_Keeper_App.animals.add(s1);
			Zoo_Keeper_App.animals.add(s2);
			Zoo_Keeper_App.animals.add(s3);
			
			Zoo_Keeper_App.animals.add(g1);
			Zoo_Keeper_App.animals.add(g2);
			Zoo_Keeper_App.animals.add(g3);
			
			Zoo_Keeper_App.animals.add(ff1);
			Zoo_Keeper_App.animals.add(ff2);
			Zoo_Keeper_App.animals.add(ff3);
			
			System.out.println(Zoo_Keeper_App.animals.get(11));
			
			FlyingFish myFish = (FlyingFish) animals.get(11);
			System.out.println(myFish.getWater());
			
			myFish.eat();
			
			
		} catch (Exception e) {
			System.out.println("The following error has occurred: ");
			System.out.println(e.getMessage());
			
		}
	}

}
