
package model;

import java.io.Serializable;

public class Carro implements Serializable{
    private String matricula;
    private String modelo,cor,marcaa;

    public Carro(String matricula, String modelo, String cor, String marcaa) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cor = cor;
        this.marcaa = marcaa;
    }

 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarcaa() {
        return marcaa;
    }

    public void setMarcaa(String marcaa) {
        this.marcaa = marcaa;
    }
   
    
}
