package com.example.speedbuy.lojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.R;
import com.example.speedbuy.casacomputador.CasaComputadorMemoria;
import com.example.speedbuy.infocel.InfoCelIphone;

import de.hdodenhof.circleimageview.CircleImageView;

public class InfoCel extends AppCompatActivity {

    int [] imageProduto = {R.drawable.iphone8, R.drawable.motorola, R.drawable.samsung, R.drawable.samsung1, R.drawable.xiaomi8};
    String [] nomeProduto = {"Iphone", "Motorola", "Samsung", "Samsung", "Xiaomi"};
    String [] descricaoProduto = {"Iphone 8", "Motorola", "Samsung", "Samsung", "Xiaomi"};
    String [] precoProduto = {"R$ 5.000,00", "R$ 1.800,000" ,"R$ 1080,00", "R$ 2.000,00", "R$ 2.200,00", "R$ 1.300,00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cel);

        ListView listView = findViewById(R.id.list_view_infocel);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), InfoCelIphone.class);
                    startActivity(intent);
                }
                if (position==1){

                }
                if (position==2){

                }
                if (position==3){

                }
                if (position==4){

                }
                if (position==5){

                }
                if (position==6){

                }
                if (position==7){

                }
                if (position==8){

                }
            }
        });
    }
    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imageProduto.length;
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
            View view = getLayoutInflater().inflate(R.layout.activity_list_view_lojas,null);

            CircleImageView circleImageView = view.findViewById(R.id.circle_image_loja);
            TextView textViewNomeLoja = view.findViewById(R.id.text_nome_loja);
            TextView textViewStar = view.findViewById(R.id.text_descricao);
            TextView textViewPreco = view.findViewById(R.id.text_preco);

            circleImageView.setImageResource(imageProduto[i]);
            textViewNomeLoja.setText(nomeProduto[i]);
            textViewStar.setText(descricaoProduto[i]);
            textViewPreco.setText(precoProduto[i]);

            return view;
        }
    }
}
