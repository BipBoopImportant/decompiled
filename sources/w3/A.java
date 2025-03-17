package w3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t3.C5950a;

public final class A implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f31390a;

    /* renamed from: b  reason: collision with root package name */
    private long f31391b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f31392c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f31393d = Collections.emptyMap();

    public A(g gVar) {
        this.f31390a = (g) C5950a.e(gVar);
    }

    public long b(k kVar) {
        this.f31392c = kVar.f31433a;
        this.f31393d = Collections.emptyMap();
        try {
            return this.f31390a.b(kVar);
        } finally {
            Uri n10 = n();
            if (n10 != null) {
                this.f31392c = n10;
            }
            this.f31393d = e();
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        int c10 = this.f31390a.c(bArr, i10, i11);
        if (c10 != -1) {
            this.f31391b += (long) c10;
        }
        return c10;
    }

    public void close() {
        this.f31390a.close();
    }

    public Map<String, List<String>> e() {
        return this.f31390a.e();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f31390a.l(c10);
    }

    public Uri n() {
        return this.f31390a.n();
    }

    public long p() {
        return this.f31391b;
    }

    public Uri q() {
        return this.f31392c;
    }

    public Map<String, List<String>> r() {
        return this.f31393d;
    }

    public void s() {
        this.f31391b = 0;
    }
}
