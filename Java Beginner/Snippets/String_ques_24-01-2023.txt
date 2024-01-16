import java.util.*;
class Main {
	
	//count uppercase character in a String
	static int count_Caps(String A){
		int n = A.length();
		int count = 0;
		for(int i = 0; i < n; i++){
			char ch = A.charAt(i);
			//A-Z
			if(ch >= 65 && ch <= 90){
				count++;
			}
		}
		return count;
	}
	/*
	"AbC"
	n = 3, count = 0
	i=0, ch = 'A'(65)
	65 >= 65 && 65 <= 90 true -> count = 1
	i=1, ch = 'b' (98)
	98 >= 65 && 98 <= 90 false -> count = 1
	i=2, ch = 'C' (67)
	67 >= 65 && 67 <= 90 true -> count = 2
	i=3 -------->break
	*/
	
	//function that returns reverse of the given String
	static String reverse(String str){
		int n = str.length();
		String rev = ""; //empty String
		
		for(int i = n-1; i >= 0; i--){
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		
		return rev;
	}
	
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		// String str = scn.nextLine();
		// int ans = count_Caps(str);
		// System.out.println(ans);
		
		/*
		Quizzes
		
		String str = "Hey There";
    	System.out.println(str.charAt(2));//y
	    System.out.println(str.length);//Error
		
		char ch = 97; //ASCII to char
    	System.out.println(ch); //a
		
		
		char ch = 'M'; 
   	 	System.out.println(ch);
			
			
		String str = "Hey There";	
		System.out.println(str.length());
		*/
		
		String st = scn.nextLine();
		String ans = reverse(st);
		System.out.println(ans);
	}
}