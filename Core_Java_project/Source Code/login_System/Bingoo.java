package login_System;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Bingoo {
	JFrame f;
	JLabel l1,l2,l3;
	
    public Bingoo()
    {
    	Image img1=new ImageIcon(this.getClass().getResource("/bingoo (1).jpg")).getImage();
    	Image img2=new ImageIcon(this.getClass().getResource("/bingoo (2).jpg")).getImage();
    	Image img3=new ImageIcon(this.getClass().getResource("/bingoo (3).png")).getImage();
    	
    	f=new JFrame("Bingoo");
    	l1 = new JLabel(" ");
		l1.setBounds(150,100, 494,122);	
		l1.setIcon(new ImageIcon(img1));
        
		l2 = new JLabel(" ");
		l2.setBounds(270,270, 215,163);	
		l2.setIcon(new ImageIcon(img3));
		
		l3 = new JLabel(" ");
		l3.setBounds(500,520, 255,198);	
		l3.setIcon(new ImageIcon(img2));
        
		
    	f.add(l1);
    	f.add(l2);
    	f.add(l3);

		f.getContentPane().setBackground(Color.cyan);
    	f.setSize(800,800);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
    }
/*	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Bingoo();
	} */

}
