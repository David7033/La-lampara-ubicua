package ejercicios.ejercicio2;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;

public class VentanaCListener extends Frame implements ActionListener
{
    Button btn_click;
    Boolean isClicked;

    private static final long serialVersionUID = 1L;
    public VentanaCListener()
    {
        this.init();
        this.setSize(900,600);
        this.setVisible(true);
    }
    public void init()
    {
        btn_click = new Button("Puchale aqui");
        this.add(btn_click);
        btn_click.addActionListener(this);
        isClicked = false;

    }
    public static void main(String args[])
    {
        VentanaCListener windowsCListener = new VentanaCListener();
        windowsCListener.addWindowListener((WindowListener) new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent args0) 
    {
        if (isClicked)
        {
            
            btn_click.setLabel("Yamete kudasai!!");
        }
        else
        {
            btn_click.setLabel("Puchale aqui");
        }
        isClicked = !isClicked;        
    }
}