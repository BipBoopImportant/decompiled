package TG;

import KJ.C15987c;
import RF.k;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import c1.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKJ/c;", "LRF/k;", "itemList", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onDone", "c", "(LKJ/c;LnI/l;LnI/a;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: TG.c  reason: case insensitive filesystem */
public final class C16486c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TG.c$a */
    static final class a implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<k> f138521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<k, C16807N> f138523c;

        a(C15987c<k> cVar, int i10, C17642l<? super k, C16807N> lVar) {
            this.f138521a = cVar;
            this.f138522b = i10;
            this.f138523c = lVar;
        }

        public final void a() {
            this.f138523c.invoke(this.f138521a.get(this.f138522b));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: TG.c$b */
    public static final class b extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f138524c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(1);
            this.f138524c = list;
        }

        public final Object a(int i10) {
            this.f138524c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: TG.c$c  reason: collision with other inner class name */
    public static final class C3381c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f138525c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15987c f138526d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f138527e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3381c(List list, C15987c cVar, C17642l lVar) {
            super(4);
            this.f138525c = list;
            this.f138526d = cVar;
            this.f138527e = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r16, int r17, U0.C4889m r18, int r19) {
            /*
                r15 = this;
                r0 = r15
                r1 = r17
                r13 = r18
                r2 = r19 & 6
                if (r2 != 0) goto L_0x0017
                r2 = r16
                boolean r2 = r13.V(r2)
                if (r2 == 0) goto L_0x0013
                r2 = 4
                goto L_0x0014
            L_0x0013:
                r2 = 2
            L_0x0014:
                r2 = r19 | r2
                goto L_0x0019
            L_0x0017:
                r2 = r19
            L_0x0019:
                r3 = r19 & 48
                r4 = 32
                if (r3 != 0) goto L_0x002a
                boolean r3 = r13.d(r1)
                if (r3 == 0) goto L_0x0027
                r3 = r4
                goto L_0x0029
            L_0x0027:
                r3 = 16
            L_0x0029:
                r2 = r2 | r3
            L_0x002a:
                r3 = r2 & 147(0x93, float:2.06E-43)
                r5 = 146(0x92, float:2.05E-43)
                if (r3 != r5) goto L_0x003c
                boolean r3 = r18.l()
                if (r3 != 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                r18.L()
                goto L_0x00d6
            L_0x003c:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x004b
                r3 = -1
                java.lang.String r5 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
                r6 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                U0.C4895p.S(r6, r2, r3, r5)
            L_0x004b:
                java.util.List r3 = r0.f138525c
                java.lang.Object r3 = r3.get(r1)
                FG.a r3 = (FG.C15678a) r3
                r5 = 1269283434(0x4ba7ba6a, float:2.1984468E7)
                r13.W(r5)
                java.lang.String r5 = r3.a()
                android.net.Uri r3 = r3.b()
                r6 = -1898717713(0xffffffff8ed3ddef, float:-5.222923E-30)
                r13.W(r6)
                if (r3 != 0) goto L_0x006a
                goto L_0x00c7
            L_0x006a:
                r6 = 2049520051(0x7a2931b3, float:2.1962655E35)
                r13.W(r6)
                KJ.c r6 = r0.f138526d
                boolean r6 = r13.V(r6)
                r7 = r2 & 112(0x70, float:1.57E-43)
                r7 = r7 ^ 48
                if (r7 <= r4) goto L_0x0082
                boolean r7 = r13.d(r1)
                if (r7 != 0) goto L_0x0086
            L_0x0082:
                r2 = r2 & 48
                if (r2 != r4) goto L_0x0088
            L_0x0086:
                r2 = 1
                goto L_0x0089
            L_0x0088:
                r2 = 0
            L_0x0089:
                r2 = r2 | r6
                nI.l r4 = r0.f138527e
                boolean r4 = r13.V(r4)
                r2 = r2 | r4
                java.lang.Object r4 = r18.D()
                if (r2 != 0) goto L_0x009f
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x00ab
            L_0x009f:
                TG.c$a r4 = new TG.c$a
                KJ.c r2 = r0.f138526d
                nI.l r6 = r0.f138527e
                r4.<init>(r2, r1, r6)
                r13.u(r4)
            L_0x00ab:
                r9 = r4
                nI.a r9 = (nI.C17631a) r9
                r18.P()
                r11 = 384(0x180, float:5.38E-43)
                r12 = 120(0x78, float:1.68E-43)
                r4 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r14 = 0
                r1 = r5
                r2 = r3
                r3 = r4
                r4 = r6
                r6 = r8
                r7 = r10
                r8 = r14
                r10 = r18
                IG.C15887t.g(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            L_0x00c7:
                r18.P()
                r18.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00d6
                U0.C4895p.R()
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: TG.C16486c.C3381c.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<RF.k> r30, nI.C17642l<? super RF.k, XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34) {
        /*
            r0 = r30
            r1 = r31
            r14 = r32
            r15 = r34
            r2 = 48
            java.lang.String r3 = "itemList"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onDone"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = -1338549924(0xffffffffb037595c, float:-6.6702E-10)
            r4 = r33
            U0.m r13 = r4.k(r3)
            r12 = 6
            r4 = r15 & 6
            if (r4 != 0) goto L_0x0032
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x002f
            r4 = 4
            goto L_0x0030
        L_0x002f:
            r4 = 2
        L_0x0030:
            r4 = r4 | r15
            goto L_0x0033
        L_0x0032:
            r4 = r15
        L_0x0033:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0043
            boolean r5 = r13.F(r1)
            if (r5 == 0) goto L_0x0040
            r5 = 32
            goto L_0x0042
        L_0x0040:
            r5 = 16
        L_0x0042:
            r4 = r4 | r5
        L_0x0043:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0053
            boolean r5 = r13.F(r14)
            if (r5 == 0) goto L_0x0050
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r4 = r4 | r5
        L_0x0053:
            r9 = r4
            r4 = r9 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0067
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r13.L()
            r14 = r13
            goto L_0x0225
        L_0x0067:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0073
            r4 = -1
            java.lang.String r5 = "com.sugarcube.decorate.v2.internal.ui.toolbars.itemlist.ItemListToolbar (ItemListToolbar.kt:42)"
            U0.C4895p.S(r3, r9, r4, r5)
        L_0x0073:
            java.util.ArrayList r8 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r0, r3)
            r8.<init>(r3)
            java.util.Iterator r3 = r30.iterator()
        L_0x0082:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r3.next()
            RF.k r4 = (RF.k) r4
            FG.a r5 = new FG.a
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r4.d()
            com.sugarcube.core.network.models.CatalogItem r6 = r6.getCatalogItem()
            java.lang.String r6 = r6.getName()
            if (r6 != 0) goto L_0x00a0
            java.lang.String r6 = ""
        L_0x00a0:
            com.sugarcube.app.base.data.database.CachedCatalogItem r4 = r4.d()
            com.sugarcube.core.network.models.CatalogItem r4 = r4.getCatalogItem()
            android.net.Uri r4 = r4.getThumbUrl()
            r5.<init>(r6, r4)
            r8.add(r5)
            goto L_0x0082
        L_0x00b3:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r3 = 0
            r6 = 1
            r4 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.d(r7, r3, r6, r4)
            r5 = 0
            rF.b r17 = rF.C15002a.a(r13, r5)
            long r17 = r17.d()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r11 = 12
            r17 = r8
            float r8 = (float) r11
            float r12 = c2.h.B(r8)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r10, r3, r12, r6, r4)
            float r4 = XG.C16792g.s()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r3, r4)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$a r19 = i1.C5437c.f24302a
            i1.c$b r10 = r19.g()
            r12 = 54
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r10, r13, r12)
            int r10 = U0.C4883j.a(r13, r5)
            U0.y r12 = r13.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r20 = G1.C4504g.f6515W
            nI.a r6 = r20.a()
            U0.f r22 = r13.m()
            if (r22 != 0) goto L_0x0111
            U0.C4883j.c()
        L_0x0111:
            r13.I()
            boolean r22 = r13.i()
            if (r22 == 0) goto L_0x011e
            r13.p(r6)
            goto L_0x0121
        L_0x011e:
            r13.t()
        L_0x0121:
            U0.m r6 = U0.F1.a(r13)
            nI.p r11 = r20.c()
            U0.F1.c(r6, r4, r11)
            nI.p r4 = r20.e()
            U0.F1.c(r6, r12, r4)
            nI.p r4 = r20.b()
            boolean r11 = r6.i()
            if (r11 != 0) goto L_0x014b
            java.lang.Object r11 = r6.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x0159
        L_0x014b:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r6.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.w(r10, r4)
        L_0x0159:
            nI.p r4 = r20.d()
            U0.F1.c(r6, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r7, r2)
            uK.c r2 = uK.C18148c.Checkmark
            int r2 = r2.m()
            int r3 = OE.n.f113400l
            java.lang.String r3 = J1.j.b(r3, r13, r5)
            wK.m3$g r6 = wK.C18405m3.g.f151252b
            int r10 = wK.C18405m3.g.f151253c
            r11 = 12
            int r10 = r10 << r11
            r10 = r10 | 384(0x180, float:5.38E-43)
            int r11 = r9 << 18
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r11 = r11 & r12
            r12 = r10 | r11
            r20 = 232(0xe8, float:3.25E-43)
            r10 = 0
            r11 = 0
            r22 = 0
            r23 = 0
            r24 = r5
            r5 = r10
            r21 = 1
            r10 = r7
            r7 = r11
            r11 = r17
            r17 = r8
            r8 = r22
            r22 = r9
            r9 = r23
            r28 = r10
            r10 = r32
            r29 = r11
            r11 = r13
            r14 = r13
            r13 = r20
            wK.C18357i3.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r2 = c2.h.B(r17)
            r3 = r28
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r3, r2)
            r4 = 6
            s0.C5844O.a(r2, r14, r4)
            i1.c$b r2 = r19.g()
            r4 = 850525100(0x32b1fbac, float:2.0719959E-8)
            r14.W(r4)
            r4 = r29
            boolean r5 = r14.F(r4)
            r6 = r22 & 14
            r7 = 4
            if (r6 != r7) goto L_0x01d3
            r6 = r21
            goto L_0x01d5
        L_0x01d3:
            r6 = r24
        L_0x01d5:
            r5 = r5 | r6
            r6 = r22 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r6 != r7) goto L_0x01df
            r6 = r21
            goto L_0x01e1
        L_0x01df:
            r6 = r24
        L_0x01e1:
            r5 = r5 | r6
            java.lang.Object r6 = r14.D()
            if (r5 != 0) goto L_0x01f0
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01f8
        L_0x01f0:
            TG.a r6 = new TG.a
            r6.<init>(r4, r0, r1)
            r14.u(r6)
        L_0x01f8:
            r24 = r6
            nI.l r24 = (nI.C17642l) r24
            r14.P()
            r26 = 196614(0x30006, float:2.75515E-40)
            r27 = 222(0xde, float:3.11E-43)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r16 = r3
            r21 = r2
            r25 = r14
            t0.C5937b.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0225
            U0.C4895p.R()
        L_0x0225:
            U0.Y0 r2 = r14.n()
            if (r2 == 0) goto L_0x0235
            TG.b r3 = new TG.b
            r4 = r32
            r3.<init>(r0, r1, r4, r15)
            r2.a(r3)
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: TG.C16486c.c(KJ.c, nI.l, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(List list, C15987c cVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        xVar.e(list.size(), (C17642l<? super Integer, ? extends Object>) null, new b(list), c.c(-1091073711, true, new C3381c(list, cVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        c(cVar, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
