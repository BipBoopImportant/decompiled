package com.google.crypto.tink.shaded.protobuf;

final class J implements i0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Q f67931b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Q f67932a;

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

    private static class b implements Q {

        /* renamed from: a  reason: collision with root package name */
        private Q[] f67933a;

        b(Q... qArr) {
            this.f67933a = qArr;
        }

        public P a(Class<?> cls) {
            for (Q q10 : this.f67933a) {
                if (q10.b(cls)) {
                    return q10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (Q b10 : this.f67933a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public J() {
        this(b());
    }

    private static Q b() {
        return new b(C9540x.c(), c());
    }

    private static Q c() {
        try {
            return (Q) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f67931b;
        }
    }

    private static boolean d(P p10) {
        return p10.c() == c0.PROTO2;
    }

    private static <T> h0<T> e(Class<T> cls, P p10) {
        if (C9541y.class.isAssignableFrom(cls)) {
            if (d(p10)) {
                return V.U(cls, p10, Z.b(), H.b(), j0.M(), C9535s.b(), O.b());
            }
            return V.U(cls, p10, Z.b(), H.b(), j0.M(), (C9534q<?>) null, O.b());
        } else if (d(p10)) {
            return V.U(cls, p10, Z.a(), H.a(), j0.H(), C9535s.a(), O.a());
        } else {
            return V.U(cls, p10, Z.a(), H.a(), j0.I(), (C9534q<?>) null, O.a());
        }
    }

    public <T> h0<T> a(Class<T> cls) {
        j0.J(cls);
        P a10 = this.f67932a.a(cls);
        return a10.a() ? C9541y.class.isAssignableFrom(cls) ? W.m(j0.M(), C9535s.b(), a10.b()) : W.m(j0.H(), C9535s.a(), a10.b()) : e(cls, a10);
    }

    private J(Q q10) {
        this.f67932a = (Q) A.b(q10, "messageInfoFactory");
    }
}
