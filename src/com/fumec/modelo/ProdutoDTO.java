package com.fumec.modelo;

public class ProdutoDTO {

	private int IdProduto;
	private String NomeProduto;
	private String DescricaoProduto;
	private String TipoProduto;
	private String PrecoProduto;
	private String UnidadeProduto;
	private boolean DisponibilidadeProduto;
	private String ClassificacaoProduto;
	public int getIdProduto() {
		return IdProduto;
	}
	public void setIdProduto(int idProduto) {
		IdProduto = idProduto;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public String getTipoProduto() {
		return TipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		TipoProduto = tipoProduto;
	}
	public String getPrecoProduto() {
		return PrecoProduto;
	}
	public void setPrecoProduto(String precoProduto) {
		PrecoProduto = precoProduto;
	}
	public String getUnidadeProduto() {
		return UnidadeProduto;
	}
	public void setUnidadeProduto(String unidadeProduto) {
		UnidadeProduto = unidadeProduto;
	}
	public boolean isDisponibilidadeProduto() {
		return DisponibilidadeProduto;
	}
	public void setDisponibilidadeProduto(boolean disponibilidadeProduto) {
		DisponibilidadeProduto = disponibilidadeProduto;
	}
	public String getClassificacaoProduto() {
		return ClassificacaoProduto;
	}
	public void setClassificacaoProduto(String classificacaoProduto) {
		ClassificacaoProduto = classificacaoProduto;
	}
	public String getDescricaoProduto() {
		return DescricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		DescricaoProduto = descricaoProduto;
	}
}
