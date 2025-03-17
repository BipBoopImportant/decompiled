package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;

final class B0 implements C7181e1 {

    /* renamed from: b  reason: collision with root package name */
    private static final L0 f48158b = new C0();

    /* renamed from: a  reason: collision with root package name */
    private final L0 f48159a;

    public B0() {
        this(new D0(C7183f0.a(), c()));
    }

    private static boolean b(K0 k02) {
        return k02.a() == C7186g0.e.f48389i;
    }

    private static L0 c() {
        try {
            return (L0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f48158b;
        }
    }

    public final <T> C7178d1<T> a(Class<T> cls) {
        C7184f1.I(cls);
        K0 zzb = this.f48159a.zzb(cls);
        Class<C7186g0> cls2 = C7186g0.class;
        if (zzb.b()) {
            return cls2.isAssignableFrom(cls) ? R0.a(C7184f1.B(), W.b(), zzb.c()) : R0.a(C7184f1.z(), W.c(), zzb.c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b10 = b(zzb);
            T0 b11 = V0.b();
            C7233w0 d10 = C7233w0.d();
            C7231v1<?, ?> B10 = C7184f1.B();
            if (b10) {
                return Q0.s(cls, zzb, b11, d10, B10, W.b(), J0.b());
            }
            return Q0.s(cls, zzb, b11, d10, B10, (T<?>) null, J0.b());
        }
        boolean b12 = b(zzb);
        T0 a10 = V0.a();
        C7233w0 c10 = C7233w0.c();
        if (b12) {
            return Q0.s(cls, zzb, a10, c10, C7184f1.z(), W.c(), J0.a());
        }
        return Q0.s(cls, zzb, a10, c10, C7184f1.A(), (T<?>) null, J0.a());
    }

    private B0(L0 l02) {
        this.f48159a = (L0) C7192i0.e(l02, "messageInfoFactory");
    }
}
