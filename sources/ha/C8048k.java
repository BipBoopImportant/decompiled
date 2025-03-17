package ha;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ha.k  reason: case insensitive filesystem */
public final class C8048k extends C7948a implements IInterface {
    C8048k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void L3() {
        K3(3, I3());
    }

    public final C8166v8[] M3(b bVar, C8088o oVar) {
        Parcel I32 = I3();
        O.b(I32, bVar);
        O.a(I32, oVar);
        Parcel J32 = J3(1, I32);
        C8166v8[] v8VarArr = (C8166v8[]) J32.createTypedArray(C8166v8.CREATOR);
        J32.recycle();
        return v8VarArr;
    }

    public final C8166v8[] N3(b bVar, C8088o oVar) {
        Parcel I32 = I3();
        O.b(I32, bVar);
        O.a(I32, oVar);
        Parcel J32 = J3(2, I32);
        C8166v8[] v8VarArr = (C8166v8[]) J32.createTypedArray(C8166v8.CREATOR);
        J32.recycle();
        return v8VarArr;
    }
}
