package chap8_05;
import java.awt.*;
import java.applet.*;
public class Chap8_05 extends Applet{
	public void paint(Graphics g){
		int plane_x[]={100,130,200,230,260,225,100};
		int plane_y[]={50,30,30,10,10,50,50};
		int wing_x[]={145,175,175};
		int wing_y[]={40,80,40};
		g.drawPolygon(plane_x,plane_y,plane_x.length);
		g.setColor(Color.blue);
		g.fillPolygon(wing_x,wing_y,wing_x.length);
	}
	

}
