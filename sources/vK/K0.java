package vk;

import IC.C13023e;
import IC.C13026h;
import O0.L0;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pk.s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpk/s$g;", "result", "LO0/L0;", "snackbarHostState", "Lkotlin/Function1;", "Lpk/s$g$c;", "LXH/N;", "onShowExplanation", "Lpk/s$g$d;", "onShowFallback", "Lkotlin/Function0;", "onDismissed", "b", "(Lpk/s$g;LO0/L0;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.NotifyBackInStockContentKt$NotifyBackInStockContent$1$1", f = "NotifyBackInStockContent.kt", l = {39, 43, 47}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f104569c;

        /* renamed from: d  reason: collision with root package name */
        int f104570d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s.g f104571e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<s.g.c, C16807N> f104572f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<s.g.d, C16807N> f104573g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f104574h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ L0 f104575i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104576j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vk.K0$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2489a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f104577a;

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
                    f104577a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vk.K0.a.C2489a.<clinit>():void");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.NotifyBackInStockContentKt$NotifyBackInStockContent$1$1", f = "NotifyBackInStockContent.kt", l = {28}, m = "invokeSuspend$showMessageSnackbar")
        static final class b extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f104578c;

            /* renamed from: d  reason: collision with root package name */
            Object f104579d;

            /* renamed from: e  reason: collision with root package name */
            Object f104580e;

            /* renamed from: f  reason: collision with root package name */
            Object f104581f;

            /* renamed from: g  reason: collision with root package name */
            Object f104582g;

            /* renamed from: h  reason: collision with root package name */
            Object f104583h;

            /* renamed from: i  reason: collision with root package name */
            Object f104584i;

            /* renamed from: j  reason: collision with root package name */
            Object f104585j;

            /* renamed from: k  reason: collision with root package name */
            /* synthetic */ Object f104586k;

            /* renamed from: l  reason: collision with root package name */
            int f104587l;

            b(C17164e<? super b> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f104586k = obj;
                this.f104587l |= Integer.MIN_VALUE;
                return a.j((Context) null, (L0) null, (C17631a<C16807N>) null, (C13023e) null, this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s.g gVar, C17642l<? super s.g.c, C16807N> lVar, C17642l<? super s.g.d, C16807N> lVar2, Context context, L0 l02, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104571e = gVar;
            this.f104572f = lVar;
            this.f104573g = lVar2;
            this.f104574h = context;
            this.f104575i = l02;
            this.f104576j = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.a<XH.N>} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object j(android.content.Context r11, O0.L0 r12, nI.C17631a<XH.C16807N> r13, IC.C13023e r14, dI.C17164e<? super XH.C16807N> r15) {
            /*
                boolean r0 = r15 instanceof vk.K0.a.b
                if (r0 == 0) goto L_0x0014
                r0 = r15
                vk.K0$a$b r0 = (vk.K0.a.b) r0
                int r1 = r0.f104587l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0014
                int r1 = r1 - r2
                r0.f104587l = r1
            L_0x0012:
                r6 = r0
                goto L_0x001a
            L_0x0014:
                vk.K0$a$b r0 = new vk.K0$a$b
                r0.<init>(r15)
                goto L_0x0012
            L_0x001a:
                java.lang.Object r0 = r6.f104586k
                java.lang.Object r9 = eI.C17187b.f()
                int r1 = r6.f104587l
                r10 = 1
                if (r1 == 0) goto L_0x0054
                if (r1 != r10) goto L_0x004c
                java.lang.Object r11 = r6.f104585j
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r11 = r6.f104584i
                O0.J0 r11 = (O0.J0) r11
                java.lang.Object r11 = r6.f104583h
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r11 = r6.f104582g
                dI.e r11 = (dI.C17164e) r11
                java.lang.Object r11 = r6.f104581f
                IC.e r11 = (IC.C13023e) r11
                java.lang.Object r11 = r6.f104580e
                r13 = r11
                nI.a r13 = (nI.C17631a) r13
                java.lang.Object r11 = r6.f104579d
                O0.L0 r11 = (O0.L0) r11
                java.lang.Object r11 = r6.f104578c
                android.content.Context r11 = (android.content.Context) r11
                XH.y.b(r0)
                goto L_0x0080
            L_0x004c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0054:
                XH.y.b(r0)
                java.lang.String r2 = r14.b(r11)
                O0.J0 r5 = O0.J0.Long
                int r0 = Oo.b.f84330B2
                java.lang.String r3 = r11.getString(r0)
                r6.f104578c = r11
                r6.f104579d = r12
                r6.f104580e = r13
                r6.f104581f = r14
                r6.f104582g = r15
                r6.f104583h = r2
                r6.f104584i = r5
                r6.f104585j = r3
                r6.f104587l = r10
                r4 = 0
                r7 = 4
                r8 = 0
                r1 = r12
                java.lang.Object r0 = O0.L0.f(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r0 != r9) goto L_0x0080
                return r9
            L_0x0080:
                O0.N0 r0 = (O0.N0) r0
                int[] r11 = vk.K0.a.C2489a.f104577a
                int r12 = r0.ordinal()
                r11 = r11[r12]
                if (r11 == r10) goto L_0x0099
                r12 = 2
                if (r11 != r12) goto L_0x0093
                r13.invoke()
                goto L_0x009c
            L_0x0093:
                XH.t r11 = new XH.t
                r11.<init>()
                throw r11
            L_0x0099:
                r13.invoke()
            L_0x009c:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: vk.K0.a.j(android.content.Context, O0.L0, nI.a, IC.e, dI.e):java.lang.Object");
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104571e, this.f104572f, this.f104573g, this.f104574h, this.f104575i, this.f104576j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104570d;
            if (i10 == 0) {
                y.b(obj);
                s.g gVar = this.f104571e;
                if (C17542s.e(gVar, s.g.a.f101085a)) {
                    Context context = this.f104574h;
                    L0 l02 = this.f104575i;
                    C17631a<C16807N> aVar = this.f104576j;
                    C13023e a10 = C13026h.a(Oo.b.f84398I0);
                    this.f104569c = gVar;
                    this.f104570d = 1;
                    if (j(context, l02, aVar, a10, this) == f10) {
                        return f10;
                    }
                } else if (gVar instanceof s.g.b) {
                    Context context2 = this.f104574h;
                    L0 l03 = this.f104575i;
                    C17631a<C16807N> aVar2 = this.f104576j;
                    C13023e a11 = ((s.g.b) this.f104571e).a();
                    this.f104569c = gVar;
                    this.f104570d = 2;
                    if (j(context2, l03, aVar2, a11, this) == f10) {
                        return f10;
                    }
                } else if (gVar instanceof s.g.c) {
                    this.f104572f.invoke(this.f104571e);
                } else if (gVar instanceof s.g.d) {
                    this.f104573g.invoke(this.f104571e);
                } else if (gVar instanceof s.g.e) {
                    Context context3 = this.f104574h;
                    L0 l04 = this.f104575i;
                    C17631a<C16807N> aVar3 = this.f104576j;
                    C13023e a12 = ((s.g.e) this.f104571e).a();
                    this.f104569c = gVar;
                    this.f104570d = 3;
                    if (j(context3, l04, aVar3, a12, this) == f10) {
                        return f10;
                    }
                } else if (gVar != null) {
                    throw new t();
                }
            } else if (i10 == 1 || i10 == 2 || i10 == 3) {
                s.g gVar2 = (s.g) this.f104569c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final void b(s.g gVar, L0 l02, C17642l<? super s.g.c, C16807N> lVar, C17642l<? super s.g.d, C16807N> lVar2, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        s.g gVar2 = gVar;
        L0 l03 = l02;
        C17642l<? super s.g.c, C16807N> lVar3 = lVar;
        C17642l<? super s.g.d, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        C17542s.j(l03, "snackbarHostState");
        C17542s.j(lVar3, "onShowExplanation");
        C17542s.j(lVar4, "onShowFallback");
        C17542s.j(aVar2, "onDismissed");
        C4889m k10 = mVar.k(351861308);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(gVar2) : k10.F(gVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.V(l03) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(lVar3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(lVar4) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(aVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(351861308, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.NotifyBackInStockContent (NotifyBackInStockContent.kt:23)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(-36457926);
            boolean z10 = false;
            int i14 = i11 & 14;
            boolean F10 = k10.F(context) | ((i11 & 112) == 32) | ((57344 & i11) == 16384) | (i14 == 4 || ((i11 & 8) != 0 && k10.F(gVar2))) | ((i11 & 896) == 256);
            if ((i11 & 7168) == 2048) {
                z10 = true;
            }
            boolean z11 = F10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                a aVar3 = r0;
                i12 = i14;
                a aVar4 = new a(gVar, lVar, lVar2, context, l02, aVar, (C17164e<? super a>) null);
                k10.u(aVar3);
                D10 = aVar3;
            } else {
                i12 = i14;
            }
            k10.P();
            P.g(gVar2, (p) D10, k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new J0(gVar, l02, lVar, lVar2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.g gVar, L0 l02, C17642l lVar, C17642l lVar2, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(gVar, l02, lVar, lVar2, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
