package BG;

import HG.C15809a;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import c1.c;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import t0.C5934A;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aY\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "items", "", "country", "language", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onLoadMore", "d", "(Landroidx/compose/ui/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LnI/l;LnI/a;LU0/m;II)V", "", "reachedBottom", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogLazyListKt$MiniCatalogLazyList$1$1", f = "MiniCatalogLazyList.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f133190d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f133191e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, A1<Boolean> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f133190d = aVar;
            this.f133191e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f133190d, this.f133191e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f133189c == 0) {
                y.b(obj);
                if (h.f(this.f133191e)) {
                    this.f133190d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<CachedCatalogItem> f133192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133194c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f133195d;

        b(List<CachedCatalogItem> list, String str, String str2, C17642l<? super CachedCatalogItem, C16807N> lVar) {
            this.f133192a = list;
            this.f133193b = str;
            this.f133194c = str2;
            this.f133195d = lVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            C17542s.j(cVar, "$this$items");
            if ((i11 & 48) == 0) {
                i11 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-43463548, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogLazyList.<anonymous>.<anonymous>.<anonymous> (MiniCatalogLazyList.kt:82)");
                }
                CachedCatalogItem cachedCatalogItem = this.f133192a.get(i10);
                String priceNumeral = this.f133192a.get(i10).getCatalogItem().getPriceNumeral();
                if (priceNumeral == null) {
                    priceNumeral = "0.00";
                }
                p.c(cachedCatalogItem, new C14768a(priceNumeral, this.f133193b, this.f133194c, false, false, 24, (DefaultConstructorMarker) null), this.f133195d, mVar, 0);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.d r23, java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r24, java.lang.String r25, java.lang.String r26, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r27, nI.C17631a<XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r30
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "country"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "onLoadMore"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = 1810264935(0x6be67367, float:5.5719582E26)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r8 = r31 & 1
            if (r8 == 0) goto L_0x0038
            r9 = r7 | 6
            r10 = r9
            r9 = r23
            goto L_0x004c
        L_0x0038:
            r9 = r7 & 6
            if (r9 != 0) goto L_0x0049
            r9 = r23
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0046
            r10 = 4
            goto L_0x0047
        L_0x0046:
            r10 = 2
        L_0x0047:
            r10 = r10 | r7
            goto L_0x004c
        L_0x0049:
            r9 = r23
            r10 = r7
        L_0x004c:
            r11 = r31 & 2
            if (r11 == 0) goto L_0x0053
            r10 = r10 | 48
            goto L_0x0063
        L_0x0053:
            r11 = r7 & 48
            if (r11 != 0) goto L_0x0063
            boolean r11 = r1.F(r2)
            if (r11 == 0) goto L_0x0060
            r11 = 32
            goto L_0x0062
        L_0x0060:
            r11 = 16
        L_0x0062:
            r10 = r10 | r11
        L_0x0063:
            r11 = r31 & 4
            if (r11 == 0) goto L_0x006a
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x007a
        L_0x006a:
            r11 = r7 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x007a
            boolean r11 = r1.V(r3)
            if (r11 == 0) goto L_0x0077
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0079
        L_0x0077:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0079:
            r10 = r10 | r11
        L_0x007a:
            r11 = r31 & 8
            if (r11 == 0) goto L_0x0081
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x0091
        L_0x0081:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0091
            boolean r11 = r1.V(r4)
            if (r11 == 0) goto L_0x008e
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r10 = r10 | r11
        L_0x0091:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x0098
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0098:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x00a8
            boolean r11 = r1.F(r5)
            if (r11 == 0) goto L_0x00a5
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r10 = r10 | r11
        L_0x00a8:
            r11 = r31 & 32
            r15 = 131072(0x20000, float:1.83671E-40)
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00b3
            r10 = r10 | r16
            goto L_0x00c2
        L_0x00b3:
            r11 = r7 & r16
            if (r11 != 0) goto L_0x00c2
            boolean r11 = r1.F(r6)
            if (r11 == 0) goto L_0x00bf
            r11 = r15
            goto L_0x00c1
        L_0x00bf:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r10 = r10 | r11
        L_0x00c2:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r10
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r14) goto L_0x00d7
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x00d2
            goto L_0x00d7
        L_0x00d2:
            r1.L()
            goto L_0x0207
        L_0x00d7:
            if (r8 == 0) goto L_0x00de
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r22 = r8
            goto L_0x00e0
        L_0x00de:
            r22 = r9
        L_0x00e0:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00ec
            r8 = -1
            java.lang.String r9 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogLazyList (MiniCatalogLazyList.kt:51)"
            U0.C4895p.S(r0, r10, r8, r9)
        L_0x00ec:
            r0 = 3
            r8 = 0
            t0.A r9 = t0.C5935B.c(r8, r8, r1, r8, r0)
            r0 = 7000128(0x6ad040, float:9.809269E-39)
            r1.W(r0)
            java.lang.Object r0 = r1.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r14 = r11.a()
            if (r0 != r14) goto L_0x0110
            BG.e r0 = new BG.e
            r0.<init>(r9)
            U0.A1 r0 = U0.p1.e(r0)
            r1.u(r0)
        L_0x0110:
            U0.A1 r0 = (U0.A1) r0
            r1.P()
            boolean r14 = f(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13 = 7004721(0x6ae231, float:9.815705E-39)
            r1.W(r13)
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != r15) goto L_0x012a
            r13 = 1
            goto L_0x012b
        L_0x012a:
            r13 = r8
        L_0x012b:
            java.lang.Object r15 = r1.D()
            r12 = 0
            if (r13 != 0) goto L_0x0138
            java.lang.Object r13 = r11.a()
            if (r15 != r13) goto L_0x0140
        L_0x0138:
            BG.h$a r15 = new BG.h$a
            r15.<init>(r6, r0, r12)
            r1.u(r15)
        L_0x0140:
            nI.p r15 = (nI.p) r15
            r1.P()
            U0.P.g(r14, r15, r1, r8)
            rF.b r0 = rF.C15002a.a(r1, r8)
            long r13 = r0.e()
            r19 = 14
            r20 = 0
            r15 = 1060320051(0x3f333333, float:0.7)
            r16 = 0
            r17 = 0
            r18 = 0
            long r17 = p1.C5747v0.o(r13, r15, r16, r17, r18, r19, r20)
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r22
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            float r13 = BG.m.l()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r13)
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.d(r0, r13, r14, r12)
            rF.b r0 = rF.C15002a.a(r1, r8)
            long r16 = r0.e()
            r0 = 52
            float r0 = (float) r0
            float r19 = c2.h.B(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            r13 = 6
            m0.y0 r20 = m0.C5548j.j(r0, r8, r12, r13, r12)
            boolean r18 = r9.d()
            androidx.compose.ui.d r0 = sF.C15049e.d(r15, r16, r18, r19, r20)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r12.g()
            i1.c$a r13 = i1.C5437c.f24302a
            i1.c$b r13 = r13.g()
            r15 = 7024654(0x6b300e, float:9.843637E-39)
            r1.W(r15)
            boolean r15 = r1.F(r2)
            r8 = r10 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            if (r8 != r14) goto L_0x01b7
            r8 = 1
            goto L_0x01b8
        L_0x01b7:
            r8 = 0
        L_0x01b8:
            r8 = r8 | r15
            r14 = r10 & 7168(0x1c00, float:1.0045E-41)
            r15 = 2048(0x800, float:2.87E-42)
            if (r14 != r15) goto L_0x01c1
            r14 = 1
            goto L_0x01c2
        L_0x01c1:
            r14 = 0
        L_0x01c2:
            r8 = r8 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r14) goto L_0x01ce
            r16 = 1
            goto L_0x01d0
        L_0x01ce:
            r16 = 0
        L_0x01d0:
            r8 = r8 | r16
            java.lang.Object r10 = r1.D()
            if (r8 != 0) goto L_0x01de
            java.lang.Object r8 = r11.a()
            if (r10 != r8) goto L_0x01e6
        L_0x01de:
            BG.f r10 = new BG.f
            r10.<init>(r2, r3, r4, r5)
            r1.u(r10)
        L_0x01e6:
            r16 = r10
            nI.l r16 = (nI.C17642l) r16
            r1.P()
            r18 = 221184(0x36000, float:3.09945E-40)
            r19 = 204(0xcc, float:2.86E-43)
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r8 = r0
            r17 = r1
            t0.C5937b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0205
            U0.C4895p.R()
        L_0x0205:
            r9 = r22
        L_0x0207:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0225
            BG.g r11 = new BG.g
            r0 = r11
            r1 = r9
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BG.h.d(androidx.compose.ui.d, java.util.List, java.lang.String, java.lang.String, nI.l, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean e(C5934A a10) {
        return C15809a.c(a10, 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean f(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(List list, String str, String str2, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x.i(xVar, (Object) null, (Object) null, C15451b.f133169a.a(), 3, (Object) null);
        x.a(xVar, list.size(), (C17642l) null, (C17642l) null, c.c(-43463548, true, new b(list, str, str2, lVar)), 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(d dVar, List list, String str, String str2, C17642l lVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        d(dVar, list, str, str2, lVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
