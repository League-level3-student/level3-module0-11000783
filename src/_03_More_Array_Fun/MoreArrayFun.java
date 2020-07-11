package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	
	 String [] tests = new String[5]; 
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.

public void print(){	
	String [] array1 = new String[4];
	for(int i = 0; i < array1.length; i++) {
		System.out.println(array1[i]);
	}
	
}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
public void reverse() {
	String[] array2 = new String[4]
	for(int i = -1; i < array2.length; i--) {
		System.out.println(array2[i]);
	}
}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
public void everyother() {
	String[] array3 = new String[4];
for(int i = array3.length-1 ; i< array3.length; i=-2) {
		System.out.println(array3[i]);
	}
}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
//can you save for me please? i forgot how	
Random random = new Random();
	order = random.nextInt(arrays.length);
	for(int k = 0; k< arrays.length; k++); {
		Random random = new Random();
		order = random.nextInt()
		System.out.println();
	}
	
}
}
}