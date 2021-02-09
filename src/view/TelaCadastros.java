//package view;
//
//import java.awt.Container;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Insets;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//
//class TelaCadastros extends JFrame{
//  
//    
//    
//    private JButton CadastrarCarro= new JButton("Cadastrar Carro");
//    private JButton ApagarCarro = new JButton("Apagar Carro");
//    private JButton ListarCarro = new JButton("Listar Carros");
//    private JButton PesquisarCarro = new JButton("Pesquisar Carro");
//    private JButton ActualizarCarro = new JButton("Actualizar Carro");
//    
//    private JButton CadastrarFuncionario= new JButton("Cadastrar Funcionario");
//    private JButton ApagarFuncionario = new JButton("Apagar Funcionario");
//    private JButton ListarFuncionario = new JButton("Listar Funcionarios");
//    private JButton PesquisarFuncionario = new JButton("Pesquisar Funcionario");
//    private JButton ActualizarFuncionario = new JButton("Actualizar Funcionario");
//    
//    
//    
//  
//    public TelaCadastros(){
//       setVisible(true);
//       setTitle("Cadastros");
//        setBounds(10, 10, 20, 30);
//       setSize(500, 400);
//       Container c = getContentPane();
//       c.setLayout(new GridBagLayout());
//       GridBagConstraints gbc = new GridBagConstraints();// manipular os campos 
//       gbc.insets = new Insets(10,10,10,10);
//        
//      
//      //butoes de cadastro de clientes
//       
//      gbc.fill = GridBagConstraints.BOTH;
//      gbc.anchor = GridBagConstraints.CENTER;
//      gbc.gridx=0;
//      gbc.gridy=0;
//      gbc.gridwidth = 1;
//      gbc.gridheight = 1;
//      c.add(CadastrarCliente,gbc);
//      
//      gbc.gridx=0;
//      gbc.gridy=1;
//      c.add(ApagarCliente,gbc);
//      
//      gbc.gridx=0;
//      gbc.gridy=2;
//      c.add(ListarCliente,gbc);
//      
//      gbc.gridx=0;
//      gbc.gridy=3;
//      c.add(PesquisarCliente,gbc);
//      
//      gbc.gridx=0;
//      gbc.gridy=4;
//      c.add(ActualizarCliente,gbc);
//      
//      //cadastro de Carro
//      gbc.gridx=1;
//      gbc.gridy=0;
//      c.add(CadastrarCarro,gbc);
//      
//      gbc.gridx=1;
//      gbc.gridy=1;
//      c.add(ApagarCarro,gbc);
//      
//      gbc.gridx=1;
//      gbc.gridy=2;
//      c.add(ListarCarro,gbc);
//      
//      gbc.gridx=1;
//      gbc.gridy=3;
//      c.add(PesquisarCarro,gbc);
//      
//      gbc.gridx=1;
//      gbc.gridy=4;
//      c.add(ActualizarCarro,gbc);
//      
//      //Funcionarios
//      gbc.gridx=3;
//      gbc.gridy=0;
//      c.add(CadastrarFuncionario,gbc);
//      
//      gbc.gridx=3;
//      gbc.gridy=1;
//      c.add(ApagarFuncionario,gbc);
//      
//      gbc.gridx=3;
//      gbc.gridy=2;
//      c.add(ListarFuncionario,gbc);
//      
//      gbc.gridx=3;
//      gbc.gridy=3;
//      c.add(PesquisarFuncionario,gbc);
//      
//      gbc.gridx=3;
//      gbc.gridy=4;
//      c.add(ActualizarFuncionario,gbc);
//      
//      
//      //Cliente
//      CadastrarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  new CadastroCliente().setVisible(true);
//               
//           }
//       });
//      ApagarCliente.addActionListener(new ActionListener() {
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                 new TelaApagar().setVisible(true);
//               
//           }
//       });
//      ListarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaLitarCliente().setVisible(true);
//               
//           }
//       });
//      ActualizarCliente.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaActualizar().setVisible(true);
//               
//           }
//       });
//      
//      
//         //Carro
//      CadastrarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  new CadastroCarro().setVisible(true);
//               
//           }
//       });
//      ApagarCarro.addActionListener(new ActionListener() {
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                 //new TelaApagarCarro().setVisible(true);
//               
//           }
//       });
//      ListarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaLitarCarroe().setVisible(true);
//               
//           }
//       });
//      ActualizarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaActualizarCarro().setVisible(true);
//               
//           }
//       });
//       //Funcionario
//      CadastrarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new CadastroFuncionario().setVisible(true);
//               
//           }
//       });
//      ApagarCarro.addActionListener(new ActionListener() {
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                 //new TelaApagarFuncionario().setVisible(true);
//               
//           }
//       });
//      ListarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaLitarFuncionario().setVisible(true);
//               
//           }
//       });
//      ActualizarCarro.addActionListener(new ActionListener() {// Verificar a informacao introduzida
//
//           @Override
//           public void actionPerformed(ActionEvent e) {
//                  //new TelaActualizarFuncionario().setVisible(true);
//               
//           }
//       });       
//      
//    }
//    public static void main(String[] a){
//        TelaCadastros tl=new TelaCadastros ();
//}
//    }
//
//
//
//
