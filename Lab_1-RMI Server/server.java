import java.rmi.*;  
 import java.rmi.server.*;  
 import java.rmi.registry.*;  
 public class server extends servimpl   
 {  
      public server() throws RemoteException  
      {  
      }  
      public static void main(String args[]) throws RemoteException  
      {  
           try  
           {  
                Registry reg = LocateRegistry.createRegistry(9999);  
                servimpl s = new servimpl();  
                reg.rebind("Server",s);  
                System.out.println("Server is ready!");  
           }  
           catch(Exception e)  
           {  
                System.out.println(e);  
           }  
      }  
 }