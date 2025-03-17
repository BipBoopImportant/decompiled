package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class T8 extends a {
    public static final Parcelable.Creator<T8> CREATOR = new n9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52241a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52242b;

    public T8(String str, String str2) {
        this.f52241a = str;
        this.f52242b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52241a, false);
        c.u(parcel, 2, this.f52242b, false);
        c.b(parcel, a10);
    }
}
