package L7;

import C7.i;
import C7.k;
import E7.v;
import F7.b;
import L7.n;
import Y7.d;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

public class A implements k<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final n f38355a;

    /* renamed from: b  reason: collision with root package name */
    private final b f38356b;

    static class a implements n.b {

        /* renamed from: a  reason: collision with root package name */
        private final x f38357a;

        /* renamed from: b  reason: collision with root package name */
        private final d f38358b;

        a(x xVar, d dVar) {
            this.f38357a = xVar;
            this.f38358b = dVar;
        }

        public void a(F7.d dVar, Bitmap bitmap) {
            IOException c10 = this.f38358b.c();
            if (c10 != null) {
                if (bitmap != null) {
                    dVar.c(bitmap);
                }
                throw c10;
            }
        }

        public void b() {
            this.f38357a.d();
        }
    }

    public A(n nVar, b bVar) {
        this.f38355a = nVar;
        this.f38356b = bVar;
    }

    /* renamed from: c */
    public v<Bitmap> a(InputStream inputStream, int i10, int i11, i iVar) {
        x xVar;
        boolean z10;
        if (inputStream instanceof x) {
            xVar = (x) inputStream;
            z10 = false;
        } else {
            z10 = true;
            xVar = new x(inputStream, this.f38356b);
        }
        d d10 = d.d(xVar);
        try {
            return this.f38355a.f(new Y7.i(d10), i10, i11, iVar, new a(xVar, d10));
        } finally {
            d10.e();
            if (z10) {
                xVar.e();
            }
        }
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, i iVar) {
        return this.f38355a.p(inputStream);
    }
}
