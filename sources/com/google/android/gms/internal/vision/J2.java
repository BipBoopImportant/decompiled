package com.google.android.gms.internal.vision;

import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import za.a;

public final class J2 extends C7464a implements P1 {
    J2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final a[] P1(b bVar, L2 l22) {
        Parcel I32 = I3();
        C7468b.a(I32, bVar);
        C7468b.b(I32, l22);
        Parcel J32 = J3(2, I32);
        a[] aVarArr = (a[]) J32.createTypedArray(a.CREATOR);
        J32.recycle();
        return aVarArr;
    }

    public final a[] V1(b bVar, L2 l22) {
        Parcel I32 = I3();
        C7468b.a(I32, bVar);
        C7468b.b(I32, l22);
        Parcel J32 = J3(1, I32);
        a[] aVarArr = (a[]) J32.createTypedArray(a.CREATOR);
        J32.recycle();
        return aVarArr;
    }

    public final void zza() {
        K3(3, I3());
    }
}
