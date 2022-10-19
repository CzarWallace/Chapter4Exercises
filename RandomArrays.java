package Chapter4Exercises;

/**
 * @Class:Intermediate Programming
 * 
 * @author anthony wallace
 * 
 * @version 1.0.
 * 
 * @Course:ITEC 2150 Fall 2022.
 * 
 * @Written: October 15, 2022.
 * 
 * @Description: This is also prompt the user to enter index of an array in the
 *               range of 0 to 49. If the user enter index greater than 49, the
 *               program will throw an array index out of bound exception.
 * 
 * 
 */

public class RandomArrays {

	public static void main(String[] args) {
		int index = 0;
		do {
			try {
				double[] myArrays = new double[50];
				java.util.Scanner user = new java.util.Scanner(System.in);
				System.out.println("Please enter an index of an array.");
				int input = user.nextInt();

				for (int i = 0; i < 50; i++) {
					myArrays[i] = Math.random();
				}
				System.out.println(myArrays[input]);
				index = input;

			} catch (Exception e) {
				System.out.println("Array index out of bounds for length 50.");
			}
		} while (index == 0);

	}

}
