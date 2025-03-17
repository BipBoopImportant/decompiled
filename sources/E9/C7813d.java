package e9;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

/* renamed from: e9.d  reason: case insensitive filesystem */
public final class C7813d extends GeneratedMessageLite<C7813d, a> implements T {
    public static final int APP_VERSION_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C7813d DEFAULT_INSTANCE;
    private static volatile a0<C7813d> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    public static final int RESOURCES_FIELD_NUMBER = 6;
    public static final int SDK_METADATA_FIELD_NUMBER = 5;
    public static final int SDK_VERSION_FIELD_NUMBER = 3;
    private String appVersion_ = "";
    private int platform_;
    private int projectId_;
    private C9592z.i<C7812c> resources_ = GeneratedMessageLite.emptyProtobufList();
    private String sdkMetadata_ = "";
    private String sdkVersion_ = "";

    /* renamed from: e9.d$a */
    public static final class a extends GeneratedMessageLite.a<C7813d, a> implements T {
        private a() {
            super(C7813d.DEFAULT_INSTANCE);
        }

        public a E(Iterable<? extends C7812c> iterable) {
            u();
            ((C7813d) this.f69206b).n(iterable);
            return this;
        }

        public List<C7812c> G() {
            return Collections.unmodifiableList(((C7813d) this.f69206b).p());
        }

        public a H(String str) {
            u();
            ((C7813d) this.f69206b).s(str);
            return this;
        }

        public a I(C7811b bVar) {
            u();
            ((C7813d) this.f69206b).t(bVar);
            return this;
        }

        public a K(int i10) {
            u();
            ((C7813d) this.f69206b).u(i10);
            return this;
        }

        public a L(String str) {
            u();
            ((C7813d) this.f69206b).v(str);
            return this;
        }
    }

    static {
        C7813d dVar = new C7813d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.registerDefaultInstance(C7813d.class, dVar);
    }

    private C7813d() {
    }

    /* access modifiers changed from: private */
    public void n(Iterable<? extends C7812c> iterable) {
        o();
        C9568a.addAll(iterable, this.resources_);
    }

    private void o() {
        C9592z.i<C7812c> iVar = this.resources_;
        if (!iVar.u()) {
            this.resources_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void s(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void t(C7811b bVar) {
        this.platform_ = bVar.d();
    }

    /* access modifiers changed from: private */
    public void u(int i10) {
        this.projectId_ = i10;
    }

    /* access modifiers changed from: private */
    public void v(String str) {
        str.getClass();
        this.sdkVersion_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7810a.f50894a[fVar.ordinal()]) {
            case 1:
                return new C7813d();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"projectId_", "platform_", "sdkVersion_", "appVersion_", "sdkMetadata_", "resources_", C7812c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7813d> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7813d.class) {
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

    public List<C7812c> p() {
        return this.resources_;
    }
}
