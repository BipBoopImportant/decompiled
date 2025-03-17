package K9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import ca.C7107a;
import ca.C7111e;

public final class z0 extends C7107a implements C6613k {
    z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() {
        Parcel I32 = I3(2, K3());
        Account account = (Account) C7111e.a(I32, Account.CREATOR);
        I32.recycle();
        return account;
    }
}
