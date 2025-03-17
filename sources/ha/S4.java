package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class S4 extends a {
    public static final Parcelable.Creator<S4> CREATOR = new C7958b();

    /* renamed from: a  reason: collision with root package name */
    public int f52211a;

    /* renamed from: b  reason: collision with root package name */
    public String f52212b;

    /* renamed from: c  reason: collision with root package name */
    public String f52213c;

    /* renamed from: d  reason: collision with root package name */
    public String f52214d;

    public S4() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, this.f52211a);
        c.u(parcel, 3, this.f52212b, false);
        c.u(parcel, 4, this.f52213c, false);
        c.u(parcel, 5, this.f52214d, false);
        c.b(parcel, a10);
    }

    public S4(int i10, String str, String str2, String str3) {
        this.f52211a = i10;
        this.f52212b = str;
        this.f52213c = str2;
        this.f52214d = str3;
    }
}
