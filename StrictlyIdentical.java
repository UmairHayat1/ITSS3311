package myPackage; // where the code is contained

import java.util.Scanner; //contains set of predefined utility classes

public class StrictlyIdentical { //title of the project
	public static void main(String[] args) {  // array where all the command line arguments are stored

	    Scanner input = new Scanner(System.in); //creates a new Scanner instance which points to the input stream passed as argument
	    System.out.print("enter the seize of the array: "); //Java statement that prints the argument passed
	    int size = input.nextInt(); // size of the integer 
	    System.out.print("Enter list1: "); //Java statement that prints the argument passed
	    int[] list1 = new int[size]; //the value of list one will be equal to integer size
	    for (int i = 0; i < size; i++) list1[i] = input.nextInt(); //formula which gives value to the size and integer

	    System.out.print("Enter list2: "); //Java statement that prints the argument passed
	    size = input.nextInt(); //asisgning the value of size to be the input

	    int[] list2 = new int[size]; //the value of list two will be equal to integer size
	    for (int i = 0; i < size; i++) list2[i] = input.nextInt(); //formula which gives value to the size and integer

	    if (equals(list1, list2)) { //statement that gives value if answer is equal to list 1 or 2
	        System.out.println("Two lists are strictly identical"); //Java statement that prints the argument passed
	    } else { //otherwise
	        System.out.println("Two lists are not strictly identical"); //Java statement that prints the argument passed
	    }

	}

	public static boolean equals(int[] array1, int[] array2) //declaration of method deffinition 
	 {

	    if (array1.length != array2.length) return false; //will assign a false value if the equal


	    for (int i = 0; i < array1.length; i++) { // value of the int will be less the the lenght of array
	        if (array1[i] != array2[i]) return false; //will assign the value to be false if array 1 and 2 are equal
	    }

	    return true; //value will be tru based on the results
	}
	}

	

