package project;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caissier extends JFrame implements ActionListener {
	IGestionProduit gestion=new gestionProduit();
	JButton b0=new JButton("0");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton bs=new JButton("submit");
	JButton br=new JButton("reset");
	JButton bss=new JButton("session");
	//
	tbl_model tm=new tbl_model();
	JTable t=new JTable(tm); 
	JScrollPane jsp=new JScrollPane(t);
	//
	JTextField t1=new JTextField(15);
	//
	JPanel p=new JPanel (new GridLayout(3,3));
	JPanel f=new JPanel ();
	JPanel b=new JPanel (new BorderLayout());

public caissier()
{	
	super("caissier");
	JScrollPane jsp = new JScrollPane(t) {
	      @Override
	      public Dimension getPreferredSize() {
	        return new Dimension(300, 100);
	      }
	};
	this.add(jsp,BorderLayout.NORTH);
	f.add(bss);
	f.add(t1);
	f.add(bs);
	f.add(br);
	p.add(b9);
	p.add(b6);
	p.add(b8);
	p.add(b7);
	p.add(b5);
	p.add(b4);
	p.add(b3);
	p.add(b2);
	p.add(b1);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	b.add(f,BorderLayout.NORTH);
	b.add(p);
	b.add(b0,BorderLayout.SOUTH);
	//
	br.addActionListener(this);
	//
	
	bs.addActionListener(x->{
		   	
		   tm.charger(gestion.rechercherProduits(t1.getText(),"code"));
		   
	   });
	//
	this.add(b);
	this.setVisible(true);
	this.setSize(500,500);
}
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		new caissier();
	}
	public void actionPerformed(ActionEvent e) {
	
		JButton a=(JButton) e.getSource();
		if (a==b1)
		{
		 t1.setText(t1.getText() + "1");
		}
		if (a==b2)
		{
			t1.setText(t1.getText() + "2");
		}
		if (a==b3)
		{
			t1.setText(t1.getText() + "3");
		}
		if (a==b4)
		{
			t1.setText(t1.getText() + "4");
		}
		if (a==b5)
		{
			t1.setText(t1.getText() + "5");
		}
		if (a==b6)
		{
			t1.setText(t1.getText() + "6");
		}
		if (a==b7)
		{
			t1.setText(t1.getText() + "7");
		}
		if (a==b8)
		{
			t1.setText(t1.getText() + "8");
		}
		if (a==b9)
		{
			t1.setText(t1.getText() + "9");
		}
		if (a==b0)
		{
			t1.setText(t1.getText() + "0");
		}
		if (a==br) {
			t1.setText("");
		}
	}

}
