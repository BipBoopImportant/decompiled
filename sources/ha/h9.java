package ha;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h9 extends C8137t implements i9 {
    public static i9 I3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof i9 ? (i9) queryLocalInterface : new g9(iBinder);
    }
}
