package i4;

import N3.C6679q;
import N3.J;
import N3.v;
import N3.w;
import N3.x;
import N3.y;
import i4.i;
import java.util.Arrays;
import q3.z;
import t3.B;
import t3.C5950a;
import t3.N;

/* renamed from: i4.b  reason: case insensitive filesystem */
final class C8208b extends i {

    /* renamed from: n  reason: collision with root package name */
    private y f53086n;

    /* renamed from: o  reason: collision with root package name */
    private a f53087o;

    /* renamed from: i4.b$a */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private y f53088a;

        /* renamed from: b  reason: collision with root package name */
        private y.a f53089b;

        /* renamed from: c  reason: collision with root package name */
        private long f53090c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f53091d = -1;

        public a(y yVar, y.a aVar) {
            this.f53088a = yVar;
            this.f53089b = aVar;
        }

        public J a() {
            C5950a.g(this.f53090c != -1);
            return new x(this.f53088a, this.f53090c);
        }

        public long b(C6679q qVar) {
            long j10 = this.f53091d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f53091d = -1;
            return j11;
        }

        public void c(long j10) {
            long[] jArr = this.f53089b.f38953a;
            this.f53091d = jArr[N.h(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f53090c = j10;
        }
    }

    C8208b() {
    }

    private int n(B b10) {
        int i10 = (b10.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            b10.X(4);
            b10.Q();
        }
        int j10 = v.j(b10, i10);
        b10.W(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(B b10) {
        return b10.a() >= 5 && b10.H() == 127 && b10.J() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        if (!o(b10.e())) {
            return -1;
        }
        return (long) n(b10);
    }

    /* access modifiers changed from: protected */
    public boolean i(B b10, long j10, i.b bVar) {
        byte[] e10 = b10.e();
        y yVar = this.f53086n;
        if (yVar == null) {
            y yVar2 = new y(e10, 17);
            this.f53086n = yVar2;
            bVar.f53128a = yVar2.g(Arrays.copyOfRange(e10, 9, b10.g()), (z) null);
            return true;
        } else if ((e10[0] & Byte.MAX_VALUE) == 3) {
            y.a g10 = w.g(b10);
            y b11 = yVar.b(g10);
            this.f53086n = b11;
            this.f53087o = new a(b11, g10);
            return true;
        } else if (!o(e10)) {
            return true;
        } else {
            a aVar = this.f53087o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f53129b = this.f53087o;
            }
            C5950a.e(bVar.f53128a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f53086n = null;
            this.f53087o = null;
        }
    }
}
