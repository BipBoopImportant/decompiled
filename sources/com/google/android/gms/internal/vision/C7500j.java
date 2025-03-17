package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.j  reason: case insensitive filesystem */
public final class C7500j extends Q0<C7500j, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7500j zzf;
    private static volatile M1<C7500j> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    public static final class a extends Q0.b<C7500j, a> implements C1 {
        private a() {
            super(C7500j.zzf);
        }

        public final a v(String str) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7500j) this.f49244b).z(str);
            return this;
        }

        public final a w(String str) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7500j) this.f49244b).C(str);
            return this;
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7500j jVar = new C7500j();
        zzf = jVar;
        Q0.q(C7500j.class, jVar);
    }

    private C7500j() {
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a x() {
        return (a) zzf.t();
    }

    /* access modifiers changed from: private */
    public final void z(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.j>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7500j> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7500j();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                M1<C7500j> m13 = zzg;
                M1<C7500j> m14 = m13;
                if (m13 == null) {
                    synchronized (C7500j.class) {
                        try {
                            M1<C7500j> m15 = zzg;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzf);
                                zzg = aVar;
                                m12 = aVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    m14 = m12;
                }
                return m14;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
