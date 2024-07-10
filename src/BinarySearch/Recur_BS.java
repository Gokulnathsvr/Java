package BinarySearch;

public class Recur_BS {
    public static int binarySearch(int[] arr,int low,int high,int target) {
            int mid = (low + high) / 2;
            if(low>high){
                return -1;
            }
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return binarySearch(arr, mid+1, high, target);
            }
            else{
                return binarySearch(arr, low, mid-1, target);
            }
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,7,9,12,16,17};
        int target=9;
        int ind=binarySearch(arr,0,arr.length-1,target);
        System.out.println(ind);
    }
}
