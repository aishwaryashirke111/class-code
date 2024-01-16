import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		//Print all the digits of a number
		/*
		// int n = scn.nextInt();
		
		
		
		//if the number is negative -> make it positive
		
		// -50 * -1 = 50
		
		if(n < 0){
			//make it positive by multiplying -1
			n = n * (-1); //n = -9876*-1 = 9876
			
		}
		else if(n == 0){
			System.out.println(0);
		}
		
		while(n > 0){
			int digit = n % 10;
			System.out.println(digit);
			n = n / 10; 
		}
		*/
		
		/*
			9876 -> digit = 6 
			987 -> digit = 7
			98 -> digit = 8
			9 -> digit = 9
			0
		*/
		/*
		//Print the sum of all the digits
		int n = scn.nextInt();
		int sum = 0;
		
		if(n < 0){
			//make it positive
			n = n * (-1); 
			//-612 * -1 = 612
		}
		while(n > 0){
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		
		System.out.println(sum);//9
		
		
		sum = 0
		
		n = 612 -> digit = 2 -> sum = 2
		n = 61 -> digit = 1 -> sum = 3
		n = 6 -> digit = 6 -> sum = 9
		n = 0
		*/
		
		
		/*
		int N = 34562;
		int count = 0;
		while(N >= 0) {
			N = N / 10;
			count++;
		}
		System.out.println(count);
		
		
			count = 0
			N   N >= 0  N= N/10  count++
		34562 	true 	3456	  1
		3456 	true 	345 	  2
		345 	true 	34 		  3
		34 		true 	3 		  4
		3 		true 	0 		  5
		0 		true 	0 		  6
		0 	    true    0         7
		.
		.
		.
		infinite loop
		
		*/
		
		/*
		int N = 34562;
		int count = 0;
		while(N > 0) {
			N = N / 10;
			count++;
		}
		System.out.println(count);
		
			count = 0 
			
			N   N > 0  N= N/10  count++
		34562 	true 	3456	  1
		3456 	true 	345 	  2
		345 	true 	34 		  3
		34 		true 	3 		  4
		3 		true 	0 		  5
		0  		false ---------> Break
		*/
		
		
		//Print all the perfect square from 1 to N
		
		/*
		int n = scn.nextInt();
		
		int i = 1;
		while(i * i <= n){
			System.out.println(i * i);
			i++;
		}
		
		*/
		
		//Handle multiple test cases
		/*
		int t = scn.nextInt(); //number of test cases
		
		while(t > 0){
			//work
			
			t--;
		}
		
		*/
		
		
		//for t test cases print sum of digits of each test cases
		
		int t = scn.nextInt(); //number of test cases
		
		while(t > 0){
			//work -> take input and print its sum of digits
			
			int n = scn.nextInt();
			int sum = 0;
			
			if(n < 0){
				//make it positive
				n = n * (-1); 
			}
			while(n > 0){
				int digit = n%10;
				sum = sum + digit;
				n = n/10;
			}
			
			System.out.println(sum);
			
			
			t--;
		}
		
		
	}
}