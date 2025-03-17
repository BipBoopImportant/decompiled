package wK;

import E1.L;
import L1.i;
import L1.v;
import L1.x;
import N1.P;
import N1.Y;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import r0.m;
import r1.f;
import r1.j;
import r1.k;
import s0.C5842M;
import sK.C17951b;
import tK.C18029u;
import vK.C18205e;
import w2.C6214h;
import zK.C18760e;

@Metadata(d1 = {"\u0000l\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\n*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0001¢\u0006\u0004\b\u0019\u0010\r\u001a)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001am\u0010%\u001a\u00020\n\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f2\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\n0#H\u0007¢\u0006\u0004\b%\u0010&¨\u0006.²\u0006\f\u0010'\u001a\u00020\u00008\nX\u0002²\u0006\f\u0010(\u001a\u00020\u00008\nX\u0002²\u0006\f\u0010*\u001a\u00020)8\nX\u0002²\u0006\f\u0010+\u001a\u00020)8\nX\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00108\n@\nX\u0002"}, d2 = {"", "selected", "Landroidx/compose/ui/d;", "modifier", "enabled", "LwK/k8;", "variant", "Lr0/m;", "interactionSource", "Lkotlin/Function0;", "LXH/N;", "onClick", "t", "(ZLandroidx/compose/ui/d;ZLwK/k8;Lr0/m;LnI/a;LU0/m;II)V", "", "label", "", "caption", "s", "(Ljava/lang/CharSequence;ZLandroidx/compose/ui/d;ZLwK/k8;Lr0/m;Ljava/lang/String;LnI/a;LU0/m;II)V", "Ls0/M;", "LN1/Y;", "style", "N", "(Ls0/M;Ljava/lang/String;LN1/Y;LU0/m;I)V", "D", "Landroid/text/Spanned;", "textStyle", "p", "(Landroid/text/Spanned;LN1/Y;Landroidx/compose/ui/d;LU0/m;II)V", "T", "", "LwK/l8;", "items", "groupName", "Lkotlin/Function1;", "onItemSelected", "A", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/d;Ljava/lang/String;LwK/k8;LnI/l;LU0/m;II)V", "hover", "pressed", "Lp1/v0;", "radioOuterColor", "radioInnerColor", "Lc2/h;", "dotRadius", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.h8  reason: case insensitive filesystem */
public final class C18350h8 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: wK.l8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void A(java.util.List<wK.C18398l8<T>> r36, T r37, androidx.compose.ui.d r38, java.lang.String r39, wK.C18386k8 r40, nI.C17642l<? super wK.C18398l8<T>, XH.C16807N> r41, U0.C4889m r42, int r43, int r44) {
        /*
            r1 = r36
            r2 = r37
            r6 = r41
            r7 = r43
            r0 = 16
            r3 = 32
            r4 = 2
            r5 = 4
            java.lang.String r8 = "items"
            kotlin.jvm.internal.C17542s.j(r1, r8)
            java.lang.String r8 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r6, r8)
            r8 = 450956117(0x1ae10b55, float:9.3076127E-23)
            r9 = r42
            U0.m r9 = r9.k(r8)
            r15 = 1
            r10 = r44 & 1
            if (r10 == 0) goto L_0x0029
            r10 = r7 | 6
            goto L_0x0039
        L_0x0029:
            r10 = r7 & 6
            if (r10 != 0) goto L_0x0038
            boolean r10 = r9.F(r1)
            if (r10 == 0) goto L_0x0035
            r10 = r5
            goto L_0x0036
        L_0x0035:
            r10 = r4
        L_0x0036:
            r10 = r10 | r7
            goto L_0x0039
        L_0x0038:
            r10 = r7
        L_0x0039:
            r4 = r44 & 2
            if (r4 == 0) goto L_0x0040
            r10 = r10 | 48
            goto L_0x0057
        L_0x0040:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x0057
            r4 = r7 & 64
            if (r4 != 0) goto L_0x004d
            boolean r4 = r9.V(r2)
            goto L_0x0051
        L_0x004d:
            boolean r4 = r9.F(r2)
        L_0x0051:
            if (r4 == 0) goto L_0x0055
            r4 = r3
            goto L_0x0056
        L_0x0055:
            r4 = r0
        L_0x0056:
            r10 = r10 | r4
        L_0x0057:
            r4 = r44 & 4
            if (r4 == 0) goto L_0x0060
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r5 = r38
            goto L_0x0072
        L_0x0060:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005d
            r5 = r38
            boolean r11 = r9.V(r5)
            if (r11 == 0) goto L_0x006f
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r10 = r10 | r11
        L_0x0072:
            r11 = r44 & 8
            if (r11 == 0) goto L_0x007b
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0078:
            r12 = r39
            goto L_0x008d
        L_0x007b:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0078
            r12 = r39
            boolean r13 = r9.V(r12)
            if (r13 == 0) goto L_0x008a
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r10 = r10 | r13
        L_0x008d:
            r0 = r44 & 16
            if (r0 == 0) goto L_0x0096
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x0093:
            r13 = r40
            goto L_0x00a8
        L_0x0096:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0093
            r13 = r40
            boolean r14 = r9.V(r13)
            if (r14 == 0) goto L_0x00a5
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r10 = r10 | r14
        L_0x00a8:
            r3 = r44 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b2
            r10 = r10 | r17
        L_0x00b0:
            r3 = r10
            goto L_0x00c3
        L_0x00b2:
            r3 = r7 & r17
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r9.F(r6)
            if (r3 == 0) goto L_0x00bf
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r10 = r10 | r3
            goto L_0x00b0
        L_0x00c3:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r14) goto L_0x00dd
            boolean r10 = r9.l()
            if (r10 != 0) goto L_0x00d3
            goto L_0x00dd
        L_0x00d3:
            r9.L()
            r3 = r5
            r23 = r9
            r4 = r12
            r5 = r13
            goto L_0x02c2
        L_0x00dd:
            if (r4 == 0) goto L_0x00e2
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00e3
        L_0x00e2:
            r4 = r5
        L_0x00e3:
            if (r11 == 0) goto L_0x00e8
            r34 = 0
            goto L_0x00ea
        L_0x00e8:
            r34 = r12
        L_0x00ea:
            if (r0 == 0) goto L_0x00ef
            wK.k8 r0 = wK.C18386k8.Emphasised
            goto L_0x00f0
        L_0x00ef:
            r0 = r13
        L_0x00f0:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00fc
            r10 = -1
            java.lang.String r11 = "net.ikea.skapa.ui.components.RadioButtonGroup (RadioButton.kt:306)"
            U0.C4895p.S(r8, r3, r10, r11)
        L_0x00fc:
            r8 = r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r10 = r8.iterator()
        L_0x0103:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011b
            java.lang.Object r11 = r10.next()
            r12 = r11
            wK.l8 r12 = (wK.C18398l8) r12
            java.lang.Object r12 = r12.c()
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r2)
            if (r12 == 0) goto L_0x0103
            goto L_0x011c
        L_0x011b:
            r11 = 0
        L_0x011c:
            wK.l8 r11 = (wK.C18398l8) r11
            if (r11 != 0) goto L_0x0127
            java.lang.Object r10 = YH.C16877v.w0(r36)
            r11 = r10
            wK.l8 r11 = (wK.C18398l8) r11
        L_0x0127:
            r35 = r11
            androidx.compose.ui.d r10 = z0.C6270a.a(r4)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r11 = r11.g()
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c$b r12 = r12.k()
            r13 = 0
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r12, r9, r13)
            int r12 = U0.C4883j.a(r9, r13)
            U0.y r14 = r9.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r9, r10)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r13 = r16.a()
            U0.f r18 = r9.m()
            if (r18 != 0) goto L_0x0159
            U0.C4883j.c()
        L_0x0159:
            r9.I()
            boolean r18 = r9.i()
            if (r18 == 0) goto L_0x0166
            r9.p(r13)
            goto L_0x0169
        L_0x0166:
            r9.t()
        L_0x0169:
            U0.m r13 = U0.F1.a(r9)
            nI.p r15 = r16.c()
            U0.F1.c(r13, r11, r15)
            nI.p r11 = r16.e()
            U0.F1.c(r13, r14, r11)
            nI.p r11 = r16.b()
            boolean r14 = r13.i()
            if (r14 != 0) goto L_0x0193
            java.lang.Object r14 = r13.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r14 != 0) goto L_0x01a1
        L_0x0193:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r13.u(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.w(r12, r11)
        L_0x01a1:
            nI.p r11 = r16.d()
            U0.F1.c(r13, r10, r11)
            s0.h r10 = s0.C5862h.f28810a
            r10 = 1260145799(0x4b1c4c87, float:1.0243207E7)
            r9.W(r10)
            if (r34 == 0) goto L_0x01bb
            int r10 = r34.length()
            if (r10 != 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r10 = 0
            goto L_0x01bc
        L_0x01bb:
            r10 = 1
        L_0x01bc:
            if (r10 != 0) goto L_0x021c
            S1.C$a r10 = S1.C.f13316b
            S1.C r16 = r10.a()
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r10 = r10.a(r9, r11)
            long r11 = r10.G0()
            tK.T r10 = tK.T.f147377a
            tK.l r10 = r10.X()
            N1.Y r29 = r10.b()
            int r10 = r3 >> 9
            r10 = r10 & 14
            r31 = r10 | r17
            r32 = 0
            r33 = 65498(0xffda, float:9.1782E-41)
            r10 = 0
            r13 = 0
            r5 = 0
            r15 = 131072(0x20000, float:1.83671E-40)
            r17 = 0
            r15 = r17
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r39 = r9
            r9 = r34
            r30 = r39
            O0.d1.b(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            tK.u r10 = tK.C18029u.f147649a
            float r10 = r10.f()
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r9, r10)
            r15 = r39
            s0.C5844O.a(r9, r15, r5)
            goto L_0x021e
        L_0x021c:
            r15 = r9
            r5 = 0
        L_0x021e:
            r15.P()
            r9 = 1260156731(0x4b1c773b, float:1.0254139E7)
            r15.W(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x022b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x02ad
            java.lang.Object r9 = r8.next()
            wK.l8 r9 = (wK.C18398l8) r9
            java.lang.String r10 = r9.d()
            r11 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.h(r4, r11, r14, r13)
            boolean r12 = r9.b()
            java.lang.Object r5 = r9.c()
            java.lang.Object r13 = r35.c()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r13)
            java.lang.String r17 = r9.a()
            r13 = 1730559481(0x67263df9, float:7.85056E23)
            r15.W(r13)
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r3
            r14 = 131072(0x20000, float:1.83671E-40)
            if (r13 != r14) goto L_0x0265
            r13 = 1
            goto L_0x0266
        L_0x0265:
            r13 = 0
        L_0x0266:
            boolean r18 = r15.F(r9)
            r13 = r13 | r18
            java.lang.Object r14 = r15.D()
            if (r13 != 0) goto L_0x027a
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x0282
        L_0x027a:
            wK.Y7 r14 = new wK.Y7
            r14.<init>(r6, r9)
            r15.u(r14)
        L_0x0282:
            r18 = r14
            nI.a r18 = (nI.C17631a) r18
            r15.P()
            r9 = 57344(0xe000, float:8.0356E-41)
            r19 = r3 & r9
            r20 = 32
            r14 = 0
            r9 = r10
            r10 = r5
            r5 = 0
            r13 = r0
            r21 = 1
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = r15
            r15 = r17
            r16 = r18
            r17 = r23
            r18 = r19
            r19 = r20
            s(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r23
            r5 = 0
            goto L_0x022b
        L_0x02ad:
            r23 = r15
            r23.P()
            r23.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02be
            U0.C4895p.R()
        L_0x02be:
            r5 = r0
            r3 = r4
            r4 = r34
        L_0x02c2:
            U0.Y0 r9 = r23.n()
            if (r9 == 0) goto L_0x02db
            wK.Z7 r10 = new wK.Z7
            r0 = r10
            r1 = r36
            r2 = r37
            r6 = r41
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18350h8.A(java.util.List, java.lang.Object, androidx.compose.ui.d, java.lang.String, wK.k8, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar, C18398l8 l8Var) {
        lVar.invoke(l8Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(List list, Object obj, d dVar, String str, C18386k8 k8Var, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        A(list, obj, dVar, str, k8Var, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(boolean r26, androidx.compose.ui.d r27, boolean r28, wK.C18386k8 r29, r0.m r30, nI.C17631a<XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r7 = r31
            r8 = r33
            r0 = -455536377(0xffffffffe4d91107, float:-3.2033363E22)
            r1 = r32
            U0.m r6 = r1.k(r0)
            r1 = r34 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            r4 = r26
            goto L_0x0028
        L_0x0016:
            r1 = r8 & 6
            r4 = r26
            if (r1 != 0) goto L_0x0027
            boolean r1 = r6.b(r4)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r8
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            r2 = r34 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r27
            goto L_0x0043
        L_0x0031:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r27
            boolean r9 = r6.V(r3)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r1 = r1 | r9
        L_0x0043:
            r9 = r34 & 4
            if (r9 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r10 = r28
            goto L_0x005e
        L_0x004c:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0049
            r10 = r28
            boolean r11 = r6.b(r10)
            if (r11 == 0) goto L_0x005b
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r11
        L_0x005e:
            r11 = r34 & 8
            if (r11 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r12 = r29
            goto L_0x0079
        L_0x0067:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0064
            r12 = r29
            boolean r13 = r6.V(r12)
            if (r13 == 0) goto L_0x0076
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r13
        L_0x0079:
            r13 = r34 & 16
            if (r13 == 0) goto L_0x0082
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r14 = r30
            goto L_0x0094
        L_0x0082:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x007f
            r14 = r30
            boolean r15 = r6.V(r14)
            if (r15 == 0) goto L_0x0091
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r1 = r1 | r15
        L_0x0094:
            r15 = r34 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r1 = r1 | r16
            goto L_0x00ad
        L_0x009d:
            r15 = r8 & r16
            if (r15 != 0) goto L_0x00ad
            boolean r15 = r6.F(r7)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r15
        L_0x00ad:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r1
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r5) goto L_0x00c7
            boolean r5 = r6.l()
            if (r5 != 0) goto L_0x00bd
            goto L_0x00c7
        L_0x00bd:
            r6.L()
            r2 = r3
            r1 = r6
            r3 = r10
            r4 = r12
            r5 = r14
            goto L_0x0282
        L_0x00c7:
            if (r2 == 0) goto L_0x00cd
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r5 = r2
            goto L_0x00ce
        L_0x00cd:
            r5 = r3
        L_0x00ce:
            r3 = 1
            if (r9 == 0) goto L_0x00d4
            r24 = r3
            goto L_0x00d6
        L_0x00d4:
            r24 = r10
        L_0x00d6:
            if (r11 == 0) goto L_0x00db
            wK.k8 r2 = wK.C18386k8.Emphasised
            goto L_0x00dc
        L_0x00db:
            r2 = r12
        L_0x00dc:
            if (r13 == 0) goto L_0x00fe
            r9 = 626028835(0x25507123, float:1.8079456E-16)
            r6.W(r9)
            java.lang.Object r9 = r6.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r9 != r10) goto L_0x00f7
            r0.m r9 = r0.l.a()
            r6.u(r9)
        L_0x00f7:
            r0.m r9 = (r0.m) r9
            r6.P()
            r15 = r9
            goto L_0x00ff
        L_0x00fe:
            r15 = r14
        L_0x00ff:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x010b
            r9 = -1
            java.lang.String r10 = "net.ikea.skapa.ui.components.RadioButtonImpl (RadioButton.kt:215)"
            U0.C4895p.S(r0, r1, r9, r10)
        L_0x010b:
            int r0 = r1 >> 12
            r0 = r0 & 14
            U0.A1 r16 = r0.C5814f.a(r15, r6, r0)
            U0.A1 r17 = r0.i.a(r15, r6, r0)
            U0.A1 r0 = r0.p.a(r15, r6, r0)
            wK.i8 r14 = wK.C18362i8.f151040a
            int r9 = r1 >> 9
            r9 = r9 & 14
            r9 = r9 | 48
            wK.j8 r13 = r14.f(r2, r6, r9)
            boolean r12 = E(r17)
            boolean r18 = F(r0)
            int r9 = r1 >> 6
            r9 = r9 & 14
            int r10 = r1 << 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            r19 = r9 | r10
            r9 = r13
            r10 = r24
            r11 = r26
            r27 = r13
            r13 = r18
            r18 = r14
            r14 = r6
            r25 = r15
            r15 = r19
            U0.A1 r15 = r9.d(r10, r11, r12, r13, r14, r15)
            boolean r12 = E(r17)
            boolean r13 = F(r0)
            r9 = r27
            r8 = r15
            r15 = r19
            U0.A1 r9 = r9.c(r10, r11, r12, r13, r14, r15)
            boolean r10 = E(r17)
            boolean r0 = F(r0)
            r11 = r1 & 14
            r1 = r27
            r12 = r2
            r2 = r26
            r13 = r3
            r3 = r10
            r4 = r0
            r15 = r5
            r10 = 2
            r5 = r6
            r6 = r11
            U0.A1 r11 = r1.e(r2, r3, r4, r5, r6)
            float r1 = r18.b()
            r4 = 4
            r5 = 0
            r0 = 0
            r2 = 0
            n0.I r0 = O0.C4756u0.c(r0, r1, r2, r4, r5)
            r1 = 626049976(0x2550c3b8, float:1.8107436E-16)
            r14.W(r1)
            r6 = 0
            if (r7 == 0) goto L_0x01bb
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            L1.i$a r2 = L1.i.f8936b
            int r2 = r2.e()
            java.lang.Object r3 = r16.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x01a4
            r3 = r0
            goto L_0x01a5
        L_0x01a4:
            r3 = r5
        L_0x01a5:
            L1.i r17 = L1.i.h(r2)
            r0 = r1
            r1 = r26
            r2 = r25
            r4 = r24
            r10 = r5
            r5 = r17
            r7 = r6
            r6 = r31
            androidx.compose.ui.d r0 = androidx.compose.foundation.selection.a.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01e2
        L_0x01bb:
            r10 = r5
            r7 = r6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 626060727(0x2550edb7, float:1.8121665E-16)
            r14.W(r1)
            java.lang.Object r1 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x01d9
            wK.U7 r1 = new wK.U7
            r1.<init>()
            r14.u(r1)
        L_0x01d9:
            nI.l r1 = (nI.C17642l) r1
            r14.P()
            androidx.compose.ui.d r0 = L1.o.d(r0, r7, r1, r13, r10)
        L_0x01e2:
            r14.P()
            androidx.compose.ui.d r0 = r15.s(r0)
            r1 = 626064727(0x2550fd57, float:1.8126959E-16)
            r14.W(r1)
            java.lang.Object r1 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            if (r1 != r3) goto L_0x0203
            wK.V7 r1 = new wK.V7
            r1.<init>()
            r14.u(r1)
        L_0x0203:
            nI.l r1 = (nI.C17642l) r1
            r14.P()
            androidx.compose.ui.d r0 = L1.o.d(r0, r7, r1, r13, r10)
            float r1 = r18.c()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.o(r0, r1)
            tK.d r1 = tK.C18013d.f147437a
            A0.f r17 = r1.a()
            r22 = 88
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r1 = r14
            r14 = r0
            r3 = r15
            r15 = r16
            r16 = r24
            androidx.compose.ui.d r0 = zK.C18756a.b(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.e()
            r5 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.E(r0, r4, r7, r5, r10)
            r4 = 626073471(0x25511f7f, float:1.8138532E-16)
            r1.W(r4)
            r4 = r27
            boolean r5 = r1.V(r4)
            boolean r6 = r1.V(r8)
            r5 = r5 | r6
            boolean r6 = r1.V(r11)
            r5 = r5 | r6
            boolean r6 = r1.V(r9)
            r5 = r5 | r6
            java.lang.Object r6 = r1.D()
            if (r5 != 0) goto L_0x0263
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x026b
        L_0x0263:
            wK.W7 r6 = new wK.W7
            r6.<init>(r4, r8, r11, r9)
            r1.u(r6)
        L_0x026b:
            nI.l r6 = (nI.C17642l) r6
            r1.P()
            n0.C5603i.a(r0, r6, r1, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x027c
            U0.C4895p.R()
        L_0x027c:
            r2 = r3
            r4 = r12
            r3 = r24
            r5 = r25
        L_0x0282:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0299
            wK.X7 r10 = new wK.X7
            r0 = r10
            r1 = r26
            r6 = r31
            r7 = r33
            r8 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18350h8.D(boolean, androidx.compose.ui.d, boolean, wK.k8, r0.m, nI.a, U0.m, int, int):void");
    }

    private static final boolean E(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean F(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long G(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final long H(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final float I(A1<h> a12) {
        return a12.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final C16807N J(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.e());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.e());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C18374j8 j8Var, A1 a12, A1 a13, A1 a14, f fVar) {
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$Canvas");
        C18362i8 i8Var = C18362i8.f151040a;
        float H12 = fVar2.H1(i8Var.e());
        long b10 = j8Var.b();
        float f10 = H12 / ((float) 2);
        float H13 = fVar2.H1(i8Var.d()) - f10;
        j jVar = j.f28627a;
        f.G1(fVar, b10, H13, 0, 0.0f, jVar, (C5749w0) null, 0, 108, (Object) null);
        f.G1(fVar, G(a12), fVar2.H1(i8Var.d()) - f10, 0, 0.0f, new k(H12, 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), (C5749w0) null, 0, 108, (Object) null);
        if (h.v(I(a13), h.B((float) 0)) > 0) {
            f.G1(fVar, H(a14), fVar2.H1(I(a13)) - f10, 0, 0.0f, jVar, (C5749w0) null, 0, 108, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(boolean z10, d dVar, boolean z11, C18386k8 k8Var, m mVar, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        D(z10, dVar, z11, k8Var, mVar, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void N(C5842M m10, String str, Y y10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C5842M m11 = m10;
        String str2 = str;
        Y y11 = y10;
        int i12 = i10;
        C4889m k10 = mVar.k(1842281296);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(m11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(y11) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1842281296, i11, -1, "net.ikea.skapa.ui.components.RadioButtonLabel (RadioButton.kt:198)");
            }
            mVar2 = k10;
            d1.b(str, m11.b(D.m(d.f18749a, C18029u.f147649a.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar2, (i11 >> 3) & 14, (i11 << 12) & 3670016, 65532);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new T7(m11, str, y10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C5842M m10, String str, Y y10, int i10, C4889m mVar, int i11) {
        N(m10, str, y10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(android.text.Spanned r7, N1.Y r8, androidx.compose.ui.d r9, U0.C4889m r10, int r11, int r12) {
        /*
            r0 = -1794332033(0xffffffff950caa7f, float:-2.8407273E-26)
            U0.m r10 = r10.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r11 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r10.F(r7)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r11
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            r2 = r12 & 2
            r3 = 32
            if (r2 == 0) goto L_0x0027
            r1 = r1 | 48
            goto L_0x0036
        L_0x0027:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0036
            boolean r2 = r10.V(r8)
            if (r2 == 0) goto L_0x0033
            r2 = r3
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004d
        L_0x003d:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            boolean r4 = r10.V(r9)
            if (r4 == 0) goto L_0x004a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004c
        L_0x004a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r1 = r1 | r4
        L_0x004d:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x005f
            boolean r4 = r10.l()
            if (r4 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r10.L()
        L_0x005d:
            r4 = r9
            goto L_0x00c0
        L_0x005f:
            if (r2 == 0) goto L_0x0063
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
        L_0x0063:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x006f
            r2 = -1
            java.lang.String r4 = "net.ikea.skapa.ui.components.LegacyLabel (RadioButton.kt:264)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x006f:
            long r4 = r8.h()
            int r0 = p1.C5751x0.k(r4)
            r2 = 945522371(0x385b86c3, float:5.2339175E-5)
            r10.W(r2)
            boolean r2 = r10.F(r7)
            boolean r4 = r10.d(r0)
            r2 = r2 | r4
            r4 = r1 & 112(0x70, float:1.57E-43)
            if (r4 != r3) goto L_0x008c
            r3 = 1
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            r2 = r2 | r3
            java.lang.Object r3 = r10.D()
            if (r2 != 0) goto L_0x009c
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00a4
        L_0x009c:
            wK.f8 r3 = new wK.f8
            r3.<init>(r7, r0, r8)
            r10.u(r3)
        L_0x00a4:
            r0 = r3
            nI.l r0 = (nI.C17642l) r0
            r10.P()
            int r1 = r1 >> 3
            r5 = r1 & 112(0x70, float:1.57E-43)
            r6 = 4
            r3 = 0
            r1 = r0
            r2 = r9
            r4 = r10
            androidx.compose.ui.viewinterop.e.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x005d
            U0.C4895p.R()
            goto L_0x005d
        L_0x00c0:
            U0.Y0 r9 = r10.n()
            if (r9 == 0) goto L_0x00d3
            wK.g8 r10 = new wK.g8
            r1 = r10
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r9.a(r10)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18350h8.p(android.text.Spanned, N1.Y, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final TextView q(Spanned spanned, int i10, Y y10, Context context) {
        C17542s.j(context, "context");
        TextView textView = new TextView(context);
        textView.setText(spanned);
        textView.setTextColor(i10);
        textView.setLinkTextColor(i10);
        textView.setTextSize(2, c2.v.h(y10.l()));
        textView.setOnTouchListener(new C18760e());
        textView.setTypeface(C6214h.g(context, C17951b.f147178a));
        return textView;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(Spanned spanned, Y y10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(spanned, y10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(java.lang.CharSequence r57, boolean r58, androidx.compose.ui.d r59, boolean r60, wK.C18386k8 r61, r0.m r62, java.lang.String r63, nI.C17631a<XH.C16807N> r64, U0.C4889m r65, int r66, int r67) {
        /*
            r1 = r57
            r9 = r64
            r10 = r66
            r11 = r67
            r2 = 16
            r3 = 32
            r4 = 2
            r5 = 4
            r12 = 6
            java.lang.String r6 = "label"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            r6 = 2097067779(0x7cfeb703, float:1.05804426E37)
            r7 = r65
            U0.m r15 = r7.k(r6)
            r13 = 1
            r7 = r11 & 1
            if (r7 == 0) goto L_0x0025
            r7 = r10 | 6
            goto L_0x0035
        L_0x0025:
            r7 = r10 & 6
            if (r7 != 0) goto L_0x0034
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = r5
            goto L_0x0032
        L_0x0031:
            r7 = r4
        L_0x0032:
            r7 = r7 | r10
            goto L_0x0035
        L_0x0034:
            r7 = r10
        L_0x0035:
            r4 = r4 & r11
            if (r4 == 0) goto L_0x003d
            r7 = r7 | 48
            r14 = r58
            goto L_0x004d
        L_0x003d:
            r4 = r10 & 48
            r14 = r58
            if (r4 != 0) goto L_0x004d
            boolean r4 = r15.b(r14)
            if (r4 == 0) goto L_0x004b
            r4 = r3
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            r7 = r7 | r4
        L_0x004d:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0056
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r5 = r59
            goto L_0x0068
        L_0x0056:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0053
            r5 = r59
            boolean r8 = r15.V(r5)
            if (r8 == 0) goto L_0x0065
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r7 = r7 | r8
        L_0x0068:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0071
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r12 = r60
            goto L_0x0084
        L_0x0071:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x006e
            r12 = r60
            boolean r16 = r15.b(r12)
            if (r16 == 0) goto L_0x0080
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r7 = r7 | r16
        L_0x0084:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x008c
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r13 = r61
            goto L_0x009f
        L_0x008c:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0089
            r13 = r61
            boolean r16 = r15.V(r13)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r7 = r7 | r16
        L_0x009f:
            r3 = r3 & r11
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00a9
            r7 = r7 | r16
            r6 = r62
            goto L_0x00bc
        L_0x00a9:
            r17 = r10 & r16
            r6 = r62
            if (r17 != 0) goto L_0x00bc
            boolean r18 = r15.V(r6)
            if (r18 == 0) goto L_0x00b8
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r7 = r7 | r18
        L_0x00bc:
            r18 = r11 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c7
            r7 = r7 | r19
        L_0x00c4:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x00db
        L_0x00c7:
            r19 = r10 & r19
            r0 = r63
            if (r19 != 0) goto L_0x00c4
            boolean r20 = r15.V(r0)
            if (r20 == 0) goto L_0x00d6
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r7 = r7 | r20
            goto L_0x00c4
        L_0x00db:
            r0 = r0 & r11
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e4
            r7 = r7 | r19
        L_0x00e2:
            r0 = r7
            goto L_0x00f5
        L_0x00e4:
            r0 = r10 & r19
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r15.F(r9)
            if (r0 == 0) goto L_0x00f1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r7 = r7 | r0
            goto L_0x00e2
        L_0x00f5:
            r7 = 4793491(0x492493, float:6.717112E-39)
            r7 = r7 & r0
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r5) goto L_0x0112
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            r15.L()
            r3 = r59
            r7 = r63
            r11 = r6
            r4 = r12
            r5 = r13
            r6 = r15
            goto L_0x0459
        L_0x0112:
            if (r4 == 0) goto L_0x0118
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r7 = r4
            goto L_0x011a
        L_0x0118:
            r7 = r59
        L_0x011a:
            if (r8 == 0) goto L_0x011d
            r12 = 1
        L_0x011d:
            if (r2 == 0) goto L_0x0122
            wK.k8 r2 = wK.C18386k8.Emphasised
            r13 = r2
        L_0x0122:
            if (r3 == 0) goto L_0x0144
            r2 = -798714205(0xffffffffd06496a3, float:-1.53403095E10)
            r15.W(r2)
            java.lang.Object r2 = r15.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x013d
            r0.m r2 = r0.l.a()
            r15.u(r2)
        L_0x013d:
            r0.m r2 = (r0.m) r2
            r15.P()
            r8 = r2
            goto L_0x0145
        L_0x0144:
            r8 = r6
        L_0x0145:
            if (r18 == 0) goto L_0x0149
            r5 = 0
            goto L_0x014b
        L_0x0149:
            r5 = r63
        L_0x014b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x015a
            r2 = -1
            java.lang.String r3 = "net.ikea.skapa.ui.components.RadioButton (RadioButton.kt:144)"
            r4 = 2097067779(0x7cfeb703, float:1.05804426E37)
            U0.C4895p.S(r4, r0, r2, r3)
        L_0x015a:
            wK.i8 r2 = wK.C18362i8.f151040a
            int r3 = r0 >> 12
            r3 = r3 & 14
            r3 = r3 | 48
            wK.j8 r2 = r2.f(r13, r15, r3)
            tK.v r4 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.w r17 = r4.b(r15, r3)
            tK.c r17 = r17.a()
            N1.Y r22 = r17.b()
            int r17 = r0 >> 9
            r6 = r17 & 14
            U0.A1 r2 = r2.a(r12, r15, r6)
            java.lang.Object r2 = r2.getValue()
            p1.v0 r2 = (p1.C5747v0) r2
            long r23 = r2.y()
            r52 = 16777214(0xfffffe, float:2.3509884E-38)
            r53 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            N1.Y r6 = N1.Y.c(r22, r23, r25, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r50, r51, r52, r53)
            r2 = -798705000(0xffffffffd064ba98, float:-1.53497354E10)
            r15.W(r2)
            r2 = 0
            if (r9 == 0) goto L_0x01f2
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            L1.i$a r18 = L1.i.f8936b
            int r18 = r18.e()
            r19 = 0
            L1.i r18 = L1.i.h(r18)
            r2 = r17
            r54 = r3
            r3 = r58
            r9 = r4
            r4 = r8
            r10 = r5
            r5 = r19
            r55 = r6
            r6 = r12
            r56 = r7
            r7 = r18
            r11 = r8
            r8 = r64
            androidx.compose.ui.d r2 = androidx.compose.foundation.selection.a.a(r2, r3, r4, r5, r6, r7, r8)
            r5 = 0
            r6 = 0
            goto L_0x0223
        L_0x01f2:
            r54 = r3
            r9 = r4
            r10 = r5
            r55 = r6
            r56 = r7
            r11 = r8
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = -798695241(0xffffffffd064e0b7, float:-1.53597286E10)
            r15.W(r3)
            java.lang.Object r3 = r15.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x0217
            wK.a8 r3 = new wK.a8
            r3.<init>()
            r15.u(r3)
        L_0x0217:
            nI.l r3 = (nI.C17642l) r3
            r15.P()
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r2 = L1.o.d(r2, r6, r3, r4, r5)
        L_0x0223:
            r15.P()
            int r3 = r0 >> 15
            r3 = r3 & 14
            U0.A1 r3 = r0.i.a(r11, r15, r3)
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = r56
            androidx.compose.ui.d r3 = zK.C18756a.i(r4, r3, r12)
            androidx.compose.ui.d r2 = r3.s(r2)
            tK.u r3 = tK.C18029u.f147649a
            float r7 = r3.h()
            r8 = 0
            r6 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.b(r2, r8, r7, r6, r5)
            r5 = -798685089(0xffffffffd065085f, float:-1.53701243E10)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r7 = r6.a()
            if (r5 != r7) goto L_0x0268
            wK.b8 r5 = new wK.b8
            r5.<init>()
            r15.u(r5)
        L_0x0268:
            nI.l r5 = (nI.C17642l) r5
            r15.P()
            r7 = 1
            androidx.compose.ui.d r2 = L1.o.c(r2, r7, r5)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r7 = r5.b()
            i1.c$a r8 = i1.C5437c.f24302a
            r56 = r4
            i1.c$b r4 = r8.k()
            r17 = r13
            r13 = 6
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r7, r4, r15, r13)
            r7 = 0
            int r13 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r15, r2)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r14 = r18.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x02a3
            U0.C4883j.c()
        L_0x02a3:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x02b0
            r15.p(r14)
            goto L_0x02b3
        L_0x02b0:
            r15.t()
        L_0x02b3:
            U0.m r14 = U0.F1.a(r15)
            r22 = r10
            nI.p r10 = r18.c()
            U0.F1.c(r14, r4, r10)
            nI.p r4 = r18.e()
            U0.F1.c(r14, r7, r4)
            nI.p r4 = r18.b()
            boolean r7 = r14.i()
            if (r7 != 0) goto L_0x02df
            java.lang.Object r7 = r14.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x02ed
        L_0x02df:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r14.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r14.w(r7, r4)
        L_0x02ed:
            nI.p r4 = r18.d()
            U0.F1.c(r14, r2, r4)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d$e r4 = r5.f()
            i1.c$c r5 = r8.l()
            r7 = 0
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r5, r15, r7)
            int r5 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r2)
            nI.a r10 = r18.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x031e
            U0.C4883j.c()
        L_0x031e:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x032b
            r15.p(r10)
            goto L_0x032e
        L_0x032b:
            r15.t()
        L_0x032e:
            U0.m r10 = U0.F1.a(r15)
            nI.p r13 = r18.c()
            U0.F1.c(r10, r4, r13)
            nI.p r4 = r18.e()
            U0.F1.c(r10, r7, r4)
            nI.p r4 = r18.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0358
            java.lang.Object r7 = r10.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r13)
            if (r7 != 0) goto L_0x0366
        L_0x0358:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r10.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.w(r5, r4)
        L_0x0366:
            nI.p r4 = r18.d()
            U0.F1.c(r10, r8, r4)
            s0.N r4 = s0.C5843N.f28726a
            r5 = r54
            tK.w r5 = r9.b(r15, r5)
            tK.c r5 = r5.a()
            N1.Y r5 = r5.b()
            r7 = 0
            float r5 = vK.C18205e.e(r5, r15, r7)
            r7 = -1280509831(0xffffffffb3acf879, float:-8.054571E-8)
            r15.W(r7)
            boolean r7 = r15.c(r5)
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x0398
            java.lang.Object r7 = r6.a()
            if (r8 != r7) goto L_0x03a0
        L_0x0398:
            wK.c8 r8 = new wK.c8
            r8.<init>(r5)
            r15.u(r8)
        L_0x03a0:
            nI.l r8 = (nI.C17642l) r8
            r15.P()
            androidx.compose.ui.d r5 = r4.d(r2, r8)
            r7 = -1280506499(0xffffffffb3ad057d, float:-8.0569386E-8)
            r15.W(r7)
            java.lang.Object r7 = r15.D()
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x03c1
            wK.d8 r7 = new wK.d8
            r7.<init>()
            r15.u(r7)
        L_0x03c1:
            nI.l r7 = (nI.C17642l) r7
            r15.P()
            androidx.compose.ui.d r14 = L1.o.a(r5, r7)
            int r5 = r0 >> 3
            r6 = r5 & 14
            r6 = r6 | r16
            r7 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r7
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r7
            r20 = r6 | r5
            r21 = 0
            r18 = 0
            r5 = r17
            r13 = r58
            r6 = r15
            r15 = r12
            r16 = r5
            r17 = r11
            r19 = r6
            D(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r7 = r1 instanceof android.text.Spanned
            if (r7 != 0) goto L_0x0407
            r2 = -1280498985(0xffffffffb3ad22d7, float:-8.0622776E-8)
            r6.W(r2)
            java.lang.String r2 = r57.toString()
            r7 = r55
            r3 = 6
            N(r4, r2, r7, r6, r3)
            r6.P()
            goto L_0x0437
        L_0x0407:
            r7 = r55
            r8 = -1280496070(0xffffffffb3ad2e3a, float:-8.064349E-8)
            r6.W(r8)
            r13 = r1
            android.text.Spanned r13 = (android.text.Spanned) r13
            float r24 = r3.a()
            r28 = 14
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r2
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.d r15 = r4.b(r2)
            r17 = 0
            r18 = 0
            r14 = r7
            r16 = r6
            p(r13, r14, r15, r16, r17, r18)
            r6.P()
        L_0x0437:
            r6.x()
            int r2 = r0 >> 18
            r2 = r2 & 14
            r3 = 6
            int r0 = r0 >> r3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r22
            r3 = 0
            wK.C18414n0.b(r2, r12, r6, r0, r3)
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0455
            U0.C4895p.R()
        L_0x0455:
            r7 = r2
            r4 = r12
            r3 = r56
        L_0x0459:
            U0.Y0 r12 = r6.n()
            if (r12 == 0) goto L_0x0473
            wK.e8 r13 = new wK.e8
            r0 = r13
            r1 = r57
            r2 = r58
            r6 = r11
            r8 = r64
            r9 = r66
            r10 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x0473:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18350h8.s(java.lang.CharSequence, boolean, androidx.compose.ui.d, boolean, wK.k8, r0.m, java.lang.String, nI.a, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(boolean r18, androidx.compose.ui.d r19, boolean r20, wK.C18386k8 r21, r0.m r22, nI.C17631a<XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r7 = r25
            r0 = 2102945735(0x7d5867c7, float:1.7978256E37)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r18
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r18
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r18
            r3 = r7
        L_0x0029:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r19
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r19
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r26 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r20
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r20
            boolean r9 = r1.b(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r21
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r21
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r26 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r22
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r22
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r26 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r23
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            r15 = r23
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.F(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00c9
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r1.L()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x0132
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00cf
        L_0x00ce:
            r4 = r5
        L_0x00cf:
            if (r6 == 0) goto L_0x00d3
            r5 = 1
            goto L_0x00d4
        L_0x00d3:
            r5 = r8
        L_0x00d4:
            if (r9 == 0) goto L_0x00d9
            wK.k8 r6 = wK.C18386k8.Emphasised
            goto L_0x00da
        L_0x00d9:
            r6 = r10
        L_0x00da:
            if (r11 == 0) goto L_0x00fd
            r8 = -798797533(0xffffffffd0635123, float:-1.52549816E10)
            r1.W(r8)
            java.lang.Object r8 = r1.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r8 != r9) goto L_0x00f5
            r0.m r8 = r0.l.a()
            r1.u(r8)
        L_0x00f5:
            r0.m r8 = (r0.m) r8
            r1.P()
            r17 = r8
            goto L_0x00ff
        L_0x00fd:
            r17 = r12
        L_0x00ff:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x010b
            r8 = -1
            java.lang.String r9 = "net.ikea.skapa.ui.components.RadioButton (RadioButton.kt:94)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x010b:
            r0 = 3
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r9 = zK.C18766k.b(r4, r9, r9, r0, r8)
            r0 = 524174(0x7ff8e, float:7.34524E-40)
            r0 = r0 & r3
            r16 = 0
            r8 = r18
            r10 = r5
            r11 = r6
            r12 = r17
            r13 = r23
            r14 = r1
            r15 = r0
            D(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x012e
            U0.C4895p.R()
        L_0x012e:
            r3 = r5
            r10 = r6
            r5 = r17
        L_0x0132:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x014b
            wK.S7 r11 = new wK.S7
            r0 = r11
            r1 = r18
            r2 = r4
            r4 = r10
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18350h8.t(boolean, androidx.compose.ui.d, boolean, wK.k8, r0.m, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(boolean z10, d dVar, boolean z11, C18386k8 k8Var, m mVar, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        t(z10, dVar, z11, k8Var, mVar, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int w(float f10, L l10) {
        C17542s.j(l10, "it");
        return C18205e.d(l10.z(), f10);
    }

    /* access modifiers changed from: private */
    public static final C16807N x(CharSequence charSequence, boolean z10, d dVar, boolean z11, C18386k8 k8Var, m mVar, String str, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        s(charSequence, z10, dVar, z11, k8Var, mVar, str, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.e());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }
}
