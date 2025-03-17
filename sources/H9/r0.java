package H9;

import K9.C6620s;
import com.google.android.gms.common.ConnectionResult;

final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f36632a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f36633b;

    r0(ConnectionResult connectionResult, int i10) {
        C6620s.l(connectionResult);
        this.f36633b = connectionResult;
        this.f36632a = i10;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f36632a;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult b() {
        return this.f36633b;
    }
}
