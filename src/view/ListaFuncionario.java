package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controler.FuncionarioControler;
import model.Funcionario;

public class ListaFuncionario extends JFrame {
  JTable  table = new JTable();
  DefaultTableModel model = new DefaultTableModel();
  JButton voltar;
  JScrollPane scroll;
  String headers[] = { "NOME", "APELIDO" , "ENDEREÇO"};
  

  public ListaFuncionario() {    
    model.setColumnIdentifiers(headers);   
    table.setModel(model);
    scroll = new JScrollPane(table);

    insert();
    this.setTitle("Lista de Funcionario: ");
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
			new TelaFuncionario().setVisible(true);
			ListaFuncionario.this.setVisible(false);
			
		}
	});
  }

  public void insert() {
   FuncionarioControler p = new FuncionarioControler();
  // this.setTitle(this.getTitle()+ "Mias de "+ p.lista().size() + " Carros");
   if(p.lista().size() > 0) {
	   for(Funcionario c: p.lista())
		   model.addRow( new Object[] {
				   c.getNome(),
				   c.getApelido(),
				   c.getEndereco()
		   });
   }

  }

  
  public static void main(String[] arg) {
		new ListaFuncionario().setVisible(true);
}
 
}
