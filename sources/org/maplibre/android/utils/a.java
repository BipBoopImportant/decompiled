package org.maplibre.android.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.ar.core.ImageMetadata;
import u2.C6012a;

public class a {
    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(ImageMetadata.LENS_APERTURE);
        view.buildDrawingCache();
        if (view.getDrawingCache() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return null;
        }
        Drawable mutate = constantState.newDrawable().mutate();
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mutate.draw(canvas);
        return createBitmap;
    }

    public static Drawable c(Context context, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static Drawable d(Context context, int i10) {
        return e(context, i10, (Integer) null);
    }

    public static Drawable e(Context context, int i10, Integer num) {
        Drawable e10 = C6012a.e(context, i10);
        if (e10 == null) {
            return null;
        }
        if (num == null) {
            return e10;
        }
        e10.setTint(num.intValue());
        return e10;
    }
}
