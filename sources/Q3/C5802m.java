package q3;

import t3.C5950a;
import t3.N;

/* renamed from: q3.m  reason: case insensitive filesystem */
public final class C5802m {

    /* renamed from: e  reason: collision with root package name */
    public static final C5802m f28156e = new b(0).e();

    /* renamed from: f  reason: collision with root package name */
    private static final String f28157f = N.A0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f28158g = N.A0(1);

    /* renamed from: h  reason: collision with root package name */
    private static final String f28159h = N.A0(2);

    /* renamed from: i  reason: collision with root package name */
    private static final String f28160i = N.A0(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f28161a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28162b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28163c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28164d;

    /* renamed from: q3.m$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f28165a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f28166b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f28167c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f28168d;

        public b(int i10) {
            this.f28165a = i10;
        }

        public C5802m e() {
            C5950a.a(this.f28166b <= this.f28167c);
            return new C5802m(this);
        }

        public b f(int i10) {
            this.f28167c = i10;
            return this;
        }

        public b g(int i10) {
            this.f28166b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5802m)) {
            return false;
        }
        C5802m mVar = (C5802m) obj;
        return this.f28161a == mVar.f28161a && this.f28162b == mVar.f28162b && this.f28163c == mVar.f28163c && N.d(this.f28164d, mVar.f28164d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f28161a) * 31) + this.f28162b) * 31) + this.f28163c) * 31;
        String str = this.f28164d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private C5802m(b bVar) {
        this.f28161a = bVar.f28165a;
        this.f28162b = bVar.f28166b;
        this.f28163c = bVar.f28167c;
        this.f28164d = bVar.f28168d;
    }
}
