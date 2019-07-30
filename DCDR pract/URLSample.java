import java.net.*;
public class URLSample {
	public static void main(String args[])
	{
		try {
		URL a = new URL("https://www.google.co.in:443/search/yatrik.html");
		System.out.println("Protocol is:"+a.getProtocol());
		System.out.println("Host is:"+a.getHost());
		System.out.println("Port Number is:"+a.getPort());
		System.out.println("Path is:"+a.getPath());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}