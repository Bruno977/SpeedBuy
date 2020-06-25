package com.example.speedbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CasasBahia extends AppCompatActivity {

    int [] imageProduto = {R.drawable.cama, R.drawable.geladeira, R.drawable.guardaroupa, R.drawable.tv1, R.drawable.tv2, R.drawable.xiaomi8, R.drawable.sofa};
    String [] nomeProduto = {"Cama", "Geladeira", "Guarda-roupa", "TV", "TV", "Celular", "Sofa"};
    String [] descricaoProduto = {"Cama de casal", "Geladeira inox", "Guarda-roupa 5 portas", "TV curved", "TV LG", "Celular Xiaomi 8", "Sofa Austin"};
    String [] precoProduto = {"R$ 800,00", "R$ 1.800,000" ,"R$ 880,00", "R$ 2.000,00", "R$ 2.200,00", "R$ 1.300,00", "1.300,00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casas_bahia);

        ListView listView = findViewById(R.id.list_view_casasbahia);

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
            TextView textViewPreco = view.findViewById(R.id.text_preco);

            circleImageView.setImageResource(imageProduto[i]);
            textViewNomeLoja.setText(nomeProduto[i]);
            textViewStar.setText(descricaoProduto[i]);
            textViewPreco.setText(precoProduto[i]);

            return view;
        }
    }
}
