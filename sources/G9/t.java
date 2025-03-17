package G9;

import L9.a;
import L9.c;
import T9.b;
import T9.d;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: a  reason: collision with root package name */
    private final String f36336a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36337b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36338c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f36339d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f36340e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f36341f;

    t(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f36336a = str;
        this.f36337b = z10;
        this.f36338c = z11;
        this.f36339d = (Context) d.K3(b.a.J3(iBinder));
        this.f36340e = z12;
        this.f36341f = z13;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [T9.b, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f36336a;
        int a10 = c.a(parcel);
        c.u(parcel, 1, str, false);
        c.c(parcel, 2, this.f36337b);
        c.c(parcel, 3, this.f36338c);
        c.m(parcel, 4, d.L3(this.f36339d), false);
        c.c(parcel, 5, this.f36340e);
        c.c(parcel, 6, this.f36341f);
        c.b(parcel, a10);
    }
}
