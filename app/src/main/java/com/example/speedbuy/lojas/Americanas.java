package com.example.speedbuy.lojas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Americanas extends AppCompatActivity {

    int [] imageProduto = {R.drawable.tv1, R.drawable.tv2, R.drawable.tv3, R.drawable.xiaomi8, R.drawable.cama, R.drawable.guardaroupa, R.drawable.geladeira, R.drawable.blusasocial};
    String [] nomeProduto = {"TV", "TV", "TV", "Celular","Cama", "Guarda-roupa", "Geladeira", "Blusa"};
    String [] descricaoProduto = {"Smart Tv Samsung", "Smart TV LG", "Smart TV Phillips", "Celular Xiaomi 8", "Cama de casal", "Guarda-roupa 5 portas", "Geladeira Inox", "Blusa Social"};
    String [] precoProduto = {"R$ 2.000", "R$ 1.800,000" ,"R$ 2.100", "R$ 2.000,00", "R$ 800,00", "R$ 600,00", "R$ 1.000,00", "R$ 100,00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americanas);

        ListView listView = findViewById(R.id.list_view_americanas);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
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
            TextView textViewTime = view.findViewById(R.id.text_preco);

            circleImageView.setImageResource(imageProduto[i]);
            textViewNomeLoja.setText(nomeProduto[i]);
            textViewStar.setText(descricaoProduto[i]);
            textViewTime.setText(precoProduto[i]);

            return view;
        }
    }
}
