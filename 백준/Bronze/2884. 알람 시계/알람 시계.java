import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45)
		{
			if (h < 1) 
			{
				h = 24 - 1;
			    m = m + 60 - 45;
			}
			else
			{
				h = h - 1;
		        m = m + 60 - 45;
			}	
		}
		else
		{
			m = m - 45;
		}	
		
		System.out.printf("%d %d", h, m);
	}
}