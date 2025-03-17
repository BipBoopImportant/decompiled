package na;

import L9.a;
import L9.c;
import L9.e;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f55146a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55147b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55148c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55149d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f55150e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f55151f;

    public k(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f55146a = z10;
        this.f55147b = z11;
        this.f55148c = z12;
        this.f55149d = z13;
        this.f55150e = z14;
        this.f55151f = z15;
    }

    public static k x(Intent intent) {
        return (k) e.b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean B() {
        return this.f55151f;
    }

    public boolean E0() {
        return this.f55147b;
    }

    public boolean F() {
        return this.f55148c;
    }

    public boolean J() {
        return this.f55149d;
    }

    public boolean U() {
        return this.f55146a;
    }

    public boolean t0() {
        return this.f55150e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, U());
        c.c(parcel, 2, E0());
        c.c(parcel, 3, F());
        c.c(parcel, 4, J());
        c.c(parcel, 5, t0());
        c.c(parcel, 6, B());
        c.b(parcel, a10);
    }
}
