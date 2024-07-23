public class Main {
    
    public static int binarySearch(int[] array,int start,int end,int target) {
        
        if(end>=start) {
        
        int mid=start+(end-start)/2;
        
        
        if(array[mid]==target) {
            return mid;
        }
        
        if(array[mid]<target) {
            
            return binarySearch(array,mid+1,end,target);
            
        }else if(array[mid]>target) {
            
            return binarySearch(array,start,mid-1,target);
        }
        
    }
        
        
    return -1;
        
    }

    public static void main(String[] args) {
        
        int[] array= {3,4,5,6,7,8,9};
        
        int start=0;
        
        int end=array.length;
        
        int target=5;
        
        int index_of_target_element=binarySearch(array,start,end,target);
        
        System.out.println("Element 5 is present at:"+index_of_target_element);

    }

}

