package com.ly.cloth.bean;

import com.ly.book.annotation.PerActivity;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/9.
 */

@PerActivity
public class Clothes {

    public Cloth mCloth;

    @Inject
    public Clothes(@Named("red") Cloth cloth) {
        mCloth = cloth;
    }

    @Override
    public String toString() {
        return mCloth + " Clothes";
    }
}
