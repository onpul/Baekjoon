import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int i = 1;
		do
		{
			int num = sc.nextInt();
			
			if (num < x)
			{
				System.out.print(num + " ");
			}
			
			i++;
		} while (i <= n);
	}
}