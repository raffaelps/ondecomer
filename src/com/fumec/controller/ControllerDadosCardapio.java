package com.fumec.controller;

import java.util.ArrayList;

import com.fumec.modelo.ProdutoDTO;
import com.fumec.ondecomer.R;
import com.fumec.util.CardapioAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class ControllerDadosCardapio extends Activity {

	private ListView objListaProdutos;
	private ArrayList<ProdutoDTO> listaProdutos = null;
	private CardapioAdapter cardapioAdapter = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_cardapio);
		
		this.objListaProdutos = (ListView) findViewById(R.id.lstProdutos);
		
	    this.preencherListaProdutos();

	}
		
	protected void preencherListaProdutos()
	{
		ProdutoDTO produto1 = new ProdutoDTO();
		produto1.setNomeProduto("Batata frita");
		produto1.setDescricaoProduto("Batatinha frita acompanhada de bacon.");
		produto1.setPrecoProduto("30,00");
		produto1.setUnidadeProduto("Porção");
		
		ProdutoDTO produto2 = new ProdutoDTO();
		produto2.setNomeProduto("Petit Gateau");
		produto2.setDescricaoProduto("Petit Gateau a moda.");
		produto2.setPrecoProduto("80,00");
		produto2.setUnidadeProduto("Unidade");
		
		this.listaProdutos = new ArrayList<ProdutoDTO>();
		this.listaProdutos.add(produto1);
		this.listaProdutos.add(produto2);

        this.cardapioAdapter = new CardapioAdapter(this, R.layout.list_cardapio, listaProdutos);
        this.objListaProdutos.setAdapter(this.cardapioAdapter);
 
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
