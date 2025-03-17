package androidx.camera.core.impl;

import N.d;
import android.util.Size;

public abstract class e1 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);
        
        final int mId;

        private a(int i10) {
            this.mId = i10;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.mId;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    e1() {
    }

    public static e1 a(b bVar, a aVar) {
        return new C5036n(bVar, aVar, 0);
    }

    public static e1 b(b bVar, a aVar, long j10) {
        return new C5036n(bVar, aVar, j10);
    }

    public static b e(int i10) {
        return i10 == 35 ? b.YUV : i10 == 256 ? b.JPEG : i10 == 4101 ? b.JPEG_R : i10 == 32 ? b.RAW : b.PRIV;
    }

    public static e1 h(int i10, int i11, Size size, f1 f1Var) {
        b e10 = e(i11);
        a aVar = a.NOT_SUPPORT;
        int c10 = d.c(size);
        if (i10 == 1) {
            if (c10 <= d.c(f1Var.i(i11))) {
                aVar = a.s720p;
            } else if (c10 <= d.c(f1Var.g(i11))) {
                aVar = a.s1440p;
            }
        } else if (c10 <= d.c(f1Var.b())) {
            aVar = a.VGA;
        } else if (c10 <= d.c(f1Var.e())) {
            aVar = a.PREVIEW;
        } else if (c10 <= d.c(f1Var.f())) {
            aVar = a.RECORD;
        } else if (c10 <= d.c(f1Var.c(i11))) {
            aVar = a.MAXIMUM;
        } else {
            Size k10 = f1Var.k(i11);
            if (k10 != null && c10 <= d.c(k10)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(e10, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(e1 e1Var) {
        return e1Var.c().b() <= c().b() && e1Var.d() == d();
    }
}
