package i4;

import N3.S;
import i4.i;
import java.util.ArrayList;
import java.util.Arrays;
import kb.C9967v;
import q3.C5807s;
import t3.B;
import t3.C5950a;

final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f53130n;

    /* renamed from: o  reason: collision with root package name */
    private int f53131o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f53132p;

    /* renamed from: q  reason: collision with root package name */
    private S.c f53133q;

    /* renamed from: r  reason: collision with root package name */
    private S.a f53134r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final S.c f53135a;

        /* renamed from: b  reason: collision with root package name */
        public final S.a f53136b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f53137c;

        /* renamed from: d  reason: collision with root package name */
        public final S.b[] f53138d;

        /* renamed from: e  reason: collision with root package name */
        public final int f53139e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f53135a = cVar;
            this.f53136b = aVar;
            this.f53137c = bArr;
            this.f53138d = bVarArr;
            this.f53139e = i10;
        }
    }

    j() {
    }

    static void n(B b10, long j10) {
        if (b10.b() < b10.g() + 4) {
            b10.T(Arrays.copyOf(b10.e(), b10.g() + 4));
        } else {
            b10.V(b10.g() + 4);
        }
        byte[] e10 = b10.e();
        e10[b10.g() - 4] = (byte) ((int) (j10 & 255));
        e10[b10.g() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        e10[b10.g() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        e10[b10.g() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f53138d[p(b10, aVar.f53139e, 1)].f38795a ? aVar.f53135a.f38805g : aVar.f53135a.f38806h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(B b10) {
        try {
            return S.o(1, b10, true);
        } catch (q3.B unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        super.e(j10);
        int i10 = 0;
        this.f53132p = j10 != 0;
        S.c cVar = this.f53133q;
        if (cVar != null) {
            i10 = cVar.f38805g;
        }
        this.f53131o = i10;
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        int i10 = 0;
        if ((b10.e()[0] & 1) == 1) {
            return -1;
        }
        int o10 = o(b10.e()[0], (a) C5950a.i(this.f53130n));
        if (this.f53132p) {
            i10 = (this.f53131o + o10) / 4;
        }
        long j10 = (long) i10;
        n(b10, j10);
        this.f53132p = true;
        this.f53131o = o10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean i(B b10, long j10, i.b bVar) {
        if (this.f53130n != null) {
            C5950a.e(bVar.f53128a);
            return false;
        }
        a q10 = q(b10);
        this.f53130n = q10;
        if (q10 == null) {
            return true;
        }
        S.c cVar = q10.f53135a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f38808j);
        arrayList.add(q10.f53137c);
        bVar.f53128a = new C5807s.b().s0("audio/vorbis").P(cVar.f38803e).n0(cVar.f38802d).Q(cVar.f38800b).t0(cVar.f38801c).f0(arrayList).l0(S.d(C9967v.B(q10.f53136b.f38793b))).M();
        return true;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f53130n = null;
            this.f53133q = null;
            this.f53134r = null;
        }
        this.f53131o = 0;
        this.f53132p = false;
    }

    /* access modifiers changed from: package-private */
    public a q(B b10) {
        S.c cVar = this.f53133q;
        if (cVar == null) {
            this.f53133q = S.l(b10);
            return null;
        }
        S.a aVar = this.f53134r;
        if (aVar == null) {
            this.f53134r = S.j(b10);
            return null;
        }
        byte[] bArr = new byte[b10.g()];
        System.arraycopy(b10.e(), 0, bArr, 0, b10.g());
        S.b[] m10 = S.m(b10, cVar.f38800b);
        return new a(cVar, aVar, bArr, m10, S.b(m10.length - 1));
    }
}
