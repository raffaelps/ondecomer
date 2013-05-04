package com.fumec.modelo;

public class UsuarioDTO {

	private String login;
	private String senha;
	private String statusLoginSenha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatusLoginSenha() {
		return statusLoginSenha;
	}
	public void setStatusLoginSenha(String statusLoginSenha) {
		this.statusLoginSenha = statusLoginSenha;
	}
	
	
}
