package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* renamed from: com.squareup.picasso.b  reason: case insensitive filesystem */
class C14191b extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final int f122517d = 22;

    /* renamed from: a  reason: collision with root package name */
    private final Context f122518a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f122519b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f122520c;

    C14191b(Context context) {
        this.f122518a = context;
    }

    static String j(w wVar) {
        return wVar.f122638d.toString().substring(f122517d);
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f122638d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public y.a f(w wVar, int i10) {
        if (this.f122520c == null) {
            synchronized (this.f122519b) {
                try {
                    if (this.f122520c == null) {
                        this.f122520c = this.f122518a.getAssets();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new y.a(WK.y.l(this.f122520c.open(j(wVar))), t.e.DISK);
    }
}
