package com.hooooong.mvp.view.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hooooong.mvp.view.main.contract.MainContract;
import com.hooooong.mvp.view.main.presenter.MainPresenter;
import com.hooooong.mvp.view.main.view.MainView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainContract.iView mainView = new MainView(this);
        MainContract.iPresenter mainPresenter = new MainPresenter();

        mainPresenter.attachView(mainView);
        mainView.setPresenter(mainPresenter);

        setContentView(mainView.getView());
    }
}
