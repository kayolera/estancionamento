package view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class TelaInicial extends JFrame{
    private JButton btnCliente= new JButton("Clientes");
    private JButton btnFuncionario = new JButton("Funcionarios");
    private JButton btnCarro = new JButton("Carros");
    private JButton btnSair=new JButton("Sair");
    
    
    
  
    public TelaInicial(){
       setVisible(true);
       setTitle("Tela Inicial_Parque de estacionamento");
       this.setLocationRelativeTo(null);
       setBounds(10, 10, 20, 30);
       setSize(600, 500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       Container c = getContentPane();
       c.setLayout(new GridBagLayout());
       GridBagConstraints gbc = new GridBagConstraints();// manipular os campos 
       gbc.insets = new Insets(10,10,10,10);
        
      
      //butoes de cadastro de clientes
       
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.gridx=0;
      gbc.gridy=0;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      c.add(btnCliente,gbc);
      
      gbc.gridx=0;
      gbc.gridy=1;
      c.add(btnFuncionario,gbc);
      
      gbc.gridx=0;
      gbc.gridy=2;
      c.add(btnCarro,gbc);
      
      gbc.gridx=0;
      gbc.gridy=3;
      c.add(btnSair,gbc);
      
      
      
      
      //Cliente
      btnCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  new TelaClientes().setVisible(true);
                  TelaInicial.this.setVisible(false);
           }
       });
      btnFuncionario.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
                 new TelaFuncionario().setVisible(true);
                 TelaInicial.this.setVisible(false);
               
           }
       });
      btnCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
                  //new TelaLitarCliente().setVisible(true);
        	   new TelaCarro().setVisible(true);
        	   TelaInicial.this.setVisible(false);
               
           }
       });
      btnSair.addActionListener(new ActionListener() {// Verificar a informacao introduzida

          @Override
          public void actionPerformed(ActionEvent e) {
                 //new TelaLitarCliente().setVisible(true);
        	  System.exit(EXIT_ON_CLOSE);
              
          }
      });
     
    }
    public static void main(String[] a){
        TelaInicial tl=new TelaInicial();
}
    }




