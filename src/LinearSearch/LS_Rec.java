package LinearSearch;

public class LS_Rec {

    public static int linserec(int[] arr, int i, int target) {
        if(i>arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return linserec(arr,i+1,target);
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 10, 15};
        int target = 4;
        int ind = linserec(arr, 0, target);
        System.out.println(ind);

    }
}
