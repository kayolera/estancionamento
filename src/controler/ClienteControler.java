
package controler;

import java.util.ArrayList;

import model.Cliente;
import service.GravarFile;


public class ClienteControler {
	
	GravarFile factory;
	
	public ClienteControler() {
		factory = new GravarFile("Cliente.ko");
	}
    
      
    //File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Cliente.dat").toFile();

    public boolean gravar(Cliente cliente) {
    	try {
    		   factory.gravar(cliente);
    		   return true;
    	}catch (Exception e) {
			// TODO: handle exception
    		return false;
		}
     
     
    }

    // Retorna um arraylist de clientes

    public ArrayList<Cliente> lista() {
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
    
    
    
    

