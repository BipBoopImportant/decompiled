package Pv;

import A0.g;
import E1.A;
import E1.H;
import E1.I;
import E1.J;
import E1.O;
import E1.Q;
import E1.a0;
import G1.C4504g;
import IC.C13023e;
import J1.e;
import N1.P;
import O0.V;
import SC.C13575d;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.C5267b;
import c2.h;
import gs.e;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5525D;
import m0.C5534c;
import m0.C5548j;
import m0.K;
import m0.M;
import m1.C5571a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import pI.C17752b;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001d\u0010\u001b\u001a)\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b!\u0010\"\u001a%\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001fH\u0003¢\u0006\u0004\b&\u0010'\"\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00063²\u0006\f\u0010.\u001a\u00020\u00118\nX\u0002²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u0002²\u0006\u000e\u00101\u001a\u00020/8\n@\nX\u0002²\u0006\f\u00102\u001a\u00020%8\nX\u0002²\u0006\f\u00102\u001a\u00020%8\nX\u0002"}, d2 = {"LPv/r;", "model", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "u", "(LPv/r;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LPv/f;", "icon", "m", "(LPv/f;LU0/m;I)V", "content", "image", "k", "(LnI/p;LnI/p;Landroidx/compose/ui/d;LU0/m;II)V", "Lp1/v0;", "color", "LIC/e;", "title", "", "isLoading", "Lkotlin/Function1;", "LN1/P;", "onTextLayout", "r", "(JLIC/e;ZLandroidx/compose/ui/d;LnI/l;LU0/m;II)V", "body", "h", "contentColor", "", "imageUrl", "o", "(JLjava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "animationLabel", "LU0/A1;", "", "I", "(ZLjava/lang/String;LU0/m;I)LU0/A1;", "Lm0/D;", "a", "Lm0/D;", "Easing", "b", "BackgroundEasing", "animatedAnimatedBackgroundColor", "", "titleLines", "bodyLines", "alpha", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final C5525D f39530a = K.m();

    /* renamed from: b  reason: collision with root package name */
    private static final C5525D f39531b = M.e();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements O {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39532a = new a();

        a() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(a0 a0Var, int i10, int i11, a0 a0Var2, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            a0.a aVar2 = aVar;
            a0.a.m(aVar2, a0Var, 0, (i10 - i11) / 2, 0.0f, 4, (Object) null);
            a0.a.m(aVar2, a0Var2, a0Var.E0(), 0, 0.0f, 4, (Object) null);
            return C16807N.f139792a;
        }

        public final J i(E1.K k10, List<? extends List<? extends H>> list, long j10) {
            a0 i02;
            List<? extends List<? extends H>> list2 = list;
            C17542s.j(k10, "$this$Layout");
            C17542s.j(list2, "<destruct>");
            List list3 = (List) list2.get(1);
            int e10 = C17752b.e(((float) C5267b.l(j10)) * 0.7f);
            int l10 = C5267b.l(j10) - e10;
            int m10 = C5267b.m(j10);
            H h10 = (H) C16877v.d1((List) list2.get(0));
            if (h10 == null || (i02 = h10.i0(C5267b.d(j10, e10, e10, 0, Integer.MAX_VALUE, 4, (Object) null))) == null) {
                throw new IllegalStateException("Content should be a single Composable");
            }
            int z02 = i02.z0();
            H h11 = (H) C16877v.d1(list3);
            if (h11 != null) {
                int i10 = l10;
                int i11 = l10;
                int i12 = m10;
                a0 i03 = h11.i0(C5267b.d(j10, i10, i11, 0, Math.max(m10, z02), 4, (Object) null));
                if (i03 != null) {
                    int E02 = i02.E0() + i03.E0();
                    int max = Math.max(i02.z(), i12);
                    return E1.K.v0(k10, E02, max, (Map) null, new n(i02, max, z02, i03), 4, (Object) null);
                }
            }
            throw new IllegalStateException("Image should be a single Composable");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f39533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f39534b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f39535c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39536d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4894o0 f39537e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4894o0 f39538f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f39539a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f39540b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r f39541c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f39542d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4894o0 f39543e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4894o0 f39544f;

            a(f fVar, long j10, r rVar, boolean z10, C4894o0 o0Var, C4894o0 o0Var2) {
                this.f39539a = fVar;
                this.f39540b = j10;
                this.f39541c = rVar;
                this.f39542d = z10;
                this.f39543e = o0Var;
                this.f39544f = o0Var2;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(C4894o0 o0Var, P p10) {
                C17542s.j(p10, "it");
                o.x(o0Var, p10.n());
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C4894o0 o0Var, P p10) {
                C17542s.j(p10, "it");
                o.z(o0Var, p10.n());
                return C16807N.f139792a;
            }

            public final void c(C4889m mVar, int i10) {
                C4894o0 o0Var;
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(30238804, i11, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCard.<anonymous>.<anonymous> (ContextualCard.kt:122)");
                    }
                    C5073d.f b10 = C5073d.f18068a.b();
                    d.a aVar = d.f18749a;
                    float f10 = (float) 20;
                    float f11 = (float) 4;
                    d m10 = D.m(D.k(androidx.compose.foundation.layout.J.h(aVar, 0.0f, 1, (Object) null), 0.0f, h.B(f10), 1, (Object) null), h.B(f10), 0.0f, h.B(f11), 0.0f, 10, (Object) null);
                    f fVar = this.f39539a;
                    long j10 = this.f39540b;
                    r rVar = this.f39541c;
                    boolean z10 = this.f39542d;
                    C4894o0 o0Var2 = this.f39543e;
                    C4894o0 o0Var3 = this.f39544f;
                    I a10 = C5080k.a(b10, C5437c.f24302a.k(), mVar2, 6);
                    int a11 = C4883j.a(mVar2, 0);
                    C4912y s10 = mVar.s();
                    d e10 = c.e(mVar2, m10);
                    C4504g.a aVar2 = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar2.a();
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
                    F1.c(a13, a10, aVar2.c());
                    F1.c(a13, s10, aVar2.e());
                    p<C4504g, Integer, C16807N> b11 = aVar2.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b11);
                    }
                    F1.c(a13, e10, aVar2.d());
                    C5862h hVar = C5862h.f28810a;
                    mVar2.W(1353735560);
                    if (fVar != null) {
                        o.m(fVar, mVar2, 0);
                        o0Var = o0Var3;
                        C5844O.a(C5861g.c(hVar, aVar, 1.0f, false, 2, (Object) null), mVar2, 0);
                    } else {
                        o0Var = o0Var3;
                    }
                    mVar.P();
                    C13023e title = rVar.getTitle();
                    mVar2.W(1353746369);
                    Object D10 = mVar.D();
                    C4889m.a aVar3 = C4889m.f14007a;
                    if (D10 == aVar3.a()) {
                        D10 = new p(o0Var2);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    int i12 = C13023e.f110931a;
                    long j11 = j10;
                    boolean z11 = z10;
                    o.r(j11, title, z11, (d) null, (C17642l) D10, mVar, (i12 << 3) | 24576, 8);
                    C5844O.a(androidx.compose.foundation.layout.J.i(aVar, h.B(f11)), mVar2, 6);
                    C13023e g10 = rVar.g();
                    mVar2.W(1353756576);
                    Object D11 = mVar.D();
                    if (D11 == aVar3.a()) {
                        D11 = new q(o0Var);
                        mVar2.u(D11);
                    }
                    mVar.P();
                    o.h(j10, g10, z10, (d) null, (C17642l) D11, mVar, (i12 << 3) | 24576, 8);
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
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pv.o$b$b  reason: collision with other inner class name */
        static final class C0625b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f39545a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f39546b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f39547c;

            C0625b(r rVar, boolean z10, long j10) {
                this.f39545a = rVar;
                this.f39546b = z10;
                this.f39547c = j10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(623727475, i10, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCard.<anonymous>.<anonymous> (ContextualCard.kt:149)");
                    }
                    String i11 = this.f39545a.i();
                    float f10 = 0.0f;
                    d f11 = androidx.compose.foundation.layout.J.f(d.f18749a, 0.0f, 1, (Object) null);
                    if (!this.f39546b) {
                        f10 = 1.0f;
                    }
                    o.o(this.f39547c, i11, C5571a.a(f11, f10), mVar, 0, 0);
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

        b(f fVar, long j10, r rVar, boolean z10, C4894o0 o0Var, C4894o0 o0Var2) {
            this.f39533a = fVar;
            this.f39534b = j10;
            this.f39535c = rVar;
            this.f39536d = z10;
            this.f39537e = o0Var;
            this.f39538f = o0Var2;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C5861g gVar2 = gVar;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1242098004, i11, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCard.<anonymous> (ContextualCard.kt:119)");
                }
                o.k(c1.c.e(30238804, true, new a(this.f39533a, this.f39534b, this.f39535c, this.f39536d, this.f39537e, this.f39538f), mVar2, 54), c1.c.e(623727475, true, new C0625b(this.f39535c, this.f39536d, this.f39534b), mVar2, 54), androidx.compose.foundation.layout.J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 438, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(r rVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        u(rVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final A1<Float> I(boolean z10, String str, C4889m mVar, int i10) {
        mVar.W(-1639265717);
        if (C4895p.J()) {
            C4895p.S(-1639265717, i10, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.alphaAnimation (ContextualCard.kt:332)");
        }
        float f10 = z10 ? 1.0f : 0.0f;
        A1<Float> d10 = C5534c.d(f10, C5548j.j(100, 0, f39530a, 2, (Object) null), 0.0f, "Alpha animation " + str, (C17642l<? super Float, C16807N>) null, mVar, 48, 20);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return d10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(long r35, IC.C13023e r37, boolean r38, androidx.compose.ui.d r39, nI.C17642l<? super N1.P, XH.C16807N> r40, U0.C4889m r41, int r42, int r43) {
        /*
            r3 = r37
            r4 = r38
            r7 = r42
            r0 = 1880383473(0x70145ff1, float:1.8367907E29)
            r1 = r41
            U0.m r1 = r1.k(r0)
            r2 = r43 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r7 | 6
            r11 = r35
            goto L_0x002a
        L_0x0018:
            r2 = r7 & 6
            r11 = r35
            if (r2 != 0) goto L_0x0029
            boolean r2 = r1.e(r11)
            if (r2 == 0) goto L_0x0026
            r2 = 4
            goto L_0x0027
        L_0x0026:
            r2 = 2
        L_0x0027:
            r2 = r2 | r7
            goto L_0x002a
        L_0x0029:
            r2 = r7
        L_0x002a:
            r8 = r43 & 2
            if (r8 == 0) goto L_0x0031
            r2 = r2 | 48
            goto L_0x004a
        L_0x0031:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x004a
            r8 = r7 & 64
            if (r8 != 0) goto L_0x003e
            boolean r8 = r1.V(r3)
            goto L_0x0042
        L_0x003e:
            boolean r8 = r1.F(r3)
        L_0x0042:
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r2 = r2 | r8
        L_0x004a:
            r8 = r43 & 4
            if (r8 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0061
            boolean r8 = r1.b(r4)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r8
        L_0x0061:
            r8 = r43 & 8
            if (r8 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r39
            goto L_0x007c
        L_0x006a:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r39
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r10
        L_0x007c:
            r10 = r43 & 16
            if (r10 == 0) goto L_0x0085
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r40
            goto L_0x0097
        L_0x0085:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r40
            boolean r14 = r1.F(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r2 = r2 | r14
        L_0x0097:
            r14 = r2 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00ab
            boolean r14 = r1.l()
            if (r14 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            r1.L()
            r5 = r9
            r6 = r13
            goto L_0x01f8
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            goto L_0x00b1
        L_0x00b0:
            r8 = r9
        L_0x00b1:
            if (r10 == 0) goto L_0x00b7
            r9 = 0
            r34 = r9
            goto L_0x00b9
        L_0x00b7:
            r34 = r13
        L_0x00b9:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00c5
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.membership.impl.contextualcard.compose.CardBody (ContextualCard.kt:268)"
            U0.C4895p.S(r0, r2, r9, r10)
        L_0x00c5:
            int r0 = r2 >> 6
            r0 = r0 & 14
            r0 = r0 | 48
            java.lang.String r9 = "Body"
            U0.A1 r0 = I(r4, r9, r1, r0)
            r9 = 1
            if (r4 == 0) goto L_0x00d7
            r27 = r9
            goto L_0x00dc
        L_0x00d7:
            r10 = 2147483647(0x7fffffff, float:NaN)
            r27 = r10
        L_0x00dc:
            int r10 = IC.C13023e.f110931a
            int r13 = r2 >> 3
            r13 = r13 & 14
            r10 = r10 | r13
            java.lang.String r29 = r3.a(r1, r10)
            r15 = 0
            if (r4 == 0) goto L_0x00ff
            int r10 = r29.length()
            if (r10 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r9 = r15
        L_0x00f2:
            if (r9 == 0) goto L_0x00ff
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.g(r9, r10)
        L_0x00fd:
            r10 = r9
            goto L_0x0102
        L_0x00ff:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            goto L_0x00fd
        L_0x0102:
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c r9 = r9.o()
            E1.I r9 = androidx.compose.foundation.layout.C5077h.h(r9, r15)
            int r13 = U0.C4883j.a(r1, r15)
            U0.y r14 = r1.s()
            androidx.compose.ui.d r15 = androidx.compose.ui.c.e(r1, r8)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r5 = r16.a()
            U0.f r17 = r1.m()
            if (r17 != 0) goto L_0x0127
            U0.C4883j.c()
        L_0x0127:
            r1.I()
            boolean r17 = r1.i()
            if (r17 == 0) goto L_0x0134
            r1.p(r5)
            goto L_0x0137
        L_0x0134:
            r1.t()
        L_0x0137:
            U0.m r5 = U0.F1.a(r1)
            nI.p r6 = r16.c()
            U0.F1.c(r5, r9, r6)
            nI.p r6 = r16.e()
            U0.F1.c(r5, r14, r6)
            nI.p r6 = r16.b()
            boolean r9 = r5.i()
            if (r9 != 0) goto L_0x0161
            java.lang.Object r9 = r5.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x016f
        L_0x0161:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.w(r9, r6)
        L_0x016f:
            nI.p r6 = r16.d()
            U0.F1.c(r5, r15, r6)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            TC.b$a$b r9 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r6 = "ContextualCardTestTag-Body"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r10, r6)
            int r2 = r2 << 9
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            r31 = r6 | 48
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r2 & r6
            r33 = 98288(0x17ff0, float:1.37731E-40)
            r13 = 0
            r15 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r6 = r8
            r8 = r29
            r11 = r35
            r29 = r34
            r30 = r1
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r8 = 1109758655(0x422592bf, float:41.393307)
            r1.W(r8)
            float r8 = i(r0)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e6
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "ContextualCardTestTag-BodySkeleton"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            androidx.compose.ui.d r5 = r5.e(r8)
            r8 = 4
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            A0.f r8 = A0.g.e(r8)
            androidx.compose.ui.d r5 = m1.e.a(r5, r8)
            float r0 = i(r0)
            androidx.compose.ui.d r0 = m1.C5571a.a(r5, r0)
            r5 = 2
            SC.H2.b(r0, r2, r1, r2, r5)
        L_0x01e6:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f5
            U0.C4895p.R()
        L_0x01f5:
            r5 = r6
            r6 = r34
        L_0x01f8:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0211
            Pv.l r10 = new Pv.l
            r0 = r10
            r1 = r35
            r3 = r37
            r4 = r38
            r7 = r42
            r8 = r43
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pv.o.h(long, IC.e, boolean, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    private static final float i(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N j(long j10, C13023e eVar, boolean z10, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        h(j10, eVar, z10, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void k(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-785209621);
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
        int i13 = 4 & i11;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-785209621, i12, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.CardContentLayout (ContextualCard.kt:183)");
            }
            List q10 = C16877v.q(pVar, pVar2);
            k10.W(1966783133);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = a.f39532a;
                k10.u(D10);
            }
            O o10 = (O) D10;
            k10.P();
            p<C4889m, Integer, C16807N> b10 = A.b(q10);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = Q.a(o10);
                k10.u(D11);
            }
            I i14 = (I) D11;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, dVar);
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
            F1.c(a12, i14, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            b10.invoke(k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(pVar, pVar2, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(p pVar, p pVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        k(pVar, pVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void m(f fVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2088430650);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2088430650, i11, -1, "com.ingka.ikea.membership.impl.contextualcard.compose.CardIcon (ContextualCard.kt:162)");
            }
            V.a(e.c(fVar.a(), k10, 0), (String) null, D.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.J.t(C5116k1.a(d.f18749a, "ContextualCardTestTag-Icon"), h.B((float) 40)), J1.b.a(fVar.b(), k10, 0), g.h()), h.B((float) 8)), C13575d.a(k10, 0).x0(), k10, 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(fVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(f fVar, int i10, C4889m mVar, int i11) {
        m(fVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(long r21, java.lang.String r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r3 = r23
            r5 = r26
            r0 = -1337629363(0xffffffffb045654d, float:-7.181214E-10)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0016
            r2 = r5 | 6
            r14 = r21
            goto L_0x0028
        L_0x0016:
            r2 = r5 & 6
            r14 = r21
            if (r2 != 0) goto L_0x0027
            boolean r2 = r1.e(r14)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r5
            goto L_0x0028
        L_0x0027:
            r2 = r5
        L_0x0028:
            r4 = r27 & 2
            r13 = 32
            if (r4 == 0) goto L_0x0031
            r2 = r2 | 48
            goto L_0x0040
        L_0x0031:
            r4 = r5 & 48
            if (r4 != 0) goto L_0x0040
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x003d
            r4 = r13
            goto L_0x003f
        L_0x003d:
            r4 = 16
        L_0x003f:
            r2 = r2 | r4
        L_0x0040:
            r4 = r27 & 4
            if (r4 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r6 = r24
            goto L_0x005b
        L_0x0049:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0046
            r6 = r24
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0058
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r2 = r2 | r7
        L_0x005b:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006e
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            r1.L()
            r4 = r6
            goto L_0x0111
        L_0x006e:
            if (r4 == 0) goto L_0x0073
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0074
        L_0x0073:
            r4 = r6
        L_0x0074:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0080
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.membership.impl.contextualcard.compose.CardImage (ContextualCard.kt:309)"
            U0.C4895p.S(r0, r2, r6, r7)
        L_0x0080:
            U0.I0 r0 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r0 = r1.Q(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ae
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r12 = 14
            r16 = 0
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r21
            r5 = r13
            r13 = r16
            long r7 = p1.C5747v0.o(r6, r8, r9, r10, r11, r12, r13)
            r10 = 2
            r11 = 0
            r9 = 0
            r6 = r0
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r6, r7, r9, r10, r11)
            goto L_0x00b1
        L_0x00ae:
            r5 = r13
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
        L_0x00b1:
            r6 = -130010807(0xfffffffff8403149, float:-1.559251E34)
            r1.W(r6)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r6 = 0
            if (r2 != r5) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = r6
        L_0x00bf:
            java.lang.Object r5 = r1.D()
            if (r2 != 0) goto L_0x00cd
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00d5
        L_0x00cd:
            Pv.h r5 = new Pv.h
            r5.<init>(r3)
            r1.u(r5)
        L_0x00d5:
            nI.l r5 = (nI.C17642l) r5
            r1.P()
            gs.e r6 = gs.f.a(r5, r1, r6)
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c r12 = r2.h()
            E1.k$a r2 = E1.C4478k.f5915a
            E1.k r13 = r2.a()
            androidx.compose.ui.d r8 = r4.s(r0)
            r0 = 14155824(0xd80030, float:1.9836534E-38)
            int r2 = gs.e.f97946h
            r18 = r2 | r0
            r19 = 0
            r20 = 1848(0x738, float:2.59E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = 0
            r2 = 0
            r16 = 0
            r14 = r0
            r15 = r2
            r17 = r1
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0111
            U0.C4895p.R()
        L_0x0111:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0128
            Pv.i r8 = new Pv.i
            r0 = r8
            r1 = r21
            r3 = r23
            r5 = r26
            r6 = r27
            r0.<init>(r1, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pv.o.o(long, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(str);
        aVar.i(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(long j10, String str, d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(j10, str, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(long r35, IC.C13023e r37, boolean r38, androidx.compose.ui.d r39, nI.C17642l<? super N1.P, XH.C16807N> r40, U0.C4889m r41, int r42, int r43) {
        /*
            r3 = r37
            r4 = r38
            r7 = r42
            r0 = -268530901(0xffffffffeffe8b2b, float:-1.5755487E29)
            r1 = r41
            U0.m r1 = r1.k(r0)
            r2 = r43 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r7 | 6
            r11 = r35
            goto L_0x002a
        L_0x0018:
            r2 = r7 & 6
            r11 = r35
            if (r2 != 0) goto L_0x0029
            boolean r2 = r1.e(r11)
            if (r2 == 0) goto L_0x0026
            r2 = 4
            goto L_0x0027
        L_0x0026:
            r2 = 2
        L_0x0027:
            r2 = r2 | r7
            goto L_0x002a
        L_0x0029:
            r2 = r7
        L_0x002a:
            r8 = r43 & 2
            if (r8 == 0) goto L_0x0031
            r2 = r2 | 48
            goto L_0x004a
        L_0x0031:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x004a
            r8 = r7 & 64
            if (r8 != 0) goto L_0x003e
            boolean r8 = r1.V(r3)
            goto L_0x0042
        L_0x003e:
            boolean r8 = r1.F(r3)
        L_0x0042:
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r2 = r2 | r8
        L_0x004a:
            r8 = r43 & 4
            if (r8 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0061
            boolean r8 = r1.b(r4)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r8
        L_0x0061:
            r8 = r43 & 8
            if (r8 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r39
            goto L_0x007c
        L_0x006a:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r39
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r10
        L_0x007c:
            r10 = r43 & 16
            if (r10 == 0) goto L_0x0085
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r40
            goto L_0x0097
        L_0x0085:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r40
            boolean r14 = r1.F(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r2 = r2 | r14
        L_0x0097:
            r14 = r2 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00ab
            boolean r14 = r1.l()
            if (r14 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            r1.L()
            r5 = r9
            r6 = r13
            goto L_0x01f8
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            goto L_0x00b1
        L_0x00b0:
            r8 = r9
        L_0x00b1:
            if (r10 == 0) goto L_0x00b7
            r9 = 0
            r34 = r9
            goto L_0x00b9
        L_0x00b7:
            r34 = r13
        L_0x00b9:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00c5
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.membership.impl.contextualcard.compose.CardTitle (ContextualCard.kt:225)"
            U0.C4895p.S(r0, r2, r9, r10)
        L_0x00c5:
            int r0 = r2 >> 6
            r0 = r0 & 14
            r0 = r0 | 48
            java.lang.String r9 = "Title"
            U0.A1 r0 = I(r4, r9, r1, r0)
            r9 = 1
            if (r4 == 0) goto L_0x00d7
            r27 = r9
            goto L_0x00dc
        L_0x00d7:
            r10 = 2147483647(0x7fffffff, float:NaN)
            r27 = r10
        L_0x00dc:
            int r10 = IC.C13023e.f110931a
            int r13 = r2 >> 3
            r13 = r13 & 14
            r10 = r10 | r13
            java.lang.String r29 = r3.a(r1, r10)
            r15 = 0
            if (r4 == 0) goto L_0x00ff
            int r10 = r29.length()
            if (r10 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r9 = r15
        L_0x00f2:
            if (r9 == 0) goto L_0x00ff
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r10 = 1058642330(0x3f19999a, float:0.6)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.g(r9, r10)
        L_0x00fd:
            r10 = r9
            goto L_0x0102
        L_0x00ff:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            goto L_0x00fd
        L_0x0102:
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c r9 = r9.o()
            E1.I r9 = androidx.compose.foundation.layout.C5077h.h(r9, r15)
            int r13 = U0.C4883j.a(r1, r15)
            U0.y r14 = r1.s()
            androidx.compose.ui.d r15 = androidx.compose.ui.c.e(r1, r8)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r5 = r16.a()
            U0.f r17 = r1.m()
            if (r17 != 0) goto L_0x0127
            U0.C4883j.c()
        L_0x0127:
            r1.I()
            boolean r17 = r1.i()
            if (r17 == 0) goto L_0x0134
            r1.p(r5)
            goto L_0x0137
        L_0x0134:
            r1.t()
        L_0x0137:
            U0.m r5 = U0.F1.a(r1)
            nI.p r6 = r16.c()
            U0.F1.c(r5, r9, r6)
            nI.p r6 = r16.e()
            U0.F1.c(r5, r14, r6)
            nI.p r6 = r16.b()
            boolean r9 = r5.i()
            if (r9 != 0) goto L_0x0161
            java.lang.Object r9 = r5.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x016f
        L_0x0161:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.w(r9, r6)
        L_0x016f:
            nI.p r6 = r16.d()
            U0.F1.c(r5, r15, r6)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            TC.b$b$b r9 = TC.C13679b.C2857b.C2858b.f116684a
            java.lang.String r6 = "ContextualCardTestTag-Title"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r10, r6)
            int r2 = r2 << 9
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            r31 = r6 | 48
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r2 & r6
            r33 = 98288(0x17ff0, float:1.37731E-40)
            r13 = 0
            r15 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r6 = r8
            r8 = r29
            r11 = r35
            r29 = r34
            r30 = r1
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r8 = -185027702(0xfffffffff4f8b38a, float:-1.5763319E32)
            r1.W(r8)
            float r8 = s(r0)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e6
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "ContextualCardTestTag-TitleSkeleton"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            androidx.compose.ui.d r5 = r5.e(r8)
            r8 = 4
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            A0.f r8 = A0.g.e(r8)
            androidx.compose.ui.d r5 = m1.e.a(r5, r8)
            float r0 = s(r0)
            androidx.compose.ui.d r0 = m1.C5571a.a(r5, r0)
            r5 = 2
            SC.H2.b(r0, r2, r1, r2, r5)
        L_0x01e6:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f5
            U0.C4895p.R()
        L_0x01f5:
            r5 = r6
            r6 = r34
        L_0x01f8:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0211
            Pv.k r10 = new Pv.k
            r0 = r10
            r1 = r35
            r3 = r37
            r4 = r38
            r7 = r42
            r8 = r43
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pv.o.r(long, IC.e, boolean, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    private static final float s(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N t(long j10, C13023e eVar, boolean z10, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        r(j10, eVar, z10, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(Pv.r r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, U0.C4889m r32, int r33, int r34) {
        /*
            r8 = r29
            r15 = r30
            r14 = r33
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            r0 = -419100041(0xffffffffe7050a77, float:-6.282678E23)
            r1 = r32
            U0.m r13 = r1.k(r0)
            r1 = r34 & 1
            r2 = 2
            r3 = 4
            if (r1 == 0) goto L_0x0022
            r1 = r14 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r13.V(r8)
            if (r1 == 0) goto L_0x002e
            r1 = r3
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            r1 = r1 | r14
            goto L_0x0032
        L_0x0031:
            r1 = r14
        L_0x0032:
            r4 = r34 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x0049
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r34 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r5 = r31
        L_0x0051:
            r9 = r1
            goto L_0x0066
        L_0x0053:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r31
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0051
        L_0x0066:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r1 != r6) goto L_0x0079
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r13.L()
            r3 = r13
            goto L_0x01bc
        L_0x0079:
            if (r4 == 0) goto L_0x007f
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r12 = r1
            goto L_0x0080
        L_0x007f:
            r12 = r5
        L_0x0080:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x008c
            r1 = -1
            java.lang.String r4 = "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCard (ContextualCard.kt:88)"
            U0.C4895p.S(r0, r9, r1, r4)
        L_0x008c:
            boolean r5 = r29.n()
            r0 = 0
            if (r5 == 0) goto L_0x00a7
            r1 = 592666580(0x23535fd4, float:1.1458625E-17)
            r13.W(r1)
            tK.h r1 = SC.C13575d.a(r13, r0)
            long r6 = r1.l0()
            r13.P()
        L_0x00a4:
            r16 = r6
            goto L_0x00b9
        L_0x00a7:
            r1 = 592711654(0x23540fe6, float:1.149591E-17)
            r13.W(r1)
            Pv.s r1 = r29.j()
            long r6 = r1.a(r13, r0)
            r13.P()
            goto L_0x00a4
        L_0x00b9:
            r1 = 233(0xe9, float:3.27E-43)
            m0.D r4 = f39531b
            r6 = 0
            m0.y0 r18 = m0.C5548j.j(r1, r0, r4, r2, r6)
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 8
            java.lang.String r19 = "BackgroundColor animation"
            r20 = 0
            r21 = r13
            U0.A1 r1 = l0.u.a(r16, r18, r19, r20, r21, r22, r23)
            Pv.s r2 = r29.j()
            long r10 = r2.b(r13, r0)
            r2 = 1404601256(0x53b883a8, float:1.58496562E12)
            r13.W(r2)
            java.lang.Object r2 = r13.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r7 = r4.a()
            if (r2 != r7) goto L_0x00f1
            U0.o0 r2 = U0.C4877g1.a(r0)
            r13.u(r2)
        L_0x00f1:
            r7 = r2
            U0.o0 r7 = (U0.C4894o0) r7
            r13.P()
            r2 = 1404603016(0x53b88a88, float:1.5851963E12)
            r13.W(r2)
            java.lang.Object r2 = r13.D()
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x010e
            U0.o0 r2 = U0.C4877g1.a(r0)
            r13.u(r2)
        L_0x010e:
            r28 = r2
            U0.o0 r28 = (U0.C4894o0) r28
            r13.P()
            Pv.s r2 = r29.j()
            Pv.f r2 = r2.c()
            if (r2 == 0) goto L_0x012c
            int r4 = w(r7)
            int r16 = y(r28)
            int r4 = r4 + r16
            if (r4 > r3) goto L_0x012c
            r6 = r2
        L_0x012c:
            O0.q r2 = O0.C4748q.f11441a
            long r17 = v(r1)
            int r1 = O0.C4748q.f11442b
            int r26 = r1 << 12
            r27 = 12
            r21 = 0
            r23 = 0
            r16 = r2
            r19 = r10
            r25 = r13
            O0.p r26 = r16.b(r17, r19, r21, r23, r25, r26, r27)
            r3 = 8
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            A0.f r27 = A0.g.e(r3)
            float r0 = (float) r0
            float r17 = c2.h.B(r0)
            int r0 = r1 << 18
            r24 = r0 | 6
            r25 = 62
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = r13
            O0.r r16 = r16.c(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r1 = "ContextualCardTestTag-Root"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            androidx.compose.ui.d r17 = r0.s(r12)
            Pv.o$b r4 = new Pv.o$b
            r0 = r4
            r1 = r6
            r2 = r10
            r10 = r4
            r4 = r29
            r6 = r7
            r7 = r28
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = 54
            r1 = -1242098004(0xffffffffb5f716ac, float:-1.8409532E-6)
            r2 = 1
            c1.a r0 = c1.c.e(r1, r2, r10, r13, r0)
            int r1 = r9 >> 3
            r1 = r1 & 14
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r1 | r2
            r20 = 196(0xc4, float:2.75E-43)
            r11 = 0
            r1 = 0
            r2 = 0
            r9 = r30
            r10 = r17
            r5 = r12
            r12 = r27
            r3 = r13
            r13 = r26
            r14 = r16
            r15 = r1
            r16 = r2
            r17 = r0
            r18 = r3
            O0.C4751s.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01bc
            U0.C4895p.R()
        L_0x01bc:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01d4
            Pv.g r7 = new Pv.g
            r0 = r7
            r1 = r29
            r2 = r30
            r3 = r5
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pv.o.u(Pv.r, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final long v(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final int w(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void x(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final int y(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void z(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }
}
