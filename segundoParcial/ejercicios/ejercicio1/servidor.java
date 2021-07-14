package segundoParcial.ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;

public class Servidor
{
    ServerSocket server;
    BufferedReader in;
    PrintWriter out;
    
    public Servidor() throws IOException
    {
        server = new ServerSocket(5000);
        Socket cc = server.accept();
        in = new BufferedReader(new InputStreamReader(cc.getInputStream()));
        out = new PrintWriter(cc.getOutputStream());
    }
    public void read() throws IOException
    {
        String line = in.readLine();
        switch(line)
        {
            case "hola":
                System.out.println("Me esta saludando, rapido debo dicimular");
                out.println("Hola y no de mar");
                out.flush();
                break;
            case "adios":
                System.out.println("No me quiero ir Sr. Stark");
                out.println("pues bye");
                out.flush();
                break;
            case "cual es mi calificaion?":
                System.out.println("Nose, bueno si se pero no te va a gustar");
                out.println("0");
                out.flush();
                break;
        }
        in.close();
        out.close();
    }
    public static void main(String[] args) 
    {
        System.out.println("Iniciando servidor...");
        try
        {
            Servidor s = new Servidor();
            s.read(); 
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

