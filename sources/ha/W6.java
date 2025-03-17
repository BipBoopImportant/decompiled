package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class W6 extends a {
    public static final Parcelable.Creator<W6> CREATOR = new C7998f();

    /* renamed from: a  reason: collision with root package name */
    public String f52341a;

    /* renamed from: b  reason: collision with root package name */
    public String f52342b;

    public W6() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f52341a, false);
        c.u(parcel, 3, this.f52342b, false);
        c.b(parcel, a10);
    }

    public W6(String str, String str2) {
        this.f52341a = str;
        this.f52342b = str2;
    }
}
