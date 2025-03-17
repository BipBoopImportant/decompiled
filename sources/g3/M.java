package G3;

import G3.C6478B;
import I3.x;
import androidx.media3.exoplayer.Y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import kb.C9925E;
import q3.C5807s;
import q3.K;
import t3.C5950a;
import z3.J;

final class M implements C6478B, C6478B.a {

    /* renamed from: a  reason: collision with root package name */
    private final C6478B[] f35649a;

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<a0, Integer> f35650b;

    /* renamed from: c  reason: collision with root package name */
    private final C6489i f35651c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<C6478B> f35652d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<K, K> f35653e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private C6478B.a f35654f;

    /* renamed from: g  reason: collision with root package name */
    private k0 f35655g;

    /* renamed from: h  reason: collision with root package name */
    private C6478B[] f35656h;

    /* renamed from: i  reason: collision with root package name */
    private b0 f35657i;

    private static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final x f35658a;

        /* renamed from: b  reason: collision with root package name */
        private final K f35659b;

        public a(x xVar, K k10) {
            this.f35658a = xVar;
            this.f35659b = k10;
        }

        public C5807s a(int i10) {
            return this.f35659b.a(this.f35658a.b(i10));
        }

        public int b(int i10) {
            return this.f35658a.b(i10);
        }

        public void c() {
            this.f35658a.c();
        }

        public void e(float f10) {
            this.f35658a.e(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35658a.equals(aVar.f35658a) && this.f35659b.equals(aVar.f35659b);
        }

        public void f() {
            this.f35658a.f();
        }

        public int g(int i10) {
            return this.f35658a.g(i10);
        }

        public K h() {
            return this.f35659b;
        }

        public int hashCode() {
            return ((527 + this.f35659b.hashCode()) * 31) + this.f35658a.hashCode();
        }

        public void i(boolean z10) {
            this.f35658a.i(z10);
        }

        public void j() {
            this.f35658a.j();
        }

        public int k() {
            return this.f35658a.k();
        }

        public C5807s l() {
            return this.f35659b.a(this.f35658a.k());
        }

        public int length() {
            return this.f35658a.length();
        }

        public void m() {
            this.f35658a.m();
        }
    }

    public M(C6489i iVar, long[] jArr, C6478B... bArr) {
        this.f35651c = iVar;
        this.f35649a = bArr;
        this.f35657i = iVar.b();
        this.f35650b = new IdentityHashMap<>();
        this.f35656h = new C6478B[0];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f35649a[i10] = new h0(bArr[i10], j10);
            }
        }
    }

    public boolean a() {
        return this.f35657i.a();
    }

    public boolean b(Y y10) {
        if (this.f35652d.isEmpty()) {
            return this.f35657i.b(y10);
        }
        int size = this.f35652d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35652d.get(i10).b(y10);
        }
        return false;
    }

    public long c() {
        return this.f35657i.c();
    }

    public long d() {
        return this.f35657i.d();
    }

    public void e(long j10) {
        this.f35657i.e(j10);
    }

    public void f(C6478B b10) {
        this.f35652d.remove(b10);
        if (this.f35652d.isEmpty()) {
            int i10 = 0;
            for (C6478B s10 : this.f35649a) {
                i10 += s10.s().f35939a;
            }
            K[] kArr = new K[i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                C6478B[] bArr = this.f35649a;
                if (i11 < bArr.length) {
                    k0 s11 = bArr[i11].s();
                    int i13 = s11.f35939a;
                    int i14 = 0;
                    while (i14 < i13) {
                        K b11 = s11.b(i14);
                        C5807s[] sVarArr = new C5807s[b11.f27943a];
                        for (int i15 = 0; i15 < b11.f27943a; i15++) {
                            C5807s a10 = b11.a(i15);
                            C5807s.b b12 = a10.b();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i11);
                            sb2.append(":");
                            String str = a10.f28230a;
                            if (str == null) {
                                str = "";
                            }
                            sb2.append(str);
                            sVarArr[i15] = b12.e0(sb2.toString()).M();
                        }
                        K k10 = new K(i11 + ":" + b11.f27944b, sVarArr);
                        this.f35653e.put(k10, b11);
                        kArr[i12] = k10;
                        i14++;
                        i12++;
                    }
                    i11++;
                } else {
                    this.f35655g = new k0(kArr);
                    ((C6478B.a) C5950a.e(this.f35654f)).f(this);
                    return;
                }
            }
        }
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        Integer num;
        x[] xVarArr2 = xVarArr;
        a0[] a0VarArr2 = a0VarArr;
        int[] iArr = new int[xVarArr2.length];
        int[] iArr2 = new int[xVarArr2.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            num = 0;
            if (i11 >= xVarArr2.length) {
                break;
            }
            a0 a0Var = a0VarArr2[i11];
            if (a0Var != null) {
                num = this.f35650b.get(a0Var);
            }
            iArr[i11] = num == null ? -1 : num.intValue();
            x xVar = xVarArr2[i11];
            if (xVar != null) {
                String str = xVar.h().f27944b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f35650b.clear();
        int length = xVarArr2.length;
        a0[] a0VarArr3 = new a0[length];
        a0[] a0VarArr4 = new a0[xVarArr2.length];
        x[] xVarArr3 = new x[xVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f35649a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f35649a.length) {
            for (int i13 = i10; i13 < xVarArr2.length; i13++) {
                a0VarArr4[i13] = iArr[i13] == i12 ? a0VarArr2[i13] : num;
                if (iArr2[i13] == i12) {
                    x xVar2 = (x) C5950a.e(xVarArr2[i13]);
                    xVarArr3[i13] = new a(xVar2, (K) C5950a.e(this.f35653e.get(xVar2.h())));
                } else {
                    xVarArr3[i13] = num;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            x[] xVarArr4 = xVarArr3;
            long g10 = this.f35649a[i12].g(xVarArr3, zArr, a0VarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = g10;
            } else if (g10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < xVarArr2.length; i15++) {
                boolean z11 = true;
                if (iArr2[i15] == i14) {
                    a0VarArr3[i15] = a0VarArr4[i15];
                    this.f35650b.put((a0) C5950a.e(a0VarArr4[i15]), Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    if (a0VarArr4[i15] != null) {
                        z11 = false;
                    }
                    C5950a.g(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.f35649a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            xVarArr3 = xVarArr4;
            i10 = 0;
            num = null;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(a0VarArr3, i16, a0VarArr2, i16, length);
        this.f35656h = (C6478B[]) arrayList3.toArray(new C6478B[i16]);
        this.f35657i = this.f35651c.a(arrayList3, C9925E.h(arrayList3, new L()));
        return j11;
    }

    public long i(long j10) {
        long i10 = this.f35656h[0].i(j10);
        int i11 = 1;
        while (true) {
            C6478B[] bArr = this.f35656h;
            if (i11 >= bArr.length) {
                return i10;
            }
            if (bArr[i11].i(i10) == i10) {
                i11++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public void j(C6478B.a aVar, long j10) {
        this.f35654f = aVar;
        Collections.addAll(this.f35652d, this.f35649a);
        for (C6478B j11 : this.f35649a) {
            j11.j(this, j10);
        }
    }

    public long l() {
        long j10 = -9223372036854775807L;
        for (C6478B b10 : this.f35656h) {
            long l10 = b10.l();
            if (l10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    C6478B[] bArr = this.f35656h;
                    int length = bArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        C6478B b11 = bArr[i10];
                        if (b11 == b10) {
                            break;
                        } else if (b11.i(l10) == l10) {
                            i10++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = l10;
                } else if (l10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j10 == -9223372036854775807L || b10.i(j10) == j10)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    public C6478B m(int i10) {
        C6478B b10 = this.f35649a[i10];
        return b10 instanceof h0 ? ((h0) b10).k() : b10;
    }

    public void o() {
        for (C6478B o10 : this.f35649a) {
            o10.o();
        }
    }

    public long p(long j10, J j11) {
        C6478B[] bArr = this.f35656h;
        return (bArr.length > 0 ? bArr[0] : this.f35649a[0]).p(j10, j11);
    }

    /* renamed from: q */
    public void h(C6478B b10) {
        ((C6478B.a) C5950a.e(this.f35654f)).h(this);
    }

    public k0 s() {
        return (k0) C5950a.e(this.f35655g);
    }

    public void u(long j10, boolean z10) {
        for (C6478B u10 : this.f35656h) {
            u10.u(j10, z10);
        }
    }
}
