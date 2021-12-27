import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] array = {1,2,3,1,2};
        selection(array);

        System.out.println(Arrays.toString(array));
    }
    public static void selection(int[] arr ){
         for(int i=0; i< arr.length; i++){
             int last = arr.length-1-i;
             int maxIndex = maxIndex(arr,0,last);
             swap(arr, maxIndex, last);
         }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


    public static int maxIndex(int[] arr, int s, int e) {
        int max = s;
        for(int i=s+1; i<= e ; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
