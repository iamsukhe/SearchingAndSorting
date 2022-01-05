import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAdd {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int k = 516;
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        String ans = "0";
        for(int i=0; i<num.length; i++){
            ans =  String.valueOf(Integer.parseInt(ans)*10 + num[i]);
        }


        System.out.println(ans);
        ans = String.valueOf(Integer.parseInt(ans)  + k);


        for(int i=0; i<ans.length() ; i++){
            a.add( Character.getNumericValue(ans.charAt(ans.length()-1-i) ));
        }



        System.out.println(a);
    }
}
