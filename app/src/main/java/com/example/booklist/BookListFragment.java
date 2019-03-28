package com.example.booklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookListFragment extends Fragment {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;
    public BookListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_book_list, container, false);
        lv =(ListView)v.findViewById(R.id.list1);

        al = new ArrayList<String>();

        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,al);

        lv.setAdapter(aa);

        al.add("Cat in The Hat");
        al.add("One Fish Two Fish");
        al.add("The Alchmist");
        al.add("No David!");
        al.add("Someone Swallowed a Fly");
        al.add("The New Jim Crow");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = al.get(position);
                MainActivity main = (MainActivity) getActivity();
                main.fl(s);

            }
        });


        return v;
    }

}
