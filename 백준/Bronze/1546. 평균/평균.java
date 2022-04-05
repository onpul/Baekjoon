import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double[] arr = new double[num];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextDouble();
		}
		
		double max = 0.0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr[i] / max * 100;
		}
		
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		avg = sum / num;
		
		System.out.println(avg);
	}
}