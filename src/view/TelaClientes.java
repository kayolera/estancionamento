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

public class TelaClientes extends JFrame {
      private JButton CadastrarCliente= new JButton("Cadastrar Cliente");
      private JButton ApagarCliente = new JButton("Apagar Cliente");
      private JButton ListarCliente = new JButton("Listar Clientes");
      private JButton PesquisarCliente = new JButton("Pesquisar Cliente");
      private JButton ActualizarCliente = new JButton("Actualizar Cliente");
      private JButton btnVoltar = new JButton("Voltar");
      private JButton btnSair=new JButton("Sair");
     
      
      public TelaClientes(){
      setVisible(true);
      setTitle("Cliente");
      setBounds(10, 10, 20, 30);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
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
      c.add(CadastrarCliente,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=1;
      c.add(ApagarCliente,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=2;
      c.add(ListarCliente,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=3;
      c.add(PesquisarCliente,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=4;
      c.add(ActualizarCliente,gbc);
      
     
     
      gbc.gridx=0;
      gbc.gridy=5;
      c.add(btnSair,gbc);
      
    
      gbc.gridx=2;
      gbc.gridy=5;
      c.add(btnVoltar,gbc);
      
      
      
      
      
      CadastrarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new CadastroCliente().setVisible(true);
                  TelaClientes.this.setVisible(false);
               
           }
       });
      ApagarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new ApagarCliente().setVisible(true);
               
           }
       });
      ListarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
        	   new ListaCliente().setVisible(true);
        	   TelaClientes.this.setVisible(false);
                  //new TelaLitarFuncionario().setVisible(true);
               
           }
       });
    
       PesquisarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaActualizarFuncionario().setVisible(true);
               
           }
       }); 
        btnSair.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaActualizarFuncionario().setVisible(true);
        	   System.exit(EXIT_ON_CLOSE);
               
           }
       }); 
        btnVoltar.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new TelaInicial().setVisible(true);
                  TelaClientes.this.setVisible(false);
               
           }
       }); 
}
     public static void main(String[] a){
        TelaClientes tc=new TelaClientes();
} 
      }

  
