package ci;

import A1.K;
import KJ.C15987c;
import Op.h1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import ei.C9676q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "itemNo", "", "isSectionExpanded", "Lei/q;", "customerBenefit", "LKJ/c;", "LOp/h1;", "sections", "Lkotlin/Function0;", "LXH/N;", "onExpandedClicked", "onShowMoreClicked", "Lkotlin/Function1;", "onLongClickArticleNumber", "onSectionClicked", "c", "(Ljava/lang/String;ZLei/q;LKJ/c;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class G {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f65804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f65805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C9676q f65806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15987c<h1> f65808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<h1, C16807N> f65809f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.productinformationpage.v2.compose.MoreInfoComposableKt$MoreInfoComposable$2$1$1$1", f = "MoreInfoComposable.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: ci.G$a$a  reason: collision with other inner class name */
        static final class C1160a extends l implements p<K, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f65810c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f65811d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17642l<String, C16807N> f65812e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f65813f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1160a(C17642l<? super String, C16807N> lVar, String str, C17164e<? super C1160a> eVar) {
                super(2, eVar);
                this.f65812e = lVar;
                this.f65813f = str;
            }

            /* access modifiers changed from: private */
            public static final C16807N k(C17642l lVar, String str, C5667g gVar) {
                lVar.invoke(str);
                return C16807N.f139792a;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C1160a aVar = new C1160a(this.f65812e, this.f65813f, eVar);
                aVar.f65811d = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f65810c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = (K) this.f65811d;
                    F f11 = new F(this.f65812e, this.f65813f);
                    this.f65811d = k10;
                    this.f65810c = 1;
                    if (p0.G.j(k10, (C17642l) null, f11, (q) null, (C17642l) null, this, 13, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    K k11 = (K) this.f65811d;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }

            /* renamed from: j */
            public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
                return ((C1160a) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
            }
        }

        a(String str, C17642l<? super String, C16807N> lVar, C9676q qVar, C17631a<C16807N> aVar, C15987c<? extends h1> cVar, C17642l<? super h1, C16807N> lVar2) {
            this.f65804a = str;
            this.f65805b = lVar;
            this.f65806c = qVar;
            this.f65807d = aVar;
            this.f65808e = cVar;
            this.f65809f = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, h1 h1Var) {
            lVar.invoke(h1Var);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r23, int r24) {
            /*
                r22 = this;
                r0 = r22
                r14 = r23
                r1 = r24
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r23.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r23.L()
                goto L_0x019e
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.productinformationpage.v2.compose.MoreInfoComposable.<anonymous> (MoreInfoComposable.kt:53)"
                r4 = -1954725853(0xffffffff8b7d4023, float:-4.877428E-32)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                java.lang.String r1 = r0.f65804a
                nI.l<java.lang.String, XH.N> r2 = r0.f65805b
                ei.q r8 = r0.f65806c
                nI.a<XH.N> r9 = r0.f65807d
                KJ.c<Op.h1> r10 = r0.f65808e
                nI.l<Op.h1, XH.N> r13 = r0.f65809f
                androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r4 = r4.g()
                i1.c$a r5 = i1.C5437c.f24302a
                i1.c$b r5 = r5.k()
                r12 = 0
                E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r14, r12)
                int r5 = U0.C4883j.a(r14, r12)
                U0.y r6 = r23.s()
                androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r14, r3)
                G1.g$a r11 = G1.C4504g.f6515W
                nI.a r15 = r11.a()
                U0.f r16 = r23.m()
                if (r16 != 0) goto L_0x0060
                U0.C4883j.c()
            L_0x0060:
                r23.I()
                boolean r16 = r23.i()
                if (r16 == 0) goto L_0x006d
                r14.p(r15)
                goto L_0x0070
            L_0x006d:
                r23.t()
            L_0x0070:
                U0.m r15 = U0.F1.a(r23)
                nI.p r12 = r11.c()
                U0.F1.c(r15, r4, r12)
                nI.p r4 = r11.e()
                U0.F1.c(r15, r6, r4)
                nI.p r4 = r11.b()
                boolean r6 = r15.i()
                if (r6 != 0) goto L_0x009a
                java.lang.Object r6 = r15.D()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r12)
                if (r6 != 0) goto L_0x00a8
            L_0x009a:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r15.u(r6)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r15.w(r5, r4)
            L_0x00a8:
                nI.p r4 = r11.d()
                U0.F1.c(r15, r7, r4)
                s0.h r4 = s0.C5862h.f28810a
                il.g r4 = il.g.f98371a
                java.lang.String r4 = r4.a(r1)
                r5 = 16
                float r5 = (float) r5
                float r5 = c2.h.B(r5)
                r6 = 1
                r7 = 0
                r11 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r7, r5, r6, r11)
                XH.N r5 = XH.C16807N.f139792a
                r6 = -1232657348(0xffffffffb687243c, float:-4.0275318E-6)
                r14.W(r6)
                boolean r6 = r14.V(r2)
                boolean r7 = r14.V(r1)
                r6 = r6 | r7
                java.lang.Object r7 = r23.D()
                if (r6 != 0) goto L_0x00e4
                U0.m$a r6 = U0.C4889m.f14007a
                java.lang.Object r6 = r6.a()
                if (r7 != r6) goto L_0x00ec
            L_0x00e4:
                ci.G$a$a r7 = new ci.G$a$a
                r7.<init>(r2, r1, r11)
                r14.u(r7)
            L_0x00ec:
                nI.p r7 = (nI.p) r7
                r23.P()
                androidx.compose.ui.d r2 = A1.U.d(r3, r5, r7)
                r6 = 0
                r7 = 12
                r3 = 0
                r5 = 0
                r1 = r4
                r4 = r5
                r5 = r23
                SC.U1.b(r1, r2, r3, r4, r5, r6, r7)
                r1 = 0
                ci.C9484j.b(r8, r9, r14, r1)
                r7 = 7
                r1 = 0
                r2 = 0
                r3 = 0
                SC.C13643u0.c(r1, r2, r3, r5, r6, r7)
                r1 = -1232642576(0xffffffffb6875df0, float:-4.0342493E-6)
                r14.W(r1)
                java.util.Iterator r18 = r10.iterator()
            L_0x0117:
                boolean r1 = r18.hasNext()
                if (r1 == 0) goto L_0x018f
                java.lang.Object r1 = r18.next()
                Op.h1 r1 = (Op.h1) r1
                int r2 = r1.j()
                r3 = 0
                java.lang.String r19 = J1.j.b(r2, r14, r3)
                r2 = 1634099804(0x6166625c, float:2.6561492E20)
                r14.W(r2)
                boolean r2 = r14.V(r13)
                boolean r3 = r14.V(r1)
                r2 = r2 | r3
                java.lang.Object r3 = r23.D()
                if (r2 != 0) goto L_0x0149
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0151
            L_0x0149:
                ci.E r3 = new ci.E
                r3.<init>(r13, r1)
                r14.u(r3)
            L_0x0151:
                r2 = r3
                nI.a r2 = (nI.C17631a) r2
                r23.P()
                SC.b1$d r6 = SC.C13569b1.d.f116148b
                SC.g1 r9 = SC.C13589g1.Large
                r1 = 0
                float r3 = (float) r1
                float r10 = c2.h.B(r3)
                int r3 = SC.C13569b1.d.f116149c
                int r3 = r3 << 15
                r4 = 905969664(0x36000000, float:1.9073486E-6)
                r15 = r3 | r4
                r16 = 6
                r17 = 6364(0x18dc, float:8.918E-42)
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r11 = 1
                r12 = 0
                r20 = r1
                r1 = 0
                r21 = r13
                r13 = r1
                r1 = r19
                r14 = r23
                SC.C13585f1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r6 = 0
                r7 = 7
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = r23
                SC.C13643u0.c(r1, r2, r3, r5, r6, r7)
                r13 = r21
                goto L_0x0117
            L_0x018f:
                r23.P()
                r23.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x019e
                U0.C4895p.R()
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ci.G.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r32, boolean r33, ei.C9676q r34, KJ.C15987c<? extends Op.h1> r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, nI.C17642l<? super java.lang.String, XH.C16807N> r38, nI.C17642l<? super Op.h1, XH.C16807N> r39, U0.C4889m r40, int r41) {
        /*
            r7 = r32
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r41
            java.lang.String r0 = "itemNo"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "customerBenefit"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "sections"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onExpandedClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onShowMoreClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onLongClickArticleNumber"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onSectionClicked"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 282660623(0x10d90f0f, float:8.561461E-29)
            r1 = r40
            U0.m r15 = r1.k(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x004b
            boolean r1 = r15.V(r7)
            if (r1 == 0) goto L_0x0048
            r1 = 4
            goto L_0x0049
        L_0x0048:
            r1 = 2
        L_0x0049:
            r1 = r1 | r14
            goto L_0x004c
        L_0x004b:
            r1 = r14
        L_0x004c:
            r2 = r14 & 48
            r6 = r33
            if (r2 != 0) goto L_0x005e
            boolean r2 = r15.b(r6)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x006e
            boolean r2 = r15.F(r8)
            if (r2 == 0) goto L_0x006b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r15.V(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r2
        L_0x007e:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x008f
            boolean r2 = r15.F(r10)
            if (r2 == 0) goto L_0x008c
            r2 = r3
            goto L_0x008e
        L_0x008c:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r1 = r1 | r2
        L_0x008f:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00a0
            boolean r2 = r15.F(r11)
            if (r2 == 0) goto L_0x009d
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009f
        L_0x009d:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x009f:
            r1 = r1 | r2
        L_0x00a0:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00b1
            boolean r2 = r15.F(r12)
            if (r2 == 0) goto L_0x00ae
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b0
        L_0x00ae:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00b0:
            r1 = r1 | r2
        L_0x00b1:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00c2
            boolean r2 = r15.F(r13)
            if (r2 == 0) goto L_0x00bf
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00c1
        L_0x00bf:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00c1:
            r1 = r1 | r2
        L_0x00c2:
            r5 = r1
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r5
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x00d9
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            r15.L()
            r0 = r15
            goto L_0x0168
        L_0x00d9:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00e5
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.productinformationpage.v2.compose.MoreInfoComposable (MoreInfoComposable.kt:42)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x00e5:
            int r0 = Oo.b.f84334B6
            r1 = 0
            java.lang.String r20 = J1.j.b(r0, r15, r1)
            r0 = -262213535(0xfffffffff05ef061, float:-2.7598509E29)
            r15.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r5
            r4 = 1
            if (r0 != r3) goto L_0x00fa
            r1 = r4
        L_0x00fa:
            java.lang.Object r0 = r15.D()
            if (r1 != 0) goto L_0x0108
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0110
        L_0x0108:
            ci.C r0 = new ci.C
            r0.<init>(r10)
            r15.u(r0)
        L_0x0110:
            r16 = r0
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            SC.r r21 = SC.r.Large
            SC.s r22 = SC.C13634s.Subtle
            ci.G$a r3 = new ci.G$a
            r0 = r3
            r1 = r32
            r2 = r38
            r7 = r3
            r3 = r34
            r8 = r4
            r4 = r37
            r17 = r5
            r5 = r35
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = -1954725853(0xffffffff8b7d4023, float:-4.877428E-32)
            c1.a r27 = c1.c.e(r1, r8, r7, r15, r0)
            int r0 = r17 << 12
            r1 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r1
            r1 = 114819072(0x6d80000, float:8.125017E-35)
            r29 = r0 | r1
            r30 = 384(0x180, float:5.38E-43)
            r31 = 3612(0xe1c, float:5.061E-42)
            r17 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r0 = r15
            r15 = r20
            r20 = r33
            r28 = r0
            SC.C13627q.b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0168
            U0.C4895p.R()
        L_0x0168:
            U0.Y0 r15 = r0.n()
            if (r15 == 0) goto L_0x018a
            ci.D r8 = new ci.D
            r0 = r8
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r10 = r8
            r8 = r39
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.a(r10)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.G.c(java.lang.String, boolean, ei.q, KJ.c, nI.a, nI.a, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar, boolean z10) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, boolean z10, C9676q qVar, C15987c cVar, C17631a aVar, C17631a aVar2, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        c(str, z10, qVar, cVar, aVar, aVar2, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
