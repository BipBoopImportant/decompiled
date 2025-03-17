package L7;

import C7.i;
import C7.k;
import E7.v;
import F7.d;
import N7.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

public class y implements k<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final j f38450a;

    /* renamed from: b  reason: collision with root package name */
    private final d f38451b;

    public y(j jVar, d dVar) {
        this.f38450a = jVar;
        this.f38451b = dVar;
    }

    /* renamed from: c */
    public v<Bitmap> a(Uri uri, int i10, int i11, i iVar) {
        v<Drawable> c10 = this.f38450a.a(uri, i10, i11, iVar);
        if (c10 == null) {
            return null;
        }
        return o.a(this.f38451b, c10.get(), i10, i11);
    }

    /* renamed from: d */
    public boolean b(Uri uri, i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
