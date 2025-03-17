package Za;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Za.k  reason: case insensitive filesystem */
public abstract class C9386k extends C9383h implements C9387l {
    public static C9387l J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C9387l ? (C9387l) queryLocalInterface : new C9385j(iBinder);
    }
}
