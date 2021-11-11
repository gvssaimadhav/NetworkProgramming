// Get's the Hostname of a IP Address, when an IP is passed
import java.net.*;
public class VtopByIP {
  public static void main (String[] args) {
    try {
      InetAddress address = InetAddress.getByName("117.198.102.144");
      System.out.println(address.getHostName());
    } catch (UnknownHostException ex) {
      System.out.println("Could not find ");
    }
  }
}