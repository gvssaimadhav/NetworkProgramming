import java.util.*;
import java.net.*;
import java.net.UnknownHostException;
class Main {

   
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String str="https://www.google.co.in";
        URI u=new URI(str);
        URL url=new URL(str);
        String s="www.vitap.ac.in";
        InetAddress ip1= InetAddress.getByName(s);
        InetAddress ip2= InetAddress.getLocalHost();
		URLConnection uc=url.openConnection();
       
       
        System.out.println("Authority ="+u.getAuthority());
        System.out.println("Port ="+u.getPort());
        System.out.println("Host ="+u.getHost());
        System.out.println("Canonical Name ="+ip1.getCanonicalHostName());
        System.out.println("Content Type ="+url.getContent());
        
        System.out.println("Ip address of the machines ="+ip2);
		System.out.println("Hodification time:"+uc.getLastModified());
       
       
       
               
       
    }
   
}
