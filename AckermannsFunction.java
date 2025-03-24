package palindromeRecursion;
import java.util.*;
public class AckermannsFunction {

	public static void main(String[] args) {
		//Variable declaration and scanner object creation
		Scanner input = new Scanner(System.in);
		int testAmount;
		int m;
		int n;
		//Ask the user for amount of cases to run through; uses answer for for loop parameter
		System.out.println("How many cases do you wish to test for the Ackermann function?");
		testAmount = input.nextInt();
		for (int x = 0; x < testAmount; x++) {
			//Ask user for parameters to call ackermann method with
			System.out.println("Enter argument 1: ");
			m = input.nextInt();
			System.out.println("Enter argument 2: ");
			n = input.nextInt();
			//Prints to the user the result of their parameters in the ackermann function
			System.out.println("The output of the Ackermann function is: " + ackermann(m, n));
		}
		System.out.println("Program finished.");
		input.close();

	}
	public static int ackermann(int m, int n) {
		if (m == 0) {
			return n + 1; //When m == 0, this is called, and the final number is given. 
		}
		if (n == 0) {
			return ackermann(m - 1, 1); //When n == 0, this is called.
		}
		return ackermann(m - 1, ackermann(m, n-1)); //If m != 0 and n != 0, this is called.
	}

}
/*
Example output: 
How many cases do you wish to test for the Ackermann function?
7
Enter argument 1: 
0
Enter argument 2: 
0
The output of the Ackermann function is: 1
Enter argument 1: 
0
Enter argument 2: 
1
The output of the Ackermann function is: 2
Enter argument 1: 
1
Enter argument 2: 
1
The output of the Ackermann function is: 3
Enter argument 1: 
1
Enter argument 2: 
2
The output of the Ackermann function is: 4
Enter argument 1: 
1
Enter argument 2: 
3
The output of the Ackermann function is: 5
Enter argument 1: 
2
Enter argument 2: 
2
The output of the Ackermann function is: 7
Enter argument 1: 
3
Enter argument 2: 
2
The output of the Ackermann function is: 29
Program finished.
*/