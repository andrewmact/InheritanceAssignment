package ca.mb.rrc.java1.exam;

import ca.mb.rrc.java1.exam.TestClass.Vehicle;
/**
 * 
 * @author Truck Parent class
 *
 */
public class Truck implements Vehicle{
	//Truck variables
	final int gear;
	final int horn;
	
	/**
	 * This method is a constructor for the Truck class
	 * @return instance variables
	 * @param gear, int value for constructing truck
	 * @param horn, int value for constructing truck
	 */
	Truck(int gear, int horn)
	{
		this.gear = gear;
		this.horn = horn;
	}
	/**
	 * Interface methods
	 * @return statement response
	 */
	@Override
	public void drive() {
		System.out.println("The truck is driving");
	}
	/**
	 * @return statement with boolean response
	 */
	@Override
	public boolean stop() {
		System.out.println("The truck stopped");
		return true;
	}
	/**
	 * @return integer directed by degrees 0-90 for left, 90 and above for right
	 */
	@Override
	public void steer(int direction) {
		if(direction <= 90) {
			System.out.println("The truck is turning "+direction+" degrees left");
		}
		else {
			System.out.println("The truck is turning "+direction+" degrees right");
		}	
	}
	/**
	 * Honk method with print statement dependent on integer variable
	 * @param times, how many times the truck will honk
	 */
	public void honk(int times) 
	{
		for(int i = 0; i < times; i++)
		System.out.println("BEEP");
	}

}
	/**
	 * @author Ford Child class
	 */
	class Ford extends Truck{

		/**
		 * Constructor Method
		 * Instance variables
		 * @param gear, int value for constructing truck
		 * @param horn, int value for constructing truck
		 */
		Ford(int gear, int horn) {
			super(gear, horn);
			
		}
		/**
		 * toString Method 
		 * @return printStatement
		 */
		public String toString() {
			return "The Truck: I am a Ford Truck with "+gear+" gears and "+horn+" horns";	
		}
	}
