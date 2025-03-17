package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

class z extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f122689a;

    z(Context context) {
        this.f122689a = context;
    }

    private static Bitmap j(Resources resources, int i10, w wVar) {
        BitmapFactory.Options d10 = y.d(wVar);
        if (y.g(d10)) {
            BitmapFactory.decodeResource(resources, i10, d10);
            y.b(wVar.f122642h, wVar.f122643i, d10, wVar);
        }
        return BitmapFactory.decodeResource(resources, i10, d10);
    }

    public boolean c(w wVar) {
        if (wVar.f122639e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f122638d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        Resources m10 = F.m(this.f122689a, wVar);
        return new y.a(j(m10, F.l(m10, wVar), wVar), t.e.DISK);
    }
}
