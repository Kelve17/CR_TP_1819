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
 
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
 
public class GUI extends JFrame {
 
    private JPanel contentPane;
    private ItemTableModel tableModel;
    private ListaItems lista =  new ListaItems();
    private JTable table;
    private DefaultListModel<Item> listModel;
    private int linha;
    private JFormattedTextField formattedTextField;
    private float sum = 0;
 
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
       
       
        table = new JTable(tableModel);
        kSession.setGlobal("table", table);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.setBounds(30, 59, 122, 158);
        JScrollPane scrollPane1 = new JScrollPane(table);
        JList image = new JList();
        image.setCellRenderer(new ImageRender());
       
 
       
        scrollPane1.setBounds(10, 37, 290, 300);
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
                int id = (int) table.getValueAt(linha, 0);
                float preco = (float) table.getValueAt(linha, 1);
                String nome = (String)table.getValueAt(linha, 2);
                TipoItem tipo = (TipoItem) table.getValueAt(linha, 3);
                int stock = (int) table.getValueAt(linha, 4);
                Item i = new Item(id, preco, nome, tipo, null, stock-1);
                if(stock == 0)
                {
                    table.setValueAt(0, linha, 4);
                }
                else {
                    kSession.insert(i);
                    kSession.fireAllRules();
                }
               
               
            }
        });
        btnAdicionarAoCarinho.setBounds(306, 63, 89, 23);
        contentPane.add(btnAdicionarAoCarinho);
       
        JButton button = new JButton("Terminar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null,"Valor total a pagar : "+formattedTextField.getValue()+" �");
            	dispose();
            }
        });
       
           JTable j;
        button.setBounds(306, 115, 89, 23);
        contentPane.add(button);
   
 
   
               
        kSession.insert(lista);
    }
}