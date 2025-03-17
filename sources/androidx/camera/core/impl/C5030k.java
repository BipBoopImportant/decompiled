package androidx.camera.core.impl;

import C.C4417z;
import androidx.camera.core.impl.X0;
import java.util.List;

/* renamed from: androidx.camera.core.impl.k  reason: case insensitive filesystem */
final class C5030k extends X0.f {

    /* renamed from: a  reason: collision with root package name */
    private final C5019e0 f16928a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C5019e0> f16929b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16930c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16931d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16932e;

    /* renamed from: f  reason: collision with root package name */
    private final C4417z f16933f;

    /* renamed from: androidx.camera.core.impl.k$b */
    static final class b extends X0.f.a {

        /* renamed from: a  reason: collision with root package name */
        private C5019e0 f16934a;

        /* renamed from: b  reason: collision with root package name */
        private List<C5019e0> f16935b;

        /* renamed from: c  reason: collision with root package name */
        private String f16936c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f16937d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f16938e;

        /* renamed from: f  reason: collision with root package name */
        private C4417z f16939f;

        b() {
        }

        public X0.f a() {
            String str = "";
            if (this.f16934a == null) {
                str = str + " surface";
            }
            if (this.f16935b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f16937d == null) {
                str = str + " mirrorMode";
            }
            if (this.f16938e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f16939f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C5030k(this.f16934a, this.f16935b, this.f16936c, this.f16937d.intValue(), this.f16938e.intValue(), this.f16939f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public X0.f.a b(C4417z zVar) {
            if (zVar != null) {
                this.f16939f = zVar;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        public X0.f.a c(int i10) {
            this.f16937d = Integer.valueOf(i10);
            return this;
        }

        public X0.f.a d(String str) {
            this.f16936c = str;
            return this;
        }

        public X0.f.a e(List<C5019e0> list) {
            if (list != null) {
                this.f16935b = list;
                return this;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }

        public X0.f.a f(int i10) {
            this.f16938e = Integer.valueOf(i10);
            return this;
        }

        public X0.f.a g(C5019e0 e0Var) {
            if (e0Var != null) {
                this.f16934a = e0Var;
                return this;
            }
            throw new NullPointerException("Null surface");
        }
    }

    public C4417z b() {
        return this.f16933f;
    }

    public int c() {
        return this.f16931d;
    }

    public String d() {
        return this.f16930c;
    }

    public List<C5019e0> e() {
        return this.f16929b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f16930c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.impl.X0.f
            r2 = 0
            if (r1 == 0) goto L_0x0057
            androidx.camera.core.impl.X0$f r5 = (androidx.camera.core.impl.X0.f) r5
            androidx.camera.core.impl.e0 r1 = r4.f16928a
            androidx.camera.core.impl.e0 r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            java.util.List<androidx.camera.core.impl.e0> r1 = r4.f16929b
            java.util.List r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = r4.f16930c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.d()
            if (r1 != 0) goto L_0x0055
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
        L_0x0038:
            int r1 = r4.f16931d
            int r3 = r5.c()
            if (r1 != r3) goto L_0x0055
            int r1 = r4.f16932e
            int r3 = r5.g()
            if (r1 != r3) goto L_0x0055
            C.z r1 = r4.f16933f
            C.z r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r2
        L_0x0056:
            return r0
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C5030k.equals(java.lang.Object):boolean");
    }

    public C5019e0 f() {
        return this.f16928a;
    }

    public int g() {
        return this.f16932e;
    }

    public int hashCode() {
        int hashCode = (((this.f16928a.hashCode() ^ 1000003) * 1000003) ^ this.f16929b.hashCode()) * 1000003;
        String str = this.f16930c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f16931d) * 1000003) ^ this.f16932e) * 1000003) ^ this.f16933f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f16928a + ", sharedSurfaces=" + this.f16929b + ", physicalCameraId=" + this.f16930c + ", mirrorMode=" + this.f16931d + ", surfaceGroupId=" + this.f16932e + ", dynamicRange=" + this.f16933f + "}";
    }

    private C5030k(C5019e0 e0Var, List<C5019e0> list, String str, int i10, int i11, C4417z zVar) {
        this.f16928a = e0Var;
        this.f16929b = list;
        this.f16930c = str;
        this.f16931d = i10;
        this.f16932e = i11;
        this.f16933f = zVar;
    }
}
