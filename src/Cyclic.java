import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int [] array = {7,8,9,11,12};
        cyclic(array);

        System.out.println(Arrays.toString(array));
    }

    public static void cyclic(int[] arr ){
        int i=0;
        while( i < arr.length){
            int correctIndex = arr[i]-1;
            if( correctIndex>=0 && correctIndex<arr.length && arr[i]!=arr[correctIndex]  ){
                swap(arr,i,correctIndex);
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
