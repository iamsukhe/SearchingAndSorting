public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a =  {{1,2},{3,4}};

        int minr = 0;
        int minc = 0;
        int maxr = a.length-1;
        int maxc = a[0].length-1;
        int maxEl = (a.length)*(a[0].length);
        int count = 0;


        while(count < maxEl ){

//            top wall
            for(int i=minr, j=minc; j<=maxc && count < maxEl ; j++ ){
                System.out.println(a[i][j]);
                count++;
            }
            minr++;

//            left wall
            for(int i=minr, j=maxc; i<=maxr && count < maxEl ; i++ ){
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;

//            bottom wall
            for(int i=maxr, j=maxc; j>=minc && count < maxEl ; j-- ){
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;

//            right wall

            for(int i=maxr, j=minc; i>=minr && count < maxEl; i--){
                System.out.println(a[i][j]);
                count++;
            }
            minc++;

        }



    }
}
