package login_System;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login implements ActionListener{
JFrame f;
JLabel lblname,lblpassword,lbltitle;
JTextField txtname;
JPasswordField  txtpassword;
JButton btnlogin,btnsignup;


public Login()
{
	f=new JFrame("Login System");
	
	
	lbltitle=new JLabel("LOGIN HERE");
	lbltitle.setForeground(Color.black);
     	
	lblname=new JLabel("Enter Email:");
    lblpassword=new JLabel("Enter Password:");
    txtname=new JTextField();
    txtpassword=new JPasswordField();
    
    lbltitle.setFont(new Font("Arial",Font.BOLD,30));
    lblname.setFont(new Font("Arial",Font.BOLD,16));
    lblpassword.setFont(new Font("Arial",Font.BOLD,16));
    txtname.setFont(new Font("Arial",Font.BOLD,16));
    
    
    
    btnlogin=new JButton(" Login");
    btnsignup=new JButton("Signup");
    btnlogin.setForeground(Color.blue);
    btnsignup.setForeground(Color.blue);
  
    lbltitle.setBounds(270,100,200,100);
    lblname.setBounds(100,200,150,30);
    lblpassword.setBounds(100,260,150,30);
    txtname.setBounds(255,200,250,30);
    txtpassword.setBounds(255,260,250,30);
    btnlogin.setBounds(255,350,80,25);
    btnsignup.setBounds(370,350,80,25);

    
    btnlogin.addActionListener(this);
    btnsignup.addActionListener(this);
  
	f.add(lbltitle);
	f.add(lblname);
	f.add(lblpassword);
	f.add(txtname);
	f.add(txtpassword);
	f.add(btnlogin);
	f.add(btnsignup);
	
	f.getContentPane().setBackground(Color.cyan);
	f.setResizable(false);
	f.setSize(700,600);
	f.setLayout(null);
	f.setVisible(true);
}



/*
public static void main(String a[]){
	new Login();
}*/
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==btnsignup)
	{
	 new Register();
	 f.dispose();
	}	
	if(e.getSource()==btnlogin)
	{
		String Email =txtname.getText();
        String MobileNo=txtpassword.getText(); 			
		
		if(txtname.getText().equals("")&&txtpassword.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Enter details first");
		}
		else if(txtpassword.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Enter password first");
		}
	
		else if(txtname.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Enter name first");
		}
		else if(txtname.getText().equals(Email)&& txtpassword.getText().equals(MobileNo))
		{
			 Email=txtname.getText();
			MobileNo=txtpassword.getText();
			
			
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			    Connection	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
				Statement stmt=con.createStatement();
				String query ="select * from login_details where Email='"+Email+"' and MobileNo='"+MobileNo+"'";

				
			    ResultSet rs=stmt.executeQuery(query);
			    
				if(rs.next())
			    {
			    	new Bingoo();
			    	f.dispose();
			    }
				

				else
					JOptionPane.showMessageDialog(null,"Login details not matched");
			    
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
			
			
			
		}
}
}
}


