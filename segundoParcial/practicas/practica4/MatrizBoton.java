package segundoParcial.practicas.practica4;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatrizBoton extends JFrame implements ActionListener {
	static int filas = 10;
    static int columnas = 20;
    Boolean status[];
    JRadioButton r1=new JRadioButton("Intento");    
	JRadioButton r2=new JRadioButton("Acierto");
    
    

	public MatrizBoton() {
		
		JToolBar barraHerramientas = new JToolBar();
		JToolBar ataque = new JToolBar();
		txtColumnas = new JTextField();
		txtFilas = new JTextField();
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		
		panel = new JPanel( null );

		//Para que el JFrame cierre la aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtFilas.setPreferredSize(new Dimension(340, 25));
		barraHerramientas.add(txtFilas);
		txtFilas.setText("M I  F L O T A");
		txtFilas.setHorizontalAlignment(JTextField.CENTER);
		
		txtColumnas.setPreferredSize(new Dimension(340, 25));
		barraHerramientas.add(txtColumnas);
		txtColumnas.setText("R I V A L");
		txtColumnas.setHorizontalAlignment(JTextField.CENTER);
		
		ataque.add(r1);
		ataque.add(r2);
				
		//Colocamos el JToolBar en la parte de arriba del JFrame
				this.add(barraHerramientas, BorderLayout.PAGE_START);
				this.add(ataque,BorderLayout.PAGE_END);

		//Se agrega el panel a boton
        this.add(panel, BorderLayout.CENTER);

		this.setSize(720, 380);
		//Permite que la ventana se coloque al centro de la pantalla
		this.setLocationRelativeTo(null);
		
		//Se crea una matriz de botones segun las filas y columnas entrantes
        Boton [][] botones = new Boton[ filas ][ columnas ];
        status = new Boolean[1];
        
        //Se recorren las filas
        for( int fila = 0 ; fila < filas; fila++ )
        {
            //Estando en la fila se recorrer las columnas
            for( int columna = 0 ; columna < columnas; columna++ )
            {
                //Se crea el boton y se agrega a las celda de la matriz
            	
                botones[fila][columna] = new Boton( 35 * columna, 30 * fila, 35, 30, status );
                             
                //Se agrega el boton al panel
                panel.add( botones[fila][columna] );
            }
        }
        
        //Se actualiza el panel para que se vean los botones
		panel.updateUI();

	}

	public static void main(String args[]) {
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
			ex.printStackTrace();
        }
		new MatrizBoton().setVisible(true);
		
		
        
    }

	public int getEstado(int est) {
		return est;
    }
	
	JButton btnCrear;
	static JPanel panel;
	JTextField txtColumnas;
	JTextField txtFilas;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==r1) {
			this.status[0]=false;
		}else {
			this.status[0]=true;
		}
		
	}
	
	
}