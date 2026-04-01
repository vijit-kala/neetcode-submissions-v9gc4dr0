class Solution {

    private boolean binSearch(int[] arr, int target) {
        int l = 0, h = arr.length-1;
        while(l <= h) {
            int m = l + (h-l) / 2;
            if(arr[m] == target)
                return true;
            else if(arr[m] < target)
                l = m + 1;
            else
                h = m - 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        // Row wise binary search -> O(MlogN)
        for(int[] row: matrix) {
            if(binSearch(row, target))
                return true;
        }

        return false;
    }
}
