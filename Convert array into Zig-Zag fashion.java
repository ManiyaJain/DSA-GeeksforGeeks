class Solution {
    // TC - O(N), SC - O(1)
    public static void zigZag(int[] arr) {
        boolean zigZagFlag = true;
        for(int i = 0; i < arr.length-1; i++){
            if(zigZagFlag){
                if(arr[i] > arr[i+1]){
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
                }
            }
            else{
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            zigZagFlag = !zigZagFlag;
        }
    }
}
