package _00_IntroToArrays;

import java.awt.print.Printable;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String [] names = new String[4];
		//2. print the third element in the array
System.out.println(names[2]);
		//3. set the third element to a different value
names[3] = "six";
		//4. print the third element again
System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < names.length; i++) {
			names[i] = "sick";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//7. make an array of 50 integers
int [] lits = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random rad = new Random();
int smallest;
smallest = 0;
for (int i = 0; i < lits.length; i++) {
	lits[i]= rad.nextInt(50);
	System.out.println(lits[i]);
	if (lits[i] >= smallest) {
		smallest = lits[i];
	}
}
System.out.println(smallest);
}
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
