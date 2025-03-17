package G9;

import K9.C0;
import L9.a;
import L9.c;
import T9.b;
import T9.d;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public final class x extends a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final String f36346a;

    /* renamed from: b  reason: collision with root package name */
    private final o f36347b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36348c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f36349d;

    x(String str, o oVar, boolean z10, boolean z11) {
        this.f36346a = str;
        this.f36347b = oVar;
        this.f36348c = z10;
        this.f36349d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f36346a;
        int a10 = c.a(parcel);
        c.u(parcel, 1, str, false);
        o oVar = this.f36347b;
        if (oVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oVar = null;
        }
        c.m(parcel, 2, oVar, false);
        c.c(parcel, 3, this.f36348c);
        c.c(parcel, 4, this.f36349d);
        c.b(parcel, a10);
    }

    x(String str, IBinder iBinder, boolean z10, boolean z11) {
        byte[] bArr;
        this.f36346a = str;
        p pVar = null;
        if (iBinder != null) {
            try {
                b zzd = C0.J3(iBinder).zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) d.K3(zzd);
                }
                if (bArr != null) {
                    pVar = new p(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f36347b = pVar;
        this.f36348c = z10;
        this.f36349d = z11;
    }
}
