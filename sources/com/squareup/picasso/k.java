package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.exifinterface.media.a;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

class k extends g {
    k(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new a(uri.getPath()).i("Orientation", 1);
    }

    public boolean c(w wVar) {
        return "file".equals(wVar.f122638d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        return new y.a((Bitmap) null, WK.y.l(j(wVar)), t.e.DISK, k(wVar.f122638d));
    }
}
