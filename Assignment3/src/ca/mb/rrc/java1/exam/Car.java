package ca.mb.rrc.java1.exam;

import ca.mb.rrc.java1.exam.TestClass.Vehicle;
/**
 * 
 * @author Car Parent class
 *
 */
public class Car implements Vehicle {
	//Car variables
	final int doors;
	final int wheels;
	final String color;
	
	/**
	 * Constructor Method for car class
	 * @return instance variables
	 * @param doors, int value for constructing car
	 * @param wheels, int value for constructing car
	 * @param color, string value for constructing car
	 */
	Car(int doors, int wheels, String color)
	{
		this.doors = doors;
		this.wheels = wheels;
		this.color = color;
	}
	/**
	 * Interface methods
	 * @return response statement
	 */
	@Override
	 public void drive() {
		System.out.println("The car is driving");
	}
	/**
	 * @return response statement and boolean
	 */
	@Override
	 public boolean stop() {
		System.out.println("The car stopped");
		return true;
	}
	/**
	 * @return integer directed by degrees 0-90 for left, 90 and above for right
	 */
	@Override
	 public void steer(int direction) {
		if(direction <= 90) {
			System.out.println("The car is turning "+direction+" degrees left");
		}
		else {
			System.out.println("The car is turning "+direction+" degrees right");
		}	
	}
}
	/**
	 * @author Ferrari Child class 
	 */
	 class Ferrari extends Car{
		
		 //Ferrari variables
		 final String badge;
		 final int year;
		 final double price;
		
		 /**
		  * Constructor Method
		  * @return instance variables
		  * @param doors, int value for constructing car
		  * @param wheels, int value for constructing car
		  * @param color, string value for constructing car
		  * @param badge, string value for constructing Ferrari
		  * @param year, int value for constructing Ferrari
		  * @param price, double value for constructing Ferrari
		  */
		Ferrari(int doors, int wheels, String color, String badge, int year, double price) {
			super(doors, wheels, color);
			this.badge = badge;
			this.year = year;
			this.price = price;
		}
		/**
		 * @return response statement based off boolean entry
		 * @param isRaceCar, yes or no if car is a race car
		 */
		final public void race(boolean isRaceCar) {
			if(isRaceCar == true){
				System.out.println("Yes this car is a race car");
			}
			else {
				System.out.println("No this is not a race car");
			}
		}
		/**
		 * Ferrari toString method
		 * @return response statement 
		 */
		public String toString() {
			return "The Ferrari: "+badge+" I am a Ferrari with "+doors+" doors and "+wheels+" wheels and are worth "+price;	
		}
	}
