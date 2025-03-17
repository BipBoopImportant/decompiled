package K9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class m0 extends W {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ C6604c f37885g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(C6604c cVar, int i10, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f37885g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(ConnectionResult connectionResult) {
        if (!this.f37885g.t() || !C6604c.h0(this.f37885g)) {
            this.f37885g.f37808p.a(connectionResult);
            this.f37885g.L(connectionResult);
            return;
        }
        C6604c.d0(this.f37885g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f37885g.f37808p.a(ConnectionResult.f47963e);
        return true;
    }
}
