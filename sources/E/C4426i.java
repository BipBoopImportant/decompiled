package E;

import G.f;
import O.A;
import O.B;
import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* renamed from: E.i  reason: case insensitive filesystem */
class C4426i implements A<b, B<byte[]>> {

    /* renamed from: E.i$a */
    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* renamed from: E.i$b */
    static abstract class b {
        b() {
        }

        static b c(B<Bitmap> b10, int i10) {
            return new C4418a(b10, i10);
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract B<Bitmap> b();
    }

    C4426i() {
    }

    private static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    /* renamed from: a */
    public B<byte[]> apply(b bVar) {
        B<Bitmap> b10 = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b10.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        f d10 = b10.d();
        Objects.requireNonNull(d10);
        return B.m(byteArray, d10, b(b10.c()), b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }
}
