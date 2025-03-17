package l9;

import j9.c;
import j9.d;
import j9.h;
import j9.i;
import j9.k;

final class s<T> implements i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f54900a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54901b;

    /* renamed from: c  reason: collision with root package name */
    private final c f54902c;

    /* renamed from: d  reason: collision with root package name */
    private final h<T, byte[]> f54903d;

    /* renamed from: e  reason: collision with root package name */
    private final t f54904e;

    s(p pVar, String str, c cVar, h<T, byte[]> hVar, t tVar) {
        this.f54900a = pVar;
        this.f54901b = str;
        this.f54902c = cVar;
        this.f54903d = hVar;
        this.f54904e = tVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    public void a(d<T> dVar, k kVar) {
        this.f54904e.a(o.a().e(this.f54900a).c(dVar).f(this.f54901b).d(this.f54903d).b(this.f54902c).a(), kVar);
    }

    public void b(d<T> dVar) {
        a(dVar, new r());
    }

    /* access modifiers changed from: package-private */
    public p d() {
        return this.f54900a;
    }
}
