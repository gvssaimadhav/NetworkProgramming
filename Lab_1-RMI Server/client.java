import java.rmi.*;  
import java.rmi.server.*;  
import java.rmi.registry.*;  
public class client   
 {  
      public static void main(String args[])throws RemoteException  
      {  
           try  
           {  
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);  
                Registry reg=LocateRegistry.getRegistry("127.0.0.1",9999);  
                servinterface i = (servinterface)reg.lookup("Server");  
                System.out.println("First number: "+a);
                System.out.println("Second number: "+b); 
                System.out.println("Add:\t"+i.add(a,b));  
                System.out.println("Sub:\t"+i.sub(a,b));  
                System.out.println("Mul:\t"+i.mul(a,b));  
                System.out.println("Div:\t"+i.div(a,b));  
                System.out.println("Mod:\t"+i.mod(a,b));  
           }  
           catch(Exception e)  
           {  
                System.out.println(e);  
           }  
      }
}