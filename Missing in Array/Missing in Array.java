class Solution {
    int missingNum(int arr[]) {
        // Approach 1 - Overflow
        // int n = arr.length + 1;
        // int sum = n*(n + 1)/2;
        // for(int val : arr){
        //     sum = sum - val;
        // }
        // return sum;
        
        // Approach 2 - Hashing
        // TC - O(N), SC - O(N)
        // int n = arr.length + 1;
        // int hash[] = new int[n+1]; // fill all with 0 by default
        // for(int val : arr){
        //     hash[val] = 1;
        // }
        // for(int i = 1; i < hash.length; i++){
        //     if(hash[i] == 0){
        //         return i;
        //     }
        // }
        // return 0;
        
        // Approach 3 - Bitwise XOR (Optimised space complexity)
        // TC - O(N), SC - O(1)
        int n = arr.length + 1;
        int x = 0;
        int y = 0;
        for(int i = 1; i <= n; i++){
            x = x ^ i;
        }
        for(int val : arr){
            y = y ^ val;
        }
        return x ^ y;
    }
}
