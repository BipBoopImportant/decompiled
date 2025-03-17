package L7;

import C7.m;
import E7.v;
import F7.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import java.security.MessageDigest;

public class p implements m<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    private final m<Bitmap> f38420b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38421c;

    public p(m<Bitmap> mVar, boolean z10) {
        this.f38420b = mVar;
        this.f38421c = z10;
    }

    private v<Drawable> d(Context context, v<Bitmap> vVar) {
        return v.f(context.getResources(), vVar);
    }

    public v<Drawable> a(Context context, v<Drawable> vVar, int i10, int i11) {
        d f10 = b.c(context).f();
        Drawable drawable = vVar.get();
        v<Bitmap> a10 = o.a(f10, drawable, i10, i11);
        if (a10 != null) {
            v<Bitmap> a11 = this.f38420b.a(context, a10, i10, i11);
            if (!a11.equals(a10)) {
                return d(context, a11);
            }
            a11.c();
            return vVar;
        } else if (!this.f38421c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void b(MessageDigest messageDigest) {
        this.f38420b.b(messageDigest);
    }

    public m<BitmapDrawable> c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f38420b.equals(((p) obj).f38420b);
        }
        return false;
    }

    public int hashCode() {
        return this.f38420b.hashCode();
    }
}
