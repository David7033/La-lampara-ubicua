package primerParcial.ejercicios.ejercicio3;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.event.*;
import java.awt.Label;
import java.awt.BorderLayout;

public class VentanaCListener extends Frame implements ActionListener
{
    Boolean isClicked;
    
    private static final long serialVersionUID = 1L;
    
    String texto;
    Button btn_click;
    Button btn_clear;
    TextField txt_in;
    TextArea txt_result;
    Label lbl_msg;

    public VentanaCListener()
    {
        this.init();
        this.setSize(900,600);
        this.setVisible(true);
    }
    public void init()
    {
        btn_clear = new Button("Borrar");
        btn_click = new Button("Enviar");
        lbl_msg = new Label("Escribe un nuevo comentario");
        txt_in = new TextField("");
        txt_result = new TextArea();
        this.setLayout(new BorderLayout());
        this.add(btn_click, BorderLayout.WEST);
        this.add(btn_clear, BorderLayout.EAST);
        this.add(lbl_msg, BorderLayout.NORTH);
        this.add(txt_in, BorderLayout.SOUTH);
        this.add(txt_result, BorderLayout.CENTER);
        btn_click.addActionListener(this);
        btn_clear.addActionListener(this);
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
        if(args0.getSource() == btn_click)
        {
            if(txt_result.getSource() == "SUMAR")
            {

            }
            String texto = txt_in.getText();
            txt_result.append(texto + "\n");  
        }
        if(args0.getSource() == btn_clear)
        {
            txt_result.setText("");
        }
        isClicked = !isClicked;
    }
}