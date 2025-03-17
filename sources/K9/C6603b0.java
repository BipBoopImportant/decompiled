package K9;

import android.os.IBinder;
import android.os.IInterface;
import ca.C7110d;

/* renamed from: K9.b0  reason: case insensitive filesystem */
public abstract class C6603b0 extends C7110d implements C6605c0 {
    public static C6605c0 J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C6605c0 ? (C6605c0) queryLocalInterface : new C6601a0(iBinder);
    }
}
