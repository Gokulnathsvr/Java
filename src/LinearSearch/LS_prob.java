package LinearSearch;

public class LS_prob {
        public static void main(String[] args) {
            int arr[] = {5, 5, 7, 7, 8, 8, 9};
            int target = 8;
            int ans[] = search(arr, target);

            System.out.print("[");
           for(int num:ans){
               System.out.print(num+" ");

           }
            System.out.print("]");

        }

        public static int[] search(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (arr[i] == target && arr[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }


