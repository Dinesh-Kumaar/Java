public class MatrixSum {
    static int sumOfMatrix(int n, int m, int[][] grid) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 3, m = 5;
        int[][] grid = {{1,0,1,0,1},{-  1,-1,-1,-1,-1},{0,1,0,1,0}};
        
        System.out.println(sumOfMatrix(n,m,grid));
    }
}
