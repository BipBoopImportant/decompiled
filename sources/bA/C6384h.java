package Ba;

import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ba.h  reason: case insensitive filesystem */
public class C6384h extends a {
    public static final Parcelable.Creator<C6384h> CREATOR = new T();

    /* renamed from: a  reason: collision with root package name */
    PendingIntent f33337a;

    C6384h() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f33337a, i10, false);
        c.b(parcel, a10);
    }

    C6384h(PendingIntent pendingIntent) {
        this.f33337a = pendingIntent;
    }
}
