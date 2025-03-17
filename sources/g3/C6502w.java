package G3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import t3.B;
import t3.C5950a;
import w3.C;
import w3.g;
import w3.k;

/* renamed from: G3.w  reason: case insensitive filesystem */
final class C6502w implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f35994a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35995b;

    /* renamed from: c  reason: collision with root package name */
    private final a f35996c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f35997d;

    /* renamed from: e  reason: collision with root package name */
    private int f35998e;

    /* renamed from: G3.w$a */
    public interface a {
        void a(B b10);
    }

    public C6502w(g gVar, int i10, a aVar) {
        C5950a.a(i10 > 0);
        this.f35994a = gVar;
        this.f35995b = i10;
        this.f35996c = aVar;
        this.f35997d = new byte[1];
        this.f35998e = i10;
    }

    private boolean p() {
        if (this.f35994a.c(this.f35997d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f35997d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int c10 = this.f35994a.c(bArr, i12, i11);
            if (c10 == -1) {
                return false;
            }
            i12 += c10;
            i11 -= c10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f35996c.a(new B(bArr, i10));
        }
        return true;
    }

    public long b(k kVar) {
        throw new UnsupportedOperationException();
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (this.f35998e == 0) {
            if (!p()) {
                return -1;
            }
            this.f35998e = this.f35995b;
        }
        int c10 = this.f35994a.c(bArr, i10, Math.min(this.f35998e, i11));
        if (c10 != -1) {
            this.f35998e -= c10;
        }
        return c10;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> e() {
        return this.f35994a.e();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f35994a.l(c10);
    }

    public Uri n() {
        return this.f35994a.n();
    }
}
