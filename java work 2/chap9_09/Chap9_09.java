package chap9_09;
import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.GridLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.JTextField;  
  

public class Chap9_09 extends JFrame {  
    private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",  
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };  
    private final String[] COMMAND = { "Backspace", "CE", "C" };  
   
    private JButton keys[] = new JButton[KEYS.length];  
    private JButton commands[] = new JButton[COMMAND.length];  
    private JTextField resultText = new JTextField("0");  
  
    public Chap9_09() {  
        super();  
        init();  
        this.setBackground(Color.LIGHT_GRAY);  
        this.setTitle("¼ÆËãÆ÷");  
        this.setLocation(500, 300);  
        this.setResizable(false);  
        this.pack();  
    }  
  
    private void init() {  
        resultText.setHorizontalAlignment(JTextField.LEFT);  
        resultText.setEditable(false);  
        resultText.setBackground(Color.white);  
  
        JPanel calckeysPanel = new JPanel();  
        calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i] = new JButton(KEYS[i]);  
            calckeysPanel.add(keys[i]);  
            keys[i].setForeground(Color.blue);  
        }  
        keys[3].setForeground(Color.red);  
        keys[8].setForeground(Color.red);  
        keys[13].setForeground(Color.red);  
        keys[18].setForeground(Color.red);  
        keys[19].setForeground(Color.red);  
  
        JPanel commandsPanel = new JPanel();  
        commandsPanel.setLayout(new GridLayout(1, 3, 3, 3));  
        for (int i = 0; i < COMMAND.length; i++) {  
            commands[i] = new JButton(COMMAND[i]);  
            commandsPanel.add(commands[i]);  
            commands[i].setForeground(Color.red);  
        }  
  
  
        JPanel panel1 = new JPanel();  
        panel1.setLayout(new BorderLayout(3, 3));  
        panel1.add("North", commandsPanel);  
        panel1.add("West", calckeysPanel);  
  
        JPanel top = new JPanel();  
        top.setLayout(new BorderLayout());  
        top.add("Center", resultText);  
  
        this.setLayout(new BorderLayout(3, 5));  
        this.add("North", top);  
        this.add("Center", panel1);  
    }
  
    public static void main(String args[]) {  
        Chap9_09 calculator1 = new Chap9_09();  
        calculator1.setVisible(true);  
        calculator1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}  