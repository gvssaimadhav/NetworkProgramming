// Get's the IP Address Of A URL, when a website is passed.
import java.net.*;

public class VtopByName {

  public static void main (String[] args) {
    try {
      InetAddress address = InetAddress.getByName("www.google.com");
      System.out.println(address);
    } catch (UnknownHostException ex) {
      System.out.println("Could not find VTOP");
    }
  }
}