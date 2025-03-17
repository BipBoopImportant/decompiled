package xg;

import B0.C4380y;
import E1.I;
import Eg.b;
import Eg.c;
import G1.C4504g;
import KJ.C15987c;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.d;
import bI.C17035a;
import dI.C17168i;
import i1.C5437c;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5843N;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u001aH\u0003¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u0002"}, d2 = {"LEg/c;", "viewModel", "", "title", "description", "LXH/N;", "y", "(LEg/c;Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "LEg/c$a$c;", "state", "Lxg/a;", "surveyCallbacks", "Landroidx/compose/ui/d;", "modifier", "w", "(Ljava/lang/String;Ljava/lang/String;LEg/c$a$c;Lxg/a;Landroidx/compose/ui/d;LU0/m;II)V", "", "enabled", "Lkotlin/Function2;", "onQuestionResponseChange", "m", "(LEg/c$a$c;ZLnI/p;LU0/m;I)V", "LCg/a;", "selectedRating", "LKJ/c;", "ratings", "Lkotlin/Function1;", "onRatingSelected", "u", "(LCg/a;LKJ/c;LnI/l;LU0/m;I)V", "rating", "isSelected", "r", "(LCg/a;ZLnI/l;LU0/m;I)V", "LEg/c$a;", "surveyState", "inappfeedback_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((Cg.a) t10).c()), Integer.valueOf(((Cg.a) t11).c()));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(c cVar, String str, String str2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "text");
        cVar.L(str, str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(c cVar, Cg.a aVar) {
        C17542s.j(aVar, "it");
        cVar.I(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(c cVar) {
        cVar.H();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(c cVar, String str, String str2, int i10, C4889m mVar, int i11) {
        y(cVar, str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m(Eg.c.a.C0984c r38, boolean r39, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r40, U0.C4889m r41, int r42) {
        /*
            r0 = r38
            r13 = r39
            r14 = r40
            r15 = r42
            r12 = 1
            r1 = 2138052157(0x7f70163d, float:3.1913019E38)
            r2 = r41
            U0.m r11 = r2.k(r1)
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0021
            boolean r2 = r11.F(r0)
            if (r2 == 0) goto L_0x001e
            r2 = 4
            goto L_0x001f
        L_0x001e:
            r2 = 2
        L_0x001f:
            r2 = r2 | r15
            goto L_0x0022
        L_0x0021:
            r2 = r15
        L_0x0022:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0032
            boolean r3 = r11.b(r13)
            if (r3 == 0) goto L_0x002f
            r3 = 32
            goto L_0x0031
        L_0x002f:
            r3 = 16
        L_0x0031:
            r2 = r2 | r3
        L_0x0032:
            r3 = r15 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0043
            boolean r3 = r11.F(r14)
            if (r3 == 0) goto L_0x0040
            r3 = r10
            goto L_0x0042
        L_0x0040:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r2 = r2 | r3
        L_0x0043:
            r9 = r2
            r2 = r9 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0058
            boolean r2 = r11.l()
            if (r2 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            r11.L()
            r25 = r11
            goto L_0x0283
        L_0x0058:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0064
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.app.inappfeedback.compose.QuestionsContent (SurveyScreen.kt:205)"
            U0.C4895p.S(r1, r9, r2, r3)
        L_0x0064:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r2, r12, r3)
            r4 = 24
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r2, r4, r12, r3)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r8 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r11, r8)
            int r3 = U0.C4883j.a(r11, r8)
            U0.y r4 = r11.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r11, r1)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r11.m()
            if (r7 != 0) goto L_0x00a3
            U0.C4883j.c()
        L_0x00a3:
            r11.I()
            boolean r7 = r11.i()
            if (r7 == 0) goto L_0x00b0
            r11.p(r6)
            goto L_0x00b3
        L_0x00b0:
            r11.t()
        L_0x00b3:
            U0.m r6 = U0.F1.a(r11)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r5.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x00dd
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x00eb
        L_0x00dd:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x00eb:
            nI.p r2 = r5.d()
            U0.F1.c(r6, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r1 = r11.Q(r1)
            r7 = r1
            n1.f r7 = (n1.C5626f) r7
            Eg.b r1 = r38.d()
            java.util.List r1 = r1.f()
            int r6 = YH.C16877v.p(r1)
            r1 = 34003958(0x206dbf6, float:9.907891E-38)
            r11.W(r1)
            Eg.b r1 = r38.d()
            java.util.List r1 = r1.f()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r16 = r1.iterator()
            r1 = r8
        L_0x0120:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0272
            java.lang.Object r2 = r16.next()
            int r17 = r1 + 1
            if (r1 >= 0) goto L_0x0131
            YH.C16877v.x()
        L_0x0131:
            Eg.b$a r2 = (Eg.b.a) r2
            Eg.a r3 = r38.b()
            java.util.Map r3 = r3.d()
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x014b
            java.lang.String r5 = r2.a()
            java.lang.Object r3 = r3.getOrDefault(r5, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x014c
        L_0x014b:
            r3 = r4
        L_0x014c:
            if (r1 != r6) goto L_0x016c
            B0.A r1 = new B0.A
            T1.r$a r4 = T1.r.f13620b
            int r22 = r4.b()
            r26 = 119(0x77, float:1.67E-43)
            r27 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x018b
        L_0x016c:
            B0.A r1 = new B0.A
            T1.r$a r4 = T1.r.f13620b
            int r32 = r4.d()
            r36 = 119(0x77, float:1.67E-43)
            r37 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r28 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r18 = r1
        L_0x018b:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            xg.o r4 = xg.o.f77794a
            java.lang.String r5 = r2.a()
            java.lang.String r4 = r4.a(r5)
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r1, r4)
            java.lang.String r4 = r2.d()
            Eg.b r1 = r38.d()
            int r19 = r1.e()
            r1 = -960095254(0xffffffffc6c61bea, float:-25357.957)
            r11.W(r1)
            boolean r1 = r11.F(r7)
            java.lang.Object r8 = r11.D()
            if (r1 != 0) goto L_0x01bf
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x01c7
        L_0x01bf:
            xg.e r8 = new xg.e
            r8.<init>(r7)
            r11.u(r8)
        L_0x01c7:
            r21 = r8
            nI.l r21 = (nI.C17642l) r21
            r11.P()
            r1 = -960097732(0xffffffffc6c6123c, float:-25353.117)
            r11.W(r1)
            boolean r1 = r11.F(r7)
            java.lang.Object r8 = r11.D()
            if (r1 != 0) goto L_0x01e6
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x01ee
        L_0x01e6:
            xg.f r8 = new xg.f
            r8.<init>(r7)
            r11.u(r8)
        L_0x01ee:
            r23 = r8
            nI.l r23 = (nI.C17642l) r23
            r11.P()
            B0.z r29 = new B0.z
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 58
            r28 = 0
            r20 = r29
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r1 = -960108626(0xffffffffc6c5e7ae, float:-25331.84)
            r11.W(r1)
            r1 = r9 & 896(0x380, float:1.256E-42)
            if (r1 != r10) goto L_0x0214
            r1 = r12
            goto L_0x0215
        L_0x0214:
            r1 = 0
        L_0x0215:
            boolean r8 = r11.V(r2)
            r1 = r1 | r8
            java.lang.Object r8 = r11.D()
            if (r1 != 0) goto L_0x0228
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0230
        L_0x0228:
            xg.g r8 = new xg.g
            r8.<init>(r14, r2)
            r11.u(r8)
        L_0x0230:
            r2 = r8
            nI.l r2 = (nI.C17642l) r2
            r11.P()
            int r1 = r9 << 15
            r8 = 3670016(0x380000, float:5.142788E-39)
            r20 = r1 & r8
            r21 = 32
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r19
            r19 = r6
            r6 = r8
            r22 = r7
            r7 = r39
            r23 = 0
            r8 = r18
            r18 = r9
            r9 = r29
            r24 = r10
            r10 = r11
            r25 = r11
            r11 = r20
            r20 = r12
            r12 = r21
            SC.V2.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r17
            r9 = r18
            r6 = r19
            r12 = r20
            r7 = r22
            r8 = r23
            r10 = r24
            r11 = r25
            goto L_0x0120
        L_0x0272:
            r25 = r11
            r25.P()
            r25.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0283
            U0.C4895p.R()
        L_0x0283:
            U0.Y0 r1 = r25.n()
            if (r1 == 0) goto L_0x0291
            xg.h r2 = new xg.h
            r2.<init>(r0, r13, r14, r15)
            r1.a(r2)
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.n.m(Eg.c$a$c, boolean, nI.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C5626f fVar, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        C5626f.q(fVar, false, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C5626f fVar, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        fVar.d(d.f18832b.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(p pVar, b.a aVar, String str) {
        C17542s.j(str, "text");
        pVar.invoke(aVar.a(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(c.a.C0984c cVar, boolean z10, p pVar, int i10, C4889m mVar, int i11) {
        m(cVar, z10, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void r(Cg.a r21, boolean r22, nI.C17642l<? super Cg.a, XH.C16807N> r23, U0.C4889m r24, int r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = -1810378629(0xffffffff9417d07b, float:-7.664667E-27)
            r5 = r24
            U0.m r13 = r5.k(r4)
            r5 = r3 & 6
            r6 = 4
            if (r5 != 0) goto L_0x0021
            boolean r5 = r13.V(r0)
            if (r5 == 0) goto L_0x001e
            r5 = r6
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r5 = r5 | r3
            goto L_0x0022
        L_0x0021:
            r5 = r3
        L_0x0022:
            r7 = r3 & 48
            if (r7 != 0) goto L_0x0032
            boolean r7 = r13.b(r1)
            if (r7 == 0) goto L_0x002f
            r7 = 32
            goto L_0x0031
        L_0x002f:
            r7 = 16
        L_0x0031:
            r5 = r5 | r7
        L_0x0032:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0043
            boolean r7 = r13.F(r2)
            if (r7 == 0) goto L_0x0040
            r7 = r8
            goto L_0x0042
        L_0x0040:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r5 = r5 | r7
        L_0x0043:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r7 != r9) goto L_0x0055
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r13.L()
            goto L_0x00fa
        L_0x0055:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0061
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.inappfeedback.compose.RatingFace (SurveyScreen.kt:275)"
            U0.C4895p.S(r4, r5, r7, r9)
        L_0x0061:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            int r7 = com.ingka.ikea.app.inappfeedback.p.f71972a
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.t(r4, r7)
            r4 = 868581781(0x33c58195, float:9.197098E-8)
            r13.W(r4)
            r4 = r5 & 896(0x380, float:1.256E-42)
            r7 = 1
            r9 = 0
            if (r4 != r8) goto L_0x007c
            r4 = r7
            goto L_0x007d
        L_0x007c:
            r4 = r9
        L_0x007d:
            r5 = r5 & 14
            if (r5 != r6) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r7 = r9
        L_0x0083:
            r4 = r4 | r7
            java.lang.Object r5 = r13.D()
            if (r4 != 0) goto L_0x0092
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x009a
        L_0x0092:
            xg.j r5 = new xg.j
            r5.<init>(r2, r0)
            r13.u(r5)
        L_0x009a:
            r18 = r5
            nI.a r18 = (nI.C17631a) r18
            r13.P()
            r19 = 7
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.d.d(r14, r15, r16, r17, r18, r19, r20)
            int r4 = r21.b()
            t1.c r5 = J1.e.c(r4, r13, r9)
            int r4 = r21.a()
            java.lang.String r6 = J1.j.b(r4, r13, r9)
            if (r1 == 0) goto L_0x00d6
            r4 = 1156452591(0x44ee10ef, float:1904.5292)
            r13.W(r4)
            tK.v r4 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r13, r8)
            long r8 = r4.G0()
            r13.P()
            goto L_0x00eb
        L_0x00d6:
            r4 = 1156512111(0x44eef96f, float:1911.7948)
            r13.W(r4)
            tK.v r4 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r13, r8)
            long r8 = r4.J0()
            r13.P()
        L_0x00eb:
            r11 = 0
            r12 = 0
            r10 = r13
            O0.V.a(r5, r6, r7, r8, r10, r11, r12)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00fa
            U0.C4895p.R()
        L_0x00fa:
            U0.Y0 r4 = r13.n()
            if (r4 == 0) goto L_0x0108
            xg.k r5 = new xg.k
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.n.r(Cg.a, boolean, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar, Cg.a aVar) {
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(Cg.a aVar, boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        r(aVar, z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void u(Cg.a aVar, C15987c<? extends Cg.a> cVar, C17642l<? super Cg.a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1220557216);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1220557216, i11, -1, "com.ingka.ikea.app.inappfeedback.compose.RatingWithFaces (SurveyScreen.kt:252)");
            }
            androidx.compose.ui.d h10 = J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.d(), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            k10.W(1093002277);
            for (T t10 : C16877v.g1(cVar, new a())) {
                r(t10, C17542s.e(t10, aVar), lVar, k10, i11 & 896);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new i(aVar, cVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(Cg.a aVar, C15987c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        u(aVar, cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(java.lang.String r44, java.lang.String r45, Eg.c.a.C0984c r46, xg.C10396a r47, androidx.compose.ui.d r48, U0.C4889m r49, int r50, int r51) {
        /*
            r0 = r44
            r15 = r45
            r14 = r46
            r13 = r47
            r12 = r50
            r10 = 0
            r11 = 8
            r1 = 16
            r2 = 2
            r3 = 4
            java.lang.String r4 = "title"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "state"
            kotlin.jvm.internal.C17542s.j(r14, r4)
            java.lang.String r4 = "surveyCallbacks"
            kotlin.jvm.internal.C17542s.j(r13, r4)
            r4 = -649815241(0xffffffffd9449b37, float:-3.45873475E15)
            r5 = r49
            U0.m r9 = r5.k(r4)
            r7 = 1
            r5 = r51 & 1
            if (r5 == 0) goto L_0x0031
            r5 = r12 | 6
            goto L_0x0041
        L_0x0031:
            r5 = r12 & 6
            if (r5 != 0) goto L_0x0040
            boolean r5 = r9.V(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r3
            goto L_0x003e
        L_0x003d:
            r5 = r2
        L_0x003e:
            r5 = r5 | r12
            goto L_0x0041
        L_0x0040:
            r5 = r12
        L_0x0041:
            r6 = r51 & 2
            if (r6 == 0) goto L_0x0048
            r5 = r5 | 48
            goto L_0x0057
        L_0x0048:
            r6 = r12 & 48
            if (r6 != 0) goto L_0x0057
            boolean r6 = r9.V(r15)
            if (r6 == 0) goto L_0x0055
            r6 = 32
            goto L_0x0056
        L_0x0055:
            r6 = r1
        L_0x0056:
            r5 = r5 | r6
        L_0x0057:
            r6 = r51 & 4
            if (r6 == 0) goto L_0x005e
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x006e
            boolean r6 = r9.F(r14)
            if (r6 == 0) goto L_0x006b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r5 = r5 | r6
        L_0x006e:
            r6 = r51 & 8
            if (r6 == 0) goto L_0x0075
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r6 = r12 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0085
            boolean r6 = r9.V(r13)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r5 = r5 | r6
        L_0x0085:
            r6 = r51 & 16
            if (r6 == 0) goto L_0x008e
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r8 = r48
            goto L_0x00a1
        L_0x008e:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x008b
            r8 = r48
            boolean r16 = r9.V(r8)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r5 = r5 | r16
        L_0x00a1:
            r11 = r5 & 9363(0x2493, float:1.312E-41)
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r1) goto L_0x00b6
            boolean r1 = r9.l()
            if (r1 != 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            r9.L()
            r5 = r8
            r1 = r9
            r9 = r14
            goto L_0x03be
        L_0x00b6:
            if (r6 == 0) goto L_0x00bc
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r11 = r1
            goto L_0x00bd
        L_0x00bc:
            r11 = r8
        L_0x00bd:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c9
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.app.inappfeedback.compose.SurveyContent (SurveyScreen.kt:112)"
            U0.C4895p.S(r4, r5, r1, r6)
        L_0x00c9:
            Eg.a r1 = r46.b()
            Cg.a r6 = r1.e()
            r1 = 5
            Cg.a[] r1 = new Cg.a[r1]
            Cg.a$c r4 = Cg.a.c.f58998d
            r1[r10] = r4
            Cg.a$e r4 = Cg.a.e.f59002d
            r1[r7] = r4
            Cg.a$d r4 = Cg.a.d.f59000d
            r1[r2] = r4
            Cg.a$b r2 = Cg.a.b.f58996d
            r4 = 3
            r1[r4] = r2
            Cg.a$a r2 = Cg.a.C0970a.f58994d
            r1[r3] = r2
            KJ.f r3 = KJ.C15985a.b(r1)
            java.lang.String r1 = "SurveyTestTags.CONTAINER"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r11, r1)
            r4 = 0
            r8 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r4, r7, r8)
            androidx.compose.ui.d r1 = TC.e.i(r1)
            r2 = 16
            float r2 = (float) r2
            float r10 = c2.h.B(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r4, r10, r7, r8)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r10.g()
            i1.c$a r18 = i1.C5437c.f24302a
            i1.c$b r4 = r18.k()
            r7 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r10, r4, r9, r7)
            int r10 = U0.C4883j.a(r9, r7)
            U0.y r7 = r9.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r9, r1)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r8 = r18.a()
            U0.f r20 = r9.m()
            if (r20 != 0) goto L_0x0134
            U0.C4883j.c()
        L_0x0134:
            r9.I()
            boolean r20 = r9.i()
            if (r20 == 0) goto L_0x0141
            r9.p(r8)
            goto L_0x0144
        L_0x0141:
            r9.t()
        L_0x0144:
            U0.m r8 = U0.F1.a(r9)
            nI.p r0 = r18.c()
            U0.F1.c(r8, r4, r0)
            nI.p r0 = r18.e()
            U0.F1.c(r8, r7, r0)
            nI.p r0 = r18.b()
            boolean r4 = r8.i()
            if (r4 != 0) goto L_0x016e
            java.lang.Object r4 = r8.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x017c
        L_0x016e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r8.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r8.w(r4, r0)
        L_0x017c:
            nI.p r0 = r18.d()
            U0.F1.c(r8, r1, r0)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 24
            float r10 = (float) r1
            float r24 = c2.h.B(r10)
            r25 = 7
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            r38 = r2
            r2 = r1
            TC.b$b$c r1 = TC.C13679b.C2857b.c.f116685a
            S1.C$a r4 = S1.C.f13316b
            S1.C r8 = r4.a()
            r7 = 0
            r4 = r5 & 14
            r18 = 1573296(0x1801b0, float:2.204657E-39)
            r23 = r4 | r18
            r24 = 0
            r25 = 262072(0x3ffb8, float:3.67241E-40)
            r18 = 0
            r39 = r3
            r3 = r18
            r40 = r5
            r41 = r6
            r5 = r18
            r18 = 0
            r17 = 0
            r7 = r18
            r48 = r9
            r9 = r18
            r18 = 0
            r43 = r10
            r42 = r11
            r10 = r18
            r16 = 0
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r49 = r0
            r0 = r44
            r22 = r48
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 339441833(0x143b78a9, float:9.464883E-27)
            r15 = r48
            r15.W(r0)
            if (r45 != 0) goto L_0x0200
            r48 = r15
            goto L_0x024b
        L_0x0200:
            float r24 = c2.h.B(r43)
            r25 = 7
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r49
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            tK.v r0 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r15, r3)
            long r3 = r0.G0()
            r24 = 0
            r25 = 262128(0x3fff0, float:3.6732E-40)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 432(0x1b0, float:6.05E-43)
            r48 = r0
            r0 = r45
            r22 = r48
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x024b:
            r48.P()
            nI.l r0 = r47.c()
            r1 = r48
            r3 = r39
            r2 = r41
            r4 = 0
            u(r2, r3, r0, r1, r4)
            r0 = 339455673(0x143baeb9, float:9.475545E-27)
            r1.W(r0)
            boolean r0 = r46.c()
            r5 = r49
            if (r0 == 0) goto L_0x02e3
            r0 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r5, r2, r0, r3)
            float r8 = c2.h.B(r43)
            r7 = 8
            float r7 = (float) r7
            float r10 = c2.h.B(r7)
            r11 = 5
            r12 = 0
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Integer r6 = r46.a()
            r7 = 339462782(0x143bca7e, float:9.481022E-27)
            r1.W(r7)
            if (r6 != 0) goto L_0x0292
            r8 = r3
            goto L_0x029a
        L_0x0292:
            int r6 = r6.intValue()
            java.lang.String r8 = J1.j.b(r6, r1, r4)
        L_0x029a:
            r1.P()
            if (r8 != 0) goto L_0x02a3
            java.lang.String r6 = ""
            r12 = r6
            goto L_0x02a4
        L_0x02a3:
            r12 = r8
        L_0x02a4:
            TC.b$a$b r13 = TC.C13679b.a.C2856b.f116680a
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r1, r7)
            long r15 = r6.G0()
            Y1.j$a r6 = Y1.j.f14783b
            int r6 = r6.a()
            Y1.j r25 = Y1.j.h(r6)
            r36 = 0
            r37 = 261104(0x3fbf0, float:3.65885E-40)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 432(0x1b0, float:6.05E-43)
            r34 = r1
            SC.C13607l.j(r12, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x02e6
        L_0x02e3:
            r0 = 1
            r2 = 0
            r3 = 0
        L_0x02e6:
            r1.P()
            r6 = 339471082(0x143beaea, float:9.487416E-27)
            r1.W(r6)
            Eg.b r6 = r46.d()
            java.util.List r6 = r6.f()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0316
            nI.p r6 = r47.b()
            Eg.a r7 = r46.b()
            boolean r7 = r7.f()
            r7 = r7 ^ r0
            int r8 = r40 >> 6
            r8 = r8 & 14
            r9 = r46
            m(r9, r7, r6, r1, r8)
            goto L_0x0318
        L_0x0316:
            r9 = r46
        L_0x0318:
            r1.P()
            Eg.a r6 = r46.b()
            boolean r6 = r6.f()
            if (r6 == 0) goto L_0x032c
            int r6 = com.ingka.ikea.app.inappfeedback.s.f71979a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            goto L_0x0344
        L_0x032c:
            Eg.b r6 = r46.d()
            java.util.List r6 = r6.f()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0343
            int r6 = Oo.b.f84696k8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            goto L_0x0344
        L_0x0343:
            r8 = r3
        L_0x0344:
            r6 = 339487679(0x143c2bbf, float:9.500202E-27)
            r1.W(r6)
            if (r8 != 0) goto L_0x034d
            goto L_0x03ad
        L_0x034d:
            int r6 = r8.intValue()
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r5, r2, r0, r3)
            float r12 = c2.h.B(r43)
            float r14 = c2.h.B(r38)
            r15 = 5
            r16 = 0
            r11 = 0
            r13 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.D.m(r10, r11, r12, r13, r14, r15, r16)
            nI.a r21 = r47.a()
            java.lang.String r12 = J1.j.b(r6, r1, r4)
            SC.N r15 = SC.N.Primary
            Eg.a r2 = r46.b()
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0383
            int r2 = uK.C18146a.f148601q1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r18 = r2
            goto L_0x0385
        L_0x0383:
            r18 = r3
        L_0x0385:
            Eg.a r2 = r46.b()
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x039b
            Eg.a r2 = r46.b()
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x039b
            r14 = r0
            goto L_0x039c
        L_0x039b:
            r14 = r4
        L_0x039c:
            r23 = 3120(0xc30, float:4.372E-42)
            r24 = 432(0x1b0, float:6.05E-43)
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = r1
            SC.L.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x03ad:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03bc
            U0.C4895p.R()
        L_0x03bc:
            r5 = r42
        L_0x03be:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x03d9
            xg.b r10 = new xg.b
            r0 = r10
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r6 = r50
            r7 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.n.w(java.lang.String, java.lang.String, Eg.c$a$c, xg.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(String str, String str2, c.a.C0984c cVar, C10396a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        w(str, str2, cVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void y(c cVar, String str, String str2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(cVar, "viewModel");
        C17542s.j(str, "title");
        C4889m k10 = mVar.k(1487908939);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.V(str2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1487908939, i11, -1, "com.ingka.ikea.app.inappfeedback.compose.SurveyScreen (SurveyScreen.kt:59)");
            }
            c.a z10 = z(p1.b(cVar.m(), (C17168i) null, k10, 0, 1));
            if (!C17542s.e(z10, c.a.C0983a.f60243b) && !C17542s.e(z10, c.a.b.f60244b)) {
                if (z10 instanceof c.a.C0984c) {
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    c.a.C0984c cVar2 = (c.a.C0984c) z10;
                    k10.W(-331752590);
                    boolean F10 = k10.F(cVar);
                    Object D10 = k10.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new l(cVar);
                        k10.u(D10);
                    }
                    p pVar = (p) D10;
                    k10.P();
                    k10.W(-331741520);
                    boolean F11 = k10.F(cVar);
                    Object D11 = k10.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new m(cVar);
                        k10.u(D11);
                    }
                    C17642l lVar = (C17642l) D11;
                    k10.P();
                    k10.W(-331745073);
                    boolean F12 = k10.F(cVar);
                    Object D12 = k10.D();
                    if (F12 || D12 == C4889m.f14007a.a()) {
                        D12 = new c(cVar);
                        k10.u(D12);
                    }
                    k10.P();
                    int i12 = i11 >> 3;
                    w(str, str2, cVar2, new C10396a(pVar, lVar, (C17631a) D12), aVar, k10, (i12 & 14) | 24576 | (i12 & 112), 0);
                } else {
                    throw new t();
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(cVar, str, str2, i10));
        }
    }

    private static final c.a z(A1<? extends c.a> a12) {
        return (c.a) a12.getValue();
    }
}
