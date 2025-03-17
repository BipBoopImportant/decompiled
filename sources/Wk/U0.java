package wK;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import J1.e;
import L1.o;
import L1.v;
import L1.x;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.i;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import n0.C5583F;
import n0.C5584G;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import r0.m;
import s0.C5857c;
import s0.C5862h;
import sK.C17950a;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import wK.C18275b5;
import wK.C18390l0;
import wK.C18405m3;
import wK.C18426o0;
import zK.C18756a;
import zK.C18762g;

@Metadata(d1 = {"\u0000v\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001a/\u0010&\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b&\u0010'\u001a#\u0010+\u001a\u00020*2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010/\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100\u001a;\u00105\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-2\b\b\u0002\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106\u001a\u001f\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b8\u00100\u001a\u0019\u0010:\u001a\u0002092\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b:\u0010;¨\u0006=²\u0006\f\u0010<\u001a\u0002038\nX\u0002"}, d2 = {"", "title", "Landroidx/compose/ui/d;", "modifier", "label", "LwK/o0;", "addon", "subTitle", "body", "LwK/W0;", "variant", "LwK/H0;", "cardTheme", "LwK/b5;", "mediaContainer", "Lr0/m;", "interactionSource", "LwK/q0;", "cardFooterContent", "Lkotlin/Function0;", "LXH/N;", "onClick", "m", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/String;LwK/o0;Ljava/lang/String;Ljava/lang/String;LwK/W0;LwK/H0;LwK/b5;Lr0/m;LwK/q0;LnI/a;LU0/m;III)V", "labelPaddingModifier", "p", "(LwK/o0;Landroidx/compose/ui/d;LwK/H0;LU0/m;I)V", "Ln0/G;", "indication", "content", "C", "(Ln0/G;Landroidx/compose/ui/d;LwK/W0;LwK/H0;Lr0/m;LnI/a;LnI/p;LU0/m;II)V", "theme", "t", "(LwK/W0;LwK/H0;LwK/q0;LnI/a;LU0/m;I)V", "LwK/o0$c;", "y", "(LwK/H0;LwK/o0$c;LU0/m;I)V", "E", "(LwK/W0;LwK/H0;LnI/a;LU0/m;I)V", "LwK/P2;", "footerButtonVariant", "LwK/l0;", "O", "(LwK/H0;LwK/P2;)LwK/l0;", "LN1/Y;", "style", "A", "(Ljava/lang/String;LN1/Y;LU0/m;I)V", "headerStyle", "subHeaderStyle", "", "isTextUnderline", "w", "(Ljava/lang/String;Ljava/lang/String;LN1/Y;LN1/Y;ZLU0/m;II)V", "text", "r", "Lp1/v0;", "Q", "(LwK/H0;LU0/m;I)J", "hover", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class U0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f150227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W0 f150228b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f150229c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18275b5 f150230d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f150231e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ H0 f150232f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18450q0 f150233g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f150234h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f150235i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18426o0 f150236j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f150237k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f150238l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f150239m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f150240n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f150241o;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.U0$a$a  reason: collision with other inner class name */
        static final class C4309a implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C18275b5 f150242a;

            C4309a(C18275b5 b5Var) {
                this.f150242a = b5Var;
            }

            public final void a(C5857c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$AspectRatioBox");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1158476106, i10, -1, "net.ikea.skapa.ui.components.Card.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardV2.kt:137)");
                    }
                    ((C18275b5.a) this.f150242a).b().invoke(mVar, 0);
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

        a(A1<Boolean> a12, W0 w02, A1<Boolean> a13, C18275b5 b5Var, F0 f02, H0 h02, C18450q0 q0Var, C17631a<C16807N> aVar, d dVar, C18426o0 o0Var, d dVar2, String str, String str2, String str3, String str4) {
            this.f150227a = a12;
            this.f150228b = w02;
            this.f150229c = a13;
            this.f150230d = b5Var;
            this.f150231e = f02;
            this.f150232f = h02;
            this.f150233g = q0Var;
            this.f150234h = aVar;
            this.f150235i = dVar;
            this.f150236j = o0Var;
            this.f150237k = dVar2;
            this.f150238l = str;
            this.f150239m = str2;
            this.f150240n = str3;
            this.f150241o = str4;
        }

        public final void a(C4889m mVar, int i10) {
            W0 w02;
            String str;
            String str2;
            H0 h02;
            C17631a<C16807N> aVar;
            A1<Boolean> a12;
            A1<Boolean> a13;
            String str3;
            String str4;
            C18450q0 q0Var;
            d dVar;
            boolean z10;
            C18426o0 o0Var;
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1968269966, i11, -1, "net.ikea.skapa.ui.components.Card.<anonymous> (CardV2.kt:98)");
                }
                d.a aVar2 = d.f18749a;
                d d10 = C18756a.d(C18756a.j(J.f(aVar2, 0.0f, 1, (Object) null), U0.n(this.f150229c), false, 2, (Object) null), this.f150227a, false, 0.0f, (C18762g) null, false, false, 62, (Object) null);
                C5073d.m d11 = this.f150228b == W0.Regular ? C5073d.f18068a.d() : C5073d.f18068a.g();
                C18275b5 b5Var = this.f150230d;
                F0 f02 = this.f150231e;
                W0 w03 = this.f150228b;
                H0 h03 = this.f150232f;
                C18450q0 q0Var2 = this.f150233g;
                C17631a<C16807N> aVar3 = this.f150234h;
                d dVar2 = this.f150235i;
                F0 f03 = f02;
                C18426o0 o0Var2 = this.f150236j;
                d dVar3 = this.f150237k;
                String str5 = this.f150238l;
                String str6 = this.f150239m;
                String str7 = this.f150240n;
                A1<Boolean> a14 = this.f150227a;
                String str8 = this.f150241o;
                A1<Boolean> a15 = this.f150229c;
                C5437c.a aVar4 = C5437c.f24302a;
                I a10 = C5080k.a(d11, aVar4.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, d10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a16 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a16);
                } else {
                    mVar.t();
                }
                C4889m a17 = F1.a(mVar);
                F1.c(a17, a10, aVar5.c());
                F1.c(a17, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b10 = aVar5.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a11))) {
                    a17.u(Integer.valueOf(a11));
                    a17.w(Integer.valueOf(a11), b10);
                }
                F1.c(a17, e10, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(1670019893);
                if (b5Var == null) {
                    aVar = aVar3;
                    q0Var = q0Var2;
                    h02 = h03;
                    w02 = w03;
                    o0Var = o0Var2;
                    dVar = dVar3;
                    str2 = str5;
                    str4 = str6;
                    str3 = str7;
                    a13 = a14;
                    str = str8;
                    z10 = true;
                    a12 = a15;
                } else {
                    mVar2.W(1670021119);
                    if (b5Var instanceof C18275b5.b) {
                        mVar2.W(183082911);
                        C18275b5.b bVar = (C18275b5.b) b5Var;
                        aVar = aVar3;
                        q0Var = q0Var2;
                        h02 = h03;
                        C5583F.a(bVar.c(), bVar.b(), C5074e.b(J.h(aVar2, 0.0f, 1, (Object) null), bVar.a().b(), false, 2, (Object) null), (C5437c) null, C4478k.f5915a.a(), 0.0f, (C5749w0) null, mVar, 24576, 104);
                        mVar.P();
                        w02 = w03;
                        o0Var = o0Var2;
                        dVar = dVar3;
                        str2 = str5;
                        str4 = str6;
                        str3 = str7;
                        a13 = a14;
                        str = str8;
                        z10 = true;
                        a12 = a15;
                    } else {
                        aVar = aVar3;
                        q0Var = q0Var2;
                        h02 = h03;
                        W0 w04 = w03;
                        if (b5Var instanceof C18275b5.c) {
                            mVar2.W(183600394);
                            C18275b5.c cVar = (C18275b5.c) b5Var;
                            C18339g9 a18 = cVar.a();
                            List c10 = cVar.c();
                            C17542s.h(c10, "null cannot be cast to non-null type kotlin.collections.List<net.ikea.skapa.ui.components.ShoppableImageItem<kotlin.Any?>>");
                            Object d12 = cVar.d();
                            boolean f10 = cVar.f();
                            cVar.e();
                            C17642l b11 = cVar.b();
                            C17542s.h(b11, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>");
                            w02 = w04;
                            o0Var = o0Var2;
                            dVar = dVar3;
                            str2 = str5;
                            str4 = str6;
                            str3 = str7;
                            a13 = a14;
                            str = str8;
                            a12 = a15;
                            C18507u9.q(a18, c10, dVar2, d12, f10, (C18327f9) null, (C17642l) null, (C17642l) W.g(b11, 1), mVar, 0, 64);
                            mVar.P();
                        } else {
                            w02 = w04;
                            o0Var = o0Var2;
                            dVar = dVar3;
                            str2 = str5;
                            str4 = str6;
                            str3 = str7;
                            a13 = a14;
                            str = str8;
                            a12 = a15;
                            if (b5Var instanceof C18275b5.d) {
                                mVar2.W(184208707);
                                C18275b5.d dVar4 = (C18275b5.d) b5Var;
                                G9.f(dVar4.a(), dVar4.d(), dVar4.b(), dVar4.c(), mVar, 0);
                                mVar.P();
                            } else if (b5Var instanceof C18275b5.a) {
                                mVar2.W(184515173);
                                z10 = true;
                                C18485t.b(((C18275b5.a) b5Var).a(), dVar2, false, 0, c1.c.e(-1158476106, true, new C4309a(b5Var), mVar2, 54), mVar, 24576, 12);
                                mVar.P();
                            } else {
                                mVar2.W(-1379568224);
                                mVar.P();
                                throw new t();
                            }
                        }
                        z10 = true;
                    }
                    mVar.P();
                }
                mVar.P();
                d h10 = D.h(aVar2, f03.b());
                V0 v02 = V0.f150267a;
                d z11 = J.z(h10, v02.c(), v02.b());
                I a19 = C5080k.a(C5073d.f18068a.g(), aVar4.k(), mVar2, 0);
                int a20 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                d e11 = androidx.compose.ui.c.e(mVar2, z11);
                C17631a<C4504g> a21 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a21);
                } else {
                    mVar.t();
                }
                C4889m a22 = F1.a(mVar);
                F1.c(a22, a19, aVar5.c());
                F1.c(a22, s11, aVar5.e());
                p<C4504g, Integer, C16807N> b12 = aVar5.b();
                if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                    a22.u(Integer.valueOf(a20));
                    a22.w(Integer.valueOf(a20), b12);
                }
                F1.c(a22, e11, aVar5.d());
                H0 h04 = h02;
                U0.p(o0Var, dVar, h04, mVar2, 0);
                mVar2.W(1282483631);
                String str9 = str2;
                if (str9 != null && !C15854t.v0(str9)) {
                    U0.A(str9, f03.c(), mVar2, 0);
                }
                mVar.P();
                U0.w(str4, str3, f03.e(), f03.d(), (U0.n(a12) || a13.getValue().booleanValue()) ? z10 : false, mVar, 0, 0);
                mVar2.W(1282496970);
                String str10 = str;
                if (str10 != null && !C15854t.v0(str10)) {
                    U0.r(str10, f03.a(), mVar2, 0);
                }
                mVar.P();
                mVar.x();
                U0.t(w02, h04, q0Var, aVar, mVar, 0);
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
    static final class b implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f150243a = new b();

        b() {
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(927008066);
            if (C4895p.J()) {
                C4895p.S(927008066, i10, -1, "net.ikea.skapa.ui.components.Card.<anonymous> (CardV2.kt:82)");
            }
            d m10 = D.m(d.f18749a, 0.0f, 0.0f, 0.0f, C18029u.f147649a.j(), 7, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return m10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150244a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f150245b;

        /* JADX WARNING: Can't wrap try/catch for region: R(68:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|(2:63|64)|65|67|68|(2:69|70)|71|73) */
        /* JADX WARNING: Can't wrap try/catch for region: R(69:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|67|68|(2:69|70)|71|73) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|67|68|(2:69|70)|71|73) */
        /* JADX WARNING: Can't wrap try/catch for region: R(71:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|67|68|69|70|71|73) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0147 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                wK.H0[] r0 = wK.H0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                wK.H0 r2 = wK.H0.Default     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                wK.H0 r3 = wK.H0.NewLowerPrice     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.H0 r3 = wK.H0.New     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.H0 r3 = wK.H0.IkeaFamily     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                wK.H0 r3 = wK.H0.Wayfinding     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                wK.H0 r3 = wK.H0.IkeaBusinessNetwork     // Catch:{ NoSuchFieldError -> 0x003d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r4 = 6
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                wK.H0 r3 = wK.H0.LowestPrice     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r4 = 7
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                wK.H0 r3 = wK.H0.Sustainability     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r4 = 8
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                wK.H0 r3 = wK.H0.ImportantMessage     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r4 = 9
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                wK.H0 r3 = wK.H0.Inverse     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r4 = 10
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                wK.H0 r3 = wK.H0.ExtendedPalette05     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4 = 11
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                wK.H0 r3 = wK.H0.ExtendedPalette07     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r4 = 12
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                wK.H0 r3 = wK.H0.ExtendedPalette16     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r4 = 13
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                wK.H0 r3 = wK.H0.ExtendedPalette19     // Catch:{ NoSuchFieldError -> 0x008c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r4 = 14
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                wK.H0 r3 = wK.H0.ExtendedPalette01     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r4 = 15
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                wK.H0 r3 = wK.H0.ExtendedPalette02     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r4 = 16
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                wK.H0 r3 = wK.H0.ExtendedPalette03     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r4 = 17
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                wK.H0 r3 = wK.H0.ExtendedPalette04     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r4 = 18
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                wK.H0 r3 = wK.H0.ExtendedPalette06     // Catch:{ NoSuchFieldError -> 0x00be }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r4 = 19
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                wK.H0 r3 = wK.H0.ExtendedPalette08     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r4 = 20
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                wK.H0 r3 = wK.H0.ExtendedPalette09     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r4 = 21
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                wK.H0 r3 = wK.H0.ExtendedPalette10     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r4 = 22
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                wK.H0 r3 = wK.H0.ExtendedPalette11     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r4 = 23
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                wK.H0 r3 = wK.H0.ExtendedPalette12     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r4 = 24
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                wK.H0 r3 = wK.H0.ExtendedPalette13     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r4 = 25
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                wK.H0 r3 = wK.H0.ExtendedPalette14     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r4 = 26
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                wK.H0 r3 = wK.H0.ExtendedPalette15     // Catch:{ NoSuchFieldError -> 0x010e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r4 = 27
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                wK.H0 r3 = wK.H0.ExtendedPalette17     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r4 = 28
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                wK.H0 r3 = wK.H0.ExtendedPalette18     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r4 = 29
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                wK.H0 r3 = wK.H0.ExtendedPalette20     // Catch:{ NoSuchFieldError -> 0x012c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r4 = 30
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                wK.H0 r3 = wK.H0.ExtendedPalette21     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r4 = 31
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                f150244a = r0
                wK.W0[] r0 = wK.W0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.W0 r3 = wK.W0.Regular     // Catch:{ NoSuchFieldError -> 0x0147 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0147 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0147 }
            L_0x0147:
                wK.W0 r1 = wK.W0.Simple     // Catch:{ NoSuchFieldError -> 0x014f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014f }
            L_0x014f:
                f150245b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.U0.c.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final void A(String str, Y y10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        Y y11 = y10;
        C4889m k10 = mVar.k(1554357742);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(y11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1554357742, i11, -1, "net.ikea.skapa.ui.components.CardLabel (CardV2.kt:593)");
            }
            mVar2 = k10;
            d1.b(str, D.m(d.f18749a, 0.0f, C18029u.f147649a.j(), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar2, i11 & 14, (i11 << 15) & 3670016, 65532);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Q0(str, y10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(String str, Y y10, int i10, C4889m mVar, int i11) {
        A(str, y10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void C(n0.C5584G r26, androidx.compose.ui.d r27, wK.W0 r28, wK.H0 r29, r0.m r30, nI.C17631a<XH.C16807N> r31, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r3 = r28
            r4 = r29
            r7 = r32
            r8 = r34
            r0 = 16
            r1 = 32
            r2 = 2
            r5 = 4
            r6 = -1009822157(0xffffffffc3cf5633, float:-414.67343)
            r9 = r33
            U0.m r9 = r9.k(r6)
            r10 = r35 & 1
            if (r10 == 0) goto L_0x0021
            r10 = r8 | 6
            r11 = r10
            r10 = r26
            goto L_0x0035
        L_0x0021:
            r10 = r8 & 6
            if (r10 != 0) goto L_0x0032
            r10 = r26
            boolean r11 = r9.V(r10)
            if (r11 == 0) goto L_0x002f
            r11 = r5
            goto L_0x0030
        L_0x002f:
            r11 = r2
        L_0x0030:
            r11 = r11 | r8
            goto L_0x0035
        L_0x0032:
            r10 = r26
            r11 = r8
        L_0x0035:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x003e
            r11 = r11 | 48
        L_0x003b:
            r2 = r27
            goto L_0x004e
        L_0x003e:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x003b
            r2 = r27
            boolean r12 = r9.V(r2)
            if (r12 == 0) goto L_0x004c
            r12 = r1
            goto L_0x004d
        L_0x004c:
            r12 = r0
        L_0x004d:
            r11 = r11 | r12
        L_0x004e:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x0055
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0065
            boolean r5 = r9.V(r3)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r11 = r11 | r5
        L_0x0065:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x006c
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x007c
            boolean r5 = r9.V(r4)
            if (r5 == 0) goto L_0x0079
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r11 = r11 | r5
        L_0x007c:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0085
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r5 = r30
            goto L_0x0097
        L_0x0085:
            r5 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r30
            boolean r12 = r9.V(r5)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r11 = r11 | r12
        L_0x0097:
            r1 = r35 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a1
            r11 = r11 | r12
        L_0x009e:
            r1 = r31
            goto L_0x00b3
        L_0x00a1:
            r1 = r8 & r12
            if (r1 != 0) goto L_0x009e
            r1 = r31
            boolean r12 = r9.F(r1)
            if (r12 == 0) goto L_0x00b0
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r11 = r11 | r12
        L_0x00b3:
            r12 = r35 & 64
            r13 = 1572864(0x180000, float:2.204052E-39)
            if (r12 == 0) goto L_0x00bc
            r11 = r11 | r13
        L_0x00ba:
            r15 = r11
            goto L_0x00cd
        L_0x00bc:
            r12 = r8 & r13
            if (r12 != 0) goto L_0x00ba
            boolean r12 = r9.F(r7)
            if (r12 == 0) goto L_0x00c9
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r11 = r11 | r12
            goto L_0x00ba
        L_0x00cd:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r15
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r12) goto L_0x00e2
            boolean r11 = r9.l()
            if (r11 != 0) goto L_0x00dd
            goto L_0x00e2
        L_0x00dd:
            r9.L()
            goto L_0x01e8
        L_0x00e2:
            if (r0 == 0) goto L_0x0103
            r0 = -125417101(0xfffffffff8864973, float:-2.1789297E34)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L_0x00fd
            r0.m r0 = r0.l.a()
            r9.u(r0)
        L_0x00fd:
            r0.m r0 = (r0.m) r0
            r9.P()
            goto L_0x0104
        L_0x0103:
            r0 = r5
        L_0x0104:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0110
            r5 = -1
            java.lang.String r11 = "net.ikea.skapa.ui.components.CardSurface (CardV2.kt:426)"
            U0.C4895p.S(r6, r15, r5, r11)
        L_0x0110:
            L1.i$a r5 = L1.i.f8936b
            int r5 = r5.a()
            L1.i r16 = L1.i.h(r5)
            r18 = 12
            r19 = 0
            r14 = 0
            r5 = 0
            r11 = r27
            r12 = r0
            r13 = r26
            r6 = r15
            r15 = r5
            r17 = r31
            androidx.compose.ui.d r20 = androidx.compose.foundation.d.b(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = -125406326(0xfffffffff886738a, float:-2.1815975E34)
            r9.W(r5)
            wK.W0 r5 = wK.W0.Regular
            if (r3 != r5) goto L_0x0142
            int r5 = r6 >> 9
            r5 = r5 & 14
            long r11 = Q(r4, r9, r5)
        L_0x013f:
            r21 = r11
            goto L_0x0149
        L_0x0142:
            p1.v0$a r5 = p1.C5747v0.f27350b
            long r11 = r5.h()
            goto L_0x013f
        L_0x0149:
            r9.P()
            r24 = 2
            r25 = 0
            r23 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r20, r21, r23, r24, r25)
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c r11 = r11.o()
            r12 = 0
            E1.I r11 = androidx.compose.foundation.layout.C5077h.h(r11, r12)
            int r12 = U0.C4883j.a(r9, r12)
            U0.y r13 = r9.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r9, r5)
            G1.g$a r14 = G1.C4504g.f6515W
            nI.a r15 = r14.a()
            U0.f r16 = r9.m()
            if (r16 != 0) goto L_0x017c
            U0.C4883j.c()
        L_0x017c:
            r9.I()
            boolean r16 = r9.i()
            if (r16 == 0) goto L_0x0189
            r9.p(r15)
            goto L_0x018c
        L_0x0189:
            r9.t()
        L_0x018c:
            U0.m r15 = U0.F1.a(r9)
            r30 = r0
            nI.p r0 = r14.c()
            U0.F1.c(r15, r11, r0)
            nI.p r0 = r14.e()
            U0.F1.c(r15, r13, r0)
            nI.p r0 = r14.b()
            boolean r11 = r15.i()
            if (r11 != 0) goto L_0x01b8
            java.lang.Object r11 = r15.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x01c6
        L_0x01b8:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.w(r11, r0)
        L_0x01c6:
            nI.p r0 = r14.d()
            U0.F1.c(r15, r5, r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            int r0 = r6 >> 18
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r9, r0)
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e6
            U0.C4895p.R()
        L_0x01e6:
            r5 = r30
        L_0x01e8:
            U0.Y0 r11 = r9.n()
            if (r11 == 0) goto L_0x0207
            wK.M0 r12 = new wK.M0
            r0 = r12
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r6 = r31
            r7 = r32
            r8 = r34
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.U0.C(n0.G, androidx.compose.ui.d, wK.W0, wK.H0, r0.m, nI.a, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C5584G g10, d dVar, W0 w02, H0 h02, m mVar, C17631a aVar, p pVar, int i10, int i11, C4889m mVar2, int i12) {
        C(g10, dVar, w02, h02, mVar, aVar, pVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void E(W0 w02, H0 h02, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        W0 w03 = w02;
        H0 h03 = h02;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(14780548);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(w03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(h03) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(14780548, i11, -1, "net.ikea.skapa.ui.components.DefaultCardFooterContent (CardV2.kt:536)");
            }
            int i13 = c.f150245b[w02.ordinal()];
            if (i13 == 1) {
                k10.W(-995846841);
                int i14 = C17950a.f147156e;
                d.a aVar3 = d.f18749a;
                k10.W(-1417594157);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new S0();
                    k10.u(D10);
                }
                k10.P();
                mVar2 = k10;
                C18357i3.c(i14, (String) null, o.d(aVar3, false, (C17642l) D10, 1, (Object) null), false, h03 == H0.Inverse ? C18405m3.c.f151239b : C18405m3.c.b.f151242b, C18381k3.Small, (m) null, false, aVar, k10, ((i11 << 18) & 234881024) | 196656, 200);
                mVar2.P();
            } else if (i13 == 2) {
                k10.W(-995436990);
                C5942c c10 = e.c(C17950a.f147156e, k10, 0);
                d.a aVar4 = d.f18749a;
                k10.W(-1417580397);
                Object D11 = k10.D();
                if (D11 == C4889m.f14007a.a()) {
                    D11 = new T0();
                    k10.u(D11);
                }
                k10.P();
                V.a(c10, (String) null, o.d(aVar4, false, (C17642l) D11, 1, (Object) null), 0, k10, 48, 8);
                k10.P();
                mVar2 = k10;
            } else {
                k10.W(-1417598853);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new J0(w03, h03, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.z(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.z(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(W0 w02, H0 h02, C17631a aVar, int i10, C4889m mVar, int i11) {
        E(w02, h02, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final C18390l0 O(H0 h02, P2 p22) {
        switch (h02 == null ? -1 : c.f150244a[h02.ordinal()]) {
            case 1:
            case 10:
                return p22 == P2.Secondary ? C18390l0.f.f151159b : C18390l0.d.f151153b;
            case 2:
            case 3:
            case 4:
            case 8:
            case 9:
                return p22 == P2.Secondary ? C18390l0.f.a.f151161b : C18390l0.d.a.f151155b;
            case 5:
            case 11:
            case 12:
            case 13:
            case 14:
                return p22 == P2.Secondary ? C18390l0.f.b.f151162b : C18390l0.d.b.f151156b;
            case 6:
            case 7:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return p22 == P2.Secondary ? C18390l0.f.c.f151163b : C18390l0.d.c.f151157b;
            default:
                return p22 == P2.Secondary ? C18390l0.f.f151159b : C18390l0.d.f151153b;
        }
    }

    static /* synthetic */ C18390l0 P(H0 h02, P2 p22, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            p22 = P2.Primary;
        }
        return O(h02, p22);
    }

    private static final long Q(H0 h02, C4889m mVar, int i10) {
        long j10;
        mVar.W(-1617338819);
        int i11 = -1;
        if (C4895p.J()) {
            C4895p.S(-1617338819, i10, -1, "net.ikea.skapa.ui.components.surfaceBackgroundColor (CardV2.kt:621)");
        }
        if (h02 != null) {
            i11 = c.f150244a[h02.ordinal()];
        }
        switch (i11) {
            case -1:
                mVar.W(1597888868);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).L0();
                mVar.P();
                break;
            case 1:
                mVar.W(1597816001);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).l0();
                mVar.P();
                break;
            case 2:
                mVar.W(1597829815);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).h();
                mVar.P();
                break;
            case 3:
                mVar.W(1597832173);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).g();
                mVar.P();
                break;
            case 4:
                mVar.W(1597827220);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).f();
                mVar.P();
                break;
            case 5:
                mVar.W(1597822252);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).A0();
                mVar.P();
                break;
            case 6:
                mVar.W(1597824786);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).C0();
                mVar.P();
                break;
            case 7:
                mVar.W(1597819795);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).e();
                mVar.P();
                break;
            case 8:
                mVar.W(1597836655);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).c();
                mVar.P();
                break;
            case 9:
                mVar.W(1597834625);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).p0();
                mVar.P();
                break;
            case 10:
                mVar.W(1597817795);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).k();
                mVar.P();
                break;
            case 11:
                mVar.W(1597848810);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).q();
                mVar.P();
                break;
            case 12:
                mVar.W(1597853610);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).s();
                mVar.P();
                break;
            case 13:
                mVar.W(1597875210);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).B();
                mVar.P();
                break;
            case 14:
                mVar.W(1597882410);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).E();
                mVar.P();
                break;
            case 15:
                mVar.W(1597839210);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).m();
                mVar.P();
                break;
            case 16:
                mVar.W(1597841610);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).n();
                mVar.P();
                break;
            case 17:
                mVar.W(1597844010);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).o();
                mVar.P();
                break;
            case 18:
                mVar.W(1597846410);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).p();
                mVar.P();
                break;
            case 19:
                mVar.W(1597851210);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).r();
                mVar.P();
                break;
            case 20:
                mVar.W(1597856010);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).t();
                mVar.P();
                break;
            case 21:
                mVar.W(1597858410);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).u();
                mVar.P();
                break;
            case 22:
                mVar.W(1597860810);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).v();
                mVar.P();
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                mVar.W(1597863210);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).w();
                mVar.P();
                break;
            case BuildConfig.MIN_SDK_VERSION:
                mVar.W(1597865610);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).x();
                mVar.P();
                break;
            case 25:
                mVar.W(1597868010);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).y();
                mVar.P();
                break;
            case 26:
                mVar.W(1597870410);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).z();
                mVar.P();
                break;
            case 27:
                mVar.W(1597872810);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).A();
                mVar.P();
                break;
            case 28:
                mVar.W(1597877610);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).C();
                mVar.P();
                break;
            case 29:
                mVar.W(1597880010);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).D();
                mVar.P();
                break;
            case 30:
                mVar.W(1597884810);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).F();
                mVar.P();
                break;
            case 31:
                mVar.W(1597887210);
                j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).G();
                mVar.P();
                break;
            default:
                mVar.W(1597816241);
                mVar.P();
                throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(java.lang.String r35, androidx.compose.ui.d r36, java.lang.String r37, wK.C18426o0 r38, java.lang.String r39, java.lang.String r40, wK.W0 r41, wK.H0 r42, wK.C18275b5 r43, r0.m r44, wK.C18450q0 r45, nI.C17631a<XH.C16807N> r46, U0.C4889m r47, int r48, int r49, int r50) {
        /*
            r15 = r35
            r14 = r46
            r13 = r48
            r12 = r50
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -1386850562(0xffffffffad5656fe, float:-1.2183808E-11)
            r1 = r47
            U0.m r11 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.V(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
        L_0x0038:
            r7 = r36
            goto L_0x004d
        L_0x003b:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0038
            r7 = r36
            boolean r8 = r11.V(r7)
            if (r8 == 0) goto L_0x004a
            r8 = 32
            goto L_0x004c
        L_0x004a:
            r8 = 16
        L_0x004c:
            r1 = r1 | r8
        L_0x004d:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r9 = r37
            goto L_0x0068
        L_0x0056:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0053
            r9 = r37
            boolean r10 = r11.V(r9)
            if (r10 == 0) goto L_0x0065
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r10
        L_0x0068:
            r10 = r12 & 8
            if (r10 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r2 = r38
            goto L_0x0084
        L_0x0071:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006e
            r2 = r38
            boolean r16 = r11.V(r2)
            if (r16 == 0) goto L_0x0080
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r16
        L_0x0084:
            r16 = r12 & 16
            if (r16 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r5 = r39
            goto L_0x00a0
        L_0x008d:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x008a
            r5 = r39
            boolean r18 = r11.V(r5)
            if (r18 == 0) goto L_0x009c
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r18
        L_0x00a0:
            r18 = r12 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x00ab
            r1 = r1 | r19
            r6 = r40
            goto L_0x00be
        L_0x00ab:
            r19 = r13 & r19
            r6 = r40
            if (r19 != 0) goto L_0x00be
            boolean r20 = r11.V(r6)
            if (r20 == 0) goto L_0x00ba
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r1 = r1 | r20
        L_0x00be:
            r20 = r12 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00c9
            r1 = r1 | r21
            r3 = r41
            goto L_0x00dc
        L_0x00c9:
            r22 = r13 & r21
            r3 = r41
            if (r22 != 0) goto L_0x00dc
            boolean r23 = r11.V(r3)
            if (r23 == 0) goto L_0x00d8
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r23
        L_0x00dc:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e7
            r1 = r1 | r24
            r2 = r42
            goto L_0x00fa
        L_0x00e7:
            r24 = r13 & r24
            r2 = r42
            if (r24 != 0) goto L_0x00fa
            boolean r24 = r11.V(r2)
            if (r24 == 0) goto L_0x00f6
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r24
        L_0x00fa:
            r2 = r12 & 256(0x100, float:3.59E-43)
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0105
            r1 = r1 | r24
            r3 = r43
            goto L_0x0118
        L_0x0105:
            r24 = r13 & r24
            r3 = r43
            if (r24 != 0) goto L_0x0118
            boolean r24 = r11.V(r3)
            if (r24 == 0) goto L_0x0114
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r24
        L_0x0118:
            r3 = r12 & 512(0x200, float:7.175E-43)
            r24 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0123
            r1 = r1 | r24
            r5 = r44
            goto L_0x0136
        L_0x0123:
            r24 = r13 & r24
            r5 = r44
            if (r24 != 0) goto L_0x0136
            boolean r24 = r11.V(r5)
            if (r24 == 0) goto L_0x0132
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0134
        L_0x0132:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0134:
            r1 = r1 | r24
        L_0x0136:
            r5 = r12 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x013f
            r24 = r49 | 6
            r6 = r45
            goto L_0x0155
        L_0x013f:
            r24 = r49 & 6
            r6 = r45
            if (r24 != 0) goto L_0x0153
            boolean r24 = r11.V(r6)
            if (r24 == 0) goto L_0x014e
            r24 = 4
            goto L_0x0150
        L_0x014e:
            r24 = 2
        L_0x0150:
            r24 = r49 | r24
            goto L_0x0155
        L_0x0153:
            r24 = r49
        L_0x0155:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x015e
            r24 = r24 | 48
        L_0x015b:
            r6 = r24
            goto L_0x0170
        L_0x015e:
            r6 = r49 & 48
            if (r6 != 0) goto L_0x015b
            boolean r6 = r11.F(r14)
            if (r6 == 0) goto L_0x016b
            r17 = 32
            goto L_0x016d
        L_0x016b:
            r17 = 16
        L_0x016d:
            r24 = r24 | r17
            goto L_0x015b
        L_0x0170:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r1 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r9) goto L_0x01a1
            r7 = r6 & 19
            r9 = 18
            if (r7 != r9) goto L_0x01a1
            boolean r7 = r11.l()
            if (r7 != 0) goto L_0x0187
            goto L_0x01a1
        L_0x0187:
            r11.L()
            r17 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r2 = r11
            r11 = r45
            goto L_0x031f
        L_0x01a1:
            if (r4 == 0) goto L_0x01a8
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r17 = r4
            goto L_0x01aa
        L_0x01a8:
            r17 = r36
        L_0x01aa:
            r4 = 0
            if (r8 == 0) goto L_0x01b0
            r19 = r4
            goto L_0x01b2
        L_0x01b0:
            r19 = r37
        L_0x01b2:
            if (r10 == 0) goto L_0x01b9
            wK.o0$d r7 = wK.C18426o0.d.f151334b
            r24 = r7
            goto L_0x01bb
        L_0x01b9:
            r24 = r38
        L_0x01bb:
            if (r16 == 0) goto L_0x01c0
            r16 = r4
            goto L_0x01c2
        L_0x01c0:
            r16 = r39
        L_0x01c2:
            if (r18 == 0) goto L_0x01c7
            r18 = r4
            goto L_0x01c9
        L_0x01c7:
            r18 = r40
        L_0x01c9:
            if (r20 == 0) goto L_0x01d0
            wK.W0 r7 = wK.W0.Regular
            r20 = r7
            goto L_0x01d2
        L_0x01d0:
            r20 = r41
        L_0x01d2:
            if (r0 == 0) goto L_0x01d9
            wK.H0 r0 = wK.H0.Default
            r25 = r0
            goto L_0x01db
        L_0x01d9:
            r25 = r42
        L_0x01db:
            if (r2 == 0) goto L_0x01e0
            r26 = r4
            goto L_0x01e2
        L_0x01e0:
            r26 = r43
        L_0x01e2:
            if (r3 == 0) goto L_0x0204
            r0 = -1558783512(0xffffffffa316d9e8, float:-8.17766E-18)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x01fd
            r0.m r0 = r0.l.a()
            r11.u(r0)
        L_0x01fd:
            r0.m r0 = (r0.m) r0
            r11.P()
            r10 = r0
            goto L_0x0206
        L_0x0204:
            r10 = r44
        L_0x0206:
            if (r5 == 0) goto L_0x020b
            r27 = r4
            goto L_0x020d
        L_0x020b:
            r27 = r45
        L_0x020d:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = "net.ikea.skapa.ui.components.Card (CardV2.kt:80)"
            r2 = -1386850562(0xffffffffad5656fe, float:-1.2183808E-11)
            U0.C4895p.S(r2, r1, r6, r0)
        L_0x021b:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r9 = 1
            if (r19 == 0) goto L_0x0229
            boolean r2 = HJ.C15854t.v0(r19)
            if (r2 == 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r2 = 0
            goto L_0x022a
        L_0x0229:
            r2 = r9
        L_0x022a:
            wK.U0$b r3 = wK.U0.b.f150243a
            r5 = 6
            androidx.compose.ui.d r23 = vK.C18205e.h(r0, r2, r3, r11, r5)
            wK.V0 r0 = wK.V0.f150267a
            int r2 = r1 >> 18
            r3 = r2 & 14
            r3 = r3 | 384(0x180, float:5.38E-43)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            r36 = r0
            r37 = r20
            r38 = r25
            r39 = r11
            r40 = r2
            r41 = r3
            wK.F0 r5 = r36.d(r37, r38, r39, r40, r41)
            r0 = -1558771780(0xffffffffa31707bc, float:-8.187364E-18)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x026a
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 2
            m0.a r0 = m0.C5532b.b(r0, r2, r3, r4)
            r11.u(r0)
        L_0x026a:
            m0.a r0 = (m0.C5530a) r0
            r11.P()
            int r2 = r1 >> 27
            r2 = r2 & 14
            U0.A1 r3 = r0.i.a(r10, r11, r2)
            U0.A1 r2 = r0.C5814f.a(r10, r11, r2)
            int r4 = m0.C5530a.f25673m
            int r4 = r4 << 12
            r7 = 15
            r8 = 0
            r22 = 0
            r28 = 0
            r29 = 0
            r36 = r8
            r37 = r22
            r38 = r28
            r39 = r29
            r40 = r0
            r41 = r11
            r42 = r4
            r43 = r7
            n0.G r22 = zK.C18767l.c(r36, r37, r38, r39, r40, r41, r42, r43)
            wK.U0$a r8 = new wK.U0$a
            r0 = r8
            r28 = r1
            r1 = r2
            r2 = r20
            r4 = r26
            r29 = r6
            r6 = r25
            r7 = r27
            r30 = r8
            r8 = r46
            r9 = r17
            r31 = r10
            r10 = r24
            r32 = r11
            r11 = r23
            r12 = r19
            r13 = r35
            r14 = r16
            r15 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 54
            r1 = -1968269966(0xffffffff8aae9572, float:-1.6811806E-32)
            r4 = r30
            r2 = r32
            r3 = 1
            c1.a r0 = c1.c.e(r1, r3, r4, r2, r0)
            r1 = r28 & 112(0x70, float:1.57E-43)
            r1 = r1 | r21
            int r3 = r28 >> 12
            r4 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r4
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r3 = r28 >> 15
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            int r4 = r29 << 12
            r3 = r3 & r4
            r1 = r1 | r3
            r3 = 0
            r36 = r22
            r37 = r17
            r38 = r20
            r39 = r25
            r40 = r31
            r41 = r46
            r42 = r0
            r43 = r2
            r44 = r1
            r45 = r3
            C(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x030d
            U0.C4895p.R()
        L_0x030d:
            r5 = r16
            r6 = r18
            r3 = r19
            r7 = r20
            r4 = r24
            r8 = r25
            r9 = r26
            r11 = r27
            r10 = r31
        L_0x031f:
            U0.Y0 r15 = r2.n()
            if (r15 == 0) goto L_0x0342
            wK.I0 r14 = new wK.I0
            r0 = r14
            r1 = r35
            r2 = r17
            r12 = r46
            r13 = r48
            r33 = r14
            r14 = r49
            r34 = r15
            r15 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.U0.m(java.lang.String, androidx.compose.ui.d, java.lang.String, wK.o0, java.lang.String, java.lang.String, wK.W0, wK.H0, wK.b5, r0.m, wK.q0, nI.a, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean n(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, d dVar, String str2, C18426o0 o0Var, String str3, String str4, W0 w02, H0 h02, C18275b5 b5Var, m mVar, C18450q0 q0Var, C17631a aVar, int i10, int i11, int i12, C4889m mVar2, int i13) {
        m(str, dVar, str2, o0Var, str3, str4, w02, h02, b5Var, mVar, q0Var, aVar, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void p(C18426o0 o0Var, d dVar, H0 h02, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-78518269);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.V(h02) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-78518269, i11, -1, "net.ikea.skapa.ui.components.CardAddon (CardV2.kt:185)");
            }
            if (o0Var instanceof C18426o0.a) {
                k10.W(-621788621);
                C18426o0.a aVar = (C18426o0.a) o0Var;
                C18240I.b(aVar.b(), aVar.a(), dVar, k10, (i11 << 3) & 896, 0);
                k10.P();
            } else if (o0Var instanceof C18426o0.c) {
                k10.W(-621785351);
                y(h02, (C18426o0.c) o0Var, k10, (i11 >> 6) & 14);
                k10.P();
            } else if (o0Var instanceof C18426o0.b) {
                k10.W(-621783292);
                C18426o0.b bVar = (C18426o0.b) o0Var;
                J1.c(bVar.a(), bVar.b(), dVar, O1.Emphasised, k10, ((i11 << 3) & 896) | 3072, 0);
                k10.P();
            } else {
                k10.W(-621776627);
                k10.P();
                C18426o0.d dVar2 = C18426o0.d.f151334b;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new P0(o0Var, dVar, h02, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C18426o0 o0Var, d dVar, H0 h02, int i10, C4889m mVar, int i11) {
        p(o0Var, dVar, h02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void r(String str, Y y10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        Y y11 = y10;
        C4889m k10 = mVar.k(773252376);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(y11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(773252376, i11, -1, "net.ikea.skapa.ui.components.CardBody (CardV2.kt:616)");
            }
            mVar2 = k10;
            d1.b(str, D.m(d.f18749a, 0.0f, C18029u.f147649a.l(), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar2, i11 & 14, (i11 << 15) & 3670016, 65532);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new L0(str, y10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, Y y10, int i10, C4889m mVar, int i11) {
        r(str, y10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(wK.W0 r19, wK.H0 r20, wK.C18450q0 r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24) {
        /*
            r1 = r19
            r2 = r20
            r3 = r21
            r0 = r22
            r15 = r24
            r4 = -203686627(0xfffffffff3dbfd1d, float:-3.4858605E31)
            r5 = r23
            U0.m r14 = r5.k(r4)
            r5 = r15 & 6
            r6 = 2
            if (r5 != 0) goto L_0x0023
            boolean r5 = r14.V(r1)
            if (r5 == 0) goto L_0x0020
            r5 = 4
            goto L_0x0021
        L_0x0020:
            r5 = r6
        L_0x0021:
            r5 = r5 | r15
            goto L_0x0024
        L_0x0023:
            r5 = r15
        L_0x0024:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x0034
            boolean r7 = r14.V(r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r5 = r5 | r7
        L_0x0034:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r14.V(r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r5 = r5 | r7
        L_0x0044:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r14.F(r0)
            if (r7 == 0) goto L_0x0051
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r5 = r5 | r7
        L_0x0054:
            r7 = r5 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0067
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r14.L()
            r6 = r14
            goto L_0x01cb
        L_0x0067:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0073
            r7 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.components.CardFooterContent (CardV2.kt:455)"
            U0.C4895p.S(r4, r5, r7, r8)
        L_0x0073:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r7 = -1859153231(0xffffffff912f92b1, float:-1.3850269E-28)
            r14.W(r7)
            java.lang.Object r7 = r14.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x008f
            wK.N0 r7 = new wK.N0
            r7.<init>()
            r14.u(r7)
        L_0x008f:
            nI.l r7 = (nI.C17642l) r7
            r14.P()
            androidx.compose.ui.d r4 = androidx.compose.ui.focus.k.a(r4, r7)
            wK.V0 r7 = wK.V0.f150267a
            r8 = r5 & 14
            r8 = r8 | 48
            s0.E r7 = r7.a(r1, r14, r8)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.h(r4, r7)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c r7 = r7.o()
            r8 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5077h.h(r7, r8)
            int r8 = U0.C4883j.a(r14, r8)
            U0.y r9 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r14.m()
            if (r12 != 0) goto L_0x00cc
            U0.C4883j.c()
        L_0x00cc:
            r14.I()
            boolean r12 = r14.i()
            if (r12 == 0) goto L_0x00d9
            r14.p(r11)
            goto L_0x00dc
        L_0x00d9:
            r14.t()
        L_0x00dc:
            U0.m r11 = U0.F1.a(r14)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r7, r12)
            nI.p r7 = r10.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0106
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0114
        L_0x0106:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x0114:
            nI.p r7 = r10.d()
            U0.F1.c(r11, r4, r7)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r4 = r3 instanceof wK.C18450q0.a
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            if (r4 == 0) goto L_0x0166
            r4 = 1596271572(0x5f252bd4, float:1.190184E19)
            r14.W(r4)
            r4 = r3
            wK.q0$a r4 = (wK.C18450q0.a) r4
            java.lang.String r8 = r4.a()
            r9 = 0
            wK.l0 r9 = P(r2, r9, r6, r9)
            wK.j0 r10 = wK.C18366j0.Small
            java.lang.Integer r11 = r4.b()
            vK.a r12 = r4.c()
            int r4 = r5 << 18
            r4 = r4 & r7
            r13 = r4 | 24576(0x6000, float:3.4438E-41)
            r16 = 294(0x126, float:4.12E-43)
            r5 = 0
            r6 = 0
            r17 = 0
            r18 = 0
            r4 = r8
            r7 = r9
            r8 = r10
            r9 = r17
            r10 = r11
            r11 = r12
            r12 = r18
            r17 = r13
            r13 = r22
            r23 = r14
            r15 = r17
            wK.C18342h0.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r23.P()
        L_0x0163:
            r6 = r23
            goto L_0x01bf
        L_0x0166:
            r23 = r14
            boolean r4 = r3 instanceof wK.C18450q0.b
            if (r4 == 0) goto L_0x01aa
            r4 = 1596284831(0x5f255f9f, float:1.1916418E19)
            r15 = r23
            r15.W(r4)
            r4 = r3
            wK.q0$b r4 = (wK.C18450q0.b) r4
            java.lang.String r6 = r4.a()
            wK.P2 r8 = wK.P2.Secondary
            wK.l0 r8 = O(r2, r8)
            wK.j0 r9 = wK.C18366j0.Small
            java.lang.Integer r10 = r4.b()
            vK.a r11 = r4.c()
            int r4 = r5 << 18
            r4 = r4 & r7
            r14 = r4 | 24576(0x6000, float:3.4438E-41)
            r16 = 294(0x126, float:4.12E-43)
            r5 = 0
            r7 = 0
            r12 = 0
            r13 = 0
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            r12 = r13
            r13 = r22
            r17 = r14
            r14 = r15
            r15 = r17
            wK.C18342h0.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r23.P()
            goto L_0x0163
        L_0x01aa:
            r4 = 1596296617(0x5f258da9, float:1.1929377E19)
            r6 = r23
            r6.W(r4)
            r4 = r5 & 126(0x7e, float:1.77E-43)
            int r5 = r5 >> 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            E(r1, r2, r0, r6, r4)
            r6.P()
        L_0x01bf:
            r6.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01cb
            U0.C4895p.R()
        L_0x01cb:
            U0.Y0 r6 = r6.n()
            if (r6 == 0) goto L_0x01e4
            wK.O0 r7 = new wK.O0
            r0 = r7
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.U0.t(wK.W0, wK.H0, wK.q0, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(W0 w02, H0 h02, C18450q0 q0Var, C17631a aVar, int i10, C4889m mVar, int i11) {
        t(w02, h02, q0Var, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(i iVar) {
        C17542s.j(iVar, "$this$focusProperties");
        iVar.w(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(java.lang.String r49, java.lang.String r50, N1.Y r51, N1.Y r52, boolean r53, U0.C4889m r54, int r55, int r56) {
        /*
            r0 = r50
            r15 = r55
            r1 = 1158748465(0x45111931, float:2321.5745)
            r2 = r54
            U0.m r13 = r2.k(r1)
            r2 = r56 & 1
            if (r2 == 0) goto L_0x0016
            r2 = r15 | 6
            r14 = r49
            goto L_0x0028
        L_0x0016:
            r2 = r15 & 6
            r14 = r49
            if (r2 != 0) goto L_0x0027
            boolean r2 = r13.V(r14)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r15
            goto L_0x0028
        L_0x0027:
            r2 = r15
        L_0x0028:
            r3 = r56 & 2
            if (r3 == 0) goto L_0x002f
            r2 = r2 | 48
            goto L_0x003f
        L_0x002f:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x003f
            boolean r3 = r13.V(r0)
            if (r3 == 0) goto L_0x003c
            r3 = 32
            goto L_0x003e
        L_0x003c:
            r3 = 16
        L_0x003e:
            r2 = r2 | r3
        L_0x003f:
            r3 = r56 & 4
            if (r3 == 0) goto L_0x0048
            r2 = r2 | 384(0x180, float:5.38E-43)
            r12 = r51
            goto L_0x005a
        L_0x0048:
            r3 = r15 & 384(0x180, float:5.38E-43)
            r12 = r51
            if (r3 != 0) goto L_0x005a
            boolean r3 = r13.V(r12)
            if (r3 == 0) goto L_0x0057
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r2 = r2 | r3
        L_0x005a:
            r3 = r56 & 8
            if (r3 == 0) goto L_0x0063
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r11 = r52
            goto L_0x0075
        L_0x0063:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            r11 = r52
            if (r3 != 0) goto L_0x0075
            boolean r3 = r13.V(r11)
            if (r3 == 0) goto L_0x0072
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r2 = r2 | r3
        L_0x0075:
            r3 = r56 & 16
            if (r3 == 0) goto L_0x007e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r4 = r53
            goto L_0x0090
        L_0x007e:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x007b
            r4 = r53
            boolean r5 = r13.b(r4)
            if (r5 == 0) goto L_0x008d
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r2 = r2 | r5
        L_0x0090:
            r5 = r2 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r6) goto L_0x00a5
            boolean r5 = r13.l()
            if (r5 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r13.L()
            r5 = r4
            r25 = r13
            goto L_0x0196
        L_0x00a5:
            if (r3 == 0) goto L_0x00ab
            r3 = 0
            r48 = r3
            goto L_0x00ad
        L_0x00ab:
            r48 = r4
        L_0x00ad:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b9
            r3 = -1
            java.lang.String r4 = "net.ikea.skapa.ui.components.CardHeaders (CardV2.kt:602)"
            U0.C4895p.S(r1, r2, r3, r4)
        L_0x00b9:
            if (r48 == 0) goto L_0x00fd
            Y1.k$a r1 = Y1.k.f14792b
            Y1.k r33 = r1.d()
            r46 = 16773119(0xffefff, float:2.3504146E-38)
            r47 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r16 = r51
            N1.Y r1 = N1.Y.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            r36 = r1
            goto L_0x00ff
        L_0x00fd:
            r36 = r12
        L_0x00ff:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            tK.u r10 = tK.C18029u.f147649a
            float r5 = r10.f()
            r8 = 13
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
            r38 = r2 & 14
            r39 = 0
            r40 = 65532(0xfffc, float:9.183E-41)
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r16 = r49
            r37 = r13
            O0.d1.b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            if (r0 == 0) goto L_0x0144
            boolean r3 = HJ.C15854t.v0(r50)
            if (r3 == 0) goto L_0x0147
        L_0x0144:
            r25 = r13
            goto L_0x018b
        L_0x0147:
            float r5 = r10.j()
            r8 = 13
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
            int r3 = r2 >> 3
            r22 = r3 & 14
            int r2 = r2 << 9
            r3 = 3670016(0x380000, float:5.142788E-39)
            r23 = r2 & r3
            r24 = 65532(0xfffc, float:9.183E-41)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r11 = r16
            r12 = r16
            r16 = 0
            r25 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r50
            r20 = r52
            r21 = r25
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x018b:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0194
            U0.C4895p.R()
        L_0x0194:
            r5 = r48
        L_0x0196:
            U0.Y0 r8 = r25.n()
            if (r8 == 0) goto L_0x01b1
            wK.R0 r9 = new wK.R0
            r0 = r9
            r1 = r49
            r2 = r50
            r3 = r51
            r4 = r52
            r6 = r55
            r7 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.U0.w(java.lang.String, java.lang.String, N1.Y, N1.Y, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(String str, String str2, Y y10, Y y11, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        w(str, str2, y10, y11, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void y(H0 h02, C18426o0.c cVar, C4889m mVar, int i10) {
        int i11;
        long K02;
        H0 h03 = h02;
        C18426o0.c cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1168903436);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(h03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(cVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            int i13 = -1;
            if (C4895p.J()) {
                C4895p.S(1168903436, i11, -1, "net.ikea.skapa.ui.components.CardIcon (CardV2.kt:489)");
            }
            if (h03 != null) {
                i13 = c.f150244a[h02.ordinal()];
            }
            if (i13 == 1) {
                k10.W(-2007774874);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).G0();
                k10.P();
            } else if (i13 == 2 || i13 == 3) {
                k10.W(-2007772282);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).K0();
                k10.P();
            } else if (i13 == 4) {
                k10.W(-2007770266);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).K0();
                k10.P();
            } else if (C16877v.l0(C16877v.q(H0.ExtendedPalette05, H0.ExtendedPalette07, H0.ExtendedPalette16, H0.ExtendedPalette19), h03) || i13 == 5) {
                k10.W(-2007762075);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).F0();
                k10.P();
            } else if (C16877v.l0(C16877v.q(H0.ExtendedPalette01, H0.ExtendedPalette02, H0.ExtendedPalette03, H0.ExtendedPalette04, H0.ExtendedPalette06, H0.ExtendedPalette08, H0.ExtendedPalette09, H0.ExtendedPalette10, H0.ExtendedPalette11, H0.ExtendedPalette12, H0.ExtendedPalette13, H0.ExtendedPalette14, H0.ExtendedPalette15, H0.ExtendedPalette17, H0.ExtendedPalette18, H0.ExtendedPalette20, H0.ExtendedPalette21), h03) || i13 == 6 || i13 == 7) {
                k10.W(-2007735835);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).x0();
                k10.P();
            } else if (i13 == 8 || i13 == 9) {
                k10.W(-2007732826);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).K0();
                k10.P();
            } else {
                k10.W(-2007731322);
                K02 = C18030v.f147664a.a(k10, C18030v.f147665b).G0();
                k10.P();
            }
            V.a(e.c(cVar.a(), k10, 0), (String) null, (d) null, K02, k10, 48, 4);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new K0(h03, cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(H0 h02, C18426o0.c cVar, int i10, C4889m mVar, int i11) {
        y(h02, cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
