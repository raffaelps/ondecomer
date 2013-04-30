package com.fumec.controller;

import com.fumec.ondecomer.R;
import com.fumec.modelo.UsuarioImpl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
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
		getMenuInflater().inflate(R.menu.menu_adm, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		int opcao = item.getItemId();
		
		switch (opcao){
		case R.id.efetuarLogin:
			break;
		case R.id.lista_estabelecimentos:
			Intent abrirView = new Intent(this,ControllerListaEstabelecimento.class);
			startActivity(abrirView);
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
		
	}
	

	
	public void EfetuarLogin(View v){

		String login = objLogin.getText().toString();
		String senha = objSenha.getText().toString();
		UsuarioImpl usuario = new UsuarioImpl(login,senha);
		usuario.ValidarLogin();
		
		objStatusLogin.setText(usuario.getStatusLoginSenha());
	}
	
	public void Limpar(View v){
		
		objLogin.setText("");
		objSenha.setText("");
	}
}
