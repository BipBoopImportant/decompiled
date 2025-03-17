package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

public final class O extends GeneratedMessageLite<O, a> implements T {
    /* access modifiers changed from: private */
    public static final O DEFAULT_INSTANCE;
    private static volatile a0<O> PARSER = null;
    public static final int URLS_FIELD_NUMBER = 1;
    private C9592z.i<String> urls_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.a<O, a> implements T {
        private a() {
            super(O.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((O) this.f69206b).j(str);
            return this;
        }

        public List<String> G() {
            return Collections.unmodifiableList(((O) this.f69206b).l());
        }
    }

    static {
        O o10 = new O();
        DEFAULT_INSTANCE = o10;
        GeneratedMessageLite.registerDefaultInstance(O.class, o10);
    }

    private O() {
    }

    /* access modifiers changed from: private */
    public void j(String str) {
        str.getClass();
        k();
        this.urls_.add(str);
    }

    private void k() {
        C9592z.i<String> iVar = this.urls_;
        if (!iVar.u()) {
            this.urls_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a m() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new O();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"urls_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<O> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (O.class) {
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

    public List<String> l() {
        return this.urls_;
    }
}
