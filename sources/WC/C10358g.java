package wc;

import Fb.f;
import WH.C16729a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import j9.j;
import mc.C10036b;
import nH.C17624c;
import nc.e;

/* renamed from: wc.g  reason: case insensitive filesystem */
public final class C10358g implements C17624c<C10356e> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<f> f77603a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C10036b<c>> f77604b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<e> f77605c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<C10036b<j>> f77606d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<RemoteConfigManager> f77607e;

    /* renamed from: f  reason: collision with root package name */
    private final C16729a<a> f77608f;

    /* renamed from: g  reason: collision with root package name */
    private final C16729a<SessionManager> f77609g;

    public C10358g(C16729a<f> aVar, C16729a<C10036b<c>> aVar2, C16729a<e> aVar3, C16729a<C10036b<j>> aVar4, C16729a<RemoteConfigManager> aVar5, C16729a<a> aVar6, C16729a<SessionManager> aVar7) {
        this.f77603a = aVar;
        this.f77604b = aVar2;
        this.f77605c = aVar3;
        this.f77606d = aVar4;
        this.f77607e = aVar5;
        this.f77608f = aVar6;
        this.f77609g = aVar7;
    }

    public static C10358g a(C16729a<f> aVar, C16729a<C10036b<c>> aVar2, C16729a<e> aVar3, C16729a<C10036b<j>> aVar4, C16729a<RemoteConfigManager> aVar5, C16729a<a> aVar6, C16729a<SessionManager> aVar7) {
        return new C10358g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static C10356e c(f fVar, C10036b<c> bVar, e eVar, C10036b<j> bVar2, RemoteConfigManager remoteConfigManager, a aVar, SessionManager sessionManager) {
        return new C10356e(fVar, bVar, eVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    /* renamed from: b */
    public C10356e get() {
        return c(this.f77603a.get(), this.f77604b.get(), this.f77605c.get(), this.f77606d.get(), this.f77607e.get(), this.f77608f.get(), this.f77609g.get());
    }
}
