import java.util.*;
class Main {
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[][] mat = new int[N][M];
		/*
		0 0 0
		0 0 0
		*/
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				mat[i][j] = scn.nextInt();
			}
		}
		/*
		1 2 3
		4 5 6
		*/
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//print column-wise
		/*
			1 4
			2 5
			3 6
		
		
		
		for(int j = 0; j < M; j++){
			for(int i = 0; i < N; i++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		/*
		Wave print
		1 2 3 4 5 
		6 7 8 9 10 
		
		
		O/p -> 1 6 7 2 3 8 9 4 5 10
		*/
		
		for(int j = 0; j < M; j++){
			if(j % 2 == 0){
				//top to bottom
				for(int i = 0; i < N; i++){
					System.out.print(mat[i][j] + " ");
				}
			}else{
				//bottom to top
				for(int i = N -1 ; i >= 0; i--){
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
	}
}