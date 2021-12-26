public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,16,20,36,48};
        int target = 15;

        int s = 0;
        int e = arr.length-1;
        int ans = 0;

        while(s<=e){

            int mid = s + (e-s)/2; //index of middle element

            if(target>arr[mid]){
                s=mid+1;
            }else if(target<arr[mid]){
                ans = mid; //might the possible answer
                e=mid-1;
            }else{
                System.out.println(arr[mid] + "," + mid);
                return;
            }

        }

        System.out.println(arr[ans] + "," + ans );

    }
}
