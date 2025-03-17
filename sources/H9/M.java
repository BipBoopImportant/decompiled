package H9;

import K9.C6604c;
import K9.C6613k;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Set;

final class M implements C6604c.C0599c, g0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f36515a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6528b f36516b;

    /* renamed from: c  reason: collision with root package name */
    private C6613k f36517c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f36518d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f36519e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C6531e f36520f;

    public M(C6531e eVar, a.f fVar, C6528b bVar) {
        this.f36520f = eVar;
        this.f36515a = fVar;
        this.f36516b = bVar;
    }

    /* access modifiers changed from: private */
    public final void i() {
        C6613k kVar;
        if (this.f36519e && (kVar = this.f36517c) != null) {
            this.f36515a.b(kVar, this.f36518d);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.f36520f.f36573n.post(new L(this, connectionResult));
    }

    public final void b(C6613k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
            return;
        }
        this.f36517c = kVar;
        this.f36518d = set;
        i();
    }

    public final void c(ConnectionResult connectionResult) {
        I i10 = (I) this.f36520f.f36569j.get(this.f36516b);
        if (i10 != null) {
            i10.G(connectionResult);
        }
    }

    public final void d(int i10) {
        I i11 = (I) this.f36520f.f36569j.get(this.f36516b);
        if (i11 == null) {
            return;
        }
        if (i11.f36506o) {
            i11.G(new ConnectionResult(17));
        } else {
            i11.onConnectionSuspended(i10);
        }
    }
}
