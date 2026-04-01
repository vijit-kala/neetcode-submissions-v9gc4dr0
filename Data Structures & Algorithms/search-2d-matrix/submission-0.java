class Solution {

    private boolean binSearch(int[] arr, int target) {
        int l = 0, h = arr.length-1;

        while(l <= h) {
            int m = l + (h-l)/2;
            if(arr[m] == target)
                return true;
            else if(arr[m] > target) 
                h = m-1;
            else
                l = m + 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] arr: matrix) {
            if(target >= arr[0] && target <= arr[arr.length-1]) {
                var res = binSearch(arr, target);
                if(res)
                    return true;
            }
        }

        return false; // not found
    }
}
