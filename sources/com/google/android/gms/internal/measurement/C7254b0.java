package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.b0  reason: case insensitive filesystem */
public class C7254b0 extends Binder implements IInterface {
    protected C7254b0(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        if (i10 > 16777215) {
            z10 = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return I3(i10, parcel, parcel2, i11);
    }
}
