import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for (int i = 0; i < c; i++)
		{
			int n = sc.nextInt(); 
			
			int[] arr = new int[n];
			
			int avg = 0;
						
			int sum = 0;
			
			for (int j = 0; j < arr.length; j++)
			{
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			avg = sum / n;
			
			double num = 0.0;
			
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[j] > avg)
				{
					num += 1;
				}
			}
			System.out.printf("%.3f%%\n",(num/n)*100);
		}
	}
}