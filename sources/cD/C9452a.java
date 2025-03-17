package cd;

import K9.C6620s;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import dd.C9619a;
import gd.C9724b;

/* renamed from: cd.a  reason: case insensitive filesystem */
public class C9452a {

    /* renamed from: a  reason: collision with root package name */
    private final C9619a f65682a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f65683b;

    /* renamed from: c  reason: collision with root package name */
    private final Point[] f65684c;

    public C9452a(C9619a aVar, Matrix matrix) {
        this.f65682a = (C9619a) C6620s.l(aVar);
        Rect a10 = aVar.a();
        if (!(a10 == null || matrix == null)) {
            C9724b.c(a10, matrix);
        }
        this.f65683b = a10;
        Point[] d10 = aVar.d();
        if (!(d10 == null || matrix == null)) {
            C9724b.b(d10, matrix);
        }
        this.f65684c = d10;
    }

    public int a() {
        int format = this.f65682a.getFormat();
        if (format > 4096) {
            return -1;
        }
        if (format == 0) {
            return -1;
        }
        return format;
    }

    public String b() {
        return this.f65682a.b();
    }

    public int c() {
        return this.f65682a.c();
    }
}
