package vk;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.e;
import J1.j;
import L1.i;
import N1.P;
import O0.F0;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LO0/F0;", "sheetState", "", "open", "hasProductItems", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "onRenameListClick", "onDeleteListClick", "onRemoveAllItemsListClick", "onAddAllToCartClick", "onDismissed", "Landroidx/compose/ui/d;", "modifier", "h", "(LO0/F0;ZZLnI/a;LnI/a;LnI/a;LnI/a;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "d", "(ZLnI/a;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "", "iconRes", "labelRes", "onClick", "f", "(IILnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f104548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104550c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104551d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104552e;

        a(boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4) {
            this.f104548a = z10;
            this.f104549b = aVar;
            this.f104550c = aVar2;
            this.f104551d = aVar3;
            this.f104552e = aVar4;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1555135221, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListActionsBottomSheet.<anonymous> (ListActionsBottomSheet.kt:72)");
                }
                J.d(this.f104548a, this.f104549b, this.f104550c, this.f104551d, this.f104552e, mVar, 0);
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
    public static final void d(boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C4889m mVar, int i10) {
        int i11;
        int i12;
        boolean z11 = z10;
        C17631a<C16807N> aVar5 = aVar;
        C17631a<C16807N> aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17631a<C16807N> aVar8 = aVar4;
        int i13 = i10;
        C4889m k10 = mVar.k(-2079697826);
        if ((i13 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar5) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar6) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(aVar7) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(aVar8) ? 16384 : 8192;
        }
        int i14 = i11;
        if ((i14 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2079697826, i14, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.Content (ListActionsBottomSheet.kt:92)");
            }
            d.a aVar9 = d.f18749a;
            d h10 = androidx.compose.foundation.layout.J.h(aVar9, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar10 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar10.a();
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
            F1.c(a13, a10, aVar10.c());
            F1.c(a13, s10, aVar10.e());
            p<C4504g, Integer, C16807N> b10 = aVar10.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar10.d());
            C5862h hVar = C5862h.f28810a;
            f(C18146a.f147983B8, ik.c.f98326R, aVar5, k10, (i14 << 3) & 896);
            C13643u0.c((d) null, 0.0f, 0, k10, 0, 7);
            int i15 = i14;
            f(C18146a.f148257Tc, ik.c.f98324P, aVar6, k10, i15 & 896);
            k10.W(543768273);
            if (z11) {
                C4889m mVar2 = k10;
                C13643u0.c((d) null, 0.0f, 0, mVar2, 0, 7);
                f(C18146a.f148127L2, ik.c.f98325Q, aVar7, k10, (i15 >> 3) & 896);
                C13643u0.c((d) null, 0.0f, 0, mVar2, 0, 7);
                i12 = 6;
                f(C18146a.f148255Ta, ik.c.f98339h, aVar8, k10, (i15 >> 6) & 896);
            } else {
                i12 = 6;
            }
            k10.P();
            C5844O.a(androidx.compose.foundation.layout.J.i(aVar9, h.B((float) 32)), k10, i12);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new H(z10, aVar, aVar2, aVar3, aVar4, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(boolean z10, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, int i10, C4889m mVar, int i11) {
        d(z10, aVar, aVar2, aVar3, aVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void f(int i10, int i11, C17631a<C16807N> aVar, C4889m mVar, int i12) {
        int i13;
        C4889m mVar2;
        int i14 = i10;
        int i15 = i11;
        C17631a<C16807N> aVar2 = aVar;
        int i16 = i12;
        C4889m k10 = mVar.k(698712610);
        if ((i16 & 6) == 0) {
            i13 = (k10.d(i14) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            i13 |= k10.d(i15) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i13 |= k10.F(aVar2) ? 256 : 128;
        }
        int i17 = i13;
        if ((i17 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(698712610, i17, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.Item (ListActionsBottomSheet.kt:128)");
            }
            d.a aVar3 = d.f18749a;
            float f10 = (float) 24;
            d j10 = D.j(androidx.compose.foundation.d.d(androidx.compose.foundation.layout.J.h(aVar3, 0.0f, 1, (Object) null), false, (String) null, (i) null, aVar, 7, (Object) null), h.B(f10), h.B(f10));
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, j10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
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
            F1.c(a12, b10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar4.d());
            C5843N n10 = C5843N.f28726a;
            mVar2 = k10;
            C5583F.a(e.c(i14, k10, i17 & 14), (String) null, androidx.compose.foundation.layout.J.t(aVar3, h.B(f10)), (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, 2, (Object) null), mVar2, 432, 56);
            C5844O.a(androidx.compose.foundation.layout.J.y(aVar3, h.B(f10)), mVar2, 6);
            C13607l.j(j.b(i15, mVar2, (i17 >> 3) & 14), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new I(i14, i15, aVar2, i16));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, int i11, C17631a aVar, int i12, C4889m mVar, int i13) {
        f(i10, i11, aVar, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(O0.F0 r26, boolean r27, boolean r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, nI.C17631a<XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, androidx.compose.ui.d r35, U0.C4889m r36, int r37, int r38) {
        /*
            r15 = r26
            r14 = r29
            r13 = r30
            r12 = r31
            r11 = r32
            r10 = r33
            r9 = r34
            r7 = r37
            r8 = r38
            java.lang.String r0 = "sheetState"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onCloseClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onRenameListClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onDeleteListClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onRemoveAllItemsListClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onAddAllToCartClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onDismissed"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 449951757(0x1ad1b80d, float:8.6737724E-23)
            r1 = r36
            U0.m r6 = r1.k(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x0045
            r1 = r7 | 6
            goto L_0x0055
        L_0x0045:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x0054
            boolean r1 = r6.V(r15)
            if (r1 == 0) goto L_0x0051
            r1 = 4
            goto L_0x0052
        L_0x0051:
            r1 = 2
        L_0x0052:
            r1 = r1 | r7
            goto L_0x0055
        L_0x0054:
            r1 = r7
        L_0x0055:
            r2 = r8 & 2
            if (r2 == 0) goto L_0x005e
            r1 = r1 | 48
            r5 = r27
            goto L_0x0070
        L_0x005e:
            r2 = r7 & 48
            r5 = r27
            if (r2 != 0) goto L_0x0070
            boolean r2 = r6.b(r5)
            if (r2 == 0) goto L_0x006d
            r2 = 32
            goto L_0x006f
        L_0x006d:
            r2 = 16
        L_0x006f:
            r1 = r1 | r2
        L_0x0070:
            r2 = r8 & 4
            if (r2 == 0) goto L_0x0079
            r1 = r1 | 384(0x180, float:5.38E-43)
            r4 = r28
            goto L_0x008b
        L_0x0079:
            r2 = r7 & 384(0x180, float:5.38E-43)
            r4 = r28
            if (r2 != 0) goto L_0x008b
            boolean r2 = r6.b(r4)
            if (r2 == 0) goto L_0x0088
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x008a
        L_0x0088:
            r2 = 128(0x80, float:1.794E-43)
        L_0x008a:
            r1 = r1 | r2
        L_0x008b:
            r2 = r8 & 8
            if (r2 == 0) goto L_0x0092
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a2
        L_0x0092:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00a2
            boolean r2 = r6.F(r14)
            if (r2 == 0) goto L_0x009f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x00a1
        L_0x009f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x00a1:
            r1 = r1 | r2
        L_0x00a2:
            r2 = r8 & 16
            if (r2 == 0) goto L_0x00a9
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b9
        L_0x00a9:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b9
            boolean r2 = r6.F(r13)
            if (r2 == 0) goto L_0x00b6
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b8
        L_0x00b6:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00b8:
            r1 = r1 | r2
        L_0x00b9:
            r2 = r8 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00c1
            r1 = r1 | r3
            goto L_0x00d1
        L_0x00c1:
            r2 = r7 & r3
            if (r2 != 0) goto L_0x00d1
            boolean r2 = r6.F(r12)
            if (r2 == 0) goto L_0x00ce
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d0
        L_0x00ce:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00d0:
            r1 = r1 | r2
        L_0x00d1:
            r2 = r8 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00d9
            r1 = r1 | r3
            goto L_0x00e9
        L_0x00d9:
            r2 = r7 & r3
            if (r2 != 0) goto L_0x00e9
            boolean r2 = r6.F(r11)
            if (r2 == 0) goto L_0x00e6
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r1 = r1 | r2
        L_0x00e9:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00f1
            r1 = r1 | r3
            goto L_0x0101
        L_0x00f1:
            r2 = r7 & r3
            if (r2 != 0) goto L_0x0101
            boolean r2 = r6.F(r10)
            if (r2 == 0) goto L_0x00fe
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r1 = r1 | r2
        L_0x0101:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0109
            r1 = r1 | r3
            goto L_0x0119
        L_0x0109:
            r2 = r7 & r3
            if (r2 != 0) goto L_0x0119
            boolean r2 = r6.F(r9)
            if (r2 == 0) goto L_0x0116
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r1 = r1 | r2
        L_0x0119:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0123
            r1 = r1 | r3
        L_0x0120:
            r3 = r35
            goto L_0x0135
        L_0x0123:
            r3 = r3 & r7
            if (r3 != 0) goto L_0x0120
            r3 = r35
            boolean r16 = r6.V(r3)
            if (r16 == 0) goto L_0x0131
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r16
        L_0x0135:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x014f
            boolean r0 = r6.l()
            if (r0 != 0) goto L_0x0146
            goto L_0x014f
        L_0x0146:
            r6.L()
            r10 = r35
            r19 = r6
            goto L_0x01f1
        L_0x014f:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r16 = r0
            goto L_0x0158
        L_0x0156:
            r16 = r35
        L_0x0158:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0167
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListActionsBottomSheet (ListActionsBottomSheet.kt:57)"
            r3 = 449951757(0x1ad1b80d, float:8.6737724E-23)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0167:
            SC.x1$b r3 = new SC.x1$b
            int r0 = uK.C18146a.f148097J2
            int r2 = Oo.b.f84665i
            r36 = r1
            r1 = 0
            java.lang.String r1 = J1.j.b(r2, r6, r1)
            SC.y1 r2 = new SC.y1
            r2.<init>(r0, r1, r14)
            r0 = 0
            r3.<init>(r0, r2, r0)
            s0.T$a r0 = s0.C5848T.f28733a
            r1 = 6
            s0.T r17 = s0.a0.b(r0, r6, r1)
            vk.J$a r2 = new vk.J$a
            r0 = r2
            r18 = r36
            r1 = r28
            r7 = r2
            r2 = r30
            r19 = r3
            r3 = r31
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = -1555135221(0xffffffffa34e850b, float:-1.1195455E-17)
            r2 = 1
            c1.a r20 = c1.c.e(r1, r2, r7, r6, r0)
            int r0 = r18 >> 3
            r0 = r0 & 14
            int r1 = SC.C13656x1.b.f116494d
            int r1 = r1 << 3
            r0 = r0 | r1
            int r1 = r18 >> 18
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r18 << 12
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r18 = r0 | r1
            r21 = 6
            r22 = 480(0x1e0, float:6.73E-43)
            r5 = 0
            r7 = 0
            r23 = 0
            r25 = 0
            r0 = r27
            r1 = r19
            r2 = r34
            r3 = r16
            r4 = r26
            r19 = r6
            r6 = r7
            r7 = r23
            r9 = r25
            r10 = r17
            r11 = r20
            r12 = r19
            r13 = r18
            r14 = r21
            r15 = r22
            SC.J.c(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ef
            U0.C4895p.R()
        L_0x01ef:
            r10 = r16
        L_0x01f1:
            U0.Y0 r13 = r19.n()
            if (r13 == 0) goto L_0x0216
            vk.G r14 = new vk.G
            r0 = r14
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r11 = r37
            r12 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.J.h(O0.F0, boolean, boolean, nI.a, nI.a, nI.a, nI.a, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(F0 f02, boolean z10, boolean z11, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17631a aVar5, C17631a aVar6, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(f02, z10, z11, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
