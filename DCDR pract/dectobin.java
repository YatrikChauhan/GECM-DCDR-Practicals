import java.util.*;
import java.io.*;
class dectobin
{
	public static void main(String args[]) throws IOException
	{
		int bin,dec,i=0,n,j;
		int[] t = new int[50];
		System.out.println("Enter Decimal Number:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		dec = Integer.parseInt(str);
		while(dec!=0)
		{
			n=dec%2;
			t[i]=n;
			i++;
			dec = dec/2;
		}
		for(j=i-1;j>=0;j--)
		{
			System.out.print(t[j]);
		}
	}
}