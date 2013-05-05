package com.fumec.util;

import com.fumec.ondecomer.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GaleriaAdapter extends BaseAdapter {

	private Context contexto;
	
	private Integer[] mImageIds = {
		R.drawable.buteco1,
		R.drawable.buteco2,
		R.drawable.buteco3
    };
	
	public GaleriaAdapter(Context c) {
		contexto = c;
	}

	@Override
	public int getCount() {
		return mImageIds.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView i = new ImageView(contexto);

        i.setImageResource(mImageIds[position]);
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setLayoutParams(new Gallery.LayoutParams(136, 88));
        return i;
	}

}
