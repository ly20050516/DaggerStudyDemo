package com.ly.cloth;

import com.ly.book.annotation.PerActivity;
import com.ly.cloth.bean.Cloth;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/8.
 */

@Module
public class ClothesShopModule {

    @PerActivity
    @Named("red")
    @Provides
    public Cloth getRedCloth(){
        Cloth cloth = new Cloth();
        cloth.color = "red";
        return cloth;
    }

    @Named("blue")
    @Provides
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.color = "blue";
        return cloth;
    }
}
