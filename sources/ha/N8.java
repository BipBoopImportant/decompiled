package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class N8 extends a {
    public static final Parcelable.Creator<N8> CREATOR = new c9();

    /* renamed from: a  reason: collision with root package name */
    private final String f52073a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52074b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52075c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52076d;

    /* renamed from: e  reason: collision with root package name */
    private final String f52077e;

    /* renamed from: f  reason: collision with root package name */
    private final String f52078f;

    /* renamed from: g  reason: collision with root package name */
    private final String f52079g;

    /* renamed from: h  reason: collision with root package name */
    private final String f52080h;

    /* renamed from: i  reason: collision with root package name */
    private final String f52081i;

    /* renamed from: j  reason: collision with root package name */
    private final String f52082j;

    /* renamed from: k  reason: collision with root package name */
    private final String f52083k;

    /* renamed from: l  reason: collision with root package name */
    private final String f52084l;

    /* renamed from: m  reason: collision with root package name */
    private final String f52085m;

    /* renamed from: n  reason: collision with root package name */
    private final String f52086n;

    public N8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f52073a = str;
        this.f52074b = str2;
        this.f52075c = str3;
        this.f52076d = str4;
        this.f52077e = str5;
        this.f52078f = str6;
        this.f52079g = str7;
        this.f52080h = str8;
        this.f52081i = str9;
        this.f52082j = str10;
        this.f52083k = str11;
        this.f52084l = str12;
        this.f52085m = str13;
        this.f52086n = str14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f52073a, false);
        c.u(parcel, 2, this.f52074b, false);
        c.u(parcel, 3, this.f52075c, false);
        c.u(parcel, 4, this.f52076d, false);
        c.u(parcel, 5, this.f52077e, false);
        c.u(parcel, 6, this.f52078f, false);
        c.u(parcel, 7, this.f52079g, false);
        c.u(parcel, 8, this.f52080h, false);
        c.u(parcel, 9, this.f52081i, false);
        c.u(parcel, 10, this.f52082j, false);
        c.u(parcel, 11, this.f52083k, false);
        c.u(parcel, 12, this.f52084l, false);
        c.u(parcel, 13, this.f52085m, false);
        c.u(parcel, 14, this.f52086n, false);
        c.b(parcel, a10);
    }
}
