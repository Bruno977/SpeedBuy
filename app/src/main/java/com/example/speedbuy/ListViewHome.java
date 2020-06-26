package com.example.speedbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.lojas.Americanas;
import com.example.speedbuy.lojas.CasasBahia;
import com.example.speedbuy.lojas.InfoAtual;
import com.example.speedbuy.lojas.InfoCel;
import com.example.speedbuy.lojas.Leader;
import com.example.speedbuy.lojas.Maks;
import com.example.speedbuy.lojas.TonyLar;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListViewHome extends AppCompatActivity {

    int [] imagesPerfil = {R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia,R.drawable.casacomputador, R.drawable.infocel, R.drawable.maks, R.drawable.tonylar};
    String [] nomeLoja = {"Info Atual", "Americanas", "Leader", "Casas Bahia", "Casa do computador", "InfoCel", "Mak's", "Tony Lar"};
    String [] textStar = {" 5.0 - Informatica", " 4.0 - Produtos em gerais", " 4.5 - Acessorios", " 3.5 - Utilitarios", " 5.0 - Informatica", " 4.0 - Celulares", " 4.5 - Utilitarios", " 3.5 - Produtos em geral",};
    String [] textTime = {" 20-30m", " 30-60m", " 1-2h"," 20-30m"," 20-30m", " 30-60m", " 1-2h"," 20-30m"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_home);

        ListView listView = findViewById(R.id.list_view);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), InfoAtual.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(getApplicationContext(), Americanas.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(getApplicationContext(), Leader.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(getApplicationContext(), CasasBahia.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(getApplicationContext(), CasaComputador.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(getApplicationContext(), InfoCel.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(getApplicationContext(), Maks.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(getApplicationContext(), TonyLar.class);
                    startActivity(intent);
                }
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
            View view = getLayoutInflater().inflate(R.layout.itens_list_view_home,null);

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
