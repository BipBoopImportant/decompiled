package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class Q8 extends a {
    public static final Parcelable.Creator<Q8> CREATOR = new j9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52163a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52164b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52165c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52166d;

    /* renamed from: e  reason: collision with root package name */
    private final String f52167e;

    /* renamed from: f  reason: collision with root package name */
    private final String f52168f;

    /* renamed from: g  reason: collision with root package name */
    private final String f52169g;

    public Q8(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f52163a = str;
        this.f52164b = str2;
        this.f52165c = str3;
        this.f52166d = str4;
        this.f52167e = str5;
        this.f52168f = str6;
        this.f52169g = str7;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52163a, false);
        c.u(parcel, 2, this.f52164b, false);
        c.u(parcel, 3, this.f52165c, false);
        c.u(parcel, 4, this.f52166d, false);
        c.u(parcel, 5, this.f52167e, false);
        c.u(parcel, 6, this.f52168f, false);
        c.u(parcel, 7, this.f52169g, false);
        c.b(parcel, a10);
    }
}
