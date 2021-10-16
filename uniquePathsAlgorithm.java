class uniquePathsAlgorithm {
    
   public int uniquePaths(int m, int n){         
        int gridLength = m*n; 

        if(m ==1 || n == 1){
            return 1;
        }
        if(m < gridLength && n < gridLength) {
            return uniquePaths(m-1, n) + uniquePaths(m, n-1);
        }
    return 0;
    }
}