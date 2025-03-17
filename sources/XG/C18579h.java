package xG;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "", "recentlySearchedItems", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "onClearAll", "d", "(Ljava/util/List;LnI/l;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xG.h  reason: case insensitive filesystem */
public final class C18579h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xG.h$a */
    static final class a implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f152111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f152112b;

        a(C17642l<? super String, C16807N> lVar, String str) {
            this.f152111a = lVar;
            this.f152112b = str;
        }

        public final void a() {
            this.f152111a.invoke(this.f152112b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: xG.h$b */
    public static final class b extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final b f152113c = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(String str) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: xG.h$c */
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f152114c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f152115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f152114c = lVar;
            this.f152115d = list;
        }

        public final Object a(int i10) {
            return this.f152114c.invoke(this.f152115d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: xG.h$d */
    public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f152116c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f152117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, C17642l lVar) {
            super(4);
            this.f152116c = list;
            this.f152117d = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r11, int r12, U0.C4889m r13, int r14) {
            /*
                r10 = this;
                r0 = r14 & 6
                if (r0 != 0) goto L_0x000f
                boolean r11 = r13.V(r11)
                if (r11 == 0) goto L_0x000c
                r11 = 4
                goto L_0x000d
            L_0x000c:
                r11 = 2
            L_0x000d:
                r11 = r11 | r14
                goto L_0x0010
            L_0x000f:
                r11 = r14
            L_0x0010:
                r14 = r14 & 48
                if (r14 != 0) goto L_0x0020
                boolean r14 = r13.d(r12)
                if (r14 == 0) goto L_0x001d
                r14 = 32
                goto L_0x001f
            L_0x001d:
                r14 = 16
            L_0x001f:
                r11 = r11 | r14
            L_0x0020:
                r14 = r11 & 147(0x93, float:2.06E-43)
                r0 = 146(0x92, float:2.05E-43)
                if (r14 != r0) goto L_0x0031
                boolean r14 = r13.l()
                if (r14 != 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                r13.L()
                goto L_0x0098
            L_0x0031:
                boolean r14 = U0.C4895p.J()
                if (r14 == 0) goto L_0x0040
                r14 = -1
                java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r1, r11, r14, r0)
            L_0x0040:
                java.util.List r11 = r10.f152116c
                java.lang.Object r11 = r11.get(r12)
                r0 = r11
                java.lang.String r0 = (java.lang.String) r0
                r11 = 1780324674(0x6a1d9942, float:4.7631273E25)
                r13.W(r11)
                wK.s6 r3 = wK.C18480s6.Small
                r11 = 1027263501(0x3d3acc0d, float:0.045604754)
                r13.W(r11)
                nI.l r11 = r10.f152117d
                boolean r11 = r13.V(r11)
                boolean r12 = r13.V(r0)
                r11 = r11 | r12
                java.lang.Object r12 = r13.D()
                if (r11 != 0) goto L_0x0070
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r12 != r11) goto L_0x007a
            L_0x0070:
                xG.h$a r12 = new xG.h$a
                nI.l r11 = r10.f152117d
                r12.<init>(r11, r0)
                r13.u(r12)
            L_0x007a:
                r6 = r12
                nI.a r6 = (nI.C17631a) r6
                r13.P()
                r8 = 3072(0xc00, float:4.305E-42)
                r9 = 54
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = 0
                r7 = r13
                wK.C18444p6.s(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r13.P()
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0098
                U0.C4895p.R()
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xG.C18579h.d.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.util.List<java.lang.String> r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, androidx.compose.ui.d r36, nI.C17631a<XH.C16807N> r37, U0.C4889m r38, int r39, int r40) {
        /*
            r1 = r34
            r2 = r35
            r4 = r37
            r5 = r39
            r0 = 8
            r3 = 2
            r6 = 4
            java.lang.String r7 = "recentlySearchedItems"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            java.lang.String r7 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            java.lang.String r7 = "onClearAll"
            kotlin.jvm.internal.C17542s.j(r4, r7)
            r7 = 87483946(0x536e62a, float:8.599873E-36)
            r8 = r38
            U0.m r15 = r8.k(r7)
            r14 = 1
            r8 = r40 & 1
            if (r8 == 0) goto L_0x002c
            r8 = r5 | 6
            goto L_0x003c
        L_0x002c:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x003b
            boolean r8 = r15.F(r1)
            if (r8 == 0) goto L_0x0038
            r8 = r6
            goto L_0x0039
        L_0x0038:
            r8 = r3
        L_0x0039:
            r8 = r8 | r5
            goto L_0x003c
        L_0x003b:
            r8 = r5
        L_0x003c:
            r3 = r40 & 2
            if (r3 == 0) goto L_0x0043
            r8 = r8 | 48
            goto L_0x0053
        L_0x0043:
            r3 = r5 & 48
            if (r3 != 0) goto L_0x0053
            boolean r3 = r15.F(r2)
            if (r3 == 0) goto L_0x0050
            r3 = 32
            goto L_0x0052
        L_0x0050:
            r3 = 16
        L_0x0052:
            r8 = r8 | r3
        L_0x0053:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x005c
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0059:
            r6 = r36
            goto L_0x006e
        L_0x005c:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0059
            r6 = r36
            boolean r9 = r15.V(r6)
            if (r9 == 0) goto L_0x006b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r8 = r8 | r9
        L_0x006e:
            r9 = r40 & 8
            if (r9 == 0) goto L_0x0076
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r9 = r8
            goto L_0x0087
        L_0x0076:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0074
            boolean r9 = r15.F(r4)
            if (r9 == 0) goto L_0x0083
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r8 = r8 | r9
            goto L_0x0074
        L_0x0087:
            r8 = r9 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r8 != r10) goto L_0x009b
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0094
            goto L_0x009b
        L_0x0094:
            r15.L()
            r3 = r6
            r6 = r15
            goto L_0x02b1
        L_0x009b:
            if (r3 == 0) goto L_0x00a0
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00a1
        L_0x00a0:
            r3 = r6
        L_0x00a1:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00ad
            r6 = -1
            java.lang.String r8 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.RecentSearch (RecentSearch.kt:44)"
            U0.C4895p.S(r7, r9, r6, r8)
        L_0x00ad:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r6.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r10 = r8.k()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r10, r15, r11)
            int r10 = U0.C4883j.a(r15, r11)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r0 = r17.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x00d9
            U0.C4883j.c()
        L_0x00d9:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x00e6
            r15.p(r0)
            goto L_0x00e9
        L_0x00e6:
            r15.t()
        L_0x00e9:
            U0.m r0 = U0.F1.a(r15)
            nI.p r11 = r17.c()
            U0.F1.c(r0, r7, r11)
            nI.p r7 = r17.e()
            U0.F1.c(r0, r12, r7)
            nI.p r7 = r17.b()
            boolean r11 = r0.i()
            if (r11 != 0) goto L_0x0113
            java.lang.Object r11 = r0.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x0121
        L_0x0113:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.w(r10, r7)
        L_0x0121:
            nI.p r7 = r17.d()
            U0.F1.c(r0, r13, r7)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r7 = 0
            r10 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r7, r14, r10)
            androidx.compose.foundation.layout.d$f r6 = r6.d()
            i1.c$c r7 = r8.i()
            r8 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r15, r8)
            r7 = 0
            int r8 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            nI.a r10 = r17.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x015a
            U0.C4883j.c()
        L_0x015a:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x0167
            r15.p(r10)
            goto L_0x016a
        L_0x0167:
            r15.t()
        L_0x016a:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r17.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r17.e()
            U0.F1.c(r10, r7, r6)
            nI.p r6 = r17.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0194
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x01a2
        L_0x0194:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r10.w(r7, r6)
        L_0x01a2:
            nI.p r6 = r17.d()
            U0.F1.c(r10, r0, r6)
            s0.N r0 = s0.C5843N.f28726a
            int r0 = OE.n.f113333b2
            r6 = 0
            java.lang.String r8 = J1.j.b(r0, r15, r6)
            rF.b r0 = rF.C15002a.a(r15, r6)
            long r10 = r0.f()
            r0 = r6
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.w r6 = r6.b(r15, r7)
            tK.r r6 = r6.c()
            N1.Y r28 = r6.e()
            r31 = 0
            r32 = 65530(0xfffa, float:9.1827E-41)
            r6 = 0
            r7 = r9
            r9 = r6
            r12 = 0
            r6 = 2048(0x800, float:2.87E-42)
            r16 = 0
            r33 = r14
            r14 = r16
            r36 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r29 = r36
            O0.d1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r8 = OE.n.f113181C1
            r15 = r36
            java.lang.String r8 = J1.j.b(r8, r15, r0)
            wK.l0$h r11 = wK.C18390l0.h.f151165b
            wK.j0 r12 = wK.C18366j0.Small
            r9 = -1817684334(0xffffffff93a85692, float:-4.2494527E-27)
            r15.W(r9)
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != r6) goto L_0x0213
            r14 = r33
            goto L_0x0214
        L_0x0213:
            r14 = r0
        L_0x0214:
            java.lang.Object r6 = r15.D()
            if (r14 != 0) goto L_0x0222
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r6 != r9) goto L_0x022a
        L_0x0222:
            xG.e r6 = new xG.e
            r6.<init>(r4)
            r15.u(r6)
        L_0x022a:
            r17 = r6
            nI.a r17 = (nI.C17631a) r17
            r15.P()
            int r6 = wK.C18390l0.h.f151166c
            int r6 = r6 << 9
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r20 = 486(0x1e6, float:6.81E-43)
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r36 = r15
            r15 = r16
            r16 = r18
            r18 = r36
            r19 = r6
            wK.C18342h0.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r36.x()
            androidx.compose.foundation.layout.d$a r6 = androidx.compose.foundation.layout.C5073d.a.f18077a
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.foundation.layout.d$f r12 = r6.c(r8)
            r6 = 12459527(0xbe1e07, float:1.7459516E-38)
            r15 = r36
            r15.W(r6)
            boolean r6 = r15.F(r1)
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r7 != r8) goto L_0x0273
            r14 = r33
            goto L_0x0274
        L_0x0273:
            r14 = r0
        L_0x0274:
            r0 = r6 | r14
            java.lang.Object r6 = r15.D()
            if (r0 != 0) goto L_0x0284
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x028c
        L_0x0284:
            xG.f r6 = new xG.f
            r6.<init>(r1, r2)
            r15.u(r6)
        L_0x028c:
            r16 = r6
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 239(0xef, float:3.35E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r0 = 0
            r6 = r15
            r15 = r0
            r17 = r6
            t0.C5937b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02b1
            U0.C4895p.R()
        L_0x02b1:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x02ca
            xG.g r8 = new xG.g
            r0 = r8
            r1 = r34
            r2 = r35
            r4 = r37
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18579h.d(java.util.List, nI.l, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(List list, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        xVar.e(list.size(), (C17642l<? super Integer, ? extends Object>) null, new c(b.f152113c, list), c1.c.c(-632812321, true, new d(list, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(List list, C17642l lVar, androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        d(list, lVar, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
