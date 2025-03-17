package a9;

import E8.b;
import E8.c;
import HJ.C15854t;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.json.JSONObject;
import rI.C17853c;
import u8.C8886a;

public final class X4 implements C6857j3 {

    /* renamed from: a  reason: collision with root package name */
    public final I1<C6970x5> f42384a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42385b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f42386c;

    /* renamed from: d  reason: collision with root package name */
    public final Q f42387d;

    /* renamed from: e  reason: collision with root package name */
    public F0 f42388e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42389f;

    /* renamed from: g  reason: collision with root package name */
    public final C16824o f42390g;

    @f(c = "com.contentsquare.android.internal.core.telemetry.agent.NetworkAgent$start$1", f = "NetworkAgent.kt", l = {80}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f42391c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ X4 f42392d;

        /* renamed from: a9.X4$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0742a extends C17525a implements p<C6970x5, C17164e<? super C16807N>, Object> {
            public C0742a(C6857j3 j3Var) {
                super(2, j3Var, X4.class, PlaceTypes.STORE, "store(Lcom/contentsquare/android/internal/core/telemetry/event/NetworkMetric;)V", 4);
            }

            public final Object invoke(Object obj, Object obj2) {
                C6970x5 x5Var = (C6970x5) obj;
                C17164e eVar = (C17164e) obj2;
                X4 x42 = (X4) this.f144363a;
                LinkedHashMap linkedHashMap = x42.f42386c;
                X4.c(linkedHashMap, C15854t.t1(x5Var.f42945d, "?", (String) null, 2, (Object) null) + ".upload", x5Var.f42942a);
                LinkedHashMap linkedHashMap2 = x42.f42386c;
                X4.c(linkedHashMap2, C15854t.t1(x5Var.f42945d, "?", (String) null, 2, (Object) null) + ".download", x5Var.f42943b);
                if (x5Var.f42944c) {
                    LinkedHashMap linkedHashMap3 = x42.f42386c;
                    X4.c(linkedHashMap3, C15854t.t1(x5Var.f42945d, "?", (String) null, 2, (Object) null) + ".failure", 1);
                } else {
                    LinkedHashMap linkedHashMap4 = x42.f42386c;
                    X4.c(linkedHashMap4, C15854t.t1(x5Var.f42945d, "?", (String) null, 2, (Object) null) + ".success", 1);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(X4 x42, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f42392d = x42;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f42392d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new a(this.f42392d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f42391c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<C6970x5> R10 = C16534i.R(this.f42392d.f42384a.a(), new C0742a(this.f42392d));
                this.f42391c = 1;
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

    public X4() {
        throw null;
    }

    public static void c(Map map, String str, long j10) {
        long j11 = 0;
        if (j10 > 0) {
            Long l10 = (Long) map.get(str);
            if (l10 != null) {
                j11 = l10.longValue();
            }
            map.put(str, Long.valueOf(j11 + j10));
        }
    }

    public final int a() {
        return this.f42389f ? 1 : 2;
    }

    public final Object b(C17164e<? super JSONObject> eVar) {
        JSONObject jSONObject = new JSONObject();
        String name = this.f42384a.getName();
        LinkedHashMap linkedHashMap = this.f42386c;
        C17542s.h(linkedHashMap, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        JSONObject put = jSONObject.put(name, new JSONObject(linkedHashMap));
        C17542s.i(put, "JSONObject().put(network…ct(storage as Map<*, *>))");
        return put;
    }

    public final void start() {
        if (!this.f42389f && D6.a(C8886a.f56874d.a(), "telemetry_network")) {
            c cVar = this.f42385b;
            b bVar = b.TELEMETRY_NETWORK_MONITORING_RATE;
            int d10 = cVar.d(bVar, -1);
            if (d10 == -1) {
                d10 = C17853c.f146670a.e(100);
                this.f42385b.j(bVar, d10);
            }
            if (d10 >= 0 && d10 < 11) {
                ((D8.c) this.f42390g.getValue()).f("Start collecting Network Metrics");
                this.f42388e = C16314k.d(this.f42387d, (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
                this.f42389f = true;
            }
        }
    }

    public X4(C6835g5 g5Var, c cVar) {
        M b10 = C16311i0.b();
        C17542s.j(g5Var, "networkMetricProvider");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(b10, "dispatcher");
        this.f42384a = g5Var;
        this.f42385b = cVar;
        this.f42386c = new LinkedHashMap();
        this.f42387d = S.a(b10);
        this.f42390g = C16825p.b(O4.f42180c);
    }

    public final Object a(C17164e<? super C16807N> eVar) {
        if (this.f42389f) {
            F0 f02 = this.f42388e;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f42389f = false;
            ((D8.c) this.f42390g.getValue()).f("Stop collecting Network Metrics");
        }
        return C16807N.f139792a;
    }

    public final C6882m4 b() {
        return C6882m4.NETWORK;
    }

    public final void c() {
        if (this.f42389f) {
            this.f42386c.clear();
        }
    }
}
