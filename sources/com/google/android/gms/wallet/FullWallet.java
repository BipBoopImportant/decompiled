package com.google.android.gms.wallet;

import Ba.C;
import Ba.C6380d;
import Ba.C6387k;
import Ba.u;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    String f50581a;

    /* renamed from: b  reason: collision with root package name */
    String f50582b;

    /* renamed from: c  reason: collision with root package name */
    C f50583c;

    /* renamed from: d  reason: collision with root package name */
    String f50584d;

    /* renamed from: e  reason: collision with root package name */
    u f50585e;

    /* renamed from: f  reason: collision with root package name */
    u f50586f;

    /* renamed from: g  reason: collision with root package name */
    String[] f50587g;

    /* renamed from: h  reason: collision with root package name */
    UserAddress f50588h;

    /* renamed from: i  reason: collision with root package name */
    UserAddress f50589i;

    /* renamed from: j  reason: collision with root package name */
    C6380d[] f50590j;

    /* renamed from: k  reason: collision with root package name */
    C6387k f50591k;

    private FullWallet() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f50581a, false);
        c.u(parcel, 3, this.f50582b, false);
        c.t(parcel, 4, this.f50583c, i10, false);
        c.u(parcel, 5, this.f50584d, false);
        c.t(parcel, 6, this.f50585e, i10, false);
        c.t(parcel, 7, this.f50586f, i10, false);
        c.v(parcel, 8, this.f50587g, false);
        c.t(parcel, 9, this.f50588h, i10, false);
        c.t(parcel, 10, this.f50589i, i10, false);
        c.x(parcel, 11, this.f50590j, i10, false);
        c.t(parcel, 12, this.f50591k, i10, false);
        c.b(parcel, a10);
    }

    FullWallet(String str, String str2, C c10, String str3, u uVar, u uVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C6380d[] dVarArr, C6387k kVar) {
        this.f50581a = str;
        this.f50582b = str2;
        this.f50583c = c10;
        this.f50584d = str3;
        this.f50585e = uVar;
        this.f50586f = uVar2;
        this.f50587g = strArr;
        this.f50588h = userAddress;
        this.f50589i = userAddress2;
        this.f50590j = dVarArr;
        this.f50591k = kVar;
    }
}
