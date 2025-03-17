package ly;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15987c;
import O0.C4762x0;
import O0.e1;
import O0.g1;
import QJ.Q;
import SC.H2;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.e;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import ny.C14855a;
import ny.C14862h;
import ol.u;
import ol.v;
import p0.s;
import s0.C5834E;
import s0.C5842M;
import s0.C5844O;
import s0.C5848T;
import s0.C5862h;
import wl.C12279b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a[\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006!²\u0006\f\u0010\t\u001a\u00020\b8\nX\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u0002"}, d2 = {"Lny/h;", "viewModel", "Lkotlin/Function1;", "Lny/h$b;", "LXH/N;", "onEvent", "p", "(Lny/h;LnI/l;LU0/m;I)V", "Lny/a;", "uiState", "Lkotlin/Function0;", "onClosed", "Lny/a$a$b;", "onMarketSelected", "Lny/a$a$a;", "onLanguageSelected", "onUpdateClicked", "w", "(Lny/a;LnI/a;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "y", "(Landroidx/compose/ui/d;LU0/m;II)V", "Lny/a$a$c;", "selection", "LKJ/c;", "markets", "onSelection", "H", "(Lny/a$a$c;LKJ/c;LnI/l;LU0/m;I)V", "A", "", "expanded", "regionsettings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.regionsettings.impl.ui.compose.ChangeMarketScreenKt$ChangeMarketScreen$1$1", f = "ChangeMarketScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14862h.b f129002d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C14862h.b, C16807N> f129003e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14862h.b bVar, C17642l<? super C14862h.b, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f129002d = bVar;
            this.f129003e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f129002d, this.f129003e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129001c == 0) {
                y.b(obj);
                C14862h.b bVar = this.f129002d;
                if (bVar != null) {
                    this.f129003e.invoke(bVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f129004a;

        b(C17631a<C16807N> aVar) {
            this.f129004a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-770911167, i10, -1, "com.ingka.ikea.regionsettings.impl.ui.compose.ChangeMarketScreenImpl.<anonymous> (ChangeMarketScreen.kt:101)");
                }
                ol.p.c(v.BACK, this.f129004a, (d) null, j.b(Oo.b.f84439M1, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14855a f129005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C14855a.C3195a.b, C16807N> f129006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C14855a.C3195a.C3196a, C16807N> f129007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f129008d;

        c(C14855a aVar, C17642l<? super C14855a.C3195a.b, C16807N> lVar, C17642l<? super C14855a.C3195a.C3196a, C16807N> lVar2, C17631a<C16807N> aVar2) {
            this.f129005a = aVar;
            this.f129006b = lVar;
            this.f129007c = lVar2;
            this.f129008d = aVar2;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            int i11;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(836908822, i11, -1, "com.ingka.ikea.regionsettings.impl.ui.compose.ChangeMarketScreenImpl.<anonymous> (ChangeMarketScreen.kt:108)");
                }
                d.a aVar = d.f18749a;
                d h10 = D.h(J.f(aVar, 0.0f, 1, (Object) null), e11);
                C14855a aVar2 = this.f129005a;
                C17642l<C14855a.C3195a.b, C16807N> lVar = this.f129006b;
                C17642l<C14855a.C3195a.C3196a, C16807N> lVar2 = this.f129007c;
                C17631a<C16807N> aVar3 = this.f129008d;
                C5437c.a aVar4 = C5437c.f24302a;
                I h11 = C5077h.h(aVar4.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h11, aVar5.c());
                F1.c(a12, s10, aVar5.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar5.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e12, aVar5.d());
                C5079j jVar = C5079j.f18125a;
                if (aVar2 instanceof C14855a.C3195a) {
                    mVar2.W(-681003286);
                    C5079j jVar2 = jVar;
                    C17631a<C16807N> aVar6 = aVar3;
                    C17642l<C14855a.C3195a.C3196a, C16807N> lVar3 = lVar2;
                    C17642l<C14855a.C3195a.b, C16807N> lVar4 = lVar;
                    d i12 = e.i(m.f(aVar, m.c(0, mVar2, 0, 1), false, (s) null, false, 14, (Object) null));
                    I a13 = C5080k.a(C5073d.f18068a.n(h.B((float) 24)), aVar4.k(), mVar2, 6);
                    int a14 = C4883j.a(mVar2, 0);
                    C4912y s11 = mVar.s();
                    d e13 = androidx.compose.ui.c.e(mVar2, i12);
                    C17631a<C4504g> a15 = aVar5.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a15);
                    } else {
                        mVar.t();
                    }
                    C4889m a16 = F1.a(mVar);
                    F1.c(a16, a13, aVar5.c());
                    F1.c(a16, s11, aVar5.e());
                    nI.p<C4504g, Integer, C16807N> b11 = aVar5.b();
                    if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                        a16.u(Integer.valueOf(a14));
                        a16.w(Integer.valueOf(a14), b11);
                    }
                    F1.c(a16, e13, aVar5.d());
                    C5862h hVar = C5862h.f28810a;
                    C14855a.C3195a aVar7 = (C14855a.C3195a) aVar2;
                    p.H(aVar7.g(), aVar7.f(), lVar4, mVar2, 0);
                    p.A(aVar7.g(), aVar7.d(), lVar3, mVar2, 0);
                    C5079j jVar3 = jVar2;
                    L.b(j.b(Oo.b.f84651g7, mVar2, 0), J.h(C5116k1.a(aVar, "SettingsScreenTestTags.BUTTON"), 0.0f, 1, (Object) null), aVar7.h(), (N) null, (M) null, false, (Integer) null, (K0) null, (r0.m) null, aVar6, mVar, 48, 504);
                    mVar.x();
                    if (aVar7.e()) {
                        C12279b.b(jVar3.a(J.h(C5116k1.a(aVar, "SettingsScreenTestTags.PROGRESS_LOADING"), 0.0f, 1, (Object) null), aVar4.b()), mVar2, 0, 0);
                    }
                    mVar.P();
                } else if (C17542s.e(aVar2, C14855a.b.f129838a)) {
                    mVar2.W(-679366331);
                    p.y(e.i(aVar), mVar2, 0, 0);
                    mVar.P();
                } else {
                    mVar2.W(-21969713);
                    mVar.P();
                    throw new t();
                }
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
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A(ny.C14855a.C3195a.c r29, KJ.C15987c<ny.C14855a.C3195a.C3196a> r30, nI.C17642l<? super ny.C14855a.C3195a.C3196a, XH.C16807N> r31, U0.C4889m r32, int r33) {
        /*
            r0 = r29
            r10 = r30
            r11 = r31
            r12 = r33
            r1 = 691539983(0x2938100f, float:4.0870136E-14)
            r2 = r32
            U0.m r15 = r2.k(r1)
            r2 = r12 & 6
            r3 = 2
            if (r2 != 0) goto L_0x0021
            boolean r2 = r15.V(r0)
            if (r2 == 0) goto L_0x001e
            r2 = 4
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            r2 = r2 | r12
            goto L_0x0022
        L_0x0021:
            r2 = r12
        L_0x0022:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0032
            boolean r4 = r15.V(r10)
            if (r4 == 0) goto L_0x002f
            r4 = 32
            goto L_0x0031
        L_0x002f:
            r4 = 16
        L_0x0031:
            r2 = r2 | r4
        L_0x0032:
            r4 = r12 & 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0043
            boolean r4 = r15.F(r11)
            if (r4 == 0) goto L_0x0040
            r4 = r5
            goto L_0x0042
        L_0x0040:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r2 = r2 | r4
        L_0x0043:
            r4 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r4 != r6) goto L_0x0056
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r4 = r15
            goto L_0x0150
        L_0x0056:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0062
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.regionsettings.impl.ui.compose.LanguageSelection (ChangeMarketScreen.kt:220)"
            U0.C4895p.S(r1, r2, r4, r6)
        L_0x0062:
            r1 = -138131804(0xfffffffff7c446a4, float:-7.961898E33)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r4 = r13.a()
            r6 = 0
            if (r1 != r4) goto L_0x007e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            U0.r0 r1 = U0.u1.e(r1, r6, r3, r6)
            r15.u(r1)
        L_0x007e:
            r14 = r1
            U0.r0 r14 = (U0.C4899r0) r14
            r15.P()
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            java.lang.String r3 = "SettingsScreenTestTags.LANGUAGE_PICKER"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r3)
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.J.h(r1, r3, r4, r6)
            java.lang.String r16 = r29.a()
            int r1 = Oo.b.f84670i4
            r3 = 0
            java.lang.String r17 = J1.j.b(r1, r15, r3)
            ly.q r1 = ly.q.f129009a
            nI.q r6 = r1.b()
            r1 = -138119758(0xfffffffff7c475b2, float:-7.969354E33)
            r15.W(r1)
            r1 = r2 & 896(0x380, float:1.256E-42)
            if (r1 != r5) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r4 = r3
        L_0x00af:
            java.lang.Object r1 = r15.D()
            if (r4 != 0) goto L_0x00bb
            java.lang.Object r2 = r13.a()
            if (r1 != r2) goto L_0x00c3
        L_0x00bb:
            ly.h r1 = new ly.h
            r1.<init>(r11, r14)
            r15.u(r1)
        L_0x00c3:
            r4 = r1
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            r1 = -138107470(0xfffffffff7c4a5b2, float:-7.97696E33)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            java.lang.Object r2 = r13.a()
            if (r1 != r2) goto L_0x00e1
            ly.i r1 = new ly.i
            r1.<init>(r14)
            r15.u(r1)
        L_0x00e1:
            r5 = r1
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            SC.r2 r18 = new SC.r2
            r7 = 0
            r8 = 0
            r9 = 48
            r20 = 0
            r1 = r18
            r2 = r30
            r3 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = B(r14)
            r2 = -138104043(0xfffffffff7c4b315, float:-7.979081E33)
            r15.W(r2)
            java.lang.Object r2 = r15.D()
            java.lang.Object r3 = r13.a()
            if (r2 != r3) goto L_0x0118
            ly.j r2 = new ly.j
            r2.<init>(r14)
            r15.u(r2)
        L_0x0118:
            nI.l r2 = (nI.C17642l) r2
            r15.P()
            int r3 = SC.C13633r2.f116415g
            int r3 = r3 << 6
            r4 = 807100416(0x301b6000, float:5.6525096E-10)
            r26 = r3 | r4
            r27 = 0
            r28 = 3456(0xd80, float:4.843E-42)
            r3 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r13 = r16
            r14 = r17
            r4 = r15
            r15 = r18
            r16 = r1
            r17 = r2
            r18 = r3
            r25 = r4
            SC.C13641t2.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0150
            U0.C4895p.R()
        L_0x0150:
            U0.Y0 r1 = r4.n()
            if (r1 == 0) goto L_0x015e
            ly.k r2 = new ly.k
            r2.<init>(r0, r10, r11, r12)
            r1.a(r2)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.p.A(ny.a$a$c, KJ.c, nI.l, U0.m, int):void");
    }

    private static final boolean B(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void C(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar, C4899r0 r0Var, C14855a.C3195a.C3196a aVar) {
        C17542s.j(aVar, "it");
        C(r0Var, false);
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C4899r0 r0Var) {
        C(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C4899r0 r0Var, boolean z10) {
        C(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C14855a.C3195a.c cVar, C15987c cVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        A(cVar, cVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H(ny.C14855a.C3195a.c r29, KJ.C15987c<ny.C14855a.C3195a.b> r30, nI.C17642l<? super ny.C14855a.C3195a.b, XH.C16807N> r31, U0.C4889m r32, int r33) {
        /*
            r0 = r29
            r10 = r30
            r11 = r31
            r12 = r33
            r1 = -1739000277(0xffffffff9858f62b, float:-2.8041629E-24)
            r2 = r32
            U0.m r15 = r2.k(r1)
            r2 = r12 & 6
            r3 = 2
            if (r2 != 0) goto L_0x0021
            boolean r2 = r15.V(r0)
            if (r2 == 0) goto L_0x001e
            r2 = 4
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            r2 = r2 | r12
            goto L_0x0022
        L_0x0021:
            r2 = r12
        L_0x0022:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0032
            boolean r4 = r15.V(r10)
            if (r4 == 0) goto L_0x002f
            r4 = 32
            goto L_0x0031
        L_0x002f:
            r4 = 16
        L_0x0031:
            r2 = r2 | r4
        L_0x0032:
            r4 = r12 & 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0043
            boolean r4 = r15.F(r11)
            if (r4 == 0) goto L_0x0040
            r4 = r5
            goto L_0x0042
        L_0x0040:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r2 = r2 | r4
        L_0x0043:
            r4 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r4 != r6) goto L_0x0056
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r4 = r15
            goto L_0x0150
        L_0x0056:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0062
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.regionsettings.impl.ui.compose.MarketSelection (ChangeMarketScreen.kt:182)"
            U0.C4895p.S(r1, r2, r4, r6)
        L_0x0062:
            r1 = -1194464096(0xffffffffb8cdeca0, float:-9.8192366E-5)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r4 = r13.a()
            r6 = 0
            if (r1 != r4) goto L_0x007e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            U0.r0 r1 = U0.u1.e(r1, r6, r3, r6)
            r15.u(r1)
        L_0x007e:
            r14 = r1
            U0.r0 r14 = (U0.C4899r0) r14
            r15.P()
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            java.lang.String r3 = "SettingsScreenTestTags.MARKET_PICKER"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r3)
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.J.h(r1, r3, r4, r6)
            java.lang.String r16 = r29.b()
            int r1 = Oo.b.f84399I1
            r3 = 0
            java.lang.String r17 = J1.j.b(r1, r15, r3)
            ly.q r1 = ly.q.f129009a
            nI.q r6 = r1.a()
            r1 = -1194452210(0xffffffffb8ce1b0e, float:-9.827885E-5)
            r15.W(r1)
            r1 = r2 & 896(0x380, float:1.256E-42)
            if (r1 != r5) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r4 = r3
        L_0x00af:
            java.lang.Object r1 = r15.D()
            if (r4 != 0) goto L_0x00bb
            java.lang.Object r2 = r13.a()
            if (r1 != r2) goto L_0x00c3
        L_0x00bb:
            ly.l r1 = new ly.l
            r1.<init>(r11, r14)
            r15.u(r1)
        L_0x00c3:
            r4 = r1
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            r1 = -1194439922(0xffffffffb8ce4b0e, float:-9.8368255E-5)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            java.lang.Object r2 = r13.a()
            if (r1 != r2) goto L_0x00e1
            ly.m r1 = new ly.m
            r1.<init>(r14)
            r15.u(r1)
        L_0x00e1:
            r5 = r1
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            SC.r2 r18 = new SC.r2
            r7 = 0
            r8 = 0
            r9 = 48
            r20 = 0
            r1 = r18
            r2 = r30
            r3 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = I(r14)
            r2 = -1194436495(0xffffffffb8ce5871, float:-9.839319E-5)
            r15.W(r2)
            java.lang.Object r2 = r15.D()
            java.lang.Object r3 = r13.a()
            if (r2 != r3) goto L_0x0118
            ly.n r2 = new ly.n
            r2.<init>(r14)
            r15.u(r2)
        L_0x0118:
            nI.l r2 = (nI.C17642l) r2
            r15.P()
            int r3 = SC.C13633r2.f116415g
            int r3 = r3 << 6
            r4 = 807100416(0x301b6000, float:5.6525096E-10)
            r26 = r3 | r4
            r27 = 0
            r28 = 3456(0xd80, float:4.843E-42)
            r3 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r13 = r16
            r14 = r17
            r4 = r15
            r15 = r18
            r16 = r1
            r17 = r2
            r18 = r3
            r25 = r4
            SC.C13641t2.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0150
            U0.C4895p.R()
        L_0x0150:
            U0.Y0 r1 = r4.n()
            if (r1 == 0) goto L_0x015e
            ly.o r2 = new ly.o
            r2.<init>(r0, r10, r11, r12)
            r1.a(r2)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.p.H(ny.a$a$c, KJ.c, nI.l, U0.m, int):void");
    }

    private static final boolean I(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void J(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17642l lVar, C4899r0 r0Var, C14855a.C3195a.b bVar) {
        C17542s.j(bVar, "it");
        J(r0Var, false);
        lVar.invoke(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C4899r0 r0Var) {
        J(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C4899r0 r0Var, boolean z10) {
        J(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C14855a.C3195a.c cVar, C15987c cVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        H(cVar, cVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(ny.C14862h r10, nI.C17642l<? super ny.C14862h.b, XH.C16807N> r11, U0.C4889m r12, int r13) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 855766908(0x3301f77c, float:3.026024E-8)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0020
            boolean r1 = r12.F(r10)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r13
            goto L_0x0021
        L_0x0020:
            r1 = r13
        L_0x0021:
            r2 = r13 & 48
            r8 = 32
            if (r2 != 0) goto L_0x0032
            boolean r2 = r12.F(r11)
            if (r2 == 0) goto L_0x002f
            r2 = r8
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r9 = r1
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x0045
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r12.L()
            goto L_0x0141
        L_0x0045:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0051
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.regionsettings.impl.ui.compose.ChangeMarketScreen (ChangeMarketScreen.kt:54)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x0051:
            TJ.P r1 = r10.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            ny.a r1 = q(r0)
            ny.h$b r1 = r1.a()
            r2 = -1766558424(0xffffffff96b47528, float:-2.9154504E-25)
            r12.W(r2)
            boolean r2 = r12.V(r1)
            r3 = r9 & 112(0x70, float:1.57E-43)
            r4 = 1
            r5 = 0
            if (r3 != r8) goto L_0x0079
            r6 = r4
            goto L_0x007a
        L_0x0079:
            r6 = r5
        L_0x007a:
            r2 = r2 | r6
            java.lang.Object r6 = r12.D()
            if (r2 != 0) goto L_0x0089
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0092
        L_0x0089:
            ly.p$a r6 = new ly.p$a
            r2 = 0
            r6.<init>(r1, r11, r2)
            r12.u(r6)
        L_0x0092:
            nI.p r6 = (nI.p) r6
            r12.P()
            U0.P.g(r1, r6, r12, r5)
            ny.a r1 = q(r0)
            r0 = -1766553999(0xffffffff96b48671, float:-2.9165413E-25)
            r12.W(r0)
            if (r3 != r8) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r4 = r5
        L_0x00a8:
            java.lang.Object r0 = r12.D()
            if (r4 != 0) goto L_0x00b6
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x00be
        L_0x00b6:
            ly.b r0 = new ly.b
            r0.<init>(r11)
            r12.u(r0)
        L_0x00be:
            r2 = r0
            nI.a r2 = (nI.C17631a) r2
            r12.P()
            r0 = -1766550725(0xffffffff96b4933b, float:-2.9173484E-25)
            r12.W(r0)
            boolean r0 = r12.F(r10)
            java.lang.Object r3 = r12.D()
            if (r0 != 0) goto L_0x00dc
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x00e4
        L_0x00dc:
            ly.c r3 = new ly.c
            r3.<init>(r10)
            r12.u(r3)
        L_0x00e4:
            nI.l r3 = (nI.C17642l) r3
            r12.P()
            r0 = -1766545089(0xffffffff96b4a93f, float:-2.9187378E-25)
            r12.W(r0)
            boolean r0 = r12.F(r10)
            java.lang.Object r4 = r12.D()
            if (r0 != 0) goto L_0x0101
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0109
        L_0x0101:
            ly.d r4 = new ly.d
            r4.<init>(r10)
            r12.u(r4)
        L_0x0109:
            nI.l r4 = (nI.C17642l) r4
            r12.P()
            r0 = -1766539387(0xffffffff96b4bf85, float:-2.9201434E-25)
            r12.W(r0)
            boolean r0 = r12.F(r10)
            java.lang.Object r5 = r12.D()
            if (r0 != 0) goto L_0x0126
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x012e
        L_0x0126:
            ly.e r5 = new ly.e
            r5.<init>(r10)
            r12.u(r5)
        L_0x012e:
            nI.a r5 = (nI.C17631a) r5
            r12.P()
            r7 = 0
            r6 = r12
            w(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0141
            U0.C4895p.R()
        L_0x0141:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x014f
            ly.f r0 = new ly.f
            r0.<init>(r10, r11, r13)
            r12.a(r0)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.p.p(ny.h, nI.l, U0.m, int):void");
    }

    private static final C14855a q(A1<? extends C14855a> a12) {
        return (C14855a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C14862h hVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        p(hVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar) {
        lVar.invoke(C14862h.b.a.f129936a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C14862h hVar, C14855a.C3195a.b bVar) {
        C17542s.j(bVar, "it");
        hVar.P(new C14862h.a.c(bVar.a()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C14862h hVar, C14855a.C3195a.C3196a aVar) {
        C17542s.j(aVar, "it");
        hVar.P(new C14862h.a.b(aVar.a()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C14862h hVar) {
        hVar.P(new C14862h.a.d(false));
        return C16807N.f139792a;
    }

    public static final void w(C14855a aVar, C17631a<C16807N> aVar2, C17642l<? super C14855a.C3195a.b, C16807N> lVar, C17642l<? super C14855a.C3195a.C3196a, C16807N> lVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C14855a aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17642l<? super C14855a.C3195a.b, C16807N> lVar3 = lVar;
        C17642l<? super C14855a.C3195a.C3196a, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C17542s.j(aVar4, "uiState");
        C17542s.j(aVar5, "onClosed");
        C17542s.j(lVar3, "onMarketSelected");
        C17542s.j(lVar4, "onLanguageSelected");
        C17542s.j(aVar6, "onUpdateClicked");
        C4889m k10 = mVar.k(-1501479547);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar6) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1501479547, i11, -1, "com.ingka.ikea.regionsettings.impl.ui.compose.ChangeMarketScreenImpl (ChangeMarketScreen.kt:98)");
            }
            mVar2 = k10;
            C4762x0.a((d) null, c1.c.e(-770911167, true, new b(aVar5), k10, 54), (nI.p<? super C4889m, ? super Integer, C16807N>) null, (nI.p<? super C4889m, ? super Integer, C16807N>) null, (nI.p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(836908822, true, new c(aVar4, lVar3, lVar4, aVar6), k10, 54), mVar2, 805306416, 509);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C14773a(aVar, aVar2, lVar, lVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C14855a aVar, C17631a aVar2, C17642l lVar, C17642l lVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        w(aVar, aVar2, lVar, lVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(1282445680);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1282445680, i12, -1, "com.ingka.ikea.regionsettings.impl.ui.compose.FullScreenLoading (ChangeMarketScreen.kt:166)");
            }
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, dVar);
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
            nI.p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(1515788512);
            for (int i14 = 0; i14 < 3; i14++) {
                d.a aVar2 = d.f18749a;
                C5844O.a(J.i(aVar2, h.B((float) 24)), k10, 6);
                H2.b(J.i(aVar2, h.B((float) 72)), false, k10, 6, 2);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(d dVar, int i10, int i11, C4889m mVar, int i12) {
        y(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
