package na;

import K9.C6619q;
import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.util.r;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import ea.J;
import ea.V;

/* renamed from: na.a  reason: case insensitive filesystem */
public final class C8592a extends a {
    public static final Parcelable.Creator<C8592a> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    private final long f55110a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55111b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55112c;

    /* renamed from: d  reason: collision with root package name */
    private final long f55113d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f55114e;

    /* renamed from: f  reason: collision with root package name */
    private final int f55115f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkSource f55116g;

    /* renamed from: h  reason: collision with root package name */
    private final J f55117h;

    /* renamed from: na.a$a  reason: collision with other inner class name */
    public static final class C0880a {

        /* renamed from: a  reason: collision with root package name */
        private long f55118a = 10000;

        /* renamed from: b  reason: collision with root package name */
        private int f55119b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f55120c = CheckoutActivity.RESULT_ERROR;

        /* renamed from: d  reason: collision with root package name */
        private long f55121d = Long.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f55122e = false;

        /* renamed from: f  reason: collision with root package name */
        private final int f55123f = 0;

        /* renamed from: g  reason: collision with root package name */
        private final WorkSource f55124g = null;

        /* renamed from: h  reason: collision with root package name */
        private final J f55125h = null;

        public C8592a a() {
            return new C8592a(this.f55118a, this.f55119b, this.f55120c, this.f55121d, this.f55122e, this.f55123f, new WorkSource(this.f55124g), this.f55125h);
        }

        public C0880a b(long j10) {
            C6620s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f55121d = j10;
            return this;
        }

        public C0880a c(int i10) {
            u.a(i10);
            this.f55120c = i10;
            return this;
        }
    }

    C8592a(long j10, int i10, int i11, long j11, boolean z10, int i12, WorkSource workSource, J j12) {
        this.f55110a = j10;
        this.f55111b = i10;
        this.f55112c = i11;
        this.f55113d = j11;
        this.f55114e = z10;
        this.f55115f = i12;
        this.f55116g = workSource;
        this.f55117h = j12;
    }

    public int B() {
        return this.f55111b;
    }

    public long F() {
        return this.f55110a;
    }

    public int J() {
        return this.f55112c;
    }

    public final int U() {
        return this.f55115f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8592a)) {
            return false;
        }
        C8592a aVar = (C8592a) obj;
        return this.f55110a == aVar.f55110a && this.f55111b == aVar.f55111b && this.f55112c == aVar.f55112c && this.f55113d == aVar.f55113d && this.f55114e == aVar.f55114e && this.f55115f == aVar.f55115f && C6619q.b(this.f55116g, aVar.f55116g) && C6619q.b(this.f55117h, aVar.f55117h);
    }

    public int hashCode() {
        return C6619q.c(Long.valueOf(this.f55110a), Integer.valueOf(this.f55111b), Integer.valueOf(this.f55112c), Long.valueOf(this.f55113d));
    }

    public final WorkSource t0() {
        return this.f55116g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(u.b(this.f55112c));
        if (this.f55110a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            V.c(this.f55110a, sb2);
        }
        if (this.f55113d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f55113d);
            sb2.append("ms");
        }
        if (this.f55111b != 0) {
            sb2.append(", ");
            sb2.append(y.b(this.f55111b));
        }
        if (this.f55114e) {
            sb2.append(", bypass");
        }
        if (this.f55115f != 0) {
            sb2.append(", ");
            sb2.append(v.b(this.f55115f));
        }
        if (!r.d(this.f55116g)) {
            sb2.append(", workSource=");
            sb2.append(this.f55116g);
        }
        if (this.f55117h != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f55117h);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, F());
        c.n(parcel, 2, B());
        c.n(parcel, 3, J());
        c.r(parcel, 4, x());
        c.c(parcel, 5, this.f55114e);
        c.t(parcel, 6, this.f55116g, i10, false);
        c.n(parcel, 7, this.f55115f);
        c.t(parcel, 9, this.f55117h, i10, false);
        c.b(parcel, a10);
    }

    public long x() {
        return this.f55113d;
    }

    public final boolean zza() {
        return this.f55114e;
    }
}
