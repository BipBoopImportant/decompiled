package na;

import K9.C6619q;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import ea.J;
import ea.V;

/* renamed from: na.e  reason: case insensitive filesystem */
public final class C8596e extends L9.a {
    public static final Parcelable.Creator<C8596e> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    private final long f55126a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55127b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55128c;

    /* renamed from: d  reason: collision with root package name */
    private final J f55129d;

    /* renamed from: na.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f55130a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        private int f55131b = 0;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f55132c = false;

        /* renamed from: d  reason: collision with root package name */
        private final J f55133d = null;

        public C8596e a() {
            return new C8596e(this.f55130a, this.f55131b, this.f55132c, this.f55133d);
        }
    }

    C8596e(long j10, int i10, boolean z10, J j11) {
        this.f55126a = j10;
        this.f55127b = i10;
        this.f55128c = z10;
        this.f55129d = j11;
    }

    public long B() {
        return this.f55126a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8596e)) {
            return false;
        }
        C8596e eVar = (C8596e) obj;
        return this.f55126a == eVar.f55126a && this.f55127b == eVar.f55127b && this.f55128c == eVar.f55128c && C6619q.b(this.f55129d, eVar.f55129d);
    }

    public int hashCode() {
        return C6619q.c(Long.valueOf(this.f55126a), Integer.valueOf(this.f55127b), Boolean.valueOf(this.f55128c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f55126a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            V.c(this.f55126a, sb2);
        }
        if (this.f55127b != 0) {
            sb2.append(", ");
            sb2.append(y.b(this.f55127b));
        }
        if (this.f55128c) {
            sb2.append(", bypass");
        }
        if (this.f55129d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f55129d);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, B());
        c.n(parcel, 2, x());
        c.c(parcel, 3, this.f55128c);
        c.t(parcel, 5, this.f55129d, i10, false);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f55127b;
    }
}
