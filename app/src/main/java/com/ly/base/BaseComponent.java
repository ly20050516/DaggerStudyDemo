package com.ly.base;

import com.ly.market.SupperMarket;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/11.
 */

@Singleton
@Component(modules = {BaseModule.class})
public interface BaseComponent {
    SupperMarket getSupperMarket();
}
