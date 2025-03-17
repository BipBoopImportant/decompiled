package E;

import C.V;
import G.f;
import G.q;
import M.d;
import N.b;
import O.A;
import O.B;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.R0;
import androidx.camera.core.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: E.w  reason: case insensitive filesystem */
final class C4439w implements A<a, B<byte[]>> {

    /* renamed from: a  reason: collision with root package name */
    private final d f5666a;

    /* renamed from: E.w$a */
    static abstract class a {
        a() {
        }

        static a c(B<n> b10, int i10) {
            return new C4420c(b10, i10);
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract B<n> b();
    }

    C4439w(R0 r02) {
        this.f5666a = new d(r02);
    }

    private static f b(byte[] bArr) {
        try {
            return f.k(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new V(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    private B<byte[]> c(a aVar, int i10) {
        B<n> b10 = aVar.b();
        byte[] a10 = this.f5666a.a(b10.c());
        f d10 = b10.d();
        Objects.requireNonNull(d10);
        return B.m(a10, d10, i10, b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }

    private B<byte[]> d(a aVar) {
        B<n> b10 = aVar.b();
        n c10 = b10.c();
        Rect b11 = b10.b();
        try {
            byte[] m10 = b.m(c10, b11, aVar.a(), b10.f());
            return B.m(m10, b(m10), 256, new Size(b11.width(), b11.height()), new Rect(0, 0, b11.width(), b11.height()), b10.f(), q.v(b10.g(), b11), b10.a());
        } catch (b.a e10) {
            throw new V(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    /* renamed from: a */
    public B<byte[]> apply(a aVar) {
        B<byte[]> d10;
        try {
            int e10 = aVar.b().e();
            if (e10 != 35) {
                if (e10 != 256) {
                    if (e10 != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + e10);
                    }
                }
                d10 = c(aVar, e10);
            } else {
                d10 = d(aVar);
            }
            aVar.b().c().close();
            return d10;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }
}
