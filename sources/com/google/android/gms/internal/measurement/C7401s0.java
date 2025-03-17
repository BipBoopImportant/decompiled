package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s0  reason: case insensitive filesystem */
public abstract class C7401s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C7401s0 f49060a;

    /* renamed from: b  reason: collision with root package name */
    static final C7401s0 f49061b;

    static {
        C7393r0 b10 = new C7317i0().e("").c(false).b(C7417u0.ALL_CHECKS);
        C7409t0 t0Var = C7409t0.READ_AND_WRITE;
        f49060a = b10.a(t0Var).d();
        f49061b = new C7317i0().e("").c(false).b(C7417u0.NO_CHECKS).a(t0Var).d();
        new C7317i0().e("").c(false).b(C7417u0.SKIP_COMPLIANCE_CHECK).a(t0Var).d();
    }

    public abstract C7308h0 a();

    public abstract C7299g0 b();

    public abstract C7417u0 c();

    public abstract C7409t0 d();

    public abstract String e();

    public abstract boolean f();
}
