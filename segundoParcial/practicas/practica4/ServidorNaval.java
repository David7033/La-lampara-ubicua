package segundoParcial.practicas.practica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

public class ServidorNaval {

	private static final int PORT = 9001;

    private static HashSet<String> nombres = new HashSet<String>();

    private static HashSet<PrintWriter> escritos = new HashSet<PrintWriter>();
    
    private static int id = 0;

    public static void main(String[] args) throws Exception {
    	
        System.out.println("Servidor activo");
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
                new Handler(listener.accept()).start();
                
            }
        } finally {
            listener.close();
        }
    }

    private static class Handler extends Thread {
        private String nombre;
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        
        public void run() {
            try {
            	id+=1;	
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                
                while (true) {
                	System.out.println(id);
                	if(id>2) {
                		out.println("Servidor Lleno");
                	}else {
                		out.println("SUBMITNAME");
                	}
                    nombre = in.readLine();
                    if (nombre == null) {
                        return;
                    }
                    synchronized (nombres) {
                        if (!nombres.contains(nombre)) {
                            nombres.add(nombre);
                            break;
                        }
                    }
                }

                
                out.println("nombre aceptado");
                escritos.add(out);

          
                while (true) {
                    String input = in.readLine();
                    if (input == null) {
                        return;
                    }
                    for (PrintWriter escrito : escritos) {
                        escrito.println("Mensaje " + nombre + ": " + input);
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                
                if (nombre != null) {
                    nombres.remove(nombre);
                }
                if (out != null) {
                    escritos.remove(out);
                }
                try {
                    socket.close();
                    id -=1;
                } catch (IOException e) {
                }
            }
        }
    }

}
