package com.fumec.controller;

import com.fumec.ondecomer.R;
import com.fumec.modelo.UsuarioImpl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ControllerLogin extends Activity {

	private EditText objLogin;
	private EditText objSenha;
	private TextView objStatusLogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		objLogin = (EditText) findViewById (R.id.edtLogin);
		objSenha = (EditText) findViewById (R.id.edtSenha);
		objStatusLogin = (TextView) findViewById (R.id.txtStatusLogin);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.menu_adm, menu);
		return false;
	}
	
	public void efetuarLogin(View v){

		String login = objLogin.getText().toString();
		String senha = objSenha.getText().toString();
		UsuarioImpl usuario = new UsuarioImpl(login,senha);
		boolean retorno_validacao = usuario.validarLogin();
		
		if (retorno_validacao)
		{
			 			
		}
		else
		{
			objStatusLogin.setText(usuario.getStatusLoginSenha());
		}
	}
	
	public void limpar(View v){
		
		objLogin.setText("");
		objSenha.setText("");
	}
}
