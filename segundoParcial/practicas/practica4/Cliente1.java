package segundoParcial.practicas.practica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.InputStreamReader;

public class Cliente1 
{
    public static void main(String[] args) throws IOException
    {
        String Host ="localhost";
        int Puerto = 5000;
        Socket Cliente = new Socket(Host,Puerto);

        PrintWriter salida = new PrintWriter(Cliente.getOutputStream(),true);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena, eco ="";
        System.out.println("Introduce cadena: ");
        cadena = in.readLine();
        while(!cadena.equals("Log out"))
        {
            salida.println(cadena);
            eco = entrada.readLine();
            System.out.println("Introduce cadena: ");
            cadena = in.readLine();
        }
        salida.close();
        entrada.close();
        System.out.println("Finalizando..");
        in.close();
        Cliente.close();
    }    
}
