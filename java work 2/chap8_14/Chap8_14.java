package chap8_14;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;

public class Chap8_14 extends JFrame {
	private DrawPanel drawPanel;//下面有自定义的DrawPanel
	public Chap8_14() {
		drawPanel = new DrawPanel();
		JButton clearButton = new JButton("清空");
		clearButton.addActionListener(new ActionListener() {//清除事件
			public void actionPerformed(ActionEvent e) {
				drawPanel.clear();
			}
		});
		//显示画面布局管理
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER));
		south.add(clearButton);
		this.getContentPane().add(drawPanel, BorderLayout.CENTER);
		this.getContentPane().add(south, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
public static void main(String[] args) {
	new Chap8_14();
	}
}

class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
	private Point startPoint;
	private boolean pressed;
	private List<Line2D> lines;
	private Line2D tempLine;
	public DrawPanel() {
		this.pressed = false;
		this.lines = new LinkedList<Line2D>();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
	}
	
@Override
public void mousePressed(MouseEvent e) {
	startPoint = e.getPoint();
	pressed = true;
	}

//松手的时候，会画出一条直线
@Override
public void mouseReleased(MouseEvent e) {
	if (pressed) {
		Point endPoint = e.getPoint();
		Line2D line = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
		this.lines.add(line);
	}
	
	pressed = false;
	repaint();//重绘
}

//拖拽的时候会显示黑线
@Override
public void mouseDragged(MouseEvent e) {
if (pressed) {
repaint();
Point endPoint = e.getPoint();
tempLine = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
}
}

@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	for (Line2D line : lines) {
		g2.draw(line);
	}
	if (pressed) {
		g2.draw(tempLine);
	 }
	}

public void clear() {
	this.lines = new LinkedList<Line2D>();
	this.repaint();
}


@Override
public void mouseMoved(MouseEvent e) {
}
@Override
public void mouseEntered(MouseEvent e) {
}
@Override
public void mouseExited(MouseEvent e) {
}
@Override
public void mouseClicked(MouseEvent e) {
}

}