package segundoParcial.ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    ServerSocket server;
    BufferedReader in;
    PrintWriter out;
    public servidor() throws IOException
    {
        server = new ServerSocket(5000);
        Socket cc = server.accept();
        in = new BufferedReader(new InputStreamReader(cc.getInputStream()));
        out = new PrintWriter(cc.getOutputStream());
    }
    public void read()
    {
        String line = in.readLine();
        switch(line)
        {
            case "hola":
                out.println("Hola y no de mar");
                out.flush();
                break;
            case "adios":
                out.println("pues bye");
                out.flush();
                break;
            case "cual es mi calificaion?":
                out.println("0");
                out.flush();
                break;
        }
        in.close();
        out.close();
    }
}
