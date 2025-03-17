package L7;

import C7.f;
import F7.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class k extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f38390b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f33749a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f38390b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return B.c(dVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    public int hashCode() {
        return -670243078;
    }
}
