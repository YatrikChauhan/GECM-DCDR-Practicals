import java.io.*;
class Ascii
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter Character:");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		byte b = (byte)System.in.read();
		System.out.println(b);
	}
}