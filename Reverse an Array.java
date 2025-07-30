class Solution {
    public void reverseArray(int arr[]) {
        // Two Pointer Approach 
        int i  = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
