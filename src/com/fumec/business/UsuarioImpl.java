package com.fumec.business;

import com.fumec.modelo.UsuarioDTO;

public class UsuarioImpl{

	public boolean validarLogin(UsuarioDTO usuario) {

		usuario.setStatusLoginSenha("");
		
		if (!usuario.getLogin().equals("leo")){
			usuario.setStatusLoginSenha("Login invalido");
		}
		else if (!usuario.getSenha().equals("12345")){
			usuario.setStatusLoginSenha("Senha invalida");
		}
			
		if (usuario.getStatusLoginSenha().equals("")) {
			return true;
		}
		else {
			return false;
		}
					
	}
}
