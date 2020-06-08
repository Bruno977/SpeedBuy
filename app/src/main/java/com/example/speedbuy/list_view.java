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

import com.example.speedbuy.fragments.ListViewOpen;

import de.hdodenhof.circleimageview.CircleImageView;

public class list_view extends AppCompatActivity {

    int [] imagesPerfil = {R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia,R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia, R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia};
    String [] nomeLoja = {"Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia"};
    String [] textStar = {" 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios", " 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios", " 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios"};
    String [] textTime = {" 20-30m", " 30-60m", " 1-2h"," 20-30m"," 20-30m", " 30-60m", " 1-2h"," 20-30m"," 20-30m", " 30-60m", " 1-2h"," 20-30m"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.list_view);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getSupportFragmentManager().beginTransaction().add(R.id.linear_list, new ListViewOpen()).commit();
            }
        });

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
            TextView textViewNomeLoja = view.findViewById(R.id.text_nome);
            TextView textViewStar = view.findViewById(R.id.text_star);
            TextView textViewTime = view.findViewById(R.id.text_time);

            circleImageView.setImageResource(imagesPerfil[i]);
            textViewNomeLoja.setText(nomeLoja[i]);
            textViewStar.setText(textStar[i]);
            textViewTime.setText(textTime[i]);

            return view;
        }
    }
}
