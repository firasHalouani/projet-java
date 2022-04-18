package project;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;


import javax.swing.*;
public class prod extends JFrame    {
	IGestionProduit gestion=new gestionProduit();
	int numrow=-1;
	tbl_model tm=new tbl_model();
	JTable t=new JTable(tm); 
	JScrollPane jsp=new JScrollPane(t);
	//
	//labels
	JLabel l=new JLabel("Gestion de produits",SwingConstants.CENTER);
	JLabel l1=new JLabel("ID");
	JLabel l2=new JLabel("code produit ");
	JLabel l3=new JLabel("nom");
	JLabel l4=new JLabel("prix");
	JLabel l5=new JLabel("remise");
	JLabel l6=new JLabel("fournisseur");
	//textfield
	JTextField tt= new JTextField(15); 
	JTextField t1= new JTextField(); 
	JTextField t2= new JTextField(); 
	JTextField t3= new JTextField(); 
	JTextField t4= new JTextField(); 
	JTextField t5= new JTextField(); 
	JTextField t6= new JTextField(); 
	//

	//buttons
	JButton b=new JButton ("cherche");
	JButton b1=new JButton ("modifier");
	JButton b2=new JButton ("ajouter");
	JButton b3=new JButton ("supprimer");
	JButton b4=new JButton ("actualiser");
	
	//
	JPanel gp=new JPanel(new BorderLayout());
	JPanel g=new JPanel(new GridLayout(3,2));
	JPanel g2=new JPanel(new GridLayout(3,2));
	JPanel g3=new JPanel(new GridLayout(4,1));
	JPanel f1=new JPanel();
	JPanel f=new JPanel();
	JComboBox c = new JComboBox();

	
	public prod()
	{	
		JScrollPane jsp = new JScrollPane(t) {
		      @Override
		      public Dimension getPreferredSize() {
		        return new Dimension(200, 250);
		      }
		};
		gp.add(l,BorderLayout.NORTH);
		gp.add(jsp);
		this.add(gp,BorderLayout.NORTH);
		g.add(l1);
		g.add(t1);
		g.add(l2);
		g.add(t2);
		g.add(l3);
		g.add(t3);
		
		g2.add(l4);
		g2.add(t4);
		g2.add(l5);
		g2.add(t5);
		g2.add(l6);
		g2.add(t6);
		g3.add(b2);
		g3.add(b1);
		g3.add(b3);
		g3.add(b4);
		//
		l.setFont(new Font("Arial", 7, 18));

		l1.setSize(90, 20);
		l2.setSize(90, 20);
		l3.setSize(90, 20);
		l4.setSize(90, 20);
		l5.setSize(90, 20);
		l6.setSize(90, 20);
		//
		b.setFont(new Font("Arial", 3, 18));
		b1.setFont(new Font("Arial", 3, 18));
		b2.setFont(new Font("Arial", 3, 18));
		b3.setFont(new Font("Arial", 3, 18));
		b4.setFont(new Font("Arial", 3, 18));
		b.setSize(110, 40);
		b1.setSize(110, 40);
		b2.setSize(110, 40);
		b3.setSize(110, 40);
		b4.setSize(110, 40);
		b.setBackground(new Color(60,179,113));
		b1.setBackground(new Color(60,179,113));
		b2.setBackground(new Color(60,179,113));
		b3.setBackground(new Color(60,179,113));
		b4.setBackground(new Color(60,179,113));
		//
		b2.addActionListener(x->{
			   
			   
			   String code_produit = t2.getText();
			   String nom = t3.getText();
			   String prix = t4.getText();
			   String remise = t5.getText();
			   String fournisseur = t6.getText();
			   
			   if(code_produit.equals("")||nom.equals(""))
			   {
				   JOptionPane.showMessageDialog(this,"erreur de saisie");
			   }else
			   {
				   gestion.ajouterProduits(new produits(code_produit,nom,prix,remise,fournisseur)) ;
				   tm.charger(gestion.listeProduits());
			   }
			   
			   
		   });
		//
		 b4.addActionListener(x->{
			   
			   tt.setText("");
			   t1.setText("");
			   t2.setText("");
			   t3.setText("");
			   t4.setText("");
			   t5.setText("");
			   t6.setText("");

		   });
		//
		t.addMouseListener(new EcouteurSouris());
		
		b3.addActionListener(e->{
			  
			   if(numrow==-1)
				   JOptionPane.showMessageDialog(this, "il faut selectionner une ligne ");
			   
			   else
			   {
				   int id=(int)tm.getValueAt(numrow, 0);
				   gestion.supprimerProduits(id);
				   tm.charger(gestion.listeProduits());
				   numrow=-1;
			   }
			   
			   
			   
		   });
		//
		b.addActionListener(x->{
			   String x1 = String.valueOf(c.getSelectedItem());
			   
			   tm.charger(gestion.rechercherProduits(tt.getText(),x1));
			   
		   });
		//
		c.setModel(new DefaultComboBoxModel(new String[] {"code", "nom", "prix", "remise", "fournisseur"}));
        f1.add(c);
        c.setBounds(40, 70, 240, 40);
		
		//
	    tt.setFont(new Font("Arial",Font.BOLD,10));
	    t1.setFont(new Font("Arial",Font.BOLD,10));
	    t2.setFont(new Font("Arial",Font.BOLD,10));
	    t3.setFont(new Font("Arial",Font.BOLD,10));
	    t4.setFont(new Font("Arial",Font.BOLD,10));
	    t5.setFont(new Font("Arial",Font.BOLD,10));
		//
		f1.add(tt);
		f1.add(b);
		
		//
		f.add(g);
		f.add(g2);
		f.add(g3);
		f.setBackground(new Color(128,128,128));
		g.setBackground(new Color(128,128,128));
		g2.setBackground(new Color(128,128,128));
		g3.setBackground(new Color(128,128,128));

		this.add(f1,BorderLayout.CENTER);
		this.add(f,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setBounds(550,113,578,500);
	    
	    
		
	}
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		new prod();
	}
	class EcouteurSouris implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			numrow=t.getSelectedRow();
			System.out.println(numrow);
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}

