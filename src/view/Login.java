package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    private JLabel username = new JLabel("Username");
    private JLabel password = new JLabel("Password");
    private JTextField userField = new JTextField(15);
    private JPasswordField passField = new JPasswordField(15);
    private JButton btnLogar = new JButton("Login");
    
   public Login(){
      
       Container c = getContentPane();
       c.setLayout(new GridBagLayout());
       GridBagConstraints gbc = new GridBagConstraints();// manipular os campos 
      gbc.insets = new Insets(10,10,10,10);
       //adicao de labels
       gbc.gridx=0;
       gbc.gridy=0;
       c.add(username,gbc);
       
       gbc.gridx=0;
       gbc.gridy=1;
       c.add(password,gbc);
       
       //adicao de inputs
       gbc.gridx=1;
       gbc.gridy=0;
       c.add(userField, gbc);
       
       gbc.gridx=1;
       gbc.gridy=1;
       c.add(passField,gbc);
       
       //adicao do buttons
       gbc.gridx=1;
       gbc.gridy=2;
       c.add(btnLogar,gbc);
       
      btnLogar.addActionListener(new ActionListener() {// Verificar a informacao introduzida

           @Override
           public void actionPerformed(ActionEvent e) {
               String senha = new String ( passField.getPassword());
              if(userField.getText().isEmpty() || senha.isEmpty() ){
                  JOptionPane.showMessageDialog(Login.this, "Todos Campos sao obrigatorios");
                  
              }
              else if (senha.equals("Admi") && userField.getText().equals("Super")){
                  new TelaInicial().setVisible(true);
                  //Login.this.setVisible(false);
              }else{
                   JOptionPane.showMessageDialog(Login.this, "UserName ou Password e invalido"); 
              }
           }
       });
   }
   public  void m(){
    JFrame janela =new JFrame();
    janela.setVisible(true);
    janela.setSize(600, 400);
    
}
   public  void create(){
       
   }
   
     public static void main(String[] args) {
        Login log = new Login();
        log.setSize(new Dimension(650, 450));
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
        log.setVisible(true);
     
}
}