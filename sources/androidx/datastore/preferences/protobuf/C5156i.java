package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t0;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
final class C5156i implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5155h f21347a;

    /* renamed from: b  reason: collision with root package name */
    private int f21348b;

    /* renamed from: c  reason: collision with root package name */
    private int f21349c;

    /* renamed from: d  reason: collision with root package name */
    private int f21350d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21351a;

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
                androidx.datastore.preferences.protobuf.t0$b[] r0 = androidx.datastore.preferences.protobuf.t0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21351a = r0
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f21351a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5156i.a.<clinit>():void");
        }
    }

    private C5156i(C5155h hVar) {
        C5155h hVar2 = (C5155h) C5172z.b(hVar, "input");
        this.f21347a = hVar2;
        hVar2.f21328d = this;
    }

    public static C5156i Q(C5155h hVar) {
        C5156i iVar = hVar.f21328d;
        return iVar != null ? iVar : new C5156i(hVar);
    }

    private <T> void R(T t10, h0<T> h0Var, C5162o oVar) {
        int i10 = this.f21349c;
        this.f21349c = t0.c(t0.a(this.f21348b), 4);
        try {
            h0Var.i(t10, this, oVar);
            if (this.f21348b != this.f21349c) {
                throw A.h();
            }
        } finally {
            this.f21349c = i10;
        }
    }

    private <T> void S(T t10, h0<T> h0Var, C5162o oVar) {
        int D10 = this.f21347a.D();
        C5155h hVar = this.f21347a;
        if (hVar.f21325a < hVar.f21326b) {
            int m10 = hVar.m(D10);
            this.f21347a.f21325a++;
            h0Var.i(t10, this, oVar);
            this.f21347a.a(0);
            C5155h hVar2 = this.f21347a;
            hVar2.f21325a--;
            hVar2.l(m10);
            return;
        }
        throw A.i();
    }

    private Object T(t0.b bVar, Class<?> cls, C5162o oVar) {
        switch (a.f21351a[bVar.ordinal()]) {
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
                return L(cls, oVar);
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

    private <T> T U(h0<T> h0Var, C5162o oVar) {
        T e10 = h0Var.e();
        R(e10, h0Var, oVar);
        h0Var.f(e10);
        return e10;
    }

    private <T> T V(h0<T> h0Var, C5162o oVar) {
        T e10 = h0Var.e();
        S(e10, h0Var, oVar);
        h0Var.f(e10);
        return e10;
    }

    private void X(int i10) {
        if (this.f21347a.e() != i10) {
            throw A.m();
        }
    }

    private void Y(int i10) {
        if (t0.b(this.f21348b) != i10) {
            throw A.e();
        }
    }

    private void Z(int i10) {
        if ((i10 & 3) != 0) {
            throw A.h();
        }
    }

    private void a0(int i10) {
        if ((i10 & 7) != 0) {
            throw A.h();
        }
    }

    public int A() {
        int i10 = this.f21350d;
        if (i10 != 0) {
            this.f21348b = i10;
            this.f21350d = 0;
        } else {
            this.f21348b = this.f21347a.C();
        }
        int i11 = this.f21348b;
        if (i11 == 0 || i11 == this.f21349c) {
            return Integer.MAX_VALUE;
        }
        return t0.a(i11);
    }

    public void B(List<String> list) {
        W(list, false);
    }

    public void C(List<Float> list) {
        int C10;
        int C11;
        if (list instanceof C5168v) {
            C5168v vVar = (C5168v) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 2) {
                int D10 = this.f21347a.D();
                Z(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    vVar.k(this.f21347a.t());
                } while (this.f21347a.e() < e10);
            } else if (b10 == 5) {
                do {
                    vVar.k(this.f21347a.t());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 2) {
                int D11 = this.f21347a.D();
                Z(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Float.valueOf(this.f21347a.t()));
                } while (this.f21347a.e() < e11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f21347a.t()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else {
                throw A.e();
            }
        }
    }

    public boolean D() {
        int i10;
        if (this.f21347a.f() || (i10 = this.f21348b) == this.f21349c) {
            return false;
        }
        return this.f21347a.F(i10);
    }

    public int E() {
        Y(5);
        return this.f21347a.w();
    }

    public void F(List<C5154g> list) {
        int C10;
        if (t0.b(this.f21348b) == 2) {
            do {
                list.add(o());
                if (!this.f21347a.f()) {
                    C10 = this.f21347a.C();
                } else {
                    return;
                }
            } while (C10 == this.f21348b);
            this.f21350d = C10;
            return;
        }
        throw A.e();
    }

    public void G(List<Double> list) {
        int C10;
        int C11;
        if (list instanceof C5159l) {
            C5159l lVar = (C5159l) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 1) {
                do {
                    lVar.k(this.f21347a.p());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int D10 = this.f21347a.D();
                a0(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    lVar.k(this.f21347a.p());
                } while (this.f21347a.e() < e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f21347a.p()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int D11 = this.f21347a.D();
                a0(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Double.valueOf(this.f21347a.p()));
                } while (this.f21347a.e() < e11);
            } else {
                throw A.e();
            }
        }
    }

    public long H() {
        Y(0);
        return this.f21347a.v();
    }

    public String I() {
        Y(2);
        return this.f21347a.B();
    }

    public <T> void J(T t10, h0<T> h0Var, C5162o oVar) {
        Y(2);
        S(t10, h0Var, oVar);
    }

    public <T> void K(List<T> list, h0<T> h0Var, C5162o oVar) {
        int C10;
        if (t0.b(this.f21348b) == 2) {
            int i10 = this.f21348b;
            do {
                list.add(V(h0Var, oVar));
                if (!this.f21347a.f() && this.f21350d == 0) {
                    C10 = this.f21347a.C();
                } else {
                    return;
                }
            } while (C10 == i10);
            this.f21350d = C10;
            return;
        }
        throw A.e();
    }

    public <T> T L(Class<T> cls, C5162o oVar) {
        Y(2);
        return V(d0.a().c(cls), oVar);
    }

    @Deprecated
    public <T> T M(Class<T> cls, C5162o oVar) {
        Y(3);
        return U(d0.a().c(cls), oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (D() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new androidx.datastore.preferences.protobuf.A(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void N(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.K.a<K, V> r9, androidx.datastore.preferences.protobuf.C5162o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f21347a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.h r2 = r7.f21347a
            int r1 = r2.m(r1)
            K r2 = r9.f21260b
            V r3 = r9.f21262d
        L_0x0014:
            int r4 = r7.A()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            androidx.datastore.preferences.protobuf.h r5 = r7.f21347a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.f()     // Catch:{ all -> 0x003a }
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
            androidx.datastore.preferences.protobuf.A r4 = new androidx.datastore.preferences.protobuf.A     // Catch:{ a -> 0x0051 }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x0051 }
            throw r4     // Catch:{ a -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            androidx.datastore.preferences.protobuf.t0$b r4 = r9.f21261c     // Catch:{ a -> 0x0051 }
            V r5 = r9.f21262d     // Catch:{ a -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x0051 }
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            androidx.datastore.preferences.protobuf.t0$b r4 = r9.f21259a     // Catch:{ a -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.D()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            androidx.datastore.preferences.protobuf.A r8 = new androidx.datastore.preferences.protobuf.A     // Catch:{ all -> 0x003a }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            androidx.datastore.preferences.protobuf.h r8 = r7.f21347a
            r8.l(r1)
            return
        L_0x0067:
            androidx.datastore.preferences.protobuf.h r9 = r7.f21347a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5156i.N(java.util.Map, androidx.datastore.preferences.protobuf.K$a, androidx.datastore.preferences.protobuf.o):void");
    }

    public <T> void O(T t10, h0<T> h0Var, C5162o oVar) {
        Y(3);
        R(t10, h0Var, oVar);
    }

    @Deprecated
    public <T> void P(List<T> list, h0<T> h0Var, C5162o oVar) {
        int C10;
        if (t0.b(this.f21348b) == 3) {
            int i10 = this.f21348b;
            do {
                list.add(U(h0Var, oVar));
                if (!this.f21347a.f() && this.f21350d == 0) {
                    C10 = this.f21347a.C();
                } else {
                    return;
                }
            } while (C10 == i10);
            this.f21350d = C10;
            return;
        }
        throw A.e();
    }

    public void W(List<String> list, boolean z10) {
        int C10;
        int C11;
        if (t0.b(this.f21348b) != 2) {
            throw A.e();
        } else if (!(list instanceof E) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (!this.f21347a.f()) {
                    C10 = this.f21347a.C();
                } else {
                    return;
                }
            } while (C10 == this.f21348b);
            this.f21350d = C10;
        } else {
            E e10 = (E) list;
            do {
                e10.e2(o());
                if (!this.f21347a.f()) {
                    C11 = this.f21347a.C();
                } else {
                    return;
                }
            } while (C11 == this.f21348b);
            this.f21350d = C11;
        }
    }

    public int a() {
        return this.f21348b;
    }

    public long b() {
        Y(1);
        return this.f21347a.s();
    }

    public void c(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 2) {
                int D10 = this.f21347a.D();
                Z(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    yVar.P1(this.f21347a.w());
                } while (this.f21347a.e() < e10);
            } else if (b10 == 5) {
                do {
                    yVar.P1(this.f21347a.w());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 2) {
                int D11 = this.f21347a.D();
                Z(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Integer.valueOf(this.f21347a.w()));
                } while (this.f21347a.e() < e11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f21347a.w()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else {
                throw A.e();
            }
        }
    }

    public void d(List<Long> list) {
        int C10;
        int C11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    i10.m(this.f21347a.z());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    i10.m(this.f21347a.z());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f21347a.z()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Long.valueOf(this.f21347a.z()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public boolean e() {
        Y(0);
        return this.f21347a.n();
    }

    public long f() {
        Y(1);
        return this.f21347a.x();
    }

    public void g(List<Long> list) {
        int C10;
        int C11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    i10.m(this.f21347a.E());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    i10.m(this.f21347a.E());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f21347a.E()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Long.valueOf(this.f21347a.E()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public int h() {
        Y(0);
        return this.f21347a.D();
    }

    public void i(List<Long> list) {
        int C10;
        int C11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    i10.m(this.f21347a.v());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    i10.m(this.f21347a.v());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f21347a.v()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Long.valueOf(this.f21347a.v()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public void j(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f21347a.q());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    yVar.P1(this.f21347a.q());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f21347a.q()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Integer.valueOf(this.f21347a.q()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public int k() {
        Y(0);
        return this.f21347a.q();
    }

    public int l() {
        Y(0);
        return this.f21347a.y();
    }

    public void m(List<Boolean> list) {
        int C10;
        int C11;
        if (list instanceof C5152e) {
            C5152e eVar = (C5152e) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    eVar.m(this.f21347a.n());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    eVar.m(this.f21347a.n());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f21347a.n()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Boolean.valueOf(this.f21347a.n()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public void n(List<String> list) {
        W(list, true);
    }

    public C5154g o() {
        Y(2);
        return this.f21347a.o();
    }

    public int p() {
        Y(0);
        return this.f21347a.u();
    }

    public void q(List<Long> list) {
        int C10;
        int C11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 1) {
                do {
                    i10.m(this.f21347a.s());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int D10 = this.f21347a.D();
                a0(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    i10.m(this.f21347a.s());
                } while (this.f21347a.e() < e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f21347a.s()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int D11 = this.f21347a.D();
                a0(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Long.valueOf(this.f21347a.s()));
                } while (this.f21347a.e() < e11);
            } else {
                throw A.e();
            }
        }
    }

    public void r(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f21347a.y());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    yVar.P1(this.f21347a.y());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f21347a.y()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Integer.valueOf(this.f21347a.y()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public double readDouble() {
        Y(1);
        return this.f21347a.p();
    }

    public float readFloat() {
        Y(5);
        return this.f21347a.t();
    }

    public long s() {
        Y(0);
        return this.f21347a.E();
    }

    public void t(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f21347a.D());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    yVar.P1(this.f21347a.D());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f21347a.D()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Integer.valueOf(this.f21347a.D()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public int u() {
        Y(5);
        return this.f21347a.r();
    }

    public void v(List<Long> list) {
        int C10;
        int C11;
        if (list instanceof I) {
            I i10 = (I) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 1) {
                do {
                    i10.m(this.f21347a.x());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int D10 = this.f21347a.D();
                a0(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    i10.m(this.f21347a.x());
                } while (this.f21347a.e() < e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f21347a.x()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int D11 = this.f21347a.D();
                a0(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Long.valueOf(this.f21347a.x()));
                } while (this.f21347a.e() < e11);
            } else {
                throw A.e();
            }
        }
    }

    public void w(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 0) {
                do {
                    yVar.P1(this.f21347a.u());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else if (b10 == 2) {
                int e10 = this.f21347a.e() + this.f21347a.D();
                do {
                    yVar.P1(this.f21347a.u());
                } while (this.f21347a.e() < e10);
                X(e10);
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f21347a.u()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else if (b11 == 2) {
                int e11 = this.f21347a.e() + this.f21347a.D();
                do {
                    list.add(Integer.valueOf(this.f21347a.u()));
                } while (this.f21347a.e() < e11);
                X(e11);
            } else {
                throw A.e();
            }
        }
    }

    public void x(List<Integer> list) {
        int C10;
        int C11;
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            int b10 = t0.b(this.f21348b);
            if (b10 == 2) {
                int D10 = this.f21347a.D();
                Z(D10);
                int e10 = this.f21347a.e() + D10;
                do {
                    yVar.P1(this.f21347a.r());
                } while (this.f21347a.e() < e10);
            } else if (b10 == 5) {
                do {
                    yVar.P1(this.f21347a.r());
                    if (!this.f21347a.f()) {
                        C11 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C11 == this.f21348b);
                this.f21350d = C11;
            } else {
                throw A.e();
            }
        } else {
            int b11 = t0.b(this.f21348b);
            if (b11 == 2) {
                int D11 = this.f21347a.D();
                Z(D11);
                int e11 = this.f21347a.e() + D11;
                do {
                    list.add(Integer.valueOf(this.f21347a.r()));
                } while (this.f21347a.e() < e11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f21347a.r()));
                    if (!this.f21347a.f()) {
                        C10 = this.f21347a.C();
                    } else {
                        return;
                    }
                } while (C10 == this.f21348b);
                this.f21350d = C10;
            } else {
                throw A.e();
            }
        }
    }

    public long y() {
        Y(0);
        return this.f21347a.z();
    }

    public String z() {
        Y(2);
        return this.f21347a.A();
    }
}
