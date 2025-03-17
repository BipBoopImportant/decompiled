package zf;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import com.ingka.ikea.app.browseandsearch.browseV2.b;
import com.ingka.ikea.core.model.Category;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import s0.C5858d;
import s0.C5859e;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import yf.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ag\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0013\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu0/C;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "section", "Lkotlin/Function1;", "Lyf/g;", "LXH/N;", "onTabSelected", "Lcom/ingka/ikea/core/model/Category;", "onCategoryClicked", "Lkotlin/Function0;", "onMoreCategoriesClicked", "onOfferHubClicked", "", "categoriesPerRow", "h", "(Lu0/C;Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;LnI/l;LnI/l;LnI/a;LnI/a;I)V", "LBf/a;", "staticImagesState", "onClicked", "e", "(LBf/a;LnI/a;LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.f  reason: case insensitive filesystem */
public final class C10520f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f$a */
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bf.a f78257b;

        a(C17631a<C16807N> aVar, Bf.a aVar2) {
            this.f78256a = aVar;
            this.f78257b = aVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5859e r38, U0.C4889m r39, int r40) {
            /*
                r37 = this;
                r0 = r37
                r1 = r38
                r15 = r39
                java.lang.String r2 = "$this$BoxWithConstraints"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r40 & 6
                r14 = 2
                if (r2 != 0) goto L_0x001c
                boolean r2 = r15.V(r1)
                if (r2 == 0) goto L_0x0018
                r2 = 4
                goto L_0x0019
            L_0x0018:
                r2 = r14
            L_0x0019:
                r2 = r40 | r2
                goto L_0x001e
            L_0x001c:
                r2 = r40
            L_0x001e:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x0030
                boolean r3 = r39.l()
                if (r3 != 0) goto L_0x002b
                goto L_0x0030
            L_0x002b:
                r39.L()
                goto L_0x0406
            L_0x0030:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003f
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.OfferHubEntryCard.<anonymous> (BrowseCategoriesComposables.kt:153)"
                r5 = -1122652653(0xffffffffbd15ae13, float:-0.036542963)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003f:
                float r1 = r38.c()
                r2 = 600(0x258, float:8.41E-43)
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                int r1 = c2.h.v(r1, r2)
                r2 = 1
                r13 = 0
                if (r1 >= 0) goto L_0x0055
                r27 = r2
                goto L_0x0057
            L_0x0055:
                r27 = r13
            L_0x0057:
                androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
                r1 = 16
                float r1 = (float) r1
                float r3 = c2.h.B(r1)
                r9 = 0
                r12 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r11, r3, r9, r14, r12)
                s0.z r4 = s0.C5880z.Max
                androidx.compose.ui.d r16 = androidx.compose.foundation.layout.x.a(r3, r4)
                tK.v r10 = tK.C18030v.f147664a
                int r8 = tK.C18030v.f147665b
                tK.h r3 = r10.a(r15, r8)
                long r17 = r3.l0()
                r20 = 2
                r21 = 0
                r19 = 0
                androidx.compose.ui.d r28 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
                r3 = -1506980154(0xffffffffa62d4ec6, float:-6.012819E-16)
                r15.W(r3)
                nI.a<XH.N> r3 = r0.f78256a
                boolean r3 = r15.V(r3)
                nI.a<XH.N> r4 = r0.f78256a
                java.lang.Object r5 = r39.D()
                if (r3 != 0) goto L_0x009e
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x00a6
            L_0x009e:
                zf.e r5 = new zf.e
                r5.<init>(r4)
                r15.u(r5)
            L_0x00a6:
                r32 = r5
                nI.a r32 = (nI.C17631a) r32
                r39.P()
                r33 = 7
                r34 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.d.d(r28, r29, r30, r31, r32, r33, r34)
                Bf.a r7 = r0.f78257b
                androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$e r4 = r16.f()
                i1.c$a r28 = i1.C5437c.f24302a
                i1.c$c r5 = r28.l()
                E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r5, r15, r13)
                int r5 = U0.C4883j.a(r15, r13)
                U0.y r6 = r39.s()
                androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
                G1.g$a r29 = G1.C4504g.f6515W
                nI.a r14 = r29.a()
                U0.f r18 = r39.m()
                if (r18 != 0) goto L_0x00e8
                U0.C4883j.c()
            L_0x00e8:
                r39.I()
                boolean r18 = r39.i()
                if (r18 == 0) goto L_0x00f5
                r15.p(r14)
                goto L_0x00f8
            L_0x00f5:
                r39.t()
            L_0x00f8:
                U0.m r14 = U0.F1.a(r39)
                nI.p r13 = r29.c()
                U0.F1.c(r14, r4, r13)
                nI.p r4 = r29.e()
                U0.F1.c(r14, r6, r4)
                nI.p r4 = r29.b()
                boolean r6 = r14.i()
                if (r6 != 0) goto L_0x0122
                java.lang.Object r6 = r14.D()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r13)
                if (r6 != 0) goto L_0x0130
            L_0x0122:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r14.u(r6)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r14.w(r5, r4)
            L_0x0130:
                nI.p r4 = r29.d()
                U0.F1.c(r14, r3, r4)
                s0.N r30 = s0.C5843N.f28726a
                r13 = 2
                r14 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r3 = r30
                r4 = r11
                r31 = r7
                r7 = r13
                r13 = r8
                r8 = r14
                androidx.compose.ui.d r3 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.d(r3, r9, r2, r12)
                androidx.compose.foundation.layout.d$m r3 = r16.g()
                i1.c$b r4 = r28.k()
                r5 = 0
                E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r15, r5)
                int r4 = U0.C4883j.a(r15, r5)
                U0.y r5 = r39.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r15, r2)
                nI.a r6 = r29.a()
                U0.f r7 = r39.m()
                if (r7 != 0) goto L_0x0174
                U0.C4883j.c()
            L_0x0174:
                r39.I()
                boolean r7 = r39.i()
                if (r7 == 0) goto L_0x0181
                r15.p(r6)
                goto L_0x0184
            L_0x0181:
                r39.t()
            L_0x0184:
                U0.m r6 = U0.F1.a(r39)
                nI.p r7 = r29.c()
                U0.F1.c(r6, r3, r7)
                nI.p r3 = r29.e()
                U0.F1.c(r6, r5, r3)
                nI.p r3 = r29.b()
                boolean r5 = r6.i()
                if (r5 != 0) goto L_0x01ae
                java.lang.Object r5 = r6.D()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
                if (r5 != 0) goto L_0x01bc
            L_0x01ae:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r6.w(r4, r3)
            L_0x01bc:
                nI.p r3 = r29.d()
                U0.F1.c(r6, r2, r3)
                s0.h r9 = s0.C5862h.f28810a
                int r2 = uK.C18146a.f148481i3
                r3 = 0
                t1.c r2 = J1.e.c(r2, r15, r3)
                tK.h r3 = r10.a(r15, r13)
                long r4 = r3.x0()
                float r1 = c2.h.B(r1)
                r3 = 24
                float r14 = (float) r3
                float r3 = c2.h.B(r14)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.j(r11, r3, r1)
                r3 = 40
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.t(r1, r3)
                A0.f r3 = A0.g.h()
                androidx.compose.ui.d r18 = m1.e.a(r1, r3)
                tK.h r1 = r10.a(r15, r13)
                long r19 = r1.F0()
                r22 = 2
                r23 = 0
                r21 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r18, r19, r21, r22, r23)
                r3 = 8
                float r8 = (float) r3
                float r3 = c2.h.B(r8)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.i(r1, r3)
                r7 = 48
                r16 = 0
                r6 = 0
                r1 = r2
                r2 = r6
                r6 = r39
                r32 = r8
                r8 = r16
                O0.V.a(r1, r2, r3, r4, r6, r7, r8)
                r7 = 2
                r8 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r3 = r9
                r4 = r11
                androidx.compose.ui.d r1 = s0.C5861g.c(r3, r4, r5, r6, r7, r8)
                r9 = 0
                s0.C5844O.a(r1, r15, r9)
                int r1 = Oo.b.f84562Y4
                java.lang.String r1 = J1.j.b(r1, r15, r9)
                TC.b$a$b r2 = TC.C13679b.a.C2856b.f116680a
                float r3 = c2.h.B(r14)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.i(r11, r3)
                tK.h r4 = r10.a(r15, r13)
                long r4 = r4.G0()
                r25 = 0
                r26 = 262128(0x3fff0, float:3.6732E-40)
                r6 = 0
                r16 = 0
                r18 = r9
                r9 = r16
                r35 = r10
                r10 = r16
                r19 = 0
                r38 = r11
                r11 = r19
                r36 = r13
                r13 = r16
                r33 = r14
                r14 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 432(0x1b0, float:6.05E-43)
                r23 = r39
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r39.x()
                r1 = 196656(0x30030, float:2.75574E-40)
                java.lang.String r2 = ""
                r9 = 156(0x9c, float:2.19E-43)
                if (r27 == 0) goto L_0x03a2
                r3 = -1603226589(0xffffffffa070b423, float:-2.0388393E-19)
                r15 = r39
                r15.W(r3)
                r7 = 2
                r8 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r3 = r30
                r4 = r38
                androidx.compose.ui.d r3 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                float r4 = (float) r9
                float r4 = c2.h.B(r4)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r4)
                androidx.compose.ui.d r3 = m1.e.b(r3)
                i1.c r4 = r28.n()
                r5 = 0
                E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r5)
                int r6 = U0.C4883j.a(r15, r5)
                U0.y r7 = r39.s()
                androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
                nI.a r8 = r29.a()
                U0.f r9 = r39.m()
                if (r9 != 0) goto L_0x02ce
                U0.C4883j.c()
            L_0x02ce:
                r39.I()
                boolean r9 = r39.i()
                if (r9 == 0) goto L_0x02db
                r15.p(r8)
                goto L_0x02de
            L_0x02db:
                r39.t()
            L_0x02de:
                U0.m r8 = U0.F1.a(r39)
                nI.p r9 = r29.c()
                U0.F1.c(r8, r4, r9)
                nI.p r4 = r29.e()
                U0.F1.c(r8, r7, r4)
                nI.p r4 = r29.b()
                boolean r7 = r8.i()
                if (r7 != 0) goto L_0x0308
                java.lang.Object r7 = r8.D()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
                if (r7 != 0) goto L_0x0316
            L_0x0308:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8.u(r7)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8.w(r6, r4)
            L_0x0316:
                nI.p r4 = r29.d()
                U0.F1.c(r8, r3, r4)
                androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
                if (r31 == 0) goto L_0x0326
                java.lang.String r12 = r31.b()
                goto L_0x0327
            L_0x0326:
                r12 = 0
            L_0x0327:
                if (r12 != 0) goto L_0x032a
                r12 = r2
            L_0x032a:
                LC.b$a r4 = LC.C13178b.a.f111818a
                float r2 = c2.h.B(r33)
                r3 = -24
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                r6 = r38
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.A.b(r6, r2, r3)
                r3 = 178(0xb2, float:2.5E-43)
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r2, r3)
                r3 = 1065353216(0x3f800000, float:1.0)
                r6 = 2
                r7 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.C5074e.b(r2, r3, r5, r6, r7)
                float r3 = c2.h.B(r32)
                r5 = r35
                r6 = r36
                tK.h r5 = r5.a(r15, r6)
                long r5 = r5.k0()
                A0.f r7 = A0.g.h()
                androidx.compose.ui.d r2 = n0.C5599e.g(r2, r3, r5, r7)
                float r3 = c2.h.B(r32)
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r2, r3)
                A0.f r3 = A0.g.h()
                androidx.compose.ui.d r3 = m1.e.a(r2, r3)
                E1.k$a r2 = E1.C4478k.f5915a
                E1.k r6 = r2.a()
                int r2 = LC.C13178b.a.f111819b
                int r2 = r2 << 9
                r14 = r2 | r1
                r16 = 0
                r17 = 4048(0xfd0, float:5.672E-42)
                r2 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r1 = r12
                r12 = r13
                r13 = r39
                r15 = r16
                r16 = r17
                LC.h.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r39.x()
                r39.P()
                goto L_0x03fa
            L_0x03a2:
                r6 = r38
                r7 = 0
                r3 = -1602091586(0xffffffffa08205be, float:-2.2026656E-19)
                r15 = r39
                r15.W(r3)
                if (r31 == 0) goto L_0x03b4
                java.lang.String r12 = r31.a()
                goto L_0x03b5
            L_0x03b4:
                r12 = r7
            L_0x03b5:
                if (r12 != 0) goto L_0x03b8
                r12 = r2
            L_0x03b8:
                LC.b$a r10 = LC.C13178b.a.f111818a
                r7 = 2
                r8 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r2 = 0
                r3 = r30
                r4 = r6
                r6 = r2
                androidx.compose.ui.d r2 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                float r3 = (float) r9
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r2, r3)
                E1.k$a r2 = E1.C4478k.f5915a
                E1.k r6 = r2.a()
                int r2 = LC.C13178b.a.f111819b
                int r2 = r2 << 9
                r14 = r2 | r1
                r16 = 0
                r17 = 4048(0xfd0, float:5.672E-42)
                r2 = 0
                r5 = 0
                r7 = 0
                r9 = 0
                r11 = 0
                r13 = 0
                r18 = 0
                r1 = r12
                r4 = r10
                r10 = r11
                r11 = r13
                r12 = r18
                r13 = r39
                r15 = r16
                r16 = r17
                LC.h.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r39.P()
            L_0x03fa:
                r39.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0406
                U0.C4895p.R()
            L_0x0406:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.C10520f.a.b(s0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f$b */
    static final class b implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f78258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<g, C16807N> f78259b;

        b(b.a aVar, C17642l<? super g, C16807N> lVar) {
            this.f78258a = aVar;
            this.f78259b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, b.a aVar, int i10) {
            lVar.invoke(aVar.e().get(i10).b());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(u0.C5991o r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r1 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r11, r1)
                r1 = r13 & 17
                r2 = 16
                if (r1 != r2) goto L_0x0017
                boolean r1 = r12.l()
                if (r1 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r12.L()
                goto L_0x00dc
            L_0x0017:
                boolean r1 = U0.C4895p.J()
                r3 = -1
                if (r1 == 0) goto L_0x0026
                r1 = -855267286(0xffffffffcd05a82a, float:-1.40149408E8)
                java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.categoriesAndRooms.<anonymous> (BrowseCategoriesComposables.kt:73)"
                U0.C4895p.S(r1, r13, r3, r4)
            L_0x0026:
                r0 = -2028043330(0xffffffff871e83be, float:-1.1925314E-34)
                r12.W(r0)
                com.ingka.ikea.app.browseandsearch.browseV2.b$a r0 = r10.f78258a
                KJ.c r0 = r0.e()
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = YH.C16877v.y(r0, r4)
                r1.<init>(r4)
                java.util.Iterator r0 = r0.iterator()
            L_0x0041:
                boolean r4 = r0.hasNext()
                r5 = 2
                r7 = 0
                r8 = 0
                if (r4 == 0) goto L_0x0061
                java.lang.Object r4 = r0.next()
                com.ingka.ikea.app.browseandsearch.browseV2.b$a$a r4 = (com.ingka.ikea.app.browseandsearch.browseV2.b.a.C1212a) r4
                SC.P2 r9 = new SC.P2
                int r4 = r4.a()
                java.lang.String r4 = J1.j.b(r4, r12, r7)
                r9.<init>(r4, r8, r5, r8)
                r1.add(r9)
                goto L_0x0041
            L_0x0061:
                r12.P()
                KJ.f r0 = KJ.C15985a.l(r1)
                com.ingka.ikea.app.browseandsearch.browseV2.b$a r1 = r10.f78258a
                KJ.c r1 = r1.e()
                java.util.Iterator r1 = r1.iterator()
            L_0x0072:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0089
                java.lang.Object r4 = r1.next()
                com.ingka.ikea.app.browseandsearch.browseV2.b$a$a r4 = (com.ingka.ikea.app.browseandsearch.browseV2.b.a.C1212a) r4
                boolean r4 = r4.c()
                if (r4 == 0) goto L_0x0086
                r4 = r7
                goto L_0x008a
            L_0x0086:
                int r7 = r7 + 1
                goto L_0x0072
            L_0x0089:
                r4 = r3
            L_0x008a:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                r3 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r1, r2, r3, r5, r8)
                r1 = -2028032291(0xffffffff871eaedd, float:-1.1937987E-34)
                r12.W(r1)
                nI.l<yf.g, XH.N> r1 = r10.f78259b
                boolean r1 = r12.V(r1)
                com.ingka.ikea.app.browseandsearch.browseV2.b$a r3 = r10.f78258a
                boolean r3 = r12.F(r3)
                r1 = r1 | r3
                nI.l<yf.g, XH.N> r3 = r10.f78259b
                com.ingka.ikea.app.browseandsearch.browseV2.b$a r5 = r10.f78258a
                java.lang.Object r7 = r12.D()
                if (r1 != 0) goto L_0x00bb
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r7 != r1) goto L_0x00c3
            L_0x00bb:
                zf.g r7 = new zf.g
                r7.<init>(r3, r5)
                r12.u(r7)
            L_0x00c3:
                r1 = r7
                nI.l r1 = (nI.C17642l) r1
                r12.P()
                r7 = 384(0x180, float:5.38E-43)
                r8 = 40
                r3 = 0
                r5 = 0
                r6 = r12
                SC.T2.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x00dc
                U0.C4895p.R()
            L_0x00dc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.C10520f.b.b(u0.o, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f$c */
    static final class c implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f78260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78261b;

        c(b.a aVar, C17631a<C16807N> aVar2) {
            this.f78260a = aVar;
            this.f78261b = aVar2;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-493522513, i10, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.categoriesAndRooms.<anonymous> (BrowseCategoriesComposables.kt:95)");
                }
                C10520f.e(this.f78260a.d(), this.f78261b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f$d */
    static final class d implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Category f78262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Category, C16807N> f78263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f78264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f78265d;

        d(Category category, C17642l<? super Category, C16807N> lVar, int i10, int i11) {
            this.f78262a = category;
            this.f78263b = lVar;
            this.f78264c = i10;
            this.f78265d = i11;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1685581775, i10, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.categoriesAndRooms.<anonymous>.<anonymous> (BrowseCategoriesComposables.kt:107)");
                }
                Category category = this.f78262a;
                C17642l<Category, C16807N> lVar = this.f78263b;
                d.a aVar = androidx.compose.ui.d.f18749a;
                float B10 = h.B(this.f78264c % this.f78265d == 0 ? (float) 16 : (float) 0);
                int i11 = this.f78264c;
                int i12 = this.f78265d;
                X.c(category, lVar, D.m(aVar, B10, 0.0f, h.B(i11 % i12 == i12 + -1 ? (float) 16 : (float) 0), 0.0f, 10, (Object) null), mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f$e */
    static final class e implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78266a;

        e(C17631a<C16807N> aVar) {
            this.f78266a = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(u0.C5991o r28, U0.C4889m r29, int r30) {
            /*
                r27 = this;
                r0 = r27
                r15 = r29
                r1 = r30
                java.lang.String r2 = "$this$item"
                r3 = r28
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r29.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r29.L()
                goto L_0x016d
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.categoriesAndRooms.<anonymous> (BrowseCategoriesComposables.kt:125)"
                r5 = 1993919384(0x76d8cb98, float:2.1985654E33)
                U0.C4895p.S(r5, r1, r2, r4)
            L_0x002e:
                androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
                float r1 = (float) r3
                float r1 = c2.h.B(r1)
                r2 = 2
                r3 = 0
                r4 = 0
                androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r7, r1, r4, r2, r3)
                tK.v r1 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r1 = r1.a(r15, r2)
                long r9 = r1.l0()
                r12 = 2
                r13 = 0
                r11 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
                r1 = -2027979254(0xffffffff871f7e0a, float:-1.199887E-34)
                r15.W(r1)
                nI.a<XH.N> r1 = r0.f78266a
                boolean r1 = r15.V(r1)
                nI.a<XH.N> r2 = r0.f78266a
                java.lang.Object r3 = r29.D()
                if (r1 != 0) goto L_0x006b
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0073
            L_0x006b:
                zf.h r3 = new zf.h
                r3.<init>(r2)
                r15.u(r3)
            L_0x0073:
                r20 = r3
                nI.a r20 = (nI.C17631a) r20
                r29.P()
                r21 = 7
                r22 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
                r2 = 24
                float r2 = (float) r2
                float r3 = c2.h.B(r2)
                float r2 = c2.h.B(r2)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.j(r1, r3, r2)
                androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$e r2 = r2.f()
                i1.c$a r3 = i1.C5437c.f24302a
                i1.c$c r3 = r3.l()
                r14 = 0
                E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r15, r14)
                int r3 = U0.C4883j.a(r15, r14)
                U0.y r4 = r29.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
                G1.g$a r5 = G1.C4504g.f6515W
                nI.a r6 = r5.a()
                U0.f r8 = r29.m()
                if (r8 != 0) goto L_0x00c3
                U0.C4883j.c()
            L_0x00c3:
                r29.I()
                boolean r8 = r29.i()
                if (r8 == 0) goto L_0x00d0
                r15.p(r6)
                goto L_0x00d3
            L_0x00d0:
                r29.t()
            L_0x00d3:
                U0.m r6 = U0.F1.a(r29)
                nI.p r8 = r5.c()
                U0.F1.c(r6, r2, r8)
                nI.p r2 = r5.e()
                U0.F1.c(r6, r4, r2)
                nI.p r2 = r5.b()
                boolean r4 = r6.i()
                if (r4 != 0) goto L_0x00fd
                java.lang.Object r4 = r6.D()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
                if (r4 != 0) goto L_0x010b
            L_0x00fd:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r6.u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6.w(r3, r2)
            L_0x010b:
                nI.p r2 = r5.d()
                U0.F1.c(r6, r1, r2)
                s0.N r6 = s0.C5843N.f28726a
                int r1 = wf.C10366b.f77640a
                java.lang.String r1 = J1.j.b(r1, r15, r14)
                TC.b$a$b r2 = TC.C13679b.a.C2856b.f116680a
                r10 = 2
                r11 = 0
                r8 = 1065353216(0x3f800000, float:1.0)
                r9 = 0
                androidx.compose.ui.d r3 = s0.C5842M.e(r6, r7, r8, r9, r10, r11)
                r25 = 0
                r26 = 262136(0x3fff8, float:3.67331E-40)
                r4 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r16 = 0
                r14 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 48
                r23 = r29
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                int r1 = uK.C18146a.f148111K1
                r9 = r29
                r2 = 0
                t1.c r1 = J1.e.c(r1, r9, r2)
                r7 = 48
                r8 = 12
                r2 = 0
                r3 = 0
                r6 = r29
                O0.V.a(r1, r2, r3, r4, r6, r7, r8)
                r29.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x016d
                U0.C4895p.R()
            L_0x016d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.C10520f.e.b(u0.o, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void e(Bf.a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-412657495);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-412657495, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.OfferHubEntryCard (BrowseCategoriesComposables.kt:151)");
            }
            C5858d.a((androidx.compose.ui.d) null, (C5437c) null, false, c1.c.e(-1122652653, true, new a(aVar2, aVar), k10, 54), k10, 3072, 7);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10516d(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Bf.a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        e(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C5968C c10, b.a aVar, C17642l<? super g, C16807N> lVar, C17642l<? super Category, C16807N> lVar2, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, int i10) {
        C5968C c11 = c10;
        b.a aVar4 = aVar;
        C17642l<? super g, C16807N> lVar3 = lVar;
        C17642l<? super Category, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        C17542s.j(c11, "<this>");
        C17542s.j(aVar4, "section");
        C17542s.j(lVar3, "onTabSelected");
        C17542s.j(lVar4, "onCategoryClicked");
        C17542s.j(aVar5, "onMoreCategoriesClicked");
        C17542s.j(aVar6, "onOfferHubClicked");
        c11.d("Tabs", new C10510a(), "Tabs", c1.c.c(-855267286, true, new b(aVar4, lVar3)));
        if (aVar.c()) {
            c11.d("OfferHubEntry", new C10512b(), "OfferHubEntry", c1.c.c(-493522513, true, new c(aVar4, aVar6)));
        }
        int i11 = 0;
        for (T next : aVar.a()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            C5968C.f(c10, "Category:" + i11, (C17642l) null, "Category", c1.c.c(-1685581775, true, new d((Category) next, lVar4, i11, i10)), 2, (Object) null);
            i11 = i12;
        }
        if (aVar.b()) {
            c11.d("ShowMoreCategories", new C10514c(), "ShowMoreCategories", c1.c.c(1993919384, true, new e(aVar5)));
        }
    }

    /* access modifiers changed from: private */
    public static final C5979c i(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }

    /* access modifiers changed from: private */
    public static final C5979c j(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }

    /* access modifiers changed from: private */
    public static final C5979c k(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }
}
