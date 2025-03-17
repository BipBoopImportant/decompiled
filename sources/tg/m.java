package tG;

import U0.A1;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.RoomType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import tG.n;
import uG.C18048l;
import vG.C18151b;
import vG.u;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u0002"}, d2 = {"LuG/l;", "browseState", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "onBedDisclaimerClicked", "Lkotlin/Function0;", "onClose", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "m", "(LuG/l;Lcom/sugarcube/core/network/models/RoomType;LnI/l;LnI/l;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LtG/n;", "state", "LvG/u;", "catalogHeaderMode", "", "searchHasFocus", "LtG/o;", "viewModel", "onUpdateHeaderMode", "x", "(LtG/n;LvG/u;LuG/l;Lcom/sugarcube/core/network/models/RoomType;LnI/l;LnI/l;ZLtG/o;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    /* access modifiers changed from: private */
    public static final C16807N A(o oVar, String str) {
        C17542s.j(str, "query");
        oVar.G(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "selectedItem");
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(o oVar) {
        oVar.F();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "selectedItem");
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(o oVar) {
        oVar.F();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(n nVar, u uVar, C18048l lVar, RoomType roomType, C17642l lVar2, C17642l lVar3, boolean z10, o oVar, C17631a aVar, C17642l lVar4, C17642l lVar5, int i10, int i11, C4889m mVar, int i12) {
        x(nVar, uVar, lVar, roomType, lVar2, lVar3, z10, oVar, aVar, lVar4, lVar5, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(uG.C18048l r24, com.sugarcube.core.network.models.RoomType r25, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r26, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r27, nI.C17631a<XH.C16807N> r28, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c, XH.C16807N> r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r14 = r24
            r15 = r25
            r13 = r26
            r12 = r27
            r11 = r28
            r10 = r29
            r9 = r32
            r0 = 16
            r1 = 32
            r2 = 4
            java.lang.String r3 = "browseState"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            java.lang.String r3 = "roomType"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            java.lang.String r3 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r13, r3)
            java.lang.String r3 = "onBedDisclaimerClicked"
            kotlin.jvm.internal.C17542s.j(r12, r3)
            java.lang.String r3 = "onClose"
            kotlin.jvm.internal.C17542s.j(r11, r3)
            java.lang.String r3 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r10, r3)
            r3 = -2054698490(0xffffffff8587ca06, float:-1.276955E-35)
            r4 = r31
            U0.m r8 = r4.k(r3)
            r4 = 1
            r5 = r33 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0043
            r5 = r9 | 6
            goto L_0x0053
        L_0x0043:
            r5 = r9 & 6
            if (r5 != 0) goto L_0x0052
            boolean r5 = r8.V(r14)
            if (r5 == 0) goto L_0x004f
            r5 = r2
            goto L_0x0050
        L_0x004f:
            r5 = r6
        L_0x0050:
            r5 = r5 | r9
            goto L_0x0053
        L_0x0052:
            r5 = r9
        L_0x0053:
            r7 = r33 & 2
            if (r7 == 0) goto L_0x005a
            r5 = r5 | 48
            goto L_0x0068
        L_0x005a:
            r7 = r9 & 48
            if (r7 != 0) goto L_0x0068
            boolean r7 = r8.V(r15)
            if (r7 == 0) goto L_0x0066
            r7 = r1
            goto L_0x0067
        L_0x0066:
            r7 = r0
        L_0x0067:
            r5 = r5 | r7
        L_0x0068:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x006f
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007f
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x007c
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007e
        L_0x007c:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007e:
            r5 = r5 | r2
        L_0x007f:
            r2 = r33 & 8
            if (r2 == 0) goto L_0x0086
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0096
        L_0x0086:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0096
            boolean r2 = r8.F(r12)
            if (r2 == 0) goto L_0x0093
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0095
        L_0x0093:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0095:
            r5 = r5 | r2
        L_0x0096:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x009d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ad
        L_0x009d:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r8.F(r11)
            if (r0 == 0) goto L_0x00aa
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00aa:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r5 = r5 | r0
        L_0x00ad:
            r0 = r33 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00b5
            r5 = r5 | r1
            goto L_0x00c5
        L_0x00b5:
            r0 = r9 & r1
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r8.F(r10)
            if (r0 == 0) goto L_0x00c2
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r5 = r5 | r0
        L_0x00c5:
            r0 = r33 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            if (r0 == 0) goto L_0x00d0
            r5 = r5 | r1
        L_0x00cc:
            r1 = r30
        L_0x00ce:
            r7 = r5
            goto L_0x00e2
        L_0x00d0:
            r1 = r1 & r9
            if (r1 != 0) goto L_0x00cc
            r1 = r30
            boolean r2 = r8.V(r1)
            if (r2 == 0) goto L_0x00de
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r5 = r5 | r2
            goto L_0x00ce
        L_0x00e2:
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r7
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r5) goto L_0x00fa
            boolean r2 = r8.l()
            if (r2 != 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            r8.L()
            r7 = r1
            r16 = r8
            goto L_0x02a8
        L_0x00fa:
            if (r0 == 0) goto L_0x0100
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r5 = r0
            goto L_0x0101
        L_0x0100:
            r5 = r1
        L_0x0101:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x010d
            r0 = -1
            java.lang.String r1 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.CatalogScreen (CatalogScreen.kt:49)"
            U0.C4895p.S(r3, r7, r0, r1)
        L_0x010d:
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r8.C(r0)
            m3.a r0 = m3.a.f26247a
            int r1 = m3.a.f26249c
            androidx.lifecycle.k0 r0 = r0.a(r8, r1)
            if (r0 == 0) goto L_0x02c8
            r1 = 0
            androidx.lifecycle.i0$c r19 = f3.a.a(r0, r8, r1)
            r2 = 1729797275(0x671a9c9b, float:7.301333E23)
            r8.C(r2)
            boolean r2 = r0 instanceof androidx.lifecycle.C5212o
            if (r2 == 0) goto L_0x0136
            r2 = r0
            androidx.lifecycle.o r2 = (androidx.lifecycle.C5212o) r2
            l3.a r2 = r2.getDefaultViewModelCreationExtras()
        L_0x0133:
            r20 = r2
            goto L_0x0139
        L_0x0136:
            l3.a$a r2 = l3.a.C0407a.f25486b
            goto L_0x0133
        L_0x0139:
            r22 = 36936(0x9048, float:5.1758E-41)
            r23 = 0
            java.lang.Class<tG.o> r16 = tG.o.class
            r18 = 0
            r17 = r0
            r21 = r8
            androidx.lifecycle.f0 r0 = m3.c.b(r16, r17, r18, r19, r20, r21, r22, r23)
            r8.U()
            r8.U()
            r16 = r0
            tG.o r16 = (tG.o) r16
            TJ.P r0 = r16.m()
            r2 = 0
            U0.A1 r17 = U0.p1.b(r0, r2, r8, r1, r4)
            r0 = 1758131987(0x68caf713, float:7.667806E24)
            r8.W(r0)
            java.lang.Object r0 = r8.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r3 = r18.a()
            if (r0 != r3) goto L_0x0178
            vG.u r0 = vG.u.BROWSE_EXPANDED
            U0.r0 r0 = U0.u1.e(r0, r2, r6, r2)
            r8.u(r0)
        L_0x0178:
            r3 = r0
            U0.r0 r3 = (U0.C4899r0) r3
            r8.P()
            r0 = 1758134807(0x68cb0217, float:7.6694316E24)
            r8.W(r0)
            java.lang.Object r0 = r8.D()
            java.lang.Object r1 = r18.a()
            if (r0 != r1) goto L_0x0197
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            U0.r0 r0 = U0.u1.e(r0, r2, r6, r2)
            r8.u(r0)
        L_0x0197:
            r19 = r0
            U0.r0 r19 = (U0.C4899r0) r19
            r8.P()
            r0 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r5, r0, r4, r2)
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.k()
            r4 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r8, r4)
            int r2 = U0.C4883j.a(r8, r4)
            U0.y r4 = r8.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r8, r0)
            G1.g$a r6 = G1.C4504g.f6515W
            r30 = r3
            nI.a r3 = r6.a()
            U0.f r20 = r8.m()
            if (r20 != 0) goto L_0x01d1
            U0.C4883j.c()
        L_0x01d1:
            r8.I()
            boolean r20 = r8.i()
            if (r20 == 0) goto L_0x01de
            r8.p(r3)
            goto L_0x01e1
        L_0x01de:
            r8.t()
        L_0x01e1:
            U0.m r3 = U0.F1.a(r8)
            r20 = r5
            nI.p r5 = r6.c()
            U0.F1.c(r3, r1, r5)
            nI.p r1 = r6.e()
            U0.F1.c(r3, r4, r1)
            nI.p r1 = r6.b()
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x020d
            java.lang.Object r4 = r3.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x021b
        L_0x020d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.u(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.w(r2, r1)
        L_0x021b:
            nI.p r1 = r6.d()
            U0.F1.c(r3, r0, r1)
            s0.h r0 = s0.C5862h.f28810a
            r6 = 0
            r0 = r16
            r1 = r17
            r2 = r28
            r5 = r30
            r3 = r5
            r4 = r19
            r5 = r8
            n(r0, r1, r2, r3, r4, r5, r6)
            tG.n r0 = q(r17)
            vG.u r1 = t(r30)
            boolean r6 = v(r19)
            r2 = -1892304268(0xffffffff8f35ba74, float:-8.9598986E-30)
            r8.W(r2)
            java.lang.Object r2 = r8.D()
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x025a
            tG.a r2 = new tG.a
            r3 = r30
            r2.<init>(r3)
            r8.u(r2)
        L_0x025a:
            r17 = r2
            nI.l r17 = (nI.C17642l) r17
            r8.P()
            int r2 = r7 << 6
            r3 = r2 & 896(0x380, float:1.256E-42)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r2 = r2 | r3
            int r3 = r7 << 12
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r18 = r2 | r3
            int r2 = r7 >> 15
            r19 = r2 & 14
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r7 = r16
            r16 = r8
            r8 = r28
            r9 = r17
            r10 = r29
            r11 = r16
            r12 = r18
            r13 = r19
            x(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r16.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a6
            U0.C4895p.R()
        L_0x02a6:
            r7 = r20
        L_0x02a8:
            U0.Y0 r10 = r16.n()
            if (r10 == 0) goto L_0x02c7
            tG.d r11 = new tG.d
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02c7:
            return
        L_0x02c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tG.m.m(uG.l, com.sugarcube.core.network.models.RoomType, nI.l, nI.l, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void n(tG.o r8, U0.A1<? extends tG.n> r9, nI.C17631a<XH.C16807N> r10, U0.C4899r0<vG.u> r11, U0.C4899r0<java.lang.Boolean> r12, U0.C4889m r13, int r14) {
        /*
            r0 = 1
            r1 = 0
            r2 = 118346327(0x70dd257, float:1.0669474E-34)
            r13.W(r2)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0014
            r3 = -1
            java.lang.String r4 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.CatalogScreen.Header (CatalogScreen.kt:56)"
            U0.C4895p.S(r2, r14, r3, r4)
        L_0x0014:
            r14 = 2
            tG.n[] r14 = new tG.n[r14]
            tG.n$d r2 = tG.n.d.f147227a
            r14[r1] = r2
            tG.n$b r2 = tG.n.b.f147225a
            r14[r0] = r2
            java.util.List r14 = YH.C16877v.q(r14)
            tG.n r2 = q(r9)
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto L_0x003a
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0036
            U0.C4895p.R()
        L_0x0036:
            r13.P()
            return
        L_0x003a:
            TJ.P r14 = r8.D()
            r2 = 0
            U0.A1 r14 = U0.p1.b(r14, r2, r13, r1, r0)
            java.lang.Object r14 = r14.getValue()
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0
            vG.u r1 = t(r11)
            r11 = -1677016931(0xffffffff9c0ac09d, float:-4.5909317E-22)
            r13.W(r11)
            java.lang.Object r11 = r13.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r2 = r14.a()
            if (r11 != r2) goto L_0x0068
            tG.e r11 = new tG.e
            r11.<init>(r12)
            r13.u(r11)
        L_0x0068:
            r2 = r11
            nI.l r2 = (nI.C17642l) r2
            r13.P()
            r11 = -1677014072(0xffffffff9c0acbc8, float:-4.592375E-22)
            r13.W(r11)
            boolean r11 = r13.V(r9)
            boolean r12 = r13.F(r8)
            r11 = r11 | r12
            boolean r12 = r13.V(r10)
            r11 = r11 | r12
            java.lang.Object r12 = r13.D()
            if (r11 != 0) goto L_0x008e
            java.lang.Object r11 = r14.a()
            if (r12 != r11) goto L_0x0096
        L_0x008e:
            tG.f r12 = new tG.f
            r12.<init>(r8, r10, r9)
            r13.u(r12)
        L_0x0096:
            r4 = r12
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            r6 = 384(0x180, float:5.38E-43)
            r7 = 8
            r3 = 0
            r5 = r13
            vG.t.r(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00ae
            U0.C4895p.R()
        L_0x00ae:
            r13.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tG.m.n(tG.o, U0.A1, nI.a, U0.r0, U0.r0, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(o oVar, C17631a aVar, A1 a12, C18151b bVar) {
        C17542s.j(bVar, "catalogHeaderEvent");
        if (C17542s.e(bVar, C18151b.C4287b.f148753a)) {
            if (C17542s.e(q(a12), n.c.f147226a)) {
                oVar.F();
            }
            aVar.invoke();
        } else if (C17542s.e(bVar, C18151b.a.f148752a)) {
            oVar.E();
        } else if (C17542s.e(bVar, C18151b.d.f148755a)) {
            oVar.F();
        } else if (C17542s.e(bVar, C18151b.f.f148757a)) {
            oVar.H();
        } else if (C17542s.e(bVar, C18151b.e.f148756a)) {
            oVar.C();
        } else if (bVar instanceof C18151b.c) {
            C18151b.c cVar = (C18151b.c) bVar;
            if (cVar.a().length() > 0) {
                oVar.G(cVar.a());
            }
        } else if (bVar instanceof C18151b.g) {
            oVar.I(((C18151b.g) bVar).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C4899r0 r0Var, boolean z10) {
        w(r0Var, z10);
        return C16807N.f139792a;
    }

    private static final n q(A1<? extends n> a12) {
        return (n) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C4899r0 r0Var, u uVar) {
        C17542s.j(uVar, "mode");
        u(r0Var, uVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C18048l lVar, RoomType roomType, C17642l lVar2, C17642l lVar3, C17631a aVar, C17642l lVar4, d dVar, int i10, int i11, C4889m mVar, int i12) {
        m(lVar, roomType, lVar2, lVar3, aVar, lVar4, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final u t(C4899r0<u> r0Var) {
        return r0Var.getValue();
    }

    private static final void u(C4899r0<u> r0Var, u uVar) {
        r0Var.setValue(uVar);
    }

    private static final boolean v(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void w(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void x(tG.n r22, vG.u r23, uG.C18048l r24, com.sugarcube.core.network.models.RoomType r25, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r26, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r27, boolean r28, tG.o r29, nI.C17631a<XH.C16807N> r30, nI.C17642l<? super vG.u, XH.C16807N> r31, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a.C17123c, XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r22
            r2 = r23
            r5 = r26
            r8 = r29
            r10 = r31
            r12 = r34
            r0 = -1720657496(0xffffffff9970d9a8, float:-1.24516645E-23)
            r3 = r33
            U0.m r3 = r3.k(r0)
            r4 = r12 & 6
            if (r4 != 0) goto L_0x0024
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r12
            goto L_0x0025
        L_0x0024:
            r4 = r12
        L_0x0025:
            r9 = r12 & 48
            if (r9 != 0) goto L_0x0035
            boolean r9 = r3.V(r2)
            if (r9 == 0) goto L_0x0032
            r9 = 32
            goto L_0x0034
        L_0x0032:
            r9 = 16
        L_0x0034:
            r4 = r4 | r9
        L_0x0035:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0048
            r9 = r24
            boolean r13 = r3.V(r9)
            if (r13 == 0) goto L_0x0044
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r4 = r4 | r13
            goto L_0x004a
        L_0x0048:
            r9 = r24
        L_0x004a:
            r13 = r12 & 3072(0xc00, float:4.305E-42)
            r15 = r25
            if (r13 != 0) goto L_0x005c
            boolean r13 = r3.V(r15)
            if (r13 == 0) goto L_0x0059
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x005b
        L_0x0059:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x005b:
            r4 = r4 | r13
        L_0x005c:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x006c
            boolean r13 = r3.F(r5)
            if (r13 == 0) goto L_0x0069
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006b
        L_0x0069:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x006b:
            r4 = r4 | r13
        L_0x006c:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r12
            if (r13 != 0) goto L_0x0081
            r13 = r27
            boolean r16 = r3.F(r13)
            if (r16 == 0) goto L_0x007c
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007e
        L_0x007c:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x007e:
            r4 = r4 | r16
            goto L_0x0083
        L_0x0081:
            r13 = r27
        L_0x0083:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r12 & r16
            r11 = r28
            if (r16 != 0) goto L_0x0098
            boolean r16 = r3.b(r11)
            if (r16 == 0) goto L_0x0094
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0096
        L_0x0094:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x0096:
            r4 = r4 | r16
        L_0x0098:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00ab
            boolean r16 = r3.F(r8)
            if (r16 == 0) goto L_0x00a7
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a9
        L_0x00a7:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a9:
            r4 = r4 | r16
        L_0x00ab:
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r12 & r16
            r14 = r30
            if (r16 != 0) goto L_0x00c0
            boolean r17 = r3.F(r14)
            if (r17 == 0) goto L_0x00bc
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00be
        L_0x00bc:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00be:
            r4 = r4 | r17
        L_0x00c0:
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r3.F(r10)
            if (r17 == 0) goto L_0x00cf
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00d1
        L_0x00cf:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00d1:
            r4 = r4 | r17
        L_0x00d3:
            r17 = r35 & 6
            r6 = r32
            if (r17 != 0) goto L_0x00e9
            boolean r19 = r3.F(r6)
            if (r19 == 0) goto L_0x00e2
            r18 = 4
            goto L_0x00e4
        L_0x00e2:
            r18 = 2
        L_0x00e4:
            r18 = r35 | r18
            r0 = r18
            goto L_0x00eb
        L_0x00e9:
            r0 = r35
        L_0x00eb:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r4 & r19
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r6) goto L_0x0106
            r6 = r0 & 3
            r7 = 2
            if (r6 != r7) goto L_0x0106
            boolean r6 = r3.l()
            if (r6 != 0) goto L_0x0101
            goto L_0x0106
        L_0x0101:
            r3.L()
            goto L_0x0315
        L_0x0106:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0114
            java.lang.String r6 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.Content (CatalogScreen.kt:139)"
            r7 = -1720657496(0xffffffff9970d9a8, float:-1.24516645E-23)
            U0.C4895p.S(r7, r4, r0, r6)
        L_0x0114:
            boolean r6 = r1 instanceof tG.n.a
            if (r6 == 0) goto L_0x01ae
            r6 = 267278042(0xfee56da, float:2.3502066E-29)
            r3.W(r6)
            vG.u r6 = vG.u.BROWSE_EXPANDED
            if (r2 == r6) goto L_0x0129
            vG.u r7 = vG.u.BROWSE_COLLAPSED
            if (r2 == r7) goto L_0x0129
            r10.invoke(r6)
        L_0x0129:
            r6 = -268448675(0xffffffffefffcc5d, float:-1.58331475E29)
            r3.W(r6)
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r7) goto L_0x0139
            r6 = 1
            goto L_0x013a
        L_0x0139:
            r6 = 0
        L_0x013a:
            java.lang.Object r7 = r3.D()
            if (r6 != 0) goto L_0x0148
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0150
        L_0x0148:
            tG.g r7 = new tG.g
            r7.<init>(r5)
            r3.u(r7)
        L_0x0150:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r3.P()
            r7 = -268461752(0xffffffffefff9948, float:-1.5820797E29)
            r3.W(r7)
            r7 = r4 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r7 != r9) goto L_0x0164
            r7 = 1
            goto L_0x0165
        L_0x0164:
            r7 = 0
        L_0x0165:
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r4
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r11) goto L_0x016f
            r19 = 1
            goto L_0x0171
        L_0x016f:
            r19 = 0
        L_0x0171:
            r7 = r7 | r19
            java.lang.Object r9 = r3.D()
            if (r7 != 0) goto L_0x0181
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0189
        L_0x0181:
            tG.h r9 = new tG.h
            r9.<init>(r2, r10)
            r3.u(r9)
        L_0x0189:
            r17 = r9
            nI.l r17 = (nI.C17642l) r17
            r3.P()
            int r4 = r4 >> 6
            r4 = r4 & 7294(0x1c7e, float:1.0221E-41)
            r7 = 458752(0x70000, float:6.42848E-40)
            int r0 = r0 << 15
            r0 = r0 & r7
            r20 = r4 | r0
            r13 = r24
            r14 = r25
            r15 = r6
            r16 = r27
            r18 = r32
            r19 = r3
            uG.C18045i.i(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.P()
            goto L_0x030c
        L_0x01ae:
            boolean r0 = r1 instanceof tG.n.c
            r6 = 0
            if (r0 == 0) goto L_0x0209
            r0 = 268284767(0xffdb35f, float:2.5016817E-29)
            r3.W(r0)
            vG.u r0 = vG.u.SEARCH_EXPANDED
            r10.invoke(r0)
            TJ.P r0 = r29.D()
            r7 = 0
            r9 = 1
            U0.A1 r0 = U0.p1.b(r0, r6, r3, r7, r9)
            java.lang.Object r0 = r0.getValue()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r0 = -268432685(0xfffffffff0000ad3, float:-1.5850867E29)
            r3.W(r0)
            boolean r0 = r3.F(r8)
            java.lang.Object r6 = r3.D()
            if (r0 != 0) goto L_0x01e7
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x01ef
        L_0x01e7:
            tG.i r6 = new tG.i
            r6.<init>(r8)
            r3.u(r6)
        L_0x01ef:
            r16 = r6
            nI.l r16 = (nI.C17642l) r16
            r3.P()
            int r0 = r4 >> 15
            r18 = r0 & 112(0x70, float:1.57E-43)
            r19 = 1
            r13 = 0
            r14 = r28
            r17 = r3
            xG.q.i(r13, r14, r15, r16, r17, r18, r19)
            r3.P()
            goto L_0x030c
        L_0x0209:
            boolean r0 = r1 instanceof tG.n.d
            if (r0 == 0) goto L_0x0295
            r0 = 268680575(0x1003bd7f, float:2.5981177E-29)
            r3.W(r0)
            TJ.P r0 = r29.D()
            r7 = 0
            r9 = 1
            U0.A1 r0 = U0.p1.b(r0, r6, r3, r7, r9)
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            r0 = -268423331(0xfffffffff0002f5d, float:-1.5868536E29)
            r3.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r6 = r4 & r0
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r0) goto L_0x0234
            r7 = r9
        L_0x0234:
            java.lang.Object r0 = r3.D()
            if (r7 != 0) goto L_0x0242
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x024a
        L_0x0242:
            tG.j r0 = new tG.j
            r0.<init>(r5)
            r3.u(r0)
        L_0x024a:
            r14 = r0
            nI.l r14 = (nI.C17642l) r14
            r3.P()
            r0 = -268417751(0xfffffffff0004529, float:-1.5879076E29)
            r3.W(r0)
            boolean r0 = r3.F(r8)
            java.lang.Object r6 = r3.D()
            if (r0 != 0) goto L_0x0268
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x0270
        L_0x0268:
            tG.k r6 = new tG.k
            r6.<init>(r8)
            r3.u(r6)
        L_0x0270:
            r16 = r6
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            int r0 = r4 >> 9
            r0 = r0 & 896(0x380, float:1.256E-42)
            int r4 = r4 >> 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r6
            r20 = r0 | r4
            r21 = 32
            r18 = 0
            r15 = r27
            r17 = r30
            r19 = r3
            xG.C18570C.k(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.P()
            goto L_0x030c
        L_0x0295:
            r7 = 0
            r9 = 1
            boolean r0 = r1 instanceof tG.n.b
            if (r0 == 0) goto L_0x033f
            r0 = 269133764(0x100aa7c4, float:2.7344943E-29)
            r3.W(r0)
            r0 = -268411011(0xfffffffff0005f7d, float:-1.5891808E29)
            r3.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r4
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r6) goto L_0x02b0
            r7 = r9
        L_0x02b0:
            java.lang.Object r0 = r3.D()
            if (r7 != 0) goto L_0x02be
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x02c6
        L_0x02be:
            tG.l r0 = new tG.l
            r0.<init>(r5)
            r3.u(r0)
        L_0x02c6:
            r13 = r0
            nI.l r13 = (nI.C17642l) r13
            r3.P()
            r0 = -268405395(0xfffffffff000756d, float:-1.5902416E29)
            r3.W(r0)
            boolean r0 = r3.F(r8)
            java.lang.Object r6 = r3.D()
            if (r0 != 0) goto L_0x02e4
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x02ec
        L_0x02e4:
            tG.b r6 = new tG.b
            r6.<init>(r8)
            r3.u(r6)
        L_0x02ec:
            r15 = r6
            nI.a r15 = (nI.C17631a) r15
            r3.P()
            int r0 = r4 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r4 = r4 >> 15
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r19 = r0 | r4
            r20 = 16
            r17 = 0
            r14 = r27
            r16 = r30
            r18 = r3
            yG.C18709o.v(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.P()
        L_0x030c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0315
            U0.C4895p.R()
        L_0x0315:
            U0.Y0 r14 = r3.n()
            if (r14 == 0) goto L_0x033e
            tG.c r15 = new tG.c
            r0 = r15
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r34
            r13 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.a(r15)
        L_0x033e:
            return
        L_0x033f:
            r0 = -268473281(0xffffffffefff6c3f, float:-1.5809908E29)
            r3.W(r0)
            r3.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tG.m.x(tG.n, vG.u, uG.l, com.sugarcube.core.network.models.RoomType, nI.l, nI.l, boolean, tG.o, nI.a, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "selectedItem");
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(u uVar, C17642l lVar, int i10) {
        if (i10 == -1) {
            uVar = u.BROWSE_EXPANDED;
        } else if (i10 == 1) {
            uVar = u.BROWSE_COLLAPSED;
        }
        lVar.invoke(uVar);
        return C16807N.f139792a;
    }
}
