package model;

import java.util.Date;

public class Cupom {
	private Date data;
	private Cliente nomeCliente;
	private Integer idCliente;
	private double valorTotal;
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Cliente getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(Cliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
