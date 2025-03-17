package r9;

import WH.C16729a;
import java.util.concurrent.Executor;
import m9.C8568e;
import n9.b;
import s9.x;
import t9.C8856d;
import u9.C8888b;

public final class d implements b<C8713c> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Executor> f55793a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8568e> f55794b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<x> f55795c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<C8856d> f55796d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<C8888b> f55797e;

    public d(C16729a<Executor> aVar, C16729a<C8568e> aVar2, C16729a<x> aVar3, C16729a<C8856d> aVar4, C16729a<C8888b> aVar5) {
        this.f55793a = aVar;
        this.f55794b = aVar2;
        this.f55795c = aVar3;
        this.f55796d = aVar4;
        this.f55797e = aVar5;
    }

    public static d a(C16729a<Executor> aVar, C16729a<C8568e> aVar2, C16729a<x> aVar3, C16729a<C8856d> aVar4, C16729a<C8888b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C8713c c(Executor executor, C8568e eVar, x xVar, C8856d dVar, C8888b bVar) {
        return new C8713c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b */
    public C8713c get() {
        return c(this.f55793a.get(), this.f55794b.get(), this.f55795c.get(), this.f55796d.get(), this.f55797e.get());
    }
}
