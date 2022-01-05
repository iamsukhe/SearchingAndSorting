public class Pattern {
    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern6(5);
//        pattern5(5);
//        pattern7(5);
        pattern8(5);
    }

    static void pattern1(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i=0; i<2*n-1; i++){
            int c = i<n ? i : n-(i-n+1)-1;
            for (int j=0; j<=c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i=0; i<n; i++){
            int space = n-(i+1);

            for (int j=0; j<space; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i=0; i<n; i++){

            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            for (int j=0; j<(n-i); j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i=0; i<n; i++){

            for (int j=0; j< (n-i-1); j++){
                System.out.print(" ");
            }

            for (int j=0; j<=2*i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
