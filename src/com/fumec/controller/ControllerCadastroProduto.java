package com.fumec.controller;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.fumec.ondecomer.R;




public class ControllerCadastroProduto extends Activity{

	private EditText edtNomeProduto;
	private EditText edtDescricaoProduto;
	private RadioGroup rdgroupTipoProduto;
	private RadioButton rdbuttonComida;
	private RadioButton rdbuttonBebida;
	private RadioButton rdbuttonSobremesa;
	private EditText edtPrecoProduto;
	private RadioGroup rdgroupUnidadeProduto;
	private RadioButton rdbuttonPorcao;
	private RadioButton rdbuttonUnidade;
	private RadioGroup rdgroupDisponibilidadeProduto;
	private RadioButton rdbuttonSim;
	private RadioButton rdbuttonNao;
	private TextView txvNomeUsuario;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_produto);
		
		this.edtNomeProduto 					= (EditText) findViewById(R.id.edtNomeProduto);
		this.edtDescricaoProduto				= (EditText) findViewById(R.id.edtDescricaoProduto);
		this.rdgroupTipoProduto 				= (RadioGroup) findViewById(R.id.rdGroupTipoProduto);
		this.rdbuttonComida 					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoComida);
		this.rdbuttonBebida 					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoBebida);
		this.rdbuttonSobremesa				= (RadioButton) findViewById(R.id.rdButtonTipoProdutoSobremesa);
		this.edtPrecoProduto					= (EditText) findViewById(R.id.edtprecoProduto);
		this.rdgroupUnidadeProduto			= (RadioGroup) findViewById(R.id.rdGroupUnidadeProduto);
		this.rdbuttonPorcao					= (RadioButton) findViewById(R.id.rdButtonUnidadeProdutoPorcao);  
		this.rdbuttonUnidade					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoUnidade);
		this.rdgroupDisponibilidadeProduto	= (RadioGroup) findViewById(R.id.rdGroupDisponibilidadeProduto);
		this.rdbuttonSim						= (RadioButton) findViewById(R.id.rdButtonDisponibilidadeProdutoSim);
		this.rdbuttonNao						= (RadioButton) findViewById(R.id.rdButtonDisponibilidadeProdutoNao);  		
		this.txvNomeUsuario 			= (TextView) findViewById(R.id.txvNomeUsuario);
		
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

