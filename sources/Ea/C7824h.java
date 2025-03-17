package ea;

import H9.C6536j;
import H9.C6542p;
import xa.C8972m;

/* renamed from: ea.h  reason: case insensitive filesystem */
final class C7824h implements C6542p, D {

    /* renamed from: a  reason: collision with root package name */
    private final C7823g f50954a;

    /* renamed from: b  reason: collision with root package name */
    private C6536j f50955b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50956c = true;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C7825i f50957d;

    C7824h(C7825i iVar, C6536j jVar, C7823g gVar) {
        this.f50957d = iVar;
        this.f50955b = jVar;
        this.f50954a = gVar;
    }

    public final synchronized void a(C6536j jVar) {
        C6536j jVar2 = this.f50955b;
        if (jVar2 != jVar) {
            jVar2.a();
            this.f50955b = jVar;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C6536j.a b10;
        boolean z10;
        I i10 = (I) obj;
        C8972m mVar = (C8972m) obj2;
        synchronized (this) {
            b10 = this.f50955b.b();
            z10 = this.f50956c;
            this.f50955b.a();
        }
        if (b10 == null) {
            mVar.c(Boolean.FALSE);
        } else {
            this.f50954a.a(i10, b10, z10, mVar);
        }
    }

    public final synchronized C6536j zza() {
        return this.f50955b;
    }

    public final void zzc() {
        C6536j.a b10;
        synchronized (this) {
            this.f50956c = false;
            b10 = this.f50955b.b();
        }
        if (b10 != null) {
            this.f50957d.p(b10, 2441);
        }
    }
}
