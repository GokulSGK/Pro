import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int x=0;
	    int sum1=0,sum2=0;
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int abc[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	abc[i] = s.nextInt();
	    }
	    int[] first=new int[3];
	    int[] second=new int[abc.length/2];
	  for(int i=0;i<=abc.length/2;i++)
	  {
	    first[i]=abc[x];
	    sum1=sum1+first[i];
		x++;
	  }
	  System.out.println(sum1);
	    for(int j=0;j<abc.length/2;j++)
	  {
	    second[j]=abc[x];
	    sum2=sum2+second[j];
		x++;
	  }
	    System.out.println(sum2);
	    if(sum1==sum2)
	    {
	      for(int k=0;k<=abc.length/2;k++)
	      {
	        System.out.print(first[k]+" ");
	      }
		   System.out.print("\n");
	      for(int l=0;l<abc.length/2;l++)
	      {
	        System.out.print(second[l]+" ");

	}
	     System.out.print("\npossible");
	    }
		else
			System.out.println("not possible");
	}}


