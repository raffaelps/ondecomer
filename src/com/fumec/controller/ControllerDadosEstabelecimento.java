package com.fumec.controller;

import com.fumec.ondecomer.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ControllerDadosEstabelecimento extends Activity {

	private TextView txvNome;
	private TextView txvEndereco;
	private TextView txvCidade;
	private TextView txvTelefone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_estabelecimento);
		
		this.txvNome = (TextView) findViewById(R.id.txvNome);
		this.txvEndereco = (TextView) findViewById(R.id.txvEndereco);
		this.txvCidade = (TextView) findViewById(R.id.txvCidade);
		this.txvTelefone = (TextView) findViewById(R.id.txvTelefone);
		
		this.carregarDados();
	}
	
	public void carregarDados()
	{
		this.txvNome.setText("Casa do salgado");
		this.txvEndereco.setText("Rua Galba, 325, Floresta");
		this.txvCidade.setText("Belo Horizonte");
		this.txvTelefone.setText("(31) 3417-0987");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_adm, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int opcao = item.getItemId();
		
		switch (opcao) {
		case R.id.action_dados_estabelecimento:
			break;
		case R.id.action_cardapio:
			Intent actCardapio= new Intent(this, ControllerDadosCardapio.class);
			startActivity(actCardapio);
			break;
		case R.id.action_sair:
			Toast.makeText(this,"Sair",Toast.LENGTH_LONG).show();
			//Intent irmenualteraatleta= new Intent(this, FormularioAtleta.class);
			//startActivity(irmenualteraatleta);
			break;
		default:
			break;
		}
		
		
		return super.onOptionsItemSelected(item);
	}

}
