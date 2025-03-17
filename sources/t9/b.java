package T9;

import android.os.IBinder;
import android.os.IInterface;
import ca.C7110d;

public interface b extends IInterface {

    public static abstract class a extends C7110d implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static b J3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new l(iBinder);
        }
    }
}
