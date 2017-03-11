package com.ly.book.bean;

import com.ly.book.annotation.PerActivity;
import javax.inject.Inject;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/10.
 */

@PerActivity
public class BookRoom {

    @Inject
    public BookShelf mBookShelf;

    @Inject
    public BookRoom(BookShelf bookShelf) {
        mBookShelf = bookShelf;
    }
}
