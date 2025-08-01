class Solution {
    public int getSecondLargest(int[] arr) {
        // TC - O(N), SC - O(1)
        int secondLargest = -1;
        int firstLargest = -1;
        for(int i : arr) {
            if(i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            }
            else if(i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
