package Pi;

import D4.C6447v;
import D4.C6448w;
import D4.M;
import E1.I;
import G1.C4504g;
import Mi.C10768c;
import Mi.C10769d;
import Mi.C10770e;
import Mi.C10772g;
import Mi.C10774i;
import Mi.C10775j;
import Mi.C10777l;
import Mi.m;
import Mi.o;
import O0.C4725e0;
import O0.C4762x0;
import O0.F0;
import O0.G0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.e1;
import O0.g1;
import QJ.Q;
import Qi.C10902a;
import Qi.C10903b;
import Ri.C10911a;
import SC.C13643u0;
import SC.W1;
import SC.Y2;
import SC.Z1;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import p0.s;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import t0.C5934A;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import vl.k;
import wl.C12279b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a©\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001d\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b'\u0010(\"\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00066²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u0002²\u0006\u0010\u0010/\u001a\u0004\u0018\u00010$8\n@\nX\u0002²\u0006\u000e\u00100\u001a\u00020\u00128\n@\nX\u0002²\u0006\u0010\u00102\u001a\u0004\u0018\u0001018\n@\nX\u0002²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\"8\n@\nX\u0002²\u0006\f\u00105\u001a\u0002048\nX\u0002"}, d2 = {"LQi/b;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onCloseButtonClicked", "onLogin", "Lkotlin/Function1;", "", "onWriteReview", "y", "(LQi/b;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "LQi/b$a;", "uiState", "LQi/a;", "uiEvent", "LLi/c;", "onSortOptionSelected", "Lkotlin/Function2;", "", "onHelpfulClicked", "onSortClicked", "onTranslateToggle", "onSnackbarShown", "x", "(LQi/b$a;LQi/a;LnI/l;LnI/a;LnI/p;LnI/a;LnI/l;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "m", "(LnI/a;LU0/m;I)V", "LO0/L0;", "snackbarHostState", "o", "(LQi/a;LO0/L0;LnI/a;LU0/m;I)V", "q", "(LU0/m;I)V", "LQi/b$a$c;", "LMi/d;", "onDisclaimerClicked", "LMi/m;", "onSortingRowClicked", "onVerifiedPurchaseClicked", "s", "(LQi/b$a$c;LnI/l;LnI/l;LnI/a;LnI/p;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "LD4/w;", "a", "LD4/w;", "getLOAD_STATES_NOT_LOADING", "()LD4/w;", "LOAD_STATES_NOT_LOADING", "showSortByDialog", "showErrorDialog", "LMi/o;", "showVerifiedInfoBottomSheet", "showLegalInfoDisclaimer", "LRi/a;", "writeReviewData", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.v  reason: case insensitive filesystem */
public final class C10897v {

    /* renamed from: a  reason: collision with root package name */
    private static final C6448w f85540a = new C6448w(new C6447v.c(true), new C6447v.c(true), new C6447v.c(true));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreenKt$HandleUiEvents$1$1", f = "RatingsAndReviewsScreen.kt", l = {244}, m = "invokeSuspend")
    /* renamed from: Pi.v$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f85542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f85543e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85544f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(L0 l02, String str, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f85542d = l02;
            this.f85543e = str;
            this.f85544f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f85542d, this.f85543e, this.f85544f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85541c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f85542d;
                String str = this.f85543e;
                this.f85541c = 1;
                if (L0.f(l02, str, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f85544f.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$b */
    static final class b implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E4.a<C10774i> f85545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<m, C16807N> f85546b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10903b.a.c f85547c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85548d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<String, Boolean, C16807N> f85549e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f85550f;

        b(E4.a<C10774i> aVar, C17642l<? super m, C16807N> lVar, C10903b.a.c cVar, C17631a<C16807N> aVar2, p<? super String, ? super Boolean, C16807N> pVar, C17642l<? super Boolean, C16807N> lVar2) {
            this.f85545a = aVar;
            this.f85546b = lVar;
            this.f85547c = cVar;
            this.f85548d = aVar2;
            this.f85549e = pVar;
            this.f85550f = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C10774i iVar) {
            lVar.invoke(iVar);
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, int i10, C4889m mVar, int i11) {
            C17542s.j(cVar, "$this$items");
            if ((i11 & 48) == 0) {
                i11 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1922568468, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.MainContent.<anonymous>.<anonymous>.<anonymous> (RatingsAndReviewsScreen.kt:327)");
                }
                C10774i f10 = this.f85545a.f(i10);
                if (f10 instanceof m) {
                    mVar.W(1507967559);
                    String a10 = ((m) f10).c().a();
                    mVar.W(325743295);
                    boolean V10 = mVar.V(this.f85546b) | mVar.F(f10);
                    C17642l<m, C16807N> lVar = this.f85546b;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C10898w(lVar, f10);
                        mVar.u(D10);
                    }
                    mVar.P();
                    T.c(a10, (C17631a) D10, mVar, 0);
                    mVar.P();
                } else if (f10 instanceof C10775j) {
                    mVar.W(1508226843);
                    C10775j jVar = (C10775j) f10;
                    o e10 = this.f85547c.a().e();
                    H.f(jVar, e10 != null ? e10.d() : null, this.f85548d, this.f85549e, this.f85550f, mVar, 0);
                    C13643u0.c(TC.e.i(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null)), 0.0f, 0, mVar, 0, 6);
                    mVar.P();
                } else if (f10 instanceof C10770e) {
                    mVar.W(325768543);
                    L.b((C10777l) f10, mVar, 0);
                    mVar.P();
                } else if (f10 instanceof C10768c) {
                    mVar.W(325770847);
                    L.b((C10777l) f10, mVar, 0);
                    mVar.P();
                } else if (f10 == null) {
                    mVar.W(325772582);
                    mVar.P();
                } else {
                    mVar.W(325736946);
                    mVar.P();
                    throw new t();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$c */
    /* synthetic */ class c extends C17540p implements C17642l<Li.c, C16807N> {
        c(Object obj) {
            super(1, obj, C10903b.class, "updateFilter", "updateFilter(Lcom/ingka/ikea/app/ratingsandreviews/domain/SortingData;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Li.c) obj);
            return C16807N.f139792a;
        }

        public final void t(Li.c cVar) {
            C17542s.j(cVar, "p0");
            ((C10903b) this.receiver).K(cVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$d */
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10903b.a f85551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<String, Boolean, C16807N> f85553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f85554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85555e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85556f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ F0 f85557g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<Li.c, C16807N> f85558h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f85559i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4899r0<C10769d> f85560j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<m> f85561k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C4899r0<o> f85562l;

        d(C10903b.a aVar, C17631a<C16807N> aVar2, p<? super String, ? super Boolean, C16807N> pVar, C17642l<? super Boolean, C16807N> lVar, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, F0 f02, C17642l<? super Li.c, C16807N> lVar2, C4899r0<Boolean> r0Var, C4899r0<C10769d> r0Var2, C4899r0<m> r0Var3, C4899r0<o> r0Var4) {
            this.f85551a = aVar;
            this.f85552b = aVar2;
            this.f85553c = pVar;
            this.f85554d = lVar;
            this.f85555e = aVar3;
            this.f85556f = aVar4;
            this.f85557g = f02;
            this.f85558h = lVar2;
            this.f85559i = r0Var;
            this.f85560j = r0Var2;
            this.f85561k = r0Var3;
            this.f85562l = r0Var4;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4899r0 r0Var, C10769d dVar) {
            C17542s.j(dVar, "it");
            C10897v.I(r0Var, dVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C17631a aVar, C4899r0 r0Var, m mVar) {
            C17542s.j(mVar, "it");
            aVar.invoke();
            C10897v.C(r0Var, mVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C10903b.a aVar, C4899r0 r0Var) {
            C10897v.G(r0Var, ((C10903b.a.c) aVar).a().e());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(E4.a aVar) {
            aVar.l();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C4899r0 r0Var) {
            C10897v.C(r0Var, (m) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(s0.C5834E r22, U0.C4889m r23, int r24) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r11 = r23
                java.lang.String r2 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r24 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r11.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r24 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r24
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r23.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r23.L()
                goto L_0x0250
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreen.<anonymous> (RatingsAndReviewsScreen.kt:127)"
                r5 = 1890629896(0x70b0b908, float:4.375444E29)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                r13 = 0
                r14 = 1
                r15 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r12, r13, r14, r15)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r2, r1)
                Qi.b$a r2 = r0.f85551a
                nI.a<XH.N> r3 = r0.f85552b
                nI.p<java.lang.String, java.lang.Boolean, XH.N> r5 = r0.f85553c
                nI.l<java.lang.Boolean, XH.N> r6 = r0.f85554d
                nI.a<XH.N> r7 = r0.f85555e
                nI.a<XH.N> r8 = r0.f85556f
                O0.F0 r10 = r0.f85557g
                nI.l<Li.c, XH.N> r9 = r0.f85558h
                U0.r0<java.lang.Boolean> r4 = r0.f85559i
                U0.r0<Mi.d> r13 = r0.f85560j
                r22 = r10
                U0.r0<Mi.m> r10 = r0.f85561k
                U0.r0<Mi.o> r15 = r0.f85562l
                i1.c$a r16 = i1.C5437c.f24302a
                i1.c r14 = r16.o()
                r0 = 0
                E1.I r14 = androidx.compose.foundation.layout.C5077h.h(r14, r0)
                int r17 = U0.C4883j.a(r11, r0)
                U0.y r0 = r23.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r11, r1)
                G1.g$a r18 = G1.C4504g.f6515W
                r19 = r9
                nI.a r9 = r18.a()
                U0.f r20 = r23.m()
                if (r20 != 0) goto L_0x008d
                U0.C4883j.c()
            L_0x008d:
                r23.I()
                boolean r20 = r23.i()
                if (r20 == 0) goto L_0x009a
                r11.p(r9)
                goto L_0x009d
            L_0x009a:
                r23.t()
            L_0x009d:
                U0.m r9 = U0.F1.a(r23)
                r20 = r12
                nI.p r12 = r18.c()
                U0.F1.c(r9, r14, r12)
                nI.p r12 = r18.e()
                U0.F1.c(r9, r0, r12)
                nI.p r0 = r18.b()
                boolean r12 = r9.i()
                if (r12 != 0) goto L_0x00c9
                java.lang.Object r12 = r9.D()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
                boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
                if (r12 != 0) goto L_0x00d7
            L_0x00c9:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
                r9.u(r12)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
                r9.w(r12, r0)
            L_0x00d7:
                nI.p r0 = r18.d()
                U0.F1.c(r9, r1, r0)
                androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
                boolean r1 = r2 instanceof Qi.C10903b.a.C1753b
                if (r1 == 0) goto L_0x00f3
                r0 = -252592939(0xfffffffff0f1bcd5, float:-5.9851337E29)
                r11.W(r0)
                r0 = 0
                Pi.C10897v.q(r11, r0)
                r23.P()
                goto L_0x0244
            L_0x00f3:
                boolean r1 = r2 instanceof Qi.C10903b.a.C1752a
                if (r1 == 0) goto L_0x0106
                r0 = -252590817(0xfffffffff0f1c51f, float:-5.9859354E29)
                r11.W(r0)
                r23.P()
                r1 = 1
                Pi.C10897v.E(r4, r1)
                goto L_0x0244
            L_0x0106:
                r1 = 1
                boolean r9 = r2 instanceof Qi.C10903b.a.c
                if (r9 == 0) goto L_0x0260
                r9 = 759756473(0x2d48f6b9, float:1.1423467E-11)
                r11.W(r9)
                r9 = 0
                Pi.C10897v.E(r4, r9)
                r4 = r2
                Qi.b$a$c r4 = (Qi.C10903b.a.c) r4
                TJ.g r12 = r4.b()
                r14 = 0
                E4.a r12 = E4.b.b(r12, r14, r11, r9, r1)
                r1 = -252574583(0xfffffffff0f20489, float:-5.9920684E29)
                r11.W(r1)
                java.lang.Object r1 = r23.D()
                U0.m$a r14 = U0.C4889m.f14007a
                java.lang.Object r9 = r14.a()
                if (r1 != r9) goto L_0x013b
                Pi.x r1 = new Pi.x
                r1.<init>(r13)
                r11.u(r1)
            L_0x013b:
                r9 = r1
                nI.l r9 = (nI.C17642l) r9
                r23.P()
                r1 = -252579902(0xfffffffff0f1efc2, float:-5.990059E29)
                r11.W(r1)
                boolean r1 = r11.V(r3)
                java.lang.Object r13 = r23.D()
                if (r1 != 0) goto L_0x0157
                java.lang.Object r1 = r14.a()
                if (r13 != r1) goto L_0x015f
            L_0x0157:
                Pi.y r13 = new Pi.y
                r13.<init>(r3, r10)
                r11.u(r13)
            L_0x015f:
                r3 = r13
                nI.l r3 = (nI.C17642l) r3
                r23.P()
                r1 = -252571699(0xfffffffff0f20fcd, float:-5.993158E29)
                r11.W(r1)
                boolean r1 = r11.V(r2)
                java.lang.Object r13 = r23.D()
                if (r1 != 0) goto L_0x017b
                java.lang.Object r1 = r14.a()
                if (r13 != r1) goto L_0x0183
            L_0x017b:
                Pi.z r13 = new Pi.z
                r13.<init>(r2, r15)
                r11.u(r13)
            L_0x0183:
                nI.a r13 = (nI.C17631a) r13
                r23.P()
                r15 = 48
                r1 = r4
                r2 = r9
                r4 = r13
                r13 = r19
                r9 = r23
                r17 = r22
                r22 = r10
                r10 = r15
                Pi.C10897v.s(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                D4.g r1 = r12.i()
                D4.v r1 = r1.a()
                boolean r2 = r1 instanceof D4.C6447v.b
                if (r2 == 0) goto L_0x01b3
                r0 = -252555627(0xfffffffff0f24e95, float:-5.9992298E29)
                r11.W(r0)
                r0 = 0
                Pi.C10897v.q(r11, r0)
                r23.P()
                goto L_0x0211
            L_0x01b3:
                boolean r2 = r1 instanceof D4.C6447v.a
                if (r2 == 0) goto L_0x0204
                r1 = -252553751(0xfffffffff0f255e9, float:-5.9999385E29)
                r11.W(r1)
                r1 = -252552064(0xfffffffff0f25c80, float:-6.000576E29)
                r11.W(r1)
                boolean r1 = r11.F(r12)
                java.lang.Object r2 = r23.D()
                if (r1 != 0) goto L_0x01d3
                java.lang.Object r1 = r14.a()
                if (r2 != r1) goto L_0x01db
            L_0x01d3:
                Pi.A r2 = new Pi.A
                r2.<init>(r12)
                r11.u(r2)
            L_0x01db:
                nI.a r2 = (nI.C17631a) r2
                r23.P()
                r1 = r20
                r3 = 0
                r4 = 1
                r5 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r3, r4, r5)
                r3 = 16
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r1, r3)
                i1.c r3 = r16.b()
                androidx.compose.ui.d r0 = r0.a(r1, r3)
                r1 = 0
                Pi.C10885i.b(r2, r0, r11, r1, r1)
                r23.P()
                goto L_0x0211
            L_0x0204:
                boolean r0 = r1 instanceof D4.C6447v.c
                if (r0 == 0) goto L_0x0251
                r0 = 761118551(0x2d5dbf57, float:1.26048815E-11)
                r11.W(r0)
                r23.P()
            L_0x0211:
                Mi.m r2 = Pi.C10897v.B(r22)
                if (r2 == 0) goto L_0x0241
                r0 = -252531004(0xfffffffff0f2aec4, float:-6.008532E29)
                r11.W(r0)
                java.lang.Object r0 = r23.D()
                java.lang.Object r1 = r14.a()
                if (r0 != r1) goto L_0x0231
                Pi.B r0 = new Pi.B
                r1 = r22
                r0.<init>(r1)
                r11.u(r0)
            L_0x0231:
                r3 = r0
                nI.a r3 = (nI.C17631a) r3
                r23.P()
                r6 = 384(0x180, float:5.38E-43)
                r1 = r17
                r4 = r13
                r5 = r23
                Pi.P.c(r1, r2, r3, r4, r5, r6)
            L_0x0241:
                r23.P()
            L_0x0244:
                r23.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0250
                U0.C4895p.R()
            L_0x0250:
                return
            L_0x0251:
                r0 = -252557559(0xfffffffff0f24709, float:-5.9985E29)
                r11.W(r0)
                r23.P()
                XH.t r0 = new XH.t
                r0.<init>()
                throw r0
            L_0x0260:
                r0 = -252593073(0xfffffffff0f1bc4f, float:-5.985083E29)
                r11.W(r0)
                r23.P()
                XH.t r0 = new XH.t
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Pi.C10897v.d.h(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$e */
    /* synthetic */ class e extends C17540p implements p<String, Boolean, C16807N> {
        e(Object obj) {
            super(2, obj, C10903b.class, "onHelpfulClicked", "onHelpfulClicked(Ljava/lang/String;Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((String) obj, ((Boolean) obj2).booleanValue());
            return C16807N.f139792a;
        }

        public final void t(String str, boolean z10) {
            C17542s.j(str, "p0");
            ((C10903b) this.receiver).G(str, z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$f */
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, C10903b.class, "onSortClicked", "onSortClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((C10903b) this.receiver).H();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$g */
    /* synthetic */ class g extends C17540p implements C17642l<Boolean, C16807N> {
        g(Object obj) {
            super(1, obj, C10903b.class, "onTranslateToggle", "onTranslateToggle(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }

        public final void t(boolean z10) {
            ((C10903b) this.receiver).I(z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$h */
    /* synthetic */ class h extends C17540p implements C17631a<C16807N> {
        h(Object obj) {
            super(0, obj, C10903b.class, "onUiEventConsumed", "onUiEventConsumed()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((C10903b) this.receiver).J();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.v$i */
    static final class i implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85563a;

        i(C17631a<C16807N> aVar) {
            this.f85563a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1016888883, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreen.<anonymous> (RatingsAndReviewsScreen.kt:117)");
                }
                ol.p.c(v.BACK, this.f85563a, (androidx.compose.ui.d) null, J1.j.b(Oo.b.f84761q7, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    /* renamed from: Pi.v$j */
    static final class j implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f85564a;

        j(L0 l02) {
            this.f85564a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(316822513, i10, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreen.<anonymous> (RatingsAndReviewsScreen.kt:124)");
                }
                Y2.c(this.f85564a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    private static final C10902a A(A1<? extends C10902a> a12) {
        return (C10902a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final m B(C4899r0<m> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void C(C4899r0<m> r0Var, m mVar) {
        r0Var.setValue(mVar);
    }

    private static final boolean D(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void E(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final o F(C4899r0<o> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void G(C4899r0<o> r0Var, o oVar) {
        r0Var.setValue(oVar);
    }

    private static final C10769d H(C4899r0<C10769d> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void I(C4899r0<C10769d> r0Var, C10769d dVar) {
        r0Var.setValue(dVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C17631a aVar, C4899r0 r0Var) {
        E(r0Var, false);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C4899r0 r0Var) {
        G(r0Var, (o) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C4899r0 r0Var) {
        I(r0Var, (C10769d) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C10903b.a aVar, C10902a aVar2, C17642l lVar, C17631a aVar3, p pVar, C17631a aVar4, C17642l lVar2, C17631a aVar5, C17631a aVar6, C17631a aVar7, int i10, C4889m mVar, int i11) {
        x(aVar, aVar2, lVar, aVar3, pVar, aVar4, lVar2, aVar5, aVar6, aVar7, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17642l lVar, C10903b bVar) {
        lVar.invoke(bVar.D());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C10903b bVar, C17631a aVar, C17631a aVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        y(bVar, aVar, aVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void m(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1749847611);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1749847611, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.ErrorDialog (RatingsAndReviewsScreen.kt:216)");
            }
            Z1.d(J1.j.b(Oo.b.f84536V8, k10, 0), new W1(J1.j.b(Oo.b.f84616d5, k10, 0), aVar), aVar, (androidx.compose.ui.d) null, (androidx.compose.ui.window.h) null, C10877a.f85461a.a(), k10, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | ((i11 << 6) & 896), 24);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10894s(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17631a aVar, int i10, C4889m mVar, int i11) {
        m(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void o(C10902a aVar, L0 l02, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(953574301);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(aVar) : k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(l02) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(953574301, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.HandleUiEvents (RatingsAndReviewsScreen.kt:238)");
            }
            if (C17542s.e(aVar, C10902a.C1751a.f85841a)) {
                String b10 = J1.j.b(Oo.b.f84812v3, k10, 0);
                k10.W(-1387083655);
                boolean z10 = true;
                boolean V10 = ((i11 & 112) == 32) | k10.V(b10);
                if ((i11 & 896) != 256) {
                    z10 = false;
                }
                boolean z11 = V10 | z10;
                Object D10 = k10.D();
                if (z11 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(l02, b10, aVar2, (C17164e<? super a>) null);
                    k10.u(D10);
                }
                k10.P();
                P.g(b10, (p) D10, k10, 0);
            } else if (aVar != null) {
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(aVar, l02, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C10902a aVar, L0 l02, C17631a aVar2, int i10, C4889m mVar, int i11) {
        o(aVar, l02, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void q(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-267947956);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-267947956, i10, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.LoadingBar (RatingsAndReviewsScreen.kt:253)");
            }
            androidx.compose.ui.d a10 = C5116k1.a(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), "LoadingBar");
            I a11 = C5080k.a(C5073d.f18068a.a(), C5437c.f24302a.k(), k10, 6);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar.c());
            F1.c(a14, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            C12279b.b((androidx.compose.ui.d) null, k10, 0, 1);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10895t(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(int i10, C4889m mVar, int i11) {
        q(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void s(C10903b.a.c cVar, C17642l<? super C10769d, C16807N> lVar, C17642l<? super m, C16807N> lVar2, C17631a<C16807N> aVar, p<? super String, ? super Boolean, C16807N> pVar, C17642l<? super Boolean, C16807N> lVar3, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10903b.a.c cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(497540303);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        C17642l<? super C10769d, C16807N> lVar4 = lVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar4) ? 32 : 16;
        }
        C17642l<? super m, C16807N> lVar5 = lVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar5) ? 256 : 128;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        p<? super String, ? super Boolean, C16807N> pVar2 = pVar;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        C17642l<? super Boolean, C16807N> lVar6 = lVar3;
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar6) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar2) ? 1048576 : ImageMetadata.LENS_APERTURE;
        } else {
            C17631a<C16807N> aVar5 = aVar2;
        }
        C17631a<C16807N> aVar6 = aVar3;
        if ((i12 & 12582912) == 0) {
            i11 |= k10.F(aVar6) ? 8388608 : 4194304;
        }
        if ((i11 & 4793491) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(497540303, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.MainContent (RatingsAndReviewsScreen.kt:274)");
            }
            E4.a<M<C10774i>> b10 = E4.b.b(cVar.b(), (C17168i) null, k10, 0, 1);
            int i13 = i11;
            A1<C10911a> c10 = j3.a.c(cVar.c(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            C5834E e10 = D.e(0.0f, 0.0f, 0.0f, c2.h.B((float) 40), 7, (Object) null);
            k10.W(-1802896344);
            boolean F10 = k10.F(cVar2) | k10.V(c10) | ((3670016 & i13) == 1048576) | ((29360128 & i13) == 8388608) | ((i13 & 112) == 32) | k10.F(b10) | ((i13 & 896) == 256) | ((i13 & 7168) == 2048) | ((57344 & i13) == 16384) | ((458752 & i13) == 131072);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                C10896u uVar = r0;
                C10896u uVar2 = new C10896u(cVar, b10, aVar2, aVar3, lVar, c10, lVar2, aVar, pVar, lVar3);
                k10.u(uVar);
                D10 = uVar;
            }
            k10.P();
            mVar2 = k10;
            C5937b.a((androidx.compose.ui.d) null, (C5934A) null, e10, false, (C5073d.m) null, (C5437c.b) null, (s) null, false, (C17642l) D10, mVar2, 384, 251);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10887k(cVar, lVar, lVar2, aVar, pVar, lVar3, aVar2, aVar3, i10));
        }
    }

    private static final C10911a t(A1<? extends C10911a> a12) {
        return (C10911a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C10903b.a.c cVar, E4.a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, A1 a12, C17642l lVar2, C17631a aVar4, p pVar, C17642l lVar3, x xVar) {
        x xVar2 = xVar;
        C17542s.j(xVar2, "$this$LazyColumn");
        C10772g a10 = cVar.a();
        X.e(xVar2, t(a12), aVar2, aVar3);
        C10881e.a(xVar2, a10);
        if (a10.c() != null) {
            C10879c.d(xVar2, a10.c(), lVar);
        }
        float f10 = (float) 16;
        k.p(xVar, D.m(androidx.compose.ui.d.f18749a, c2.h.B(f10), 0.0f, c2.h.B(f10), 0.0f, 10, (Object) null), a10.b(), 2, "RATING_CATEGORY", C10877a.f85461a.b());
        E4.a aVar5 = aVar;
        x.a(xVar, aVar.g(), (C17642l) null, new C10888l(aVar), c1.c.c(-1922568468, true, new b(aVar, lVar2, cVar, aVar4, pVar, lVar3)), 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object v(E4.a aVar, int i10) {
        C10774i iVar = (C10774i) aVar.f(i10);
        if (iVar == null) {
            return null;
        }
        if (iVar instanceof m) {
            return "SORTING_ROW";
        }
        if (iVar instanceof C10775j) {
            return "REVIEW";
        }
        if (iVar instanceof C10770e) {
            return "LocalSectionHeader";
        }
        if (iVar instanceof C10768c) {
            return "GlobalSectionHeader";
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C10903b.a.c cVar, C17642l lVar, C17642l lVar2, C17631a aVar, p pVar, C17642l lVar3, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        s(cVar, lVar, lVar2, aVar, pVar, lVar3, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void x(C10903b.a aVar, C10902a aVar2, C17642l<? super Li.c, C16807N> lVar, C17631a<C16807N> aVar3, p<? super String, ? super Boolean, C16807N> pVar, C17631a<C16807N> aVar4, C17642l<? super Boolean, C16807N> lVar2, C17631a<C16807N> aVar5, C17631a<C16807N> aVar6, C17631a<C16807N> aVar7, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        int i13;
        F0 f02;
        C10903b.a aVar8 = aVar;
        C10902a aVar9 = aVar2;
        C17642l<? super Li.c, C16807N> lVar3 = lVar;
        C17631a<C16807N> aVar10 = aVar3;
        p<? super String, ? super Boolean, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar11 = aVar4;
        C17642l<? super Boolean, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar12 = aVar5;
        C17631a<C16807N> aVar13 = aVar6;
        C17631a<C16807N> aVar14 = aVar7;
        int i14 = i10;
        C17542s.j(aVar8, "uiState");
        C17542s.j(lVar3, "onSortOptionSelected");
        C17542s.j(aVar10, "onCloseButtonClicked");
        C17542s.j(pVar2, "onHelpfulClicked");
        C17542s.j(aVar11, "onSortClicked");
        C17542s.j(lVar4, "onTranslateToggle");
        C17542s.j(aVar12, "onSnackbarShown");
        C17542s.j(aVar13, "onLogin");
        C17542s.j(aVar14, "onWriteReview");
        C4889m k10 = mVar.k(-1608202377);
        if ((i14 & 6) == 0) {
            i11 = (k10.V(aVar8) ? 4 : 2) | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            i11 |= (i14 & 64) == 0 ? k10.V(aVar9) : k10.F(aVar9) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i11 |= k10.F(lVar3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i11 |= k10.F(aVar10) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i14 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i11 |= k10.F(aVar11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i14) == 0) {
            i11 |= k10.F(lVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i14) == 0) {
            i11 |= k10.F(aVar12) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i11 |= k10.F(aVar13) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i11 |= k10.F(aVar14) ? 536870912 : 268435456;
        }
        int i15 = i11;
        if ((306783379 & i15) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1608202377, i15, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreen (RatingsAndReviewsScreen.kt:106)");
            }
            k10.W(1942490187);
            Object D10 = k10.D();
            C4889m.a aVar15 = C4889m.f14007a;
            if (D10 == aVar15.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            int i16 = i15;
            F0 l10 = C4725e0.l(false, (C17642l<? super G0, Boolean>) null, k10, 0, 3);
            k10.W(1942494042);
            Object D11 = k10.D();
            F0 f03 = l10;
            if (D11 == aVar15.a()) {
                D11 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            k10.W(1942496721);
            Object D12 = k10.D();
            if (D12 == aVar15.a()) {
                i12 = 2;
                D12 = u1.e(Boolean.valueOf(aVar8 instanceof C10903b.a.C1752a), (o1) null, 2, (Object) null);
                k10.u(D12);
            } else {
                i12 = 2;
            }
            k10.P();
            k10.W(1942500223);
            Object D13 = k10.D();
            C4899r0 r0Var2 = (C4899r0) D12;
            if (D13 == aVar15.a()) {
                D13 = u1.e((Object) null, (o1) null, i12, (Object) null);
                k10.u(D13);
            }
            k10.P();
            k10.W(1942503032);
            Object D14 = k10.D();
            C4899r0 r0Var3 = (C4899r0) D13;
            if (D14 == aVar15.a()) {
                D14 = u1.e((Object) null, (o1) null, i12, (Object) null);
                k10.u(D14);
            }
            k10.P();
            boolean z10 = true;
            C5264a e10 = c1.c.e(1016888883, true, new i(aVar10), k10, 54);
            C5264a e11 = c1.c.e(316822513, true, new j(l02), k10, 54);
            C4899r0 r0Var4 = r0Var3;
            d dVar = r0;
            C4899r0 r0Var5 = r0Var2;
            L0 l03 = l02;
            C4899r0 r0Var6 = (C4899r0) D14;
            int i17 = i16;
            F0 f04 = f03;
            d dVar2 = new d(aVar, aVar4, pVar, lVar2, aVar7, aVar6, f04, lVar, r0Var5, r0Var6, r0Var, r0Var4);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, e11, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(1890629896, true, dVar, mVar2, 54), mVar2, 805309488, 501);
            mVar2.W(1942592393);
            if (D(r0Var5)) {
                mVar2.W(1942594825);
                i13 = i17;
                if ((i13 & 7168) != 2048) {
                    z10 = false;
                }
                Object D15 = mVar2.D();
                if (z10 || D15 == aVar15.a()) {
                    D15 = new C10890n(aVar3, r0Var5);
                    mVar2.u(D15);
                } else {
                    C17631a<C16807N> aVar16 = aVar3;
                }
                mVar2.P();
                m((C17631a) D15, mVar2, 0);
            } else {
                C17631a<C16807N> aVar17 = aVar3;
                i13 = i17;
            }
            mVar2.P();
            o F10 = F(r0Var4);
            mVar2.W(1942600657);
            if (F10 != null) {
                mVar2.W(1942607057);
                Object D16 = mVar2.D();
                if (D16 == aVar15.a()) {
                    D16 = new C10891o(r0Var4);
                    mVar2.u(D16);
                }
                mVar2.P();
                f02 = f04;
                V.b(f02, F10, (C17631a) D16, mVar2, 384);
            } else {
                f02 = f04;
            }
            mVar2.P();
            C10769d H10 = H(r0Var6);
            mVar2.W(1942610611);
            if (H10 != null) {
                mVar2.W(1942616205);
                Object D17 = mVar2.D();
                if (D17 == aVar15.a()) {
                    D17 = new C10892p(r0Var6);
                    mVar2.u(D17);
                }
                mVar2.P();
                C10879c.b(f02, H10, (C17631a) D17, mVar2, 384);
            }
            mVar2.P();
            o(aVar2, l03, aVar5, mVar2, ((i13 >> 15) & 896) | ((i13 >> 3) & 14) | 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            C17631a<C16807N> aVar18 = aVar10;
            C10902a aVar19 = aVar9;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10893q(aVar, aVar2, lVar, aVar3, pVar, aVar4, lVar2, aVar5, aVar6, aVar7, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y(Qi.C10903b r18, nI.C17631a<XH.C16807N> r19, nI.C17631a<XH.C16807N> r20, nI.C17642l<? super java.lang.String, XH.C16807N> r21, U0.C4889m r22, int r23) {
        /*
            r1 = r18
            r14 = r19
            r15 = r20
            r0 = r21
            r13 = r23
            java.lang.String r2 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onCloseButtonClicked"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            java.lang.String r2 = "onLogin"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "onWriteReview"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -1224496761(0xffffffffb703a987, float:-7.84768E-6)
            r3 = r22
            U0.m r12 = r3.k(r2)
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0036
            boolean r3 = r12.F(r1)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r13
            goto L_0x0037
        L_0x0036:
            r3 = r13
        L_0x0037:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.F(r14)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0057
            boolean r4 = r12.F(r15)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r3 = r3 | r4
        L_0x0057:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x0068
            boolean r4 = r12.F(r0)
            if (r4 == 0) goto L_0x0065
            r4 = r10
            goto L_0x0067
        L_0x0065:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r3 = r3 | r4
        L_0x0068:
            r11 = r3
            r3 = r11 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 != r4) goto L_0x007d
            boolean r3 = r12.l()
            if (r3 != 0) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            r12.L()
            r16 = r12
            goto L_0x01bb
        L_0x007d:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0089
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingsAndReviewsScreen (RatingsAndReviewsScreen.kt:75)"
            U0.C4895p.S(r2, r11, r3, r4)
        L_0x0089:
            TJ.P r3 = r18.m()
            r8 = 0
            r9 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r12
            U0.A1 r2 = j3.a.c(r3, r4, r5, r6, r7, r8, r9)
            TJ.P r3 = r18.y()
            U0.A1 r3 = j3.a.c(r3, r4, r5, r6, r7, r8, r9)
            Qi.b$a r2 = z(r2)
            Qi.a r3 = A(r3)
            r4 = 1942459682(0x73c79522, float:3.1625117E31)
            r12.W(r4)
            boolean r4 = r12.F(r1)
            java.lang.Object r5 = r12.D()
            if (r4 != 0) goto L_0x00bf
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00c7
        L_0x00bf:
            Pi.v$c r5 = new Pi.v$c
            r5.<init>(r1)
            r12.u(r5)
        L_0x00c7:
            uI.h r5 = (uI.C18059h) r5
            r12.P()
            r4 = r5
            nI.l r4 = (nI.C17642l) r4
            r5 = 1942463046(0x73c7a246, float:3.163325E31)
            r12.W(r5)
            boolean r5 = r12.F(r1)
            java.lang.Object r6 = r12.D()
            if (r5 != 0) goto L_0x00e7
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00ef
        L_0x00e7:
            Pi.v$e r6 = new Pi.v$e
            r6.<init>(r1)
            r12.u(r6)
        L_0x00ef:
            uI.h r6 = (uI.C18059h) r6
            r12.P()
            nI.p r6 = (nI.p) r6
            r5 = 1942464739(0x73c7a8e3, float:3.1637344E31)
            r12.W(r5)
            boolean r5 = r12.F(r1)
            java.lang.Object r7 = r12.D()
            if (r5 != 0) goto L_0x010e
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0116
        L_0x010e:
            Pi.v$f r7 = new Pi.v$f
            r7.<init>(r1)
            r12.u(r7)
        L_0x0116:
            uI.h r7 = (uI.C18059h) r7
            r12.P()
            nI.a r7 = (nI.C17631a) r7
            r5 = 1942466471(0x73c7afa7, float:3.1641532E31)
            r12.W(r5)
            boolean r5 = r12.F(r1)
            java.lang.Object r8 = r12.D()
            if (r5 != 0) goto L_0x0135
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r8 != r5) goto L_0x013d
        L_0x0135:
            Pi.v$g r8 = new Pi.v$g
            r8.<init>(r1)
            r12.u(r8)
        L_0x013d:
            uI.h r8 = (uI.C18059h) r8
            r12.P()
            nI.l r8 = (nI.C17642l) r8
            r5 = 1942468263(0x73c7b6a7, float:3.1645865E31)
            r12.W(r5)
            boolean r5 = r12.F(r1)
            java.lang.Object r9 = r12.D()
            if (r5 != 0) goto L_0x015c
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x0164
        L_0x015c:
            Pi.v$h r9 = new Pi.v$h
            r9.<init>(r1)
            r12.u(r9)
        L_0x0164:
            uI.h r9 = (uI.C18059h) r9
            r12.P()
            nI.a r9 = (nI.C17631a) r9
            r5 = 1942470862(0x73c7c0ce, float:3.165215E31)
            r12.W(r5)
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != r10) goto L_0x0177
            r5 = 1
            goto L_0x0178
        L_0x0177:
            r5 = 0
        L_0x0178:
            boolean r10 = r12.F(r1)
            r5 = r5 | r10
            java.lang.Object r10 = r12.D()
            if (r5 != 0) goto L_0x018b
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x0193
        L_0x018b:
            Pi.j r10 = new Pi.j
            r10.<init>(r0, r1)
            r12.u(r10)
        L_0x0193:
            r16 = r10
            nI.a r16 = (nI.C17631a) r16
            r12.P()
            int r5 = r11 << 6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            int r10 = r11 << 18
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r11
            r17 = r5 | r10
            r5 = r19
            r10 = r20
            r11 = r16
            r16 = r12
            r13 = r17
            x(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01bb
            U0.C4895p.R()
        L_0x01bb:
            U0.Y0 r6 = r16.n()
            if (r6 == 0) goto L_0x01d4
            Pi.m r7 = new Pi.m
            r0 = r7
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.C10897v.y(Qi.b, nI.a, nI.a, nI.l, U0.m, int):void");
    }

    private static final C10903b.a z(A1<? extends C10903b.a> a12) {
        return (C10903b.a) a12.getValue();
    }
}
