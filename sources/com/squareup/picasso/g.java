package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

class g extends y {

    /* renamed from: a  reason: collision with root package name */
    final Context f122551a;

    g(Context context) {
        this.f122551a = context;
    }

    public boolean c(w wVar) {
        return "content".equals(wVar.f122638d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        return new y.a(WK.y.l(j(wVar)), t.e.DISK);
    }

    /* access modifiers changed from: package-private */
    public InputStream j(w wVar) {
        return this.f122551a.getContentResolver().openInputStream(wVar.f122638d);
    }
}
