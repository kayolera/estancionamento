package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class GravarFile {
	
	ArrayList listaGravar;
	private File path; 
	
	public <T> GravarFile(String pat) {
	
		path = new File(pat);
		listaGravar = new ArrayList();
		
		try {
			path.createNewFile();
			//this.path = arqquivo.getPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Erro! Não foi possivel criar o arquivo: "+e.getMessage());
			//e.printStackTrace();
		}
		//esconderArquivo();xa
		
		
		
	}
	
	
	
	public File getPath() {
		return path;
	}



	public void setPath(File path) {
		this.path = path;
	}



	public <T> void gravar(T ob) {
		//Verificar se ja tem objecto gravado
		
		//listaGravar.addAll(this.ler());
		//System.out.println(ob.toString());
		if(path.length() != 0) {
			listaGravar.addAll(this.ler());
		}
		
		listaGravar.add(ob);
		
		
		FileOutputStream escrever ;
		ObjectOutputStream persistir;
		try {
			escrever = new FileOutputStream(path,false);
			persistir = new ObjectOutputStream(escrever);
			persistir.writeObject(listaGravar);
			persistir.flush();
			persistir.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList ler(){
		ArrayList listaLeitura;
		if(path.length() == 0) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
			return null;
		}
		FileInputStream escrever ;
		ObjectInputStream persistir;
		try {
			escrever = new FileInputStream(path);
			persistir = new ObjectInputStream(escrever);
			
			listaLeitura = (ArrayList) persistir.readObject();
			persistir.close();
			return listaLeitura;
			
		} catch (Exception e) {
			// TODO: handle exception
			if(e instanceof FileNotFoundException) {
			 System.out.println("Arquivo não foi encontrado " + e.getMessage());
			}else {
				System.out.println(e.getMessage());
			}
			
		} 
		return null; 
	}
	
	private void esconderArquivo() {
		try {
			//para esconder o arquivo
			Process p = Runtime.getRuntime().exec("attrib +H " + this.getPath());
			// comando pra monstrar arquivo
			//Process p = Runtime.getRuntime().exec("attrib -H " + this.getPath());
			p.waitFor();
		//	if(this.path.isHidden())
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
