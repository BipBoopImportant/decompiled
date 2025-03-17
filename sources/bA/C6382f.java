package Ba;

import Da.c;
import Da.f;
import L9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.b;
import java.util.ArrayList;

/* renamed from: Ba.f  reason: case insensitive filesystem */
public final class C6382f extends a {
    public static final Parcelable.Creator<C6382f> CREATOR = new Q();

    /* renamed from: a  reason: collision with root package name */
    String f33311a;

    /* renamed from: b  reason: collision with root package name */
    String f33312b;

    /* renamed from: c  reason: collision with root package name */
    String f33313c;

    /* renamed from: d  reason: collision with root package name */
    String f33314d;

    /* renamed from: e  reason: collision with root package name */
    String f33315e;

    /* renamed from: f  reason: collision with root package name */
    String f33316f;

    /* renamed from: g  reason: collision with root package name */
    String f33317g;

    /* renamed from: h  reason: collision with root package name */
    String f33318h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    String f33319i;

    /* renamed from: j  reason: collision with root package name */
    String f33320j;

    /* renamed from: k  reason: collision with root package name */
    int f33321k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList f33322l;

    /* renamed from: m  reason: collision with root package name */
    f f33323m;

    /* renamed from: n  reason: collision with root package name */
    final ArrayList f33324n;
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    String f33325o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    String f33326p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList f33327q;

    /* renamed from: r  reason: collision with root package name */
    boolean f33328r;

    /* renamed from: s  reason: collision with root package name */
    final ArrayList f33329s;

    /* renamed from: t  reason: collision with root package name */
    final ArrayList f33330t;

    /* renamed from: u  reason: collision with root package name */
    final ArrayList f33331u;

    /* renamed from: v  reason: collision with root package name */
    c f33332v;

    C6382f() {
        this.f33322l = b.c();
        this.f33324n = b.c();
        this.f33327q = b.c();
        this.f33329s = b.c();
        this.f33330t = b.c();
        this.f33331u = b.c();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.u(parcel, 2, this.f33311a, false);
        L9.c.u(parcel, 3, this.f33312b, false);
        L9.c.u(parcel, 4, this.f33313c, false);
        L9.c.u(parcel, 5, this.f33314d, false);
        L9.c.u(parcel, 6, this.f33315e, false);
        L9.c.u(parcel, 7, this.f33316f, false);
        L9.c.u(parcel, 8, this.f33317g, false);
        L9.c.u(parcel, 9, this.f33318h, false);
        L9.c.u(parcel, 10, this.f33319i, false);
        L9.c.u(parcel, 11, this.f33320j, false);
        L9.c.n(parcel, 12, this.f33321k);
        L9.c.y(parcel, 13, this.f33322l, false);
        L9.c.t(parcel, 14, this.f33323m, i10, false);
        L9.c.y(parcel, 15, this.f33324n, false);
        L9.c.u(parcel, 16, this.f33325o, false);
        L9.c.u(parcel, 17, this.f33326p, false);
        L9.c.y(parcel, 18, this.f33327q, false);
        L9.c.c(parcel, 19, this.f33328r);
        L9.c.y(parcel, 20, this.f33329s, false);
        L9.c.y(parcel, 21, this.f33330t, false);
        L9.c.y(parcel, 22, this.f33331u, false);
        L9.c.t(parcel, 23, this.f33332v, i10, false);
        L9.c.b(parcel, a10);
    }

    C6382f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, ArrayList arrayList, f fVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, c cVar) {
        this.f33311a = str;
        this.f33312b = str2;
        this.f33313c = str3;
        this.f33314d = str4;
        this.f33315e = str5;
        this.f33316f = str6;
        this.f33317g = str7;
        this.f33318h = str8;
        this.f33319i = str9;
        this.f33320j = str10;
        this.f33321k = i10;
        this.f33322l = arrayList;
        this.f33323m = fVar;
        this.f33324n = arrayList2;
        this.f33325o = str11;
        this.f33326p = str12;
        this.f33327q = arrayList3;
        this.f33328r = z10;
        this.f33329s = arrayList4;
        this.f33330t = arrayList5;
        this.f33331u = arrayList6;
        this.f33332v = cVar;
    }
}
