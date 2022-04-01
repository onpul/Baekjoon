import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int i = 1;
		
		StringTokenizer st;
		
		while (i <= num) 
		{
			st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String n = String.format("Case #%d: %d + %d = %d%n", i, a, b, a + b);
			
			bw.write(n);
			
			i++;
		}
        
		bw.flush();
		bw.close();
	}
}