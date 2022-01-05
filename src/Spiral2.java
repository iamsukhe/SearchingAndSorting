import java.util.Arrays;

public interface Spiral2 {
    public static void main(String[] args) {

        int[][] matrix = new int[1][4];
        int[][] a = new int[4][2];



        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int maxEl = (matrix.length)*(matrix[0].length);
        int count = 0;

        while(count < maxEl ){

            for(int i=minr, j=minc; j<=maxc && count < maxEl; j++ ){
                a[count][0] = i;
                a[count][1] = j;
                count++;
            }
            minr++;


            for(int i=minr, j=maxc; i<=maxr && count < maxEl; i++ ){
                a[count][0] = i;
                a[count][1] = j;
                count++;
            }
            maxc--;

            for(int i=maxr, j=maxc; j>=minc && count < maxEl; j-- ){
                a[count][0] = i;
                a[count][1] = j;
                count++;
            }
            maxr--;


            for(int i=maxr, j=minc; i>=minr && count < maxEl; i--){
                a[count][0] = i;
                a[count][1] = j;
                count++;
            }
            minc++;


        }

        System.out.println(Arrays.deepToString(a));

    }
}
