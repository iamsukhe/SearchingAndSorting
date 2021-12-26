public class BinarySearch {
     public static void main(String[] args) {
         int[] arr={2,4,6,9,11,12,14,20,36,48};
         int target = 15;

         int s = 0;
         int e = arr.length-1;

         while(s<=e){

             int mid = s + (e-s)/2; //index of middle element

             if(target>arr[mid]){
                 s=mid+1;
             }else if(target<arr[mid]){
                 e=mid-1;
             }else{
                 System.out.println(mid);
                 return;
             }

         }

         System.out.println(-1);

         System.out.println(1/2);

    }
}
