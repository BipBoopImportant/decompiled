package ha;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.r4  reason: case insensitive filesystem */
public final class C8122r4 extends a {
    public static final Parcelable.Creator<C8122r4> CREATOR = new t9();

    /* renamed from: a  reason: collision with root package name */
    public String f52750a;

    /* renamed from: b  reason: collision with root package name */
    public String f52751b;

    /* renamed from: c  reason: collision with root package name */
    public String f52752c;

    /* renamed from: d  reason: collision with root package name */
    public String f52753d;

    /* renamed from: e  reason: collision with root package name */
    public String f52754e;

    /* renamed from: f  reason: collision with root package name */
    public String f52755f;

    /* renamed from: g  reason: collision with root package name */
    public String f52756g;

    /* renamed from: h  reason: collision with root package name */
    public String f52757h;

    /* renamed from: i  reason: collision with root package name */
    public String f52758i;

    /* renamed from: j  reason: collision with root package name */
    public String f52759j;

    /* renamed from: k  reason: collision with root package name */
    public String f52760k;

    /* renamed from: l  reason: collision with root package name */
    public String f52761l;

    /* renamed from: m  reason: collision with root package name */
    public String f52762m;

    /* renamed from: n  reason: collision with root package name */
    public String f52763n;

    public C8122r4() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f52750a, false);
        c.u(parcel, 3, this.f52751b, false);
        c.u(parcel, 4, this.f52752c, false);
        c.u(parcel, 5, this.f52753d, false);
        c.u(parcel, 6, this.f52754e, false);
        c.u(parcel, 7, this.f52755f, false);
        c.u(parcel, 8, this.f52756g, false);
        c.u(parcel, 9, this.f52757h, false);
        c.u(parcel, 10, this.f52758i, false);
        c.u(parcel, 11, this.f52759j, false);
        c.u(parcel, 12, this.f52760k, false);
        c.u(parcel, 13, this.f52761l, false);
        c.u(parcel, 14, this.f52762m, false);
        c.u(parcel, 15, this.f52763n, false);
        c.b(parcel, a10);
    }

    public C8122r4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f52750a = str;
        this.f52751b = str2;
        this.f52752c = str3;
        this.f52753d = str4;
        this.f52754e = str5;
        this.f52755f = str6;
        this.f52756g = str7;
        this.f52757h = str8;
        this.f52758i = str9;
        this.f52759j = str10;
        this.f52760k = str11;
        this.f52761l = str12;
        this.f52762m = str13;
        this.f52763n = str14;
    }
}
