import java.net.*;

public class HostName {

  public static void main (String[] args) throws UnknownHostException {
    InetAddress ia = InetAddress.getByName("117.198.102.144");
    System.out.println(ia.getCanonicalHostName());
  }
}