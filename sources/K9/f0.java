package K9;

import com.google.android.gms.common.ConnectionResult;

public final class f0 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectionResult f37847a;

    public f0(ConnectionResult connectionResult) {
        C6620s.b(connectionResult.J(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f37847a = connectionResult;
    }
}
