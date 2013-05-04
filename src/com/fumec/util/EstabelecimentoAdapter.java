package com.fumec.util;

import java.util.ArrayList;

import com.fumec.modelo.EstabelecimentoDTO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fumec.ondecomer.R;

public class EstabelecimentoAdapter extends ArrayAdapter<EstabelecimentoDTO> {

	private ArrayList<EstabelecimentoDTO> listaEstabelecimentos;
	
	public EstabelecimentoAdapter(Context context, int textViewResourceId, ArrayList<EstabelecimentoDTO> lista) {
		super(context, textViewResourceId,lista);
		this.listaEstabelecimentos = lista;
	}

	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.list_estabelecimento, null);
            }
            
            EstabelecimentoDTO o = listaEstabelecimentos.get(position);
            
            if (o != null) {
                    TextView tt = (TextView) v.findViewById(R.id.nomeEstabelecimento);
                    TextView bt = (TextView) v.findViewById(R.id.cidadeEstabelecimento);
                    
                    if (tt != null) {
                          tt.setText(o.getNomeEstabelecimento());
                    }
                    
                    if(bt != null){
                          bt.setText(o.getCidadeEstabelecimento());
                    }
            }
            return v;
    }
}
