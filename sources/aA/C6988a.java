package aa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aa.a  reason: case insensitive filesystem */
public class C6988a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f42992a;

    /* renamed from: b  reason: collision with root package name */
    private final String f42993b;

    protected C6988a(IBinder iBinder, String str) {
        this.f42992a = iBinder;
        this.f42993b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f42993b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f42992a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void K3(int i10, Parcel parcel) {
        try {
            this.f42992a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f42992a;
    }
}
