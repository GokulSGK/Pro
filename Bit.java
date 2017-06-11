import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     int n1=1,s1=0;
	     int a[]=new int[n];
	     for(int i=0;i<n;i++)
	       {
	         n1=n1*2;
	         a[i] = 0;
	       }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print("0");
	        }
	        System.out.print(",");
	        
	     for(int i=1;i<n1;i++)
	     {
	        int sum=i;
	        s1=0;
	        if(i == 3)
        	{
        		sum = 4;
        	}
        	if(i == 4)
        	{
        		continue;
        	}
	        while(sum!=0)
	        {
	        	
	            int r=sum%2;
	            a[s1]=r;
	            sum=sum/2;
	            s1++;
	            
	        }
	        for(s1=n-1;s1>=0;s1--)
	        {
	            System.out.print(a[s1]);
	           
	        }
	        if(a[n-1] ==1 && a[n-2] == 1 && a[n-3] == 0)
            {
            	System.out.print(",011");
            }
	       
	        
	         System.out.print(",");
	      
	     }

	}

}
