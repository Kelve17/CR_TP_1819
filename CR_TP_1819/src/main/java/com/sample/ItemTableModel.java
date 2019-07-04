package com.sample;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ItemTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1611358489228589088L;
	String[] Colunas = new String[] {"ID", "PREÇO", "NOME", "TIPO", "STOCK"};
	ArrayList<Item> Items;
	
	ItemTableModel(ListaItems lista){
		Items = lista.getItems();
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return Colunas.length;
	}

	@Override
	public int getRowCount() {
	      return Items == null ? 0 : Items.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
	      Object temp = null;
	      if (col == 0) {
	         temp = Items.get(row).getId();
	      }
	      else if (col == 1) {
	         temp = Items.get(row).getPreco();
	      }
	      else if (col == 2) {
	         temp = Items.get(row).getNome();
	      }
	      else if(col == 3) {
	    	  temp = Items.get(row).getTipo();
	      }else if(col == 4) {
	    	  temp = Items.get(row).getQuantidadeEmArmazem();
	      }
	      return temp;
	}
	
	   // needed to show column names in JTable
	   public String getColumnName(int col) {
	      return Colunas[col];
	   }
	   
	   @Override
	    public void setValueAt(Object aValue, int row, int col) {
		      if (col == 0) {
			         Items.get(row).setId((int) aValue);
			      }
			      else if (col == 1) {
			         Items.get(row).setPreco((float) aValue);
			      }
			      else if (col == 2) {
			         Items.get(row).setNome((String) aValue);
			      }
			      else if(col == 3) {
			    	  Items.get(row).setTipo((TipoItem) aValue);
			      }else if(col == 4) {
			    	  Items.get(row).setQuantidadeEmArmazem((int) aValue);
			      }
	        this.fireTableCellUpdated(row, col); // notify the view
	    }
}
	