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

import controler.CarroControler;
import model.Carro;

public class ListaCarro extends JFrame {
  JTable  table = new JTable();
  DefaultTableModel model = new DefaultTableModel();
  JButton voltar;
  JScrollPane scroll;
  String headers[] = { "Matricula", "Marca" ,"Modelo","Cor"};
  

  public ListaCarro() {    
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
			new TelaCarro().setVisible(true);
			ListaCarro.this.setVisible(false);
			
		}
	});
  }

  public void insert() {
   CarroControler p = new CarroControler();
   this.setTitle(this.getTitle()+ "Mias de "+ p.lista().size() + " Carros");
   if(p.lista().size() > 0) {
	   for(Carro c: p.lista())
		   model.addRow( new Object[] {
				   c.getMatricula(),
				   c.getMarcaa(),
				   c.getModelo(),
				   c.getCor()
		   });
   }

  }

  
  public static void main(String[] arg) {
		new ListaCarro().setVisible(true);
}
 
}
