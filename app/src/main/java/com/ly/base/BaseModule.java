package com.ly.base;

import com.ly.market.SupperMarket;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/11.
 */

@Module
public class BaseModule {

    @Singleton
    @Provides
    public SupperMarket getSupperMarket() {
        SupperMarket supperMarket = new SupperMarket();
        return supperMarket;
    }
}
