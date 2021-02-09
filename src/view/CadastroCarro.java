/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.CarroControler;
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Carro;


public class CadastroCarro extends JFrame {


    private JLabel modelo = new JLabel("Modelo:");
    private JLabel marca = new JLabel("Marca:");
    private JLabel matricula = new JLabel("Matricular:");
    private JLabel cor = new JLabel("Cor:");
    private JTextField modField = new JTextField(16);
    private JTextField corField = new JTextField(16);
    private JTextField marField = new JTextField(16);
    private JTextField matField = new JTextField(16);
    private JTextField maField = new JTextField(16);
    private JButton limpar = new JButton("limpar");
    private JButton cadastrar = new JButton("Cadastrar");
    

    public CadastroCarro() {

       setVisible(true);
        JFrame janela = new JFrame();
        setSize(700, 500);
        Container c = getContentPane();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();// manipular os campos 
        gb.insets = new Insets(10, 10, 10, 10);
        c.setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        c.setLocation(300, 200);
        limpar.setBackground(Color.red);
        cadastrar.setBackground(Color.BLUE);
    
      
       // janela.setVisible(true);
        // tabelas
        gb.gridx = 0;
        gb.gridy = 0;
        c.add(modelo, gb);
        
         
        gb.gridx = 0;
        gb.gridy = 1;
        c.add(marca, gb);

        gb.gridx = 0;
        gb.gridy = 2;
        c.add(matricula, gb);

        gb.gridx = 0;
        gb.gridy = 3;
        c.add(cor, gb);

        //adicao de inputs
        gb.gridx = 1;
        gb.gridy = 0;
        c.add(modField, gb);

        gb.gridx = 1;
        gb.gridy = 1;
        c.add(marField, gb);

        gb.gridx = 1;
        gb.gridy = 2;
        c.add(matField, gb);

        gb.gridx = 1;
        gb.gridy = 3;
        c.add(corField, gb);
        // adic
        gb.gridx=0;
        gb.gridy=6;
        c.add(limpar,gb);
        
        gb.gridx=1;
        gb.gridy=6;
        c.add(cadastrar,gb);
        enventos();   
    }

    public void cadastro() {
        String cor  = this.corField.getText();
        String marca =this.maField.getText();
        String matricula=this.matField.getText();
        String modelo= this.modField.getText();
        
        Carro c = new Carro(matricula, modelo,cor,marca);
       
        CarroControler cc =  new CarroControler();
        
        cc.gravar(c);
       
    
        
        
    }
    
    public void enventos(){
        this.cadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(marField.getText().isEmpty() || modField.getText().isEmpty()|| matField.getText().isEmpty()|| corField.getText().isEmpty() ){
                   JOptionPane.showMessageDialog(CadastroCarro.this, "Todos Campos sao obrigatorios");  

                }else{
                cadastro();
                JOptionPane.showMessageDialog(null, "Gravado Com sucesso");
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            }
        });
        
        this.limpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                modField.setText("");
                maField.setText("");
                marField.setText("");
                matField.setText("");
                corField.setText("");
               
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    public static void main(String[] args) {
        CadastroCarro cr = new CadastroCarro();
        // cr .setSize(new Dimension(650, 450));// dimensao do painel
        cr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //cr.setVisible(true);



    }

  
   
}
