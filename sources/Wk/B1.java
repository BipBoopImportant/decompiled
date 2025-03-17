package wK;

import E1.C4478k;
import E1.C4488v;
import E1.I;
import G1.C4504g;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import androidx.compose.animation.f;
import androidx.compose.animation.g;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import c2.r;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.e;
import m0.C5548j;
import m0.N;
import m0.y0;
import m1.C5571a;
import n0.C5583F;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.C5749w0;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import s0.C5880z;
import t1.C5942c;
import tK.C18028t;
import tK.C18029u;
import tK.C18030v;
import wK.C1;
import wK.G1;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001au\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010 \u001a\u00020\u0012*\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00172\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001dH\u0003¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\bH\u0003¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b$\u0010%\u001a/\u0010&\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020(*\u00020\u001eH\u0003¢\u0006\u0004\b)\u0010*¨\u00061²\u0006\f\u0010+\u001a\u00020\b8\nX\u0002²\u0006\f\u0010,\u001a\u00020\b8\nX\u0002²\u0006\f\u0010.\u001a\u00020-8\nX\u0002²\u0006\u000e\u0010/\u001a\u00020\u001e8\n@\nX\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u0001008\n@\nX\u0002"}, d2 = {"LwK/r1;", "content", "Landroidx/compose/ui/d;", "modifier", "LwK/C1;", "leadingContent", "LwK/G1;", "trailingContent", "", "selected", "LwK/Y8;", "style", "LwK/E1;", "size", "enabled", "Lr0/m;", "interactionSource", "Lkotlin/Function0;", "LXH/N;", "onClick", "l", "(LwK/r1;Landroidx/compose/ui/d;LwK/C1;LwK/G1;ZLwK/Y8;LwK/E1;ZLr0/m;LnI/a;LU0/m;II)V", "showExpandingText", "LwK/F1;", "", "alpha", "s", "(LwK/r1;LwK/C1;LwK/G1;ZLwK/F1;FLU0/m;I)V", "Ls0/M;", "Lkotlin/Function1;", "", "measuredHeight", "i", "(Ls0/M;LwK/r1;LwK/F1;LnI/l;LU0/m;I)V", "q", "(LwK/r1;LwK/F1;ZLU0/m;I)V", "x", "(LwK/C1;LwK/F1;ILU0/m;I)V", "z", "(LwK/G1;LwK/F1;FILU0/m;I)V", "Lc2/h;", "B", "(ILU0/m;I)F", "pressed", "hover", "Ln0/g;", "borderStyle", "measuredCenterHeight", "", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F1 f149262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149263b;

        a(F1 f12, String str) {
            this.f149262a = f12;
            this.f149263b = str;
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(213425043, i10, -1, "net.ikea.skapa.ui.components.ExpandingText.<anonymous>.<anonymous> (Choice.kt:493)");
            }
            d h10 = D.h(d.f18749a, this.f149262a.f());
            Y b10 = C18030v.f147664a.b(mVar2, C18030v.f147665b).a().b();
            d1.b(this.f149263b, h10, this.f149262a.e(mVar2, 0), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, b10, mVar, 0, 0, 65528);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(G1 g12, F1 f12, float f10, int i10, int i11, C4889m mVar, int i12) {
        z(g12, f12, f10, i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final float B(int i10, C4889m mVar, int i11) {
        mVar.W(-1604879992);
        if (C4895p.J()) {
            C4895p.S(-1604879992, i11, -1, "net.ikea.skapa.ui.components.toDp (Choice.kt:599)");
        }
        float H10 = ((c2.d) mVar.Q(C5100f0.e())).H(i10);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return H10;
    }

    private static final void i(C5842M m10, C18463r1 r1Var, F1 f12, C17642l<? super Integer, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        d.a aVar;
        F1 f13 = f12;
        C17642l<? super Integer, C16807N> lVar2 = lVar;
        int i13 = i10;
        C4889m k10 = mVar.k(194950997);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(m10) ? 4 : 2) | i13;
        } else {
            C5842M m11 = m10;
            i11 = i13;
        }
        C18463r1 r1Var2 = r1Var;
        if ((i13 & 48) == 0) {
            i11 |= k10.V(r1Var2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.V(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? 2048 : 1024;
        }
        int i14 = i11;
        if ((i14 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(194950997, i14, -1, "net.ikea.skapa.ui.components.CenterContent (Choice.kt:437)");
            }
            float B10 = (r1Var.d() == null && r1Var.b() == null) ? h.B((float) 0) : C18029u.f147649a.j();
            d.a aVar2 = d.f18749a;
            k10.W(-261389255);
            boolean z10 = (i14 & 7168) == 2048;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18523w1(lVar2);
                k10.u(D10);
            }
            k10.P();
            d e10 = C5842M.e(m10, c.a(aVar2, (C17642l) D10), 1.0f, false, 2, (Object) null);
            C5073d.m g10 = C5073d.f18068a.g();
            C5437c.a aVar3 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar3.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e11 = androidx.compose.ui.c.e(k10, e10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            String d10 = r1Var.d();
            k10.W(464911508);
            if (d10 == null) {
                aVar = aVar2;
                i12 = i14;
            } else {
                aVar = aVar2;
                i12 = i14;
                d1.b(d10, (d) null, f13.d(k10, (i14 >> 6) & 14), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).c().e(), k10, 0, 0, 65530);
            }
            k10.P();
            String b11 = r1Var.b();
            k10.W(464918545);
            if (b11 != null) {
                d1.b(b11, (d) null, f13.a(k10, (i12 >> 6) & 14), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).a().b(), k10, 0, 0, 65530);
            }
            k10.P();
            p<C4889m, Integer, C16807N> a14 = r1Var.a();
            k10.W(464925529);
            if (a14 != null) {
                d a15 = x.a(D.m(aVar, 0.0f, B10, 0.0f, 0.0f, 13, (Object) null), C5880z.Min);
                I h10 = C5077h.h(aVar3.e(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e12 = androidx.compose.ui.c.e(k10, a15);
                C17631a<C4504g> a17 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a17);
                } else {
                    k10.t();
                }
                C4889m a18 = F1.a(k10);
                F1.c(a18, h10, aVar4.c());
                F1.c(a18, s11, aVar4.e());
                p<C4504g, Integer, C16807N> b12 = aVar4.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b12);
                }
                F1.c(a18, e12, aVar4.d());
                C5079j jVar = C5079j.f18125a;
                a14.invoke(k10, 0);
                k10.x();
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
            n10.a(new C18535x1(m10, r1Var, f12, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, C4488v vVar) {
        C17542s.j(vVar, "layoutCoordinates");
        lVar.invoke(Integer.valueOf(r.g(vVar.a())));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C5842M m10, C18463r1 r1Var, F1 f12, C17642l lVar, int i10, C4889m mVar, int i11) {
        i(m10, r1Var, f12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(wK.C18463r1 r29, androidx.compose.ui.d r30, wK.C1 r31, wK.G1 r32, boolean r33, wK.Y8 r34, wK.E1 r35, boolean r36, r0.m r37, nI.C17631a<XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r4 = 16
            r5 = 32
            r6 = 2
            r7 = 4
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C17542s.j(r1, r8)
            java.lang.String r8 = "onClick"
            kotlin.jvm.internal.C17542s.j(r10, r8)
            r8 = -762065125(0xffffffffd293cf1b, float:-3.17417423E11)
            r9 = r39
            U0.m r9 = r9.k(r8)
            r13 = 1
            r14 = r12 & 1
            if (r14 == 0) goto L_0x0029
            r14 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r14 = r11 & 6
            if (r14 != 0) goto L_0x0038
            boolean r14 = r9.V(r1)
            if (r14 == 0) goto L_0x0035
            r14 = r7
            goto L_0x0036
        L_0x0035:
            r14 = r6
        L_0x0036:
            r14 = r14 | r11
            goto L_0x0039
        L_0x0038:
            r14 = r11
        L_0x0039:
            r6 = r6 & r12
            if (r6 == 0) goto L_0x0041
            r14 = r14 | 48
        L_0x003e:
            r15 = r30
            goto L_0x0054
        L_0x0041:
            r15 = r11 & 48
            if (r15 != 0) goto L_0x003e
            r15 = r30
            boolean r16 = r9.V(r15)
            if (r16 == 0) goto L_0x0050
            r16 = r5
            goto L_0x0052
        L_0x0050:
            r16 = r4
        L_0x0052:
            r14 = r14 | r16
        L_0x0054:
            r7 = r7 & r12
            if (r7 == 0) goto L_0x005c
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x0059:
            r13 = r31
            goto L_0x006f
        L_0x005c:
            r13 = r11 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0059
            r13 = r31
            boolean r16 = r9.V(r13)
            if (r16 == 0) goto L_0x006b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r14 = r14 | r16
        L_0x006f:
            r16 = r12 & 8
            if (r16 == 0) goto L_0x0078
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x0075:
            r0 = r32
            goto L_0x008b
        L_0x0078:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0075
            r0 = r32
            boolean r17 = r9.V(r0)
            if (r17 == 0) goto L_0x0087
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r14 = r14 | r17
        L_0x008b:
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0093
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r8 = r33
            goto L_0x00a6
        L_0x0093:
            r8 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0090
            r8 = r33
            boolean r18 = r9.b(r8)
            if (r18 == 0) goto L_0x00a2
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r14 = r14 | r18
        L_0x00a6:
            r5 = r5 & r12
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00b0
            r14 = r14 | r18
            r3 = r34
            goto L_0x00c3
        L_0x00b0:
            r19 = r11 & r18
            r3 = r34
            if (r19 != 0) goto L_0x00c3
            boolean r20 = r9.V(r3)
            if (r20 == 0) goto L_0x00bf
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r14 = r14 | r20
        L_0x00c3:
            r20 = r12 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00d0
            r14 = r14 | r21
            r2 = r35
        L_0x00cd:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00e4
        L_0x00d0:
            r21 = r11 & r21
            r2 = r35
            if (r21 != 0) goto L_0x00cd
            boolean r22 = r9.V(r2)
            if (r22 == 0) goto L_0x00df
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r14 = r14 | r22
            goto L_0x00cd
        L_0x00e4:
            r0 = r0 & r12
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ee
        L_0x00e9:
            r14 = r14 | r21
        L_0x00eb:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0100
        L_0x00ee:
            r21 = r11 & r21
            r1 = r36
            if (r21 != 0) goto L_0x00eb
            boolean r21 = r9.b(r1)
            if (r21 == 0) goto L_0x00fd
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00fd:
            r21 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x0100:
            r1 = r1 & r12
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010a
            r14 = r14 | r19
            r2 = r37
            goto L_0x011d
        L_0x010a:
            r19 = r11 & r19
            r2 = r37
            if (r19 != 0) goto L_0x011d
            boolean r19 = r9.V(r2)
            if (r19 == 0) goto L_0x0119
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r14 = r14 | r19
        L_0x011d:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r14 = r14 | r19
            goto L_0x0136
        L_0x0126:
            r2 = r11 & r19
            if (r2 != 0) goto L_0x0136
            boolean r2 = r9.F(r10)
            if (r2 == 0) goto L_0x0133
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r14 = r14 | r2
        L_0x0136:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r14
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0158
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x0146
            goto L_0x0158
        L_0x0146:
            r9.L()
            r4 = r32
            r6 = r34
            r7 = r35
            r10 = r37
            r5 = r8
            r3 = r13
            r2 = r15
            r8 = r36
            goto L_0x032e
        L_0x0158:
            if (r6 == 0) goto L_0x015d
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r15 = r2
        L_0x015d:
            if (r7 == 0) goto L_0x0162
            wK.C1$c r2 = wK.C1.c.f149300c
            r13 = r2
        L_0x0162:
            if (r16 == 0) goto L_0x0167
            wK.G1$c r2 = wK.G1.c.f149514c
            goto L_0x0169
        L_0x0167:
            r2 = r32
        L_0x0169:
            if (r4 == 0) goto L_0x016c
            r8 = 0
        L_0x016c:
            if (r5 == 0) goto L_0x0171
            wK.Y8 r4 = wK.Y8.Emphasised
            goto L_0x0173
        L_0x0171:
            r4 = r34
        L_0x0173:
            if (r20 == 0) goto L_0x0178
            wK.E1 r5 = wK.E1.Large
            goto L_0x017a
        L_0x0178:
            r5 = r35
        L_0x017a:
            if (r0 == 0) goto L_0x017e
            r0 = 1
            goto L_0x0180
        L_0x017e:
            r0 = r36
        L_0x0180:
            if (r1 == 0) goto L_0x01a1
            r1 = -1619486471(0xffffffff9f7898f9, float:-5.264258E-20)
            r9.W(r1)
            java.lang.Object r1 = r9.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r1 != r6) goto L_0x019b
            r0.m r1 = r0.l.a()
            r9.u(r1)
        L_0x019b:
            r0.m r1 = (r0.m) r1
            r9.P()
            goto L_0x01a3
        L_0x01a1:
            r1 = r37
        L_0x01a3:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x01b2
            r6 = -1
            java.lang.String r7 = "net.ikea.skapa.ui.components.Choice (Choice.kt:170)"
            r3 = -762065125(0xffffffffd293cf1b, float:-3.17417423E11)
            U0.C4895p.S(r3, r14, r6, r7)
        L_0x01b2:
            int r3 = r14 >> 24
            r3 = r3 & 14
            U0.A1 r20 = r0.C5814f.a(r1, r9, r3)
            U0.A1 r6 = r0.p.a(r1, r9, r3)
            U0.A1 r3 = r0.i.a(r1, r9, r3)
            tK.v r7 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r16 = r7.a(r9, r10)
            boolean r11 = r16.M0()
            wK.D1 r12 = wK.D1.f149363a
            float r11 = r12.b(r11)
            wK.F1 r16 = new wK.F1
            r30 = r16
            r31 = r5
            r32 = r0
            r33 = r29
            r34 = r13
            r35 = r2
            r30.<init>(r31, r32, r33, r34, r35)
            boolean r6 = n(r6)
            boolean r17 = o(r3)
            int r19 = r14 >> 15
            r19 = r19 & 14
            r18 = r19 | r18
            int r19 = r14 >> 18
            r19 = r19 & 112(0x70, float:1.57E-43)
            r18 = r18 | r19
            r28 = r5
            int r5 = r14 >> 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r5 = r18 | r5
            r30 = r12
            r31 = r4
            r33 = r8
            r34 = r6
            r35 = r17
            r36 = r9
            r37 = r5
            U0.A1 r5 = r30.a(r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            L1.i$a r17 = L1.i.f8936b
            int r17 = r17.e()
            r18 = 0
            L1.i r17 = L1.i.h(r17)
            r30 = r6
            r31 = r8
            r32 = r1
            r33 = r18
            r34 = r0
            r35 = r17
            r36 = r38
            androidx.compose.ui.d r6 = androidx.compose.foundation.selection.a.a(r30, r31, r32, r33, r34, r35, r36)
            androidx.compose.ui.d r6 = r6.s(r15)
            tK.h r7 = r7.a(r9, r10)
            r35 = r11
            long r10 = r7.k0()
            A0.f r7 = r12.k()
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.c(r6, r10, r7)
            boolean r3 = o(r3)
            androidx.compose.ui.d r3 = zK.C18756a.i(r6, r3, r0)
            n0.g r6 = p(r5)
            float r6 = r6.b()
            n0.g r5 = p(r5)
            p1.l0 r5 = r5.a()
            A0.f r7 = r12.k()
            androidx.compose.ui.d r19 = n0.C5599e.i(r3, r6, r5, r7)
            float r22 = r12.f()
            zK.g r23 = zK.C18762g.Default
            r26 = 48
            r27 = 0
            r24 = 0
            r25 = 0
            r21 = r0
            androidx.compose.ui.d r3 = zK.C18756a.d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = 0
            r6 = 3
            androidx.compose.ui.d r3 = androidx.compose.animation.f.b(r3, r5, r5, r6, r5)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r5 = r5.h()
            r6 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r6)
            int r6 = U0.C4883j.a(r9, r6)
            U0.y r7 = r9.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r9, r3)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r9.m()
            if (r12 != 0) goto L_0x02a9
            U0.C4883j.c()
        L_0x02a9:
            r9.I()
            boolean r12 = r9.i()
            if (r12 == 0) goto L_0x02b6
            r9.p(r11)
            goto L_0x02b9
        L_0x02b6:
            r9.t()
        L_0x02b9:
            U0.m r11 = U0.F1.a(r9)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r5, r12)
            nI.p r5 = r10.e()
            U0.F1.c(r11, r7, r5)
            nI.p r5 = r10.b()
            boolean r7 = r11.i()
            if (r7 != 0) goto L_0x02e3
            java.lang.Object r7 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r12)
            if (r7 != 0) goto L_0x02f1
        L_0x02e3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r11.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.w(r6, r5)
        L_0x02f1:
            nI.p r5 = r10.d()
            U0.F1.c(r11, r3, r5)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            r3 = r14 & 14
            r5 = 3
            int r5 = r14 >> 3
            r6 = r5 & 112(0x70, float:1.57E-43)
            r3 = r3 | r6
            r6 = r5 & 896(0x380, float:1.256E-42)
            r3 = r3 | r6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r30 = r29
            r31 = r13
            r32 = r2
            r33 = r8
            r34 = r16
            r36 = r9
            r37 = r3
            s(r30, r31, r32, r33, r34, r35, r36, r37)
            r9.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0325
            U0.C4895p.R()
        L_0x0325:
            r10 = r1
            r6 = r4
            r5 = r8
            r3 = r13
            r7 = r28
            r8 = r0
            r4 = r2
            r2 = r15
        L_0x032e:
            U0.Y0 r13 = r9.n()
            if (r13 == 0) goto L_0x0346
            wK.t1 r14 = new wK.t1
            r0 = r14
            r1 = r29
            r9 = r10
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.B1.l(wK.r1, androidx.compose.ui.d, wK.C1, wK.G1, boolean, wK.Y8, wK.E1, boolean, r0.m, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C18463r1 r1Var, d dVar, C1 c12, G1 g12, boolean z10, Y8 y82, E1 e12, boolean z11, m mVar, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        l(r1Var, dVar, c12, g12, z10, y82, e12, z11, mVar, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean n(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean o(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final C5601g p(A1<C5601g> a12) {
        return a12.getValue();
    }

    private static final void q(C18463r1 r1Var, F1 f12, boolean z10, C4889m mVar, int i10) {
        int i11;
        C18463r1 r1Var2 = r1Var;
        F1 f13 = f12;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(796552701);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(r1Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(f13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(796552701, i11, -1, "net.ikea.skapa.ui.components.ExpandingText (Choice.kt:480)");
            }
            y0 j10 = C5548j.j(150, 0, C18028t.f147640a.a(), 2, (Object) null);
            String c10 = r1Var.c();
            if (c10 != null) {
                C5437c.a aVar = C5437c.f24302a;
                y0 y0Var = j10;
                l0.d.g(z10, (d) null, g.m(y0Var, aVar.l(), false, (C17642l) null, 12, (Object) null), g.A(y0Var, aVar.l(), false, (C17642l) null, 12, (Object) null), (String) null, c1.c.e(213425043, true, new a(f13, c10), k10, 54), k10, ((i11 >> 6) & 14) | ImageMetadata.EDGE_MODE, 18);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new A1(r1Var2, f13, z11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C18463r1 r1Var, F1 f12, boolean z10, int i10, C4889m mVar, int i11) {
        q(r1Var, f12, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void s(C18463r1 r1Var, C1 c12, G1 g12, boolean z10, F1 f12, float f10, C4889m mVar, int i10) {
        int i11;
        C18463r1 r1Var2 = r1Var;
        C1 c13 = c12;
        boolean z11 = z10;
        F1 f13 = f12;
        int i12 = i10;
        C4889m k10 = mVar.k(-1529276484);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(r1Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(c13) ? 32 : 16;
        }
        G1 g13 = g12;
        if ((i12 & 384) == 0) {
            i11 |= k10.V(g13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(f13) ? 16384 : 8192;
        }
        float f11 = f10;
        if ((196608 & i12) == 0) {
            i11 |= k10.c(f11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i13 = i11;
        if ((74899 & i13) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1529276484, i13, -1, "net.ikea.skapa.ui.components.Layout (Choice.kt:409)");
            }
            k10.W(-443968740);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = C4877g1.a(0);
                k10.u(D10);
            }
            C4894o0 o0Var = (C4894o0) D10;
            k10.P();
            d.a aVar2 = d.f18749a;
            d b10 = f.b(aVar2, (N) null, (p) null, 3, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar3 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar3.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, b10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            d h10 = D.h(J.h(J.b(aVar2, 0.0f, f12.b(), 1, (Object) null), 0.0f, 1, (Object) null), f12.c());
            I a14 = C5080k.a(dVar.b(), aVar3.k(), k10, 6);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = androidx.compose.ui.c.e(k10, h10);
            C17631a<C4504g> a16 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar4.c());
            F1.c(a17, s11, aVar4.e());
            p<C4504g, Integer, C16807N> b12 = aVar4.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b12);
            }
            F1.c(a17, e11, aVar4.d());
            I b13 = G.b(dVar.f(), aVar3.i(), k10, 48);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            d e12 = androidx.compose.ui.c.e(k10, aVar2);
            C17631a<C4504g> a19 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, b13, aVar4.c());
            F1.c(a20, s12, aVar4.e());
            p<C4504g, Integer, C16807N> b14 = aVar4.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b14);
            }
            F1.c(a20, e12, aVar4.d());
            C5843N n10 = C5843N.f28726a;
            int i14 = i13 >> 3;
            int i15 = i13 >> 9;
            int i16 = i15 & 112;
            x(c13, f13, t(o0Var), k10, (i14 & 14) | i16);
            k10.W(734681159);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new C18499u1(o0Var);
                k10.u(D11);
            }
            k10.P();
            int i17 = i13 >> 6;
            int i18 = ((i13 << 3) & 112) | 3078 | (i17 & 896);
            int i19 = i17;
            C4889m mVar2 = k10;
            i(n10, r1Var, f12, (C17642l) D11, mVar2, i18);
            z(g12, f12, f10, t(o0Var), mVar2, (i19 & 14) | i16 | (i15 & 896));
            k10.x();
            k10.x();
            q(r1Var2, f13, z11, k10, (i13 & 14) | i16 | (i14 & 896));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C18511v1(r1Var, c12, g12, z10, f12, f10, i10));
        }
    }

    private static final int t(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void u(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C4894o0 o0Var, int i10) {
        u(o0Var, i10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C18463r1 r1Var, C1 c12, G1 g12, boolean z10, F1 f12, float f10, int i10, C4889m mVar, int i11) {
        s(r1Var, c12, g12, z10, f12, f10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(C1 c12, F1 f12, int i10, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1090975918);
        if ((i11 & 6) == 0) {
            i12 = (k10.V(c12) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.V(f12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.d(i10) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1090975918, i12, -1, "net.ikea.skapa.ui.components.LeadingContent (Choice.kt:508)");
            }
            d.a aVar = d.f18749a;
            d a10 = C5571a.a(D.h(J.b(aVar, 0.0f, B(i10, k10, (i12 >> 6) & 14), 1, (Object) null), f12.j()), f12.i());
            I h10 = C5077h.h(c12.a().b(), false);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, h10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            if (c12 instanceof C1.a) {
                k10.W(-1669202935);
                C1.a aVar3 = (C1.a) c12;
                C5942c c10 = J1.e.c(aVar3.c(), k10, 0);
                String b11 = aVar3.b();
                k10.W(1054539006);
                long i13 = f12.g() ? C5747v0.f27350b.i() : f12.d(k10, (i12 >> 3) & 14);
                k10.P();
                D1 d12 = D1.f149363a;
                V.a(c10, b11, J.p(aVar, d12.g(), d12.g()), i13, k10, 384, 0);
                k10.P();
            } else if (c12 instanceof C1.d) {
                k10.W(-1668751172);
                C1.d dVar = (C1.d) c12;
                C18264a6.b(dVar.c(), dVar.b(), (d) null, f12.h() == E1.Small ? C18300d6.Small : C18300d6.Medium, k10, 0, 4);
                k10.P();
            } else if (c12 instanceof C1.b) {
                k10.W(-1668415721);
                C1.b bVar = (C1.b) c12;
                C5942c c11 = bVar.c();
                String b12 = bVar.b();
                D1 d13 = D1.f149363a;
                C5583F.a(c11, b12, J.p(aVar, d13.h(), d13.h()), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, 384, 120);
                k10.P();
            } else if (C17542s.e(c12, C1.c.f149300c)) {
                k10.W(1054569351);
                k10.P();
            } else {
                k10.W(1054532254);
                k10.P();
                throw new t();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18557z1(c12, f12, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C1 c12, F1 f12, int i10, int i11, C4889m mVar, int i12) {
        x(c12, f12, i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void z(G1 g12, F1 f12, float f10, int i10, C4889m mVar, int i11) {
        int i12;
        G1 g13 = g12;
        F1 f13 = f12;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1592338918);
        if ((i14 & 6) == 0) {
            i12 = (k10.V(g13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.V(f13) ? 32 : 16;
        }
        float f11 = f10;
        if ((i14 & 384) == 0) {
            i12 |= k10.c(f11) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.d(i13) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i15 = i12;
        if ((i15 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1592338918, i15, -1, "net.ikea.skapa.ui.components.TrailingContent (Choice.kt:554)");
            }
            d.a aVar = d.f18749a;
            d a10 = C5571a.a(D.h(J.b(aVar, 0.0f, B(i13, k10, (i15 >> 9) & 14), 1, (Object) null), f12.l()), f12.k(f10));
            I h10 = C5077h.h(g12.a().b(), false);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, h10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            if (g13 instanceof G1.a) {
                k10.W(-1979955346);
                G1.a aVar3 = (G1.a) g13;
                C5942c c10 = J1.e.c(aVar3.c(), k10, 0);
                String b11 = aVar3.b();
                long i16 = C5747v0.f27350b.i();
                D1 d12 = D1.f149363a;
                V.a(c10, b11, J.p(aVar, d12.g(), d12.g()), i16, k10, 3456, 0);
                k10.P();
            } else if (g13 instanceof G1.b) {
                k10.W(-1979551633);
                G1.b bVar = (G1.b) g13;
                C5942c c11 = bVar.c();
                String b12 = bVar.b();
                D1 d13 = D1.f149363a;
                C5583F.a(c11, b12, J.p(aVar, d13.h(), d13.h()), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, 384, 120);
                k10.P();
            } else if (g13 instanceof G1.e) {
                k10.W(-1979213950);
                d1.b(((G1.e) g13).b(), (d) null, f13.d(k10, (i15 >> 3) & 14), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).c().e(), k10, 0, 0, 65530);
                k10.P();
            } else if (g13 instanceof G1.d) {
                k10.W(-1978959967);
                ((G1.d) g13).b().invoke(k10, 0);
                k10.P();
            } else if (C17542s.e(g13, G1.c.f149514c)) {
                k10.W(-756570993);
                k10.P();
            } else {
                k10.W(-756607346);
                k10.P();
                throw new t();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18546y1(g12, f12, f10, i10, i11));
        }
    }
}
