package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

/* renamed from: d9.z  reason: case insensitive filesystem */
public final class C7779z extends GeneratedMessageLite<C7779z, a> implements T {
    public static final int ASSET_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C7779z DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    private static volatile a0<C7779z> PARSER;
    private String assetId_ = "";
    private String hash_ = "";

    /* renamed from: d9.z$a */
    public static final class a extends GeneratedMessageLite.a<C7779z, a> implements T {
        private a() {
            super(C7779z.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((C7779z) this.f69206b).l(str);
            return this;
        }

        public a G(String str) {
            u();
            ((C7779z) this.f69206b).m(str);
            return this;
        }
    }

    static {
        C7779z zVar = new C7779z();
        DEFAULT_INSTANCE = zVar;
        GeneratedMessageLite.registerDefaultInstance(C7779z.class, zVar);
    }

    private C7779z() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(String str) {
        str.getClass();
        this.assetId_ = str;
    }

    /* access modifiers changed from: private */
    public void m(String str) {
        str.getClass();
        this.hash_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new C7779z();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"assetId_", "hash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7779z> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7779z.class) {
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
