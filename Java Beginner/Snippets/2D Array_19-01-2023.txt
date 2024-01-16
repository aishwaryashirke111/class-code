import java.util.*;
class Main {
	
	static int[][] sumOfMatrices(int[][] A, int[][] B){
		
		int[][] sum = new int[A.length][A[0].length];
		for(int i = 0; i < A.length; i++){
			for(int j = 0 ; j < A[0].length; j++){
				sum[i][j] = A[i][j] + B[i][j];
			}
		}
		return sum;
	}
	static void display(int[][] A){
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[0].length; j++){
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============");
	}
	
	
	static int[][] matrix_mul(int[][] A, int[][] B){
		int r1 = A.length;
		int c1 = A[0].length;
		int r2 = B.length;
		int c2 = B[0].length;
		
		int[][] ans = new int[r1][c2];
		
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c2; j++){
				
				int temp = 0;
				
				for(int k = 0; k < c1; k++){
					temp = temp + A[i][k]*B[k][j];
				}
				
				ans[i][j] = temp;
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		int[][] matA = { 
			{1, 2, 3, 4},
			{2, 3, -4, 5},
			// 2x4
		};
		
		display(matA);
		int[][] matB = {
			{0, -2, 5, 9},
			{4, 2, 11, 6},
			{3, -7, 2, 1},
			{2, 0, 1, 3}
			//4x4
		};
		display(matB);
		
		//Matrix Mulplication
		//(0, 0) -> 1*0 + 2*4 + 3*3 + 4*2 = 8+9+8 = 25
		int r1 = matA.length;
		int c1 = matA[0].length;
		int r2 = matB.length;
		int c2 = matB[0].length;
		
		if(c1 == r2){
			int[][] ans = matrix_mul(matA, matB);
			display(ans);
		}else{
			System.out.println("Mulplication not possible.");
		}
		
		
		
		
		
		
		/*
		Sum of matrices
		int[][] ans = sumOfMatrices(matA, matB);
		
		display(ans);
		*/
		/*
				1 2 3 4
		matA=	2 3 -4 5
				-5 10 3 9
			
				0 -2 5 9
		matB=		4 2 11 6
				3 -7 2 1
		
				1 0 8 13
		ans=	6 5 7 11
				-2 3 5 10
		*/
	}
	
	
}