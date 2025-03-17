package fb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fb.b  reason: case insensitive filesystem */
public class C9686b extends Binder implements IInterface {
    protected C9686b(String str) {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return I3(i10, parcel, parcel2, i11);
    }
}
