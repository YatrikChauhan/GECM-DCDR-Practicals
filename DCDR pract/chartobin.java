import java.util.*;
import java.io.*;
class chartobin
{
	public static void main(String args[]) throws IOException
	{
		int bin,i=0,n,j;
		int[] t = new int[50];
		System.out.println("Enter Character:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		byte b = (byte)System.in.read();
		int dec = (int)b;
		System.out.println(dec);
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
		System.out.println("Decimal value is:"+dec);
	}
}