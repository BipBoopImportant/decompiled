package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class G extends GeneratedMessageLite<G, a> implements T {
    /* access modifiers changed from: private */
    public static final G DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 2;
    private static volatile a0<G> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int SCHEMA_VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C9592z.i<F> events_ = GeneratedMessageLite.emptyProtobufList();
    private int position_;
    private String schemaVersion_ = "";

    public static final class a extends GeneratedMessageLite.a<G, a> implements T {
        private a() {
            super(G.DEFAULT_INSTANCE);
        }

        public a E(F f10) {
            u();
            ((G) this.f69206b).l(f10);
            return this;
        }

        public a G(b bVar) {
            u();
            ((G) this.f69206b).o(bVar);
            return this;
        }

        public a H(String str) {
            u();
            ((G) this.f69206b).p(str);
            return this;
        }
    }

    public enum b implements C9592z.c {
        POSITION_ABSOLUTE(0),
        POSITION_RELATIVE(1),
        UNRECOGNIZED(-1);
        
        public static final int POSITION_ABSOLUTE_VALUE = 0;
        public static final int POSITION_RELATIVE_VALUE = 1;
        private static final C9592z.d<b> internalValueMap = null;
        private final int value;

        public class a implements C9592z.d<b> {
            /* renamed from: b */
            public b a(int i10) {
                return b.b(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return POSITION_ABSOLUTE;
            }
            if (i10 != 1) {
                return null;
            }
            return POSITION_RELATIVE;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        G g10 = new G();
        DEFAULT_INSTANCE = g10;
        GeneratedMessageLite.registerDefaultInstance(G.class, g10);
    }

    private G() {
    }

    /* access modifiers changed from: private */
    public void l(F f10) {
        f10.getClass();
        m();
        this.events_.add(f10);
    }

    private void m() {
        C9592z.i<F> iVar = this.events_;
        if (!iVar.u()) {
            this.events_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void o(b bVar) {
        this.position_ = bVar.d();
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void p(String str) {
        str.getClass();
        this.schemaVersion_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဌ\u0000", new Object[]{"bitField0_", "schemaVersion_", "events_", F.class, "position_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<G> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (G.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
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
