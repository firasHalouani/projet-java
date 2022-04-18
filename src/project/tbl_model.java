package project;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel; 
public class tbl_model extends AbstractTableModel {
	private List<produits> p ;  
	private String titre[]={"id","code","nom","prix","remise","fournisseur"};

	public tbl_model()
	{
		p=new ArrayList<produits>();
	}
	

	public int getColumnCount() {
		return titre.length;
	}

	public int getRowCount() {
	return p.size();
	}

	public Object getValueAt(int l, int c) {
		switch(c){
		case 0:
		return p.get(l).getId();
		case 1:
			return p.get(l).getCode();
		case 2:
			return p.get(l).getNom();
		case 3:
			return p.get(l).getPrix();
		case 4:
			return p.get(l).getRemise();
		case 5:
			return p.get(l).getFournisseur();
			
		}
		return null;
	}
	
	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return titre[arg0];
	}
	
	public void charger(List<produits> list)
	{
		this.p=list;
		fireTableDataChanged();
	}

}
