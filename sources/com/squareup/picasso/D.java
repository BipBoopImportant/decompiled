package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;

final class D extends C14190a<C> {
    D(t tVar, C c10, w wVar, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(tVar, c10, wVar, i10, i11, i12, drawable, str, obj, false);
    }

    /* access modifiers changed from: package-private */
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap != null) {
            C c10 = (C) k();
            if (c10 != null) {
                c10.a(bitmap, eVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: package-private */
    public void c(Exception exc) {
        C c10 = (C) k();
        if (c10 == null) {
            return;
        }
        if (this.f122510g != 0) {
            c10.b(exc, this.f122504a.f122600d.getResources().getDrawable(this.f122510g));
        } else {
            c10.b(exc, this.f122511h);
        }
    }
}
