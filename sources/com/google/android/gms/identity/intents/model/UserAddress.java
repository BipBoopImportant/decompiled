package com.google.android.gms.identity.intents.model;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    String f48118a;

    /* renamed from: b  reason: collision with root package name */
    String f48119b;

    /* renamed from: c  reason: collision with root package name */
    String f48120c;

    /* renamed from: d  reason: collision with root package name */
    String f48121d;

    /* renamed from: e  reason: collision with root package name */
    String f48122e;

    /* renamed from: f  reason: collision with root package name */
    String f48123f;

    /* renamed from: g  reason: collision with root package name */
    String f48124g;

    /* renamed from: h  reason: collision with root package name */
    String f48125h;

    /* renamed from: i  reason: collision with root package name */
    String f48126i;

    /* renamed from: j  reason: collision with root package name */
    String f48127j;

    /* renamed from: k  reason: collision with root package name */
    String f48128k;

    /* renamed from: l  reason: collision with root package name */
    String f48129l;

    /* renamed from: m  reason: collision with root package name */
    boolean f48130m;

    /* renamed from: n  reason: collision with root package name */
    String f48131n;

    /* renamed from: o  reason: collision with root package name */
    String f48132o;

    UserAddress() {
    }

    public String B() {
        return this.f48120c;
    }

    public String F() {
        return this.f48125h;
    }

    public String J() {
        return this.f48118a;
    }

    public String U() {
        return this.f48127j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f48118a, false);
        c.u(parcel, 3, this.f48119b, false);
        c.u(parcel, 4, this.f48120c, false);
        c.u(parcel, 5, this.f48121d, false);
        c.u(parcel, 6, this.f48122e, false);
        c.u(parcel, 7, this.f48123f, false);
        c.u(parcel, 8, this.f48124g, false);
        c.u(parcel, 9, this.f48125h, false);
        c.u(parcel, 10, this.f48126i, false);
        c.u(parcel, 11, this.f48127j, false);
        c.u(parcel, 12, this.f48128k, false);
        c.u(parcel, 13, this.f48129l, false);
        c.c(parcel, 14, this.f48130m);
        c.u(parcel, 15, this.f48131n, false);
        c.u(parcel, 16, this.f48132o, false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f48119b;
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, String str13, String str14) {
        this.f48118a = str;
        this.f48119b = str2;
        this.f48120c = str3;
        this.f48121d = str4;
        this.f48122e = str5;
        this.f48123f = str6;
        this.f48124g = str7;
        this.f48125h = str8;
        this.f48126i = str9;
        this.f48127j = str10;
        this.f48128k = str11;
        this.f48129l = str12;
        this.f48130m = z10;
        this.f48131n = str13;
        this.f48132o = str14;
    }
}
