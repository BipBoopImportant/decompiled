package d9;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

/* renamed from: d9.A  reason: case insensitive filesystem */
public final class C7753A extends GeneratedMessageLite<C7753A, a> implements T {
    public static final int ASSET_HASHES_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C7753A DEFAULT_INSTANCE;
    private static volatile a0<C7753A> PARSER;
    private C9592z.i<C7779z> assetHashes_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: d9.A$a */
    public static final class a extends GeneratedMessageLite.a<C7753A, a> implements T {
        private a() {
            super(C7753A.DEFAULT_INSTANCE);
        }

        public a E(Iterable<? extends C7779z> iterable) {
            u();
            ((C7753A) this.f69206b).j(iterable);
            return this;
        }

        public List<C7779z> G() {
            return Collections.unmodifiableList(((C7753A) this.f69206b).l());
        }
    }

    static {
        C7753A a10 = new C7753A();
        DEFAULT_INSTANCE = a10;
        GeneratedMessageLite.registerDefaultInstance(C7753A.class, a10);
    }

    private C7753A() {
    }

    /* access modifiers changed from: private */
    public void j(Iterable<? extends C7779z> iterable) {
        k();
        C9568a.addAll(iterable, this.assetHashes_);
    }

    private void k() {
        C9592z.i<C7779z> iVar = this.assetHashes_;
        if (!iVar.u()) {
            this.assetHashes_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a m() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new C7753A();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assetHashes_", C7779z.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7753A> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7753A.class) {
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

    public List<C7779z> l() {
        return this.assetHashes_;
    }
}
