//***********************************************************
// Name:  Anthony Weringer
// Title: Lab8.java
// Description: Creates array objects
// Time spent: 1 hour
// Date: 10/1/17
//***********************************************************


public class Lab8 
{
	public static void main(String[] args)
	{
		/*Create Arrays object using the first constructor*/
		Arrays arr1 = new Arrays(5);

		/*Prints contents of the array in arr1*/
		System.out.println(arr1);

		/*Call findMin, findMax, and calcAverage on arr1 and print their values*/
		System.out.println("Min: " + arr1.findMin());
		System.out.println("Max: " + arr1.findMax());
		System.out.println("Average: " + arr1.calcAverage());
		System.out.println();

		/*Test second constructor of Arrays class*/
		/*Create int array with initial values*/
		int[] array = {20, 34, 18};

		/*Create array object using second Arrays constructor, passing int array variable*/
		Arrays arr2 = new Arrays(array);

		/*Print arr2 object*/
		System.out.println(arr2);

		/*Print the min, max, and average of the arr2 object*/
		System.out.println("Min: " + arr2.findMin());
		System.out.println("Max: " + arr2.findMax());
		System.out.println("Average: " + arr2.calcAverage());
		System.out.println();

	} 
} 