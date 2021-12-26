public class PeakRotatedArray {
    public static void main(String[] args) {
        int [] array = {1,3,5};
        int target = 5;

        int index = peakElement(array);

        System.out.println(index);
    }
    public static int peakElement(int[] array ){

        int s = 0;
        int e = array.length-1;
        int ans = 0;
        while(s<=e){

            int mid = s + (e-s)/2; //index of middle element

            if(mid<e && array[mid]>array[mid+1]){
                return mid;
            } else if(mid>0 && array[mid]<array[mid-1]){
                return mid-1;
            }

            if(array[s]<array[mid]){
                s=mid+1;
            }else if(array[s]>=array[mid]){
                ans=mid;
                e=mid-1;
            }

        }

        return ans;
    }
}
