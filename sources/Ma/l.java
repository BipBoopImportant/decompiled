package ma;

import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    final PendingIntent f55059a;

    public l(PendingIntent pendingIntent) {
        this.f55059a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f55059a, i10, false);
        c.b(parcel, a10);
    }
}
