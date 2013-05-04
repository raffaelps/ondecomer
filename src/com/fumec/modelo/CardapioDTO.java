package com.fumec.modelo;

import java.util.List;

public class CardapioDTO {

	private int IdCardapio;
	private List<ProdutoDTO> Produtos;
	private String PromocaoAtualCardapio;
	public int getIdCardapio() {
		return IdCardapio;
	}
	public void setIdCardapio(int idCardapio) {
		IdCardapio = idCardapio;
	}
	public List<ProdutoDTO> getProdutos() {
		return Produtos;
	}
	public void setProdutos(List<ProdutoDTO> produtos) {
		Produtos = produtos;
	}
	public String getPromocaoAtualCardapio() {
		return PromocaoAtualCardapio;
	}
	public void setPromocaoAtualCardapio(String promocaoAtualCardapio) {
		PromocaoAtualCardapio = promocaoAtualCardapio;
	}
	
	
}
