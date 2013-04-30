package com.fumec.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fumec.ondecomer.R;

public class ControllerListaEstabelecimento extends Activity{
	
	
	ListView objListaEstabelecimentos;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_estabelecimentos);
		
		
		objListaEstabelecimentos = (ListView) findViewById(R.id.lista_estabelecimentos);
        
        String[] nomesEstabelecimentos={"Boteco do Zezé","Jack Tequila","Cantinho do João","Bar do Tião"}; //Conteiner de dados
        int layout = android.R.layout.simple_list_item_1;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,layout,nomesEstabelecimentos); 
        objListaEstabelecimentos.setAdapter(adapter);

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
		case R.id.efetuarLogin:
			Intent abrirView = new Intent(this,ControllerLogin.class);
			startActivity(abrirView);
			break;
		case R.id.lista_estabelecimentos:
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
		
	}
}
