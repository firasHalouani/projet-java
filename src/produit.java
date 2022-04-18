
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
public class produit extends JFrame{

	JPanel jPanel1 = new JPanel();
	JScrollPane jScrollPane1 = new JScrollPane();
	JTable tbl_prod = new JTable();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();
	JButton jButton4 = new JButton();
	JPanel jPanel2 = new JPanel();
	JLabel jLabel7 = new JLabel();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	JLabel jLabel10 = new JLabel();
	JLabel jLabel11 = new JLabel();
	JTextField txtdes = new JTextField();
	JLabel jLabel12 = new JLabel();
	JLabel jLabel13 = new JLabel();
	JTextField txtran = new JTextField();
	JLabel jLabel14 = new JLabel();
	JTextField txtid = new JTextField();
	JTextField txtref = new JTextField();
	JTextField txtrem = new JTextField();
	JTextField txtpri = new JTextField();
	JTextField txtsto = new JTextField();
	JTextField txtfou = new JTextField();
	JPanel jPanel3 = new JPanel();
	JButton jButton1 = new JButton();
	JComboBox comrech = new JComboBox();
	JLabel jLabel5 = new JLabel();
	JTextField txtrech = new JTextField();
	JButton jButton5 = new JButton();
	JLabel jLabel6 = new JLabel();
	
    public produit() {
    	super("produit");
    	this.setVisible(true);
    this.setPreferredSize(new java.awt.Dimension(850, 590));
    this.getContentPane().setLayout(null);

    jPanel1.setBackground(new java.awt.Color(231, 248, 251));
    jPanel1.setPreferredSize(new java.awt.Dimension(840, 900));
    jPanel1.setLayout(null);

    
    
    jScrollPane1.setViewportView(tbl_prod);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(0, 120, 840, 150);

    jButton2.setFont(new Font("Tahoma", 3, 18)); // NOI18N
    jButton2.setText("ajouter");

    jPanel1.add(jButton2);
    jButton2.setBounds(10, 300, 120, 40);

    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	String ajout = jButton2.getText();
        }
    });
    
    jButton3.setFont(new Font("Tahoma", 3, 18)); // NOI18N
    jButton3.setText("modifier");

    jPanel1.add(jButton3);
    jButton3.setBounds(130, 300, 110, 40);

    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actionPerformed(evt);
        }
    });
    
    jButton4.setFont(new Font("Tahoma", 3, 18)); 
    jButton4.setText("supprimer");

    jPanel1.add(jButton4);
    jButton4.setBounds(240, 300, 130, 40);
    
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actionPerformed(evt);
        }
    });

    jPanel2.setBackground(new Color(204, 255, 255));
    jPanel2.setPreferredSize(new Dimension(850, 500));
    jPanel2.setLayout(null);

    jLabel7.setFont(new java.awt.Font("Calibri", 1, 12));
    jLabel7.setText("code produit   :");
    jPanel2.add(jLabel7);
    jLabel7.setBounds(20, 10, 80, 27);

    jLabel8.setFont(new Font("Calibri", 1, 12));
    jLabel8.setText("fournisseur  :");
    jPanel2.add(jLabel8);
    jLabel8.setBounds(260, 10, 90, 20);

    jLabel9.setFont(new Font("Calibri", 1, 12)); 
    jLabel9.setText("remise   % :");
    jPanel2.add(jLabel9);
    jLabel9.setBounds(280, 50, 70, 27);

    jLabel10.setFont(new Font("Calibri", 1, 12));
    jLabel10.setText("reference    :");
    jPanel2.add(jLabel10);
    jLabel10.setBounds(20, 50, 70, 27);

    jLabel11.setFont(new Font("Calibri", 1, 12)); 
    jLabel11.setText("deseignation    :");
    jPanel2.add(jLabel11);
    jLabel11.setBounds(10, 100, 90, 27);
    jPanel2.add(txtdes);
    txtdes.setBounds(120, 100, 100, 30);

    jLabel12.setFont(new Font("Calibri", 1, 12));
    jLabel12.setText("prix   :");
    jPanel2.add(jLabel12);
    jLabel12.setBounds(290, 100, 70, 27);

    jLabel13.setFont(new Font("Calibri", 1, 12)); 
    jLabel13.setText("stock   :");
    jPanel2.add(jLabel13);
    jLabel13.setBounds(280, 140, 70, 27);
    jPanel2.add(txtran);
    txtran.setBounds(120, 140, 100, 30);

    jLabel14.setFont(new Font("Calibri", 1, 12)); 
    jLabel14.setText("rangement   :");
    jPanel2.add(jLabel14);
    jLabel14.setBounds(10, 150, 90, 27);
    jPanel2.add(txtid);
    txtid.setBounds(120, 10, 100, 30);
    jPanel2.add(txtref);
    txtid.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	String id = txtid.getText();
        }
    });
    txtref.setBounds(120, 50, 100, 30);
    jPanel2.add(txtrem);
    txtref.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	String ref = txtref.getText();
        }
    });
    txtrem.setBounds(360, 50, 100, 30);
    jPanel2.add(txtpri);
    txtpri.setBounds(360, 100, 100, 30);
    jPanel2.add(txtsto);
    txtsto.setBounds(360, 140, 100, 30);
    jPanel2.add(txtfou);
    txtfou.setBounds(360, 10, 100, 30);

    jPanel1.add(jPanel2);
    jPanel2.setBounds(10, 370, 500, 190);

    jPanel3.setBackground(new Color(204, 255, 255));
    jPanel3.setLayout(null);

    jButton1.setFont(new Font("Tahoma", 3, 18)); 
    jButton1.setText("recherche ");
 
    jPanel3.add(jButton1);
    jButton1.setBounds(0, 140, 133, 40);

    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            actionPerformed(evt);
        }
    });
    
    comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock" }));
    jPanel3.add(comrech);
    comrech.setBounds(40, 70, 240, 40);

    jLabel5.setFont(new Font("Tahoma", 3, 18)); 
    jLabel5.setText("recherche par catégorie :");
    jPanel3.add(jLabel5);
    jLabel5.setBounds(40, 30, 250, 30);
    jPanel3.add(txtrech);
    txtrech.setBounds(140, 140, 180, 40);

    jPanel1.add(jPanel3);
    jPanel3.setBounds(500, 270, 330, 290);

    jButton5.setFont(new Font("Tahoma", 3, 18)); 
    jButton5.setText("actualiser");
    
    jPanel1.add(jButton5);
    jButton5.setBounds(370, 300, 130, 40);

    jLabel6.setFont(new Font("Tahoma", 3, 36)); 
    jLabel6.setText("Gestion des produits ");
    jPanel1.add(jLabel6);
    jLabel6.setBounds(290, 40, 410, 50);

    this.getContentPane().add(jPanel1);
    this.jPanel1.setBounds(0, 0, 840, 560);

    this.pack();
    }

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		new produit();

	}

}
