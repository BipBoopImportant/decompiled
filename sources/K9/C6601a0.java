package K9;

import G9.t;
import G9.v;
import G9.x;
import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import ca.C7107a;
import ca.C7111e;

/* renamed from: K9.a0  reason: case insensitive filesystem */
public final class C6601a0 extends C7107a implements C6605c0 {
    C6601a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final v S2(t tVar) {
        Parcel K32 = K3();
        C7111e.c(K32, tVar);
        Parcel I32 = I3(6, K32);
        v vVar = (v) C7111e.a(I32, v.CREATOR);
        I32.recycle();
        return vVar;
    }

    public final boolean b() {
        Parcel I32 = I3(7, K3());
        boolean e10 = C7111e.e(I32);
        I32.recycle();
        return e10;
    }

    public final boolean v1(x xVar, b bVar) {
        Parcel K32 = K3();
        C7111e.c(K32, xVar);
        C7111e.d(K32, bVar);
        Parcel I32 = I3(5, K32);
        boolean e10 = C7111e.e(I32);
        I32.recycle();
        return e10;
    }

    public final v z0(t tVar) {
        Parcel K32 = K3();
        C7111e.c(K32, tVar);
        Parcel I32 = I3(8, K32);
        v vVar = (v) C7111e.a(I32, v.CREATOR);
        I32.recycle();
        return vVar;
    }
}
