package L7;

import C7.f;
import F7.d;
import Y7.k;
import Y7.l;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class z extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f38452c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(f.f33749a);

    /* renamed from: b  reason: collision with root package name */
    private final int f38453b;

    public z(int i10) {
        k.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f38453b = i10;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f38452c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38453b).array());
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return B.n(dVar, bitmap, this.f38453b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && this.f38453b == ((z) obj).f38453b;
    }

    public int hashCode() {
        return l.o(-569625254, l.n(this.f38453b));
    }
}
