package K9;

import android.os.IBinder;
import android.os.IInterface;
import ca.C7110d;

/* renamed from: K9.l  reason: case insensitive filesystem */
public interface C6614l extends IInterface {

    /* renamed from: K9.l$a */
    public static abstract class a extends C7110d implements C6614l {
        public static C6614l J3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof C6614l ? (C6614l) queryLocalInterface : new A0(iBinder);
        }
    }

    void cancel();
}
