package ei;

import KJ.C15987c;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import Th.c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;
import nI.r;
import p1.i1;
import s0.C5842M;
import tK.C18030v;
import x0.C6230C;
import x0.v;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\t\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKJ/c;", "LTh/c;", "media", "", "initialPage", "Lkotlin/Function1;", "LXH/N;", "onPageUpdated", "onClick", "f", "(LKJ/c;ILnI/l;LnI/l;LU0/m;I)V", "Ls0/M;", "Lx0/C;", "pagerState", "d", "(Ls0/M;Lx0/C;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.delegates.ProductImagesDelegateV2Kt$ProductMediaCarousel$1$1", f = "ProductImagesDelegateV2.kt", l = {130}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f72793d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f72794e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.V$a$a  reason: collision with other inner class name */
        static final class C1254a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<Integer, C16807N> f72795a;

            C1254a(C17642l<? super Integer, C16807N> lVar) {
                this.f72795a = lVar;
            }

            public final Object c(int i10, C17164e<? super C16807N> eVar) {
                this.f72795a.invoke(kotlin.coroutines.jvm.internal.b.e(i10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6230C c10, C17642l<? super Integer, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f72793d = c10;
            this.f72794e = lVar;
        }

        /* access modifiers changed from: private */
        public static final int j(C6230C c10) {
            return c10.v();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f72793d, this.f72794e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f72792c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new U(this.f72793d));
                C1254a aVar = new C1254a(this.f72794e);
                this.f72792c = 1;
                if (r10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<c> f72796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f72797b;

        b(C15987c<c> cVar, C17642l<? super Integer, C16807N> lVar) {
            this.f72796a = cVar;
            this.f72797b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, int i10) {
            lVar.invoke(Integer.valueOf(i10));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, int i10) {
            lVar.invoke(Integer.valueOf(i10));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(x0.v r24, int r25, U0.C4889m r26, int r27) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                r15 = r26
                r2 = r27
                java.lang.String r3 = "$this$HorizontalPager"
                r4 = r24
                kotlin.jvm.internal.C17542s.j(r4, r3)
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x001e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.productinformationpage.v2.delegates.ProductMediaCarousel.<anonymous>.<anonymous> (ProductImagesDelegateV2.kt:143)"
                r5 = 2110723992(0x7dcf1798, float:3.4409088E37)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x001e:
                KJ.c<Th.c> r3 = r0.f72796a
                java.lang.Object r3 = r3.get(r1)
                Th.c r3 = (Th.c) r3
                com.ingka.ikea.core.model.Media r3 = r3.a()
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r5 = 0
                r6 = 1
                r7 = 0
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r5, r6, r7)
                r5 = 1065353216(0x3f800000, float:1.0)
                r8 = 2
                r9 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.layout.C5074e.b(r4, r5, r9, r8, r7)
                r4 = -856584370(0xffffffffccf18f4e, float:-1.26646896E8)
                r15.W(r4)
                nI.l<java.lang.Integer, XH.N> r4 = r0.f72797b
                boolean r4 = r15.V(r4)
                r5 = r2 & 112(0x70, float:1.57E-43)
                r5 = r5 ^ 48
                r7 = 32
                if (r5 <= r7) goto L_0x0055
                boolean r8 = r15.d(r1)
                if (r8 != 0) goto L_0x0059
            L_0x0055:
                r8 = r2 & 48
                if (r8 != r7) goto L_0x005b
            L_0x0059:
                r8 = r6
                goto L_0x005c
            L_0x005b:
                r8 = r9
            L_0x005c:
                r4 = r4 | r8
                nI.l<java.lang.Integer, XH.N> r8 = r0.f72797b
                java.lang.Object r10 = r26.D()
                if (r4 != 0) goto L_0x006d
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r10 != r4) goto L_0x0075
            L_0x006d:
                ei.W r10 = new ei.W
                r10.<init>(r8, r1)
                r15.u(r10)
            L_0x0075:
                r20 = r10
                nI.a r20 = (nI.C17631a) r20
                r26.P()
                r21 = 7
                r22 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "Media:"
                r8.append(r10)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r4, r8)
                boolean r4 = r3 instanceof com.ingka.ikea.core.model.Media.Image
                if (r4 == 0) goto L_0x00e2
                r1 = -784178826(0xffffffffd1426176, float:-5.2178674E10)
                r15.W(r1)
                com.ingka.ikea.core.model.Media$Image r3 = (com.ingka.ikea.core.model.Media.Image) r3
                java.lang.String r1 = r3.getUrl()
                java.lang.String r2 = r3.A0()
                LC.b$a r4 = LC.C13178b.a.f111818a
                E1.k$a r3 = E1.C4478k.f5915a
                E1.k r6 = r3.a()
                int r3 = LC.C13178b.a.f111819b
                int r3 = r3 << 9
                r5 = 196608(0x30000, float:2.75506E-40)
                r14 = r3 | r5
                r16 = 0
                r17 = 4048(0xfd0, float:5.672E-42)
                r5 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r3 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r26
                r15 = r16
                r16 = r17
                LC.h.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r26.P()
                goto L_0x0177
            L_0x00e2:
                boolean r4 = r3 instanceof com.ingka.ikea.core.model.Media.Video
                if (r4 == 0) goto L_0x0107
                r1 = -856569359(0xffffffffccf1c9f1, float:-1.26766984E8)
                r11 = r26
                r11.W(r1)
                com.ingka.ikea.core.model.Media$Video r3 = (com.ingka.ikea.core.model.Media.Video) r3
                java.lang.String r1 = r3.getUrl()
                java.lang.String r2 = r3.A0()
                r6 = 0
                r7 = 8
                r4 = 0
                r3 = r8
                r5 = r26
                ZC.C13902y.q(r1, r2, r3, r4, r5, r6, r7)
                r26.P()
                goto L_0x0177
            L_0x0107:
                r11 = r26
                boolean r4 = r3 instanceof com.ingka.ikea.core.model.Media.InfoImage
                if (r4 == 0) goto L_0x0181
                r4 = -783619865(0xffffffffd14ae8e7, float:-5.4468178E10)
                r11.W(r4)
                com.ingka.ikea.core.model.Media$InfoImage r3 = (com.ingka.ikea.core.model.Media.InfoImage) r3
                java.lang.String r4 = r3.getUrl()
                java.lang.String r10 = r3.A0()
                java.util.List r12 = r3.b()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                KJ.c r12 = KJ.C15985a.h(r12)
                java.lang.String r13 = r3.c()
                r3 = -856551186(0xffffffffccf210ee, float:-1.26912368E8)
                r11.W(r3)
                nI.l<java.lang.Integer, XH.N> r3 = r0.f72797b
                boolean r3 = r11.V(r3)
                if (r5 <= r7) goto L_0x013f
                boolean r5 = r11.d(r1)
                if (r5 != 0) goto L_0x0145
            L_0x013f:
                r2 = r2 & 48
                if (r2 != r7) goto L_0x0144
                goto L_0x0145
            L_0x0144:
                r6 = r9
            L_0x0145:
                r2 = r3 | r6
                nI.l<java.lang.Integer, XH.N> r3 = r0.f72797b
                java.lang.Object r5 = r26.D()
                if (r2 != 0) goto L_0x0157
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x015f
            L_0x0157:
                ei.X r5 = new ei.X
                r5.<init>(r3, r1)
                r11.u(r5)
            L_0x015f:
                r7 = r5
                nI.a r7 = (nI.C17631a) r7
                r26.P()
                r9 = 24576(0x6000, float:3.4438E-41)
                r14 = 0
                r5 = 0
                r1 = r4
                r2 = r10
                r3 = r12
                r4 = r13
                r6 = r8
                r8 = r26
                r10 = r14
                HC.C12966D.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r26.P()
            L_0x0177:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0180
                U0.C4895p.R()
            L_0x0180:
                return
            L_0x0181:
                r1 = -856581011(0xffffffffccf19c6d, float:-1.26673768E8)
                r11.W(r1)
                r26.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ei.V.b.c(x0.v, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void d(C5842M m10, C6230C c10, C4889m mVar, int i10) {
        int i11;
        long m02;
        C4889m k10 = mVar.k(1563314567);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(m10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(c10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1563314567, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.PagingContent (ProductImagesDelegateV2.kt:194)");
            }
            int G10 = c10.G();
            for (int i12 = 0; i12 < G10; i12++) {
                if (c10.v() == i12) {
                    k10.W(-475906934);
                    m02 = C18030v.f147664a.a(k10, C18030v.f147665b).G0();
                    k10.P();
                } else {
                    k10.W(-475847538);
                    m02 = C18030v.f147664a.a(k10, C18030v.f147665b).m0();
                    k10.P();
                }
                C5077h.a(C5842M.e(m10, J.i(androidx.compose.foundation.b.d(d.f18749a, m02, (i1) null, 2, (Object) null), h.B((float) 2)), 1.0f, false, 2, (Object) null), k10, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new T(m10, c10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C5842M m10, C6230C c10, int i10, C4889m mVar, int i11) {
        d(m10, c10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(KJ.C15987c<Th.c> r27, int r28, nI.C17642l<? super java.lang.Integer, XH.C16807N> r29, nI.C17642l<? super java.lang.Integer, XH.C16807N> r30, U0.C4889m r31, int r32) {
        /*
            r1 = r27
            r3 = r29
            r4 = r30
            r5 = r32
            r0 = 3
            r2 = 48
            r6 = -1499859536(0xffffffffa699f5b0, float:-1.0683101E-15)
            r7 = r31
            U0.m r15 = r7.k(r6)
            r14 = 6
            r7 = r5 & 6
            r13 = 2
            if (r7 != 0) goto L_0x0025
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0022
            r7 = 4
            goto L_0x0023
        L_0x0022:
            r7 = r13
        L_0x0023:
            r7 = r7 | r5
            goto L_0x0026
        L_0x0025:
            r7 = r5
        L_0x0026:
            r8 = r5 & 48
            r12 = r28
            if (r8 != 0) goto L_0x0038
            boolean r8 = r15.d(r12)
            if (r8 == 0) goto L_0x0035
            r8 = 32
            goto L_0x0037
        L_0x0035:
            r8 = 16
        L_0x0037:
            r7 = r7 | r8
        L_0x0038:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x0049
            boolean r8 = r15.F(r3)
            if (r8 == 0) goto L_0x0046
            r8 = r11
            goto L_0x0048
        L_0x0046:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r7 = r7 | r8
        L_0x0049:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r15.F(r4)
            if (r8 == 0) goto L_0x0056
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r7 = r7 | r8
        L_0x0059:
            r10 = r7
            r7 = r10 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x006d
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r15.L()
            r8 = r15
            goto L_0x0259
        L_0x006d:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0079
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.app.productinformationpage.v2.delegates.ProductMediaCarousel (ProductImagesDelegateV2.kt:120)"
            U0.C4895p.S(r6, r10, r7, r8)
        L_0x0079:
            r6 = -837212703(0xffffffffce1925e1, float:-6.4234912E8)
            r15.W(r6)
            boolean r6 = r15.F(r1)
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x0091
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0099
        L_0x0091:
            ei.Q r7 = new ei.Q
            r7.<init>(r1)
            r15.u(r7)
        L_0x0099:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r15.P()
            int r6 = r10 >> 3
            r6 = r6 & 14
            r16 = 2
            r8 = 0
            r7 = r28
            r14 = r10
            r10 = r15
            r0 = r11
            r11 = r6
            r12 = r16
            x0.C r6 = x0.C6231D.k(r7, r8, r9, r10, r11, r12)
            r7 = -837209134(0xffffffffce1933d2, float:-6.4257754E8)
            r15.W(r7)
            boolean r7 = r15.V(r6)
            r8 = r14 & 896(0x380, float:1.256E-42)
            r12 = 0
            if (r8 != r0) goto L_0x00c3
            r0 = 1
            goto L_0x00c4
        L_0x00c3:
            r0 = r12
        L_0x00c4:
            r0 = r0 | r7
            java.lang.Object r7 = r15.D()
            r11 = 0
            if (r0 != 0) goto L_0x00d4
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x00dc
        L_0x00d4:
            ei.V$a r7 = new ei.V$a
            r7.<init>(r6, r3, r11)
            r15.u(r7)
        L_0x00dc:
            nI.p r7 = (nI.p) r7
            r15.P()
            U0.P.g(r6, r7, r15, r12)
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c$b r7 = r0.g()
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r25 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r25.g()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r8, r7, r15, r2)
            int r7 = U0.C4883j.a(r15, r12)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r10)
            G1.g$a r26 = G1.C4504g.f6515W
            nI.a r12 = r26.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0111
            U0.C4883j.c()
        L_0x0111:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x011e
            r15.p(r12)
            goto L_0x0121
        L_0x011e:
            r15.t()
        L_0x0121:
            U0.m r12 = U0.F1.a(r15)
            nI.p r14 = r26.c()
            U0.F1.c(r12, r2, r14)
            nI.p r2 = r26.e()
            U0.F1.c(r12, r8, r2)
            nI.p r2 = r26.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x014b
            java.lang.Object r8 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x0159
        L_0x014b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r2)
        L_0x0159:
            nI.p r2 = r26.d()
            U0.F1.c(r12, r9, r2)
            s0.h r2 = s0.C5862h.f28810a
            r2 = 40
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            r7 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r10, r2, r7, r13, r11)
            java.lang.String r7 = "HorizontalPager"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r2, r7)
            ei.V$b r2 = new ei.V$b
            r2.<init>(r1, r4)
            r7 = 2110723992(0x7dcf1798, float:3.4409088E37)
            r14 = 54
            r13 = 1
            c1.a r20 = c1.c.e(r7, r13, r2, r15, r14)
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 8188(0x1ffc, float:1.1474E-41)
            r9 = 0
            r2 = 0
            r7 = r10
            r10 = r2
            r2 = 0
            r12 = r11
            r11 = r2
            r2 = 0
            r12 = r2
            r2 = 0
            r16 = r13
            r13 = r2
            r14 = r2
            r2 = 0
            r31 = r15
            r15 = r2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 48
            r2 = r7
            r7 = r6
            r21 = r31
            x0.m.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = -889570023(0xffffffffcafa3d19, float:-8199820.5)
            r8 = r31
            r8.W(r7)
            int r7 = r27.size()
            r9 = 1
            if (r7 <= r9) goto L_0x024a
            r7 = 0
            r9 = 0
            r10 = 3
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.C(r2, r9, r7, r10, r9)
            r9 = 24
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r2, r9)
            androidx.compose.foundation.layout.d$f r9 = r25.b()
            i1.c$c r0 = r0.i()
            r10 = 54
            E1.I r0 = androidx.compose.foundation.layout.G.b(r9, r0, r8, r10)
            int r7 = U0.C4883j.a(r8, r7)
            U0.y r9 = r8.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r8, r2)
            nI.a r10 = r26.a()
            U0.f r11 = r8.m()
            if (r11 != 0) goto L_0x01f2
            U0.C4883j.c()
        L_0x01f2:
            r8.I()
            boolean r11 = r8.i()
            if (r11 == 0) goto L_0x01ff
            r8.p(r10)
            goto L_0x0202
        L_0x01ff:
            r8.t()
        L_0x0202:
            U0.m r10 = U0.F1.a(r8)
            nI.p r11 = r26.c()
            U0.F1.c(r10, r0, r11)
            nI.p r0 = r26.e()
            U0.F1.c(r10, r9, r0)
            nI.p r0 = r26.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x022c
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x023a
        L_0x022c:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r0)
        L_0x023a:
            nI.p r0 = r26.d()
            U0.F1.c(r10, r2, r0)
            s0.N r0 = s0.C5843N.f28726a
            r2 = 6
            d(r0, r6, r8, r2)
            r8.x()
        L_0x024a:
            r8.P()
            r8.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0259
            U0.C4895p.R()
        L_0x0259:
            U0.Y0 r6 = r8.n()
            if (r6 == 0) goto L_0x0272
            ei.S r7 = new ei.S
            r0 = r7
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.V.f(KJ.c, int, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final int g(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, int i10, C17642l lVar, C17642l lVar2, int i11, C4889m mVar, int i12) {
        f(cVar, i10, lVar, lVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}
