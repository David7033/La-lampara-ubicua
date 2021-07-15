package segundoParcial.practicas.practica4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Boton extends JButton implements ActionListener {
	private Boolean []status;
    
    //-------- Constructor con parametros para posicionar a los botones ------//
    public Boton( int pos_x, int pos_y, int ancho, int alto, Boolean []s ){ 
        //Se coloca el boton en un lugar y se le da un tamanio
    	status = s;
    	
        setBounds(pos_x, pos_y, ancho, alto);
        
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        
    }
        
    //------------------ Al darle click realizara este metodo ----------------//
    public void actionPerformed( ActionEvent e ){
    	
    	
    	//Se asigna el color de fondo azul
    	if(status[0]) {
    		this.setBackground(Color.RED);
    	}else {
    		this.setBackground(Color.BLUE);
    		}
        
        
    }
    //------------------------------------------------------------------------//
}