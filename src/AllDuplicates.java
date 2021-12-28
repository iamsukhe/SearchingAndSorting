import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};

        List<Integer> missing=new ArrayList<Integer>();

        System.out.println(Arrays.toString(nums));

        int i=0;
        while( i < nums.length){
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                }

        }
        for(int j=0; j<nums.length; j++){
            if(j+1!=nums[j]){
                missing.add(nums[j]);
            }
        }
        System.out.println(Arrays.toString(missing.toArray()));
    }



    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
