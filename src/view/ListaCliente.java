package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//from   ww w .  java  2 s. co m
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controler.ClienteControler;
import model.Cliente;

public class ListaCliente extends JFrame {
  JTable  table = new JTable();
  DefaultTableModel model = new DefaultTableModel();
  JButton voltar;
  JScrollPane scroll;
  String headers[] = { "NOME", "APELIDO" ,"TELEFONE","ENDEREÇO"};
  

  public ListaCliente() {    
    model.setColumnIdentifiers(headers);   
    table.setModel(model);
    scroll = new JScrollPane(table);

    insert();
    this.setTitle("Lista de Cliente: ");
    this.getContentPane().setBackground( Color.WHITE );
    
    voltar = new JButton("Voltar");
    
    this.add(voltar, BorderLayout.NORTH);
    add(scroll, BorderLayout.CENTER);
    setSize(700, 500);
    this.setLocationRelativeTo(null);
    setVisible(true);
    voltar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new TelaClientes().setVisible(true);
			ListaCliente.this.setVisible(false);
			
		}
	});
  }

  public void insert() {
   ClienteControler p = new ClienteControler();
   this.setTitle(this.getTitle()+ "Mias de "+ p.lista().size() + " clientes");
   if(p.lista().size() > 0) {
	   for(Cliente c: p.lista())
		   model.addRow( new Object[] {
				   c.getNome(),
				   c.getApelido(),
				   c.getTelefone(),
				   c.getEndereco()
		   });
   }

  }

  public static void main(String[] args) {
    new ListaCliente();
  }
}
