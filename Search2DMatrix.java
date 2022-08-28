class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[][] twoDMatrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}, {10,13,14,17,24},{18,21,23,26,30}};
        int val = 5;
        
        boolean found = true;


        for(int i = 0; i < twoDMatrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == val){
                    found = true;
                    break;
                }
                else{
                    found = false;
                }
            }
        }
        return found;
    }
}

class solution{
    public boolean searchMatrix(int[][] M, int T){
        int y = M.length, i = 0, j = M[i].length - 1;
        while (i < y && j >= 0) {
            int cell = M[i][j];
            if (cell == T) return true;
            else if (cell > T) j--;
            else i++;
        }
        return false;
    }
}