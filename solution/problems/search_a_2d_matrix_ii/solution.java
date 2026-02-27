class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        int curr=matrix[i][j];

        while(i!=matrix.length-1||j!=0){
                if(curr>target && j-1!=-1){
                    curr=matrix[i][j-1];
                    j--;
                }
                else if(curr<target && i+1!=matrix.length ){
                    curr=matrix[i+1][j];
                    i++;
                }
                else if(curr==target){
                    curr=matrix[i][j];
                    break;
                }else break;
        }
        return curr==target?true:false;
    }
}