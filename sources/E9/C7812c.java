package e9;

import com.google.protobuf.C9575h;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

/* renamed from: e9.c  reason: case insensitive filesystem */
public final class C7812c extends GeneratedMessageLite<C7812c, a> implements T {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final C7812c DEFAULT_INSTANCE;
    public static final int ENCODING_TYPE_FIELD_NUMBER = 4;
    public static final int FORMAT_FIELD_NUMBER = 3;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile a0<C7812c> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    private String contentType_ = "";
    private int encodingType_;
    private int format_;
    private String hash_ = "";
    private C9575h resource_ = C9575h.f69286b;

    /* renamed from: e9.c$a */
    public static final class a extends GeneratedMessageLite.a<C7812c, a> implements T {
        private a() {
            super(C7812c.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((C7812c) this.f69206b).m(str);
            return this;
        }

        public a G(String str) {
            u();
            ((C7812c) this.f69206b).n(str);
            return this;
        }

        public a H(C9575h hVar) {
            u();
            ((C7812c) this.f69206b).o(hVar);
            return this;
        }
    }

    static {
        C7812c cVar = new C7812c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(C7812c.class, cVar);
    }

    private C7812c() {
    }

    public static a l() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void m(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* access modifiers changed from: private */
    public void n(String str) {
        str.getClass();
        this.hash_ = str;
    }

    /* access modifiers changed from: private */
    public void o(C9575h hVar) {
        hVar.getClass();
        this.resource_ = hVar;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7810a.f50894a[fVar.ordinal()]) {
            case 1:
                return new C7812c();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f\u0004\f\u0005Ȉ", new Object[]{"hash_", "resource_", "format_", "encodingType_", "contentType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7812c> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7812c.class) {
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
