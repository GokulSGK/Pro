import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		  int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < n){
	            if(isPrimeNumber(number)){
	                System.out.println(number);
	                count++;
	                int temp = number;
	                while(temp>0)
	                {
	                	int t = temp%10;
	                	sum += t;
	                	temp = temp/10;
	                }
	            }
	            if(sum == 100)
	            {
	            	break;
	            }
	            
	            number++;
	        }
	        System.out.println(" ");
	    }
	     
	    private static boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }

	}


