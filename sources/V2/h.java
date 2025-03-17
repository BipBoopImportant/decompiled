package V2;

import V2.g;
import androidx.datastore.preferences.protobuf.C5154g;
import androidx.datastore.preferences.protobuf.C5170x;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.a0;

public final class h extends C5170x<h, a> implements T {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile a0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends C5170x.a<h, a> implements T {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(double d10) {
            m();
            ((h) this.f21457b).k0(d10);
            return this;
        }

        public a C(float f10) {
            m();
            ((h) this.f21457b).l0(f10);
            return this;
        }

        public a D(int i10) {
            m();
            ((h) this.f21457b).m0(i10);
            return this;
        }

        public a E(long j10) {
            m();
            ((h) this.f21457b).n0(j10);
            return this;
        }

        public a G(String str) {
            m();
            ((h) this.f21457b).o0(str);
            return this;
        }

        public a H(g.a aVar) {
            m();
            ((h) this.f21457b).p0((g) aVar.g());
            return this;
        }

        public a y(boolean z10) {
            m();
            ((h) this.f21457b).i0(z10);
            return this;
        }

        public a z(C5154g gVar) {
            m();
            ((h) this.f21457b).j0(gVar);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        C5170x.K(h.class, hVar);
    }

    private h() {
    }

    public static h Z() {
        return DEFAULT_INSTANCE;
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.p();
    }

    /* access modifiers changed from: private */
    public void i0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: private */
    public void j0(C5154g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    /* access modifiers changed from: private */
    public void k0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* access modifiers changed from: private */
    public void l0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* access modifiers changed from: private */
    public void m0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public void n0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void p0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public C5154g Y() {
        return this.valueCase_ == 8 ? (C5154g) this.value_ : C5154g.f21312b;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g f0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.R();
    }

    public b g0() {
        return b.b(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    public final Object t(C5170x.f fVar, Object obj, Object obj2) {
        switch (e.f14608a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((e) null);
            case 3:
                return C5170x.G(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<h> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (h.class) {
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
