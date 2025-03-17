package ma;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f55052a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55053b;

    protected a(IBinder iBinder, String str) {
        this.f55052a = iBinder;
        this.f55053b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f55053b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f55052a.transact(1, parcel, parcel, 0);
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
        try {
            this.f55052a.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f55052a;
    }
}
