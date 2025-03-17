package G3;

import G3.C6479C;
import J3.C6569b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kb.C9928H;
import kb.C9929I;
import q3.J;
import q3.w;
import t3.C5950a;
import w3.C;

public final class N extends C6487g<Integer> {

    /* renamed from: w  reason: collision with root package name */
    private static final w f35660w = new w.c().c("MergingMediaSource").a();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f35661k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35662l;

    /* renamed from: m  reason: collision with root package name */
    private final C6479C[] f35663m;

    /* renamed from: n  reason: collision with root package name */
    private final List<List<d>> f35664n;

    /* renamed from: o  reason: collision with root package name */
    private final J[] f35665o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<C6479C> f35666p;

    /* renamed from: q  reason: collision with root package name */
    private final C6489i f35667q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<Object, Long> f35668r;

    /* renamed from: s  reason: collision with root package name */
    private final C9928H<Object, C6484d> f35669s;

    /* renamed from: t  reason: collision with root package name */
    private int f35670t;

    /* renamed from: u  reason: collision with root package name */
    private long[][] f35671u;

    /* renamed from: v  reason: collision with root package name */
    private c f35672v;

    private static final class b extends C6501v {

        /* renamed from: f  reason: collision with root package name */
        private final long[] f35673f;

        /* renamed from: g  reason: collision with root package name */
        private final long[] f35674g;

        public b(J j10, Map<Object, Long> map) {
            super(j10);
            int p10 = j10.p();
            this.f35674g = new long[j10.p()];
            J.c cVar = new J.c();
            for (int i10 = 0; i10 < p10; i10++) {
                this.f35674g[i10] = j10.n(i10, cVar).f27937m;
            }
            int i11 = j10.i();
            this.f35673f = new long[i11];
            J.b bVar = new J.b();
            for (int i12 = 0; i12 < i11; i12++) {
                j10.g(i12, bVar, true);
                long longValue = ((Long) C5950a.e(map.get(bVar.f27903b))).longValue();
                long[] jArr = this.f35673f;
                longValue = longValue == Long.MIN_VALUE ? bVar.f27905d : longValue;
                jArr[i12] = longValue;
                long j11 = bVar.f27905d;
                if (j11 != -9223372036854775807L) {
                    long[] jArr2 = this.f35674g;
                    int i13 = bVar.f27904c;
                    jArr2[i13] = jArr2[i13] - (j11 - longValue);
                }
            }
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f27905d = this.f35673f[i10];
            return bVar;
        }

        public J.c o(int i10, J.c cVar, long j10) {
            long j11;
            super.o(i10, cVar, j10);
            long j12 = this.f35674g[i10];
            cVar.f27937m = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = cVar.f27936l;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    cVar.f27936l = j11;
                    return cVar;
                }
            }
            j11 = cVar.f27936l;
            cVar.f27936l = j11;
            return cVar;
        }
    }

    public static final class c extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f35675a;

        public c(int i10) {
            this.f35675a = i10;
        }
    }

    private static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C6479C.b f35676a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6478B f35677b;

        private d(C6479C.b bVar, C6478B b10) {
            this.f35676a = bVar;
            this.f35677b = b10;
        }
    }

    public N(C6479C... cArr) {
        this(false, cArr);
    }

    private void I() {
        J.b bVar = new J.b();
        for (int i10 = 0; i10 < this.f35670t; i10++) {
            long j10 = -this.f35665o[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                J[] jArr = this.f35665o;
                if (i11 >= jArr.length) {
                    break;
                }
                this.f35671u[i10][i11] = j10 - (-jArr[i11].f(i10, bVar).n());
                i11++;
            }
        }
    }

    private void L() {
        J[] jArr;
        J.b bVar = new J.b();
        for (int i10 = 0; i10 < this.f35670t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                jArr = this.f35665o;
                if (i11 >= jArr.length) {
                    break;
                }
                long j11 = jArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f35671u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object m10 = jArr[0].m(i10);
            this.f35668r.put(m10, Long.valueOf(j10));
            for (C6484d t10 : this.f35669s.get(m10)) {
                t10.t(0, j10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        super.A();
        Arrays.fill(this.f35665o, (Object) null);
        this.f35670t = -1;
        this.f35672v = null;
        this.f35666p.clear();
        Collections.addAll(this.f35666p, this.f35663m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C6479C.b C(Integer num, C6479C.b bVar) {
        List list = this.f35664n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f35676a.equals(bVar)) {
                return ((d) this.f35664n.get(0).get(i10)).f35676a;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void G(Integer num, C6479C c10, J j10) {
        if (this.f35672v == null) {
            if (this.f35670t == -1) {
                this.f35670t = j10.i();
            } else if (j10.i() != this.f35670t) {
                this.f35672v = new c(0);
                return;
            }
            if (this.f35671u.length == 0) {
                int i10 = this.f35670t;
                int[] iArr = new int[2];
                iArr[1] = this.f35665o.length;
                iArr[0] = i10;
                this.f35671u = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.f35666p.remove(c10);
            this.f35665o[num.intValue()] = j10;
            if (this.f35666p.isEmpty()) {
                if (this.f35661k) {
                    I();
                }
                b bVar = this.f35665o[0];
                if (this.f35662l) {
                    L();
                    bVar = new b(bVar, this.f35668r);
                }
                z(bVar);
            }
        }
    }

    public C6478B a(C6479C.b bVar, C6569b bVar2, long j10) {
        int length = this.f35663m.length;
        C6478B[] bArr = new C6478B[length];
        int b10 = this.f35665o[0].b(bVar.f35620a);
        for (int i10 = 0; i10 < length; i10++) {
            C6479C.b a10 = bVar.a(this.f35665o[i10].m(b10));
            bArr[i10] = this.f35663m[i10].a(a10, bVar2, j10 - this.f35671u[b10][i10]);
            this.f35664n.get(i10).add(new d(a10, bArr[i10]));
        }
        M m10 = new M(this.f35667q, this.f35671u[b10], bArr);
        if (!this.f35662l) {
            return m10;
        }
        C6484d dVar = new C6484d(m10, true, 0, ((Long) C5950a.e(this.f35668r.get(bVar.f35620a))).longValue());
        this.f35669s.put(bVar.f35620a, dVar);
        return dVar;
    }

    public w e() {
        C6479C[] cArr = this.f35663m;
        return cArr.length > 0 ? cArr[0].e() : f35660w;
    }

    public void j() {
        c cVar = this.f35672v;
        if (cVar == null) {
            super.j();
            return;
        }
        throw cVar;
    }

    public void l(w wVar) {
        this.f35663m[0].l(wVar);
    }

    public void o(C6478B b10) {
        if (this.f35662l) {
            C6484d dVar = (C6484d) b10;
            Iterator<Map.Entry<Object, C6484d>> it = this.f35669s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((C6484d) next.getValue()).equals(dVar)) {
                    this.f35669s.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            b10 = dVar.f35834a;
        }
        M m10 = (M) b10;
        for (int i10 = 0; i10 < this.f35663m.length; i10++) {
            List list = this.f35664n.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                } else if (((d) list.get(i11)).f35677b.equals(b10)) {
                    list.remove(i11);
                    break;
                } else {
                    i11++;
                }
            }
            this.f35663m[i10].o(m10.m(i10));
        }
    }

    /* access modifiers changed from: protected */
    public void y(C c10) {
        super.y(c10);
        for (int i10 = 0; i10 < this.f35663m.length; i10++) {
            H(Integer.valueOf(i10), this.f35663m[i10]);
        }
    }

    public N(boolean z10, C6479C... cArr) {
        this(z10, false, cArr);
    }

    public N(boolean z10, boolean z11, C6479C... cArr) {
        this(z10, z11, new C6490j(), cArr);
    }

    public N(boolean z10, boolean z11, C6489i iVar, C6479C... cArr) {
        this.f35661k = z10;
        this.f35662l = z11;
        this.f35663m = cArr;
        this.f35667q = iVar;
        this.f35666p = new ArrayList<>(Arrays.asList(cArr));
        this.f35670t = -1;
        this.f35664n = new ArrayList(cArr.length);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            this.f35664n.add(new ArrayList());
        }
        this.f35665o = new J[cArr.length];
        this.f35671u = new long[0][];
        this.f35668r = new HashMap();
        this.f35669s = C9929I.a().a().e();
    }
}
