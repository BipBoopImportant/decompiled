package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.r1  reason: case insensitive filesystem */
final class C7530r1 implements U1 {

    /* renamed from: b  reason: collision with root package name */
    private static final B1 f49394b = new C7528q1();

    /* renamed from: a  reason: collision with root package name */
    private final B1 f49395a;

    public C7530r1() {
        this(new C7536t1(R0.a(), a()));
    }

    private static B1 a() {
        try {
            return (B1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f49394b;
        }
    }

    private static boolean b(C7551y1 y1Var) {
        return y1Var.zza() == O1.f49236a;
    }

    public final <T> S1<T> zza(Class<T> cls) {
        T1.p(cls);
        C7551y1 zzb = this.f49395a.zzb(cls);
        Class<Q0> cls2 = Q0.class;
        if (zzb.zzb()) {
            return cls2.isAssignableFrom(cls) ? G1.f(T1.B(), F0.a(), zzb.zzc()) : G1.f(T1.f(), F0.b(), zzb.zzc());
        }
        if (cls2.isAssignableFrom(cls)) {
            if (b(zzb)) {
                return E1.l(cls, zzb, J1.b(), C7502j1.c(), T1.B(), F0.a(), C7554z1.b());
            }
            return E1.l(cls, zzb, J1.b(), C7502j1.c(), T1.B(), (E0<?>) null, C7554z1.b());
        } else if (b(zzb)) {
            return E1.l(cls, zzb, J1.a(), C7502j1.a(), T1.f(), F0.b(), C7554z1.a());
        } else {
            return E1.l(cls, zzb, J1.a(), C7502j1.a(), T1.v(), (E0<?>) null, C7554z1.a());
        }
    }

    private C7530r1(B1 b12) {
        this.f49395a = (B1) U0.f(b12, "messageInfoFactory");
    }
}
