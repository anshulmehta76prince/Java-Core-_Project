import  login_System.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;







import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame implements ActionListener{
	JFrame f;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4;
	
	 
	
	  public Frame() {
		// TODO Auto-generated constructor stub
	
		  
				  
			 f=new JFrame("Java Applications");
			
				Image  img1=new ImageIcon(this.getClass().getResource("/F1.png")).getImage();
				Image  img2=new ImageIcon(this.getClass().getResource("/F2.jpeg")).getImage();
				Image  img3=new ImageIcon(this.getClass().getResource("/F3.jpg")).getImage();
				Image  img4=new ImageIcon(this.getClass().getResource("/F4.jpg")).getImage();
				  
			     b1 = new JButton("Calculator");
	             b1.setIcon(new ImageIcon(img1));
                 b1.setBounds(100, 70, 300, 300);
			   	 b1.addActionListener(this);
              
            	 b2 = new JButton("Puzzle");
            	 b2.setIcon(new ImageIcon(img2));
            	 b2.setBounds(500, 70, 300, 300);
    			 b2.addActionListener(this);
			     
    	              
               	 b3 = new JButton("PicPuzzle");
               	 b3.setIcon(new ImageIcon(img3));
               	 b3.setBounds(100, 450, 300, 300);
    			 b3.addActionListener(this);
    			 
    		     
               	 b4 = new JButton("Login System");
               	 b4.setIcon(new ImageIcon(img4));
               	 b4.setBounds(500, 450, 300, 300);
    			 b4.addActionListener(this);
                 
    			 l1=new JLabel("Calculator");
    			 l1.setBounds(170, 120, 550, 550);
    		     l1.setFont((new Font("Tahoma", Font.ITALIC, 35)));
    		     l1.setForeground(Color.BLUE);

    			 l2=new JLabel("Picture Puzzle");
    			 l2.setBounds(540, 120, 550, 550);
    		     l2.setFont((new Font("Tahoma", Font.ITALIC, 35)));
    		     l2.setForeground(Color.BLUE);

    			 l3=new JLabel("Number Puzzle");
    			 l3.setBounds(140, 500, 550, 550);
    		     l3.setFont((new Font("Tahoma", Font.ITALIC, 35)));
    		     l3.setForeground(Color.BLUE);
    		     
    			 l4=new JLabel("Login System");
    			 l4.setBounds(540, 500, 550, 550);
    		     l4.setFont((new Font("Tahoma", Font.ITALIC, 35)));
    		     l4.setForeground(Color.BLUE);
    		     
               	f.add(b1);
		        f.add(b2);
		        f.add(b3); 
		        f.add(b4);
		        f.add(l1);
		        f.add(l2);
		        f.add(l3);
		        f.add(l4);
		        f.setSize(900,900);
   				f.getContentPane().setBackground(Color.yellow);
                f.setLayout(null);
   				f.setResizable(false);
		        f.setVisible(true);
		        
		  	  
			

  			
			
			}
			  
/*		 
public static void main(String[] args) {
	// TODO Auto-generated method stub

    new Frame();

}*/



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	 
	 if(e.getSource()==b1)
		   new Calculator();
	 if(e.getSource()==b2)
		       new PicPuzzle();
	 if(e.getSource()==b3)
		    new Puzzle();
	 if(e.getSource()==b4)
		    new Login();
	 
}
}
