package teste;

import controler.CarroControler;
import controler.ClienteControler;
import model.Carro;
import model.Cliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GravarFile p = new GravarFile("String.txt");
		
		//Cliente c = new Cliente("Kayolera2", "Obadia", "Maputo Matola");
		
		//ClienteControler p = new ClienteControler();
		//p.gravar(c);
		
		Carro c = new Carro("MKD_024-MC", "Rate", "Preto", "Toyota");
		CarroControler p = new CarroControler();
		p.gravar(c);
		//p.gravar("Kayolera Filipe");
		
		for(Carro nome: p.lista()) {
			System.out.println(nome.getMatricula());
		}
		
	}

}
