package Iv;

import E1.C4488v;
import Jv.C;
import Mv.k;
import QJ.Q;
import Rv.c;
import Rv.j;
import Rv.m;
import SC.C13575d;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.J;
import androidx.recyclerview.widget.RecyclerView;
import dI.C17164e;
import e5.C7786b;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import l0.i;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5834E;
import t0.C5934A;
import uI.C18059h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00168\nX\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"LRv/m$a;", "uiState", "Lkotlin/Function1;", "LRv/c;", "LXH/N;", "onEvent", "Le5/b;", "windowSizeClass", "h", "(LRv/m$a;LnI/l;Le5/b;LU0/m;II)V", "LRv/j;", "selectedTab", "Lt0/A;", "overviewScrollState", "yourHomeScrollState", "settingsScrollState", "e", "(LRv/j;LnI/l;Lt0/A;Lt0/A;Lt0/A;LU0/m;I)V", "Landroidx/compose/animation/d;", "Ll0/i;", "s", "(Landroidx/compose/animation/d;)Ll0/i;", "", "scrollToTop", "showWalletInToolbar", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<androidx.compose.animation.d<j>, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37199a = new a();

        a() {
            super(1, r.class, "transition", "transition(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ContentTransform;", 1);
        }

        /* renamed from: t */
        public final i invoke(androidx.compose.animation.d<j> dVar) {
            C17542s.j(dVar, "p0");
            return r.s(dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements nI.r<C5507b, j, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f37200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5934A f37201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5934A f37202c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f37203d;

        b(C17642l<? super Rv.c, C16807N> lVar, C5934A a10, C5934A a11, C5934A a12) {
            this.f37200a = lVar;
            this.f37201b = a10;
            this.f37202c = a11;
            this.f37203d = a12;
        }

        public final void a(C5507b bVar, j jVar, C4889m mVar, int i10) {
            C17542s.j(bVar, "$this$AnimatedContent");
            C17542s.j(jVar, "tab");
            if (C4895p.J()) {
                C4895p.S(-1470420225, i10, -1, "com.ingka.ikea.membership.impl.compose.member.MembershipContent.<anonymous> (MembershipScreen.kt:170)");
            }
            if (jVar instanceof j.a) {
                mVar.W(1960914421);
                C.h(((j.a) jVar).c(), this.f37200a, J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), this.f37201b, mVar, 384, 0);
                mVar.P();
            } else if (jVar instanceof j.c) {
                mVar.W(1961209045);
                k.d(((j.c) jVar).c(), this.f37200a, J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), this.f37202c, mVar, 384, 0);
                mVar.P();
            } else if (jVar instanceof j.b) {
                mVar.W(1961503886);
                Lv.c.c(((j.b) jVar).c(), this.f37200a, J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), this.f37203d, mVar, 384, 0);
                mVar.P();
            } else {
                mVar.W(1310180292);
                mVar.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, (j) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.compose.member.MembershipScreenKt$MembershipScreen$1$1", f = "MembershipScreen.kt", l = {78}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f37204c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f37205d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f37206e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5934A a10, C4899r0<Boolean> r0Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f37205d = a10;
            this.f37206e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f37205d, this.f37206e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f37204c;
            if (i10 == 0) {
                y.b(obj);
                if (r.j(this.f37206e)) {
                    C5934A a10 = this.f37205d;
                    this.f37204c = 1;
                    if (C5934A.L(a10, 0, 0, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.k(this.f37206e, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<Boolean, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m.a f37207a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f37208b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f37209c;

        d(m.a aVar, C17642l<? super Rv.c, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f37207a = aVar;
            this.f37208b = lVar;
            this.f37209c = r0Var;
        }

        public final void a(boolean z10, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.b(z10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1156982403, i10, -1, "com.ingka.ikea.membership.impl.compose.member.MembershipScreen.<anonymous> (MembershipScreen.kt:102)");
                }
                Es.a b10 = this.f37207a.b();
                boolean z11 = z10;
                Ev.i.m(z11, this.f37208b, J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), r.l(this.f37209c), b10, (C17642l<? super C4488v, C16807N>) null, C13575d.a(mVar, 0).L0(), mVar, (i10 & 14) | 384, 32);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m.a f37210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f37211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37212c;

        e(m.a aVar, C17642l<? super Rv.c, C16807N> lVar, boolean z10) {
            this.f37210a = aVar;
            this.f37211b = lVar;
            this.f37212c = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(c.a.g.Login);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(c.a.g.Signup);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5834E r14, U0.C4889m r15, int r16) {
            /*
                r13 = this;
                r0 = r13
                r7 = r14
                r11 = r15
                java.lang.String r1 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r14, r1)
                r1 = r16 & 6
                if (r1 != 0) goto L_0x0018
                boolean r1 = r15.V(r14)
                if (r1 == 0) goto L_0x0014
                r1 = 4
                goto L_0x0015
            L_0x0014:
                r1 = 2
            L_0x0015:
                r1 = r16 | r1
                goto L_0x001a
            L_0x0018:
                r1 = r16
            L_0x001a:
                r2 = r1 & 19
                r3 = 18
                if (r2 != r3) goto L_0x002c
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0027
                goto L_0x002c
            L_0x0027:
                r15.L()
                goto L_0x010e
            L_0x002c:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x003b
                r2 = -1
                java.lang.String r4 = "com.ingka.ikea.membership.impl.compose.member.MembershipScreen.<anonymous> (MembershipScreen.kt:112)"
                r5 = 145767495(0x8b03c47, float:1.0606786E-33)
                U0.C4895p.S(r5, r1, r2, r4)
            L_0x003b:
                Rv.m$a r2 = r0.f37210a
                boolean r4 = r2 instanceof Rv.m.b
                r5 = 0
                r6 = 1
                r8 = 0
                if (r4 == 0) goto L_0x00bb
                r2 = 677372155(0x285fe0fb, float:1.2427772E-14)
                r15.W(r2)
                r2 = 437495072(0x1a13a520, float:3.0532274E-23)
                r15.W(r2)
                nI.l<Rv.c, XH.N> r2 = r0.f37211b
                boolean r2 = r15.V(r2)
                nI.l<Rv.c, XH.N> r3 = r0.f37211b
                java.lang.Object r4 = r15.D()
                if (r2 != 0) goto L_0x0066
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x006e
            L_0x0066:
                Iv.s r4 = new Iv.s
                r4.<init>(r3)
                r15.u(r4)
            L_0x006e:
                r2 = r4
                nI.a r2 = (nI.C17631a) r2
                r15.P()
                r3 = 437497761(0x1a13afa1, float:3.054076E-23)
                r15.W(r3)
                nI.l<Rv.c, XH.N> r3 = r0.f37211b
                boolean r3 = r15.V(r3)
                nI.l<Rv.c, XH.N> r4 = r0.f37211b
                java.lang.Object r9 = r15.D()
                if (r3 != 0) goto L_0x0090
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r9 != r3) goto L_0x0098
            L_0x0090:
                Iv.t r9 = new Iv.t
                r9.<init>(r4)
                r15.u(r9)
            L_0x0098:
                r3 = r9
                nI.a r3 = (nI.C17631a) r3
                r15.P()
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r8, r6, r5)
                int r1 = r1 << 9
                r1 = r1 & 7168(0x1c00, float:1.0045E-41)
                r8 = r1 | 384(0x180, float:5.38E-43)
                r9 = 16
                r5 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r14
                r6 = r15
                r7 = r8
                r8 = r9
                Gv.h.j(r1, r2, r3, r4, r5, r6, r7, r8)
                r15.P()
                goto L_0x0105
            L_0x00bb:
                boolean r2 = r2 instanceof Rv.m.d
                if (r2 == 0) goto L_0x010f
                r2 = 677783618(0x28662842, float:1.2776294E-14)
                r15.W(r2)
                Rv.m$a r2 = r0.f37210a
                Rv.m$d r2 = (Rv.m.d) r2
                Rv.n$c r2 = r2.e()
                Rv.m$a r4 = r0.f37210a
                Rv.m$d r4 = (Rv.m.d) r4
                IC.e r4 = r4.k()
                int r9 = IC.C13023e.f110931a
                java.lang.String r4 = r4.a(r15, r9)
                Rv.m$a r9 = r0.f37210a
                Rv.m$d r9 = (Rv.m.d) r9
                KJ.c r9 = r9.j()
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r10, r8, r6, r5)
                boolean r5 = r0.f37212c
                nI.l<Rv.c, XH.N> r8 = r0.f37211b
                r10 = 3670016(0x380000, float:5.142788E-39)
                int r1 = r1 << r3
                r1 = r1 & r10
                r3 = 196608(0x30000, float:2.75506E-40)
                r10 = r1 | r3
                r12 = 0
                r1 = r2
                r2 = r4
                r3 = r9
                r4 = r5
                r5 = r8
                r7 = r14
                r8 = r15
                r9 = r10
                r10 = r12
                Iv.m.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r15.P()
            L_0x0105:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x010e
                U0.C4895p.R()
            L_0x010e:
                return
            L_0x010f:
                r1 = 437491490(0x1a139722, float:3.0520972E-23)
                r15.W(r1)
                r15.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Iv.r.e.c(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m.a f37213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f37214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f37215c;

        f(m.a aVar, j jVar, C17642l<? super Rv.c, C16807N> lVar) {
            this.f37213a = aVar;
            this.f37214b = jVar;
            this.f37215c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, Rv.l lVar2) {
            C17542s.j(lVar2, "it");
            lVar.invoke(new c.i(lVar2));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                r5 = r20
                r1 = r21
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r20.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r20.L()
                goto L_0x009f
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.membership.impl.compose.member.MembershipScreen.<anonymous> (MembershipScreen.kt:135)"
                r4 = -1030375095(0xffffffffc295b949, float:-74.861885)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                Rv.m$a r1 = r0.f37213a
                KJ.c r1 = r1.d()
                Rv.m$a r2 = r0.f37213a
                KJ.c r2 = r2.d()
                Rv.j r3 = r0.f37214b
                Rv.l r3 = r3.a()
                int r2 = r2.indexOf(r3)
                r3 = 437528728(0x1a142898, float:3.0638474E-23)
                r5.W(r3)
                nI.l<Rv.c, XH.N> r3 = r0.f37215c
                boolean r3 = r5.V(r3)
                nI.l<Rv.c, XH.N> r4 = r0.f37215c
                java.lang.Object r6 = r20.D()
                if (r3 != 0) goto L_0x0058
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x0060
            L_0x0058:
                Iv.u r6 = new Iv.u
                r6.<init>(r4)
                r5.u(r6)
            L_0x0060:
                r3 = r6
                nI.l r3 = (nI.C17642l) r3
                r20.P()
                androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
                r4 = 0
                tK.h r4 = SC.C13575d.a(r5, r4)
                long r7 = r4.k0()
                r10 = 2
                r11 = 0
                r9 = 0
                androidx.compose.ui.d r12 = androidx.compose.foundation.b.d(r6, r7, r9, r10, r11)
                r4 = 4
                float r4 = (float) r4
                float r14 = c2.h.B(r4)
                r4 = 24
                float r4 = (float) r4
                float r16 = c2.h.B(r4)
                r17 = 5
                r18 = 0
                r13 = 0
                r15 = 0
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r12, r13, r14, r15, r16, r17, r18)
                r6 = 0
                r7 = 0
                r5 = r20
                Iv.B.f(r1, r2, r3, r4, r5, r6, r7)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x009f
                U0.C4895p.R()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Iv.r.f.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f37216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f37217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5934A f37218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f37219d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5934A f37220e;

        g(j jVar, C17642l<? super Rv.c, C16807N> lVar, C5934A a10, C5934A a11, C5934A a12) {
            this.f37216a = jVar;
            this.f37217b = lVar;
            this.f37218c = a10;
            this.f37219d = a11;
            this.f37220e = a12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1423374040, i10, -1, "com.ingka.ikea.membership.impl.compose.member.MembershipScreen.<anonymous> (MembershipScreen.kt:145)");
                }
                r.e(this.f37216a, this.f37217b, this.f37218c, this.f37219d, this.f37220e, mVar, 0);
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
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Rv.l[] r0 = Rv.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rv.l r1 = Rv.l.Overview     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Rv.l r1 = Rv.l.YourHome     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Rv.l r1 = Rv.l.Settings     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f37221a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Iv.r.h.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final void e(j jVar, C17642l<? super Rv.c, C16807N> lVar, C5934A a10, C5934A a11, C5934A a12, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        j jVar2 = jVar;
        C17642l<? super Rv.c, C16807N> lVar2 = lVar;
        C5934A a13 = a10;
        C5934A a14 = a11;
        C5934A a15 = a12;
        int i12 = i10;
        C4889m k10 = mVar.k(-1824737942);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(jVar2) : k10.F(jVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(a13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(a14) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(a15) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1824737942, i11, -1, "com.ingka.ikea.membership.impl.compose.member.MembershipContent (MembershipScreen.kt:163)");
            }
            k10.W(-670399451);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = a.f37199a;
                k10.u(D10);
            }
            k10.P();
            C17642l lVar3 = (C17642l) ((C18059h) D10);
            k10.W(-670400928);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new p();
                k10.u(D11);
            }
            k10.P();
            mVar2 = k10;
            androidx.compose.animation.a.a(jVar, (androidx.compose.ui.d) null, lVar3, (C5437c) null, "tab content transition", (C17642l) D11, c1.c.e(-1470420225, true, new b(lVar2, a13, a14, a15), k10, 54), k10, (i11 & 14) | 1794432, 10);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new q(jVar, lVar, a10, a11, a12, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final Object f(j jVar) {
        C17542s.j(jVar, "tab");
        return jVar.a();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(j jVar, C17642l lVar, C5934A a10, C5934A a11, C5934A a12, int i10, C4889m mVar, int i11) {
        e(jVar, lVar, a10, a11, a12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        if ((r26 & 4) != 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        if (r2 != false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(Rv.m.a r21, nI.C17642l<? super Rv.c, XH.C16807N> r22, e5.C7786b r23, U0.C4889m r24, int r25, int r26) {
        /*
            r1 = r21
            r8 = r22
            r9 = r25
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = 1955553894(0x748f6266, float:9.088064E31)
            r2 = r24
            U0.m r7 = r2.k(r0)
            r2 = r26 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0021
            r2 = r9 | 6
            goto L_0x003a
        L_0x0021:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0039
            r2 = r9 & 8
            if (r2 != 0) goto L_0x002e
            boolean r2 = r7.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r2 = r7.F(r1)
        L_0x0032:
            if (r2 == 0) goto L_0x0036
            r2 = 4
            goto L_0x0037
        L_0x0036:
            r2 = r3
        L_0x0037:
            r2 = r2 | r9
            goto L_0x003a
        L_0x0039:
            r2 = r9
        L_0x003a:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0041
            r2 = r2 | 48
            goto L_0x0051
        L_0x0041:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0051
            boolean r4 = r7.F(r8)
            if (r4 == 0) goto L_0x004e
            r4 = 32
            goto L_0x0050
        L_0x004e:
            r4 = 16
        L_0x0050:
            r2 = r2 | r4
        L_0x0051:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006a
            r4 = r26 & 4
            if (r4 != 0) goto L_0x0064
            r4 = r23
            boolean r5 = r7.F(r4)
            if (r5 == 0) goto L_0x0066
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0064:
            r4 = r23
        L_0x0066:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r2 = r2 | r5
            goto L_0x006c
        L_0x006a:
            r4 = r23
        L_0x006c:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0080
            boolean r5 = r7.l()
            if (r5 != 0) goto L_0x0079
            goto L_0x0080
        L_0x0079:
            r7.L()
            r3 = r4
            r8 = r7
            goto L_0x0202
        L_0x0080:
            r7.G()
            r5 = r9 & 1
            r6 = 0
            if (r5 == 0) goto L_0x009b
            boolean r5 = r7.O()
            if (r5 == 0) goto L_0x008f
            goto L_0x009b
        L_0x008f:
            r7.L()
            r5 = r26 & 4
            if (r5 == 0) goto L_0x0098
        L_0x0096:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0098:
            r18 = r4
            goto L_0x00a8
        L_0x009b:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x0098
            P0.e r4 = P0.b.b(r7, r6)
            e5.b r4 = r4.a()
            goto L_0x0096
        L_0x00a8:
            r7.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b7
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.membership.impl.compose.member.MembershipScreen (MembershipScreen.kt:60)"
            U0.C4895p.S(r0, r2, r4, r5)
        L_0x00b7:
            Rv.j r0 = r21.i()
            r2 = 3
            t0.A r5 = t0.C5935B.c(r6, r6, r7, r6, r2)
            t0.A r17 = t0.C5935B.c(r6, r6, r7, r6, r2)
            t0.A r19 = t0.C5935B.c(r6, r6, r7, r6, r2)
            Rv.l r4 = r0.a()
            int[] r10 = Iv.r.h.f37221a
            int r4 = r4.ordinal()
            r4 = r10[r4]
            r15 = 1
            if (r4 == r15) goto L_0x00e7
            if (r4 == r3) goto L_0x00e4
            if (r4 != r2) goto L_0x00de
            r4 = r19
            goto L_0x00e8
        L_0x00de:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00e4:
            r4 = r17
            goto L_0x00e8
        L_0x00e7:
            r4 = r5
        L_0x00e8:
            Rv.l r2 = r0.a()
            java.lang.Object[] r10 = new java.lang.Object[]{r2}
            r2 = 826928431(0x3149ed2f, float:2.9384173E-9)
            r7.W(r2)
            java.lang.Object r2 = r7.D()
            U0.m$a r20 = U0.C4889m.f14007a
            java.lang.Object r11 = r20.a()
            if (r2 != r11) goto L_0x010a
            Iv.n r2 = new Iv.n
            r2.<init>()
            r7.u(r2)
        L_0x010a:
            r13 = r2
            nI.a r13 = (nI.C17631a) r13
            r7.P()
            r2 = 3072(0xc00, float:4.305E-42)
            r16 = 6
            r11 = 0
            r12 = 0
            r14 = r7
            r15 = r2
            java.lang.Object r2 = f1.C5301c.e(r10, r11, r12, r13, r14, r15, r16)
            U0.r0 r2 = (U0.C4899r0) r2
            boolean r10 = j(r2)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11 = 826930410(0x3149f4ea, float:2.9388567E-9)
            r7.W(r11)
            boolean r11 = r7.V(r2)
            boolean r12 = r7.V(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r7.D()
            r13 = 0
            if (r11 != 0) goto L_0x0142
            java.lang.Object r11 = r20.a()
            if (r12 != r11) goto L_0x014a
        L_0x0142:
            Iv.r$c r12 = new Iv.r$c
            r12.<init>(r4, r2, r13)
            r7.u(r12)
        L_0x014a:
            nI.p r12 = (nI.p) r12
            r7.P()
            U0.P.g(r10, r12, r7, r6)
            e5.c r2 = r18.b()
            e5.c r10 = e5.C7787c.f50843c
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r10)
            Kv.x r10 = Kv.B.g(r7, r6)
            boolean r11 = r10.k()
            r12 = 826942428(0x314a23dc, float:2.9415252E-9)
            r7.W(r12)
            boolean r11 = r7.b(r11)
            java.lang.Object r12 = r7.D()
            if (r11 != 0) goto L_0x017a
            java.lang.Object r11 = r20.a()
            if (r12 != r11) goto L_0x01a1
        L_0x017a:
            Rv.n r11 = r21.e()
            boolean r12 = r11 instanceof Rv.n.b
            if (r12 == 0) goto L_0x0183
            goto L_0x0196
        L_0x0183:
            boolean r12 = r11 instanceof Rv.n.d
            if (r12 == 0) goto L_0x0189
        L_0x0187:
            r6 = 1
            goto L_0x0196
        L_0x0189:
            boolean r11 = r11 instanceof Rv.n.a
            if (r11 == 0) goto L_0x021a
            boolean r11 = r10.k()
            if (r11 != 0) goto L_0x0187
            if (r2 != 0) goto L_0x0196
            goto L_0x0187
        L_0x0196:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            U0.r0 r12 = U0.u1.e(r2, r13, r3, r13)
            r7.u(r12)
        L_0x01a1:
            U0.r0 r12 = (U0.C4899r0) r12
            r7.P()
            Rv.n r2 = r21.e()
            boolean r2 = r2 instanceof Rv.n.a
            Iv.r$d r3 = new Iv.r$d
            r3.<init>(r1, r8, r12)
            r6 = -1156982403(0xffffffffbb09d97d, float:-0.0021034174)
            r11 = 54
            r12 = 1
            c1.a r13 = c1.c.e(r6, r12, r3, r7, r11)
            Iv.r$e r3 = new Iv.r$e
            r3.<init>(r1, r8, r2)
            r2 = 145767495(0x8b03c47, float:1.0606786E-33)
            c1.a r14 = c1.c.e(r2, r12, r3, r7, r11)
            Iv.r$f r2 = new Iv.r$f
            r2.<init>(r1, r0, r8)
            r3 = -1030375095(0xffffffffc295b949, float:-74.861885)
            c1.a r15 = c1.c.e(r3, r12, r2, r7, r11)
            Iv.r$g r6 = new Iv.r$g
            r2 = r6
            r3 = r0
            r0 = r4
            r4 = r22
            r1 = r6
            r6 = r17
            r8 = r7
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = -1423374040(0xffffffffab290928, float:-6.005357E-13)
            c1.a r1 = c1.c.e(r2, r12, r1, r8, r11)
            r17 = 224640(0x36d80, float:3.14788E-40)
            r11 = r0
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r1
            r16 = r8
            Kv.t.m(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0200
            U0.C4895p.R()
        L_0x0200:
            r3 = r18
        L_0x0202:
            U0.Y0 r6 = r8.n()
            if (r6 == 0) goto L_0x0219
            Iv.o r7 = new Iv.o
            r0 = r7
            r1 = r21
            r2 = r22
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0219:
            return
        L_0x021a:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Iv.r.h(Rv.m$a, nI.l, e5.b, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 i() {
        return u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean j(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void k(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final boolean l(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(m.a aVar, C17642l lVar, C7786b bVar, int i10, int i11, C4889m mVar, int i12) {
        h(aVar, lVar, bVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final i s(androidx.compose.animation.d<j> dVar) {
        return dVar.a().a().ordinal() == dVar.g().a().ordinal() ? androidx.compose.animation.a.e(androidx.compose.animation.i.f17449a.a(), androidx.compose.animation.k.f17452a.a()) : dVar.a().a().ordinal() < dVar.g().a().ordinal() ? androidx.compose.animation.a.e(Nv.h.e(), Nv.h.g()) : androidx.compose.animation.a.e(Nv.h.i(), Nv.h.k());
    }
}
