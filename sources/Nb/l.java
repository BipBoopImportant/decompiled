package Nb;

import Kc.a;
import Sb.p;
import mc.C10035a;
import mc.C10036b;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final C10035a<a> f61985a;

    public l(C10035a<a> aVar) {
        this.f61985a = aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, C10036b bVar) {
        ((a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        this.f61985a.a(new k(new e(pVar)));
    }
}
