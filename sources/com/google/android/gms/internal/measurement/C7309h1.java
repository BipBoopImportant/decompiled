package com.google.android.gms.internal.measurement;

import L9.a;
import L9.c;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.h1  reason: case insensitive filesystem */
public final class C7309h1 extends a {
    public static final Parcelable.Creator<C7309h1> CREATOR = new C7336k1();

    /* renamed from: a  reason: collision with root package name */
    public final int f48933a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48934b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f48935c;

    public C7309h1(int i10, String str, Intent intent) {
        this.f48933a = i10;
        this.f48934b = str;
        this.f48935c = intent;
    }

    public static C7309h1 x(Activity activity) {
        return new C7309h1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7309h1)) {
            return false;
        }
        C7309h1 h1Var = (C7309h1) obj;
        return this.f48933a == h1Var.f48933a && Objects.equals(this.f48934b, h1Var.f48934b) && Objects.equals(this.f48935c, h1Var.f48935c);
    }

    public final int hashCode() {
        return this.f48933a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f48933a);
        c.u(parcel, 2, this.f48934b, false);
        c.t(parcel, 3, this.f48935c, i10, false);
        c.b(parcel, a10);
    }
}
