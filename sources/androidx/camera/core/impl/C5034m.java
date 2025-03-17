package androidx.camera.core.impl;

import C.C4417z;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.c1;

/* renamed from: androidx.camera.core.impl.m  reason: case insensitive filesystem */
final class C5034m extends c1 {

    /* renamed from: b  reason: collision with root package name */
    private final Size f16943b;

    /* renamed from: c  reason: collision with root package name */
    private final C4417z f16944c;

    /* renamed from: d  reason: collision with root package name */
    private final Range<Integer> f16945d;

    /* renamed from: e  reason: collision with root package name */
    private final X f16946e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16947f;

    /* renamed from: androidx.camera.core.impl.m$b */
    static final class b extends c1.a {

        /* renamed from: a  reason: collision with root package name */
        private Size f16948a;

        /* renamed from: b  reason: collision with root package name */
        private C4417z f16949b;

        /* renamed from: c  reason: collision with root package name */
        private Range<Integer> f16950c;

        /* renamed from: d  reason: collision with root package name */
        private X f16951d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f16952e;

        public c1 a() {
            String str = "";
            if (this.f16948a == null) {
                str = str + " resolution";
            }
            if (this.f16949b == null) {
                str = str + " dynamicRange";
            }
            if (this.f16950c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f16952e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C5034m(this.f16948a, this.f16949b, this.f16950c, this.f16951d, this.f16952e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public c1.a b(C4417z zVar) {
            if (zVar != null) {
                this.f16949b = zVar;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        public c1.a c(Range<Integer> range) {
            if (range != null) {
                this.f16950c = range;
                return this;
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }

        public c1.a d(X x10) {
            this.f16951d = x10;
            return this;
        }

        public c1.a e(Size size) {
            if (size != null) {
                this.f16948a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        public c1.a f(boolean z10) {
            this.f16952e = Boolean.valueOf(z10);
            return this;
        }

        b() {
        }

        private b(c1 c1Var) {
            this.f16948a = c1Var.e();
            this.f16949b = c1Var.b();
            this.f16950c = c1Var.c();
            this.f16951d = c1Var.d();
            this.f16952e = Boolean.valueOf(c1Var.f());
        }
    }

    public C4417z b() {
        return this.f16944c;
    }

    public Range<Integer> c() {
        return this.f16945d;
    }

    public X d() {
        return this.f16946e;
    }

    public Size e() {
        return this.f16943b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f16946e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.impl.c1
            r2 = 0
            if (r1 == 0) goto L_0x004f
            androidx.camera.core.impl.c1 r5 = (androidx.camera.core.impl.c1) r5
            android.util.Size r1 = r4.f16943b
            android.util.Size r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            C.z r1 = r4.f16944c
            C.z r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            android.util.Range<java.lang.Integer> r1 = r4.f16945d
            android.util.Range r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            androidx.camera.core.impl.X r1 = r4.f16946e
            if (r1 != 0) goto L_0x003a
            androidx.camera.core.impl.X r1 = r5.d()
            if (r1 != 0) goto L_0x004d
            goto L_0x0044
        L_0x003a:
            androidx.camera.core.impl.X r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
        L_0x0044:
            boolean r1 = r4.f16947f
            boolean r5 = r5.f()
            if (r1 != r5) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C5034m.equals(java.lang.Object):boolean");
    }

    public boolean f() {
        return this.f16947f;
    }

    public c1.a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (((((this.f16943b.hashCode() ^ 1000003) * 1000003) ^ this.f16944c.hashCode()) * 1000003) ^ this.f16945d.hashCode()) * 1000003;
        X x10 = this.f16946e;
        return ((hashCode ^ (x10 == null ? 0 : x10.hashCode())) * 1000003) ^ (this.f16947f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f16943b + ", dynamicRange=" + this.f16944c + ", expectedFrameRateRange=" + this.f16945d + ", implementationOptions=" + this.f16946e + ", zslDisabled=" + this.f16947f + "}";
    }

    private C5034m(Size size, C4417z zVar, Range<Integer> range, X x10, boolean z10) {
        this.f16943b = size;
        this.f16944c = zVar;
        this.f16945d = range;
        this.f16946e = x10;
        this.f16947f = z10;
    }
}
