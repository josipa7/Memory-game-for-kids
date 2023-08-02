package memory_game;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Memory extends JFrame  {
	public JFrame frame=new JFrame("Memory");
	public JPanel panel=new JPanel(new GridLayout(2,2,70,70));
	public static List<JButton> buttonList = new ArrayList<>();
	public static Map<Integer,String> m =new HashMap<Integer,String>();;
	public static BufferedImage memoryPicture;
	public static ArrayList<BufferedImage> listImage= new ArrayList<BufferedImage>();
	public String prosla="", trenutna="";
	public static String panda="images/panda.jpg", lion="images/lion.jpg",turtle="images/turtle.jpg", fish="images/fish.jpg";
	public static ArrayList<String> list= new ArrayList<String>();
	public static List<Integer> lst=new ArrayList<Integer>();
	public String check(String trenutn, ArrayList<BufferedImage> listImage,int a) {		
		if(list.stream().filter(x -> !x.isEmpty()).count()==2) { 
			if(prosla.equals(trenutn) ) { 
						for(int i=0;i<8;++i) {								
								if(list.get(i).equals(trenutn) ) {
									buttonList.get(i).setEnabled(false);									
									list.set(i,"");	
								}							
							}				
			}	
			else {	 
					frame.setEnabled(false);
					buttonList.get(a).setIcon(new ImageIcon(listImage.get(a)));
					ActionListener listener = new ActionListener(){
						public void actionPerformed(ActionEvent event){
						    	frame.setEnabled(true);
						    	reset();
						    	list.set(a,"");						       		             			                
							        }
							    };								
							    Timer timer = new Timer(580, listener);
							    timer.setRepeats(false);
							    timer.start();			
					}
			prosla="";
	  }
	    else { 
	    	if(prosla.equals(trenutn)) { 			
						prosla=trenutn;				
	    	}
	    	else {
	    				prosla=trenutn;		  						   
	    				list.set(a,trenutn);
	    	}
	    }
			return prosla;	
	}	
	public void reset() {		
		for(int i=0;i<8;++i) {
			if(buttonList.get(i).isEnabled()) {
				buttonList.get(i).setIcon(new ImageIcon(memoryPicture));				
				list.set(i,"");
			}
			buttonList.get(i).setText("");				
		}		
	}	
public void kartica(ArrayList<BufferedImage> listImage,int a) {
	if(m.get(a).equals(lion))
		list.set(a, "lion");
	else if(m.get(a).equals(turtle))
		list.set(a,"turtle");
	else if(m.get(a).equals(fish))
		list.set(a,"fish");
	else
		list.set(a,"panda");	
	buttonList.get(a).setIcon(new ImageIcon(listImage.get(a)));
	check(list.get(a),listImage,a);		
}
public void osnovno() throws IOException {	
	frame.setContentPane(panel);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	
	frame.setVisible(true);	
	 memoryPicture=ImageIO.read(new File("images/memory.png"));	
	 ArrayList<String> zivotinje = new ArrayList<String>();
     int max = 7,min=0,range = max - min + 1, rand = (int)(Math.random() * range) + min;
	 for(int i=0;i<8;++i) {		 
		 buttonList.add(new JButton());
		 list.add("");
		 panel.add(buttonList.get(i));
		 buttonList.get(i).setIcon(new ImageIcon(ImageIO.read(new File("images/memory.png"))));
		 buttonList.get(i).setText("");
		 if(i<2) {
			    zivotinje.add(lion);
		     	zivotinje.add(turtle);
		     	zivotinje.add(fish);
		     	zivotinje.add(panda);
		 }
	 }   				
		for(int i=0;i<8;++i) {					
			while(lst.contains(rand)) {
					rand = (int)(Math.random() * range) + min;								
			}					
			lst.add(rand);					
			m.put(lst.get(i), zivotinje.get(i));		   	
		}		
		for(int i=0;i<8;++i) {		
			listImage.add(ImageIO.read(new File(m.get(i))));	
			final Integer var = new Integer(i);				
			buttonList.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0){
					kartica(listImage,var.intValue());																							
				}
			});
		}
		}
	public static void main(String[] args) throws IOException {
				Memory mem=new Memory();							
				mem.osnovno();								        								
}
}