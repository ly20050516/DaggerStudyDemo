package com.ly.book;

import com.ly.base.BaseComponent;
import com.ly.book.annotation.PerActivity;
import com.ly.demo.FullscreenActivity;
import dagger.Component;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/9.
 */

@PerActivity
@Component(modules = BookModule.class,dependencies = {BaseComponent.class})
public interface BookComponent {
    void inject(FullscreenActivity fullscreenActivity);
}
