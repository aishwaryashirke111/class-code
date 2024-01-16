import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		// int n = scn.nextInt();
		
		/*
			n = 4
			*---*
			*---*
			*---*
			*---*
			
			1* (n-1)spaces 1*
		
		
		for(int row = 1; row <= n; row++){
			
			System.out.print("*");
			
			//Print (n-1)spaces
			for(int space = 1; space <= (n-1); space++){
				System.out.print("-");
			}
			
			System.out.print("*");
			
			System.out.println();
		}
		*/
		
		
		/*
		n = 5
			----*
			---**
			--***
			-****
			*****
		
		int n = scn.nextInt();
		for(int row = 1; row <= n; row++){
			//print (n-row) spaces
			for(int sp = 1; sp <= (n-row); sp++){
				System.out.print("-");
			}
			
			//print stars = row
			for(int st = 1; st <= row; st++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		/*
		n= 5
			*****
			-****
			--***
			---**
			----*
			(row-1)spaces  (n+1-row)stars
		
		
		int n = scn.nextInt();
		for(int row = 1; row <= n; row++){
			
			//print row-1 spaces
			for(int sp = 1; sp <= (row-1); sp++){
				System.out.print("-");
			}
			
			//print (n+1-row)stars
			for(int st = 1; st <= (n+1-row); st++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		int n = scn.nextInt();
		//upper half
		for(int row = 1; row <= n; row++){
			//print (n+1-row)stars
			for(int st = 1; st <= (n+1-row); st++){
				System.out.print("*");
			}

			//print 2*(row-1) spaces
			for(int sp = 1; sp <= 2*(row-1); sp++){
				System.out.print("-");
			}
			
			//print (n+1-row)stars
			for(int st = 1; st <= (n+1-row); st++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		//lower half
		
		for(int row = 1; row <= n; row++){
			
			//print star = row
			for(int st = 1; st<= row; st++){
				System.out.print("*");
			}
			
			//print 2*(n-row)spaces
			for(int sp =1; sp <= 2*(n-row); sp++){
				System.out.print("-");
			}
			
			//print star = row
			for(int st = 1; st<= row; st++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		*/
		
		
		//Full Numeric Pyramid
		
		
		int n = scn.nextInt();
		
		
		for(int row = 1; row <= n; row++){
			
			//First Half: (n-row)spaces  increasing order
			
			for(int sp = 1; sp <= (n-row); sp++){
				System.out.print("- ");
			}
			
			int start1 = row;
			int end1 = 2*row - 1;
			
			for(int i = start1; i <= end1; i++){
				System.out.print(i + " ");
			}
			
			//Second half : decreasing order  (n-row)spaces
			int start2 = 2*row - 2;
			int end2 = row;
			
			
			for(int i = start2; i >= end2 ; i--){
				System.out.print(i + " ");
			}
			
			for(int sp = 1; sp <= (n-row); sp++){
				System.out.print("- ");
			}
			
			System.out.println();
		}
		/*
		
		
		Output:
			 
		- - - - 1 - - - - 
		
		
		/*
		n = 5
		row = 1
		
		start1 = 1
		end1 = 2*1 - 1 = 1
		
		start2 = 2*row - 2 = 2*1 - 2 = 0
		end2 = row = 1
		
		i = 0 -> 0 >= 1[false]
		for(int i = start2; i >= end2 ; i--){
				System.out.print(i + " ");
		}
		
		*/
		
	}
}