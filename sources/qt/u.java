package Qt;

import IC.C13023e;
import KJ.C15987c;
import Qt.B;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import Xt.b;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import s0.C5834E;
import s0.C5861g;
import ut.L;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LXt/b;", "state", "", "isExpandedWidth", "Lkotlin/Function1;", "LXt/a;", "LXH/N;", "onChildClick", "onShowAllEventsClick", "Landroidx/compose/ui/d;", "modifier", "c", "(LXt/b;ZLnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f86328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f86329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f86330c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Xt.a, C16807N> f86331d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qt.u$a$a  reason: collision with other inner class name */
        static final class C1775a implements q<d, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f86332a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<Boolean, C16807N> f86333b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<Xt.a, C16807N> f86334c;

            C1775a(b bVar, C17642l<? super Boolean, C16807N> lVar, C17642l<? super Xt.a, C16807N> lVar2) {
                this.f86332a = bVar;
                this.f86333b = lVar;
                this.f86334c = lVar2;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(C17642l lVar, Xt.a aVar) {
                lVar.invoke(aVar);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C17642l lVar) {
                lVar.invoke(Boolean.FALSE);
                return C16807N.f139792a;
            }

            public final void c(d dVar, C4889m mVar, int i10) {
                C17542s.j(dVar, "childModifier");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(dVar) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1938302772, i10, -1, "com.ingka.ikea.instore.impl.storeevents.composables.StoreEventCarousel.<anonymous>.<anonymous> (StoreEventCarousel.kt:59)");
                    }
                    mVar.W(-1114474564);
                    C15987c<Xt.a> a10 = this.f86332a.a();
                    C17642l<Xt.a, C16807N> lVar = this.f86334c;
                    for (Xt.a aVar : a10) {
                        B.a aVar2 = B.a.f86237a;
                        mVar.W(1931641367);
                        boolean V10 = mVar.V(lVar) | mVar.F(aVar);
                        Object D10 = mVar.D();
                        if (V10 || D10 == C4889m.f14007a.a()) {
                            D10 = new s(lVar, aVar);
                            mVar.u(D10);
                        }
                        mVar.P();
                        p.k(aVar, aVar2, (C17631a) D10, dVar, mVar, C13023e.f110931a | 48 | ((i10 << 9) & 7168), 0);
                    }
                    mVar.P();
                    if (this.f86332a.b()) {
                        d a11 = C5116k1.a(J.G(dVar, (C5437c.b) null, false, 3, (Object) null), "ViewAllCardTag");
                        mVar.W(-1114457503);
                        boolean V11 = mVar.V(this.f86333b);
                        C17642l<Boolean, C16807N> lVar2 = this.f86333b;
                        Object D11 = mVar.D();
                        if (V11 || D11 == C4889m.f14007a.a()) {
                            D11 = new t(lVar2);
                            mVar.u(D11);
                        }
                        mVar.P();
                        F.d((C17631a) D11, a11, mVar, 0, 0);
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                c((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        a(boolean z10, b bVar, C17642l<? super Boolean, C16807N> lVar, C17642l<? super Xt.a, C16807N> lVar2) {
            this.f86328a = z10;
            this.f86329b = bVar;
            this.f86330c = lVar;
            this.f86331d = lVar2;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$InstoreSection");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1638802009, i10, -1, "com.ingka.ikea.instore.impl.storeevents.composables.StoreEventCarousel.<anonymous> (StoreEventCarousel.kt:54)");
                }
                L.b(this.f86328a, C5116k1.a(d.f18749a, "CarouselTestTag"), (C5834E) null, c.e(1938302772, true, new C1775a(this.f86329b, this.f86330c, this.f86331d), mVar, 54), mVar, 3120, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Xt.b r18, boolean r19, nI.C17642l<? super Xt.a, XH.C16807N> r20, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r24
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onChildClick"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onShowAllEventsClick"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 551035749(0x20d82365, float:3.6615245E-19)
            r5 = r23
            U0.m r5 = r5.k(r0)
            r7 = r25 & 1
            if (r7 == 0) goto L_0x0029
            r7 = r6 | 6
            goto L_0x0042
        L_0x0029:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0041
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0036
            boolean r7 = r5.V(r1)
            goto L_0x003a
        L_0x0036:
            boolean r7 = r5.F(r1)
        L_0x003a:
            if (r7 == 0) goto L_0x003e
            r7 = 4
            goto L_0x003f
        L_0x003e:
            r7 = 2
        L_0x003f:
            r7 = r7 | r6
            goto L_0x0042
        L_0x0041:
            r7 = r6
        L_0x0042:
            r8 = r25 & 2
            if (r8 == 0) goto L_0x0049
            r7 = r7 | 48
            goto L_0x0059
        L_0x0049:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0059
            boolean r8 = r5.b(r2)
            if (r8 == 0) goto L_0x0056
            r8 = 32
            goto L_0x0058
        L_0x0056:
            r8 = 16
        L_0x0058:
            r7 = r7 | r8
        L_0x0059:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0060
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0070
            boolean r8 = r5.F(r3)
            if (r8 == 0) goto L_0x006d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r7 = r7 | r8
        L_0x0070:
            r8 = r25 & 8
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0079
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0079:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0088
            boolean r8 = r5.F(r4)
            if (r8 == 0) goto L_0x0085
            r8 = r9
            goto L_0x0087
        L_0x0085:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r7 = r7 | r8
        L_0x0088:
            r8 = r25 & 16
            if (r8 == 0) goto L_0x0091
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r10 = r22
            goto L_0x00a3
        L_0x0091:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x008e
            r10 = r22
            boolean r11 = r5.V(r10)
            if (r11 == 0) goto L_0x00a0
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r7 = r7 | r11
        L_0x00a3:
            r11 = r7 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00b5
            boolean r11 = r5.l()
            if (r11 != 0) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            r5.L()
            goto L_0x015b
        L_0x00b5:
            if (r8 == 0) goto L_0x00bc
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r17 = r8
            goto L_0x00be
        L_0x00bc:
            r17 = r10
        L_0x00be:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00ca
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.instore.impl.storeevents.composables.StoreEventCarousel (StoreEventCarousel.kt:39)"
            U0.C4895p.S(r0, r7, r8, r10)
        L_0x00ca:
            r0 = 1562815156(0x5d26aab4, float:7.5060058E17)
            r5.W(r0)
            boolean r0 = r18.b()
            r8 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0102
            r0 = 1562816457(0x5d26afc9, float:7.5068998E17)
            r5.W(r0)
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != r9) goto L_0x00e4
            r0 = r10
            goto L_0x00e5
        L_0x00e4:
            r0 = r8
        L_0x00e5:
            java.lang.Object r9 = r5.D()
            if (r0 != 0) goto L_0x00f3
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r9 != r0) goto L_0x00fb
        L_0x00f3:
            Qt.q r9 = new Qt.q
            r9.<init>(r4)
            r5.u(r9)
        L_0x00fb:
            nI.a r9 = (nI.C17631a) r9
            r5.P()
            r12 = r9
            goto L_0x0104
        L_0x0102:
            r0 = 0
            r12 = r0
        L_0x0104:
            r5.P()
            int r0 = st.c.f102720K0
            java.lang.String r9 = r18.c()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = J1.j.c(r0, r9, r5, r8)
            int r9 = st.c.f102798p1
            java.lang.String r8 = J1.j.b(r9, r5, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r11 = "\n"
            r9.append(r11)
            r9.append(r8)
            java.lang.String r11 = r9.toString()
            Qt.u$a r8 = new Qt.u$a
            r8.<init>(r2, r1, r4, r3)
            r9 = 54
            r13 = 1638802009(0x61ae2259, float:4.0152606E20)
            c1.a r13 = c1.c.e(r13, r10, r8, r5, r9)
            int r7 = r7 >> 9
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 1572864(0x180000, float:2.204052E-39)
            r15 = r7 | r8
            r16 = 12
            r9 = 0
            r10 = 0
            r7 = r0
            r8 = r17
            r14 = r5
            ut.C12095d0.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0159
            U0.C4895p.R()
        L_0x0159:
            r10 = r17
        L_0x015b:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x0177
            Qt.r r9 = new Qt.r
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r10
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qt.u.c(Xt.b, boolean, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar) {
        lVar.invoke(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(b bVar, boolean z10, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(bVar, z10, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
