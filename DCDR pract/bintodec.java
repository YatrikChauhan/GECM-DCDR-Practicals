import java.util.*;
import java.io.*;
public class bintodec
{
	public static void main(String args[]) throws IOException
	{
		int bin,dec=0,i,n,j=1;
		System.out.println("Enter binary Number:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		bin = Integer.parseInt(str);
		while(bin!=0)
		{
			n = bin%10;
			dec = dec + n*j;
			j=j*2;
			bin = bin/10;
		}
		System.out.println("Decimal value is:"+dec);
	}
}