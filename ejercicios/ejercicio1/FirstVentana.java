package ejercicios.ejercicio1;
import java.awt.*;
import java.awt.event.*;

public class FirstVentana extends Frame{
    private static final long serialVersionUID = 1L;
    public FirstVentana()
    {
        this.setSize(900,600);
        this.setVisible(true);
    }
    public static void main(String args[])
    {
        FirstVentana window = new FirstVentana();
        window.addWindowListener((WindowListener) new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}