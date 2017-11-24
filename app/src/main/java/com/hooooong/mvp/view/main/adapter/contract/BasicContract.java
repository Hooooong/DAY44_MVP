package com.hooooong.mvp.view.main.adapter.contract;

import com.hooooong.mvp.view.main.listener.OnItemClickListener;

import java.util.List;

/**
 * Created by Android Hong on 2017-11-24.
 */

public interface BasicContract {

    interface iView{
        void notifyAdapter();
        void setOnItemClickListener(OnItemClickListener listener);
    }

    interface iModel{
        void addItems(List<String> data);
    }
}
