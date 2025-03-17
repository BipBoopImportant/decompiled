package ha;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ha.m  reason: case insensitive filesystem */
public abstract class C8068m extends C8137t implements C8078n {
    public static C8078n I3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return queryLocalInterface instanceof C8078n ? (C8078n) queryLocalInterface : new C8058l(iBinder);
    }
}
