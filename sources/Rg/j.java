package RG;

import E1.C4488v;
import OE.n;
import QG.C16219E;
import U0.C4889m;
import U0.C4894o0;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.h;
import c2.r;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.common.R;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mG.C17597b;
import nI.C17642l;
import oF.C14899h;
import uK.C18148c;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aW\u0010\r\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0014\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\"\u0010#¨\u0006-²\u0006\u000e\u0010%\u001a\u00020\u00028\n@\nX\u0002²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010&8\n@\nX\u0002²\u0006\u000e\u0010(\u001a\u00020\u00188\n@\nX\u0002²\u0006\u000e\u0010)\u001a\u00020\u00188\n@\nX\u0002²\u0006\u0010\u0010*\u001a\u0004\u0018\u00010\u00168\n@\nX\u0002²\u0006\u000e\u0010+\u001a\u00020\u00028\n@\nX\u0002²\u0006\u0010\u0010,\u001a\u0004\u0018\u00010&8\n@\nX\u0002"}, d2 = {"LmG/b;", "selectedItem", "", "isFocusModeActive", "duplicateOptionEnabled", "showViewsButton", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "LXH/N;", "onClick", "showEmptyToolbar", "j", "(LmG/b;ZZZLandroidx/compose/ui/d;LnI/l;ZLU0/m;II)V", "", "LQG/E;", "G", "(LmG/b;ZZZ)Ljava/util/List;", "", "H", "(Ljava/util/List;ZLmG/b;Z)V", "LQG/E$e;", "id", "", "labelResId", "iconResId", "event", "contentDescriptionResId", "LQG/E$c;", "E", "(LQG/E$e;IILcom/sugarcube/decorate/v2/internal/ui/surface/a;I)LQG/E$c;", "Lc2/h;", "a", "F", "()F", "ACTION_PANEL_WIDTH", "expandedState", "LE1/v;", "addItemButtonCoordinates", "capacity", "emptyCount", "clickedButtonId", "isPopupVisible", "moreButtonCoordinates", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final float f137957a = h.B((float) 68);

    /* access modifiers changed from: private */
    public static final C16807N A(C17597b bVar, boolean z10, boolean z11, boolean z12, d dVar, C17642l lVar, boolean z13, int i10, int i11, C4889m mVar, int i12) {
        j(bVar, z10, z11, z12, dVar, lVar, z13, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C4899r0 r0Var, C4488v vVar) {
        C17542s.j(vVar, "coordinates");
        D(r0Var, vVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17597b bVar, boolean z10, boolean z11, boolean z12, d dVar, C17642l lVar, boolean z13, int i10, int i11, C4889m mVar, int i12) {
        j(bVar, z10, z11, z12, dVar, lVar, z13, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void D(C4899r0<C4488v> r0Var, C4488v vVar) {
        r0Var.setValue(vVar);
    }

    private static final C16219E.c E(C16219E.e eVar, int i10, int i11, a aVar, int i12) {
        return new C16219E.c(eVar, i11, i10, Integer.valueOf(i12), false, false, false, aVar, (C14899h) null, 368, (DefaultConstructorMarker) null);
    }

    public static final float F() {
        return f137957a;
    }

    private static final List<C16219E> G(C17597b bVar, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(E(C16219E.e.MOVE_BACK, n.f113209H, R.drawable.sc_move_back, a.L.f142592a, n.f113209H));
        }
        if (bVar != null) {
            H(arrayList, z10, bVar, z11);
        } else if (z12) {
            arrayList.add(E(C16219E.e.DOLLHOUSE_VIEW, n.f113393k, C18148c.Cube3d.m(), a.C17137q.f142633a, n.f113393k));
            arrayList.add(E(C16219E.e.TOP_VIEW, n.f113345d0, R.drawable.sc_room_layout, a.b0.f142610a, n.f113345d0));
            arrayList.add(E(C16219E.e.SIDE_VIEWS, n.f113305X, C18148c.Store.m(), a.V.f142602a, n.f113305X));
        }
        return arrayList;
    }

    private static final void H(List<C16219E> list, boolean z10, C17597b bVar, boolean z11) {
        if (!z10) {
            list.add(E(C16219E.e.MOVE, n.f113215I, R.drawable.sc_move_to, a.K.f142591a, n.f113215I));
        }
        if (bVar.c()) {
            list.add(E(C16219E.e.ROTATE, n.f113257P, C18148c.Rotate.m(), a.O.f142595a, n.f113257P));
        }
        if (z11) {
            list.add(E(C16219E.e.DUPLICATE, n.f113414n, C18148c.Copy.m(), a.C17138r.f142634a, n.f113414n));
        }
        list.add(E(C16219E.e.DELETE, n.f113251O, C18148c.TrashCan.m(), a.C17134n.f142630a, n.f113365g));
        CachedCatalogItem d10 = bVar.e().d();
        if (d10.isMirroringCapable()) {
            list.add(E(C16219E.e.MIRROR, n.f113203G, R.drawable.sc_mirror, a.J.f142590a, n.f113203G));
        }
        if (d10.getCanSnapRotate()) {
            list.add(E(C16219E.e.FLIP, n.f113463u, R.drawable.sc_flip_icon, a.C.f142583a, n.f113463u));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(mG.C17597b r40, boolean r41, boolean r42, boolean r43, androidx.compose.ui.d r44, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r45, boolean r46, U0.C4889m r47, int r48, int r49) {
        /*
            r1 = r40
            r2 = r41
            r6 = r45
            r7 = r46
            r8 = r48
            r0 = 64
            r3 = 16
            r4 = 32
            r5 = 48
            r9 = 6
            java.lang.String r10 = "onClick"
            kotlin.jvm.internal.C17542s.j(r6, r10)
            r10 = -432896254(0xffffffffe6328702, float:-2.1076792E23)
            r11 = r47
            U0.m r15 = r11.k(r10)
            int r11 = r15.a()
            r14 = 1
            r12 = r49 & 1
            r23 = 4
            r13 = 2
            if (r12 == 0) goto L_0x0030
            r12 = r8 | 6
            goto L_0x0041
        L_0x0030:
            r12 = r8 & 6
            if (r12 != 0) goto L_0x0040
            boolean r12 = r15.V(r1)
            if (r12 == 0) goto L_0x003d
            r12 = r23
            goto L_0x003e
        L_0x003d:
            r12 = r13
        L_0x003e:
            r12 = r12 | r8
            goto L_0x0041
        L_0x0040:
            r12 = r8
        L_0x0041:
            r16 = r49 & 2
            if (r16 == 0) goto L_0x0047
            r12 = r12 | r5
            goto L_0x0058
        L_0x0047:
            r16 = r8 & 48
            if (r16 != 0) goto L_0x0058
            boolean r16 = r15.b(r2)
            if (r16 == 0) goto L_0x0054
            r16 = r4
            goto L_0x0056
        L_0x0054:
            r16 = r3
        L_0x0056:
            r12 = r12 | r16
        L_0x0058:
            r16 = r49 & 4
            if (r16 == 0) goto L_0x0061
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x005e:
            r9 = r42
            goto L_0x0074
        L_0x0061:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x005e
            r9 = r42
            boolean r16 = r15.b(r9)
            if (r16 == 0) goto L_0x0070
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r12 = r12 | r16
        L_0x0074:
            r16 = r49 & 8
            if (r16 == 0) goto L_0x007d
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x007a:
            r5 = r43
            goto L_0x0090
        L_0x007d:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x007a
            r5 = r43
            boolean r17 = r15.b(r5)
            if (r17 == 0) goto L_0x008c
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r12 = r12 | r17
        L_0x0090:
            r3 = r49 & 16
            if (r3 == 0) goto L_0x0099
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0096:
            r14 = r44
            goto L_0x00ac
        L_0x0099:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0096
            r14 = r44
            boolean r17 = r15.V(r14)
            if (r17 == 0) goto L_0x00a8
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r12 = r12 | r17
        L_0x00ac:
            r4 = r49 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00b5
            r12 = r12 | r17
            goto L_0x00c5
        L_0x00b5:
            r4 = r8 & r17
            if (r4 != 0) goto L_0x00c5
            boolean r4 = r15.F(r6)
            if (r4 == 0) goto L_0x00c2
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r12 = r12 | r4
        L_0x00c5:
            r4 = r49 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r4 == 0) goto L_0x00ce
            r12 = r12 | r17
            goto L_0x00de
        L_0x00ce:
            r4 = r8 & r17
            if (r4 != 0) goto L_0x00de
            boolean r4 = r15.b(r7)
            if (r4 == 0) goto L_0x00db
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r12 = r12 | r4
        L_0x00de:
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r12
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r0) goto L_0x00f6
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x00ee
            goto L_0x00f6
        L_0x00ee:
            r15.L()
            r5 = r44
            r7 = r15
            goto L_0x0619
        L_0x00f6:
            if (r3 == 0) goto L_0x00fc
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r4 = r0
            goto L_0x00fe
        L_0x00fc:
            r4 = r44
        L_0x00fe:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x010a
            r0 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.toolbars.actionpanel.ActionPanel (ActionPanel.kt:73)"
            U0.C4895p.S(r10, r12, r0, r3)
        L_0x010a:
            r0 = -749214844(0xffffffffd357e384, float:-9.2723505E11)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r10 = r3.a()
            r14 = 0
            if (r0 != r10) goto L_0x0126
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            U0.r0 r0 = U0.u1.e(r0, r14, r13, r14)
            r15.u(r0)
        L_0x0126:
            U0.r0 r0 = (U0.C4899r0) r0
            r15.P()
            r10 = -749211753(0xffffffffd357ef97, float:-9.2743762E11)
            r15.W(r10)
            java.lang.Object r10 = r15.D()
            java.lang.Object r5 = r3.a()
            if (r10 != r5) goto L_0x0142
            U0.r0 r10 = U0.u1.e(r14, r14, r13, r14)
            r15.u(r10)
        L_0x0142:
            U0.r0 r10 = (U0.C4899r0) r10
            r15.P()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = 0
            r8 = 1
            androidx.compose.ui.d r26 = androidx.compose.foundation.layout.J.d(r5, r13, r8, r14)
            r13 = 0
            rF.b r19 = rF.C15002a.a(r15, r13)
            long r27 = r19.d()
            r30 = 2
            r31 = 0
            r29 = 0
            androidx.compose.ui.d r32 = androidx.compose.foundation.b.d(r26, r27, r29, r30, r31)
            r8 = 12
            float r14 = (float) r8
            float r34 = c2.h.B(r14)
            float r36 = c2.h.B(r14)
            r37 = 5
            r38 = 0
            r33 = 0
            r35 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.m(r32, r33, r34, r35, r36, r37, r38)
            float r8 = f137957a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.y(r14, r8)
            androidx.compose.ui.d r8 = r4.s(r8)
            androidx.compose.foundation.layout.d r26 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r14 = r26.g()
            i1.c$a r27 = i1.C5437c.f24302a
            i1.c$b r13 = r27.g()
            r21 = r4
            r4 = 54
            E1.I r13 = androidx.compose.foundation.layout.C5080k.a(r14, r13, r15, r4)
            r14 = 0
            int r22 = U0.C4883j.a(r15, r14)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r8)
            G1.g$a r28 = G1.C4504g.f6515W
            nI.a r4 = r28.a()
            U0.f r30 = r15.m()
            if (r30 != 0) goto L_0x01b3
            U0.C4883j.c()
        L_0x01b3:
            r15.I()
            boolean r30 = r15.i()
            if (r30 == 0) goto L_0x01c0
            r15.p(r4)
            goto L_0x01c3
        L_0x01c0:
            r15.t()
        L_0x01c3:
            U0.m r4 = U0.F1.a(r15)
            nI.p r9 = r28.c()
            U0.F1.c(r4, r13, r9)
            nI.p r9 = r28.e()
            U0.F1.c(r4, r14, r9)
            nI.p r9 = r28.b()
            boolean r13 = r4.i()
            if (r13 != 0) goto L_0x01ed
            java.lang.Object r13 = r4.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r22)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r14)
            if (r13 != 0) goto L_0x01fb
        L_0x01ed:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r22)
            r4.u(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r22)
            r4.w(r13, r9)
        L_0x01fb:
            nI.p r9 = r28.d()
            U0.F1.c(r4, r8, r9)
            s0.h r4 = s0.C5862h.f28810a
            r4 = -530432861(0xffffffffe0623ca3, float:-6.5208336E19)
            r15.W(r4)
            if (r7 == 0) goto L_0x023b
            r15.q(r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0218
            U0.C4895p.R()
        L_0x0218:
            U0.Y0 r10 = r15.n()
            if (r10 == 0) goto L_0x023a
            RG.a r11 = new RG.a
            r0 = r11
            r1 = r40
            r2 = r41
            r3 = r42
            r8 = r21
            r4 = r43
            r5 = r8
            r6 = r45
            r7 = r46
            r8 = r48
            r9 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x023a:
            return
        L_0x023b:
            r8 = r21
            r4 = 48
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r5, r4)
            r9 = 1645458718(0x6213b51e, float:6.8118056E20)
            r15.W(r9)
            java.lang.Object r9 = r15.D()
            java.lang.Object r11 = r3.a()
            if (r9 != r11) goto L_0x0260
            RG.b r9 = new RG.b
            r9.<init>(r10)
            r15.u(r9)
        L_0x0260:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            androidx.compose.ui.d r13 = androidx.compose.ui.layout.c.a(r4, r9)
            uK.c r4 = uK.C18148c.Plus
            int r11 = r4.m()
            int r4 = OE.n.f113330b
            r14 = 0
            java.lang.String r4 = J1.j.b(r4, r15, r14)
            wK.m3$c r9 = wK.C18405m3.c.f151239b
            r10 = 1645468520(0x6213db68, float:6.818703E20)
            r15.W(r10)
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r12
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r12) goto L_0x0288
            r16 = 1
            goto L_0x028a
        L_0x0288:
            r16 = r14
        L_0x028a:
            java.lang.Object r12 = r15.D()
            if (r16 != 0) goto L_0x0296
            java.lang.Object r14 = r3.a()
            if (r12 != r14) goto L_0x029e
        L_0x0296:
            RG.c r12 = new RG.c
            r12.<init>(r6)
            r15.u(r12)
        L_0x029e:
            r21 = r12
            nI.a r21 = (nI.C17631a) r21
            r15.P()
            int r12 = wK.C18405m3.c.f151240c
            r14 = 12
            int r12 = r12 << r14
            r14 = r12 | 384(0x180, float:5.38E-43)
            r22 = 232(0xe8, float:3.25E-43)
            r16 = 0
            r19 = 0
            r30 = 0
            r31 = 0
            r17 = 131072(0x20000, float:1.83671E-40)
            r12 = r4
            r4 = 0
            r32 = r14
            r14 = r16
            r44 = r15
            r15 = r9
            r16 = r19
            r17 = r30
            r18 = r31
            r19 = r21
            r20 = r44
            r21 = r32
            wK.C18357i3.c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = 1645470946(0x6213e4e2, float:6.82041E20)
            r15 = r44
            r15.W(r9)
            java.lang.Object r9 = r15.D()
            java.lang.Object r11 = r3.a()
            if (r9 != r11) goto L_0x02e9
            U0.o0 r9 = U0.C4877g1.a(r23)
            r15.u(r9)
        L_0x02e9:
            U0.o0 r9 = (U0.C4894o0) r9
            r15.P()
            r11 = 64
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            r12 = 6
            float r11 = JF.C13113u.f(r11, r15, r12)
            r12 = 1645474210(0x6213f1a2, float:6.822707E20)
            r15.W(r12)
            java.lang.Object r12 = r15.D()
            java.lang.Object r13 = r3.a()
            r14 = 3
            if (r12 != r13) goto L_0x0312
            U0.o0 r12 = U0.C4877g1.a(r14)
            r15.u(r12)
        L_0x0312:
            r13 = r12
            U0.o0 r13 = (U0.C4894o0) r13
            r15.P()
            r12 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.c(r5, r12)
            rF.b r5 = rF.C15002a.a(r15, r4)
            long r17 = r5.d()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r12 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.G(r5, r12, r4, r14, r12)
            r14 = 1645482665(0x621412a9, float:6.828657E20)
            r15.W(r14)
            boolean r14 = r15.c(r11)
            java.lang.Object r12 = r15.D()
            if (r14 != 0) goto L_0x034b
            java.lang.Object r14 = r3.a()
            if (r12 != r14) goto L_0x0353
        L_0x034b:
            RG.d r12 = new RG.d
            r12.<init>(r11, r9)
            r15.u(r12)
        L_0x0353:
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            androidx.compose.ui.d r5 = androidx.compose.ui.layout.c.a(r5, r12)
            androidx.compose.foundation.layout.d$f r11 = r26.e()
            i1.c$b r12 = r27.g()
            r14 = 54
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r12, r15, r14)
            int r12 = U0.C4883j.a(r15, r4)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            nI.a r4 = r28.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0383
            U0.C4883j.c()
        L_0x0383:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0390
            r15.p(r4)
            goto L_0x0393
        L_0x0390:
            r15.t()
        L_0x0393:
            U0.m r4 = U0.F1.a(r15)
            nI.p r7 = r28.c()
            U0.F1.c(r4, r11, r7)
            nI.p r7 = r28.e()
            U0.F1.c(r4, r14, r7)
            nI.p r7 = r28.b()
            boolean r11 = r4.i()
            if (r11 != 0) goto L_0x03bd
            java.lang.Object r11 = r4.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x03cb
        L_0x03bd:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4.w(r11, r7)
        L_0x03cb:
            nI.p r7 = r28.d()
            U0.F1.c(r4, r5, r7)
            r4 = -1851906760(0xffffffff919e2538, float:-2.4950942E-28)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            java.lang.Object r5 = r3.a()
            if (r4 != r5) goto L_0x03ec
            r5 = 2
            r7 = 0
            U0.r0 r4 = U0.u1.e(r7, r7, r5, r7)
            r15.u(r4)
            goto L_0x03ed
        L_0x03ec:
            r5 = 2
        L_0x03ed:
            U0.r0 r4 = (U0.C4899r0) r4
            r15.P()
            r7 = -1851903830(0xffffffff919e30aa, float:-2.4957996E-28)
            r15.W(r7)
            java.lang.Object r7 = r15.D()
            java.lang.Object r11 = r3.a()
            if (r7 != r11) goto L_0x0413
            boolean r7 = k(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r11 = 0
            U0.r0 r7 = U0.u1.e(r7, r11, r5, r11)
            r15.u(r7)
            goto L_0x0414
        L_0x0413:
            r11 = 0
        L_0x0414:
            U0.r0 r7 = (U0.C4899r0) r7
            r15.P()
            r12 = -1851901131(0xffffffff919e3b35, float:-2.4964494E-28)
            r15.W(r12)
            java.lang.Object r12 = r15.D()
            java.lang.Object r14 = r3.a()
            if (r12 != r14) goto L_0x0430
            U0.r0 r12 = U0.u1.e(r11, r11, r5, r11)
            r15.u(r12)
        L_0x0430:
            r5 = r12
            U0.r0 r5 = (U0.C4899r0) r5
            r15.P()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = -1851896120(0xffffffff919e4ec8, float:-2.4976557E-28)
            r15.W(r12)
            boolean r12 = k(r0)
            if (r12 == 0) goto L_0x049b
            E1.v r12 = u(r5)
            if (r12 != 0) goto L_0x044e
            goto L_0x049b
        L_0x044e:
            r14 = 0
            rF.b r16 = rF.C15002a.a(r15, r14)
            long r21 = r16.d()
            r27 = 14
            r28 = 0
            r23 = 1058642330(0x3f19999a, float:0.6)
            r24 = 0
            r25 = 0
            r26 = 0
            long r16 = p1.C5747v0.o(r21, r23, r24, r25, r26, r27, r28)
            r14 = -863199937(0xffffffffcc8c9d3f, float:-7.372236E7)
            r15.W(r14)
            java.lang.Object r14 = r15.D()
            java.lang.Object r3 = r3.a()
            if (r14 != r3) goto L_0x0480
            RG.e r14 = new RG.e
            r14.<init>(r7, r0)
            r15.u(r14)
        L_0x0480:
            r3 = r14
            nI.a r3 = (nI.C17631a) r3
            r15.P()
            r7 = 3072(0xc00, float:4.305E-42)
            r18 = 0
            r44 = r13
            r13 = r16
            r47 = r15
            r15 = r3
            r16 = r47
            r17 = r7
            QG.C16222c.b(r11, r12, r13, r15, r16, r17, r18)
            XH.N r3 = XH.C16807N.f139792a
            goto L_0x049f
        L_0x049b:
            r44 = r13
            r47 = r15
        L_0x049f:
            r47.P()
            java.util.List r3 = G(r40, r41, r42, r43)
            r7 = r3
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            int r11 = n(r9)
            java.util.List r7 = YH.C16877v.k1(r7, r11)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = YH.C16877v.w1(r7)
            int r11 = r3.size()
            int r9 = n(r9)
            int r11 = r11 - r9
            r9 = 0
            int r11 = java.lang.Math.max(r11, r9)
            java.util.List r3 = YH.C16877v.l1(r3, r11)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = YH.C16877v.w1(r3)
            int r11 = r3.size()
            r15 = 1
            if (r11 != r15) goto L_0x04e0
            java.lang.Object r11 = YH.C16877v.w0(r3)
            r7.add(r11)
            r3.clear()
        L_0x04e0:
            if (r2 == 0) goto L_0x0511
            if (r1 != 0) goto L_0x0511
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = YH.C16877v.k1(r7, r15)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = YH.C16877v.w1(r7)
            int r11 = p(r44)
            r13 = r9
        L_0x04f5:
            if (r13 >= r11) goto L_0x0511
            QG.E$a r12 = new QG.E$a
            com.sugarcube.decorate.v2.internal.ui.surface.a$p r20 = com.sugarcube.decorate.v2.internal.ui.surface.a.C17136p.f142632a
            r22 = 23
            r23 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7.add(r12)
            int r13 = r13 + r15
            goto L_0x04f5
        L_0x0511:
            if (r2 == 0) goto L_0x0528
            if (r1 == 0) goto L_0x0528
            int r11 = r7.size()
            int r11 = r11 - r15
            r12 = r3
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r15
            int r11 = r11 + r12
            r12 = r44
            q(r12, r11)
        L_0x0528:
            r11 = -1851842939(0xffffffff919f1e85, float:-2.5104586E-28)
            r14 = r47
            r14.W(r11)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r13 = new java.util.ArrayList
            r11 = 10
            int r11 = YH.C16877v.y(r7, r11)
            r13.<init>(r11)
            java.util.Iterator r7 = r7.iterator()
        L_0x0541:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r7.next()
            r12 = r11
            QG.E r12 = (QG.C16219E) r12
            r11 = -863154515(0xffffffffcc8d4ead, float:-7.4085736E7)
            r14.W(r11)
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r11) goto L_0x055b
            r16 = r15
            goto L_0x055d
        L_0x055b:
            r16 = r9
        L_0x055d:
            java.lang.Object r9 = r14.D()
            if (r16 != 0) goto L_0x056b
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r11 = r16.a()
            if (r9 != r11) goto L_0x0573
        L_0x056b:
            RG.f r9 = new RG.f
            r9.<init>(r6, r4, r0)
            r14.u(r9)
        L_0x0573:
            nI.l r9 = (nI.C17642l) r9
            r14.P()
            r17 = 0
            r18 = 13
            r11 = 0
            r16 = 0
            r19 = 0
            r21 = 131072(0x20000, float:1.83671E-40)
            r39 = r13
            r13 = r16
            r44 = r14
            r14 = r19
            r19 = r15
            r15 = r9
            r16 = r44
            QG.C16239t.E(r11, r12, r13, r14, r15, r16, r17, r18)
            XH.N r9 = XH.C16807N.f139792a
            r11 = r39
            r11.add(r9)
            r14 = r44
            r13 = r11
            r15 = r19
            r9 = 0
            goto L_0x0541
        L_0x05a1:
            r44 = r14
            r44.P()
            r4 = -1851831045(0xffffffff919f4cfb, float:-2.513322E-28)
            r7 = r44
            r7.W(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0603
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r4 = -1851826742(0xffffffff919f5dca, float:-2.5143579E-28)
            r7.W(r4)
            java.lang.Object r4 = r7.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r10 = r9.a()
            if (r4 != r10) goto L_0x05d2
            RG.g r4 = new RG.g
            r4.<init>(r5)
            r7.u(r4)
        L_0x05d2:
            nI.l r4 = (nI.C17642l) r4
            r7.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.layout.c.a(r3, r4)
            java.lang.String r4 = "DECORATE_TOOLBAR_MORE_BUTTON_TEST_TAG"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            r4 = -1851820104(0xffffffff919f77b8, float:-2.515956E-28)
            r7.W(r4)
            java.lang.Object r4 = r7.D()
            java.lang.Object r5 = r9.a()
            if (r4 != r5) goto L_0x05f9
            RG.h r4 = new RG.h
            r4.<init>(r0)
            r7.u(r4)
        L_0x05f9:
            nI.a r4 = (nI.C17631a) r4
            r7.P()
            r0 = 54
            QG.C16216B.m(r3, r4, r7, r0)
        L_0x0603:
            r7.P()
            r7.x()
            r7.P()
            r7.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0618
            U0.C4895p.R()
        L_0x0618:
            r5 = r8
        L_0x0619:
            U0.Y0 r10 = r7.n()
            if (r10 == 0) goto L_0x0638
            RG.i r11 = new RG.i
            r0 = r11
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r6 = r45
            r7 = r46
            r8 = r48
            r9 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0638:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RG.j.j(mG.b, boolean, boolean, boolean, androidx.compose.ui.d, nI.l, boolean, U0.m, int, int):void");
    }

    private static final boolean k(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void l(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar) {
        lVar.invoke(a.C17124d.f142615a);
        return C16807N.f139792a;
    }

    private static final int n(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void o(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final int p(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void q(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N r(float f10, C4894o0 o0Var, C4488v vVar) {
        C17542s.j(vVar, "layoutCoordinates");
        o(o0Var, (int) (((float) r.g(vVar.a())) / f10));
        return C16807N.f139792a;
    }

    private static final void s(C4899r0<C16219E.e> r0Var, C16219E.e eVar) {
        r0Var.setValue(eVar);
    }

    private static final void t(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final C4488v u(C4899r0<C4488v> r0Var) {
        return r0Var.getValue();
    }

    private static final void v(C4899r0<C4488v> r0Var, C4488v vVar) {
        r0Var.setValue(vVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C4899r0 r0Var, C4899r0 r0Var2) {
        t(r0Var, false);
        l(r0Var2, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C17642l lVar, C4899r0 r0Var, C4899r0 r0Var2, C16219E e10) {
        C17542s.j(e10, "button");
        C16219E.e c10 = e10.c();
        if (!e10.d()) {
            c10 = null;
        }
        s(r0Var, c10);
        l(r0Var2, false);
        lVar.invoke(e10.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C4899r0 r0Var, C4488v vVar) {
        C17542s.j(vVar, "coordinates");
        v(r0Var, vVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C4899r0 r0Var) {
        l(r0Var, true);
        return C16807N.f139792a;
    }
}
