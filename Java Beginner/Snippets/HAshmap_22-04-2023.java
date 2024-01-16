import java.util.*;

public class Main {

    /*
     * Problem 1 : Given an array A[], calculate number 
     * of distinct element in every K size subarray and print it
     */

    public static void printSubarrayK(int[] A, int K) {
        int n = A.length;
        HashMap<Integer, Integer> fmap = new HashMap<>();
        // fmap -> frequency map
        // 1. calculate element occurrence in first window i.e. 0 to K - 1
        for(int i = 0; i < K; i++) {
            int ele = A[i];
            if(fmap.containsKey(ele)) {
                // 1. If available in map -> increase freq.
                int oldFreq = fmap.get(ele);
                fmap.put(ele, oldFreq + 1);
            } else {
                // 2. If not available -> add ele with freq 1
                fmap.put(ele, 1);
            }
        }
        // 1.1 We have answer for first window
        System.out.println(fmap.size());

        // 2. For every upcoming window perform same task
        int s = 1;
        int e = K;
        while(e < n) {
            // 1. Remove impact of A[s-1] from hashmap
            // 1.1 decrese freq of A[s - 1] by 1
            int oldFreq = fmap.get(A[s-1]);
            fmap.put(A[s-1], oldFreq - 1);
            // 1.2 After decreasing, if freq is 0, remove that element
            if(fmap.get(A[s-1]) == 0) {
                fmap.remove(A[s-1]);
            }


            // 2. Add impact of A[e] in hashMap
            if(fmap.containsKey(A[e])) {
                // 1. If available in map -> increase freq.
                int old = fmap.get(A[e]);
                fmap.put(A[e], old + 1);
            } else {
                // 2. If not available -> add ele with freq 1
                fmap.put(A[e], 1);
            }


            // 3. Since key is unique, so map.size have distinct element
            System.out.println(fmap.size());
            
            
            // 4. Move window by one step
            s++;
            e++;
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 3, 8, 3, 9, 4, 9};
        int k = 4;
        printSubarrayK(A, k);
    }
}