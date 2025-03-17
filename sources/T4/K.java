package t4;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import N3.u;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.s;
import k4.t;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.H;
import t3.N;
import t4.L;

public final class K implements C6678p {
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public static final u f56203v = new J();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f56204a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56205b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56206c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<H> f56207d;

    /* renamed from: e  reason: collision with root package name */
    private final B f56208e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseIntArray f56209f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final L.c f56210g;

    /* renamed from: h  reason: collision with root package name */
    private final s.a f56211h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray<L> f56212i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final SparseBooleanArray f56213j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final SparseBooleanArray f56214k;

    /* renamed from: l  reason: collision with root package name */
    private final I f56215l;

    /* renamed from: m  reason: collision with root package name */
    private H f56216m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public r f56217n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f56218o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f56219p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f56220q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f56221r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public L f56222s;

    /* renamed from: t  reason: collision with root package name */
    private int f56223t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f56224u;

    private class a implements D {

        /* renamed from: a  reason: collision with root package name */
        private final A f56225a = new A(new byte[4]);

        public a() {
        }

        public void a(B b10) {
            if (b10.H() == 0 && (b10.H() & 128) != 0) {
                b10.X(6);
                int a10 = b10.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    b10.k(this.f56225a, 4);
                    int h10 = this.f56225a.h(16);
                    this.f56225a.r(3);
                    if (h10 == 0) {
                        this.f56225a.r(13);
                    } else {
                        int h11 = this.f56225a.h(13);
                        if (K.this.f56212i.get(h11) == null) {
                            K.this.f56212i.put(h11, new E(new b(h11)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f56204a != 2) {
                    K.this.f56212i.remove(0);
                }
            }
        }

        public void b(H h10, r rVar, L.d dVar) {
        }
    }

    private class b implements D {

        /* renamed from: a  reason: collision with root package name */
        private final A f56227a = new A(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<L> f56228b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f56229c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f56230d;

        public b(int i10) {
            this.f56230d = i10;
        }

        private L.b c(B b10, int i10) {
            int i11;
            B b11 = b10;
            int f10 = b10.f();
            int i12 = f10 + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i14 = 0;
            while (b10.f() < i12) {
                int H10 = b10.H();
                int f11 = b10.f() + b10.H();
                if (f11 > i12) {
                    break;
                }
                if (H10 == 5) {
                    long J10 = b10.J();
                    if (J10 != 1094921523) {
                        if (J10 != 1161904947) {
                            if (J10 != 1094921524) {
                                if (J10 == 1212503619) {
                                    i13 = 36;
                                }
                                b11.X(f11 - b10.f());
                            }
                        }
                        i13 = 135;
                        b11.X(f11 - b10.f());
                    }
                    i13 = 129;
                    b11.X(f11 - b10.f());
                } else {
                    if (H10 != 106) {
                        if (H10 != 122) {
                            if (H10 == 127) {
                                int H11 = b10.H();
                                if (H11 != 21) {
                                    if (H11 == 14) {
                                        i13 = ModuleDescriptor.MODULE_VERSION;
                                    } else if (H11 == 33) {
                                        i13 = 139;
                                    }
                                }
                            } else {
                                if (H10 == 123) {
                                    i11 = 138;
                                } else if (H10 == 10) {
                                    String trim = b11.E(3).trim();
                                    i14 = b10.H();
                                    str = trim;
                                } else if (H10 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (b10.f() < f11) {
                                        String trim2 = b11.E(3).trim();
                                        int H12 = b10.H();
                                        byte[] bArr = new byte[4];
                                        b11.l(bArr, 0, 4);
                                        arrayList2.add(new L.a(trim2, H12, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else if (H10 == 111) {
                                    i11 = 257;
                                }
                                i13 = i11;
                            }
                            b11.X(f11 - b10.f());
                        }
                        i13 = 135;
                        b11.X(f11 - b10.f());
                    }
                    i13 = 129;
                    b11.X(f11 - b10.f());
                }
                i13 = 172;
                b11.X(f11 - b10.f());
            }
            b11.W(i12);
            return new L.b(i13, str, i14, arrayList, Arrays.copyOfRange(b10.e(), f10, i12));
        }

        public void a(B b10) {
            H h10;
            B b11 = b10;
            if (b10.H() == 2) {
                if (K.this.f56204a == 1 || K.this.f56204a == 2 || K.this.f56218o == 1) {
                    h10 = (H) K.this.f56207d.get(0);
                } else {
                    h10 = new H(((H) K.this.f56207d.get(0)).d());
                    K.this.f56207d.add(h10);
                }
                if ((b10.H() & 128) != 0) {
                    b11.X(1);
                    int P10 = b10.P();
                    int i10 = 3;
                    b11.X(3);
                    b11.k(this.f56227a, 2);
                    this.f56227a.r(3);
                    int i11 = 13;
                    int unused = K.this.f56224u = this.f56227a.h(13);
                    b11.k(this.f56227a, 2);
                    int i12 = 4;
                    this.f56227a.r(4);
                    b11.X(this.f56227a.h(12));
                    if (K.this.f56204a == 2 && K.this.f56222s == null) {
                        L.b bVar = new L.b(21, (String) null, 0, (List<L.a>) null, N.f29467f);
                        K k10 = K.this;
                        L unused2 = k10.f56222s = k10.f56210g.b(21, bVar);
                        if (K.this.f56222s != null) {
                            K.this.f56222s.b(h10, K.this.f56217n, new L.d(P10, 21, 8192));
                        }
                    }
                    this.f56228b.clear();
                    this.f56229c.clear();
                    int a10 = b10.a();
                    while (a10 > 0) {
                        b11.k(this.f56227a, 5);
                        int h11 = this.f56227a.h(8);
                        this.f56227a.r(i10);
                        int h12 = this.f56227a.h(i11);
                        this.f56227a.r(i12);
                        int h13 = this.f56227a.h(12);
                        L.b c10 = c(b11, h13);
                        if (h11 == 6 || h11 == 5) {
                            h11 = c10.f56235a;
                        }
                        a10 -= h13 + 5;
                        int i13 = K.this.f56204a == 2 ? h11 : h12;
                        if (!K.this.f56213j.get(i13)) {
                            L q10 = (K.this.f56204a == 2 && h11 == 21) ? K.this.f56222s : K.this.f56210g.b(h11, c10);
                            if (K.this.f56204a != 2 || h12 < this.f56229c.get(i13, 8192)) {
                                this.f56229c.put(i13, h12);
                                this.f56228b.put(i13, q10);
                            }
                        }
                        i10 = 3;
                        i12 = 4;
                        i11 = 13;
                    }
                    int size = this.f56229c.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        int keyAt = this.f56229c.keyAt(i14);
                        int valueAt = this.f56229c.valueAt(i14);
                        K.this.f56213j.put(keyAt, true);
                        K.this.f56214k.put(valueAt, true);
                        L valueAt2 = this.f56228b.valueAt(i14);
                        if (valueAt2 != null) {
                            if (valueAt2 != K.this.f56222s) {
                                valueAt2.b(h10, K.this.f56217n, new L.d(P10, keyAt, 8192));
                            }
                            K.this.f56212i.put(valueAt, valueAt2);
                        }
                    }
                    if (K.this.f56204a != 2) {
                        K.this.f56212i.remove(this.f56230d);
                        K k11 = K.this;
                        int unused3 = k11.f56218o = k11.f56204a == 1 ? 0 : K.this.f56218o - 1;
                        if (K.this.f56218o == 0) {
                            K.this.f56217n.r();
                            boolean unused4 = K.this.f56219p = true;
                        }
                    } else if (!K.this.f56219p) {
                        K.this.f56217n.r();
                        int unused5 = K.this.f56218o = 0;
                        boolean unused6 = K.this.f56219p = true;
                    }
                }
            }
        }

        public void b(H h10, r rVar, L.d dVar) {
        }
    }

    public K(int i10, s.a aVar) {
        this(1, i10, aVar, new H(0), new C8785j(0), 112800);
    }

    private void A() {
        this.f56213j.clear();
        this.f56212i.clear();
        SparseArray<L> a10 = this.f56210g.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f56212i.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f56212i.put(0, new E(new a()));
        this.f56222s = null;
    }

    private boolean B(int i10) {
        return this.f56204a == 2 || this.f56219p || !this.f56214k.get(i10, false);
    }

    static /* synthetic */ int m(K k10) {
        int i10 = k10.f56218o;
        k10.f56218o = i10 + 1;
        return i10;
    }

    private boolean w(C6679q qVar) {
        byte[] e10 = this.f56208e.e();
        if (9400 - this.f56208e.f() < 188) {
            int a10 = this.f56208e.a();
            if (a10 > 0) {
                System.arraycopy(e10, this.f56208e.f(), e10, 0, a10);
            }
            this.f56208e.U(e10, a10);
        }
        while (this.f56208e.a() < 188) {
            int g10 = this.f56208e.g();
            int c10 = qVar.c(e10, g10, 9400 - g10);
            if (c10 == -1) {
                return false;
            }
            this.f56208e.V(g10 + c10);
        }
        return true;
    }

    private int x() {
        int f10 = this.f56208e.f();
        int g10 = this.f56208e.g();
        int a10 = M.a(this.f56208e.e(), f10, g10);
        this.f56208e.W(a10);
        int i10 = a10 + 188;
        if (i10 > g10) {
            int i11 = this.f56223t + (a10 - f10);
            this.f56223t = i11;
            if (this.f56204a == 2 && i11 > 376) {
                throw q3.B.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f56223t = 0;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] y() {
        return new C6678p[]{new K(1, s.a.f54127a)};
    }

    private void z(long j10) {
        if (!this.f56220q) {
            this.f56220q = true;
            if (this.f56215l.b() != -9223372036854775807L) {
                H h10 = new H(this.f56215l.c(), this.f56215l.b(), j10, this.f56224u, this.f56206c);
                this.f56216m = h10;
                this.f56217n.n(h10.b());
                return;
            }
            this.f56217n.n(new J.b(this.f56215l.b()));
        }
    }

    public void a(long j10, long j11) {
        H h10;
        C5950a.g(this.f56204a != 2);
        int size = this.f56207d.size();
        for (int i10 = 0; i10 < size; i10++) {
            H h11 = this.f56207d.get(i10);
            boolean z10 = h11.f() == -9223372036854775807L;
            if (!z10) {
                long d10 = h11.d();
                z10 = (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) ? false : true;
            }
            if (z10) {
                h11.i(j11);
            }
        }
        if (!(j11 == 0 || (h10 = this.f56216m) == null)) {
            h10.h(j11);
        }
        this.f56208e.S(0);
        this.f56209f.clear();
        for (int i11 = 0; i11 < this.f56212i.size(); i11++) {
            this.f56212i.valueAt(i11).c();
        }
        this.f56223t = 0;
    }

    public void b(r rVar) {
        if ((this.f56205b & 1) == 0) {
            rVar = new t(rVar, this.f56211h);
        }
        this.f56217n = rVar;
    }

    public boolean h(C6679q qVar) {
        byte[] e10 = this.f56208e.e();
        qVar.o(e10, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (e10[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            qVar.k(i10);
            return true;
        }
        return false;
    }

    public int j(C6679q qVar, I i10) {
        C6679q qVar2 = qVar;
        I i11 = i10;
        long length = qVar.getLength();
        boolean z10 = this.f56204a == 2;
        if (this.f56219p) {
            if (length != -1 && !z10 && !this.f56215l.d()) {
                return this.f56215l.e(qVar2, i11, this.f56224u);
            }
            z(length);
            if (this.f56221r) {
                this.f56221r = false;
                a(0, 0);
                if (qVar.getPosition() != 0) {
                    i11.f38760a = 0;
                    return 1;
                }
            }
            H h10 = this.f56216m;
            if (h10 != null && h10.d()) {
                return this.f56216m.c(qVar2, i11);
            }
        }
        if (!w(qVar)) {
            for (int i12 = 0; i12 < this.f56212i.size(); i12++) {
                L valueAt = this.f56212i.valueAt(i12);
                if (valueAt instanceof y) {
                    y yVar = (y) valueAt;
                    if (yVar.d(z10)) {
                        yVar.a(new B(), 1);
                    }
                }
            }
            return -1;
        }
        int x10 = x();
        int g10 = this.f56208e.g();
        if (x10 > g10) {
            return 0;
        }
        int q10 = this.f56208e.q();
        if ((8388608 & q10) != 0) {
            this.f56208e.W(x10);
            return 0;
        }
        int i13 = (4194304 & q10) != 0 ? 1 : 0;
        int i14 = (2096896 & q10) >> 8;
        boolean z11 = (q10 & 32) != 0;
        L l10 = (q10 & 16) != 0 ? this.f56212i.get(i14) : null;
        if (l10 == null) {
            this.f56208e.W(x10);
            return 0;
        }
        if (this.f56204a != 2) {
            int i15 = q10 & 15;
            int i16 = this.f56209f.get(i14, i15 - 1);
            this.f56209f.put(i14, i15);
            if (i16 == i15) {
                this.f56208e.W(x10);
                return 0;
            } else if (i15 != ((i16 + 1) & 15)) {
                l10.c();
            }
        }
        if (z11) {
            int H10 = this.f56208e.H();
            i13 |= (this.f56208e.H() & 64) != 0 ? 2 : 0;
            this.f56208e.X(H10 - 1);
        }
        boolean z12 = this.f56219p;
        if (B(i14)) {
            this.f56208e.V(x10);
            l10.a(this.f56208e, i13);
            this.f56208e.V(g10);
        }
        if (this.f56204a != 2 && !z12 && this.f56219p && length != -1) {
            this.f56221r = true;
        }
        this.f56208e.W(x10);
        return 0;
    }

    public void release() {
    }

    public K(int i10, int i11, s.a aVar, H h10, L.c cVar, int i12) {
        this.f56210g = (L.c) C5950a.e(cVar);
        this.f56206c = i12;
        this.f56204a = i10;
        this.f56205b = i11;
        this.f56211h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f56207d = Collections.singletonList(h10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f56207d = arrayList;
            arrayList.add(h10);
        }
        this.f56208e = new B(new byte[9400], 0);
        this.f56213j = new SparseBooleanArray();
        this.f56214k = new SparseBooleanArray();
        this.f56212i = new SparseArray<>();
        this.f56209f = new SparseIntArray();
        this.f56215l = new I(i12);
        this.f56217n = r.f38935b0;
        this.f56224u = -1;
        A();
    }
}
