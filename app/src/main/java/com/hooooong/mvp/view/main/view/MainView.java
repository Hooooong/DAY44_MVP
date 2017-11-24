package com.hooooong.mvp.view.main.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.hooooong.mvp.R;
import com.hooooong.mvp.view.main.adapter.BasicAdapter;
import com.hooooong.mvp.view.main.contract.MainContract;

/**
 * Created by Android Hong on 2017-11-24.
 */

public class MainView implements MainContract.iView{

    private MainContract.iPresenter presenter;

    private Context context;
    private View view;
    private TextView textView;
    private RecyclerView recyclerView;
    private BasicAdapter basicAdapter;

    public MainView(Context context){
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
        initView();
        setAdapter();
    }

    /**
     * View 초기화
     */
    private void initView() {
        textView = view.findViewById(R.id.textView);
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    /**
     * RecyclerView 와 Adapter Setting
     */
    private void setAdapter() {
        basicAdapter = new BasicAdapter(context);
        recyclerView.setAdapter(basicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override
    public View getView() {
        return view;
    }

    /**
     * Presenter 연결
     * Presenter 에 Adapter 연결 및
     * Presenter 에 Item Load 요청
     * @param presenter
     */
    @Override
    public void setPresenter(MainContract.iPresenter presenter) {
        this.presenter = presenter;
        presenter.setBasicAdapterView(basicAdapter);
        presenter.setBasicAdapterModel(basicAdapter);

        presenter.loadItem();
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }
}
