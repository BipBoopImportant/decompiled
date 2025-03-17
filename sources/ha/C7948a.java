package ha;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ha.a  reason: case insensitive filesystem */
public class C7948a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f52406a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52407b;

    protected C7948a(IBinder iBinder, String str) {
        this.f52406a = iBinder;
        this.f52407b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f52407b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f52406a.transact(i10, parcel, parcel, 0);
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
            this.f52406a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f52406a;
    }
}
