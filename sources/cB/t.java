package Cb;

import com.google.crypto.tink.shaded.protobuf.C9518a;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9526i;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import com.google.crypto.tink.shaded.protobuf.C9541y;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.T;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.io.InputStream;

public final class t extends C9541y<t, b> implements T {
    /* access modifiers changed from: private */
    public static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile a0<t> PARSER;
    private C9525h encryptedKeyset_ = C9525h.f67987b;
    private D keysetInfo_;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58958a;

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
                f58958a = r0
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f58958a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.C9541y.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cb.t.a.<clinit>():void");
        }
    }

    public static final class b extends C9541y.a<t, b> implements T {
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
            ((t) this.f68136b).W(hVar);
            return this;
        }

        public b y(D d10) {
            l();
            ((t) this.f68136b).X(d10);
            return this;
        }

        public /* bridge */ /* synthetic */ S.a z2(S s10) {
            return super.z2(s10);
        }

        private b() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        C9541y.N(t.class, tVar);
    }

    private t() {
    }

    public static b U() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static t V(InputStream inputStream, C9533p pVar) {
        return (t) C9541y.I(DEFAULT_INSTANCE, inputStream, pVar);
    }

    /* access modifiers changed from: private */
    public void W(C9525h hVar) {
        hVar.getClass();
        this.encryptedKeyset_ = hVar;
    }

    /* access modifiers changed from: private */
    public void X(D d10) {
        d10.getClass();
        this.keysetInfo_ = d10;
    }

    public C9525h T() {
        return this.encryptedKeyset_;
    }

    public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public /* bridge */ /* synthetic */ S.a newBuilderForType() {
        return super.newBuilderForType();
    }

    /* access modifiers changed from: protected */
    public final Object s(C9541y.f fVar, Object obj, Object obj2) {
        switch (a.f58958a[fVar.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new b((a) null);
            case 3:
                return C9541y.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<t> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (t.class) {
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
