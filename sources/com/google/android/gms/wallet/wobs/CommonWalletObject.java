package com.google.android.gms.wallet.wobs;

import Da.f;
import Da.j;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.b;
import java.util.ArrayList;

@KeepName
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    String f50634a;

    /* renamed from: b  reason: collision with root package name */
    String f50635b;

    /* renamed from: c  reason: collision with root package name */
    String f50636c;

    /* renamed from: d  reason: collision with root package name */
    String f50637d;

    /* renamed from: e  reason: collision with root package name */
    String f50638e;

    /* renamed from: f  reason: collision with root package name */
    String f50639f;

    /* renamed from: g  reason: collision with root package name */
    String f50640g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    String f50641h;

    /* renamed from: i  reason: collision with root package name */
    int f50642i;

    /* renamed from: j  reason: collision with root package name */
    final ArrayList f50643j;

    /* renamed from: k  reason: collision with root package name */
    f f50644k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList f50645l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    String f50646m;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    String f50647n;

    /* renamed from: o  reason: collision with root package name */
    final ArrayList f50648o;

    /* renamed from: p  reason: collision with root package name */
    boolean f50649p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList f50650q;

    /* renamed from: r  reason: collision with root package name */
    final ArrayList f50651r;

    /* renamed from: s  reason: collision with root package name */
    final ArrayList f50652s;

    CommonWalletObject() {
        this.f50643j = b.c();
        this.f50645l = b.c();
        this.f50648o = b.c();
        this.f50650q = b.c();
        this.f50651r = b.c();
        this.f50652s = b.c();
    }

    public static a x() {
        return new a(new CommonWalletObject(), (j) null);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f50634a, false);
        c.u(parcel, 3, this.f50635b, false);
        c.u(parcel, 4, this.f50636c, false);
        c.u(parcel, 5, this.f50637d, false);
        c.u(parcel, 6, this.f50638e, false);
        c.u(parcel, 7, this.f50639f, false);
        c.u(parcel, 8, this.f50640g, false);
        c.u(parcel, 9, this.f50641h, false);
        c.n(parcel, 10, this.f50642i);
        c.y(parcel, 11, this.f50643j, false);
        c.t(parcel, 12, this.f50644k, i10, false);
        c.y(parcel, 13, this.f50645l, false);
        c.u(parcel, 14, this.f50646m, false);
        c.u(parcel, 15, this.f50647n, false);
        c.y(parcel, 16, this.f50648o, false);
        c.c(parcel, 17, this.f50649p);
        c.y(parcel, 18, this.f50650q, false);
        c.y(parcel, 19, this.f50651r, false);
        c.y(parcel, 20, this.f50652s, false);
        c.b(parcel, a10);
    }

    CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, ArrayList arrayList, f fVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f50634a = str;
        this.f50635b = str2;
        this.f50636c = str3;
        this.f50637d = str4;
        this.f50638e = str5;
        this.f50639f = str6;
        this.f50640g = str7;
        this.f50641h = str8;
        this.f50642i = i10;
        this.f50643j = arrayList;
        this.f50644k = fVar;
        this.f50645l = arrayList2;
        this.f50646m = str9;
        this.f50647n = str10;
        this.f50648o = arrayList3;
        this.f50649p = z10;
        this.f50650q = arrayList4;
        this.f50651r = arrayList5;
        this.f50652s = arrayList6;
    }
}
