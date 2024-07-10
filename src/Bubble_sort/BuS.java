package Bubble_sort;

public class BuS {
        public static int[] bubble_sort(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int arr[] = {20, 10, 30, 15, 30};
            int[] res = bubble_sort(arr);
            for (int num : res) {
                System.out.print(num + " ");
            }
        }
    }



