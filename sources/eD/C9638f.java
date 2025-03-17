package ed;

import Zc.C9395d;
import Zc.C9400i;
import bd.C9428b;
import ha.E8;

/* renamed from: ed.f  reason: case insensitive filesystem */
public final class C9638f {

    /* renamed from: a  reason: collision with root package name */
    private final C9639g f72596a;

    /* renamed from: b  reason: collision with root package name */
    private final C9395d f72597b;

    /* renamed from: c  reason: collision with root package name */
    private final C9400i f72598c;

    C9638f(C9639g gVar, C9395d dVar, C9400i iVar) {
        this.f72596a = gVar;
        this.f72597b = dVar;
        this.f72598c = iVar;
    }

    public final C9633a a(C9428b bVar) {
        return new C9633a(bVar, (C9642j) this.f72596a.b(bVar), this.f72597b.a(bVar.c()), E8.b(C9635c.d()), this.f72598c);
    }
}
