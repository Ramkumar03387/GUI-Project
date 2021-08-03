package com.GUI; 
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class GUIProject extends Component{

	public static void main(String[] args) {
		
        JFrame f = new JFrame("Login System");
        JFrame f1 = new JFrame("Sign in Page");
        
        ///////////////////////////////////////
        JButton b1 = new JButton("Sign Up");
        b1.setBounds(450, 20, 100, 30);
        f.add(b1);
        ////////////////////////////////////////////
        JButton b2 = new JButton("Login");
        b2.setBounds(230, 230, 100, 40);
        f.add(b2);
        ///////////////////////////////////////////
       
        ///////////////////////////////////////////
        JLabel l1 = new JLabel("User Name");
        l1.setBounds(200, 100, 200, 40);
        l1.setFont(new Font("Calibri", Font.BOLD, 20));
		f.add(l1);
		/////////////////////////////////////////
		JPasswordField value = new JPasswordField(); 
		JLabel l2 = new JLabel("Password");
        l2.setBounds(200, 160, 200, 40);
        l2.setFont(new Font("Calibri", Font.BOLD, 20));
        value.setToolTipText("Enter your Password");  
		value.setBounds(200, 190, 200, 30);
		f.add(l2);
		f.add(value);
		/////////////////////////////////////////////
		
		/////////////////////////////////////////////
		JTextField tf1 = new JTextField();
		tf1.setBounds(200, 130, 200, 30);
		f.add(tf1);
		////////////////////////////////////////////
		Color col[] = {Color.WHITE,Color.BLACK,Color.RED,Color.GREEN,Color.YELLOW,Color.PINK,Color.ORANGE,Color.BLUE};
		String col1[] = {"WHITE","BLACK","RED","GREEN","YELLOW","PINK","ORANGE","BLUE"};
		 JComboBox cb=new JComboBox(col1);  
		 cb.setBounds(40, 20, 100, 30);
		 
		 cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String c = ""+cb.getItemAt(cb.getSelectedIndex()); 
		 	 	 f.getContentPane().setBackground(Color.getColor(c, col[cb.getSelectedIndex()]));	
				 if(c.equals("BLACK"))
					 l1.setForeground(Color.RED);
					 l2.setForeground(Color.RED); 	 
			 	 if(!c.equals("BLACK"))
		 	 	 	 l1.setForeground(Color.BLACK);
			 	 if(!c.equals("BLACK"))
			 	     l2.setForeground(Color.BLACK);	 
			}
		});
		 f.add(cb);
		

		//////////////////button action////////////////////////////
		
		  b1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  
				  
				  ////////////////////////////////////////////
				  JLabel l1 = new JLabel("First Name");
			        l1.setBounds(200, 100, 200, 40);
			        l1.setFont(new Font("Calibri", Font.BOLD, 20));
					l1.setForeground(Color.BLACK);
					value.setBounds(600, 190, 200, 30);
					f1.add(l1);
					//////////////////////////////////////////
					JTextField tf1 = new JTextField();
					tf1.setBounds(200, 130, 200, 30);
					f1.add(tf1);
					//////////////////////////////////////////
				  JLabel l2 = new JLabel("Last Name");
			        l2.setBounds(200, 160, 200, 40);
			        l2.setFont(new Font("Calibri", Font.BOLD, 20));
					l2.setForeground(Color.BLACK);
					value.setBounds(200, 190, 200, 30);
					f1.add(l2);
					///////////////////////////////////////////
					JTextField tf2 = new JTextField();
					tf2.setBounds(200, 190, 200, 30);
					f1.add(tf2);
					/////////////////////////////////////////
				  JLabel l5 = new JLabel("User Name");
			        l5.setBounds(200, 220, 200, 40);
			        l5.setFont(new Font("Calibri", Font.BOLD, 20));
					f1.add(l5);
					/////////////////////////////////////////
					JTextField tf5 = new JTextField();
					tf5.setBounds(200, 250, 200, 30);
					f1.add(tf5);
					/////////////////////////////////////////
				  JLabel l3 = new JLabel("Password");
			        l3.setBounds(200, 280, 200, 40);
			        l3.setFont(new Font("Calibri", Font.BOLD, 20));
					l3.setForeground(Color.BLACK);
					value.setBounds(600, 190, 200, 30);
					f1.add(l3);
					//////////////////////////////////////////
					JTextField tf3 = new JTextField();
					tf3.setBounds(200, 310, 200, 30);
					f1.add(tf3);
					//////////////////////////////////////////
				  JLabel l4 = new JLabel("Re Enter Password");
			        l4.setBounds(200, 340, 200, 40);
			        l4.setFont(new Font("Calibri", Font.BOLD, 20));
					l4.setForeground(Color.BLACK);
					value.setBounds(200, 190, 200, 30);
					f1.add(l4);
					/////////////////////////////////////////
					JTextField tf4 = new JTextField();
					tf4.setBounds(200, 370, 200, 30);
					f1.add(tf4);
					/////////////////////////////////////////
				  JButton button = new JButton("Submit");
				    button.setBounds(240,400,100,50);
				    f1.add(button);
				    /////////////////////////////////////////
				  f.setResizable(false);
				  f1.setSize(600,600);
				  f1.setLayout(null);
				  f.setVisible(false);
				  f1.setVisible(true);
				  
			  }
		  });
		 ///////////////////////////////////////////
		f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        	
	}

}
