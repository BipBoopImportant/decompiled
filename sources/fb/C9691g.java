package fb;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fb.g  reason: case insensitive filesystem */
public abstract class C9691g extends C9686b implements C9692h {
    public C9691g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i12 = C9687c.f72937a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            v(bundle);
            return true;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }
}
