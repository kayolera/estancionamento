package controler;

import java.util.ArrayList;

import model.Carro;
import model.MarcarReserva;
import service.GravarFile;

public class MarcarReservaController {
	//File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Carros.dat").toFile();

    GravarFile factory;
	
	public MarcarReservaController() {
		factory = new GravarFile("MarcarReserva.ko");
	}
    
      
    //File ficheiro = Paths.get("C:\\Users\\Maywa\\OneDrive\\Documents\\NetBeansProjects\\Estacionamento\\Cliente.dat").toFile();

    public boolean gravar(MarcarReserva marca) {
    	try {
    		   factory.gravar(marca);
    		   return true;
    	}catch (Exception e) {
			// TODO: handle exception
    		return false;
		}
     
     
    }

    // Retorna um arraylist de clientes

    public ArrayList<MarcarReserva> lista() {
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
