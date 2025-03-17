package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class n2 extends T1<n2> implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f48438A;

    /* renamed from: c  reason: collision with root package name */
    public long f48439c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f48440d = 0;

    /* renamed from: e  reason: collision with root package name */
    private long f48441e = 0;

    /* renamed from: f  reason: collision with root package name */
    private String f48442f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f48443g = 0;

    /* renamed from: h  reason: collision with root package name */
    private String f48444h = "";

    /* renamed from: i  reason: collision with root package name */
    private int f48445i = 0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f48446j = false;

    /* renamed from: k  reason: collision with root package name */
    private o2[] f48447k = o2.j();

    /* renamed from: l  reason: collision with root package name */
    private byte[] f48448l;

    /* renamed from: m  reason: collision with root package name */
    private C7172b2 f48449m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f48450n;

    /* renamed from: o  reason: collision with root package name */
    private String f48451o;

    /* renamed from: p  reason: collision with root package name */
    private String f48452p;

    /* renamed from: q  reason: collision with root package name */
    private k2 f48453q;

    /* renamed from: r  reason: collision with root package name */
    private String f48454r;

    /* renamed from: s  reason: collision with root package name */
    public long f48455s;

    /* renamed from: t  reason: collision with root package name */
    private l2 f48456t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f48457u;

    /* renamed from: v  reason: collision with root package name */
    private String f48458v;

    /* renamed from: w  reason: collision with root package name */
    private int f48459w;

    /* renamed from: x  reason: collision with root package name */
    private int[] f48460x;

    /* renamed from: y  reason: collision with root package name */
    private long f48461y;

    /* renamed from: z  reason: collision with root package name */
    private c2 f48462z;

    public n2() {
        byte[] bArr = C7168a2.f48302h;
        this.f48448l = bArr;
        this.f48449m = null;
        this.f48450n = bArr;
        this.f48451o = "";
        this.f48452p = "";
        this.f48453q = null;
        this.f48454r = "";
        this.f48455s = 180000;
        this.f48456t = null;
        this.f48457u = bArr;
        this.f48458v = "";
        this.f48459w = 0;
        this.f48460x = C7168a2.f48295a;
        this.f48461y = 0;
        this.f48462z = null;
        this.f48438A = false;
        this.f48261b = null;
        this.f48281a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final n2 clone() {
        try {
            n2 n2Var = (n2) super.clone();
            o2[] o2VarArr = this.f48447k;
            if (o2VarArr != null && o2VarArr.length > 0) {
                n2Var.f48447k = new o2[o2VarArr.length];
                int i10 = 0;
                while (true) {
                    o2[] o2VarArr2 = this.f48447k;
                    if (i10 >= o2VarArr2.length) {
                        break;
                    }
                    o2 o2Var = o2VarArr2[i10];
                    if (o2Var != null) {
                        n2Var.f48447k[i10] = (o2) o2Var.clone();
                    }
                    i10++;
                }
            }
            C7172b2 b2Var = this.f48449m;
            if (b2Var != null) {
                n2Var.f48449m = b2Var;
            }
            k2 k2Var = this.f48453q;
            if (k2Var != null) {
                n2Var.f48453q = (k2) k2Var.clone();
            }
            l2 l2Var = this.f48456t;
            if (l2Var != null) {
                n2Var.f48456t = (l2) l2Var.clone();
            }
            int[] iArr = this.f48460x;
            if (iArr != null && iArr.length > 0) {
                n2Var.f48460x = (int[]) iArr.clone();
            }
            c2 c2Var = this.f48462z;
            if (c2Var != null) {
                n2Var.f48462z = c2Var;
            }
            return n2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void a(R1 r12) {
        long j10 = this.f48439c;
        if (j10 != 0) {
            r12.u(1, j10);
        }
        String str = this.f48442f;
        if (str != null && !str.equals("")) {
            r12.c(2, this.f48442f);
        }
        o2[] o2VarArr = this.f48447k;
        int i10 = 0;
        if (o2VarArr != null && o2VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                o2[] o2VarArr2 = this.f48447k;
                if (i11 >= o2VarArr2.length) {
                    break;
                }
                o2 o2Var = o2VarArr2[i11];
                if (o2Var != null) {
                    r12.b(3, o2Var);
                }
                i11++;
            }
        }
        byte[] bArr = this.f48448l;
        byte[] bArr2 = C7168a2.f48302h;
        if (!Arrays.equals(bArr, bArr2)) {
            r12.d(4, this.f48448l);
        }
        if (!Arrays.equals(this.f48450n, bArr2)) {
            r12.d(6, this.f48450n);
        }
        k2 k2Var = this.f48453q;
        if (k2Var != null) {
            r12.b(7, k2Var);
        }
        String str2 = this.f48451o;
        if (str2 != null && !str2.equals("")) {
            r12.c(8, this.f48451o);
        }
        C7172b2 b2Var = this.f48449m;
        if (b2Var != null) {
            r12.o(9, b2Var);
        }
        int i12 = this.f48443g;
        if (i12 != 0) {
            r12.l(11, i12);
        }
        String str3 = this.f48452p;
        if (str3 != null && !str3.equals("")) {
            r12.c(13, this.f48452p);
        }
        String str4 = this.f48454r;
        if (str4 != null && !str4.equals("")) {
            r12.c(14, this.f48454r);
        }
        long j11 = this.f48455s;
        if (j11 != 180000) {
            r12.j(15, 0);
            r12.w(R1.v(j11));
        }
        l2 l2Var = this.f48456t;
        if (l2Var != null) {
            r12.b(16, l2Var);
        }
        long j12 = this.f48440d;
        if (j12 != 0) {
            r12.u(17, j12);
        }
        if (!Arrays.equals(this.f48457u, bArr2)) {
            r12.d(18, this.f48457u);
        }
        int[] iArr = this.f48460x;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f48460x;
                if (i10 >= iArr2.length) {
                    break;
                }
                r12.l(20, iArr2[i10]);
                i10++;
            }
        }
        c2 c2Var = this.f48462z;
        if (c2Var != null) {
            r12.o(23, c2Var);
        }
        String str5 = this.f48458v;
        if (str5 != null && !str5.equals("")) {
            r12.c(24, this.f48458v);
        }
        boolean z10 = this.f48438A;
        if (z10) {
            r12.k(25, z10);
        }
        String str6 = this.f48444h;
        if (str6 != null && !str6.equals("")) {
            r12.c(26, this.f48444h);
        }
        super.a(r12);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int[] iArr;
        int d10 = super.d();
        long j10 = this.f48439c;
        if (j10 != 0) {
            d10 += R1.m(1, j10);
        }
        String str = this.f48442f;
        if (str != null && !str.equals("")) {
            d10 += R1.h(2, this.f48442f);
        }
        o2[] o2VarArr = this.f48447k;
        int i10 = 0;
        if (o2VarArr != null && o2VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                o2[] o2VarArr2 = this.f48447k;
                if (i11 >= o2VarArr2.length) {
                    break;
                }
                o2 o2Var = o2VarArr2[i11];
                if (o2Var != null) {
                    d10 += R1.g(3, o2Var);
                }
                i11++;
            }
        }
        byte[] bArr = this.f48448l;
        byte[] bArr2 = C7168a2.f48302h;
        if (!Arrays.equals(bArr, bArr2)) {
            d10 += R1.i(4, this.f48448l);
        }
        if (!Arrays.equals(this.f48450n, bArr2)) {
            d10 += R1.i(6, this.f48450n);
        }
        k2 k2Var = this.f48453q;
        if (k2Var != null) {
            d10 += R1.g(7, k2Var);
        }
        String str2 = this.f48451o;
        if (str2 != null && !str2.equals("")) {
            d10 += R1.h(8, this.f48451o);
        }
        C7172b2 b2Var = this.f48449m;
        if (b2Var != null) {
            d10 += M.O(9, b2Var);
        }
        int i12 = this.f48443g;
        if (i12 != 0) {
            d10 += R1.y(11) + R1.z(i12);
        }
        String str3 = this.f48452p;
        if (str3 != null && !str3.equals("")) {
            d10 += R1.h(13, this.f48452p);
        }
        String str4 = this.f48454r;
        if (str4 != null && !str4.equals("")) {
            d10 += R1.h(14, this.f48454r);
        }
        long j11 = this.f48455s;
        if (j11 != 180000) {
            d10 += R1.y(15) + R1.x(R1.v(j11));
        }
        l2 l2Var = this.f48456t;
        if (l2Var != null) {
            d10 += R1.g(16, l2Var);
        }
        long j12 = this.f48440d;
        if (j12 != 0) {
            d10 += R1.m(17, j12);
        }
        if (!Arrays.equals(this.f48457u, bArr2)) {
            d10 += R1.i(18, this.f48457u);
        }
        int[] iArr2 = this.f48460x;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = this.f48460x;
                if (i10 >= iArr.length) {
                    break;
                }
                i13 += R1.z(iArr[i10]);
                i10++;
            }
            d10 = d10 + i13 + (iArr.length * 2);
        }
        c2 c2Var = this.f48462z;
        if (c2Var != null) {
            d10 += M.O(23, c2Var);
        }
        String str5 = this.f48458v;
        if (str5 != null && !str5.equals("")) {
            d10 += R1.h(24, this.f48458v);
        }
        if (this.f48438A) {
            d10 += R1.y(25) + 1;
        }
        String str6 = this.f48444h;
        return (str6 == null || str6.equals("")) ? d10 : d10 + R1.h(26, this.f48444h);
    }

    public final /* synthetic */ X1 e() {
        return (n2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        if (this.f48439c != n2Var.f48439c || this.f48440d != n2Var.f48440d) {
            return false;
        }
        String str = this.f48442f;
        if (str == null) {
            if (n2Var.f48442f != null) {
                return false;
            }
        } else if (!str.equals(n2Var.f48442f)) {
            return false;
        }
        if (this.f48443g != n2Var.f48443g) {
            return false;
        }
        String str2 = this.f48444h;
        if (str2 == null) {
            if (n2Var.f48444h != null) {
                return false;
            }
        } else if (!str2.equals(n2Var.f48444h)) {
            return false;
        }
        if (!W1.c(this.f48447k, n2Var.f48447k) || !Arrays.equals(this.f48448l, n2Var.f48448l)) {
            return false;
        }
        C7172b2 b2Var = this.f48449m;
        if (b2Var == null) {
            if (n2Var.f48449m != null) {
                return false;
            }
        } else if (!b2Var.equals(n2Var.f48449m)) {
            return false;
        }
        if (!Arrays.equals(this.f48450n, n2Var.f48450n)) {
            return false;
        }
        String str3 = this.f48451o;
        if (str3 == null) {
            if (n2Var.f48451o != null) {
                return false;
            }
        } else if (!str3.equals(n2Var.f48451o)) {
            return false;
        }
        String str4 = this.f48452p;
        if (str4 == null) {
            if (n2Var.f48452p != null) {
                return false;
            }
        } else if (!str4.equals(n2Var.f48452p)) {
            return false;
        }
        k2 k2Var = this.f48453q;
        if (k2Var == null) {
            if (n2Var.f48453q != null) {
                return false;
            }
        } else if (!k2Var.equals(n2Var.f48453q)) {
            return false;
        }
        String str5 = this.f48454r;
        if (str5 == null) {
            if (n2Var.f48454r != null) {
                return false;
            }
        } else if (!str5.equals(n2Var.f48454r)) {
            return false;
        }
        if (this.f48455s != n2Var.f48455s) {
            return false;
        }
        l2 l2Var = this.f48456t;
        if (l2Var == null) {
            if (n2Var.f48456t != null) {
                return false;
            }
        } else if (!l2Var.equals(n2Var.f48456t)) {
            return false;
        }
        if (!Arrays.equals(this.f48457u, n2Var.f48457u)) {
            return false;
        }
        String str6 = this.f48458v;
        if (str6 == null) {
            if (n2Var.f48458v != null) {
                return false;
            }
        } else if (!str6.equals(n2Var.f48458v)) {
            return false;
        }
        if (!W1.a(this.f48460x, n2Var.f48460x)) {
            return false;
        }
        c2 c2Var = this.f48462z;
        if (c2Var == null) {
            if (n2Var.f48462z != null) {
                return false;
            }
        } else if (!c2Var.equals(n2Var.f48462z)) {
            return false;
        }
        if (this.f48438A != n2Var.f48438A) {
            return false;
        }
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            return this.f48261b.equals(n2Var.f48261b);
        }
        U1 u13 = n2Var.f48261b;
        return u13 == null || u13.a();
    }

    public final /* synthetic */ T1 f() {
        return (n2) clone();
    }

    public final int hashCode() {
        long j10 = this.f48439c;
        long j11 = this.f48440d;
        int hashCode = (((((n2.class.getName().hashCode() + 527) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 961;
        String str = this.f48442f;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f48443g) * 31;
        String str2 = this.f48444h;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i11 = 1237;
        int f10 = ((((((hashCode2 + hashCode3) * 961) + 1237) * 31) + W1.f(this.f48447k)) * 31) + Arrays.hashCode(this.f48448l);
        C7172b2 b2Var = this.f48449m;
        int hashCode4 = ((((f10 * 31) + (b2Var == null ? 0 : b2Var.hashCode())) * 31) + Arrays.hashCode(this.f48450n)) * 31;
        String str3 = this.f48451o;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48452p;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        k2 k2Var = this.f48453q;
        int hashCode7 = ((hashCode6 * 31) + (k2Var == null ? 0 : k2Var.hashCode())) * 31;
        String str5 = this.f48454r;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j12 = this.f48455s;
        l2 l2Var = this.f48456t;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (l2Var == null ? 0 : l2Var.hashCode())) * 31) + Arrays.hashCode(this.f48457u)) * 31;
        String str6 = this.f48458v;
        int hashCode10 = ((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 961) + W1.d(this.f48460x);
        c2 c2Var = this.f48462z;
        int hashCode11 = ((hashCode10 * 961) + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        if (this.f48438A) {
            i11 = 1231;
        }
        int i12 = (hashCode11 + i11) * 31;
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            i10 = this.f48261b.hashCode();
        }
        return i12 + i10;
    }
}
