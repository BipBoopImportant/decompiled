package com.google.protobuf;

import com.google.protobuf.u0;
import java.util.List;

/* renamed from: com.google.protobuf.j  reason: case insensitive filesystem */
final class C9577j implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final C9576i f69313a;

    /* renamed from: b  reason: collision with root package name */
    private int f69314b;

    /* renamed from: c  reason: collision with root package name */
    private int f69315c;

    /* renamed from: d  reason: collision with root package name */
    private int f69316d = 0;

    /* renamed from: com.google.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69317a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.u0$b[] r0 = com.google.protobuf.u0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69317a = r0
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f69317a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C9577j.a.<clinit>():void");
        }
    }

    private C9577j(C9576i iVar) {
        C9576i iVar2 = (C9576i) C9592z.b(iVar, "input");
        this.f69313a = iVar2;
        iVar2.f69302d = this;
    }

    public static C9577j Q(C9576i iVar) {
        C9577j jVar = iVar.f69302d;
        return jVar != null ? jVar : new C9577j(iVar);
    }

    private <T> void R(T t10, h0<T> h0Var, C9583p pVar) {
        int i10 = this.f69315c;
        this.f69315c = u0.c(u0.a(this.f69314b), 4);
        try {
            h0Var.i(t10, this, pVar);
            if (this.f69314b != this.f69315c) {
                throw B.h();
            }
        } finally {
            this.f69315c = i10;
        }
    }

    private <T> void S(T t10, h0<T> h0Var, C9583p pVar) {
        int A10 = this.f69313a.A();
        C9576i iVar = this.f69313a;
        if (iVar.f69299a < iVar.f69300b) {
            int j10 = iVar.j(A10);
            this.f69313a.f69299a++;
            h0Var.i(t10, this, pVar);
            this.f69313a.a(0);
            C9576i iVar2 = this.f69313a;
            iVar2.f69299a--;
            iVar2.i(j10);
            return;
        }
        throw B.i();
    }

    private Object T(u0.b bVar, Class<?> cls, C9583p pVar) {
        switch (a.f69317a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return N(cls, pVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(h0<T> h0Var, C9583p pVar) {
        T e10 = h0Var.e();
        R(e10, h0Var, pVar);
        h0Var.f(e10);
        return e10;
    }

    private <T> T V(h0<T> h0Var, C9583p pVar) {
        T e10 = h0Var.e();
        S(e10, h0Var, pVar);
        h0Var.f(e10);
        return e10;
    }

    private void X(int i10) {
        if (this.f69313a.d() != i10) {
            throw B.k();
        }
    }

    private void Y(int i10) {
        if (u0.b(this.f69314b) != i10) {
            throw B.e();
        }
    }

    private void Z(int i10) {
        if ((i10 & 3) != 0) {
            throw B.h();
        }
    }

    private void a0(int i10) {
        if ((i10 & 7) != 0) {
            throw B.h();
        }
    }

    public int A() {
        int i10 = this.f69316d;
        if (i10 != 0) {
            this.f69314b = i10;
            this.f69316d = 0;
        } else {
            this.f69314b = this.f69313a.z();
        }
        int i11 = this.f69314b;
        if (i11 == 0 || i11 == this.f69315c) {
            return Integer.MAX_VALUE;
        }
        return u0.a(i11);
    }

    public void B(List<String> list) {
        W(list, false);
    }

    public void C(List<Float> list) {
        int z10;
        int z11;
        if (list instanceof C9589w) {
            C9589w wVar = (C9589w) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 2) {
                int A10 = this.f69313a.A();
                Z(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    wVar.k(this.f69313a.q());
                } while (this.f69313a.d() < d10);
            } else if (b10 == 5) {
                do {
                    wVar.k(this.f69313a.q());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 2) {
                int A11 = this.f69313a.A();
                Z(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Float.valueOf(this.f69313a.q()));
                } while (this.f69313a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f69313a.q()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else {
                throw B.e();
            }
        }
    }

    public boolean D() {
        int i10;
        if (this.f69313a.e() || (i10 = this.f69314b) == this.f69315c) {
            return false;
        }
        return this.f69313a.C(i10);
    }

    public int E() {
        Y(5);
        return this.f69313a.t();
    }

    public void F(List<C9575h> list) {
        int z10;
        if (u0.b(this.f69314b) == 2) {
            do {
                list.add(o());
                if (!this.f69313a.e()) {
                    z10 = this.f69313a.z();
                } else {
                    return;
                }
            } while (z10 == this.f69314b);
            this.f69316d = z10;
            return;
        }
        throw B.e();
    }

    public void G(List<Double> list) {
        int z10;
        int z11;
        if (list instanceof C9580m) {
            C9580m mVar = (C9580m) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 1) {
                do {
                    mVar.k(this.f69313a.m());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int A10 = this.f69313a.A();
                a0(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    mVar.k(this.f69313a.m());
                } while (this.f69313a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f69313a.m()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int A11 = this.f69313a.A();
                a0(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Double.valueOf(this.f69313a.m()));
                } while (this.f69313a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public long H() {
        Y(0);
        return this.f69313a.s();
    }

    public String I() {
        Y(2);
        return this.f69313a.y();
    }

    @Deprecated
    public <T> void J(List<T> list, h0<T> h0Var, C9583p pVar) {
        int z10;
        if (u0.b(this.f69314b) == 3) {
            int i10 = this.f69314b;
            do {
                list.add(U(h0Var, pVar));
                if (!this.f69313a.e() && this.f69316d == 0) {
                    z10 = this.f69313a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f69316d = z10;
            return;
        }
        throw B.e();
    }

    public <T> void K(List<T> list, h0<T> h0Var, C9583p pVar) {
        int z10;
        if (u0.b(this.f69314b) == 2) {
            int i10 = this.f69314b;
            do {
                list.add(V(h0Var, pVar));
                if (!this.f69313a.e() && this.f69316d == 0) {
                    z10 = this.f69313a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f69316d = z10;
            return;
        }
        throw B.e();
    }

    @Deprecated
    public <T> T L(Class<T> cls, C9583p pVar) {
        Y(3);
        return U(d0.a().c(cls), pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (D() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new com.google.protobuf.B(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void M(java.util.Map<K, V> r8, com.google.protobuf.K.a<K, V> r9, com.google.protobuf.C9583p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.i r1 = r7.f69313a
            int r1 = r1.A()
            com.google.protobuf.i r2 = r7.f69313a
            int r1 = r2.j(r1)
            K r2 = r9.f69229b
            V r3 = r9.f69231d
        L_0x0014:
            int r4 = r7.A()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            com.google.protobuf.i r5 = r7.f69313a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.e()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0026
            goto L_0x005e
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0049
            if (r4 == r0) goto L_0x003c
            boolean r4 = r7.D()     // Catch:{ a -> 0x0051 }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.B r4 = new com.google.protobuf.B     // Catch:{ a -> 0x0051 }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x0051 }
            throw r4     // Catch:{ a -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            com.google.protobuf.u0$b r4 = r9.f69230c     // Catch:{ a -> 0x0051 }
            V r5 = r9.f69231d     // Catch:{ a -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x0051 }
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            com.google.protobuf.u0$b r4 = r9.f69228a     // Catch:{ a -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.D()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            com.google.protobuf.B r8 = new com.google.protobuf.B     // Catch:{ all -> 0x003a }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            com.google.protobuf.i r8 = r7.f69313a
            r8.i(r1)
            return
        L_0x0067:
            com.google.protobuf.i r9 = r7.f69313a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C9577j.M(java.util.Map, com.google.protobuf.K$a, com.google.protobuf.p):void");
    }

    public <T> T N(Class<T> cls, C9583p pVar) {
        Y(2);
        return V(d0.a().c(cls), pVar);
    }

    public <T> void O(T t10, h0<T> h0Var, C9583p pVar) {
        Y(3);
        R(t10, h0Var, pVar);
    }

    public <T> void P(T t10, h0<T> h0Var, C9583p pVar) {
        Y(2);
        S(t10, h0Var, pVar);
    }

    public void W(List<String> list, boolean z10) {
        int z11;
        int z12;
        if (u0.b(this.f69314b) != 2) {
            throw B.e();
        } else if (!(list instanceof G) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (!this.f69313a.e()) {
                    z11 = this.f69313a.z();
                } else {
                    return;
                }
            } while (z11 == this.f69314b);
            this.f69316d = z11;
        } else {
            G g10 = (G) list;
            do {
                g10.f0(o());
                if (!this.f69313a.e()) {
                    z12 = this.f69313a.z();
                } else {
                    return;
                }
            } while (z12 == this.f69314b);
            this.f69316d = z12;
        }
    }

    public int a() {
        return this.f69314b;
    }

    public long b() {
        Y(1);
        return this.f69313a.p();
    }

    public void c(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 2) {
                int A10 = this.f69313a.A();
                Z(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    yVar.P1(this.f69313a.t());
                } while (this.f69313a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.P1(this.f69313a.t());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 2) {
                int A11 = this.f69313a.A();
                Z(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Integer.valueOf(this.f69313a.t()));
                } while (this.f69313a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f69313a.t()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else {
                throw B.e();
            }
        }
    }

    public void d(List<Long> list) {
        int z10;
        int z11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    i10.m(this.f69313a.w());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    i10.m(this.f69313a.w());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f69313a.w()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Long.valueOf(this.f69313a.w()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public boolean e() {
        Y(0);
        return this.f69313a.k();
    }

    public long f() {
        Y(1);
        return this.f69313a.u();
    }

    public void g(List<Long> list) {
        int z10;
        int z11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    i10.m(this.f69313a.B());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    i10.m(this.f69313a.B());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f69313a.B()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Long.valueOf(this.f69313a.B()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int h() {
        Y(0);
        return this.f69313a.A();
    }

    public void i(List<Long> list) {
        int z10;
        int z11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    i10.m(this.f69313a.s());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    i10.m(this.f69313a.s());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f69313a.s()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Long.valueOf(this.f69313a.s()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void j(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f69313a.n());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    yVar.P1(this.f69313a.n());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f69313a.n()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Integer.valueOf(this.f69313a.n()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int k() {
        Y(0);
        return this.f69313a.n();
    }

    public int l() {
        Y(0);
        return this.f69313a.v();
    }

    public void m(List<Boolean> list) {
        int z10;
        int z11;
        if (list instanceof C9573f) {
            C9573f fVar = (C9573f) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    fVar.m(this.f69313a.k());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    fVar.m(this.f69313a.k());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f69313a.k()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Boolean.valueOf(this.f69313a.k()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void n(List<String> list) {
        W(list, true);
    }

    public C9575h o() {
        Y(2);
        return this.f69313a.l();
    }

    public int p() {
        Y(0);
        return this.f69313a.r();
    }

    public void q(List<Long> list) {
        int z10;
        int z11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 1) {
                do {
                    i10.m(this.f69313a.p());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int A10 = this.f69313a.A();
                a0(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    i10.m(this.f69313a.p());
                } while (this.f69313a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f69313a.p()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int A11 = this.f69313a.A();
                a0(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Long.valueOf(this.f69313a.p()));
                } while (this.f69313a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public void r(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f69313a.v());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    yVar.P1(this.f69313a.v());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f69313a.v()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Integer.valueOf(this.f69313a.v()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public double readDouble() {
        Y(1);
        return this.f69313a.m();
    }

    public float readFloat() {
        Y(5);
        return this.f69313a.q();
    }

    public long s() {
        Y(0);
        return this.f69313a.B();
    }

    public void t(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f69313a.A());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    yVar.P1(this.f69313a.A());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f69313a.A()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Integer.valueOf(this.f69313a.A()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public int u() {
        Y(5);
        return this.f69313a.o();
    }

    public void v(List<Long> list) {
        int z10;
        int z11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 1) {
                do {
                    i10.m(this.f69313a.u());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int A10 = this.f69313a.A();
                a0(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    i10.m(this.f69313a.u());
                } while (this.f69313a.d() < d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f69313a.u()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int A11 = this.f69313a.A();
                a0(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Long.valueOf(this.f69313a.u()));
                } while (this.f69313a.d() < d11);
            } else {
                throw B.e();
            }
        }
    }

    public void w(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f69313a.r());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else if (b10 == 2) {
                int d10 = this.f69313a.d() + this.f69313a.A();
                do {
                    yVar.P1(this.f69313a.r());
                } while (this.f69313a.d() < d10);
                X(d10);
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f69313a.r()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else if (b11 == 2) {
                int d11 = this.f69313a.d() + this.f69313a.A();
                do {
                    list.add(Integer.valueOf(this.f69313a.r()));
                } while (this.f69313a.d() < d11);
                X(d11);
            } else {
                throw B.e();
            }
        }
    }

    public void x(List<Integer> list) {
        int z10;
        int z11;
        if (list instanceof C9591y) {
            C9591y yVar = (C9591y) list;
            int b10 = u0.b(this.f69314b);
            if (b10 == 2) {
                int A10 = this.f69313a.A();
                Z(A10);
                int d10 = this.f69313a.d() + A10;
                do {
                    yVar.P1(this.f69313a.o());
                } while (this.f69313a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.P1(this.f69313a.o());
                    if (!this.f69313a.e()) {
                        z11 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z11 == this.f69314b);
                this.f69316d = z11;
            } else {
                throw B.e();
            }
        } else {
            int b11 = u0.b(this.f69314b);
            if (b11 == 2) {
                int A11 = this.f69313a.A();
                Z(A11);
                int d11 = this.f69313a.d() + A11;
                do {
                    list.add(Integer.valueOf(this.f69313a.o()));
                } while (this.f69313a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f69313a.o()));
                    if (!this.f69313a.e()) {
                        z10 = this.f69313a.z();
                    } else {
                        return;
                    }
                } while (z10 == this.f69314b);
                this.f69316d = z10;
            } else {
                throw B.e();
            }
        }
    }

    public long y() {
        Y(0);
        return this.f69313a.w();
    }

    public String z() {
        Y(2);
        return this.f69313a.x();
    }
}
