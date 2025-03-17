package X9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f40796a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40797b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected a(IBinder iBinder, String str) {
        this.f40796a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f40797b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel J3(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f40796a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f40796a;
    }
}
