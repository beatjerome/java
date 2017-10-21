package chap9_13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Chap9_13 extends JFrame implements MouseWheelListener{
	private JLabel label;
	private int x=20;
	
	public Chap9_13(){
		label=new JLabel("ÉÛ",JLabel.CENTER);
		label.setFont(new Font("ËÎÌå",Font.PLAIN,x));
		this.add(label);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		label.addMouseWheelListener(this); }
		      
		public void mouseWheelMoved(MouseWheelEvent e) { 
			// TODO Auto-generated method stub 
			x= x+e.getWheelRotation(); 
			label.setFont(new Font("ËÎÌå",Font.PLAIN,x));	
			this.repaint();  //Ë¢ÐÂÆÁÄ» 
	}
	public static void main(String[] args){
		new Chap9_13();
	}


}