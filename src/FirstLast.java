import java.util.Arrays;
public class FirstLast {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target = 8;
        int l =  nums.length;
        int flag = nums.length;
        int a[]={-1,-1};

        if(flag%2==0){

            for(int i=0 ; i<nums.length/2; i++){
                if(nums[i]==target){
                    a[0]=i;
                }
                if(nums[l-(i+1)]==target){
                    a[1]=l-(i+1);
                }
            }

        }

        System.out.println(Arrays.toString(a));
    }
}
