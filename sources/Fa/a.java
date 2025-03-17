package fa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f51212a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51213b;

    protected a(IBinder iBinder, String str) {
        this.f51212a = iBinder;
        this.f51213b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f51212a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel J3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f51213b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void K3(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f51212a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f51212a;
    }
}
