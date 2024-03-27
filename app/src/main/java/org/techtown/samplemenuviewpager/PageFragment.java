package org.techtown.samplemenuviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    TextView textView;
    String name;

    public static PageFragment newInstance(String name){
        PageFragment fragment= new PageFragment();

        Bundle bundle= new Bundle();
        bundle.putString("name",name);
        fragment.setArguments(bundle);

        return fragment;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        name = bundle.getString("name");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView=(ViewGroup) inflater.inflate(R.layout.page,container,false);

        textView=rootView.findViewById(R.id.textView);
        textView.setText(name);

        return rootView;
    }
}
