class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<row.size();i++) {
            int a = row.get(i);
            for(int j=0;j<n;j++){
                matrix[a][j]=0;
            }
        }

        for(int i=0;i<col.size();i++) {
            int a = col.get(i);
            for(int j=0;j<m;j++){
                matrix[j][a]=0;
            }
        }
        
    }
}
