package com.core.nk.languageStatements;

public class Airport {

	public void checkIn(Passenger passenger) {

		// Using the 'if' statement, check the frequent flyer miles of the passenger
		// When the Frequent Flyer mileage of the passenger is zero, print "New
		// Passenger", else print "Frequent Flyer"

		if(passenger.getFrequentFlyerMiles() == 0){
			System.out.println("New Passenger");
			System.out.println("Passenger " + passenger.getName() + " has " + passenger.getFrequentFlyerMiles() + " miles");
			System.out.println(switchLevel(passenger.getMemberLevel()) + " member");
		} else{
			System.out.println("Frequent Flyer");
			System.out.println("Passenger " + passenger.getName() + " has " + passenger.getFrequentFlyerMiles() + " miles");
			System.out.println(switchLevel(passenger.getMemberLevel()) + " member");
		}
		
		

		// Print out the passenger name and Frequent Flyer mileage
		

		// Using the switch statement print out the Member Level
		// The member level is defined as 'int memberLevel' within the Passenger class
		// 1 = Bronze
		// 2= Silver
		// 3 = Gold


		
		
		
		

		//Print an empty line
		System.out.println("");
	}

	private String switchLevel(int i){
		String level = null;
		switch (i){
			case 1 :
				level = "Bronze" ;
				break;
			case 2 :
				level = "Silver" ;
				break;
			case 3 :
				level = "Gold" ;
				break;
		}

		return level;
	}

}
