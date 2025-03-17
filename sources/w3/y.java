package w3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import q3.G;
import t3.C5950a;

public final class y implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f31512a;

    /* renamed from: b  reason: collision with root package name */
    private final G f31513b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31514c;

    public y(g gVar, G g10, int i10) {
        this.f31512a = (g) C5950a.e(gVar);
        this.f31513b = (G) C5950a.e(g10);
        this.f31514c = i10;
    }

    public long b(k kVar) {
        this.f31513b.b(this.f31514c);
        return this.f31512a.b(kVar);
    }

    public int c(byte[] bArr, int i10, int i11) {
        this.f31513b.b(this.f31514c);
        return this.f31512a.c(bArr, i10, i11);
    }

    public void close() {
        this.f31512a.close();
    }

    public Map<String, List<String>> e() {
        return this.f31512a.e();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f31512a.l(c10);
    }

    public Uri n() {
        return this.f31512a.n();
    }
}
