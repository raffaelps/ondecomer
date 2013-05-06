package com.fumec.controller;

import java.util.ArrayList;

import com.fumec.modelo.EstabelecimentoDTO;
import com.fumec.ondecomer.R;
import com.fumec.util.EstabelecimentoAdapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class ControllerAdmListaEstabelecimento extends Activity {

	private ListView objListaEstabelecimentos;
	private ArrayList<EstabelecimentoDTO> listaEstabelecimentos = null;
	private EstabelecimentoAdapter estabelecimentoAdapter = null;
	private TextView txvNomeUsuario;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adm_lista_estabelecimento);
	    
		this.objListaEstabelecimentos = (ListView) findViewById(R.id.lstAdmEstabelecimentos);
		this.txvNomeUsuario = (TextView) findViewById(R.id.txvNomeUsuario);
		
		this.txvNomeUsuario.setText("leonardo");
        
        this.preencherListaEstabelecimentos();
	}
	
	protected void preencherListaEstabelecimentos()
	{
		EstabelecimentoDTO estabelecimento1 = new EstabelecimentoDTO();
		estabelecimento1.setNomeEstabelecimento("Buteco do Zeze");
		estabelecimento1.setEnderecoEstabelecimento("Rua das Xucas");
		estabelecimento1.setCidadeEstabelecimento("Baixo Guandu");
		
		EstabelecimentoDTO estabelecimento2 = new EstabelecimentoDTO();
		estabelecimento2.setNomeEstabelecimento("Buteco do Kalil");
		estabelecimento2.setEnderecoEstabelecimento("Rua das Bibas");
		estabelecimento2.setCidadeEstabelecimento("Belo Horizonte");
		
		listaEstabelecimentos = new ArrayList<EstabelecimentoDTO>();
		listaEstabelecimentos.add(estabelecimento1);
		listaEstabelecimentos.add(estabelecimento2);

        this.estabelecimentoAdapter = new EstabelecimentoAdapter(this, R.layout.list_estabelecimento, listaEstabelecimentos);
        objListaEstabelecimentos.setAdapter(this.estabelecimentoAdapter);
        
        objListaEstabelecimentos.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> adapter, View view, int posicao, long id) {
				Intent intent = new Intent(ControllerAdmListaEstabelecimento.this,ControllerAdmDadosEstabelecimento.class);
				startActivity(intent);
			}
        });
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
			AlertDialog.Builder builder = new AlertDialog.Builder(ControllerAdmListaEstabelecimento.this);
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
