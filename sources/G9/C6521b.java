package G9;

import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: G9.b  reason: case insensitive filesystem */
public class C6521b extends a {
    public static final Parcelable.Creator<C6521b> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    private final String f36311a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final int f36312b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36313c;

    public C6521b(String str, int i10, long j10) {
        this.f36311a = str;
        this.f36312b = i10;
        this.f36313c = j10;
    }

    public long B() {
        long j10 = this.f36313c;
        return j10 == -1 ? (long) this.f36312b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6521b) {
            C6521b bVar = (C6521b) obj;
            return ((x() != null && x().equals(bVar.x())) || (x() == null && bVar.x() == null)) && B() == bVar.B();
        }
    }

    public final int hashCode() {
        return C6619q.c(x(), Long.valueOf(B()));
    }

    public final String toString() {
        C6619q.a d10 = C6619q.d(this);
        d10.a("name", x());
        d10.a("version", Long.valueOf(B()));
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, x(), false);
        c.n(parcel, 2, this.f36312b);
        c.r(parcel, 3, B());
        c.b(parcel, a10);
    }

    public String x() {
        return this.f36311a;
    }

    public C6521b(String str, long j10) {
        this.f36311a = str;
        this.f36313c = j10;
        this.f36312b = -1;
    }
}
