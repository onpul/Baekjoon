import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int res = a * b * c;
		String strres = String.valueOf(res);
		
		int[] arr = new int[strres.length()];
		
		for (int i = 0; i < strres.length(); i++)
		{
			arr[i] = Integer.parseInt(strres.substring(i, i+1));
		}
		
		int num = 0;
		
		for (int i = 0; i <= 9; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[j] == i)
				{
					num++;
				}
			}
			System.out.println(num);
			num = 0;
		}
	}
}