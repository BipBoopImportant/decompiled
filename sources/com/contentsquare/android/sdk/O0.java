package com.contentsquare.android.sdk;

import D8.c;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.b1;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import a9.C6811d5;
import a9.C6875l5;
import a9.C6938t5;
import a9.C6945u4;
import a9.D5;
import a9.N6;
import a9.O5;
import a9.T4;
import a9.U5;
import com.contentsquare.android.sdk.C7162y0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import org.json.JSONObject;

public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    public final N6 f47072a;

    /* renamed from: b  reason: collision with root package name */
    public final c f47073b = new c("AnalyticsPipeline");

    /* renamed from: c  reason: collision with root package name */
    public final Q f47074c;

    /* renamed from: d  reason: collision with root package name */
    public final C16434j<C7162y0.a<?>> f47075d;

    /* renamed from: e  reason: collision with root package name */
    public final C16532g<JSONObject> f47076e;

    /* renamed from: f  reason: collision with root package name */
    public final C16504A<JSONObject> f47077f;

    /* renamed from: g  reason: collision with root package name */
    public F0 f47078g;

    /* renamed from: h  reason: collision with root package name */
    public C7121e f47079h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47080i;

    @f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$emitActionEventBuilder$1", f = "AnalyticsPipeline.kt", l = {108}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f47081c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ O0 f47082d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C7162y0.a<?> f47083e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(O0 o02, C7162y0.a<?> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f47082d = o02;
            this.f47083e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f47082d, this.f47083e, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new a(this.f47082d, this.f47083e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f47081c;
            if (i10 == 0) {
                y.b(obj);
                C16434j<C7162y0.a<?>> jVar = this.f47082d.f47075d;
                C7162y0.a<?> aVar = this.f47083e;
                this.f47081c = 1;
                if (jVar.y(aVar, this) == f10) {
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

    public O0(t1 t1Var) {
        C17542s.j(t1Var, "trackingState");
        M K02 = C16311i0.a().K0(1);
        C17542s.j(t1Var, "trackingState");
        C17542s.j(K02, "coroutineDispatcher");
        this.f47072a = t1Var;
        Q a10 = S.a(b1.b((F0) null, 1, (Object) null).plus(K02));
        this.f47074c = a10;
        C16434j<C7162y0.a<?>> b10 = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);
        this.f47075d = b10;
        this.f47076e = C16534i.A(new U5(C16534i.L(C16534i.A(new O5(C16534i.A(new D5(C16534i.A(new C6938t5(C16534i.A(new C6875l5(C16534i.A(new C6811d5(new T4(C16534i.V(b10), this), this)), this)), this)), this)), this)), C16311i0.c().P0()), this));
        this.f47077f = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f47080i = true;
        F0 unused = C16314k.d(a10, (C17168i) null, (T) null, new C6945u4(this, (C17164e<? super C6945u4>) null), 3, (Object) null);
    }

    public final void a(C7162y0.a<?> aVar) {
        C17542s.j(aVar, "builder");
        F0 unused = C16314k.d(this.f47074c, C16311i0.c().P0(), (T) null, new a(this, aVar, (C17164e<? super a>) null), 2, (Object) null);
    }
}
