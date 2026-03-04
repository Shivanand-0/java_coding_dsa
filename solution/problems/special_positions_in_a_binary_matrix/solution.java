class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        int n=mat.length;
        int m=mat[0].length;
        int[] rowSum=new int[n];
        int[] colSum=new int[m];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               rowSum[i]+=mat[i][j];
            }
        }
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
               colSum[i]+=mat[j][i];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1 && rowSum[i]==1 && colSum[j]==1){
                count++;
               }
            }
        }
        return count;
    }
}

// public int numSpecial(int[][] mat) {
//         int count_row,count_col,count_u=0;
//         int curr_row=0;
//         int curr_col=0;
//         for(int i=0;i<mat.length;i++){
            
//             count_row=0;
//             count_col=0;
//             for(int j=0;j<mat[0].length;j++){
//                 if(mat[curr_row][curr_col]!=1 ){
//                     continue;
//                 }
//                 if(count_row<1){
//                     if(mat[i][j]==1){
//                         count_row++;
//                     }
//                 }else{
//                     if(mat[i][j]==1){
//                         count_row++;
//                         break;
//                     }
//                 }
//             }
//             if(count_row!=1) continue;
//             for(int k=0;k<mat.length;k++){
//                 if(count_col<1){
//                     if(mat[k][i]==1){
//                         count_col++;
//                     }
//                 }else{
//                     if(mat[i][k]==1){
//                         count_col++;
//                         break;
//                     }
//                 }
//             }
//             if(count_row==1 && count_col==1 ){
//                 count_u++;
//             }
            
//         }
//         return count_u;
//     }