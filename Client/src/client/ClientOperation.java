package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import rmiinterface.RMIInterface;

public class ClientOperation {
    private static RMIInterface look_up;

    public static void main(String[] args)
            throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//85.187.158.121:1099/MyServer");
        String ruta = JOptionPane.showInputDialog("¿Que ruta mostrar?");

        //String response = look_up.helloTo(txt);
        ArrayList<String> response = look_up.obtenerArchivos(ruta);

        Iterator<String> Iterator = response.iterator();
        while(Iterator.hasNext()){
            String elemento = Iterator.next();
            System.out.println(elemento);
        }
        //System.out.println(response);
        //JOptionPane.showMessageDialog(null, response);

    }
}
