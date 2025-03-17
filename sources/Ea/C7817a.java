package ea;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ea.a  reason: case insensitive filesystem */
public class C7817a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50941a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50942b;

    protected C7817a(IBinder iBinder, String str) {
        this.f50941a = iBinder;
        this.f50942b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f50942b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f50941a.transact(i10, parcel, parcel, 0);
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
            this.f50941a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f50941a;
    }
}
