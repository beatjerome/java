package chap8_12;
import java.awt.event.*;
import java.awt.*;
public class Chap8_12 extends Frame{
	public paintThread pT;
	public int ypos=-80;
	
	public Chap8_12(){
		pT=new paintThread(this);
		this.setResizable(false);
		this.setSize(600,600);
		this.setVisible(true);
		pT.start();
	}
	/*
	public void paint(Graphics scr){
		scr.setColor(Color.RED);
		scr.fillOval(90, ypos, 80, 80);
	}*/
	
	private Image iBuffer=null;
	private Graphics gBuffer=null;
	public void paint(Graphics scr)
	{
		if(iBuffer==null)
		{
		iBuffer=createImage(this.getSize().width,this.getSize().height);	
		gBuffer=iBuffer.getGraphics();
		}
		gBuffer.setColor(getBackground());
		gBuffer.fillRect(0, 0, this.getSize().width, this.getSize().height);
		gBuffer.setColor(Color.RED);
		gBuffer.fillOval(90, ypos, 80, 80);
		scr.drawImage(iBuffer, 0, 0, this);
	}
    public void update(Graphics scr)
	{
		paint(scr);
	}
	
	public static void main(String[] args){
		Chap8_12 DB=new Chap8_12();
		DB.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}

class paintThread extends Thread{
	Chap8_12 DB;
	public paintThread(Chap8_12 DB)
	{
		this.DB=DB;
	}
	public void run()
	{
		while(true){
			try{
				sleep(30);
			}catch(InterruptedException e){}
			DB.ypos+=5;
			if(DB.ypos>600)
				DB.ypos=-80;
				DB.repaint();
		}
	}
}