import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel answer; 
    private JTextField degrees;
    
    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize("600,400");
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));

	JButton CtoF= new JButton ("CtoF");
	CtoF.addActionListener(this);
	CtoF.setActionCommand("Fahrenheit");
	
	JButton FtoC= new JButton ("FtoC");
	FtoC.addActionListener(this);
	FtoC.setActionCommand("Celcius");

	degrees= new JTextField(5);

	answer = new JLabel ();

	pane.add(answer );
	pane.add(degrees);
	pane.add(CtoF);
	pane.add(FtoC);
    }
}