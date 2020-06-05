package com.example.speedbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class list_view extends AppCompatActivity {

    int [] imagesPerfil = {R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia,R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia, R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia};
    String [] nomeLoja = {"Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(this, );
                startActivity(i);
            }
        });
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class  CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imagesPerfil.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.itens_list_view,null);

            CircleImageView circleImageView = view.findViewById(R.id.circle_image);
            TextView textView = view.findViewById(R.id.text_nome);

            circleImageView.setImageResource(imagesPerfil[i]);
            textView.setText(nomeLoja[i]);

            return view;
        }
    }
}
