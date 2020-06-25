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

public class Leader extends AppCompatActivity {

    int [] imageProduto = {R.drawable.blusasocial, R.drawable.camisabrasil, R.drawable.blusasocial1, R.drawable.calca1, R.drawable.calca2, R.drawable.vasco1, R.drawable.vasco2, R.drawable.vasco3};
    String [] nomeProduto = {"Blusa", "Camisa", "Blusa", "Calça", "Calça", "Camisa", "Camisa", "Camisa"};
    String [] descricaoProduto = {"Blusa Social", "Camisa Brasil", "Blusa Social", "Calça", "Calça", "Camisa do vasco", "Camisa do vasco", "Camisa do vasco"};
    String [] precoProduto = {"R$ 100,00", "R$ 50,00" ,"R$ 120,00", "R$ 100,00", "R$ 120,00", "R$ 120,00", "R$ 120,00", "R$ 150,00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);

        ListView listView = findViewById(R.id.list_view_leader);

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
