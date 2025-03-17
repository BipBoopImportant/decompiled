package s9;

import WH.C16729a;
import android.content.Context;
import java.util.concurrent.Executor;
import m9.C8568e;
import n9.b;
import t9.C8855c;
import t9.C8856d;
import u9.C8888b;
import v9.C8903a;

public final class s implements b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f56050a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8568e> f56051b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<C8856d> f56052c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<x> f56053d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<Executor> f56054e;

    /* renamed from: f  reason: collision with root package name */
    private final C16729a<C8888b> f56055f;

    /* renamed from: g  reason: collision with root package name */
    private final C16729a<C8903a> f56056g;

    /* renamed from: h  reason: collision with root package name */
    private final C16729a<C8903a> f56057h;

    /* renamed from: i  reason: collision with root package name */
    private final C16729a<C8855c> f56058i;

    public s(C16729a<Context> aVar, C16729a<C8568e> aVar2, C16729a<C8856d> aVar3, C16729a<x> aVar4, C16729a<Executor> aVar5, C16729a<C8888b> aVar6, C16729a<C8903a> aVar7, C16729a<C8903a> aVar8, C16729a<C8855c> aVar9) {
        this.f56050a = aVar;
        this.f56051b = aVar2;
        this.f56052c = aVar3;
        this.f56053d = aVar4;
        this.f56054e = aVar5;
        this.f56055f = aVar6;
        this.f56056g = aVar7;
        this.f56057h = aVar8;
        this.f56058i = aVar9;
    }

    public static s a(C16729a<Context> aVar, C16729a<C8568e> aVar2, C16729a<C8856d> aVar3, C16729a<x> aVar4, C16729a<Executor> aVar5, C16729a<C8888b> aVar6, C16729a<C8903a> aVar7, C16729a<C8903a> aVar8, C16729a<C8855c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, C8568e eVar, C8856d dVar, x xVar, Executor executor, C8888b bVar, C8903a aVar, C8903a aVar2, C8855c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public r get() {
        return c(this.f56050a.get(), this.f56051b.get(), this.f56052c.get(), this.f56053d.get(), this.f56054e.get(), this.f56055f.get(), this.f56056g.get(), this.f56057h.get(), this.f56058i.get());
    }
}
