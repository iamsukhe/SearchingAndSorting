import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {

        int[][] arr =  {{1,2},{3,4}};

        int[][] ans = matrixReshape(arr , 1,4);
        System.out.println(Arrays.deepToString(ans));

    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m*n != r*c){
            return mat;
        }



        int[][] a = new int[r][c];
        int row=0;
        int col=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                a[row][col]=mat[i][j];
                col++;

                if(col==c){
                    col=0;
                    row++;
                }
            }
        }

        return a;


    }


}
