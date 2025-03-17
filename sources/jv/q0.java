package jv;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import c2.h;
import hv.C11387c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "upcomingShowLabel", "LKJ/c;", "Lhv/c;", "shows", "Lkotlin/Function1;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "c", "(Ljava/lang/String;LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f98924a = new a();

        /* renamed from: a */
        public final Void invoke(C11387c cVar) {
            C17542s.j(cVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l<C11387c, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f98925a;

        public b(String str) {
            this.f98925a = str;
        }

        /* renamed from: a */
        public final Object invoke(C11387c cVar) {
            C17542s.j(cVar, "item");
            String str = this.f98925a;
            if (str != null) {
                String str2 = str + ":" + cVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(cVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f98926c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f98927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f98926c = lVar;
            this.f98927d = list;
        }

        public final Object a(int i10) {
            return this.f98926c.invoke(this.f98927d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f98928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f98929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f98928c = lVar;
            this.f98929d = list;
        }

        public final Object a(int i10) {
            return this.f98928c.invoke(this.f98929d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f98930c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f98931d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f98932e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, String str, C17642l lVar) {
            super(4);
            this.f98930c = list;
            this.f98931d = str;
            this.f98932e = lVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                mVar.W(-577241626);
                t0.c((C11387c) this.f98930c.get(i10), this.f98931d, this.f98932e, J.y(androidx.compose.ui.d.f18749a, h.B((float) 304)), mVar, 3072, 0);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r37, KJ.C15987c<hv.C11387c> r38, nI.C17642l<? super java.lang.String, XH.C16807N> r39, androidx.compose.ui.d r40, U0.C4889m r41, int r42, int r43) {
        /*
            r1 = r37
            r2 = r38
            r3 = r39
            r5 = r42
            r0 = 8
            java.lang.String r4 = "upcomingShowLabel"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "shows"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.C17542s.j(r3, r4)
            r4 = 966809374(0x39a0571e, float:3.0582485E-4)
            r6 = r41
            U0.m r15 = r6.k(r4)
            r14 = 1
            r6 = r43 & 1
            r13 = 2
            r11 = 4
            if (r6 == 0) goto L_0x002c
            r6 = r5 | 6
            goto L_0x003c
        L_0x002c:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x003b
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x0038
            r6 = r11
            goto L_0x0039
        L_0x0038:
            r6 = r13
        L_0x0039:
            r6 = r6 | r5
            goto L_0x003c
        L_0x003b:
            r6 = r5
        L_0x003c:
            r7 = r43 & 2
            if (r7 == 0) goto L_0x0043
            r6 = r6 | 48
            goto L_0x0053
        L_0x0043:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0053
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x0050
            r7 = 32
            goto L_0x0052
        L_0x0050:
            r7 = 16
        L_0x0052:
            r6 = r6 | r7
        L_0x0053:
            r7 = r43 & 4
            if (r7 == 0) goto L_0x005a
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x006a
            boolean r7 = r15.F(r3)
            if (r7 == 0) goto L_0x0067
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r6 = r6 | r7
        L_0x006a:
            r7 = r43 & 8
            if (r7 == 0) goto L_0x0074
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r8 = r40
        L_0x0072:
            r9 = r6
            goto L_0x0087
        L_0x0074:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0070
            r8 = r40
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0083
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r6 = r6 | r9
            goto L_0x0072
        L_0x0087:
            r6 = r9 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r6 != r10) goto L_0x009b
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0094
            goto L_0x009b
        L_0x0094:
            r15.L()
            r4 = r8
            r0 = r15
            goto L_0x0204
        L_0x009b:
            if (r7 == 0) goto L_0x00a1
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r10 = r6
            goto L_0x00a2
        L_0x00a1:
            r10 = r8
        L_0x00a2:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00ae
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.liveshopping.impl.presentation.compose.UpcomingEventCarousel (UpcomingEventCarousel.kt:39)"
            U0.C4895p.S(r4, r9, r6, r7)
        L_0x00ae:
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r4.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r8 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r8)
            int r7 = U0.C4883j.a(r15, r8)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r15, r10)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r13 = r17.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x00da
            U0.C4883j.c()
        L_0x00da:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x00e7
            r15.p(r13)
            goto L_0x00ea
        L_0x00e7:
            r15.t()
        L_0x00ea:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r17.c()
            U0.F1.c(r13, r6, r14)
            nI.p r6 = r17.e()
            U0.F1.c(r13, r11, r6)
            nI.p r6 = r17.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x0114
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0122
        L_0x0114:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r13.u(r11)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.w(r7, r6)
        L_0x0122:
            nI.p r6 = r17.d()
            U0.F1.c(r13, r12, r6)
            s0.h r6 = s0.C5862h.f28810a
            int r6 = bv.C11131a.f90753b
            java.lang.String r6 = J1.j.b(r6, r15, r8)
            TC.b$b$e r7 = TC.C13679b.C2857b.e.f116687a
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r11 = 24
            float r13 = (float) r11
            float r11 = c2.h.B(r13)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.i(r14, r11)
            r32 = r8
            r8 = r11
            tK.v r11 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r11 = r11.a(r15, r12)
            long r11 = r11.G0()
            r33 = r9
            r34 = r10
            r9 = r11
            r30 = 0
            r31 = 262128(0x3fff0, float:3.6732E-40)
            r11 = 0
            r16 = 0
            r35 = r13
            r13 = r16
            r36 = r14
            r0 = 1
            r14 = r16
            r40 = r15
            r15 = r16
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
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r40
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 0
            r7 = 0
            r8 = r36
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r8, r6, r0, r7)
            java.lang.String r9 = "upcomingVideoLazyRow"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            r9 = 8
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r10 = r4.n(r9)
            float r4 = c2.h.B(r35)
            r9 = 2
            s0.E r4 = androidx.compose.foundation.layout.D.c(r4, r6, r9, r7)
            r6 = -1474377094(0xffffffffa81eca7a, float:-8.814667E-15)
            r15 = r40
            r15.W(r6)
            boolean r6 = r15.F(r2)
            r7 = r33
            r9 = r7 & 14
            r11 = 4
            if (r9 != r11) goto L_0x01bc
            r14 = r0
            goto L_0x01be
        L_0x01bc:
            r14 = r32
        L_0x01be:
            r6 = r6 | r14
            r7 = r7 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != r9) goto L_0x01c7
            r14 = r0
            goto L_0x01c9
        L_0x01c7:
            r14 = r32
        L_0x01c9:
            r0 = r6 | r14
            java.lang.Object r6 = r15.D()
            if (r0 != 0) goto L_0x01d9
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x01e1
        L_0x01d9:
            jv.o0 r6 = new jv.o0
            r6.<init>(r2, r1, r3)
            r15.u(r6)
        L_0x01e1:
            r14 = r6
            nI.l r14 = (nI.C17642l) r14
            r15.P()
            r16 = 24966(0x6186, float:3.4985E-41)
            r17 = 234(0xea, float:3.28E-43)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r8
            r8 = r4
            r0 = r15
            t0.C5937b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0202
            U0.C4895p.R()
        L_0x0202:
            r4 = r34
        L_0x0204:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x021d
            jv.p0 r8 = new jv.p0
            r0 = r8
            r1 = r37
            r2 = r38
            r3 = r39
            r5 = r42
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.q0.c(java.lang.String, KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, String str, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        a aVar = a.f98924a;
        xVar.e(cVar.size(), new c(new b((String) null), cVar), new d(aVar, cVar), c1.c.c(-632812321, true, new e(cVar, str, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
