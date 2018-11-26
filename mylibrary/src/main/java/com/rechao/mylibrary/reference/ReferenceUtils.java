package com.rechao.mylibrary.reference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.lang.ref.SoftReference;

/**
 * Created by 王鹏程 on 2018/11/26.
 * 类(ReferenceUtils)解释:
 * Reference弱引用-图片
 */

public class ReferenceUtils {
    /**
     * 使用软引用避免加载背景图片和默认图片导致内存泄漏崩溃
     */
    public static void setSoftReference(Context context, int image, ImageView imageView) {
        if (imageView != null) {
            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), image);
            Drawable drawable = new BitmapDrawable(bitmap);
            SoftReference<Drawable> drawableSoftReference = new SoftReference<Drawable>(drawable);
            if (drawableSoftReference != null) {
                imageView.setBackground(drawableSoftReference.get());
            } else {
                imageView.setImageResource(image);
            }
        }
    }
}
