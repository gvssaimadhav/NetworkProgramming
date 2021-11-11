import java.rmi.*;
import java.rmi.server.*;
public class servimpl extends UnicastRemoteObject implements servinterface   
  {   
    public servimpl() throws RemoteException   
    {   
       super();   
    }   
    public double add(double a,double b)   
    {   
       return(a+b);   
    }   
    public double sub(double a,double b)   
    {   
       return(a-b);   
    }   
    public double mul(double a,double b)   
    {   
       return(a*b);   
    }   
    public double div(double a,double b)   
    {   
       return(a/b);   
    }   
 
    public double mod(double a,double b)   
    {   
       return(a%b);   
    }   
  } 