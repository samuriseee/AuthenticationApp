package com.example.authenticationapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView listview;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        listview = v.findViewById(R.id.listView);
        ArrayList<Transaction> arrayList = new ArrayList<>();
        arrayList.add(new Transaction(R.drawable.ic_baseline_local_dining_24,"Restaurant", "$100", "12/12/2020", "Debit"));
        arrayList.add(new Transaction(R.drawable.ic_baseline_star_outline_24,"Walmart", "$200", "12/12/2020", "Debit"));
        arrayList.add(new Transaction(R.drawable.love,"Target", "$300", "12/12/2020", "Debit"));
        arrayList.add(new Transaction(R.drawable.ic_baseline_local_dining_24,"Restaurant", "$400", "12/12/2020", "Debit"));
        arrayList.add(new Transaction(R.drawable.ic_baseline_star_outline_24,"Amazon", "$500", "12/12/2020", "Debit"));

        ListApdater transactionAdapter = new ListApdater(getActivity(),R.layout.list_row, arrayList);
        listview.setAdapter(transactionAdapter);
/*        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.list_row, arrayList);
        listview.setAdapter(arrayAdapter);
*//*        listview.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getActivity(), DetailsActivity.class);
            intent.putExtra("name", arrayList.get(position).getName());
            intent.putExtra("amount", arrayList.get(position).getAmount());
            intent.putExtra("date", arrayList.get(position).getDate());
            intent.putExtra("type", arrayList.get(position).getType());
            intent.putExtra("image", arrayList.get(position).getImage());
            startActivity(intent);
        });*/

        return v;
    }

}