class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int leader = 0;
         ArrayList<Integer> leaders = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] >= leader){
                leader = arr[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
