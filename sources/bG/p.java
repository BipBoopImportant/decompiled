package BG;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.e;
import OE.C13316h;
import S1.C4820m;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U5.e;
import U5.s;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p1.C5749w0;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.Z;
import wK.C18349h7;
import wK.C18361i7;
import wK.C18385k7;
import wK.C18437p;
import wK.C18464r2;
import wK.C18476s2;
import wK.C18540x6;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItem", "LlF/a;", "priceData", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "c", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LlF/a;LnI/l;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f133224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14768a f133225b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: BG.p$a$a  reason: collision with other inner class name */
        static final class C3286a implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C14768a f133226a;

            C3286a(C14768a aVar) {
                this.f133226a = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1169857, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.StripeProductCard.<anonymous>.<anonymous>.<anonymous> (StripeProductCard.kt:84)");
                    }
                    C18349h7 h7Var = C18349h7.Medium;
                    C18540x6.f(this.f133226a.e(), this.f133226a.d(), this.f133226a.a(), this.f133226a.c(), h7Var, (C18385k7) null, (C18464r2) null, (C18361i7) null, (String) null, (d) null, (C18437p) null, (C18437p) null, (String) null, (String) null, (C18476s2) null, mVar, 24576, 0, 32736);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(CachedCatalogItem cachedCatalogItem, C14768a aVar) {
            this.f133224a = cachedCatalogItem;
            this.f133225b = aVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1613622645, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.StripeProductCard.<anonymous> (StripeProductCard.kt:66)");
                }
                d.a aVar = d.f18749a;
                d j10 = D.j(J.f(aVar, 0.0f, 1, (Object) null), h.B((float) 12), h.B((float) 4));
                C5073d.f b10 = C5073d.f18068a.b();
                C5437c.a aVar2 = C5437c.f24302a;
                C5437c.b g10 = aVar2.g();
                CachedCatalogItem cachedCatalogItem = this.f133224a;
                C14768a aVar3 = this.f133225b;
                I a10 = C5080k.a(b10, g10, mVar2, 54);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, j10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                nI.p<C4504g, Integer, C16807N> b11 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                float f10 = (float) 88;
                d v10 = J.v(aVar, h.B(f10), h.B(f10));
                s.b(cachedCatalogItem.getCatalogItem().getThumbUrl(), cachedCatalogItem.getName(), v10, e.c(C13316h.f112845a, mVar2, 0), (C5942c) null, (C5942c) null, (C17642l<? super e.c.C0658c, C16807N>) null, (C17642l<? super e.c.d, C16807N>) null, (C17642l<? super e.c.b, C16807N>) null, aVar2.e(), C4478k.f5915a.e(), 0.0f, (C5749w0) null, 0, false, mVar, 805306752, 6, 31216);
                Z.g(false, (C4820m) null, c1.c.e(-1169857, true, new C3286a(aVar3), mVar, 54), mVar, 390, 2);
                mVar.x();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.sugarcube.app.base.data.database.CachedCatalogItem r27, lF.C14768a r28, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r29, U0.C4889m r30, int r31) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            java.lang.String r4 = "catalogItem"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "priceData"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = -2063247335(0xffffffff85055819, float:-6.269811E-36)
            r5 = r30
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            r6 = 4
            if (r5 != 0) goto L_0x0030
            boolean r5 = r15.V(r0)
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002e
        L_0x002d:
            r5 = 2
        L_0x002e:
            r5 = r5 | r3
            goto L_0x0031
        L_0x0030:
            r5 = r3
        L_0x0031:
            r7 = r3 & 48
            if (r7 != 0) goto L_0x0041
            boolean r7 = r15.V(r1)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r5 = r5 | r7
        L_0x0041:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0052
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x004f
            r7 = r8
            goto L_0x0051
        L_0x004f:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r5 = r5 | r7
        L_0x0052:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r7 != r9) goto L_0x0064
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            r15.L()
            goto L_0x015a
        L_0x0064:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0070
            r7 = -1
            java.lang.String r9 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.StripeProductCard (StripeProductCard.kt:46)"
            U0.C4895p.S(r4, r5, r7, r9)
        L_0x0070:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            float r7 = (float) r6
            float r7 = c2.h.B(r7)
            r9 = 8
            float r9 = (float) r9
            float r10 = c2.h.B(r9)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.j(r4, r10, r7)
            r7 = 124(0x7c, float:1.74E-43)
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r10 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r10
            float r7 = c2.h.B(r7)
            r11 = 138(0x8a, float:1.93E-43)
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            float r11 = r11 * r10
            float r10 = c2.h.B(r11)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.v(r4, r7, r10)
            r4 = -1599651777(0xffffffffa0a7403f, float:-2.8333415E-19)
            r15.W(r4)
            r4 = r5 & 896(0x380, float:1.256E-42)
            r7 = 0
            r14 = 1
            if (r4 != r8) goto L_0x00af
            r4 = r14
            goto L_0x00b0
        L_0x00af:
            r4 = r7
        L_0x00b0:
            r5 = r5 & 14
            if (r5 != r6) goto L_0x00b5
            r7 = r14
        L_0x00b5:
            r4 = r4 | r7
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x00c4
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00cc
        L_0x00c4:
            BG.n r5 = new BG.n
            r5.<init>(r2, r0)
            r15.u(r5)
        L_0x00cc:
            r20 = r5
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r7 = r5.a(r15, r6)
            long r19 = r7.F0()
            tK.h r7 = r5.a(r15, r6)
            long r17 = r7.F0()
            tK.h r7 = r5.a(r15, r6)
            long r23 = r7.z0()
            tK.h r5 = r5.a(r15, r6)
            long r21 = r5.z0()
            O0.p r26 = new O0.p
            r25 = 0
            r16 = r26
            r16.<init>(r17, r19, r21, r23, r25)
            float r5 = c2.h.B(r9)
            A0.b r5 = A0.c.b(r5)
            A0.f r16 = A0.g.c(r5)
            O0.q r5 = O0.C4748q.f11441a
            float r6 = c2.h.B(r9)
            int r7 = O0.C4748q.f11442b
            int r7 = r7 << 18
            r13 = r7 | 6
            r17 = 62
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = r15
            r2 = r14
            r14 = r17
            O0.r r8 = r5.c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            BG.p$a r5 = new BG.p$a
            r5.<init>(r0, r1)
            r6 = 54
            r7 = -1613622645(0xffffffff9fd2128b, float:-8.8969136E-20)
            c1.a r10 = c1.c.e(r7, r2, r5, r15, r6)
            r12 = 196608(0x30000, float:2.75506E-40)
            r13 = 16
            r9 = 0
            r5 = r4
            r6 = r16
            r7 = r26
            r11 = r15
            O0.C4751s.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x015a
            U0.C4895p.R()
        L_0x015a:
            U0.Y0 r2 = r15.n()
            if (r2 == 0) goto L_0x016a
            BG.o r4 = new BG.o
            r5 = r29
            r4.<init>(r0, r1, r5, r3)
            r2.a(r4)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BG.p.c(com.sugarcube.app.base.data.database.CachedCatalogItem, lF.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(CachedCatalogItem cachedCatalogItem, C14768a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        c(cachedCatalogItem, aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
