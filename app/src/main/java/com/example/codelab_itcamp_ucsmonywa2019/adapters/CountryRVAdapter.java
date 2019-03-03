package com.example.codelab_itcamp_ucsmonywa2019.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.codelab_itcamp_ucsmonywa2019.R;
import com.example.codelab_itcamp_ucsmonywa2019.data.vo.CountryVO;
import com.example.codelab_itcamp_ucsmonywa2019.viewholders.CountryItemViewHolder;

import java.util.ArrayList;
import java.util.List;

public class CountryRVAdapter extends RecyclerView.Adapter<CountryItemViewHolder> {

    private ArrayList<CountryVO> mDataList;

    public CountryRVAdapter() {
        this.mDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public CountryItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryItemViewHolder countryItemViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

}
