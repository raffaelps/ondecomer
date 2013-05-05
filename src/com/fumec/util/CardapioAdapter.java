package com.fumec.util;

import java.util.ArrayList;

import com.fumec.modelo.ProdutoDTO;
import com.fumec.ondecomer.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CardapioAdapter extends ArrayAdapter<ProdutoDTO> {

	private ArrayList<ProdutoDTO> listaProdutos;
	
	public CardapioAdapter(Context context, int textViewResourceId, ArrayList<ProdutoDTO> lista) {
		super(context, textViewResourceId, lista);
		this.listaProdutos = lista;
	}

	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.list_cardapio, null);
            }
            
            ProdutoDTO o = listaProdutos.get(position);
            
            if (o != null) {
                    TextView nomeProduto = (TextView) v.findViewById(R.id.nomeProduto);
                    TextView descricaoProduto = (TextView) v.findViewById(R.id.descricaoProduto);
                    TextView valorProduto = (TextView) v.findViewById(R.id.valorProduto);
                    
                    if (nomeProduto != null) {
                    	nomeProduto.setText(o.getNomeProduto());
                    }
                    
                    if(descricaoProduto != null){
                    	descricaoProduto.setText(o.getDescricaoProduto());
                    }
                    
                    if (valorProduto != null)
                    {
                    	valorProduto.setText("R$" + o.getPrecoProduto() + " (" + o.getUnidadeProduto() + ")");
                    }
            }
            return v;
    }
	
}
