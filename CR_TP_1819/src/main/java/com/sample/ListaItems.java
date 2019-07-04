package com.sample;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ListaItems {
	ArrayList<Item> Items;
	
	public ListaItems(){
		Items = new ArrayList<Item>();
	}
	
	public void Add(Item i) {
		Items.add(i);
	}
	
	public void Update(Item i) {
		for(int x = 0; x < Items.size(); x++) {
			if(i.getId() == Items.get(x).getId()) {
				Items.set(x,i);
			}
		}
	}

	public ArrayList<Item> getItems() {
		return Items;
	}

	public void setItems(ArrayList<Item> items) {
		Items = items;
	}
	
	
}
