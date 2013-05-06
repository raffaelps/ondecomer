package com.fumec.controller;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

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
	private RatingBar rtnBarClassificacaoProduto;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_produto);
		
		edtNomeProduto 					= (EditText) findViewById(R.id.edtNomeProduto);
		edtDescricaoProduto				= (EditText) findViewById(R.id.edtDescricaoProduto);
		rdgroupTipoProduto 				= (RadioGroup) findViewById(R.id.rdGroupTipoProduto);
		rdbuttonComida 					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoComida);
		rdbuttonBebida 					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoBebida);
		rdbuttonSobremesa				= (RadioButton) findViewById(R.id.rdButtonTipoProdutoSobremesa);
		edtPrecoProduto					= (EditText) findViewById(R.id.edtprecoProduto);
		rdgroupUnidadeProduto			= (RadioGroup) findViewById(R.id.rdGroupUnidadeProduto);
		rdbuttonPorcao					= (RadioButton) findViewById(R.id.rdButtonUnidadeProdutoPorcao);  
		rdbuttonUnidade					= (RadioButton) findViewById(R.id.rdButtonTipoProdutoUnidade);
		rdgroupDisponibilidadeProduto	= (RadioGroup) findViewById(R.id.rdGroupDisponibilidadeProduto);
		rdbuttonSim						= (RadioButton) findViewById(R.id.rdButtonDisponibilidadeProdutoSim);
		rdbuttonNao						= (RadioButton) findViewById(R.id.rdButtonDisponibilidadeProdutoNao);  		
		rtnBarClassificacaoProduto 		= (RatingBar) findViewById(R.id.rtnBarClassficacaoProduto);
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

