package eb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator {
    f() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new e((PendingIntent) parcel.readParcelable(C9631b.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C9631b[i10];
    }
}
