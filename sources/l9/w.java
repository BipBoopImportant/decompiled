package l9;

import WH.C16729a;
import n9.b;
import r9.e;
import s9.r;
import s9.v;
import v9.C8903a;

public final class w implements b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<C8903a> f54910a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8903a> f54911b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<e> f54912c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<r> f54913d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<v> f54914e;

    public w(C16729a<C8903a> aVar, C16729a<C8903a> aVar2, C16729a<e> aVar3, C16729a<r> aVar4, C16729a<v> aVar5) {
        this.f54910a = aVar;
        this.f54911b = aVar2;
        this.f54912c = aVar3;
        this.f54913d = aVar4;
        this.f54914e = aVar5;
    }

    public static w a(C16729a<C8903a> aVar, C16729a<C8903a> aVar2, C16729a<e> aVar3, C16729a<r> aVar4, C16729a<v> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(C8903a aVar, C8903a aVar2, e eVar, r rVar, v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public u get() {
        return c(this.f54910a.get(), this.f54911b.get(), this.f54912c.get(), this.f54913d.get(), this.f54914e.get());
    }
}
