package login_System;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Register implements ActionListener {
	
	JFrame f;
	JLabel lblheader,lblfirstname,lbllastname,lblDOB,lblgender,lbladdress,lblcontactno,lblemail;
	JTextField txtfirstname,txtlastname,txtDOB,txtaddress,txtcontactno,txtemail;
	JRadioButton btnmale,btnfemale;
	JButton btnsubmit,btnexit;
	ButtonGroup bg;
	
	
	public Register()
	{
		f=new JFrame("Registet User");
		
		 bg=new ButtonGroup();
		
		lblheader=new JLabel("USER REGISTRATION");
		lblfirstname=new JLabel("First Name:");
   	    lbllastname=new JLabel("Last Name:");
   	    lblgender=new JLabel("Gender:");
   	    lbladdress=new JLabel("Address:");
	    lblemail=new JLabel("Email:");
	    lblcontactno=new JLabel("Contact No:");
	    lblDOB =new JLabel("Date Of Birth:");
	    
	    btnsubmit=new JButton("Submit");
  	    btnexit=new JButton("Exit");

	    
	    btnmale=new JRadioButton("Male");
  	    btnfemale=new JRadioButton("Female"); 
	
	    txtfirstname=new JTextField();
  	    txtlastname=new JTextField();
  	    txtaddress=new JTextField();
  	    txtcontactno=new JTextField();
   	    txtemail=new JTextField(); 
  	    txtDOB=new JTextField();
  	    
  	  lblheader.setFont(new Font("Arial",Font.BOLD,18));
      lblfirstname.setFont(new Font("Arial",Font.BOLD,14));
      lbllastname.setFont(new Font("Arial",Font.BOLD,14));
      lbladdress.setFont(new Font("Arial",Font.BOLD,14));
      lblcontactno.setFont(new Font("Arial",Font.BOLD,14));
      lblemail.setFont(new Font("Arial",Font.BOLD,14));
      lblgender.setFont(new Font("Arial",Font.BOLD,14));
      lblDOB.setFont(new Font("Arial",Font.BOLD,14));
      
      txtfirstname.setFont(new Font("Arial",Font.BOLD,12));
      txtlastname.setFont(new Font("Arial",Font.BOLD,12));
      txtaddress.setFont(new Font("Arial",Font.BOLD,12));
      txtcontactno.setFont(new Font("Arial",Font.BOLD,12));
      txtemail.setFont(new Font("Arial",Font.BOLD,12));
      txtDOB.setFont(new Font("Arial",Font.BOLD,12));
      
      
	  
	  lblheader.setBounds(280,30,400,30);
      
	  lblfirstname.setBounds(80,80,150,30);
	  lbllastname.setBounds(80,120,150,30);
	  lbladdress.setBounds(80,160,100,30);
	  lblgender.setBounds(80,200,100,30);
	  
	  txtfirstname.setBounds(250,80,150,30);
	  txtlastname.setBounds(250,120,150,30);
	  txtaddress.setBounds(250, 160, 150, 30);
	  txtDOB.setBounds(250,240,180,30);
	  
	  txtcontactno.setBounds(250,280,150,30);
	  btnmale.setBounds(250,200,60,30);
	  btnfemale.setBounds(330,200,80,30);
	  
	  lblDOB.setBounds(80,240,150,30);
	  lblcontactno.setBounds(80,280,150,30);
	  lblemail.setBounds(80,320,150,30);
	  
	  txtemail.setBounds(250,320,150,30);
	  
	  btnsubmit.setBounds(200,400,80,25);
	  btnexit.setBounds(290,400,80,25);
	  
	  
	  bg.add(btnmale);
	  bg.add(btnfemale);
	  
	  f.add(lblheader);

      f.add(lblfirstname);
	  f.add(lbllastname);
	  f.add(lblgender);
	  f.add(lbladdress);
	  f.add(lblcontactno);
	  f.add(lblemail);
	  f.add(lblDOB);
	  f.add(txtfirstname);
	  f.add(txtlastname);
	  f.add(txtaddress);
	  f.add(lblDOB);
	  f.add(txtDOB);
	  f.add(txtcontactno);
	  f.add(txtemail);
      f.add(btnmale);
	  f.add(btnfemale);
	  f.add(btnsubmit);
	  f.add(btnexit);
	  
	  
	    btnsubmit.addActionListener(this);
	    btnexit.addActionListener(this);
	  
	  
	  
	    f.getContentPane().setBackground(Color.cyan);
	    f.setResizable(false);
		f.setSize(700,600);
		f.setLayout(null);
		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnexit)
		{
			f.dispose();
		}
	if(e.getSource()==btnsubmit)
			
		{

		    if(txtfirstname.getText().equals("")&&txtlastname.getText().equals("")&&txtaddress.getText().equals("")&&txtcontactno.getText().equals("")&&txtemail.getText().equals("")&&lblDOB.getText().equals(""))
            
            	{JOptionPane.showMessageDialog(null, "Enter Details first");}
            
            else if(txtfirstname.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter firstname");
			}
			else if(txtlastname.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter lastname");
			}
			else if(txtaddress.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter Address first");
			}
			else if(txtcontactno.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter Contact No.");
			}
			else if(txtemail.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter Email first");
			}
			else if(txtDOB.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter Date Of Birth first");
			}
		
			
			else{		    
			    
			     
			     String FirstName= txtfirstname.getText();
			     String LastName= txtlastname.getText();
			     String DOB=txtDOB.getText();
			     String MobileNo=txtcontactno.getText();
			     String Email=txtemail.getText();
			     String Address=txtaddress.getText();
			     String Gender="";
			     if(btnmale.isSelected()) 
			        Gender="Male";
			     else if(btnfemale.isSelected()) 
			        Gender="Female";
								
						   try{	
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
							Statement stmt=con.createStatement();
							String query="insert into login_details values('"+FirstName+"','"+LastName+"','"+Address+"','"+Gender+"','"+DOB+"','"+MobileNo+"','"+Email+"')";
				//			(FirstName,LastName,Address,Gender,DOB,MobileNo,Email)
						    int i=stmt.executeUpdate(query);
					
						    if(i>0)
						    {
						    	
						    JOptionPane.showMessageDialog(null, "Registered successfully");
						    new Login();
						    f.dispose();
						    
				              
			/*			    
			               Sfirstpage sf=new Sfirstpage(emailId, MobileNo);
						    this.hide();
						    sf.show();
				*/		   
						    }
						    
						    
						
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
					    }
							
			}
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //new Register();
	}*/

}
}