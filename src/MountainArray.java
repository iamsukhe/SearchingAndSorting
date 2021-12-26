public class MountainArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,3,1};
        int target = 5;

        int index = searchElemnt(array,target);

        System.out.println(index);

    }

    public static int searchElemnt(int[] array, int target){
        int peak = peakElement(array);

        int ans = arderAgnostic(array,target, 0 , peak ,true);

        if(ans==-1){
            ans = arderAgnostic(array,target, peak+1 , array.length-1 ,false);
        }

        return ans;
    }

    public static int arderAgnostic(int[] array, int target, int s,int e,boolean acc){

        while(s<=e){

            int mid = s + (e-s)/2; //index of middle element

            if(array[mid]==target){
                return mid;
            }

            if(acc){
                if(target>array[mid]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }else {
                if(target>array[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }


        }

        return -1;
    }

    public static int peakElement(int[] array ){

        int s = 0;
        int e = array.length-1;
        int ans = 0;
        while(s<=e){

            int mid = s + (e-s)/2; //index of middle element

            if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
                return mid;
            }
            if(array[mid]<array[mid+1]){
                s=mid+1;
            }else if(array[mid]>array[mid+1]){
                ans=mid;
                e=mid;
            }

        }

        return ans;
    }

}


//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//
//        int index = searchElemnt(mountainArr,target);
//
//        return index;
//
//    }
//
//    int searchElemnt(MountainArray array, int target){
//        int peak = peakElement(array);
//
//        if (array.get(peak) == target){
//            return peak;
//        }
//
//        int left = arderAgnostic(array,target, 0 , peak-1 ,true);
//
//        if (left!= -1 && array.get(left) == target){
//            return left;
//        }
//
//
//
//        int right = arderAgnostic(array,target, peak+1 , array.length()-1 ,false);
//
//
//        return right;
//    }
//
//    int arderAgnostic(MountainArray array, int target, int s,int e,boolean acc){
//
//        while(s<=e){
//
//            int mid = s + (e-s)/2; //index of middle element
//
//            if(array.get(mid)==target){
//                return mid;
//            }
//
//            if(acc){
//                if(target>array.get(mid)){
//                    s=mid+1;
//                }else{
//                    e=mid-1;
//                }
//            }else {
//                if(target>array.get(mid)){
//                    e=mid-1;
//                }else{
//                    s=mid+1;
//                }
//            }
//
//
//        }
//
//        return -1;
//    }
//
//    int peakElement(MountainArray array ){
//
//        int s = 0;
//        int e = array.length()-1;
//        int ans = 0;
//        while(s<=e){
//
//            int mid = s + (e-s)/2; //index of middle element
//
//            if(array.get(mid)>array.get(mid+1) && array.get(mid)>array.get(mid-1)){
//                return mid;
//            }
//            if(array.get(mid)<array.get(mid+1)){
//                s=mid+1;
//            }else if(array.get(mid)>array.get(mid+1)){
//                ans=mid;
//                e=mid;
//            }
//
//        }
//
//        return ans;
//    }
//
//}