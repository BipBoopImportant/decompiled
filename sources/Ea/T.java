package ea;

import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import na.A;
import na.B;
import na.D;
import na.E;

@Deprecated
public final class T extends a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    private final int f50931a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f50932b;

    /* renamed from: c  reason: collision with root package name */
    private final E f50933c;

    /* renamed from: d  reason: collision with root package name */
    private final B f50934d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f50935e;

    /* renamed from: f  reason: collision with root package name */
    private final p0 f50936f;

    /* renamed from: g  reason: collision with root package name */
    private final String f50937g;

    T(int i10, Q q10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f50931a = i10;
        this.f50932b = q10;
        p0 p0Var = null;
        this.f50933c = iBinder != null ? D.J3(iBinder) : null;
        this.f50935e = pendingIntent;
        this.f50934d = iBinder2 != null ? A.J3(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            p0Var = queryLocalInterface instanceof p0 ? (p0) queryLocalInterface : new n0(iBinder3);
        }
        this.f50936f = p0Var;
        this.f50937g = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f50931a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.t(parcel, 2, this.f50932b, i10, false);
        E e10 = this.f50933c;
        IBinder iBinder = null;
        c.m(parcel, 3, e10 == null ? null : e10.asBinder(), false);
        c.t(parcel, 4, this.f50935e, i10, false);
        B b10 = this.f50934d;
        c.m(parcel, 5, b10 == null ? null : b10.asBinder(), false);
        p0 p0Var = this.f50936f;
        if (p0Var != null) {
            iBinder = p0Var.asBinder();
        }
        c.m(parcel, 6, iBinder, false);
        c.u(parcel, 8, this.f50937g, false);
        c.b(parcel, a10);
    }
}
