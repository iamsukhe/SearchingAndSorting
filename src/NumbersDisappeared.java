import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappeared {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        List<Integer> missing=new ArrayList<Integer>();

        cyclic(nums);
        System.out.println(Arrays.toString(nums));


        for(int i=0; i<nums.length; i++){
            if(i+1!=nums[i]){
                missing.add(i+1);
            }
        }

        System.out.println(Arrays.toString(missing.toArray()));
    }

    public static void cyclic(int[] arr ){
        int i=0;
        while( i < arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
