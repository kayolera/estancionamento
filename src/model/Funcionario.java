
package model;

import java.io.Serializable;


public class Funcionario extends Pessoa implements Serializable{

    public Funcionario(String nome, String apelido, String endereco) {
        super(nome, apelido, endereco);
    }
    
    private String tipoFunc;
    private String senha;

    public Funcionario(String tipoFunc, String senha, String nome, String apelido, String endereco) {
        super(nome, apelido, endereco);
        this.tipoFunc = tipoFunc;
        this.senha = senha;
    }

    public String getTipoFunc() {
        return tipoFunc;
    }

    public void setTipoFunc(String tipoFunc) {
        this.tipoFunc = tipoFunc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
