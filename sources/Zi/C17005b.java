package ZI;

import XI.C16830c;
import XI.j;
import XI.k;
import XI.x;
import eJ.C17199j;

/* renamed from: ZI.b  reason: case insensitive filesystem */
public class C17005b {

    /* renamed from: A  reason: collision with root package name */
    public static final C3447b f140795A;

    /* renamed from: B  reason: collision with root package name */
    public static final C3447b f140796B;

    /* renamed from: C  reason: collision with root package name */
    public static final C3447b f140797C;

    /* renamed from: D  reason: collision with root package name */
    public static final C3447b f140798D;

    /* renamed from: E  reason: collision with root package name */
    public static final C3447b f140799E;

    /* renamed from: F  reason: collision with root package name */
    public static final C3447b f140800F;

    /* renamed from: G  reason: collision with root package name */
    public static final C3447b f140801G;

    /* renamed from: H  reason: collision with root package name */
    public static final C3447b f140802H;

    /* renamed from: I  reason: collision with root package name */
    public static final C3447b f140803I;

    /* renamed from: J  reason: collision with root package name */
    public static final C3447b f140804J;

    /* renamed from: K  reason: collision with root package name */
    public static final C3447b f140805K;

    /* renamed from: L  reason: collision with root package name */
    public static final C3447b f140806L;

    /* renamed from: M  reason: collision with root package name */
    public static final C3447b f140807M;

    /* renamed from: N  reason: collision with root package name */
    public static final C3447b f140808N;

    /* renamed from: O  reason: collision with root package name */
    public static final C3447b f140809O;

    /* renamed from: P  reason: collision with root package name */
    public static final C3447b f140810P = d.c();

    /* renamed from: a  reason: collision with root package name */
    public static final C3447b f140811a;

    /* renamed from: b  reason: collision with root package name */
    public static final C3447b f140812b;

    /* renamed from: c  reason: collision with root package name */
    public static final C3447b f140813c;

    /* renamed from: d  reason: collision with root package name */
    public static final d<x> f140814d;

    /* renamed from: e  reason: collision with root package name */
    public static final d<k> f140815e;

    /* renamed from: f  reason: collision with root package name */
    public static final d<C16830c.C3435c> f140816f;

    /* renamed from: g  reason: collision with root package name */
    public static final C3447b f140817g;

    /* renamed from: h  reason: collision with root package name */
    public static final C3447b f140818h;

    /* renamed from: i  reason: collision with root package name */
    public static final C3447b f140819i;

    /* renamed from: j  reason: collision with root package name */
    public static final C3447b f140820j;

    /* renamed from: k  reason: collision with root package name */
    public static final C3447b f140821k;

    /* renamed from: l  reason: collision with root package name */
    public static final C3447b f140822l;

    /* renamed from: m  reason: collision with root package name */
    public static final C3447b f140823m;

    /* renamed from: n  reason: collision with root package name */
    public static final C3447b f140824n;

    /* renamed from: o  reason: collision with root package name */
    public static final C3447b f140825o;

    /* renamed from: p  reason: collision with root package name */
    public static final d<j> f140826p;

    /* renamed from: q  reason: collision with root package name */
    public static final C3447b f140827q;

    /* renamed from: r  reason: collision with root package name */
    public static final C3447b f140828r;

    /* renamed from: s  reason: collision with root package name */
    public static final C3447b f140829s;

    /* renamed from: t  reason: collision with root package name */
    public static final C3447b f140830t;

    /* renamed from: u  reason: collision with root package name */
    public static final C3447b f140831u;

    /* renamed from: v  reason: collision with root package name */
    public static final C3447b f140832v;

    /* renamed from: w  reason: collision with root package name */
    public static final C3447b f140833w;

    /* renamed from: x  reason: collision with root package name */
    public static final C3447b f140834x;

    /* renamed from: y  reason: collision with root package name */
    public static final C3447b f140835y;

    /* renamed from: z  reason: collision with root package name */
    public static final C3447b f140836z;

    /* renamed from: ZI.b$b  reason: collision with other inner class name */
    public static class C3447b extends d<Boolean> {
        public C3447b(int i10) {
            super(i10, 1);
        }

        /* renamed from: f */
        public Boolean d(int i10) {
            boolean z10 = true;
            if ((i10 & (1 << this.f140838a)) == 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        /* renamed from: g */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f140838a;
            }
            return 0;
        }
    }

    /* renamed from: ZI.b$c */
    private static class c<E extends C17199j.a> extends d<E> {

        /* renamed from: c  reason: collision with root package name */
        private final E[] f140837c;

        public c(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f140837c = eArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* renamed from: h */
        public E d(int i10) {
            int i11 = this.f140838a;
            int i12 = (i10 & (((1 << this.f140839b) - 1) << i11)) >> i11;
            for (E e10 : this.f140837c) {
                if (e10.d() == i12) {
                    return e10;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int e(E e10) {
            return e10.d() << this.f140838a;
        }
    }

    /* renamed from: ZI.b$d */
    public static abstract class d<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f140838a;

        /* renamed from: b  reason: collision with root package name */
        public final int f140839b;

        public static <E extends C17199j.a> d<E> a(d<?> dVar, E[] eArr) {
            return new c(dVar.f140838a + dVar.f140839b, eArr);
        }

        public static C3447b b(d<?> dVar) {
            return new C3447b(dVar.f140838a + dVar.f140839b);
        }

        public static C3447b c() {
            return new C3447b(0);
        }

        public abstract E d(int i10);

        public abstract int e(E e10);

        private d(int i10, int i11) {
            this.f140838a = i10;
            this.f140839b = i11;
        }
    }

    static {
        C3447b c10 = d.c();
        f140811a = c10;
        f140812b = d.b(c10);
        C3447b c11 = d.c();
        f140813c = c11;
        d<x> a10 = d.a(c11, x.values());
        f140814d = a10;
        d<k> a11 = d.a(a10, k.values());
        f140815e = a11;
        d<C16830c.C3435c> a12 = d.a(a11, C16830c.C3435c.values());
        f140816f = a12;
        C3447b b10 = d.b(a12);
        f140817g = b10;
        C3447b b11 = d.b(b10);
        f140818h = b11;
        C3447b b12 = d.b(b11);
        f140819i = b12;
        C3447b b13 = d.b(b12);
        f140820j = b13;
        C3447b b14 = d.b(b13);
        f140821k = b14;
        C3447b b15 = d.b(b14);
        f140822l = b15;
        f140823m = d.b(b15);
        C3447b b16 = d.b(a10);
        f140824n = b16;
        f140825o = d.b(b16);
        d<j> a13 = d.a(a11, j.values());
        f140826p = a13;
        C3447b b17 = d.b(a13);
        f140827q = b17;
        C3447b b18 = d.b(b17);
        f140828r = b18;
        C3447b b19 = d.b(b18);
        f140829s = b19;
        C3447b b20 = d.b(b19);
        f140830t = b20;
        C3447b b21 = d.b(b20);
        f140831u = b21;
        C3447b b22 = d.b(b21);
        f140832v = b22;
        C3447b b23 = d.b(b22);
        f140833w = b23;
        f140834x = d.b(b23);
        C3447b b24 = d.b(a13);
        f140835y = b24;
        C3447b b25 = d.b(b24);
        f140836z = b25;
        C3447b b26 = d.b(b25);
        f140795A = b26;
        C3447b b27 = d.b(b26);
        f140796B = b27;
        C3447b b28 = d.b(b27);
        f140797C = b28;
        C3447b b29 = d.b(b28);
        f140798D = b29;
        C3447b b30 = d.b(b29);
        f140799E = b30;
        C3447b b31 = d.b(b30);
        f140800F = b31;
        f140801G = d.b(b31);
        C3447b b32 = d.b(c11);
        f140802H = b32;
        C3447b b33 = d.b(b32);
        f140803I = b33;
        f140804J = d.b(b33);
        C3447b b34 = d.b(a11);
        f140805K = b34;
        C3447b b35 = d.b(b34);
        f140806L = b35;
        f140807M = d.b(b35);
        C3447b c12 = d.c();
        f140808N = c12;
        f140809O = d.b(c12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ZI.C17005b.a(int):void");
    }

    public static int b(boolean z10, x xVar, k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f140813c.e(Boolean.valueOf(z10)) | f140815e.e(kVar) | f140814d.e(xVar) | f140805K.e(Boolean.valueOf(z11)) | f140806L.e(Boolean.valueOf(z12)) | f140807M.e(Boolean.valueOf(z13));
    }
}
