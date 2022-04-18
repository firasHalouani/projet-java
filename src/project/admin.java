package project;
import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class admin extends JFrame implements ActionListener{
	JPanel p1 = new JPanel(new GridLayout(1,3));
	JLabel l1 = new JLabel(new ImageIcon("E:\\java/a.png"));
	JLabel l5 = new JLabel(new ImageIcon("E:\\java/imm.png"));
	JLabel l0 = new JLabel("Bienvenue");
	JLabel l2 = new JLabel("address");
	JLabel l3 = new JLabel("Mot de passe");
	JLabel l4 = new JLabel("");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JButton b1 = new JButton("connecter");
	JPanel p2 = new JPanel(new GridLayout(8,1));
	JPanel p3 = new JPanel(new BorderLayout());
	public admin() {
		super("admin");
		b1.addActionListener(this);
		p3.add(l5,BorderLayout.WEST);
		p2.add(l0) ;
		p2.add(l2) ;
		p2.add(t1) ;
		p2.add(l3) ;
		p2.add(t2) ;
		p2.add(l4) ;
		p2.add(b1) ;
		p3.add(p2,BorderLayout.CENTER);
		p1.add(p3);
		p1.add(l1);
		b1.setBackground(Color.YELLOW);
		p2.setBackground(Color.LIGHT_GRAY);
		this.add(p1);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,500);
	    setLocationRelativeTo(null);
	    
	    
	}

	public static void main(String[] args) throws SQLException {
		new admin();
	}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.print(t1.getText());
			System.out.print(t2.getText());
			String a = t1.getText();
			String b = t2.getText();
			String x = null;

			if ((a.equals("firashalouani270@gmail.com"))&&(b.equals("azerty")))
				{
				menu m = new menu();
				m.show();
				this.setVisible(false);
				}else if ((a.equals("firas"))&&(b.equals("aqw"))) {
					caissier c = new caissier();
					c.show();
					this.setVisible(false);
					}
			else
				{
					JOptionPane.showMessageDialog(this,"aaaa");
				}
	
		
	}
	
	@Override
	public boolean equals( Object obj)
	{
		if (this==obj)
		{
			return true;
		}
		
		if (obj ==null)
		{
		return false; 	
		}
		admin p=(admin) obj ; 
		return (obj==this); 
	}

}
