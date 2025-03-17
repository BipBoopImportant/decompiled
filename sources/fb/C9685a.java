package fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fb.a  reason: case insensitive filesystem */
public class C9685a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f72935a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72936b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected C9685a(IBinder iBinder, String str) {
        this.f72935a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel I3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f72936b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void J3(int i10, Parcel parcel) {
        try {
            this.f72935a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f72935a;
    }
}
