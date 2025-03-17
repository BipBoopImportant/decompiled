package H9;

import K9.C6613k;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConnectionResult f36513a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ M f36514b;

    L(M m10, ConnectionResult connectionResult) {
        this.f36514b = m10;
        this.f36513a = connectionResult;
    }

    public final void run() {
        M m10 = this.f36514b;
        I i10 = (I) m10.f36520f.f36569j.get(m10.f36516b);
        if (i10 != null) {
            if (this.f36513a.U()) {
                this.f36514b.f36519e = true;
                if (this.f36514b.f36515a.g()) {
                    this.f36514b.i();
                    return;
                }
                try {
                    M m11 = this.f36514b;
                    m11.f36515a.b((C6613k) null, m11.f36515a.i());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f36514b.f36515a.a("Failed to get service from broker.");
                    i10.F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                i10.F(this.f36513a, (Exception) null);
            }
        }
    }
}
