/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controler.ClienteControler;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cliente;

/**
 *
 * @author t
 */
public class CadastroCliente extends JFrame {
    
    
    private JLabel nome = new JLabel("Nome:");
    private JLabel apelido = new JLabel("Apelido:");
    private JLabel endereco = new JLabel("Endereco:");
    private JLabel telefone = new JLabel("Telefone:");
    private JLabel Id=new JLabel("Id");
    private JTextField nomeField = new JTextField(16);
    private JTextField apeliField = new JTextField(16);
    private JTextField enderField = new JTextField(16); 
    private JTextField teleField = new JTextField(16);
    private JTextField IdField= new JTextField(16);
    private JButton limpar = new JButton("limpar");
    private JButton cadastrar = new JButton("Cadastrar");
    
    public  CadastroCliente(){
        
        setVisible(true);
       
        setSize(700, 500);
        this.getContentPane().setBackground( Color.WHITE );
        this.setLocationRelativeTo(null);
        Container c = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();// manipular os campos 
        
       // c.setBackground(Color.LIGHT_GRAY);
        
        gb.insets = new Insets(10, 10, 10, 10);
  
        //j.add(c)
     // tabelas
        gb.gridx = 0;
        gb.gridy = 0;
        c.add(nome, gb);
        
         
        gb.gridx = 0;
        gb.gridy = 1;
        c.add(apelido, gb);

        gb.gridx = 0;
        gb.gridy = 2;
        c.add(endereco, gb);

        gb.gridx = 0;
        gb.gridy = 3;
        c.add(telefone, gb);
        
        gb.gridx = 0;
        gb.gridy = 4;
        c.add(Id, gb);
        

        //adicao de inputs
        gb.gridx = 1;
        gb.gridy = 0;
        c.add(nomeField, gb);

        gb.gridx = 1;
        gb.gridy = 1;
        c.add(apeliField, gb);

        gb.gridx = 1;
        gb.gridy = 2;
        c.add(enderField, gb);
        
        gb.gridx = 1;
        gb.gridy = 3;
        c.add(teleField, gb);
        
        gb.gridx = 1;
        gb.gridy = 4;
        c.add(IdField, gb);


        // adic
        gb.gridx=0;
        gb.gridy=6;
        c.add(limpar,gb);
        
        gb.gridx=1;
        gb.gridy=6;
        c.add(cadastrar,gb);
       // JLabel jl = new JLabel("Sexo:");
        //jl.setBounds(50, 190, 100, 30);
        //c.add(jl);
        eventos();
        
        
        
    }
    public void cadastro() {
        String nome  = this.nomeField.getText();
        String apelido =this.apeliField.getText();
        String endereco=this.enderField.getText();
        String telefone= this.teleField.getText();
        
        Cliente c = new Cliente(nome, apelido,endereco,telefone);
        
      
        ClienteControler cc=  new ClienteControler();
        
        cc.gravar(c);
     
        
        
        
    }
    
    public void eventos(){
        this.cadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(nomeField.getText().isEmpty() || apeliField.getText().isEmpty()|| enderField.getText().isEmpty()|| teleField.getText().isEmpty() ){
                  JOptionPane.showMessageDialog(CadastroCliente.this, "Todos Campos sao obrigatorios");  
                 }
                else{
                    cadastro();
                JOptionPane.showMessageDialog(null, "Cliente gravado Com sucesso");
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
                        
//                 else if ( new TelaInicial().setVisible(true));
//                  //Login.this.setVisible(false);)
                 
              }
        });
        
        this.limpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               nomeField.setText("");
               apeliField.setText("");
               enderField.setText("");
               teleField.setText("");
                
               
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
     public static void main(String[] args) {
        CadastroCliente cl=new CadastroCliente();
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);

 
    }
}
