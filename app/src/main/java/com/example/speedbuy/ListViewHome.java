package com.example.speedbuy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.fragments.Carrinho;
import com.example.speedbuy.fragments.Perfil;
import com.example.speedbuy.fragments.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListViewHome extends AppCompatActivity  {

    int [] imagesPerfil = {R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia,R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia, R.drawable.infoatual, R.drawable.americanas, R.drawable.leader, R.drawable.casasbahia};
    String [] nomeLoja = {"Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia", "Info Atual", "Americanas", "Leader", "Casas Bahia"};
    String [] textStar = {" 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios", " 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios", " 5.0 - Informatica", " 4.0 - Utilitarios", " 4.5 - Utilitarios", " 3.5 - Utilitarios"};
    String [] textTime = {" 20-30m", " 30-60m", " 1-2h"," 20-30m"," 20-30m", " 30-60m", " 1-2h"," 20-30m"," 20-30m", " 30-60m", " 1-2h"," 20-30m"};

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
                if (position==8){
                    
                }
            }
        });

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.car:
                    Carrinho timesFragment = new Carrinho();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bloco, timesFragment).commit();
                    FrameLayout fl = (FrameLayout) findViewById(R.id.bloco);
                    fl.setVisibility(View.VISIBLE);

                    return true;

                case R.id.search:
                    Search timesFragment2 = new Search();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bloco, timesFragment2).commit();
                    FrameLayout fl2 = (FrameLayout) findViewById(R.id.bloco);
                    fl2.setVisibility(View.VISIBLE);
                    return true;

                case R.id.perfil:
                    Perfil timesFragment3 = new Perfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bloco, timesFragment3).commit();
                    FrameLayout fl3 = (FrameLayout) findViewById(R.id.bloco);
                    fl3.setVisibility(View.VISIBLE);
                    return true;

                case R.id.home:
                    startActivity(new Intent (getApplicationContext(), ListViewHome.class));
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        }

    };







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
