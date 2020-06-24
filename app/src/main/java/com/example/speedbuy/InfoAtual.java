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

import com.example.speedbuy.infoatual.InfoAtualMemoria;

import de.hdodenhof.circleimageview.CircleImageView;

public class InfoAtual extends AppCompatActivity {

    int [] imageProduto = {R.drawable.memoria, R.drawable.pc, R.drawable.headset};
    String [] nomeProduto = {"Memoria DDR4", "PC gamer", "HeadSet"};
    String [] descricaoProduto = {"Memoria HyperX DDR4 8GB", "PC gamer i7, GTX 1080, 16GB DDR4", "HeadSet HyperX"};
    String [] precoProduto = {"R$ 280,00", "R$ 1.800,000" ,"R$ 480,00"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_atual);

        ListView listView = findViewById(R.id.list_view_infoatual);

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), InfoAtualMemoria.class);
                    startActivity(intent);
                }
                if (position==1){

                }
                if (position==2){

                }
                if (position==3){

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
