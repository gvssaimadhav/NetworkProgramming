// Java program to show the
// use of the function getAuthority()

import java.net.*;

class Authority {
	public static void main(String args[])
	{

		// url object
		URL url = null;

		try {
			// create a URL
			url	= new URL("https://www.google.com");
			// get the Authority
			String authority= url.getAuthority();
			// display the URL
			System.out.println("URL = "+ url);
			// display the Authority
			System.out.println("Authority = "+ authority);
		}
		// if any error occurs
		catch (Exception e) {
			// display the error
			System.out.println(e);
		}
	}
}
