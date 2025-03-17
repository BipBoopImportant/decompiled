package a9;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.p;
import rI.C17853c;
import u8.C8886a;

public final class T3 implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final P3 f42287a;

    /* renamed from: b  reason: collision with root package name */
    public final V3 f42288b;

    /* renamed from: c  reason: collision with root package name */
    public final E8.c f42289c;

    /* renamed from: d  reason: collision with root package name */
    public final Q f42290d;

    /* renamed from: e  reason: collision with root package name */
    public F0 f42291e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f42292f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42293g;

    /* renamed from: h  reason: collision with root package name */
    public final C6882m4 f42294h;

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PublicUsageAgent", f = "PublicUsageAgent.kt", l = {69, 71}, m = "collect")
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public T3 f42295c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42296d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ T3 f42297e;

        /* renamed from: f  reason: collision with root package name */
        public int f42298f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(T3 t32, C17164e<? super a> eVar) {
            super(eVar);
            this.f42297e = t32;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42296d = obj;
            this.f42298f |= Integer.MIN_VALUE;
            return this.f42297e.b(this);
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PublicUsageAgent$reset$1", f = "PublicUsageAgent.kt", l = {81}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42299c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ T3 f42300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(T3 t32, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f42300d = t32;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f42300d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new b(this.f42300d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42299c;
            if (i10 == 0) {
                y.b(obj);
                V3 v32 = this.f42300d.f42288b;
                this.f42299c = 1;
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

    public /* synthetic */ class c extends C17525a implements p<com.contentsquare.android.internal.core.telemetry.event.a, C17164e<? super C16807N>, Object> {
        public c(C6857j3 j3Var) {
            super(2, j3Var, T3.class, PlaceTypes.STORE, "store(Lcom/contentsquare/android/internal/core/telemetry/event/TelemetryEvent;)V", 4);
        }

        public final Object invoke(Object obj, Object obj2) {
            com.contentsquare.android.internal.core.telemetry.event.a aVar = (com.contentsquare.android.internal.core.telemetry.event.a) obj;
            C17164e eVar = (C17164e) obj2;
            T3 t32 = (T3) this.f144363a;
            com.contentsquare.android.internal.core.telemetry.event.a aVar2 = (com.contentsquare.android.internal.core.telemetry.event.a) t32.f42292f.get(aVar.getKey());
            LinkedHashMap linkedHashMap = t32.f42292f;
            if (aVar2 != null) {
                linkedHashMap.put(aVar.getKey(), aVar2.b(aVar));
            } else {
                linkedHashMap.put(aVar.getKey(), aVar);
            }
            return C16807N.f139792a;
        }
    }

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.PublicUsageAgent", f = "PublicUsageAgent.kt", l = {91}, m = "stop")
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public T3 f42301c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f42302d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ T3 f42303e;

        /* renamed from: f  reason: collision with root package name */
        public int f42304f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(T3 t32, C17164e<? super d> eVar) {
            super(eVar);
            this.f42303e = t32;
        }

        public final Object invokeSuspend(Object obj) {
            this.f42302d = obj;
            this.f42304f |= Integer.MIN_VALUE;
            return this.f42303e.a(this);
        }
    }

    public T3() {
        throw null;
    }

    public final int a() {
        return this.f42293g ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[LOOP:0: B:24:0x0066->B:26:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super org.json.JSONObject> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a9.T3.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a9.T3$a r0 = (a9.T3.a) r0
            int r1 = r0.f42298f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42298f = r1
            goto L_0x0018
        L_0x0013:
            a9.T3$a r0 = new a9.T3$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f42296d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42298f
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
            a9.T3 r2 = r0.f42295c
            XH.y.b(r6)
            goto L_0x004d
        L_0x003a:
            XH.y.b(r6)
            boolean r6 = r5.f42293g
            if (r6 == 0) goto L_0x004c
            r0.f42295c = r5
            r0.f42298f = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            a9.V3 r6 = r2.f42288b
            r2 = 0
            r0.f42295c = r2
            r0.f42298f = r3
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
        throw new UnsupportedOperationException("Method not decompiled: a9.T3.b(dI.e):java.lang.Object");
    }

    public final void c() {
        this.f42292f.clear();
        F0 unused = C16314k.d(this.f42290d, (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void start() {
        if (!this.f42293g && D6.a(C8886a.f56874d.a(), "telemetry_public_usage")) {
            E8.c cVar = this.f42289c;
            E8.b bVar = E8.b.TELEMETRY_PUBLIC_USAGE_RATE;
            int d10 = cVar.d(bVar, -1);
            if (d10 == -1) {
                d10 = C17853c.f146670a.e(100);
                this.f42289c.j(bVar, d10);
            }
            if (d10 >= 0 && d10 < 11) {
                this.f42291e = C16534i.M(C16534i.R(this.f42287a.a(), new c(this)), this.f42290d);
                this.f42293g = true;
            }
        }
    }

    public T3(P3 p32, V3 v32, E8.c cVar) {
        M b10 = C16311i0.b();
        C17542s.j(p32, "eventCollector");
        C17542s.j(v32, "eventStorage");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(b10, "dispatcher");
        this.f42287a = p32;
        this.f42288b = v32;
        this.f42289c = cVar;
        this.f42290d = S.a(b10);
        this.f42292f = new LinkedHashMap();
        this.f42294h = C6882m4.API_USAGE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a9.T3.d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            a9.T3$d r0 = (a9.T3.d) r0
            int r1 = r0.f42304f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42304f = r1
            goto L_0x0018
        L_0x0013:
            a9.T3$d r0 = new a9.T3$d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f42302d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42304f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a9.T3 r0 = r0.f42301c
            XH.y.b(r5)
            goto L_0x004e
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            boolean r5 = r4.f42293g
            if (r5 == 0) goto L_0x0051
            QJ.F0 r5 = r4.f42291e
            if (r5 == 0) goto L_0x0042
            r2 = 0
            QJ.F0.a.a(r5, r2, r3, r2)
        L_0x0042:
            r0.f42301c = r4
            r0.f42304f = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            r5 = 0
            r0.f42293g = r5
        L_0x0051:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.T3.a(dI.e):java.lang.Object");
    }

    public final C6882m4 b() {
        return this.f42294h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a9.C6802c4
            if (r0 == 0) goto L_0x0013
            r0 = r5
            a9.c4 r0 = (a9.C6802c4) r0
            int r1 = r0.f42484f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f42484f = r1
            goto L_0x0018
        L_0x0013:
            a9.c4 r0 = new a9.c4
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f42482d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42484f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a9.T3 r0 = r0.f42481c
            XH.y.b(r5)
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            XH.y.b(r5)
            java.util.LinkedHashMap r5 = r4.f42292f
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0041
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x0041:
            a9.V3 r5 = r4.f42288b
            java.util.LinkedHashMap r2 = r4.f42292f
            java.util.Collection r2 = r2.values()
            java.util.List r2 = YH.C16877v.t1(r2)
            r0.f42481c = r4
            r0.f42484f = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r4
        L_0x0059:
            java.util.LinkedHashMap r5 = r0.f42292f
            r5.clear()
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.T3.c(dI.e):java.lang.Object");
    }
}
