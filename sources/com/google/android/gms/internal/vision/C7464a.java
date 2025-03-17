package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.vision.a  reason: case insensitive filesystem */
public class C7464a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f49294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49295b;

    protected C7464a(IBinder iBinder, String str) {
        this.f49294a = iBinder;
        this.f49295b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49295b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f49294a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void K3(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f49294a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f49294a;
    }
}
