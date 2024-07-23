import java.util.Scanner;
public class productExcept
{
	public static int[] productExcept(int[] nums){
	    int n=nums.length;
	    int[] left=new int[n];
	    int[] right=new int[n];
	    int[] ans=new int[n];
	    left[0]=1;
	    for(int i=1;i<nums.length;i++){
	        left[i]=left[i-1]*nums[i-1];
	    }
	    right[n-1]=1;
	    for(int j=n-2;j>=0;j++){
	        right[j]=right[j+1]*nums[j+1];
	    }
	    for(int k=0;k<n;k++){
	        ans[k]=left[k]=right[k];
	    }
	    return ans;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int[] ans=productExcept(arr);
	    for(int num:arr){
	        System.out.print(num+" ");
	    }
	     System.out.println();;
	      System.out.println("Answer:");
	      for(int num:ans){
	           System.out.print(num+" ");
	      } 
	    }
		
	}



