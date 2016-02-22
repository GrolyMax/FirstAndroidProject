package com.example.first.firstandroidproject;

import android.graphics.drawable.shapes.RectShape;

import java.util.List;

/**
 * Created by Administrator on 2016/2/21.
 */
public class FirstTestClass extends RectShape {
    private List<String> list;

    public boolean add(){
        if("ast".equals("a")){
            return true;
        }else{
            return false;
        }
    }

}
