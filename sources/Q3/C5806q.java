package q3;

import android.util.SparseBooleanArray;
import t3.C5950a;
import t3.N;

/* renamed from: q3.q  reason: case insensitive filesystem */
public final class C5806q {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f28178a;

    /* renamed from: q3.q$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f28179a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f28180b;

        public b a(int i10) {
            C5950a.g(!this.f28180b);
            this.f28179a.append(i10, true);
            return this;
        }

        public b b(C5806q qVar) {
            for (int i10 = 0; i10 < qVar.d(); i10++) {
                a(qVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int a10 : iArr) {
                a(a10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public C5806q e() {
            C5950a.g(!this.f28180b);
            this.f28180b = true;
            return new C5806q(this.f28179a);
        }
    }

    public boolean a(int i10) {
        return this.f28178a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int a10 : iArr) {
            if (a(a10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        C5950a.c(i10, 0, d());
        return this.f28178a.keyAt(i10);
    }

    public int d() {
        return this.f28178a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5806q)) {
            return false;
        }
        C5806q qVar = (C5806q) obj;
        if (N.f29462a >= 24) {
            return this.f28178a.equals(qVar.f28178a);
        }
        if (d() != qVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != qVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (N.f29462a >= 24) {
            return this.f28178a.hashCode();
        }
        int d10 = d();
        for (int i10 = 0; i10 < d(); i10++) {
            d10 = (d10 * 31) + c(i10);
        }
        return d10;
    }

    private C5806q(SparseBooleanArray sparseBooleanArray) {
        this.f28178a = sparseBooleanArray;
    }
}
