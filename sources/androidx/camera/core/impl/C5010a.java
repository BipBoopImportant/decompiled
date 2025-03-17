package androidx.camera.core.impl;

import C.C4417z;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.p1;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a  reason: case insensitive filesystem */
public abstract class C5010a {
    C5010a() {
    }

    public static C5010a a(e1 e1Var, int i10, Size size, C4417z zVar, List<p1.b> list, X x10, Range<Integer> range) {
        return new C5012b(e1Var, i10, size, zVar, list, x10, range);
    }

    public abstract List<p1.b> b();

    public abstract C4417z c();

    public abstract int d();

    public abstract X e();

    public abstract Size f();

    public abstract e1 g();

    public abstract Range<Integer> h();

    public c1 i(X x10) {
        c1.a d10 = c1.a(f()).b(c()).d(x10);
        if (h() != null) {
            d10.c(h());
        }
        return d10.a();
    }
}
