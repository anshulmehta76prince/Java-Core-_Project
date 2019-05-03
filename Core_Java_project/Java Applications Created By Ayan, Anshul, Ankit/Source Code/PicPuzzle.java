
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;  

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class PicPuzzle extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample1,sample2;
	JLabel lb1,lb2,sample;
	
        
	    Image  img1=new ImageIcon(this.getClass().getResource("/1.png")).getImage();
	
        Image img2=new ImageIcon(this.getClass().getResource("/2.png")).getImage();

		Image img3=new ImageIcon(this.getClass().getResource("/3.png")).getImage();

		Image img4=new ImageIcon(this.getClass().getResource("/4.png")).getImage();

		Image img5=new ImageIcon(this.getClass().getResource("/5.png")).getImage();

		Image img6=new ImageIcon(this.getClass().getResource("/6.png")).getImage();

		Image img7=new ImageIcon(this.getClass().getResource("/7.png")).getImage();

		Image img8=new ImageIcon(this.getClass().getResource("/8.png")).getImage(); 
		
		Image img9=new ImageIcon(this.getClass().getResource("/9.png")).getImage(); 
		
		Image img11=new ImageIcon(this.getClass().getResource("/Loin.jpg")).getImage(); 
		
		
		
		Image img22=new ImageIcon(this.getClass().getResource("/Prince.jpeg")).getImage(); 
		
				
		
		Image  img10=new ImageIcon(this.getClass().getResource("/11.png")).getImage();
			
	    Image img20=new ImageIcon(this.getClass().getResource("/22.png")).getImage();

	    Image img30=new ImageIcon(this.getClass().getResource("/33.png")).getImage();

    	Image img40=new ImageIcon(this.getClass().getResource("/44.png")).getImage();

	    Image img50=new ImageIcon(this.getClass().getResource("/55.png")).getImage();

	    Image img60=new ImageIcon(this.getClass().getResource("/66.png")).getImage();

		Image img70=new ImageIcon(this.getClass().getResource("/77.png")).getImage();

		Image img80=new ImageIcon(this.getClass().getResource("/88.png")).getImage(); 
			
		Image img90=new ImageIcon(this.getClass().getResource("/99.png")).getImage(); 
		
		
		Icon star;
	   
		PicPuzzle(){
			
		
		b1=new JButton();
		b1.setIcon(new ImageIcon(img10));
	    b1.setBounds(70,150,255,255);
		
	    b2=new JButton();
    	b2.setIcon(new ImageIcon(img50));
    	b2.setBounds(325,150,255,255);
		
    	b3=new JButton();
		b3.setIcon(new ImageIcon(img20));
	    b3.setBounds(580,150,255,255);

		b4=new JButton();
		b4.setIcon(new ImageIcon(img70));
		b4.setBounds(70,405,255,255);
		
		b5=new JButton();
		b5.setIcon(new ImageIcon(img40));
		b5.setBounds(325,405,255,255);
		
		b6=new JButton();
		b6.setIcon(new ImageIcon(img60));
		b6.setBounds(580,405,255,255);

		b7=new JButton();
		b7.setIcon(new ImageIcon(img80));
		b7.setBounds(70,660,255,255);
		
		b8=new JButton();
		b8.setIcon(new ImageIcon(img90));
		b8.setBounds(325,660,255,255);
		
		b9=new JButton();
		b9.setIcon(new ImageIcon(img30));
        b9.setBounds(580,660,255,255);
        
        sample=new JLabel();
    	sample.setIcon(new ImageIcon(img22));
        sample.setBounds(1085, 135,602,600 );
	
        sample1=new JButton("Prince");
		sample1.setBounds(1235,820,100,100);
        
		sample2=new JButton("Loin");
		sample2.setBounds(1435,820,100,100);
       
        lb1=new JLabel("Sample");
        lb1.setBounds(1255, -190, 500, 500);
        lb1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lb1.setForeground(Color.BLUE);
		
        lb2=new JLabel(" 'Click To Change' ");
        lb2.setBounds(1235, 700, 550, 550);
        lb2.setFont((new Font("Tahoma", Font.BOLD, 35)));
        lb2.setForeground(Color.BLACK);
		
    	b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		sample1.addActionListener(this);
		sample2.addActionListener(this);
		
		star=b9.getIcon();
	
		add(lb1);
    	add(lb2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(sample);
		add(sample1);
		add(sample2);
	    
		setSize(5000,5000);
		setTitle("Picture Puzzle");
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
		setResizable(false); 
	}
	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource()==sample1){  
			sample.setIcon(new ImageIcon(img22));
				  
			b1.setIcon(new ImageIcon(img10));  
			b2.setIcon(new ImageIcon(img50));  
			b3.setIcon(new ImageIcon(img20));  
			b4.setIcon(new ImageIcon(img70));  
			b5.setIcon(new ImageIcon(img40));  
			b6.setIcon(new ImageIcon(img60));  
			b7.setIcon(new ImageIcon(img80));  
			b8.setIcon(new ImageIcon(img90));  
			b9.setIcon(new ImageIcon(img30));  
			star=b9.getIcon();   }
			
		if(e.getSource()==sample2){  
			sample.setIcon(new ImageIcon(img11));
			b1.setIcon(new ImageIcon(img1));  
			b2.setIcon(new ImageIcon(img5));  
			b3.setIcon(new ImageIcon(img2));  
			b4.setIcon(new ImageIcon(img7));  
			b5.setIcon(new ImageIcon(img4));  
			b6.setIcon(new ImageIcon(img6));  
			b7.setIcon(new ImageIcon(img8));  
			b8.setIcon(new ImageIcon(img9));  
			b9.setIcon(new ImageIcon(img3));  
			star=b9.getIcon();   
	        } 
		
		
		
		if(e.getSource()==b1){  
		    Icon s1=b1.getIcon();
		      if(b2.getIcon()==star){  
		        b2.setIcon(s1);
	            b1.setIcon(star);  
		      } else if(b4.getIcon()==star){  
		                    b4.setIcon(s1);  
		                    b1.setIcon(star);  
		                   }  
		  }//end of b1
		if(e.getSource()==b2){  
		    Icon s2=b2.getIcon();  
		      if(b1.getIcon()==star){  
		        b1.setIcon(s2);  
		        b2.setIcon(star);  
		      } else if(b5.getIcon()==star){  
		                    b5.setIcon(s2);  
		                    b2.setIcon(star);  
		                   }  
		         else if(b3.getIcon()==star){  
		                    b3.setIcon(s2);  
		                    b2.setIcon(star);  
		                   }  
		  }//end of if  
		  
		if(e.getSource()==b3){  
		    Icon s3=b3.getIcon();  
		      if(b2.getIcon()==star){  
		        b2.setIcon(s3);  
		        b3.setIcon(star);  
		      } else if(b6.getIcon()==star){  
		                    b6.setIcon(s3);  
		                    b3.setIcon(star);  
		                   }  
		  }//end of if  
		  
		if(e.getSource()==b4){  
		    Icon s4=b4.getIcon();  
		      if(b1.getIcon()==star){  
		        b1.setIcon(s4);  
		        b4.setIcon(star);  
		      } else if(b5.getIcon()==star){  
		                    b5.setIcon(s4);  
		                    b4.setIcon(star);  
		                   }  
		         else if(b7.getIcon()==star){  
		                    b7.setIcon(s4);  
		                    b4.setIcon(star);  
		                   }  
		  }//end of if  
		  
		if(e.getSource()==b5){  
		    Icon s5=b5.getIcon();  
		      if(b2.getIcon()==star){  
		        b2.setIcon(s5);  
		        b5.setIcon(star);  
		      } else if(b4.getIcon()==star){  
		                    b4.setIcon(s5);  
		                    b5.setIcon(star);  
		                   }  
		         else if(b6.getIcon()==star){  
		                    b6.setIcon(s5);  
		                    b5.setIcon(star);  
		                   }  
		          else if(b8.getIcon()==star){  
		                    b8.setIcon(s5);  
		                    b5.setIcon(star);  
		                   }  
		  }//end of if  
		  
		if(e.getSource()==b6){  
		    Icon s6=b6.getIcon();  
		      if(b3.getIcon()==star){  
		        b3.setIcon(s6);  
		        b6.setIcon(star);  
		      } else if(b5.getIcon()==star){  
		                    b5.setIcon(s6);  
		                    b6.setIcon(star);  
		                   }  
		         else if(b9.getIcon()==star){  
		                    b9.setIcon(s6);  
		                    b6.setIcon(star);  
		                   }  
		}//end of if  
		  
		if(e.getSource()==b7){  
		    Icon s7=b7.getIcon();  
		      if(b4.getIcon()==star){  
		        b4.setIcon(s7);  
		        b7.setIcon(star);  
		      } else if(b8.getIcon()==star){  
		                    b8.setIcon(s7);  
		                    b7.setIcon(star);  
		                   }  
		 }//end of if  
		  
		   if(e.getSource()==b8){  
		    Icon s8=b8.getIcon();  
		      if(b7.getIcon()==star){  
		        b7.setIcon(s8);  
		        b8.setIcon(star);  
		      } else if(b5.getIcon()==star){  
		                    b5.setIcon(s8);  
		                    b8.setIcon(star);  
		                   }  
		         else if(b9.getIcon()==star){  
		                    b9.setIcon(s8);  
		                    b8.setIcon(star);  
		                   }  
		  
		  }//end of if  
		  
		 if(e.getSource()==b9){  
		    Icon s9=b9.getIcon();  
		      if(b8.getIcon()==star){  
		        b8.setIcon(s9);  
		        b9.setIcon(star);  
		      } else if(b6.getIcon()==star){  
		                    b6.setIcon(s9);  
		                    b9.setIcon(star);  
		                   }  
		  }
		/*	
			if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText().equals("8")&&b9.getText().equals("")){
				JOptionPane.showMessageDialog(this,"Congratulations, You won!");
	*/
	
		}
	 
/*		  
	
public static void main(String[] args) {
	new PicPuzzle();
}*/
}
