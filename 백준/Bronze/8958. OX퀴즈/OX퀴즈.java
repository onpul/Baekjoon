import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.next();
		}
		
		String[] arr2;
		
		for (int i = 0; i < arr.length; i++)
		{
			arr2 = new String[arr[i].length()];
			
			int sum = 0;
			int point = 1;
			
			for (int j = 0; j < arr2.length; j++)
			{
				arr2[j] = arr[i].substring(j, j+1);

                if (arr2[j].equals("o") || arr2[j].equals("O"))
				{
					sum += point;
					point++;
				}
				else
					point = 1;
			}	
			
			System.out.println(sum);
		}
	}
}