package segundoParcial.practicas.practica4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClienteNaval {

	BufferedReader in;
	PrintWriter out;
	JFrame frame = new JFrame("Batalla Naval");
	JTextField textField = new JTextField(40);
	JTextArea mensaje = new JTextArea(8,40);
	
	public ClienteNaval() {
		
		textField.setEditable(false);
		mensaje.setEditable(false);
		frame.getContentPane().add(textField, "North");
		frame.getContentPane().add(new JScrollPane(mensaje), "Center");
		frame.pack();
		
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				out.println(textField.getText());
				textField.setText("");
				
			}
		});
	}
	
	private String getServerAddress() {
		
		return JOptionPane.showInputDialog(frame,"Cual es la direccion del Servidor","Servidor",JOptionPane.QUESTION_MESSAGE);
	}
	
	private String getName() {
		
		return JOptionPane.showInputDialog(frame, "Cual es tu nombre","Usuario",JOptionPane.PLAIN_MESSAGE);
	}
	
	private void run() throws IOException{
		
		String direccion = getServerAddress();
		Socket socket = new Socket(direccion,9001);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(),true);
		
		while (true) {
			String line = in.readLine();
			if(line.startsWith("SUBMITNAME")) {
				out.println(getName());
			}else if(line.startsWith("nombre aceptado")) {
				textField.setEditable(true);
			}else if(line.startsWith("Mensaje")) {
				mensaje.append(line.substring(8)+"\n");
			}else if(line.startsWith("Servidor Lleno")) {
				mensaje.append(line);
			}
		}
		
	}
	

	public static void main(String[] args) throws Exception {


		ClienteNaval cliente = new ClienteNaval();
		cliente.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cliente.frame.setVisible(true);
		cliente.run();
		
	}

}
