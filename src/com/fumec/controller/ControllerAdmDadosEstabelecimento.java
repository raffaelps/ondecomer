package com.fumec.controller;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Gallery;
import android.widget.TextView;

import com.fumec.ondecomer.R;
import com.fumec.util.GaleriaAdapter;

public class ControllerAdmDadosEstabelecimento extends Activity {

	private TextView txvNome;
	private TextView txvEndereco;
	private TextView txvCidade;
	private TextView txvTelefone;
	private Gallery galEstabelecimento;
	private TextView txvNomeUsuario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adm_dados_estabelecimento);
		
		this.txvNome = (TextView) findViewById(R.id.txvNome);
		this.txvEndereco = (TextView) findViewById(R.id.txvEndereco);
		this.txvCidade = (TextView) findViewById(R.id.txvCidade);
		this.txvTelefone = (TextView) findViewById(R.id.txvTelefone);
		this.txvNomeUsuario = (TextView) findViewById(R.id.txvNomeUsuario);
		
		this.txvNomeUsuario.setText("leonardo");
		
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
		Intent actCardapio= new Intent(ControllerAdmDadosEstabelecimento.this, ControllerAdmDadosCardapio.class);
		startActivity(actCardapio);
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
		case R.id.opCadastrarEstabelecimento:
			Intent intentCadastrarEstabelecimento = new Intent(this,ControllerCadastroEstabelecimento.class);
			startActivity(intentCadastrarEstabelecimento);
			break;
		case R.id.opEditarEstabelecimento:
			Intent intentEditarEstabelecimento = new Intent(this,ControllerCadastroEstabelecimento.class);
			startActivity(intentEditarEstabelecimento);
			break;
		case R.id.opExcluirEstabelecimento:
			AlertDialog.Builder builder = new AlertDialog.Builder(ControllerAdmDadosEstabelecimento.this);
	        builder.setTitle("Excluir Estabelecimento")
	        .setMessage("Confirma a exclusão do estabelecimento: Buteco do Zeze?")
	        .setCancelable(false)
	        .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int id) {
	            }
	        })
	        .setNegativeButton("Não",new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int id) {
	                dialog.cancel();
	            }
	        });
	        AlertDialog alert = builder.create();
	        alert.show();
			break;
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
