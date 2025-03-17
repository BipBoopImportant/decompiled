package q4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.C8427k;
import s3.a;
import t3.N;

/* renamed from: q4.h  reason: case insensitive filesystem */
final class C8672h implements C8427k {

    /* renamed from: a  reason: collision with root package name */
    private final C8667c f55510a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f55511b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, C8671g> f55512c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, C8669e> f55513d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f55514e;

    public C8672h(C8667c cVar, Map<String, C8671g> map, Map<String, C8669e> map2, Map<String, String> map3) {
        this.f55510a = cVar;
        this.f55513d = map2;
        this.f55514e = map3;
        this.f55512c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f55511b = cVar.j();
    }

    public int a(long j10) {
        int e10 = N.e(this.f55511b, j10, false, false);
        if (e10 < this.f55511b.length) {
            return e10;
        }
        return -1;
    }

    public List<a> b(long j10) {
        return this.f55510a.h(j10, this.f55512c, this.f55513d, this.f55514e);
    }

    public long j(int i10) {
        return this.f55511b[i10];
    }

    public int m() {
        return this.f55511b.length;
    }
}
