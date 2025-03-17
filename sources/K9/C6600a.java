package K9;

import K9.C6613k;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: K9.a  reason: case insensitive filesystem */
public class C6600a extends C6613k.a {
    public static Account K3(C6613k kVar) {
        Account account = null;
        if (kVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = kVar.zzb();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
