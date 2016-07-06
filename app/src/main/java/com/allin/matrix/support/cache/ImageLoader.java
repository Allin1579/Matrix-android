package com.allin.matrix.support.cache;

import android.content.Context;
import android.widget.ImageView;

import com.allin.matrix.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

/**
 * Created by Allin on 2016/6/27.
 */
public class ImageLoader {

    public static void load(Context context, String url, ImageView imageView){
        Picasso.with(context)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView);

    }

    public static void load(Context context, String url, ImageView imageView, final LoadCallback callback){
        Picasso.with(context)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        callback.onSuccess();
                    }

                    @Override
                    public void onError() {
                        callback.onError();
                    }
                });

    }

    public static void clearMemoryCache(){

    }

    public interface LoadCallback{
        void onSuccess();
        void onError();
    }

}
