package controler;

import java.util.ArrayList;

import model.Carro;
import service.GravarFile;

public class CarroControler {

    //File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Carros.dat").toFile();

    GravarFile factory;
	
	public CarroControler() {
		factory = new GravarFile("Carros.ko");
	}
    
      
    //File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Cliente.dat").toFile();

    public boolean gravar(Carro carro) {
    	try {
    		   factory.gravar(carro);
    		   return true;
    	}catch (Exception e) {
			// TODO: handle exception
    		return false;
		}
     
     
    }

    // Retorna um arraylist de clientes

    public ArrayList<Carro> lista() {
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
