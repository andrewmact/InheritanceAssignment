package ca.mb.rrc.java1.exam;

import java.util.ArrayList;
/**
 * 
 * @author main
 * This class runs the Assignment 4 program
 * It holds the Vehicle interface for all classes to access
 */
public class TestClass {
	/**
	 * @author Interface
	 * Provides necessary methods for the Truck and Car classes
	 */
	interface Vehicle{
		void drive();
		boolean stop();
		void steer(int direction);
	}

	public static void main(String[] args) {
		
	/**
	 * Car ArrayList
	 * with five instances
	 */
	 ArrayList<Car> carList = new ArrayList<>();
	 
	 Ferrari gt = new Ferrari(2, 4, "red", "5426", 2000, 350000.99);
	 	carList.add(gt);
	 	
	 Ferrari roma = new Ferrari(4, 4, "green", "8899", 2010, 185900.78);
	 	carList.add(roma);
	 	
	 Ferrari f8Spider = new Ferrari(2, 2, "black", "1234", 1990, 212300.60);
	 	carList.add(f8Spider);
	 	
	 Ferrari stradale = new Ferrari(2, 4, "baby blue", "7192", 2020, 300300.89);
	 	carList.add(stradale);
	 	
	 Ferrari portofino = new Ferrari(4, 3, "yellow", "3829", 1986, 100200.30);
	 	carList.add(portofino);
	 	
	 	
	 /**
	  * Truck ArrayList
	  * with five instances	
	  */
	 ArrayList<Truck> truckList = new ArrayList<>();
	 
	 Ford f150 = new Ford(5, 2);
	 	truckList.add(f150);
	 
	 Ford ranger = new Ford(2, 4);
	 	truckList.add(ranger);
	 	
	 Ford raptor = new Ford(4, 1);
	 	truckList.add(raptor);
	 	
	 Ford f250 = new Ford(2, 1);
	 	truckList.add(f250);
	 	
	 Ford f350 = new Ford(8, 2);
	 	truckList.add(f350);
	 	
		/**
		 * Print loop for each instance of both the Ferrari and Ford classes
		 */
		for(int i = 0; i < carList.size(); i++) 
		{
		System.out.println();
		Ferrari carHoldVar = (Ferrari) carList.get(i);
		System.out.println(carHoldVar);               
		System.out.println();
		Ford truckHoldVar = (Ford) truckList.get(i);
		System.out.println(truckHoldVar);
		System.out.println("___________________________________________________________________________________");
		}
		
	}

}

