package com.fumec.modelo;

public interface Usuario {
	
	public boolean validarLogin();
	
	public void setLogin(String value);
	
	public void setSenha(String value);
	
	public void setStatusLoginSenha(String value);
	
	public String getLogin();
	
	public String getSenha();
	
	public String getStatusLoginSenha();
	
	
	
}
