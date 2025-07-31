class Solution {
    public int maxConsecBits(int[] arr) {
        int currCount = 1;
        int maxCount = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                currCount += 1;
            }
            else{
                maxCount = Math.max(maxCount, currCount);
                currCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currCount);
        return maxCount;
    }
}
