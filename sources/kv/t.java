package Kv;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import E1.k0;
import E1.m0;
import G1.C4504g;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import c2.h;
import c2.n;
import c2.o;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import jC.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import n1.C5635o;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.C5685c;
import p1.C5747v0;
import p1.C5749w0;
import pI.C17752b;
import r1.C5817c;
import s0.C5834E;
import t0.C5934A;
import uI.C18059h;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u0017\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00058\n@\nX\u0002"}, d2 = {"LKv/x;", "state", "Lt0/A;", "contentScrollState", "Lkotlin/Function1;", "", "LXH/N;", "toolbar", "Ls0/E;", "header", "Lkotlin/Function0;", "stickyContentHeader", "content", "m", "(LKv/x;Lt0/A;LnI/q;LnI/q;LnI/p;LnI/p;LU0/m;I)V", "membershipState", "Lc2/h;", "peekHeight", "stickyHeader", "Landroidx/compose/ui/d;", "modifier", "r", "(LKv/x;Lt0/A;FLnI/p;Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "z", "(LnI/p;LnI/p;LnI/q;Landroidx/compose/ui/d;LU0/m;II)V", "Lp0/c;", "Lc2/n;", "F", "(Lp0/c;)J", "hasStickyHeaderFocus", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f38016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f38017b;

        a(androidx.compose.ui.d dVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f38016a = dVar;
            this.f38017b = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(380320090, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffold.<anonymous> (MembershipScaffold.kt:103)");
                }
                androidx.compose.ui.d dVar = this.f38016a;
                q<C5834E, C4889m, Integer, C16807N> qVar = this.f38017b;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, dVar);
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
                qVar.invoke(D.e(0.0f, 0.0f, 0.0f, g.f37976a.b(), 7, (Object) null), mVar, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f38018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<Boolean, C4889m, Integer, C16807N> f38019b;

        b(x xVar, q<? super Boolean, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f38018a = xVar;
            this.f38019b = qVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(x xVar, r1.f fVar) {
            C17542s.j(fVar, "$this$drawBehind");
            r1.f.q1(fVar, xVar.i(), 0, 0, 0.0f, (r1.g) null, (C5749w0) null, 0, 126, (Object) null);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1153362041, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffold.<anonymous> (MembershipScaffold.kt:109)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                mVar.W(-52149330);
                boolean V10 = mVar.V(this.f38018a);
                x xVar = this.f38018a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new u(xVar);
                    mVar.u(D10);
                }
                mVar.P();
                androidx.compose.ui.d b10 = androidx.compose.ui.draw.b.b(aVar, (C17642l) D10);
                q<Boolean, C4889m, Integer, C16807N> qVar = this.f38019b;
                x xVar2 = this.f38018a;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
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
                F1.c(a12, h10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5079j jVar = C5079j.f18125a;
                qVar.invoke(Boolean.valueOf(xVar2.j()), mVar, 0);
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
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<h, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f38020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5934A f38021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f38022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f38023d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17631a<h> {
            a(Object obj) {
                super(0, obj, x.class, "currentCornerRadius", "currentCornerRadius-D9Ej5fM()F", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return h.m(t());
            }

            public final float t() {
                return ((x) this.receiver).d();
            }
        }

        c(x xVar, C5934A a10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
            this.f38020a = xVar;
            this.f38021b = a10;
            this.f38022c = pVar;
            this.f38023d = pVar2;
        }

        public final void a(float f10, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.c(f10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1636470660, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffold.<anonymous> (MembershipScaffold.kt:115)");
                }
                x xVar = this.f38020a;
                C5934A a10 = this.f38021b;
                p<C4889m, Integer, C16807N> pVar = this.f38022c;
                d.a aVar = androidx.compose.ui.d.f18749a;
                mVar.W(-52133560);
                boolean V10 = mVar.V(xVar);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(xVar);
                    mVar.u(D10);
                }
                mVar.P();
                g gVar = g.f37976a;
                t.r(xVar, a10, f10, pVar, C6630c.c(aVar, (C17631a) ((C18059h) D10), gVar.b(), gVar.a(mVar, 6)), this.f38023d, mVar, (i10 << 6) & 896, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((h) obj).G(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffoldKt$MembershipScaffold$draggableHeaderModifier$2$1", f = "MembershipScaffold.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f38024c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ float f38025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f38026e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ x f38027f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffoldKt$MembershipScaffold$draggableHeaderModifier$2$1$1", f = "MembershipScaffold.kt", l = {90}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f38028c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ x f38029d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f38030e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(x xVar, float f10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f38029d = xVar;
                this.f38030e = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f38029d, this.f38030e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f38028c;
                if (i10 == 0) {
                    y.b(obj);
                    C5685c<d> f11 = this.f38029d.f();
                    float f12 = this.f38030e;
                    this.f38028c = 1;
                    if (f11.H(f12, this) == f10) {
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
        d(Q q10, x xVar, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f38026e = q10;
            this.f38027f = xVar;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            d dVar = new d(this.f38026e, this.f38027f, eVar);
            dVar.f38025d = f10;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f38024c == 0) {
                y.b(obj);
                F0 unused = C16314k.d(this.f38026e, (C17168i) null, (T) null, new a(this.f38027f, this.f38025d, (C17164e<? super a>) null), 3, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Kv/t$e", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffoldKt$ScrollingContent$2$1", f = "MembershipScaffold.kt", l = {160, 161}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f38031c;

        /* renamed from: d  reason: collision with root package name */
        int f38032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5685c<d> f38033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f38034f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C5685c<d> cVar, C4899r0<Boolean> r0Var, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f38033e = cVar;
            this.f38034f = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f38033e, this.f38034f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f38032d;
            if (i10 == 0) {
                y.b(obj);
                Boolean E10 = t.u(this.f38034f);
                if (E10 != null) {
                    if (C17542s.e(E10, kotlin.coroutines.jvm.internal.b.a(true))) {
                        C5685c<d> cVar = this.f38033e;
                        d dVar = d.Docked;
                        this.f38031c = E10;
                        this.f38032d = 1;
                        if (androidx.compose.foundation.gestures.a.l(cVar, dVar, this) == f10) {
                            return f10;
                        }
                    } else {
                        C5685c<d> cVar2 = this.f38033e;
                        d dVar2 = d.Floating;
                        this.f38031c = E10;
                        this.f38032d = 2;
                        if (androidx.compose.foundation.gestures.a.l(cVar2, dVar2, this) == f10) {
                            return f10;
                        }
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                Boolean bool = (Boolean) this.f38031c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<h, C4889m, Integer, C16807N> f38035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m0 f38036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38037c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f38038d;

        g(q<? super h, ? super C4889m, ? super Integer, C16807N> qVar, m0 m0Var, int i10, int i11) {
            this.f38035a = qVar;
            this.f38036b = m0Var;
            this.f38037c = i10;
            this.f38038d = i11;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2046631417, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.SubcomposedScaffold.<anonymous>.<anonymous>.<anonymous> (MembershipScaffold.kt:213)");
                }
                this.f38035a.invoke(h.m(this.f38036b.H(this.f38037c - this.f38038d)), mVar, 0);
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

    /* access modifiers changed from: private */
    public static final J A(p pVar, p pVar2, q qVar, m0 m0Var, C5267b bVar) {
        m0 m0Var2 = m0Var;
        C17542s.j(m0Var2, "$this$SubcomposeLayout");
        p pVar3 = pVar;
        Iterable<H> S02 = m0Var2.S0(C.Header, pVar);
        ArrayList arrayList = new ArrayList(C16877v.y(S02, 10));
        for (H i02 : S02) {
            arrayList.add(i02.i0(bVar.r()));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            int z02 = ((a0) it.next()).z0();
            while (it.hasNext()) {
                int z03 = ((a0) it.next()).z0();
                if (z02 < z03) {
                    z02 = z03;
                }
            }
            Iterable<H> S03 = m0Var2.S0(C.Toolbar, pVar2);
            ArrayList arrayList2 = new ArrayList(C16877v.y(S03, 10));
            for (H i03 : S03) {
                arrayList2.add(i03.i0(bVar.r()));
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                int z04 = ((a0) it2.next()).z0();
                while (it2.hasNext()) {
                    int z05 = ((a0) it2.next()).z0();
                    if (z04 < z05) {
                        z04 = z05;
                    }
                }
                Iterable<H> S04 = m0Var2.S0(C.Content, c1.c.c(2046631417, true, new g(qVar, m0Var2, z02, z04)));
                ArrayList arrayList3 = new ArrayList(C16877v.y(S04, 10));
                for (H i04 : S04) {
                    arrayList3.add(i04.i0(C5267b.d(bVar.r(), 0, 0, 0, C5267b.k(bVar.r()) - z04, 7, (Object) null)));
                }
                return K.v0(m0Var, C5267b.l(bVar.r()), C5267b.k(bVar.r()), (Map) null, new j(arrayList, arrayList2, arrayList3, z04), 4, (Object) null);
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: private */
    public static final C16807N B(List list, List list2, List list3, int i10, a0.a aVar) {
        C17542s.j(aVar, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.a.m(aVar, (a0) it.next(), 0, 0, 0.0f, 4, (Object) null);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            a0.a.m(aVar, (a0) it2.next(), 0, 0, 0.0f, 4, (Object) null);
        }
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            a0.a.m(aVar, (a0) it3.next(), 0, i10, 0.0f, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(p pVar, p pVar2, q qVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(pVar, pVar2, qVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final long F(C5685c<?> cVar) {
        return o.a(0, C17752b.e(cVar.A()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: nI.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(Kv.x r28, t0.C5934A r29, nI.q<? super java.lang.Boolean, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r30, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, U0.C4889m r34, int r35) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r35
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "contentScrollState"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "header"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "stickyContentHeader"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = 783138077(0x2eadbd1d, float:7.9007224E-11)
            r8 = r34
            U0.m r15 = r8.k(r0)
            r8 = r7 & 6
            r9 = 4
            if (r8 != 0) goto L_0x0045
            boolean r8 = r15.V(r1)
            if (r8 == 0) goto L_0x0042
            r8 = r9
            goto L_0x0043
        L_0x0042:
            r8 = 2
        L_0x0043:
            r8 = r8 | r7
            goto L_0x0046
        L_0x0045:
            r8 = r7
        L_0x0046:
            r10 = r7 & 48
            if (r10 != 0) goto L_0x0056
            boolean r10 = r15.V(r2)
            if (r10 == 0) goto L_0x0053
            r10 = 32
            goto L_0x0055
        L_0x0053:
            r10 = 16
        L_0x0055:
            r8 = r8 | r10
        L_0x0056:
            r10 = r7 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0066
            boolean r10 = r15.F(r3)
            if (r10 == 0) goto L_0x0063
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r8 = r8 | r10
        L_0x0066:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0076
            boolean r10 = r15.F(r4)
            if (r10 == 0) goto L_0x0073
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r8 = r8 | r10
        L_0x0076:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0086
            boolean r10 = r15.F(r5)
            if (r10 == 0) goto L_0x0083
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0085
        L_0x0083:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0085:
            r8 = r8 | r10
        L_0x0086:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r7
            if (r10 != 0) goto L_0x0097
            boolean r10 = r15.F(r6)
            if (r10 == 0) goto L_0x0094
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r8 = r8 | r10
        L_0x0097:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r8
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00ac
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            r15.L()
            goto L_0x01e2
        L_0x00ac:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00b8
            r10 = -1
            java.lang.String r11 = "com.ingka.ikea.membership.impl.compose.member.scaffold.MembershipScaffold (MembershipScaffold.kt:72)"
            U0.C4895p.S(r0, r8, r10, r11)
        L_0x00b8:
            java.lang.Object r0 = r15.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r11 = r10.a()
            if (r0 != r11) goto L_0x00d3
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r15)
            U0.B r11 = new U0.B
            r11.<init>(r0)
            r15.u(r11)
            r0 = r11
        L_0x00d3:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            r11 = 0
            r12 = 0
            r13 = 1
            jC.i r14 = jC.k.c(r11, r15, r12, r13)
            jC.b r13 = r28.g()
            r11 = 2095095587(0x7ce09f23, float:9.3304174E36)
            r15.W(r11)
            boolean r11 = r15.F(r14)
            r8 = r8 & 14
            if (r8 != r9) goto L_0x00f5
            r16 = 1
            goto L_0x00f7
        L_0x00f5:
            r16 = r12
        L_0x00f7:
            r11 = r11 | r16
            java.lang.Object r9 = r15.D()
            if (r11 != 0) goto L_0x0105
            java.lang.Object r11 = r10.a()
            if (r9 != r11) goto L_0x010d
        L_0x0105:
            Kv.h r9 = new Kv.h
            r9.<init>(r14, r1)
            r15.u(r9)
        L_0x010d:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            U0.P.c(r13, r9, r15, r12)
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            p0.v r19 = p0.v.Vertical
            r9 = 2095103268(0x7ce0bd24, float:9.335286E36)
            r15.W(r9)
            r9 = 4
            if (r8 != r9) goto L_0x0124
            r9 = 1
            goto L_0x0125
        L_0x0124:
            r9 = r12
        L_0x0125:
            java.lang.Object r11 = r15.D()
            if (r9 != 0) goto L_0x0131
            java.lang.Object r9 = r10.a()
            if (r11 != r9) goto L_0x0139
        L_0x0131:
            Kv.k r11 = new Kv.k
            r11.<init>(r1)
            r15.u(r11)
        L_0x0139:
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            p0.r r18 = p0.q.i(r11, r15, r12)
            r9 = 2095106997(0x7ce0cbb5, float:9.3376493E36)
            r15.W(r9)
            boolean r9 = r15.F(r0)
            r11 = 4
            if (r8 != r11) goto L_0x0151
            r11 = 1
            goto L_0x0152
        L_0x0151:
            r11 = r12
        L_0x0152:
            r9 = r9 | r11
            java.lang.Object r11 = r15.D()
            if (r9 != 0) goto L_0x015f
            java.lang.Object r9 = r10.a()
            if (r11 != r9) goto L_0x0168
        L_0x015f:
            Kv.t$d r11 = new Kv.t$d
            r9 = 0
            r11.<init>(r0, r1, r9)
            r15.u(r11)
        L_0x0168:
            r24 = r11
            nI.q r24 = (nI.q) r24
            r15.P()
            r26 = 188(0xbc, float:2.63E-43)
            r27 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            androidx.compose.ui.d r0 = p0.q.h(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = 2095112522(0x7ce0e14a, float:9.341151E36)
            r15.W(r9)
            r9 = 4
            if (r8 != r9) goto L_0x018b
            r12 = 1
        L_0x018b:
            java.lang.Object r8 = r15.D()
            if (r12 != 0) goto L_0x0197
            java.lang.Object r9 = r10.a()
            if (r8 != r9) goto L_0x019f
        L_0x0197:
            Kv.l r8 = new Kv.l
            r8.<init>(r1)
            r15.u(r8)
        L_0x019f:
            nI.l r8 = (nI.C17642l) r8
            r15.P()
            androidx.compose.ui.d r0 = androidx.compose.ui.draw.b.d(r0, r8)
            Kv.t$a r8 = new Kv.t$a
            r8.<init>(r0, r4)
            r0 = 380320090(0x16ab395a, float:2.7662734E-25)
            r9 = 54
            r10 = 1
            c1.a r8 = c1.c.e(r0, r10, r8, r15, r9)
            Kv.t$b r0 = new Kv.t$b
            r0.<init>(r1, r3)
            r11 = 1153362041(0x44bee879, float:1527.2648)
            c1.a r0 = c1.c.e(r11, r10, r0, r15, r9)
            Kv.t$c r11 = new Kv.t$c
            r11.<init>(r1, r2, r5, r6)
            r12 = 1636470660(0x618a8f84, float:3.19499E20)
            c1.a r10 = c1.c.e(r12, r10, r11, r15, r9)
            r13 = 438(0x1b6, float:6.14E-43)
            r14 = 8
            r11 = 0
            r9 = r0
            r12 = r15
            z(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e2
            U0.C4895p.R()
        L_0x01e2:
            U0.Y0 r8 = r15.n()
            if (r8 == 0) goto L_0x01ff
            Kv.m r9 = new Kv.m
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Kv.t.m(Kv.x, t0.A, nI.q, nI.q, nI.p, nI.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final L n(i iVar, x xVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        iVar.a().a(xVar.g());
        return new e();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(x xVar, float f10) {
        xVar.f().m(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(x xVar, C5817c cVar) {
        C17542s.j(cVar, "$this$drawWithContent");
        cVar.V1();
        long e10 = xVar.e();
        if (C5747v0.r(e10) > 0.0f) {
            r1.f.q1(cVar, e10, 0, 0, 0.0f, (r1.g) null, (C5749w0) null, 0, 126, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(x xVar, C5934A a10, q qVar, q qVar2, p pVar, p pVar2, int i10, C4889m mVar, int i11) {
        m(xVar, a10, qVar, qVar2, pVar, pVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(Kv.x r24, t0.C5934A r25, float r26, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, androidx.compose.ui.d r28, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r3 = r26
            r4 = r27
            r6 = r29
            r7 = r31
            r0 = 16
            r1 = 32
            r2 = 4
            r5 = -136292616(0xfffffffff7e056f8, float:-9.1003E33)
            r8 = r30
            U0.m r8 = r8.k(r5)
            r9 = 1
            r10 = r32 & 1
            r11 = 2
            if (r10 == 0) goto L_0x0022
            r10 = r7 | 6
            r12 = r10
            r10 = r24
            goto L_0x0036
        L_0x0022:
            r10 = r7 & 6
            if (r10 != 0) goto L_0x0033
            r10 = r24
            boolean r12 = r8.V(r10)
            if (r12 == 0) goto L_0x0030
            r12 = r2
            goto L_0x0031
        L_0x0030:
            r12 = r11
        L_0x0031:
            r12 = r12 | r7
            goto L_0x0036
        L_0x0033:
            r10 = r24
            r12 = r7
        L_0x0036:
            r13 = r32 & 2
            if (r13 == 0) goto L_0x003f
            r12 = r12 | 48
        L_0x003c:
            r13 = r25
            goto L_0x004f
        L_0x003f:
            r13 = r7 & 48
            if (r13 != 0) goto L_0x003c
            r13 = r25
            boolean r14 = r8.V(r13)
            if (r14 == 0) goto L_0x004d
            r14 = r1
            goto L_0x004e
        L_0x004d:
            r14 = r0
        L_0x004e:
            r12 = r12 | r14
        L_0x004f:
            r2 = r32 & 4
            r14 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0058
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0058:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0067
            boolean r2 = r8.c(r3)
            if (r2 == 0) goto L_0x0064
            r2 = r14
            goto L_0x0066
        L_0x0064:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r12 = r12 | r2
        L_0x0067:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x006e
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r8.F(r4)
            if (r2 == 0) goto L_0x007b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r12 = r12 | r2
        L_0x007e:
            r0 = r32 & 16
            if (r0 == 0) goto L_0x0087
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r2 = r28
            goto L_0x0099
        L_0x0087:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0084
            r2 = r28
            boolean r15 = r8.V(r2)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r12 = r12 | r15
        L_0x0099:
            r1 = r32 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a1
            r12 = r12 | r15
            goto L_0x00b1
        L_0x00a1:
            r1 = r7 & r15
            if (r1 != 0) goto L_0x00b1
            boolean r1 = r8.F(r6)
            if (r1 == 0) goto L_0x00ae
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r12 = r12 | r1
        L_0x00b1:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r12
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r15) goto L_0x00c7
            boolean r1 = r8.l()
            if (r1 != 0) goto L_0x00c1
            goto L_0x00c7
        L_0x00c1:
            r8.L()
            r5 = r2
            goto L_0x02b8
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00cd
        L_0x00cc:
            r0 = r2
        L_0x00cd:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00d9
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.membership.impl.compose.member.scaffold.ScrollingContent (MembershipScaffold.kt:141)"
            U0.C4895p.S(r5, r12, r1, r2)
        L_0x00d9:
            p0.c r1 = r24.f()
            r2 = -1374176885(0xffffffffae17b98b, float:-3.449822E-11)
            r8.W(r2)
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r2 = r8.Q(r2)
            c2.d r2 = (c2.d) r2
            r5 = 1379614606(0x523b3f8e, float:2.01056289E11)
            r8.W(r5)
            boolean r5 = r8.V(r2)
            r15 = r12 & 896(0x380, float:1.256E-42)
            r9 = 0
            if (r15 != r14) goto L_0x00fe
            r14 = 1
            goto L_0x00ff
        L_0x00fe:
            r14 = r9
        L_0x00ff:
            r5 = r5 | r14
            java.lang.Object r14 = r8.D()
            if (r5 != 0) goto L_0x010e
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r14 != r5) goto L_0x0116
        L_0x010e:
            Kv.p r14 = new Kv.p
            r14.<init>(r2, r3)
            r8.u(r14)
        L_0x0116:
            nI.l r14 = (nI.C17642l) r14
            r8.P()
            p0.o r2 = androidx.compose.foundation.gestures.a.a(r14)
            r8.P()
            r5 = -1374171182(0xffffffffae17cfd2, float:-3.4518007E-11)
            r8.W(r5)
            boolean r5 = r8.V(r1)
            boolean r14 = r8.F(r2)
            r5 = r5 | r14
            java.lang.Object r14 = r8.D()
            if (r5 != 0) goto L_0x013f
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r14 != r5) goto L_0x0147
        L_0x013f:
            Kv.q r14 = new Kv.q
            r14.<init>(r1, r2)
            r8.u(r14)
        L_0x0147:
            nI.a r14 = (nI.C17631a) r14
            r8.P()
            U0.P.i(r14, r8, r9)
            r2 = -1374167726(0xffffffffae17dd52, float:-3.4529997E-11)
            r8.W(r2)
            java.lang.Object r2 = r8.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r14 = r5.a()
            r15 = 0
            if (r2 != r14) goto L_0x0169
            U0.r0 r2 = U0.u1.e(r15, r15, r11, r15)
            r8.u(r2)
        L_0x0169:
            U0.r0 r2 = (U0.C4899r0) r2
            r8.P()
            java.lang.Boolean r14 = u(r2)
            r11 = -1374164855(0xffffffffae17e889, float:-3.4539958E-11)
            r8.W(r11)
            boolean r11 = r8.V(r1)
            java.lang.Object r9 = r8.D()
            if (r11 != 0) goto L_0x0188
            java.lang.Object r11 = r5.a()
            if (r9 != r11) goto L_0x0190
        L_0x0188:
            Kv.t$f r9 = new Kv.t$f
            r9.<init>(r1, r2, r15)
            r8.u(r9)
        L_0x0190:
            nI.p r9 = (nI.p) r9
            r8.P()
            r11 = 0
            U0.P.g(r14, r9, r8, r11)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r9 = m1.e.b(r9)
            r11 = 0
            r14 = 1
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.f(r9, r11, r14, r15)
            r11 = -1374155421(0xffffffffae180d63, float:-3.457269E-11)
            r8.W(r11)
            boolean r11 = r8.V(r1)
            java.lang.Object r14 = r8.D()
            if (r11 != 0) goto L_0x01bb
            java.lang.Object r11 = r5.a()
            if (r14 != r11) goto L_0x01c3
        L_0x01bb:
            Kv.r r14 = new Kv.r
            r14.<init>(r1)
            r8.u(r14)
        L_0x01c3:
            nI.l r14 = (nI.C17642l) r14
            r8.P()
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.A.a(r9, r14)
            r11 = 0
            z1.a r14 = Kv.f.a(r1, r8, r11)
            r11 = 2
            androidx.compose.ui.d r15 = androidx.compose.ui.input.nestedscroll.a.b(r9, r14, r15, r11, r15)
            p0.v r17 = p0.v.Vertical
            boolean r9 = r25.c()
            r11 = 1
            r18 = r9 ^ 1
            r22 = 56
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r1
            androidx.compose.ui.d r1 = androidx.compose.foundation.gestures.a.j(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.d r1 = r1.s(r0)
            androidx.compose.ui.d r1 = androidx.compose.foundation.FocusableKt.a(r1)
            r9 = -1374142486(0xffffffffae183fea, float:-3.4617566E-11)
            r8.W(r9)
            java.lang.Object r9 = r8.D()
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x020f
            Kv.s r9 = new Kv.s
            r9.<init>(r2)
            r8.u(r9)
        L_0x020f:
            nI.l r9 = (nI.C17642l) r9
            r8.P()
            androidx.compose.ui.d r1 = androidx.compose.ui.focus.b.a(r1, r9)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r9 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r5, r8, r9)
            int r5 = U0.C4883j.a(r8, r9)
            U0.y r9 = r8.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r8, r1)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r14 = r11.a()
            U0.f r15 = r8.m()
            if (r15 != 0) goto L_0x0244
            U0.C4883j.c()
        L_0x0244:
            r8.I()
            boolean r15 = r8.i()
            if (r15 == 0) goto L_0x0251
            r8.p(r14)
            goto L_0x0254
        L_0x0251:
            r8.t()
        L_0x0254:
            U0.m r14 = U0.F1.a(r8)
            nI.p r15 = r11.c()
            U0.F1.c(r14, r2, r15)
            nI.p r2 = r11.e()
            U0.F1.c(r14, r9, r2)
            nI.p r2 = r11.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x027e
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x028c
        L_0x027e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r14.u(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14.w(r5, r2)
        L_0x028c:
            nI.p r2 = r11.d()
            U0.F1.c(r14, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            int r1 = r12 >> 9
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.invoke(r8, r1)
            int r1 = r12 >> 15
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.invoke(r8, r1)
            r8.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02b7
            U0.C4895p.R()
        L_0x02b7:
            r5 = r0
        L_0x02b8:
            U0.Y0 r9 = r8.n()
            if (r9 == 0) goto L_0x02d5
            Kv.i r11 = new Kv.i
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x02d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Kv.t.r(Kv.x, t0.A, float, nI.p, androidx.compose.ui.d, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N s(c2.d dVar, float f10, p0.p pVar) {
        C17542s.j(pVar, "$this$DraggableAnchors");
        pVar.a(d.Docked, 0.0f);
        pVar.a(d.Floating, dVar.H1(f10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C5685c cVar, p0.o oVar) {
        cVar.J(oVar, cVar.w());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Boolean u(C4899r0<Boolean> r0Var) {
        return r0Var.getValue();
    }

    private static final void v(C4899r0<Boolean> r0Var, Boolean bool) {
        r0Var.setValue(bool);
    }

    /* access modifiers changed from: private */
    public static final n w(C5685c cVar, c2.d dVar) {
        C17542s.j(dVar, "$this$offset");
        return n.b(F(cVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C4899r0 r0Var, C5635o oVar) {
        Boolean bool;
        C17542s.j(oVar, "it");
        if (oVar.b()) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
            if (u(r0Var) == null) {
                bool = null;
            }
        }
        v(r0Var, bool);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(x xVar, C5934A a10, float f10, p pVar, androidx.compose.ui.d dVar, p pVar2, int i10, int i11, C4889m mVar, int i12) {
        r(xVar, a10, f10, pVar, dVar, pVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void z(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super h, ? super C4889m, ? super Integer, C16807N> qVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(14921076);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(qVar) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(dVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(14921076, i12, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.SubcomposedScaffold (MembershipScaffold.kt:200)");
            }
            k10.W(1581933075);
            boolean z10 = true;
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            if ((i12 & 896) != 256) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new n(pVar, pVar2, qVar);
                k10.u(D10);
            }
            k10.P();
            k0.b(dVar, (p) D10, k10, (i12 >> 9) & 14, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new o(pVar, pVar2, qVar, dVar2, i10, i11));
        }
    }
}
