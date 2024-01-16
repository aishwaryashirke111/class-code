import java.util.*;
class Main {
	/*
	write a function that returns an arraylist
	containing all the element which are divisible 
	by both 5 and 7
	
	al : [21, 35, 14, 70, 25]
	o/p -> [35, 70]
	*/
	
	static ArrayList<Integer>  solve (ArrayList<Integer> list){
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++){
			int val = list.get(i);
			if(val % 5 == 0  &&  val % 7 == 0){
				ans.add(val);
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(21);
		al.add(35);
		al.add(14);
		al.add(70);
		al.add(25);
		//al : [21, 35, 14, 70, 25]
		
		ArrayList<Integer> res = solve(al);
		System.out.println(res);
		
		
		
	}
}