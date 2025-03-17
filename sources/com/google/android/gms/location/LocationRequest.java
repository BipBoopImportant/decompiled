package com.google.android.gms.location;

import K9.C6619q;
import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.r;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import ea.J;
import ea.V;
import na.u;
import na.v;
import na.y;

public final class LocationRequest extends L9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f49431a;

    /* renamed from: b  reason: collision with root package name */
    private long f49432b;

    /* renamed from: c  reason: collision with root package name */
    private long f49433c;

    /* renamed from: d  reason: collision with root package name */
    private long f49434d;

    /* renamed from: e  reason: collision with root package name */
    private long f49435e;

    /* renamed from: f  reason: collision with root package name */
    private int f49436f;

    /* renamed from: g  reason: collision with root package name */
    private float f49437g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f49438h;

    /* renamed from: i  reason: collision with root package name */
    private long f49439i;

    /* renamed from: j  reason: collision with root package name */
    private final int f49440j;

    /* renamed from: k  reason: collision with root package name */
    private final int f49441k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f49442l;

    /* renamed from: m  reason: collision with root package name */
    private final WorkSource f49443m;

    /* renamed from: n  reason: collision with root package name */
    private final J f49444n;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r22 = this;
            r0 = r22
            android.os.WorkSource r1 = new android.os.WorkSource
            r20 = r1
            r1.<init>()
            r21 = 0
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r10
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    private static String v3(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : V.b(j10);
    }

    @Deprecated
    public static LocationRequest x() {
        WorkSource workSource = r1;
        WorkSource workSource2 = new WorkSource();
        return new LocationRequest(CheckoutActivity.RESULT_ERROR, 3600000, 600000, 0, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000, 0, 0, false, workSource, (J) null);
    }

    public long B() {
        return this.f49435e;
    }

    public int E0() {
        return this.f49436f;
    }

    public int F() {
        return this.f49440j;
    }

    public final int G2() {
        return this.f49441k;
    }

    public final boolean H2() {
        return this.f49442l;
    }

    public long J() {
        return this.f49432b;
    }

    public float N0() {
        return this.f49437g;
    }

    public long S0() {
        return this.f49433c;
    }

    public long U() {
        return this.f49439i;
    }

    public boolean W1() {
        return this.f49438h;
    }

    public int X0() {
        return this.f49431a;
    }

    public boolean a1() {
        long j10 = this.f49434d;
        return j10 > 0 && (j10 >> 1) >= this.f49432b;
    }

    @Deprecated
    public LocationRequest c2(long j10) {
        C6620s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f49433c;
        long j12 = this.f49432b;
        if (j11 == j12 / 6) {
            this.f49433c = j10 / 6;
        }
        if (this.f49439i == j12) {
            this.f49439i = j10;
        }
        this.f49432b = j10;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f49431a == locationRequest.f49431a && (o1() || this.f49432b == locationRequest.f49432b) && this.f49433c == locationRequest.f49433c && a1() == locationRequest.a1() && ((!a1() || this.f49434d == locationRequest.f49434d) && this.f49435e == locationRequest.f49435e && this.f49436f == locationRequest.f49436f && this.f49437g == locationRequest.f49437g && this.f49438h == locationRequest.f49438h && this.f49440j == locationRequest.f49440j && this.f49441k == locationRequest.f49441k && this.f49442l == locationRequest.f49442l && this.f49443m.equals(locationRequest.f49443m) && C6619q.b(this.f49444n, locationRequest.f49444n));
        }
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f49431a), Long.valueOf(this.f49432b), Long.valueOf(this.f49433c), this.f49443m);
    }

    public boolean o1() {
        return this.f49431a == 105;
    }

    public long t0() {
        return this.f49434d;
    }

    public final WorkSource t3() {
        return this.f49443m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (o1()) {
            sb2.append(u.b(this.f49431a));
            if (this.f49434d > 0) {
                sb2.append("/");
                V.c(this.f49434d, sb2);
            }
        } else {
            sb2.append("@");
            if (a1()) {
                V.c(this.f49432b, sb2);
                sb2.append("/");
                V.c(this.f49434d, sb2);
            } else {
                V.c(this.f49432b, sb2);
            }
            sb2.append(" ");
            sb2.append(u.b(this.f49431a));
        }
        if (o1() || this.f49433c != this.f49432b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(v3(this.f49433c));
        }
        if (((double) this.f49437g) > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f49437g);
        }
        if (!o1() ? this.f49439i != this.f49432b : this.f49439i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(v3(this.f49439i));
        }
        if (this.f49435e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            V.c(this.f49435e, sb2);
        }
        if (this.f49436f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f49436f);
        }
        if (this.f49441k != 0) {
            sb2.append(", ");
            sb2.append(v.b(this.f49441k));
        }
        if (this.f49440j != 0) {
            sb2.append(", ");
            sb2.append(y.b(this.f49440j));
        }
        if (this.f49438h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f49442l) {
            sb2.append(", bypass");
        }
        if (!r.d(this.f49443m)) {
            sb2.append(", ");
            sb2.append(this.f49443m);
        }
        if (this.f49444n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f49444n);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final J u3() {
        return this.f49444n;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, X0());
        c.r(parcel, 2, J());
        c.r(parcel, 3, S0());
        c.n(parcel, 6, E0());
        c.k(parcel, 7, N0());
        c.r(parcel, 8, t0());
        c.c(parcel, 9, W1());
        c.r(parcel, 10, B());
        c.r(parcel, 11, U());
        c.n(parcel, 12, F());
        c.n(parcel, 13, this.f49441k);
        c.c(parcel, 15, this.f49442l);
        c.t(parcel, 16, this.f49443m, i10, false);
        c.t(parcel, 17, this.f49444n, i10, false);
        c.b(parcel, a10);
    }

    @Deprecated
    public LocationRequest y2(int i10) {
        if (i10 > 0) {
            this.f49436f = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
        sb2.append("invalid numUpdates: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public LocationRequest z2(int i10) {
        u.a(i10);
        this.f49431a = i10;
        return this;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f49445a;

        /* renamed from: b  reason: collision with root package name */
        private long f49446b;

        /* renamed from: c  reason: collision with root package name */
        private long f49447c;

        /* renamed from: d  reason: collision with root package name */
        private long f49448d;

        /* renamed from: e  reason: collision with root package name */
        private long f49449e;

        /* renamed from: f  reason: collision with root package name */
        private int f49450f;

        /* renamed from: g  reason: collision with root package name */
        private float f49451g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f49452h;

        /* renamed from: i  reason: collision with root package name */
        private long f49453i;

        /* renamed from: j  reason: collision with root package name */
        private int f49454j;

        /* renamed from: k  reason: collision with root package name */
        private int f49455k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f49456l;

        /* renamed from: m  reason: collision with root package name */
        private WorkSource f49457m;

        /* renamed from: n  reason: collision with root package name */
        private J f49458n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        public LocationRequest a() {
            int i10 = this.f49445a;
            long j10 = this.f49446b;
            long j11 = this.f49447c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f49448d, this.f49446b);
            long j12 = this.f49449e;
            int i11 = this.f49450f;
            float f10 = this.f49451g;
            boolean z10 = this.f49452h;
            long j13 = this.f49453i;
            long j14 = j13 == -1 ? this.f49446b : j13;
            int i12 = this.f49454j;
            int i13 = this.f49455k;
            boolean z11 = this.f49456l;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f49457m);
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j14, i12, i13, z11, workSource, this.f49458n);
        }

        public a b(long j10) {
            C6620s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f49449e = j10;
            return this;
        }

        public a c(int i10) {
            y.a(i10);
            this.f49454j = i10;
            return this;
        }

        public a d(long j10) {
            C6620s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f49446b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            C6620s.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f49453i = j10;
            return this;
        }

        public a f(long j10) {
            C6620s.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f49448d = j10;
            return this;
        }

        public a g(int i10) {
            C6620s.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f49450f = i10;
            return this;
        }

        public a h(float f10) {
            C6620s.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f49451g = f10;
            return this;
        }

        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            C6620s.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f49447c = j10;
            return this;
        }

        public a j(int i10) {
            u.a(i10);
            this.f49445a = i10;
            return this;
        }

        public a k(boolean z10) {
            this.f49452h = z10;
            return this;
        }

        public final a l(int i10) {
            v.a(i10);
            this.f49455k = i10;
            return this;
        }

        public final a m(boolean z10) {
            this.f49456l = z10;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f49457m = workSource;
            return this;
        }

        public a(long j10) {
            this.f49445a = CheckoutActivity.RESULT_ERROR;
            this.f49447c = -1;
            this.f49448d = 0;
            this.f49449e = Long.MAX_VALUE;
            this.f49450f = Integer.MAX_VALUE;
            this.f49451g = 0.0f;
            this.f49452h = true;
            this.f49453i = -1;
            this.f49454j = 0;
            this.f49455k = 0;
            this.f49456l = false;
            this.f49457m = null;
            this.f49458n = null;
            d(j10);
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.X0(), locationRequest.J());
            i(locationRequest.S0());
            f(locationRequest.t0());
            b(locationRequest.B());
            g(locationRequest.E0());
            h(locationRequest.N0());
            k(locationRequest.W1());
            e(locationRequest.U());
            c(locationRequest.F());
            int G22 = locationRequest.G2();
            v.a(G22);
            this.f49455k = G22;
            this.f49456l = locationRequest.H2();
            this.f49457m = locationRequest.t3();
            J u32 = locationRequest.u3();
            boolean z10 = true;
            if (u32 != null && u32.zza()) {
                z10 = false;
            }
            C6620s.a(z10);
            this.f49458n = u32;
        }
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, J j16) {
        long j17;
        long j18;
        int i14 = i10;
        this.f49431a = i14;
        if (i14 == 105) {
            this.f49432b = Long.MAX_VALUE;
            j17 = j10;
        } else {
            j17 = j10;
            this.f49432b = j17;
        }
        this.f49433c = j11;
        this.f49434d = j12;
        if (j13 == Long.MAX_VALUE) {
            j18 = j14;
        } else {
            j18 = Math.min(Math.max(1, j13 - SystemClock.elapsedRealtime()), j14);
        }
        this.f49435e = j18;
        this.f49436f = i11;
        this.f49437g = f10;
        this.f49438h = z10;
        this.f49439i = j15 != -1 ? j15 : j17;
        this.f49440j = i12;
        this.f49441k = i13;
        this.f49442l = z11;
        this.f49443m = workSource;
        this.f49444n = j16;
    }
}
