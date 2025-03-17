package Bv;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import LC.C13178b;
import LC.h;
import Rv.c;
import SC.C13575d;
import SC.C13643u0;
import Sv.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.n;
import c2.o;
import gs.e;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5673m;
import o1.C5674n;
import p1.C5712d0;
import p1.C5747v0;
import p1.C5749w0;
import p1.i1;
import r1.C5817c;
import r1.f;
import r1.k;
import s0.C5857c;
import s0.C5862h;
import tI.C17978n;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a1\u0010\"\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000e\"\u0014\u0010(\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000e¨\u0006)"}, d2 = {"LSv/e$f;", "model", "Lkotlin/Function1;", "LRv/c$a$e;", "LXH/N;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "A", "(LSv/e$f;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LBv/m;", "latestPurchase", "z", "(LBv/m;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "F", "(Landroidx/compose/ui/d;LU0/m;II)V", "LIC/e;", "label", "amount", "LKJ/c;", "", "imageUrls", "Lkotlin/Function0;", "onClick", "", "loading", "x", "(LIC/e;LIC/e;LKJ/c;LnI/a;Landroidx/compose/ui/d;ZLU0/m;II)V", "t", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "Ls0/c;", "content", "q", "(Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "o", "(LnI/a;Landroidx/compose/ui/d;ZLU0/m;II)V", "Lc2/h;", "a", "ImageSize", "b", "ImageOffset", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private static final float f33413a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f33414b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33415a;

        a(String str) {
            this.f33415a = str;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$CircleContent");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1658033005, i11, -1, "com.ingka.ikea.membership.impl.compose.common.Images.<anonymous>.<anonymous> (PurchaseHistoryEntryPoint.kt:252)");
                }
                C4889m mVar2 = mVar;
                h.c(this.f33415a, (String) null, b.d(J.f(d.f18749a, 0.0f, 1, (Object) null), C13575d.a(mVar2, 0).k0(), (i1) null, 2, (Object) null), (C13178b) null, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar2, 48, 0, 4088);
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

    static {
        float B10 = c2.h.B((float) 44);
        f33413a = B10;
        f33414b = c2.h.B(B10 * 0.6666667f);
    }

    public static final void A(e.f fVar, C17642l<? super c.a.e, C16807N> lVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(fVar, "model");
        C17542s.j(lVar, "onEvent");
        C4889m k10 = mVar.k(1897274087);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(lVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
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
                C4895p.S(1897274087, i12, -1, "com.ingka.ikea.membership.impl.compose.common.PurchaseHistoryEntryPoint (PurchaseHistoryEntryPoint.kt:85)");
            }
            if (fVar instanceof e.f.a) {
                k10.W(-1715311274);
                z(((e.f.a) fVar).g(), lVar, dVar, k10, i12 & 1008, 0);
                k10.P();
            } else if (fVar instanceof e.f.b) {
                k10.W(-1715065847);
                F(dVar, k10, (i12 >> 6) & 14, 0);
                k10.P();
            } else {
                k10.W(1884327969);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new s(fVar, lVar, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(e.f fVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        A(fVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar, m mVar) {
        lVar.invoke(new c.a.e.b(mVar.b(), mVar.e()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar) {
        lVar.invoke(c.a.e.C0647a.f39770a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(m mVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar2, int i12) {
        z(mVar, lVar, dVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void F(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-459788663);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-459788663, i12, -1, "com.ingka.ikea.membership.impl.compose.common.PurchaseHistoryEntryPointLoading (PurchaseHistoryEntryPoint.kt:140)");
            }
            d d10 = b.d(C5116k1.a(aVar, "PurchaseHistoryEntryPointTestTags-Loading"), C13575d.a(k10, 0).l0(), (i1) null, 2, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, d10);
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C13023e c10 = C13026h.c("");
            C13023e c11 = C13026h.c("");
            C15990f a14 = C15985a.a();
            d.a aVar3 = d.f18749a;
            d h10 = J.h(aVar3, 0.0f, 1, (Object) null);
            k10.W(1413832848);
            Object D10 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D10 == aVar4.a()) {
                D10 = new x();
                k10.u(D10);
            }
            k10.P();
            int i16 = C13023e.f110931a;
            d dVar3 = aVar;
            x(c11, c10, a14, (C17631a) D10, h10, true, k10, 224640 | i16 | (i16 << 3), 0);
            C13643u0.c(J.h(aVar3, 0.0f, 1, (Object) null), 0.0f, 0, k10, 6, 6);
            d h11 = J.h(aVar3, 0.0f, 1, (Object) null);
            k10.W(1413837776);
            Object D11 = k10.D();
            if (D11 == aVar4.a()) {
                D11 = new y();
                k10.u(D11);
            }
            k10.P();
            o((C17631a) D11, h11, true, k10, 438, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new z(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(d dVar, int i10, int i11, C4889m mVar, int i12) {
        F(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o(nI.C17631a<XH.C16807N> r35, androidx.compose.ui.d r36, boolean r37, U0.C4889m r38, int r39, int r40) {
        /*
            r4 = r39
            r0 = -1406587169(0xffffffffac292edf, float:-2.4042363E-12)
            r1 = r38
            U0.m r1 = r1.k(r0)
            r2 = r40 & 1
            r5 = 2
            if (r2 == 0) goto L_0x0016
            r2 = r4 | 6
            r6 = r2
            r2 = r35
            goto L_0x002a
        L_0x0016:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0027
            r2 = r35
            boolean r6 = r1.F(r2)
            if (r6 == 0) goto L_0x0024
            r6 = 4
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            r6 = r6 | r4
            goto L_0x002a
        L_0x0027:
            r2 = r35
            r6 = r4
        L_0x002a:
            r7 = r40 & 2
            r15 = 16
            r14 = 32
            if (r7 == 0) goto L_0x0037
            r6 = r6 | 48
        L_0x0034:
            r8 = r36
            goto L_0x0047
        L_0x0037:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0034
            r8 = r36
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x0045
            r9 = r14
            goto L_0x0046
        L_0x0045:
            r9 = r15
        L_0x0046:
            r6 = r6 | r9
        L_0x0047:
            r9 = r40 & 4
            if (r9 == 0) goto L_0x0050
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r10 = r37
            goto L_0x0062
        L_0x0050:
            r10 = r4 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004d
            r10 = r37
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x005f
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r6 = r6 | r11
        L_0x0062:
            r11 = r6 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x0077
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r1.L()
            r31 = r8
            r3 = r10
            goto L_0x028c
        L_0x0077:
            if (r7 == 0) goto L_0x007e
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r31 = r7
            goto L_0x0080
        L_0x007e:
            r31 = r8
        L_0x0080:
            r13 = 0
            if (r9 == 0) goto L_0x0086
            r32 = r13
            goto L_0x0088
        L_0x0086:
            r32 = r10
        L_0x0088:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0094
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.membership.impl.compose.common.AllPurchases (PurchaseHistoryEntryPoint.kt:295)"
            U0.C4895p.S(r0, r6, r7, r8)
        L_0x0094:
            int r0 = yv.C9008m.f58151X
            java.lang.String r0 = J1.j.b(r0, r1, r13)
            r6 = 2661628(0x289cfc, float:3.729735E-39)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x00b3
            r0.m r6 = r0.l.a()
            r1.u(r6)
        L_0x00b3:
            r7 = r6
            r0.m r7 = (r0.m) r7
            r1.P()
            r20 = 7
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            n0.I r8 = O0.C4756u0.c(r16, r17, r18, r20, r21)
            r16 = 20
            r17 = 0
            r9 = 0
            r11 = 0
            r6 = r31
            r10 = r0
            r12 = r35
            r3 = r13
            r13 = r16
            r14 = r17
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r7 = (float) r15
            float r7 = c2.h.B(r7)
            r8 = 12
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.j(r6, r7, r8)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r8 = r7.i()
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r9 = r9.f()
            r10 = 48
            E1.I r8 = androidx.compose.foundation.layout.G.b(r9, r8, r1, r10)
            int r9 = U0.C4883j.a(r1, r3)
            U0.y r10 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r1.m()
            if (r13 != 0) goto L_0x0118
            U0.C4883j.c()
        L_0x0118:
            r1.I()
            boolean r13 = r1.i()
            if (r13 == 0) goto L_0x0125
            r1.p(r12)
            goto L_0x0128
        L_0x0125:
            r1.t()
        L_0x0128:
            U0.m r12 = U0.F1.a(r1)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r11.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0152
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0160
        L_0x0152:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x0160:
            nI.p r8 = r11.d()
            U0.F1.c(r12, r6, r8)
            s0.N r33 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            i1.c r6 = r7.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r3)
            int r7 = U0.C4883j.a(r1, r3)
            U0.y r8 = r1.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r1, r15)
            nI.a r10 = r11.a()
            U0.f r12 = r1.m()
            if (r12 != 0) goto L_0x018c
            U0.C4883j.c()
        L_0x018c:
            r1.I()
            boolean r12 = r1.i()
            if (r12 == 0) goto L_0x0199
            r1.p(r10)
            goto L_0x019c
        L_0x0199:
            r1.t()
        L_0x019c:
            U0.m r10 = U0.F1.a(r1)
            nI.p r12 = r11.c()
            U0.F1.c(r10, r6, r12)
            nI.p r6 = r11.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r11.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x01c6
            java.lang.Object r8 = r10.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x01d4
        L_0x01c6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x01d4:
            nI.p r6 = r11.d()
            U0.F1.c(r10, r9, r6)
            androidx.compose.foundation.layout.j r14 = androidx.compose.foundation.layout.C5079j.f18125a
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            tK.h r7 = SC.C13575d.a(r1, r3)
            long r8 = r7.G0()
            r29 = 0
            r30 = 262132(0x3fff4, float:3.67325E-40)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r14 = r16
            r16 = 0
            r34 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r5 = r0
            r27 = r1
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 292472539(0x116ec6db, float:1.8836167E-28)
            r1.W(r0)
            r0 = 0
            r5 = r34
            if (r32 == 0) goto L_0x0235
            androidx.compose.ui.d r3 = r3.e(r5)
            r6 = 2
            float r7 = (float) r6
            float r7 = c2.h.B(r7)
            r8 = 0
            r9 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r0, r7, r9, r8)
            r7 = 0
            SC.H2.b(r3, r7, r1, r7, r6)
        L_0x0235:
            r1.P()
            r1.x()
            r17 = 2
            r18 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r13 = r33
            r14 = r5
            androidx.compose.ui.d r3 = s0.C5842M.e(r13, r14, r15, r16, r17, r18)
            r6 = 0
            s0.C5844O.a(r3, r1, r6)
            int r3 = uK.C18146a.f148111K1
            t1.c r3 = J1.e.c(r3, r1, r6)
            if (r32 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0259:
            androidx.compose.ui.d r0 = m1.C5571a.a(r5, r0)
            r5 = 32
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.t(r0, r5)
            r5 = 4
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.i(r0, r5)
            r11 = 48
            r12 = 8
            r6 = 0
            r8 = 0
            r5 = r3
            r10 = r1
            O0.V.a(r5, r6, r7, r8, r10, r11, r12)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x028a
            U0.C4895p.R()
        L_0x028a:
            r3 = r32
        L_0x028c:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x02a3
            Bv.D r7 = new Bv.D
            r0 = r7
            r1 = r35
            r2 = r31
            r4 = r39
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.G.o(nI.a, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17631a aVar, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        o(aVar, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: r1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: r1.k} */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(androidx.compose.ui.d r11, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r12, U0.C4889m r13, int r14, int r15) {
        /*
            r0 = -1913463061(0xffffffff8df2deeb, float:-1.4968067E-30)
            U0.m r13 = r13.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x000e
            r2 = r14 | 6
            goto L_0x001e
        L_0x000e:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x001d
            boolean r2 = r13.V(r11)
            if (r2 == 0) goto L_0x001a
            r2 = 4
            goto L_0x001b
        L_0x001a:
            r2 = 2
        L_0x001b:
            r2 = r2 | r14
            goto L_0x001e
        L_0x001d:
            r2 = r14
        L_0x001e:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x0025
            r2 = r2 | 48
            goto L_0x0035
        L_0x0025:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0035
            boolean r3 = r13.F(r12)
            if (r3 == 0) goto L_0x0032
            r3 = 32
            goto L_0x0034
        L_0x0032:
            r3 = 16
        L_0x0034:
            r2 = r2 | r3
        L_0x0035:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x0047
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            r13.L()
            goto L_0x0155
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
        L_0x004b:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0057
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.membership.impl.compose.common.CircleContent (PurchaseHistoryEntryPoint.kt:268)"
            U0.C4895p.S(r0, r2, r1, r3)
        L_0x0057:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r13.Q(r0)
            c2.d r0 = (c2.d) r0
            r1 = 1
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            float r4 = r0.H1(r1)
            r0 = -1745863283(0xffffffff97f03d8d, float:-1.5525174E-24)
            r13.W(r0)
            java.lang.Object r0 = r13.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r3 = r1.a()
            if (r0 != r3) goto L_0x008d
            r1.k r0 = new r1.k
            r9 = 30
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.u(r0)
        L_0x008d:
            r1.k r0 = (r1.k) r0
            r13.P()
            r3 = -1745859430(0xffffffff97f04c9a, float:-1.5528973E-24)
            r13.W(r3)
            boolean r3 = r13.F(r0)
            java.lang.Object r4 = r13.D()
            if (r3 != 0) goto L_0x00a8
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00b0
        L_0x00a8:
            Bv.v r4 = new Bv.v
            r4.<init>(r0)
            r13.u(r4)
        L_0x00b0:
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            androidx.compose.ui.d r0 = androidx.compose.ui.draw.b.d(r11, r4)
            A0.f r1 = A0.g.h()
            androidx.compose.ui.d r0 = m1.e.a(r0, r1)
            int r1 = r2 << 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c r2 = r2.o()
            r3 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r3)
            int r3 = U0.C4883j.a(r13, r3)
            U0.y r4 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r13.m()
            if (r7 != 0) goto L_0x00eb
            U0.C4883j.c()
        L_0x00eb:
            r13.I()
            boolean r7 = r13.i()
            if (r7 == 0) goto L_0x00f8
            r13.p(r6)
            goto L_0x00fb
        L_0x00f8:
            r13.t()
        L_0x00fb:
            U0.m r6 = U0.F1.a(r13)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r5.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0125
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0133
        L_0x0125:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x0133:
            nI.p r2 = r5.d()
            U0.F1.c(r6, r0, r2)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            int r1 = r1 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r0, r13, r1)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0155
            U0.C4895p.R()
        L_0x0155:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x0163
            Bv.w r0 = new Bv.w
            r0.<init>(r11, r12, r14, r15)
            r13.a(r0)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.G.q(androidx.compose.ui.d, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(k kVar, C5817c cVar) {
        C17542s.j(cVar, "$this$drawWithContent");
        cVar.V1();
        f.G1(cVar, C5747v0.f27350b.a(), C5673m.k(cVar.b()) / ((float) 2), C5674n.b(cVar.b()), 0.0f, kVar, (C5749w0) null, C5712d0.f27280a.a(), 40, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        q(dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void t(C15987c<String> cVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-338193878);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-338193878, i12, -1, "com.ingka.ikea.membership.impl.compose.common.Images (PurchaseHistoryEntryPoint.kt:236)");
            }
            List<T> k12 = C16877v.k1(cVar, 3);
            d y10 = J.y(dVar, c2.h.B(f33413a + c2.h.B(((float) C17978n.e(k12.size() - 1, 0)) * f33414b)));
            k10.W(-702612589);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new F();
                k10.u(D10);
            }
            k10.P();
            d a10 = androidx.compose.ui.graphics.b.a(y10, (C17642l) D10);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, a10);
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
            F1.c(a13, h10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            k10.W(1523281656);
            int i14 = 0;
            for (T t10 : k12) {
                int i15 = i14 + 1;
                d a14 = jVar.a(J.t(C5116k1.a(d.f18749a, "PurchaseHistoryEntryPointTestTags-Image"), f33413a), C5437c.f24302a.h());
                k10.W(1523290092);
                boolean d10 = k10.d(i14);
                Object D11 = k10.D();
                if (d10 || D11 == C4889m.f14007a.a()) {
                    D11 = new t(i14);
                    k10.u(D11);
                }
                k10.P();
                q(A.a(a14, (C17642l) D11), c1.c.e(1098673009, true, new a(t10), k10, 54), k10, 48, 0);
                i14 = i15;
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
            n10.a(new u(cVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(androidx.compose.ui.graphics.c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.r(androidx.compose.ui.graphics.a.f18902a.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final n v(int i10, c2.d dVar) {
        C17542s.j(dVar, "$this$offset");
        return n.b(o.a(i10 * dVar.K0(f33414b), 0));
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        t(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void x(IC.C13023e r41, IC.C13023e r42, KJ.C15987c<java.lang.String> r43, nI.C17631a<XH.C16807N> r44, androidx.compose.ui.d r45, boolean r46, U0.C4889m r47, int r48, int r49) {
        /*
            r0 = r41
            r1 = r42
            r15 = r43
            r14 = r48
            r2 = 32
            r3 = 16
            r4 = 4
            r13 = 48
            r11 = 6
            r5 = 1358525290(0x50f9736a, float:3.34807245E10)
            r6 = r47
            U0.m r12 = r6.k(r5)
            r10 = 1
            r6 = r49 & 1
            r9 = 2
            if (r6 == 0) goto L_0x0022
            r6 = r14 | 6
            goto L_0x003b
        L_0x0022:
            r6 = r14 & 6
            if (r6 != 0) goto L_0x003a
            r6 = r14 & 8
            if (r6 != 0) goto L_0x002f
            boolean r6 = r12.V(r0)
            goto L_0x0033
        L_0x002f:
            boolean r6 = r12.F(r0)
        L_0x0033:
            if (r6 == 0) goto L_0x0037
            r6 = r4
            goto L_0x0038
        L_0x0037:
            r6 = r9
        L_0x0038:
            r6 = r6 | r14
            goto L_0x003b
        L_0x003a:
            r6 = r14
        L_0x003b:
            r7 = r49 & 2
            if (r7 == 0) goto L_0x0041
            r6 = r6 | r13
            goto L_0x0058
        L_0x0041:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0058
            r7 = r14 & 64
            if (r7 != 0) goto L_0x004e
            boolean r7 = r12.V(r1)
            goto L_0x0052
        L_0x004e:
            boolean r7 = r12.F(r1)
        L_0x0052:
            if (r7 == 0) goto L_0x0056
            r7 = r2
            goto L_0x0057
        L_0x0056:
            r7 = r3
        L_0x0057:
            r6 = r6 | r7
        L_0x0058:
            r4 = r49 & 4
            if (r4 == 0) goto L_0x005f
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006f
            boolean r4 = r12.V(r15)
            if (r4 == 0) goto L_0x006c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r6 = r6 | r4
        L_0x006f:
            r4 = r49 & 8
            if (r4 == 0) goto L_0x0078
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            r8 = r44
            goto L_0x008a
        L_0x0078:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            r8 = r44
            if (r4 != 0) goto L_0x008a
            boolean r4 = r12.F(r8)
            if (r4 == 0) goto L_0x0087
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r6 = r6 | r4
        L_0x008a:
            r4 = r49 & 16
            if (r4 == 0) goto L_0x0093
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r7 = r45
            goto L_0x00a6
        L_0x0093:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0090
            r7 = r45
            boolean r16 = r12.V(r7)
            if (r16 == 0) goto L_0x00a2
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r6 = r6 | r16
        L_0x00a6:
            r2 = r49 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b1
            r6 = r6 | r16
            r9 = r46
            goto L_0x00c4
        L_0x00b1:
            r16 = r14 & r16
            r9 = r46
            if (r16 != 0) goto L_0x00c4
            boolean r16 = r12.b(r9)
            if (r16 == 0) goto L_0x00c0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r6 = r6 | r16
        L_0x00c4:
            r16 = 74899(0x12493, float:1.04956E-40)
            r10 = r6 & r16
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00de
            boolean r10 = r12.l()
            if (r10 != 0) goto L_0x00d5
            goto L_0x00de
        L_0x00d5:
            r12.L()
            r5 = r7
            r6 = r9
            r1 = r12
            r3 = r15
            goto L_0x048c
        L_0x00de:
            if (r4 == 0) goto L_0x00e5
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r29 = r4
            goto L_0x00e7
        L_0x00e5:
            r29 = r7
        L_0x00e7:
            r11 = 0
            if (r2 == 0) goto L_0x00ed
            r30 = r11
            goto L_0x00ef
        L_0x00ed:
            r30 = r9
        L_0x00ef:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00fb
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.membership.impl.compose.common.LatestPurchase (PurchaseHistoryEntryPoint.kt:173)"
            U0.C4895p.S(r5, r6, r2, r4)
        L_0x00fb:
            r2 = 382835635(0x16d19bb3, float:3.386403E-25)
            r12.W(r2)
            java.lang.Object r2 = r12.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0114
            r0.m r2 = r0.l.a()
            r12.u(r2)
        L_0x0114:
            r17 = r2
            r0.m r17 = (r0.m) r17
            r12.P()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            n0.I r18 = O0.C4756u0.c(r18, r19, r20, r22, r23)
            int r10 = IC.C13023e.f110931a
            r31 = r6 & 14
            r2 = r10 | r31
            java.lang.String r20 = r0.a(r12, r2)
            r23 = 20
            r24 = 0
            r19 = 0
            r21 = 0
            r16 = r29
            r22 = r44
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            r4 = 20
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.j(r2, r3, r4)
            i1.c$a r32 = i1.C5437c.f24302a
            i1.c$c r3 = r32.i()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r4.f()
            E1.I r3 = androidx.compose.foundation.layout.G.b(r5, r3, r12, r13)
            int r5 = U0.C4883j.a(r12, r11)
            U0.y r7 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            G1.g$a r33 = G1.C4504g.f6515W
            nI.a r9 = r33.a()
            U0.f r16 = r12.m()
            if (r16 != 0) goto L_0x017e
            U0.C4883j.c()
        L_0x017e:
            r12.I()
            boolean r16 = r12.i()
            if (r16 == 0) goto L_0x018b
            r12.p(r9)
            goto L_0x018e
        L_0x018b:
            r12.t()
        L_0x018e:
            U0.m r9 = U0.F1.a(r12)
            nI.p r13 = r33.c()
            U0.F1.c(r9, r3, r13)
            nI.p r3 = r33.e()
            U0.F1.c(r9, r7, r3)
            nI.p r3 = r33.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x01b8
            java.lang.Object r7 = r9.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r13)
            if (r7 != 0) goto L_0x01c6
        L_0x01b8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r3)
        L_0x01c6:
            nI.p r3 = r33.d()
            U0.F1.c(r9, r2, r3)
            s0.N r17 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r18 = r13
            androidx.compose.ui.d r2 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d$m r3 = r4.g()
            i1.c$b r4 = r32.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r12, r11)
            int r4 = U0.C4883j.a(r12, r11)
            U0.y r5 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            nI.a r7 = r33.a()
            U0.f r9 = r12.m()
            if (r9 != 0) goto L_0x0204
            U0.C4883j.c()
        L_0x0204:
            r12.I()
            boolean r9 = r12.i()
            if (r9 == 0) goto L_0x0211
            r12.p(r7)
            goto L_0x0214
        L_0x0211:
            r12.t()
        L_0x0214:
            U0.m r7 = U0.F1.a(r12)
            nI.p r9 = r33.c()
            U0.F1.c(r7, r3, r9)
            nI.p r3 = r33.e()
            U0.F1.c(r7, r5, r3)
            nI.p r3 = r33.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x023e
            java.lang.Object r5 = r7.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x024c
        L_0x023e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r3)
        L_0x024c:
            nI.p r3 = r33.d()
            U0.F1.c(r7, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            r34 = 1065353216(0x3f800000, float:1.0)
            if (r30 == 0) goto L_0x025d
            r2 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x025f
        L_0x025d:
            r2 = r34
        L_0x025f:
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.g(r13, r2)
            i1.c r3 = r32.o()
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r11)
            int r4 = U0.C4883j.a(r12, r11)
            U0.y r5 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            nI.a r7 = r33.a()
            U0.f r9 = r12.m()
            if (r9 != 0) goto L_0x0284
            U0.C4883j.c()
        L_0x0284:
            r12.I()
            boolean r9 = r12.i()
            if (r9 == 0) goto L_0x0291
            r12.p(r7)
            goto L_0x0294
        L_0x0291:
            r12.t()
        L_0x0294:
            U0.m r7 = U0.F1.a(r12)
            nI.p r9 = r33.c()
            U0.F1.c(r7, r3, r9)
            nI.p r3 = r33.e()
            U0.F1.c(r7, r5, r3)
            nI.p r3 = r33.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x02be
            java.lang.Object r5 = r7.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x02cc
        L_0x02be:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r3)
        L_0x02cc:
            nI.p r3 = r33.d()
            U0.F1.c(r7, r2, r3)
            androidx.compose.foundation.layout.j r9 = androidx.compose.foundation.layout.C5079j.f18125a
            TC.b$b$c r2 = TC.C13679b.C2857b.c.f116685a
            tK.h r3 = SC.C13575d.a(r12, r11)
            long r4 = r3.G0()
            java.lang.String r3 = "PurchaseHistoryEntryPointTestTags-Amount"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r13, r3)
            r7 = r10 | 432(0x1b0, float:6.05E-43)
            int r17 = r6 >> 3
            r17 = r17 & 14
            r24 = r7 | r17
            r25 = 0
            r26 = 262128(0x3fff0, float:3.6732E-40)
            r17 = 0
            r35 = r6
            r6 = r17
            r17 = 0
            r8 = r17
            r36 = r9
            r9 = r17
            r37 = r10
            r10 = r17
            r17 = 0
            r45 = r12
            r11 = r17
            r17 = 0
            r38 = r13
            r27 = 48
            r13 = r17
            r16 = 0
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r1 = r42
            r23 = r45
            SC.C13607l.i(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 1906050761(0x719c06c9, float:1.5452117E30)
            r15 = r45
            r15.W(r1)
            r14 = 0
            r13 = 0
            r10 = r36
            r12 = r38
            if (r30 == 0) goto L_0x034f
            androidx.compose.ui.d r1 = r10.e(r12)
            r11 = 2
            float r2 = (float) r11
            float r2 = c2.h.B(r2)
            r9 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r13, r2, r9, r14)
            r8 = 0
            SC.H2.b(r1, r8, r15, r8, r11)
            goto L_0x0352
        L_0x034f:
            r8 = 0
            r9 = 1
            r11 = 2
        L_0x0352:
            r15.P()
            r15.x()
            float r7 = (float) r11
            float r1 = c2.h.B(r7)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r12, r1)
            r5 = 6
            s0.C5844O.a(r1, r15, r5)
            if (r30 == 0) goto L_0x036a
            r34 = 1055286886(0x3ee66666, float:0.45)
        L_0x036a:
            r1 = r34
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.g(r12, r1)
            i1.c r2 = r32.o()
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r8)
            int r3 = U0.C4883j.a(r15, r8)
            U0.y r4 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            nI.a r6 = r33.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0391
            U0.C4883j.c()
        L_0x0391:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x039e
            r15.p(r6)
            goto L_0x03a1
        L_0x039e:
            r15.t()
        L_0x03a1:
            U0.m r6 = U0.F1.a(r15)
            nI.p r5 = r33.c()
            U0.F1.c(r6, r2, r5)
            nI.p r2 = r33.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r33.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x03cb
            java.lang.Object r4 = r6.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x03d9
        L_0x03cb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x03d9:
            nI.p r2 = r33.d()
            U0.F1.c(r6, r1, r2)
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            tK.h r2 = SC.C13575d.a(r15, r8)
            long r3 = r2.H0()
            java.lang.String r2 = "PurchaseHistoryEntryPointTestTags-Label"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r12, r2)
            r5 = r37
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            r23 = r5 | r31
            r24 = 0
            r25 = 262128(0x3fff0, float:3.6732E-40)
            r5 = 0
            r26 = 6
            r16 = 0
            r28 = r7
            r7 = r16
            r8 = r16
            r9 = r16
            r16 = 0
            r39 = r10
            r10 = r16
            r16 = 0
            r40 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r45 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r41
            r22 = r45
            SC.C13607l.i(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 1906072777(0x719c5cc9, float:1.5485386E30)
            r1 = r45
            r1.W(r0)
            if (r30 == 0) goto L_0x0453
            r2 = r39
            r0 = r40
            androidx.compose.ui.d r2 = r2.e(r0)
            float r3 = c2.h.B(r28)
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r6, r3, r4, r5)
            r3 = 2
            r4 = 0
            SC.H2.b(r2, r4, r1, r4, r3)
            goto L_0x0456
        L_0x0453:
            r0 = r40
            r4 = 0
        L_0x0456:
            r1.P()
            r1.x()
            r1.x()
            r2 = 1895927872(0x71019040, float:6.4156726E29)
            r1.W(r2)
            boolean r2 = r43.isEmpty()
            if (r2 != 0) goto L_0x0477
            int r2 = r35 >> 6
            r2 = r2 & 14
            r2 = r2 | 48
            r3 = r43
            t(r3, r0, r1, r2, r4)
            goto L_0x0479
        L_0x0477:
            r3 = r43
        L_0x0479:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0488
            U0.C4895p.R()
        L_0x0488:
            r5 = r29
            r6 = r30
        L_0x048c:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x04a7
            Bv.E r10 = new Bv.E
            r0 = r10
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r7 = r48
            r8 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x04a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.G.x(IC.e, IC.e, KJ.c, nI.a, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C13023e eVar, C13023e eVar2, C15987c cVar, C17631a aVar, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        x(eVar, eVar2, cVar, aVar, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(Bv.m r22, nI.C17642l<? super Rv.c.a.e, XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r22
            r2 = r23
            r4 = r26
            r0 = 2
            java.lang.String r3 = "latestPurchase"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            r3 = 1494539494(0x5914dce6, float:2.61882356E15)
            r5 = r25
            U0.m r14 = r5.k(r3)
            r15 = 1
            r5 = r27 & 1
            r6 = 4
            if (r5 == 0) goto L_0x0023
            r5 = r4 | 6
            goto L_0x0033
        L_0x0023:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0032
            boolean r5 = r14.V(r1)
            if (r5 == 0) goto L_0x002f
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = r0
        L_0x0030:
            r5 = r5 | r4
            goto L_0x0033
        L_0x0032:
            r5 = r4
        L_0x0033:
            r0 = r27 & 2
            r13 = 32
            if (r0 == 0) goto L_0x003c
            r5 = r5 | 48
            goto L_0x004b
        L_0x003c:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x004b
            boolean r0 = r14.F(r2)
            if (r0 == 0) goto L_0x0048
            r0 = r13
            goto L_0x004a
        L_0x0048:
            r0 = 16
        L_0x004a:
            r5 = r5 | r0
        L_0x004b:
            r0 = r27 & 4
            if (r0 == 0) goto L_0x0054
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r7 = r24
            goto L_0x0066
        L_0x0054:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r24
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r5 = r5 | r8
        L_0x0066:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0079
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r14.L()
            r3 = r7
            goto L_0x01e1
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007f
        L_0x007e:
            r0 = r7
        L_0x007f:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x008b
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.membership.impl.compose.common.PurchaseHistoryEntryPoint (PurchaseHistoryEntryPoint.kt:107)"
            U0.C4895p.S(r3, r5, r7, r8)
        L_0x008b:
            r3 = 0
            tK.h r7 = SC.C13575d.a(r14, r3)
            long r8 = r7.l0()
            r11 = 2
            r12 = 0
            r10 = 0
            r7 = r0
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r14, r3)
            int r9 = U0.C4883j.a(r14, r3)
            U0.y r10 = r14.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r14, r7)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x00c7
            U0.C4883j.c()
        L_0x00c7:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x00d4
            r14.p(r12)
            goto L_0x00d7
        L_0x00d4:
            r14.t()
        L_0x00d7:
            U0.m r12 = U0.F1.a(r14)
            nI.p r3 = r11.c()
            U0.F1.c(r12, r8, r3)
            nI.p r3 = r11.e()
            U0.F1.c(r12, r10, r3)
            nI.p r3 = r11.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x0101
            java.lang.Object r8 = r12.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x010f
        L_0x0101:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r12.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r12.w(r8, r3)
        L_0x010f:
            nI.p r3 = r11.d()
            U0.F1.c(r12, r7, r3)
            s0.h r3 = s0.C5862h.f28810a
            IC.e r3 = r22.a()
            IC.e r7 = r22.d()
            KJ.c r8 = r22.c()
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "PurchaseHistoryEntryPointTestTags-LatestRoot"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r12, r9)
            r11 = 0
            r10 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r9, r11, r15, r10)
            r10 = 1169252414(0x45b1603e, float:5676.0303)
            r14.W(r10)
            r10 = r5 & 112(0x70, float:1.57E-43)
            if (r10 != r13) goto L_0x013f
            r16 = r15
            goto L_0x0141
        L_0x013f:
            r16 = 0
        L_0x0141:
            r5 = r5 & 14
            if (r5 != r6) goto L_0x0147
            r5 = r15
            goto L_0x0148
        L_0x0147:
            r5 = 0
        L_0x0148:
            r5 = r16 | r5
            java.lang.Object r6 = r14.D()
            if (r5 != 0) goto L_0x0158
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0160
        L_0x0158:
            Bv.A r6 = new Bv.A
            r6.<init>(r2, r1)
            r14.u(r6)
        L_0x0160:
            r16 = r6
            nI.a r16 = (nI.C17631a) r16
            r14.P()
            int r5 = IC.C13023e.f110931a
            r6 = r5 | 24576(0x6000, float:3.4438E-41)
            int r5 = r5 << 3
            r17 = r6 | r5
            r18 = 32
            r19 = 0
            r5 = r7
            r6 = r3
            r7 = r8
            r8 = r16
            r20 = r10
            r3 = 0
            r10 = r19
            r11 = r14
            r21 = r12
            r12 = r17
            r13 = r18
            x(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r12 = r21
            r13 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r12, r13, r15, r3)
            r10 = 6
            r11 = 6
            r6 = 0
            r7 = 0
            r9 = r14
            SC.C13643u0.c(r5, r6, r7, r9, r10, r11)
            r5 = 1169267679(0x45b19bdf, float:5683.484)
            r14.W(r5)
            r6 = r20
            r5 = 32
            if (r6 != r5) goto L_0x01a5
            r5 = r15
            goto L_0x01a6
        L_0x01a5:
            r5 = 0
        L_0x01a6:
            java.lang.Object r6 = r14.D()
            if (r5 != 0) goto L_0x01b4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01bc
        L_0x01b4:
            Bv.B r6 = new Bv.B
            r6.<init>(r2)
            r14.u(r6)
        L_0x01bc:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r14.P()
            java.lang.String r6 = "PurchaseHistoryEntryPointTestTags-AllRoot"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r12, r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r6, r13, r15, r3)
            r9 = 48
            r10 = 4
            r7 = 0
            r8 = r14
            o(r5, r6, r7, r8, r9, r10)
            r14.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01e0
            U0.C4895p.R()
        L_0x01e0:
            r3 = r0
        L_0x01e1:
            U0.Y0 r6 = r14.n()
            if (r6 == 0) goto L_0x01f8
            Bv.C r7 = new Bv.C
            r0 = r7
            r1 = r22
            r2 = r23
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.G.z(Bv.m, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
