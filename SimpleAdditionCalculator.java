package Chapter4Exercises;

/**
 * @Class:Intermediate Programming
 * 
 * @author Anthony Wallace
 * 
 * @version 1.0
 * 
 * @Course:ITEC 2150 Fall 2022
 * @Written: October 15, 2022
 * 
 * @Desscription: This program will prompt the user to enter two integers(one at
 *                a time) and the program will add the integers and spit out the
 *                correct answer. if the user enter a double value order than
 *                single value, the program will throw out an
 *                InputMismatchException. Likewise, same exception will be
 *                thrown if the person enter character or strings.
 * 
 */

public class SimpleAdditionCalculator {
	public static void main(String args[])

	{
		int result = 1;
		do {
			try {

				java.util.Scanner user = new java.util.Scanner(System.in);
				System.out.println("Please enter a number.");
				int firstNum = user.nextInt();
				System.out.println("Please enter a second number");
				int secondNum = user.nextInt();

				int sum = firstNum + secondNum;

				System.out.println(firstNum + " + " + secondNum + " = " + sum);
				result = sum;
			} catch (Exception e) {
				System.out.println("Oops, that's not a valid entry; try again.");
			}
		} while (result == 1);

	}

}
