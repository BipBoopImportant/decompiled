package K9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: K9.u  reason: case insensitive filesystem */
public class C6622u extends a {
    public static final Parcelable.Creator<C6622u> CREATOR = new g0();

    /* renamed from: a  reason: collision with root package name */
    private final int f37922a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37923b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37924c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37925d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37926e;

    public C6622u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f37922a = i10;
        this.f37923b = z10;
        this.f37924c = z11;
        this.f37925d = i11;
        this.f37926e = i12;
    }

    public int B() {
        return this.f37926e;
    }

    public boolean F() {
        return this.f37923b;
    }

    public boolean J() {
        return this.f37924c;
    }

    public int U() {
        return this.f37922a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, U());
        c.c(parcel, 2, F());
        c.c(parcel, 3, J());
        c.n(parcel, 4, x());
        c.n(parcel, 5, B());
        c.b(parcel, a10);
    }

    public int x() {
        return this.f37925d;
    }
}
