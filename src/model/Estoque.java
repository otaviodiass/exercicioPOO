package model;

public class Estoque {

	private Produto idProduto;
	private int quantProduto;
	private Produto nome;
	
	public Produto getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}
	public int getQuantProduto() {
		return quantProduto;
	}
	public void setQuantProduto(int quantProduto) {
		this.quantProduto = quantProduto;
	}
	public Produto getNome() {
		return nome;
	}
	public void setNome(Produto nome) {
		this.nome = nome;
	}
	
}
