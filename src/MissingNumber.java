import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};

        cyclic(nums);

        for(int i=0; i<nums.length; i++){
            if(i!=nums[i]){
                System.out.println(i);
                return;
            }
        }

        System.out.println(nums.length);
    }

    public static void cyclic(int[] arr ){
        int i=0;
        while( i < arr.length){
            if(i==arr[i] || arr[i]>arr.length-1 ){
                i++;
            }else{
                swap(arr,i,arr[i]);
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
