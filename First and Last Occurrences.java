class GFG {
    int getFirst(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int firstIndex = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == x)  {
                firstIndex = mid;
                high = mid - 1; // first occurrence will be on left side, so move left
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return firstIndex;
    }
    
    int getLast(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int lastIndex = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == x)  {
                lastIndex = mid;
                low = mid + 1; // first occurrence will be on right side, so move right
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return lastIndex;
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int firstIndex = getFirst(arr, x);
        int lastIndex = getLast(arr, x);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(firstIndex);
        list.add(lastIndex);
        return list;
    }
}
