package Gc;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class m extends GeneratedMessageLite<m, b> implements T {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile a0<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private L<String, Long> counters_ = L.d();
    private L<String, String> customAttributes_ = L.d();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C9592z.i<k> perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    private C9592z.i<m> subtraces_ = GeneratedMessageLite.emptyProtobufList();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60597a;

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
                com.google.protobuf.GeneratedMessageLite$f[] r0 = com.google.protobuf.GeneratedMessageLite.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60597a = r0
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60597a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gc.m.a.<clinit>():void");
        }
    }

    public static final class b extends GeneratedMessageLite.a<m, b> implements T {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(Iterable<? extends k> iterable) {
            u();
            ((m) this.f69206b).s(iterable);
            return this;
        }

        public b G(Iterable<? extends m> iterable) {
            u();
            ((m) this.f69206b).t(iterable);
            return this;
        }

        public b H(k kVar) {
            u();
            ((m) this.f69206b).u(kVar);
            return this;
        }

        public b I(m mVar) {
            u();
            ((m) this.f69206b).v(mVar);
            return this;
        }

        public b K(Map<String, Long> map) {
            u();
            ((m) this.f69206b).E().putAll(map);
            return this;
        }

        public b L(Map<String, String> map) {
            u();
            ((m) this.f69206b).F().putAll(map);
            return this;
        }

        public b M(String str, long j10) {
            str.getClass();
            u();
            ((m) this.f69206b).E().put(str, Long.valueOf(j10));
            return this;
        }

        public b N(String str, String str2) {
            str.getClass();
            str2.getClass();
            u();
            ((m) this.f69206b).F().put(str, str2);
            return this;
        }

        public b O(long j10) {
            u();
            ((m) this.f69206b).P(j10);
            return this;
        }

        public b P(long j10) {
            u();
            ((m) this.f69206b).Q(j10);
            return this;
        }

        public b Q(String str) {
            u();
            ((m) this.f69206b).R(str);
            return this;
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, Long> f60598a = K.d(u0.b.STRING, "", u0.b.INT64, 0L);
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f60599a;

        static {
            u0.b bVar = u0.b.STRING;
            f60599a = K.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    public static m C() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, Long> E() {
        return M();
    }

    /* access modifiers changed from: private */
    public Map<String, String> F() {
        return N();
    }

    private L<String, Long> K() {
        return this.counters_;
    }

    private L<String, String> L() {
        return this.customAttributes_;
    }

    private L<String, Long> M() {
        if (!this.counters_.m()) {
            this.counters_ = this.counters_.p();
        }
        return this.counters_;
    }

    private L<String, String> N() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.p();
        }
        return this.customAttributes_;
    }

    public static b O() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void P(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void Q(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void R(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void s(Iterable<? extends k> iterable) {
        x();
        C9568a.addAll(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void t(Iterable<? extends m> iterable) {
        y();
        C9568a.addAll(iterable, this.subtraces_);
    }

    /* access modifiers changed from: private */
    public void u(k kVar) {
        kVar.getClass();
        x();
        this.perfSessions_.add(kVar);
    }

    /* access modifiers changed from: private */
    public void v(m mVar) {
        mVar.getClass();
        y();
        this.subtraces_.add(mVar);
    }

    private void x() {
        C9592z.i<k> iVar = this.perfSessions_;
        if (!iVar.u()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    private void y() {
        C9592z.i<m> iVar = this.subtraces_;
        if (!iVar.u()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public Map<String, Long> A() {
        return Collections.unmodifiableMap(K());
    }

    public Map<String, String> B() {
        return Collections.unmodifiableMap(L());
    }

    public long D() {
        return this.durationUs_;
    }

    public String G() {
        return this.name_;
    }

    public List<k> H() {
        return this.perfSessions_;
    }

    public List<m> I() {
        return this.subtraces_;
    }

    public boolean J() {
        return (this.bitField0_ & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.f60597a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b((a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f60598a, "subtraces_", m.class, "customAttributes_", d.f60599a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<m> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (m.class) {
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

    public boolean w(String str) {
        str.getClass();
        return L().containsKey(str);
    }

    public int z() {
        return K().size();
    }
}
