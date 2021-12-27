import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] array = {1,2,3,1,2};
        Insertion(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Insertion(int[] arr ){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
