package androidx.media3.exoplayer;

import G3.C6501v;
import G3.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import q3.C5791b;
import q3.J;
import t3.N;
import z3.C6278a;

final class t0 extends C6278a {

    /* renamed from: h  reason: collision with root package name */
    private final int f22880h;

    /* renamed from: i  reason: collision with root package name */
    private final int f22881i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f22882j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f22883k;

    /* renamed from: l  reason: collision with root package name */
    private final J[] f22884l;

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f22885m;

    /* renamed from: n  reason: collision with root package name */
    private final HashMap<Object, Integer> f22886n;

    class a extends C6501v {

        /* renamed from: f  reason: collision with root package name */
        private final J.c f22887f = new J.c();

        a(J j10) {
            super(j10);
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            J.b g10 = super.g(i10, bVar, z10);
            if (super.n(g10.f27904c, this.f22887f).f()) {
                g10.t(bVar.f27902a, bVar.f27903b, bVar.f27904c, bVar.f27905d, bVar.f27906e, C5791b.f28078g, true);
            } else {
                g10.f27907f = true;
            }
            return g10;
        }
    }

    public t0(Collection<? extends d0> collection, c0 c0Var) {
        this(G(collection), H(collection), c0Var);
    }

    private static J[] G(Collection<? extends d0> collection) {
        J[] jArr = new J[collection.size()];
        int i10 = 0;
        for (d0 b10 : collection) {
            jArr[i10] = b10.b();
            i10++;
        }
        return jArr;
    }

    private static Object[] H(Collection<? extends d0> collection) {
        Object[] objArr = new Object[collection.size()];
        int i10 = 0;
        for (d0 a10 : collection) {
            objArr[i10] = a10.a();
            i10++;
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    public int A(int i10) {
        return this.f22883k[i10];
    }

    /* access modifiers changed from: protected */
    public J D(int i10) {
        return this.f22884l[i10];
    }

    public t0 E(c0 c0Var) {
        J[] jArr = new J[this.f22884l.length];
        int i10 = 0;
        while (true) {
            J[] jArr2 = this.f22884l;
            if (i10 >= jArr2.length) {
                return new t0(jArr, this.f22885m, c0Var);
            }
            jArr[i10] = new a(jArr2[i10]);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public List<J> F() {
        return Arrays.asList(this.f22884l);
    }

    public int i() {
        return this.f22881i;
    }

    public int p() {
        return this.f22880h;
    }

    /* access modifiers changed from: protected */
    public int s(Object obj) {
        Integer num = this.f22886n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int t(int i10) {
        return N.g(this.f22882j, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
        return N.g(this.f22883k, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public Object x(int i10) {
        return this.f22885m[i10];
    }

    /* access modifiers changed from: protected */
    public int z(int i10) {
        return this.f22882j[i10];
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private t0(J[] jArr, Object[] objArr, c0 c0Var) {
        super(false, c0Var);
        int i10 = 0;
        int length = jArr.length;
        this.f22884l = jArr;
        this.f22882j = new int[length];
        this.f22883k = new int[length];
        this.f22885m = objArr;
        this.f22886n = new HashMap<>();
        int length2 = jArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            J j10 = jArr[i10];
            this.f22884l[i13] = j10;
            this.f22883k[i13] = i11;
            this.f22882j[i13] = i12;
            i11 += j10.p();
            i12 += this.f22884l[i13].i();
            this.f22886n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f22880h = i11;
        this.f22881i = i12;
    }
}
