package Ba;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class H extends a {
    public static final Parcelable.Creator<H> CREATOR = new I();

    /* renamed from: a  reason: collision with root package name */
    String f33281a;

    /* renamed from: b  reason: collision with root package name */
    Bundle f33282b;

    private H() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f33281a, false);
        c.e(parcel, 3, this.f33282b, false);
        c.b(parcel, a10);
    }

    H(String str, Bundle bundle) {
        this.f33281a = str;
        this.f33282b = bundle;
    }
}
