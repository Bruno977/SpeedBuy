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
import com.example.speedbuy.casasbahia.CasasBahiaCama;

import de.hdodenhof.circleimageview.CircleImageView;

public class CasaComputador extends AppCompatActivity {

    int [] imageProduto = {R.drawable.memoria, R.drawable.pc1, R.drawable.headset, R.drawable.hdexterno, R.drawable.i58400, R.drawable.mousehyperx, R.drawable.ssd240kingston, R.drawable.ryzen5};
    String [] nomeProduto = {"Memoria DDR4", "PC gamer", "HeadSet", "HD externo", "Processador", "Mouse", "SSD", "Processador"};
    String [] descricaoProduto = {"Memoria HyperX DDR4 8GB", "PC gamer i7, GTX 1080, 16GB DDR4", "HeadSet HyperX", "HD Seagate USB 3.0 1TB Preto", "Processador Intel Core i5-9400F", "Mouse Gamer HyperX", "SSD Kingston A400, 240GB", "Processador AMD Ryzen 5"};
    String [] precoProduto = {"R$ 280,00", "R$ 1.700,000" ,"R$ 480,00", "R$ 250,00", "R$ 1.500,00", "R$ 120,00", "R$ 240,00", "R$ 1.500,00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_computador);

        ListView listView = findViewById(R.id.list_view_casacomputador);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), CasaComputadorMemoria.class);
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
