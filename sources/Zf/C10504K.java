package zf;

import IC.C13023e;
import IC.C13026h;
import J1.j;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import Op.c1;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SC.Y2;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.browseandsearch.browseV2.a;
import com.ingka.ikea.app.browseandsearch.browseV2.b;
import com.ingka.ikea.app.browseandsearch.browseV2.e;
import com.ingka.ikea.app.browseandsearch.browseV2.f;
import com.ingka.ikea.core.model.Category;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import qe.C10189b;
import s0.C5834E;
import s0.C5848T;
import s0.C5850V;
import s0.C5857c;
import tK.C18030v;
import u0.C5968C;
import u0.C5974I;
import u0.C5975J;
import vl.k;
import yf.g;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a_\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0001\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0003¢\u0006\u0004\b\"\u0010#\u001a¡\u0001\u0010,\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b,\u0010-\u001aC\u00105\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b5\u00106\u001aI\u00108\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b8\u00109¨\u0006;²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u0002²\u0006\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\nX\u0002²\u0006\u000e\u0010:\u001a\u00020\u00048\n@\nX\u0002"}, d2 = {"Lyf/h;", "browseViewModelV2", "Lzf/f0;", "inAppUpdateUiState", "", "showAppUpdatedSnackbar", "LDr/a;", "kreativComposable", "Lkotlin/Function2;", "LOp/c1;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "LXH/N;", "onProductItemEvent", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/e;", "onScreenUiEvent", "Q", "(Lyf/h;Lzf/f0;ZLDr/a;LnI/p;LnI/l;LU0/m;I)V", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b;", "uiState", "Lcom/ingka/ikea/app/browseandsearch/browseV2/f;", "uiEvent", "Lcom/ingka/ikea/app/browseandsearch/browseV2/a;", "onAction", "", "categoriesPerRow", "C", "(Lcom/ingka/ikea/app/browseandsearch/browseV2/b;Lcom/ingka/ikea/app/browseandsearch/browseV2/f;Lzf/f0;LnI/l;ZLnI/p;LnI/l;LDr/a;ILU0/m;I)V", "LO0/L0;", "snackbarHostState", "LIC/e;", "message", "Lkotlin/Function0;", "onSnackbarShown", "m0", "(LO0/L0;LIC/e;LnI/a;LU0/m;I)V", "Lu0/I;", "lazyGridState", "Lyf/g;", "onTabSelected", "onMoreCategoriesClicked", "onClearRecentProductsClicked", "Landroidx/compose/ui/d;", "modifier", "X", "(Lcom/ingka/ikea/app/browseandsearch/browseV2/b;Lzf/f0;Lu0/I;LnI/p;LnI/l;LnI/l;LnI/a;LnI/a;LDr/a;ILandroidx/compose/ui/d;LU0/m;III)V", "Ls0/E;", "contentPadding", "Lqe/b;", "alertMessageState", "LEs/a;", "inboxState", "showOfferHubEntryLoading", "M", "(Ls0/E;Lqe/b;LEs/a;ZLnI/l;LU0/m;I)V", "onRetryClicked", "I", "(Ls0/E;Lqe/b;LEs/a;LnI/a;LnI/l;LU0/m;I)V", "isRefreshingState", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.K  reason: case insensitive filesystem */
public final class C10504K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.K$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f78171a;

        a(L0 l02) {
            this.f78171a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(750825825, i10, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseComposable.<anonymous> (BrowseScreenComposables.kt:143)");
                }
                Y2.c(this.f78171a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    /* renamed from: zf.K$b */
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ingka.ikea.app.browseandsearch.browseV2.b f78172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<e, C16807N> f78173b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> f78174c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f78175d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ R0.e f78176e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f78177f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C10521f0 f78178g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5974I f78179h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<c1, Interaction$Component, C16807N> f78180i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Dr.a f78181j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f78182k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseScreenComposablesKt$BrowseComposable$3$2$1$1", f = "BrowseScreenComposables.kt", l = {170}, m = "invokeSuspend")
        /* renamed from: zf.K$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f78183c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f78184d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f78184d = r0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f78184d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f78183c;
                if (i10 == 0) {
                    y.b(obj);
                    C10504K.E(this.f78184d, true);
                    this.f78183c = 1;
                    if (C16297b0.b(300, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10504K.E(this.f78184d, false);
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zf.K$b$b  reason: collision with other inner class name */
        static final class C1448b implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ R0.e f78185a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f78186b;

            C1448b(R0.e eVar, C4899r0<Boolean> r0Var) {
                this.f78185a = eVar;
                this.f78186b = r0Var;
            }

            public final void a(C5857c cVar, C4889m mVar, int i10) {
                int i11;
                C5857c cVar2 = cVar;
                C4889m mVar2 = mVar;
                C17542s.j(cVar2, "$this$PullToRefreshBox");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1152511117, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseComposable.<anonymous>.<anonymous> (BrowseScreenComposables.kt:175)");
                    }
                    R0.b bVar = R0.b.f12188a;
                    boolean o02 = C10504K.D(this.f78186b);
                    androidx.compose.ui.d a10 = cVar2.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.m());
                    C18030v vVar = C18030v.f147664a;
                    int i12 = C18030v.f147665b;
                    long G02 = vVar.a(mVar2, i12).G0();
                    bVar.a(this.f78185a, o02, a10, vVar.a(mVar2, i12).k(), G02, 0.0f, mVar, R0.b.f12192e << 18, 32);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zf.K$b$c */
        static final class c implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ingka.ikea.app.browseandsearch.browseV2.b f78187a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10521f0 f78188b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5974I f78189c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<c1, Interaction$Component, C16807N> f78190d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17642l<e, C16807N> f78191e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l<com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> f78192f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Dr.a f78193g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f78194h;

            c(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, C10521f0 f0Var, C5974I i10, p<? super c1, ? super Interaction$Component, C16807N> pVar, C17642l<? super e, C16807N> lVar, C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> lVar2, Dr.a aVar, int i11) {
                this.f78187a = bVar;
                this.f78188b = f0Var;
                this.f78189c = i10;
                this.f78190d = pVar;
                this.f78191e = lVar;
                this.f78192f = lVar2;
                this.f78193g = aVar;
                this.f78194h = i11;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C17642l lVar, g gVar) {
                C17542s.j(gVar, "it");
                lVar.invoke(new a.c(gVar));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C17642l lVar) {
                lVar.invoke(a.d.f70270a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C17642l lVar) {
                lVar.invoke(a.C1211a.f70267a);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(s0.C5857c r17, U0.C4889m r18, int r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r12 = r18
                    r1 = r19
                    java.lang.String r2 = "$this$PullToRefreshBox"
                    r3 = r17
                    kotlin.jvm.internal.C17542s.j(r3, r2)
                    r2 = r1 & 17
                    r3 = 16
                    if (r2 != r3) goto L_0x001f
                    boolean r2 = r18.l()
                    if (r2 != 0) goto L_0x001a
                    goto L_0x001f
                L_0x001a:
                    r18.L()
                    goto L_0x00cd
                L_0x001f:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x002e
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseComposable.<anonymous>.<anonymous> (BrowseScreenComposables.kt:188)"
                    r4 = -589712724(0xffffffffdcd9b2ac, float:-4.90212174E17)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x002e:
                    com.ingka.ikea.app.browseandsearch.browseV2.b r1 = r0.f78187a
                    zf.f0 r2 = r0.f78188b
                    u0.I r3 = r0.f78189c
                    nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r4 = r0.f78190d
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r5 = r0.f78191e
                    r6 = 1081258076(0x4072b05c, float:3.7920141)
                    r12.W(r6)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r6 = r0.f78192f
                    boolean r6 = r12.V(r6)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r7 = r0.f78192f
                    java.lang.Object r8 = r18.D()
                    if (r6 != 0) goto L_0x0054
                    U0.m$a r6 = U0.C4889m.f14007a
                    java.lang.Object r6 = r6.a()
                    if (r8 != r6) goto L_0x005c
                L_0x0054:
                    zf.N r8 = new zf.N
                    r8.<init>(r7)
                    r12.u(r8)
                L_0x005c:
                    r6 = r8
                    nI.l r6 = (nI.C17642l) r6
                    r18.P()
                    r7 = 1081261338(0x4072bd1a, float:3.7927918)
                    r12.W(r7)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r7 = r0.f78192f
                    boolean r7 = r12.V(r7)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r8 = r0.f78192f
                    java.lang.Object r9 = r18.D()
                    if (r7 != 0) goto L_0x007e
                    U0.m$a r7 = U0.C4889m.f14007a
                    java.lang.Object r7 = r7.a()
                    if (r9 != r7) goto L_0x0086
                L_0x007e:
                    zf.O r9 = new zf.O
                    r9.<init>(r8)
                    r12.u(r9)
                L_0x0086:
                    r7 = r9
                    nI.a r7 = (nI.C17631a) r7
                    r18.P()
                    r8 = 1081264694(0x4072ca36, float:3.793592)
                    r12.W(r8)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r8 = r0.f78192f
                    boolean r8 = r12.V(r8)
                    nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r9 = r0.f78192f
                    java.lang.Object r10 = r18.D()
                    if (r8 != 0) goto L_0x00a8
                    U0.m$a r8 = U0.C4889m.f14007a
                    java.lang.Object r8 = r8.a()
                    if (r10 != r8) goto L_0x00b0
                L_0x00a8:
                    zf.P r10 = new zf.P
                    r10.<init>(r9)
                    r12.u(r10)
                L_0x00b0:
                    r8 = r10
                    nI.a r8 = (nI.C17631a) r8
                    r18.P()
                    Dr.a r9 = r0.f78193g
                    int r10 = r0.f78194h
                    r14 = 0
                    r15 = 1024(0x400, float:1.435E-42)
                    r11 = 0
                    r13 = 0
                    r12 = r18
                    zf.C10504K.X(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x00cd
                    U0.C4895p.R()
                L_0x00cd:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.b.c.e(s0.c, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        b(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, C17642l<? super e, C16807N> lVar, C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> lVar2, Q q10, R0.e eVar, C4899r0<Boolean> r0Var, C10521f0 f0Var, C5974I i10, p<? super c1, ? super Interaction$Component, C16807N> pVar, Dr.a aVar, int i11) {
            this.f78172a = bVar;
            this.f78173b = lVar;
            this.f78174c = lVar2;
            this.f78175d = q10;
            this.f78176e = eVar;
            this.f78177f = r0Var;
            this.f78178g = f0Var;
            this.f78179h = i10;
            this.f78180i = pVar;
            this.f78181j = aVar;
            this.f78182k = i11;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(a.e.f70271a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, Q q10, C4899r0 r0Var) {
            lVar.invoke(a.g.f70274a);
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(r0Var, (C17164e<? super a>) null), 3, (Object) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5834E r22, U0.C4889m r23, int r24) {
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
                goto L_0x0174
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseComposable.<anonymous> (BrowseScreenComposables.kt:146)"
                r5 = 832623338(0x31a0d2ea, float:4.680591E-9)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                com.ingka.ikea.app.browseandsearch.browseV2.b r3 = r0.f78172a
                boolean r3 = r3.m()
                if (r3 == 0) goto L_0x0072
                r3 = 411967878(0x188e2186, float:3.673999E-24)
                r11.W(r3)
                com.ingka.ikea.app.browseandsearch.browseV2.b r3 = r0.f78172a
                qe.b r3 = r3.a()
                com.ingka.ikea.app.browseandsearch.browseV2.b r4 = r0.f78172a
                Es.a r4 = r4.d()
                com.ingka.ikea.app.browseandsearch.browseV2.b r5 = r0.f78172a
                boolean r5 = r5.k()
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r6 = r0.f78173b
                r7 = r2 & 14
                r1 = r22
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r23
                zf.C10504K.M(r1, r2, r3, r4, r5, r6, r7)
                r23.P()
                goto L_0x016b
            L_0x0072:
                com.ingka.ikea.app.browseandsearch.browseV2.b r3 = r0.f78172a
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x00ca
                r3 = 412330919(0x1893aba7, float:3.8171934E-24)
                r11.W(r3)
                com.ingka.ikea.app.browseandsearch.browseV2.b r3 = r0.f78172a
                qe.b r3 = r3.a()
                com.ingka.ikea.app.browseandsearch.browseV2.b r4 = r0.f78172a
                Es.a r4 = r4.d()
                r5 = 1814423090(0x6c25e632, float:8.022393E26)
                r11.W(r5)
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r5 = r0.f78174c
                boolean r5 = r11.V(r5)
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r6 = r0.f78174c
                java.lang.Object r7 = r23.D()
                if (r5 != 0) goto L_0x00a8
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r7 != r5) goto L_0x00b0
            L_0x00a8:
                zf.L r7 = new zf.L
                r7.<init>(r6)
                r11.u(r7)
            L_0x00b0:
                r5 = r7
                nI.a r5 = (nI.C17631a) r5
                r23.P()
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r6 = r0.f78173b
                r7 = r2 & 14
                r1 = r22
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r23
                zf.C10504K.I(r1, r2, r3, r4, r5, r6, r7)
                r23.P()
                goto L_0x016b
            L_0x00ca:
                r2 = 412718853(0x18999705, float:3.9702064E-24)
                r11.W(r2)
                U0.r0<java.lang.Boolean> r2 = r0.f78177f
                boolean r2 = zf.C10504K.D(r2)
                androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                r4 = 0
                r5 = 0
                r6 = 1
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.f(r3, r4, r6, r5)
                androidx.compose.ui.d r3 = s0.C5852X.e(r3)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.h(r3, r1)
                r1 = 1814430644(0x6c2603b4, float:8.027967E26)
                r11.W(r1)
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r1 = r0.f78174c
                boolean r1 = r11.V(r1)
                QJ.Q r4 = r0.f78175d
                boolean r4 = r11.F(r4)
                r1 = r1 | r4
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r4 = r0.f78174c
                QJ.Q r5 = r0.f78175d
                U0.r0<java.lang.Boolean> r7 = r0.f78177f
                java.lang.Object r8 = r23.D()
                if (r1 != 0) goto L_0x010e
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r8 != r1) goto L_0x0116
            L_0x010e:
                zf.M r8 = new zf.M
                r8.<init>(r4, r5, r7)
                r11.u(r8)
            L_0x0116:
                r4 = r8
                nI.a r4 = (nI.C17631a) r4
                r23.P()
                R0.e r5 = r0.f78176e
                zf.K$b$b r1 = new zf.K$b$b
                U0.r0<java.lang.Boolean> r7 = r0.f78177f
                r1.<init>(r5, r7)
                r7 = 1152511117(0x44b1ec8d, float:1423.3922)
                r8 = 54
                c1.a r7 = c1.c.e(r7, r6, r1, r11, r8)
                zf.K$b$c r1 = new zf.K$b$c
                com.ingka.ikea.app.browseandsearch.browseV2.b r13 = r0.f78172a
                zf.f0 r14 = r0.f78178g
                u0.I r15 = r0.f78179h
                nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r9 = r0.f78180i
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r10 = r0.f78173b
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.a, XH.N> r12 = r0.f78174c
                Dr.a r6 = r0.f78181j
                int r8 = r0.f78182k
                r18 = r12
                r12 = r1
                r16 = r9
                r17 = r10
                r19 = r6
                r20 = r8
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
                r6 = -589712724(0xffffffffdcd9b2ac, float:-4.90212174E17)
                r8 = 1
                r9 = 54
                c1.a r8 = c1.c.e(r6, r8, r1, r11, r9)
                r9 = 1769472(0x1b0000, float:2.479558E-39)
                r10 = 16
                r6 = 0
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r23
                R0.c.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r23.P()
            L_0x016b:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0174
                U0.C4895p.R()
            L_0x0174:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.b.c(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseScreenComposablesKt$BrowseComposable$5$1", f = "BrowseScreenComposables.kt", l = {217}, m = "invokeSuspend")
    /* renamed from: zf.K$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f78196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5974I i10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f78196d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f78196d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78195c;
            if (i10 == 0) {
                y.b(obj);
                C5974I i11 = this.f78196d;
                this.f78195c = 1;
                if (C5974I.J(i11, 0, 0, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseScreenComposablesKt$ShowSnackbar$1$1", f = "BrowseScreenComposables.kt", l = {232}, m = "invokeSuspend")
    /* renamed from: zf.K$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f78198d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f78199e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78200f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L0 l02, String str, C17631a<C16807N> aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f78198d = l02;
            this.f78199e = str;
            this.f78200f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f78198d, this.f78199e, this.f78200f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78197c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f78198d;
                String str = this.f78199e;
                J0 j02 = J0.Short;
                this.f78197c = 1;
                if (L0.f(l02, str, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f78200f.invoke();
            return C16807N.f139792a;
        }
    }

    public static final void C(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, com.ingka.ikea.app.browseandsearch.browseV2.f fVar, C10521f0 f0Var, C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> lVar, boolean z10, p<? super c1, ? super Interaction$Component, C16807N> pVar, C17642l<? super e, C16807N> lVar2, Dr.a aVar, int i10, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        com.ingka.ikea.app.browseandsearch.browseV2.b bVar2 = bVar;
        com.ingka.ikea.app.browseandsearch.browseV2.f fVar2 = fVar;
        C10521f0 f0Var2 = f0Var;
        C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.a, C16807N> lVar3 = lVar;
        boolean z11 = z10;
        p<? super c1, ? super Interaction$Component, C16807N> pVar2 = pVar;
        C17642l<? super e, C16807N> lVar4 = lVar2;
        Dr.a aVar2 = aVar;
        int i13 = i11;
        C17542s.j(bVar2, "uiState");
        C17542s.j(lVar3, "onAction");
        C17542s.j(pVar2, "onProductItemEvent");
        C17542s.j(lVar4, "onScreenUiEvent");
        C17542s.j(aVar2, "kreativComposable");
        C4889m k10 = mVar.k(321584155);
        if ((i13 & 6) == 0) {
            i12 = (k10.F(bVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 48) == 0) {
            i12 |= (i13 & 64) == 0 ? k10.V(fVar2) : k10.F(fVar2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i12 |= (i13 & 512) == 0 ? k10.V(f0Var2) : k10.F(f0Var2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i12 |= k10.F(lVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i12 |= k10.b(z11) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i12 |= k10.F(pVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i13) == 0) {
            i12 |= k10.F(lVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i13) == 0) {
            i12 |= k10.F(aVar2) ? 8388608 : 4194304;
        }
        int i14 = i10;
        if ((100663296 & i13) == 0) {
            i12 |= k10.d(i14) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(321584155, i12, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseComposable (BrowseScreenComposables.kt:128)");
            }
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            R0.e r10 = R0.c.r(k10, 0);
            k10.W(-1947909494);
            Object D11 = k10.D();
            if (D11 == aVar3.a()) {
                D11 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            k10.W(-1947907448);
            Object D12 = k10.D();
            if (D12 == aVar3.a()) {
                D12 = new L0();
                k10.u(D12);
            }
            L0 l02 = (L0) D12;
            k10.P();
            C5974I b11 = C5975J.b(0, 0, k10, 0, 3);
            k10.W(-1947903012);
            int i15 = 3670016 & i12;
            boolean z12 = i15 == 1048576;
            Object D13 = k10.D();
            if (z12 || D13 == aVar3.a()) {
                D13 = new C10498E(lVar4);
                k10.u(D13);
            }
            k10.P();
            k.e(b11, (C17642l) D13, k10, 0);
            C5848T c10 = C5850V.c(h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C5264a e10 = c1.c.e(750825825, true, new a(l02), k10, 54);
            b bVar3 = r0;
            int i16 = i15;
            L0 l03 = l02;
            b bVar4 = new b(bVar, lVar2, lVar, a10, r10, r0Var, f0Var, b11, pVar, aVar, i10);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, c10, c1.c.e(832623338, true, bVar3, mVar2, 54), mVar2, 805309440, 247);
            mVar2.W(-1947811559);
            if (z10) {
                boolean z13 = false;
                C13023e c11 = C13026h.c(j.b(Oo.b.f84521U3, mVar2, 0));
                mVar2.W(-1947804508);
                if (i16 == 1048576) {
                    z13 = true;
                }
                Object D14 = mVar2.D();
                if (z13 || D14 == aVar3.a()) {
                    D14 = new C10499F(lVar2);
                    mVar2.u(D14);
                } else {
                    C17642l<? super e, C16807N> lVar5 = lVar2;
                }
                mVar2.P();
                m0(l03, c11, (C17631a) D14, mVar2, (C13023e.f110931a << 3) | 6);
            } else {
                C17642l<? super e, C16807N> lVar6 = lVar2;
            }
            mVar2.P();
            com.ingka.ikea.app.browseandsearch.browseV2.f fVar3 = fVar;
            if (fVar3 != null) {
                if (C17542s.e(fVar3, f.a.f70372a)) {
                    C16807N n10 = C16807N.f139792a;
                    mVar2.W(-1947797707);
                    boolean V10 = mVar2.V(b11);
                    Object D15 = mVar2.D();
                    if (V10 || D15 == aVar3.a()) {
                        D15 = new c(b11, (C17164e<? super c>) null);
                        mVar2.u(D15);
                    }
                    mVar2.P();
                    P.g(n10, (p) D15, mVar2, 6);
                } else {
                    throw new t();
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            C17642l<? super e, C16807N> lVar7 = lVar4;
            com.ingka.ikea.app.browseandsearch.browseV2.f fVar4 = fVar2;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C10500G(bVar, fVar, f0Var, lVar, z10, pVar, lVar2, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean D(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void E(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17642l lVar, boolean z10) {
        lVar.invoke(new e.n(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C17642l lVar) {
        lVar.invoke(e.b.f70349a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, com.ingka.ikea.app.browseandsearch.browseV2.f fVar, C10521f0 f0Var, C17642l lVar, boolean z10, p pVar, C17642l lVar2, Dr.a aVar, int i10, int i11, C4889m mVar, int i12) {
        C(bVar, fVar, f0Var, lVar, z10, pVar, lVar2, aVar, i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void I(s0.C5834E r43, qe.C10189b r44, Es.a r45, nI.C17631a<XH.C16807N> r46, nI.C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.e, XH.C16807N> r47, U0.C4889m r48, int r49) {
        /*
            r1 = r43
            r8 = r44
            r9 = r45
            r0 = r46
            r15 = r47
            r14 = r49
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "alertMessageState"
            kotlin.jvm.internal.C17542s.j(r8, r2)
            java.lang.String r2 = "inboxState"
            kotlin.jvm.internal.C17542s.j(r9, r2)
            java.lang.String r2 = "onRetryClicked"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "onScreenUiEvent"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = 857135944(0x3316db48, float:3.512403E-8)
            r3 = r48
            U0.m r13 = r3.k(r2)
            r3 = 6
            r4 = r14 & 6
            if (r4 != 0) goto L_0x003e
            boolean r4 = r13.V(r1)
            if (r4 == 0) goto L_0x003b
            r4 = 4
            goto L_0x003c
        L_0x003b:
            r4 = 2
        L_0x003c:
            r4 = r4 | r14
            goto L_0x003f
        L_0x003e:
            r4 = r14
        L_0x003f:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x004f
            boolean r5 = r13.F(r8)
            if (r5 == 0) goto L_0x004c
            r5 = 32
            goto L_0x004e
        L_0x004c:
            r5 = 16
        L_0x004e:
            r4 = r4 | r5
        L_0x004f:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005f
            boolean r5 = r13.F(r9)
            if (r5 == 0) goto L_0x005c
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r5
        L_0x005f:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006f
            boolean r5 = r13.F(r0)
            if (r5 == 0) goto L_0x006c
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x006e
        L_0x006c:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006e:
            r4 = r4 | r5
        L_0x006f:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x0080
            boolean r5 = r13.F(r15)
            if (r5 == 0) goto L_0x007d
            r5 = r6
            goto L_0x007f
        L_0x007d:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x007f:
            r4 = r4 | r5
        L_0x0080:
            r12 = r4
            r4 = r12 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r5) goto L_0x0094
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            r13.L()
            r4 = r13
            goto L_0x0241
        L_0x0094:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00a0
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseError (BrowseScreenComposables.kt:466)"
            U0.C4895p.S(r2, r12, r4, r5)
        L_0x00a0:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r5 = 0
            r4 = 1
            r2 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r7, r5, r4, r2)
            androidx.compose.ui.d r2 = s0.C5852X.e(r16)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.h(r2, r1)
            androidx.compose.ui.d r2 = TC.e.i(r2)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r4 = r16.b()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r5 = r16.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r13, r3)
            r5 = 0
            int r4 = U0.C4883j.a(r13, r5)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r11 = r19.a()
            U0.f r20 = r13.m()
            if (r20 != 0) goto L_0x00e1
            U0.C4883j.c()
        L_0x00e1:
            r13.I()
            boolean r20 = r13.i()
            if (r20 == 0) goto L_0x00ee
            r13.p(r11)
            goto L_0x00f1
        L_0x00ee:
            r13.t()
        L_0x00f1:
            U0.m r11 = U0.F1.a(r13)
            nI.p r10 = r19.c()
            U0.F1.c(r11, r3, r10)
            nI.p r3 = r19.e()
            U0.F1.c(r11, r5, r3)
            nI.p r3 = r19.b()
            boolean r5 = r11.i()
            if (r5 != 0) goto L_0x011b
            java.lang.Object r5 = r11.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r10)
            if (r5 != 0) goto L_0x0129
        L_0x011b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r11.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.w(r4, r3)
        L_0x0129:
            nI.p r3 = r19.d()
            U0.F1.c(r11, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            r2 = 821100388(0x30f0ff64, float:1.7534885E-9)
            r13.W(r2)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            if (r2 != r6) goto L_0x0140
            r3 = 1
            goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            java.lang.Object r4 = r13.D()
            if (r3 != 0) goto L_0x014f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0157
        L_0x014f:
            zf.k r4 = new zf.k
            r4.<init>(r15)
            r13.u(r4)
        L_0x0157:
            nI.a r4 = (nI.C17631a) r4
            r13.P()
            r3 = 821103165(0x30f10a3d, float:1.7537968E-9)
            r13.W(r3)
            if (r2 != r6) goto L_0x0166
            r2 = 1
            goto L_0x0167
        L_0x0166:
            r2 = 0
        L_0x0167:
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x0175
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x017d
        L_0x0175:
            zf.l r3 = new zf.l
            r3.<init>(r15)
            r13.u(r3)
        L_0x017d:
            r5 = r3
            nI.a r5 = (nI.C17631a) r5
            r13.P()
            int r2 = r12 >> 3
            r10 = r2 & 126(0x7e, float:1.77E-43)
            r11 = 0
            r2 = r44
            r3 = r45
            r6 = 1
            r0 = 0
            r6 = r13
            r42 = r7
            r7 = r10
            zf.K0.d(r2, r3, r4, r5, r6, r7)
            int r2 = wf.C10366b.f77647h
            java.lang.String r16 = J1.j.b(r2, r13, r0)
            TC.b$b$a r17 = TC.C13679b.C2857b.a.f116683a
            r40 = 0
            r41 = 262140(0x3fffc, float:3.67336E-40)
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r13
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            int r2 = wf.C10366b.f77646g
            java.lang.String r16 = J1.j.b(r2, r13, r0)
            TC.b$a$b r17 = TC.C13679b.a.C2856b.f116680a
            r2 = 16
            float r2 = (float) r2
            float r20 = c2.h.B(r2)
            r23 = 13
            r19 = 0
            r21 = 0
            r22 = 0
            r18 = r42
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            r41 = 262136(0x3fff8, float:3.67331E-40)
            r19 = 0
            r21 = 0
            r23 = 0
            r39 = 432(0x1b0, float:6.05E-43)
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r2 = r42
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r2, r3, r4, r11)
            r2 = 32
            float r2 = (float) r2
            float r18 = c2.h.B(r2)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            int r2 = wf.C10366b.f77645f
            java.lang.String r10 = J1.j.b(r2, r13, r0)
            int r0 = r12 << 18
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r21 = r0 | 48
            r22 = 508(0x1fc, float:7.12E-43)
            r12 = 0
            r0 = 0
            r2 = 0
            r3 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r4 = r13
            r13 = r0
            r14 = r2
            r15 = r3
            r19 = r46
            r20 = r4
            SC.L.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0241
            U0.C4895p.R()
        L_0x0241:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x025c
            zf.m r10 = new zf.m
            r0 = r10
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r10)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.I(s0.E, qe.b, Es.a, nI.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C17642l lVar) {
        lVar.invoke(e.a.f70348a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17642l lVar) {
        lVar.invoke(e.C1216e.f70355a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C5834E e10, C10189b bVar, Es.a aVar, C17631a aVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        I(e10, bVar, aVar, aVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void M(s0.C5834E r31, qe.C10189b r32, Es.a r33, boolean r34, nI.C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.e, XH.C16807N> r35, U0.C4889m r36, int r37) {
        /*
            r1 = r31
            r4 = r34
            r5 = r35
            r6 = r37
            r0 = 1
            r2 = 48
            r3 = 1535634220(0x5b87eb2c, float:7.6515392E16)
            r7 = r36
            U0.m r14 = r7.k(r3)
            r13 = 6
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0024
            boolean r7 = r14.V(r1)
            if (r7 == 0) goto L_0x0021
            r7 = 4
            goto L_0x0022
        L_0x0021:
            r7 = 2
        L_0x0022:
            r7 = r7 | r6
            goto L_0x0025
        L_0x0024:
            r7 = r6
        L_0x0025:
            r8 = r6 & 48
            r11 = r32
            if (r8 != 0) goto L_0x0037
            boolean r8 = r14.F(r11)
            if (r8 == 0) goto L_0x0034
            r8 = 32
            goto L_0x0036
        L_0x0034:
            r8 = 16
        L_0x0036:
            r7 = r7 | r8
        L_0x0037:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r10 = r33
            if (r8 != 0) goto L_0x0049
            boolean r8 = r14.F(r10)
            if (r8 == 0) goto L_0x0046
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r7 = r7 | r8
        L_0x0049:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r14.b(r4)
            if (r8 == 0) goto L_0x0056
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r7 = r7 | r8
        L_0x0059:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 != 0) goto L_0x006a
            boolean r8 = r14.F(r5)
            if (r8 == 0) goto L_0x0067
            r8 = r9
            goto L_0x0069
        L_0x0067:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r7 = r7 | r8
        L_0x006a:
            r8 = r7 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r12) goto L_0x007c
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r14.L()
            goto L_0x0383
        L_0x007c:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0088
            r8 = -1
            java.lang.String r12 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseLoading (BrowseScreenComposables.kt:374)"
            U0.C4895p.S(r3, r7, r8, r12)
        L_0x0088:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r12 = 0
            r8 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r3, r12, r0, r8)
            androidx.compose.ui.d r8 = s0.C5852X.e(r16)
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.h(r8, r1)
            r8 = 0
            androidx.compose.foundation.o r19 = androidx.compose.foundation.m.c(r8, r14, r8, r0)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r12 = androidx.compose.foundation.m.f(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d r18 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r13 = r18.g()
            i1.c$a r18 = i1.C5437c.f24302a
            i1.c$b r2 = r18.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r13, r2, r14, r8)
            int r13 = U0.C4883j.a(r14, r8)
            U0.y r8 = r14.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r14, r12)
            G1.g$a r21 = G1.C4504g.f6515W
            nI.a r0 = r21.a()
            U0.f r23 = r14.m()
            if (r23 != 0) goto L_0x00d6
            U0.C4883j.c()
        L_0x00d6:
            r14.I()
            boolean r23 = r14.i()
            if (r23 == 0) goto L_0x00e3
            r14.p(r0)
            goto L_0x00e6
        L_0x00e3:
            r14.t()
        L_0x00e6:
            U0.m r0 = U0.F1.a(r14)
            nI.p r15 = r21.c()
            U0.F1.c(r0, r2, r15)
            nI.p r2 = r21.e()
            U0.F1.c(r0, r8, r2)
            nI.p r2 = r21.b()
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x0110
            java.lang.Object r8 = r0.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r8 != 0) goto L_0x011e
        L_0x0110:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r0.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r0.w(r8, r2)
        L_0x011e:
            nI.p r2 = r21.d()
            U0.F1.c(r0, r12, r2)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 819841208(0x30ddc8b8, float:1.6136914E-9)
            r14.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r7
            if (r0 != r9) goto L_0x0135
            r2 = 1
            goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            java.lang.Object r8 = r14.D()
            if (r2 != 0) goto L_0x0144
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x014c
        L_0x0144:
            zf.I r8 = new zf.I
            r8.<init>(r5)
            r14.u(r8)
        L_0x014c:
            r2 = r8
            nI.a r2 = (nI.C17631a) r2
            r14.P()
            r8 = 819843985(0x30ddd391, float:1.6139997E-9)
            r14.W(r8)
            if (r0 != r9) goto L_0x015c
            r0 = 1
            goto L_0x015d
        L_0x015c:
            r0 = 0
        L_0x015d:
            java.lang.Object r8 = r14.D()
            if (r0 != 0) goto L_0x016b
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x0173
        L_0x016b:
            zf.J r8 = new zf.J
            r8.<init>(r5)
            r14.u(r8)
        L_0x0173:
            r0 = r8
            nI.a r0 = (nI.C17631a) r0
            r14.P()
            int r7 = r7 >> 3
            r12 = r7 & 126(0x7e, float:1.77E-43)
            r7 = r32
            r13 = 0
            r15 = 0
            r8 = r33
            r9 = r2
            r10 = r0
            r11 = r14
            r0 = 2
            r2 = 0
            zf.K0.d(r7, r8, r9, r10, r11, r12)
            r7 = 4
            float r8 = (float) r7
            float r7 = c2.h.B(r8)
            A0.f r7 = A0.g.e(r7)
            androidx.compose.ui.d r8 = TC.e.i(r3)
            r9 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r8, r2, r9, r15)
            r9 = 54
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r8, r9)
            r9 = 27
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            A0.f r9 = A0.g.e(r9)
            androidx.compose.ui.d r8 = m1.e.a(r8, r9)
            SC.H2.b(r8, r13, r14, r13, r0)
            androidx.compose.ui.d r24 = TC.e.i(r3)
            r8 = 24
            float r8 = (float) r8
            float r26 = c2.h.B(r8)
            r29 = 13
            r30 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r24, r25, r26, r27, r28, r29, r30)
            r10 = 1053609165(0x3ecccccd, float:0.4)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.g(r9, r10)
            r10 = 48
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r9, r10)
            androidx.compose.ui.d r9 = m1.e.a(r9, r7)
            SC.H2.b(r9, r13, r14, r13, r0)
            r9 = 819864561(0x30de23f1, float:1.6162841E-9)
            r14.W(r9)
            if (r4 == 0) goto L_0x0222
            androidx.compose.ui.d r24 = TC.e.i(r3)
            float r26 = c2.h.B(r8)
            r29 = 13
            r30 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r24, r25, r26, r27, r28, r29, r30)
            r8 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r2, r8, r15)
            r8 = 156(0x9c, float:2.19E-43)
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r8)
            androidx.compose.ui.d r3 = m1.e.a(r3, r7)
            SC.H2.b(r3, r13, r14, r13, r0)
        L_0x0222:
            r14.P()
            r3 = 819876840(0x30de53e8, float:1.6176473E-9)
            r14.W(r3)
            r8 = r13
        L_0x022c:
            r3 = 8
            r9 = 4
            if (r8 >= r9) goto L_0x0336
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r11 = TC.e.i(r10)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            float r3 = (float) r3
            float r9 = c2.h.B(r3)
            androidx.compose.foundation.layout.d$f r9 = r12.n(r9)
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c$c r12 = r12.l()
            r0 = 6
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r12, r14, r0)
            int r12 = U0.C4883j.a(r14, r13)
            U0.y r0 = r14.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r14, r11)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r13 = r17.a()
            U0.f r20 = r14.m()
            if (r20 != 0) goto L_0x0268
            U0.C4883j.c()
        L_0x0268:
            r14.I()
            boolean r20 = r14.i()
            if (r20 == 0) goto L_0x0275
            r14.p(r13)
            goto L_0x0278
        L_0x0275:
            r14.t()
        L_0x0278:
            U0.m r13 = U0.F1.a(r14)
            nI.p r2 = r17.c()
            U0.F1.c(r13, r9, r2)
            nI.p r2 = r17.e()
            U0.F1.c(r13, r0, r2)
            nI.p r0 = r17.b()
            boolean r2 = r13.i()
            if (r2 != 0) goto L_0x02a2
            java.lang.Object r2 = r13.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r2 != 0) goto L_0x02b0
        L_0x02a2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r13.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r13.w(r2, r0)
        L_0x02b0:
            nI.p r0 = r17.d()
            U0.F1.c(r13, r11, r0)
            s0.N r0 = s0.C5843N.f28726a
            float r25 = c2.h.B(r3)
            r28 = 13
            r29 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r23 = r10
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            r9 = 0
            r11 = 1
            androidx.compose.ui.d r24 = androidx.compose.foundation.layout.J.h(r2, r9, r11, r15)
            r27 = 2
            r28 = 0
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r23 = r0
            androidx.compose.ui.d r2 = s0.C5842M.e(r23, r24, r25, r26, r27, r28)
            r9 = 144(0x90, float:2.02E-43)
            float r9 = (float) r9
            float r11 = c2.h.B(r9)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r2, r11)
            androidx.compose.ui.d r2 = m1.e.a(r2, r7)
            r11 = 2
            r12 = 0
            SC.H2.b(r2, r12, r14, r12, r11)
            float r25 = c2.h.B(r3)
            r28 = 13
            r24 = 0
            r26 = 0
            r27 = 0
            r23 = r10
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            r3 = 0
            r10 = 1
            androidx.compose.ui.d r24 = androidx.compose.foundation.layout.J.h(r2, r3, r10, r15)
            r27 = 2
            r28 = 0
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r23 = r0
            androidx.compose.ui.d r0 = s0.C5842M.e(r23, r24, r25, r26, r27, r28)
            float r2 = c2.h.B(r9)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r2)
            androidx.compose.ui.d r0 = m1.e.a(r0, r7)
            r2 = 2
            r3 = 0
            SC.H2.b(r0, r3, r14, r3, r2)
            r14.x()
            r0 = 1
            int r8 = r8 + r0
            r0 = 2
            r2 = 0
            r13 = 0
            goto L_0x022c
        L_0x0336:
            r14.P()
            androidx.compose.ui.d$a r23 = androidx.compose.ui.d.f18749a
            float r0 = (float) r3
            float r25 = c2.h.B(r0)
            r28 = 13
            r29 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            r2 = 0
            r3 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r2, r3, r15)
            androidx.compose.ui.d r0 = TC.e.i(r0)
            r2 = 64
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r2)
            androidx.compose.ui.d r0 = m1.e.a(r0, r7)
            r2 = 2
            r3 = 0
            SC.H2.b(r0, r3, r14, r3, r2)
            r12 = 6
            r13 = 14
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r14
            Op.K.e(r7, r8, r9, r10, r11, r12, r13)
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0383
            U0.C4895p.R()
        L_0x0383:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x039e
            zf.j r8 = new zf.j
            r0 = r8
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.M(s0.E, qe.b, Es.a, boolean, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17642l lVar) {
        lVar.invoke(e.a.f70348a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C17642l lVar) {
        lVar.invoke(e.C1216e.f70355a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C5834E e10, C10189b bVar, Es.a aVar, boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        M(e10, bVar, aVar, z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: nI.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Q(yf.h r19, zf.C10521f0 r20, boolean r21, Dr.a r22, nI.p<? super Op.c1, ? super com.ingka.ikea.analytics.Interaction$Component, XH.C16807N> r23, nI.C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.e, XH.C16807N> r24, U0.C4889m r25, int r26) {
        /*
            r1 = r19
            r13 = r20
            r14 = r22
            r15 = r23
            r0 = r24
            r12 = r26
            java.lang.String r2 = "browseViewModelV2"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "kreativComposable"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            java.lang.String r2 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "onScreenUiEvent"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -2080238889(0xffffffff840212d7, float:-1.5290077E-36)
            r3 = r25
            U0.m r11 = r3.k(r2)
            r3 = r12 & 6
            r10 = 4
            if (r3 != 0) goto L_0x0042
            r3 = r12 & 8
            if (r3 != 0) goto L_0x0037
            boolean r3 = r11.V(r1)
            goto L_0x003b
        L_0x0037:
            boolean r3 = r11.F(r1)
        L_0x003b:
            if (r3 == 0) goto L_0x003f
            r3 = r10
            goto L_0x0040
        L_0x003f:
            r3 = 2
        L_0x0040:
            r3 = r3 | r12
            goto L_0x0043
        L_0x0042:
            r3 = r12
        L_0x0043:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x005c
            r4 = r12 & 64
            if (r4 != 0) goto L_0x0050
            boolean r4 = r11.V(r13)
            goto L_0x0054
        L_0x0050:
            boolean r4 = r11.F(r13)
        L_0x0054:
            if (r4 == 0) goto L_0x0059
            r4 = 32
            goto L_0x005b
        L_0x0059:
            r4 = 16
        L_0x005b:
            r3 = r3 | r4
        L_0x005c:
            r4 = r12 & 384(0x180, float:5.38E-43)
            r9 = r21
            if (r4 != 0) goto L_0x006e
            boolean r4 = r11.b(r9)
            if (r4 == 0) goto L_0x006b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r3 = r3 | r4
        L_0x006e:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x007e
            boolean r4 = r11.F(r14)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r4
        L_0x007e:
            r4 = r12 & 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x008f
            boolean r4 = r11.F(r15)
            if (r4 == 0) goto L_0x008c
            r4 = r8
            goto L_0x008e
        L_0x008c:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r3 = r3 | r4
        L_0x008f:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r12
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r4 != 0) goto L_0x00a1
            boolean r4 = r11.F(r0)
            if (r4 == 0) goto L_0x009e
            r4 = r7
            goto L_0x00a0
        L_0x009e:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00a0:
            r3 = r3 | r4
        L_0x00a1:
            r6 = r3
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r6
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r4) goto L_0x00b9
            boolean r3 = r11.l()
            if (r3 != 0) goto L_0x00b2
            goto L_0x00b9
        L_0x00b2:
            r11.L()
            r17 = r11
            goto L_0x01e6
        L_0x00b9:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00c5
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.BrowseScreen (BrowseScreenComposables.kt:86)"
            U0.C4895p.S(r2, r6, r3, r4)
        L_0x00c5:
            TJ.P r3 = r19.getState()
            r2 = 0
            r16 = 7
            r4 = 0
            r5 = 0
            r17 = 0
            r18 = r6
            r6 = r17
            r7 = r11
            r8 = r2
            r9 = r16
            U0.A1 r2 = j3.a.c(r3, r4, r5, r6, r7, r8, r9)
            TJ.P r3 = r19.y()
            r8 = 0
            r9 = 7
            r6 = 0
            U0.A1 r3 = j3.a.c(r3, r4, r5, r6, r7, r8, r9)
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r11.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            int r5 = wf.C10365a.f77639a
            int r9 = r4.getInteger(r5)
            com.ingka.ikea.app.browseandsearch.browseV2.a$b r4 = new com.ingka.ikea.app.browseandsearch.browseV2.a$b
            r4.<init>(r9)
            r1.b(r4)
            com.ingka.ikea.app.browseandsearch.browseV2.b r2 = R(r2)
            com.ingka.ikea.app.browseandsearch.browseV2.f r3 = S(r3)
            r4 = 2123022711(0x7e8ac177, float:9.2219E37)
            r11.W(r4)
            r4 = r18 & 14
            if (r4 == r10) goto L_0x0122
            r7 = r18 & 8
            if (r7 == 0) goto L_0x0120
            boolean r7 = r11.F(r1)
            if (r7 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r7 = 0
            goto L_0x0123
        L_0x0122:
            r7 = 1
        L_0x0123:
            java.lang.Object r8 = r11.D()
            if (r7 != 0) goto L_0x0131
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0139
        L_0x0131:
            zf.i r8 = new zf.i
            r8.<init>(r1)
            r11.u(r8)
        L_0x0139:
            r7 = r8
            nI.l r7 = (nI.C17642l) r7
            r11.P()
            r8 = 2123011322(0x7e8a94fa, float:9.21035E37)
            r11.W(r8)
            if (r4 == r10) goto L_0x0154
            r8 = r18 & 8
            if (r8 == 0) goto L_0x0152
            boolean r8 = r11.F(r1)
            if (r8 == 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r8 = 0
            goto L_0x0155
        L_0x0154:
            r8 = 1
        L_0x0155:
            r16 = 57344(0xe000, float:8.0356E-41)
            r5 = r18 & r16
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r6) goto L_0x0160
            r5 = 1
            goto L_0x0161
        L_0x0160:
            r5 = 0
        L_0x0161:
            r5 = r5 | r8
            java.lang.Object r6 = r11.D()
            if (r5 != 0) goto L_0x0170
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0178
        L_0x0170:
            zf.t r6 = new zf.t
            r6.<init>(r1, r15)
            r11.u(r6)
        L_0x0178:
            r8 = r6
            nI.p r8 = (nI.p) r8
            r11.P()
            r5 = 2123017899(0x7e8aaeab, float:9.21702E37)
            r11.W(r5)
            if (r4 == r10) goto L_0x0193
            r4 = r18 & 8
            if (r4 == 0) goto L_0x0191
            boolean r4 = r11.F(r1)
            if (r4 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r4 = 0
            goto L_0x0194
        L_0x0193:
            r4 = 1
        L_0x0194:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r18 & r5
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 != r6) goto L_0x019e
            r5 = 1
            goto L_0x019f
        L_0x019e:
            r5 = 0
        L_0x019f:
            r4 = r4 | r5
            java.lang.Object r5 = r11.D()
            if (r4 != 0) goto L_0x01ae
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x01b6
        L_0x01ae:
            zf.C r5 = new zf.C
            r5.<init>(r1, r0)
            r11.u(r5)
        L_0x01b6:
            r10 = r5
            nI.l r10 = (nI.C17642l) r10
            r11.P()
            int r4 = r18 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            int r5 = r18 << 6
            r5 = r5 & r16
            r4 = r4 | r5
            int r5 = r18 << 12
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r6
            r16 = r4 | r5
            r4 = r20
            r5 = r7
            r6 = r21
            r7 = r8
            r8 = r10
            r10 = r9
            r9 = r22
            r17 = r11
            r12 = r16
            C(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01e6
            U0.C4895p.R()
        L_0x01e6:
            U0.Y0 r8 = r17.n()
            if (r8 == 0) goto L_0x0203
            zf.D r9 = new zf.D
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.Q(yf.h, zf.f0, boolean, Dr.a, nI.p, nI.l, U0.m, int):void");
    }

    private static final com.ingka.ikea.app.browseandsearch.browseV2.b R(A1<com.ingka.ikea.app.browseandsearch.browseV2.b> a12) {
        return a12.getValue();
    }

    private static final com.ingka.ikea.app.browseandsearch.browseV2.f S(A1<? extends com.ingka.ikea.app.browseandsearch.browseV2.f> a12) {
        return (com.ingka.ikea.app.browseandsearch.browseV2.f) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N T(yf.h hVar, com.ingka.ikea.app.browseandsearch.browseV2.a aVar) {
        C17542s.j(aVar, "action");
        hVar.b(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(yf.h hVar, p pVar, c1 c1Var, Interaction$Component interaction$Component) {
        C17542s.j(c1Var, "event");
        C17542s.j(interaction$Component, "interaction");
        hVar.b(new a.f(c1Var, interaction$Component));
        pVar.invoke(c1Var, interaction$Component);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V(yf.h hVar, C17642l lVar, e eVar) {
        C17542s.j(eVar, "event");
        hVar.b(new a.h(eVar));
        lVar.invoke(eVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(yf.h hVar, C10521f0 f0Var, boolean z10, Dr.a aVar, p pVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        Q(hVar, f0Var, z10, aVar, pVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void X(com.ingka.ikea.app.browseandsearch.browseV2.b r31, zf.C10521f0 r32, u0.C5974I r33, nI.p<? super Op.c1, ? super com.ingka.ikea.analytics.Interaction$Component, XH.C16807N> r34, nI.C17642l<? super com.ingka.ikea.app.browseandsearch.browseV2.e, XH.C16807N> r35, nI.C17642l<? super yf.g, XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, nI.C17631a<XH.C16807N> r38, Dr.a r39, int r40, androidx.compose.ui.d r41, U0.C4889m r42, int r43, int r44, int r45) {
        /*
            r10 = r31
            r11 = r32
            r12 = r39
            r13 = r40
            r14 = r43
            r15 = r45
            r0 = -1277543347(0xffffffffb3da3c4d, float:-1.0162385E-7)
            r1 = r42
            U0.m r9 = r1.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r14 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r9.F(r10)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r14
            goto L_0x002c
        L_0x002b:
            r1 = r14
        L_0x002c:
            r4 = r15 & 2
            if (r4 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x004c
        L_0x0033:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x004c
            r4 = r14 & 64
            if (r4 != 0) goto L_0x0040
            boolean r4 = r9.V(r11)
            goto L_0x0044
        L_0x0040:
            boolean r4 = r9.F(r11)
        L_0x0044:
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r15 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            r8 = r33
            goto L_0x0067
        L_0x0055:
            r4 = r14 & 384(0x180, float:5.38E-43)
            r8 = r33
            if (r4 != 0) goto L_0x0067
            boolean r4 = r9.V(r8)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r4
        L_0x0067:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r7 = r34
            goto L_0x0082
        L_0x0070:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r34
            if (r4 != 0) goto L_0x0082
            boolean r4 = r9.F(r7)
            if (r4 == 0) goto L_0x007f
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r4
        L_0x0082:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r4 = r35
            goto L_0x009e
        L_0x008b:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0088
            r4 = r35
            boolean r16 = r9.F(r4)
            if (r16 == 0) goto L_0x009a
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r16
        L_0x009e:
            r16 = r15 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a9
            r1 = r1 | r18
            r6 = r36
            goto L_0x00bc
        L_0x00a9:
            r16 = r14 & r18
            r6 = r36
            if (r16 != 0) goto L_0x00bc
            boolean r18 = r9.F(r6)
            if (r18 == 0) goto L_0x00b8
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r18
        L_0x00bc:
            r18 = r15 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c7
            r1 = r1 | r19
            r5 = r37
            goto L_0x00da
        L_0x00c7:
            r18 = r14 & r19
            r5 = r37
            if (r18 != 0) goto L_0x00da
            boolean r19 = r9.F(r5)
            if (r19 == 0) goto L_0x00d6
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r19
        L_0x00da:
            r2 = r15 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e4
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
        L_0x00e1:
            r2 = r38
            goto L_0x00f8
        L_0x00e4:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00e1
            r2 = r38
            boolean r20 = r9.F(r2)
            if (r20 == 0) goto L_0x00f4
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r20
        L_0x00f8:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0100
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00fe:
            r1 = r1 | r0
            goto L_0x0111
        L_0x0100:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0111
            boolean r0 = r9.F(r12)
            if (r0 == 0) goto L_0x010e
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fe
        L_0x010e:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00fe
        L_0x0111:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0119
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0117:
            r1 = r1 | r0
            goto L_0x012a
        L_0x0119:
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x012a
            boolean r0 = r9.d(r13)
            if (r0 == 0) goto L_0x0127
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0117
        L_0x0127:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0117
        L_0x012a:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0135
            r21 = r44 | 6
            r3 = r41
            r14 = r21
            goto L_0x014d
        L_0x0135:
            r21 = r44 & 6
            r3 = r41
            if (r21 != 0) goto L_0x014b
            boolean r22 = r9.V(r3)
            if (r22 == 0) goto L_0x0144
            r22 = 4
            goto L_0x0146
        L_0x0144:
            r22 = 2
        L_0x0146:
            r22 = r44 | r22
            r14 = r22
            goto L_0x014d
        L_0x014b:
            r14 = r44
        L_0x014d:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r1 & r22
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x016b
            r2 = r14 & 3
            r3 = 2
            if (r2 != r3) goto L_0x016b
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x0163
            goto L_0x016b
        L_0x0163:
            r9.L()
            r11 = r41
            r12 = r9
            goto L_0x0273
        L_0x016b:
            if (r0 == 0) goto L_0x0172
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r29 = r0
            goto L_0x0174
        L_0x0172:
            r29 = r41
        L_0x0174:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.Content (BrowseScreenComposables.kt:253)"
            r2 = -1277543347(0xffffffffb3da3c4d, float:-1.0162385E-7)
            U0.C4895p.S(r2, r1, r14, r0)
        L_0x0182:
            u0.b$a r3 = new u0.b$a
            r3.<init>(r13)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            r2 = 8
            float r2 = (float) r2
            r41 = r3
            float r3 = c2.h.B(r2)
            androidx.compose.foundation.layout.d$f r21 = r0.n(r3)
            float r2 = c2.h.B(r2)
            androidx.compose.foundation.layout.d$f r22 = r0.n(r2)
            r0 = 632121279(0x25ad67bf, float:3.0081017E-16)
            r9.W(r0)
            boolean r0 = r9.F(r10)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r20 = 1
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x01b5
            r2 = r20
            goto L_0x01b6
        L_0x01b5:
            r2 = 0
        L_0x01b6:
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 == r3) goto L_0x01ca
            r2 = r1 & 64
            if (r2 == 0) goto L_0x01c8
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            r2 = 0
            goto L_0x01cc
        L_0x01ca:
            r2 = r20
        L_0x01cc:
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 != r3) goto L_0x01d7
            r2 = r20
            goto L_0x01d8
        L_0x01d7:
            r2 = 0
        L_0x01d8:
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x01e2
            r2 = r20
            goto L_0x01e3
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r3) goto L_0x01ee
            r2 = r20
            goto L_0x01ef
        L_0x01ee:
            r2 = 0
        L_0x01ef:
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r3) goto L_0x01fa
            r2 = r20
            goto L_0x01fb
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r1
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 != r3) goto L_0x0206
            r3 = r20
            goto L_0x0207
        L_0x0206:
            r3 = 0
        L_0x0207:
            r0 = r0 | r3
            boolean r2 = r9.F(r12)
            r0 = r0 | r2
            java.lang.Object r2 = r9.D()
            if (r0 != 0) goto L_0x0221
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x021c
            goto L_0x0221
        L_0x021c:
            r16 = r41
            r10 = r1
            r12 = r9
            goto L_0x0243
        L_0x0221:
            zf.n r3 = new zf.n
            r0 = r3
            r2 = r1
            r1 = r31
            r10 = r2
            r2 = r35
            r16 = r41
            r11 = r3
            r3 = r32
            r4 = r38
            r5 = r34
            r6 = r36
            r7 = r37
            r8 = r40
            r12 = r9
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.u(r11)
            r2 = r11
        L_0x0243:
            r25 = r2
            nI.l r25 = (nI.C17642l) r25
            r12.P()
            int r0 = r14 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 1769472(0x1b0000, float:2.479558E-39)
            r0 = r0 | r1
            r1 = r10 & 896(0x380, float:1.256E-42)
            r27 = r0 | r1
            r28 = 408(0x198, float:5.72E-43)
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r17 = r29
            r18 = r33
            r26 = r12
            u0.C5984h.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0271
            U0.C4895p.R()
        L_0x0271:
            r11 = r29
        L_0x0273:
            U0.Y0 r14 = r12.n()
            if (r14 == 0) goto L_0x02a2
            zf.o r12 = new zf.o
            r0 = r12
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r13 = r12
            r12 = r43
            r15 = r13
            r13 = r44
            r30 = r14
            r14 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r30
            r0.a(r15)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C10504K.X(com.ingka.ikea.app.browseandsearch.browseV2.b, zf.f0, u0.I, nI.p, nI.l, nI.l, nI.a, nI.a, Dr.a, int, androidx.compose.ui.d, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, C17642l lVar, C10521f0 f0Var, C17631a aVar, p pVar, C17642l lVar2, C17631a aVar2, int i10, Dr.a aVar3, C5968C c10) {
        com.ingka.ikea.app.browseandsearch.browseV2.b bVar2 = bVar;
        C17642l lVar3 = lVar;
        C10521f0 f0Var2 = f0Var;
        p pVar2 = pVar;
        C5968C c11 = c10;
        C17542s.j(c11, "$this$LazyVerticalGrid");
        K0.j(c11, bVar.a(), bVar.d(), lVar);
        G0.e(c11, bVar.l(), lVar);
        if (f0Var2 != null) {
            C10527i0.b(c11, f0Var, lVar);
        }
        if (!bVar.h().isEmpty()) {
            C17631a aVar4 = aVar;
            B0.h(c11, bVar.h(), aVar, new C10538p(lVar));
        }
        T.e(c11, bVar.i(), new C10540s(pVar2), new C10542u(lVar, bVar), new C10543v(lVar, bVar));
        b.a b10 = bVar.b();
        if (b10 != null) {
            C10520f.h(c10, b10, lVar2, new C10544w(lVar, b10), aVar2, new C10545x(lVar), i10);
        }
        if (bVar.e() != null) {
            C10531k0.b(c11, bVar.e(), aVar3, new C10546y(lVar));
        }
        b.c f10 = bVar.f();
        if (f10 != null) {
            T.c(c11, f10, new C10547z(pVar2), new C10494A(lVar, f10), new C10495B(lVar, f10));
        }
        if (bVar.j()) {
            r0.j(c11, new C10539q(lVar), new r(lVar));
        }
        if (bVar.g().length() > 0) {
            C10535m0.b(c11, bVar.g());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(C17642l lVar, String str) {
        C17542s.j(str, "itemNo");
        lVar.invoke(new e.k(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(p pVar, c1 c1Var) {
        C17542s.j(c1Var, "it");
        pVar.invoke(c1Var, Interaction$Component.RECOMMENDATION_CAROUSEL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C17642l lVar, com.ingka.ikea.app.browseandsearch.browseV2.b bVar, List list) {
        b.c b10 = bVar.i().b();
        String c10 = b10 != null ? b10.c() : null;
        if (c10 == null) {
            c10 = "";
        }
        lVar.invoke(new e.l(c10, list));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(C17642l lVar, com.ingka.ikea.app.browseandsearch.browseV2.b bVar, List list) {
        C17542s.j(list, "includedItemNos");
        b.c b10 = bVar.i().b();
        String a10 = b10 != null ? b10.a() : null;
        if (a10 == null) {
            a10 = "";
        }
        lVar.invoke(new e.j(a10, list, Interaction$Component.RECOMMENDATION_CAROUSEL));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(C17642l lVar, b.a aVar, Category category) {
        C17542s.j(category, "category");
        String d10 = category.d();
        String a10 = category.a();
        for (b.a.C1212a aVar2 : aVar.e()) {
            if (aVar2.c()) {
                lVar.invoke(new e.c(d10, a10, aVar2.b(), category.c()));
                return C16807N.f139792a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C17642l lVar) {
        lVar.invoke(e.i.f70360a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17642l lVar, Uri uri) {
        C17542s.j(uri, "uri");
        lVar.invoke(new e.f(uri));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g0(p pVar, c1 c1Var) {
        C17542s.j(c1Var, "it");
        pVar.invoke(c1Var, Interaction$Component.LAST_CHANCE_CAROUSEL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(C17642l lVar, b.c cVar) {
        lVar.invoke(new e.g(cVar.a(), cVar.c()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(C17642l lVar, b.c cVar, List list) {
        C17542s.j(list, "includedItemNos");
        lVar.invoke(new e.j(cVar.a(), list, Interaction$Component.LAST_CHANCE_CAROUSEL));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j0(C17642l lVar) {
        lVar.invoke(e.p.f70370a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(C17642l lVar) {
        lVar.invoke(e.h.f70359a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l0(com.ingka.ikea.app.browseandsearch.browseV2.b bVar, C10521f0 f0Var, C5974I i10, p pVar, C17642l lVar, C17642l lVar2, C17631a aVar, C17631a aVar2, Dr.a aVar3, int i11, androidx.compose.ui.d dVar, int i12, int i13, int i14, C4889m mVar, int i15) {
        X(bVar, f0Var, i10, pVar, lVar, lVar2, aVar, aVar2, aVar3, i11, dVar, mVar, M0.a(i12 | 1), M0.a(i13), i14);
        return C16807N.f139792a;
    }

    private static final void m0(L0 l02, C13023e eVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(691307542);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(l02) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(eVar) : k10.F(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(691307542, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.ShowSnackbar (BrowseScreenComposables.kt:228)");
            }
            String a10 = eVar.a(k10, C13023e.f110931a | ((i11 >> 3) & 14));
            k10.W(2090165882);
            int i12 = i11 & 14;
            boolean z10 = false;
            boolean V10 = (i12 == 4) | k10.V(a10);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z11 = V10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new d(l02, a10, aVar, (C17164e<? super d>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(l02, (p) D10, k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10501H(l02, eVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n0(L0 l02, C13023e eVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        m0(l02, eVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
