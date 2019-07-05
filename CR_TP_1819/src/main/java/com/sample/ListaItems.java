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
	
	public int Count() {
		return Items.size();
	}
	
	//buscar o mesmo que o item escolhido mas para o sexo oposto na lista dos items
	public Item MesmoItemSexoOposto(Item i) {
    	for(int k = 0; k < Items.size(); k++){
			if(Items.get(k).getClasse() == i.getClasse() && (Items.get(k).getTipo() != TipoItem.Crianca && Items.get(k).getTipo() != i.getTipo())){
				return Items.get(k);
			}
		}
    	return null;
	}
	
	public Item GetItemComplementar(int id) {
    	for(int k = 0; k < Items.size(); k++){
			if(Items.get(k).getId() == id){
				return Items.get(k);
			}
		}
    	return null;
	}

}
	
