package P7;

import C7.m;
import E7.v;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import java.security.MessageDigest;

public class f implements m<c> {

    /* renamed from: b  reason: collision with root package name */
    private final m<Bitmap> f39408b;

    /* JADX WARNING: type inference failed for: r1v0, types: [C7.m<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(C7.m<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = Y7.k.d(r1)
            C7.m r1 = (C7.m) r1
            r0.f39408b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.f.<init>(C7.m):void");
    }

    public v<c> a(Context context, v<c> vVar, int i10, int i11) {
        c cVar = vVar.get();
        L7.f fVar = new L7.f(cVar.e(), b.c(context).f());
        v<Bitmap> a10 = this.f39408b.a(context, fVar, i10, i11);
        if (!fVar.equals(a10)) {
            fVar.c();
        }
        cVar.m(this.f39408b, a10.get());
        return vVar;
    }

    public void b(MessageDigest messageDigest) {
        this.f39408b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f39408b.equals(((f) obj).f39408b);
        }
        return false;
    }

    public int hashCode() {
        return this.f39408b.hashCode();
    }
}
