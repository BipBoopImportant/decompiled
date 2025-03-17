package Pv;

import KJ.C15987c;
import Rv.c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.r;
import s0.C5834E;
import x0.C6230C;
import x0.C6239g;
import x0.v;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aY\u0010\u000f\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0017\u001a\u00020\r8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"LKJ/c;", "LPv/r;", "cards", "Lkotlin/Function1;", "LRv/c;", "LXH/N;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "Ls0/E;", "contentPadding", "Lx0/C;", "pagerState", "Lx0/g;", "pageSize", "c", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;Ls0/E;Lx0/C;Lx0/g;LU0/m;II)V", "a", "Lx0/g;", "f", "()Lx0/g;", "getContextualCardPageSize$annotations", "()V", "ContextualCardPageSize", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final C6239g f39483a = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<r> f39484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<c, C16807N> f39485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f39486c;

        a(C15987c<r> cVar, C17642l<? super c, C16807N> lVar, androidx.compose.ui.d dVar) {
            this.f39484a = cVar;
            this.f39485b = lVar;
            this.f39486c = dVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, r rVar) {
            lVar.invoke(rVar.h());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(x0.v r7, int r8, U0.C4889m r9, int r10) {
            /*
                r6 = this;
                java.lang.String r0 = "$this$HorizontalPager"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x0014
                r7 = -1
                java.lang.String r0 = "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCardCarousel.<anonymous> (ContextualCardCarousel.kt:56)"
                r1 = -444154652(0xffffffffe586bce4, float:-7.953519E22)
                U0.C4895p.S(r1, r10, r7, r0)
            L_0x0014:
                KJ.c<Pv.r> r7 = r6.f39484a
                java.lang.Object r7 = r7.get(r8)
                r0 = r7
                Pv.r r0 = (Pv.r) r0
                r7 = -1434483806(0xffffffffaa7f83a2, float:-2.2694219E-13)
                r9.W(r7)
                nI.l<Rv.c, XH.N> r7 = r6.f39485b
                boolean r7 = r9.V(r7)
                boolean r8 = r9.V(r0)
                r7 = r7 | r8
                nI.l<Rv.c, XH.N> r8 = r6.f39485b
                java.lang.Object r10 = r9.D()
                if (r7 != 0) goto L_0x003e
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r10 != r7) goto L_0x0046
            L_0x003e:
                Pv.c r10 = new Pv.c
                r10.<init>(r8, r0)
                r9.u(r10)
            L_0x0046:
                r1 = r10
                nI.a r1 = (nI.C17631a) r1
                r9.P()
                androidx.compose.ui.d r2 = r6.f39486c
                r4 = 0
                r5 = 0
                r3 = r9
                Pv.o.u(r0, r1, r2, r3, r4, r5)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x005d
                U0.C4895p.R()
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pv.d.a.b(x0.v, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Pv/d$b", "Lx0/g;", "Lc2/d;", "", "availableSpace", "pageSpacing", "a", "(Lc2/d;II)I", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C6239g {
        b() {
        }

        public int a(c2.d dVar, int i10, int i11) {
            C17542s.j(dVar, "<this>");
            return dVar.K0(e.f39487a.b());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: x0.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<Pv.r> r27, nI.C17642l<? super Rv.c, XH.C16807N> r28, androidx.compose.ui.d r29, s0.C5834E r30, x0.C6230C r31, x0.C6239g r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r27
            r2 = r28
            r7 = r34
            java.lang.String r0 = "cards"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = -1084084441(0xffffffffbf622f27, float:-0.883532)
            r3 = r33
            U0.m r3 = r3.k(r0)
            r4 = r35 & 1
            r5 = 4
            if (r4 == 0) goto L_0x0021
            r4 = r7 | 6
            goto L_0x0031
        L_0x0021:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0030
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x002d
            r4 = r5
            goto L_0x002e
        L_0x002d:
            r4 = 2
        L_0x002e:
            r4 = r4 | r7
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            r6 = r35 & 2
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0048
        L_0x0038:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x0048
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r4 = r4 | r6
        L_0x0048:
            r6 = r35 & 4
            if (r6 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r29
            goto L_0x0063
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r29
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r35 & 8
            if (r9 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r30
            goto L_0x007e
        L_0x006c:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r30
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r11
        L_0x007e:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0097
            r11 = r35 & 16
            if (r11 != 0) goto L_0x0091
            r11 = r31
            boolean r12 = r3.V(r11)
            if (r12 == 0) goto L_0x0093
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r11 = r31
        L_0x0093:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r12
            goto L_0x0099
        L_0x0097:
            r11 = r31
        L_0x0099:
            r14 = r35 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a3
            r4 = r4 | r15
            r13 = r32
            goto L_0x00b5
        L_0x00a3:
            r12 = r7 & r15
            r13 = r32
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r3.V(r13)
            if (r12 == 0) goto L_0x00b2
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r4 = r4 | r12
        L_0x00b5:
            r12 = 74899(0x12493, float:1.04956E-40)
            r12 = r12 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r15) goto L_0x00cd
            boolean r12 = r3.l()
            if (r12 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r3.L()
            r4 = r10
            r5 = r11
            r6 = r13
            goto L_0x01d3
        L_0x00cd:
            r3.G()
            r12 = r7 & 1
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 1
            if (r12 == 0) goto L_0x00f0
            boolean r12 = r3.O()
            if (r12 == 0) goto L_0x00df
            goto L_0x00f0
        L_0x00df:
            r3.L()
            r5 = r35 & 16
            if (r5 == 0) goto L_0x00e8
            r4 = r4 & r16
        L_0x00e8:
            r6 = r8
            r5 = r11
            r26 = r13
            r8 = r4
            r4 = r10
            goto L_0x014d
        L_0x00f0:
            if (r6 == 0) goto L_0x00f5
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x00f6
        L_0x00f5:
            r6 = r8
        L_0x00f6:
            if (r9 == 0) goto L_0x0102
            r8 = 0
            r9 = 0
            r10 = 3
            s0.E r8 = androidx.compose.foundation.layout.D.c(r9, r9, r10, r8)
            r18 = r8
            goto L_0x0104
        L_0x0102:
            r18 = r10
        L_0x0104:
            r8 = r35 & 16
            if (r8 == 0) goto L_0x013e
            r8 = -401466987(0xffffffffe8121995, float:-2.7597496E24)
            r3.W(r8)
            r8 = r4 & 14
            if (r8 != r5) goto L_0x0114
            r5 = r15
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            java.lang.Object r8 = r3.D()
            if (r5 != 0) goto L_0x0123
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r8 != r5) goto L_0x012b
        L_0x0123:
            Pv.a r8 = new Pv.a
            r8.<init>(r1)
            r3.u(r8)
        L_0x012b:
            r10 = r8
            nI.a r10 = (nI.C17631a) r10
            r3.P()
            r12 = 0
            r5 = 3
            r8 = 0
            r9 = 0
            r11 = r3
            r13 = r5
            x0.C r5 = x0.C6231D.k(r8, r9, r10, r11, r12, r13)
            r4 = r4 & r16
            r11 = r5
        L_0x013e:
            if (r14 == 0) goto L_0x0149
            x0.g$a r5 = x0.C6239g.a.f31702a
            r8 = r4
            r26 = r5
        L_0x0145:
            r5 = r11
            r4 = r18
            goto L_0x014d
        L_0x0149:
            r26 = r32
            r8 = r4
            goto L_0x0145
        L_0x014d:
            r3.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x015c
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.membership.impl.contextualcard.compose.ContextualCardCarousel (ContextualCardCarousel.kt:41)"
            U0.C4895p.S(r0, r8, r9, r10)
        L_0x015c:
            r0 = 0
            int r0 = Nv.i.a(r3, r0)
            T0.d$a r9 = T0.d.f13504b
            int r9 = r9.d()
            boolean r0 = T0.d.F(r0, r9)
            if (r0 == 0) goto L_0x0174
            Pv.e r0 = Pv.e.f39487a
            androidx.compose.ui.d r0 = r0.c()
            goto L_0x017a
        L_0x0174:
            Pv.e r0 = Pv.e.f39487a
            androidx.compose.ui.d r0 = r0.a()
        L_0x017a:
            boolean r9 = r27.isEmpty()
            if (r9 != 0) goto L_0x01c7
            r9 = 12
            float r9 = (float) r9
            float r13 = c2.h.B(r9)
            java.lang.String r9 = "ContextualCardCarouselTestTag-Carousel"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r6, r9)
            Pv.d$a r10 = new Pv.d$a
            r10.<init>(r1, r2, r0)
            r0 = 54
            r11 = -444154652(0xffffffffe586bce4, float:-7.953519E22)
            c1.a r21 = c1.c.e(r11, r15, r10, r3, r0)
            int r0 = r8 >> 12
            r0 = r0 & 14
            r10 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r10
            int r10 = r8 >> 3
            r10 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r10
            int r8 = r8 >> 6
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r23 = r0 | r8
            r24 = 3072(0xc00, float:4.305E-42)
            r25 = 8144(0x1fd0, float:1.1412E-41)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r8 = r5
            r10 = r4
            r11 = r26
            r22 = r3
            x0.m.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x01c7:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01d0
            U0.C4895p.R()
        L_0x01d0:
            r8 = r6
            r6 = r26
        L_0x01d3:
            U0.Y0 r9 = r3.n()
            if (r9 == 0) goto L_0x01eb
            Pv.b r10 = new Pv.b
            r0 = r10
            r1 = r27
            r2 = r28
            r3 = r8
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pv.d.c(KJ.c, nI.l, androidx.compose.ui.d, s0.E, x0.C, x0.g, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int d(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, C5834E e10, C6230C c10, C6239g gVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, lVar, dVar, e10, c10, gVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final C6239g f() {
        return f39483a;
    }
}
