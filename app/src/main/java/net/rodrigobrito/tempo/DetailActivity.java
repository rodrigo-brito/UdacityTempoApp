package net.rodrigobrito.tempo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            TextView data = (TextView) findViewById(R.id.detail_data);
            TextView min = (TextView) findViewById(R.id.detail_tempMin);
            TextView max = (TextView) findViewById(R.id.detail_tempMax);
            ImageView icon = (ImageView) findViewById(R.id.detail_icon);

            data.setText((String) bundle.get("data"));
            min.setText((String) bundle.get("min"));
            max.setText((String) bundle.get("max"));
            int id_icon = getResources().getIdentifier( "icon"+(String) bundle.get("icon") , "drawable", getPackageName());
            icon.setImageResource(id_icon);
        }
    }
}
