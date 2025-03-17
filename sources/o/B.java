package O;

import G.f;
import G.q;
import H2.i;
import N.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.n;

public abstract class B<T> {
    public static B<Bitmap> j(Bitmap bitmap, f fVar, Rect rect, int i10, Matrix matrix, C5059z zVar) {
        return new C4692b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, zVar);
    }

    public static B<n> k(n nVar, f fVar, Rect rect, int i10, Matrix matrix, C5059z zVar) {
        return l(nVar, fVar, new Size(nVar.getWidth(), nVar.getHeight()), rect, i10, matrix, zVar);
    }

    public static B<n> l(n nVar, f fVar, Size size, Rect rect, int i10, Matrix matrix, C5059z zVar) {
        if (b.j(nVar.getFormat())) {
            f fVar2 = fVar;
            i.h(fVar, "JPEG image must have Exif.");
        } else {
            f fVar3 = fVar;
        }
        return new C4692b(nVar, fVar, nVar.getFormat(), size, rect, i10, matrix, zVar);
    }

    public static B<byte[]> m(byte[] bArr, f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, C5059z zVar) {
        return new C4692b(bArr, fVar, i10, size, rect, i11, matrix, zVar);
    }

    public abstract C5059z a();

    public abstract Rect b();

    public abstract T c();

    public abstract f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return q.h(b(), h());
    }
}
