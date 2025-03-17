package O9;

import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f39298a;

    public e(PendingIntent pendingIntent) {
        this.f39298a = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, x(), i10, false);
        c.b(parcel, a10);
    }

    public PendingIntent x() {
        return this.f39298a;
    }
}
