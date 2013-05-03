package com.fumec.modelo;

public class UsuarioImpl implements Usuario {

	private String login;
	private String senha;
	private String statusLoginSenha;
	
	public UsuarioImpl(String login, String senha){
		this.login = login;
		this.senha = senha;
	}
	
	@Override
	public boolean validarLogin() {

		statusLoginSenha = "";
		
		if (!login.equals("leo")){
			this.setStatusLoginSenha("Login inválido");
		}
		else if (!senha.equals("12345")){
			this.setStatusLoginSenha("Senha inválida");
		}
			
		if (statusLoginSenha.equals("")) {
			return true;
		}
		else {
			return false;
		}
					
	}

	@Override
	public void setLogin(String value) {
		this.login = value;
		
	}

	@Override
	public void setSenha(String value) {
		this.senha = value;
		
	}

	@Override
	public void setStatusLoginSenha(String value) {
		this.statusLoginSenha = value;
		
	}

	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		return login;
	}

	@Override
	public String getSenha() {
		// TODO Auto-generated method stub
		return senha;
	}

	@Override
	public String getStatusLoginSenha() {
		// TODO Auto-generated method stub
		return statusLoginSenha;
	}
	
	

}
