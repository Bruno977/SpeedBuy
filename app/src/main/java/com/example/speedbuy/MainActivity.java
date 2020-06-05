package com.example.speedbuy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        private BottomNavigationView.OnNavigationItemReselectedListener bottomNavigation = new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        list_view listViewHome = new list_view();
                        getSupportFragmentManager().beginTransaction().replace(R.id.linear_list, listViewHome).commit();
                        return true;
                }
                return false;
            }
        };
    }
}
