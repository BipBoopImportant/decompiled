package a9;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import com.contentsquare.android.internal.core.telemetry.event.StatisticRecord;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.json.JSONObject;
import rI.C17853c;

/* renamed from: a9.o1  reason: case insensitive filesystem */
public final class C6895o1 implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final I1<Float> f42750a;

    /* renamed from: b  reason: collision with root package name */
    public final T5<StatisticRecord> f42751b;

    /* renamed from: c  reason: collision with root package name */
    public final Q f42752c;

    /* renamed from: d  reason: collision with root package name */
    public F0 f42753d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f42754e;

    /* renamed from: f  reason: collision with root package name */
    public final C16824o f42755f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42756g;

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PerformanceAgent", f = "PerformanceAgent.kt", l = {72, 74}, m = "collect")
    /* renamed from: a9.o1$a */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C6895o1 f42757c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f42758d;

        /* renamed from: e  reason: collision with root package name */
        public String f42759e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f42760f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C6895o1 f42761g;

        /* renamed from: h  reason: collision with root package name */
        public int f42762h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6895o1 o1Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f42761g = o1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42760f = obj;
            this.f42762h |= Integer.MIN_VALUE;
            return this.f42761g.b(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PerformanceAgent$reset$1", f = "PerformanceAgent.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: a9.o1$b */
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42763c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C6895o1 f42764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6895o1 o1Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f42764d = o1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f42764d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new b(this.f42764d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42763c;
            if (i10 == 0) {
                y.b(obj);
                T5<StatisticRecord> t52 = this.f42764d.f42751b;
                this.f42763c = 1;
                if (t52.clear() == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PerformanceAgent$start$1", f = "PerformanceAgent.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: a9.o1$c */
    public static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42765c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C6895o1 f42766d;

        /* renamed from: a9.o1$c$a */
        public /* synthetic */ class a extends C17525a implements p<Float, C17164e<? super C16807N>, Object> {
            public a(C6857j3 j3Var) {
                super(2, j3Var, C6895o1.class, PlaceTypes.STORE, "store(F)V", 4);
            }

            public final Object invoke(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                C17164e eVar = (C17164e) obj2;
                C6895o1 o1Var = (C6895o1) this.f144363a;
                if (floatValue == 0.0f) {
                    o1Var.getClass();
                } else if (o1Var.f42754e.size() < 300) {
                    o1Var.f42754e.add(Float.valueOf(floatValue));
                } else {
                    o1Var.f42754e.set(C17853c.f146670a.e(o1Var.f42754e.size() - 1), Float.valueOf(floatValue));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C6895o1 o1Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f42766d = o1Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f42766d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new c(this.f42766d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42765c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Float> R10 = C16534i.R(this.f42766d.f42750a.a(), new a(this.f42766d));
                this.f42765c = 1;
                if (C16534i.i(R10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PerformanceAgent", f = "PerformanceAgent.kt", l = {95}, m = "stop")
    /* renamed from: a9.o1$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C6895o1 f42767c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42768d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C6895o1 f42769e;

        /* renamed from: f  reason: collision with root package name */
        public int f42770f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C6895o1 o1Var, C17164e<? super d> eVar) {
            super(eVar);
            this.f42769e = o1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42768d = obj;
            this.f42770f |= Integer.MIN_VALUE;
            return this.f42769e.a(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PerformanceAgent", f = "PerformanceAgent.kt", l = {120}, m = "storeOnDisk")
    /* renamed from: a9.o1$e */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public C6895o1 f42771c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42772d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C6895o1 f42773e;

        /* renamed from: f  reason: collision with root package name */
        public int f42774f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C6895o1 o1Var, C17164e<? super e> eVar) {
            super(eVar);
            this.f42773e = o1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42772d = obj;
            this.f42774f |= Integer.MIN_VALUE;
            return this.f42773e.c(this);
        }
    }

    public C6895o1() {
        throw null;
    }

    public final int a() {
        return this.f42756g ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super org.json.JSONObject> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a9.C6895o1.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            a9.o1$a r0 = (a9.C6895o1.a) r0
            int r1 = r0.f42762h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42762h = r1
            goto L_0x0018
        L_0x0013:
            a9.o1$a r0 = new a9.o1$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f42760f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42762h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.String r1 = r0.f42759e
            org.json.JSONObject r2 = r0.f42758d
            a9.o1 r0 = r0.f42757c
            XH.y.b(r9)
            goto L_0x0074
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            a9.o1 r2 = r0.f42757c
            XH.y.b(r9)
            goto L_0x0053
        L_0x0040:
            XH.y.b(r9)
            boolean r9 = r8.f42756g
            if (r9 == 0) goto L_0x0052
            r0.f42757c = r8
            r0.f42762h = r4
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r8
        L_0x0053:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            a9.I1<java.lang.Float> r4 = r2.f42750a
            java.lang.String r4 = r4.getName()
            a9.T5<com.contentsquare.android.internal.core.telemetry.event.StatisticRecord> r5 = r2.f42751b
            r0.f42757c = r2
            r0.f42758d = r9
            r0.f42759e = r4
            r0.f42762h = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r1 = r4
            r7 = r2
            r2 = r9
            r9 = r0
            r0 = r7
        L_0x0074:
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r9 = (com.contentsquare.android.internal.core.telemetry.event.StatisticRecord) r9
            if (r9 == 0) goto L_0x00bf
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            double r4 = r9.f46821a
            java.lang.String r6 = "median"
            r3.put(r6, r4)
            float r4 = r9.f46822b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r5 = "min"
            r3.put(r5, r4)
            float r4 = r9.f46823c
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r5 = "p10"
            r3.put(r5, r4)
            int r4 = r9.f46824d
            java.lang.String r5 = "count"
            r3.put(r5, r4)
            double r4 = r9.f46825e
            java.lang.String r6 = "avg"
            r3.put(r6, r4)
            float r4 = r9.f46826f
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r5 = "p90"
            r3.put(r5, r4)
            float r9 = r9.f46827g
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.String r4 = "max"
            r3.put(r4, r9)
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            org.json.JSONObject r9 = r2.put(r1, r3)
            XH.o r1 = r0.f42755f
            java.lang.Object r1 = r1.getValue()
            D8.c r1 = (D8.c) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            a9.I1<java.lang.Float> r0 = r0.f42750a
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " insight collected : "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            r1.f(r0)
            java.lang.String r0 = "collected"
            kotlin.jvm.internal.C17542s.i(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6895o1.b(dI.e):java.lang.Object");
    }

    public final void c() {
        this.f42754e.clear();
        F0 unused = C16314k.d(this.f42752c, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void start() {
        if (!this.f42756g) {
            ((D8.c) this.f42755f.getValue()).f("Start collecting " + this.f42750a.getName() + " usage");
            this.f42753d = C16314k.d(this.f42752c, (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
            this.f42756g = true;
        }
    }

    public C6895o1(I1 i12, M5 m52) {
        M a10 = C16311i0.a();
        C17542s.j(a10, "dispatcher");
        C17542s.j(i12, "performanceCollector");
        C17542s.j(m52, PlaceTypes.STORAGE);
        this.f42750a = i12;
        this.f42751b = m52;
        this.f42752c = S.a(a10);
        this.f42754e = new ArrayList();
        this.f42755f = C16825p.b(C6958w1.f42920c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a9.C6895o1.d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            a9.o1$d r0 = (a9.C6895o1.d) r0
            int r1 = r0.f42770f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42770f = r1
            goto L_0x0018
        L_0x0013:
            a9.o1$d r0 = new a9.o1$d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f42768d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42770f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a9.o1 r0 = r0.f42767c
            XH.y.b(r5)
            goto L_0x004e
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            boolean r5 = r4.f42756g
            if (r5 == 0) goto L_0x0075
            QJ.F0 r5 = r4.f42753d
            if (r5 == 0) goto L_0x0042
            r2 = 0
            QJ.F0.a.a(r5, r2, r3, r2)
        L_0x0042:
            r0.f42767c = r4
            r0.f42770f = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            r5 = 0
            r0.f42756g = r5
            XH.o r5 = r0.f42755f
            java.lang.Object r5 = r5.getValue()
            D8.c r5 = (D8.c) r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stop collecting "
            r1.<init>(r2)
            a9.I1<java.lang.Float> r0 = r0.f42750a
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " usage"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.f(r0)
        L_0x0075:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6895o1.a(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.C16807N> r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            boolean r2 = r1 instanceof a9.C6895o1.e
            if (r2 == 0) goto L_0x0017
            r2 = r1
            a9.o1$e r2 = (a9.C6895o1.e) r2
            int r3 = r2.f42774f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f42774f = r3
            goto L_0x001c
        L_0x0017:
            a9.o1$e r2 = new a9.o1$e
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f42772d
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f42774f
            r5 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            a9.o1 r2 = r2.f42771c
            XH.y.b(r1)
            goto L_0x0452
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            XH.y.b(r1)
            java.util.ArrayList r1 = r0.f42754e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0046
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0046:
            a9.T5<com.contentsquare.android.internal.core.telemetry.event.StatisticRecord> r1 = r0.f42751b
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r4 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion
            java.util.ArrayList r6 = r0.f42754e
            r4.getClass()
            java.lang.String r4 = "values"
            kotlin.jvm.internal.C17542s.j(r6, r4)
            boolean r4 = r6.isEmpty()
            r7 = 0
            if (r4 == 0) goto L_0x0066
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r4 = new com.contentsquare.android.internal.core.telemetry.event.StatisticRecord
            r4.<init>(r7)
            r25 = r1
            r26 = r3
            goto L_0x0441
        L_0x0066:
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r4 = new com.contentsquare.android.internal.core.telemetry.event.StatisticRecord
            int r8 = r6.size()
            java.util.List r9 = YH.C16877v.f1(r6)
            if (r8 != 0) goto L_0x0075
            r12 = 0
            goto L_0x00a7
        L_0x0075:
            if (r8 != r5) goto L_0x0083
            java.lang.Object r8 = r6.get(r7)
        L_0x007b:
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
        L_0x0081:
            r12 = r8
            goto L_0x00a7
        L_0x0083:
            int r12 = r8 % 2
            r13 = 2
            int r8 = r8 / r13
            if (r12 != r5) goto L_0x008e
            java.lang.Object r8 = r9.get(r8)
            goto L_0x007b
        L_0x008e:
            java.lang.Object r12 = r9.get(r8)
            java.lang.Number r12 = (java.lang.Number) r12
            double r14 = r12.doubleValue()
            int r8 = r8 - r5
            java.lang.Object r8 = r9.get(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            double r8 = r8 + r14
            double r12 = (double) r13
            double r8 = r8 / r12
            goto L_0x0081
        L_0x00a7:
            java.lang.Float r8 = YH.C16877v.Q0(r6)
            if (r8 == 0) goto L_0x00b3
            float r8 = r8.floatValue()
            r14 = r8
            goto L_0x00b4
        L_0x00b3:
            r14 = 0
        L_0x00b4:
            boolean r8 = r6.isEmpty()
            java.lang.String r10 = "Unsupported number type: "
            java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
            if (r8 == 0) goto L_0x016c
            uI.d r8 = kotlin.jvm.internal.P.b(r11)
            java.lang.Class r19 = java.lang.Integer.TYPE
            uI.d r15 = kotlin.jvm.internal.P.b(r19)
            boolean r15 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r15 == 0) goto L_0x00da
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x01f8
        L_0x00da:
            java.lang.Class r15 = java.lang.Long.TYPE
            uI.d r15 = kotlin.jvm.internal.P.b(r15)
            boolean r15 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r15 == 0) goto L_0x00f2
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x020d
        L_0x00f2:
            java.lang.Class r15 = java.lang.Float.TYPE
            uI.d r15 = kotlin.jvm.internal.P.b(r15)
            boolean r15 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r15 == 0) goto L_0x010a
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x021f
        L_0x010a:
            java.lang.Class r15 = java.lang.Double.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r15)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r9 == 0) goto L_0x0122
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x0231
        L_0x0122:
            java.lang.Class r9 = java.lang.Short.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r9 == 0) goto L_0x013a
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x0242
        L_0x013a:
            java.lang.Class r9 = java.lang.Byte.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x0152
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            r5 = 0
            goto L_0x0255
        L_0x0152:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            uI.d r3 = kotlin.jvm.internal.P.b(r15)
            java.lang.String r3 = r3.f()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x016c:
            int r8 = r6.size()
            if (r8 != r5) goto L_0x0182
            java.lang.Object r8 = r6.get(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            r25 = r1
            r24 = r2
            r26 = r3
            r22 = r6
            goto L_0x025c
        L_0x0182:
            java.util.List r8 = YH.C16877v.f1(r6)
            int r9 = r8.size()
            int r15 = r9 + 1
            r22 = r6
            double r5 = (double) r15
            r23 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r5 = r5 * r23
            r24 = r8
            r15 = 100
            double r7 = (double) r15
            double r5 = r5 / r7
            double r7 = java.lang.Math.floor(r5)
            int r7 = (int) r7
            r25 = r1
            double r0 = (double) r7
            double r0 = r5 - r0
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r8 >= 0) goto L_0x01b9
            r15 = r24
            r8 = 0
            java.lang.Object r0 = r15.get(r8)
            r8 = r0
            java.lang.Number r8 = (java.lang.Number) r8
            r24 = r2
            r26 = r3
            goto L_0x025c
        L_0x01b9:
            r26 = r3
            r15 = r24
            r24 = r2
            double r2 = (double) r9
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01cf
            r2 = 1
            int r9 = r9 - r2
            java.lang.Object r0 = r15.get(r9)
            r8 = r0
            java.lang.Number r8 = (java.lang.Number) r8
            goto L_0x025c
        L_0x01cf:
            int r2 = r7 + -1
            java.lang.Object r2 = r15.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Object r5 = r15.get(r7)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r5 = r5 - r2
            double r5 = r5 * r0
            double r5 = r5 + r2
            uI.d r0 = kotlin.jvm.internal.P.b(r11)
            java.lang.Class r1 = java.lang.Integer.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0201
        L_0x01f8:
            int r0 = (int) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01fd:
            r8 = r0
            java.lang.Float r8 = (java.lang.Float) r8
            goto L_0x025c
        L_0x0201:
            java.lang.Class r1 = java.lang.Long.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0213
        L_0x020d:
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01fd
        L_0x0213:
            java.lang.Class r1 = java.lang.Float.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0225
        L_0x021f:
            float r0 = (float) r5
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            goto L_0x025c
        L_0x0225:
            java.lang.Class r1 = java.lang.Double.TYPE
            uI.d r2 = kotlin.jvm.internal.P.b(r1)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r2 == 0) goto L_0x0236
        L_0x0231:
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x01fd
        L_0x0236:
            java.lang.Class r2 = java.lang.Short.TYPE
            uI.d r2 = kotlin.jvm.internal.P.b(r2)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r2 == 0) goto L_0x0249
        L_0x0242:
            int r0 = (int) r5
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L_0x01fd
        L_0x0249:
            java.lang.Class r2 = java.lang.Byte.TYPE
            uI.d r2 = kotlin.jvm.internal.P.b(r2)
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r0 == 0) goto L_0x0478
        L_0x0255:
            int r0 = (int) r5
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L_0x01fd
        L_0x025c:
            float r0 = r8.floatValue()
            int r1 = r22.size()
            double r2 = YH.C16877v.i0(r22)
            boolean r5 = r22.isEmpty()
            if (r5 == 0) goto L_0x0322
            uI.d r5 = kotlin.jvm.internal.P.b(r11)
            java.lang.Class r6 = java.lang.Integer.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r6 == 0) goto L_0x028b
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x03b4
        L_0x028b:
            java.lang.Class r6 = java.lang.Long.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r6 == 0) goto L_0x02a4
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x03ca
        L_0x02a4:
            java.lang.Class r6 = java.lang.Float.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r6 == 0) goto L_0x02bd
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x03dd
        L_0x02bd:
            java.lang.Class r6 = java.lang.Double.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r7 == 0) goto L_0x02d6
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x03f0
        L_0x02d6:
            java.lang.Class r7 = java.lang.Short.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r7)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r7 == 0) goto L_0x02ef
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x0402
        L_0x02ef:
            java.lang.Class r7 = java.lang.Byte.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r7)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 == 0) goto L_0x0308
            r21 = r1
            r16 = r2
            r20 = r14
            r5 = r22
            r10 = 0
            r3 = r0
            goto L_0x0416
        L_0x0308:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            uI.d r2 = kotlin.jvm.internal.P.b(r6)
            java.lang.String r2 = r2.f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0322:
            int r5 = r22.size()
            r6 = 1
            if (r5 != r6) goto L_0x033b
            r5 = r22
            r6 = 0
            java.lang.Object r6 = r5.get(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            r21 = r1
            r16 = r2
            r20 = r14
            r3 = r0
            goto L_0x041d
        L_0x033b:
            r5 = r22
            java.util.List r6 = YH.C16877v.f1(r5)
            int r7 = r6.size()
            int r8 = r7 + 1
            double r8 = (double) r8
            r17 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r8 = r8 * r17
            r16 = r2
            r15 = 100
            double r2 = (double) r15
            double r8 = r8 / r2
            double r2 = java.lang.Math.floor(r8)
            int r2 = (int) r2
            r3 = r0
            r15 = r1
            double r0 = (double) r2
            double r0 = r8 - r0
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r18 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r18 >= 0) goto L_0x0373
            r10 = 0
            java.lang.Object r0 = r6.get(r10)
            r6 = r0
            java.lang.Number r6 = (java.lang.Number) r6
            r20 = r14
            r21 = r15
            goto L_0x041d
        L_0x0373:
            r18 = r10
            r20 = r14
            r21 = r15
            double r14 = (double) r7
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x0389
            r8 = 1
            int r7 = r7 - r8
            java.lang.Object r0 = r6.get(r7)
            r6 = r0
            java.lang.Number r6 = (java.lang.Number) r6
            goto L_0x041d
        L_0x0389:
            int r7 = r2 + -1
            java.lang.Object r7 = r6.get(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            double r7 = r7.doubleValue()
            java.lang.Object r2 = r6.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r9 = r2.doubleValue()
            double r9 = r9 - r7
            double r9 = r9 * r0
            double r0 = r9 + r7
            uI.d r2 = kotlin.jvm.internal.P.b(r11)
            java.lang.Class r6 = java.lang.Integer.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r6 == 0) goto L_0x03bd
            r10 = r0
        L_0x03b4:
            int r0 = (int) r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x03b9:
            r6 = r0
            java.lang.Float r6 = (java.lang.Float) r6
            goto L_0x041d
        L_0x03bd:
            java.lang.Class r6 = java.lang.Long.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r6 == 0) goto L_0x03d0
            r10 = r0
        L_0x03ca:
            long r0 = (long) r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x03b9
        L_0x03d0:
            java.lang.Class r6 = java.lang.Float.TYPE
            uI.d r6 = kotlin.jvm.internal.P.b(r6)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r6 == 0) goto L_0x03e3
            r10 = r0
        L_0x03dd:
            float r0 = (float) r10
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            goto L_0x041d
        L_0x03e3:
            java.lang.Class r6 = java.lang.Double.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r7 == 0) goto L_0x03f5
            r10 = r0
        L_0x03f0:
            java.lang.Double r0 = java.lang.Double.valueOf(r10)
            goto L_0x03b9
        L_0x03f5:
            java.lang.Class r7 = java.lang.Short.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r7)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r7 == 0) goto L_0x0409
            r10 = r0
        L_0x0402:
            int r0 = (int) r10
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L_0x03b9
        L_0x0409:
            java.lang.Class r7 = java.lang.Byte.TYPE
            uI.d r7 = kotlin.jvm.internal.P.b(r7)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r2 == 0) goto L_0x045a
            r10 = r0
        L_0x0416:
            int r0 = (int) r10
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L_0x03b9
        L_0x041d:
            float r0 = r6.floatValue()
            java.lang.Float r1 = YH.C16877v.N0(r5)
            if (r1 == 0) goto L_0x042c
            float r1 = r1.floatValue()
            goto L_0x042d
        L_0x042c:
            r1 = 0
        L_0x042d:
            r8 = r4
            r9 = r12
            r11 = r20
            r12 = r3
            r13 = r21
            r14 = r16
            r16 = r0
            r17 = r1
            r8.<init>(r9, r11, r12, r13, r14, r16, r17)
            r0 = r27
            r2 = r24
        L_0x0441:
            r2.f42771c = r0
            r1 = 1
            r2.f42774f = r1
            r1 = r25
            java.lang.Object r1 = r1.b(r4, r2)
            r2 = r26
            if (r1 != r2) goto L_0x0451
            return r2
        L_0x0451:
            r2 = r0
        L_0x0452:
            java.util.ArrayList r1 = r2.f42754e
            r1.clear()
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x045a:
            r0 = r27
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r18
            r2.<init>(r3)
            uI.d r3 = kotlin.jvm.internal.P.b(r6)
            java.lang.String r3 = r3.f()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0478:
            r0 = r27
            r3 = r10
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            java.lang.String r1 = r1.f()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6895o1.c(dI.e):java.lang.Object");
    }

    public final C6882m4 b() {
        return C6882m4.PERFORMANCE;
    }
}
