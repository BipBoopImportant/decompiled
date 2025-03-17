package com.google.android.gms.internal.clearcut;

import K9.C6619q;
import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class y2 extends a {
    public static final Parcelable.Creator<y2> CREATOR = new z2();

    /* renamed from: a  reason: collision with root package name */
    private final String f48518a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48519b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48520c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48521d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48522e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f48523f;

    /* renamed from: g  reason: collision with root package name */
    public final String f48524g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f48525h;

    /* renamed from: i  reason: collision with root package name */
    private final int f48526i;

    public y2(String str, int i10, int i11, String str2, String str3, String str4, boolean z10, d2 d2Var) {
        this.f48518a = (String) C6620s.l(str);
        this.f48519b = i10;
        this.f48520c = i11;
        this.f48524g = str2;
        this.f48521d = str3;
        this.f48522e = str4;
        this.f48523f = !z10;
        this.f48525h = z10;
        this.f48526i = d2Var.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            return C6619q.b(this.f48518a, y2Var.f48518a) && this.f48519b == y2Var.f48519b && this.f48520c == y2Var.f48520c && C6619q.b(this.f48524g, y2Var.f48524g) && C6619q.b(this.f48521d, y2Var.f48521d) && C6619q.b(this.f48522e, y2Var.f48522e) && this.f48523f == y2Var.f48523f && this.f48525h == y2Var.f48525h && this.f48526i == y2Var.f48526i;
        }
    }

    public final int hashCode() {
        return C6619q.c(this.f48518a, Integer.valueOf(this.f48519b), Integer.valueOf(this.f48520c), this.f48524g, this.f48521d, this.f48522e, Boolean.valueOf(this.f48523f), Boolean.valueOf(this.f48525h), Integer.valueOf(this.f48526i));
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.f48518a + ',' + "packageVersionCode=" + this.f48519b + ',' + "logSource=" + this.f48520c + ',' + "logSourceName=" + this.f48524g + ',' + "uploadAccount=" + this.f48521d + ',' + "loggingId=" + this.f48522e + ',' + "logAndroidId=" + this.f48523f + ',' + "isAnonymous=" + this.f48525h + ',' + "qosTier=" + this.f48526i + "]";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f48518a, false);
        c.n(parcel, 3, this.f48519b);
        c.n(parcel, 4, this.f48520c);
        c.u(parcel, 5, this.f48521d, false);
        c.u(parcel, 6, this.f48522e, false);
        c.c(parcel, 7, this.f48523f);
        c.u(parcel, 8, this.f48524g, false);
        c.c(parcel, 9, this.f48525h);
        c.n(parcel, 10, this.f48526i);
        c.b(parcel, a10);
    }

    public y2(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
        this.f48518a = str;
        this.f48519b = i10;
        this.f48520c = i11;
        this.f48521d = str2;
        this.f48522e = str3;
        this.f48523f = z10;
        this.f48524g = str4;
        this.f48525h = z11;
        this.f48526i = i12;
    }
}
