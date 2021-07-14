package segundoParcial.ejercicios.ejercicio1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.InputStreamReader;
public class Cliente 
{
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    
    public Cliente() throws IOException{
        socket = new Socket("127.0.0.1", 5000);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());
    }

    public void write () throws IOException
    {
        out.println("hola");
        out.flush();
        String line = in.readLine();
        System.out.println(line);
        in.close();
        out.close();
    }
    public static void main(String args[])
    {
        try
        {
            Cliente c = new Cliente();
            c.write();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
