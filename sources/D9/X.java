package d9;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

public final class X extends GeneratedMessageLite<X, a> implements T {
    /* access modifiers changed from: private */
    public static final X DEFAULT_INSTANCE;
    private static volatile a0<X> PARSER = null;
    public static final int UNIX_TIMESTAMPS_MS_FIELD_NUMBER = 1;
    public static final int X_POSITIONS_FIELD_NUMBER = 2;
    public static final int Y_POSITIONS_FIELD_NUMBER = 3;
    private int unixTimestampsMsMemoizedSerializedSize = -1;
    private C9592z.h unixTimestampsMs_ = GeneratedMessageLite.emptyLongList();
    private int xPositionsMemoizedSerializedSize = -1;
    private C9592z.g xPositions_ = GeneratedMessageLite.emptyIntList();
    private int yPositionsMemoizedSerializedSize = -1;
    private C9592z.g yPositions_ = GeneratedMessageLite.emptyIntList();

    public static final class a extends GeneratedMessageLite.a<X, a> implements T {
        private a() {
            super(X.DEFAULT_INSTANCE);
        }

        public a E(Iterable<? extends Long> iterable) {
            u();
            ((X) this.f69206b).l(iterable);
            return this;
        }

        public a G(Iterable<? extends Integer> iterable) {
            u();
            ((X) this.f69206b).m(iterable);
            return this;
        }

        public a H(Iterable<? extends Integer> iterable) {
            u();
            ((X) this.f69206b).n(iterable);
            return this;
        }

        public List<Long> I() {
            return Collections.unmodifiableList(((X) this.f69206b).s());
        }

        public List<Integer> K() {
            return Collections.unmodifiableList(((X) this.f69206b).t());
        }

        public List<Integer> L() {
            return Collections.unmodifiableList(((X) this.f69206b).u());
        }
    }

    static {
        X x10 = new X();
        DEFAULT_INSTANCE = x10;
        GeneratedMessageLite.registerDefaultInstance(X.class, x10);
    }

    private X() {
    }

    /* access modifiers changed from: private */
    public void l(Iterable<? extends Long> iterable) {
        o();
        C9568a.addAll(iterable, this.unixTimestampsMs_);
    }

    /* access modifiers changed from: private */
    public void m(Iterable<? extends Integer> iterable) {
        p();
        C9568a.addAll(iterable, this.xPositions_);
    }

    /* access modifiers changed from: private */
    public void n(Iterable<? extends Integer> iterable) {
        r();
        C9568a.addAll(iterable, this.yPositions_);
    }

    private void o() {
        C9592z.h hVar = this.unixTimestampsMs_;
        if (!hVar.u()) {
            this.unixTimestampsMs_ = GeneratedMessageLite.mutableCopy(hVar);
        }
    }

    private void p() {
        C9592z.g gVar = this.xPositions_;
        if (!gVar.u()) {
            this.xPositions_ = GeneratedMessageLite.mutableCopy(gVar);
        }
    }

    private void r() {
        C9592z.g gVar = this.yPositions_;
        if (!gVar.u()) {
            this.yPositions_ = GeneratedMessageLite.mutableCopy(gVar);
        }
    }

    public static a v() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new X();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001&\u0002/\u0003/", new Object[]{"unixTimestampsMs_", "xPositions_", "yPositions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<X> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (X.class) {
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

    public List<Long> s() {
        return this.unixTimestampsMs_;
    }

    public List<Integer> t() {
        return this.xPositions_;
    }

    public List<Integer> u() {
        return this.yPositions_;
    }
}
