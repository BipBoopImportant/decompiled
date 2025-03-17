package Tr;

import E1.C4488v;
import E1.I;
import G1.C4504g;
import J1.j;
import O0.C4732i;
import O0.C4734j;
import O0.C4736k;
import O0.L0;
import QJ.Q;
import SC.C13651w0;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.W1;
import SC.Z1;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import Uc.C9296d;
import Ww.a;
import Ww.r;
import XH.C16795B;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.location.Location;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.compose.ui.platform.C5135u0;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import c2.n;
import c2.o;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import oa.C8617a;
import oa.C8618b;
import p0.s;
import p1.i1;
import s0.C5834E;
import s0.C5859e;
import s0.C5861g;
import s0.C5862h;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aË\u0001\u0010\u0019\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aY\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030#H\u0003¢\u0006\u0004\b%\u0010&\u001a'\u0010(\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b(\u0010)\u001a/\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b.\u0010/\u001aI\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d012\u0006\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0003¢\u0006\u0004\b2\u00103\u001a+\u00105\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b5\u00106¨\u0006A²\u0006\f\u00107\u001a\u00020\t8\nX\u0002²\u0006\u000e\u00109\u001a\u0004\u0018\u0001088\nX\u0002²\u0006\u000e\u0010:\u001a\u00020\t8\n@\nX\u0002²\u0006\u000e\u0010;\u001a\u00020\t8\n@\nX\u0002²\u0006\u000e\u0010<\u001a\u00020\u001d8\n@\nX\u0002²\u0006\u0018\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0=0\u00028\nX\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u0002"}, d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "Lkotlin/Function0;", "LXH/N;", "onCloseClicked", "bottomSheetContent", "mapContent", "Landroidx/compose/ui/d;", "modifier", "", "loading", "isUserLocationAllowed", "LUc/d;", "cameraPositionState", "isCompact", "onMapLoaded", "", "mapContentDescription", "onGoToSettingsClicked", "", "minZoomPreference", "sheetMinHeightFactor", "sheetMaxHeightFactor", "LO0/L0;", "snackbarHostState", "u", "(Lcom/google/android/gms/maps/model/LatLngBounds;LnI/a;LnI/p;LnI/p;Landroidx/compose/ui/d;ZZLUc/d;ZLnI/a;Ljava/lang/String;LnI/a;FFFLO0/L0;LU0/m;III)V", "LO0/k;", "scaffoldState", "Lc2/h;", "maxHeight", "peekHeight", "sheetMaxHeight", "Lc2/d;", "density", "Lkotlin/Function1;", "setBottomSheetHeight", "k", "(LO0/k;FFFLc2/d;LnI/p;LnI/l;LU0/m;I)V", "onClick", "n", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "inProgress", "p", "(ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "LWw/b;", "P", "(ZLU0/m;I)LWw/b;", "maxWidth", "LXH/B;", "Q", "(FFZFFLU0/m;I)LXH/B;", "onDismiss", "r", "(LnI/a;LnI/a;LU0/m;I)V", "activateLocationRequests", "Landroid/location/Location;", "userLocation", "scheduleAnimationToUserLocation", "showLocationPermissionSettingsPrompt", "bottomSheetHeight", "LU0/A1;", "googleIconOffset", "Ls0/E;", "paddingValues", "google-maps_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17631a<C9296d> {
        /* renamed from: a */
        public final C9296d invoke() {
            return C9296d.a.c(C9296d.f64230h, (CameraPosition) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.googlemaps.presentation.MapBottomSheetKt$MapBottomSheet$3$1", f = "MapBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ww.b f87767d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87768e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87769f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Ww.b bVar, C17631a<C16807N> aVar, C4899r0<Boolean> r0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f87767d = bVar;
            this.f87768e = aVar;
            this.f87769f = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f87767d, this.f87768e, this.f87769f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f87766c == 0) {
                y.b(obj);
                if (D.D(this.f87769f)) {
                    Ww.b bVar = this.f87767d;
                    if (C17542s.e(bVar != null ? bVar.i() : null, r.a.b.f117719a)) {
                        this.f87768e.invoke();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.googlemaps.presentation.MapBottomSheetKt$MapBottomSheet$4$1", f = "MapBottomSheet.kt", l = {170}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f87770c;

        /* renamed from: d  reason: collision with root package name */
        Object f87771d;

        /* renamed from: e  reason: collision with root package name */
        Object f87772e;

        /* renamed from: f  reason: collision with root package name */
        Object f87773f;

        /* renamed from: g  reason: collision with root package name */
        Object f87774g;

        /* renamed from: h  reason: collision with root package name */
        Object f87775h;

        /* renamed from: i  reason: collision with root package name */
        int f87776i;

        /* renamed from: j  reason: collision with root package name */
        int f87777j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C9296d f87778k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ A1<Location> f87779l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87780m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9296d dVar, A1<? extends Location> a12, C4899r0<Boolean> r0Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f87778k = dVar;
            this.f87779l = a12;
            this.f87780m = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f87778k, this.f87779l, this.f87780m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C4899r0<Boolean> r0Var;
            Location L10;
            Object f10 = C17187b.f();
            int i10 = this.f87777j;
            if (i10 == 0) {
                y.b(obj);
                if (!this.f87778k.u() && (L10 = D.C(this.f87779l)) != null) {
                    C9296d dVar = this.f87778k;
                    C4899r0<Boolean> r0Var2 = this.f87780m;
                    C8617a d10 = C8618b.d(new LatLng(L10.getLatitude(), L10.getLongitude()), 14.0f);
                    C17542s.i(d10, "newLatLngZoom(...)");
                    this.f87770c = L10;
                    this.f87771d = L10;
                    this.f87772e = dVar;
                    this.f87773f = r0Var2;
                    this.f87774g = L10;
                    this.f87775h = d10;
                    this.f87776i = 0;
                    this.f87777j = 1;
                    if (C9296d.n(dVar, d10, 0, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                    r0Var = r0Var2;
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                C8617a aVar = (C8617a) this.f87775h;
                Location location = (Location) this.f87774g;
                r0Var = (C4899r0) this.f87773f;
                C9296d dVar2 = (C9296d) this.f87772e;
                Location location2 = (Location) this.f87771d;
                Location location3 = (Location) this.f87770c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            D.E(r0Var, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.googlemaps.presentation.MapBottomSheetKt$MapBottomSheet$5$1", f = "MapBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ww.b f87782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87783e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Ww.b bVar, C4899r0<Boolean> r0Var, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f87782d = bVar;
            this.f87783e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f87782d, this.f87783e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f87781c == 0) {
                y.b(obj);
                Ww.b bVar = this.f87782d;
                if (C17542s.e(bVar != null ? bVar.c() : null, r.b.C2906b.f117721a)) {
                    D.y(this.f87783e, true);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f87784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f87785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f87786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4736k f87787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c2.d f87788e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f87789f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Ww.b f87790g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f87791h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LatLngBounds f87792i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f87793j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C9296d f87794k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f87795l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87796m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f87797n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f87798o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87799p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f87800q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87801r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87802s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f87803t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5861g, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4736k f87804a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f87805b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f87806c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f87807d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c2.d f87808e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f87809f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0<h> f87810g;

            a(C4736k kVar, float f10, float f11, float f12, c2.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4899r0<h> r0Var) {
                this.f87804a = kVar;
                this.f87805b = f10;
                this.f87806c = f11;
                this.f87807d = f12;
                this.f87808e = dVar;
                this.f87809f = pVar;
                this.f87810g = r0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C4899r0 r0Var, h hVar) {
                e.j(r0Var, hVar.G());
                return C16807N.f139792a;
            }

            public final void b(C5861g gVar, C4889m mVar, int i10) {
                C17542s.j(gVar, "$this$BottomSheetScaffold");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1685370380, i10, -1, "com.ingka.ikea.googlemaps.presentation.MapBottomSheet.<anonymous>.<anonymous> (MapBottomSheet.kt:299)");
                    }
                    C4736k kVar = this.f87804a;
                    float f10 = this.f87805b;
                    float f11 = this.f87806c;
                    float f12 = this.f87807d;
                    c2.d dVar = this.f87808e;
                    p<C4889m, Integer, C16807N> pVar = this.f87809f;
                    mVar.W(2139986067);
                    C4899r0<h> r0Var = this.f87810g;
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new H(r0Var);
                        mVar.u(D10);
                    }
                    mVar.P();
                    D.k(kVar, f10, f11, f12, dVar, pVar, (C17642l) D10, mVar, 1572864);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Ww.b f87811a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f87812b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ LatLngBounds f87813c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f87814d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C9296d f87815e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f87816f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f87817g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f87818h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f87819i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f87820j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ boolean f87821k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f87822l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ A1<C5834E> f87823m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f87824n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ A1<Boolean> f87825o;

            b(Ww.b bVar, Context context, LatLngBounds latLngBounds, float f10, C9296d dVar, String str, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, C17631a<C16807N> aVar2, boolean z11, C17631a<C16807N> aVar3, A1<? extends C5834E> a12, C4899r0<Boolean> r0Var, A1<Boolean> a13) {
                this.f87811a = bVar;
                this.f87812b = context;
                this.f87813c = latLngBounds;
                this.f87814d = f10;
                this.f87815e = dVar;
                this.f87816f = str;
                this.f87817g = aVar;
                this.f87818h = pVar;
                this.f87819i = z10;
                this.f87820j = aVar2;
                this.f87821k = z11;
                this.f87822l = aVar3;
                this.f87823m = a12;
                this.f87824n = r0Var;
                this.f87825o = a13;
            }

            /* access modifiers changed from: private */
            public static final n e(A1 a12, c2.d dVar) {
                C17542s.j(dVar, "$this$offset");
                return n.b(o.a(0, -dVar.K0(e.q(a12).a())));
            }

            /* access modifiers changed from: private */
            public static final C16807N f(Ww.b bVar, C17631a aVar, C4899r0 r0Var) {
                if (C17542s.e(bVar != null ? bVar.i() : null, r.a.b.f117719a)) {
                    aVar.invoke();
                } else if (bVar != null) {
                    bVar.b();
                }
                D.E(r0Var, true);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(s0.C5834E r53, U0.C4889m r54, int r55) {
                /*
                    r52 = this;
                    r0 = r52
                    r12 = r54
                    r1 = r55
                    java.lang.String r2 = "it"
                    r3 = r53
                    kotlin.jvm.internal.C17542s.j(r3, r2)
                    r2 = r1 & 17
                    r4 = 16
                    if (r2 != r4) goto L_0x001f
                    boolean r2 = r54.l()
                    if (r2 != 0) goto L_0x001a
                    goto L_0x001f
                L_0x001a:
                    r54.L()
                    goto L_0x0261
                L_0x001f:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x002e
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.googlemaps.presentation.MapBottomSheet.<anonymous>.<anonymous> (MapBottomSheet.kt:230)"
                    r5 = -1964889098(0xffffffff8ae22bf6, float:-2.1779545E-32)
                    U0.C4895p.S(r5, r1, r2, r3)
                L_0x002e:
                    Ww.b r3 = r0.f87811a
                    android.content.Context r1 = r0.f87812b
                    com.google.android.gms.maps.model.LatLngBounds r2 = r0.f87813c
                    float r5 = r0.f87814d
                    Uc.d r11 = r0.f87815e
                    java.lang.String r10 = r0.f87816f
                    nI.a<XH.N> r9 = r0.f87817g
                    nI.p<U0.m, java.lang.Integer, XH.N> r7 = r0.f87818h
                    boolean r8 = r0.f87819i
                    nI.a<XH.N> r15 = r0.f87820j
                    boolean r14 = r0.f87821k
                    nI.a<XH.N> r13 = r0.f87822l
                    U0.A1<s0.E> r6 = r0.f87823m
                    r53 = r11
                    U0.r0<java.lang.Boolean> r11 = r0.f87824n
                    r55 = r11
                    U0.A1<java.lang.Boolean> r11 = r0.f87825o
                    r25 = r11
                    androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
                    i1.c$a r26 = i1.C5437c.f24302a
                    i1.c r4 = r26.o()
                    r27 = r10
                    r10 = 0
                    E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r10)
                    int r16 = U0.C4883j.a(r12, r10)
                    U0.y r10 = r54.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r11)
                    G1.g$a r17 = G1.C4504g.f6515W
                    r28 = r7
                    nI.a r7 = r17.a()
                    U0.f r18 = r54.m()
                    if (r18 != 0) goto L_0x007e
                    U0.C4883j.c()
                L_0x007e:
                    r54.I()
                    boolean r18 = r54.i()
                    if (r18 == 0) goto L_0x008b
                    r12.p(r7)
                    goto L_0x008e
                L_0x008b:
                    r54.t()
                L_0x008e:
                    U0.m r7 = U0.F1.a(r54)
                    r29 = r8
                    nI.p r8 = r17.c()
                    U0.F1.c(r7, r4, r8)
                    nI.p r4 = r17.e()
                    U0.F1.c(r7, r10, r4)
                    nI.p r4 = r17.b()
                    boolean r8 = r7.i()
                    if (r8 != 0) goto L_0x00ba
                    java.lang.Object r8 = r7.D()
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
                    boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
                    if (r8 != 0) goto L_0x00c8
                L_0x00ba:
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
                    r7.u(r8)
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
                    r7.w(r8, r4)
                L_0x00c8:
                    nI.p r4 = r17.d()
                    U0.F1.c(r7, r0, r4)
                    androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
                    r4 = 0
                    r10 = 1
                    r7 = 0
                    androidx.compose.ui.d r30 = androidx.compose.foundation.layout.J.f(r11, r4, r10, r7)
                    s0.E r31 = Tr.D.e.q(r6)
                    Uc.l r32 = Uc.C9313l.FOLLOW_SYSTEM
                    if (r3 == 0) goto L_0x00e5
                    Ww.r$a r8 = r3.i()
                    goto L_0x00e6
                L_0x00e5:
                    r8 = r7
                L_0x00e6:
                    Ww.r$a$b r4 = Ww.r.a.b.f117719a
                    boolean r16 = kotlin.jvm.internal.C17542s.e(r8, r4)
                    int r4 = Rr.b.f87007a
                    qa.g r19 = qa.g.x(r1, r4)
                    Uc.c0 r1 = new Uc.c0
                    r4 = r6
                    r6 = r1
                    r23 = 75
                    r24 = 0
                    r8 = 0
                    r17 = 0
                    r18 = 0
                    r20 = 0
                    r21 = 1099956224(0x41900000, float:18.0)
                    r33 = r13
                    r13 = r1
                    r34 = r14
                    r14 = r8
                    r1 = r15
                    r15 = r17
                    r17 = r18
                    r18 = r2
                    r22 = r5
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                    Uc.l0 r35 = new Uc.l0
                    r23 = r29
                    r8 = r35
                    r46 = 754(0x2f2, float:1.057E-42)
                    r47 = 0
                    r36 = 0
                    r37 = 0
                    r38 = 0
                    r39 = 0
                    r40 = 0
                    r41 = 0
                    r42 = 0
                    r43 = 0
                    r44 = 0
                    r45 = 0
                    r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
                    int r2 = Uc.C9296d.f64231i
                    r15 = 6
                    int r2 = r2 << r15
                    r2 = r2 | r15
                    int r5 = Uc.C9294c0.f64220j
                    int r5 = r5 << 15
                    r2 = r2 | r5
                    int r5 = Uc.C9314l0.f64329k
                    int r5 = r5 << 21
                    r20 = r2 | r5
                    r21 = 1572864(0x180000, float:2.204052E-39)
                    r22 = 30546(0x7752, float:4.2804E-41)
                    r2 = 0
                    r5 = 0
                    r13 = 0
                    r14 = r7
                    r18 = r28
                    r7 = r13
                    r16 = r9
                    r9 = r13
                    r17 = r27
                    r10 = r13
                    r19 = r53
                    r48 = r11
                    r24 = r25
                    r11 = r13
                    r25 = 0
                    r14 = r25
                    r15 = r25
                    r49 = r1
                    r1 = r30
                    r50 = r3
                    r3 = r19
                    r51 = r4
                    r4 = r17
                    r12 = r16
                    r16 = r31
                    r17 = r32
                    r19 = r54
                    Uc.C9332v.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    r1 = -1998571246(0xffffffff88e03912, float:-1.3494927E-33)
                    r7 = r54
                    r7.W(r1)
                    r1 = r48
                    if (r23 == 0) goto L_0x019b
                    r2 = 0
                    r3 = 1
                    r4 = 0
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r1, r2, r3, r4)
                    java.lang.String r4 = "map_loading_overlay"
                    androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
                    r4 = 2
                    r5 = 0
                    r6 = 6
                    SC.H2.b(r2, r5, r7, r6, r4)
                    goto L_0x019d
                L_0x019b:
                    r3 = 1
                    r5 = 0
                L_0x019d:
                    r54.P()
                    i1.c r2 = r26.o()
                    androidx.compose.ui.d r2 = r0.a(r1, r2)
                    androidx.compose.ui.d r8 = s0.C5852X.e(r2)
                    r2 = 16
                    float r2 = (float) r2
                    float r10 = c2.h.B(r2)
                    r4 = 20
                    float r4 = (float) r4
                    float r9 = c2.h.B(r4)
                    r13 = 12
                    r14 = 0
                    r11 = 0
                    r12 = 0
                    androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
                    r8 = r49
                    Tr.D.n(r6, r8, r7, r5, r5)
                    r6 = -1998550336(0xffffffff88e08ac0, float:-1.351413E-33)
                    r7.W(r6)
                    if (r34 == 0) goto L_0x0252
                    i1.c r6 = r26.c()
                    androidx.compose.ui.d r0 = r0.a(r1, r6)
                    r1 = -1998541312(0xffffffff88e0ae00, float:-1.3522417E-33)
                    r7.W(r1)
                    java.lang.Object r1 = r54.D()
                    U0.m$a r6 = U0.C4889m.f14007a
                    java.lang.Object r8 = r6.a()
                    if (r1 != r8) goto L_0x01f4
                    Tr.I r1 = new Tr.I
                    r8 = r51
                    r1.<init>(r8)
                    r7.u(r1)
                L_0x01f4:
                    nI.l r1 = (nI.C17642l) r1
                    r54.P()
                    androidx.compose.ui.d r8 = androidx.compose.foundation.layout.A.a(r0, r1)
                    float r12 = c2.h.B(r2)
                    float r11 = c2.h.B(r4)
                    r13 = 3
                    r14 = 0
                    r9 = 0
                    r10 = 0
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
                    boolean r0 = Tr.D.D(r55)
                    if (r0 == 0) goto L_0x021b
                    boolean r0 = Tr.D.B(r24)
                    if (r0 == 0) goto L_0x021b
                    r1 = r3
                    goto L_0x021c
                L_0x021b:
                    r1 = r5
                L_0x021c:
                    r0 = -1998529191(0xffffffff88e0dd59, float:-1.3533548E-33)
                    r7.W(r0)
                    r0 = r50
                    boolean r3 = r7.V(r0)
                    r4 = r33
                    boolean r5 = r7.V(r4)
                    r3 = r3 | r5
                    java.lang.Object r5 = r54.D()
                    if (r3 != 0) goto L_0x023b
                    java.lang.Object r3 = r6.a()
                    if (r5 != r3) goto L_0x0245
                L_0x023b:
                    Tr.J r5 = new Tr.J
                    r3 = r55
                    r5.<init>(r0, r4, r3)
                    r7.u(r5)
                L_0x0245:
                    r3 = r5
                    nI.a r3 = (nI.C17631a) r3
                    r54.P()
                    r5 = 0
                    r6 = 0
                    r4 = r54
                    Tr.D.p(r1, r2, r3, r4, r5, r6)
                L_0x0252:
                    r54.P()
                    r54.x()
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0261
                    U0.C4895p.R()
                L_0x0261:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Tr.D.e.b.c(s0.E, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        e(float f10, boolean z10, float f11, C4736k kVar, c2.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, Ww.b bVar, Context context, LatLngBounds latLngBounds, float f12, C9296d dVar2, String str, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z11, C17631a<C16807N> aVar2, boolean z12, C17631a<C16807N> aVar3, C4899r0<Boolean> r0Var, A1<Boolean> a12) {
            this.f87784a = f10;
            this.f87785b = z10;
            this.f87786c = f11;
            this.f87787d = kVar;
            this.f87788e = dVar;
            this.f87789f = pVar;
            this.f87790g = bVar;
            this.f87791h = context;
            this.f87792i = latLngBounds;
            this.f87793j = f12;
            this.f87794k = dVar2;
            this.f87795l = str;
            this.f87796m = aVar;
            this.f87797n = pVar2;
            this.f87798o = z11;
            this.f87799p = aVar2;
            this.f87800q = z12;
            this.f87801r = aVar3;
            this.f87802s = r0Var;
            this.f87803t = a12;
        }

        private static final float i(C4899r0<h> r0Var) {
            return r0Var.getValue().G();
        }

        /* access modifiers changed from: private */
        public static final void j(C4899r0<h> r0Var, float f10) {
            r0Var.setValue(h.m(f10));
        }

        /* access modifiers changed from: private */
        public static final A1 k(float f10, float f11, C4899r0 r0Var) {
            return p1.e(new G(f10, f11, r0Var));
        }

        /* access modifiers changed from: private */
        public static final h m(float f10, float f11, C4899r0 r0Var) {
            return h.m(h.B(Math.min(i(r0Var), h.B(h.B(f10 * f11) * 1.1f))));
        }

        private static final C17631a<A1<h>> n(A1<? extends C17631a<? extends A1<h>>> a12) {
            return (C17631a) a12.getValue();
        }

        /* access modifiers changed from: private */
        public static final C5834E p(A1 a12) {
            return androidx.compose.foundation.layout.D.e(0.0f, 0.0f, 0.0f, ((h) n(a12).invoke().getValue()).G(), 7, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final C5834E q(A1<? extends C5834E> a12) {
            return (C5834E) a12.getValue();
        }

        public final void h(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C4889m mVar2 = mVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(eVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(815658619, i11, -1, "com.ingka.ikea.googlemaps.presentation.MapBottomSheet.<anonymous> (MapBottomSheet.kt:198)");
                }
                float d10 = eVar.d();
                mVar2.W(1008458811);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = u1.e(h.m(h.B((float) 0)), (o1) null, 2, (Object) null);
                    mVar2.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                mVar2.W(1008464584);
                boolean c10 = mVar2.c(d10) | mVar2.c(this.f87784a);
                float f10 = this.f87784a;
                Object D11 = mVar.D();
                if (c10 || D11 == aVar.a()) {
                    D11 = new E(d10, f10, r0Var);
                    mVar2.u(D11);
                }
                mVar.P();
                A1 q10 = p1.q((C17631a) D11, mVar2, 0);
                mVar2.W(1008473061);
                Object D12 = mVar.D();
                if (D12 == aVar.a()) {
                    D12 = p1.e(new F(q10));
                    mVar2.u(D12);
                }
                mVar.P();
                C16795B O10 = D.Q(eVar.c(), d10, this.f87785b, this.f87784a, this.f87786c, mVar, 0);
                float G10 = ((h) O10.a()).G();
                float G11 = ((h) O10.b()).G();
                float G12 = ((h) O10.c()).G();
                long k02 = C18030v.f147664a.a(mVar2, C18030v.f147665b).k0();
                C5264a e10 = c1.c.e(1685370380, true, new a(this.f87787d, d10, G11, G12, this.f87788e, this.f87789f, r0Var), mVar2, 54);
                C4736k kVar = this.f87787d;
                n nVar = n.f87854a;
                p<C4889m, Integer, C16807N> a10 = nVar.a();
                q<L0, C4889m, Integer, C16807N> d11 = nVar.d();
                Ww.b bVar = this.f87790g;
                Context context = this.f87791h;
                LatLngBounds latLngBounds = this.f87792i;
                float f11 = this.f87793j;
                C9296d dVar = this.f87794k;
                String str = this.f87795l;
                C5264a aVar2 = e10;
                C17631a<C16807N> aVar3 = this.f87796m;
                C4736k kVar2 = kVar;
                p<C4889m, Integer, C16807N> pVar = this.f87797n;
                float f12 = G11;
                boolean z10 = this.f87798o;
                float f13 = G10;
                C17631a<C16807N> aVar4 = this.f87799p;
                long j10 = k02;
                boolean z11 = this.f87800q;
                C5264a aVar5 = aVar2;
                C4736k kVar3 = kVar2;
                float f14 = f12;
                float f15 = f13;
                long j11 = j10;
                p<C4889m, Integer, C16807N> pVar2 = a10;
                C4734j.a(aVar5, (androidx.compose.ui.d) null, kVar3, f14, f15, (i1) null, j11, 0, 0.0f, 0.0f, pVar2, false, (p<? super C4889m, ? super Integer, C16807N>) null, d11, 0, 0, c1.c.e(-1964889098, true, new b(bVar, context, latLngBounds, f11, dVar, str, aVar3, pVar, z10, aVar4, z11, this.f87801r, (A1) D12, this.f87802s, this.f87803t), mVar, 54), mVar, 6, 1575942, 56226);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87827b;

        f(C17631a<C16807N> aVar, C4899r0<Boolean> r0Var) {
            this.f87826a = aVar;
            this.f87827b = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C4899r0 r0Var) {
            D.y(r0Var, false);
            return C16807N.f139792a;
        }

        public final void b(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(740740537, i10, -1, "com.ingka.ikea.googlemaps.presentation.MapBottomSheet.<anonymous> (MapBottomSheet.kt:316)");
            }
            C17631a<C16807N> aVar = this.f87826a;
            mVar.W(1008633222);
            boolean V10 = mVar.V(this.f87827b);
            C4899r0<Boolean> r0Var = this.f87827b;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new K(r0Var);
                mVar.u(D10);
            }
            mVar.P();
            D.r(aVar, (C17631a) D10, mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f87829b;

        g(C17631a<C16807N> aVar, C4899r0<Boolean> r0Var) {
            this.f87828a = aVar;
            this.f87829b = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C4899r0 r0Var) {
            D.y(r0Var, false);
            return C16807N.f139792a;
        }

        public final void b(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-104948318, i10, -1, "com.ingka.ikea.googlemaps.presentation.MapBottomSheet.<anonymous> (MapBottomSheet.kt:325)");
            }
            C17631a<C16807N> aVar = this.f87828a;
            mVar.W(1008642278);
            boolean V10 = mVar.V(this.f87829b);
            C4899r0<Boolean> r0Var = this.f87829b;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new L(r0Var);
                mVar.u(D10);
            }
            mVar.P();
            D.r(aVar, (C17631a) D10, mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean A(boolean z10, Ww.b bVar, A1 a12) {
        if (z10) {
            return C17542s.e(bVar != null ? bVar.i() : null, r.a.b.f117719a) && C17542s.e(a12.getValue(), Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean B(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Location C(A1<? extends Location> a12) {
        return (Location) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final boolean D(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void E(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final Ww.b P(boolean z10, C4889m mVar, int i10) {
        mVar.W(-1484678585);
        if (C4895p.J()) {
            C4895p.S(-1484678585, i10, -1, "com.ingka.ikea.googlemaps.presentation.getLocationPermissionRequest (MapBottomSheet.kt:400)");
        }
        Ww.b bVar = null;
        if (!((Boolean) mVar.Q(C5135u0.a())).booleanValue() && z10) {
            bVar = Ww.d.b(a.b.f117681a, (C17642l<? super r.a, C16807N>) null, mVar, a.b.f117684d, 2);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final C16795B<h, h, h> Q(float f10, float f11, boolean z10, float f12, float f13, C4889m mVar, int i10) {
        float f14;
        float f15;
        mVar.W(-2127369243);
        if (C4895p.J()) {
            C4895p.S(-2127369243, i10, -1, "com.ingka.ikea.googlemaps.presentation.getSheetDimensions (MapBottomSheet.kt:416)");
        }
        if (z10) {
            f10 = C4732i.f10831a.f();
            f14 = h.B(f12 * f11);
            f15 = h.B(f11 * f13);
        } else {
            f14 = h.B(f12 * f11);
            f15 = h.B(f11 * f13);
        }
        C16795B<h, h, h> b10 = new C16795B<>(h.m(f10), h.m(f14), h.m(f15));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return b10;
    }

    /* access modifiers changed from: private */
    public static final void k(C4736k kVar, float f10, float f11, float f12, c2.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C17642l<? super h, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4736k kVar2 = kVar;
        float f13 = f10;
        c2.d dVar2 = dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        C17642l<? super h, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1608813525);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(kVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.c(f13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.c(f11) ? 256 : 128;
        } else {
            float f14 = f11;
        }
        float f15 = f12;
        if ((i12 & 3072) == 0) {
            i11 |= k10.c(f15) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(dVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(pVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(lVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1608813525, i11, -1, "com.ingka.ikea.googlemaps.presentation.BottomSheetContent (MapBottomSheet.kt:344)");
            }
            androidx.compose.ui.d x10 = J.x(androidx.compose.ui.d.f18749a, 0.0f, f11, 0.0f, f12, 5, (Object) null);
            k10.W(-1401936181);
            boolean z10 = ((i11 & 14) == 4) | ((57344 & i11) == 16384) | ((3670016 & i11) == 1048576) | ((i11 & 112) == 32);
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new B(dVar2, lVar2, f13, kVar2);
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d f16 = m.f(androidx.compose.ui.layout.c.a(x10, (C17642l) D10), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f16);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            pVar2.invoke(k10, Integer.valueOf((i11 >> 15) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C(kVar, f10, f11, f12, dVar, pVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(c2.d dVar, C17642l lVar, float f10, C4736k kVar, C4488v vVar) {
        C17542s.j(vVar, "it");
        lVar.invoke(h.m(h.B(f10 - dVar.x1(kVar.a().n()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C4736k kVar, float f10, float f11, float f12, c2.d dVar, p pVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        k(kVar, f10, f11, f12, dVar, pVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(androidx.compose.ui.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1929247040);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1929247040, i12, -1, "com.ingka.ikea.googlemaps.presentation.CloseButton (MapBottomSheet.kt:369)");
            }
            androidx.compose.ui.d dVar3 = aVar3;
            F0.b(C18146a.f148097J2, j.b(Oo.b.f84665i, k10, 0), C5116k1.a(aVar3, "close_button"), false, H0.Primary, G0.Small, (r0.m) null, false, aVar, k10, ((i12 << 21) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new z(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        n(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(boolean r17, androidx.compose.ui.d r18, nI.C17631a<XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r4 = r21
            r0 = -84167734(0xfffffffffafbb3ca, float:-6.5345653E35)
            r1 = r20
            U0.m r1 = r1.k(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r4
        L_0x0029:
            r5 = r22 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r6 = r18
            goto L_0x0044
        L_0x0032:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r18
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r22 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r19
            goto L_0x005f
        L_0x004d:
            r7 = r4 & 384(0x180, float:5.38E-43)
            r15 = r19
            if (r7 != 0) goto L_0x005f
            boolean r7 = r1.F(r15)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0071
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r1.L()
            r3 = r6
            goto L_0x00bd
        L_0x0071:
            if (r5 == 0) goto L_0x0077
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0078
        L_0x0077:
            r14 = r6
        L_0x0078:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0084
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.googlemaps.presentation.LocateMeButton (MapBottomSheet.kt:385)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0084:
            int r5 = uK.C18146a.f148157N2
            int r0 = Oo.b.f84753q
            r6 = 0
            java.lang.String r6 = J1.j.b(r0, r1, r6)
            SC.H0 r9 = SC.H0.Primary
            SC.G0 r10 = SC.G0.Small
            java.lang.String r0 = "find_me_button"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r14, r0)
            int r0 = r3 << 21
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r8
            r8 = 221184(0x36000, float:3.09945E-40)
            r0 = r0 | r8
            int r3 = r3 << 18
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r8
            r0 = r0 | r3
            r16 = 72
            r8 = 0
            r11 = 0
            r12 = r17
            r13 = r19
            r3 = r14
            r14 = r1
            r15 = r0
            SC.F0.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00bd
            U0.C4895p.R()
        L_0x00bd:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x00d5
            Tr.A r7 = new Tr.A
            r0 = r7
            r1 = r17
            r2 = r3
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tr.D.p(boolean, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(boolean z10, androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        p(z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void r(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-969953623);
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
                C4895p.S(-969953623, i11, -1, "com.ingka.ikea.googlemaps.presentation.LocationSettingsPrompt (MapBottomSheet.kt:436)");
            }
            String b10 = j.b(Oo.b.f84802u4, k10, 0);
            String b11 = j.b(Oo.b.f84478Q0, k10, 0);
            k10.W(1563850194);
            boolean z10 = true;
            boolean z11 = (i11 & 14) == 4;
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new x(aVar, aVar2);
                k10.u(D10);
            }
            k10.P();
            W1 w12 = new W1(b11, (C17631a) D10);
            W1 w13 = new W1(j.b(Oo.b.f84488R0, k10, 0), aVar2);
            C13651w0 w0Var = C13651w0.Stacked;
            p<C4889m, Integer, C16807N> e10 = n.f87854a.e();
            int i12 = W1.f116045c;
            Z1.c(b10, w12, w13, aVar2, (androidx.compose.ui.d) null, w0Var, (androidx.compose.ui.window.h) null, e10, k10, (i12 << 6) | (i12 << 3) | 12779520 | ((i11 << 6) & 7168), 80);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new y(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17631a aVar, C17631a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        r(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: U0.A1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(com.google.android.gms.maps.model.LatLngBounds r40, nI.C17631a<XH.C16807N> r41, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r42, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r43, androidx.compose.ui.d r44, boolean r45, boolean r46, Uc.C9296d r47, boolean r48, nI.C17631a<XH.C16807N> r49, java.lang.String r50, nI.C17631a<XH.C16807N> r51, float r52, float r53, float r54, O0.L0 r55, U0.C4889m r56, int r57, int r58, int r59) {
        /*
            r15 = r41
            r14 = r42
            r13 = r43
            r0 = r47
            r12 = r57
            r11 = r58
            r10 = r59
            java.lang.String r1 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            java.lang.String r1 = "bottomSheetContent"
            kotlin.jvm.internal.C17542s.j(r14, r1)
            java.lang.String r1 = "mapContent"
            kotlin.jvm.internal.C17542s.j(r13, r1)
            r1 = 201943441(0xc096991, float:1.0585864E-31)
            r2 = r56
            U0.m r9 = r2.k(r1)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0030
            r1 = r12 | 6
            r3 = r1
            r1 = r40
            goto L_0x0044
        L_0x0030:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0041
            r1 = r40
            boolean r3 = r9.F(r1)
            if (r3 == 0) goto L_0x003e
            r3 = 4
            goto L_0x003f
        L_0x003e:
            r3 = 2
        L_0x003f:
            r3 = r3 | r12
            goto L_0x0044
        L_0x0041:
            r1 = r40
            r3 = r12
        L_0x0044:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x004b
            r3 = r3 | 48
            goto L_0x005b
        L_0x004b:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x005b
            boolean r4 = r9.F(r15)
            if (r4 == 0) goto L_0x0058
            r4 = 32
            goto L_0x005a
        L_0x0058:
            r4 = 16
        L_0x005a:
            r3 = r3 | r4
        L_0x005b:
            r4 = r10 & 4
            r16 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0064
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0064:
            r4 = r12 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0074
            boolean r4 = r9.F(r14)
            if (r4 == 0) goto L_0x0071
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r4 = r16
        L_0x0073:
            r3 = r3 | r4
        L_0x0074:
            r4 = r10 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x007f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x008f
        L_0x007f:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x008f
            boolean r4 = r9.F(r13)
            if (r4 == 0) goto L_0x008c
            r4 = r18
            goto L_0x008e
        L_0x008c:
            r4 = r17
        L_0x008e:
            r3 = r3 | r4
        L_0x008f:
            r4 = r10 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x009c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0099:
            r2 = r44
            goto L_0x00af
        L_0x009c:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0099
            r2 = r44
            boolean r21 = r9.V(r2)
            if (r21 == 0) goto L_0x00ab
            r21 = r20
            goto L_0x00ad
        L_0x00ab:
            r21 = r19
        L_0x00ad:
            r3 = r3 | r21
        L_0x00af:
            r21 = r10 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ba
            r3 = r3 | r22
            r5 = r45
            goto L_0x00cd
        L_0x00ba:
            r23 = r12 & r22
            r5 = r45
            if (r23 != 0) goto L_0x00cd
            boolean r24 = r9.b(r5)
            if (r24 == 0) goto L_0x00c9
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cb
        L_0x00c9:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00cb:
            r3 = r3 | r24
        L_0x00cd:
            r24 = r10 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00d8
            r3 = r3 | r25
            r6 = r46
            goto L_0x00eb
        L_0x00d8:
            r25 = r12 & r25
            r6 = r46
            if (r25 != 0) goto L_0x00eb
            boolean r26 = r9.b(r6)
            if (r26 == 0) goto L_0x00e7
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r3 = r3 | r26
        L_0x00eb:
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r12 & r26
            if (r27 != 0) goto L_0x010b
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x0108
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = r7 & r12
            if (r7 != 0) goto L_0x00ff
            boolean r7 = r9.V(r0)
            goto L_0x0103
        L_0x00ff:
            boolean r7 = r9.F(r0)
        L_0x0103:
            if (r7 == 0) goto L_0x0108
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r3 = r3 | r7
        L_0x010b:
            r7 = r10 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x0116
            r3 = r3 | r29
            r8 = r48
            goto L_0x0129
        L_0x0116:
            r29 = r12 & r29
            r8 = r48
            if (r29 != 0) goto L_0x0129
            boolean r30 = r9.b(r8)
            if (r30 == 0) goto L_0x0125
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0125:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r3 = r3 | r30
        L_0x0129:
            r8 = r10 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0138
            r3 = r3 | r30
            r31 = r3
            r30 = r8
            r8 = r49
            goto L_0x0155
        L_0x0138:
            r30 = r12 & r30
            if (r30 != 0) goto L_0x0150
            r30 = r8
            r8 = r49
            boolean r31 = r9.F(r8)
            if (r31 == 0) goto L_0x0149
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014b
        L_0x0149:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014b:
            r3 = r3 | r31
        L_0x014d:
            r31 = r3
            goto L_0x0155
        L_0x0150:
            r30 = r8
            r8 = r49
            goto L_0x014d
        L_0x0155:
            r3 = r10 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x015e
            r32 = r11 | 6
            r8 = r50
            goto L_0x0174
        L_0x015e:
            r32 = r11 & 6
            r8 = r50
            if (r32 != 0) goto L_0x0172
            boolean r32 = r9.V(r8)
            if (r32 == 0) goto L_0x016d
            r32 = 4
            goto L_0x016f
        L_0x016d:
            r32 = 2
        L_0x016f:
            r32 = r11 | r32
            goto L_0x0174
        L_0x0172:
            r32 = r11
        L_0x0174:
            r8 = r10 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0181
            r32 = r32 | 48
            r33 = r8
            r0 = r32
            r8 = r51
            goto L_0x019e
        L_0x0181:
            r33 = r11 & 48
            if (r33 != 0) goto L_0x0199
            r33 = r8
            r8 = r51
            boolean r34 = r9.F(r8)
            if (r34 == 0) goto L_0x0192
            r23 = 32
            goto L_0x0194
        L_0x0192:
            r23 = 16
        L_0x0194:
            r32 = r32 | r23
        L_0x0196:
            r0 = r32
            goto L_0x019e
        L_0x0199:
            r33 = r8
            r8 = r51
            goto L_0x0196
        L_0x019e:
            r8 = r10 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x01a7
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x01a4:
            r1 = r52
            goto L_0x01b7
        L_0x01a7:
            r1 = r11 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x01a4
            r1 = r52
            boolean r23 = r9.c(r1)
            if (r23 == 0) goto L_0x01b5
            r16 = 256(0x100, float:3.59E-43)
        L_0x01b5:
            r0 = r0 | r16
        L_0x01b7:
            r16 = r8
            r8 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01c2
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01bf:
            r1 = r53
            goto L_0x01d2
        L_0x01c2:
            r1 = r11 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01bf
            r1 = r53
            boolean r23 = r9.c(r1)
            if (r23 == 0) goto L_0x01d0
            r17 = r18
        L_0x01d0:
            r0 = r0 | r17
        L_0x01d2:
            r17 = r8
            r8 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01dd
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01da:
            r1 = r54
            goto L_0x01ed
        L_0x01dd:
            r1 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01da
            r1 = r54
            boolean r18 = r9.c(r1)
            if (r18 == 0) goto L_0x01eb
            r19 = r20
        L_0x01eb:
            r0 = r0 | r19
        L_0x01ed:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r10 & r18
            if (r18 == 0) goto L_0x01fb
            r0 = r0 | r22
        L_0x01f6:
            r19 = r8
            r8 = r55
            goto L_0x0210
        L_0x01fb:
            r19 = r11 & r22
            if (r19 != 0) goto L_0x01f6
            r19 = r8
            r8 = r55
            boolean r20 = r9.V(r8)
            if (r20 == 0) goto L_0x020c
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x020e
        L_0x020c:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x020e:
            r0 = r0 | r20
        L_0x0210:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r31 & r20
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L_0x0246
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r0
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x0246
            boolean r1 = r9.l()
            if (r1 != 0) goto L_0x022a
            goto L_0x0246
        L_0x022a:
            r9.L()
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r15 = r54
            r7 = r6
            r16 = r8
            r2 = r9
            r8 = r47
            r9 = r48
            r6 = r5
            r5 = r44
            goto L_0x063c
        L_0x0246:
            r9.G()
            r1 = r12 & 1
            r2 = 0
            r8 = 0
            r20 = r7
            r7 = 1
            if (r1 == 0) goto L_0x0280
            boolean r1 = r9.O()
            if (r1 == 0) goto L_0x0259
            goto L_0x0280
        L_0x0259:
            r9.L()
            r1 = r10 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0265
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r31 = r31 & r1
        L_0x0265:
            r21 = r44
            r7 = r47
            r23 = r48
            r24 = r49
            r25 = r50
            r27 = r52
            r28 = r53
            r29 = r54
            r22 = r5
            r8 = r6
            r3 = r31
            r6 = r51
            r5 = r55
            goto L_0x038a
        L_0x0280:
            if (r4 == 0) goto L_0x0285
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x0287
        L_0x0285:
            r1 = r44
        L_0x0287:
            if (r21 == 0) goto L_0x028c
            r21 = r8
            goto L_0x028e
        L_0x028c:
            r21 = r5
        L_0x028e:
            if (r24 == 0) goto L_0x0293
            r22 = r8
            goto L_0x0295
        L_0x0293:
            r22 = r6
        L_0x0295:
            r4 = r10 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x02da
            r4 = -1911106014(0xffffffff8e16d622, float:-1.8592029E-30)
            r9.W(r4)
            Uc.d$a r4 = Uc.C9296d.f64230h
            f1.k r4 = r4.a()
            java.lang.Object[] r5 = new java.lang.Object[r8]
            Tr.D$a r6 = new Tr.D$a
            r6.<init>()
            r23 = 0
            r24 = 0
            r25 = 0
            r2 = r5
            r27 = r3
            r3 = r4
            r4 = r25
            r5 = r6
            r6 = r9
            r7 = r23
            r44 = r1
            r1 = r8
            r23 = r17
            r25 = r19
            r17 = r33
            r19 = r16
            r16 = r30
            r8 = r24
            java.lang.Object r2 = f1.C5301c.e(r2, r3, r4, r5, r6, r7, r8)
            Uc.d r2 = (Uc.C9296d) r2
            r9.P()
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r31 = r31 & r3
            goto L_0x02eb
        L_0x02da:
            r44 = r1
            r27 = r3
            r1 = r8
            r23 = r17
            r25 = r19
            r17 = r33
            r19 = r16
            r16 = r30
            r2 = r47
        L_0x02eb:
            if (r20 == 0) goto L_0x02ef
            r3 = 1
            goto L_0x02f1
        L_0x02ef:
            r3 = r48
        L_0x02f1:
            if (r16 == 0) goto L_0x02f5
            r4 = 0
            goto L_0x02f7
        L_0x02f5:
            r4 = r49
        L_0x02f7:
            if (r27 == 0) goto L_0x02fb
            r5 = 0
            goto L_0x02fd
        L_0x02fb:
            r5 = r50
        L_0x02fd:
            if (r17 == 0) goto L_0x031f
            r6 = -497415971(0xffffffffe25a08dd, float:-1.0055072E21)
            r9.W(r6)
            java.lang.Object r6 = r9.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x0319
            Tr.t r6 = new Tr.t
            r6.<init>()
            r9.u(r6)
        L_0x0319:
            nI.a r6 = (nI.C17631a) r6
            r9.P()
            goto L_0x0321
        L_0x031f:
            r6 = r51
        L_0x0321:
            if (r19 == 0) goto L_0x0326
            r7 = 1077936128(0x40400000, float:3.0)
            goto L_0x0328
        L_0x0326:
            r7 = r52
        L_0x0328:
            if (r23 == 0) goto L_0x032e
            r8 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x0330
        L_0x032e:
            r8 = r53
        L_0x0330:
            if (r25 == 0) goto L_0x0336
            r16 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x0338
        L_0x0336:
            r16 = r54
        L_0x0338:
            if (r18 == 0) goto L_0x0373
            r1 = -497407845(0xffffffffe25a289b, float:-1.006079E21)
            r9.W(r1)
            java.lang.Object r1 = r9.D()
            U0.m$a r18 = U0.C4889m.f14007a
            r45 = r2
            java.lang.Object r2 = r18.a()
            if (r1 != r2) goto L_0x0356
            O0.L0 r1 = new O0.L0
            r1.<init>()
            r9.u(r1)
        L_0x0356:
            O0.L0 r1 = (O0.L0) r1
            r9.P()
            r23 = r3
            r24 = r4
            r25 = r5
            r27 = r7
            r28 = r8
            r29 = r16
            r8 = r22
            r3 = r31
            r7 = r45
            r5 = r1
        L_0x036e:
            r22 = r21
            r21 = r44
            goto L_0x038a
        L_0x0373:
            r45 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r27 = r7
            r28 = r8
            r29 = r16
            r8 = r22
            r3 = r31
            r7 = r45
            r5 = r55
            goto L_0x036e
        L_0x038a:
            r9.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x039b
            r1 = 201943441(0xc096991, float:1.0585864E-31)
            java.lang.String r2 = "com.ingka.ikea.googlemaps.presentation.MapBottomSheet (MapBottomSheet.kt:139)"
            U0.C4895p.S(r1, r3, r0, r2)
        L_0x039b:
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r9.Q(r1)
            r16 = r1
            android.content.Context r16 = (android.content.Context) r16
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r1 = r9.Q(r1)
            r18 = r1
            c2.d r18 = (c2.d) r18
            int r1 = r3 >> 18
            r1 = r1 & 14
            Ww.b r2 = P(r8, r9, r1)
            r1 = 0
            XH.v r4 = Yw.d.h(r9, r1)
            java.lang.Object r1 = r4.a()
            U0.A1 r1 = (U0.A1) r1
            java.lang.Object r4 = r4.b()
            nI.a r4 = (nI.C17631a) r4
            r51 = r6
            r6 = -497395334(0xffffffffe25a597a, float:-1.0069594E21)
            r9.W(r6)
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r3
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r10) goto L_0x03dd
            r6 = 1
            goto L_0x03de
        L_0x03dd:
            r6 = 0
        L_0x03de:
            java.lang.Object r10 = r9.D()
            if (r6 != 0) goto L_0x03ec
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r10 != r6) goto L_0x03f8
        L_0x03ec:
            Tr.u r6 = new Tr.u
            r6.<init>(r8, r2, r1)
            U0.A1 r10 = U0.p1.e(r6)
            r9.u(r10)
        L_0x03f8:
            r20 = r10
            U0.A1 r20 = (U0.A1) r20
            r9.P()
            boolean r1 = B(r20)
            r6 = 0
            r10 = 6
            r19 = 0
            r30 = 0
            r44 = r1
            r45 = r19
            r46 = r30
            r48 = r9
            r49 = r6
            r50 = r10
            U0.A1 r1 = ap.c.d(r44, r45, r46, r48, r49, r50)
            r6 = -497384323(0xffffffffe25a847d, float:-1.00773425E21)
            r9.W(r6)
            java.lang.Object r6 = r9.D()
            U0.m$a r10 = U0.C4889m.f14007a
            r19 = r8
            java.lang.Object r8 = r10.a()
            if (r6 != r8) goto L_0x0439
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r8 = 2
            r11 = 0
            U0.r0 r6 = U0.u1.e(r6, r11, r8, r11)
            r9.u(r6)
            goto L_0x043a
        L_0x0439:
            r11 = 0
        L_0x043a:
            r8 = r6
            U0.r0 r8 = (U0.C4899r0) r8
            r9.P()
            if (r2 == 0) goto L_0x0447
            Ww.r$a r6 = r2.i()
            goto L_0x0448
        L_0x0447:
            r6 = r11
        L_0x0448:
            r11 = -497381322(0xffffffffe25a9036, float:-1.0079454E21)
            r9.W(r11)
            boolean r11 = r9.V(r2)
            boolean r30 = r9.V(r4)
            r11 = r11 | r30
            java.lang.Object r12 = r9.D()
            if (r11 != 0) goto L_0x0464
            java.lang.Object r11 = r10.a()
            if (r12 != r11) goto L_0x046d
        L_0x0464:
            Tr.D$b r12 = new Tr.D$b
            r11 = 0
            r12.<init>(r2, r4, r8, r11)
            r9.u(r12)
        L_0x046d:
            nI.p r12 = (nI.p) r12
            r9.P()
            r11 = 0
            U0.P.g(r6, r12, r9, r11)
            r6 = -497375781(0xffffffffe25aa5db, float:-1.00833534E21)
            r9.W(r6)
            boolean r6 = D(r8)
            if (r6 == 0) goto L_0x04c6
            android.location.Location r6 = C(r1)
            r11 = -497373431(0xffffffffe25aaf09, float:-1.0085007E21)
            r9.W(r11)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r3
            r11 = r11 ^ r26
            r12 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 <= r12) goto L_0x049b
            boolean r11 = r9.F(r7)
            if (r11 != 0) goto L_0x049f
        L_0x049b:
            r11 = r3 & r26
            if (r11 != r12) goto L_0x04a1
        L_0x049f:
            r11 = 1
            goto L_0x04a2
        L_0x04a1:
            r11 = 0
        L_0x04a2:
            boolean r12 = r9.V(r1)
            r11 = r11 | r12
            java.lang.Object r12 = r9.D()
            if (r11 != 0) goto L_0x04b3
            java.lang.Object r11 = r10.a()
            if (r12 != r11) goto L_0x04bc
        L_0x04b3:
            Tr.D$c r12 = new Tr.D$c
            r11 = 0
            r12.<init>(r7, r1, r8, r11)
            r9.u(r12)
        L_0x04bc:
            nI.p r12 = (nI.p) r12
            r9.P()
            r1 = 0
            U0.P.g(r6, r12, r9, r1)
            goto L_0x04c7
        L_0x04c6:
            r1 = 0
        L_0x04c7:
            r9.P()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r1 = -497356748(0xffffffffe25af034, float:-1.0096747E21)
            r9.W(r1)
            java.lang.Object r1 = r9.D()
            java.lang.Object r11 = r10.a()
            if (r1 != r11) goto L_0x04e4
            Tr.v r1 = new Tr.v
            r1.<init>()
            r9.u(r1)
        L_0x04e4:
            nI.a r1 = (nI.C17631a) r1
            r9.P()
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r26 = 0
            r30 = 0
            r44 = r6
            r45 = r26
            r46 = r30
            r47 = r1
            r48 = r9
            r49 = r11
            r50 = r12
            java.lang.Object r1 = f1.C5301c.e(r44, r45, r46, r47, r48, r49, r50)
            r12 = r1
            U0.r0 r12 = (U0.C4899r0) r12
            if (r2 == 0) goto L_0x050c
            Ww.r$b r1 = r2.c()
            goto L_0x050d
        L_0x050c:
            r1 = 0
        L_0x050d:
            r6 = -497353841(0xffffffffe25afb8f, float:-1.0098792E21)
            r9.W(r6)
            boolean r6 = r9.V(r2)
            boolean r11 = r9.V(r12)
            r6 = r6 | r11
            java.lang.Object r11 = r9.D()
            if (r6 != 0) goto L_0x0528
            java.lang.Object r6 = r10.a()
            if (r11 != r6) goto L_0x0531
        L_0x0528:
            Tr.D$d r11 = new Tr.D$d
            r6 = 0
            r11.<init>(r2, r12, r6)
            r9.u(r11)
        L_0x0531:
            nI.p r11 = (nI.p) r11
            r9.P()
            r6 = 0
            U0.P.g(r1, r11, r9, r6)
            O0.G0 r1 = O0.G0.Expanded
            r6 = 390(0x186, float:5.47E-43)
            r10 = 2
            r11 = 0
            r26 = 1
            r44 = r1
            r45 = r11
            r46 = r26
            r47 = r9
            r48 = r6
            r49 = r10
            O0.F0 r1 = O0.C4734j.g(r44, r45, r46, r47, r48, r49)
            int r0 = r0 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = 0
            O0.k r0 = O0.C4734j.f(r1, r5, r9, r0, r6)
            r26 = r4
            r4 = r0
            Tr.D$e r11 = new Tr.D$e
            r0 = r11
            r1 = r28
            r10 = r2
            r2 = r23
            r31 = r3
            r3 = r29
            r30 = r5
            r5 = r18
            r35 = r51
            r6 = r42
            r32 = r7
            r7 = r10
            r33 = r19
            r19 = r8
            r8 = r16
            r10 = r9
            r9 = r40
            r36 = r10
            r10 = r27
            r37 = r11
            r11 = r32
            r53 = r12
            r12 = r25
            r13 = r24
            r14 = r43
            r15 = r22
            r16 = r41
            r17 = r33
            r18 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 815658619(0x309df67b, float:1.1493307E-9)
            r1 = 54
            r2 = r36
            r4 = r37
            r3 = 1
            c1.a r0 = c1.c.e(r0, r3, r4, r2, r1)
            int r4 = r31 >> 12
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r5 = 6
            r6 = 0
            r7 = 0
            r44 = r21
            r45 = r6
            r46 = r7
            r47 = r0
            r48 = r2
            r49 = r4
            r50 = r5
            s0.C5858d.a(r44, r45, r46, r47, r48, r49, r50)
            boolean r0 = x(r53)
            Tr.D$f r4 = new Tr.D$f
            r5 = r53
            r6 = r35
            r4.<init>(r6, r5)
            r7 = 740740537(0x2c26cdb9, float:2.3704218E-12)
            c1.a r4 = c1.c.e(r7, r3, r4, r2, r1)
            r7 = 196608(0x30000, float:2.75506E-40)
            r8 = 30
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r44 = r0
            r45 = r9
            r46 = r10
            r47 = r11
            r48 = r12
            r49 = r4
            r50 = r2
            r51 = r7
            r52 = r8
            l0.d.g(r44, r45, r46, r47, r48, r49, r50, r51, r52)
            boolean r0 = x(r5)
            Tr.D$g r4 = new Tr.D$g
            r4.<init>(r6, r5)
            r5 = -104948318(0xfffffffff9be9da2, float:-1.237167E35)
            c1.a r1 = c1.c.e(r5, r3, r4, r2, r1)
            r3 = 196608(0x30000, float:2.75506E-40)
            r4 = 30
            r5 = 0
            r7 = 0
            r8 = 0
            r44 = r0
            r45 = r5
            r46 = r7
            r47 = r8
            r48 = r9
            r49 = r1
            r51 = r3
            r52 = r4
            l0.d.g(r44, r45, r46, r47, r48, r49, r50, r51, r52)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0625
            U0.C4895p.R()
        L_0x0625:
            r12 = r6
            r5 = r21
            r6 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r8 = r32
            r7 = r33
        L_0x063c:
            U0.Y0 r4 = r2.n()
            if (r4 == 0) goto L_0x0661
            Tr.w r3 = new Tr.w
            r0 = r3
            r1 = r40
            r2 = r41
            r38 = r3
            r3 = r42
            r39 = r4
            r4 = r43
            r17 = r57
            r18 = r58
            r19 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x0661:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tr.D.u(com.google.android.gms.maps.model.LatLngBounds, nI.a, nI.p, nI.p, androidx.compose.ui.d, boolean, boolean, Uc.d, boolean, nI.a, java.lang.String, nI.a, float, float, float, O0.L0, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N v() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 w() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean x(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void y(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N z(LatLngBounds latLngBounds, C17631a aVar, p pVar, p pVar2, androidx.compose.ui.d dVar, boolean z10, boolean z11, C9296d dVar2, boolean z12, C17631a aVar2, String str, C17631a aVar3, float f10, float f11, float f12, L0 l02, int i10, int i11, int i12, C4889m mVar, int i13) {
        u(latLngBounds, aVar, pVar, pVar2, dVar, z10, z11, dVar2, z12, aVar2, str, aVar3, f10, f11, f12, l02, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }
}
