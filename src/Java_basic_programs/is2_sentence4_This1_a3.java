import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int index=0;
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
		a[index]=Integer.parseInt(s[i].substring(s[i].length()-1));
		s[i]=s[i].substring(0,s[i].length()-1);
		index++;
		}
		for(int i=0;i<a.length;i++)
		{
		    for(int j=i+1;j<a.length;j++)
		    {
		        if(a[i]>a[j])
		        {
		            String temp=s[i];
		            s[i]=s[j];
		            s[j]=temp;
		            int tem=a[i];
		            a[i]=a[j];
		            a[j]=tem;
		        }
		    }
		}
		for(int i=0;i<s.length;i++)
		{
		    System.out.print(s[i]+" ");
		}

		

	}
}
 
