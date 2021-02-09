/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Maywa
 */
public class TelaCarro extends JFrame {
       private JButton CadastrarCarro= new JButton("Cadastrar Carro");
      //private JButton ApagarCarro = new JButton("Apagar Carro");
      private JButton ListarCarro = new JButton("Listar Carro");
      private JButton PesquisarCarro = new JButton("Pesquisar Carro");
      private JButton ActualizarCarro = new JButton("Actualizar Carro");
      private JButton btnVoltar = new JButton("Voltar");
      private JButton btnSair=new JButton("Sair");
     
      
      public TelaCarro(){
      setVisible(true);
      setTitle("Funcionario");
      setBounds(10, 10, 20, 30);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      setSize(500, 400);
      Container c = getContentPane();
      c.setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();// manipular os campos 
      gbc.insets = new Insets(10,10,10,10);
      
      
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridx=1;
      gbc.gridy=0;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      c.add(CadastrarCarro,gbc);
      
//      gbc.fill = GridBagConstraints.BOTH;
//      gbc.anchor = GridBagConstraints.CENTER;
//      gbc.gridwidth = 1;
//      gbc.gridheight = 1;
//      gbc.gridx=1;
//      gbc.gridy=1;
//      c.add(ApagarCarro,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=2;
      c.add(ListarCarro,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=3;
      c.add(PesquisarCarro,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=4;
      c.add(ActualizarCarro,gbc);
      
     
     
      gbc.gridx=0;
      gbc.gridy=5;
      c.add(btnSair,gbc);
      
    
      gbc.gridx=2;
      gbc.gridy=5;
      c.add(btnVoltar,gbc);
      
      
      
      
      
      CadastrarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new CadastroCarro().setVisible(true);
                  TelaCarro.this.setVisible(false);
               
           }
       });
//      ApagarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new ApagarCliente().setVisible(true);
//               
//           }
//       });
      ListarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new ListaCarro().setVisible(true);
                  TelaCarro.this.setVisible(false);
               
           }
       });
      
      btnVoltar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			  new TelaInicial().setVisible(true);
              TelaCarro.this.setVisible(false);
			
		}
	});
       
       PesquisarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaActualizarFuncionario().setVisible(true);
        	   
               
           }
       });   
}
     public static void main(String[] a){
        TelaCarro tc=new TelaCarro();
}

//    private void setTitle(String funcionario) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setSize(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setBounds(int i, int i0, int i1, int i2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Container getContentPane() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
    
