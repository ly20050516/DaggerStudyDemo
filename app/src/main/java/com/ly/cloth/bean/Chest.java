package com.ly.cloth.bean;

import javax.inject.Inject;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/9.
 */

public class Chest {
    public Clothes mClothes;

    @Inject
    public Chest(Clothes clothes) {
        mClothes = clothes;
    }
}
