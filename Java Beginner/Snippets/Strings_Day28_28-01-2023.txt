import java.util.*;
class Main {
	
	static boolean IsPalindrome(String str){
		String rev = "";
		int n = str.length();
		for(int i = n-1; i >= 0; i--){
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		// == does not work properly. 
		if(str.equals(rev)){
			return true;
		}else{
			return false;
		}
	}
	
	
	static String lowercase(String str){
		String ans = "";
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);//uppercase character
			//65->97 (add 32 to it)
			char lower = (char)(ch+32);//lowercase character
			ans = ans+lower;
		}
		return ans;
	}
	
	static int countVowels(String str){
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
			}
		}
		return count;
	}
	
	
	static String replace(String str, char x){
		String ans = "";
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == x){
				ans = ans + '$';
			}else{
				ans = ans + ch;
			}
		}
		return ans;
	}
	/*
	str = "apple", x = 'p'
	ans = ""
	
	i 	ch 		ch=='p'		ans 	
	0 	'a'		false		"a"
	1 	'p'	    true 		"a$"
	2 	'p'		true 		"a$$"
	3 	'l'	    false 		"a$$l"
	4 	'e'	    false 		"a$$le"
	
		
	*/
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		// String st = scn.nextLine();
		/*
		boolean ans = IsPalindrome(st);
		if(ans == true){
			System.out.println(st + " is palindromic");
		}else{
			System.out.println(st + " is not palindromic");
		}
		*/
		/*
		String s1 = "Hello";
		String s2 = "Hell";
		s2 = s2 + 'o';
		System.out.println("s1 : " + s1 + " s2 : " + s2);
		System.out.println(s1.equals(s2) );
		
		*/
		
		// char ch = 'A';
		// char n =(char)(ch + 32);
		// System.out.println(n);
		
		// String ans = lowercase(st);
		// System.out.println(ans);
		
		
		/*
		int t = scn.nextInt(); //4
		scn.nextLine();
		while(t >0){
			String fullname = scn.nextLine();
			System.out.println(fullname);
			t--;
		}
		*/
		// String s1 = scn.nextLine();
		// String name = scn.next(); //"Priyanshi"
		// String lastname = scn.nextLine();// " Sirohi"
		// System.out.println(age + ":" +fullname );
		
		/*
		int vowels = countVowels(st);
		int consonants = st.length() - vowels;
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);
		*/
		
		/*
		String res = replace("interviewbit", 'i');
		//res = "$nterv$ewb$t"
		System.out.println(res);
		
		
		String s1 = scn.nextLine();//"interviewbit"
		String s2 = scn.next(); //"i"
		char x = s2.charAt(0); //'i'
		
		String res = replace(s1, x);
		System.out.println(res);
		*/
		
		
		String s1 = "Hello";
		String s2 = " World!"; 
		String s = 100 + 20 + " " + s1 + s2; 
		/*
		100 + 20 -> 120
		120 + " " -> "120 "
		"120 " + s1 -> "120 Hello"
		"120 Hello" + s2 -> "120 Hello World!"
 		*/
		System.out.println(s);
	}
}