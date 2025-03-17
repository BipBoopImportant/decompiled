package WG;

import U0.C4889m;
import U0.M0;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sugarcube.decorate.v2.internal.RotateControlView;
import eG.C17177b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import p1.C5751x0;
import w2.C6214h;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "rotationDegrees", "Lcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;", "rotateListener", "Lkotlin/Function0;", "LXH/N;", "onDone", "LWG/h;", "style", "d", "(FLcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;LnI/a;LWG/h;LU0/m;II)V", "Lcom/sugarcube/decorate/v2/internal/RotateControlView;", "h", "(Lcom/sugarcube/decorate/v2/internal/RotateControlView;LWG/h;)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: com.sugarcube.decorate.v2.internal.RotateControlView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(float r40, com.sugarcube.decorate.v2.internal.RotateControlView.OnItemRotateListener r41, nI.C17631a<XH.C16807N> r42, WG.h r43, U0.C4889m r44, int r45, int r46) {
        /*
            r1 = r40
            r2 = r41
            r10 = r42
            r11 = r45
            r0 = 12
            r12 = 8
            r3 = 2
            r4 = 48
            r13 = 6
            java.lang.String r5 = "rotateListener"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            java.lang.String r5 = "onDone"
            kotlin.jvm.internal.C17542s.j(r10, r5)
            r5 = -2035737773(0xffffffff86a91b53, float:-6.3610884E-35)
            r6 = r44
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r46 & 1
            r9 = 4
            if (r6 == 0) goto L_0x002c
            r6 = r11 | 6
            goto L_0x003c
        L_0x002c:
            r6 = r11 & 6
            if (r6 != 0) goto L_0x003b
            boolean r6 = r15.c(r1)
            if (r6 == 0) goto L_0x0038
            r6 = r9
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r6 = r6 | r11
            goto L_0x003c
        L_0x003b:
            r6 = r11
        L_0x003c:
            r3 = r46 & 2
            if (r3 == 0) goto L_0x0042
            r6 = r6 | r4
            goto L_0x005b
        L_0x0042:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x005b
            r3 = r11 & 64
            if (r3 != 0) goto L_0x004f
            boolean r3 = r15.V(r2)
            goto L_0x0053
        L_0x004f:
            boolean r3 = r15.F(r2)
        L_0x0053:
            if (r3 == 0) goto L_0x0058
            r3 = 32
            goto L_0x005a
        L_0x0058:
            r3 = 16
        L_0x005a:
            r6 = r6 | r3
        L_0x005b:
            r3 = r46 & 4
            if (r3 == 0) goto L_0x0062
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x0062:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0072
            boolean r3 = r15.F(r10)
            if (r3 == 0) goto L_0x006f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r6 = r6 | r3
        L_0x0072:
            r3 = r46 & 8
            if (r3 == 0) goto L_0x007c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0078:
            r7 = r43
        L_0x007a:
            r8 = r6
            goto L_0x008f
        L_0x007c:
            r7 = r11 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0078
            r7 = r43
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x008b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r6 = r6 | r8
            goto L_0x007a
        L_0x008f:
            r6 = r8 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x00a3
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x009c
            goto L_0x00a3
        L_0x009c:
            r15.L()
            r4 = r7
            r5 = r15
            goto L_0x02c4
        L_0x00a3:
            r9 = 0
            if (r3 == 0) goto L_0x00a9
            r26 = r9
            goto L_0x00ab
        L_0x00a9:
            r26 = r7
        L_0x00ab:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b7
            r3 = -1
            java.lang.String r6 = "com.sugarcube.decorate.v2.internal.ui.toolbars.rotate.RotateToolbar (RotateToolbar.kt:66)"
            U0.C4895p.S(r5, r8, r3, r6)
        L_0x00b7:
            r3 = 762478573(0x2d727fed, float:1.3784513E-11)
            r15.W(r3)
            if (r26 != 0) goto L_0x00c7
            WG.h$a r3 = WG.h.f139485h
            WG.h r3 = r3.a(r15, r13)
            r7 = r3
            goto L_0x00c9
        L_0x00c7:
            r7 = r26
        L_0x00c9:
            r15.P()
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            long r17 = r7.a()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r6
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r5 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.d(r3, r5, r14, r9)
            float r13 = (float) r0
            float r0 = c2.h.B(r13)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r3, r5, r0, r14, r9)
            float r3 = RG.j.F()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r3)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.g()
            androidx.compose.foundation.layout.d r17 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r17.g()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r5, r3, r15, r4)
            r5 = 0
            int r17 = U0.C4883j.a(r15, r5)
            U0.y r5 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r9 = r19.a()
            U0.f r21 = r15.m()
            if (r21 != 0) goto L_0x0120
            U0.C4883j.c()
        L_0x0120:
            r15.I()
            boolean r21 = r15.i()
            if (r21 == 0) goto L_0x012d
            r15.p(r9)
            goto L_0x0130
        L_0x012d:
            r15.t()
        L_0x0130:
            U0.m r9 = U0.F1.a(r15)
            nI.p r14 = r19.c()
            U0.F1.c(r9, r3, r14)
            nI.p r3 = r19.e()
            U0.F1.c(r9, r5, r3)
            nI.p r3 = r19.b()
            boolean r5 = r9.i()
            if (r5 != 0) goto L_0x015a
            java.lang.Object r5 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
            if (r5 != 0) goto L_0x0168
        L_0x015a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r9.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r9.w(r5, r3)
        L_0x0168:
            nI.p r3 = r19.d()
            U0.F1.c(r9, r0, r3)
            s0.h r0 = s0.C5862h.f28810a
            float r0 = (float) r4
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.t(r6, r0)
            r0 = 7
            r9 = 0
            r4 = 0
            r5 = 0
            r14 = 0
            r28 = r6
            r6 = r14
            r14 = r7
            r7 = r42
            r29 = r8
            r8 = r0
            r0 = 0
            androidx.compose.ui.d r30 = androidx.compose.foundation.d.d(r3, r4, r5, r6, r7, r8, r9)
            float r3 = (float) r12
            float r31 = c2.h.B(r3)
            r4 = 50
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            A0.f r32 = A0.g.e(r4)
            r38 = 28
            r39 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            androidx.compose.ui.d r4 = m1.m.b(r30, r31, r32, r33, r34, r36, r38, r39)
            O0.q r5 = O0.C4748q.f11441a
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r15, r7)
            long r6 = r6.R()
            r8 = 0
            rF.b r9 = rF.C15002a.a(r15, r8)
            long r17 = r9.f()
            p1.v0$a r9 = p1.C5747v0.f27350b
            long r22 = r9.j()
            long r19 = r9.j()
            int r9 = O0.C4748q.f11442b
            r12 = 12
            int r12 = r9 << 12
            r12 = r12 | 3456(0xd80, float:4.843E-42)
            r25 = 0
            r0 = r14
            r8 = 1
            r14 = r5
            r43 = r15
            r15 = r6
            r21 = r22
            r23 = r43
            r24 = r12
            O0.p r6 = r14.b(r15, r17, r19, r21, r23, r24, r25)
            float r15 = c2.h.B(r13)
            int r7 = r9 << 18
            r9 = 6
            r22 = r7 | 6
            r23 = 62
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = r43
            O0.r r17 = r14.c(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            WG.a r5 = WG.C16724a.f139472a
            nI.q r19 = r5.a()
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 18
            r15 = 0
            r18 = 0
            r14 = r4
            r16 = r6
            r20 = r43
            O0.C4751s.a(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            float r3 = c2.h.B(r3)
            r4 = r28
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r4, r3)
            r5 = r43
            r6 = 6
            s0.C5844O.a(r3, r5, r6)
            U0.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r5.Q(r3)
            android.content.Context r3 = (android.content.Context) r3
            r6 = 1136711401(0x43c0d6e9, float:385.679)
            r5.W(r6)
            java.lang.Object r6 = r5.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r9 = r7.a()
            if (r6 != r9) goto L_0x0253
            com.sugarcube.decorate.v2.internal.RotateControlView r6 = new com.sugarcube.decorate.v2.internal.RotateControlView
            r6.<init>(r3)
            h(r6, r0)
            r6.setDegrees(r1)
            r6.setListener(r2)
            r5.u(r6)
        L_0x0253:
            com.sugarcube.decorate.v2.internal.RotateControlView r6 = (com.sugarcube.decorate.v2.internal.RotateControlView) r6
            r5.P()
            r0 = 0
            r3 = 0
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.d(r4, r3, r8, r0)
            r0 = 1136720909(0x43c0fc0d, float:385.96915)
            r5.W(r0)
            boolean r0 = r5.F(r6)
            java.lang.Object r3 = r5.D()
            if (r0 != 0) goto L_0x0274
            java.lang.Object r0 = r7.a()
            if (r3 != r0) goto L_0x027c
        L_0x0274:
            WG.d r3 = new WG.d
            r3.<init>(r6)
            r5.u(r3)
        L_0x027c:
            r14 = r3
            nI.l r14 = (nI.C17642l) r14
            r5.P()
            r0 = 1136722368(0x43c101c0, float:386.01367)
            r5.W(r0)
            r0 = r29 & 14
            r3 = 4
            if (r0 != r3) goto L_0x0290
            r27 = r8
            goto L_0x0292
        L_0x0290:
            r27 = 0
        L_0x0292:
            java.lang.Object r0 = r5.D()
            if (r27 != 0) goto L_0x029e
            java.lang.Object r3 = r7.a()
            if (r0 != r3) goto L_0x02a6
        L_0x029e:
            WG.e r0 = new WG.e
            r0.<init>(r1)
            r5.u(r0)
        L_0x02a6:
            r16 = r0
            nI.l r16 = (nI.C17642l) r16
            r5.P()
            r18 = 48
            r19 = 0
            r17 = r5
            androidx.compose.ui.viewinterop.e.a(r14, r15, r16, r17, r18, r19)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02c2
            U0.C4895p.R()
        L_0x02c2:
            r4 = r26
        L_0x02c4:
            U0.Y0 r7 = r5.n()
            if (r7 == 0) goto L_0x02dd
            WG.f r8 = new WG.f
            r0 = r8
            r1 = r40
            r2 = r41
            r3 = r42
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WG.g.d(float, com.sugarcube.decorate.v2.internal.RotateControlView$OnItemRotateListener, nI.a, WG.h, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final RotateControlView e(RotateControlView rotateControlView, Context context) {
        C17542s.j(context, "it");
        return rotateControlView;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(float f10, RotateControlView rotateControlView) {
        C17542s.j(rotateControlView, "view");
        rotateControlView.setDegrees(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(float f10, RotateControlView.OnItemRotateListener onItemRotateListener, C17631a aVar, h hVar, int i10, int i11, C4889m mVar, int i12) {
        d(f10, onItemRotateListener, aVar, hVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void h(RotateControlView rotateControlView, h hVar) {
        Resources resources = rotateControlView.getResources();
        ((ConstraintLayout) rotateControlView.findViewById(C17177b.f142984b)).setBackgroundColor(C5751x0.k(hVar.a()));
        for (Map.Entry entry : X.m(C16796C.a(Integer.valueOf(C17177b.f142997o), Integer.valueOf(hVar.e())), C16796C.a(Integer.valueOf(C17177b.f142998p), Integer.valueOf(hVar.b())), C16796C.a(Integer.valueOf(C17177b.f142983a), Integer.valueOf(hVar.b())), C16796C.a(Integer.valueOf(C17177b.f142995m), Integer.valueOf(hVar.f())), C16796C.a(Integer.valueOf(C17177b.f142985c), Integer.valueOf(hVar.c()))).entrySet()) {
            ((ImageView) rotateControlView.findViewById(((Number) entry.getKey()).intValue())).setImageDrawable(C6214h.e(resources, ((Number) entry.getValue()).intValue(), (Resources.Theme) null));
        }
        for (Number intValue : C16877v.q(Integer.valueOf(C17177b.f142986d), Integer.valueOf(C17177b.f142987e), Integer.valueOf(C17177b.f142988f), Integer.valueOf(C17177b.f142989g), Integer.valueOf(C17177b.f142990h), Integer.valueOf(C17177b.f142991i), Integer.valueOf(C17177b.f142992j), Integer.valueOf(C17177b.f142993k), Integer.valueOf(C17177b.f142994l))) {
            ((TextView) rotateControlView.findViewById(intValue.intValue())).setTextColor(C5751x0.k(hVar.d()));
        }
        ((TextView) rotateControlView.findViewById(C17177b.f142996n)).setTextColor(C5751x0.k(hVar.g()));
    }
}
