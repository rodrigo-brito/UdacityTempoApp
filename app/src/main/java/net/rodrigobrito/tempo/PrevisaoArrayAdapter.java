package net.rodrigobrito.tempo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import net.rodrigobrito.tempo.model.Previsao;

import java.util.ArrayList;

/**
 * Created by rodrigo on 26/08/16.
 */
public class PrevisaoArrayAdapter extends ArrayAdapter<Previsao> {
    public PrevisaoArrayAdapter(Context context, ArrayList<Previsao> previsoes) {
        super(context, 0, previsoes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Previsao previsao = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast, parent, false);
        }

//        ImageView imageView = (ImageView) convertView.findViewById(R.id.icon_previsao);
//        TextView data = (TextView) convertView.findViewById(R.id.data_previsao);
//        TextView temperatura = (TextView) convertView.findViewById(R.id.temperatura_previsao);
//        // Populate the data into the template view using the data object
//        int id_icon = R.drawable.warning;
//        String icon_name = previsao.getIcone();
//        if(icon_name != null) {
//            id_icon = convertView.getResources().getIdentifier("icon" + previsao.getIcone(), "drawable", this.getContext().getPackageName());
//            data.setText(previsao.getData());
//            temperatura.setText(previsao.getReadableTemperature());
//        }else{
//            data.setText(previsao.getData());
//            temperatura.setText("Previsão do tempo indisponível");
//        }
//        imageView.setImageResource( id_icon );
        return convertView;
    }
}