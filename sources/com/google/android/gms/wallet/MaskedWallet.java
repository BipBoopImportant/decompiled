package com.google.android.gms.wallet;

import Ba.C6380d;
import Ba.C6382f;
import Ba.C6383g;
import Ba.u;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    String f50592a;

    /* renamed from: b  reason: collision with root package name */
    String f50593b;

    /* renamed from: c  reason: collision with root package name */
    String[] f50594c;

    /* renamed from: d  reason: collision with root package name */
    String f50595d;

    /* renamed from: e  reason: collision with root package name */
    u f50596e;

    /* renamed from: f  reason: collision with root package name */
    u f50597f;

    /* renamed from: g  reason: collision with root package name */
    C6382f[] f50598g;

    /* renamed from: h  reason: collision with root package name */
    C6383g[] f50599h;

    /* renamed from: i  reason: collision with root package name */
    UserAddress f50600i;

    /* renamed from: j  reason: collision with root package name */
    UserAddress f50601j;

    /* renamed from: k  reason: collision with root package name */
    C6380d[] f50602k;

    private MaskedWallet() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f50592a, false);
        c.u(parcel, 3, this.f50593b, false);
        c.v(parcel, 4, this.f50594c, false);
        c.u(parcel, 5, this.f50595d, false);
        c.t(parcel, 6, this.f50596e, i10, false);
        c.t(parcel, 7, this.f50597f, i10, false);
        c.x(parcel, 8, this.f50598g, i10, false);
        c.x(parcel, 9, this.f50599h, i10, false);
        c.t(parcel, 10, this.f50600i, i10, false);
        c.t(parcel, 11, this.f50601j, i10, false);
        c.x(parcel, 12, this.f50602k, i10, false);
        c.b(parcel, a10);
    }

    MaskedWallet(String str, String str2, String[] strArr, String str3, u uVar, u uVar2, C6382f[] fVarArr, C6383g[] gVarArr, UserAddress userAddress, UserAddress userAddress2, C6380d[] dVarArr) {
        this.f50592a = str;
        this.f50593b = str2;
        this.f50594c = strArr;
        this.f50595d = str3;
        this.f50596e = uVar;
        this.f50597f = uVar2;
        this.f50598g = fVarArr;
        this.f50599h = gVarArr;
        this.f50600i = userAddress;
        this.f50601j = userAddress2;
        this.f50602k = dVarArr;
    }
}
