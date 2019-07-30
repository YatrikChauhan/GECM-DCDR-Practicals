import java.util.*;
import java.io.*;
class dectohex
{
	public static void main(String args[]) throws IOException
	{
		int dec,rem,q,i,j=0;
		char[] hex = new char[100];
		System.out.println("Enter Decimal Number:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		dec = Integer.parseInt(str);
		while(dec!=0)
		{
			rem = dec%16;
			if(rem<10)
			{
				hex[j++] = (char)(48+rem);
			}
			else
			{
				hex[j++] = (char)(55+rem);
			}
			dec=dec/16;
		}
		for(i=j;i>=0;i--)
		{
			System.out.print(hex[i]);
		}
	}
}