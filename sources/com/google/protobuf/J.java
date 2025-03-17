package com.google.protobuf;

final class J implements i0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Q f69221b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Q f69222a;

    class a implements Q {
        a() {
        }

        public P a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69223a;

        static {
            int[] iArr = new int[c0.values().length];
            f69223a = iArr;
            try {
                iArr[c0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements Q {

        /* renamed from: a  reason: collision with root package name */
        private Q[] f69224a;

        c(Q... qArr) {
            this.f69224a = qArr;
        }

        public P a(Class<?> cls) {
            for (Q q10 : this.f69224a) {
                if (q10.b(cls)) {
                    return q10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (Q b10 : this.f69224a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public J() {
        this(c());
    }

    private static boolean b(P p10) {
        return b.f69223a[p10.c().ordinal()] != 1;
    }

    private static Q c() {
        return new c(C9590x.c(), d());
    }

    private static Q d() {
        try {
            return (Q) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f69221b;
        }
    }

    private static <T> h0<T> e(Class<T> cls, P p10) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (b(p10)) {
                return V.T(cls, p10, Z.b(), H.b(), j0.L(), C9585s.b(), O.b());
            }
            return V.T(cls, p10, Z.b(), H.b(), j0.L(), (C9584q<?>) null, O.b());
        } else if (b(p10)) {
            return V.T(cls, p10, Z.a(), H.a(), j0.K(), C9585s.a(), O.a());
        } else {
            return V.T(cls, p10, Z.a(), H.a(), j0.K(), (C9584q<?>) null, O.a());
        }
    }

    public <T> h0<T> a(Class<T> cls) {
        j0.H(cls);
        P a10 = this.f69222a.a(cls);
        return a10.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? W.m(j0.L(), C9585s.b(), a10.b()) : W.m(j0.K(), C9585s.a(), a10.b()) : e(cls, a10);
    }

    private J(Q q10) {
        this.f69222a = (Q) C9592z.b(q10, "messageInfoFactory");
    }
}
