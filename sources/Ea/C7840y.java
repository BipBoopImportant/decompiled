package ea;

import H9.C6537k;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import na.f;
import xa.C8972m;

/* renamed from: ea.y  reason: case insensitive filesystem */
final class C7840y extends f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8972m f50977a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ I f50978b;

    C7840y(I i10, C8972m mVar) {
        this.f50977a = mVar;
        this.f50978b = i10;
    }

    public final void b(LocationResult locationResult) {
        this.f50977a.e(locationResult.x());
        try {
            this.f50978b.q0(C6537k.c(this, "GetCurrentLocation"), false, new C8972m());
        } catch (RemoteException unused) {
        }
    }
}
