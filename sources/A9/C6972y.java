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
import u8.C8886a;

/* renamed from: a9.y  reason: case insensitive filesystem */
public final class C6972y implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final U f42947a;

    /* renamed from: b  reason: collision with root package name */
    public final V3 f42948b;

    /* renamed from: c  reason: collision with root package name */
    public final Q f42949c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42950d;

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.AppLifeCycleAgent", f = "AppLifeCycleAgent.kt", l = {53, 55}, m = "collect")
    /* renamed from: a9.y$a */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public C6972y f42951c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42952d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C6972y f42953e;

        /* renamed from: f  reason: collision with root package name */
        public int f42954f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6972y yVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f42953e = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42952d = obj;
            this.f42954f |= Integer.MIN_VALUE;
            return this.f42953e.b(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.AppLifeCycleAgent$reset$1", f = "AppLifeCycleAgent.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: a9.y$b */
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42955c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C6972y f42956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6972y yVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f42956d = yVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f42956d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new b(this.f42956d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42955c;
            if (i10 == 0) {
                y.b(obj);
                V3 v32 = this.f42956d.f42948b;
                this.f42955c = 1;
                if (v32.clear() == f10) {
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

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.AppLifeCycleAgent", f = "AppLifeCycleAgent.kt", l = {74}, m = "stop")
    /* renamed from: a9.y$c */
    public static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        public C6972y f42957c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42958d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C6972y f42959e;

        /* renamed from: f  reason: collision with root package name */
        public int f42960f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C6972y yVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f42959e = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42958d = obj;
            this.f42960f |= Integer.MIN_VALUE;
            return this.f42959e.a(this);
        }
    }

    public C6972y(U u10, V3 v32) {
        M b10 = C16311i0.b();
        C17542s.j(u10, "appEventCollector");
        C17542s.j(v32, "eventStorage");
        C17542s.j(b10, "dispatcher");
        this.f42947a = u10;
        this.f42948b = v32;
        this.f42949c = S.a(b10);
    }

    public final int a() {
        return this.f42950d ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[LOOP:0: B:24:0x0066->B:26:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super org.json.JSONObject> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a9.C6972y.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a9.y$a r0 = (a9.C6972y.a) r0
            int r1 = r0.f42954f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42954f = r1
            goto L_0x0018
        L_0x0013:
            a9.y$a r0 = new a9.y$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f42952d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42954f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r6)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            a9.y r2 = r0.f42951c
            XH.y.b(r6)
            goto L_0x004d
        L_0x003a:
            XH.y.b(r6)
            boolean r6 = r5.f42950d
            if (r6 == 0) goto L_0x004c
            r0.f42951c = r5
            r0.f42954f = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            a9.V3 r6 = r2.f42948b
            r2 = 0
            r0.f42951c = r2
            r0.f42954f = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.util.List r6 = (java.util.List) r6
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0066:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r6.next()
            com.contentsquare.android.internal.core.telemetry.event.a r1 = (com.contentsquare.android.internal.core.telemetry.event.a) r1
            r1.a(r0)
            goto L_0x0066
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6972y.b(dI.e):java.lang.Object");
    }

    public final void c() {
        F0 unused = C16314k.d(this.f42949c, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void start() {
        if (!this.f42950d && D6.a(C8886a.f56874d.a(), "telemetry_lifecycle")) {
            this.f42950d = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a9.C6972y.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            a9.y$c r0 = (a9.C6972y.c) r0
            int r1 = r0.f42960f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42960f = r1
            goto L_0x0018
        L_0x0013:
            a9.y$c r0 = new a9.y$c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f42958d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42960f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a9.y r0 = r0.f42957c
            XH.y.b(r5)
            goto L_0x0069
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            boolean r5 = r4.f42950d
            if (r5 == 0) goto L_0x006c
            a9.U r5 = r4.f42947a
            java.util.LinkedHashMap r2 = r5.f42315b
            java.util.Collection r2 = r2.values()
            java.util.List r2 = YH.C16877v.t1(r2)
            java.util.LinkedHashMap r5 = r5.f42315b
            r5.clear()
            r0.f42957c = r4
            r0.f42960f = r3
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            a9.V3 r5 = r4.f42948b
            java.lang.Object r5 = r5.b(r2, r0)
            java.lang.Object r0 = eI.C17187b.f()
            if (r5 != r0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            XH.N r5 = XH.C16807N.f139792a
        L_0x0065:
            if (r5 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r0 = r4
        L_0x0069:
            r5 = 0
            r0.f42950d = r5
        L_0x006c:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6972y.a(dI.e):java.lang.Object");
    }

    public final C6882m4 b() {
        return C6882m4.APP_EVENT;
    }
}
