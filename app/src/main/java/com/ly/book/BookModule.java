package com.ly.book;

import com.ly.book.annotation.EnglishBook;
import com.ly.book.annotation.MathBook;
import com.ly.book.bean.Book;
import dagger.Module;
import dagger.Provides;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/9.
 */

@Module
public class BookModule {

    @Provides
    @EnglishBook
    public Book getEnglishBook() {
        Book book = new Book();
        book.mName = "English";
        return book;
    }

    @Provides
    @MathBook
    public Book getMathBook() {
        Book book = new Book();
        book.mName = "Math";
        return book;
    }

}
