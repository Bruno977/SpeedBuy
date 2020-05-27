package com.example.speedbuy;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class list_view_Fragment extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view_, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView listView = getView().findViewById(R.id.list_view);
        ArrayList<Lojas> lojas = new ArrayList<>();
        Lojas loja = new Lojas();
        loja.setNome("Info Atual");
        loja.setFoto(R.drawable.infoatual);
        lojas.add(loja);

        ArrayAdapter<Lojas> lojasAdapter = new ArrayAdapter<Lojas>(getContext(), R.layout.itens_list_view, lojas);
        listView.setAdapter(lojasAdapter);

    }
}
