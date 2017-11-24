package com.hooooong.mvp.view.main.presenter;

import com.hooooong.mvp.data.SampleData;
import com.hooooong.mvp.view.main.adapter.contract.BasicContract;
import com.hooooong.mvp.view.main.contract.MainContract;
import com.hooooong.mvp.view.main.listener.OnItemClickListener;

import java.util.List;

/**
 * Created by Android Hong on 2017-11-24.
 */

public class MainPresenter implements MainContract.iPresenter, OnItemClickListener{

    private MainContract.iView view;
    private BasicContract.iView adapterView;
    private BasicContract.iModel adapterModel;

    @Override
    public void attachView(MainContract.iView view) {
        this.view = view;
    }

    @Override
    public void loadItem() {
        List<String> data = SampleData.getData();
        adapterModel.addItems(data);
        adapterView.notifyAdapter();
    }

    @Override
    public void setBasicAdapterModel(BasicContract.iModel model) {
        this.adapterModel = model;
    }

    @Override
    public void setBasicAdapterView(BasicContract.iView view) {
        this.adapterView = view;
        this.adapterView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(String text) {
        view.setText(text);
    }
}
