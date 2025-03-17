package ca;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ca.a  reason: case insensitive filesystem */
public class C7107a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f45772a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45773b;

    protected C7107a(IBinder iBinder, String str) {
        this.f45772a = iBinder;
        this.f45773b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f45772a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        try {
            this.f45772a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel K3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45773b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f45772a;
    }
}
