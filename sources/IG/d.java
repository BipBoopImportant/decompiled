package Ig;

import D4.C6444s;
import D4.K;
import D4.L;
import D4.M;
import D4.P;
import Kg.a;
import TJ.C16532g;
import Tp.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vr.C12206a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LIg/d;", "LIg/a;", "Lvr/a;", "inspireRepository", "LTp/b;", "discoverRepository", "<init>", "(Lvr/a;LTp/b;)V", "LTJ/g;", "LD4/M;", "LKg/a;", "a", "()LTJ/g;", "Lzr/d;", "filter", "LXH/N;", "c", "(Lzr/d;)V", "b", "()Lzr/d;", "Lvr/a;", "LTp/b;", "Lzr/d;", "LD4/s;", "LIg/e;", "d", "LD4/s;", "invalidatingPagingSourceFactory", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C12206a f61058a;

    /* renamed from: b  reason: collision with root package name */
    private final b f61059b;

    /* renamed from: c  reason: collision with root package name */
    private zr.d f61060c = zr.d.f107570e.a();

    /* renamed from: d  reason: collision with root package name */
    private final C6444s<e, a> f61061d = new C6444s<>(new b(this));

    public d(C12206a aVar, b bVar) {
        C17542s.j(aVar, "inspireRepository");
        C17542s.j(bVar, "discoverRepository");
        this.f61058a = aVar;
        this.f61059b = bVar;
    }

    /* access modifiers changed from: private */
    public static final zr.d f(d dVar) {
        return dVar.f61060c;
    }

    /* access modifiers changed from: private */
    public static final P g(d dVar) {
        return new g(dVar.f61058a, dVar.f61059b, dVar.f61060c);
    }

    public C16532g<M<a>> a() {
        return new K(new L(20, 5, false, 20, 0, 0, 48, (DefaultConstructorMarker) null), new e("", 0, new c(this), 0, 8, (DefaultConstructorMarker) null), this.f61061d).a();
    }

    public zr.d b() {
        return this.f61060c;
    }

    public void c(zr.d dVar) {
        C17542s.j(dVar, "filter");
        this.f61060c = dVar;
        this.f61061d.a();
    }
}
