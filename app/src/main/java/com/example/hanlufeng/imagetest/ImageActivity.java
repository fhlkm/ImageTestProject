package com.example.hanlufeng.imagetest;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by hanlu.feng on 11/18/2016.
 */
public class ImageActivity extends Activity {
    private ImageView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);
        mView =(ImageView) findViewById(R.id.detail_card_stroke_image);
    }

    @Override
    protected void onDestroy() {

        Log.i(ImageActivity.class.getName(),"onDestroy");
        if(null == mView){
            return ;
        }
        if(null != mView.getDrawable()){
            if(mView.getDrawable() instanceof BitmapDrawable) {
                if(null != ((BitmapDrawable) mView.getDrawable()).getBitmap())
                    ((BitmapDrawable) mView.getDrawable()).getBitmap().recycle();
                // mView.setImageBitmap(null);
            }
        }

        super.onDestroy();
    }
}
