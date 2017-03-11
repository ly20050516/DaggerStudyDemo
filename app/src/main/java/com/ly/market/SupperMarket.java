package com.ly.market;

import android.util.Log;

import com.ly.book.bean.Book;
import com.ly.cloth.bean.Clothes;

/**
 * Created by zhuoying.ly@alibaba-inc.com on 2017/3/10.
 */

public class SupperMarket {

    public static final String TAG = "LiuYan";
    public void saleClothes(Clothes clothes) {
        Log.d(TAG, "saleClothes: " + clothes);
    }

    public void saleBooks(Book book) {
        Log.d(TAG, "saleBooks: " + book);
    }
}
