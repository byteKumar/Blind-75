class Solution {
    public void rotate(int[][] matrix) {
        reverse(matrix);

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }

    private void reverse(int[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n/2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n-1-i] = temp;
        }
    }
}
