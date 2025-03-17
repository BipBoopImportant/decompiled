package com.google.android.gms.dynamite;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ca.C7107a;
import ca.C7111e;

public final class m extends C7107a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int L3() {
        Parcel I32 = I3(6, K3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final int M3(b bVar, String str, boolean z10) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(z10 ? 1 : 0);
        Parcel I32 = I3(3, K32);
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final int N3(b bVar, String str, boolean z10) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(z10 ? 1 : 0);
        Parcel I32 = I3(5, K32);
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final b O3(b bVar, String str, int i10) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(i10);
        Parcel I32 = I3(2, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    public final b P3(b bVar, String str, int i10, b bVar2) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(i10);
        C7111e.d(K32, bVar2);
        Parcel I32 = I3(8, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    public final b Q3(b bVar, String str, int i10) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(i10);
        Parcel I32 = I3(4, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    public final b R3(b bVar, String str, boolean z10, long j10) {
        Parcel K32 = K3();
        C7111e.d(K32, bVar);
        K32.writeString(str);
        K32.writeInt(z10 ? 1 : 0);
        K32.writeLong(j10);
        Parcel I32 = I3(7, K32);
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }
}
