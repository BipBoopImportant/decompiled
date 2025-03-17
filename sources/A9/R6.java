package a9;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.json.JSONObject;
import u8.C8886a;

public final class R6 implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final C6821f f42252a;

    /* renamed from: b  reason: collision with root package name */
    public final C6820e6 f42253b;

    /* renamed from: c  reason: collision with root package name */
    public final D8.c f42254c = new D8.c("TimeAgent");

    /* renamed from: d  reason: collision with root package name */
    public final Q f42255d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42256e;

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.TimeAgent", f = "TimeAgent.kt", l = {60, 62}, m = "collect")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public R6 f42257c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f42258d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f42259e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ R6 f42260f;

        /* renamed from: g  reason: collision with root package name */
        public int f42261g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(R6 r62, C17164e<? super a> eVar) {
            super(eVar);
            this.f42260f = r62;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42259e = obj;
            this.f42261g |= Integer.MIN_VALUE;
            return this.f42260f.b(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.TimeAgent$reset$1", f = "TimeAgent.kt", l = {53}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42262c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ R6 f42263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(R6 r62, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f42263d = r62;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f42263d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new b(this.f42263d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42262c;
            if (i10 == 0) {
                y.b(obj);
                C6820e6 e6Var = this.f42263d.f42253b;
                this.f42262c = 1;
                if (e6Var.clear() == f10) {
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

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.TimeAgent", f = "TimeAgent.kt", l = {45}, m = "stop")
    public static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        public R6 f42264c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42265d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ R6 f42266e;

        /* renamed from: f  reason: collision with root package name */
        public int f42267f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(R6 r62, C17164e<? super c> eVar) {
            super(eVar);
            this.f42266e = r62;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42265d = obj;
            this.f42267f |= Integer.MIN_VALUE;
            return this.f42266e.a(this);
        }
    }

    public R6(C6821f fVar, C6820e6 e6Var) {
        M b10 = C16311i0.b();
        C17542s.j(fVar, "timeCollector");
        C17542s.j(e6Var, "timeStorage");
        C17542s.j(b10, "dispatcher");
        this.f42252a = fVar;
        this.f42253b = e6Var;
        this.f42255d = S.a(b10);
    }

    public final int a() {
        return this.f42256e ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super org.json.JSONObject> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a9.R6.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            a9.R6$a r0 = (a9.R6.a) r0
            int r1 = r0.f42261g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42261g = r1
            goto L_0x0018
        L_0x0013:
            a9.R6$a r0 = new a9.R6$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f42259e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42261g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            org.json.JSONObject r1 = r0.f42258d
            a9.R6 r0 = r0.f42257c
            XH.y.b(r9)
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0038:
            org.json.JSONObject r2 = r0.f42258d
            a9.R6 r4 = r0.f42257c
            XH.y.b(r9)
            r9 = r2
            goto L_0x005b
        L_0x0041:
            XH.y.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            boolean r2 = r8.f42256e
            if (r2 == 0) goto L_0x005a
            r0.f42257c = r8
            r0.f42258d = r9
            r0.f42261g = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r4 = r8
        L_0x005b:
            a9.e6 r2 = r4.f42253b
            r0.f42257c = r4
            r0.f42258d = r9
            r0.f42261g = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r1 = r9
            r9 = r0
            r0 = r4
        L_0x006d:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0077:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x00dc }
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x00dc }
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r2 = (com.contentsquare.android.internal.core.telemetry.event.StatisticRecord) r2     // Catch:{ JSONException -> 0x00dc }
            r2.getClass()     // Catch:{ JSONException -> 0x00dc }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00dc }
            r4.<init>()     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "median"
            double r6 = r2.f46821a     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "min"
            float r6 = r2.f46822b     // Catch:{ JSONException -> 0x00dc }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "p10"
            float r6 = r2.f46823c     // Catch:{ JSONException -> 0x00dc }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "count"
            int r6 = r2.f46824d     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "avg"
            double r6 = r2.f46825e     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "p90"
            float r6 = r2.f46826f     // Catch:{ JSONException -> 0x00dc }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r5 = "max"
            float r2 = r2.f46827g     // Catch:{ JSONException -> 0x00dc }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ JSONException -> 0x00dc }
            r4.put(r5, r2)     // Catch:{ JSONException -> 0x00dc }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x00dc }
            goto L_0x0077
        L_0x00dc:
            r2 = move-exception
            D8.c r3 = r0.f42254c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to create Telemetry time event JSONObject: "
            r4.<init>(r5)
            a9.C6953v4.a(r2, r4, r3, r2)
            goto L_0x0077
        L_0x00ea:
            D8.c r9 = r0.f42254c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Telemetry time measure collected: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.f(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.R6.b(dI.e):java.lang.Object");
    }

    public final void c() {
        this.f42252a.f42545c.clear();
        F0 unused = C16314k.d(this.f42255d, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void start() {
        if (!this.f42256e && D6.a(C8886a.f56874d.a(), "telemetry_time")) {
            this.f42256e = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a9.R6.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            a9.R6$c r0 = (a9.R6.c) r0
            int r1 = r0.f42267f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42267f = r1
            goto L_0x0018
        L_0x0013:
            a9.R6$c r0 = new a9.R6$c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f42265d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42267f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a9.R6 r0 = r0.f42264c
            XH.y.b(r5)
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            boolean r5 = r4.f42256e
            if (r5 == 0) goto L_0x0049
            r0.f42264c = r4
            r0.f42267f = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            r5 = 0
            r0.f42256e = r5
        L_0x0049:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.R6.a(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.C16807N> r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1 instanceof a9.a7
            if (r2 == 0) goto L_0x0017
            r2 = r1
            a9.a7 r2 = (a9.a7) r2
            int r3 = r2.f42457f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f42457f = r3
            goto L_0x001c
        L_0x0017:
            a9.a7 r2 = new a9.a7
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f42455d
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f42457f
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            a9.R6 r2 = r2.f42454c
            XH.y.b(r1)
            r1 = r0
            goto L_0x04bc
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            XH.y.b(r1)
            a9.f r1 = r0.f42252a
            java.util.LinkedHashMap r1 = r1.f42545c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04c4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            a9.f r4 = r0.f42252a
            java.util.LinkedHashMap r4 = r4.f42545c
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04a4
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord$a r8 = com.contentsquare.android.internal.core.telemetry.event.StatisticRecord.Companion
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            r8.getClass()
            java.lang.String r8 = "values"
            kotlin.jvm.internal.C17542s.j(r6, r8)
            boolean r8 = r6.isEmpty()
            r9 = 0
            if (r8 == 0) goto L_0x008b
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r6 = new com.contentsquare.android.internal.core.telemetry.event.StatisticRecord
            r6.<init>(r9)
            r0 = r1
            r24 = r3
            r25 = r4
            r1 = r7
            goto L_0x0460
        L_0x008b:
            com.contentsquare.android.internal.core.telemetry.event.StatisticRecord r8 = new com.contentsquare.android.internal.core.telemetry.event.StatisticRecord
            int r10 = r6.size()
            java.util.List r11 = YH.C16877v.f1(r6)
            if (r10 != 0) goto L_0x009a
            r14 = 0
            goto L_0x00cd
        L_0x009a:
            if (r10 != r5) goto L_0x00a8
            java.lang.Object r10 = r6.get(r9)
        L_0x00a0:
            java.lang.Number r10 = (java.lang.Number) r10
            double r10 = r10.doubleValue()
        L_0x00a6:
            r14 = r10
            goto L_0x00cd
        L_0x00a8:
            int r14 = r10 % 2
            int r10 = r10 / 2
            if (r14 != r5) goto L_0x00b3
            java.lang.Object r10 = r11.get(r10)
            goto L_0x00a0
        L_0x00b3:
            java.lang.Object r14 = r11.get(r10)
            java.lang.Number r14 = (java.lang.Number) r14
            double r14 = r14.doubleValue()
            int r10 = r10 - r5
            java.lang.Object r10 = r11.get(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            double r10 = r10.doubleValue()
            double r10 = r10 + r14
            r14 = 2
            double r14 = (double) r14
            double r10 = r10 / r14
            goto L_0x00a6
        L_0x00cd:
            java.lang.Comparable r10 = YH.C16877v.P0(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x00dc
            long r11 = r10.longValue()
            float r10 = (float) r11
            r13 = r10
            goto L_0x00dd
        L_0x00dc:
            r13 = 0
        L_0x00dd:
            boolean r10 = r6.isEmpty()
            java.lang.String r12 = "Unsupported number type: "
            java.lang.Class<java.lang.Long> r20 = java.lang.Long.class
            if (r10 == 0) goto L_0x01a1
            uI.d r10 = kotlin.jvm.internal.P.b(r20)
            java.lang.Class r21 = java.lang.Integer.TYPE
            uI.d r11 = kotlin.jvm.internal.P.b(r21)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r11 == 0) goto L_0x0105
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x0229
        L_0x0105:
            java.lang.Class r11 = java.lang.Long.TYPE
            uI.d r11 = kotlin.jvm.internal.P.b(r11)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r11 == 0) goto L_0x011f
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x023e
        L_0x011f:
            java.lang.Class r11 = java.lang.Float.TYPE
            uI.d r11 = kotlin.jvm.internal.P.b(r11)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r11 == 0) goto L_0x0139
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x0250
        L_0x0139:
            java.lang.Class r11 = java.lang.Double.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r11)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r10, r9)
            if (r9 == 0) goto L_0x0153
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x0262
        L_0x0153:
            java.lang.Class r9 = java.lang.Short.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r10, r9)
            if (r9 == 0) goto L_0x016d
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x0273
        L_0x016d:
            java.lang.Class r9 = java.lang.Byte.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r10, r9)
            if (r9 == 0) goto L_0x0187
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r9 = 0
            r4 = r1
            r15 = r13
            goto L_0x0286
        L_0x0187:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            uI.d r3 = kotlin.jvm.internal.P.b(r11)
            java.lang.String r3 = r3.f()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a1:
            int r9 = r6.size()
            if (r9 != r5) goto L_0x01ba
            r9 = 0
            java.lang.Object r10 = r6.get(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            r24 = r3
            r25 = r4
            r23 = r6
            r26 = r14
            r4 = r1
        L_0x01b7:
            r15 = r13
            goto L_0x028d
        L_0x01ba:
            java.util.List r9 = YH.C16877v.f1(r6)
            int r10 = r9.size()
            int r11 = r10 + 1
            r23 = r6
            double r5 = (double) r11
            r24 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r5 = r5 * r24
            r24 = r3
            r25 = r4
            r11 = 100
            double r3 = (double) r11
            double r5 = r5 / r3
            double r3 = java.lang.Math.floor(r5)
            int r3 = (int) r3
            r4 = r1
            double r0 = (double) r3
            double r0 = r5 - r0
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r11 >= 0) goto L_0x01ed
            r11 = 0
            java.lang.Object r0 = r9.get(r11)
            r10 = r0
            java.lang.Number r10 = (java.lang.Number) r10
            r26 = r14
            goto L_0x01b7
        L_0x01ed:
            r26 = r14
            r15 = r13
            double r13 = (double) r10
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x0200
            int r10 = r10 + -1
            java.lang.Object r0 = r9.get(r10)
            r10 = r0
            java.lang.Number r10 = (java.lang.Number) r10
            goto L_0x028d
        L_0x0200:
            int r5 = r3 + -1
            java.lang.Object r5 = r9.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            java.lang.Object r3 = r9.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r9 = r3.doubleValue()
            double r9 = r9 - r5
            double r9 = r9 * r0
            double r9 = r9 + r5
            uI.d r0 = kotlin.jvm.internal.P.b(r20)
            java.lang.Class r1 = java.lang.Integer.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0232
        L_0x0229:
            int r0 = (int) r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x022e:
            r10 = r0
            java.lang.Long r10 = (java.lang.Long) r10
            goto L_0x028d
        L_0x0232:
            java.lang.Class r1 = java.lang.Long.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0244
        L_0x023e:
            long r0 = (long) r9
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            goto L_0x028d
        L_0x0244:
            java.lang.Class r1 = java.lang.Float.TYPE
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0256
        L_0x0250:
            float r0 = (float) r9
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x022e
        L_0x0256:
            java.lang.Class r1 = java.lang.Double.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r1)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r3 == 0) goto L_0x0267
        L_0x0262:
            java.lang.Double r0 = java.lang.Double.valueOf(r9)
            goto L_0x022e
        L_0x0267:
            java.lang.Class r3 = java.lang.Short.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r3)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r3 == 0) goto L_0x027a
        L_0x0273:
            int r0 = (int) r9
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L_0x022e
        L_0x027a:
            java.lang.Class r3 = java.lang.Byte.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r3)
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r0 == 0) goto L_0x0489
        L_0x0286:
            int r0 = (int) r9
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L_0x022e
        L_0x028d:
            long r0 = r10.longValue()
            float r14 = (float) r0
            int r0 = r23.size()
            double r5 = YH.C16877v.j0(r23)
            boolean r1 = r23.isEmpty()
            if (r1 == 0) goto L_0x034e
            uI.d r1 = kotlin.jvm.internal.P.b(r20)
            java.lang.Class r3 = java.lang.Integer.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r3)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x02bc
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x03d5
        L_0x02bc:
            java.lang.Class r3 = java.lang.Long.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r3)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x02d4
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x03e9
        L_0x02d4:
            java.lang.Class r3 = java.lang.Float.TYPE
            uI.d r3 = kotlin.jvm.internal.P.b(r3)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x02ec
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x03fb
        L_0x02ec:
            java.lang.Class r3 = java.lang.Double.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r3)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r1, r9)
            if (r9 == 0) goto L_0x0304
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x040d
        L_0x0304:
            java.lang.Class r9 = java.lang.Short.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r1, r9)
            if (r9 == 0) goto L_0x031c
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x041e
        L_0x031c:
            java.lang.Class r9 = java.lang.Byte.TYPE
            uI.d r9 = kotlin.jvm.internal.P.b(r9)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r9)
            if (r1 == 0) goto L_0x0334
            r22 = r4
            r28 = r5
            r21 = r7
            r1 = r23
            r12 = 0
            goto L_0x0431
        L_0x0334:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            uI.d r2 = kotlin.jvm.internal.P.b(r3)
            java.lang.String r2 = r2.f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x034e:
            int r1 = r23.size()
            r3 = 1
            if (r1 != r3) goto L_0x0366
            r1 = r23
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            r22 = r4
            r28 = r5
        L_0x0362:
            r21 = r7
            goto L_0x0438
        L_0x0366:
            r1 = r23
            java.util.List r3 = YH.C16877v.f1(r1)
            int r9 = r3.size()
            int r10 = r9 + 1
            double r10 = (double) r10
            r16 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r10 = r10 * r16
            r16 = r12
            r13 = 100
            double r12 = (double) r13
            double r10 = r10 / r12
            double r12 = java.lang.Math.floor(r10)
            int r12 = (int) r12
            r22 = r4
            r28 = r5
            double r4 = (double) r12
            double r4 = r10 - r4
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r6 >= 0) goto L_0x039a
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x0362
        L_0x039a:
            r21 = r7
            double r6 = (double) r9
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x03ab
            int r9 = r9 + -1
            java.lang.Object r3 = r3.get(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x0438
        L_0x03ab:
            int r6 = r12 + -1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            java.lang.Object r3 = r3.get(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            double r9 = r3.doubleValue()
            double r9 = r9 - r6
            double r9 = r9 * r4
            double r12 = r9 + r6
            uI.d r3 = kotlin.jvm.internal.P.b(r20)
            java.lang.Class r4 = java.lang.Integer.TYPE
            uI.d r4 = kotlin.jvm.internal.P.b(r4)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r4 == 0) goto L_0x03dd
        L_0x03d5:
            int r3 = (int) r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x03da:
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x0438
        L_0x03dd:
            java.lang.Class r4 = java.lang.Long.TYPE
            uI.d r4 = kotlin.jvm.internal.P.b(r4)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r4 == 0) goto L_0x03ef
        L_0x03e9:
            long r3 = (long) r12
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0438
        L_0x03ef:
            java.lang.Class r4 = java.lang.Float.TYPE
            uI.d r4 = kotlin.jvm.internal.P.b(r4)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r4 == 0) goto L_0x0401
        L_0x03fb:
            float r3 = (float) r12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x03da
        L_0x0401:
            java.lang.Class r4 = java.lang.Double.TYPE
            uI.d r5 = kotlin.jvm.internal.P.b(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r5 == 0) goto L_0x0412
        L_0x040d:
            java.lang.Double r3 = java.lang.Double.valueOf(r12)
            goto L_0x03da
        L_0x0412:
            java.lang.Class r5 = java.lang.Short.TYPE
            uI.d r5 = kotlin.jvm.internal.P.b(r5)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r5 == 0) goto L_0x0425
        L_0x041e:
            int r3 = (int) r12
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x03da
        L_0x0425:
            java.lang.Class r5 = java.lang.Byte.TYPE
            uI.d r5 = kotlin.jvm.internal.P.b(r5)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x046d
        L_0x0431:
            int r3 = (int) r12
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            goto L_0x03da
        L_0x0438:
            long r3 = r3.longValue()
            float r3 = (float) r3
            java.lang.Comparable r1 = YH.C16877v.M0(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x044d
            long r4 = r1.longValue()
            float r1 = (float) r4
            r19 = r1
            goto L_0x044f
        L_0x044d:
            r19 = 0
        L_0x044f:
            r10 = r8
            r11 = r26
            r13 = r15
            r15 = r0
            r16 = r28
            r18 = r3
            r10.<init>(r11, r13, r14, r15, r16, r18, r19)
            r6 = r8
            r1 = r21
            r0 = r22
        L_0x0460:
            r0.put(r1, r6)
            r1 = r0
            r3 = r24
            r4 = r25
            r5 = 1
            r0 = r31
            goto L_0x0057
        L_0x046d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r16
            r1.<init>(r2)
            uI.d r2 = kotlin.jvm.internal.P.b(r4)
            java.lang.String r2 = r2.f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0489:
            r2 = r12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            java.lang.String r1 = r1.f()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x04a4:
            r24 = r3
            r30 = r1
            r1 = r0
            r0 = r30
            a9.e6 r3 = r1.f42253b
            r2.f42454c = r1
            r4 = 1
            r2.f42457f = r4
            java.lang.Object r0 = r3.b(r0, r2)
            r2 = r24
            if (r0 != r2) goto L_0x04bb
            return r2
        L_0x04bb:
            r2 = r1
        L_0x04bc:
            a9.f r0 = r2.f42252a
            java.util.LinkedHashMap r0 = r0.f42545c
            r0.clear()
            goto L_0x04c5
        L_0x04c4:
            r1 = r0
        L_0x04c5:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.R6.c(dI.e):java.lang.Object");
    }

    public final C6882m4 b() {
        return C6882m4.TIME;
    }
}
