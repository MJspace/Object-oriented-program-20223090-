import java.util.*;

//An exploration of basic input and output.
class BasicIO {
	
	// Reads and processes string input.

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		// Reads and processes string input.
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		// display output on console
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + years);
		System.out.println("Day: " + years * 365 );
		System.out.printf("%tY년 %tm월 %td일 현재 %s(%d)의 키는 %dcm 입니다.  ",new Date(), new Date(), new Date(), name, years, height);

	} // method main

}// class BASIC_IO

