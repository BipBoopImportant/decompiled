package L7;

import C7.f;
import F7.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class r extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f38422b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f33749a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f38422b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return B.e(dVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof r;
    }

    public int hashCode() {
        return 1572326941;
    }
}
