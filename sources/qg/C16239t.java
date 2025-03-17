package QG;

import A0.g;
import E1.C4478k;
import E1.C4488v;
import E1.I;
import EK.C15673a;
import G1.C4504g;
import J1.e;
import J1.j;
import N1.E;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import OE.C13316h;
import QG.C16219E;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U5.e;
import XH.C16807N;
import Y1.k;
import Y1.o;
import Y1.s;
import android.net.Uri;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import c2.w;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import n0.C5602h;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import oF.C14898g;
import oF.C14899h;
import p1.C5747v0;
import p1.C5749w0;
import p1.g1;
import p1.i1;
import r0.m;
import rF.C15002a;
import s0.C5842M;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import wK.C18381k3;
import wK.C18405m3;
import wK.I4;
import wK.J4;
import wK.X4;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ay\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u001f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b!\u0010\"\u001aa\u0010'\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010 \u001a\u00020\u001f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0007¢\u0006\u0004\b'\u0010(\u001a=\u0010*\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b*\u0010+\u001aM\u0010.\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0001\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0007¢\u0006\u0004\b.\u0010/\u001a5\u00104\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0003¢\u0006\u0004\b4\u00105\u001a\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0003\u001a\u0002062\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b7\u00108¨\u0006;²\u0006\u0010\u0010:\u001a\u0004\u0018\u0001098\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LQG/E;", "button", "", "isSelected", "isLoading", "Lkotlin/Function1;", "LXH/N;", "onClick", "E", "(Landroidx/compose/ui/d;LQG/E;ZZLnI/l;LU0/m;II)V", "LQG/E$c;", "q", "(Landroidx/compose/ui/d;LQG/E$c;ZZLnI/l;LU0/m;II)V", "LQG/E$d;", "r", "(Landroidx/compose/ui/d;LQG/E$d;ZZLnI/l;LU0/m;II)V", "", "testTag", "isEnabled", "", "labelResId", "iconResId", "contentDescriptionResId", "LoF/h;", "tooltip", "Lkotlin/Function0;", "s", "(Landroidx/compose/ui/d;Ljava/lang/String;ZZZIILjava/lang/Integer;LoF/h;LnI/a;LU0/m;II)V", "LQG/E$b;", "Lr0/m;", "interactionSource", "I", "(LQG/E$b;Landroidx/compose/ui/d;Lr0/m;LnI/l;LU0/m;II)V", "LwK/k3;", "size", "LwK/m3;", "variant", "J", "(Landroidx/compose/ui/d;ILjava/lang/Integer;ZLwK/k3;LwK/m3;Lr0/m;LnI/a;LU0/m;II)V", "LQG/E$f;", "N", "(LQG/E$f;Landroidx/compose/ui/d;ZLnI/l;LU0/m;II)V", "Landroid/net/Uri;", "imageUrl", "O", "(Landroidx/compose/ui/d;ILandroid/net/Uri;IZLnI/a;LU0/m;II)V", "Lc2/h;", "elevation", "Ln0/g;", "border", "C", "(Landroid/net/Uri;FILn0/g;LU0/m;II)V", "LQG/E$a;", "G", "(LQG/E$a;Landroidx/compose/ui/d;LU0/m;I)V", "LE1/v;", "buttonCoordinates", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QG.t  reason: case insensitive filesystem */
public final class C16239t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.t$a */
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f137362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<C4488v> f137363b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C14899h f137364c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f137365d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f137366e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f137367f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Integer f137368g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f137369h;

        a(boolean z10, C4899r0<C4488v> r0Var, C14899h hVar, boolean z11, boolean z12, int i10, Integer num, int i11) {
            this.f137362a = z10;
            this.f137363b = r0Var;
            this.f137364c = hVar;
            this.f137365d = z11;
            this.f137366e = z12;
            this.f137367f = i10;
            this.f137368g = num;
            this.f137369h = i11;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1333953012, i11, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.ButtonWithLabel.<anonymous> (DecorateToolbarButton.kt:238)");
                }
                long f10 = C15002a.a(mVar2, 0).f();
                long o10 = this.f137362a ? f10 : C5747v0.o(f10, 0.25f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                C4488v S10 = C16239t.A(this.f137363b);
                mVar2.W(889277100);
                if (S10 != null) {
                    C14899h hVar = this.f137364c;
                    mVar2.W(889278392);
                    if (hVar != null) {
                        C14898g.n(hVar, S10, mVar2, C14899h.f130160a);
                        C16807N n10 = C16807N.f139792a;
                    }
                    mVar.P();
                }
                mVar.P();
                boolean z10 = this.f137365d;
                boolean z11 = this.f137366e;
                int i12 = this.f137367f;
                Integer num = this.f137368g;
                int i13 = this.f137369h;
                d.a aVar = d.f18749a;
                C5437c.a aVar2 = C5437c.f24302a;
                I h10 = C5077h.h(aVar2.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
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
                F1.c(a12, h10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                mVar2.W(54066554);
                if (z10) {
                    C5077h.a(androidx.compose.foundation.b.c(jVar.a(J.t(aVar, h.B((float) 6)), aVar2.h()), f10, g.h()), mVar2, 0);
                }
                mVar.P();
                d m11 = D.m(J.y(aVar, h.B((float) 48)), h.B((float) 2), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                I a13 = C5080k.a(C5073d.f18068a.g(), aVar2.g(), mVar2, 48);
                int a14 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                d e11 = androidx.compose.ui.c.e(mVar2, m11);
                C17631a<C4504g> a15 = aVar3.a();
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
                F1.c(a16, a13, aVar3.c());
                F1.c(a16, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b11);
                }
                F1.c(a16, e11, aVar3.d());
                C5862h hVar2 = C5862h.f28810a;
                if (z11) {
                    mVar2.W(249874941);
                    X4.q((d) null, J4.Primary, I4.Medium, mVar, 432, 1);
                    mVar.P();
                } else {
                    mVar2.W(250004955);
                    C5942c c10 = e.c(i12, mVar2, 0);
                    mVar2.W(-961761620);
                    String b12 = num == null ? null : j.b(num.intValue(), mVar2, 0);
                    mVar.P();
                    V.a(c10, b12, (d) null, o10, mVar, 0, 4);
                    mVar.P();
                }
                float f11 = (float) 4;
                C5844O.a(J.i(aVar, h.B(f11)), mVar2, 6);
                d G10 = J.G(D.i(aVar, h.B(f11)), (C5437c.b) null, false, 3, (Object) null);
                String b13 = j.b(i13, mVar2, 0);
                Y y10 = r22;
                Y y11 = new Y(o10, w.i(7), (C) null, (C4830x) null, (C4831y) null, C15673a.a(), (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (r1.g) null, 0, 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777180, (DefaultConstructorMarker) null);
                d1.b(b13, G10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.a()), 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar, 48, 0, 65020);
                mVar.x();
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
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.t$b */
    static final class b implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f137370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f137371b;

        b(int i10, Uri uri) {
            this.f137370a = i10;
            this.f137371b = uri;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-759547036, i11, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.CardContent.<anonymous> (DecorateToolbarButton.kt:500)");
                }
                d.a aVar = d.f18749a;
                d f10 = J.f(aVar, 0.0f, 1, (Object) null);
                C5073d.f b10 = C5073d.f18068a.b();
                C5437c.b g10 = C5437c.f24302a.g();
                int i12 = this.f137370a;
                Uri uri = this.f137371b;
                I a10 = C5080k.a(b10, g10, mVar2, 54);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, f10);
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
                Uri uri2 = uri;
                U5.s.b(uri2, j.b(i12, mVar2, 0), androidx.compose.foundation.b.d(D.i(J.t(aVar, h.B((float) 44)), h.B((float) 8)), C5747v0.f27350b.h(), (i1) null, 2, (Object) null), e.c(C13316h.f112844Z, mVar2, 0), (C5942c) null, (C5942c) null, (C17642l<? super e.c.C0658c, C16807N>) null, (C17642l<? super e.c.d, C16807N>) null, (C17642l<? super e.c.b, C16807N>) null, (C5437c) null, C4478k.f5915a.f(), 0.0f, (C5749w0) null, 0, false, mVar, 384, 6, 31728);
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
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.t$c */
    static final class c implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f137372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f137373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137374c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5601g f137375d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f137376e;

        c(boolean z10, Uri uri, int i10, C5601g gVar, int i11) {
            this.f137372a = z10;
            this.f137373b = uri;
            this.f137374c = i10;
            this.f137375d = gVar;
            this.f137376e = i11;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1931815002, i11, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.ImageWithLabel.<anonymous> (DecorateToolbarButton.kt:434)");
                }
                d.a aVar = d.f18749a;
                d i12 = D.i(aVar, h.B((float) 6));
                C5073d.f b10 = C5073d.f18068a.b();
                C5437c.b g10 = C5437c.f24302a.g();
                boolean z10 = this.f137372a;
                Uri uri = this.f137373b;
                int i13 = this.f137374c;
                C5601g gVar = this.f137375d;
                int i14 = this.f137376e;
                I a10 = C5080k.a(b10, g10, mVar2, 54);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, i12);
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
                if (z10) {
                    mVar2.W(-1926566641);
                    C16239t.C(uri, h.B((float) 0), i13, C5602h.a(h.B((float) 2), C15002a.a(mVar2, 0).f()), mVar, 48, 0);
                    mVar.P();
                } else {
                    mVar2.W(-1926255060);
                    C16239t.C(uri, h.B((float) 0), i13, gVar, mVar, 48, 0);
                    mVar.P();
                }
                float f10 = (float) 4;
                C5844O.a(J.i(aVar, h.B(f10)), mVar2, 6);
                d G10 = J.G(D.i(aVar, h.B(f10)), (C5437c.b) null, false, 3, (Object) null);
                String b12 = j.b(i14, mVar2, 0);
                Y y10 = r22;
                Y y11 = new Y(C15002a.a(mVar2, 0).f(), w.i(8), (C) null, (C4830x) null, (C4831y) null, C15673a.a(), (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (r1.g) null, 0, 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777180, (DefaultConstructorMarker) null);
                d1.b(b12, G10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.a()), 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar, 48, 0, 65020);
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
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C4488v A(C4899r0<C4488v> r0Var) {
        return r0Var.getValue();
    }

    private static final void B(C4899r0<C4488v> r0Var, C4488v vVar) {
        r0Var.setValue(vVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(android.net.Uri r21, float r22, int r23, n0.C5601g r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r21
            r3 = r23
            r5 = r26
            r0 = -1518913294(0xffffffffa57738f2, float:-2.1443129E-16)
            r2 = r25
            U0.m r2 = r2.k(r0)
            r4 = r27 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r5 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r2.F(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r5
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x002f
            r4 = r4 | 48
            r15 = r22
            goto L_0x0041
        L_0x002f:
            r6 = r5 & 48
            r15 = r22
            if (r6 != 0) goto L_0x0041
            boolean r6 = r2.c(r15)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r4 = r4 | r6
        L_0x0041:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x0048
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0058
            boolean r6 = r2.d(r3)
            if (r6 == 0) goto L_0x0055
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r6
        L_0x0058:
            r6 = r27 & 8
            if (r6 == 0) goto L_0x0061
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r7 = r24
            goto L_0x0073
        L_0x0061:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x005e
            r7 = r24
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x0070
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r4 = r4 | r8
        L_0x0073:
            r8 = r4 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0086
            boolean r8 = r2.l()
            if (r8 != 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            r2.L()
            r4 = r7
            goto L_0x012a
        L_0x0086:
            if (r6 == 0) goto L_0x008c
            r6 = 0
            r18 = r6
            goto L_0x008e
        L_0x008c:
            r18 = r7
        L_0x008e:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x009a
            r6 = -1
            java.lang.String r7 = "com.sugarcube.decorate.v2.internal.ui.toolbars.CardContent (DecorateToolbarButton.kt:485)"
            U0.C4895p.S(r0, r4, r6, r7)
        L_0x009a:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = 52
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.t(r0, r6)
            p1.v0$a r0 = p1.C5747v0.f27350b
            long r8 = r0.h()
            r11 = 2
            r12 = 0
            r10 = 0
            androidx.compose.ui.d r19 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            O0.q r20 = O0.C4748q.f11441a
            long r7 = r0.j()
            long r9 = r0.j()
            long r13 = r0.j()
            long r11 = r0.j()
            int r0 = O0.C4748q.f11442b
            int r6 = r0 << 12
            r6 = r6 | 3510(0xdb6, float:4.919E-42)
            r17 = 0
            r16 = r6
            r6 = r20
            r15 = r2
            O0.p r16 = r6.b(r7, r9, r11, r13, r15, r16, r17)
            int r6 = r4 >> 3
            r6 = r6 & 14
            int r0 = r0 << 18
            r14 = r6 | r0
            r15 = 62
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r20
            r7 = r22
            r13 = r2
            O0.r r9 = r6.c(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 50
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            A0.f r7 = A0.g.e(r0)
            QG.t$b r0 = new QG.t$b
            r0.<init>(r3, r1)
            r6 = 54
            r8 = -759547036(0xffffffffd2ba3b64, float:-3.99930163E11)
            r10 = 1
            c1.a r11 = c1.c.e(r8, r10, r0, r2, r6)
            r0 = 57344(0xe000, float:8.0356E-41)
            int r4 = r4 << 3
            r0 = r0 & r4
            r4 = 196614(0x30006, float:2.75515E-40)
            r13 = r0 | r4
            r14 = 0
            r6 = r19
            r8 = r16
            r10 = r18
            r12 = r2
            O0.C4751s.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0128
            U0.C4895p.R()
        L_0x0128:
            r4 = r18
        L_0x012a:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0143
            QG.j r8 = new QG.j
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.C(android.net.Uri, float, int, n0.g, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N D(Uri uri, float f10, int i10, C5601g gVar, int i11, int i12, C4889m mVar, int i13) {
        C(uri, f10, i10, gVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(androidx.compose.ui.d r16, QG.C16219E r17, boolean r18, boolean r19, nI.C17642l<? super QG.C16219E, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r2 = r17
            r11 = r20
            r12 = r22
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1115768085(0xffffffffbd7ebaeb, float:-0.062189978)
            r1 = r21
            U0.m r1 = r1.k(r0)
            r3 = r23 & 1
            if (r3 == 0) goto L_0x0023
            r4 = r12 | 6
            r5 = r4
            r4 = r16
            goto L_0x0037
        L_0x0023:
            r4 = r12 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r16
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0031
            r5 = 4
            goto L_0x0032
        L_0x0031:
            r5 = 2
        L_0x0032:
            r5 = r5 | r12
            goto L_0x0037
        L_0x0034:
            r4 = r16
            r5 = r12
        L_0x0037:
            r6 = r23 & 2
            if (r6 == 0) goto L_0x003e
            r5 = r5 | 48
            goto L_0x004e
        L_0x003e:
            r6 = r12 & 48
            if (r6 != 0) goto L_0x004e
            boolean r6 = r1.V(r2)
            if (r6 == 0) goto L_0x004b
            r6 = 32
            goto L_0x004d
        L_0x004b:
            r6 = 16
        L_0x004d:
            r5 = r5 | r6
        L_0x004e:
            r6 = r23 & 4
            if (r6 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r7 = r18
            goto L_0x0069
        L_0x0057:
            r7 = r12 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0054
            r7 = r18
            boolean r8 = r1.b(r7)
            if (r8 == 0) goto L_0x0066
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r5 = r5 | r8
        L_0x0069:
            r8 = r23 & 8
            if (r8 == 0) goto L_0x0072
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006f:
            r9 = r19
            goto L_0x0084
        L_0x0072:
            r9 = r12 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x006f
            r9 = r19
            boolean r10 = r1.b(r9)
            if (r10 == 0) goto L_0x0081
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r5 = r5 | r10
        L_0x0084:
            r10 = r23 & 16
            if (r10 == 0) goto L_0x008b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x008b:
            r10 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x009b
            boolean r10 = r1.F(r11)
            if (r10 == 0) goto L_0x0098
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r5 = r5 | r10
        L_0x009b:
            r10 = r5 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r13) goto L_0x00b0
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            r1.L()
            r13 = r4
            r3 = r7
            r4 = r9
            goto L_0x0179
        L_0x00b0:
            if (r3 == 0) goto L_0x00b6
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r13 = r3
            goto L_0x00b7
        L_0x00b6:
            r13 = r4
        L_0x00b7:
            r3 = 0
            if (r6 == 0) goto L_0x00bc
            r14 = r3
            goto L_0x00bd
        L_0x00bc:
            r14 = r7
        L_0x00bd:
            if (r8 == 0) goto L_0x00c1
            r15 = r3
            goto L_0x00c2
        L_0x00c1:
            r15 = r9
        L_0x00c2:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ce
            r3 = -1
            java.lang.String r4 = "com.sugarcube.decorate.v2.internal.ui.toolbars.DecorateToolbarButton (DecorateToolbarButton.kt:88)"
            U0.C4895p.S(r0, r5, r3, r4)
        L_0x00ce:
            boolean r0 = r2 instanceof QG.C16219E.c
            r3 = 65422(0xff8e, float:9.1676E-41)
            if (r0 == 0) goto L_0x00ef
            r0 = -416237965(0xffffffffe730b673, float:-8.345021E23)
            r1.W(r0)
            r4 = r2
            QG.E$c r4 = (QG.C16219E.c) r4
            r9 = r5 & r3
            r10 = 0
            r3 = r13
            r5 = r14
            r6 = r15
            r7 = r20
            r8 = r1
            q(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.P()
            goto L_0x016e
        L_0x00ef:
            boolean r0 = r2 instanceof QG.C16219E.d
            if (r0 == 0) goto L_0x010c
            r0 = -416230029(0xffffffffe730d573, float:-8.3507394E23)
            r1.W(r0)
            r4 = r2
            QG.E$d r4 = (QG.C16219E.d) r4
            r9 = r5 & r3
            r10 = 0
            r3 = r13
            r5 = r14
            r6 = r15
            r7 = r20
            r8 = r1
            r(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.P()
            goto L_0x016e
        L_0x010c:
            boolean r0 = r2 instanceof QG.C16219E.b
            if (r0 == 0) goto L_0x0130
            r0 = -416222554(0xffffffffe730f2a6, float:-8.356126E23)
            r1.W(r0)
            r3 = r2
            QG.E$b r3 = (QG.C16219E.b) r3
            int r0 = r5 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r4 = r5 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r8 = r0 | r4
            r9 = 4
            r5 = 0
            r4 = r13
            r6 = r20
            r7 = r1
            I(r3, r4, r5, r6, r7, r8, r9)
            r1.P()
            goto L_0x016e
        L_0x0130:
            boolean r0 = r2 instanceof QG.C16219E.f
            if (r0 == 0) goto L_0x0157
            r0 = -416217297(0xffffffffe731072f, float:-8.359914E23)
            r1.W(r0)
            r3 = r2
            QG.E$f r3 = (QG.C16219E.f) r3
            int r0 = r5 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r4 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            int r4 = r5 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r8 = r0 | r4
            r9 = 0
            r4 = r13
            r5 = r14
            r6 = r20
            r7 = r1
            N(r3, r4, r5, r6, r7, r8, r9)
            r1.P()
            goto L_0x016e
        L_0x0157:
            boolean r0 = r2 instanceof QG.C16219E.a
            if (r0 == 0) goto L_0x0192
            r0 = -416211103(0xffffffffe7311f61, float:-8.364377E23)
            r1.W(r0)
            r0 = r2
            QG.E$a r0 = (QG.C16219E.a) r0
            int r3 = r5 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            G(r0, r13, r1, r3)
            r1.P()
        L_0x016e:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0177
            U0.C4895p.R()
        L_0x0177:
            r3 = r14
            r4 = r15
        L_0x0179:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0191
            QG.d r9 = new QG.d
            r0 = r9
            r1 = r13
            r2 = r17
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0191:
            return
        L_0x0192:
            r0 = -416239183(0xffffffffe730b1b1, float:-8.344143E23)
            r1.W(r0)
            r1.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.E(androidx.compose.ui.d, QG.E, boolean, boolean, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N F(d dVar, C16219E e10, boolean z10, boolean z11, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        E(dVar, e10, z10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void G(C16219E.a aVar, d dVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "button");
        C17542s.j(dVar, "modifier");
        C4889m k10 = mVar.k(-1323312859);
        if ((i10 & 48) == 0) {
            i11 = (k10.V(dVar) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) != 16 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1323312859, i11, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.Divider (DecorateToolbarButton.kt:521)");
            }
            C5844O.a(J.t(dVar, h.B((float) 48)), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C16233n(aVar, dVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C16219E.a aVar, d dVar, int i10, C4889m mVar, int i11) {
        G(aVar, dVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void I(QG.C16219E.b r18, androidx.compose.ui.d r19, r0.m r20, nI.C17642l<? super QG.C16219E, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r1 = r18
            r13 = r19
            r14 = r21
            r15 = r23
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -1605962795(0xffffffffa046f3d5, float:-1.685193E-19)
            r2 = r22
            U0.m r12 = r2.k(r0)
            r2 = r24 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0028
            r2 = r15 | 6
            goto L_0x0038
        L_0x0028:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0037
            boolean r2 = r12.V(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = 2
        L_0x0035:
            r2 = r2 | r15
            goto L_0x0038
        L_0x0037:
            r2 = r15
        L_0x0038:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x003f
            r2 = r2 | 48
            goto L_0x004f
        L_0x003f:
            r4 = r15 & 48
            if (r4 != 0) goto L_0x004f
            boolean r4 = r12.V(r13)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004c:
            r4 = 16
        L_0x004e:
            r2 = r2 | r4
        L_0x004f:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0058
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r5 = r20
            goto L_0x006a
        L_0x0058:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0055
            r5 = r20
            boolean r6 = r12.V(r5)
            if (r6 == 0) goto L_0x0067
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r6
        L_0x006a:
            r6 = r24 & 8
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0073
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0073:
            r6 = r15 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0082
            boolean r6 = r12.F(r14)
            if (r6 == 0) goto L_0x007f
            r6 = r7
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r6
        L_0x0082:
            r6 = r2 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L_0x0096
            boolean r6 = r12.l()
            if (r6 != 0) goto L_0x008f
            goto L_0x0096
        L_0x008f:
            r12.L()
            r3 = r5
            r0 = r12
            goto L_0x0137
        L_0x0096:
            if (r4 == 0) goto L_0x00b9
            r4 = -324468162(0xffffffffeca9023e, float:-1.6345524E27)
            r12.W(r4)
            java.lang.Object r4 = r12.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x00b1
            r0.m r4 = r0.l.a()
            r12.u(r4)
        L_0x00b1:
            r0.m r4 = (r0.m) r4
            r12.P()
            r16 = r4
            goto L_0x00bb
        L_0x00b9:
            r16 = r5
        L_0x00bb:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00c7
            r4 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.toolbars.IconButton (DecorateToolbarButton.kt:311)"
            U0.C4895p.S(r0, r2, r4, r5)
        L_0x00c7:
            int r0 = r18.g()
            java.lang.Integer r4 = r18.e()
            boolean r5 = r18.f()
            wK.k3 r6 = r18.h()
            wK.m3 r8 = r18.i()
            r9 = -324455407(0xffffffffeca93411, float:-1.6364347E27)
            r12.W(r9)
            r9 = r2 & 7168(0x1c00, float:1.0045E-41)
            r10 = 0
            r11 = 1
            if (r9 != r7) goto L_0x00e9
            r7 = r11
            goto L_0x00ea
        L_0x00e9:
            r7 = r10
        L_0x00ea:
            r9 = r2 & 14
            if (r9 != r3) goto L_0x00ef
            r10 = r11
        L_0x00ef:
            r3 = r7 | r10
            java.lang.Object r7 = r12.D()
            if (r3 != 0) goto L_0x00ff
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x0107
        L_0x00ff:
            QG.f r7 = new QG.f
            r7.<init>(r14, r1)
            r12.u(r7)
        L_0x0107:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r12.P()
            int r3 = r2 >> 3
            r3 = r3 & 14
            int r7 = wK.C18405m3.f151234a
            int r7 = r7 << 15
            r3 = r3 | r7
            int r2 = r2 << 12
            r7 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r7
            r11 = r3 | r2
            r17 = 0
            r2 = r19
            r3 = r0
            r7 = r8
            r8 = r16
            r10 = r12
            r0 = r12
            r12 = r17
            J(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0135
            U0.C4895p.R()
        L_0x0135:
            r3 = r16
        L_0x0137:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x0150
            QG.g r8 = new QG.g
            r0 = r8
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.I(QG.E$b, androidx.compose.ui.d, r0.m, nI.l, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void J(androidx.compose.ui.d r22, int r23, java.lang.Integer r24, boolean r25, wK.C18381k3 r26, wK.C18405m3 r27, r0.m r28, nI.C17631a<XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r12 = r22
            r0 = r27
            r13 = r29
            r14 = r31
            r15 = r32
            java.lang.String r1 = "modifier"
            kotlin.jvm.internal.C17542s.j(r12, r1)
            java.lang.String r1 = "onClick"
            kotlin.jvm.internal.C17542s.j(r13, r1)
            r1 = 27526431(0x1a4051f, float:6.0251434E-38)
            r2 = r30
            U0.m r11 = r2.k(r1)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0033
            boolean r2 = r11.V(r12)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r14
            goto L_0x0034
        L_0x0033:
            r2 = r14
        L_0x0034:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x003d
            r2 = r2 | 48
            r10 = r23
            goto L_0x004f
        L_0x003d:
            r3 = r14 & 48
            r10 = r23
            if (r3 != 0) goto L_0x004f
            boolean r3 = r11.d(r10)
            if (r3 == 0) goto L_0x004c
            r3 = 32
            goto L_0x004e
        L_0x004c:
            r3 = 16
        L_0x004e:
            r2 = r2 | r3
        L_0x004f:
            r3 = r15 & 4
            if (r3 == 0) goto L_0x0058
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r4 = r24
            goto L_0x006a
        L_0x0058:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0055
            r4 = r24
            boolean r5 = r11.V(r4)
            if (r5 == 0) goto L_0x0067
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r5
        L_0x006a:
            r5 = r15 & 8
            if (r5 == 0) goto L_0x0073
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r9 = r25
            goto L_0x0085
        L_0x0073:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            r9 = r25
            if (r5 != 0) goto L_0x0085
            boolean r5 = r11.b(r9)
            if (r5 == 0) goto L_0x0082
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r2 = r2 | r5
        L_0x0085:
            r5 = r15 & 16
            if (r5 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r6 = r26
            goto L_0x00a0
        L_0x008e:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008b
            r6 = r26
            boolean r7 = r11.V(r6)
            if (r7 == 0) goto L_0x009d
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r7
        L_0x00a0:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00bf
            r7 = r15 & 32
            if (r7 != 0) goto L_0x00bc
            r7 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00b3
            boolean r7 = r11.V(r0)
            goto L_0x00b7
        L_0x00b3:
            boolean r7 = r11.F(r0)
        L_0x00b7:
            if (r7 == 0) goto L_0x00bc
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r2 = r2 | r7
        L_0x00bf:
            r7 = r15 & 64
            r8 = 1572864(0x180000, float:2.204052E-39)
            if (r7 == 0) goto L_0x00c9
            r2 = r2 | r8
        L_0x00c6:
            r8 = r28
            goto L_0x00db
        L_0x00c9:
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00c6
            r8 = r28
            boolean r16 = r11.V(r8)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r16
        L_0x00db:
            r1 = r15 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e4
            r2 = r2 | r17
            goto L_0x00f4
        L_0x00e4:
            r1 = r14 & r17
            if (r1 != 0) goto L_0x00f4
            boolean r1 = r11.F(r13)
            if (r1 == 0) goto L_0x00f1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r2 = r2 | r1
        L_0x00f4:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r2
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x0110
            boolean r0 = r11.l()
            if (r0 != 0) goto L_0x0104
            goto L_0x0110
        L_0x0104:
            r11.L()
            r3 = r4
            r5 = r6
            r7 = r8
            r16 = r11
            r6 = r27
            goto L_0x01ec
        L_0x0110:
            r11.G()
            r0 = r14 & 1
            r1 = 0
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0134
            boolean r0 = r11.O()
            if (r0 == 0) goto L_0x0122
            goto L_0x0134
        L_0x0122:
            r11.L()
            r0 = r15 & 32
            if (r0 == 0) goto L_0x012b
            r2 = r2 & r17
        L_0x012b:
            r19 = r27
        L_0x012d:
            r17 = r4
            r18 = r6
            r20 = r8
            goto L_0x0173
        L_0x0134:
            if (r3 == 0) goto L_0x0137
            r4 = r1
        L_0x0137:
            if (r5 == 0) goto L_0x013c
            wK.k3 r0 = wK.C18381k3.Medium
            r6 = r0
        L_0x013c:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0145
            wK.m3$c r0 = wK.C18405m3.c.f151239b
            r2 = r2 & r17
            goto L_0x0147
        L_0x0145:
            r0 = r27
        L_0x0147:
            if (r7 == 0) goto L_0x0170
            r3 = -324419298(0xffffffffeca9c11e, float:-1.6417635E27)
            r11.W(r3)
            java.lang.Object r3 = r11.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x0162
            r0.m r3 = r0.l.a()
            r11.u(r3)
        L_0x0162:
            r0.m r3 = (r0.m) r3
            r11.P()
            r19 = r0
            r20 = r3
            r17 = r4
            r18 = r6
            goto L_0x0173
        L_0x0170:
            r19 = r0
            goto L_0x012d
        L_0x0173:
            r11.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0185
            r0 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.toolbars.IconButton (DecorateToolbarButton.kt:347)"
            r4 = 27526431(0x1a4051f, float:6.0251434E-38)
            U0.C4895p.S(r4, r2, r0, r3)
        L_0x0185:
            r0 = -324412810(0xffffffffeca9da76, float:-1.642721E27)
            r11.W(r0)
            if (r17 != 0) goto L_0x018e
            goto L_0x0198
        L_0x018e:
            int r0 = r17.intValue()
            r1 = 0
            java.lang.String r0 = J1.j.b(r0, r11, r1)
            r1 = r0
        L_0x0198:
            r11.P()
            int r0 = r2 >> 3
            r3 = r0 & 14
            int r4 = r2 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            int r4 = wK.C18405m3.f151234a
            int r4 = r4 << 12
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r4
            r0 = r0 | r3
            int r3 = r2 << 3
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r16 = r0 | r2
            r21 = 128(0x80, float:1.794E-43)
            r7 = 0
            r0 = r23
            r2 = r22
            r3 = r25
            r4 = r19
            r5 = r18
            r6 = r20
            r8 = r29
            r9 = r11
            r10 = r16
            r16 = r11
            r11 = r21
            wK.C18357i3.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            r3 = r17
            r5 = r18
            r6 = r19
            r7 = r20
        L_0x01ec:
            U0.Y0 r11 = r16.n()
            if (r11 == 0) goto L_0x0208
            QG.i r10 = new QG.i
            r0 = r10
            r1 = r22
            r2 = r23
            r4 = r25
            r8 = r29
            r9 = r31
            r12 = r10
            r10 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.J(androidx.compose.ui.d, int, java.lang.Integer, boolean, wK.k3, wK.m3, r0.m, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17642l lVar, C16219E.b bVar) {
        lVar.invoke(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C16219E.b bVar, d dVar, m mVar, C17642l lVar, int i10, int i11, C4889m mVar2, int i12) {
        I(bVar, dVar, mVar, lVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(d dVar, int i10, Integer num, boolean z10, C18381k3 k3Var, C18405m3 m3Var, m mVar, C17631a aVar, int i11, int i12, C4889m mVar2, int i13) {
        J(dVar, i10, num, z10, k3Var, m3Var, mVar, aVar, mVar2, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(QG.C16219E.f r16, androidx.compose.ui.d r17, boolean r18, nI.C17642l<? super QG.C16219E, XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r1 = r16
            r11 = r17
            r12 = r19
            r13 = r21
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1337211344(0x4fb439d0, float:6.0473754E9)
            r2 = r20
            U0.m r14 = r2.k(r0)
            r2 = r22 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0028
            r2 = r13 | 6
            goto L_0x0038
        L_0x0028:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0037
            boolean r2 = r14.V(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = 2
        L_0x0035:
            r2 = r2 | r13
            goto L_0x0038
        L_0x0037:
            r2 = r13
        L_0x0038:
            r4 = r22 & 2
            if (r4 == 0) goto L_0x003f
            r2 = r2 | 48
            goto L_0x004f
        L_0x003f:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x004f
            boolean r4 = r14.V(r11)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004c:
            r4 = 16
        L_0x004e:
            r2 = r2 | r4
        L_0x004f:
            r4 = r22 & 4
            if (r4 == 0) goto L_0x0058
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r5 = r18
            goto L_0x006a
        L_0x0058:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0055
            r5 = r18
            boolean r6 = r14.b(r5)
            if (r6 == 0) goto L_0x0067
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r6
        L_0x006a:
            r6 = r22 & 8
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0073
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0073:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0082
            boolean r6 = r14.F(r12)
            if (r6 == 0) goto L_0x007f
            r6 = r7
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r6
        L_0x0082:
            r6 = r2 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L_0x0095
            boolean r6 = r14.l()
            if (r6 != 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r14.L()
            r3 = r5
            goto L_0x0103
        L_0x0095:
            r6 = 0
            if (r4 == 0) goto L_0x009a
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r5
        L_0x009b:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00a7
            r4 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.toolbars.ImageWithLabel (DecorateToolbarButton.kt:376)"
            U0.C4895p.S(r0, r2, r4, r5)
        L_0x00a7:
            int r0 = r16.g()
            android.net.Uri r4 = r16.f()
            int r5 = r16.e()
            r8 = -642859815(0xffffffffd9aebcd9, float:-6.1480358E15)
            r14.W(r8)
            r8 = r2 & 7168(0x1c00, float:1.0045E-41)
            r9 = 1
            if (r8 != r7) goto L_0x00c0
            r7 = r9
            goto L_0x00c1
        L_0x00c0:
            r7 = r6
        L_0x00c1:
            r8 = r2 & 14
            if (r8 != r3) goto L_0x00c6
            r6 = r9
        L_0x00c6:
            r3 = r7 | r6
            java.lang.Object r6 = r14.D()
            if (r3 != 0) goto L_0x00d6
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x00de
        L_0x00d6:
            QG.q r6 = new QG.q
            r6.<init>(r12, r1)
            r14.u(r6)
        L_0x00de:
            r7 = r6
            nI.a r7 = (nI.C17631a) r7
            r14.P()
            int r3 = r2 >> 3
            r3 = r3 & 14
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 6
            r2 = r2 & r6
            r9 = r3 | r2
            r10 = 0
            r2 = r17
            r3 = r0
            r6 = r15
            r8 = r14
            O(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0102
            U0.C4895p.R()
        L_0x0102:
            r3 = r15
        L_0x0103:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x011c
            QG.r r8 = new QG.r
            r0 = r8
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.N(QG.E$f, androidx.compose.ui.d, boolean, nI.l, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(androidx.compose.ui.d r25, int r26, android.net.Uri r27, int r28, boolean r29, nI.C17631a<XH.C16807N> r30, U0.C4889m r31, int r32, int r33) {
        /*
            r13 = r25
            r14 = r30
            r15 = r32
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -1697385366(0xffffffff9ad3f46a, float:-8.7662427E-23)
            r1 = r31
            U0.m r12 = r1.k(r0)
            r1 = r33 & 1
            r11 = 2
            if (r1 == 0) goto L_0x0021
            r1 = r15 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0030
            boolean r1 = r12.V(r13)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = r11
        L_0x002e:
            r1 = r1 | r15
            goto L_0x0031
        L_0x0030:
            r1 = r15
        L_0x0031:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x003a
            r1 = r1 | 48
            r10 = r26
            goto L_0x004c
        L_0x003a:
            r2 = r15 & 48
            r10 = r26
            if (r2 != 0) goto L_0x004c
            boolean r2 = r12.d(r10)
            if (r2 == 0) goto L_0x0049
            r2 = 32
            goto L_0x004b
        L_0x0049:
            r2 = 16
        L_0x004b:
            r1 = r1 | r2
        L_0x004c:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            r8 = r27
            goto L_0x0067
        L_0x0055:
            r2 = r15 & 384(0x180, float:5.38E-43)
            r8 = r27
            if (r2 != 0) goto L_0x0067
            boolean r2 = r12.F(r8)
            if (r2 == 0) goto L_0x0064
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r33 & 8
            if (r2 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r28
            goto L_0x0082
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            r9 = r28
            if (r2 != 0) goto L_0x0082
            boolean r2 = r12.d(r9)
            if (r2 == 0) goto L_0x007f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r3 = r29
            goto L_0x009d
        L_0x008b:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0088
            r3 = r29
            boolean r4 = r12.b(r3)
            if (r4 == 0) goto L_0x009a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r4
        L_0x009d:
            r4 = r33 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00a6
            r1 = r1 | r5
        L_0x00a4:
            r6 = r1
            goto L_0x00b7
        L_0x00a6:
            r4 = r15 & r5
            if (r4 != 0) goto L_0x00a4
            boolean r4 = r12.F(r14)
            if (r4 == 0) goto L_0x00b3
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r1 = r1 | r4
            goto L_0x00a4
        L_0x00b7:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r6
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r4) goto L_0x00ce
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            r12.L()
            r5 = r3
            r13 = r12
            goto L_0x01a9
        L_0x00ce:
            r1 = 0
            if (r2 == 0) goto L_0x00d4
            r16 = r1
            goto L_0x00d6
        L_0x00d4:
            r16 = r3
        L_0x00d6:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00e2
            r2 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.toolbars.ImageWithLabel (DecorateToolbarButton.kt:412)"
            U0.C4895p.S(r0, r6, r2, r3)
        L_0x00e2:
            boolean r0 = n0.C5607m.a(r12, r1)
            r7 = 3
            if (r0 == 0) goto L_0x010c
            r0 = 1547555517(0x5c3dd2bd, float:2.13721919E17)
            r12.W(r0)
            if (r16 == 0) goto L_0x00f7
            float r0 = (float) r7
            float r0 = c2.h.B(r0)
            goto L_0x00fc
        L_0x00f7:
            float r0 = (float) r11
            float r0 = c2.h.B(r0)
        L_0x00fc:
            rF.b r1 = rF.C15002a.a(r12, r1)
            long r1 = r1.p()
            n0.g r0 = n0.C5602h.a(r0, r1)
            r12.P()
            goto L_0x012a
        L_0x010c:
            r0 = 1547754165(0x5c40dab5, float:2.17134666E17)
            r12.W(r0)
            float r0 = (float) r11
            float r0 = c2.h.B(r0)
            tK.v r1 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r1 = r1.a(r12, r2)
            long r1 = r1.m0()
            n0.g r0 = n0.C5602h.a(r0, r1)
            r12.P()
        L_0x012a:
            O0.m r1 = O0.C4740m.f11185a
            p1.v0$a r2 = p1.C5747v0.f27350b
            long r3 = r2.h()
            long r17 = r2.h()
            int r2 = O0.C4740m.f11199o
            int r2 = r2 << 12
            r5 = r2 | 390(0x186, float:5.47E-43)
            r19 = 10
            r20 = 0
            r22 = 0
            r2 = r3
            r24 = r5
            r4 = r20
            r20 = r6
            r21 = r7
            r6 = r17
            r8 = r22
            r10 = r12
            r11 = r24
            r13 = r12
            r12 = r19
            O0.l r9 = r1.b(r2, r4, r6, r8, r10, r11, r12)
            r1 = 2
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            s0.E r10 = androidx.compose.foundation.layout.D.a(r1)
            QG.t$c r1 = new QG.t$c
            r3 = r1
            r4 = r16
            r5 = r27
            r6 = r28
            r7 = r0
            r8 = r26
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 54
            r2 = 1931815002(0x7325285a, float:1.3085135E31)
            r3 = 1
            c1.a r11 = c1.c.e(r2, r3, r1, r13, r0)
            int r0 = r20 >> 15
            r0 = r0 & 14
            r1 = 817889280(0x30c00000, float:1.3969839E-9)
            r0 = r0 | r1
            int r1 = r20 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r12 = r0 | r1
            r17 = 364(0x16c, float:5.1E-43)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r0 = r30
            r1 = r25
            r4 = r9
            r7 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r12 = r17
            O0.C4744o.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a7
            U0.C4895p.R()
        L_0x01a7:
            r5 = r16
        L_0x01a9:
            U0.Y0 r9 = r13.n()
            if (r9 == 0) goto L_0x01c6
            QG.h r10 = new QG.h
            r0 = r10
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.O(androidx.compose.ui.d, int, android.net.Uri, int, boolean, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C17642l lVar, C16219E.f fVar) {
        lVar.invoke(fVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C16219E.f fVar, d dVar, boolean z10, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        N(fVar, dVar, z10, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(d dVar, int i10, Uri uri, int i11, boolean z10, C17631a aVar, int i12, int i13, C4889m mVar, int i14) {
        O(dVar, i10, uri, i11, z10, aVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(androidx.compose.ui.d r22, QG.C16219E.c r23, boolean r24, boolean r25, nI.C17642l<? super QG.C16219E, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r2 = r23
            r5 = r26
            r6 = r28
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = 555447837(0x211b761d, float:5.2672364E-19)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r3 = r29 & 1
            if (r3 == 0) goto L_0x0023
            r4 = r6 | 6
            r7 = r4
            r4 = r22
            goto L_0x0037
        L_0x0023:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r22
            boolean r7 = r1.V(r4)
            if (r7 == 0) goto L_0x0031
            r7 = 4
            goto L_0x0032
        L_0x0031:
            r7 = 2
        L_0x0032:
            r7 = r7 | r6
            goto L_0x0037
        L_0x0034:
            r4 = r22
            r7 = r6
        L_0x0037:
            r8 = r29 & 2
            r9 = 32
            if (r8 == 0) goto L_0x0040
            r7 = r7 | 48
            goto L_0x004f
        L_0x0040:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004f
            boolean r8 = r1.V(r2)
            if (r8 == 0) goto L_0x004c
            r8 = r9
            goto L_0x004e
        L_0x004c:
            r8 = 16
        L_0x004e:
            r7 = r7 | r8
        L_0x004f:
            r8 = r29 & 4
            if (r8 == 0) goto L_0x0058
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r10 = r24
            goto L_0x006a
        L_0x0058:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0055
            r10 = r24
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x0067
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r7 = r7 | r11
        L_0x006a:
            r11 = r29 & 8
            if (r11 == 0) goto L_0x0073
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r12 = r25
            goto L_0x0085
        L_0x0073:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0070
            r12 = r25
            boolean r13 = r1.b(r12)
            if (r13 == 0) goto L_0x0082
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r7 = r7 | r13
        L_0x0085:
            r13 = r29 & 16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x008e
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008e:
            r13 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.F(r5)
            if (r13 == 0) goto L_0x009a
            r13 = r14
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r7 = r7 | r13
        L_0x009d:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r15) goto L_0x00b1
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b1
        L_0x00aa:
            r1.L()
            r3 = r4
            r4 = r12
            goto L_0x014b
        L_0x00b1:
            if (r3 == 0) goto L_0x00b6
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00b7
        L_0x00b6:
            r3 = r4
        L_0x00b7:
            r4 = 0
            if (r8 == 0) goto L_0x00bd
            r20 = r4
            goto L_0x00bf
        L_0x00bd:
            r20 = r10
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            r21 = r4
            goto L_0x00c6
        L_0x00c4:
            r21 = r12
        L_0x00c6:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d2
            r8 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.toolbars.ButtonWithLabel (DecorateToolbarButton.kt:140)"
            U0.C4895p.S(r0, r7, r8, r10)
        L_0x00d2:
            int r12 = r23.g()
            boolean r0 = r23.e()
            QG.E$e r8 = r23.c()
            java.lang.String r8 = r8.toString()
            oF.h r15 = r23.h()
            int r13 = r23.f()
            r10 = 1487801623(0x58ae0d17, float:1.53096995E15)
            r1.W(r10)
            r10 = 57344(0xe000, float:8.0356E-41)
            r11 = r7 & r10
            r16 = 1
            if (r11 != r14) goto L_0x00fc
            r11 = r16
            goto L_0x00fd
        L_0x00fc:
            r11 = r4
        L_0x00fd:
            r14 = r7 & 112(0x70, float:1.57E-43)
            if (r14 != r9) goto L_0x0103
            r4 = r16
        L_0x0103:
            r4 = r4 | r11
            java.lang.Object r9 = r1.D()
            if (r4 != 0) goto L_0x0112
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r9 != r4) goto L_0x011a
        L_0x0112:
            QG.o r9 = new QG.o
            r9.<init>(r5, r2)
            r1.u(r9)
        L_0x011a:
            r16 = r9
            nI.a r16 = (nI.C17631a) r16
            r1.P()
            r4 = r7 & 14
            int r7 = r7 << 3
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r9
            r7 = r7 & r10
            r4 = r4 | r7
            int r7 = oF.C14899h.f130160a
            int r7 = r7 << 24
            r18 = r4 | r7
            r19 = 128(0x80, float:1.794E-43)
            r14 = 0
            r7 = r3
            r9 = r0
            r10 = r20
            r11 = r21
            r17 = r1
            s(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0147
            U0.C4895p.R()
        L_0x0147:
            r10 = r20
            r4 = r21
        L_0x014b:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0164
            QG.p r9 = new QG.p
            r0 = r9
            r1 = r3
            r2 = r23
            r3 = r10
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.q(androidx.compose.ui.d, QG.E$c, boolean, boolean, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(androidx.compose.ui.d r22, QG.C16219E.d r23, boolean r24, boolean r25, nI.C17642l<? super QG.C16219E, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r2 = r23
            r5 = r26
            r6 = r28
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = -285695469(0xffffffffeef8a213, float:-3.847411E28)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r3 = r29 & 1
            if (r3 == 0) goto L_0x0023
            r4 = r6 | 6
            r7 = r4
            r4 = r22
            goto L_0x0037
        L_0x0023:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r22
            boolean r7 = r1.V(r4)
            if (r7 == 0) goto L_0x0031
            r7 = 4
            goto L_0x0032
        L_0x0031:
            r7 = 2
        L_0x0032:
            r7 = r7 | r6
            goto L_0x0037
        L_0x0034:
            r4 = r22
            r7 = r6
        L_0x0037:
            r8 = r29 & 2
            r9 = 32
            if (r8 == 0) goto L_0x0040
            r7 = r7 | 48
            goto L_0x004f
        L_0x0040:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004f
            boolean r8 = r1.V(r2)
            if (r8 == 0) goto L_0x004c
            r8 = r9
            goto L_0x004e
        L_0x004c:
            r8 = 16
        L_0x004e:
            r7 = r7 | r8
        L_0x004f:
            r8 = r29 & 4
            if (r8 == 0) goto L_0x0058
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r10 = r24
            goto L_0x006a
        L_0x0058:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0055
            r10 = r24
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x0067
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r7 = r7 | r11
        L_0x006a:
            r11 = r29 & 8
            if (r11 == 0) goto L_0x0073
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r12 = r25
            goto L_0x0085
        L_0x0073:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0070
            r12 = r25
            boolean r13 = r1.b(r12)
            if (r13 == 0) goto L_0x0082
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r7 = r7 | r13
        L_0x0085:
            r13 = r29 & 16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x008e
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008e:
            r13 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x009d
            boolean r13 = r1.F(r5)
            if (r13 == 0) goto L_0x009a
            r13 = r14
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r7 = r7 | r13
        L_0x009d:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r15) goto L_0x00b1
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b1
        L_0x00aa:
            r1.L()
            r3 = r4
            r4 = r12
            goto L_0x014b
        L_0x00b1:
            if (r3 == 0) goto L_0x00b6
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00b7
        L_0x00b6:
            r3 = r4
        L_0x00b7:
            r4 = 0
            if (r8 == 0) goto L_0x00bd
            r20 = r4
            goto L_0x00bf
        L_0x00bd:
            r20 = r10
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            r21 = r4
            goto L_0x00c6
        L_0x00c4:
            r21 = r12
        L_0x00c6:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d2
            r8 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.toolbars.ButtonWithLabel (DecorateToolbarButton.kt:174)"
            U0.C4895p.S(r0, r7, r8, r10)
        L_0x00d2:
            int r12 = r23.g()
            boolean r0 = r23.e()
            QG.E$e r8 = r23.c()
            java.lang.String r8 = r8.toString()
            oF.h r15 = r23.i()
            int r13 = r23.f()
            r10 = 1487839543(0x58aea137, float:1.53605949E15)
            r1.W(r10)
            r10 = 57344(0xe000, float:8.0356E-41)
            r11 = r7 & r10
            r16 = 1
            if (r11 != r14) goto L_0x00fc
            r11 = r16
            goto L_0x00fd
        L_0x00fc:
            r11 = r4
        L_0x00fd:
            r14 = r7 & 112(0x70, float:1.57E-43)
            if (r14 != r9) goto L_0x0103
            r4 = r16
        L_0x0103:
            r4 = r4 | r11
            java.lang.Object r9 = r1.D()
            if (r4 != 0) goto L_0x0112
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r9 != r4) goto L_0x011a
        L_0x0112:
            QG.s r9 = new QG.s
            r9.<init>(r5, r2)
            r1.u(r9)
        L_0x011a:
            r16 = r9
            nI.a r16 = (nI.C17631a) r16
            r1.P()
            r4 = r7 & 14
            int r7 = r7 << 3
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r9
            r7 = r7 & r10
            r4 = r4 | r7
            int r7 = oF.C14899h.f130160a
            int r7 = r7 << 24
            r18 = r4 | r7
            r19 = 128(0x80, float:1.794E-43)
            r14 = 0
            r7 = r3
            r9 = r0
            r10 = r20
            r11 = r21
            r17 = r1
            s(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0147
            U0.C4895p.R()
        L_0x0147:
            r10 = r20
            r4 = r21
        L_0x014b:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0164
            QG.e r9 = new QG.e
            r0 = r9
            r1 = r3
            r2 = r23
            r3 = r10
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.r(androidx.compose.ui.d, QG.E$d, boolean, boolean, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(androidx.compose.ui.d r33, java.lang.String r34, boolean r35, boolean r36, boolean r37, int r38, int r39, java.lang.Integer r40, oF.C14899h r41, nI.C17631a<XH.C16807N> r42, U0.C4889m r43, int r44, int r45) {
        /*
            r2 = r34
            r0 = r41
            r10 = r42
            r11 = r44
            r12 = r45
            java.lang.String r1 = "testTag"
            kotlin.jvm.internal.C17542s.j(r2, r1)
            java.lang.String r1 = "onClick"
            kotlin.jvm.internal.C17542s.j(r10, r1)
            r1 = -1355250172(0xffffffffaf388604, float:-1.6782314E-10)
            r3 = r43
            U0.m r3 = r3.k(r1)
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0027
            r6 = r11 | 6
            r7 = r6
            r6 = r33
            goto L_0x003b
        L_0x0027:
            r6 = r11 & 6
            if (r6 != 0) goto L_0x0038
            r6 = r33
            boolean r7 = r3.V(r6)
            if (r7 == 0) goto L_0x0035
            r7 = 4
            goto L_0x0036
        L_0x0035:
            r7 = 2
        L_0x0036:
            r7 = r7 | r11
            goto L_0x003b
        L_0x0038:
            r6 = r33
            r7 = r11
        L_0x003b:
            r8 = r12 & 2
            if (r8 == 0) goto L_0x0042
            r7 = r7 | 48
            goto L_0x0052
        L_0x0042:
            r8 = r11 & 48
            if (r8 != 0) goto L_0x0052
            boolean r8 = r3.V(r2)
            if (r8 == 0) goto L_0x004f
            r8 = 32
            goto L_0x0051
        L_0x004f:
            r8 = 16
        L_0x0051:
            r7 = r7 | r8
        L_0x0052:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x005b
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r9 = r35
            goto L_0x006d
        L_0x005b:
            r9 = r11 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0058
            r9 = r35
            boolean r13 = r3.b(r9)
            if (r13 == 0) goto L_0x006a
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r13 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r7 = r7 | r13
        L_0x006d:
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0076
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r14 = r36
            goto L_0x0088
        L_0x0076:
            r14 = r11 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0073
            r14 = r36
            boolean r15 = r3.b(r14)
            if (r15 == 0) goto L_0x0085
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r7 = r7 | r15
        L_0x0088:
            r15 = r12 & 16
            if (r15 == 0) goto L_0x0091
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r5 = r37
            goto L_0x00a4
        L_0x0091:
            r5 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x008e
            r5 = r37
            boolean r16 = r3.b(r5)
            if (r16 == 0) goto L_0x00a0
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r7 = r7 | r16
        L_0x00a4:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00af
            r7 = r7 | r17
            r1 = r38
            goto L_0x00c2
        L_0x00af:
            r16 = r11 & r17
            r1 = r38
            if (r16 != 0) goto L_0x00c2
            boolean r17 = r3.d(r1)
            if (r17 == 0) goto L_0x00be
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r7 = r7 | r17
        L_0x00c2:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00cd
            r7 = r7 | r18
            r9 = r39
            goto L_0x00e0
        L_0x00cd:
            r17 = r11 & r18
            r9 = r39
            if (r17 != 0) goto L_0x00e0
            boolean r17 = r3.d(r9)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r7 = r7 | r17
        L_0x00e0:
            r1 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00eb
            r7 = r7 | r17
            r5 = r40
            goto L_0x00fe
        L_0x00eb:
            r17 = r11 & r17
            r5 = r40
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r3.V(r5)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r7 = r7 | r17
        L_0x00fe:
            r5 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 == 0) goto L_0x0107
        L_0x0104:
            r7 = r7 | r17
            goto L_0x0122
        L_0x0107:
            r17 = r11 & r17
            if (r17 != 0) goto L_0x0122
            r17 = 134217728(0x8000000, float:3.85186E-34)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x0116
            boolean r17 = r3.V(r0)
            goto L_0x011a
        L_0x0116:
            boolean r17 = r3.F(r0)
        L_0x011a:
            if (r17 == 0) goto L_0x011f
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x011f:
            r17 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0104
        L_0x0122:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x012b
            r7 = r7 | r17
            goto L_0x013b
        L_0x012b:
            r0 = r11 & r17
            if (r0 != 0) goto L_0x013b
            boolean r0 = r3.F(r10)
            if (r0 == 0) goto L_0x0138
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r7 = r7 | r0
        L_0x013b:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r7
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r6) goto L_0x015b
            boolean r0 = r3.l()
            if (r0 != 0) goto L_0x014b
            goto L_0x015b
        L_0x014b:
            r3.L()
            r1 = r33
            r6 = r35
            r5 = r37
            r8 = r40
            r13 = r41
            r4 = r14
            goto L_0x028f
        L_0x015b:
            if (r4 == 0) goto L_0x0160
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0162
        L_0x0160:
            r0 = r33
        L_0x0162:
            if (r8 == 0) goto L_0x0166
            r6 = 1
            goto L_0x0168
        L_0x0166:
            r6 = r35
        L_0x0168:
            r8 = 0
            if (r13 == 0) goto L_0x016e
            r26 = r8
            goto L_0x0170
        L_0x016e:
            r26 = r14
        L_0x0170:
            if (r15 == 0) goto L_0x0175
            r27 = r8
            goto L_0x0177
        L_0x0175:
            r27 = r37
        L_0x0177:
            r13 = 0
            if (r1 == 0) goto L_0x017c
            r1 = r13
            goto L_0x017e
        L_0x017c:
            r1 = r40
        L_0x017e:
            if (r5 == 0) goto L_0x0182
            r5 = r13
            goto L_0x0184
        L_0x0182:
            r5 = r41
        L_0x0184:
            boolean r14 = U0.C4895p.J()
            if (r14 == 0) goto L_0x0193
            r14 = -1
            java.lang.String r15 = "com.sugarcube.decorate.v2.internal.ui.toolbars.ButtonWithLabel (DecorateToolbarButton.kt:217)"
            r4 = -1355250172(0xffffffffaf388604, float:-1.6782314E-10)
            U0.C4895p.S(r4, r7, r14, r15)
        L_0x0193:
            r4 = 1487879493(0x58af3d45, float:1.54142148E15)
            r3.W(r4)
            java.lang.Object r4 = r3.D()
            U0.m$a r28 = U0.C4889m.f14007a
            java.lang.Object r14 = r28.a()
            if (r4 != r14) goto L_0x01ad
            r14 = 2
            U0.r0 r4 = U0.u1.e(r13, r13, r14, r13)
            r3.u(r4)
        L_0x01ad:
            U0.r0 r4 = (U0.C4899r0) r4
            r3.P()
            if (r6 == 0) goto L_0x01b9
            if (r27 != 0) goto L_0x01b9
            r29 = 1
            goto L_0x01bb
        L_0x01b9:
            r29 = r8
        L_0x01bb:
            androidx.compose.ui.d r14 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            r15 = 3
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.G(r14, r13, r8, r15, r13)
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.C(r14, r13, r8, r15, r13)
            r14 = 1487888094(0x58af5ede, float:1.54257589E15)
            r3.W(r14)
            java.lang.Object r14 = r3.D()
            java.lang.Object r15 = r28.a()
            if (r14 != r15) goto L_0x01e0
            QG.k r14 = new QG.k
            r14.<init>(r4)
            r3.u(r14)
        L_0x01e0:
            nI.l r14 = (nI.C17642l) r14
            r3.P()
            androidx.compose.ui.d r30 = androidx.compose.ui.layout.c.a(r13, r14)
            O0.m r13 = O0.C4740m.f11185a
            p1.v0$a r14 = p1.C5747v0.f27350b
            long r15 = r14.h()
            long r18 = r14.h()
            int r14 = O0.C4740m.f11199o
            int r14 = r14 << 12
            r14 = r14 | 390(0x186, float:5.47E-43)
            r24 = 10
            r20 = 0
            r22 = 0
            r31 = r14
            r14 = r15
            r16 = r20
            r20 = r22
            r22 = r3
            r23 = r31
            O0.l r31 = r13.b(r14, r16, r18, r20, r22, r23, r24)
            r13 = 50
            A0.f r16 = A0.g.a(r13)
            float r13 = (float) r8
            float r13 = c2.h.B(r13)
            s0.E r32 = androidx.compose.foundation.layout.D.a(r13)
            r13 = 1487891172(0x58af6ae4, float:1.54298901E15)
            r3.W(r13)
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r13
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            if (r7 != r13) goto L_0x022d
            r8 = 1
        L_0x022d:
            java.lang.Object r7 = r3.D()
            if (r8 != 0) goto L_0x0239
            java.lang.Object r8 = r28.a()
            if (r7 != r8) goto L_0x0241
        L_0x0239:
            QG.l r7 = new QG.l
            r7.<init>(r10)
            r3.u(r7)
        L_0x0241:
            r13 = r7
            nI.a r13 = (nI.C17631a) r13
            r3.P()
            QG.t$a r7 = new QG.t$a
            r17 = r7
            r18 = r6
            r19 = r4
            r20 = r5
            r21 = r26
            r22 = r27
            r23 = r39
            r24 = r1
            r25 = r38
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 54
            r8 = 1333953012(0x4f8281f4, float:4.3791094E9)
            r14 = 1
            c1.a r22 = c1.c.e(r8, r14, r7, r3, r4)
            r24 = 817889280(0x30c00000, float:1.3969839E-9)
            r25 = 352(0x160, float:4.93E-43)
            r18 = 0
            r19 = 0
            r21 = 0
            r14 = r30
            r15 = r29
            r17 = r31
            r20 = r32
            r23 = r3
            O0.C4744o.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0288
            U0.C4895p.R()
        L_0x0288:
            r8 = r1
            r13 = r5
            r4 = r26
            r5 = r27
            r1 = r0
        L_0x028f:
            U0.Y0 r14 = r3.n()
            if (r14 == 0) goto L_0x02ac
            QG.m r15 = new QG.m
            r0 = r15
            r2 = r34
            r3 = r6
            r6 = r38
            r7 = r39
            r9 = r13
            r10 = r42
            r11 = r44
            r12 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.a(r15)
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QG.C16239t.s(androidx.compose.ui.d, java.lang.String, boolean, boolean, boolean, int, int, java.lang.Integer, oF.h, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C4899r0 r0Var, C4488v vVar) {
        C17542s.j(vVar, "coordinates");
        B(r0Var, vVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(d dVar, String str, boolean z10, boolean z11, boolean z12, int i10, int i11, Integer num, C14899h hVar, C17631a aVar, int i12, int i13, C4889m mVar, int i14) {
        s(dVar, str, z10, z11, z12, i10, i11, num, hVar, aVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C17642l lVar, C16219E.c cVar) {
        lVar.invoke(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(d dVar, C16219E.c cVar, boolean z10, boolean z11, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        q(dVar, cVar, z10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, C16219E.d dVar) {
        lVar.invoke(dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(d dVar, C16219E.d dVar2, boolean z10, boolean z11, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        r(dVar, dVar2, z10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
