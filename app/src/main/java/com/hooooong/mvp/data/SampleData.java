package com.hooooong.mvp.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Hong on 2017-11-24.
 */

public class SampleData {

    private static final String TAG = "SampleData";

    public static List<String> getData(){
        List<String> dummy = new ArrayList<>();
        for(int i = 0 ; i<20; i++){
            dummy.add("data : " + i);
        }
        return dummy;
    }
}
