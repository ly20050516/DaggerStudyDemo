package com.ly.application;

import android.app.Application;

import com.ly.base.BaseComponent;
import com.ly.base.DaggerBaseComponent;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/10.
 */

public class DaggerStudyApplication extends Application {

    BaseComponent mDaggerBaseComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        mDaggerBaseComponent = DaggerBaseComponent.builder().build();
    }

    public BaseComponent getDaggerBaseComponent() {
        return mDaggerBaseComponent;
    }
}