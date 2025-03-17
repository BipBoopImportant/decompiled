package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new J();

    /* renamed from: a  reason: collision with root package name */
    String f33381a;

    /* renamed from: b  reason: collision with root package name */
    String f33382b;

    /* renamed from: c  reason: collision with root package name */
    String f33383c;

    /* renamed from: d  reason: collision with root package name */
    String f33384d;

    /* renamed from: e  reason: collision with root package name */
    String f33385e;

    /* renamed from: f  reason: collision with root package name */
    String f33386f;

    /* renamed from: g  reason: collision with root package name */
    String f33387g;

    /* renamed from: h  reason: collision with root package name */
    String f33388h;

    /* renamed from: i  reason: collision with root package name */
    String f33389i;

    /* renamed from: j  reason: collision with root package name */
    boolean f33390j;

    /* renamed from: k  reason: collision with root package name */
    String f33391k;

    u() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f33381a, false);
        c.u(parcel, 3, this.f33382b, false);
        c.u(parcel, 4, this.f33383c, false);
        c.u(parcel, 5, this.f33384d, false);
        c.u(parcel, 6, this.f33385e, false);
        c.u(parcel, 7, this.f33386f, false);
        c.u(parcel, 8, this.f33387g, false);
        c.u(parcel, 9, this.f33388h, false);
        c.u(parcel, 10, this.f33389i, false);
        c.c(parcel, 11, this.f33390j);
        c.u(parcel, 12, this.f33391k, false);
        c.b(parcel, a10);
    }

    u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10) {
        this.f33381a = str;
        this.f33382b = str2;
        this.f33383c = str3;
        this.f33384d = str4;
        this.f33385e = str5;
        this.f33386f = str6;
        this.f33387g = str7;
        this.f33388h = str8;
        this.f33389i = str9;
        this.f33390j = z10;
        this.f33391k = str10;
    }
}
