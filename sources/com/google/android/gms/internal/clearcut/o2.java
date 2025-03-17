package com.google.android.gms.internal.clearcut;

public final class o2 extends T1<o2> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static volatile o2[] f48467e;

    /* renamed from: c  reason: collision with root package name */
    private String f48468c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f48469d = "";

    public o2() {
        this.f48261b = null;
        this.f48281a = -1;
    }

    public static o2[] j() {
        if (f48467e == null) {
            synchronized (W1.f48276c) {
                try {
                    if (f48467e == null) {
                        f48467e = new o2[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48467e;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final o2 clone() {
        try {
            return (o2) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void a(R1 r12) {
        String str = this.f48468c;
        if (str != null && !str.equals("")) {
            r12.c(1, this.f48468c);
        }
        String str2 = this.f48469d;
        if (str2 != null && !str2.equals("")) {
            r12.c(2, this.f48469d);
        }
        super.a(r12);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int d10 = super.d();
        String str = this.f48468c;
        if (str != null && !str.equals("")) {
            d10 += R1.h(1, this.f48468c);
        }
        String str2 = this.f48469d;
        return (str2 == null || str2.equals("")) ? d10 : d10 + R1.h(2, this.f48469d);
    }

    public final /* synthetic */ X1 e() {
        return (o2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        String str = this.f48468c;
        if (str == null) {
            if (o2Var.f48468c != null) {
                return false;
            }
        } else if (!str.equals(o2Var.f48468c)) {
            return false;
        }
        String str2 = this.f48469d;
        if (str2 == null) {
            if (o2Var.f48469d != null) {
                return false;
            }
        } else if (!str2.equals(o2Var.f48469d)) {
            return false;
        }
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            return this.f48261b.equals(o2Var.f48261b);
        }
        U1 u13 = o2Var.f48261b;
        return u13 == null || u13.a();
    }

    public final /* synthetic */ T1 f() {
        return (o2) clone();
    }

    public final int hashCode() {
        int hashCode = (o2.class.getName().hashCode() + 527) * 31;
        String str = this.f48468c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48469d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            i10 = this.f48261b.hashCode();
        }
        return hashCode3 + i10;
    }
}
