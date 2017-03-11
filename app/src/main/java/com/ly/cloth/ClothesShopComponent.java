package com.ly.cloth;

import com.ly.base.BaseComponent;
import com.ly.book.annotation.PerActivity;
import com.ly.demo.MainActivity;
import dagger.Component;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/8.
 */
@PerActivity
@Component(modules = ClothesShopModule.class,dependencies = {BaseComponent.class})
public interface ClothesShopComponent {
    void inject(MainActivity mainActivity);
}
