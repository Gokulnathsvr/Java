package LC_prob;

public class lc_35 {
        public static void main(String[] args) {
            int arr[]={1,3,5,6};
            int target=7;
            int res=linearIndex(arr,target,0);
            System.out.println(res);
        }
        public static int linearIndex(int arr[],int target,int i){
            if(i>arr.length-1){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>target){
                        return j;
                    }
                }
                return arr.length;
            }
            if(arr[i]==target){
                return i;
            }
            return linearIndex(arr,target,i+1);


        }

    }

