package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class l2 extends T1<l2> implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private byte[] f48425c = C7168a2.f48302h;

    /* renamed from: d  reason: collision with root package name */
    private String f48426d = "";

    /* renamed from: e  reason: collision with root package name */
    private byte[][] f48427e = C7168a2.f48301g;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48428f = false;

    public l2() {
        this.f48261b = null;
        this.f48281a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final l2 clone() {
        try {
            l2 l2Var = (l2) super.clone();
            byte[][] bArr = this.f48427e;
            if (bArr != null && bArr.length > 0) {
                l2Var.f48427e = (byte[][]) bArr.clone();
            }
            return l2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void a(R1 r12) {
        if (!Arrays.equals(this.f48425c, C7168a2.f48302h)) {
            r12.d(1, this.f48425c);
        }
        byte[][] bArr = this.f48427e;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f48427e;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    r12.d(2, bArr3);
                }
                i10++;
            }
        }
        String str = this.f48426d;
        if (str != null && !str.equals("")) {
            r12.c(4, this.f48426d);
        }
        super.a(r12);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int d10 = super.d();
        if (!Arrays.equals(this.f48425c, C7168a2.f48302h)) {
            d10 += R1.i(1, this.f48425c);
        }
        byte[][] bArr = this.f48427e;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                byte[][] bArr2 = this.f48427e;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    i12++;
                    i11 += R1.s(bArr3);
                }
                i10++;
            }
            d10 = d10 + i11 + i12;
        }
        String str = this.f48426d;
        return (str == null || str.equals("")) ? d10 : d10 + R1.h(4, this.f48426d);
    }

    public final /* synthetic */ X1 e() {
        return (l2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (!Arrays.equals(this.f48425c, l2Var.f48425c)) {
            return false;
        }
        String str = this.f48426d;
        if (str == null) {
            if (l2Var.f48426d != null) {
                return false;
            }
        } else if (!str.equals(l2Var.f48426d)) {
            return false;
        }
        if (!W1.i(this.f48427e, l2Var.f48427e)) {
            return false;
        }
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            return this.f48261b.equals(l2Var.f48261b);
        }
        U1 u13 = l2Var.f48261b;
        return u13 == null || u13.a();
    }

    public final /* synthetic */ T1 f() {
        return (l2) clone();
    }

    public final int hashCode() {
        int hashCode = (((l2.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f48425c)) * 31;
        String str = this.f48426d;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + W1.g(this.f48427e)) * 31) + 1237) * 31;
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            i10 = this.f48261b.hashCode();
        }
        return hashCode2 + i10;
    }
}
