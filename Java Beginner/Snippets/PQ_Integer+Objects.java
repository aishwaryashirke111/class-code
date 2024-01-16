import java.util.*;

class Main {
	
	// demo 1 -> demo of priority Queue (Min PQ)
	public static void demo1() {
		// min priority queue -> default priority queue in JAVA 
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(19); // -> log(1)
		pq.add(20); // -> log(2)
		pq.add(13); // -> log(3)
		pq.add(7);  // -> log(4)
		pq.add(11); // -> log(n)
		
		
		// total time complexity -> nlogn
		// Space complexity -> O(n)
		// Heap Sort will work the logic of priority queue
				
		while(pq.size() > 0) {
			int peek = pq.peek();
			pq.remove();
			System.out.print(peek + " ");
		}
		System.out.println();	
	}
	
	
	// demo 2 -> demo of priority Queue (Max PQ)
	public static void demo2() {
		// max priority queue -> pass a comparator in contructor of PQ
		// syntax of comparator -> Collections.reverseOrder() for maxPQ 
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(19); 
		pq.add(20); 
		pq.add(13); 
		pq.add(70);  
		pq.add(11);
		
		while(pq.size() > 0) {
			int peek = pq.peek();
			pq.remove();
			System.out.print(peek + " ");
		}
		System.out.println();	
	}
	
	
	
	// demo 3 -> PriorityQueue of objects i.e. user defined class
	public static class Car {
		String name;
		int price;
		
		Car(String name, int price) {
			this.name = name;
			this.price = price;
		}
	}
	
	// Coordinates, add those coordinates in PQ, and print it by 
	// following logic :-> 
	// 1. print coordinate which have smallest x,
	// 2. if two coordinate have same x, print coordinate 
	//    which have smallest y
	
	public static class Pair {
		int x;
		int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void solve() {
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {
				int x1 = p1.x;
				int x2 = p2.x;
				int y1 = p1.y;
				int y2 = p2.y;
				
				
				if(x1 == x2) {
					return -(y1 - y2);
				}
				return -(x1 - x2);
			}
		});
		
		
		pq.add(new Pair(2, 4));
		pq.add(new Pair(7, 6));
		pq.add(new Pair(5, 4));
		pq.add(new Pair(2, -3));
		pq.add(new Pair(7, 3));
		
		
		while(pq.size() > 0) {
			Pair rem = pq.remove();
			System.out.println(rem.x + ",  " + rem.y);
		}
	}
	
	
	public static void demo3() {
		/*
		 * Since we are making a PQ of objects
		 * PQ is not aware from priority of object 
		 * we have to define our priority in object
		 */
		
		PriorityQueue<Car> pq = new PriorityQueue<>(new Comparator<Car>() {
			@Override
			public int compare(Car a, Car b) {
				// if we want to. compare it on the basis o price 
				return -(a.price - b.price);
				
				
				// if(a.price > b.price) {
				// 	return 1; // +ve value 
				// } else if(a.price < b.price) {
				// 	return -1; // -ve value 
				// } else {
				// 	return 0; // 0 means equal
				// }
			}
		});
		
		
		pq.add(new Car("A", 600));
		pq.add(new Car("B", 400));
		pq.add(new Car("C", 535));
		pq.add(new Car("D", 490));
		pq.add(new Car("E", 150));
		
		
		while(pq.size() > 0) {
			Car peek = pq.remove();
			System.out.println(peek.name + " " + peek.price);
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		solve();
		
		// demo3();
		
		// demo2();
		// demo1();
	}
}