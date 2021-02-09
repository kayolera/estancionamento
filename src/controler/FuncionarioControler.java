package controler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Carro;
import model.Funcionario;
import service.GravarFile;

/**
 *
 * @author Maywa
 */
public class FuncionarioControler {
   // File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Cliente.dat").toFile();

    GravarFile factory;
	
	public FuncionarioControler() {
		factory = new GravarFile("Funcionarios.ko");
	}
    
      
    //File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Cliente.dat").toFile();

    public boolean gravar(Funcionario func) {
    	try {
    		   factory.gravar(func);
    		   return true;
    	}catch (Exception e) {
			// TODO: handle exception
    		return false;
		}
     
     
    }

    // Retorna um arraylist de clientes

    public ArrayList<Funcionario> lista() {
     return factory.ler();
    }

    // metodo para remover dados

    public void remover(String id) {

     

    }

    // metodo para  pesquisar os clientes os existentes

    public boolean pesquisar(String nome) {
    return false;
    
    }
}
