public class Fibbonacci {
    public static void main(String[] args) {
        int n=4;
        int a=0;
        int b=1;

        for(int i=0; i<n ; i++){
            int temp = a;
            a=b;
            b=temp+b;
        }

        System.out.println(a);
    }
}
