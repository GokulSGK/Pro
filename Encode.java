import java.util.Scanner;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		char c[] = s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			int a=(int)s1.charAt(i)+10;
			System.out.print((char)a);
		}System.out.print(" ");
		for(int j=1;j<s2.length()-1;j++)
		{
			int b = (int)s2.charAt(j)+10;
			if(b>122)
			{
				b = 122 - b;
				if(b>0)
				{
					b = b + 96;
					
				}
				else
				{
					int temp = b * (-1);
					b = temp + 96;
				}
				c[j] = (char)b;
			}
			else
			{
				c[j] = (char)b;
			}
			
		}
		String s3 = new String(c);
		System.out.print(s3);

	}

}
