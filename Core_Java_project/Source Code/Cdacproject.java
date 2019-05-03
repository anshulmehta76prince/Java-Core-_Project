import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Cdacproject implements ActionListener {
	
	
	JFrame f;
	JLabel l1,l2,l3,l4;
	JButton b;
	
		public Cdacproject() {
			// TODO Auto-generated constructor stub
	     	f= new JFrame("My Project");
			 
		    l1 = new JLabel("Java Core Project");
			l1.setBounds(270,-350, 2000,1000);	
			l1.setFont(new Font("Tahoma", Font.ITALIC, 170));
			l1.setForeground(new Color(204, 51, 51));	
		/*	 
			l2 = new JLabel("(Prince)");
			l2.setBounds(1420,725,500,300);	
			l2.setFont(new Font("Tahoma", Font.ITALIC, 70));
			l2.setForeground(Color.BLACK);;	
		*/
			l3 = new JLabel("ANSHUL MEHTA");
			l3.setBounds(1300,500,600,600);	
			l3.setFont(new Font("Tahoma", Font.ITALIC, 70));
			l3.setForeground(Color.BLACK);;	
			
		    Image img=new ImageIcon(this.getClass().getResource("/core-java.png")).getImage();
    	
			l4 = new JLabel(" ");
			l4.setBounds(790,500, 272,196);	
			l4.setIcon(new ImageIcon(img));
            
			
			b=new JButton(" NEXT >> ");
			b.setForeground(Color.BLACK);
			b.setBounds(870, 340, 100, 50);
			f.add(b);
			f.getContentPane().setBackground(Color.white);
		  //f.add(l2);
			f.add(l1);
			f.add(l3);
			f.add(l4);
			f.setSize(5000,5000);
			f.setLayout(null);
			f.setVisible(true);
			b.addActionListener(this);
			
				
			
	
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	new Cdacproject();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 if(e.getSource()==b)
			    new Frame();
			    f.dispose();
			
			// TODO Auto-generated method stub
			
		}
	

}
