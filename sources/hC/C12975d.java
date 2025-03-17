package HC;

import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import c2.d;
import c2.h;
import c2.r;
import gs.e;
import gs.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kp.C11519a;
import kp.C11520b;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import t0.C5938c;
import t0.x;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkp/b;", "campaigns", "Lkotlin/Function1;", "Lkp/a;", "LXH/N;", "onCampaignClicked", "Landroidx/compose/ui/d;", "modifier", "d", "(Lkp/b;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "commercial_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HC.d  reason: case insensitive filesystem */
public final class C12975d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HC.d$a */
    static final class a implements C17642l<r, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f110590a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f110591b;

        a(d dVar, C4899r0<h> r0Var) {
            this.f110590a = dVar;
            this.f110591b = r0Var;
        }

        public final void a(long j10) {
            float H10 = this.f110590a.H(r.g(j10));
            if (h.v(H10, this.f110591b.getValue().G()) > 0) {
                this.f110591b.setValue(h.m(H10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HC.d$b */
    static final class b implements C17642l<e.a, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11519a f110592a;

        b(C11519a aVar) {
            this.f110592a = aVar;
        }

        public final void a(e.a aVar) {
            C17542s.j(aVar, "$this$ikeaImageRequest");
            aVar.j(this.f110592a.k().getUrl());
            aVar.k(Integer.valueOf(C18146a.f148160N5));
            aVar.l(h.a.XXS);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HC.d$c */
    static final class c implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C11519a, C16807N> f110593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11519a f110594b;

        c(C17642l<? super C11519a, C16807N> lVar, C11519a aVar) {
            this.f110593a = lVar;
            this.f110594b = aVar;
        }

        public final void a() {
            this.f110593a.invoke(this.f110594b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: HC.d$d  reason: collision with other inner class name */
    public static final class C2657d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f110595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f110596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2657d(p pVar, List list) {
            super(1);
            this.f110595c = pVar;
            this.f110596d = list;
        }

        public final Object a(int i10) {
            return this.f110595c.invoke(Integer.valueOf(i10), this.f110596d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: HC.d$e */
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f110597c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f110597c = list;
        }

        public final Object a(int i10) {
            this.f110597c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: HC.d$f */
    public static final class f extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f110598c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0 f110599d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f110600e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f110601f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list, C4899r0 r0Var, d dVar, C17642l lVar) {
            super(4);
            this.f110598c = list;
            this.f110599d = r0Var;
            this.f110600e = dVar;
            this.f110601f = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r27, int r28, U0.C4889m r29, int r30) {
            /*
                r26 = this;
                r0 = r26
                r1 = r28
                r12 = r29
                r2 = r30 & 6
                if (r2 != 0) goto L_0x0018
                r2 = r27
                boolean r2 = r12.V(r2)
                if (r2 == 0) goto L_0x0014
                r2 = 4
                goto L_0x0015
            L_0x0014:
                r2 = 2
            L_0x0015:
                r2 = r30 | r2
                goto L_0x001a
            L_0x0018:
                r2 = r30
            L_0x001a:
                r3 = r30 & 48
                if (r3 != 0) goto L_0x002a
                boolean r3 = r12.d(r1)
                if (r3 == 0) goto L_0x0027
                r3 = 32
                goto L_0x0029
            L_0x0027:
                r3 = 16
            L_0x0029:
                r2 = r2 | r3
            L_0x002a:
                r3 = r2 & 147(0x93, float:2.06E-43)
                r4 = 146(0x92, float:2.05E-43)
                if (r3 != r4) goto L_0x003c
                boolean r3 = r29.l()
                if (r3 != 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                r29.L()
                goto L_0x015a
            L_0x003c:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x004b
                r3 = -1
                java.lang.String r4 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
                r5 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x004b:
                java.util.List r2 = r0.f110598c
                java.lang.Object r1 = r2.get(r1)
                r7 = r1
                kp.a r7 = (kp.C11519a) r7
                r1 = -1139658676(0xffffffffbc12304c, float:-0.008922648)
                r12.W(r1)
                java.lang.String r13 = r7.h()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r2 = 320(0x140, float:4.48E-43)
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r1, r2)
                U0.r0 r2 = r0.f110599d
                java.lang.Object r2 = r2.getValue()
                c2.h r2 = (c2.h) r2
                float r2 = r2.G()
                r3 = 1
                r4 = 0
                r5 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.b(r1, r5, r2, r3, r4)
                r2 = -1976418846(0xffffffff8a323de2, float:-8.582027E-33)
                r12.W(r2)
                c2.d r2 = r0.f110600e
                boolean r2 = r12.V(r2)
                java.lang.Object r3 = r29.D()
                if (r2 != 0) goto L_0x0098
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x00a4
            L_0x0098:
                HC.d$a r3 = new HC.d$a
                c2.d r2 = r0.f110600e
                U0.r0 r4 = r0.f110599d
                r3.<init>(r2, r4)
                r12.u(r3)
            L_0x00a4:
                nI.l r3 = (nI.C17642l) r3
                r29.P()
                androidx.compose.ui.d r1 = androidx.compose.ui.layout.g.a(r1, r3)
                java.lang.String r2 = "CAMPAIGN_CARD"
                androidx.compose.ui.d r18 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
                java.lang.String r22 = r7.g()
                r1 = -1976403261(0xffffffff8a327ac3, float:-8.593477E-33)
                r12.W(r1)
                boolean r1 = r12.F(r7)
                java.lang.Object r2 = r29.D()
                if (r1 != 0) goto L_0x00cf
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x00d7
            L_0x00cf:
                HC.d$b r2 = new HC.d$b
                r2.<init>(r7)
                r12.u(r2)
            L_0x00d7:
                nI.l r2 = (nI.C17642l) r2
                r29.P()
                r1 = 0
                gs.e r1 = gs.f.a(r2, r12, r1)
                int r5 = gs.e.f97946h
                r6 = 6
                r2 = 0
                r3 = 0
                r4 = r29
                t1.c r6 = gs.d.c(r1, r2, r3, r4, r5, r6)
                com.ingka.ikea.core.model.Image r1 = r7.k()
                java.lang.String r23 = r1.A0()
                tK.v r1 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r1 = r1.a(r12, r2)
                long r24 = r1.k()
                r1 = -1976387040(0xffffffff8a32ba20, float:-8.6053945E-33)
                r12.W(r1)
                nI.l r1 = r0.f110601f
                boolean r1 = r12.V(r1)
                boolean r2 = r12.F(r7)
                r1 = r1 | r2
                java.lang.Object r2 = r29.D()
                if (r1 != 0) goto L_0x011f
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x0129
            L_0x011f:
                HC.d$c r2 = new HC.d$c
                nI.l r1 = r0.f110601f
                r2.<init>(r1, r7)
                r12.u(r2)
            L_0x0129:
                r17 = r2
                nI.a r17 = (nI.C17631a) r17
                r29.P()
                r20 = 384(0x180, float:5.38E-43)
                r21 = 10900(0x2a94, float:1.5274E-41)
                r3 = 0
                r5 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r14 = 0
                r15 = 1
                r16 = 0
                r19 = 100663296(0x6000000, float:2.4074124E-35)
                r1 = r13
                r2 = r18
                r4 = r22
                r7 = r23
                r12 = r24
                r18 = r29
                SC.V.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21)
                r29.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x015a
                U0.C4895p.R()
            L_0x015a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: HC.C12975d.f.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(kp.C11520b r32, nI.C17642l<? super kp.C11519a, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r32
            r2 = r33
            r4 = r36
            r0 = 4
            r3 = 48
            java.lang.String r5 = "campaigns"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onCampaignClicked"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = -277287809(0xffffffffef78ec7f, float:-7.703819E28)
            r6 = r35
            U0.m r6 = r6.k(r5)
            r15 = 1
            r7 = r37 & 1
            r14 = 2
            if (r7 == 0) goto L_0x0025
            r7 = r4 | 6
            goto L_0x0035
        L_0x0025:
            r7 = r4 & 6
            if (r7 != 0) goto L_0x0034
            boolean r7 = r6.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = r0
            goto L_0x0032
        L_0x0031:
            r7 = r14
        L_0x0032:
            r7 = r7 | r4
            goto L_0x0035
        L_0x0034:
            r7 = r4
        L_0x0035:
            r8 = r37 & 2
            if (r8 == 0) goto L_0x003b
            r7 = r7 | r3
            goto L_0x004b
        L_0x003b:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x004b
            boolean r8 = r6.F(r2)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r7 = r7 | r8
        L_0x004b:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x0055
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r8 = r34
        L_0x0053:
            r11 = r7
            goto L_0x0068
        L_0x0055:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            r8 = r34
            boolean r9 = r6.V(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r7 = r7 | r9
            goto L_0x0053
        L_0x0068:
            r7 = r11 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r7 != r9) goto L_0x007b
            boolean r7 = r6.l()
            if (r7 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            r6.L()
            r3 = r6
            goto L_0x021f
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0081
        L_0x0080:
            r0 = r8
        L_0x0081:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x008d
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.commercial.CampaignsComposable (CampaignsComposables.kt:48)"
            U0.C4895p.S(r5, r11, r7, r8)
        L_0x008d:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r5.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r12 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r6, r12)
            int r8 = U0.C4883j.a(r6, r12)
            U0.y r9 = r6.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r6, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r17 = r6.m()
            if (r17 != 0) goto L_0x00b9
            U0.C4883j.c()
        L_0x00b9:
            r6.I()
            boolean r17 = r6.i()
            if (r17 == 0) goto L_0x00c6
            r6.p(r12)
            goto L_0x00c9
        L_0x00c6:
            r6.t()
        L_0x00c9:
            U0.m r12 = U0.F1.a(r6)
            nI.p r13 = r16.c()
            U0.F1.c(r12, r7, r13)
            nI.p r7 = r16.e()
            U0.F1.c(r12, r9, r7)
            nI.p r7 = r16.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x00f3
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0101
        L_0x00f3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r7)
        L_0x0101:
            nI.p r7 = r16.d()
            U0.F1.c(r12, r10, r7)
            s0.h r7 = s0.C5862h.f28810a
            java.lang.String r28 = r32.b()
            r7 = 716219984(0x2ab0a650, float:3.1379283E-13)
            r6.W(r7)
            if (r28 != 0) goto L_0x011a
            r34 = r6
            r3 = r11
            goto L_0x0166
        L_0x011a:
            TC.b$b$b r7 = TC.C13679b.C2857b.C2858b.f116684a
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = TC.e.i(r8)
            float r3 = (float) r3
            float r18 = c2.h.B(r3)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r12 = 0
            r3 = r11
            r11 = r12
            r13 = 0
            r16 = 0
            r14 = r16
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
            r34 = r6
            r6 = r28
            r28 = r34
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0166:
            r34.P()
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.e()
            r15 = r34
            java.lang.Object r6 = r15.Q(r6)
            c2.d r6 = (c2.d) r6
            r7 = 716229913(0x2ab0cd19, float:3.1406195E-13)
            r15.W(r7)
            java.lang.Object r7 = r15.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r9 = r8.a()
            r10 = 0
            if (r7 != r9) goto L_0x019b
            r9 = 0
            float r7 = (float) r9
            float r7 = c2.h.B(r7)
            c2.h r7 = c2.h.m(r7)
            r11 = 2
            U0.r0 r7 = U0.u1.e(r7, r10, r11, r10)
            r15.u(r7)
            goto L_0x019d
        L_0x019b:
            r9 = 0
            r11 = 2
        L_0x019d:
            U0.r0 r7 = (U0.C4899r0) r7
            r15.P()
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.h(r12, r13, r14, r10)
            r9 = 24
            float r9 = (float) r9
            float r11 = c2.h.B(r9)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.k(r12, r13, r11, r14, r10)
            r12 = 8
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            androidx.compose.foundation.layout.d$f r5 = r5.n(r12)
            float r9 = c2.h.B(r9)
            r12 = 2
            s0.E r9 = androidx.compose.foundation.layout.D.c(r9, r13, r12, r10)
            r10 = 716240951(0x2ab0f837, float:3.1436114E-13)
            r15.W(r10)
            boolean r10 = r15.F(r1)
            boolean r12 = r15.V(r6)
            r10 = r10 | r12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r3 != r12) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r14 = 0
        L_0x01e0:
            r3 = r10 | r14
            java.lang.Object r10 = r15.D()
            if (r3 != 0) goto L_0x01ee
            java.lang.Object r3 = r8.a()
            if (r10 != r3) goto L_0x01f6
        L_0x01ee:
            HC.a r10 = new HC.a
            r10.<init>(r1, r7, r6, r2)
            r15.u(r10)
        L_0x01f6:
            r14 = r10
            nI.l r14 = (nI.C17642l) r14
            r15.P()
            r16 = 24966(0x6186, float:3.4985E-41)
            r17 = 234(0xea, float:3.28E-43)
            r7 = 0
            r3 = 0
            r12 = 0
            r13 = 0
            r18 = 0
            r6 = r11
            r8 = r9
            r9 = r3
            r10 = r5
            r11 = r12
            r12 = r13
            r13 = r18
            r3 = r15
            t0.C5937b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x021e
            U0.C4895p.R()
        L_0x021e:
            r8 = r0
        L_0x021f:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0237
            HC.b r7 = new HC.b
            r0 = r7
            r1 = r32
            r2 = r33
            r3 = r8
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.C12975d.d(kp.b, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11520b bVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(bVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C11520b bVar, C4899r0 r0Var, d dVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        List<C11519a> a10 = bVar.a();
        xVar.e(a10.size(), new C2657d(new C12974c(), a10), new e(a10), c1.c.c(-1091073711, true, new f(a10, r0Var, dVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object g(int i10, C11519a aVar) {
        C17542s.j(aVar, "<unused var>");
        return Integer.valueOf(i10);
    }
}
