import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String strn = String.valueOf(n);
		int sum = 0;
		int i = 0;
		int temp = 0;
		
		while (n >= 0 && n <= 99)
		{
			if (i == 0)
			{
				temp = n;
			}
			
			if (n < 10)
			{
				strn = ("0" + strn);
				
				sum = n;
			}
			
			if (i > 0 && n == temp) 
			{
				break;
			}
			
			sum = Integer.parseInt(strn.substring(0, 1)) + Integer.parseInt(strn.substring(strn.length()-1, strn.length()));
			
			String nright = strn.substring(strn.length()-1, strn.length());
			
			String strs = String.valueOf(sum);
			String sright = strs.substring(strs.length()-1, strs.length());
			
			n = Integer.parseInt(nright + sright);
			strn = String.valueOf(n);
			
			i++;
		}
		
		System.out.println(i);
	}
}