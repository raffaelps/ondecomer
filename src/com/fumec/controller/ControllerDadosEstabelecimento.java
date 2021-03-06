package com.fumec.controller;

import com.fumec.ondecomer.R;
import com.fumec.util.GaleriaAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Gallery;
import android.widget.TextView;

public class ControllerDadosEstabelecimento extends Activity {

	private TextView txvNome;
	private TextView txvEndereco;
	private TextView txvCidade;
	private TextView txvTelefone;
	private Gallery galEstabelecimento;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_estabelecimento);
		
		this.txvNome = (TextView) findViewById(R.id.txvNome);
		this.txvEndereco = (TextView) findViewById(R.id.txvEndereco);
		this.txvCidade = (TextView) findViewById(R.id.txvCidade);
		this.txvTelefone = (TextView) findViewById(R.id.txvTelefone);
		
		this.galEstabelecimento = (Gallery) findViewById(R.id.galEstabelecimento);
		this.galEstabelecimento.setSpacing(3);
		this.galEstabelecimento.setAdapter(new GaleriaAdapter(this));

		this.carregarDados();
	}
	
	public void carregarDados()
	{
		this.txvNome.setText("Casa do salgado");
		this.txvEndereco.setText("Rua Galba, 325, Floresta");
		this.txvCidade.setText("Belo Horizonte");
		this.txvTelefone.setText("(31) 3417-0987");
	}
	
	public void abrirCardapio(View view)
	{
		Intent actCardapio= new Intent(ControllerDadosEstabelecimento.this, ControllerDadosCardapio.class);
		startActivity(actCardapio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_user, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		int opcao = item.getItemId();
		
		switch (opcao){
		case R.id.efetuarLogin:
			Intent intent_login = new Intent(this,ControllerLogin.class);
			startActivity(intent_login);
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
		
	}

}
