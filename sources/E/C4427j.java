package E;

import G.f;
import N.b;
import O.A;
import O.B;
import O.C4711v;
import O.C4714y;
import android.graphics.Bitmap;
import androidx.camera.core.n;
import java.util.Objects;

/* renamed from: E.j  reason: case insensitive filesystem */
public class C4427j implements A<B<Bitmap>, B<Bitmap>> {

    /* renamed from: a  reason: collision with root package name */
    private final C4714y f5642a;

    C4427j(C4714y yVar) {
        this.f5642a = yVar;
    }

    /* renamed from: a */
    public B<Bitmap> apply(B<Bitmap> b10) {
        n a10 = this.f5642a.e(new C4711v(new U(b10), 1)).a();
        Objects.requireNonNull(a10);
        Bitmap d10 = b.d(a10.A1(), a10.getWidth(), a10.getHeight());
        f d11 = b10.d();
        Objects.requireNonNull(d11);
        return B.j(d10, d11, b10.b(), b10.f(), b10.g(), b10.a());
    }
}
