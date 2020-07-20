package GUIAppJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIApplicationJava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
					JFrame window = new JFrame ("My first GUI");
				   window.setSize(300, 200);
				   window.show();
				   
			final JButton btn = new JButton("Like"); 	
				window.getContentPane().add(btn);
				////////////
				
				btn.addActionListener(new ActionListener() {
					float i = 1;
					public void actionPerformed(ActionEvent arg0) {
						
						System.out.println("You've clicked!");
						btn.setText("You've clicked - I like = "+ i);
						if (i>10){//10- in order not to press 1000 times 
							btn.setText("You've clicked - I like "+ i/10+"K");
						}
						i ++;
					}
				});
	}

}
