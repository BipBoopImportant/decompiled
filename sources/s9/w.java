package s9;

import WH.C16729a;
import java.util.concurrent.Executor;
import n9.b;
import t9.C8856d;
import u9.C8888b;

public final class w implements b<v> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Executor> f56065a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8856d> f56066b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<x> f56067c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<C8888b> f56068d;

    public w(C16729a<Executor> aVar, C16729a<C8856d> aVar2, C16729a<x> aVar3, C16729a<C8888b> aVar4) {
        this.f56065a = aVar;
        this.f56066b = aVar2;
        this.f56067c = aVar3;
        this.f56068d = aVar4;
    }

    public static w a(C16729a<Executor> aVar, C16729a<C8856d> aVar2, C16729a<x> aVar3, C16729a<C8888b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, C8856d dVar, x xVar, C8888b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b */
    public v get() {
        return c(this.f56065a.get(), this.f56066b.get(), this.f56067c.get(), this.f56068d.get());
    }
}
