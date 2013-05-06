package com.fumec.controller;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;

import com.fumec.ondecomer.R;




public class ControllerCadastroEstabelecimento extends Activity{


	private EditText edtNomeEstabelecimento;
	private EditText edtEnderecoEstabeleciomento;
	private EditText edtCidadeEstabelecimento;
	private EditText edtEstadoEstabelecimento;
	private EditText edtTelefoneEstabelecimento;
	private CheckBox chcBoxFormaPagtoMaster;
	private CheckBox chcBoxFormaPagtoVisa;
	private CheckBox chcBoxFormaPagtoAmerican;
	private CheckBox chcBoxFormaPagtoDiscover;
	private RatingBar rtnBarClassificacaoEstabelecimento;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_estabelecimento);
		
		edtNomeEstabelecimento 				= (EditText) findViewById(R.id.edtNomeEstabelecimento);
		edtEnderecoEstabeleciomento			= (EditText) findViewById(R.id.edtEnderecoEstabelecimento);
		edtCidadeEstabelecimento 			= (EditText) findViewById(R.id.edtCidadeEstabelecimento);
		edtEstadoEstabelecimento 			= (EditText) findViewById(R.id.edtEstadoEstabelecimento);
		edtTelefoneEstabelecimento 			= (EditText) findViewById(R.id.edtTelefoneEstabelecimento);
		chcBoxFormaPagtoMaster				= (CheckBox) findViewById(R.id.chcBoxFormaPagtoMaster);
		chcBoxFormaPagtoVisa				= (CheckBox) findViewById(R.id.chcBoxFormaPagtoVisa);
		chcBoxFormaPagtoAmerican			= (CheckBox) findViewById(R.id.chcBoxFormaPagtoAmerican);
		chcBoxFormaPagtoDiscover			= (CheckBox) findViewById(R.id.chcBoxFormaPagtoDiscover);        
		rtnBarClassificacaoEstabelecimento 	= (RatingBar) findViewById(R.id.rtnBarClassficacaoEstabelecimento);
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
