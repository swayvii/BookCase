package com.example.booklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookDetailsFragment extends Fragment {

    TextView tv;
    public BookDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_book_details, container, false);
        tv = (TextView) v.findViewById(R.id.book_title);
        Bundle b = getArguments();
        if(b!=null){
            String s = b.getString("s");
                tv.setText(s);

        }
        return v;
    }

}
