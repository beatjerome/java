package chap9_14;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Chap9_14 extends JFrame{
    	private DefaultTableModel tableModel;   //表格模型对象
    	private static JTable table;
    	private int x=5,y=5;

	    public Chap9_14()
	    {
	        super();
	        this.setTitle("表格");
	        this.setBounds(100,100,500,400);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        String[] columnNames = {"A","B"};   //列名
	        String [][]tableVales={{"0","0"},{"1","1"},{"2","2"},{"3","3"},{"4","4"}}; //数据
	        tableModel = new DefaultTableModel(tableVales,columnNames);
	        table = new JTable(tableModel);
	        this.add(new JScrollPane(table),BorderLayout.CENTER);//支持滚动
	        
	       
	        final JPanel panel = new JPanel();
	        this.add(panel,BorderLayout.SOUTH);
	        final JButton addButton = new JButton("添加");   //添加按钮
	        final JButton delButton = new JButton("删除");   //添加按钮
	        JTextField jt=new JTextField(20);
	        panel.add(addButton);
	        panel.add(delButton);
	        panel.add(jt);
	        addButton.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                String []rowValues = {String.valueOf(x++),String.valueOf(y++)};
	                tableModel.addRow(rowValues);  //添加一行
	                jt.setText("OK");
	               
	            }
	        });
	        
	        delButton.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                if(x>0){
	            	 tableModel.removeRow(--x); --y; //删除一行
	            	 jt.setText("OK");
	            	 }
	            	 else
	            	 {
	            		jt.setText("您输入的数字有误，请重新输入：");
	            	 }
	            }});
	    }
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Chap9_14 jTableDefaultTableModelTest = new Chap9_14();
	        jTableDefaultTableModelTest.setVisible(true);
	    }

	
}
