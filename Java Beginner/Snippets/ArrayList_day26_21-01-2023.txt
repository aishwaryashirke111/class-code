import java.util.*;
class Main {
	/*
	write a function that returns an arraylist containing
	sum of each row
	
	al : [ [10, 20, 30], [1,2,3] ]
	o/p -> [60, 6]
	*/
	
	static ArrayList<Integer>  rowsum (ArrayList<ArrayList<Integer>> list){
		//arr[0].length -> list.get(0).size()
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			int sum = 0;
			for(int j = 0; j < list.get(0).size(); j++){
				//arr[i][j] -> list.get(i).get(j)
				sum = sum + list.get(i).get(j);
			}
			ans.add(sum);
		}
		
		
		return ans;
		
	}
	
	public static void main(String args[]) {
		// Your code goes here
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		al.add(l1);
		al.add(l2);
		
		
		ArrayList<Integer> res = rowsum(al);
		System.out.println(res);
		
		
	}
}