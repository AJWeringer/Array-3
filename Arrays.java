//***********************************************************
// Name:  Anthony Weringer
// Title: Arrays.java
// Description: Use of arrays
// Time spent: 2.5 hours
// Date: 10/1/17
//***********************************************************

import java.util.Random;

public class Arrays 
{
	/*Instance Variables*/
		private int[] array;
		private int count;

		/*Constructors*/
		public Arrays(int size)
		{
			array = new int[size];
			count = size;

			Random rand = new Random();
			for(int i = 0; i < count; i++)
			{
				array[i] = (rand.nextInt(10));
			}
		}

		public Arrays(int[] arr)
		{
			array = arr;
			count = arr.length;
		}

		/*findMin*/
		public int findMin()
		{
			int min = array[0]; /*Sets min to the first element of array*/
			for(int i = 1; i < count; i++)
			{
				/*Reassign min if there's smaller element*/
				if(array[i] < min)
				{
					min = array[i];
				}
			}
			return min; /*Return smallest element*/
		}

		/*findMax*/
		public int findMax()
		{
			int max = array[0]; /*Set max to the first element of array*/
			for(int i = 1; i < count; i++)
			{
				/*Reassign max if there's a larger element*/
				if(array[i] > max)
				{
					max = array[i];
				}
			}
			return max; /*Returns largest element*/
		}

		/*calcSum*/
		private int calcSum()
		{
			int sum = 0;

			for(int i = 0; i < count; i++)
			{
				sum = sum + array[i];
			}

			return sum;
		}

		/*calcAverage*/
		public double calcAverage()
		{
			double sum = calcSum(); /*calls private method calcSum() and sets value to variable sum*/
			double average = sum / count;

			return average;
		}

		/*toString*/
		public String toString()
		{
			String output = "[ ";
			for (int i = 0; i < count; i++)
			{
				output += array[i];
				if (i != count - 1)
				{
					output += ", ";
				}
			}
			return output + " ]";
		}

}
