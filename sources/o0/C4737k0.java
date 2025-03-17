package O0;

import A1.U;
import E1.H;
import E1.I;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.v;
import L1.x;
import Q0.C4796e;
import Q0.t;
import Q0.u;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4883j;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import com.adjust.sdk.Constants;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.y0;
import n0.C5603i;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import o1.C5667g;
import p0.G;
import p1.C5749w0;
import p1.i1;
import pI.C17752b;
import s0.C5848T;
import s0.C5851W;
import s0.C5861g;
import s0.C5862h;
import tI.C17978n;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aV\u0010\u0012\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001ab\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aj\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a'\u0010%\u001a\u00020#2\u0006\u0010!\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001a>\u0010+\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u0010*\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020#8\u0002XD¢\u0006\u0006\n\u0004\b!\u0010-\"\u0014\u0010/\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-\"\u0014\u00100\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020#018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067²\u0006\u000e\u00105\u001a\u00020\u00038\n@\nX\u0002²\u0006\u000e\u00106\u001a\u00020#8\n@\nX\u0002²\u0006\u000e\u00105\u001a\u00020\u00038\n@\nX\u0002"}, d2 = {"LO0/L;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "LO0/K;", "t", "(LO0/L;LnI/l;LU0/m;II)LO0/K;", "Lkotlin/Function0;", "LXH/N;", "drawerContent", "Landroidx/compose/ui/d;", "modifier", "drawerState", "gesturesEnabled", "Lp1/v0;", "scrimColor", "content", "c", "(LnI/p;Landroidx/compose/ui/d;LO0/K;ZJLnI/p;LU0/m;II)V", "Lp1/i1;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Lc2/h;", "drawerTonalElevation", "Ls0/T;", "windowInsets", "Ls0/g;", "b", "(Landroidx/compose/ui/d;Lp1/i1;JJFLs0/T;LnI/q;LU0/m;II)V", "LO0/J;", "drawerPredictiveBackState", "a", "(LO0/J;Ls0/T;Landroidx/compose/ui/d;Lp1/i1;JJFLnI/q;LU0/m;II)V", "", "pos", "s", "(FFF)F", "open", "onClose", "fraction", "color", "h", "(ZLnI/a;LnI/a;JLU0/m;I)V", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "MinimumDrawerWidth", "Lm0/y0;", "d", "Lm0/y0;", "AnimationSpec", "anchorsInitialized", "minValue", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.k0  reason: case insensitive filesystem */
public final class C4737k0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f11060a = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f11061b = c2.h.B((float) Constants.MINIMAL_ERROR_STATUS_CODE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f11062c = c2.h.B((float) 240);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y0<Float> f11063d = new y0(256, 0, (C5525D) null, 6, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$a */
    static final class a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11064c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5848T f11065d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f11066e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J j10, boolean z10, C5848T t10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f11064c = z10;
            this.f11065d = t10;
            this.f11066e = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(669057502, i10, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d d10 = C5851W.d(J.x(aVar, C4737k0.f11062c, 0.0f, I.f9768a.a(), 0.0f, 10, (Object) null).s(aVar), this.f11065d);
                q<C5861g, C4889m, Integer, C16807N> qVar = this.f11066e;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, d10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                qVar.invoke(C5862h.f28810a, mVar, 6);
                mVar.x();
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.k0$b */
    static final class b extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5848T f11067c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11068d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i1 f11069e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11070f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f11071g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f11072h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f11073i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11074j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f11075k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(J j10, C5848T t10, androidx.compose.ui.d dVar, i1 i1Var, long j11, long j12, float f10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f11067c = t10;
            this.f11068d = dVar;
            this.f11069e = i1Var;
            this.f11070f = j11;
            this.f11071g = j12;
            this.f11072h = f10;
            this.f11073i = qVar;
            this.f11074j = i10;
            this.f11075k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4737k0.a((J) null, this.f11067c, this.f11068d, this.f11069e, this.f11070f, this.f11071g, this.f11072h, this.f11073i, mVar, M0.a(this.f11074j | 1), this.f11075k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.k0$c */
    static final class c extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11076c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i1 f11077d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f11078e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11079f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f11080g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5848T f11081h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f11082i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11083j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f11084k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, i1 i1Var, long j10, long j11, float f10, C5848T t10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f11076c = dVar;
            this.f11077d = i1Var;
            this.f11078e = j10;
            this.f11079f = j11;
            this.f11080g = f10;
            this.f11081h = t10;
            this.f11082i = qVar;
            this.f11083j = i10;
            this.f11084k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4737k0.b(this.f11076c, this.f11077d, this.f11078e, this.f11079f, this.f11080g, this.f11081h, this.f11082i, mVar, M0.a(this.f11083j | 1), this.f11084k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$d */
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f11085c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c2.d f11086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(K k10, c2.d dVar) {
            super(0);
            this.f11085c = k10;
            this.f11086d = dVar;
        }

        public final void invoke() {
            this.f11085c.m(this.f11086d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$e */
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f11088d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f11089e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", l = {350}, m = "invokeSuspend")
        /* renamed from: O0.k0$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f11090c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f11091d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f11091d = k10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f11091d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f11090c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = this.f11091d;
                    this.f11090c = 1;
                    if (k10.d(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z10, K k10, Q q10) {
            super(0);
            this.f11087c = z10;
            this.f11088d = k10;
            this.f11089e = q10;
        }

        public final void invoke() {
            if (this.f11087c && this.f11088d.e().r().invoke(L.Closed).booleanValue()) {
                F0 unused = C16314k.d(this.f11089e, (C17168i) null, (T) null, new a(this.f11088d, (C17164e<? super a>) null), 3, (Object) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$f */
    static final class f extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f11092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f11093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4892n0 f11094e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(float f10, K k10, C4892n0 n0Var) {
            super(0);
            this.f11092c = f10;
            this.f11093d = k10;
            this.f11094e = n0Var;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(C4737k0.s(C4737k0.f(this.f11094e), this.f11092c, this.f11093d.l()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/d;", "Lc2/n;", "a", "(Lc2/d;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$g */
    static final class g extends C17544u implements C17642l<c2.d, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f11095c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(K k10) {
            super(1);
            this.f11095c = k10;
        }

        public final long a(c2.d dVar) {
            float f10 = this.f11095c.f();
            return c2.o.a(!Float.isNaN(f10) ? C17752b.e(f10) : this.f11095c.i() ? 0 : -dVar.K0(I.f9768a.a()), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a((c2.d) obj));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$h */
    static final class h extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11096c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f11097d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f11098e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.k0$h$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f11099c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Q f11100d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", l = {380}, m = "invokeSuspend")
            /* renamed from: O0.k0$h$a$a  reason: collision with other inner class name */
            static final class C0167a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f11101c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ K f11102d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0167a(K k10, C17164e<? super C0167a> eVar) {
                    super(2, eVar);
                    this.f11102d = k10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0167a(this.f11102d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0167a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f11101c;
                    if (i10 == 0) {
                        y.b(obj);
                        K k10 = this.f11102d;
                        this.f11101c = 1;
                        if (k10.d(this) == f10) {
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

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, Q q10) {
                super(0);
                this.f11099c = k10;
                this.f11100d = q10;
            }

            public final Boolean invoke() {
                if (this.f11099c.e().r().invoke(L.Closed).booleanValue()) {
                    F0 unused = C16314k.d(this.f11100d, (C17168i) null, (T) null, new C0167a(this.f11099c, (C17164e<? super C0167a>) null), 3, (Object) null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, K k10, Q q10) {
            super(1);
            this.f11096c = str;
            this.f11097d = k10;
            this.f11098e = q10;
        }

        public final void a(x xVar) {
            v.j0(xVar, this.f11096c);
            if (this.f11097d.i()) {
                v.n(xVar, (String) null, new a(this.f11097d, this.f11098e), 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$i */
    static final class i implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f11103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f11104b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4892n0 f11105c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f11106d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.k0$i$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f11107c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f11108d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f11109e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f11110f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4892n0 f11111g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ float f11112h;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ0/h;", "LO0/L;", "LXH/N;", "a", "(LQ0/h;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O0.k0$i$a$a  reason: collision with other inner class name */
            static final class C0168a extends C17544u implements C17642l<Q0.h<L>, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ float f11113c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C4892n0 f11114d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0168a(float f10, C4892n0 n0Var) {
                    super(1);
                    this.f11113c = f10;
                    this.f11114d = n0Var;
                }

                public final void a(Q0.h<L> hVar) {
                    hVar.a(L.Closed, C4737k0.f(this.f11114d));
                    hVar.a(L.Open, this.f11113c);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Q0.h) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, int i10, List<? extends a0> list, C4899r0<Boolean> r0Var, C4892n0 n0Var, float f10) {
                super(1);
                this.f11107c = k10;
                this.f11108d = i10;
                this.f11109e = list;
                this.f11110f = r0Var;
                this.f11111g = n0Var;
                this.f11112h = f10;
            }

            public final void a(a0.a aVar) {
                float f10 = this.f11107c.e().o().f(L.Closed);
                float f11 = -((float) this.f11108d);
                if (!C4737k0.d(this.f11110f) || f10 != f11) {
                    if (!C4737k0.d(this.f11110f)) {
                        C4737k0.e(this.f11110f, true);
                    }
                    C4737k0.g(this.f11111g, f11);
                    C4796e.J(this.f11107c.e(), androidx.compose.material3.internal.b.a(new C0168a(this.f11112h, this.f11111g)), (Object) null, 2, (Object) null);
                }
                List<a0> list = this.f11109e;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a0.a.m(aVar, list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        i(K k10, C4899r0<Boolean> r0Var, C4892n0 n0Var, float f10) {
            this.f11103a = k10;
            this.f11104b = r0Var;
            this.f11105c = n0Var;
            this.f11106d = f10;
        }

        public final E1.J i(K k10, List<? extends H> list, long j10) {
            Integer num;
            long d10 = C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((H) list.get(i11)).i0(d10));
            }
            Integer num2 = null;
            int i12 = 1;
            if (arrayList.isEmpty()) {
                num = null;
            } else {
                num = Integer.valueOf(((a0) arrayList.get(0)).E0());
                int p10 = C16877v.p(arrayList);
                if (1 <= p10) {
                    int i13 = 1;
                    while (true) {
                        Integer valueOf = Integer.valueOf(((a0) arrayList.get(i13)).E0());
                        if (valueOf.compareTo(num) > 0) {
                            num = valueOf;
                        }
                        if (i13 == p10) {
                            break;
                        }
                        i13++;
                    }
                }
            }
            int intValue = num != null ? num.intValue() : 0;
            if (!arrayList.isEmpty()) {
                num2 = Integer.valueOf(((a0) arrayList.get(0)).z0());
                int p11 = C16877v.p(arrayList);
                if (1 <= p11) {
                    while (true) {
                        Integer valueOf2 = Integer.valueOf(((a0) arrayList.get(i12)).z0());
                        if (valueOf2.compareTo(num2) > 0) {
                            num2 = valueOf2;
                        }
                        if (i12 == p11) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (num2 != null) {
                i10 = num2.intValue();
            }
            return K.v0(k10, intValue, i10, (Map) null, new a(this.f11103a, intValue, arrayList, this.f11104b, this.f11105c, this.f11106d), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.k0$j */
    static final class j extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11115c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11116d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f11117e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f11118f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f11119g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11120h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f11121i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11122j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(nI.p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, K k10, boolean z10, long j10, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, int i10, int i11) {
            super(2);
            this.f11115c = pVar;
            this.f11116d = dVar;
            this.f11117e = k10;
            this.f11118f = z10;
            this.f11119g = j10;
            this.f11120h = pVar2;
            this.f11121i = i10;
            this.f11122j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4737k0.c(this.f11115c, this.f11116d, this.f11117e, this.f11118f, this.f11119g, this.f11120h, mVar, M0.a(this.f11121i | 1), this.f11122j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$k */
    static final class k extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11123c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(long j10, C17631a<Float> aVar) {
            super(1);
            this.f11123c = j10;
            this.f11124d = aVar;
        }

        public final void a(r1.f fVar) {
            r1.f.q1(fVar, this.f11123c, 0, 0, this.f11124d.invoke().floatValue(), (r1.g) null, (C5749w0) null, 0, 118, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.k0$l */
    static final class l extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f11126d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11127e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11128f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f11129g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(boolean z10, C17631a<C16807N> aVar, C17631a<Float> aVar2, long j10, int i10) {
            super(2);
            this.f11125c = z10;
            this.f11126d = aVar;
            this.f11127e = aVar2;
            this.f11128f = j10;
            this.f11129g = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4737k0.h(this.f11125c, this.f11126d, this.f11127e, this.f11128f, mVar, M0.a(this.f11129g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", f = "NavigationDrawer.kt", l = {1146}, m = "invokeSuspend")
    /* renamed from: O0.k0$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<A1.K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f11130c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f11131d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f11132e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.k0$m$a */
        static final class a extends C17544u implements C17642l<C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f11133c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(1);
                this.f11133c = aVar;
            }

            public final void a(long j10) {
                this.f11133c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5667g) obj).v());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C17631a<C16807N> aVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f11132e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f11132e, eVar);
            mVar.f11131d = obj;
            return mVar;
        }

        /* renamed from: i */
        public final Object invoke(A1.K k10, C17164e<? super C16807N> eVar) {
            return ((m) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f11130c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f11132e);
                this.f11130c = 1;
                if (G.j((A1.K) this.f11131d, (C17642l) null, (C17642l) null, (q) null, aVar, this, 7, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$n */
    static final class n extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f11135d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.k0$n$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f11136c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(0);
                this.f11136c = aVar;
            }

            public final Boolean invoke() {
                this.f11136c.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(String str, C17631a<C16807N> aVar) {
            super(1);
            this.f11134c = str;
            this.f11135d = aVar;
        }

        public final void a(x xVar) {
            v.d0(xVar, this.f11134c);
            v.B(xVar, (String) null, new a(this.f11135d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.k0$o */
    static final class o extends C17544u implements C17642l<L, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f11137c = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(L l10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO0/K;", "b", "()LO0/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.k0$p */
    static final class p extends C17544u implements C17631a<K> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f11138c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<L, Boolean> f11139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(L l10, C17642l<? super L, Boolean> lVar) {
            super(0);
            this.f11138c = l10;
            this.f11139d = lVar;
        }

        /* renamed from: b */
        public final K invoke() {
            return new K(this.f11138c, this.f11139d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(O0.J r29, s0.C5848T r30, androidx.compose.ui.d r31, p1.i1 r32, long r33, long r35, float r37, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r29
            r2 = r30
            r10 = r38
            r11 = r40
            r12 = r41
            r0 = -151557245(0xfffffffff6f76b83, float:-2.5091366E33)
            r3 = r39
            U0.m r3 = r3.k(r0)
            r4 = r12 & 1
            if (r4 == 0) goto L_0x001a
            r4 = r11 | 6
            goto L_0x002a
        L_0x001a:
            r4 = r11 & 6
            if (r4 != 0) goto L_0x0029
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r11
            goto L_0x002a
        L_0x0029:
            r4 = r11
        L_0x002a:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0041
        L_0x0031:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0041
            boolean r5 = r3.V(r2)
            if (r5 == 0) goto L_0x003e
            r5 = 32
            goto L_0x0040
        L_0x003e:
            r5 = 16
        L_0x0040:
            r4 = r4 | r5
        L_0x0041:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x004a
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r6 = r31
            goto L_0x005c
        L_0x004a:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r31
            boolean r7 = r3.V(r6)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r7
        L_0x005c:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r8 = r32
            goto L_0x0077
        L_0x0065:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r32
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r9
        L_0x0077:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008e
            r9 = r12 & 16
            r13 = r33
            if (r9 != 0) goto L_0x008a
            boolean r9 = r3.e(r13)
            if (r9 == 0) goto L_0x008a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r4 = r4 | r9
            goto L_0x0090
        L_0x008e:
            r13 = r33
        L_0x0090:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00a8
            r9 = r12 & 32
            r0 = r35
            if (r9 != 0) goto L_0x00a4
            boolean r15 = r3.e(r0)
            if (r15 == 0) goto L_0x00a4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a4:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r4 = r4 | r15
            goto L_0x00aa
        L_0x00a8:
            r0 = r35
        L_0x00aa:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b5
            r4 = r4 | r16
            r9 = r37
            goto L_0x00c8
        L_0x00b5:
            r16 = r11 & r16
            r9 = r37
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r3.c(r9)
            if (r16 == 0) goto L_0x00c4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00c4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c6:
            r4 = r4 | r16
        L_0x00c8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d0
            r4 = r4 | r1
            goto L_0x00e0
        L_0x00d0:
            r0 = r11 & r1
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r3.F(r10)
            if (r0 == 0) goto L_0x00dd
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00df
        L_0x00dd:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00df:
            r4 = r4 | r0
        L_0x00e0:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x00f8
            boolean r0 = r3.l()
            if (r0 != 0) goto L_0x00f0
            goto L_0x00f8
        L_0x00f0:
            r3.L()
            r4 = r8
            r7 = r35
            goto L_0x01e8
        L_0x00f8:
            r3.G()
            r0 = r11 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = 6
            if (r0 == 0) goto L_0x0120
            boolean r0 = r3.O()
            if (r0 == 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            r3.L()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0113
            r4 = r4 & r17
        L_0x0113:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x011b
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x011b:
            r26 = r35
            r0 = r4
            r4 = r13
            goto L_0x0159
        L_0x0120:
            if (r5 == 0) goto L_0x0125
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = r0
        L_0x0125:
            if (r7 == 0) goto L_0x012c
            p1.i1 r0 = p1.c1.a()
            r8 = r0
        L_0x012c:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0138
            O0.I r0 = O0.I.f9768a
            long r13 = r0.g(r3, r1)
            r4 = r4 & r17
        L_0x0138:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x014a
            int r0 = r4 >> 12
            r0 = r0 & 14
            long r19 = O0.C4755u.c(r13, r3, r0)
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r4
            r4 = r0
            goto L_0x014c
        L_0x014a:
            r19 = r35
        L_0x014c:
            if (r15 == 0) goto L_0x0155
            O0.I r0 = O0.I.f9768a
            float r0 = r0.d()
            r9 = r0
        L_0x0155:
            r0 = r4
            r4 = r13
            r26 = r19
        L_0x0159:
            r3.y()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x016b
            r7 = -1
            java.lang.String r13 = "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:769)"
            r14 = -151557245(0xfffffffff6f76b83, float:-2.5091366E33)
            U0.C4895p.S(r14, r0, r7, r13)
        L_0x016b:
            U0.I0 r7 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r7 = r3.Q(r7)
            c2.t r13 = c2.t.Rtl
            r14 = 1
            if (r7 != r13) goto L_0x017a
            r7 = r14
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            float r15 = f11062c
            O0.I r17 = O0.I.f9768a
            float r17 = r17.a()
            r18 = 10
            r19 = 0
            r20 = 0
            r21 = 0
            r31 = r6
            r32 = r15
            r33 = r20
            r34 = r17
            r35 = r21
            r36 = r18
            r37 = r19
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.x(r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.ui.d r13 = r15.s(r13)
            r15 = 0
            r1 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.d(r13, r15, r14, r1)
            O0.k0$a r1 = new O0.k0$a
            r15 = r29
            r1.<init>(r15, r7, r2, r10)
            r7 = 54
            r2 = 669057502(0x27e101de, float:6.245207E-15)
            c1.a r22 = c1.c.e(r2, r14, r1, r3, r7)
            r1 = 6
            int r0 = r0 >> r1
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r24 = r1 | r0
            r25 = 96
            r21 = 0
            r14 = r8
            r15 = r4
            r17 = r26
            r19 = r9
            r23 = r3
            O0.P0.a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            r13 = r4
            r4 = r8
            r7 = r26
        L_0x01e8:
            U0.Y0 r15 = r3.n()
            if (r15 == 0) goto L_0x0207
            O0.k0$b r5 = new O0.k0$b
            r0 = r5
            r1 = r29
            r2 = r30
            r3 = r6
            r28 = r5
            r5 = r13
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r0 = r28
            r15.a(r0)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4737k0.a(O0.J, s0.T, androidx.compose.ui.d, p1.i1, long, long, float, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r24, p1.i1 r25, long r26, long r28, float r30, s0.C5848T r31, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r10 = r34
            r0 = 1001163336(0x3bac8a48, float:0.005265508)
            r1 = r33
            U0.m r1 = r1.k(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r10 | 6
            r4 = r3
            r3 = r24
            goto L_0x0029
        L_0x0015:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r24
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r10
            goto L_0x0029
        L_0x0026:
            r3 = r24
            r4 = r10
        L_0x0029:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r35 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r25
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r25
        L_0x003e:
            r6 = 16
        L_0x0040:
            r4 = r4 | r6
            goto L_0x0044
        L_0x0042:
            r5 = r25
        L_0x0044:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005d
            r6 = r35 & 4
            if (r6 != 0) goto L_0x0057
            r6 = r26
            boolean r8 = r1.e(r6)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r6 = r26
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r8
            goto L_0x005f
        L_0x005d:
            r6 = r26
        L_0x005f:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0078
            r8 = r35 & 8
            if (r8 != 0) goto L_0x0072
            r8 = r28
            boolean r11 = r1.e(r8)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r8 = r28
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r11
            goto L_0x007a
        L_0x0078:
            r8 = r28
        L_0x007a:
            r11 = r35 & 16
            if (r11 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r30
            goto L_0x0095
        L_0x0083:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r30
            boolean r13 = r1.c(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r13
        L_0x0095:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00af
            r13 = r35 & 32
            if (r13 != 0) goto L_0x00a9
            r13 = r31
            boolean r14 = r1.V(r13)
            if (r14 == 0) goto L_0x00ab
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00a9:
            r13 = r31
        L_0x00ab:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r14
            goto L_0x00b1
        L_0x00af:
            r13 = r31
        L_0x00b1:
            r14 = r35 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00bb
            r4 = r4 | r15
            r15 = r32
            goto L_0x00cd
        L_0x00bb:
            r14 = r10 & r15
            r15 = r32
            if (r14 != 0) goto L_0x00cd
            boolean r14 = r1.F(r15)
            if (r14 == 0) goto L_0x00ca
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r4 = r4 | r14
        L_0x00cd:
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r4
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r0) goto L_0x00e3
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            r1.L()
            r2 = r5
            goto L_0x01ad
        L_0x00e3:
            r1.G()
            r0 = r10 & 1
            r14 = 6
            if (r0 == 0) goto L_0x0113
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x00f2
            goto L_0x0113
        L_0x00f2:
            r1.L()
            r0 = r35 & 2
            if (r0 == 0) goto L_0x00fb
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00fb:
            r0 = r35 & 4
            if (r0 == 0) goto L_0x0101
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0101:
            r0 = r35 & 8
            if (r0 == 0) goto L_0x0107
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0107:
            r0 = r35 & 32
            if (r0 == 0) goto L_0x010f
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x010f:
            r0 = r3
        L_0x0110:
            r2 = r12
            r3 = r13
            goto L_0x015b
        L_0x0113:
            if (r2 == 0) goto L_0x0118
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0119
        L_0x0118:
            r0 = r3
        L_0x0119:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0126
            O0.I r2 = O0.I.f9768a
            p1.i1 r2 = r2.f(r1, r14)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r5 = r2
        L_0x0126:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0133
            O0.I r2 = O0.I.f9768a
            long r2 = r2.b(r1, r14)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r2
        L_0x0133:
            r2 = r35 & 8
            if (r2 == 0) goto L_0x0142
            int r2 = r4 >> 6
            r2 = r2 & 14
            long r2 = O0.C4755u.c(r6, r1, r2)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x0142:
            if (r11 == 0) goto L_0x014b
            O0.I r2 = O0.I.f9768a
            float r2 = r2.c()
            r12 = r2
        L_0x014b:
            r2 = r35 & 32
            if (r2 == 0) goto L_0x0110
            O0.I r2 = O0.I.f9768a
            s0.T r2 = r2.h(r1, r14)
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r3
            r3 = r2
            r2 = r12
        L_0x015b:
            r1.y()
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x016d
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:573)"
            r13 = 1001163336(0x3bac8a48, float:0.005265508)
            U0.C4895p.S(r13, r4, r11, r12)
        L_0x016d:
            int r11 = r4 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r14
            int r12 = r4 << 6
            r13 = r12 & 896(0x380, float:1.256E-42)
            r11 = r11 | r13
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r12
            r11 = r11 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r12
            r11 = r11 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r13
            r11 = r11 | r12
            int r4 = r4 << 3
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r12
            r22 = r11 | r4
            r23 = 0
            r11 = 0
            r12 = r3
            r13 = r0
            r14 = r5
            r15 = r6
            r17 = r8
            r19 = r2
            r20 = r32
            r21 = r1
            a(r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01a9
            U0.C4895p.R()
        L_0x01a9:
            r12 = r2
            r13 = r3
            r2 = r5
            r3 = r0
        L_0x01ad:
            U0.Y0 r14 = r1.n()
            if (r14 == 0) goto L_0x01c7
            O0.k0$c r15 = new O0.k0$c
            r0 = r15
            r1 = r3
            r3 = r6
            r5 = r8
            r7 = r12
            r8 = r13
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.a(r15)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4737k0.b(androidx.compose.ui.d, p1.i1, long, long, float, s0.T, nI.q, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, androidx.compose.ui.d r30, O0.K r31, boolean r32, long r33, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r1 = r29
            r7 = r35
            r8 = r37
            r0 = 32
            r2 = 6
            r3 = 16
            r4 = 4
            r5 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            r6 = r36
            U0.m r6 = r6.k(r5)
            r15 = 1
            r9 = r38 & 1
            r10 = 2
            if (r9 == 0) goto L_0x001e
            r9 = r8 | 6
            goto L_0x002e
        L_0x001e:
            r9 = r8 & 6
            if (r9 != 0) goto L_0x002d
            boolean r9 = r6.F(r1)
            if (r9 == 0) goto L_0x002a
            r9 = r4
            goto L_0x002b
        L_0x002a:
            r9 = r10
        L_0x002b:
            r9 = r9 | r8
            goto L_0x002e
        L_0x002d:
            r9 = r8
        L_0x002e:
            r11 = r38 & 2
            if (r11 == 0) goto L_0x0037
            r9 = r9 | 48
        L_0x0034:
            r12 = r30
            goto L_0x0047
        L_0x0037:
            r12 = r8 & 48
            if (r12 != 0) goto L_0x0034
            r12 = r30
            boolean r13 = r6.V(r12)
            if (r13 == 0) goto L_0x0045
            r13 = r0
            goto L_0x0046
        L_0x0045:
            r13 = r3
        L_0x0046:
            r9 = r9 | r13
        L_0x0047:
            r13 = r8 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0061
            r13 = r38 & 4
            if (r13 != 0) goto L_0x005a
            r13 = r31
            boolean r16 = r6.V(r13)
            if (r16 == 0) goto L_0x005c
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r13 = r31
        L_0x005c:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r9 = r9 | r16
            goto L_0x0063
        L_0x0061:
            r13 = r31
        L_0x0063:
            r16 = r38 & 8
            if (r16 == 0) goto L_0x006c
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r14 = r32
            goto L_0x007f
        L_0x006c:
            r14 = r8 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0069
            r14 = r32
            boolean r18 = r6.b(r14)
            if (r18 == 0) goto L_0x007b
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r9 = r9 | r18
        L_0x007f:
            r5 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0099
            r5 = r38 & 16
            r19 = r11
            r10 = r33
            if (r5 != 0) goto L_0x0094
            boolean r20 = r6.e(r10)
            if (r20 == 0) goto L_0x0094
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r9 = r9 | r20
            goto L_0x009d
        L_0x0099:
            r19 = r11
            r10 = r33
        L_0x009d:
            r0 = r38 & 32
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00a6
            r9 = r9 | r20
            goto L_0x00b6
        L_0x00a6:
            r0 = r8 & r20
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r6.F(r7)
            if (r0 == 0) goto L_0x00b3
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r9 = r9 | r0
        L_0x00b6:
            r0 = 74899(0x12493, float:1.04956E-40)
            r0 = r0 & r9
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r5) goto L_0x00ce
            boolean r0 = r6.l()
            if (r0 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            r6.L()
            r2 = r12
            r3 = r13
            r4 = r14
            goto L_0x0493
        L_0x00ce:
            r6.G()
            r0 = r8 & 1
            r21 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 0
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r6.O()
            if (r0 == 0) goto L_0x00e0
            goto L_0x00f6
        L_0x00e0:
            r6.L()
            r0 = r38 & 4
            if (r0 == 0) goto L_0x00e9
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e9:
            r0 = r38 & 16
            if (r0 == 0) goto L_0x00ef
            r9 = r9 & r21
        L_0x00ef:
            r4 = r5
        L_0x00f0:
            r27 = r10
            r0 = r12
            r3 = r13
            r12 = r9
            goto L_0x011c
        L_0x00f6:
            if (r19 == 0) goto L_0x00fb
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r12 = r0
        L_0x00fb:
            r0 = r38 & 4
            if (r0 == 0) goto L_0x010b
            O0.L r0 = O0.L.Closed
            r4 = 2
            O0.K r0 = t(r0, r5, r6, r2, r4)
            r4 = r5
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            r13 = r0
            goto L_0x010c
        L_0x010b:
            r4 = r5
        L_0x010c:
            if (r16 == 0) goto L_0x010f
            r14 = r15
        L_0x010f:
            r0 = r38 & 16
            if (r0 == 0) goto L_0x00f0
            O0.I r0 = O0.I.f9768a
            long r10 = r0.e(r6, r2)
            r9 = r9 & r21
            goto L_0x00f0
        L_0x011c:
            r6.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x012e
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:320)"
            r11 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            U0.C4895p.S(r11, r12, r9, r10)
        L_0x012e:
            java.lang.Object r9 = r6.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r10 = r16.a()
            if (r9 != r10) goto L_0x0149
            dI.j r9 = dI.C17169j.f142968a
            QJ.Q r9 = U0.P.k(r9, r6)
            U0.B r10 = new U0.B
            r10.<init>(r9)
            r6.u(r10)
            r9 = r10
        L_0x0149:
            U0.B r9 = (U0.B) r9
            QJ.Q r13 = r9.a()
            Q0.t$a r9 = Q0.t.f12046a
            int r9 = i1.j.f24374h
            int r9 = Q0.t.a(r9)
            r11 = 0
            java.lang.String r10 = Q0.u.a(r9, r6, r11)
            U0.I0 r9 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r9 = r6.Q(r9)
            c2.d r9 = (c2.d) r9
            java.lang.Object r5 = r6.D()
            java.lang.Object r2 = r16.a()
            if (r5 != r2) goto L_0x017a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r5 = 2
            U0.r0 r5 = U0.u1.e(r2, r4, r5, r4)
            r6.u(r5)
        L_0x017a:
            U0.r0 r5 = (U0.C4899r0) r5
            boolean r2 = r6.V(r9)
            java.lang.Object r4 = r6.D()
            r15 = 0
            if (r2 != 0) goto L_0x018d
            java.lang.Object r2 = r16.a()
            if (r4 != r2) goto L_0x0194
        L_0x018d:
            U0.n0 r4 = U0.D0.a(r15)
            r6.u(r4)
        L_0x0194:
            U0.n0 r4 = (U0.C4892n0) r4
            r2 = r12 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r2 <= r15) goto L_0x01a4
            boolean r19 = r6.V(r3)
            if (r19 != 0) goto L_0x01a8
        L_0x01a4:
            r11 = r12 & 384(0x180, float:5.38E-43)
            if (r11 != r15) goto L_0x01aa
        L_0x01a8:
            r11 = 1
            goto L_0x01ab
        L_0x01aa:
            r11 = 0
        L_0x01ab:
            boolean r15 = r6.V(r9)
            r11 = r11 | r15
            java.lang.Object r15 = r6.D()
            if (r11 != 0) goto L_0x01bc
            java.lang.Object r11 = r16.a()
            if (r15 != r11) goto L_0x01c4
        L_0x01bc:
            O0.k0$d r15 = new O0.k0$d
            r15.<init>(r3, r9)
            r6.u(r15)
        L_0x01c4:
            nI.a r15 = (nI.C17631a) r15
            r9 = 0
            U0.P.i(r15, r6, r9)
            U0.I0 r9 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r9 = r6.Q(r9)
            c2.t r11 = c2.t.Rtl
            if (r9 != r11) goto L_0x01dc
            r9 = 0
            r11 = 0
            r15 = 1
            r23 = 1
            goto L_0x01e1
        L_0x01dc:
            r9 = 0
            r11 = 0
            r15 = 1
            r23 = 0
        L_0x01e1:
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.J.f(r0, r11, r15, r9)
            Q0.e r20 = r3.e()
            p0.v r21 = p0.v.Horizontal
            r25 = 16
            r26 = 0
            r24 = 0
            r22 = r14
            androidx.compose.ui.d r9 = androidx.compose.material3.internal.b.e(r19, r20, r21, r22, r23, r24, r25, r26)
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c r15 = r11.o()
            r19 = r0
            r0 = 0
            E1.I r15 = androidx.compose.foundation.layout.C5077h.h(r15, r0)
            int r20 = U0.C4883j.a(r6, r0)
            U0.y r0 = r6.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r6, r9)
            G1.g$a r21 = G1.C4504g.f6515W
            nI.a r8 = r21.a()
            U0.f r22 = r6.m()
            if (r22 != 0) goto L_0x021f
            U0.C4883j.c()
        L_0x021f:
            r6.I()
            boolean r22 = r6.i()
            if (r22 == 0) goto L_0x022c
            r6.p(r8)
            goto L_0x022f
        L_0x022c:
            r6.t()
        L_0x022f:
            U0.m r8 = U0.F1.a(r6)
            r33 = r10
            nI.p r10 = r21.c()
            U0.F1.c(r8, r15, r10)
            nI.p r10 = r21.e()
            U0.F1.c(r8, r0, r10)
            nI.p r0 = r21.b()
            boolean r10 = r8.i()
            if (r10 != 0) goto L_0x025b
            java.lang.Object r10 = r8.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r15)
            if (r10 != 0) goto L_0x0269
        L_0x025b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            r8.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            r8.w(r10, r0)
        L_0x0269:
            nI.p r0 = r21.d()
            U0.F1.c(r8, r9, r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            i1.c r8 = r11.o()
            r11 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r11)
            int r9 = U0.C4883j.a(r6, r11)
            U0.y r10 = r6.s()
            androidx.compose.ui.d r15 = androidx.compose.ui.c.e(r6, r0)
            nI.a r11 = r21.a()
            U0.f r20 = r6.m()
            if (r20 != 0) goto L_0x0296
            U0.C4883j.c()
        L_0x0296:
            r6.I()
            boolean r20 = r6.i()
            if (r20 == 0) goto L_0x02a3
            r6.p(r11)
            goto L_0x02a6
        L_0x02a3:
            r6.t()
        L_0x02a6:
            U0.m r11 = U0.F1.a(r6)
            nI.p r1 = r21.c()
            U0.F1.c(r11, r8, r1)
            nI.p r1 = r21.e()
            U0.F1.c(r11, r10, r1)
            nI.p r1 = r21.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x02d0
            java.lang.Object r8 = r11.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x02de
        L_0x02d0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r11.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r11.w(r8, r1)
        L_0x02de:
            nI.p r1 = r21.d()
            U0.F1.c(r11, r15, r1)
            int r1 = r12 >> 15
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.invoke(r6, r1)
            r6.x()
            boolean r9 = r3.i()
            r1 = r12 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r1 != r8) goto L_0x0301
            r1 = 1
        L_0x02fe:
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0303
        L_0x0301:
            r1 = 0
            goto L_0x02fe
        L_0x0303:
            if (r2 <= r8) goto L_0x030b
            boolean r10 = r6.V(r3)
            if (r10 != 0) goto L_0x030f
        L_0x030b:
            r10 = r12 & 384(0x180, float:5.38E-43)
            if (r10 != r8) goto L_0x0311
        L_0x030f:
            r8 = 1
            goto L_0x0312
        L_0x0311:
            r8 = 0
        L_0x0312:
            r1 = r1 | r8
            boolean r8 = r6.F(r13)
            r1 = r1 | r8
            java.lang.Object r8 = r6.D()
            if (r1 != 0) goto L_0x0324
            java.lang.Object r1 = r16.a()
            if (r8 != r1) goto L_0x032c
        L_0x0324:
            O0.k0$e r8 = new O0.k0$e
            r8.<init>(r14, r3, r13)
            r6.u(r8)
        L_0x032c:
            r10 = r8
            nI.a r10 = (nI.C17631a) r10
            boolean r1 = r6.V(r4)
            r8 = 256(0x100, float:3.59E-43)
            if (r2 <= r8) goto L_0x033d
            boolean r11 = r6.V(r3)
            if (r11 != 0) goto L_0x0341
        L_0x033d:
            r11 = r12 & 384(0x180, float:5.38E-43)
            if (r11 != r8) goto L_0x0343
        L_0x0341:
            r11 = 1
            goto L_0x0344
        L_0x0343:
            r11 = 0
        L_0x0344:
            r1 = r1 | r11
            java.lang.Object r11 = r6.D()
            if (r1 != 0) goto L_0x0354
            java.lang.Object r1 = r16.a()
            if (r11 != r1) goto L_0x0352
            goto L_0x0354
        L_0x0352:
            r1 = 0
            goto L_0x035d
        L_0x0354:
            O0.k0$f r11 = new O0.k0$f
            r1 = 0
            r11.<init>(r1, r3, r4)
            r6.u(r11)
        L_0x035d:
            nI.a r11 = (nI.C17631a) r11
            int r15 = r12 >> 3
            r15 = r15 & 7168(0x1c00, float:1.0045E-41)
            r1 = r33
            r8 = 0
            r8 = r12
            r7 = r13
            r12 = r27
            r33 = r5
            r17 = r14
            r5 = 256(0x100, float:3.59E-43)
            r14 = r6
            h(r9, r10, r11, r12, r14, r15)
            if (r2 <= r5) goto L_0x037c
            boolean r9 = r6.V(r3)
            if (r9 != 0) goto L_0x0380
        L_0x037c:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != r5) goto L_0x0382
        L_0x0380:
            r15 = 1
            goto L_0x0383
        L_0x0382:
            r15 = 0
        L_0x0383:
            java.lang.Object r9 = r6.D()
            if (r15 != 0) goto L_0x038f
            java.lang.Object r10 = r16.a()
            if (r9 != r10) goto L_0x0397
        L_0x038f:
            O0.k0$g r9 = new O0.k0$g
            r9.<init>(r3)
            r6.u(r9)
        L_0x0397:
            nI.l r9 = (nI.C17642l) r9
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.A.a(r0, r9)
            boolean r9 = r6.V(r1)
            if (r2 <= r5) goto L_0x03a9
            boolean r10 = r6.V(r3)
            if (r10 != 0) goto L_0x03ad
        L_0x03a9:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != r5) goto L_0x03af
        L_0x03ad:
            r15 = 1
            goto L_0x03b0
        L_0x03af:
            r15 = 0
        L_0x03b0:
            r9 = r9 | r15
            boolean r10 = r6.F(r7)
            r9 = r9 | r10
            java.lang.Object r10 = r6.D()
            if (r9 != 0) goto L_0x03c2
            java.lang.Object r9 = r16.a()
            if (r10 != r9) goto L_0x03ca
        L_0x03c2:
            O0.k0$h r10 = new O0.k0$h
            r10.<init>(r1, r3, r7)
            r6.u(r10)
        L_0x03ca:
            nI.l r10 = (nI.C17642l) r10
            r1 = 1
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r0 = L1.o.d(r0, r9, r10, r1, r7)
            if (r2 <= r5) goto L_0x03db
            boolean r2 = r6.V(r3)
            if (r2 != 0) goto L_0x03df
        L_0x03db:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != r5) goto L_0x03e1
        L_0x03df:
            r15 = r1
            goto L_0x03e2
        L_0x03e1:
            r15 = 0
        L_0x03e2:
            boolean r1 = r6.V(r4)
            r1 = r1 | r15
            java.lang.Object r2 = r6.D()
            if (r1 != 0) goto L_0x03f3
            java.lang.Object r1 = r16.a()
            if (r2 != r1) goto L_0x03fe
        L_0x03f3:
            O0.k0$i r2 = new O0.k0$i
            r5 = r33
            r1 = 0
            r2.<init>(r3, r5, r4, r1)
            r6.u(r2)
        L_0x03fe:
            E1.I r2 = (E1.I) r2
            r1 = r8 & 14
            r4 = 0
            int r4 = U0.C4883j.a(r6, r4)
            U0.y r5 = r6.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r6, r0)
            nI.a r7 = r21.a()
            r8 = 6
            int r1 = r1 << r8
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r8
            U0.f r8 = r6.m()
            if (r8 != 0) goto L_0x0421
            U0.C4883j.c()
        L_0x0421:
            r6.I()
            boolean r8 = r6.i()
            if (r8 == 0) goto L_0x042e
            r6.p(r7)
            goto L_0x0431
        L_0x042e:
            r6.t()
        L_0x0431:
            U0.m r7 = U0.F1.a(r6)
            nI.p r8 = r21.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r21.e()
            U0.F1.c(r7, r5, r2)
            nI.p r2 = r21.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x045b
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x0469
        L_0x045b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r2)
        L_0x0469:
            nI.p r2 = r21.d()
            U0.F1.c(r7, r0, r2)
            r0 = 6
            int r0 = r1 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r29
            r1.invoke(r6, r0)
            r6.x()
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x048d
            U0.C4895p.R()
        L_0x048d:
            r4 = r17
            r2 = r19
            r10 = r27
        L_0x0493:
            U0.Y0 r12 = r6.n()
            if (r12 == 0) goto L_0x04ab
            O0.k0$j r13 = new O0.k0$j
            r0 = r13
            r1 = r29
            r5 = r10
            r7 = r35
            r8 = r37
            r9 = r38
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r12.a(r13)
        L_0x04ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4737k0.c(nI.p, androidx.compose.ui.d, O0.K, boolean, long, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean d(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void e(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final float f(C4892n0 n0Var) {
        return n0Var.a();
    }

    /* access modifiers changed from: private */
    public static final void g(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    /* access modifiers changed from: private */
    public static final void h(boolean z10, C17631a<C16807N> aVar, C17631a<Float> aVar2, long j10, C4889m mVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar;
        boolean z11 = z10;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<Float> aVar4 = aVar2;
        long j11 = j10;
        int i12 = i10;
        C4889m k10 = mVar.k(2106487387);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.e(j11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2106487387, i11, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
            }
            t.a aVar5 = t.f12046a;
            String a10 = u.a(t.a(i1.j.f24367a), k10, 0);
            k10.W(-1784743395);
            boolean z12 = true;
            if (z11) {
                d.a aVar6 = androidx.compose.ui.d.f18749a;
                int i13 = i11 & 112;
                boolean z13 = i13 == 32;
                Object D10 = k10.D();
                if (z13 || D10 == C4889m.f14007a.a()) {
                    D10 = new m(aVar3, (C17164e<? super m>) null);
                    k10.u(D10);
                }
                androidx.compose.ui.d d10 = U.d(aVar6, aVar3, (nI.p) D10);
                boolean V10 = (i13 == 32) | k10.V(a10);
                Object D11 = k10.D();
                if (V10 || D11 == C4889m.f14007a.a()) {
                    D11 = new n(a10, aVar3);
                    k10.u(D11);
                }
                dVar = L1.o.c(d10, true, (C17642l) D11);
            } else {
                dVar = androidx.compose.ui.d.f18749a;
            }
            k10.P();
            androidx.compose.ui.d s10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null).s(dVar);
            boolean z14 = (i11 & 7168) == 2048;
            if ((i11 & 896) != 256) {
                z12 = false;
            }
            boolean z15 = z14 | z12;
            Object D12 = k10.D();
            if (z15 || D12 == C4889m.f14007a.a()) {
                D12 = new k(j11, aVar4);
                k10.u(D12);
            }
            C5603i.a(s10, (C17642l) D12, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new l(z10, aVar, aVar2, j10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float s(float f10, float f11, float f12) {
        return C17978n.l((f12 - f10) / (f11 - f10), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final O0.K t(O0.L r7, nI.C17642l<? super O0.L, java.lang.Boolean> r8, U0.C4889m r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            O0.k0$o r8 = O0.C4737k0.o.f11137c
        L_0x0006:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0015
            r11 = -1
            java.lang.String r0 = "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)"
            r1 = 2098699222(0x7d179bd6, float:1.2595161E37)
            U0.C4895p.S(r1, r10, r11, r0)
        L_0x0015:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            O0.K$a r1 = O0.K.f9775d
            f1.k r1 = r1.a(r8)
            r2 = r10 & 14
            r2 = r2 ^ 6
            r3 = 1
            r4 = 4
            if (r2 <= r4) goto L_0x002c
            boolean r2 = r9.V(r7)
            if (r2 != 0) goto L_0x0030
        L_0x002c:
            r2 = r10 & 6
            if (r2 != r4) goto L_0x0032
        L_0x0030:
            r2 = r3
            goto L_0x0033
        L_0x0032:
            r2 = r11
        L_0x0033:
            r4 = r10 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r5 = 32
            if (r4 <= r5) goto L_0x0041
            boolean r4 = r9.V(r8)
            if (r4 != 0) goto L_0x0045
        L_0x0041:
            r10 = r10 & 48
            if (r10 != r5) goto L_0x0046
        L_0x0045:
            r11 = r3
        L_0x0046:
            r10 = r2 | r11
            java.lang.Object r11 = r9.D()
            if (r10 != 0) goto L_0x0056
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x005e
        L_0x0056:
            O0.k0$p r11 = new O0.k0$p
            r11.<init>(r7, r8)
            r9.u(r11)
        L_0x005e:
            r3 = r11
            nI.a r3 = (nI.C17631a) r3
            r5 = 0
            r6 = 4
            r2 = 0
            r4 = r9
            java.lang.Object r7 = f1.C5301c.e(r0, r1, r2, r3, r4, r5, r6)
            O0.K r7 = (O0.K) r7
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0074
            U0.C4895p.R()
        L_0x0074:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4737k0.t(O0.L, nI.l, U0.m, int, int):O0.K");
    }
}
