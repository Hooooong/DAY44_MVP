package com.hooooong.mvp.view.main.contract;

import android.view.View;

import com.hooooong.mvp.view.main.adapter.contract.BasicContract;

/**
 * Created by Android Hong on 2017-11-24.
 */

public interface MainContract {

    interface iView{
        /**
         * View 를 반환하는 메소드
         * @return View
         */
        View getView();

        /**
         * Presenter 연결 메소드
         * @param presenter
         */
        void setPresenter(iPresenter presenter);

        /**
         * Text 변경 메소드
         * @param text
         */
        void setText(String text);
    }

    interface iPresenter{

        /**
         * View 연결 메소드
         * @param view
         */
        void attachView(iView view);

        /**
         * Item 불러오는 메소드
         */
        void loadItem();
        // BasicAdapter 의 Model(data) 와 상호작용

        /**
         * BasicAdapter 와 연결(Model)
         * @param model
         */
        void setBasicAdapterModel(BasicContract.iModel model);

        /**
         * BasicAdapter 와 연결(View)
         * @param view
         */
        void setBasicAdapterView(BasicContract.iView view);
    }
}
