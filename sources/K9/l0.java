package K9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class l0 extends W {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f37883g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C6604c f37884h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(C6604c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f37884h = cVar;
        this.f37883g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(ConnectionResult connectionResult) {
        if (this.f37884h.f37814v != null) {
            this.f37884h.f37814v.onConnectionFailed(connectionResult);
        }
        this.f37884h.L(connectionResult);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        try {
            IBinder iBinder = this.f37883g;
            C6620s.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f37884h.E().equals(interfaceDescriptor)) {
                String E10 = this.f37884h.E();
                Log.w("GmsClient", "service descriptor mismatch: " + E10 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s10 = this.f37884h.s(this.f37883g);
            if (s10 == null || (!C6604c.g0(this.f37884h, 2, 4, s10) && !C6604c.g0(this.f37884h, 3, 4, s10))) {
                return false;
            }
            this.f37884h.f37818z = null;
            C6604c cVar = this.f37884h;
            Bundle x10 = cVar.x();
            if (cVar.f37813u == null) {
                return true;
            }
            this.f37884h.f37813u.onConnected(x10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
