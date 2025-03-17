package V2;

import androidx.datastore.preferences.protobuf.C5148a;
import androidx.datastore.preferences.protobuf.C5170x;
import androidx.datastore.preferences.protobuf.C5172z;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.a0;
import java.util.List;

public final class g extends C5170x<g, a> implements T {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    private static volatile a0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C5172z.i<String> strings_ = C5170x.u();

    public static final class a extends C5170x.a<g, a> implements T {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a y(Iterable<String> iterable) {
            m();
            ((g) this.f21457b).P(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        C5170x.K(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void P(Iterable<String> iterable) {
        Q();
        C5148a.b(iterable, this.strings_);
    }

    private void Q() {
        C5172z.i<String> iVar = this.strings_;
        if (!iVar.u()) {
            this.strings_ = C5170x.E(iVar);
        }
    }

    public static g R() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public List<String> S() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    public final Object t(C5170x.f fVar, Object obj, Object obj2) {
        switch (e.f14608a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((e) null);
            case 3:
                return C5170x.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<g> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (g.class) {
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
