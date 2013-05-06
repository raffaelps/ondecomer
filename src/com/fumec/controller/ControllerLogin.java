package com.fumec.controller;

import com.fumec.modelo.UsuarioDTO;
import com.fumec.ondecomer.R;
import com.fumec.business.UsuarioImpl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ControllerLogin extends Activity {

	private EditText objLogin;
	private EditText objSenha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		objLogin = (EditText) findViewById (R.id.edtLogin);
		objSenha = (EditText) findViewById (R.id.edtSenha);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.menu_adm, menu);
		return false;
	}
	
	public void efetuarLogin(View v){

		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setLogin(objLogin.getText().toString());
		usuario.setSenha(objSenha.getText().toString());
		UsuarioImpl usuarioImpl = new UsuarioImpl();
		boolean retorno_validacao = usuarioImpl.validarLogin(usuario);
		
		if (retorno_validacao)
		{
			Intent intentListaEstabelecimentos = new Intent(ControllerLogin.this, ControllerAdmListaEstabelecimento.class);
			startActivity(intentListaEstabelecimentos);
		}
		else
		{
			Toast.makeText(this, usuario.getStatusLoginSenha(),Toast.LENGTH_LONG).show();
		}
	}
	
	public void limpar(View v){
		
		objLogin.setText("");
		objSenha.setText("");
	}
}
