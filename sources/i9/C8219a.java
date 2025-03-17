package i9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i9.a  reason: case insensitive filesystem */
public class C8219a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f53154a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53155b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C8219a(IBinder iBinder) {
        this.f53154a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f53155b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f53154a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f53154a;
    }
}
