public class Coins {
    public static void main(String[] args) {
        int n= 8;
        int s = 0;
        int e = n;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2; //index of middle element
            int k = (mid+1);
            if(k==(n)*2/mid){
                System.out.println(mid);
                return;
            }
            if(k<(n/mid)*2){
                s=mid+1;
            }else{
                e=mid-1;
            }

        }

        System.out.println(s-1);
    }
}
