package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class Y implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f48826a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48827b;

    protected Y(IBinder iBinder, String str) {
        this.f48826a = iBinder;
        this.f48827b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f48827b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f48826a.transact(i10, parcel, parcel, 0);
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
            this.f48826a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void L3(int i10, Parcel parcel) {
        try {
            this.f48826a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f48826a;
    }
}
