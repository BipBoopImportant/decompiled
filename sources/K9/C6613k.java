package K9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import ca.C7110d;

/* renamed from: K9.k  reason: case insensitive filesystem */
public interface C6613k extends IInterface {

    /* renamed from: K9.k$a */
    public static abstract class a extends C7110d implements C6613k {
        public static C6613k J3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C6613k ? (C6613k) queryLocalInterface : new z0(iBinder);
        }
    }

    Account zzb();
}
