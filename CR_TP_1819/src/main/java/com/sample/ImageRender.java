package com.sample;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class ImageRender extends JLabel implements ListCellRenderer<Item> {
 
    public Component getListCellRendererComponent(JList<? extends Item> list, Item item, int index,
        boolean isSelected, boolean cellHasFocus) {
          
        String id = item.getNome();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + id + ".png"));
         
        setIcon(imageIcon);
        setText(item.getNome());
         
        return this;
    }

}
