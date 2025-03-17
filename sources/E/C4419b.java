package E;

import C.C4383a0;
import E.C4437u;
import E.Z;
import O.C4710u;
import android.util.Size;

/* renamed from: E.b  reason: case insensitive filesystem */
final class C4419b extends C4437u.c {

    /* renamed from: d  reason: collision with root package name */
    private final Size f5602d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5603e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5604f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5605g;

    /* renamed from: h  reason: collision with root package name */
    private final C4383a0 f5606h;

    /* renamed from: i  reason: collision with root package name */
    private final Size f5607i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5608j;

    /* renamed from: k  reason: collision with root package name */
    private final C4710u<P> f5609k;

    /* renamed from: l  reason: collision with root package name */
    private final C4710u<Z.b> f5610l;

    C4419b(Size size, int i10, int i11, boolean z10, C4383a0 a0Var, Size size2, int i12, C4710u<P> uVar, C4710u<Z.b> uVar2) {
        if (size != null) {
            this.f5602d = size;
            this.f5603e = i10;
            this.f5604f = i11;
            this.f5605g = z10;
            this.f5606h = a0Var;
            this.f5607i = size2;
            this.f5608j = i12;
            if (uVar != null) {
                this.f5609k = uVar;
                if (uVar2 != null) {
                    this.f5610l = uVar2;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }

    /* access modifiers changed from: package-private */
    public C4710u<Z.b> b() {
        return this.f5610l;
    }

    /* access modifiers changed from: package-private */
    public C4383a0 c() {
        return this.f5606h;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f5603e;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f5604f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1 = r4.f5606h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r1 = r4.f5607i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof E.C4437u.c
            r2 = 0
            if (r1 == 0) goto L_0x007c
            E.u$c r5 = (E.C4437u.c) r5
            android.util.Size r1 = r4.f5602d
            android.util.Size r3 = r5.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            int r1 = r4.f5603e
            int r3 = r5.d()
            if (r1 != r3) goto L_0x007a
            int r1 = r4.f5604f
            int r3 = r5.e()
            if (r1 != r3) goto L_0x007a
            boolean r1 = r4.f5605g
            boolean r3 = r5.l()
            if (r1 != r3) goto L_0x007a
            C.a0 r1 = r4.f5606h
            if (r1 != 0) goto L_0x003a
            C.a0 r1 = r5.c()
            if (r1 != 0) goto L_0x007a
            goto L_0x0044
        L_0x003a:
            C.a0 r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
        L_0x0044:
            android.util.Size r1 = r4.f5607i
            if (r1 != 0) goto L_0x004f
            android.util.Size r1 = r5.g()
            if (r1 != 0) goto L_0x007a
            goto L_0x0059
        L_0x004f:
            android.util.Size r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
        L_0x0059:
            int r1 = r4.f5608j
            int r3 = r5.f()
            if (r1 != r3) goto L_0x007a
            O.u<E.P> r1 = r4.f5609k
            O.u r3 = r5.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            O.u<E.Z$b> r1 = r4.f5610l
            O.u r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r0 = r2
        L_0x007b:
            return r0
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C4419b.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f5608j;
    }

    /* access modifiers changed from: package-private */
    public Size g() {
        return this.f5607i;
    }

    public int hashCode() {
        int hashCode = (((((((this.f5602d.hashCode() ^ 1000003) * 1000003) ^ this.f5603e) * 1000003) ^ this.f5604f) * 1000003) ^ (this.f5605g ? 1231 : 1237)) * 1000003;
        C4383a0 a0Var = this.f5606h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        Size size = this.f5607i;
        if (size != null) {
            i10 = size.hashCode();
        }
        return ((((((hashCode2 ^ i10) * 1000003) ^ this.f5608j) * 1000003) ^ this.f5609k.hashCode()) * 1000003) ^ this.f5610l.hashCode();
    }

    /* access modifiers changed from: package-private */
    public C4710u<P> i() {
        return this.f5609k;
    }

    /* access modifiers changed from: package-private */
    public Size j() {
        return this.f5602d;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f5605g;
    }

    public String toString() {
        return "In{size=" + this.f5602d + ", inputFormat=" + this.f5603e + ", outputFormat=" + this.f5604f + ", virtualCamera=" + this.f5605g + ", imageReaderProxyProvider=" + this.f5606h + ", postviewSize=" + this.f5607i + ", postviewImageFormat=" + this.f5608j + ", requestEdge=" + this.f5609k + ", errorEdge=" + this.f5610l + "}";
    }
}
