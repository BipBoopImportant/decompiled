package Dh;

import Dh.C9065c;
import Dh.C9066d;
import E1.I;
import G1.C4504g;
import KJ.C15987c;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.N0;
import QJ.Q;
import QJ.T;
import SC.F0;
import SC.G0;
import SC.Y2;
import TJ.C16532g;
import TJ.C16534i;
import U0.A1;
import U0.B;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.n;
import c2.o;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l0.j;
import m0.C5546i;
import m0.N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p0.H;
import q0.C5770k;
import s0.C5834E;
import s0.C5848T;
import s0.C5852X;
import s0.C5857c;
import s0.C5861g;
import s0.C5862h;
import tK.C18029u;
import uK.C18146a;
import x0.C6230C;
import x0.C6231D;
import x0.C6239g;
import x0.m;
import x0.v;
import z1.C6271a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b \u0010!\u001a;\u0010&\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0\rH\u0001¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010)\u001a\u00020\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0003¢\u0006\u0004\b)\u0010*¨\u0006-²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u0002²\u0006\u000e\u0010+\u001a\u00020\u00138\n@\nX\u0002²\u0006\f\u0010,\u001a\u00020\u00138\nX\u0002"}, d2 = {"LKJ/c;", "LDh/D;", "pages", "Landroidx/compose/ui/d;", "modifier", "Ls0/T;", "contentWindowInsets", "", "loading", "", "error", "LDh/d;", "config", "Lkotlin/Function1;", "LDh/c;", "LXH/N;", "action", "q", "(LKJ/c;Landroidx/compose/ui/d;Ls0/T;ZLjava/lang/String;LDh/d;LnI/l;LU0/m;II)V", "", "currentPageIndex", "LQJ/Q;", "coroutineScope", "Lx0/C;", "pagerState", "k", "(ILKJ/c;LQJ/Q;Lx0/C;ZLU0/m;I)V", "page", "t", "(LDh/D;LQJ/Q;Lx0/C;ZLU0/m;I)V", "currentIndex", "pageCount", "w", "(IILandroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function0;", "onCloseClicked", "Ls0/c;", "content", "m", "(LnI/a;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "onQuitClicked", "o", "(LnI/a;LU0/m;I)V", "width", "offset", "onboarding_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<D> f59260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f59261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f59262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f59263d;

        a(C15987c<D> cVar, Q q10, C6230C c10, boolean z10) {
            this.f59260a = cVar;
            this.f59261b = q10;
            this.f59262c = c10;
            this.f59263d = z10;
        }

        public final void a(int i10, C4889m mVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= mVar.d(i10) ? 4 : 2;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(72865639, i11, -1, "com.ingka.ikea.app.onboarding.composables.ButtonContent.<anonymous> (OnboardingScreen.kt:241)");
                }
                x.t(this.f59260a.get(i10), this.f59261b, this.f59262c, this.f59263d, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Number) obj).intValue(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.onboarding.composables.OnboardingScreenKt$OnboardingScreen$2$1", f = "OnboardingScreen.kt", l = {140}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f59264c;

        /* renamed from: d  reason: collision with root package name */
        int f59265d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L0 f59267f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<C9065c, C16807N> f59268g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f59269a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.N0 r1 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f59269a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Dh.x.b.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, L0 l02, C17642l<? super C9065c, C16807N> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f59266e = str;
            this.f59267f = l02;
            this.f59268g = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f59266e, this.f59267f, this.f59268g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f59265d;
            if (i10 == 0) {
                y.b(obj);
                String str = this.f59266e;
                if (!(str == null || str.length() == 0)) {
                    L0 l02 = this.f59267f;
                    String str2 = this.f59266e;
                    J0 j02 = J0.Short;
                    this.f59264c = str;
                    this.f59265d = 1;
                    obj = L0.f(l02, str2, (String) null, false, j02, this, 6, (Object) null);
                    if (obj == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                CharSequence charSequence = (CharSequence) this.f59264c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = a.f59269a[((N0) obj).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f59268g.invoke(C9065c.b.f59178a);
                } else {
                    throw new t();
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f59270a;

        c(L0 l02) {
            this.f59270a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(755163823, i10, -1, "com.ingka.ikea.app.onboarding.composables.OnboardingScreen.<anonymous> (OnboardingScreen.kt:151)");
                }
                Y2.c(this.f59270a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C9065c, C16807N> f59271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<D> f59272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C9066d f59273c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f59274d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15987c<D> f59275a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9066d f59276b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f59277c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.app.onboarding.composables.OnboardingScreenKt$OnboardingScreen$4$1$2$1$1$1", f = "OnboardingScreen.kt", l = {172}, m = "invokeSuspend")
            /* renamed from: Dh.x$d$a$a  reason: collision with other inner class name */
            static final class C0979a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f59278c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C6230C f59279d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C15987c<D> f59280e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C4894o0 f59281f;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "LXH/N;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.ingka.ikea.app.onboarding.composables.OnboardingScreenKt$OnboardingScreen$4$1$2$1$1$1$2", f = "OnboardingScreen.kt", l = {}, m = "invokeSuspend")
                /* renamed from: Dh.x$d$a$a$a  reason: collision with other inner class name */
                static final class C0980a extends l implements p<Integer, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f59282c;

                    /* renamed from: d  reason: collision with root package name */
                    /* synthetic */ int f59283d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C15987c<D> f59284e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ C4894o0 f59285f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0980a(C15987c<D> cVar, C4894o0 o0Var, C17164e<? super C0980a> eVar) {
                        super(2, eVar);
                        this.f59284e = cVar;
                        this.f59285f = o0Var;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        C0980a aVar = new C0980a(this.f59284e, this.f59285f, eVar);
                        aVar.f59283d = ((Number) obj).intValue();
                        return aVar;
                    }

                    public final Object i(int i10, C17164e<? super C16807N> eVar) {
                        return ((C0980a) create(Integer.valueOf(i10), eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return i(((Number) obj).intValue(), (C17164e) obj2);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C17631a<C16807N> e10;
                        C17187b.f();
                        if (this.f59282c == 0) {
                            y.b(obj);
                            int i10 = this.f59283d;
                            a.h(this.f59285f, i10);
                            D d10 = (D) C16877v.z0(this.f59284e, i10);
                            if (!(d10 == null || (e10 = d10.e()) == null)) {
                                e10.invoke();
                            }
                            return C16807N.f139792a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0979a(C6230C c10, C15987c<D> cVar, C4894o0 o0Var, C17164e<? super C0979a> eVar) {
                    super(2, eVar);
                    this.f59279d = c10;
                    this.f59280e = cVar;
                    this.f59281f = o0Var;
                }

                /* access modifiers changed from: private */
                public static final int j(C6230C c10) {
                    return c10.v();
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0979a(this.f59279d, this.f59280e, this.f59281f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0979a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f59278c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16532g r10 = p1.r(new B(this.f59279d));
                        C0980a aVar = new C0980a(this.f59280e, this.f59281f, (C17164e<? super C0980a>) null);
                        this.f59278c = 1;
                        if (C16534i.j(r10, aVar, this) == f10) {
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
            static final class b implements r<v, Integer, C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C15987c<D> f59286a;

                b(C15987c<D> cVar) {
                    this.f59286a = cVar;
                }

                public final void a(v vVar, int i10, C4889m mVar, int i11) {
                    C17542s.j(vVar, "$this$HorizontalPager");
                    if (C4895p.J()) {
                        C4895p.S(705529471, i11, -1, "com.ingka.ikea.app.onboarding.composables.OnboardingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingScreen.kt:189)");
                    }
                    androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                    C15987c<D> cVar = this.f59286a;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, f10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    cVar.get(i10).d().invoke(mVar, 0);
                    mVar.x();
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                    a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                    return C16807N.f139792a;
                }
            }

            a(C15987c<D> cVar, C9066d dVar, boolean z10) {
                this.f59275a = cVar;
                this.f59276b = dVar;
                this.f59277c = z10;
            }

            private static final int f(C4894o0 o0Var) {
                return o0Var.e();
            }

            /* access modifiers changed from: private */
            public static final void h(C4894o0 o0Var, int i10) {
                o0Var.g(i10);
            }

            /* access modifiers changed from: private */
            public static final int i(C15987c cVar) {
                return cVar.size();
            }

            /* access modifiers changed from: private */
            public static final Object j(int i10) {
                return Integer.valueOf(i10);
            }

            public final void e(C5857c cVar, C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                C17542s.j(cVar, "$this$ClosableBoxContent");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-619856745, i11, -1, "com.ingka.ikea.app.onboarding.composables.OnboardingScreen.<anonymous>.<anonymous>.<anonymous> (OnboardingScreen.kt:162)");
                    }
                    C5073d.f d10 = C5073d.f18068a.d();
                    C15987c<D> cVar2 = this.f59275a;
                    C9066d dVar = this.f59276b;
                    boolean z10 = this.f59277c;
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    C5437c.a aVar2 = C5437c.f24302a;
                    I a10 = C5080k.a(d10, aVar2.k(), mVar2, 6);
                    int a11 = C4883j.a(mVar2, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                    C4504g.a aVar3 = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar3.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a12);
                    } else {
                        mVar.t();
                    }
                    C4889m a13 = F1.a(mVar);
                    F1.c(a13, a10, aVar3.c());
                    F1.c(a13, s10, aVar3.e());
                    p<C4504g, Integer, C16807N> b10 = aVar3.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b10);
                    }
                    F1.c(a13, e10, aVar3.d());
                    C5862h hVar = C5862h.f28810a;
                    Object D10 = mVar.D();
                    C4889m.a aVar4 = C4889m.f14007a;
                    if (D10 == aVar4.a()) {
                        B b11 = new B(P.k(C17169j.f142968a, mVar2));
                        mVar2.u(b11);
                        D10 = b11;
                    }
                    Q a14 = ((B) D10).a();
                    mVar2.W(-33867547);
                    Object D11 = mVar.D();
                    if (D11 == aVar4.a()) {
                        D11 = C4877g1.a(0);
                        mVar2.u(D11);
                    }
                    C4894o0 o0Var = (C4894o0) D11;
                    mVar.P();
                    int f10 = f(o0Var);
                    mVar2.W(-33863615);
                    boolean F10 = mVar2.F(cVar2);
                    Object D12 = mVar.D();
                    if (F10 || D12 == aVar4.a()) {
                        D12 = new z(cVar2);
                        mVar2.u(D12);
                    }
                    mVar.P();
                    C6230C k10 = C6231D.k(f10, 0.0f, (C17631a) D12, mVar, 0, 2);
                    mVar2.W(-33858477);
                    boolean V10 = mVar2.V(k10) | mVar2.F(cVar2);
                    Object D13 = mVar.D();
                    if (V10 || D13 == aVar4.a()) {
                        D13 = new C0979a(k10, cVar2, o0Var, (C17164e<? super C0979a>) null);
                        mVar2.u(D13);
                    }
                    mVar.P();
                    P.g(k10, (p) D13, mVar2, 0);
                    androidx.compose.ui.d a15 = C5116k1.a(C5861g.c(hVar, aVar, 1.0f, false, 2, (Object) null), "OnboardingScreenPagerTag");
                    C5437c.C0386c l10 = aVar2.l();
                    int a16 = dVar.a();
                    boolean c10 = dVar.c();
                    mVar2.W(-33834602);
                    Object D14 = mVar.D();
                    if (D14 == aVar4.a()) {
                        D14 = new A();
                        mVar2.u(D14);
                    }
                    mVar.P();
                    C4894o0 o0Var2 = o0Var;
                    C5264a e11 = c1.c.e(705529471, true, new b(cVar2), mVar2, 54);
                    d.a aVar5 = aVar;
                    boolean z11 = z10;
                    C6230C c11 = k10;
                    C6230C c12 = k10;
                    int i12 = a16;
                    C9066d dVar2 = dVar;
                    C5437c.C0386c cVar3 = l10;
                    C15987c<D> cVar4 = cVar2;
                    C4889m mVar3 = mVar2;
                    m.a(c11, a15, (C5834E) null, (C6239g) null, i12, 0.0f, cVar3, (H) null, c10, false, (C17642l) D14, (C6271a) null, (C5770k) null, e11, mVar, 1572864, 3078, 6828);
                    mVar3.W(-33824950);
                    if (dVar2.b() && !cVar4.isEmpty() && cVar4.size() > 1) {
                        x.w(f(o0Var2), cVar4.size(), C5116k1.a(D.m(TC.e.i(aVar5), 0.0f, C18029u.f147649a.j(), 0.0f, 0.0f, 13, (Object) null), "OnboardingScreenPageIndicatorTag"), mVar, 0, 0);
                    }
                    mVar.P();
                    mVar3.W(-33804607);
                    if (!cVar4.isEmpty()) {
                        x.k(f(o0Var2), cVar4, a14, c12, z11, mVar, 0);
                    }
                    mVar.P();
                    mVar.x();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        d(C17642l<? super C9065c, C16807N> lVar, C15987c<D> cVar, C9066d dVar, boolean z10) {
            this.f59271a = lVar;
            this.f59272b = cVar;
            this.f59273c = dVar;
            this.f59274d = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C9065c.a.f59177a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5834E r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r0 = r13 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r12.V(r11)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r13 = r13 | r0
            L_0x0013:
                r0 = r13 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0025
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0025
            L_0x0020:
                r12.L()
                goto L_0x0108
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.onboarding.composables.OnboardingScreen.<anonymous> (OnboardingScreen.kt:156)"
                r2 = -611642746(0xffffffffdb8b1286, float:-7.8290777E16)
                U0.C4895p.S(r2, r13, r0, r1)
            L_0x0034:
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.h(r13, r11)
                nI.l<Dh.c, XH.N> r13 = r10.f59271a
                KJ.c<Dh.D> r0 = r10.f59272b
                Dh.d r1 = r10.f59273c
                boolean r2 = r10.f59274d
                androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r3 = r3.g()
                i1.c$a r4 = i1.C5437c.f24302a
                i1.c$b r4 = r4.k()
                r5 = 0
                E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r12, r5)
                int r4 = U0.C4883j.a(r12, r5)
                U0.y r5 = r12.s()
                androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r12, r11)
                G1.g$a r6 = G1.C4504g.f6515W
                nI.a r7 = r6.a()
                U0.f r8 = r12.m()
                if (r8 != 0) goto L_0x006e
                U0.C4883j.c()
            L_0x006e:
                r12.I()
                boolean r8 = r12.i()
                if (r8 == 0) goto L_0x007b
                r12.p(r7)
                goto L_0x007e
            L_0x007b:
                r12.t()
            L_0x007e:
                U0.m r7 = U0.F1.a(r12)
                nI.p r8 = r6.c()
                U0.F1.c(r7, r3, r8)
                nI.p r3 = r6.e()
                U0.F1.c(r7, r5, r3)
                nI.p r3 = r6.b()
                boolean r5 = r7.i()
                if (r5 != 0) goto L_0x00a8
                java.lang.Object r5 = r7.D()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
                if (r5 != 0) goto L_0x00b6
            L_0x00a8:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r7.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7.w(r4, r3)
            L_0x00b6:
                nI.p r3 = r6.d()
                U0.F1.c(r7, r11, r3)
                s0.h r11 = s0.C5862h.f28810a
                r11 = 1403217146(0x53a364fa, float:1.40354755E12)
                r12.W(r11)
                boolean r11 = r12.V(r13)
                java.lang.Object r3 = r12.D()
                if (r11 != 0) goto L_0x00d7
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r3 != r11) goto L_0x00df
            L_0x00d7:
                Dh.y r3 = new Dh.y
                r3.<init>(r13)
                r12.u(r3)
            L_0x00df:
                r4 = r3
                nI.a r4 = (nI.C17631a) r4
                r12.P()
                Dh.x$d$a r11 = new Dh.x$d$a
                r11.<init>(r0, r1, r2)
                r13 = 54
                r0 = -619856745(0xffffffffdb0dbc97, float:-3.9895328E16)
                r1 = 1
                c1.a r6 = c1.c.e(r0, r1, r11, r12, r13)
                r8 = 384(0x180, float:5.38E-43)
                r9 = 2
                r5 = 0
                r7 = r12
                Dh.x.m(r4, r5, r6, r7, r8, r9)
                r12.x()
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0108
                U0.C4895p.R()
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Dh.x.d.b(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.onboarding.composables.OnboardingScreenKt$PageButton$1$1$1$1$1", f = "OnboardingScreen.kt", l = {289}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f59287c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f59288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6230C c10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f59288d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f59288d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f59287c;
            if (i10 == 0) {
                y.b(obj);
                C6230C c10 = this.f59288d;
                this.f59287c = 1;
                if (C6230C.n(c10, c10.v() + 1, 0.0f, (C5546i) null, this, 6, (Object) null) == f10) {
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

    private static final int A(A1<Integer> a12) {
        return a12.getValue().intValue();
    }

    /* access modifiers changed from: private */
    public static final n B(A1 a12, c2.d dVar) {
        C17542s.j(dVar, "$this$offset");
        return n.b(o.a(A(a12), 0));
    }

    /* access modifiers changed from: private */
    public static final C16807N C(int i10, int i11, androidx.compose.ui.d dVar, int i12, int i13, C4889m mVar, int i14) {
        w(i10, i11, dVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void k(int i10, C15987c<D> cVar, Q q10, C6230C c10, boolean z10, C4889m mVar, int i11) {
        int i12;
        List<C9064b> c11;
        C4889m k10 = mVar.k(942586118);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.F(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.F(q10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= k10.V(c10) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= k10.b(z10) ? 16384 : 8192;
        }
        if ((i12 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(942586118, i12, -1, "com.ingka.ikea.app.onboarding.composables.ButtonContent (OnboardingScreen.kt:231)");
            }
            D d10 = cVar.get(c10.T());
            D d11 = (D) C16877v.z0(cVar, i10);
            if (d11 == null || (c11 = d11.c()) == null || c11.size() != d10.c().size()) {
                k10.W(345020973);
                t(d11, q10, c10, z10, k10, (i12 >> 3) & 8176);
                k10.P();
            } else {
                k10.W(344720335);
                j.a(Integer.valueOf(i10), (androidx.compose.ui.d) null, (N<Float>) null, (String) null, c1.c.e(72865639, true, new a(cVar, q10, c10, z10), k10, 54), k10, (i12 & 14) | 24576, 14);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(i10, cVar, q10, c10, z10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(int i10, C15987c cVar, Q q10, C6230C c10, boolean z10, int i11, C4889m mVar, int i12) {
        k(i10, cVar, q10, c10, z10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final void m(C17631a<C16807N> aVar, androidx.compose.ui.d dVar, q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "onCloseClicked");
        C17542s.j(qVar, "content");
        C4889m k10 = mVar.k(-1528824972);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(qVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1528824972, i12, -1, "com.ingka.ikea.app.onboarding.composables.ClosableBoxContent (OnboardingScreen.kt:336)");
            }
            androidx.compose.ui.d f10 = J.f(dVar, 0.0f, 1, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            qVar.invoke(C5079j.f18125a, k10, Integer.valueOf(((i12 >> 3) & 112) | 6));
            o(aVar, k10, i12 & 14);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(aVar, dVar2, qVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17631a aVar, androidx.compose.ui.d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        m(aVar, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void o(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(668650192);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(668650192, i11, -1, "com.ingka.ikea.app.onboarding.composables.CloseButton (OnboardingScreen.kt:345)");
            }
            androidx.compose.ui.d e10 = C5852X.e(androidx.compose.ui.d.f18749a);
            C18029u uVar = C18029u.f147649a;
            F0.b(C18146a.f148097J2, J1.j.b(Oo.b.f84665i, k10, 0), C5116k1.a(D.m(e10, uVar.a(), uVar.a(), 0.0f, 0.0f, 12, (Object) null), "OnboardingScreenCloseButtonTag"), false, SC.H0.PrimaryInverseStatic, G0.Small, (r0.m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new q(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17631a aVar, int i10, C4889m mVar, int i11) {
        o(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(KJ.C15987c<Dh.D> r24, androidx.compose.ui.d r25, s0.C5848T r26, boolean r27, java.lang.String r28, Dh.C9066d r29, nI.C17642l<? super Dh.C9065c, XH.C16807N> r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r24
            r7 = r30
            r8 = r32
            java.lang.String r0 = "pages"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = 1914784181(0x722149b5, float:3.1946363E30)
            r2 = r31
            U0.m r2 = r2.k(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r8 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r8
            goto L_0x0030
        L_0x002f:
            r3 = r8
        L_0x0030:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
        L_0x0036:
            r5 = r25
            goto L_0x004b
        L_0x0039:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0036
            r5 = r25
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0064
            r6 = r33 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r26
            boolean r9 = r2.V(r6)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r26
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
            goto L_0x0066
        L_0x0064:
            r6 = r26
        L_0x0066:
            r9 = r33 & 8
            if (r9 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r10 = r27
            goto L_0x0081
        L_0x006f:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x006c
            r10 = r27
            boolean r11 = r2.b(r10)
            if (r11 == 0) goto L_0x007e
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r11
        L_0x0081:
            r11 = r33 & 16
            if (r11 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r13 = r28
            goto L_0x009c
        L_0x008a:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0087
            r13 = r28
            boolean r14 = r2.V(r13)
            if (r14 == 0) goto L_0x0099
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r14
        L_0x009c:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00b6
            r14 = r33 & 32
            if (r14 != 0) goto L_0x00b0
            r14 = r29
            boolean r15 = r2.V(r14)
            if (r15 == 0) goto L_0x00b2
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b0:
            r14 = r29
        L_0x00b2:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r3 = r3 | r15
            goto L_0x00b8
        L_0x00b6:
            r14 = r29
        L_0x00b8:
            r15 = r33 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c1
            r3 = r3 | r16
            goto L_0x00d1
        L_0x00c1:
            r15 = r8 & r16
            if (r15 != 0) goto L_0x00d1
            boolean r15 = r2.F(r7)
            if (r15 == 0) goto L_0x00ce
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r3 = r3 | r15
        L_0x00d1:
            r15 = 599187(0x92493, float:8.3964E-40)
            r15 = r15 & r3
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r12) goto L_0x00ea
            boolean r12 = r2.l()
            if (r12 != 0) goto L_0x00e1
            goto L_0x00ea
        L_0x00e1:
            r2.L()
            r4 = r5
            r3 = r6
            r5 = r13
            r6 = r14
            goto L_0x0218
        L_0x00ea:
            r2.G()
            r12 = r8 & 1
            r15 = 0
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = 0
            if (r12 == 0) goto L_0x0112
            boolean r12 = r2.O()
            if (r12 == 0) goto L_0x00fe
            goto L_0x0112
        L_0x00fe:
            r2.L()
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0107
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0107:
            r4 = r33 & 32
            if (r4 == 0) goto L_0x010d
            r3 = r3 & r17
        L_0x010d:
            r9 = r3
            r4 = r5
        L_0x010f:
            r3 = r10
            r5 = r13
            goto L_0x015e
        L_0x0112:
            if (r4 == 0) goto L_0x0117
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0118
        L_0x0117:
            r4 = r5
        L_0x0118:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x0127
            O0.w0 r5 = O0.C4760w0.f11590a
            int r6 = O0.C4760w0.f11591b
            s0.T r5 = r5.a(r2, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r5
        L_0x0127:
            if (r9 == 0) goto L_0x012b
            r10 = r18
        L_0x012b:
            if (r11 == 0) goto L_0x012e
            r13 = r15
        L_0x012e:
            r5 = r33 & 32
            if (r5 == 0) goto L_0x015c
            Dh.d$b r5 = Dh.C9066d.f59179d
            r9 = -195939797(0xfffffffff452322b, float:-6.661376E31)
            r2.W(r9)
            java.lang.Object r9 = r2.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r9 != r11) goto L_0x014e
            Dh.n r9 = new Dh.n
            r9.<init>()
            r2.u(r9)
        L_0x014e:
            nI.l r9 = (nI.C17642l) r9
            r2.P()
            Dh.d r5 = r5.a(r9)
            r3 = r3 & r17
            r9 = r3
            r14 = r5
            goto L_0x010f
        L_0x015c:
            r9 = r3
            goto L_0x010f
        L_0x015e:
            r2.y()
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x016d
            r10 = -1
            java.lang.String r11 = "com.ingka.ikea.app.onboarding.composables.OnboardingScreen (OnboardingScreen.kt:134)"
            U0.C4895p.S(r0, r9, r10, r11)
        L_0x016d:
            r0 = -195937304(0xfffffffff4523be8, float:-6.6625817E31)
            r2.W(r0)
            java.lang.Object r0 = r2.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r11 = r10.a()
            if (r0 != r11) goto L_0x0187
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r2.u(r0)
        L_0x0187:
            O0.L0 r0 = (O0.L0) r0
            r2.P()
            r11 = -195935018(0xfffffffff45244d6, float:-6.663687E31)
            r2.W(r11)
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r13) goto L_0x019c
            r11 = 1
            goto L_0x019e
        L_0x019c:
            r11 = r18
        L_0x019e:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r9
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r13 != r12) goto L_0x01a7
            r18 = 1
        L_0x01a7:
            r11 = r11 | r18
            java.lang.Object r12 = r2.D()
            if (r11 != 0) goto L_0x01b5
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x01bd
        L_0x01b5:
            Dh.x$b r12 = new Dh.x$b
            r12.<init>(r5, r0, r7, r15)
            r2.u(r12)
        L_0x01bd:
            nI.p r12 = (nI.p) r12
            r2.P()
            int r10 = r9 >> 12
            r10 = r10 & 14
            U0.P.g(r5, r12, r2, r10)
            Dh.x$c r10 = new Dh.x$c
            r10.<init>(r0)
            r0 = 755163823(0x2d02e2af, float:7.439978E-12)
            r11 = 54
            r12 = 1
            c1.a r0 = c1.c.e(r0, r12, r10, r2, r11)
            Dh.x$d r10 = new Dh.x$d
            r10.<init>(r7, r1, r14, r3)
            r13 = -611642746(0xffffffffdb8b1286, float:-7.8290777E16)
            c1.a r20 = c1.c.e(r13, r12, r10, r2, r11)
            int r10 = r9 >> 3
            r10 = r10 & 14
            r11 = 805309440(0x30000c00, float:4.658318E-10)
            r10 = r10 | r11
            int r9 = r9 << 18
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r11
            r22 = r10 | r9
            r23 = 246(0xf6, float:3.45E-43)
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r9 = r4
            r12 = r0
            r0 = r14
            r14 = r15
            r15 = r16
            r17 = r18
            r19 = r6
            r21 = r2
            O0.C4762x0.a(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23)
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0215
            U0.C4895p.R()
        L_0x0215:
            r10 = r3
            r3 = r6
            r6 = r0
        L_0x0218:
            U0.Y0 r11 = r2.n()
            if (r11 == 0) goto L_0x0231
            Dh.o r12 = new Dh.o
            r0 = r12
            r1 = r24
            r2 = r4
            r4 = r10
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.x.q(KJ.c, androidx.compose.ui.d, s0.T, boolean, java.lang.String, Dh.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C9066d.a aVar) {
        C17542s.j(aVar, "$this$create");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C15987c cVar, androidx.compose.ui.d dVar, C5848T t10, boolean z10, String str, C9066d dVar2, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        q(cVar, dVar, t10, z10, str, dVar2, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(Dh.D r28, QJ.Q r29, x0.C6230C r30, boolean r31, U0.C4889m r32, int r33) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r33
            r0 = 1
            r4 = 1054001444(0x3ed2c924, float:0.41169083)
            r6 = r32
            U0.m r15 = r6.k(r4)
            r6 = r5 & 6
            r7 = 2
            if (r6 != 0) goto L_0x0022
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x001f
            r6 = 4
            goto L_0x0020
        L_0x001f:
            r6 = r7
        L_0x0020:
            r6 = r6 | r5
            goto L_0x0023
        L_0x0022:
            r6 = r5
        L_0x0023:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0033
            boolean r8 = r15.F(r2)
            if (r8 == 0) goto L_0x0030
            r8 = 32
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r6 = r6 | r8
        L_0x0033:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0043
            boolean r8 = r15.V(r3)
            if (r8 == 0) goto L_0x0040
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r6 = r6 | r8
        L_0x0043:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            r13 = r31
            if (r8 != 0) goto L_0x0055
            boolean r8 = r15.b(r13)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r6 = r6 | r8
        L_0x0055:
            r12 = r6
            r6 = r12 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L_0x006a
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            r15.L()
            r22 = r15
            goto L_0x01fa
        L_0x006a:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0076
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.onboarding.composables.PageButton (OnboardingScreen.kt:264)"
            U0.C4895p.S(r4, r12, r6, r8)
        L_0x0076:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            tK.u r6 = tK.C18029u.f147649a
            float r8 = r6.d()
            r11 = 0
            r10 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.k(r4, r8, r11, r7, r10)
            float r18 = r6.a()
            float r20 = r6.d()
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = r6.j()
            androidx.compose.foundation.layout.d$f r6 = r7.n(r6)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r9 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r9)
            int r7 = U0.C4883j.a(r15, r9)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r9 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x00c8
            U0.C4883j.c()
        L_0x00c8:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00d5
            r15.p(r9)
            goto L_0x00d8
        L_0x00d5:
            r15.t()
        L_0x00d8:
            U0.m r9 = U0.F1.a(r15)
            nI.p r14 = r16.c()
            U0.F1.c(r9, r6, r14)
            nI.p r6 = r16.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r16.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0102
            java.lang.Object r8 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x0110
        L_0x0102:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x0110:
            nI.p r6 = r16.d()
            U0.F1.c(r9, r4, r6)
            s0.h r4 = s0.C5862h.f28810a
            if (r1 == 0) goto L_0x0120
            java.util.List r4 = r28.c()
            goto L_0x0121
        L_0x0120:
            r4 = r10
        L_0x0121:
            r6 = 1785878010(0x6a7255fa, float:7.3241515E25)
            r15.W(r6)
            if (r4 != 0) goto L_0x012d
        L_0x0129:
            r22 = r15
            goto L_0x01eb
        L_0x012d:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x0134:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0129
            java.lang.Object r7 = r4.next()
            int r19 = r6 + 1
            if (r6 >= 0) goto L_0x0145
            YH.C16877v.x()
        L_0x0145:
            Dh.b r7 = (Dh.C9064b) r7
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r8, r11, r0, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "OnboardingScreenButtonTag"
            r9.append(r14)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r8, r6)
            SC.N r9 = r7.f()
            IC.e r6 = r7.e()
            int r14 = IC.C13023e.f110931a
            java.lang.String r6 = r6.a(r15, r14)
            r14 = -850822633(0xffffffffcd497a17, float:-2.11263856E8)
            r15.W(r14)
            boolean r14 = r15.F(r7)
            boolean r16 = r15.F(r1)
            r14 = r14 | r16
            boolean r16 = r15.F(r2)
            r14 = r14 | r16
            r0 = r12 & 896(0x380, float:1.256E-42)
            r13 = 256(0x100, float:3.59E-43)
            if (r0 != r13) goto L_0x018e
            r0 = 1
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r0 = r0 | r14
            java.lang.Object r14 = r15.D()
            if (r0 != 0) goto L_0x019e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r14 != r0) goto L_0x01a6
        L_0x019e:
            Dh.v r14 = new Dh.v
            r14.<init>(r7, r1, r2, r3)
            r15.u(r14)
        L_0x01a6:
            r0 = r14
            nI.a r0 = (nI.C17631a) r0
            r15.P()
            r7 = 458752(0x70000, float:6.42848E-40)
            int r14 = r12 << 6
            r17 = r14 & r7
            r18 = 468(0x1d4, float:6.56E-43)
            r14 = 0
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r7 = r8
            r8 = r14
            r24 = 0
            r25 = r10
            r10 = r16
            r26 = r11
            r11 = r31
            r27 = r12
            r12 = r21
            r14 = r13
            r13 = r22
            r21 = r14
            r14 = r23
            r22 = r15
            r15 = r0
            r16 = r22
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r13 = r31
            r6 = r19
            r15 = r22
            r10 = r25
            r11 = r26
            r12 = r27
            r0 = 1
            goto L_0x0134
        L_0x01eb:
            r22.P()
            r22.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01fa
            U0.C4895p.R()
        L_0x01fa:
            U0.Y0 r6 = r22.n()
            if (r6 == 0) goto L_0x0213
            Dh.w r7 = new Dh.w
            r0 = r7
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.x.t(Dh.D, QJ.Q, x0.C, boolean, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(D d10, Q q10, C6230C c10, boolean z10, int i10, C4889m mVar, int i11) {
        t(d10, q10, c10, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C9064b bVar, D d10, Q q10, C6230C c10) {
        if (bVar.d()) {
            bVar.c().invoke(Integer.valueOf(d10.f()));
        } else {
            QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new e(c10, (C17164e<? super e>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(int r22, int r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r22
            r2 = r23
            r4 = r26
            r0 = -1903754645(0xffffffff8e87026b, float:-3.3282398E-30)
            r3 = r25
            U0.m r3 = r3.k(r0)
            r5 = 1
            r6 = r27 & 1
            r7 = 2
            r12 = 4
            if (r6 == 0) goto L_0x0019
            r6 = r4 | 6
            goto L_0x0029
        L_0x0019:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0028
            boolean r6 = r3.d(r1)
            if (r6 == 0) goto L_0x0025
            r6 = r12
            goto L_0x0026
        L_0x0025:
            r6 = r7
        L_0x0026:
            r6 = r6 | r4
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            r8 = r27 & 2
            if (r8 == 0) goto L_0x0030
            r6 = r6 | 48
            goto L_0x0040
        L_0x0030:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0040
            boolean r8 = r3.d(r2)
            if (r8 == 0) goto L_0x003d
            r8 = 32
            goto L_0x003f
        L_0x003d:
            r8 = 16
        L_0x003f:
            r6 = r6 | r8
        L_0x0040:
            r8 = r27 & 4
            if (r8 == 0) goto L_0x0049
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r9 = r24
            goto L_0x005b
        L_0x0049:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0046
            r9 = r24
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r6 = r6 | r10
        L_0x005b:
            r10 = r6 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x006f
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            r3.L()
            r19 = r9
            goto L_0x01e0
        L_0x006f:
            if (r8 == 0) goto L_0x0076
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r19 = r8
            goto L_0x0078
        L_0x0076:
            r19 = r9
        L_0x0078:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0084
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.onboarding.composables.PageIndicator (OnboardingScreen.kt:302)"
            U0.C4895p.S(r0, r6, r8, r9)
        L_0x0084:
            r0 = -202986272(0xfffffffff3e6ace0, float:-3.655196E31)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r20 = U0.C4889m.f14007a
            java.lang.Object r6 = r20.a()
            r11 = 0
            if (r0 != r6) goto L_0x009e
            U0.o0 r0 = U0.C4877g1.a(r11)
            r3.u(r0)
        L_0x009e:
            U0.o0 r0 = (U0.C4894o0) r0
            r3.P()
            tK.v r10 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r6 = r10.a(r3, r9)
            long r14 = r6.m0()
            r17 = 2
            r18 = 0
            r16 = 0
            r13 = r19
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r13, r14, r16, r17, r18)
            r8 = 0
            r13 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r6, r8, r5, r13)
            float r6 = (float) r7
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r5, r6)
            r6 = -202979853(0xfffffffff3e6c5f3, float:-3.656748E31)
            r3.W(r6)
            java.lang.Object r6 = r3.D()
            java.lang.Object r7 = r20.a()
            if (r6 != r7) goto L_0x00e2
            Dh.s r6 = new Dh.s
            r6.<init>(r0)
            r3.u(r6)
        L_0x00e2:
            nI.l r6 = (nI.C17642l) r6
            r3.P()
            androidx.compose.ui.d r5 = androidx.compose.ui.layout.g.a(r5, r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r11)
            int r7 = U0.C4883j.a(r3, r11)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r3.m()
            if (r15 != 0) goto L_0x0110
            U0.C4883j.c()
        L_0x0110:
            r3.I()
            boolean r15 = r3.i()
            if (r15 == 0) goto L_0x011d
            r3.p(r14)
            goto L_0x0120
        L_0x011d:
            r3.t()
        L_0x0120:
            U0.m r14 = U0.F1.a(r3)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r6, r15)
            nI.p r6 = r13.e()
            U0.F1.c(r14, r8, r6)
            nI.p r6 = r13.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x014a
            java.lang.Object r8 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r8 != 0) goto L_0x0158
        L_0x014a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r14.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.w(r7, r6)
        L_0x0158:
            nI.p r6 = r13.d()
            U0.F1.c(r14, r5, r6)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            int r0 = x(r0)
            int r0 = r0 / r2
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r5 = r3.Q(r5)
            c2.d r5 = (c2.d) r5
            float r13 = r5.H(r0)
            int r5 = r0 * r1
            r0 = 0
            r14 = 14
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = r9
            r9 = r3
            r21 = r10
            r10 = r0
            r0 = r11
            r11 = r14
            U0.A1 r5 = m0.C5534c.e(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r6, r13)
            float r7 = (float) r12
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r6, r7)
            r7 = 935559190(0x37c38016, float:2.3305456E-5)
            r3.W(r7)
            boolean r7 = r3.V(r5)
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x01ac
            java.lang.Object r7 = r20.a()
            if (r8 != r7) goto L_0x01b4
        L_0x01ac:
            Dh.t r8 = new Dh.t
            r8.<init>(r5)
            r3.u(r8)
        L_0x01b4:
            nI.l r8 = (nI.C17642l) r8
            r3.P()
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.A.a(r6, r8)
            r6 = r21
            tK.h r6 = r6.a(r3, r15)
            long r6 = r6.p0()
            r8 = 50
            A0.f r8 = A0.g.a(r8)
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.c(r5, r6, r8)
            androidx.compose.foundation.layout.C5077h.a(r5, r3, r0)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e0
            U0.C4895p.R()
        L_0x01e0:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01f9
            Dh.u r7 = new Dh.u
            r0 = r7
            r1 = r22
            r2 = r23
            r3 = r19
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.x.w(int, int, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final int x(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void y(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C4894o0 o0Var, c2.r rVar) {
        y(o0Var, c2.r.h(rVar.k()));
        return C16807N.f139792a;
    }
}
