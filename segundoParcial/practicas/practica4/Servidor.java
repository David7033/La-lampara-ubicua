package segundoParcial.practicas.practica4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor 
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket servidor;
        servidor = new ServerSocket (5000);
        System.out.println("Iniciando servidor...");
        while(true)
        {
            Socket cliente = new Socket();
            cliente = servidor.accept();
            HiloServidor hilo = new HiloServidor(cliente);
            hilo.start();
            System.out.println("Enlazado");
        }
    }
}
