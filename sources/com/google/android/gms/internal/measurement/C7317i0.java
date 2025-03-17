package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0  reason: case insensitive filesystem */
final class C7317i0 extends C7393r0 {

    /* renamed from: a  reason: collision with root package name */
    private String f48943a;

    /* renamed from: b  reason: collision with root package name */
    private C7417u0 f48944b;

    /* renamed from: c  reason: collision with root package name */
    private C7409t0 f48945c;

    /* renamed from: d  reason: collision with root package name */
    private byte f48946d;

    C7317i0() {
    }

    public final C7393r0 a(C7409t0 t0Var) {
        if (t0Var != null) {
            this.f48945c = t0Var;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    /* access modifiers changed from: package-private */
    public final C7393r0 b(C7417u0 u0Var) {
        if (u0Var != null) {
            this.f48944b = u0Var;
            return this;
        }
        throw new NullPointerException("Null fileChecks");
    }

    public final C7393r0 c(boolean z10) {
        this.f48946d = (byte) (this.f48946d | 1);
        return this;
    }

    public final C7401s0 d() {
        if (this.f48946d == 1 && this.f48943a != null && this.f48944b != null && this.f48945c != null) {
            return new C7326j0(this.f48943a, false, this.f48944b, (C7308h0) null, (C7299g0) null, this.f48945c, (C7344l0) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f48943a == null) {
            sb2.append(" fileOwner");
        }
        if ((1 & this.f48946d) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f48944b == null) {
            sb2.append(" fileChecks");
        }
        if (this.f48945c == null) {
            sb2.append(" filePurpose");
        }
        String valueOf = String.valueOf(sb2);
        throw new IllegalStateException("Missing required properties:" + valueOf);
    }

    public final C7393r0 e(String str) {
        this.f48943a = str;
        return this;
    }
}
