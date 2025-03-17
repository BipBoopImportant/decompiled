package H9;

import K9.C6620s;
import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import j0.C5446b;

/* renamed from: H9.z  reason: case insensitive filesystem */
public final class C6551z extends u0 {

    /* renamed from: f  reason: collision with root package name */
    private final C5446b f36656f = new C5446b();

    /* renamed from: g  reason: collision with root package name */
    private final C6531e f36657g;

    C6551z(C6535i iVar, C6531e eVar, a aVar) {
        super(iVar, aVar);
        this.f36657g = eVar;
        this.f36579a.h("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C6531e eVar, C6528b bVar) {
        C6535i d10 = C6534h.d(activity);
        C6551z zVar = (C6551z) d10.e("ConnectionlessLifecycleHelper", C6551z.class);
        if (zVar == null) {
            zVar = new C6551z(d10, eVar, a.n());
        }
        C6620s.m(bVar, "ApiKey cannot be null");
        zVar.f36656f.add(bVar);
        eVar.b(zVar);
    }

    private final void v() {
        if (!this.f36656f.isEmpty()) {
            this.f36657g.b(this);
        }
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f36657g.c(this);
    }

    /* access modifiers changed from: protected */
    public final void m(ConnectionResult connectionResult, int i10) {
        this.f36657g.F(connectionResult, i10);
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f36657g.G();
    }

    /* access modifiers changed from: package-private */
    public final C5446b t() {
        return this.f36656f;
    }
}
