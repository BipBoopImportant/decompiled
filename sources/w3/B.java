package w3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import t3.C5950a;

public final class B implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f31394a;

    /* renamed from: b  reason: collision with root package name */
    private final f f31395b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31396c;

    /* renamed from: d  reason: collision with root package name */
    private long f31397d;

    public B(g gVar, f fVar) {
        this.f31394a = (g) C5950a.e(gVar);
        this.f31395b = (f) C5950a.e(fVar);
    }

    public long b(k kVar) {
        long b10 = this.f31394a.b(kVar);
        this.f31397d = b10;
        if (b10 == 0) {
            return 0;
        }
        if (kVar.f31440h == -1 && b10 != -1) {
            kVar = kVar.e(0, b10);
        }
        this.f31396c = true;
        this.f31395b.b(kVar);
        return this.f31397d;
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (this.f31397d == 0) {
            return -1;
        }
        int c10 = this.f31394a.c(bArr, i10, i11);
        if (c10 > 0) {
            this.f31395b.L(bArr, i10, c10);
            long j10 = this.f31397d;
            if (j10 != -1) {
                this.f31397d = j10 - ((long) c10);
            }
        }
        return c10;
    }

    public void close() {
        try {
            this.f31394a.close();
        } finally {
            if (this.f31396c) {
                this.f31396c = false;
                this.f31395b.close();
            }
        }
    }

    public Map<String, List<String>> e() {
        return this.f31394a.e();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f31394a.l(c10);
    }

    public Uri n() {
        return this.f31394a.n();
    }
}
