import java.util.*;
import java.io.*;
class ABC
{
	public static void main(String args[])
	{
		int dec;
		char c;
		System.out.println("Enter Character:");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		dec = (int)c;
		System.out.println(dec);
	}
}