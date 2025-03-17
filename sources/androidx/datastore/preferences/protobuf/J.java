package androidx.datastore.preferences.protobuf;

final class J implements i0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Q f21252b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Q f21253a;

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
        static final /* synthetic */ int[] f21254a;

        static {
            int[] iArr = new int[c0.values().length];
            f21254a = iArr;
            try {
                iArr[c0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements Q {

        /* renamed from: a  reason: collision with root package name */
        private Q[] f21255a;

        c(Q... qArr) {
            this.f21255a = qArr;
        }

        public P a(Class<?> cls) {
            for (Q q10 : this.f21255a) {
                if (q10.b(cls)) {
                    return q10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (Q b10 : this.f21255a) {
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
        return b.f21254a[p10.c().ordinal()] != 1;
    }

    private static Q c() {
        return new c(C5169w.c(), d());
    }

    private static Q d() {
        if (d0.f21299d) {
            return f21252b;
        }
        try {
            return (Q) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f21252b;
        }
    }

    private static <T> h0<T> e(Class<T> cls, P p10) {
        C5163p<?> pVar = null;
        if (f(cls)) {
            X b10 = Z.b();
            F b11 = H.b();
            o0<?, ?> L10 = j0.L();
            if (b(p10)) {
                pVar = r.b();
            }
            return V.O(cls, p10, b10, b11, L10, pVar, O.b());
        }
        X a10 = Z.a();
        F a11 = H.a();
        o0<?, ?> K10 = j0.K();
        if (b(p10)) {
            pVar = r.a();
        }
        return V.O(cls, p10, a10, a11, K10, pVar, O.a());
    }

    private static boolean f(Class<?> cls) {
        return d0.f21299d || C5170x.class.isAssignableFrom(cls);
    }

    public <T> h0<T> a(Class<T> cls) {
        j0.H(cls);
        P a10 = this.f21253a.a(cls);
        return a10.a() ? f(cls) ? W.l(j0.L(), r.b(), a10.b()) : W.l(j0.K(), r.a(), a10.b()) : e(cls, a10);
    }

    private J(Q q10) {
        this.f21253a = (Q) C5172z.b(q10, "messageInfoFactory");
    }
}
