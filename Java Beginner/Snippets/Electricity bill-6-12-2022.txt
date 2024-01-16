import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		//Electricity Bill
		int A = scn.nextInt();
		/*
		if(A <= 50){
			//A*1
			System.out.println(A);
		}
		else if(A > 50 && A <= 150){
			//50*1 + (A-50)*2
			System.out.println(2*A - 50);
		}
		else if(A > 150 && A <= 250){
			//50*1 + 100*2 + (A-150)*3
			System.out.println(3*A - 200);
		}
		else if(A > 250){
			//50*1 + 100*2 + 100*3 + (A-250)*5
			System.out.println(5*A - 700);
		}
		*/
		
		/*
		if(A <= 50){
			//1-50
			//A*1
			System.out.println(A);
		}
		else if(A <= 150){
			//51-150
			//50*1 + (A-50)*2
			System.out.println(2*A - 50);
		}
		else if(A <= 250){
			//151-250
			//50*1 + 100*2 + (A-150)*3
			System.out.println(3*A - 200);
		}
		else{
			//251 and above
			//50*1 + 100*2 + 100*3 + (A-250)*5
			System.out.println(5*A - 700);
		}
		
		*/
	}
}