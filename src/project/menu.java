package project;

import javax.swing.*;
import java.awt.*;
public class menu extends JFrame{
	JLabel l1 = new JLabel(new ImageIcon("E:\\java/c.jpg"));
	JButton l2 = new JButton("|Gestion produits");
	JButton l3 = new JButton("|Statistiques");
	
	JPanel p1 = new JPanel(new GridLayout(5,1));
	JPanel p2 = new JPanel(new BorderLayout());
	public menu() {
		super("menu");
		l2.setFont(new Font("arial",Font.BOLD, 25));
		l3.setFont(new Font("arial",Font.BOLD, 25));
		
		l2.setForeground(Color.BLUE);
		l3.setForeground(Color.BLUE);
		//
		l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	prod p = new prod();
            	p.show(); 
            	}
        });
		//
		p1.add(l1);	
		p1.add(l2);	
		p1.add(l3);	
		
		//
		p2.add(p1,BorderLayout.WEST);
		p1.setBackground(new Color(60,179,113));
		this.add(p2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(900,500);
	    setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new menu();
	}

}
