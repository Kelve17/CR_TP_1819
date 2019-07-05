package com.sample;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
 
public class GUI extends JFrame {
 
    private JPanel contentPane;
    private ItemTableModel tableModel;
    private ListaItems lista =  new ListaItems();
    private JTable table;
    private DefaultListModel<Item> listModel;
    private int linha;//linha da tabela
    private int linhaLista;//linha da lista
    private JFormattedTextField formattedTextField;
    private float sum = 0;
    private int numeroItems;
    private JOptionPane OptionPane = new JOptionPane();
 
    public int getLinhaLista() {
		return linhaLista;
	}

	public void setLinhaLista(int linha) {
		this.linhaLista = linha;
	}
	
    public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum += sum;
	}

	public void removeSum(float sum) {
		this.sum -= sum;
	}
	/**
     * Launch the application.
     *
     *
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public GUI(KieSession kSession) {
        kSession.setGlobal("J2", this);
        kSession.setGlobal("lista", lista);
        kSession.setGlobal("JP", OptionPane);

        
         
        listModel = new DefaultListModel<Item>();
        kSession.setGlobal("listModel", listModel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 884, 512);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //adicionar nas regras
        tableModel = new ItemTableModel(lista);
        kSession.setGlobal("tableModel", tableModel);
       
       
        table = new JTable(tableModel);
        kSession.setGlobal("table", table);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.setBounds(30, 59, 122, 158);
        JScrollPane scrollPane1 = new JScrollPane(table);
        JList image = new JList();
        image.setCellRenderer(new ImageRender());
       
 
       
        scrollPane1.setBounds(10, 37, 380, 300);
        contentPane.add(scrollPane1);
       
        JScrollPane scrollPane2 = new JScrollPane();
        JList list2 = new JList();
        list2.setModel(listModel);
        scrollPane2.setBounds(400, 37, 200, 300);
        scrollPane2.setViewportView(list2);
        contentPane.add(scrollPane2);
       
        JLabel lblItemsAVenda = new JLabel("Items a venda");
        lblItemsAVenda.setBounds(59, 12, 122, 14);
        contentPane.add(lblItemsAVenda);
        
        JLabel lblSeuCarinhoDe = new JLabel("Carrinho de Compras");
        lblSeuCarinhoDe.setBounds(430, 12, 122, 14);
        contentPane.add(lblSeuCarinhoDe);
       
        JLabel lblValorDeCompra = new JLabel("Valor de Compra Atual do Carrinho:");
        lblValorDeCompra.setBounds(609, 12, 227, 14);
        contentPane.add(lblValorDeCompra);
        formattedTextField = new JFormattedTextField(0);
        kSession.setGlobal("JTextField", formattedTextField);
        formattedTextField.setBounds(612, 42, 89, 22);
        contentPane.add(formattedTextField);
       
        JButton btnAdicionarAoCarinho = new JButton("Adicionar");
        btnAdicionarAoCarinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setLinha(table.getSelectedRow());
                if(linha >= 0) {
	                Item i = new Item(tableModel.Items.get(getLinha()));
	                i.setAdicionarCarinho(true);
		    		i.setRemoverCarinho(false);
	                i.QuantidadeEmArmazem -= 1;
	                if(tableModel.Items.get(getLinha()).getQuantidadeEmArmazem() == 0)
	                {
	                    table.setValueAt(0, linha, 4);
	                }
	                else {
	                    kSession.insert(i);
	                    kSession.fireAllRules();
	                }
                }
               
               
            }
        });
        btnAdicionarAoCarinho.setBounds(129, 350, 89, 23);
        contentPane.add(btnAdicionarAoCarinho);
       
        JButton button = new JButton("Terminar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	numeroItems = listModel.getSize();
            	OptionPane.showMessageDialog(null,"Valor total a pagar : "+formattedTextField.getValue()+" €\n"+ " Quantidade de items comprados : " + numeroItems );
            	dispose();
            }
        });
       
           JTable j;
        button.setBounds(612, 113, 89, 23);
        contentPane.add(button);
        
        JButton btnRomver = new JButton("Remover");
        btnRomver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
	    		linhaLista = list2.getSelectedIndex();
	    		if(linhaLista >= 0) {
		    		Item i = new Item(listModel.get(linhaLista));
		    		i.setRemoverCarinho(true);
		    		i.setAdicionarCarinho(false);
		    		i.QuantidadeEmArmazem += 1;
	        		kSession.insert(i);
	        		kSession.fireAllRules();
        		}
        	}
        });
        btnRomver.setBounds(612, 77, 89, 23);
        contentPane.add(btnRomver);
   
 
   
               
        kSession.insert(lista);
    }
}