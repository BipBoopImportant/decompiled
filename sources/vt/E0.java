package vt;

import It.B;
import It.C10749l;
import It.q;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.N0;
import QJ.Q;
import SC.Y2;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import android.view.Window;
import dI.C17164e;
import eI.C17187b;
import f1.C5301c;
import f1.C5309k;
import jC.C14615b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m1.i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import p1.C5749w0;
import r1.C5817c;
import s0.C5834E;
import t0.C5934A;
import t0.k;
import t0.x;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ay\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2&\u0010\u0011\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010#\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0003¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b)\u0010*\u001a/\u00101\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060/H\u0003¢\u0006\u0004\b1\u00102\"\u0014\u00105\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:²\u0006\f\u00106\u001a\u00020\u00188\nX\u0002²\u0006\u000e\u00107\u001a\u00020\u00188\n@\nX\u0002²\u0006\u000e\u0010%\u001a\u00020\u00158\n@\nX\u0002²\u0006\u000e\u00108\u001a\u00020\u00158\n@\nX\u0002²\u0006\u000e\u00109\u001a\u00020\r8\n@\nX\u0002"}, d2 = {"LIt/B$c;", "state", "LT0/d;", "widthSizeClass", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "Lt0/A;", "scrollState", "Lkotlin/Function2;", "", "LdI/e;", "Lp1/J0;", "", "qrCodeGenerator", "B", "(LIt/B$c;ILnI/l;LnI/l;Lt0/A;LnI/p;LU0/m;II)V", "lazyListState", "", "T", "(Lt0/A;LU0/m;I)Z", "", "positionY", "X", "(Lt0/A;FLU0/m;I)Z", "Landroidx/compose/ui/d;", "offset", "Lp1/v0;", "backLayerContentColor", "frontLayerContentColor", "Lc2/h;", "peekHeight", "b0", "(Landroidx/compose/ui/d;FJJF)Landroidx/compose/ui/d;", "isBackLayerHidden", "useDarkIcons", "r", "(ZZLU0/m;I)V", "w", "(LIt/B$c;Lt0/A;LU0/m;I)V", "", "error", "LO0/L0;", "snackbarHostState", "Lkotlin/Function0;", "onTryAgainClicked", "u", "(Ljava/lang/Throwable;LO0/L0;LnI/a;LU0/m;I)V", "a", "F", "PeekHeight", "firstItemTranslationY", "scanAndGoShortcutPositionY", "isFabButtonVisible", "storeId", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class E0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f105394a = c2.h.B((float) 20);

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"vt/E0$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreenKt$HandleStoreError$1$1", f = "StoreSelectedScreen.kt", l = {312}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f105395c;

        /* renamed from: d  reason: collision with root package name */
        int f105396d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Throwable f105397e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L0 f105398f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f105399g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105400h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f105401a;

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
                    f105401a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vt.E0.b.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Throwable th2, L0 l02, Context context, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f105397e = th2;
            this.f105398f = l02;
            this.f105399g = context;
            this.f105400h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f105397e, this.f105398f, this.f105399g, this.f105400h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105396d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f105397e == null) {
                    return C16807N.f139792a;
                }
                L0 l02 = this.f105398f;
                String string = this.f105399g.getString(Oo.b.f84526U8);
                C17542s.i(string, "getString(...)");
                String string2 = this.f105399g.getString(Oo.b.f84506S8);
                J0 j02 = J0.Indefinite;
                this.f105395c = string;
                this.f105396d = 1;
                obj = L0.f(l02, string, string2, false, j02, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str = (String) this.f105395c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = a.f105401a[((N0) obj).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f105400h.invoke();
                } else {
                    throw new t();
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreenKt$ScrollToTopWhenStoreChanges$1$1", f = "StoreSelectedScreen.kt", l = {297}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f105403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5934A a10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f105403d = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f105403d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105402c;
            if (i10 == 0) {
                y.b(obj);
                C5934A a10 = this.f105403d;
                this.f105402c = 1;
                if (C5934A.L(a10, 0, 0, this, 2, (Object) null) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f105404a;

        d(L0 l02) {
            this.f105404a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1705424400, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreen.<anonymous> (StoreSelectedScreen.kt:131)");
                }
                Y2.c(this.f105404a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B.c f105405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105406b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f105407c;

        e(B.c cVar, boolean z10, C17642l<? super q, C16807N> lVar) {
            this.f105405a = cVar;
            this.f105406b = z10;
            this.f105407c = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-470491921, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreen.<anonymous> (StoreSelectedScreen.kt:134)");
                }
                C12213E.b(this.f105405a.i(), this.f105406b && this.f105405a.i().e(), this.f105407c, (androidx.compose.ui.d) null, mVar, 0, 8);
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
    static final class f implements nI.q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B.c f105408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f105410c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f105411d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f105412e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105413f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f105414g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5934A f105415h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f105416i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f105417j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<String, C17164e<? super p1.J0>, Object> f105418k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ A1<Float> f105419l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C4892n0 f105420m;

        f(B.c cVar, boolean z10, boolean z11, long j10, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, long j11, C5934A a10, boolean z12, long j12, p<? super String, ? super C17164e<? super p1.J0>, ? extends Object> pVar, A1<Float> a12, C4892n0 n0Var) {
            this.f105408a = cVar;
            this.f105409b = z10;
            this.f105410c = z11;
            this.f105411d = j10;
            this.f105412e = lVar;
            this.f105413f = lVar2;
            this.f105414g = j11;
            this.f105415h = a10;
            this.f105416i = z12;
            this.f105417j = j12;
            this.f105418k = pVar;
            this.f105419l = a12;
            this.f105420m = n0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(B.c cVar, boolean z10, long j10, long j11, C17642l lVar, C17642l lVar2, p pVar, A1 a12, C4892n0 n0Var, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            x xVar2 = xVar;
            B.c cVar2 = cVar;
            boolean z11 = z10;
            C17642l lVar3 = lVar;
            C17642l lVar4 = lVar2;
            C12247k.F(xVar2, cVar2, z11, E0.b0(androidx.compose.ui.d.f18749a, E0.I(a12), j10, j11, E0.f105394a), lVar3, lVar4, new G0(n0Var));
            C12219K.n(xVar2, cVar2, z11, E0.f105394a, lVar3, lVar4, pVar, new H0(lVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C4892n0 n0Var, C5667g gVar) {
            E0.K(n0Var, C5667g.n(gVar.v()));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar, Mt.a aVar) {
            C17542s.j(aVar, "benefitModel");
            lVar.invoke(new q.C10754b(aVar));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: vt.F0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: vt.F0} */
        /* JADX WARNING: type inference failed for: r11v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0157, code lost:
            if (r11 == U0.C4889m.f14007a.a()) goto L_0x0159;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(s0.C5834E r30, U0.C4889m r31, int r32) {
            /*
                r29 = this;
                r0 = r29
                r1 = r30
                r13 = r31
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r32 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r13.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r32 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r32
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r31.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r31.L()
                goto L_0x0196
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreen.<anonymous> (StoreSelectedScreen.kt:141)"
                r5 = 2136422183(0x7f573727, float:2.8607039E38)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r10, r1)
                It.B$c r15 = r0.f105408a
                boolean r2 = r0.f105409b
                boolean r3 = r0.f105410c
                long r4 = r0.f105411d
                nI.l<It.q, XH.N> r12 = r0.f105412e
                nI.l<It.l, XH.N> r14 = r0.f105413f
                long r8 = r0.f105414g
                t0.A r11 = r0.f105415h
                boolean r7 = r0.f105416i
                r16 = r8
                r32 = r10
                long r9 = r0.f105417j
                nI.p<java.lang.String, dI.e<? super p1.J0>, java.lang.Object> r8 = r0.f105418k
                U0.A1<java.lang.Float> r6 = r0.f105419l
                r18 = r11
                U0.n0 r11 = r0.f105420m
                androidx.compose.foundation.layout.d r19 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r0 = r19.g()
                i1.c$a r19 = i1.C5437c.f24302a
                r20 = r6
                i1.c$b r6 = r19.k()
                r19 = r7
                r7 = 0
                E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r6, r13, r7)
                int r6 = U0.C4883j.a(r13, r7)
                U0.y r7 = r31.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
                G1.g$a r21 = G1.C4504g.f6515W
                r22 = r8
                nI.a r8 = r21.a()
                U0.f r23 = r31.m()
                if (r23 != 0) goto L_0x0096
                U0.C4883j.c()
            L_0x0096:
                r31.I()
                boolean r23 = r31.i()
                if (r23 == 0) goto L_0x00a3
                r13.p(r8)
                goto L_0x00a6
            L_0x00a3:
                r31.t()
            L_0x00a6:
                U0.m r8 = U0.F1.a(r31)
                r23 = r9
                nI.p r9 = r21.c()
                U0.F1.c(r8, r0, r9)
                nI.p r0 = r21.e()
                U0.F1.c(r8, r7, r0)
                nI.p r0 = r21.b()
                boolean r7 = r8.i()
                if (r7 != 0) goto L_0x00d2
                java.lang.Object r7 = r8.D()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
                if (r7 != 0) goto L_0x00e0
            L_0x00d2:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8.u(r7)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8.w(r6, r0)
            L_0x00e0:
                nI.p r0 = r21.d()
                U0.F1.c(r8, r1, r0)
                s0.h r0 = s0.C5862h.f28810a
                It.m r1 = r15.c()
                r9 = 0
                r0 = r20
                r6 = r12
                r10 = r19
                r7 = r14
                r19 = r16
                r26 = r22
                r8 = r31
                r27 = r23
                vt.M0.c(r1, r2, r3, r4, r6, r7, r8, r9)
                r1 = 2
                r2 = 0
                r9 = 0
                r6 = r32
                r7 = r19
                r3 = r10
                r10 = r1
                r1 = r11
                r4 = r18
                r11 = r2
                androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r6, r7, r9, r10, r11)
                r5 = 1
                r6 = 0
                r7 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r2, r7, r5, r6)
                java.lang.String r5 = "store_selected_root_lazy_list"
                androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r5)
                r5 = 1997121686(0x7709a896, float:2.792047E33)
                r13.W(r5)
                boolean r5 = r13.F(r15)
                boolean r6 = r13.b(r3)
                r5 = r5 | r6
                r6 = r27
                boolean r8 = r13.e(r6)
                r5 = r5 | r8
                r8 = r19
                boolean r10 = r13.e(r8)
                r5 = r5 | r10
                boolean r10 = r13.V(r12)
                r5 = r5 | r10
                boolean r10 = r13.V(r14)
                r5 = r5 | r10
                r10 = r26
                boolean r11 = r13.F(r10)
                r5 = r5 | r11
                java.lang.Object r11 = r31.D()
                if (r5 != 0) goto L_0x0159
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r11 != r5) goto L_0x0173
            L_0x0159:
                vt.F0 r11 = new vt.F0
                r5 = r14
                r14 = r11
                r16 = r3
                r17 = r6
                r19 = r8
                r21 = r12
                r22 = r5
                r23 = r10
                r24 = r0
                r25 = r1
                r14.<init>(r15, r16, r17, r19, r21, r22, r23, r24, r25)
                r13.u(r11)
            L_0x0173:
                r9 = r11
                nI.l r9 = (nI.C17642l) r9
                r31.P()
                r11 = 0
                r12 = 252(0xfc, float:3.53E-43)
                r3 = 0
                r0 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r2
                r2 = r4
                r4 = r0
                r10 = r31
                t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r31.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0196
                U0.C4895p.R()
            L_0x0196:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.E0.f.e(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreenKt$rememberIsBackLayerHidden$1$1", f = "StoreSelectedScreen.kt", l = {200}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105421c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f105422d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f105423e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5934A f105424a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f105425b;

            a(C5934A a10, C4899r0<Boolean> r0Var) {
                this.f105424a = a10;
                this.f105425b = r0Var;
            }

            public final Object c(int i10, C17164e<? super C16807N> eVar) {
                boolean isEmpty = this.f105424a.x().i().isEmpty();
                C4899r0<Boolean> r0Var = this.f105425b;
                E0.W(r0Var, isEmpty ? E0.V(r0Var) : i10 != 0);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5934A a10, C4899r0<Boolean> r0Var, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f105422d = a10;
            this.f105423e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final int j(C5934A a10) {
            return a10.s();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f105422d, this.f105423e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105421c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new I0(this.f105422d));
                a aVar = new a(this.f105422d, this.f105423e);
                this.f105421c = 1;
                if (r10.collect(aVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreenKt$rememberIsFabButtonVisible$1$1", f = "StoreSelectedScreen.kt", l = {218}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105426c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f105427d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f105428e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f105429f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5934A f105430a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f105431b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f105432c;

            a(C5934A a10, float f10, C4899r0<Boolean> r0Var) {
                this.f105430a = a10;
                this.f105431b = f10;
                this.f105432c = r0Var;
            }

            public final Object c(int i10, C17164e<? super C16807N> eVar) {
                List<k> i11 = this.f105430a.x().i();
                C4899r0<Boolean> r0Var = this.f105432c;
                boolean z10 = true;
                if (this.f105430a.s() == 0 && (i11.size() <= 1 || ((float) i11.get(1).c()) >= this.f105431b)) {
                    z10 = false;
                }
                E0.a0(r0Var, z10);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C5934A a10, float f10, C4899r0<Boolean> r0Var, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f105427d = a10;
            this.f105428e = f10;
            this.f105429f = r0Var;
        }

        /* access modifiers changed from: private */
        public static final int j(C5934A a10) {
            return a10.t();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f105427d, this.f105428e, this.f105429f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105426c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new J0(this.f105427d));
                a aVar = new a(this.f105427d, this.f105428e, this.f105429f);
                this.f105426c = 1;
                if (r10.collect(aVar, this) == f10) {
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

    /* access modifiers changed from: private */
    public static final C16807N A(B.c cVar, C5934A a10, int i10, C4889m mVar, int i11) {
        w(cVar, a10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e7, code lost:
        if ((r44 & 16) != 0) goto L_0x00e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B(It.B.c r36, int r37, nI.C17642l<? super It.q, XH.C16807N> r38, nI.C17642l<? super It.C10749l, XH.C16807N> r39, t0.C5934A r40, nI.p<? super java.lang.String, ? super dI.C17164e<? super p1.J0>, ? extends java.lang.Object> r41, U0.C4889m r42, int r43, int r44) {
        /*
            r15 = r36
            r14 = r37
            r12 = r38
            r13 = r39
            r11 = r41
            r10 = r43
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "analyticsAction"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "qrCodeGenerator"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1458094486(0x56e8c196, float:1.27959071E14)
            r1 = r42
            U0.m r8 = r1.k(r0)
            r1 = r44 & 1
            if (r1 == 0) goto L_0x0030
            r1 = r10 | 6
            goto L_0x0040
        L_0x0030:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x003f
            boolean r1 = r8.F(r15)
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r10
            goto L_0x0040
        L_0x003f:
            r1 = r10
        L_0x0040:
            r2 = r44 & 2
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0057
        L_0x0047:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0057
            boolean r2 = r8.d(r14)
            if (r2 == 0) goto L_0x0054
            r2 = 32
            goto L_0x0056
        L_0x0054:
            r2 = 16
        L_0x0056:
            r1 = r1 | r2
        L_0x0057:
            r2 = r44 & 4
            if (r2 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x006e
            boolean r2 = r8.F(r12)
            if (r2 == 0) goto L_0x006b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r2 = r44 & 8
            if (r2 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0085
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x0082
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r2
        L_0x0085:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x009e
            r2 = r44 & 16
            if (r2 != 0) goto L_0x0098
            r2 = r40
            boolean r3 = r8.V(r2)
            if (r3 == 0) goto L_0x009a
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x0098:
            r2 = r40
        L_0x009a:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r3
            goto L_0x00a0
        L_0x009e:
            r2 = r40
        L_0x00a0:
            r3 = r44 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00a8
            r1 = r1 | r4
            goto L_0x00b8
        L_0x00a8:
            r3 = r10 & r4
            if (r3 != 0) goto L_0x00b8
            boolean r3 = r8.F(r11)
            if (r3 == 0) goto L_0x00b5
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r3
        L_0x00b8:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r1
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r4) goto L_0x00d0
            boolean r3 = r8.l()
            if (r3 != 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            r8.L()
            r5 = r2
            r16 = r8
            goto L_0x034d
        L_0x00d0:
            r8.G()
            r3 = r10 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = 0
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r8.O()
            if (r3 == 0) goto L_0x00e2
            goto L_0x00ed
        L_0x00e2:
            r8.L()
            r3 = r44 & 16
            if (r3 == 0) goto L_0x00ea
        L_0x00e9:
            r1 = r1 & r4
        L_0x00ea:
            r5 = r1
            r6 = r2
            goto L_0x00f7
        L_0x00ed:
            r3 = r44 & 16
            if (r3 == 0) goto L_0x00ea
            r2 = 3
            t0.A r2 = t0.C5935B.c(r9, r9, r8, r9, r2)
            goto L_0x00e9
        L_0x00f7:
            r8.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0106
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.instore.impl.composables.storeselected.StoreSelectedScreen (StoreSelectedScreen.kt:71)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x0106:
            T0.d$a r0 = T0.d.f13504b
            int r0 = r0.d()
            boolean r0 = T0.d.F(r14, r0)
            r4 = 1
            r16 = r0 ^ 1
            r0 = 1721380671(0x669a2f3f, float:3.64058E23)
            r8.W(r0)
            java.lang.Object r0 = r8.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r1 = r17.a()
            if (r0 != r1) goto L_0x012d
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r8.u(r0)
        L_0x012d:
            O0.L0 r0 = (O0.L0) r0
            r8.P()
            r1 = 1721382845(0x669a37bd, float:3.641363E23)
            r8.W(r1)
            java.lang.Object r1 = r8.D()
            java.lang.Object r2 = r17.a()
            if (r1 != r2) goto L_0x014e
            vt.n0 r1 = new vt.n0
            r1.<init>(r6)
            U0.A1 r1 = U0.p1.e(r1)
            r8.u(r1)
        L_0x014e:
            r18 = r1
            U0.A1 r18 = (U0.A1) r18
            r8.P()
            int r1 = r5 >> 12
            r1 = r1 & 14
            boolean r3 = T(r6, r8, r1)
            r2 = 1721389228(0x669a50ac, float:3.643663E23)
            r8.W(r2)
            if (r3 == 0) goto L_0x016d
            boolean r2 = TC.e.h(r8, r9)
            if (r2 == 0) goto L_0x016d
            r2 = r4
            goto L_0x016e
        L_0x016d:
            r2 = r9
        L_0x016e:
            r8.P()
            tK.v r7 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r20 = r7.a(r8, r9)
            long r20 = r20.k0()
            tK.h r7 = r7.a(r8, r9)
            long r22 = r7.B0()
            if (r3 != r4) goto L_0x018a
            r24 = r20
            goto L_0x018e
        L_0x018a:
            if (r3 != 0) goto L_0x036b
            r24 = r22
        L_0x018e:
            r7 = 1721399939(0x669a7a83, float:3.647522E23)
            r8.W(r7)
            java.lang.Object r7 = r8.D()
            java.lang.Object r9 = r17.a()
            if (r7 != r9) goto L_0x01a6
            r7 = 0
            U0.n0 r7 = U0.D0.a(r7)
            r8.u(r7)
        L_0x01a6:
            r26 = r7
            U0.n0 r26 = (U0.C4892n0) r26
            r8.P()
            float r7 = J(r26)
            boolean r9 = X(r6, r7, r8, r1)
            r1 = r5 & 14
            int r7 = r5 >> 9
            r7 = r7 & 112(0x70, float:1.57E-43)
            r1 = r1 | r7
            w(r15, r6, r8, r1)
            r1 = 0
            r(r3, r2, r8, r1)
            java.lang.Throwable r1 = r36.e()
            r7 = 1721416941(0x669abced, float:3.6536475E23)
            r8.W(r7)
            r7 = r5 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            r27 = r2
            if (r7 != r4) goto L_0x01d7
            r4 = 1
            goto L_0x01d8
        L_0x01d7:
            r4 = 0
        L_0x01d8:
            java.lang.Object r2 = r8.D()
            if (r4 != 0) goto L_0x01e4
            java.lang.Object r4 = r17.a()
            if (r2 != r4) goto L_0x01ec
        L_0x01e4:
            vt.v0 r2 = new vt.v0
            r2.<init>(r12)
            r8.u(r2)
        L_0x01ec:
            nI.a r2 = (nI.C17631a) r2
            r8.P()
            r4 = 48
            u(r1, r0, r2, r8, r4)
            It.v r1 = r36.h()
            r2 = 1721424403(0x669ada13, float:3.656336E23)
            r8.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r7 != r2) goto L_0x0206
            r2 = 1
            goto L_0x0207
        L_0x0206:
            r2 = 0
        L_0x0207:
            java.lang.Object r4 = r8.D()
            if (r2 != 0) goto L_0x0213
            java.lang.Object r2 = r17.a()
            if (r4 != r2) goto L_0x021b
        L_0x0213:
            vt.w0 r4 = new vt.w0
            r4.<init>(r12)
            r8.u(r4)
        L_0x021b:
            nI.a r4 = (nI.C17631a) r4
            r8.P()
            r2 = 1721427024(0x669ae450, float:3.6572803E23)
            r8.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            r28 = r3
            if (r7 != r2) goto L_0x022e
            r2 = 1
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            java.lang.Object r3 = r8.D()
            if (r2 != 0) goto L_0x023b
            java.lang.Object r2 = r17.a()
            if (r3 != r2) goto L_0x0243
        L_0x023b:
            vt.x0 r3 = new vt.x0
            r3.<init>(r12)
            r8.u(r3)
        L_0x0243:
            r29 = r3
            nI.l r29 = (nI.C17642l) r29
            r8.P()
            r30 = 48
            r2 = r0
            r3 = r4
            r4 = r29
            r29 = r5
            r5 = r8
            r32 = r6
            r6 = r30
            vt.V.b(r1, r2, r3, r4, r5, r6)
            Mt.a r1 = r36.j()
            r2 = 1721434760(0x669b0288, float:3.6600675E23)
            r8.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r7 != r2) goto L_0x026a
            r4 = 1
            goto L_0x026b
        L_0x026a:
            r4 = 0
        L_0x026b:
            java.lang.Object r2 = r8.D()
            if (r4 != 0) goto L_0x0277
            java.lang.Object r3 = r17.a()
            if (r2 != r3) goto L_0x027f
        L_0x0277:
            vt.y0 r2 = new vt.y0
            r2.<init>(r12)
            r8.u(r2)
        L_0x027f:
            nI.a r2 = (nI.C17631a) r2
            r8.P()
            r3 = 1721431747(0x669af6c3, float:3.658982E23)
            r8.W(r3)
            r3 = 256(0x100, float:3.59E-43)
            if (r7 != r3) goto L_0x0290
            r4 = 1
            goto L_0x0291
        L_0x0290:
            r4 = 0
        L_0x0291:
            java.lang.Object r3 = r8.D()
            if (r4 != 0) goto L_0x029d
            java.lang.Object r4 = r17.a()
            if (r3 != r4) goto L_0x02a5
        L_0x029d:
            vt.z0 r3 = new vt.z0
            r3.<init>(r12)
            r8.u(r3)
        L_0x02a5:
            nI.a r3 = (nI.C17631a) r3
            r8.P()
            r6 = r29 & 112(0x70, float:1.57E-43)
            r7 = 16
            r4 = 0
            r5 = r0
            r0 = r1
            r1 = r37
            r33 = r5
            r5 = r8
            ut.z0.c(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            float r0 = (float) r0
            float r1 = c2.h.B(r0)
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            s0.T r17 = s0.C5850V.c(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r1 = "store_selected_root"
            androidx.compose.ui.d r19 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            O0.O$a r0 = O0.O.f9935a
            int r29 = r0.a()
            vt.E0$d r0 = new vt.E0$d
            r1 = r33
            r0.<init>(r1)
            r1 = 1705424400(0x65a6b610, float:9.840891E22)
            r7 = 54
            r6 = 1
            c1.a r30 = c1.c.e(r1, r6, r0, r8, r7)
            vt.E0$e r0 = new vt.E0$e
            r0.<init>(r15, r9, r12)
            r1 = -470491921(0xffffffffe3f4dcef, float:-9.033851E21)
            c1.a r31 = c1.c.e(r1, r6, r0, r8, r7)
            vt.E0$f r9 = new vt.E0$f
            r0 = r9
            r1 = r36
            r2 = r28
            r3 = r27
            r4 = r24
            r6 = r38
            r7 = r39
            r34 = r8
            r35 = r9
            r8 = r20
            r10 = r32
            r11 = r16
            r12 = r22
            r14 = r41
            r15 = r18
            r16 = r26
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r10, r11, r12, r14, r15, r16)
            r0 = 2136422183(0x7f573727, float:2.8607039E38)
            r15 = r34
            r3 = r35
            r1 = 1
            r2 = 54
            c1.a r12 = c1.c.e(r0, r1, r3, r15, r2)
            r14 = 805334022(0x30006c06, float:4.671964E-10)
            r0 = 198(0xc6, float:2.77E-43)
            r2 = 0
            r3 = 0
            r7 = 0
            r9 = 0
            r1 = r19
            r4 = r30
            r5 = r31
            r6 = r29
            r11 = r17
            r13 = r15
            r16 = r15
            r15 = r0
            O0.C4762x0.a(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x034b
            U0.C4895p.R()
        L_0x034b:
            r5 = r32
        L_0x034d:
            U0.Y0 r9 = r16.n()
            if (r9 == 0) goto L_0x036a
            vt.A0 r10 = new vt.A0
            r0 = r10
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r6 = r41
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x036a:
            return
        L_0x036b:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.E0.B(It.B$c, int, nI.l, nI.l, t0.A, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar) {
        lVar.invoke(q.u.f82403a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(new q.y(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17642l lVar) {
        lVar.invoke(q.C10756d.f82380a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17642l lVar) {
        lVar.invoke(q.C10755c.f82379a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(B.c cVar, int i10, C17642l lVar, C17642l lVar2, C5934A a10, p pVar, int i11, int i12, C4889m mVar, int i13) {
        B(cVar, i10, lVar, lVar2, a10, pVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float H(C5934A a10) {
        return (float) a10.t();
    }

    /* access modifiers changed from: private */
    public static final float I(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final float J(C4892n0 n0Var) {
        return n0Var.a();
    }

    /* access modifiers changed from: private */
    public static final void K(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17642l lVar) {
        lVar.invoke(q.C.f82370a);
        return C16807N.f139792a;
    }

    private static final boolean T(C5934A a10, C4889m mVar, int i10) {
        mVar.W(289146187);
        if (C4895p.J()) {
            C4895p.S(289146187, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.rememberIsBackLayerHidden (StoreSelectedScreen.kt:194)");
        }
        boolean z10 = false;
        Object[] objArr = new Object[0];
        mVar.W(1880562445);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new q0();
            mVar.u(D10);
        }
        mVar.P();
        C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, mVar, 3072, 6);
        C16807N n10 = C16807N.f139792a;
        mVar.W(1880564430);
        if ((((i10 & 14) ^ 6) > 4 && mVar.V(a10)) || (i10 & 6) == 4) {
            z10 = true;
        }
        boolean V10 = mVar.V(r0Var) | z10;
        Object D11 = mVar.D();
        if (V10 || D11 == aVar.a()) {
            D11 = new g(a10, r0Var, (C17164e<? super g>) null);
            mVar.u(D11);
        }
        mVar.P();
        P.g(n10, (p) D11, mVar, 6);
        boolean V11 = V(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return V11;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 U() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean V(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void W(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean X(C5934A a10, float f10, C4889m mVar, int i10) {
        mVar.W(-1559243030);
        if (C4895p.J()) {
            C4895p.S(-1559243030, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.rememberIsFabButtonVisible (StoreSelectedScreen.kt:212)");
        }
        boolean z10 = false;
        Object[] objArr = new Object[0];
        mVar.W(1444219410);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new B0();
            mVar.u(D10);
        }
        mVar.P();
        C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, mVar, 3072, 6);
        Float valueOf = Float.valueOf(f10);
        mVar.W(1444221621);
        boolean V10 = ((((i10 & 14) ^ 6) > 4 && mVar.V(a10)) || (i10 & 6) == 4) | mVar.V(r0Var);
        if ((((i10 & 112) ^ 48) > 32 && mVar.c(f10)) || (i10 & 48) == 32) {
            z10 = true;
        }
        boolean z11 = z10 | V10;
        Object D11 = mVar.D();
        if (z11 || D11 == aVar.a()) {
            D11 = new h(a10, f10, r0Var, (C17164e<? super h>) null);
            mVar.u(D11);
        }
        mVar.P();
        P.g(valueOf, (p) D11, mVar, (i10 >> 3) & 14);
        boolean Z10 = Z(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return Z10;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 Y() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean Z(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void a0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.ui.d b0(androidx.compose.ui.d dVar, float f10, long j10, long j11, float f11) {
        return androidx.compose.ui.draw.b.c(androidx.compose.ui.graphics.b.a(dVar, new s0(f10)), new t0(f11, f10, j10, j11));
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(float f10, androidx.compose.ui.graphics.c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.e(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final i d0(float f10, float f11, long j10, long j11, m1.d dVar) {
        m1.d dVar2 = dVar;
        C17542s.j(dVar2, "$this$drawWithCache");
        float f12 = (float) 2;
        float H12 = dVar2.H1(c2.h.B(f10 - c2.h.B(f12)));
        return dVar2.p(new u0(j10, C5668h.a(0.0f, -H12), C5673m.f(dVar.b(), 0.0f, C5673m.i(dVar.b()) + (H12 * f12), 1, (Object) null), j11, C5668h.a(0.0f, (C5673m.i(dVar.b()) + H12) - f11), C5673m.f(dVar.b(), 0.0f, C5673m.i(dVar.b()), 1, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(long j10, long j11, long j12, long j13, long j14, long j15, C5817c cVar) {
        C17542s.j(cVar, "$this$onDrawWithContent");
        C5817c cVar2 = cVar;
        r1.f.q1(cVar2, j10, j11, j12, 0.0f, (r1.g) null, (C5749w0) null, 0, 120, (Object) null);
        cVar.V1();
        r1.f.q1(cVar2, j13, j14, j15, 0.0f, (r1.g) null, (C5749w0) null, 0, 120, (Object) null);
        return C16807N.f139792a;
    }

    private static final void r(boolean z10, boolean z11, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-289526127);
        if ((i10 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-289526127, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.AdjustStatusBarIconColor (StoreSelectedScreen.kt:277)");
            }
            boolean z12 = false;
            jC.i c10 = jC.k.c((Window) null, k10, 0, 1);
            Boolean valueOf = Boolean.valueOf(z10);
            k10.W(933505645);
            boolean F10 = k10.F(c10);
            if ((i11 & 112) == 32) {
                z12 = true;
            }
            boolean z13 = z12 | F10;
            Object D10 = k10.D();
            if (z13 || D10 == C4889m.f14007a.a()) {
                D10 = new C0(c10, z11);
                k10.u(D10);
            }
            k10.P();
            P.c(valueOf, (C17642l) D10, k10, i11 & 14);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new D0(z10, z11, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final L s(jC.i iVar, boolean z10, M m10) {
        C14615b bVar;
        C17542s.j(m10, "$this$DisposableEffect");
        lC.l a10 = iVar.a();
        if (z10) {
            bVar = C14615b.e.f127859b;
        } else if (!z10) {
            bVar = C14615b.C3152b.f127857b;
        } else {
            throw new t();
        }
        a10.a(bVar);
        return new a();
    }

    /* access modifiers changed from: private */
    public static final C16807N t(boolean z10, boolean z11, int i10, C4889m mVar, int i11) {
        r(z10, z11, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: vt.E0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: vt.E0$b} */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r2 == U0.C4889m.f14007a.a()) goto L_0x008e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void u(java.lang.Throwable r11, O0.L0 r12, nI.C17631a<XH.C16807N> r13, U0.C4889m r14, int r15) {
        /*
            r0 = 1382569946(0x526857da, float:2.49476579E11)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0016
            boolean r1 = r14.F(r11)
            if (r1 == 0) goto L_0x0013
            r1 = 4
            goto L_0x0014
        L_0x0013:
            r1 = 2
        L_0x0014:
            r1 = r1 | r15
            goto L_0x0017
        L_0x0016:
            r1 = r15
        L_0x0017:
            r2 = r15 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0028
            boolean r2 = r14.V(r12)
            if (r2 == 0) goto L_0x0025
            r2 = r3
            goto L_0x0027
        L_0x0025:
            r2 = 16
        L_0x0027:
            r1 = r1 | r2
        L_0x0028:
            r2 = r15 & 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0039
            boolean r2 = r14.F(r13)
            if (r2 == 0) goto L_0x0036
            r2 = r4
            goto L_0x0038
        L_0x0036:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r1 = r1 | r2
        L_0x0039:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 != r5) goto L_0x004a
            boolean r2 = r14.l()
            if (r2 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            r14.L()
            goto L_0x00ae
        L_0x004a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0056
            r2 = -1
            java.lang.String r5 = "com.ingka.ikea.instore.impl.composables.storeselected.HandleStoreError (StoreSelectedScreen.kt:307)"
            U0.C4895p.S(r0, r1, r2, r5)
        L_0x0056:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r14.Q(r0)
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            r0 = 2008606197(0x77b8e5f5, float:7.500365E33)
            r14.W(r0)
            boolean r0 = r14.F(r11)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r5 = 0
            r6 = 1
            if (r2 != r3) goto L_0x0073
            r2 = r6
            goto L_0x0074
        L_0x0073:
            r2 = r5
        L_0x0074:
            r0 = r0 | r2
            boolean r2 = r14.F(r8)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != r4) goto L_0x007f
            r5 = r6
        L_0x007f:
            r0 = r0 | r5
            java.lang.Object r2 = r14.D()
            if (r0 != 0) goto L_0x008e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x009b
        L_0x008e:
            vt.E0$b r2 = new vt.E0$b
            r10 = 0
            r5 = r2
            r6 = r11
            r7 = r12
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r14.u(r2)
        L_0x009b:
            nI.p r2 = (nI.p) r2
            r14.P()
            r0 = r1 & 14
            U0.P.g(r11, r2, r14, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ae
            U0.C4895p.R()
        L_0x00ae:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x00bc
            vt.r0 r0 = new vt.r0
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.E0.u(java.lang.Throwable, O0.L0, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(Throwable th2, L0 l02, C17631a aVar, int i10, C4889m mVar, int i11) {
        u(th2, l02, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void w(B.c cVar, C5934A a10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1640424657);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(a10) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1640424657, i12, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ScrollToTopWhenStoreChanges (StoreSelectedScreen.kt:292)");
            }
            boolean z10 = false;
            Object[] objArr = new Object[0];
            k10.W(1250489302);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new o0();
                k10.u(D10);
            }
            k10.P();
            C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, k10, 3072, 6);
            if (!C17542s.e(y(r0Var), cVar.k())) {
                C16807N n10 = C16807N.f139792a;
                k10.W(1250492371);
                if ((i12 & 112) == 32) {
                    z10 = true;
                }
                Object D11 = k10.D();
                if (z10 || D11 == aVar.a()) {
                    D11 = new c(a10, (C17164e<? super c>) null);
                    k10.u(D11);
                }
                k10.P();
                P.g(n10, (p) D11, k10, 6);
                z(r0Var, cVar.k());
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new p0(cVar, a10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C4899r0 x() {
        return u1.e("", (o1) null, 2, (Object) null);
    }

    private static final String y(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    private static final void z(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }
}
