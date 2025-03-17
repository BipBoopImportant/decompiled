package com.google.android.gms.common.api;

import K9.C6619q;
import K9.C6620s;
import L9.a;
import L9.c;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.l;

public final class Status extends a implements n, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new v();

    /* renamed from: e  reason: collision with root package name */
    public static final Status f47982e = new Status(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Status f47983f = new Status(0);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f47984g = new Status(14);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f47985h = new Status(8);

    /* renamed from: i  reason: collision with root package name */
    public static final Status f47986i = new Status(15);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f47987j = new Status(16);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f47988k = new Status(18);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f47989l = new Status(17);

    /* renamed from: a  reason: collision with root package name */
    private final int f47990a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47991b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f47992c;

    /* renamed from: d  reason: collision with root package name */
    private final ConnectionResult f47993d;

    Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f47990a = i10;
        this.f47991b = str;
        this.f47992c = pendingIntent;
        this.f47993d = connectionResult;
    }

    public PendingIntent B() {
        return this.f47992c;
    }

    public boolean E0() {
        return this.f47990a <= 0;
    }

    public int F() {
        return this.f47990a;
    }

    public String J() {
        return this.f47991b;
    }

    public void N0(Activity activity, int i10) {
        if (U()) {
            Bundle bundle = l.j() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.f47992c;
            C6620s.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0, bundle);
        }
    }

    public final String S0() {
        String str = this.f47991b;
        return str != null ? str : d.getStatusCodeString(this.f47990a);
    }

    public boolean U() {
        return this.f47992c != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f47990a == status.f47990a && C6619q.b(this.f47991b, status.f47991b) && C6619q.b(this.f47992c, status.f47992c) && C6619q.b(this.f47993d, status.f47993d);
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f47990a), this.f47991b, this.f47992c, this.f47993d);
    }

    public Status i() {
        return this;
    }

    public boolean t0() {
        return this.f47990a == 16;
    }

    public String toString() {
        C6619q.a d10 = C6619q.d(this);
        d10.a("statusCode", S0());
        d10.a("resolution", this.f47992c);
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, F());
        c.u(parcel, 2, J(), false);
        c.t(parcel, 3, this.f47992c, i10, false);
        c.t(parcel, 4, x(), i10, false);
        c.b(parcel, a10);
    }

    public ConnectionResult x() {
        return this.f47993d;
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.F(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, (ConnectionResult) null);
    }
}
