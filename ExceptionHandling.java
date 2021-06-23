package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("division program (x/y)\nenter your x: ");
		try {
			int x = in.nextInt();
			System.out.println("enter your y: ");
			int y = in.nextInt();
			int result = x / y;
			System.out.println("your result is " );
		} catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
