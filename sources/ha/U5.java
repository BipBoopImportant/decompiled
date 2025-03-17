package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class U5 extends a {
    public static final Parcelable.Creator<U5> CREATOR = new C7978d();

    /* renamed from: a  reason: collision with root package name */
    public String f52271a;

    /* renamed from: b  reason: collision with root package name */
    public String f52272b;

    /* renamed from: c  reason: collision with root package name */
    public String f52273c;

    /* renamed from: d  reason: collision with root package name */
    public String f52274d;

    /* renamed from: e  reason: collision with root package name */
    public String f52275e;

    /* renamed from: f  reason: collision with root package name */
    public String f52276f;

    /* renamed from: g  reason: collision with root package name */
    public String f52277g;

    public U5() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f52271a, false);
        c.u(parcel, 3, this.f52272b, false);
        c.u(parcel, 4, this.f52273c, false);
        c.u(parcel, 5, this.f52274d, false);
        c.u(parcel, 6, this.f52275e, false);
        c.u(parcel, 7, this.f52276f, false);
        c.u(parcel, 8, this.f52277g, false);
        c.b(parcel, a10);
    }

    public U5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f52271a = str;
        this.f52272b = str2;
        this.f52273c = str3;
        this.f52274d = str4;
        this.f52275e = str5;
        this.f52276f = str6;
        this.f52277g = str7;
    }
}
