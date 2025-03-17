package q3;

import java.util.Arrays;
import java.util.List;
import kb.C9967v;
import nb.C10071a;
import t3.C5950a;

public final class N {

    /* renamed from: b  reason: collision with root package name */
    public static final N f28051b = new N(C9967v.E());

    /* renamed from: c  reason: collision with root package name */
    private static final String f28052c = t3.N.A0(0);

    /* renamed from: a  reason: collision with root package name */
    private final C9967v<a> f28053a;

    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final String f28054f = t3.N.A0(0);

        /* renamed from: g  reason: collision with root package name */
        private static final String f28055g = t3.N.A0(1);

        /* renamed from: h  reason: collision with root package name */
        private static final String f28056h = t3.N.A0(3);

        /* renamed from: i  reason: collision with root package name */
        private static final String f28057i = t3.N.A0(4);

        /* renamed from: a  reason: collision with root package name */
        public final int f28058a;

        /* renamed from: b  reason: collision with root package name */
        private final K f28059b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28060c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f28061d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean[] f28062e;

        public a(K k10, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = k10.f27943a;
            this.f28058a = i10;
            boolean z11 = false;
            C5950a.a(i10 == iArr.length && i10 == zArr.length);
            this.f28059b = k10;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f28060c = z11;
            this.f28061d = (int[]) iArr.clone();
            this.f28062e = (boolean[]) zArr.clone();
        }

        public K a() {
            return this.f28059b;
        }

        public C5807s b(int i10) {
            return this.f28059b.a(i10);
        }

        public int c() {
            return this.f28059b.f27945c;
        }

        public boolean d() {
            return this.f28060c;
        }

        public boolean e() {
            return C10071a.a(this.f28062e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28060c == aVar.f28060c && this.f28059b.equals(aVar.f28059b) && Arrays.equals(this.f28061d, aVar.f28061d) && Arrays.equals(this.f28062e, aVar.f28062e);
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f28061d.length; i10++) {
                if (i(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i10) {
            return this.f28062e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f28059b.hashCode() * 31) + (this.f28060c ? 1 : 0)) * 31) + Arrays.hashCode(this.f28061d)) * 31) + Arrays.hashCode(this.f28062e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f28061d[i10];
            return i11 == 4 || (z10 && i11 == 3);
        }
    }

    public N(List<a> list) {
        this.f28053a = C9967v.A(list);
    }

    public C9967v<a> a() {
        return this.f28053a;
    }

    public boolean b() {
        return this.f28053a.isEmpty();
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f28053a.size(); i11++) {
            a aVar = this.f28053a.get(i11);
            if (aVar.e() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f28053a.size(); i11++) {
            if (this.f28053a.get(i11).c() == i10 && this.f28053a.get(i11).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        return this.f28053a.equals(((N) obj).f28053a);
    }

    public int hashCode() {
        return this.f28053a.hashCode();
    }
}
