package Lv;

import Dv.e;
import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import t0.C5934A;
import t0.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKJ/c;", "LTv/b;", "listItems", "Lkotlin/Function1;", "LRv/c;", "LXH/N;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "Lt0/A;", "scrollState", "c", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;Lt0/A;LU0/m;II)V", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<? extends Tv.b> r25, nI.C17642l<? super Rv.c, XH.C16807N> r26, androidx.compose.ui.d r27, t0.C5934A r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r25
            r2 = r26
            r5 = r30
            java.lang.String r0 = "listItems"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 893952830(0x3548a33e, float:7.4743355E-7)
            r3 = r29
            U0.m r3 = r3.k(r0)
            r4 = r31 & 1
            r6 = 4
            if (r4 == 0) goto L_0x0021
            r4 = r5 | 6
            goto L_0x003a
        L_0x0021:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x0039
            r4 = r5 & 8
            if (r4 != 0) goto L_0x002e
            boolean r4 = r3.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r4 = r3.F(r1)
        L_0x0032:
            if (r4 == 0) goto L_0x0036
            r4 = r6
            goto L_0x0037
        L_0x0036:
            r4 = 2
        L_0x0037:
            r4 = r4 | r5
            goto L_0x003a
        L_0x0039:
            r4 = r5
        L_0x003a:
            r7 = r31 & 2
            r8 = 32
            if (r7 == 0) goto L_0x0043
            r4 = r4 | 48
            goto L_0x0052
        L_0x0043:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0052
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x004f
            r7 = r8
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r4 = r4 | r7
        L_0x0052:
            r7 = r31 & 4
            if (r7 == 0) goto L_0x005b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r9 = r27
            goto L_0x006d
        L_0x005b:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0058
            r9 = r27
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x006a
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r4 = r4 | r10
        L_0x006d:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0086
            r10 = r31 & 8
            if (r10 != 0) goto L_0x0080
            r10 = r28
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x0082
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0080:
            r10 = r28
        L_0x0082:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r4 = r4 | r11
            goto L_0x0088
        L_0x0086:
            r10 = r28
        L_0x0088:
            r11 = r4 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x009b
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            r3.L()
            r4 = r10
            goto L_0x015a
        L_0x009b:
            r3.G()
            r11 = r5 & 1
            r12 = 0
            if (r11 == 0) goto L_0x00b8
            boolean r11 = r3.O()
            if (r11 == 0) goto L_0x00aa
            goto L_0x00b8
        L_0x00aa:
            r3.L()
            r7 = r31 & 8
            if (r7 == 0) goto L_0x00b3
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b3:
            r7 = r4
            r4 = r9
            r18 = r10
            goto L_0x00cc
        L_0x00b8:
            if (r7 == 0) goto L_0x00bd
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r9 = r7
        L_0x00bd:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x00b3
            r7 = 3
            t0.A r7 = t0.C5935B.c(r12, r12, r3, r12, r7)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r7
            r7 = r4
            r4 = r9
        L_0x00cc:
            r3.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00db
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.membership.impl.compose.member.settings.SettingsTabContent (SettingsTab.kt:29)"
            U0.C4895p.S(r0, r7, r9, r10)
        L_0x00db:
            r0 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r4, r0, r10, r9)
            float r9 = (float) r8
            float r22 = c2.h.B(r9)
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            s0.E r9 = androidx.compose.foundation.layout.D.e(r19, r20, r21, r22, r23, r24)
            r11 = -733587865(0xffffffffd4465667, float:-3.40741246E12)
            r3.W(r11)
            r11 = r7 & 14
            if (r11 == r6) goto L_0x010c
            r6 = r7 & 8
            if (r6 == 0) goto L_0x010a
            boolean r6 = r3.F(r1)
            if (r6 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r6 = r12
            goto L_0x010d
        L_0x010c:
            r6 = r10
        L_0x010d:
            r11 = r7 & 112(0x70, float:1.57E-43)
            if (r11 != r8) goto L_0x0112
            r12 = r10
        L_0x0112:
            r6 = r6 | r12
            java.lang.Object r8 = r3.D()
            if (r6 != 0) goto L_0x0121
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0129
        L_0x0121:
            Lv.a r8 = new Lv.a
            r8.<init>(r1, r2)
            r3.u(r8)
        L_0x0129:
            r14 = r8
            nI.l r14 = (nI.C17642l) r14
            r3.P()
            int r6 = r7 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r15 = r6 | 384(0x180, float:5.38E-43)
            r17 = 248(0xf8, float:3.48E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r6 = r0
            r7 = r18
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r16
            r0 = r15
            r15 = r3
            r16 = r0
            t0.C5937b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0157
            U0.C4895p.R()
        L_0x0157:
            r9 = r4
            r4 = r18
        L_0x015a:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0172
            Lv.b r8 = new Lv.b
            r0 = r8
            r1 = r25
            r2 = r26
            r3 = r9
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lv.c.c(KJ.c, nI.l, androidx.compose.ui.d, t0.A, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        e.a(xVar, cVar, lVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C17642l lVar, d dVar, C5934A a10, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, lVar, dVar, a10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
