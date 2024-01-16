import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		// int a = 10;
		// System.out.print(a);
		
		//change the value of a to 50
		
		// a = 50;
		// System.out.println(a);
		
		//When you write data type in front of variable
		//name it means, we are creating a variable
		
		
		/*
		Rules of naming the variables:
		1. name cannot start with a digit
		2. only _ and $ are allowed as special characters
		3. names are also case sensitive
		4. you cannot use reserved keywords
			[public, static, void, int, float, double, class, long]
		5. Space is not allowed in the name
		
		int $num_ = 100;
		
		int phone_number = 5332342;
		
		int a = 50;
		int A = 50;
		
		int num = 30;
		int Num = 40;
		
		int Int = 70;
		
		
			black_grapes_ -> valid
			sun$shine -> valid
			7a -> invalid 
			_roll_number$ ->  valid
			4twenty -> invalid
			#age -> invalid 
			spring roll -> invalid
			_delhi -> valid
			roll_number -> valid
			bus ticket -> invalid
			static -> invalid
			void -> invalid
			$$$$ -> valid
		*/
		
		// int $$$$ = 85;
		// int ____ = 90;
		
		// numbers -> int, long
		//long is used to store larger numbers
		
		// int x =  10000000000; // -10^9 to 10^9
		//-2147483648 to 2147483647
		// System.out.println(x);
		
		// long n1 = 10000000000l; // -10^18 to 10^18
		// System.out.println(n1);
		
		// -5.5, 98.67
		// decimal numbers -> float, double
		// double is more precise
		
		/*
		float a = 10;
		float b = 3;
		float c = a/b;//10/3
		System.out.println(c);
		
		double a1 = 10;
		double b1 = 3;
		double c1 = a1/b1;//10/3
		System.out.println(c1);
		
		
		float num = 95.7f;
		System.out.println(num);
		*/
		/*
		 compiler defaults
		 number -> int
		 decimal numbers -> double
		*/
		
		/*
		// Declare an int type variable, name it number and assign it a value of 100
		int number = 100;
		// Declare a double type variable, name it double_number and assign it a value of 10.437
		double double_number = 10.437;
		// Declare a float type variable, name it float_number and assign it a value of 10.437
		float float_number = 10.437f;
		*/
		
		// long val = 1000l;
		// int num = val; //Error
		// System.out.println(num);
		
		// long val = 1000l;
		// int num = (int)val;
		// System.out.println(num);
		
		// Widening Type conversion
		//smaller to bigger (automatically)
		//int to long
		
		// long val = 1000;
		// System.out.println(val);
	
		
		// long val = 10000000000l; //bigger than 10^9
		// int num = (int)val; 
		// System.out.println(num); //Garbage value [integer overflow]
		
		
		// boolean Are_you_tired = false;
		// System.out.println(Are_you_tired);
		
		//How to take input
		//1. write import java.util.*; on the very first line
		//2. Create scanner to take input from user
		
		Scanner scn = new Scanner(System.in);
		/*
		int num = scn.nextInt(); //num = 50
		System.out.println(num); //50
		
		int x = scn.nextInt();//x = 60
		System.out.println(x);
		
		int c = num + x;//50+60
		System.out.println(c);//110
		*/
		
		
		/*
		long num2 = scn.nextLong();
		System.out.println(num2);
		
		//No Such Element Exception -> forgot to give input
		
		float num3 = scn.nextFloat();
		System.out.println(num3);
		
		double num4 = scn.nextDouble();
		System.out.println(num4);
		
		boolean ans = scn.nextBoolean();
		System.out.println(ans);
		*/
		
		
		// String s1 =  "hello World";
		// System.out.println(s1);
		
		//how to take input of String
		
		String s2 = scn.next(); 
		System.out.println(s2);
		
		// String s3 = scn.nextLine();
		// System.out.println(s3);
		
	}
}