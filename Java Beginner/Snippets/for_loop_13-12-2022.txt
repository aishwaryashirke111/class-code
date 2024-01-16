import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		//Print number from 1 to 10
		/*
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		*/
		
		//print numbers from 1 to n 
		// int n = scn.nextInt();
		
		// for(int i = 1; i <= n; i++){
		// 	System.out.println(i);
		// }
		
		//Scope of variable in a loop
		/*
		for(int i = 1; i <= 3; i++){
			System.out.println(i);
		}
		System.out.println(i);
		//i is out of scope 
		*/
	
		/*
		int i = 1;
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		//i is already defined 
		*/
		
		// int i;
		// for(i = 1; i <= 3; i++) {
		// 	System.out.println(i);
		// }
		// System.out.println(i);
		
		/*
		
			i 	i<= 3   Output 	i++
			1 	true 	1 		2
			2 	true 	2 		3
			3 	true 	3 		4
			4  	false ------------> Break
						4
		
		*/
		
		//Print all the odd numbers from 1 to n 
		// n = 9 -> 1 3 5 7 9
		// n = 4 -> 1 3 
		
		//Approach 1
		// int n = scn.nextInt();
		// for(int i = 1; i <= n; i++){
		// 	if(i % 2 != 0){
		// 		//number is odd
		// 		System.out.println(i);
		// 	}
		// }
		
		//Approach 2 
		// int i;
		// for(i = 1; i <= n; i = i+2){
		// 	System.out.println(i);
		// }
		
		//i -> 1 -> 3 -> 5 
		/*
		// Print numbers from 10 to 1
		
		for(int i = 10;  i >= 1 ; i-- ){
			System.out.println(i);
		}
		
		//print number from n to 1
		int n = scn.nextInt();
		for(int i = n;  i >= 1 ; i = i -1 ){
			System.out.println(i);
		}
		*/
		
		// int n = 51753439;
		// System.out.println(n % 10);
		
		//Print all digits from right to left
		// int n = scn.nextInt();
		// int digit = 0;
		// for(int i = n; i > 0; i = i/10 ){
		// 	digit = i % 10;
		// 	System.out.println(digit);
		// }
		
		
		// 54166 -> up
		// 54160 -> down
		/*
			n = 6145
			i  		i >	0 	 digit 	Output 	i = i/10
			6145 	true 	 5 		5 			614
			614 	true 	 4 		4 			61
			61 	    true     1 		1 			6
			6 		true 	 6 		6 			0
			0 		false ----------------> Break	
		
		
		*/
		
		//Print first and last digit
		/*
		int n = scn.nextInt();
		int digit = 0;
		int lastdigit = n % 10;
		for(int i = n; i > 0; i = i/10 ){
			digit = i % 10;
		}
		System.out.println(digit + " " +lastdigit);
		
		
		n = 72354
		digit = 0 -> 4 -> 5 -> 3 -> 2 -> 7
		lastdigit = 72354%10 = 4
		
		i 		i>0 	digit 	i = i/10
		72354	true 	4 		7235
		7235 	true 	5 		723
		723 	true 	3  		72
		72 		true 	2 		7
		7 		true 	7 		0
		0 		false -------------> Break
		
		
		Output -> 7 4
		*/
		
		
		//Print reverse of a number
		
		int n = scn.nextInt();
		int rev = 0;
		for(int i = n; i > 0; i = i/10){
			int digit = i % 10;
			rev = rev * 10 + digit;//adding digit to back of rev
		}
		
		System.out.println(rev);
		
		/*
			n = 2500
			rev = 0
			i 		i>0   digit 	rev 		i = i/10
			2500 	true 	0 	0*10 + 0 = 0 	250
			250 	true 	0 	0*10 + 0 = 0 	25
			25 	    true 	5 	0*10 + 5 = 5 	2
			2 		true 	2	5*10 + 2 = 52 	0
			0		false ---------------> Break
			
			Output -> 52
		
		
		
			n = 123
			rev = 0
			i 		i>0 	digit 	rev 		i = i/10
			123		true 	3	   0*10 + 3 = 3 	12
			12 		true 	2 	   3*10 + 2 = 32 	1
			1 		true 	1 	   32*10 + 1 = 321  0
			0		false -----------> Break
			
			Output -> 321
			
		*/
		
		
	}
}