package K9;

import android.os.IBinder;
import android.os.Parcel;

final class Z implements C6616n {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f37787a;

    Z(IBinder iBinder) {
        this.f37787a = iBinder;
    }

    public final void H(C6615m mVar, C6609g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                q0.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f37787a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final IBinder asBinder() {
        return this.f37787a;
    }
}
