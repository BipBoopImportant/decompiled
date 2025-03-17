package com.google.android.gms.dynamite;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ca.C7107a;
import ca.C7111e;

public final class n extends C7107a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final b L3(b bVar, String str, int i10, b bVar2) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(i10);
        C7111e.d(K32, bVar2);
        Parcel I32 = I3(2, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    public final b M3(b bVar, String str, int i10, b bVar2) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(i10);
        C7111e.d(K32, bVar2);
        Parcel I32 = I3(3, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }
}
