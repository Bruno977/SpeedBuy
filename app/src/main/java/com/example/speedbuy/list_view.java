package com.example.speedbuy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.fragments.Carrinho;
import com.example.speedbuy.fragments.InfoAtual;
import com.example.speedbuy.fragments.ListViewOpen;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class list_view extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

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
                getSupportFragmentManager().beginTransaction().add(R.id.linear_list, new InfoAtual()).commit();
            }
        });

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new Carrinho());


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.car:
                    Carrinho timesFragment = new Carrinho();
                    getSupportFragmentManager().beginTransaction().replace(R.id.linear_list, timesFragment).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.car:
                fragment = new Carrinho();
                break;

        }
        return loadFragment(fragment);

    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.car, fragment)
                    .commit();
            return true;
        }
        return false;
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
