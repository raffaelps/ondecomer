package com.fumec.controller;

import java.util.ArrayList;

import com.fumec.modelo.ProdutoDTO;
import com.fumec.ondecomer.R;
import com.fumec.util.CardapioAdapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class ControllerAdmDadosCardapio extends Activity {

	private ListView objListaProdutos;
	private ArrayList<ProdutoDTO> listaProdutos = null;
	private CardapioAdapter cardapioAdapter = null;
	private TextView txvNomeUsuario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adm_dados_cardapio);
		
		this.objListaProdutos = (ListView) findViewById(R.id.lstProdutos);
		this.txvNomeUsuario = (TextView) findViewById(R.id.txvNomeUsuario);
		
		this.txvNomeUsuario.setText("leonardo");
		
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
		getMenuInflater().inflate(R.menu.menu_adm_cardapio, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		int opcao = item.getItemId();
		
		switch (opcao){
		case R.id.opCadastrarProduto:
			//Intent intentCadastrarEstabelecimento = new Intent(this,ControllerCadastrarEstabelecimento.class);
			//startActivity(intentCadastrarEstabelecimento);
			break;
		case R.id.opEditarProduto:
			//Intent intentCadastrarEstabelecimento = new Intent(this,ControllerCadastrarEstabelecimento.class);
			//startActivity(intentCadastrarEstabelecimento);
			break;
		case R.id.opExcluirProduto:
			AlertDialog.Builder builder = new AlertDialog.Builder(ControllerAdmDadosCardapio.this);
	        builder.setTitle("Excluir Produto")
	        .setMessage("Confirma a exclusão do produto: Batata frita?")
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
