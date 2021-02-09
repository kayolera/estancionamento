///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;
//
//import java.awt.Button;
//import java.io.IOException;
//import javafx.event.ActionEvent;
//import javafx.scene.control.Alert;
//import javax.swing.JFrame;
//import model.Cliente;
///**
// *
// * @author Maywa
// */
//public class TelaApagar extends JFrame {
//    private Button ApagarCliente;
//    private String id;
//  
//    public void ApagarCliente(ActionEvent event) throws IOException {
//		try {
//			if (!(id.getBytes().toString().equals(""))) {
//				byte id = byte.parsebyte(id.getBytes().toString());
//				liente.remove(cliente);
//				Alert alert = new Alert(Alert.AlertType.INFORMATION, "Cliente removido com sucesso!");
//				alert.setTitle("Cliente removido");
//				alert.setHeaderText("Removido");
//				alert.showAndWait();
//                            
//                        } else {
//                            Long cPF = Long.parseLong(cpf.getText().toString());
//                            fachada.removerCliente(cPF);
//                            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Cliente removido com sucesso!");
//                            alert.setTitle("Cliente removido");
//				alert.setHeaderText("Removido");
//				alert.showAndWait();
//			}
//		} catch (CpfNaoExisteException cne) {
//			Alert alert = new Alert(Alert.AlertType.INFORMATION);
//			alert.setTitle("Falha ao remover");
//			alert.setHeaderText("Tente novamente");
//			alert.setContentText("N�o existe um cliente cadastrado com esse CPF!");
//			alert.showAndWait();
//		} 
//
//	}
//}
