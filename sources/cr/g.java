package cr;

import KJ.C15987c;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import r0.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "filterButtonLoading", "LKJ/c;", "", "years", "selectedYear", "Lkotlin/Function1;", "LXH/N;", "onYearSelected", "j", "(ZLKJ/c;Ljava/lang/String;LnI/l;LU0/m;II)V", "expanded", "currentSelection", "Lkotlin/Function0;", "onCloseDialog", "onItemSelected", "g", "(ZLKJ/c;Ljava/lang/String;LnI/a;LnI/l;LU0/m;I)V", "showFilterPopup", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<String, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f96765a;

        a(String str) {
            this.f96765a = str;
        }

        public final void a(String str, C4889m mVar, int i10) {
            int i11;
            String str2 = str;
            C17542s.j(str2, "year");
            C4889m mVar2 = mVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(str2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1157667709, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.row.FilterYearDropDown.<anonymous> (HistoryActivityRow.kt:96)");
                }
                d b10 = J.b(d.f18749a, h.B((float) 176), 0.0f, 2, (Object) null);
                C13569b1.h hVar = r3;
                C13569b1.h hVar2 = new C13569b1.h(C17542s.e(str2, this.f96765a));
                C13585f1.c(str, (C17631a<C16807N>) null, b10, (String) null, (C13573c1) null, hVar, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, C13589g1.Small, 0.0f, false, false, (m) null, mVar, (i11 & 14) | 100663728 | (C13569b1.h.f116155c << 15), 0, 7896);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(boolean r18, KJ.C15987c<java.lang.String> r19, java.lang.String r20, nI.C17631a<XH.C16807N> r21, nI.C17642l<? super java.lang.String, XH.C16807N> r22, U0.C4889m r23, int r24) {
        /*
            r3 = r20
            r14 = r21
            r15 = r22
            r2 = r24
            r0 = 1135119372(0x43a88c0c, float:337.09412)
            r1 = r23
            U0.m r1 = r1.k(r0)
            r4 = r2 & 6
            r13 = r18
            if (r4 != 0) goto L_0x0022
            boolean r4 = r1.b(r13)
            if (r4 == 0) goto L_0x001f
            r4 = 4
            goto L_0x0020
        L_0x001f:
            r4 = 2
        L_0x0020:
            r4 = r4 | r2
            goto L_0x0023
        L_0x0022:
            r4 = r2
        L_0x0023:
            r5 = r2 & 48
            r12 = r19
            if (r5 != 0) goto L_0x0035
            boolean r5 = r1.V(r12)
            if (r5 == 0) goto L_0x0032
            r5 = 32
            goto L_0x0034
        L_0x0032:
            r5 = 16
        L_0x0034:
            r4 = r4 | r5
        L_0x0035:
            r5 = r2 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0045
            boolean r5 = r1.V(r3)
            if (r5 == 0) goto L_0x0042
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r4 = r4 | r5
        L_0x0045:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0056
            boolean r5 = r1.F(r14)
            if (r5 == 0) goto L_0x0053
            r5 = r6
            goto L_0x0055
        L_0x0053:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r4 = r4 | r5
        L_0x0056:
            r5 = r2 & 24576(0x6000, float:3.4438E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x0067
            boolean r5 = r1.F(r15)
            if (r5 == 0) goto L_0x0064
            r5 = r7
            goto L_0x0066
        L_0x0064:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r4 = r4 | r5
        L_0x0067:
            r5 = r4 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r8) goto L_0x0079
            boolean r5 = r1.l()
            if (r5 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r1.L()
            goto L_0x00ec
        L_0x0079:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0085
            r5 = -1
            java.lang.String r8 = "com.ingka.ikea.familyrewards.implementation.compose.history.row.FilterYearDropDown (HistoryActivityRow.kt:91)"
            U0.C4895p.S(r0, r4, r5, r8)
        L_0x0085:
            cr.g$a r0 = new cr.g$a
            r0.<init>(r3)
            r5 = 54
            r8 = 1157667709(0x45009b7d, float:2057.718)
            r9 = 1
            c1.a r0 = c1.c.e(r8, r9, r0, r1, r5)
            r5 = 334686821(0x13f2ea65, float:6.132052E-27)
            r1.W(r5)
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r4
            r8 = 0
            if (r5 != r7) goto L_0x00a3
            r5 = r9
            goto L_0x00a4
        L_0x00a3:
            r5 = r8
        L_0x00a4:
            r7 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != r6) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r9 = r8
        L_0x00aa:
            r5 = r5 | r9
            java.lang.Object r6 = r1.D()
            if (r5 != 0) goto L_0x00b9
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00c1
        L_0x00b9:
            cr.e r6 = new cr.e
            r6.<init>(r15, r14)
            r1.u(r6)
        L_0x00c1:
            r10 = r6
            nI.l r10 = (nI.C17642l) r10
            r1.P()
            r5 = r4 & 14
            r5 = r5 | 384(0x180, float:5.38E-43)
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            r16 = r4 | r7
            r17 = 48
            r8 = 0
            r9 = 0
            r4 = r18
            r5 = r19
            r6 = r0
            r7 = r21
            r11 = r1
            r12 = r16
            r13 = r17
            SC.C13565a1.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ec
            U0.C4895p.R()
        L_0x00ec:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0107
            cr.f r8 = new cr.f
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cr.g.g(boolean, KJ.c, java.lang.String, nI.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C17631a aVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(str);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(boolean z10, C15987c cVar, String str, C17631a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        g(z10, cVar, str, aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(boolean r39, KJ.C15987c<java.lang.String> r40, java.lang.String r41, nI.C17642l<? super java.lang.String, XH.C16807N> r42, U0.C4889m r43, int r44, int r45) {
        /*
            r5 = r44
            r0 = 4
            r1 = -1092920785(0xffffffffbedb5a2f, float:-0.42842242)
            r2 = r43
            U0.m r2 = r2.k(r1)
            r3 = 1
            r4 = r45 & 1
            r6 = 2
            if (r4 == 0) goto L_0x0018
            r4 = r5 | 6
            r7 = r4
            r4 = r39
            goto L_0x002c
        L_0x0018:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x0029
            r4 = r39
            boolean r7 = r2.b(r4)
            if (r7 == 0) goto L_0x0026
            r7 = r0
            goto L_0x0027
        L_0x0026:
            r7 = r6
        L_0x0027:
            r7 = r7 | r5
            goto L_0x002c
        L_0x0029:
            r4 = r39
            r7 = r5
        L_0x002c:
            r8 = r45 & 2
            r9 = 32
            if (r8 == 0) goto L_0x0037
            r7 = r7 | 48
        L_0x0034:
            r10 = r40
            goto L_0x0048
        L_0x0037:
            r10 = r5 & 48
            if (r10 != 0) goto L_0x0034
            r10 = r40
            boolean r11 = r2.V(r10)
            if (r11 == 0) goto L_0x0045
            r11 = r9
            goto L_0x0047
        L_0x0045:
            r11 = 16
        L_0x0047:
            r7 = r7 | r11
        L_0x0048:
            r0 = r45 & 4
            if (r0 == 0) goto L_0x0051
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r41
            goto L_0x0063
        L_0x0051:
            r11 = r5 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r41
            boolean r12 = r2.V(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r7 = r7 | r12
        L_0x0063:
            r12 = r45 & 8
            if (r12 == 0) goto L_0x006d
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r13 = r42
        L_0x006b:
            r15 = r7
            goto L_0x0080
        L_0x006d:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0069
            r13 = r42
            boolean r14 = r2.F(r13)
            if (r14 == 0) goto L_0x007c
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r7 = r7 | r14
            goto L_0x006b
        L_0x0080:
            r7 = r15 & 1171(0x493, float:1.641E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r7 != r14) goto L_0x0093
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            r2.L()
            r3 = r11
            goto L_0x02ec
        L_0x0093:
            if (r8 == 0) goto L_0x009c
            KJ.f r7 = KJ.C15985a.a()
            r32 = r7
            goto L_0x009e
        L_0x009c:
            r32 = r10
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = ""
            goto L_0x00a4
        L_0x00a3:
            r0 = r11
        L_0x00a4:
            if (r12 == 0) goto L_0x00c8
            r7 = 1513355300(0x5a33f824, float:1.26642136E16)
            r2.W(r7)
            java.lang.Object r7 = r2.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00c0
            cr.a r7 = new cr.a
            r7.<init>()
            r2.u(r7)
        L_0x00c0:
            nI.l r7 = (nI.C17642l) r7
            r2.P()
            r33 = r7
            goto L_0x00ca
        L_0x00c8:
            r33 = r13
        L_0x00ca:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00d6
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.familyrewards.implementation.compose.history.row.HistoryActivityRow (HistoryActivityRow.kt:45)"
            U0.C4895p.S(r1, r15, r7, r8)
        L_0x00d6:
            r1 = 1513356740(0x5a33fdc4, float:1.26657598E16)
            r2.W(r1)
            java.lang.Object r1 = r2.D()
            U0.m$a r34 = U0.C4889m.f14007a
            java.lang.Object r7 = r34.a()
            r8 = 0
            if (r1 != r7) goto L_0x00f2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            U0.r0 r1 = U0.u1.e(r1, r8, r6, r8)
            r2.u(r1)
        L_0x00f2:
            U0.r0 r1 = (U0.C4899r0) r1
            r2.P()
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r6 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r14, r6, r3, r8)
            tK.u r6 = tK.C18029u.f147649a
            float r6 = r6.d()
            float r7 = (float) r9
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.j(r3, r6, r7)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.d()
            i1.c$a r35 = i1.C5437c.f24302a
            i1.c$c r7 = r35.i()
            r8 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r2, r8)
            r13 = 0
            int r7 = U0.C4883j.a(r2, r13)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r2, r3)
            G1.g$a r36 = G1.C4504g.f6515W
            nI.a r9 = r36.a()
            U0.f r10 = r2.m()
            if (r10 != 0) goto L_0x013b
            U0.C4883j.c()
        L_0x013b:
            r2.I()
            boolean r10 = r2.i()
            if (r10 == 0) goto L_0x0148
            r2.p(r9)
            goto L_0x014b
        L_0x0148:
            r2.t()
        L_0x014b:
            U0.m r9 = U0.F1.a(r2)
            nI.p r10 = r36.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r36.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r36.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0175
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0183
        L_0x0175:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x0183:
            nI.p r6 = r36.d()
            U0.F1.c(r9, r3, r6)
            s0.N r3 = s0.C5843N.f28726a
            int r6 = Rq.e.f86980a
            java.lang.String r6 = J1.j.b(r6, r2, r13)
            TC.b$b$b r7 = TC.C13679b.C2857b.C2858b.f116684a
            i1.c$c r8 = r35.i()
            androidx.compose.ui.d r8 = r3.c(r14, r8)
            tK.v r3 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r2, r9)
            long r9 = r3.G0()
            r30 = 0
            r31 = 262128(0x3fff0, float:3.6732E-40)
            r11 = 0
            r3 = 0
            r13 = r3
            r37 = r14
            r14 = r3
            r38 = r15
            r15 = r3
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 48
            r28 = r2
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 1920985374(0x727fe91e, float:5.068832E30)
            r2.W(r3)
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L_0x02d8
            i1.c r3 = r35.o()
            r6 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r6)
            int r6 = U0.C4883j.a(r2, r6)
            U0.y r7 = r2.s()
            r8 = r37
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r2, r8)
            nI.a r9 = r36.a()
            U0.f r10 = r2.m()
            if (r10 != 0) goto L_0x0202
            U0.C4883j.c()
        L_0x0202:
            r2.I()
            boolean r10 = r2.i()
            if (r10 == 0) goto L_0x020f
            r2.p(r9)
            goto L_0x0212
        L_0x020f:
            r2.t()
        L_0x0212:
            U0.m r9 = U0.F1.a(r2)
            nI.p r10 = r36.c()
            U0.F1.c(r9, r3, r10)
            nI.p r3 = r36.e()
            U0.F1.c(r9, r7, r3)
            nI.p r3 = r36.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x023c
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x024a
        L_0x023c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r3)
        L_0x024a:
            nI.p r3 = r36.d()
            U0.F1.c(r9, r8, r3)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            SC.N r9 = SC.N.Secondary
            SC.M r10 = SC.M.Small
            SC.K0 r13 = SC.K0.TRAILING
            int r3 = uK.C18146a.f148036F1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r3 = -455987046(0xffffffffe4d2309a, float:-3.1018547E22)
            r2.W(r3)
            java.lang.Object r3 = r2.D()
            java.lang.Object r6 = r34.a()
            if (r3 != r6) goto L_0x0277
            cr.b r3 = new cr.b
            r3.<init>(r1)
            r2.u(r3)
        L_0x0277:
            r15 = r3
            nI.a r15 = (nI.C17631a) r15
            r2.P()
            r3 = r38
            int r6 = r3 >> 6
            r6 = r6 & 14
            r7 = 817916928(0x30c06c00, float:1.4000534E-9)
            r6 = r6 | r7
            int r7 = r3 << 15
            r8 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r8
            r17 = r6 | r7
            r18 = 262(0x106, float:3.67E-43)
            r7 = 0
            r8 = 0
            r14 = 0
            r6 = r0
            r11 = r39
            r16 = r2
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r6 = o(r1)
            r7 = -455977285(0xffffffffe4d256bb, float:-3.1040527E22)
            r2.W(r7)
            java.lang.Object r7 = r2.D()
            java.lang.Object r8 = r34.a()
            if (r7 != r8) goto L_0x02b7
            cr.c r7 = new cr.c
            r7.<init>(r1)
            r2.u(r7)
        L_0x02b7:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r2.P()
            r1 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r7 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r7
            int r3 = r3 << 3
            r7 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            r12 = r1 | r3
            r7 = r32
            r8 = r0
            r10 = r33
            r11 = r2
            g(r6, r7, r8, r9, r10, r11, r12)
            r2.x()
        L_0x02d8:
            r2.P()
            r2.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02e7
            U0.C4895p.R()
        L_0x02e7:
            r3 = r0
            r10 = r32
            r13 = r33
        L_0x02ec:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0303
            cr.d r8 = new cr.d
            r0 = r8
            r1 = r39
            r2 = r10
            r4 = r13
            r5 = r44
            r6 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cr.g.j(boolean, KJ.c, java.lang.String, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str) {
        C17542s.j(str, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C4899r0 r0Var) {
        p(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C4899r0 r0Var) {
        p(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(boolean z10, C15987c cVar, String str, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        j(z10, cVar, str, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean o(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void p(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
