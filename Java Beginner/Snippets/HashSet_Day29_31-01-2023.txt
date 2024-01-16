import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		/*
		int[] arr = {2, 4, 5, 11, 4, 9, 6, 1, 9, 11, 5, 4, 2};
				
		HashMap<Integer, Integer> freqmap = new HashMap<>();
		//key -> element, value -> frequency
		for(int i = 0; i < arr.length; i++){
			if(freqmap.containsKey(arr[i]) == true){
				//already present -> update frequency by 1
				int oldFreq = freqmap.get(arr[i]);
				freqmap.put(arr[i] , oldFreq + 1);
			
			}else{
				freqmap.put(arr[i], 1);
			}
		}
		/*
		freqmap = {2 = 1, 4 = 2, 5 = 1, 11 = 1 ,}
		i = 0 arr[0] = 2 containsKey(2) ->false
		i = 1 arr[1] = 4 containsKey(4) -> false
		i = 2 arr[2] = 5 containsKey(5) -> false
		i = 3 arr[3] = 11 containsKey(11) -> false
		i = 4 arr[4] = 4 containsKey(4) -> true
		oldFreq = get(4) = 1
		freqmap.put(4, 2)
		
		System.out.println(freqmap);
		
		*/
		
		//given an array, print all the unique entries
		
		int[] arr = {2, 4, 5, 11, 4, 9, 6, 1, 9, 11, 5, 4, 2};
		//ans = 2 4 5 11 9 6 1
		
		HashSet<Integer> unique = new HashSet<>();
		
		for(int val : arr){
			System.out.print(val + " ");
			unique.add(val);
		}
		System.out.println();
		System.out.println(unique);
		
		//count of unique elements in array
		System.out.println(unique.size());
	}
}