package com.example.codelab_itcamp_ucsmonywa2019.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.codelab_itcamp_ucsmonywa2019.R;
import com.example.codelab_itcamp_ucsmonywa2019.data.vo.CountryVO;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountryItemViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.img_v_country_flag)
    ImageView ivFlag;

    @BindView(R.id.tv_name)
    TextView tvName;

    @BindView(R.id.tv_capital)
    TextView tvCaptial;

//    @BindView(R.id.tv_population)
//    TextView tvPopulation;

    public CountryItemViewHolder(@NonNull View itemView) {
        super(itemView);
//        ButterKnife.bind(this, itemView);
    }

    public void bindData(CountryVO dataObj){
//        tvName.setText(dataObj.getName());
//        tvCaptial.setText(dataObj.getCapital());
//        tvPopulation.setText(dataObj.getPopulation());
    }

}
