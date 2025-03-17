package Uc;

import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4872f;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4897q;
import U0.C4899r0;
import U0.C4904u;
import U0.C4910x;
import U0.F1;
import U0.J0;
import U0.M0;
import XH.C16807N;
import XH.C16814e;
import XH.C16820k;
import XH.x;
import XH.y;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.C5100f0;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import c2.d;
import c2.t;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import dI.C17164e;
import dI.C17168i;
import dI.C17170k;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oa.C8619c;
import oa.C8620d;
import oa.C8622f;
import s0.C5834E;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007¢\u0006\u0004\b#\u0010$\u001aA\u0010/\u001a\u00020.*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0002¢\u0006\u0004\b/\u00100\"\u0018\u00104\u001a\u000201*\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103*\u0016\u00105\"\b\u0012\u0004\u0012\u00020\u00150\b2\b\u0012\u0004\u0012\u00020\u00150\b¨\u0006:²\u0006\u0012\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\nX\u0002²\u0006\u0010\u00107\u001a\u0004\u0018\u00010.8\n@\nX\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002²\u0006\f\u00108\u001a\u00020\u000b8\nX\u0002²\u0006\f\u00109\u001a\u00020\u00028\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "mergeDescendants", "LUc/d;", "cameraPositionState", "", "contentDescription", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "googleMapOptionsFactory", "LUc/c0;", "properties", "Loa/d;", "locationSource", "LUc/l0;", "uiSettings", "LUc/x;", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "LXH/N;", "onMapClick", "onMapLongClick", "onMapLoaded", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "Lqa/j;", "onPOIClick", "Ls0/E;", "contentPadding", "LUc/l;", "mapColorScheme", "content", "h", "(Landroidx/compose/ui/d;ZLUc/d;Ljava/lang/String;LnI/a;LUc/c0;Loa/d;LUc/l0;LUc/x;LnI/l;LnI/l;LnI/a;LnI/a;LnI/l;LnI/l;Ls0/E;LUc/l;LnI/p;LU0/m;III)V", "LQJ/Q;", "LUc/P0;", "mapUpdaterState", "LU0/r;", "parentComposition", "Lcom/google/android/gms/maps/MapView;", "mapView", "LUc/N;", "mapClickListeners", "LQJ/F0;", "t", "(LQJ/Q;LUc/P0;LU0/r;Lcom/google/android/gms/maps/MapView;LUc/N;LnI/p;)LQJ/F0;", "LUc/j0;", "s", "(Lcom/google/android/gms/maps/MapView;)LUc/j0;", "tagData", "GoogleMapFactory", "currentContent", "subcompositionJob", "mapProperties", "mapVisible", "maps-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.v  reason: case insensitive filesystem */
public final class C9332v {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Uc/v$a", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "LXH/N;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.v$a */
    public static final class a implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MapView f64425a;

        a(MapView mapView) {
            this.f64425a = mapView;
        }

        public void onConfigurationChanged(Configuration configuration) {
            C17542s.j(configuration, "newConfig");
        }

        @C16814e
        public void onLowMemory() {
            this.f64425a.d();
        }

        public void onTrimMemory(int i10) {
            this.f64425a.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Uc/v$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "mapView", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Landroidx/lifecycle/r;", "a", "Landroidx/lifecycle/r;", "lifecycle", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.v$b */
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private r f64426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z f64427b;

        b(Z z10) {
            this.f64427b = z10;
        }

        public void onViewAttachedToWindow(View view) {
            C17542s.j(view, "mapView");
            C5221y a10 = l0.a(view);
            C17542s.g(a10);
            r lifecycle = a10.getLifecycle();
            lifecycle.c(this.f64427b);
            this.f64426a = lifecycle;
        }

        public void onViewDetachedFromWindow(View view) {
            C17542s.j(view, "v");
            r rVar = this.f64426a;
            if (rVar != null) {
                rVar.g(this.f64427b);
            }
            this.f64426a = null;
            this.f64427b.d();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1", f = "GoogleMap.kt", l = {386, 235}, m = "invokeSuspend")
    /* renamed from: Uc.v$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f64428c;

        /* renamed from: d  reason: collision with root package name */
        int f64429d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MapView f64430e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N f64431f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ U0.r f64432g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ P0 f64433h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f64434i;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Uc.v$c$a */
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ P0 f64435a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f64436b;

            a(P0 p02, p<? super C4889m, ? super Integer, C16807N> pVar) {
                this.f64435a = p02;
                this.f64436b = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(704030801, i10, -1, "com.google.maps.android.compose.launchSubcomposition.<anonymous>.<anonymous> (GoogleMap.kt:225)");
                    }
                    P0 p02 = this.f64435a;
                    mVar.W(-2039993954);
                    C4872f<?> m10 = mVar.m();
                    C17542s.h(m10, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                    C8619c I10 = ((L) m10).I();
                    C4872f<?> m11 = mVar.m();
                    C17542s.h(m11, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                    MapView K10 = ((L) m11).K();
                    if (p02.h()) {
                        K10.setImportantForAccessibility(4);
                    }
                    d dVar = (d) mVar.Q(C5100f0.e());
                    t tVar = (t) mVar.Q(C5100f0.k());
                    mVar.W(-513396093);
                    boolean V10 = mVar.V(p02) | mVar.F(I10) | mVar.V(dVar) | mVar.V(tVar);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C9318n0(p02, I10, dVar, tVar);
                        mVar.u(D10);
                    }
                    C17631a aVar = (C17631a) D10;
                    mVar.P();
                    if (!(mVar.m() instanceof L)) {
                        C4883j.c();
                    }
                    mVar.o();
                    if (mVar.i()) {
                        mVar.p(aVar);
                    } else {
                        mVar.t();
                    }
                    C4889m a10 = F1.a(mVar);
                    F1.d(a10, dVar, C9339y0.f64464a);
                    F1.d(a10, tVar, G0.f64159a);
                    F1.d(a10, p02.b(), H0.f64161a);
                    F1.d(a10, p02.c(), new I0(I10));
                    F1.c(a10, p02.d(), new J0(I10));
                    F1.c(a10, Boolean.valueOf(p02.f().f()), new K0(I10));
                    F1.c(a10, Boolean.valueOf(p02.f().g()), new L0(I10));
                    F1.c(a10, Boolean.valueOf(p02.f().h()), new M0(I10));
                    F1.c(a10, Boolean.valueOf(p02.f().i()), new N0(I10));
                    F1.c(a10, p02.f().a(), new C9320o0(I10));
                    F1.c(a10, p02.f().b(), new C9322p0(I10));
                    F1.c(a10, p02.f().c(), new C9324q0(I10));
                    F1.c(a10, Float.valueOf(p02.f().d()), new C9325r0(I10));
                    F1.c(a10, Float.valueOf(p02.f().e()), new C9327s0(I10));
                    F1.c(a10, p02.e(), new C9329t0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().a()), new C9331u0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().b()), new C9333v0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().c()), new C9335w0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().d()), new C9337x0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().e()), new C9341z0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().f()), new A0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().g()), new B0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().h()), new C0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().i()), new D0(I10));
                    F1.c(a10, Boolean.valueOf(p02.g().j()), new E0(I10));
                    F1.d(a10, p02.a(), F0.f64157a);
                    mVar.x();
                    mVar.P();
                    Y.n(mVar, 0);
                    C4910x.a(C9305h.c().d(this.f64435a.a()), this.f64436b, mVar, J0.f13770i);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/c;", "it", "LXH/N;", "a", "(Loa/c;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: Uc.v$c$b */
        public static final class b implements C8622f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17164e f64437a;

            public b(C17164e eVar) {
                this.f64437a = eVar;
            }

            public final void a(C8619c cVar) {
                C17542s.j(cVar, "it");
                this.f64437a.resumeWith(x.b(cVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MapView mapView, N n10, U0.r rVar, P0 p02, p<? super C4889m, ? super Integer, C16807N> pVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f64430e = mapView;
            this.f64431f = n10;
            this.f64432g = rVar;
            this.f64433h = p02;
            this.f64434i = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f64430e, this.f64431f, this.f64432g, this.f64433h, this.f64434i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            C4897q qVar;
            Object f10 = C17187b.f();
            int i10 = this.f64429d;
            if (i10 == 0) {
                y.b(obj);
                MapView mapView = this.f64430e;
                this.f64428c = mapView;
                this.f64429d = 1;
                C17170k kVar = new C17170k(C17187b.c(this));
                mapView.a(new b(kVar));
                obj = kVar.a();
                if (obj == C17187b.f()) {
                    h.c(this);
                }
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                MapView mapView2 = (MapView) this.f64428c;
                y.b(obj);
            } else if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                qVar = (C4897q) this.f64428c;
                try {
                    y.b(obj);
                    throw new C16820k();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            C4897q a10 = C4904u.a(new L((C8619c) obj, this.f64430e, this.f64431f), this.f64432g);
            try {
                a10.m(c1.c.c(704030801, true, new a(this.f64433h, this.f64434i)));
                this.f64428c = a10;
                this.f64429d = 2;
                if (C16297b0.a(this) == f10) {
                    return f10;
                }
                qVar = a10;
                throw new C16820k();
            } catch (Throwable th4) {
                Throwable th5 = th4;
                qVar = a10;
                th2 = th5;
                qVar.b();
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: Uc.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v2, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: oa.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: Uc.P0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: Uc.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v5, resolved type: Uc.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v6, resolved type: Uc.P0} */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05fc, code lost:
        if (r14 == r11.a()) goto L_0x05fe;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.d r44, boolean r45, Uc.C9296d r46, java.lang.String r47, nI.C17631a<com.google.android.gms.maps.GoogleMapOptions> r48, Uc.C9294c0 r49, oa.C8620d r50, Uc.C9314l0 r51, Uc.C9336x r52, nI.C17642l<? super com.google.android.gms.maps.model.LatLng, XH.C16807N> r53, nI.C17642l<? super com.google.android.gms.maps.model.LatLng, XH.C16807N> r54, nI.C17631a<XH.C16807N> r55, nI.C17631a<java.lang.Boolean> r56, nI.C17642l<? super android.location.Location, XH.C16807N> r57, nI.C17642l<? super qa.j, XH.C16807N> r58, s0.C5834E r59, Uc.C9313l r60, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r61, U0.C4889m r62, int r63, int r64, int r65) {
        /*
            r0 = r52
            r15 = r63
            r14 = r64
            r13 = r65
            r1 = 392639401(0x176733a9, float:7.470533E-25)
            r2 = r62
            U0.m r1 = r2.k(r1)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001b
            r4 = r15 | 6
            r5 = r4
            r4 = r44
            goto L_0x002f
        L_0x001b:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x002c
            r4 = r44
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0029
            r5 = 4
            goto L_0x002a
        L_0x0029:
            r5 = 2
        L_0x002a:
            r5 = r5 | r15
            goto L_0x002f
        L_0x002c:
            r4 = r44
            r5 = r15
        L_0x002f:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0038
            r5 = r5 | 48
        L_0x0035:
            r10 = r45
            goto L_0x004a
        L_0x0038:
            r10 = r15 & 48
            if (r10 != 0) goto L_0x0035
            r10 = r45
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r5 = r5 | r11
        L_0x004a:
            r11 = r15 & 384(0x180, float:5.38E-43)
            r16 = 256(0x100, float:3.59E-43)
            if (r11 != 0) goto L_0x0066
            r11 = r13 & 4
            if (r11 != 0) goto L_0x005f
            r11 = r46
            boolean r17 = r1.V(r11)
            if (r17 == 0) goto L_0x0061
            r17 = r16
            goto L_0x0063
        L_0x005f:
            r11 = r46
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r17
            goto L_0x0068
        L_0x0066:
            r11 = r46
        L_0x0068:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0075
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r3 = r47
            goto L_0x0088
        L_0x0075:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0072
            r3 = r47
            boolean r20 = r1.V(r3)
            if (r20 == 0) goto L_0x0084
            r20 = r19
            goto L_0x0086
        L_0x0084:
            r20 = r18
        L_0x0086:
            r5 = r5 | r20
        L_0x0088:
            r20 = r13 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x0093
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r7 = r48
            goto L_0x00a6
        L_0x0093:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0090
            r7 = r48
            boolean r24 = r1.F(r7)
            if (r24 == 0) goto L_0x00a2
            r24 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r24 = r21
        L_0x00a4:
            r5 = r5 | r24
        L_0x00a6:
            r24 = r13 & 32
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00b3
            r5 = r5 | r26
            r12 = r49
            goto L_0x00c6
        L_0x00b3:
            r27 = r15 & r26
            r12 = r49
            if (r27 != 0) goto L_0x00c6
            boolean r28 = r1.V(r12)
            if (r28 == 0) goto L_0x00c2
            r28 = r25
            goto L_0x00c4
        L_0x00c2:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r5 = r5 | r28
        L_0x00c6:
            r28 = r13 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00d1
            r5 = r5 | r29
            r9 = r50
            goto L_0x00e4
        L_0x00d1:
            r30 = r15 & r29
            r9 = r50
            if (r30 != 0) goto L_0x00e4
            boolean r31 = r1.F(r9)
            if (r31 == 0) goto L_0x00e0
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r31
        L_0x00e4:
            r8 = r13 & 128(0x80, float:1.794E-43)
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00f1
            r5 = r5 | r32
        L_0x00ec:
            r33 = r8
            r8 = r51
            goto L_0x0106
        L_0x00f1:
            r33 = r15 & r32
            if (r33 != 0) goto L_0x00ec
            r33 = r8
            r8 = r51
            boolean r34 = r1.V(r8)
            if (r34 == 0) goto L_0x0102
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r5 = r5 | r34
        L_0x0106:
            r8 = r13 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x010f
        L_0x010c:
            r5 = r5 | r34
            goto L_0x012a
        L_0x010f:
            r34 = r15 & r34
            if (r34 != 0) goto L_0x012a
            r34 = 134217728(0x8000000, float:3.85186E-34)
            r34 = r15 & r34
            if (r34 != 0) goto L_0x011e
            boolean r34 = r1.V(r0)
            goto L_0x0122
        L_0x011e:
            boolean r34 = r1.F(r0)
        L_0x0122:
            if (r34 == 0) goto L_0x0127
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x0127:
            r34 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010c
        L_0x012a:
            r34 = r8
            r8 = r13 & 512(0x200, float:7.175E-43)
            r35 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0139
            r5 = r5 | r35
        L_0x0134:
            r35 = r8
            r8 = r53
            goto L_0x014e
        L_0x0139:
            r35 = r15 & r35
            if (r35 != 0) goto L_0x0134
            r35 = r8
            r8 = r53
            boolean r36 = r1.F(r8)
            if (r36 == 0) goto L_0x014a
            r36 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r36 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r5 = r5 | r36
        L_0x014e:
            r8 = r13 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x015b
            r36 = r14 | 6
            r37 = r36
            r36 = r8
            r8 = r54
            goto L_0x0177
        L_0x015b:
            r36 = r14 & 6
            if (r36 != 0) goto L_0x0171
            r36 = r8
            r8 = r54
            boolean r37 = r1.F(r8)
            if (r37 == 0) goto L_0x016c
            r37 = 4
            goto L_0x016e
        L_0x016c:
            r37 = 2
        L_0x016e:
            r37 = r14 | r37
            goto L_0x0177
        L_0x0171:
            r36 = r8
            r8 = r54
            r37 = r14
        L_0x0177:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0184
            r37 = r37 | 48
            r38 = r8
            r0 = r37
            r8 = r55
            goto L_0x01a1
        L_0x0184:
            r38 = r14 & 48
            if (r38 != 0) goto L_0x019c
            r38 = r8
            r8 = r55
            boolean r39 = r1.F(r8)
            if (r39 == 0) goto L_0x0195
            r31 = 32
            goto L_0x0197
        L_0x0195:
            r31 = 16
        L_0x0197:
            r37 = r37 | r31
        L_0x0199:
            r0 = r37
            goto L_0x01a1
        L_0x019c:
            r38 = r8
            r8 = r55
            goto L_0x0199
        L_0x01a1:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x01aa
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x01a7:
            r3 = r56
            goto L_0x01bb
        L_0x01aa:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x01a7
            r3 = r56
            boolean r23 = r1.F(r3)
            if (r23 == 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r16 = 128(0x80, float:1.794E-43)
        L_0x01b9:
            r0 = r0 | r16
        L_0x01bb:
            r16 = r8
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01c6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01c3:
            r3 = r57
            goto L_0x01d6
        L_0x01c6:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x01c3
            r3 = r57
            boolean r22 = r1.F(r3)
            if (r22 == 0) goto L_0x01d4
            r18 = r19
        L_0x01d4:
            r0 = r0 | r18
        L_0x01d6:
            r18 = r8
            r8 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01e1
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01de:
            r3 = r58
            goto L_0x01f1
        L_0x01e1:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x01de
            r3 = r58
            boolean r19 = r1.F(r3)
            if (r19 == 0) goto L_0x01ef
            r21 = 16384(0x4000, float:2.2959E-41)
        L_0x01ef:
            r0 = r0 | r21
        L_0x01f1:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r13 & r19
            if (r19 == 0) goto L_0x01ff
            r0 = r0 | r26
        L_0x01fa:
            r21 = r8
            r8 = r59
            goto L_0x0214
        L_0x01ff:
            r21 = r14 & r26
            if (r21 != 0) goto L_0x01fa
            r21 = r8
            r8 = r59
            boolean r22 = r1.V(r8)
            if (r22 == 0) goto L_0x0210
            r22 = r25
            goto L_0x0212
        L_0x0210:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x0212:
            r0 = r0 | r22
        L_0x0214:
            r22 = 65536(0x10000, float:9.18355E-41)
            r22 = r13 & r22
            if (r22 == 0) goto L_0x021f
            r0 = r0 | r29
            r8 = r60
            goto L_0x0232
        L_0x021f:
            r23 = r14 & r29
            r8 = r60
            if (r23 != 0) goto L_0x0232
            boolean r23 = r1.V(r8)
            if (r23 == 0) goto L_0x022e
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0230
        L_0x022e:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x0230:
            r0 = r0 | r23
        L_0x0232:
            r23 = r13 & r25
            if (r23 == 0) goto L_0x023b
            r0 = r0 | r32
            r8 = r61
            goto L_0x024e
        L_0x023b:
            r25 = r14 & r32
            r8 = r61
            if (r25 != 0) goto L_0x024e
            boolean r25 = r1.F(r8)
            if (r25 == 0) goto L_0x024a
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x024c
        L_0x024a:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x024c:
            r0 = r0 | r25
        L_0x024e:
            r25 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r5 & r25
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x028b
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r0
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r4) goto L_0x028b
            boolean r3 = r1.l()
            if (r3 != 0) goto L_0x0268
            goto L_0x028b
        L_0x0268:
            r1.L()
            r3 = r44
            r4 = r47
            r15 = r54
            r13 = r56
            r14 = r57
            r23 = r58
            r16 = r59
            r17 = r60
            r5 = r7
            r18 = r8
            r7 = r9
            r2 = r10
            r6 = r12
            r8 = r51
            r9 = r52
            r10 = r53
            r12 = r55
            goto L_0x0655
        L_0x028b:
            r1.G()
            r3 = r15 & 1
            r4 = 0
            r8 = 0
            if (r3 == 0) goto L_0x02c2
            boolean r3 = r1.O()
            if (r3 == 0) goto L_0x029b
            goto L_0x02c2
        L_0x029b:
            r1.L()
            r2 = r13 & 4
            if (r2 == 0) goto L_0x02a4
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02a4:
            r3 = r44
            r17 = r60
            r2 = r4
            r6 = r5
            r4 = r11
            r5 = r47
            r60 = r59
            r11 = r8
            r8 = r51
            r59 = r58
            r58 = r57
            r57 = r56
            r56 = r55
            r55 = r54
            r54 = r53
            r53 = r52
            goto L_0x03e2
        L_0x02c2:
            if (r2 == 0) goto L_0x02c9
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r25 = r2
            goto L_0x02cb
        L_0x02c9:
            r25 = r44
        L_0x02cb:
            if (r6 == 0) goto L_0x02ce
            r10 = r4
        L_0x02ce:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x031b
            r2 = -1911106014(0xffffffff8e16d622, float:-1.8592029E-30)
            r1.W(r2)
            Uc.f r2 = Uc.C9301f.f64281a
            Uc.d$a r3 = Uc.C9296d.f64230h
            f1.k r3 = r3.a()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            Uc.g r11 = new Uc.g
            r11.<init>(r2)
            r26 = 0
            r29 = 0
            r31 = 0
            r2 = r6
            r6 = r4
            r4 = r31
            r40 = r5
            r5 = r11
            r11 = r6
            r6 = r1
            r7 = r26
            r11 = r8
            r32 = r16
            r16 = r33
            r26 = r36
            r31 = r38
            r33 = r18
            r18 = r34
            r34 = r21
            r21 = r35
            r8 = r29
            java.lang.Object r2 = f1.C5301c.e(r2, r3, r4, r5, r6, r7, r8)
            Uc.d r2 = (Uc.C9296d) r2
            r1.P()
            r5 = r40
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r3 = r2
            r2 = 0
            goto L_0x032f
        L_0x031b:
            r2 = r4
            r11 = r8
            r32 = r16
            r16 = r33
            r26 = r36
            r31 = r38
            r33 = r18
            r18 = r34
            r34 = r21
            r21 = r35
            r3 = r46
        L_0x032f:
            if (r17 == 0) goto L_0x0333
            r4 = r11
            goto L_0x0335
        L_0x0333:
            r4 = r47
        L_0x0335:
            if (r20 == 0) goto L_0x0357
            r6 = 765269487(0x2d9d15ef, float:1.7858574E-11)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x0351
            Uc.o r6 = new Uc.o
            r6.<init>()
            r1.u(r6)
        L_0x0351:
            nI.a r6 = (nI.C17631a) r6
            r1.P()
            goto L_0x0359
        L_0x0357:
            r6 = r48
        L_0x0359:
            if (r24 == 0) goto L_0x0360
            Uc.c0 r7 = Uc.C9297d0.a()
            r12 = r7
        L_0x0360:
            if (r28 == 0) goto L_0x0363
            r9 = r11
        L_0x0363:
            if (r16 == 0) goto L_0x036a
            Uc.l0 r7 = Uc.C9316m0.a()
            goto L_0x036c
        L_0x036a:
            r7 = r51
        L_0x036c:
            if (r18 == 0) goto L_0x0371
            Uc.m r8 = Uc.C9315m.f64340a
            goto L_0x0373
        L_0x0371:
            r8 = r52
        L_0x0373:
            if (r21 == 0) goto L_0x0378
            r16 = r11
            goto L_0x037a
        L_0x0378:
            r16 = r53
        L_0x037a:
            if (r26 == 0) goto L_0x037f
            r17 = r11
            goto L_0x0381
        L_0x037f:
            r17 = r54
        L_0x0381:
            if (r31 == 0) goto L_0x0386
            r18 = r11
            goto L_0x0388
        L_0x0386:
            r18 = r55
        L_0x0388:
            if (r32 == 0) goto L_0x038d
            r20 = r11
            goto L_0x038f
        L_0x038d:
            r20 = r56
        L_0x038f:
            if (r33 == 0) goto L_0x0394
            r21 = r11
            goto L_0x0396
        L_0x0394:
            r21 = r57
        L_0x0396:
            if (r34 == 0) goto L_0x039b
            r24 = r11
            goto L_0x039d
        L_0x039b:
            r24 = r58
        L_0x039d:
            if (r19 == 0) goto L_0x03a4
            s0.E r19 = Uc.O0.c()
            goto L_0x03a6
        L_0x03a4:
            r19 = r59
        L_0x03a6:
            if (r22 == 0) goto L_0x03ab
            r22 = r11
            goto L_0x03ad
        L_0x03ab:
            r22 = r60
        L_0x03ad:
            if (r23 == 0) goto L_0x03d1
            Uc.j r23 = Uc.C9309j.f64316a
            nI.p r23 = r23.a()
            r53 = r8
            r54 = r16
            r55 = r17
            r56 = r18
            r60 = r19
            r57 = r20
            r58 = r21
            r17 = r22
            r61 = r23
        L_0x03c7:
            r59 = r24
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r25
            goto L_0x03e2
        L_0x03d1:
            r53 = r8
            r54 = r16
            r55 = r17
            r56 = r18
            r60 = r19
            r57 = r20
            r58 = r21
            r17 = r22
            goto L_0x03c7
        L_0x03e2:
            r1.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x03f3
            r11 = 392639401(0x176733a9, float:7.470533E-25)
            java.lang.String r2 = "com.google.maps.android.compose.GoogleMap (GoogleMap.kt:101)"
            U0.C4895p.S(r11, r6, r0, r2)
        L_0x03f3:
            r2 = 765296177(0x2d9d7e31, float:1.7904874E-11)
            r1.W(r2)
            U0.I0 r2 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r2 = r1.Q(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0453
            r0 = r6 & 14
            androidx.compose.foundation.layout.C5077h.a(r3, r1, r0)
            r1.P()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x041a
            U0.C4895p.R()
        L_0x041a:
            U0.Y0 r11 = r1.n()
            if (r11 == 0) goto L_0x0452
            Uc.p r6 = new Uc.p
            r0 = r6
            r1 = r3
            r2 = r10
            r3 = r4
            r4 = r5
            r5 = r7
            r10 = r6
            r6 = r12
            r7 = r9
            r9 = r53
            r12 = r10
            r10 = r54
            r41 = r11
            r11 = r55
            r42 = r12
            r12 = r56
            r13 = r57
            r14 = r58
            r15 = r59
            r16 = r60
            r18 = r61
            r19 = r63
            r20 = r64
            r21 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r41
            r1 = r42
            r0.a(r1)
        L_0x0452:
            return
        L_0x0453:
            r1.P()
            r2 = 765305497(0x2d9da299, float:1.7921041E-11)
            r1.W(r2)
            java.lang.Object r2 = r1.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r13 = r11.a()
            if (r2 != r13) goto L_0x0470
            Uc.N r2 = new Uc.N
            r2.<init>()
            r1.u(r2)
        L_0x0470:
            Uc.N r2 = (Uc.N) r2
            r1.P()
            r13 = r53
            r2.h(r13)
            r14 = r54
            r2.i(r14)
            r15 = r55
            r2.k(r15)
            r19 = r13
            r13 = r56
            r2.j(r13)
            r20 = r13
            r13 = r57
            r2.l(r13)
            r21 = r13
            r13 = r58
            r2.m(r13)
            r22 = r13
            r13 = r59
            r2.n(r13)
            r23 = r13
            r13 = 765318486(0x2d9dd556, float:1.7943574E-11)
            r1.W(r13)
            java.lang.Object r13 = r1.D()
            r24 = r14
            java.lang.Object r14 = r11.a()
            if (r13 != r14) goto L_0x04da
            Uc.P0 r13 = new Uc.P0
            if (r17 == 0) goto L_0x04c1
            int r14 = r17.b()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x04c2
        L_0x04c1:
            r14 = 0
        L_0x04c2:
            r44 = r13
            r45 = r10
            r46 = r5
            r47 = r4
            r48 = r60
            r49 = r9
            r50 = r12
            r51 = r8
            r52 = r14
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52)
            r1.u(r13)
        L_0x04da:
            Uc.P0 r13 = (Uc.P0) r13
            r1.P()
            r13.p(r10)
            r13.j(r5)
            r13.i(r4)
            r14 = r60
            r13.k(r14)
            r13.l(r9)
            r13.n(r12)
            r13.o(r8)
            if (r17 == 0) goto L_0x0505
            int r25 = r17.b()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r25)
            r52 = r4
            r4 = r25
            goto L_0x0508
        L_0x0505:
            r52 = r4
            r4 = 0
        L_0x0508:
            r13.m(r4)
            r53 = r5
            r4 = 0
            U0.r r5 = U0.C4883j.d(r1, r4)
            int r0 = r0 >> 21
            r0 = r0 & 14
            r4 = r61
            U0.A1 r0 = U0.p1.q(r4, r1, r0)
            r18 = r4
            r4 = 765344000(0x2d9e3900, float:1.7987833E-11)
            r1.W(r4)
            java.lang.Object r4 = r1.D()
            r54 = r8
            java.lang.Object r8 = r11.a()
            if (r4 != r8) goto L_0x053a
            r4 = 0
            r8 = 2
            U0.r0 r4 = U0.u1.e(r4, r4, r8, r4)
            r1.u(r4)
            goto L_0x053c
        L_0x053a:
            r45 = r4
        L_0x053c:
            U0.r0 r4 = (U0.C4899r0) r4
            r1.P()
            java.lang.Object r8 = r1.D()
            r55 = r9
            java.lang.Object r9 = r11.a()
            if (r8 != r9) goto L_0x055c
            dI.j r8 = dI.C17169j.f142968a
            QJ.Q r8 = U0.P.k(r8, r1)
            U0.B r9 = new U0.B
            r9.<init>(r8)
            r1.u(r9)
            r8 = r9
        L_0x055c:
            U0.B r8 = (U0.B) r8
            QJ.Q r8 = r8.a()
            r9 = 765350821(0x2d9e53a5, float:1.7999666E-11)
            r1.W(r9)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r6
            r56 = r10
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r10) goto L_0x0574
            r9 = 1
            goto L_0x0575
        L_0x0574:
            r9 = 0
        L_0x0575:
            java.lang.Object r10 = r1.D()
            if (r9 != 0) goto L_0x0581
            java.lang.Object r9 = r11.a()
            if (r10 != r9) goto L_0x0589
        L_0x0581:
            Uc.q r10 = new Uc.q
            r10.<init>(r7)
            r1.u(r10)
        L_0x0589:
            r9 = r10
            nI.l r9 = (nI.C17642l) r9
            r1.P()
            r10 = 765402452(0x2d9f1d54, float:1.8089232E-11)
            r1.W(r10)
            java.lang.Object r10 = r1.D()
            r57 = r7
            java.lang.Object r7 = r11.a()
            if (r10 != r7) goto L_0x05a9
            Uc.r r10 = new Uc.r
            r10.<init>()
            r1.u(r10)
        L_0x05a9:
            r7 = r10
            nI.l r7 = (nI.C17642l) r7
            r1.P()
            r10 = 765404250(0x2d9f245a, float:1.809235E-11)
            r1.W(r10)
            java.lang.Object r10 = r1.D()
            r58 = r12
            java.lang.Object r12 = r11.a()
            if (r10 != r12) goto L_0x05c9
            Uc.s r10 = new Uc.s
            r10.<init>()
            r1.u(r10)
        L_0x05c9:
            nI.l r10 = (nI.C17642l) r10
            r1.P()
            r12 = 765413185(0x2d9f4741, float:1.810785E-11)
            r1.W(r12)
            boolean r12 = r1.F(r8)
            boolean r16 = r1.V(r13)
            r12 = r12 | r16
            boolean r16 = r1.F(r5)
            r12 = r12 | r16
            boolean r16 = r1.V(r2)
            r12 = r12 | r16
            boolean r16 = r1.V(r0)
            r12 = r12 | r16
            r16 = r14
            java.lang.Object r14 = r1.D()
            if (r12 != 0) goto L_0x05fe
            java.lang.Object r11 = r11.a()
            if (r14 != r11) goto L_0x0614
        L_0x05fe:
            Uc.t r14 = new Uc.t
            r44 = r14
            r45 = r8
            r46 = r13
            r47 = r5
            r48 = r2
            r49 = r4
            r50 = r0
            r44.<init>(r45, r46, r47, r48, r49, r50)
            r1.u(r14)
        L_0x0614:
            r0 = r14
            nI.l r0 = (nI.C17642l) r0
            r1.P()
            int r2 = r6 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 3456(0xd80, float:4.843E-42)
            r4 = 0
            r44 = r9
            r45 = r3
            r46 = r7
            r47 = r10
            r48 = r0
            r49 = r1
            r50 = r2
            r51 = r4
            androidx.compose.ui.viewinterop.e.b(r44, r45, r46, r47, r48, r49, r50, r51)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x063d
            U0.C4895p.R()
        L_0x063d:
            r11 = r52
            r4 = r53
            r8 = r54
            r7 = r55
            r2 = r56
            r5 = r57
            r6 = r58
            r9 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r10 = r24
        L_0x0655:
            U0.Y0 r1 = r1.n()
            if (r1 == 0) goto L_0x0676
            Uc.u r0 = new Uc.u
            r44 = r0
            r43 = r1
            r1 = r3
            r3 = r11
            r11 = r15
            r15 = r23
            r19 = r63
            r20 = r64
            r21 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r44
            r0 = r43
            r0.a(r1)
        L_0x0676:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.C9332v.h(androidx.compose.ui.d, boolean, Uc.d, java.lang.String, nI.a, Uc.c0, oa.d, Uc.l0, Uc.x, nI.l, nI.l, nI.a, nI.a, nI.l, nI.l, s0.E, Uc.l, nI.p, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final GoogleMapOptions i() {
        return new GoogleMapOptions();
    }

    private static final void j(C4899r0<F0> r0Var, F0 f02) {
        r0Var.setValue(f02);
    }

    /* access modifiers changed from: private */
    public static final MapView k(C17631a aVar, Context context) {
        C17542s.j(context, "context");
        MapView mapView = new MapView(context, (GoogleMapOptions) aVar.invoke());
        a aVar2 = new a(mapView);
        context.registerComponentCallbacks(aVar2);
        Z z10 = new Z(mapView);
        mapView.setTag(new C9310j0(aVar2, z10));
        mapView.addOnAttachStateChangeListener(new b(z10));
        return mapView;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(MapView mapView) {
        C17542s.j(mapView, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(MapView mapView) {
        C17542s.j(mapView, "mapView");
        C9310j0 s10 = s(mapView);
        ComponentCallbacks a10 = s10.a();
        Z b10 = s10.b();
        mapView.getContext().unregisterComponentCallbacks(a10);
        b10.f();
        mapView.setTag((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Q q10, P0 p02, U0.r rVar, N n10, C4899r0 r0Var, A1 a12, MapView mapView) {
        C17542s.j(mapView, "mapView");
        if (r(r0Var) == null) {
            j(r0Var, t(q10, p02, rVar, mapView, n10, q(a12)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(androidx.compose.ui.d dVar, boolean z10, C9296d dVar2, String str, C17631a aVar, C9294c0 c0Var, C8620d dVar3, C9314l0 l0Var, C9336x xVar, C17642l lVar, C17642l lVar2, C17631a aVar2, C17631a aVar3, C17642l lVar3, C17642l lVar4, C5834E e10, C9313l lVar5, p pVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        h(dVar, z10, dVar2, str, aVar, c0Var, dVar3, l0Var, xVar, lVar, lVar2, aVar2, aVar3, lVar3, lVar4, e10, lVar5, pVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(androidx.compose.ui.d dVar, boolean z10, C9296d dVar2, String str, C17631a aVar, C9294c0 c0Var, C8620d dVar3, C9314l0 l0Var, C9336x xVar, C17642l lVar, C17642l lVar2, C17631a aVar2, C17631a aVar3, C17642l lVar3, C17642l lVar4, C5834E e10, C9313l lVar5, p pVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        h(dVar, z10, dVar2, str, aVar, c0Var, dVar3, l0Var, xVar, lVar, lVar2, aVar2, aVar3, lVar3, lVar4, e10, lVar5, pVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final p<C4889m, Integer, C16807N> q(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
        return (p) a12.getValue();
    }

    private static final F0 r(C4899r0<F0> r0Var) {
        return r0Var.getValue();
    }

    private static final C9310j0 s(MapView mapView) {
        Object tag = mapView.getTag();
        C17542s.h(tag, "null cannot be cast to non-null type com.google.maps.android.compose.MapTagData");
        return (C9310j0) tag;
    }

    private static final F0 t(Q q10, P0 p02, U0.r rVar, MapView mapView, N n10, p<? super C4889m, ? super Integer, C16807N> pVar) {
        return C16314k.d(q10, (C17168i) null, T.UNDISPATCHED, new c(mapView, n10, rVar, p02, pVar, (C17164e<? super c>) null), 1, (Object) null);
    }
}
