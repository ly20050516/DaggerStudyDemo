package com.ly.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.ly.application.DaggerStudyApplication;
import com.ly.cloth.ClothesShopModule;
import com.ly.cloth.DaggerClothesShopComponent;
import com.ly.cloth.bean.Chest;
import com.ly.cloth.bean.Cloth;
import com.ly.cloth.bean.Clothes;

import com.ly.market.SupperMarket;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Named("red")
    @Inject
    Cloth mRedCloth;

    @Named("blue")
    @Inject
    Cloth mBlueCloth;

    @Inject
    Clothes mClothes;

    @Inject
    Chest mChest;

    @Inject
    SupperMarket mSupperMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerClothesShopComponent
          .builder()
          .baseComponent(((DaggerStudyApplication)getApplication()).getDaggerBaseComponent())
          .clothesShopModule(new ClothesShopModule())
          .build()
          .inject(this);

        Log.d("LiuYan", "onCreate: mRedCloth " + mRedCloth);
        Log.d("LiuYan", "onCreate: mBlueCloth " + mBlueCloth);
        Log.d("LiuYan", "onCreate: mClothes " + mClothes);
        Log.d("LiuYan", "onCreate: mClothes.mCloth == mRedCloth " + (mClothes.mCloth == mRedCloth));
        Log.d("LiuYan", "onCreate: mChest.mClothes == mClothes " + (mChest.mClothes == mClothes));
        Log.d("LiuYan", "onCreate: mSupperMarket " + mSupperMarket);
        gotoFullScreenActivity();
    }

    private void gotoFullScreenActivity() {
        Intent intent = new Intent(MainActivity.this,FullscreenActivity.class);
        startActivity(intent);
    }
}
