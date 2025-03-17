package nk;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import iB.C14549a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKJ/c;", "LiB/a;", "inspirations", "Lkotlin/Function1;", "", "LXH/N;", "onInspirationClicked", "Landroidx/compose/ui/d;", "modifier", "g", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "inspiration", "e", "(LiB/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nk.n  reason: case insensitive filesystem */
public final class C11650n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.n$a */
    static final class a implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f99881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14549a f99882b;

        a(C17642l<? super String, C16807N> lVar, C14549a aVar) {
            this.f99881a = lVar;
            this.f99882b = aVar;
        }

        public final void a() {
            this.f99881a.invoke(this.f99882b.b());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nk.n$b */
    public static final class b extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f99883c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f99884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar, List list) {
            super(1);
            this.f99883c = pVar;
            this.f99884d = list;
        }

        public final Object a(int i10) {
            return this.f99883c.invoke(Integer.valueOf(i10), this.f99884d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nk.n$c */
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f99885c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f99885c = list;
        }

        public final Object a(int i10) {
            this.f99885c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nk.n$d */
    public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f99886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f99887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, C17642l lVar) {
            super(4);
            this.f99886c = list;
            this.f99887d = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r8, int r9, U0.C4889m r10, int r11) {
            /*
                r7 = this;
                r0 = r11 & 6
                if (r0 != 0) goto L_0x000f
                boolean r8 = r10.V(r8)
                if (r8 == 0) goto L_0x000c
                r8 = 4
                goto L_0x000d
            L_0x000c:
                r8 = 2
            L_0x000d:
                r8 = r8 | r11
                goto L_0x0010
            L_0x000f:
                r8 = r11
            L_0x0010:
                r11 = r11 & 48
                if (r11 != 0) goto L_0x0020
                boolean r11 = r10.d(r9)
                if (r11 == 0) goto L_0x001d
                r11 = 32
                goto L_0x001f
            L_0x001d:
                r11 = 16
            L_0x001f:
                r8 = r8 | r11
            L_0x0020:
                r11 = r8 & 147(0x93, float:2.06E-43)
                r0 = 146(0x92, float:2.05E-43)
                if (r11 != r0) goto L_0x0031
                boolean r11 = r10.l()
                if (r11 != 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                r10.L()
                goto L_0x0098
            L_0x0031:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0040
                r11 = -1
                java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
                r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                U0.C4895p.S(r1, r8, r11, r0)
            L_0x0040:
                java.util.List r8 = r7.f99886c
                java.lang.Object r8 = r8.get(r9)
                iB.a r8 = (iB.C14549a) r8
                r9 = 393468487(0x1773da47, float:7.879304E-25)
                r10.W(r9)
                androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                r9 = 289791587(0x1145de63, float:1.5609088E-28)
                r10.W(r9)
                nI.l r9 = r7.f99887d
                boolean r9 = r10.V(r9)
                boolean r11 = r10.F(r8)
                r9 = r9 | r11
                java.lang.Object r11 = r10.D()
                if (r9 != 0) goto L_0x006f
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r11 != r9) goto L_0x0079
            L_0x006f:
                nk.n$a r11 = new nk.n$a
                nI.l r9 = r7.f99887d
                r11.<init>(r9, r8)
                r10.u(r11)
            L_0x0079:
                r4 = r11
                nI.a r4 = (nI.C17631a) r4
                r10.P()
                r5 = 7
                r6 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                androidx.compose.ui.d r9 = androidx.compose.foundation.d.d(r0, r1, r2, r3, r4, r5, r6)
                r11 = 0
                nk.C11650n.e(r8, r9, r10, r11, r11)
                r10.P()
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0098
                U0.C4895p.R()
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk.C11650n.d.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(iB.C14549a r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            r3 = 1116210105(0x428803b9, float:68.00727)
            r4 = r23
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r6 = r22
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r22
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0053
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r15.L()
            r3 = r15
            goto L_0x00b6
        L_0x0053:
            if (r5 == 0) goto L_0x0059
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x005a
        L_0x0059:
            r14 = r6
        L_0x005a:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0066
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.ImageItem (InspirationImages.kt:84)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0066:
            com.ingka.ikea.core.model.Image r3 = r21.a()
            java.lang.String r4 = r3.getUrl()
            com.ingka.ikea.core.model.Image r3 = r21.a()
            java.lang.String r5 = r3.A0()
            r3 = 240(0xf0, float:3.36E-43)
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            r6 = 360(0x168, float:5.04E-43)
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.v(r14, r3, r6)
            LC.b$b r7 = new LC.b$b
            gs.h$a r3 = gs.h.a.XS
            r7.<init>(r3)
            int r3 = LC.C13178b.C2734b.f111820b
            int r17 = r3 << 9
            r18 = 0
            r19 = 4080(0xff0, float:5.717E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r16 = 0
            r20 = r14
            r14 = r3
            r3 = r15
            r15 = r16
            r16 = r3
            LC.h.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b4
            U0.C4895p.R()
        L_0x00b4:
            r6 = r20
        L_0x00b6:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00c4
            nk.m r4 = new nk.m
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.C11650n.e(iB.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C14549a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<iB.C14549a> r37, nI.C17642l<? super java.lang.String, XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r37
            r2 = r38
            r4 = r41
            r0 = 4
            r3 = 6
            java.lang.String r5 = "inspirations"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onInspirationClicked"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = 796201238(0x2f751116, float:2.228869E-10)
            r6 = r40
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r42 & 1
            r13 = 2
            if (r6 == 0) goto L_0x0024
            r6 = r4 | 6
            goto L_0x0034
        L_0x0024:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0033
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0030
            r6 = r0
            goto L_0x0031
        L_0x0030:
            r6 = r13
        L_0x0031:
            r6 = r6 | r4
            goto L_0x0034
        L_0x0033:
            r6 = r4
        L_0x0034:
            r7 = r42 & 2
            if (r7 == 0) goto L_0x003b
            r6 = r6 | 48
            goto L_0x004b
        L_0x003b:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x004b
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r6 = r6 | r7
        L_0x004b:
            r0 = r42 & 4
            if (r0 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r7 = r39
        L_0x0053:
            r12 = r6
            goto L_0x0068
        L_0x0055:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r39
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r8
            goto L_0x0053
        L_0x0068:
            r6 = r12 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x007c
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r15.L()
            r3 = r7
            r7 = r15
            goto L_0x023b
        L_0x007c:
            if (r0 == 0) goto L_0x0081
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0082
        L_0x0081:
            r0 = r7
        L_0x0082:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.InspirationImages (InspirationImages.kt:43)"
            U0.C4895p.S(r5, r12, r6, r7)
        L_0x008e:
            tK.v r5 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r6 = r5.a(r15, r9)
            long r17 = r6.k0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r10.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r14 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r15, r14)
            int r8 = U0.C4883j.a(r15, r14)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r13 = r17.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x00d2
            U0.C4883j.c()
        L_0x00d2:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x00df
            r15.p(r13)
            goto L_0x00e2
        L_0x00df:
            r15.t()
        L_0x00e2:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r17.c()
            U0.F1.c(r13, r7, r14)
            nI.p r7 = r17.e()
            U0.F1.c(r13, r11, r7)
            nI.p r7 = r17.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x010c
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x011a
        L_0x010c:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13.u(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.w(r8, r7)
        L_0x011a:
            nI.p r7 = r17.d()
            U0.F1.c(r13, r6, r7)
            s0.h r6 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r6 = 40
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r14, r6)
            s0.C5844O.a(r6, r15, r3)
            int r6 = ik.c.f98350s
            r13 = 0
            java.lang.String r6 = J1.j.b(r6, r15, r13)
            TC.b$b$e r7 = TC.C13679b.C2857b.e.f116687a
            androidx.compose.ui.d r8 = TC.e.i(r14)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r19 = 0
            r11 = r9
            r32 = r10
            r9 = r19
            r34 = r11
            r33 = r12
            r3 = 32
            r11 = r19
            r16 = 0
            r17 = r13
            r13 = r16
            r35 = r14
            r14 = r16
            r39 = r15
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
            r29 = 48
            r28 = r39
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r15 = (float) r3
            float r6 = c2.h.B(r15)
            r14 = r35
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r14, r6)
            r13 = r39
            r7 = 6
            s0.C5844O.a(r6, r13, r7)
            float r6 = TC.e.g()
            r12 = 0
            r11 = 0
            r7 = 2
            s0.E r8 = androidx.compose.foundation.layout.D.c(r6, r12, r7, r11)
            r6 = 12
            float r10 = (float) r6
            float r6 = c2.h.B(r10)
            r7 = r32
            androidx.compose.foundation.layout.d$f r16 = r7.n(r6)
            r6 = -1461278736(0xffffffffa8e6a7f0, float:-2.5607961E-14)
            r13.W(r6)
            boolean r6 = r13.F(r1)
            r7 = r33 & 112(0x70, float:1.57E-43)
            if (r7 != r3) goto L_0x01b6
            r3 = 1
            goto L_0x01b7
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            r3 = r3 | r6
            java.lang.Object r6 = r13.D()
            if (r3 != 0) goto L_0x01c6
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x01ce
        L_0x01c6:
            nk.j r6 = new nk.j
            r6.<init>(r1, r2)
            r13.u(r6)
        L_0x01ce:
            r3 = r6
            nI.l r3 = (nI.C17642l) r3
            r13.P()
            r17 = 24576(0x6000, float:3.4438E-41)
            r18 = 235(0xeb, float:3.3E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = r10
            r10 = r16
            r11 = r19
            r12 = r20
            r39 = r13
            r13 = r21
            r36 = r14
            r14 = r3
            r3 = r15
            r15 = r39
            r16 = r17
            r17 = r18
            t0.C5937b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            float r3 = c2.h.B(r3)
            r6 = r36
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r6, r3)
            r7 = r39
            r8 = 6
            s0.C5844O.a(r3, r7, r8)
            r3 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r6, r8, r3, r9)
            float r6 = c2.h.B(r22)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r3, r6)
            r3 = r34
            tK.h r3 = r5.a(r7, r3)
            long r9 = r3.l0()
            r12 = 2
            r13 = 0
            r11 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
            r5 = 0
            s0.C5844O.a(r3, r7, r5)
            r7.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x023a
            U0.C4895p.R()
        L_0x023a:
            r3 = r0
        L_0x023b:
            U0.Y0 r6 = r7.n()
            if (r6 == 0) goto L_0x0252
            nk.k r7 = new nk.k
            r0 = r7
            r1 = r37
            r2 = r38
            r4 = r41
            r5 = r42
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.C11650n.g(KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        xVar.e(cVar.size(), new b(new C11648l(), cVar), new c(cVar), c1.c.c(-1091073711, true, new d(cVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object i(int i10, C14549a aVar) {
        C17542s.j(aVar, "item");
        String b10 = aVar.b();
        return b10 + i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
