package i4;

import N3.C6662H;
import N3.S;
import i4.i;
import java.util.Arrays;
import java.util.List;
import kb.C9967v;
import q3.C5807s;
import q3.z;
import t3.B;
import t3.C5950a;

final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f53112o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f53113p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f53114n;

    h() {
    }

    private static boolean n(B b10, byte[] bArr) {
        if (b10.a() < bArr.length) {
            return false;
        }
        int f10 = b10.f();
        byte[] bArr2 = new byte[bArr.length];
        b10.l(bArr2, 0, bArr.length);
        b10.W(f10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(B b10) {
        return n(b10, f53112o);
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        return c(C6662H.e(b10.e()));
    }

    /* access modifiers changed from: protected */
    public boolean i(B b10, long j10, i.b bVar) {
        if (n(b10, f53112o)) {
            byte[] copyOf = Arrays.copyOf(b10.e(), b10.g());
            int c10 = C6662H.c(copyOf);
            List<byte[]> a10 = C6662H.a(copyOf);
            if (bVar.f53128a != null) {
                return true;
            }
            bVar.f53128a = new C5807s.b().s0("audio/opus").Q(c10).t0(48000).f0(a10).M();
            return true;
        }
        byte[] bArr = f53113p;
        if (n(b10, bArr)) {
            C5950a.i(bVar.f53128a);
            if (this.f53114n) {
                return true;
            }
            this.f53114n = true;
            b10.X(bArr.length);
            z d10 = S.d(C9967v.B(S.k(b10, false, false).f38793b));
            if (d10 == null) {
                return true;
            }
            bVar.f53128a = bVar.f53128a.b().l0(d10.b(bVar.f53128a.f28241l)).M();
            return true;
        }
        C5950a.i(bVar.f53128a);
        return false;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f53114n = false;
        }
    }
}
