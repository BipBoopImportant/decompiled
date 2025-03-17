package com.google.ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class c implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f67754a;

    /* renamed from: b  reason: collision with root package name */
    private final String f67755b;

    protected c(IBinder iBinder, String str) {
        this.f67754a = iBinder;
        this.f67755b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f67755b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f67754a;
    }

    /* access modifiers changed from: protected */
    public final Parcel b(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f67754a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i10, Parcel parcel) {
        try {
            this.f67754a.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
