package com.fumec.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.fumec.modelo.EstabelecimentoDTO;
import com.fumec.ondecomer.R;
import com.fumec.util.EstabelecimentoAdapter;

public class ControllerListaEstabelecimento extends Activity{
	
	private ListView objListaEstabelecimentos;
	private AutoCompleteTextView actCidades;
	private ArrayList<EstabelecimentoDTO> listaEstabelecimentos = null;
	private EstabelecimentoAdapter estabelecimentoAdapter = null;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_estabelecimentos);
	    
		this.objListaEstabelecimentos = (ListView) findViewById(R.id.lstEstabelecimentos);
		this.setActCidades((AutoCompleteTextView) findViewById(R.id.actCidades));
        
        this.preencherListaEstabelecimentos();
        this.preencherListaCidades();
	}
	
	protected void preencherListaCidades()
	{
		String[] listaCidadesAux = {
			"Baixo Guandu",
			"Belo Horizonte",
			"Rio de Janeiro",
			"São Paulo",
			"Vitória"
		};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,listaCidadesAux);
		AutoCompleteTextView acTextView = (AutoCompleteTextView)findViewById(R.id.actCidades);
		acTextView.setThreshold(1);
		acTextView.setAdapter(adapter);
	}
	
	protected void preencherListaEstabelecimentos()
	{
		EstabelecimentoDTO estabelecimento1 = new EstabelecimentoDTO();
		estabelecimento1.setNomeEstabelecimento("Buteco do Zeze");
		estabelecimento1.setEnderecoEstabelecimento("Rua das Xucas");
		estabelecimento1.setCidadeEstabelecimento("Baixo Guandu");
		
		EstabelecimentoDTO estabelecimento2 = new EstabelecimentoDTO();
		estabelecimento2.setNomeEstabelecimento("Buteco do Kalil");
		estabelecimento2.setEnderecoEstabelecimento("Rua das Bicas");
		estabelecimento2.setCidadeEstabelecimento("Belo Horizonte");
		
		listaEstabelecimentos = new ArrayList<EstabelecimentoDTO>();
		listaEstabelecimentos.add(estabelecimento1);
		listaEstabelecimentos.add(estabelecimento2);

        this.estabelecimentoAdapter = new EstabelecimentoAdapter(this, R.layout.list_estabelecimento, listaEstabelecimentos);
        objListaEstabelecimentos.setAdapter(this.estabelecimentoAdapter);
        
        objListaEstabelecimentos.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> adapter, View view, int posicao, long id) {
				Intent intent = new Intent(ControllerListaEstabelecimento.this,ControllerDadosEstabelecimento.class);
				startActivity(intent);
			}
        	
        });
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

	public AutoCompleteTextView getActCidades() {
		return actCidades;
	}

	public void setActCidades(AutoCompleteTextView actCidades) {
		this.actCidades = actCidades;
	}
}
