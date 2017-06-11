import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int n= s1.length();
		char c[] = s1.toCharArray();
	    Arrays.sort(c);
	    char c1[] = new char[2];
	    c1[0] = c[0];
	    c1[1] = c[1];
	    String f = new String(c1);
	    int i = Integer.valueOf(f);
	    System.out.println(i);
	

	}

}
