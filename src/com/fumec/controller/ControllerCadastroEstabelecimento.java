package com.fumec.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.fumec.ondecomer.R;

public class ControllerCadastroEstabelecimento extends Activity{

	private TextView txvNomeUsuario;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_estabelecimento);
		
		this.txvNomeUsuario 					= (TextView) findViewById(R.id.txvNomeUsuario);
		
		this.txvNomeUsuario.setText("leonardo");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_cadastro, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		int opcao = item.getItemId();
		
		switch (opcao){
		case R.id.opSair:
			Intent intentListaEstabelecimentos = new Intent(this,ControllerListaEstabelecimento.class);
			startActivity(intentListaEstabelecimentos);
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
		
	}
}
