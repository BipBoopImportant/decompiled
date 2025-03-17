package DI;

import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nJ.C17656k;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;
import uJ.y0;
import vJ.g;

public final class g0<T extends C17656k> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f133835e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f133836f = {P.h(new G(g0.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: a  reason: collision with root package name */
    private final C15558e f133837a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<g, T> f133838b;

    /* renamed from: c  reason: collision with root package name */
    private final g f133839c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i f133840d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends C17656k> g0<T> a(C15558e eVar, C17994n nVar, g gVar, C17642l<? super g, ? extends T> lVar) {
            C17542s.j(eVar, "classDescriptor");
            C17542s.j(nVar, "storageManager");
            C17542s.j(gVar, "kotlinTypeRefinerForOwnerModule");
            C17542s.j(lVar, "scopeFactory");
            return new g0(eVar, nVar, lVar, gVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ g0(C15558e eVar, C17994n nVar, C17642l lVar, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, nVar, lVar, gVar);
    }

    /* access modifiers changed from: private */
    public static final C17656k d(g0 g0Var, g gVar) {
        return (C17656k) g0Var.f133838b.invoke(gVar);
    }

    private final T e() {
        return (C17656k) C17993m.a(this.f133840d, this, f133836f[0]);
    }

    /* access modifiers changed from: private */
    public static final C17656k f(g0 g0Var) {
        return (C17656k) g0Var.f133838b.invoke(g0Var.f133839c);
    }

    public final T c(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        if (!gVar.d(C17506e.s(this.f133837a))) {
            return e();
        }
        y0 k10 = this.f133837a.k();
        C17542s.i(k10, "getTypeConstructor(...)");
        return !gVar.e(k10) ? e() : gVar.c(this.f133837a, new f0(this, gVar));
    }

    private g0(C15558e eVar, C17994n nVar, C17642l<? super g, ? extends T> lVar, g gVar) {
        this.f133837a = eVar;
        this.f133838b = lVar;
        this.f133839c = gVar;
        this.f133840d = nVar.d(new e0(this));
    }
}
