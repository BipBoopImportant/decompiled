package I3;

import G3.C6479C;
import J3.C6571d;
import q3.C5807s;
import q3.J;
import q3.K;
import t3.q;

public interface x extends C6552A {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final K f36840a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f36841b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36842c;

        public a(K k10, int... iArr) {
            this(k10, iArr, 0);
        }

        public a(K k10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                q.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f36840a = k10;
            this.f36841b = iArr;
            this.f36842c = i10;
        }
    }

    public interface b {
        x[] a(a[] aVarArr, C6571d dVar, C6479C.b bVar, J j10);
    }

    void c();

    int d();

    void e(float f10);

    void f() {
    }

    void i(boolean z10) {
    }

    void j();

    int k();

    C5807s l();

    void m() {
    }
}
