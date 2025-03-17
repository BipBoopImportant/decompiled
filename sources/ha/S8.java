package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class S8 extends a {
    public static final Parcelable.Creator<S8> CREATOR = new l9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52220a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52221b;

    public S8(String str, String str2) {
        this.f52220a = str;
        this.f52221b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52220a, false);
        c.u(parcel, 2, this.f52221b, false);
        c.b(parcel, a10);
    }
}
