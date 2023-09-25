package memory_game;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Memory extends JFrame  {
	public JFrame frame=new JFrame("Memory");
	public JPanel panel=new JPanel(new GridLayout(4,6,1,1)); 
	public static List<JButton> buttonList = new ArrayList<>(); 
	public static Map<Integer,String> m =new HashMap<Integer,String>();
	public static ArrayList<BufferedImage> listImage= new ArrayList<BufferedImage>();
	public String last="", current="";
	public static ArrayList<String> list= new ArrayList<String>(),zivotinje = new ArrayList<String>();
	public static List<Integer> lst=new ArrayList<Integer>();
	public int pom;
	public String check(String current, ArrayList<BufferedImage> listImage,int a) {		
		  if((list.stream().filter(x -> !x.isEmpty()).count()==2)) { 
			        pom=list.indexOf(last);
			   		if(last.equals(current)) { 
				    			match(list.subList(list.indexOf(last)+1, list.size()).indexOf(last)+list.indexOf(last)+1);
				    			match(pom);				   	
			   		}						
			   		else { 			 
							frame.setEnabled(false);						
							ActionListener listener = new ActionListener(){
								public void actionPerformed(ActionEvent event){
							    		frame.setEnabled(true);						    
							    		reset(pom);
							    		reset(list.subList(list.indexOf(current)+1, list.size()).indexOf(current)+list.indexOf(current)+1);							    
								}
							    		};								
							    		Timer timer = new Timer(580, listener);
							    		timer.setRepeats(false);
							    		timer.start();									    
					 }
			   		last="";
		    }
	        else { 
	        			list.set(a,current);  
	        	}	    	
		 last=current;    
		 return last;	
	}
	public void match(int index1) {
			buttonList.get(index1).setEnabled(false);									
			list.set(index1,"");			
	}
	public void reset(int d) {	
				buttonList.get(d).setIcon(new ImageIcon(getClass().getClassLoader().getResource("memory.png")));				
				list.set(d,"");		
			    buttonList.get(d).setText("");	
		}	
	public void card(ArrayList<BufferedImage> listImage,int a) {		
			if(zivotinje.contains(m.get(a))) {
				list.set(a,m.get(a).toString()); 			
			}	
			buttonList.get(a).setIcon(new ImageIcon(getClass().getClassLoader().getResource(list.get(a))));
			check(list.get(a),listImage,a);		
}
	public void start() throws IOException {	
		frame.setContentPane(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	
		frame.setVisible(true);		 
		int rand =(int) (Math.random() * 24);
		for(int i=0;i<24;++i) {		 
			buttonList.add(new JButton());
			list.add("");
			panel.add(buttonList.get(i));
			reset(i);
			if(i<2) {
			    zivotinje.add("panda.jpg");zivotinje.add("lion.jpg");zivotinje.add("tiger.png");zivotinje.add("bird.png");zivotinje.add("elephant.png");zivotinje.add("cow.png");				    zivotinje.add("fish.jpg");zivotinje.add("bambi.png");zivotinje.add("bee.png");zivotinje.add("donkey.png");zivotinje.add("cat.png");zivotinje.add("dog2.png");  		     	    	  		     	    	
			} 		 
			while(lst.contains(rand)) {
				rand = (int) (Math.random() * 24);	
			}					
			lst.add(rand);					
			m.put(lst.get(i), zivotinje.get(i));				 
	    }   						
		for(int i=0;i<24;++i) {	
				listImage.add(ImageIO.read(Memory.class.getResourceAsStream("/"+m.get(i))));	
				final Integer var = new Integer(i);				
				buttonList.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0){
						card(listImage,var.intValue());																							
					}});
				}
		}
	public static void main(String[] args) throws IOException {
				Memory mem=new Memory();							
				mem.start();								        								
}}