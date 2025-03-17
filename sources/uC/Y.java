package Uc;

import U0.C4872f;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17548y;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oa.C8619c;
import uI.C18059h;
import uI.C18061j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aM\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LXH/N;", "n", "(LU0/m;I)V", "", "L", "Lkotlin/Function0;", "callback", "Lkotlin/Function2;", "Loa/c;", "setter", "listener", "k", "(LnI/a;LnI/p;Ljava/lang/Object;LU0/m;I)V", "LUc/M;", "factory", "j", "(LnI/a;LnI/a;LU0/m;I)V", "maps-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Y {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements p<C8619c, C8619c.r, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64208a = new a();

        a() {
            super(2, C8619c.class, "setOnMyLocationButtonClickListener", "setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.r) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.r rVar) {
            C17542s.j(cVar, "p0");
            cVar.J(rVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends C17548y {
        b(Object obj) {
            super(obj, N.class, "onMyLocationClick", "getOnMyLocationClick()Lkotlin/jvm/functions/Function1;", 0);
        }

        public Object get() {
            return ((N) this.receiver).f();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements p<C8619c, C8619c.s, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f64209a = new c();

        c() {
            super(2, C8619c.class, "setOnMyLocationClickListener", "setOnMyLocationClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.s) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.s sVar) {
            C17542s.j(cVar, "p0");
            cVar.K(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d extends C17548y {
        d(Object obj) {
            super(obj, N.class, "onPOIClick", "getOnPOIClick()Lkotlin/jvm/functions/Function1;", 0);
        }

        public Object get() {
            return ((N) this.receiver).g();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements p<C8619c, C8619c.t, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f64210a = new e();

        e() {
            super(2, C8619c.class, "setOnPoiClickListener", "setOnPoiClickListener(Lcom/google/android/gms/maps/GoogleMap$OnPoiClickListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.t) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.t tVar) {
            C17542s.j(cVar, "p0");
            cVar.L(tVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class f extends C17548y {
        f(Object obj) {
            super(obj, N.class, "indoorStateChangeListener", "getIndoorStateChangeListener()Lcom/google/maps/android/compose/IndoorStateChangeListener;", 0);
        }

        public Object get() {
            return ((N) this.receiver).a();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements p<C8619c, C8619c.i, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f64211a = new g();

        g() {
            super(2, C8619c.class, "setOnIndoorStateChangeListener", "setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.i) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.i iVar) {
            C17542s.j(cVar, "p0");
            cVar.A(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Uc/Y$h", "Loa/c$i;", "LXH/N;", "b", "()V", "Lqa/f;", "building", "a", "(Lqa/f;)V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements C8619c.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18061j<C9336x> f64212a;

        h(C18061j<C9336x> jVar) {
            this.f64212a = jVar;
        }

        public void a(qa.f fVar) {
            C17542s.j(fVar, "building");
            ((C9336x) this.f64212a.invoke()).a(fVar);
        }

        public void b() {
            ((C9336x) this.f64212a.invoke()).b();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class i extends C17548y {
        i(Object obj) {
            super(obj, N.class, "onMapClick", "getOnMapClick()Lkotlin/jvm/functions/Function1;", 0);
        }

        public Object get() {
            return ((N) this.receiver).b();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements p<C8619c, C8619c.m, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f64213a = new j();

        j() {
            super(2, C8619c.class, "setOnMapClickListener", "setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.m) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.m mVar) {
            C17542s.j(cVar, "p0");
            cVar.E(mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class k extends C17548y {
        k(Object obj) {
            super(obj, N.class, "onMapLongClick", "getOnMapLongClick()Lkotlin/jvm/functions/Function1;", 0);
        }

        public Object get() {
            return ((N) this.receiver).d();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class l extends C17540p implements p<C8619c, C8619c.o, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f64214a = new l();

        l() {
            super(2, C8619c.class, "setOnMapLongClickListener", "setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.o) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.o oVar) {
            C17542s.j(cVar, "p0");
            cVar.G(oVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class m extends C17548y {
        m(Object obj) {
            super(obj, N.class, "onMapLoaded", "getOnMapLoaded()Lkotlin/jvm/functions/Function0;", 0);
        }

        public Object get() {
            return ((N) this.receiver).c();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class n extends C17540p implements p<C8619c, C8619c.n, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f64215a = new n();

        n() {
            super(2, C8619c.class, "setOnMapLoadedCallback", "setOnMapLoadedCallback(Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((C8619c) obj, (C8619c.n) obj2);
            return C16807N.f139792a;
        }

        public final void t(C8619c cVar, C8619c.n nVar) {
            C17542s.j(cVar, "p0");
            cVar.F(nVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class o extends C17548y {
        o(Object obj) {
            super(obj, N.class, "onMyLocationButtonClick", "getOnMyLocationButtonClick()Lkotlin/jvm/functions/Function0;", 0);
        }

        public Object get() {
            return ((N) this.receiver).e();
        }
    }

    private static final void j(C17631a<? extends Object> aVar, C17631a<? extends M<?>> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1042600347);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1042600347, i11, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:187)");
            }
            if (aVar.invoke() != null) {
                if (!(k10.m() instanceof L)) {
                    C4883j.c();
                }
                k10.o();
                if (k10.i()) {
                    k10.p(aVar2);
                } else {
                    k10.t();
                }
                F1.a(k10);
                k10.x();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new X(aVar, aVar2, i10));
        }
    }

    private static final <L> void k(C17631a<? extends Object> aVar, p<? super C8619c, ? super L, C16807N> pVar, L l10, C4889m mVar, int i10) {
        mVar.W(-649632125);
        if (C4895p.J()) {
            C4895p.S(-649632125, i10, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:176)");
        }
        C4872f<?> m10 = mVar.m();
        C17542s.h(m10, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        L l11 = (L) m10;
        mVar.W(1495685668);
        boolean z10 = false;
        boolean F10 = mVar.F(l11) | ((((i10 & 112) ^ 48) > 32 && mVar.V(pVar)) || (i10 & 48) == 32);
        if ((((i10 & 896) ^ 384) > 256 && mVar.F(l10)) || (i10 & 384) == 256) {
            z10 = true;
        }
        boolean z11 = F10 | z10;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new W(l11, pVar, l10);
            mVar.u(D10);
        }
        mVar.P();
        j(aVar, (C17631a) D10, mVar, i10 & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: private */
    public static final M l(L l10, p pVar, Object obj) {
        return new M(l10.I(), pVar, obj);
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        j(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void n(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1792062778);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1792062778, i10, -1, "com.google.maps.android.compose.MapClickListenerUpdater (MapClickListeners.kt:88)");
            }
            C4872f<?> m10 = k10.m();
            C17542s.h(m10, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            N J10 = ((L) m10).J();
            k10.W(1577826274);
            f fVar = new f(J10);
            k10.W(-568962266);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = g.f64211a;
                k10.u(D10);
            }
            k10.P();
            k(fVar, (p) ((C18059h) D10), new h(fVar), k10, 48);
            k10.P();
            k10.W(1577843195);
            i iVar = new i(J10);
            k10.W(-568945059);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = j.f64213a;
                k10.u(D11);
            }
            k10.P();
            p pVar = (p) ((C18059h) D11);
            k10.W(-568943446);
            boolean F10 = k10.F(iVar);
            Object D12 = k10.D();
            if (F10 || D12 == aVar.a()) {
                D12 = new O(iVar);
                k10.u(D12);
            }
            k10.P();
            k(iVar, pVar, (C8619c.m) D12, k10, 48);
            k10.P();
            k10.W(1577851107);
            k kVar = new k(J10);
            k10.W(-568937151);
            Object D13 = k10.D();
            if (D13 == aVar.a()) {
                D13 = l.f64214a;
                k10.u(D13);
            }
            k10.P();
            p pVar2 = (p) ((C18059h) D13);
            k10.W(-568935410);
            boolean F11 = k10.F(kVar);
            Object D14 = k10.D();
            if (F11 || D14 == aVar.a()) {
                D14 = new P(kVar);
                k10.u(D14);
            }
            k10.P();
            k(kVar, pVar2, (C8619c.o) D14, k10, 48);
            k10.P();
            k10.W(1577859163);
            m mVar2 = new m(J10);
            k10.W(-568929090);
            Object D15 = k10.D();
            if (D15 == aVar.a()) {
                D15 = n.f64215a;
                k10.u(D15);
            }
            k10.P();
            p pVar3 = (p) ((C18059h) D15);
            k10.W(-568927447);
            boolean F12 = k10.F(mVar2);
            Object D16 = k10.D();
            if (F12 || D16 == aVar.a()) {
                D16 = new Q(mVar2);
                k10.u(D16);
            }
            k10.P();
            k(mVar2, pVar3, (C8619c.n) D16, k10, 48);
            k10.P();
            k10.W(1577867388);
            o oVar = new o(J10);
            k10.W(-568920886);
            Object D17 = k10.D();
            if (D17 == aVar.a()) {
                D17 = a.f64208a;
                k10.u(D17);
            }
            k10.P();
            p pVar4 = (p) ((C18059h) D17);
            k10.W(-568918850);
            boolean F13 = k10.F(oVar);
            Object D18 = k10.D();
            if (F13 || D18 == aVar.a()) {
                D18 = new S(oVar);
                k10.u(D18);
            }
            k10.P();
            k(oVar, pVar4, (C8619c.r) D18, k10, 48);
            k10.P();
            k10.W(1577876425);
            b bVar = new b(J10);
            k10.W(-568911836);
            Object D19 = k10.D();
            if (D19 == aVar.a()) {
                D19 = c.f64209a;
                k10.u(D19);
            }
            k10.P();
            p pVar5 = (p) ((C18059h) D19);
            k10.W(-568909999);
            boolean F14 = k10.F(bVar);
            Object D20 = k10.D();
            if (F14 || D20 == aVar.a()) {
                D20 = new T(bVar);
                k10.u(D20);
            }
            k10.P();
            k(bVar, pVar5, (C8619c.s) D20, k10, 48);
            k10.P();
            k10.W(1577884635);
            d dVar = new d(J10);
            k10.W(-568903619);
            Object D21 = k10.D();
            if (D21 == aVar.a()) {
                D21 = e.f64210a;
                k10.u(D21);
            }
            k10.P();
            p pVar6 = (p) ((C18059h) D21);
            k10.W(-568902006);
            boolean F15 = k10.F(dVar);
            Object D22 = k10.D();
            if (F15 || D22 == aVar.a()) {
                D22 = new U(dVar);
                k10.u(D22);
            }
            k10.P();
            k(dVar, pVar6, (C8619c.t) D22, k10, 48);
            k10.P();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new V(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void o(C18061j jVar) {
        C17631a aVar = (C17631a) jVar.invoke();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean p(C18061j jVar) {
        C17631a aVar = (C17631a) jVar.invoke();
        if (aVar != null) {
            return ((Boolean) aVar.invoke()).booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void q(C18061j jVar, Location location) {
        C17542s.j(location, "it");
        C17642l lVar = (C17642l) jVar.invoke();
        if (lVar != null) {
            lVar.invoke(location);
        }
    }

    /* access modifiers changed from: private */
    public static final void r(C18061j jVar, qa.j jVar2) {
        C17542s.j(jVar2, "it");
        C17642l lVar = (C17642l) jVar.invoke();
        if (lVar != null) {
            lVar.invoke(jVar2);
        }
    }

    /* access modifiers changed from: private */
    public static final void s(C18061j jVar, LatLng latLng) {
        C17542s.j(latLng, "it");
        C17642l lVar = (C17642l) jVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* access modifiers changed from: private */
    public static final void t(C18061j jVar, LatLng latLng) {
        C17542s.j(latLng, "it");
        C17642l lVar = (C17642l) jVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, C4889m mVar, int i11) {
        n(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
