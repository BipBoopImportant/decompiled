package Za;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: Za.a  reason: case insensitive filesystem */
public class C9376a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f65032a;

    /* renamed from: b  reason: collision with root package name */
    private final String f65033b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected C9376a(IBinder iBinder, String str) {
        this.f65032a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f65033b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        try {
            this.f65032a.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f65032a;
    }
}
