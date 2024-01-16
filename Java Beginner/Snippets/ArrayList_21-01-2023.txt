import java.util.*;
class Main {
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		// ArrayList<Integer> al = new ArrayList<>();
		/*
		Basic functions -> add, get, size, set, remove
		//al.add(element); -> add new elements
		al.add(5); // al : [5]
		al.add(40); // al : [5, 40]
		al.add(-1) ; // al : [5, 40, -1]
		System.out.println(al);
		
		//how to get element -> al.get(index)
		
		// System.out.println(al.get(2)); //-1
		// System.out.println(al.get(3)); //Error
		
		
		
		for(int i = 0; i < al.size(); i++){
			//arr[i] -> al.get(i)
			System.out.print(al.get(i) + " ");
			
		}
		
		
		//change existing element -> al.set(index, element)
		
		al.set(0, 50); // al: [50, 40, -1]
		
		
		al.add(60); // al : [50, 40, -1, 60]
		// System.out.println( al.size() );
		System.out.println(al);

		//remove element -> al.remove(index)
		al.remove(1); // al : [50, -1, 60]
	
		System.out.println(al);
		*/
		
		/*
		//taking input from the user
		ArrayList<Integer> al = new ArrayList<>();
		
		int n = scn.nextInt(); //5
		
		for(int i = 0; i < n; i++){
			int val = scn.nextInt();
			al.add(val);
		}
		System.out.println(al);
		*/
		
		/*
		//print all the even elements present in your ArrayList
		for(int i = 0; i < al.size(); i++){
			int element = al.get(i);
			if(element % 2 == 0){
				System.out.print(element + " ");
			}
		}
		
		al : [20, 45, 68, 97, 44]
		 	   0   1   2   3   4
		O/P ->  20 68 44 
		i 	i<5  element 	element%2 == 0 	 i++
		0 	true   20 		 true 			  1
		1 	true   45 		 false 			  2
		2 	true   68 		 true 			  3
		3 	true   97 		 false 			  4
		4 	true   44 		 true			  5
		5 	false ------------> break
		
			
		*/
		
		//add element at a particular index -> al.add(index, element)
		//al : [20, 45, 68, 97, 44]
		// index 2 -> element -> 100
		/*
		al.add(2, 100);
		System.out.println(al);
		al.add(0, 500);
		System.out.println(al);
		
		
		//Quizes
		ArrayList<Integer>list = new ArrayList<>();
	
		list.add(10); // list : [10]
		list.add(20); // list : [10, 20]
		list.add(30); // list : [10, 20, 30]
		
		// System.out.println(list.get(1));//20
	
		// list.set(3,45); //Error
		
		list.add(16); // list : [10, 20, 30, 16]
    	list.remove(2); // list : [10, 20, 16]
    
    	System.out.println(list);
		*/
		ArrayList<Integer>list = new ArrayList<>();
		list.add(250);
		list.add(250);
		System.out.println(list);
		
		//Incorrect way
		System.out.println( list.get(0) == list.get(1) ); //false
		
		//Correct way -> .equals()
		System.out.println( list.get(0).equals( list.get(1) ) );
		
		int val1 = list.get(0);
		int val2 = list.get(1);
		System.out.println( val1 == val2 );
		
	}	
}