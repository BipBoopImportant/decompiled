package t9;

import WH.C16729a;
import n9.b;
import v9.C8903a;

public final class N implements b<M> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<C8903a> f56688a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8903a> f56689b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<C8857e> f56690c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<W> f56691d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<String> f56692e;

    public N(C16729a<C8903a> aVar, C16729a<C8903a> aVar2, C16729a<C8857e> aVar3, C16729a<W> aVar4, C16729a<String> aVar5) {
        this.f56688a = aVar;
        this.f56689b = aVar2;
        this.f56690c = aVar3;
        this.f56691d = aVar4;
        this.f56692e = aVar5;
    }

    public static N a(C16729a<C8903a> aVar, C16729a<C8903a> aVar2, C16729a<C8857e> aVar3, C16729a<W> aVar4, C16729a<String> aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(C8903a aVar, C8903a aVar2, Object obj, Object obj2, C16729a<String> aVar3) {
        return new M(aVar, aVar2, (C8857e) obj, (W) obj2, aVar3);
    }

    /* renamed from: b */
    public M get() {
        return c(this.f56688a.get(), this.f56689b.get(), this.f56690c.get(), this.f56691d.get(), this.f56692e);
    }
}
