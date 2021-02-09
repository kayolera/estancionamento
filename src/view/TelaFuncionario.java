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
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Maywa
 */
public class TelaFuncionario extends JFrame {
      private JButton CadastrarFuncionario= new JButton("Cadastrar Funcionario");
      private JButton ApagarFuncionario = new JButton("Apagar Funcionario");
      private JButton ListarFuncionario = new JButton("Listar Funcionario");
      private JButton PesquisarFuncionario = new JButton("Pesquisar Funcionario");
      private JButton ActualizarFuncionario = new JButton("Actualizar Funcionario");
      private JButton btnVoltar = new JButton("Voltar");
      private JButton btnSair=new JButton("Sair");
     
      
      public TelaFuncionario(){
      setVisible(true);
      setTitle("Funcionario");
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
      c.add(CadastrarFuncionario,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=1;
      c.add(ApagarFuncionario,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=2;
      c.add(ListarFuncionario,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=3;
      c.add(PesquisarFuncionario,gbc);
      
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      gbc.gridx=1;
      gbc.gridy=4;
      c.add(ActualizarFuncionario,gbc);
      
     
     
      gbc.gridx=0;
      gbc.gridy=5;
      c.add(btnSair,gbc);
      
    
      gbc.gridx=2;
      gbc.gridy=5;
      c.add(btnVoltar,gbc);
      
      
      
      
      
      CadastrarFuncionario.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new CadastroCliente().setVisible(true);
                  TelaFuncionario.this.setVisible(false);
               
           }
       });
      ApagarFuncionario.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new ApagarCliente().setVisible(true);
               
           }
       });
      ListarFuncionario.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaLitarFuncionario().setVisible(true);
        	   new ListaFuncionario().setVisible(true);
        	   TelaFuncionario.this.setVisible(false);
               
           }
       });
   
      btnVoltar.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaActualizarFuncionario().setVisible(true);
        	   new TelaInicial().setVisible(true);
        	   TelaFuncionario.this.setVisible(false);
           }
       });   

      btnSair.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
              System.exit(EXIT_ON_CLOSE);
           }
       }); 
    
}
     public static void main(String[] a){
        TelaFuncionario tf=new TelaFuncionario();
}
}
