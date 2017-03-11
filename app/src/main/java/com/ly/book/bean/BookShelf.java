package com.ly.book.bean;

import javax.inject.Inject;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/9.
 */

public class BookShelf {

    public Book mBook;
    @Inject
    public BookShelf() {

    }

    @Override
    public String toString() {
        return mBook.mName + " BookShelf";
    }
}
