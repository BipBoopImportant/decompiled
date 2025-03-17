package Z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f41421a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41422b;

    protected a(IBinder iBinder, String str) {
        this.f41421a = iBinder;
        this.f41422b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41422b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41421a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f41421a;
    }
}
