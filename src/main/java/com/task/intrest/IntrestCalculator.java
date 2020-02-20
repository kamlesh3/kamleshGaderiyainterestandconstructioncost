package com.task.intrest;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.Math.*;
public class IntrestCalculator {
	public static void main(String[] args) {
		Intrest i=new Intrest();

	}

}
class Intrest implements ActionListener
{
JFrame frame;
JPanel panel;
JLabel principleamount,time,rateofintrest,result;
JTextField textFieldforp,textFieldfort,textFieldforrate,textFieldforresult;
JButton buttonsimpleintrest,buttoncompoundintrest;
Intrest()
{
frame=new JFrame("INTREST CALCULATOR");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,500);
frame.setLayout(new GridLayout());
frame.getContentPane().setBackground(Color.GREEN);
panel=new JPanel();
panel.setBackground(Color.GREEN);
principleamount=new JLabel("PRINCIPLE AMOUNT(p)");
principleamount.setSize(50,50);
panel.add(principleamount);
textFieldforp=new JTextField(10);
panel.add(textFieldforp);
time=new JLabel("TIME PERIOD(T)");
time.setSize(50,50);
panel.add(time);
textFieldfort=new JTextField(10);
panel.add(textFieldfort);
rateofintrest=new JLabel("RATE OF INTREST(R)");
rateofintrest.setSize(50,50);
panel.add(rateofintrest);
textFieldforrate=new JTextField(10);
panel.add(textFieldforrate);
result=new JLabel("INTREST RECEIVED");
result.setSize(50,50);
panel.add(result);
textFieldforresult=new JTextField(10);
panel.add(textFieldforresult);
buttonsimpleintrest=new JButton("SIMPLE INTREST");
buttonsimpleintrest.addActionListener(this);
buttoncompoundintrest=new JButton("COMPOUND INTREST");
buttoncompoundintrest.addActionListener(this);
panel.add(buttonsimpleintrest);
panel.add(buttoncompoundintrest);
frame.add(panel);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==buttonsimpleintrest)
{
float p=Float.parseFloat(textFieldforp.getText());
float t=Float.parseFloat(textFieldfort.getText());
float r=Float.parseFloat(textFieldforrate.getText());
float answer=((p*t*r)/100);
textFieldforresult.setText(String.valueOf(answer));
}
if(ae.getSource()==buttoncompoundintrest)
{
double p=Double.parseDouble(textFieldforp.getText());
double t=Double.parseDouble(textFieldfort.getText());
double r=Double.parseDouble(textFieldforrate.getText());
double answer=(p * (Math.pow((1 +(r/100)),t))); 
textFieldforresult.setText(String.valueOf(answer));
}
}
}