import java.util.*;

class Main {
	
	public static int lcs(String s1, String s2, int i, int j) {
		if(i < 0 || j < 0) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		int ans = 0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = lcs(s1, s2, i-1, j-1) + 1;
		} else {
			ans = Math.max(lcs(s1, s2, i-1,j), lcs(s1, s2, i, j-1));
		}
		
		return dp[i][j] = ans;
	}
	
	public static int[][] dp;
	
	
	// memoization
	public static int longestCommonSubseq1(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		dp = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dp[i][j] = -1;
			}
		}	
		return lcs(s1, s2, n-1, m-1); 
	}
	
	// tabulation
	public static int longestCommonSubseq2(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		
		int[][] strg = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == 0 && j == 0) {
					// top-left corner
					if(s1.charAt(i) == s2.charAt(j)) {
						strg[i][j] = 1;
					} else {
						strg[i][j] = 0;
 					}
				} else if(i == 0) {
					// first row(indexwise 0) except top-left
					if(s1.charAt(i) == s2.charAt(j)) {
						strg[i][j] = 1;
					} else {
						strg[i][j] = strg[i][j-1];
 					}
					
				} else if(j == 0) {
					// first column except top-left
					if(s1.charAt(i) == s2.charAt(j)) {
						strg[i][j] = 1;
					} else {
						strg[i][j] = strg[i-1][j];
 					}
				} else {
					// rest of storage
					if(s1.charAt(i) == s2.charAt(j)) {
						strg[i][j] = strg[i-1][j-1] + 1;
					} else {
						strg[i][j] = Math.max(strg[i-1][j], strg[i][j-1]);
 					}
				}
			}	
		}
		return strg[n-1][m-1];
	}
	
	
	public static void main(String args[]) {
		String s1 = "skufhkkwrkuubda";
		String s2 = "smukxkzrlbdaz";
		
		// String s1 = "abbcdgf";
		// String s2 = "achegf";
		
		// System.out.println(longestCommonSubseq(s1, s2));
		System.out.println(longestCommonSubseq2(s1, s2));
	}
}

