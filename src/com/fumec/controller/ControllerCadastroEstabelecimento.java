package com.fumec.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

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
	private TextView txvNomeUsuario;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_estabelecimento);
		
		this.edtNomeEstabelecimento 			= (EditText) findViewById(R.id.edtNomeEstabelecimento);
		this.edtEnderecoEstabeleciomento		= (EditText) findViewById(R.id.edtEnderecoEstabelecimento);
		this.edtCidadeEstabelecimento 			= (EditText) findViewById(R.id.edtCidadeEstabelecimento);
		this.edtEstadoEstabelecimento 			= (EditText) findViewById(R.id.edtEstadoEstabelecimento);
		this.edtTelefoneEstabelecimento 		= (EditText) findViewById(R.id.edtTelefoneEstabelecimento);
		this.chcBoxFormaPagtoMaster				= (CheckBox) findViewById(R.id.chcBoxFormaPagtoMaster);
		this.chcBoxFormaPagtoVisa				= (CheckBox) findViewById(R.id.chcBoxFormaPagtoVisa);
		this.chcBoxFormaPagtoAmerican			= (CheckBox) findViewById(R.id.chcBoxFormaPagtoAmerican);
		this.chcBoxFormaPagtoDiscover			= (CheckBox) findViewById(R.id.chcBoxFormaPagtoDiscover);
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
