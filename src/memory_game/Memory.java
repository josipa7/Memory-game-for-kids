package memory_game;




import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Memory extends JFrame  {
	public JFrame frame=new JFrame("Memory");
	public JPanel panel=new JPanel(new GridLayout(2,2,70,70));
	public JButton l1=new JButton();
	public JButton l2=new JButton();
	public JButton l3=new JButton();
	public JButton l4=new JButton();
	public JButton l5=new JButton();
	public JButton l6=new JButton();
	public JButton l7=new JButton();
	public JButton l8=new JButton();
	public static Map<Integer,String> m;
	public static BufferedImage myPicture;
	public static BufferedImage myPicture2;
	public static BufferedImage myPicture3;
	public static BufferedImage myPicture4;
	public static BufferedImage myPicture5;
	public static BufferedImage myPicture6;
	public static BufferedImage myPicture7;
	public static BufferedImage myPicture8;
	public static BufferedImage memoryPicture;
	
	private static final int TIME_VISIBLE = 4000;
	
	public int num=0;
	public String prosla="";	
	public String trenutna="";
	public Timer time;
	public String text1="",text2="",text3="",text4="",text5="",text6="",text7="",text8="";
	
	
	public String checkl1(String trenutn) {
		
		System.out.println("text1"+text1);
		System.out.println("text2"+text2);
		System.out.println("text3"+text3);
		System.out.println("text4"+text4);
		System.out.println("text5"+text5);
		System.out.println("text6"+text6);
		System.out.println("text7"+text7);
		System.out.println("text8"+text8);
		System.out.println("PROSLA"+prosla);
		System.out.println("TRENUTNA"+trenutn);
		
		
		
		if(!prosla.equals("")&&!trenutn.equals("")&&!text1.equals("") && text3.equals("")&& text2.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") && text8.equals("") ) {
	
					
			prosla="";
		
				
	      }
		if(!text2.equals("") || !text5.equals("") || !text3.equals("") || !text4.equals("") || !text6.equals("")|| !text7.equals("") || !text8.equals("")) { 
		  if(prosla.equals(trenutn) || (prosla.equals(""))) {
		
			if(text2.equals(trenutn)) {
				l1.setEnabled(false);	
				l2.setEnabled(false);
				text2="";
				prosla="";	
				text1="";
			}
			else if(text3.equals(trenutn)) {
				l1.setEnabled(false);	
				l3.setEnabled(false);
				text3="";
				prosla="";	
				text1="";
			}
			else if(text4.equals(trenutn)) {
				l1.setEnabled(false);	
				l4.setEnabled(false);
				text4="";
				prosla="";	
				text1="";
			}
			else if(text5.equals(trenutn)) {
				l1.setEnabled(false);	
				l5.setEnabled(false);
				text5="";
				prosla="";	
				text1="";
			}
			else if(text6.equals(trenutn)) {
				l1.setEnabled(false);	
				l6.setEnabled(false);
				text6="";
				prosla="";	
				text1="";
			}
			else if(text7.equals(trenutn)) {
				l1.setEnabled(false);	
				l7.setEnabled(false);
				text7="";
				prosla="";	
				text1="";
			}
			else if(text8.equals(trenutn)) {
				l1.setEnabled(false);	
				l8.setEnabled(false);
				text8="";
				prosla="";	
				text1="";
			}
		
		}
		
		else {
			

			l1.setIcon(new ImageIcon(myPicture));
			 
			frame.setEnabled(false);
			
			
			 l1.setIcon(new ImageIcon(myPicture));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text1="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
	
	
	
		  else if(!prosla.equals("") && prosla.equals(trenutn) && text3.equals("")&& text2.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") 
				  && text8.equals("")) {
		   		prosla="";
		   		text1=trenutn;
		  
	}
		
			  
		  else {
			   prosla=trenutn;
			   text1=trenutn;
			
		   }
	
		
		return prosla;	
	}
	
	public String checkl2(String trenutn){
		
		System.out.println("text1"+text1);
		System.out.println("text2"+text2);
		System.out.println("text3"+text3);
		System.out.println("text4"+text4);
		System.out.println("text5"+text5);
		System.out.println("text6"+text6);
		System.out.println("text7"+text7);
		System.out.println("text8"+text8);
		System.out.println("PROSLA"+prosla);
		System.out.println("TRENUTNA"+trenutn);
		
		if(!prosla.equals("")&&!trenutn.equals("")&&!text2.equals("") && text3.equals("")&& text8.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") && text1.equals(""))
			
				prosla="";
		
		

	    if(!text1.equals("") || !text5.equals("") || !text3.equals("") || !text4.equals("") || !text6.equals("") || !text7.equals("") || !text8.equals("") ) { 


			
		  if(prosla.equals("") || (prosla.equals(trenutn))) {
			
			if(text1.equals(trenutn)) {
				l1.setEnabled(false);
				text1="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
			}
			else if(text3.equals(trenutn)) {
				l3.setEnabled(false);
				text3="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
			}
			else if(text4.equals(trenutn)) {
				l4.setEnabled(false);
				text4="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
			}
			else if(text5.equals(trenutn)) {
				l5.setEnabled(false);	
				text5="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
				
			}
			else if(text6.equals(trenutn)) {
				l6.setEnabled(false);	
				text6="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
				
			}
			else if(text7.equals(trenutn)) {
				l7.setEnabled(false);	
				text7="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
				
			}
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);	
				text8="";
				l2.setEnabled(false);
				prosla="";	
				text2="";
				
			}
			
			
		
		}
		else {
	
				
				
				

			l2.setIcon(new ImageIcon(myPicture2));
			 
			frame.setEnabled(false);
			
			
			l2.setIcon(new ImageIcon(myPicture2));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text2="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
	  
	  else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text3.equals("") && text5.equals("") && text4.equals("") && text6.equals("") && text7.equals("") && text8.equals("")) {
	   		prosla="";
	  		text2=trenutn;
	}
	  
	  
	  else {
		   prosla=trenutn;
		   text2=trenutn;
		
	   }

		return prosla;
			
	}
	
	public String checkl3(String trenutn) {
		
		
		System.out.println("text1"+text1);
		System.out.println("text2"+text2);
		System.out.println("text3"+text3);
		System.out.println("text4"+text4);
		System.out.println("text5"+text5);
		System.out.println("text6"+text6);
		System.out.println("text7"+text7);
		System.out.println("text8"+text8);
		System.out.println("PROSLA"+prosla);
		System.out.println("TRENUTNA"+trenutn);
		
		if(!prosla.equals("")&&!trenutn.equals("")&&!text3.equals("") && text2.equals("")&& text8.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") &&text8.equals(""))
			
			prosla="";
	 	
		
	   if(!text2.equals("") || !text5.equals("") || !text1.equals("") || !text4.equals("") || !text6.equals("") || !text7.equals("") || !text8.equals("")) { 
		
		  if(prosla.equals(trenutn) || (prosla.equals(""))){	

						
			if(text2.equals(trenutn)) {
				l2.setEnabled(false);
				text2="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
			else if(text1.equals(trenutn)) {
				l1.setEnabled(false);
				text1="";
				l3.setEnabled(false);
				text3="";
				prosla="";
				
			}
			else if(text4.equals(trenutn)) {
				l4.setEnabled(false);
				text4="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
			else if(text5.equals(trenutn)) {
				l5.setEnabled(false);	
				text5="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
			else if(text6.equals(trenutn)) {
				l6.setEnabled(false);
				text6="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
			else if(text7.equals(trenutn)) {
				l7.setEnabled(false);
				text7="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);
				text8="";
				l3.setEnabled(false);
				text3="";
				prosla="";
			}
		}
		else{
		

			l3.setIcon(new ImageIcon(myPicture3));
			 
			frame.setEnabled(false);
			
			
			l3.setIcon(new ImageIcon(myPicture3));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text3="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
				
			
		
		
	    else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text5.equals("") && text4.equals("") && text6.equals("") && text7.equals("") && text8.equals("")) {
	   		prosla="";
	  		text3=trenutn;
	}
	  
	    else {
		   prosla=trenutn;
		   text3=trenutn;
		
	   }
		
		return prosla;
			
	}
	
	
	
	
	public String checkl4(String trenutn) {

		  
		
     if(!prosla.equals("")&&!trenutn.equals("")&&!text4.equals("") && text2.equals("")&& text8.equals("") && text5.equals("") && text3.equals("") && text6.equals("") &&text7.equals(""))
			
			  prosla="";
	
		
	 if(!text2.equals("") || !text5.equals("") || !text3.equals("") || !text1.equals("") || !text6.equals("") || !text7.equals("") || !text8.equals("")) { 
		
		if(prosla.equals(trenutn) || prosla.equals("")) {
				
			if(text2.equals(trenutn)) {
				l2.setEnabled(false);
				text2="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text3.equals(trenutn)) {
				l3.setEnabled(false);
				text3="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text1.equals(trenutn)) {
				l1.setEnabled(false);	
				text1="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text5.equals(trenutn)) {
				l5.setEnabled(false);
				text5="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text6.equals(trenutn)) {
				l6.setEnabled(false);	
				text6="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text7.equals(trenutn)) {
				l7.setEnabled(false);	
				text7="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);	
				text8="";
				l4.setEnabled(false);
				text4="";
				prosla="";
			}
			
			
		
	 }
	
		else {
			
				

			l4.setIcon(new ImageIcon(myPicture4));
			 
			frame.setEnabled(false);
			
			
			l4.setIcon(new ImageIcon(myPicture4));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text4="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
			
	
	   else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text3.equals("") && text5.equals("") && text6.equals("") && text7.equals("")) {
	   		prosla="";
	 		text4=trenutn;
	}
	   else {
		   prosla=trenutn;
	 	   text4=trenutn;
	 
	   }
		
		return prosla;
			
	}
	
	
	
	public String checkl5(String trenutn) {
		
       if(!prosla.equals("")&&!trenutn.equals("")&&!text5.equals("") && text2.equals("")&& text8.equals("") && text3.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") &&text8.equals(""))
			
			prosla="";
		
		
	
	   if(!text1.equals("") || !text2.equals("") || !text3.equals("") || !text4.equals("") || !text6.equals("") || !text7.equals("") || !text8.equals("")) {
		if(prosla.equals(trenutn) || prosla.equals("")) {
				
			if(text2.equals(trenutn)) {
				l2.setEnabled(false);
				
				text2="";
				l5.setEnabled(false);
				text5="";
				prosla="";
				
			}
			else if(text3.equals(trenutn)) {
				l3.setEnabled(false);
				text3="";
				l5.setEnabled(false);
				text5="";
				prosla="";
			}
			else if(text1.equals(trenutn)) {
				l1.setEnabled(false);	
				text1="";
				l5.setEnabled(false);
				text5="";
				prosla="";
				
			}
			else if(text4.equals(trenutn)) {
				l4.setEnabled(false);	
				text4="";
				l5.setEnabled(false);
				text5="";
				prosla="";
			}
			else if(text6.equals(trenutn)) {
				l6.setEnabled(false);
				text6="";
				l5.setEnabled(false);
				text5="";
				prosla="";
			
		}
			else if(text7.equals(trenutn)) {
				l7.setEnabled(false);
				text7="";
				l5.setEnabled(false);
				text5="";
				prosla="";
			
		}
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);
				text8="";
				l5.setEnabled(false);
				text5="";
				prosla="";
			
		}
			}
		else {
			
			

			l5.setIcon(new ImageIcon(myPicture5));
			 
			frame.setEnabled(false);
			
			
			l5.setIcon(new ImageIcon(myPicture5));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text5="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }

	   
	   else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text3.equals("") && text4.equals("") && text6.equals("") && text7.equals("") && text8.equals("")) {
		   		prosla="";
	   			text5=trenutn;
	}
	   else {
			  prosla=trenutn;
			  text5=trenutn;
			
		   }
		
		return prosla;
			
	}
	
	public String checkl6(String trenutn) {
		
	  if(!prosla.equals("")&&!trenutn.equals("")&&!text6.equals("") && text2.equals("")&& text8.equals("") && text5.equals("") && text4.equals("") && text3.equals("") &&text7.equals("") &&text8.equals(""))
			
			prosla="";
		
		
	  if(!text1.equals("") || !text2.equals("") || !text3.equals("") || !text4.equals("") || !text5.equals("") || !text7.equals("") || !text8.equals("") ) {
		
		if(prosla.equals(trenutn) || prosla.equals("")) {
				
			if(text2.equals(trenutn)) {
				l2.setEnabled(false);
				text2="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			
			else if(text3.equals(trenutn)) {
				l3.setEnabled(false);
				text3="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			else if(text1.equals(trenutn)) {
				l1.setEnabled(false);	
				text1="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			else if(text4.equals(trenutn)) {
				l4.setEnabled(false);	
				text4="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			else if(text5.equals(trenutn)) {
				l5.setEnabled(false);
				text5="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			else if(text7.equals(trenutn)) {
				l7.setEnabled(false);
				text7="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);
				text8="";
				l6.setEnabled(false);
				text6="";
				prosla="";
			}
			
			
		}
		else {
		
			
			

			l6.setIcon(new ImageIcon(myPicture6));
			 
			frame.setEnabled(false);
			
			
			l6.setIcon(new ImageIcon(myPicture6));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text6="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
	  
	  
	   else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text3.equals("") &&
			   text4.equals("") && text5.equals("") && text7.equals("") && text8.equals("")) {
	   		prosla="";
	  		text6=trenutn;
	}
	   else {
		  prosla=trenutn;
		  text6=trenutn;
		  
		
	   }
	   return prosla;
	   
			
	}
	
	
	
	
	
	
	
	public String checkl7(String trenutn) {
		
	  if(!prosla.equals("")&&!trenutn.equals("")&&!text7.equals("") && text2.equals("")&& text8.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text3.equals("") &&text8.equals(""))
			
			prosla="";
		
		
	  if(!text1.equals("") || !text2.equals("") || !text3.equals("") || !text4.equals("") || !text5.equals("") ||
			  !text6.equals("") || !text8.equals("")) {
		
		if(prosla.equals(trenutn)) {
				
			if(text2.equals(trenutn)) {
				l2.setEnabled(false);
				text2="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			
			else if(text3.equals(trenutn)) {
				l3.setEnabled(false);
				text3="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			else if(text1.equals(trenutn)) {
				l1.setEnabled(false);	
				text1="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			else if(text4.equals(trenutn)) {
				l4.setEnabled(false);	
				text4="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			else if(text5.equals(trenutn)) {
				l5.setEnabled(false);
				text5="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			else if(text6.equals(trenutn)) {
				l6.setEnabled(false);
				text6="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			else if(text8.equals(trenutn)) {
				l8.setEnabled(false);
				text8="";
				l7.setEnabled(false);
				text7="";
				prosla="";
			}
			
			
		}
		else {
			
			
			
			
			

			l7.setIcon(new ImageIcon(myPicture7));
			 
			frame.setEnabled(false);
			
			
			l7.setIcon(new ImageIcon(myPicture7));
			 ActionListener listener = new ActionListener(){
					public void actionPerformed(ActionEvent event){
					
							
					
						    frame.setEnabled(true);
						    reset();
							text7="";
						       
			                prosla="";
			                //dialog.setVisible(false);
			                
							        }
							    };

								
							Timer timer = new Timer(500, listener);
							timer.setRepeats(false);
						    timer.start();
			
		}
	  }
		/*
			
			
			l7.setIcon(new ImageIcon(myPicture7));
			 ActionListener listener = new ActionListener(){
				public void actionPerformed(ActionEvent event){
				
						//l1.setIcon(new ImageIcon(myPicture));
						reset();
						text7="";
					       
		                prosla="";
						        }
						    };

							
						Timer timer = new Timer(500, listener);
						timer.setRepeats(false);
					    timer.start();
	
			
			}
		
		}
	  
	  */
	   else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text3.equals("") && text4.equals("") && text5.equals("") 
			   && text6.equals("") && text8.equals("")) {
	   		prosla="";
	  		text7=trenutn;
	}
	   else {
		  prosla=trenutn;
		  text7=trenutn;
		  
		
	   }
	   return prosla;
	   
			
	}
	

	
	public String checkl8(String trenutn) {
		
		  if(!prosla.equals("")&&!trenutn.equals("")&&!text8.equals("") && text2.equals("")&& text3.equals("") && text5.equals("") && text4.equals("") && text6.equals("") &&text7.equals("") &&text8.equals(""))
			
			  prosla="";
		
		
		  if(!text1.equals("") || !text2.equals("") || !text3.equals("") || !text4.equals("") || !text5.equals("") ||
				  !text6.equals("") || !text7.equals("")) {
			
			if(prosla.equals(trenutn)) {
					
				if(text2.equals(trenutn)) {
					l2.setEnabled(false);
					text2="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				
				else if(text3.equals(trenutn)) {
					l3.setEnabled(false);
					text3="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				else if(text1.equals(trenutn)) {
					l1.setEnabled(false);	
					text1="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				else if(text4.equals(trenutn)) {
					l4.setEnabled(false);	
					text4="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				else if(text5.equals(trenutn)) {
					l5.setEnabled(false);
					text5="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				else if(text6.equals(trenutn)) {
					l6.setEnabled(false);
					text6="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				else if(text7.equals(trenutn)) {
					l7.setEnabled(false);
					text7="";
					l8.setEnabled(false);
					text8="";
					prosla="";
				}
				
				
			}
			else {
			
				
				 
				
				       
				//JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
				/*
				frame.setEnabled(false);
			
				
				reset();
				text8="";
			       
	            prosla="";
	            */
				
				
				
				//JOptionPane.showMessageDialog(null, "SORRY", "InfoBox: " + "naslov", JOptionPane.INFORMATION_MESSAGE);
				
			
			
				l8.setIcon(new ImageIcon(myPicture8));
				 
				frame.setEnabled(false);
				
				
				l8.setIcon(new ImageIcon(myPicture8));
				 ActionListener listener = new ActionListener(){
						public void actionPerformed(ActionEvent event){
						
								
						
							    frame.setEnabled(true);
							    reset();
								text8="";
							       
				                prosla="";
				                //dialog.setVisible(false);
				                
								        }
								    };

									
								Timer timer = new Timer(500, listener);
								timer.setRepeats(false);
							    timer.start();
							    
							    
							    
							   
				 
				 
				//JOptionPane.showMessageDialog(null, 
                 //       "ALERT MESSAGE", 
                  //      "TITLE", 
                   //     JOptionPane.WARNING_MESSAGE);
				 
				 
				
				
				
				
				 //ActionListener listener = new ActionListener(){
				//	public void actionPerformed(ActionEvent event){
						
						
				   
					
							
					//		reset();
						//	text8="";
						       
			              //  prosla="";
							//        }
							  //  };

								
							//Timer timer = new Timer(500, listener);
							//timer.setRepeats(false);
				//		    timer.start();
		
				
				}
			
			}
		  
		  
		   else if(!prosla.equals("") && prosla.equals(trenutn) && text1.equals("")&& text2.equals("") && text3.equals("") && text4.equals("") && text5.equals("") 
				   && text6.equals("") && text7.equals("")) {
		   		prosla="";
		  		text8=trenutn;
		}
		   else {
			  prosla=trenutn;
			  text8=trenutn;
			  
			
		   }
		   return prosla;
		   
				
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void reset() {
		if(l1.isEnabled()) {
			l1.setIcon(new ImageIcon(memoryPicture));
			text1="";
		}
		if(l2.isEnabled()) {
			l2.setIcon(new ImageIcon(memoryPicture));
			text2="";
		}
		if(l3.isEnabled()) {
			l3.setIcon(new ImageIcon(memoryPicture));
			text3="";
		}
		if(l4.isEnabled()) {
			l4.setIcon(new ImageIcon(memoryPicture));
			text4="";
		}
		if(l6.isEnabled()) {
			l6.setIcon(new ImageIcon(memoryPicture));
			text6="";
		}
		if(l5.isEnabled()) {
			l5.setIcon(new ImageIcon(memoryPicture));
			text5="";
		
		}
		
		if(l7.isEnabled()) {
			l7.setIcon(new ImageIcon(memoryPicture));
			text7="";
		
		}
		if(l8.isEnabled()) {
			l8.setIcon(new ImageIcon(memoryPicture));
			text8="";
		
		}
		
		l1.setText("");
		l2.setText("");
		
		l3.setText("");
		
		l4.setText("");
		l5.setText("");
		
		l6.setText("");
		l7.setText("");
		l8.setText("");
	
		
		
	}
	
	
	
public void osnovno() {
	//panel.setBorder(new EmptyBorder(4,4,4,4));
	
	
	frame.setContentPane(panel);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	//frame.setUndecorated(true);
	frame.setVisible(true);
	
	panel.add(l1);
	panel.add(l2);
	panel.add(l3);
	panel.add(l4);
	panel.add(l5);
	panel.add(l6);
	panel.add(l7);
	panel.add(l8);
	   try {
		   
			
			l1.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l2.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l3.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l4.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l5.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l6.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l7.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			l8.setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
			
			
			l1.setText("");
			l2.setText("");
			
			l3.setText("");
			
			l4.setText("");
			l5.setText("");
			
			l6.setText("");

			l7.setText("");
			l8.setText("");
			prosla="";
			trenutna="";
			
		
		
		    
		
		} catch (Exception e) {
		    e.printStackTrace();
		}
	   
	 
		//frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//frame.pack();
		//frame.setMinimumSize(frame.getPreferredSize());
	
	    

		
	

		}



	public static void main(String[] args) throws IOException {
		
		
				m=new HashMap<Integer,String>();
				
	 
				Memory mem=new Memory();
				
				
				mem.osnovno();
				String panda="images/panda.jpg";
				String lion="images/lion.jpg";	
				String turtle="images/turtle.jpg";
				String fish="images/fish.jpg";
					
				
			
				int max = 7;
		        int min = 0;
		        int range = max - min + 1;
		        
		        List<Integer> lst=new ArrayList<Integer>();
		        

				int rand = (int)(Math.random() * range) + min;
				
				for(int i=0;i<8;++i) {
					
					while(lst.contains(rand)) {
					
					
							rand = (int)(Math.random() * range) + min;
							
					}
					
					lst.add(rand);
					
					
				}
	
				
                    m.put(lst.get(0), lion);
				
				    m.put(lst.get(1), panda);
				    m.put(lst.get(2), lion);
					
				    m.put(lst.get(3), panda);
				    m.put(lst.get(4), turtle);
				    m.put(lst.get(5), turtle);
				    m.put(lst.get(6), fish);
				    m.put(lst.get(7), fish);
			
				myPicture = ImageIO.read(new File(m.get(0)));
				myPicture2 = ImageIO.read(new File(m.get(1)));
				myPicture3 = ImageIO.read(new File(m.get(2)));
				myPicture4 = ImageIO.read(new File(m.get(3)));
				myPicture5 = ImageIO.read(new File(m.get(4)));
				myPicture6 = ImageIO.read(new File(m.get(5)));
				myPicture7 = ImageIO.read(new File(m.get(6)));
				myPicture8=ImageIO.read(new File(m.get(7)));
							
				memoryPicture=ImageIO.read(new File("images/memory.png"));

			   
					mem.l1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
						
							
							if(m.get(0).equals("images/lion.jpg"))
								mem.text1="lion";
								//mem.l1.setText("lion");
							else if(m.get(0).equals("images/turtle.jpg"))
								mem.text1="turtle";
							else if(m.get(0).equals("images/fish.jpg"))
								mem.text1="fish";
								
						    else
						    	mem.text1="panda";
													
						    mem.l1.setIcon(new ImageIcon(myPicture));
						    
						    
						    
						    
						    
						    
						    
						    
						    
					
							mem.checkl1(mem.text1);
																
						}
					});
							
					mem.l2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							

							if(m.get(1).equals("images/lion.jpg"))
								mem.text2="lion";
							else if(m.get(1).equals("images/turtle.jpg"))
								mem.text2="turtle";
							else if(m.get(1).equals("images/fish.jpg"))
								mem.text2="fish";
							else
								mem.text2="panda";
													
						    mem.l2.setIcon(new ImageIcon(myPicture2));
						    
					
				            mem.checkl2(mem.text2);
								
						
						}
					});				
					mem.l3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							
							if(m.get(2).equals("images/lion.jpg")) {
								
								mem.text3="lion";
							}
							else if(m.get(2).equals("images/turtle.jpg"))
								mem.text3="turtle";
							else if(m.get(2).equals("images/fish.jpg"))
								mem.text3="fish";
							else {
								
								mem.text3="panda";
							}
							
							
							
								mem.l3.setIcon(new ImageIcon(myPicture3));
						
							mem.checkl3(mem.text3);
						
		
						}
						
					});
					
					mem.l4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							
							
							   if(m.get(3).equals("images/lion.jpg"))
								
								   mem.text4="lion";
							   else if(m.get(3).equals("images/turtle.jpg"))
									mem.text4="turtle";
							   else if(m.get(3).equals("images/fish.jpg"))
									mem.text4="fish";
							   else
								   mem.text4="panda";
								 
							   mem.l4.setIcon(new ImageIcon(myPicture4));
							   
			
	     			        	mem.checkl4(mem.text4);
					
					}
					});
					
					
					
					mem.l5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							

							if(m.get(4).equals("images/lion.jpg"))
								mem.text5="lion";
							else if(m.get(4).equals("images/turtle.jpg"))
								mem.text5="turtle";
							else if(m.get(4).equals("images/fish.jpg"))
								mem.text5="fish";
							else
								mem.text5="panda";
												
						    mem.l5.setIcon(new ImageIcon(myPicture5));
			
							mem.checkl5(mem.text5);
			
								
			
						}
					});
					
					
					mem.l6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							

							if(m.get(5).equals("images/lion.jpg"))
								mem.text6="lion";
							else if(m.get(5).equals("images/turtle.jpg"))
								mem.text6="turtle";
							
							else if(m.get(5).equals("images/fish.jpg"))
								mem.text6="fish";
							else
								mem.text6="panda";
							
													
						    mem.l6.setIcon(new ImageIcon(myPicture6));
						    
					
							mem.checkl6(mem.text6);
						
						
						}
					});
					
					mem.l7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							

							if(m.get(6).equals("images/lion.jpg"))
								mem.text7="lion";
							else if(m.get(6).equals("images/turtle.jpg"))
								mem.text7="turtle";
							else if(m.get(6).equals("images/fish.jpg"))
								mem.text7="fish";
							else
								mem.text7="panda";
							
													
						    mem.l7.setIcon(new ImageIcon(myPicture7));
						    
					
							mem.checkl7(mem.text7);
						
						
						}
					});
		
					
					
					mem.l8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0){
							

							if(m.get(7).equals("images/lion.jpg"))
								mem.text8="lion";
							else if(m.get(7).equals("images/turtle.jpg"))
								mem.text8="turtle";
							else if(m.get(7).equals("images/fish.jpg"))
								mem.text8="fish";
							else
								mem.text8="panda";
							
													
						    mem.l8.setIcon(new ImageIcon(myPicture8));
						    
					
							mem.checkl8(mem.text8);
						
						
						}
					});
		
		
}
}