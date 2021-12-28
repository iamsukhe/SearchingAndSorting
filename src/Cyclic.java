import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int [] array = {3,2,1};
        cyclic(array);

        System.out.println(Arrays.toString(array));
    }

    public static void cyclic(int[] arr ){
        int i=0;
        while( i < arr.length){
            if(i==arr[i]-1){
                i++;
            }else{
                swap(arr,i,arr[i]-1);
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
