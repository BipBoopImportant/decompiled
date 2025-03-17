package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.clearcut.a  reason: case insensitive filesystem */
public class C7165a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f48290a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48291b;

    protected C7165a(IBinder iBinder, String str) {
        this.f48290a = iBinder;
        this.f48291b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f48291b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        try {
            this.f48290a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f48290a;
    }
}
