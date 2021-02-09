package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class MarcarReserva implements Serializable {
	private Cliente cliente;
	private Carro carro;
	private LocalTime hora;
	private LocalDate data;
	private String referencia;
	
	
	
	
	public MarcarReserva(Cliente cliente, Carro carro, LocalTime hora, LocalDate data, String referencia) {
	
		this.cliente = cliente;
		this.carro = carro;
		this.hora = hora;
		this.data = data;
		this.referencia = referencia;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
	

}
