package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j0  reason: case insensitive filesystem */
final class C7326j0 extends C7401s0 {

    /* renamed from: c  reason: collision with root package name */
    private final String f48960c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48961d;

    /* renamed from: e  reason: collision with root package name */
    private final C7417u0 f48962e;

    /* renamed from: f  reason: collision with root package name */
    private final C7409t0 f48963f;

    /* synthetic */ C7326j0(String str, boolean z10, C7417u0 u0Var, C7308h0 h0Var, C7299g0 g0Var, C7409t0 t0Var, C7344l0 l0Var) {
        this(str, false, u0Var, (C7308h0) null, (C7299g0) null, t0Var);
    }

    public final C7308h0 a() {
        return null;
    }

    public final C7299g0 b() {
        return null;
    }

    public final C7417u0 c() {
        return this.f48962e;
    }

    public final C7409t0 d() {
        return this.f48963f;
    }

    public final String e() {
        return this.f48960c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7401s0) {
            C7401s0 s0Var = (C7401s0) obj;
            if (this.f48960c.equals(s0Var.e()) && this.f48961d == s0Var.f() && this.f48962e.equals(s0Var.c())) {
                s0Var.a();
                s0Var.b();
                if (this.f48963f.equals(s0Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f48961d;
    }

    public final int hashCode() {
        return ((((((this.f48960c.hashCode() ^ 1000003) * 1000003) ^ (this.f48961d ? 1231 : 1237)) * 1000003) ^ this.f48962e.hashCode()) * 583896283) ^ this.f48963f.hashCode();
    }

    public final String toString() {
        String str = this.f48960c;
        boolean z10 = this.f48961d;
        String valueOf = String.valueOf(this.f48962e);
        String valueOf2 = String.valueOf(this.f48963f);
        return "FileComplianceOptions{fileOwner=" + str + ", hasDifferentDmaOwner=" + z10 + ", fileChecks=" + valueOf + ", dataForwardingNotAllowedResolver=" + "null" + ", multipleProductIdGroupsResolver=" + "null" + ", filePurpose=" + valueOf2 + "}";
    }

    private C7326j0(String str, boolean z10, C7417u0 u0Var, C7308h0 h0Var, C7299g0 g0Var, C7409t0 t0Var) {
        this.f48960c = str;
        this.f48961d = z10;
        this.f48962e = u0Var;
        this.f48963f = t0Var;
    }
}
