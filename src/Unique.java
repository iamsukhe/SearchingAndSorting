import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        for(int i=0 ; i<n/2 ; i++){
            a[i]=-(i+1);
            a[n-(i+1)] = (i+1);
        }
        System.out.println(Arrays.toString(a));
    }
}
