package com.example.booklist;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fManager;

    Boolean singlePane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singlePane = findViewById(R.id.container_2) == null;


        fManager = getSupportFragmentManager();


        fManager.beginTransaction().replace(R.id.container_1,new BookListFragment()).commit();


    }



    public void fl(String s){


        BookDetailsFragment bdFragment = new BookDetailsFragment();
        Bundle b = new Bundle();
        b.putString("s", s);
        bdFragment.setArguments(b);
        if(!singlePane) {
            fManager.beginTransaction().replace(R.id.container_2, bdFragment).addToBackStack(null).commit();
        }else{
            fManager.beginTransaction().replace(R.id.container_1, bdFragment).addToBackStack(null).commit();
        }

    }


}
