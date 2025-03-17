package V2;

import androidx.datastore.preferences.protobuf.C5170x;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.t0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f extends C5170x<f, a> implements T {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile a0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L<String, h> preferences_ = L.d();

    public static final class a extends C5170x.a<f, a> implements T {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a y(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            m();
            ((f) this.f21457b).P().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, h> f14609a = K.d(t0.b.STRING, "", t0.b.MESSAGE, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        C5170x.K(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public Map<String, h> P() {
        return R();
    }

    private L<String, h> R() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    private L<String, h> S() {
        return this.preferences_;
    }

    public static a T() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f V(InputStream inputStream) {
        return (f) C5170x.I(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> Q() {
        return Collections.unmodifiableMap(S());
    }

    /* access modifiers changed from: protected */
    public final Object t(C5170x.f fVar, Object obj, Object obj2) {
        switch (e.f14608a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a((e) null);
            case 3:
                return C5170x.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f14609a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<f> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (f.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new C5170x.b<>(DEFAULT_INSTANCE);
                                PARSER = a0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return a0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
