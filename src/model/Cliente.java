/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	
	private String telefone;

    public Cliente(String nome, String apelido, String endereco,String cell) {
        super(nome, apelido, endereco);
        this.telefone = cell;
        
    }
    private String id;
   

//    public Cliente(String id, String nome, String apelido, String endereco) {
//        super(nome, apelido, endereco);
//        this.id = id;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
    
    
}
