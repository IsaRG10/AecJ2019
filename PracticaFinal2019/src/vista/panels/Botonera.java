package vista.panels;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Botonera extends JFrame {


	public JButton botones[][];
	int anchoPanel=150,altoPanel=150;
	int ladoBoton=50;	
	
	public Botonera(int x,int y) {
		setLayout(null);
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
		iniciarBotonera();
	}
	private void iniciarBotonera(){
		this.botones = new JButton[5][4];
		int x=0,y=0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i)+String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton);				
				this.add(this.botones[i][j]);
				x+=this.ladoBoton;
			}
			x=0;
			y+=this.ladoBoton;
		}
	}

}