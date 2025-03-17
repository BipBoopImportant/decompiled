package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

public final class Y extends GeneratedMessageLite<Y, a> implements T {
    public static final int CHILDREN_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Y DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 5;
    private static volatile a0<Y> PARSER = null;
    public static final int RECORDING_ID_FIELD_NUMBER = 2;
    public static final int STYLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C9592z.i<Y> children_ = GeneratedMessageLite.emptyProtobufList();
    private int format_;
    private I metadata_;
    private long recordingId_;
    private b0 style_;

    public static final class a extends GeneratedMessageLite.a<Y, a> implements T {
        private a() {
            super(Y.DEFAULT_INSTANCE);
        }

        public a E(Y y10) {
            u();
            ((Y) this.f69206b).n(y10);
            return this;
        }

        public List<Y> G() {
            return Collections.unmodifiableList(((Y) this.f69206b).p());
        }

        public a H(b bVar) {
            u();
            ((Y) this.f69206b).s(bVar);
            return this;
        }

        public a I(I i10) {
            u();
            ((Y) this.f69206b).t(i10);
            return this;
        }

        public a K(long j10) {
            u();
            ((Y) this.f69206b).u(j10);
            return this;
        }

        public a L(b0 b0Var) {
            u();
            ((Y) this.f69206b).v(b0Var);
            return this;
        }
    }

    public enum b implements C9592z.c {
        FORMAT_UNSPECIFIED(0),
        FORMAT_WEB_ELEMENT(1),
        FORMAT_NATIVE_VIEW(2),
        FORMAT_WEB_VIEW_CONTAINER(3),
        UNRECOGNIZED(-1);
        
        public static final int FORMAT_NATIVE_VIEW_VALUE = 2;
        public static final int FORMAT_UNSPECIFIED_VALUE = 0;
        public static final int FORMAT_WEB_ELEMENT_VALUE = 1;
        public static final int FORMAT_WEB_VIEW_CONTAINER_VALUE = 3;
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
                return FORMAT_UNSPECIFIED;
            }
            if (i10 == 1) {
                return FORMAT_WEB_ELEMENT;
            }
            if (i10 == 2) {
                return FORMAT_NATIVE_VIEW;
            }
            if (i10 != 3) {
                return null;
            }
            return FORMAT_WEB_VIEW_CONTAINER;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Y y10 = new Y();
        DEFAULT_INSTANCE = y10;
        GeneratedMessageLite.registerDefaultInstance(Y.class, y10);
    }

    private Y() {
    }

    /* access modifiers changed from: private */
    public void n(Y y10) {
        y10.getClass();
        o();
        this.children_.add(y10);
    }

    private void o() {
        C9592z.i<Y> iVar = this.children_;
        if (!iVar.u()) {
            this.children_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void s(b bVar) {
        this.format_ = bVar.d();
    }

    /* access modifiers changed from: private */
    public void t(I i10) {
        i10.getClass();
        this.metadata_ = i10;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void u(long j10) {
        this.recordingId_ = j10;
    }

    /* access modifiers changed from: private */
    public void v(b0 b0Var) {
        b0Var.getClass();
        this.style_ = b0Var;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new Y();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0010\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001", new Object[]{"bitField0_", "format_", "recordingId_", "style_", "children_", Y.class, "metadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<Y> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (Y.class) {
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

    public List<Y> p() {
        return this.children_;
    }
}
