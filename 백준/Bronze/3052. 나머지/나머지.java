import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i] % 42;
		}
		
		boolean bl;
		int num = 0;
		
		for (int i = 0; i < arr2.length; i++) 		
		{
			bl = false;
			
			for (int j = i + 1; j < arr2.length; j++) 	
			{
				if (arr2[i] == arr2[j])
				{
					bl = true;
					break;
				}
			}
			if (bl == false)
			{
				num++;
			}
		}
		
		System.out.println(num);
	}
}