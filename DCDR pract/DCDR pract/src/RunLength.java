import java.util.*;
import java.io.*;
public class RunLength {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the String:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		int count=1;
		char ch = 0;
		String newstr =" ";
		for(int i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
			{
				count = count+1;
			}
			else
			{
				newstr = newstr + ch;
				if(count!=1)
				{
					newstr = newstr + count;
				}
				ch = str.charAt(i);
				count = 1;
			}
			
		}
		newstr = newstr + ch;
		if(count!=1)
			newstr = newstr + count;
		System.out.println(newstr);
	}
}
