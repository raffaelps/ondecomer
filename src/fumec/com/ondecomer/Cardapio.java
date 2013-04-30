package fumec.com.ondecomer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Cardapio extends Activity {

	private TextView txvProduto;
	private TextView txvIngredientes;
	private TextView txvValor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cardapio);
		
		this.txvProduto = (TextView) findViewById(R.id.txvProduto);
		this.txvIngredientes = (TextView) findViewById(R.id.txvIngredientes);
		this.txvValor = (TextView) findViewById(R.id.txvValor);
		
		this.carregarDados();
	}
	
	public void carregarDados()
	{
		txvProduto.setText("Frango com quiabo");
		txvIngredientes.setText("Frango - Quiabo");
		txvValor.setText("R$30,00");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_adm, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int opcao = item.getItemId();
		
		switch (opcao) {
		case R.id.action_dados_estabelecimento:
			Intent actDadosEstabelecimento= new Intent(this, DadosEstabelecimento.class);
			startActivity(actDadosEstabelecimento);
			break;
		case R.id.action_cardapio:
			break;
		case R.id.action_sair:
			Toast.makeText(this,"Sair",Toast.LENGTH_LONG).show();
			//Intent irmenualteraatleta= new Intent(this, FormularioAtleta.class);
			//startActivity(irmenualteraatleta);
			break;
		default:
			break;
		}
		
		
		return super.onOptionsItemSelected(item);
	}

}
