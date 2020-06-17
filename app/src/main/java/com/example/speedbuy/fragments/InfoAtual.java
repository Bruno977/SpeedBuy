package com.example.speedbuy.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speedbuy.R;
import com.example.speedbuy.list_view;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoAtual extends Fragment {
    int [] imageProduto = {R.drawable.memoria, R.drawable.pc, R.drawable.headset};
    String [] nomeProduto = {"Memoria DDR4", "PC gamer", "HeadSet"};
    String [] descricaoProduto = {"Memoria HyperX DDR4 8GB", "PC gamer i7, GTX 1080, 16GB DDR4", "HeadSet HyperX"};
    String [] precoProduto = {"R$ 280,00", "R$ 1.800,000" ,"R$ 480,00"};

    public InfoAtual() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_atual, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getView().findViewById(R.id.list_view);

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
            View view = getLayoutInflater().inflate(R.layout.itens_list_view,null);

            CircleImageView circleImageView = view.findViewById(R.id.circle_image);
            TextView textViewNomeLoja = view.findViewById(R.id.text_nome);
            TextView textViewStar = view.findViewById(R.id.text_star);
            TextView textViewTime = view.findViewById(R.id.text_time);

            circleImageView.setImageResource(imageProduto[i]);
            textViewNomeLoja.setText(nomeProduto[i]);
            textViewStar.setText(descricaoProduto[i]);
            textViewTime.setText(precoProduto[i]);

            return view;
        }
    }
}
