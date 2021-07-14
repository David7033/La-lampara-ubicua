package segundoParcial.practicas.practica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.InputStreamReader;
public class HiloServidor extends Thread
{
    BufferedReader entrada;
    PrintWriter salida;
    Socket socket = null;
    
    public HiloServidor (Socket s)
    {
        socket=s;
        try
        {
            salida = new PrintWriter(socket.getOutputStream(),true);
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public void run()
    {
        String cadena = "";
        while(!cadena.trim().equals("Log out")){
            System.out.println("Hablando con: "+socket.toString());
            try
            {
                cadena=entrada.readLine();
                if(cadena!= null)
                {
                    salida.println(cadena.trim().toUpperCase());
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("Desconectandose: "+socket.toString());
        try
        {
            salida.close();
            entrada.close();
            socket.close();
        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
