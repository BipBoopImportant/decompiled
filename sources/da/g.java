package Da;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    String f34635a;

    /* renamed from: b  reason: collision with root package name */
    String f34636b;

    g() {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f34635a, false);
        c.u(parcel, 3, this.f34636b, false);
        c.b(parcel, a10);
    }

    public g(String str, String str2) {
        this.f34635a = str;
        this.f34636b = str2;
    }
}
