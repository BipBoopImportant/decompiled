package Cb;

import com.google.crypto.tink.shaded.protobuf.C9518a;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9526i;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import com.google.crypto.tink.shaded.protobuf.C9541y;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.T;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: Cb.i  reason: case insensitive filesystem */
public final class C9059i extends C9541y<C9059i, b> implements T {
    /* access modifiers changed from: private */
    public static final C9059i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile a0<C9059i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C9525h keyValue_ = C9525h.f67987b;
    private C9061k params_;
    private int version_;

    /* renamed from: Cb.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58947a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.y$f[] r0 = com.google.crypto.tink.shaded.protobuf.C9541y.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58947a = r0
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f58947a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cb.C9059i.a.<clinit>():void");
        }
    }

    /* renamed from: Cb.i$b */
    public static final class b extends C9541y.a<C9059i, b> implements T {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ C9518a.C1175a c(C9518a aVar) {
            return super.c((C9541y) aVar);
        }

        public /* bridge */ /* synthetic */ S.a c2(C9526i iVar, C9533p pVar) {
            return super.c2(iVar, pVar);
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        public /* bridge */ /* synthetic */ S g() {
            return super.g();
        }

        public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ S q() {
            return super.q();
        }

        public b w(C9525h hVar) {
            l();
            ((C9059i) this.f68136b).Z(hVar);
            return this;
        }

        public b y(C9061k kVar) {
            l();
            ((C9059i) this.f68136b).a0(kVar);
            return this;
        }

        public b z(int i10) {
            l();
            ((C9059i) this.f68136b).b0(i10);
            return this;
        }

        public /* bridge */ /* synthetic */ S.a z2(S s10) {
            return super.z2(s10);
        }

        private b() {
            super(C9059i.DEFAULT_INSTANCE);
        }
    }

    static {
        C9059i iVar = new C9059i();
        DEFAULT_INSTANCE = iVar;
        C9541y.N(C9059i.class, iVar);
    }

    private C9059i() {
    }

    public static b X() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C9059i Y(C9525h hVar, C9533p pVar) {
        return (C9059i) C9541y.H(DEFAULT_INSTANCE, hVar, pVar);
    }

    /* access modifiers changed from: private */
    public void Z(C9525h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* access modifiers changed from: private */
    public void a0(C9061k kVar) {
        kVar.getClass();
        this.params_ = kVar;
    }

    /* access modifiers changed from: private */
    public void b0(int i10) {
        this.version_ = i10;
    }

    public C9525h U() {
        return this.keyValue_;
    }

    public C9061k V() {
        C9061k kVar = this.params_;
        return kVar == null ? C9061k.S() : kVar;
    }

    public int W() {
        return this.version_;
    }

    public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public /* bridge */ /* synthetic */ S.a newBuilderForType() {
        return super.newBuilderForType();
    }

    /* access modifiers changed from: protected */
    public final Object s(C9541y.f fVar, Object obj, Object obj2) {
        switch (a.f58947a[fVar.ordinal()]) {
            case 1:
                return new C9059i();
            case 2:
                return new b((a) null);
            case 3:
                return C9541y.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C9059i> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C9059i.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new C9541y.b<>(DEFAULT_INSTANCE);
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

    public /* bridge */ /* synthetic */ S.a toBuilder() {
        return super.toBuilder();
    }
}
