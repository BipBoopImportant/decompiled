package YB;

import O0.J0;
import O0.L0;
import O0.N0;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Sr.a;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import Uc.C9296d;
import Uc.v1;
import Uc.z1;
import WB.C13772d;
import WB.C13773e;
import WB.C13774f;
import WB.C13775g;
import WB.h;
import WB.i;
import WB.j;
import WB.k;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oa.C8617a;
import oa.C8618b;
import uI.C18059h;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0001\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0001\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b \u0010!\u001a7\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a8\u0010,\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0002H@¢\u0006\u0004\b,\u0010-\u001a\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b0\u00101¨\u00065²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u0002²\u0006\u000e\u00102\u001a\u00020\u00028\n@\nX\u0002²\u0006\u000e\u00103\u001a\u00020\u00028\n@\nX\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u0002²\u0006\f\u00104\u001a\u00020/8\nX\u0002"}, d2 = {"LWB/k;", "viewModel", "", "isCompact", "Lkotlin/Function0;", "LXH/N;", "onCloseFeature", "Lkotlin/Function1;", "LWB/g$a;", "onGetDirectionsClicked", "onAllOpeningHoursClicked", "onPopularTimesClicked", "onGoToSettingsClicked", "LWB/d;", "onAction", "q", "(LWB/k;ZLnI/a;LnI/l;LnI/a;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "LWB/i;", "state", "LWB/e;", "onAnalyticsAction", "t", "(LWB/i;ZLnI/a;LnI/l;LnI/a;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "LWB/j;", "storeData", "isLoading", "LUc/d;", "cameraPositionState", "LO0/L0;", "snackbarHostState", "setIsMapReady", "onSmallStoreDetailsClicked", "k", "(LWB/j;ZLUc/d;LO0/L0;ZLnI/a;LnI/l;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "Landroidx/compose/ui/d;", "modifier", "o", "(LWB/i;ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "", "lat", "lng", "", "zoom", "withAnimation", "L", "(LUc/d;DDFZLdI/e;)Ljava/lang/Object;", "LU0/A1;", "LYB/y;", "J", "(LWB/j;LU0/m;I)LU0/A1;", "isMapReady", "hasAnimatedToInitialPosition", "mapConfig", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f117966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13775g.a, C16807N> f117967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f117968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f117969d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9296d f117970e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f117971f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f117972g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreenKt$StoreDetailsMapBottomSheet$1$1$1$1$1", f = "StoreDetailsScreen.kt", l = {229}, m = "invokeSuspend")
        /* renamed from: YB.V$a$a  reason: collision with other inner class name */
        static final class C2928a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f117973c;

            /* renamed from: d  reason: collision with root package name */
            Object f117974d;

            /* renamed from: e  reason: collision with root package name */
            Object f117975e;

            /* renamed from: f  reason: collision with root package name */
            int f117976f;

            /* renamed from: g  reason: collision with root package name */
            int f117977g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C13774f f117978h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C9296d f117979i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2928a(C13774f fVar, C9296d dVar, C17164e<? super C2928a> eVar) {
                super(2, eVar);
                this.f117978h = fVar;
                this.f117979i = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2928a(this.f117978h, this.f117979i, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2928a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f117977g;
                if (i10 == 0) {
                    y.b(obj);
                    C13774f fVar = this.f117978h;
                    C9296d dVar = this.f117979i;
                    double a10 = fVar.a();
                    double b10 = fVar.b();
                    this.f117973c = fVar;
                    this.f117974d = dVar;
                    this.f117975e = fVar;
                    this.f117976f = 0;
                    this.f117977g = 1;
                    if (V.M(dVar, a10, b10, 0.0f, false, this, 12, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    C13774f fVar2 = (C13774f) this.f117975e;
                    C9296d dVar2 = (C9296d) this.f117974d;
                    C13774f fVar3 = (C13774f) this.f117973c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        a(j jVar, C17642l<? super C13775g.a, C16807N> lVar, C17631a<C16807N> aVar, Q q10, C9296d dVar, C17642l<? super Boolean, C16807N> lVar2, boolean z10) {
            this.f117966a = jVar;
            this.f117967b = lVar;
            this.f117968c = aVar;
            this.f117969d = q10;
            this.f117970e = dVar;
            this.f117971f = lVar2;
            this.f117972g = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Q q10, C9296d dVar, C13774f fVar) {
            C17542s.j(fVar, "location");
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C2928a(fVar, dVar, (C17164e<? super C2928a>) null), 3, (Object) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r18, int r19) {
            /*
                r17 = this;
                r0 = r17
                r11 = r18
                r1 = r19
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r18.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r18.L()
                goto L_0x0105
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsMapBottomSheet.<anonymous> (StoreDetailsScreen.kt:220)"
                r4 = 2001769896(0x775095a8, float:4.2305982E33)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                WB.j r1 = r0.f117966a
                nI.l<WB.g$a, XH.N> r2 = r0.f117967b
                nI.a<XH.N> r3 = r0.f117968c
                QJ.Q r4 = r0.f117969d
                Uc.d r5 = r0.f117970e
                nI.l<java.lang.Boolean, XH.N> r6 = r0.f117971f
                boolean r7 = r0.f117972g
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r8 = r8.g()
                i1.c$a r9 = i1.C5437c.f24302a
                i1.c$b r9 = r9.k()
                r10 = 0
                E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r11, r10)
                int r9 = U0.C4883j.a(r11, r10)
                U0.y r10 = r18.s()
                androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r11, r12)
                G1.g$a r14 = G1.C4504g.f6515W
                nI.a r15 = r14.a()
                U0.f r16 = r18.m()
                if (r16 != 0) goto L_0x0062
                U0.C4883j.c()
            L_0x0062:
                r18.I()
                boolean r16 = r18.i()
                if (r16 == 0) goto L_0x006f
                r11.p(r15)
                goto L_0x0072
            L_0x006f:
                r18.t()
            L_0x0072:
                U0.m r15 = U0.F1.a(r18)
                nI.p r0 = r14.c()
                U0.F1.c(r15, r8, r0)
                nI.p r0 = r14.e()
                U0.F1.c(r15, r10, r0)
                nI.p r0 = r14.b()
                boolean r8 = r15.i()
                if (r8 != 0) goto L_0x009c
                java.lang.Object r8 = r15.D()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
                if (r8 != 0) goto L_0x00aa
            L_0x009c:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r15.u(r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r15.w(r8, r0)
            L_0x00aa:
                nI.p r0 = r14.d()
                U0.F1.c(r15, r13, r0)
                s0.h r0 = s0.C5862h.f28810a
                r0 = -677827808(0xffffffffd7992b20, float:-3.36820999E14)
                r11.W(r0)
                boolean r0 = r11.F(r4)
                boolean r8 = r11.F(r5)
                r0 = r0 | r8
                java.lang.Object r8 = r18.D()
                if (r0 != 0) goto L_0x00d0
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r8 != r0) goto L_0x00d8
            L_0x00d0:
                YB.U r8 = new YB.U
                r8.<init>(r4, r5)
                r11.u(r8)
            L_0x00d8:
                r4 = r8
                nI.l r4 = (nI.C17642l) r4
                r18.P()
                r9 = 0
                r10 = 64
                r0 = 0
                r5 = r6
                r6 = r7
                r7 = r0
                r8 = r18
                YB.C13841h.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0 = 80
                float r0 = (float) r0
                float r0 = c2.h.B(r0)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r12, r0)
                r1 = 6
                s0.C5844O.a(r0, r11, r1)
                r18.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0105
                U0.C4895p.R()
            L_0x0105:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: YB.V.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f117980a;

        b(j jVar) {
            this.f117980a = jVar;
        }

        public final void a(C4889m mVar, int i10) {
            C13775g b10;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(137553065, i11, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsMapBottomSheet.<anonymous> (StoreDetailsScreen.kt:201)");
                }
                j jVar = this.f117980a;
                j.a aVar = jVar instanceof j.a ? (j.a) jVar : null;
                List<h> c10 = (aVar == null || (b10 = aVar.b()) == null) ? null : b10.c();
                if (c10 != null) {
                    for (h hVar : c10) {
                        v1.F(new Object[0], v1.l0((String) null, new LatLng(hVar.a().a(), hVar.a().b()), mVar, 0, 1), (String) null, 0.0f, 0, false, false, 0, 0.0f, (String) null, (Object) null, (String) null, false, 0.0f, (C17642l<? super qa.h, Boolean>) null, (C17642l<? super qa.h, C16807N>) null, (C17642l<? super qa.h, C16807N>) null, (C17642l<? super qa.h, C16807N>) null, C13851r.f118048a.a(), mVar, z1.f64468f << 3, 100663296, 262140);
                    }
                }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<C13773e, C16807N> {
        c(Object obj) {
            super(1, obj, k.class, "handleAnalyticsAction", "handleAnalyticsAction(Lcom/ingka/ikea/storedetails/impl/map/presentation/StoreDetailsContract$AnalyticsAction;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C13773e) obj);
            return C16807N.f139792a;
        }

        public final void t(C13773e eVar) {
            C17542s.j(eVar, "p0");
            ((k) this.receiver).h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreenKt$StoreDetailsScreenUi$1$1$1", f = "StoreDetailsScreen.kt", l = {111}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117981c;

        /* renamed from: d  reason: collision with root package name */
        Object f117982d;

        /* renamed from: e  reason: collision with root package name */
        Object f117983e;

        /* renamed from: f  reason: collision with root package name */
        int f117984f;

        /* renamed from: g  reason: collision with root package name */
        int f117985g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f117986h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f117987i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f117988j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C9296d f117989k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, C4899r0<Boolean> r0Var, C4899r0<Boolean> r0Var2, C9296d dVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f117986h = jVar;
            this.f117987i = r0Var;
            this.f117988j = r0Var2;
            this.f117989k = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f117986h, this.f117987i, this.f117988j, this.f117989k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117985g;
            if (i10 == 0) {
                y.b(obj);
                if ((this.f117986h instanceof j.a) && !V.D(this.f117987i) && V.A(this.f117988j)) {
                    C13774f a10 = ((j.a) this.f117986h).b().a();
                    C9296d dVar = this.f117989k;
                    double a11 = a10.a();
                    double b10 = a10.b();
                    this.f117981c = a10;
                    this.f117982d = dVar;
                    this.f117983e = a10;
                    this.f117984f = 0;
                    this.f117985g = 1;
                    if (V.M(dVar, a11, b10, 0.0f, false, this, 4, (Object) null) == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                C13774f fVar = (C13774f) this.f117983e;
                C9296d dVar2 = (C9296d) this.f117982d;
                C13774f fVar2 = (C13774f) this.f117981c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.u(this.f117987i, true);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreenKt$StoreDetailsScreenUi$1$2$1", f = "StoreDetailsScreen.kt", l = {124}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117990c;

        /* renamed from: d  reason: collision with root package name */
        int f117991d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f117992e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L0 f117993f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f117994g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f117995h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<C13772d, C16807N> f117996i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f117997a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r1 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f117997a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: YB.V.e.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar, L0 l02, Context context, C17631a<C16807N> aVar, C17642l<? super C13772d, C16807N> lVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f117992e = jVar;
            this.f117993f = l02;
            this.f117994g = context;
            this.f117995h = aVar;
            this.f117996i = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f117992e, this.f117993f, this.f117994g, this.f117995h, this.f117996i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117991d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f117992e instanceof j.b) {
                    L0 l02 = this.f117993f;
                    String string = this.f117994g.getString(Oo.b.f84812v3);
                    C17542s.i(string, "getString(...)");
                    String string2 = this.f117994g.getString(Oo.b.f84750p7);
                    J0 j02 = J0.Indefinite;
                    this.f117990c = string;
                    this.f117991d = 1;
                    obj = L0.f(l02, string, string2, false, j02, this, 4, (Object) null);
                    if (obj == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                String str = (String) this.f117990c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = a.f117997a[((N0) obj).ordinal()];
            if (i11 == 1) {
                this.f117995h.invoke();
            } else if (i11 == 2) {
                this.f117996i.invoke(C13772d.a.f117524a);
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreenKt$StoreDetailsScreenUi$1$3$1", f = "StoreDetailsScreen.kt", l = {139}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f117999d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f118000e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C4899r0<Boolean> r0Var, C4899r0<Boolean> r0Var2, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f117999d = r0Var;
            this.f118000e = r0Var2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f117999d, this.f118000e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117998c;
            if (i10 == 0) {
                y.b(obj);
                if (V.D(this.f117999d)) {
                    this.f117998c = 1;
                    if (C16297b0.b(50, this) == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.w(this.f118000e, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C17631a<C9296d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l f118001a;

        public g(C17642l lVar) {
            this.f118001a = lVar;
        }

        /* renamed from: a */
        public final C9296d invoke() {
            C9296d c10 = C9296d.a.c(C9296d.f64230h, (CameraPosition) null, 1, (Object) null);
            this.f118001a.invoke(c10);
            return c10;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean A(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void B(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C4899r0 C() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean D(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N E(i iVar, boolean z10, C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17642l lVar2, C17642l lVar3, int i10, C4889m mVar, int i11) {
        t(iVar, z10, aVar, lVar, aVar2, aVar3, aVar4, lVar2, lVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final A1<y> J(j jVar, C4889m mVar, int i10) {
        mVar.W(715884286);
        if (C4895p.J()) {
            C4895p.S(715884286, i10, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.rememberMapConfig (StoreDetailsScreen.kt:286)");
        }
        mVar.W(-1477683122);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(jVar)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = p1.e(new T(jVar));
            mVar.u(D10);
        }
        A1<y> a12 = (A1) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a12;
    }

    /* access modifiers changed from: private */
    public static final y K(j jVar) {
        Float c10;
        a.C1810a.C1811a a10;
        LatLngBounds latLngBounds = null;
        j.a aVar = jVar instanceof j.a ? (j.a) jVar : null;
        C13775g b10 = aVar != null ? aVar.b() : null;
        a.C1810a d10 = b10 != null ? b10.d() : null;
        if (!(d10 == null || (a10 = d10.a()) == null)) {
            latLngBounds = new LatLngBounds(new LatLng(a10.b().a(), a10.b().b()), new LatLng(a10.a().a(), a10.a().b()));
        }
        boolean z10 = false;
        if (d10 != null && d10.d()) {
            z10 = true;
        }
        return new y(latLngBounds, z10, (d10 == null || (c10 = d10.c()) == null) ? 3.0f : c10.floatValue());
    }

    private static final Object L(C9296d dVar, double d10, double d11, float f10, boolean z10, C17164e<? super C16807N> eVar) {
        if (z10) {
            C8617a d12 = C8618b.d(new LatLng(d10, d11), f10);
            C17542s.i(d12, "newLatLngZoom(...)");
            Object n10 = C9296d.n(dVar, d12, 0, eVar, 2, (Object) null);
            return n10 == C17187b.f() ? n10 : C16807N.f139792a;
        }
        C8617a d13 = C8618b.d(new LatLng(d10, d11), f10);
        C17542s.i(d13, "newLatLngZoom(...)");
        dVar.v(d13);
        return C16807N.f139792a;
    }

    static /* synthetic */ Object M(C9296d dVar, double d10, double d11, float f10, boolean z10, C17164e eVar, int i10, Object obj) {
        return L(dVar, d10, d11, (i10 & 4) != 0 ? 14.0f : f10, (i10 & 8) != 0 ? true : z10, eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(WB.j r29, boolean r30, Uc.C9296d r31, O0.L0 r32, boolean r33, nI.C17631a<XH.C16807N> r34, nI.C17642l<? super WB.C13775g.a, XH.C16807N> r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r38, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r39, U0.C4889m r40, int r41, int r42) {
        /*
            r8 = r29
            r15 = r31
            r14 = r38
            r12 = r41
            r0 = 1460279969(0x570a1aa1, float:1.51846975E14)
            r1 = r40
            U0.m r11 = r1.k(r0)
            r1 = r12 & 6
            r2 = 4
            if (r1 != 0) goto L_0x002a
            r1 = r12 & 8
            if (r1 != 0) goto L_0x001f
            boolean r1 = r11.V(r8)
            goto L_0x0023
        L_0x001f:
            boolean r1 = r11.F(r8)
        L_0x0023:
            if (r1 == 0) goto L_0x0027
            r1 = r2
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r12
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r4 = r12 & 48
            r10 = r30
            if (r4 != 0) goto L_0x003d
            boolean r4 = r11.b(r10)
            if (r4 == 0) goto L_0x003a
            r4 = 32
            goto L_0x003c
        L_0x003a:
            r4 = 16
        L_0x003c:
            r1 = r1 | r4
        L_0x003d:
            r4 = r12 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0056
            r4 = r12 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x004a
            boolean r4 = r11.V(r15)
            goto L_0x004e
        L_0x004a:
            boolean r4 = r11.F(r15)
        L_0x004e:
            if (r4 == 0) goto L_0x0053
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r1 = r1 | r4
        L_0x0056:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            r9 = r32
            if (r4 != 0) goto L_0x0068
            boolean r4 = r11.V(r9)
            if (r4 == 0) goto L_0x0065
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0067
        L_0x0065:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = r12 & 24576(0x6000, float:3.4438E-41)
            r13 = r33
            if (r4 != 0) goto L_0x007a
            boolean r4 = r11.b(r13)
            if (r4 == 0) goto L_0x0077
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0079
        L_0x0077:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0079:
            r1 = r1 | r4
        L_0x007a:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r12
            r7 = r34
            if (r4 != 0) goto L_0x008d
            boolean r4 = r11.F(r7)
            if (r4 == 0) goto L_0x008a
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008c
        L_0x008a:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x008c:
            r1 = r1 | r4
        L_0x008d:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r12
            r6 = r35
            if (r4 != 0) goto L_0x00a0
            boolean r4 = r11.F(r6)
            if (r4 == 0) goto L_0x009d
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009f
        L_0x009d:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x009f:
            r1 = r1 | r4
        L_0x00a0:
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 & r12
            r5 = r36
            if (r4 != 0) goto L_0x00b3
            boolean r4 = r11.F(r5)
            if (r4 == 0) goto L_0x00b0
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b2
        L_0x00b0:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b2:
            r1 = r1 | r4
        L_0x00b3:
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 & r12
            if (r4 != 0) goto L_0x00c8
            r4 = r37
            boolean r16 = r11.F(r4)
            if (r16 == 0) goto L_0x00c3
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c5
        L_0x00c3:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00c5:
            r1 = r1 | r16
            goto L_0x00ca
        L_0x00c8:
            r4 = r37
        L_0x00ca:
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00dd
            boolean r16 = r11.F(r14)
            if (r16 == 0) goto L_0x00d9
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00db
        L_0x00d9:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00db:
            r1 = r1 | r16
        L_0x00dd:
            r16 = r42 & 6
            r13 = r39
            if (r16 != 0) goto L_0x00ee
            boolean r16 = r11.F(r13)
            if (r16 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r2 = 2
        L_0x00eb:
            r2 = r42 | r2
            goto L_0x00f0
        L_0x00ee:
            r2 = r42
        L_0x00f0:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x010c
            r0 = r2 & 3
            r3 = 2
            if (r0 != r3) goto L_0x010c
            boolean r0 = r11.l()
            if (r0 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            r11.L()
            r2 = r11
            goto L_0x020e
        L_0x010c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsMapBottomSheet (StoreDetailsScreen.kt:183)"
            r3 = 1460279969(0x570a1aa1, float:1.51846975E14)
            U0.C4895p.S(r3, r1, r2, r0)
        L_0x011a:
            java.lang.Object r0 = r11.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r2 = r16.a()
            if (r0 != r2) goto L_0x0135
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r11)
            U0.B r2 = new U0.B
            r2.<init>(r0)
            r11.u(r2)
            r0 = r2
        L_0x0135:
            U0.B r0 = (U0.B) r0
            QJ.Q r17 = r0.a()
            r0 = r1 & 14
            U0.A1 r0 = J(r8, r11, r0)
            YB.y r2 = l(r0)
            boolean r19 = r2.c()
            int r2 = TB.C13677a.f116661b
            r3 = 0
            java.lang.String r20 = J1.j.b(r2, r11, r3)
            YB.y r2 = l(r0)
            float r21 = r2.b()
            YB.y r0 = l(r0)
            com.google.android.gms.maps.model.LatLngBounds r24 = r0.a()
            YB.V$a r2 = new YB.V$a
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r2
            r22 = r1
            r1 = r29
            r9 = r2
            r2 = r35
            r18 = r3
            r3 = r36
            r4 = r17
            r5 = r31
            r6 = r39
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2001769896(0x775095a8, float:4.2305982E33)
            r3 = 1
            r1 = 54
            c1.a r0 = c1.c.e(r0, r3, r9, r11, r1)
            YB.V$b r2 = new YB.V$b
            r2.<init>(r8)
            r4 = 137553065(0x832e4a9, float:5.3833715E-34)
            c1.a r1 = c1.c.e(r4, r3, r2, r11, r1)
            r2 = -1046015754(0xffffffffc1a710f6, float:-20.883282)
            r11.W(r2)
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r22 & r2
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 != r4) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r3 = r18
        L_0x01a2:
            java.lang.Object r2 = r11.D()
            if (r3 != 0) goto L_0x01ae
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x01b6
        L_0x01ae:
            YB.Q r2 = new YB.Q
            r2.<init>(r14)
            r11.u(r2)
        L_0x01b6:
            r18 = r2
            nI.a r18 = (nI.C17631a) r18
            r11.P()
            int r2 = r22 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 3456(0xd80, float:4.843E-42)
            int r3 = r22 << 12
            r4 = 458752(0x70000, float:6.42848E-40)
            r5 = r3 & r4
            r2 = r2 | r5
            int r5 = Uc.C9296d.f64231i
            int r5 = r5 << 21
            r2 = r2 | r5
            int r5 = r22 << 15
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r6
            r2 = r2 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r26 = r2 | r3
            int r2 = r22 >> 21
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r3 = r22 << 6
            r3 = r3 & r4
            r27 = r2 | r3
            r28 = 24592(0x6010, float:3.4461E-41)
            r2 = 0
            r13 = r2
            r22 = 0
            r23 = 0
            r9 = r24
            r10 = r34
            r2 = r11
            r11 = r0
            r12 = r1
            r14 = r30
            r15 = r19
            r16 = r31
            r17 = r33
            r19 = r20
            r20 = r37
            r24 = r32
            r25 = r2
            Tr.D.u(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x020e
            U0.C4895p.R()
        L_0x020e:
            U0.Y0 r14 = r2.n()
            if (r14 == 0) goto L_0x0237
            YB.S r15 = new YB.S
            r0 = r15
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.a(r15)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.V.k(WB.j, boolean, Uc.d, O0.L0, boolean, nI.a, nI.l, nI.a, nI.a, nI.l, nI.l, U0.m, int, int):void");
    }

    private static final y l(A1<y> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar) {
        lVar.invoke(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(j jVar, boolean z10, C9296d dVar, L0 l02, boolean z11, C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        k(jVar, z10, dVar, l02, z11, aVar, lVar, aVar2, aVar3, lVar2, lVar3, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o(WB.i r21, boolean r22, androidx.compose.ui.d r23, nI.C17631a<XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r21
            r2 = r22
            r5 = r26
            r0 = -515570271(0xffffffffe14505a1, float:-2.2715089E20)
            r3 = r25
            U0.m r3 = r3.k(r0)
            r4 = r27 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r5 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r5 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r3.V(r1)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r3.F(r1)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r5
            goto L_0x002f
        L_0x002e:
            r4 = r5
        L_0x002f:
            r6 = r27 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0047
        L_0x0038:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r3.b(r2)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r4 = r4 | r6
        L_0x0047:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r8 = r23
            goto L_0x0062
        L_0x0050:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004d
            r8 = r23
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r9
        L_0x0062:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r12 = r24
            goto L_0x007d
        L_0x006b:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            r12 = r24
            if (r9 != 0) goto L_0x007d
            boolean r9 = r3.F(r12)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r9
        L_0x007d:
            r9 = r4 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008f
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r3.L()
            r13 = r8
            goto L_0x00ea
        L_0x008f:
            if (r6 == 0) goto L_0x0095
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r13 = r6
            goto L_0x0096
        L_0x0095:
            r13 = r8
        L_0x0096:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a2
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsPopularTimesButton (StoreDetailsScreen.kt:248)"
            U0.C4895p.S(r0, r4, r6, r8)
        L_0x00a2:
            if (r2 == 0) goto L_0x00a6
            r0 = r13
            goto L_0x00ba
        L_0x00a6:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = 560(0x230, float:7.85E-43)
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r8 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.A(r0, r9, r6, r10, r8)
            androidx.compose.ui.d r0 = r0.s(r13)
        L_0x00ba:
            boolean r6 = r21.c()
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            float r7 = (float) r7
            float r18 = c2.h.B(r7)
            r19 = 7
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.d r7 = r7.s(r0)
            int r0 = r4 >> 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r11 = 0
            r8 = r24
            r9 = r3
            eC.C14379b.b(r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ea
            U0.C4895p.R()
        L_0x00ea:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0104
            YB.P r8 = new YB.P
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r13
            r4 = r24
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.V.o(WB.i, boolean, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(i iVar, boolean z10, androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        o(iVar, z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void q(k kVar, boolean z10, C17631a<C16807N> aVar, C17642l<? super C13775g.a, C16807N> lVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17642l<? super C13772d, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        k kVar2 = kVar;
        C17631a<C16807N> aVar5 = aVar;
        C17642l<? super C13775g.a, C16807N> lVar3 = lVar;
        C17631a<C16807N> aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17631a<C16807N> aVar8 = aVar4;
        C17642l<? super C13772d, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(kVar2, "viewModel");
        C17542s.j(aVar5, "onCloseFeature");
        C17542s.j(lVar3, "onGetDirectionsClicked");
        C17542s.j(aVar6, "onAllOpeningHoursClicked");
        C17542s.j(aVar7, "onPopularTimesClicked");
        C17542s.j(aVar8, "onGoToSettingsClicked");
        C17542s.j(lVar4, "onAction");
        C4889m k10 = mVar.k(137759809);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(kVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        boolean z11 = z10;
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar6) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar7) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar8) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar4) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((4793491 & i13) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(137759809, i13, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreen (StoreDetailsScreen.kt:71)");
            }
            int i14 = i13;
            C4889m mVar3 = k10;
            i r10 = r(j3.a.c(kVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            mVar3.W(-296873997);
            boolean z12 = (i14 & 14) == 4;
            Object D10 = mVar3.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new c(kVar2);
                mVar3.u(D10);
            }
            mVar3.P();
            int i15 = i14 & 33554416;
            mVar2 = mVar3;
            t(r10, z10, aVar, lVar, aVar2, aVar3, aVar4, lVar2, (C17642l) ((C18059h) D10), mVar2, i15);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C13826J(kVar, z10, aVar, lVar, aVar2, aVar3, aVar4, lVar2, i10));
        }
    }

    private static final i r(A1<i> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N s(k kVar, boolean z10, C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17642l lVar2, int i10, C4889m mVar, int i11) {
        q(kVar, z10, aVar, lVar, aVar2, aVar3, aVar4, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: YB.V$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: YB.V$d} */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0254, code lost:
        if (r10 == r26.a()) goto L_0x0256;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(WB.i r29, boolean r30, nI.C17631a<XH.C16807N> r31, nI.C17642l<? super WB.C13775g.a, XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, nI.C17631a<XH.C16807N> r35, nI.C17642l<? super WB.C13772d, XH.C16807N> r36, nI.C17642l<? super WB.C13773e, XH.C16807N> r37, U0.C4889m r38, int r39) {
        /*
            r7 = r29
            r15 = r31
            r14 = r32
            r13 = r33
            r12 = r34
            r11 = r35
            r10 = r36
            r9 = r37
            r8 = r39
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onCloseFeature"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onGetDirectionsClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onAllOpeningHoursClicked"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onPopularTimesClicked"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onGoToSettingsClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onAnalyticsAction"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -1384659982(0xffffffffad77c3f2, float:-1.4083833E-11)
            r1 = r38
            U0.m r6 = r1.k(r0)
            r1 = r8 & 6
            if (r1 != 0) goto L_0x005b
            r1 = r8 & 8
            if (r1 != 0) goto L_0x0050
            boolean r1 = r6.V(r7)
            goto L_0x0054
        L_0x0050:
            boolean r1 = r6.F(r7)
        L_0x0054:
            if (r1 == 0) goto L_0x0058
            r1 = 4
            goto L_0x0059
        L_0x0058:
            r1 = 2
        L_0x0059:
            r1 = r1 | r8
            goto L_0x005c
        L_0x005b:
            r1 = r8
        L_0x005c:
            r2 = r8 & 48
            r4 = r30
            if (r2 != 0) goto L_0x006e
            boolean r2 = r6.b(r4)
            if (r2 == 0) goto L_0x006b
            r2 = 32
            goto L_0x006d
        L_0x006b:
            r2 = 16
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r6.F(r15)
            if (r2 == 0) goto L_0x007b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007d:
            r1 = r1 | r2
        L_0x007e:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x008e
            boolean r2 = r6.F(r14)
            if (r2 == 0) goto L_0x008b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r1 = r1 | r2
        L_0x008e:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x009e
            boolean r2 = r6.F(r13)
            if (r2 == 0) goto L_0x009b
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r2
        L_0x009e:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00af
            boolean r2 = r6.F(r12)
            if (r2 == 0) goto L_0x00ac
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r2
        L_0x00af:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00c0
            boolean r2 = r6.F(r11)
            if (r2 == 0) goto L_0x00bd
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bf
        L_0x00bd:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00bf:
            r1 = r1 | r2
        L_0x00c0:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00d1
            boolean r2 = r6.F(r10)
            if (r2 == 0) goto L_0x00ce
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d0
        L_0x00ce:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00d0:
            r1 = r1 | r2
        L_0x00d1:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00e2
            boolean r2 = r6.F(r9)
            if (r2 == 0) goto L_0x00df
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00e1
        L_0x00df:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00e1:
            r1 = r1 | r2
        L_0x00e2:
            r2 = r1
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r2
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00fa
            boolean r0 = r6.l()
            if (r0 != 0) goto L_0x00f3
            goto L_0x00fa
        L_0x00f3:
            r6.L()
            r22 = r6
            goto L_0x0411
        L_0x00fa:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0109
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDetailsScreenUi (StoreDetailsScreen.kt:98)"
            r3 = -1384659982(0xffffffffad77c3f2, float:-1.4083833E-11)
            U0.C4895p.S(r3, r2, r0, r1)
        L_0x0109:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r3 = 1
            r7 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r0, r1, r3, r7)
            i1.c$a r23 = i1.C5437c.f24302a
            i1.c r3 = r23.o()
            r7 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r7)
            int r16 = U0.C4883j.a(r6, r7)
            U0.y r5 = r6.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r6, r1)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r7 = r17.a()
            U0.f r18 = r6.m()
            if (r18 != 0) goto L_0x0138
            U0.C4883j.c()
        L_0x0138:
            r6.I()
            boolean r18 = r6.i()
            if (r18 == 0) goto L_0x0145
            r6.p(r7)
            goto L_0x0148
        L_0x0145:
            r6.t()
        L_0x0148:
            U0.m r7 = U0.F1.a(r6)
            r24 = r0
            nI.p r0 = r17.c()
            U0.F1.c(r7, r3, r0)
            nI.p r0 = r17.e()
            U0.F1.c(r7, r5, r0)
            nI.p r0 = r17.b()
            boolean r3 = r7.i()
            if (r3 != 0) goto L_0x0174
            java.lang.Object r3 = r7.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 != 0) goto L_0x0182
        L_0x0174:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r7.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r7.w(r3, r0)
        L_0x0182:
            nI.p r0 = r17.d()
            U0.F1.c(r7, r1, r0)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r6.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            WB.j r5 = r29.d()
            YB.K r1 = new YB.K
            r1.<init>()
            r3 = -1911106014(0xffffffff8e16d622, float:-1.8592029E-30)
            r6.W(r3)
            Uc.d$a r3 = Uc.C9296d.f64230h
            f1.k r17 = r3.a()
            r25 = r2
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            YB.V$g r3 = new YB.V$g
            r3.<init>(r1)
            r21 = 0
            r22 = 0
            r18 = 0
            r16 = r2
            r19 = r3
            r20 = r6
            java.lang.Object r1 = f1.C5301c.e(r16, r17, r18, r19, r20, r21, r22)
            r3 = r1
            Uc.d r3 = (Uc.C9296d) r3
            r6.P()
            r1 = -1361059896(0xffffffffaedfdfc8, float:-1.01806175E-10)
            r6.W(r1)
            java.lang.Object r1 = r6.D()
            U0.m$a r26 = U0.C4889m.f14007a
            java.lang.Object r2 = r26.a()
            if (r1 != r2) goto L_0x01e8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 2
            r4 = 0
            U0.r0 r1 = U0.u1.e(r1, r4, r2, r4)
            r6.u(r1)
            goto L_0x01e9
        L_0x01e8:
            r2 = 2
        L_0x01e9:
            r4 = r1
            U0.r0 r4 = (U0.C4899r0) r4
            r6.P()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = -1361054913(0xffffffffaedff33f, float:-1.0184075E-10)
            r6.W(r1)
            java.lang.Object r1 = r6.D()
            java.lang.Object r8 = r26.a()
            if (r1 != r8) goto L_0x020a
            YB.L r1 = new YB.L
            r1.<init>()
            r6.u(r1)
        L_0x020a:
            r19 = r1
            nI.a r19 = (nI.C17631a) r19
            r6.P()
            r21 = 3072(0xc00, float:4.305E-42)
            r22 = 6
            r17 = 0
            r18 = 0
            r16 = r2
            r20 = r6
            java.lang.Object r1 = f1.C5301c.e(r16, r17, r18, r19, r20, r21, r22)
            r8 = r1
            U0.r0 r8 = (U0.C4899r0) r8
            boolean r1 = D(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r1 = A(r4)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r1)
            r1 = -1361051217(0xffffffffaee001af, float:-1.018664E-10)
            r6.W(r1)
            boolean r1 = r6.F(r5)
            boolean r16 = r6.V(r8)
            r1 = r1 | r16
            boolean r16 = r6.F(r3)
            r1 = r1 | r16
            java.lang.Object r10 = r6.D()
            if (r1 != 0) goto L_0x0256
            java.lang.Object r1 = r26.a()
            if (r10 != r1) goto L_0x026a
        L_0x0256:
            YB.V$d r10 = new YB.V$d
            r21 = 0
            r16 = r10
            r17 = r5
            r18 = r8
            r19 = r4
            r20 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            r6.u(r10)
        L_0x026a:
            nI.p r10 = (nI.p) r10
            r6.P()
            r16 = 0
            r1 = r5
            r38 = r7
            r7 = r25
            r17 = 2
            r19 = r3
            r11 = 256(0x100, float:3.59E-43)
            r18 = 1
            r3 = r22
            r27 = r4
            r4 = r10
            r10 = r5
            r5 = r6
            r11 = r6
            r6 = r16
            U0.P.e(r1, r2, r3, r4, r5, r6)
            r1 = -1361035930(0xffffffffaee03d66, float:-1.0197247E-10)
            r11.W(r1)
            java.lang.Object r1 = r11.D()
            java.lang.Object r2 = r26.a()
            if (r1 != r2) goto L_0x02a3
            O0.L0 r1 = new O0.L0
            r1.<init>()
            r11.u(r1)
        L_0x02a3:
            r16 = r1
            O0.L0 r16 = (O0.L0) r16
            r11.P()
            r1 = -1361033244(0xffffffffaee047e4, float:-1.0199111E-10)
            r11.W(r1)
            boolean r1 = r11.F(r10)
            boolean r2 = r11.F(r0)
            r1 = r1 | r2
            r2 = r7 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x02c2
            r3 = r18
            goto L_0x02c3
        L_0x02c2:
            r3 = 0
        L_0x02c3:
            r1 = r1 | r3
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r7 & r20
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 != r3) goto L_0x02cf
            r3 = r18
            goto L_0x02d0
        L_0x02cf:
            r3 = 0
        L_0x02d0:
            r1 = r1 | r3
            java.lang.Object r2 = r11.D()
            if (r1 != 0) goto L_0x02e1
            java.lang.Object r1 = r26.a()
            if (r2 != r1) goto L_0x02de
            goto L_0x02e1
        L_0x02de:
            r28 = r24
            goto L_0x02ff
        L_0x02e1:
            YB.V$e r6 = new YB.V$e
            r21 = 0
            r3 = r0
            r4 = r24
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r6
            r1 = r10
            r2 = r16
            r28 = r4
            r4 = r31
            r12 = r5
            r5 = r36
            r12 = r6
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.u(r12)
            r2 = r12
        L_0x02ff:
            nI.p r2 = (nI.p) r2
            r11.P()
            r0 = 0
            U0.P.g(r10, r2, r11, r0)
            r0 = -1361014585(0xffffffffaee090c7, float:-1.0212058E-10)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            java.lang.Object r1 = r26.a()
            if (r0 != r1) goto L_0x0323
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 2
            r2 = 0
            U0.r0 r0 = U0.u1.e(r0, r2, r1, r2)
            r11.u(r0)
        L_0x0323:
            U0.r0 r0 = (U0.C4899r0) r0
            r11.P()
            boolean r1 = D(r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = -1361011612(0xffffffffaee09c64, float:-1.0214121E-10)
            r11.W(r2)
            boolean r2 = r11.V(r8)
            java.lang.Object r3 = r11.D()
            if (r2 != 0) goto L_0x0346
            java.lang.Object r2 = r26.a()
            if (r3 != r2) goto L_0x034f
        L_0x0346:
            YB.V$f r3 = new YB.V$f
            r2 = 0
            r3.<init>(r8, r0, r2)
            r11.u(r3)
        L_0x034f:
            nI.p r3 = (nI.p) r3
            r11.P()
            r2 = 0
            U0.P.g(r1, r3, r11, r2)
            WB.j r8 = r29.d()
            boolean r0 = v(r0)
            r1 = -1360988327(0xffffffffaee0f759, float:-1.02302784E-10)
            r11.W(r1)
            java.lang.Object r1 = r11.D()
            java.lang.Object r3 = r26.a()
            if (r1 != r3) goto L_0x037a
            YB.M r1 = new YB.M
            r3 = r27
            r1.<init>(r3)
            r11.u(r1)
        L_0x037a:
            r17 = r1
            nI.l r17 = (nI.C17642l) r17
            r11.P()
            r1 = -1360986189(0xffffffffaee0ffb3, float:-1.0231762E-10)
            r11.W(r1)
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r7 & r1
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            if (r3 != r4) goto L_0x0392
            r3 = r18
            goto L_0x0393
        L_0x0392:
            r3 = r2
        L_0x0393:
            java.lang.Object r2 = r11.D()
            if (r3 != 0) goto L_0x039f
            java.lang.Object r3 = r26.a()
            if (r2 != r3) goto L_0x03a7
        L_0x039f:
            YB.N r2 = new YB.N
            r2.<init>(r9)
            r11.u(r2)
        L_0x03a7:
            r18 = r2
            nI.l r18 = (nI.C17642l) r18
            r11.P()
            int r2 = Uc.C9296d.f64231i
            int r2 = r2 << 6
            r3 = 805309440(0x30000c00, float:4.658318E-10)
            r2 = r2 | r3
            int r3 = r7 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r3 = r3 & r20
            r2 = r2 | r3
            int r3 = r7 << 6
            r1 = r1 & r3
            r20 = r2 | r1
            r21 = 0
            r9 = r0
            r10 = r19
            r22 = r11
            r11 = r16
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r35
            r19 = r22
            k(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            i1.c r0 = r23.b()
            r2 = r38
            r1 = r28
            androidx.compose.ui.d r2 = r2.a(r1, r0)
            r0 = r7 & 126(0x7e, float:1.77E-43)
            int r1 = r7 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r6 = 0
            r0 = r29
            r1 = r30
            r3 = r34
            r4 = r22
            o(r0, r1, r2, r3, r4, r5, r6)
            r22.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0411
            U0.C4895p.R()
        L_0x0411:
            U0.Y0 r11 = r22.n()
            if (r11 == 0) goto L_0x0434
            YB.O r12 = new YB.O
            r0 = r12
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0434:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.V.t(WB.i, boolean, nI.a, nI.l, nI.a, nI.a, nI.a, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final void u(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean v(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void w(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C4899r0 r0Var, boolean z10) {
        B(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, boolean z10) {
        lVar.invoke(new C13773e.a(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C9296d dVar) {
        C17542s.j(dVar, "$this$rememberCameraPositionState");
        return C16807N.f139792a;
    }
}
