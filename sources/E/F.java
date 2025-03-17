package E;

import C.V;
import E.O;
import G.f;
import G.q;
import H2.i;
import J.c;
import N.b;
import O.A;
import O.B;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.n;
import java.io.IOException;

final class F implements A<O.b, B<n>> {
    F() {
    }

    private static B<n> b(P p10, f fVar, n nVar) {
        return B.k(nVar, fVar, p10.b(), p10.f(), p10.g(), d(nVar));
    }

    private static B<n> c(P p10, f fVar, n nVar) {
        Size size = new Size(nVar.getWidth(), nVar.getHeight());
        int f10 = p10.f() - fVar.s();
        Size e10 = e(f10, size);
        Matrix d10 = q.d(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), new RectF(0.0f, 0.0f, (float) e10.getWidth(), (float) e10.getHeight()), f10);
        return B.l(nVar, fVar, e10, f(p10.b(), d10), fVar.s(), g(p10.g(), d10), d(nVar));
    }

    private static C5059z d(n nVar) {
        return nVar.F2() instanceof c ? ((c) nVar.F2()).f() : C5059z.a.l();
    }

    private static Size e(int i10, Size size) {
        return q.i(q.w(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    /* renamed from: a */
    public B<n> apply(O.b bVar) {
        f fVar;
        n a10 = bVar.a();
        P b10 = bVar.b();
        if (b.j(a10.getFormat())) {
            try {
                fVar = f.j(a10);
                a10.A1()[0].p().rewind();
            } catch (IOException e10) {
                throw new V(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            fVar = null;
        }
        if (!C4441y.f5668g.b(a10)) {
            return b(b10, fVar, a10);
        }
        i.h(fVar, "JPEG image must have exif.");
        return c(b10, fVar, a10);
    }
}
