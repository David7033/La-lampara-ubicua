package primerParcial.ejercicios;
import java.awt.*;
import java.awt.event.*;

public class practica2 extends Frame implements MouseListener, MouseMotionListener, KeyListener
{
	private static final long serialVersionUID = 1L;

	private Game obj_pintable;
	
	public practica2() 
    {
		initComponent();
	}
	
	public void initComponent() {
		this.addWindowListener(new WindowAdapter() 
        {
			public void windowClosing(WindowEvent e) 
            {
				System.exit(0);
			}
		});
		obj_pintable = new Game();
		obj_pintable.addMouseListener(this);
        obj_pintable.addMouseMotionListener(this);
        obj_pintable.addKeyListener(this);
        this.addKeyListener(this);
        this.add(obj_pintable);
        
        this.setSize(500,500);
        this.setVisible(true);
	}
	
	
	public static void main(String[] args) 
    {	
		practica2 test = new practica2();
	}


	@Override
	public void keyTyped(KeyEvent e) 
    {
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
    {
			
	}


	@Override
	public void keyReleased(KeyEvent e) 
    {
			
	}


	@Override
	public void mouseDragged(MouseEvent e) 
    {
		if(!obj_pintable.isClicked())
        {
            obj_pintable.setX(e.getX());
            obj_pintable.setY(e.getY());
            obj_pintable.repaint();
        }
		
	}


	@Override
	public void mouseMoved(MouseEvent e) 
    {
		 
	}


	@Override
	public void mouseClicked(MouseEvent e) 
    {
		if(obj_pintable.isClicked())
        {
            obj_pintable.setW(e.getX());
            obj_pintable.setH(e.getY());
            obj_pintable.repaint();
        } else
        {
            obj_pintable.setX(e.getX());
            obj_pintable.setY(e.getY());
        }
        obj_pintable.setClicked();
		
	}


	@Override
	public void mousePressed(MouseEvent e) 
    {
		 	
	}


	@Override
	public void mouseReleased(MouseEvent e) 
    {
		 	
	}


	@Override
	public void mouseEntered(MouseEvent e) 
    {
		 
	}


	@Override
	public void mouseExited(MouseEvent e) 
    {
		 	
	}

}