package Pi;

import J1.j;
import Li.c;
import Mi.C10767b;
import Mi.m;
import O0.F0;
import Oo.b;
import SC.C13656x1;
import SC.C13660y1;
import SC.C13664z1;
import SC.J;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5848T;
import uK.C18146a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LO0/F0;", "bottomSheetState", "LMi/m;", "sortByDialogItem", "Lkotlin/Function0;", "LXH/N;", "onHideBottomSheet", "Lkotlin/Function1;", "LLi/c;", "onSortSelected", "c", "(LO0/F0;LMi/m;LnI/a;LnI/l;LU0/m;I)V", "LMi/b;", "filterValue", "selectedFilterValue", "Landroidx/compose/ui/d;", "modifier", "e", "(LMi/b;LMi/b;Landroidx/compose/ui/d;LU0/m;II)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f85432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<c, C16807N> f85434c;

        a(m mVar, C17631a<C16807N> aVar, C17642l<? super c, C16807N> lVar) {
            this.f85432a = mVar;
            this.f85433b = aVar;
            this.f85434c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar, C10767b bVar, m mVar, C17642l lVar) {
            aVar.invoke();
            if (!C17542s.e(bVar, mVar.c())) {
                lVar.invoke(new c(mVar.b().b(), bVar.b()));
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r23, int r24) {
            /*
                r22 = this;
                r0 = r22
                r8 = r23
                r1 = r24
                r9 = 1
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0018
                boolean r2 = r23.l()
                if (r2 != 0) goto L_0x0013
                goto L_0x0018
            L_0x0013:
                r23.L()
                goto L_0x018d
            L_0x0018:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0027
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SortBottomSheet.<anonymous> (SortBottomSheet.kt:51)"
                r4 = 1674263569(0x63cb3c11, float:7.4980346E21)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0027:
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                r1 = 0
                androidx.compose.foundation.o r11 = androidx.compose.foundation.m.c(r1, r8, r1, r9)
                r15 = 14
                r16 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.m.f(r10, r11, r12, r13, r14, r15, r16)
                s0.T$a r3 = s0.C5848T.f28733a
                r4 = 6
                s0.T r3 = s0.a0.b(r3, r8, r4)
                s0.Y$a r4 = s0.C5853Y.f28774a
                int r4 = r4.e()
                s0.T r3 = s0.C5850V.i(r3, r4)
                androidx.compose.ui.d r2 = s0.C5851W.d(r2, r3)
                Mi.m r10 = r0.f85432a
                nI.a<XH.N> r11 = r0.f85433b
                nI.l<Li.c, XH.N> r12 = r0.f85434c
                androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r3 = r3.g()
                i1.c$a r4 = i1.C5437c.f24302a
                i1.c$b r4 = r4.k()
                E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r8, r1)
                int r4 = U0.C4883j.a(r8, r1)
                U0.y r5 = r23.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r8, r2)
                G1.g$a r6 = G1.C4504g.f6515W
                nI.a r7 = r6.a()
                U0.f r13 = r23.m()
                if (r13 != 0) goto L_0x007f
                U0.C4883j.c()
            L_0x007f:
                r23.I()
                boolean r13 = r23.i()
                if (r13 == 0) goto L_0x008c
                r8.p(r7)
                goto L_0x008f
            L_0x008c:
                r23.t()
            L_0x008f:
                U0.m r7 = U0.F1.a(r23)
                nI.p r13 = r6.c()
                U0.F1.c(r7, r3, r13)
                nI.p r3 = r6.e()
                U0.F1.c(r7, r5, r3)
                nI.p r3 = r6.b()
                boolean r5 = r7.i()
                if (r5 != 0) goto L_0x00b9
                java.lang.Object r5 = r7.D()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r13)
                if (r5 != 0) goto L_0x00c7
            L_0x00b9:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r7.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7.w(r4, r3)
            L_0x00c7:
                nI.p r3 = r6.d()
                U0.F1.c(r7, r2, r3)
                s0.h r2 = s0.C5862h.f28810a
                r2 = -1887724070(0xffffffff8f7b9dda, float:-1.24056566E-29)
                r8.W(r2)
                Mi.a r2 = r10.b()
                KJ.c r2 = r2.a()
                java.util.Iterator r13 = r2.iterator()
                r7 = r1
            L_0x00e3:
                boolean r1 = r13.hasNext()
                if (r1 == 0) goto L_0x017e
                java.lang.Object r1 = r13.next()
                int r14 = r7 + 1
                if (r7 >= 0) goto L_0x00f4
                YH.C16877v.x()
            L_0x00f4:
                Mi.b r1 = (Mi.C10767b) r1
                Mi.b r2 = r10.c()
                androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
                r3 = 438606764(0x1a249bac, float:3.4040156E-23)
                r8.W(r3)
                boolean r3 = r8.V(r11)
                boolean r4 = r8.V(r1)
                r3 = r3 | r4
                boolean r4 = r8.V(r10)
                r3 = r3 | r4
                boolean r4 = r8.V(r12)
                r3 = r3 | r4
                java.lang.Object r4 = r23.D()
                if (r3 != 0) goto L_0x0123
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x012b
            L_0x0123:
                Pi.O r4 = new Pi.O
                r4.<init>(r11, r1, r10, r12)
                r8.u(r4)
            L_0x012b:
                r19 = r4
                nI.a r19 = (nI.C17631a) r19
                r23.P()
                r20 = 7
                r21 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.d.d(r15, r16, r17, r18, r19, r20, r21)
                androidx.compose.ui.d r3 = TC.e.i(r3)
                r4 = 16
                float r4 = (float) r4
                float r4 = c2.h.B(r4)
                r5 = 0
                r6 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r6, r4, r9, r5)
                r5 = 0
                r6 = 0
                r4 = r23
                Pi.P.e(r1, r2, r3, r4, r5, r6)
                r1 = -1887690980(0xffffffff8f7c1f1c, float:-1.2430551E-29)
                r8.W(r1)
                Mi.a r1 = r10.b()
                KJ.c r1 = r1.a()
                int r1 = r1.size()
                int r1 = r1 - r9
                if (r7 >= r1) goto L_0x0178
                r6 = 0
                r7 = 7
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = r23
                SC.C13643u0.c(r1, r2, r3, r5, r6, r7)
            L_0x0178:
                r23.P()
                r7 = r14
                goto L_0x00e3
            L_0x017e:
                r23.P()
                r23.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x018d
                U0.C4895p.R()
            L_0x018d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pi.P.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void c(F0 f02, m mVar, C17631a<C16807N> aVar, C17642l<? super c, C16807N> lVar, C4889m mVar2, int i10) {
        int i11;
        C4889m mVar3;
        F0 f03 = f02;
        m mVar4 = mVar;
        C17631a<C16807N> aVar2 = aVar;
        C17642l<? super c, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(f03, "bottomSheetState");
        C17542s.j(mVar4, "sortByDialogItem");
        C17542s.j(aVar2, "onHideBottomSheet");
        C17542s.j(lVar2, "onSortSelected");
        C4889m k10 = mVar2.k(-1980133169);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(f03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(mVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1980133169, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SortBottomSheet (SortBottomSheet.kt:46)");
            }
            mVar3 = k10;
            J.c(true, new C13656x1.b(j.b(b.f84325A7, k10, 0), new C13660y1(C18146a.f148097J2, j.b(b.f84665i, k10, 0), aVar2), (C13660y1) null), aVar, (d) null, f02, (C13664z1) null, false, 0, 0.0f, (C5848T) null, c1.c.e(1674263569, true, new a(mVar4, aVar2, lVar2), k10, 54), mVar3, (C13656x1.b.f116494d << 3) | 6 | (i11 & 896) | ((i11 << 12) & 57344), 6, 1000);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar3 = k10;
        }
        Y0 n10 = mVar3.n();
        if (n10 != null) {
            n10.a(new M(f02, mVar, aVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(F0 f02, m mVar, C17631a aVar, C17642l lVar, int i10, C4889m mVar2, int i11) {
        c(f02, mVar, aVar, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Mi.C10767b r32, Mi.C10767b r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r4 = r36
            r0 = -1965837456(0xffffffff8ad3b370, float:-2.0386058E-32)
            r1 = r35
            U0.m r1 = r1.k(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r32
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r32
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r32
            r3 = r4
        L_0x0029:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
            r15 = r33
            goto L_0x0044
        L_0x0032:
            r5 = r4 & 48
            r15 = r33
            if (r5 != 0) goto L_0x0044
            boolean r5 = r1.V(r15)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r37 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r34
            goto L_0x005f
        L_0x004d:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r34
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0072
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r1.L()
            r3 = r6
            goto L_0x018f
        L_0x0072:
            if (r5 == 0) goto L_0x0078
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0079
        L_0x0078:
            r14 = r6
        L_0x0079:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0085
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SortRow (SortBottomSheet.kt:105)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0085:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r0 = r0.f()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.l()
            r13 = 0
            E1.I r0 = androidx.compose.foundation.layout.G.b(r0, r3, r1, r13)
            int r3 = U0.C4883j.a(r1, r13)
            U0.y r5 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r14)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r1.m()
            if (r9 != 0) goto L_0x00b1
            U0.C4883j.c()
        L_0x00b1:
            r1.I()
            boolean r9 = r1.i()
            if (r9 == 0) goto L_0x00be
            r1.p(r8)
            goto L_0x00c1
        L_0x00be:
            r1.t()
        L_0x00c1:
            U0.m r8 = U0.F1.a(r1)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r0, r9)
            nI.p r0 = r7.e()
            U0.F1.c(r8, r5, r0)
            nI.p r0 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x00eb
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x00f9
        L_0x00eb:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r8.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.w(r3, r0)
        L_0x00f9:
            nI.p r0 = r7.d()
            U0.F1.c(r8, r6, r0)
            s0.N r16 = s0.C5843N.f28726a
            java.lang.String r5 = r32.a()
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r0 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = r32.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "ChoiceRowText"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r0 = 0
            r3 = r13
            r13 = r0
            r31 = r14
            r14 = r0
            r16 = 0
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
            r27 = r1
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = -811319007(0xffffffffcfa44121, float:-5.5114634E9)
            r1.W(r0)
            boolean r0 = kotlin.jvm.internal.C17542s.e(r32, r33)
            if (r0 == 0) goto L_0x017e
            int r0 = uK.C18146a.f148601q1
            t1.c r5 = J1.e.c(r0, r1, r3)
            int r0 = Oo.b.f84397I
            java.lang.String r6 = J1.j.b(r0, r1, r3)
            r11 = 0
            r12 = 12
            r7 = 0
            r8 = 0
            r10 = r1
            O0.V.a(r5, r6, r7, r8, r10, r11, r12)
        L_0x017e:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x018d
            U0.C4895p.R()
        L_0x018d:
            r3 = r31
        L_0x018f:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01a6
            Pi.N r7 = new Pi.N
            r0 = r7
            r1 = r32
            r2 = r33
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.P.e(Mi.b, Mi.b, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C10767b bVar, C10767b bVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(bVar, bVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
