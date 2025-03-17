package zw;

import Bw.j;
import KJ.C15987c;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import c2.r;
import com.ingka.ikea.core.model.Category;
import gs.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt0/x;", "LBw/j$a;", "offerTypeCategories", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/Category;", "LXH/N;", "onOfferTypeCategoryClicked", "g", "(Lt0/x;LBw/j$a;LnI/l;)V", "category", "Landroidx/compose/ui/d;", "modifier", "c", "(Lcom/ingka/ikea/core/model/Category;Landroidx/compose/ui/d;LU0/m;II)V", "h", "(Lt0/x;)V", "offerhub-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.a f132716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Category, C16807N> f132717b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zw.s0$a$a  reason: collision with other inner class name */
        static final class C3278a implements C17631a<C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<Category, C16807N> f132718a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Category f132719b;

            C3278a(C17642l<? super Category, C16807N> lVar, Category category) {
                this.f132718a = lVar;
                this.f132719b = category;
            }

            public final void a() {
                this.f132718a.invoke(this.f132719b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements C17642l<r, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c2.d f132720a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<h> f132721b;

            b(c2.d dVar, C4899r0<h> r0Var) {
                this.f132720a = dVar;
                this.f132721b = r0Var;
            }

            public final void a(long j10) {
                float H10 = this.f132720a.H(r.g(j10));
                if (h.v(H10, this.f132721b.getValue().G()) > 0) {
                    this.f132721b.setValue(h.m(H10));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((r) obj).k());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final c f132722c = new c();

            public c() {
                super(1);
            }

            /* renamed from: a */
            public final Void invoke(Category category) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f132723c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f132724d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C17642l lVar, List list) {
                super(1);
                this.f132723c = lVar;
                this.f132724d = list;
            }

            public final Object a(int i10) {
                return this.f132723c.invoke(this.f132724d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class e extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f132725c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f132726d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(C17642l lVar, List list) {
                super(1);
                this.f132725c = lVar;
                this.f132726d = list;
            }

            public final Object a(int i10) {
                return this.f132725c.invoke(this.f132726d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        public static final class f extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f132727c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l f132728d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4899r0 f132729e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ c2.d f132730f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(List list, C17642l lVar, C4899r0 r0Var, c2.d dVar) {
                super(4);
                this.f132727c = list;
                this.f132728d = lVar;
                this.f132729e = r0Var;
                this.f132730f = dVar;
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
                    if (r11 != r0) goto L_0x0032
                    boolean r11 = r10.l()
                    if (r11 != 0) goto L_0x002d
                    goto L_0x0032
                L_0x002d:
                    r10.L()
                    goto L_0x00db
                L_0x0032:
                    boolean r11 = U0.C4895p.J()
                    if (r11 == 0) goto L_0x0041
                    r11 = -1
                    java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                    r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                    U0.C4895p.S(r1, r8, r11, r0)
                L_0x0041:
                    java.util.List r8 = r7.f132727c
                    java.lang.Object r8 = r8.get(r9)
                    com.ingka.ikea.core.model.Category r8 = (com.ingka.ikea.core.model.Category) r8
                    r9 = 24043411(0x16edf93, float:4.3874103E-38)
                    r10.W(r9)
                    androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                    r9 = -1938883082(0xffffffff8c6efdf6, float:-1.8411277E-31)
                    r10.W(r9)
                    nI.l r9 = r7.f132728d
                    boolean r9 = r10.V(r9)
                    boolean r11 = r10.F(r8)
                    r9 = r9 | r11
                    java.lang.Object r11 = r10.D()
                    if (r9 != 0) goto L_0x0070
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r11 != r9) goto L_0x007a
                L_0x0070:
                    zw.s0$a$a r11 = new zw.s0$a$a
                    nI.l r9 = r7.f132728d
                    r11.<init>(r9, r8)
                    r10.u(r11)
                L_0x007a:
                    r4 = r11
                    nI.a r4 = (nI.C17631a) r4
                    r10.P()
                    r5 = 7
                    r6 = 0
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    androidx.compose.ui.d r9 = androidx.compose.foundation.d.d(r0, r1, r2, r3, r4, r5, r6)
                    U0.r0 r11 = r7.f132729e
                    java.lang.Object r11 = r11.getValue()
                    c2.h r11 = (c2.h) r11
                    float r11 = r11.G()
                    r0 = 1
                    r1 = 0
                    r2 = 0
                    androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.b(r9, r2, r11, r0, r1)
                    r11 = -1938876473(0xffffffff8c6f17c7, float:-1.8419046E-31)
                    r10.W(r11)
                    c2.d r11 = r7.f132730f
                    boolean r11 = r10.V(r11)
                    java.lang.Object r0 = r10.D()
                    if (r11 != 0) goto L_0x00b6
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r0 != r11) goto L_0x00c2
                L_0x00b6:
                    zw.s0$a$b r0 = new zw.s0$a$b
                    c2.d r11 = r7.f132730f
                    U0.r0 r1 = r7.f132729e
                    r0.<init>(r11, r1)
                    r10.u(r0)
                L_0x00c2:
                    nI.l r0 = (nI.C17642l) r0
                    r10.P()
                    androidx.compose.ui.d r9 = androidx.compose.ui.layout.g.a(r9, r0)
                    r11 = 0
                    zw.s0.c(r8, r9, r10, r11, r11)
                    r10.P()
                    boolean r8 = U0.C4895p.J()
                    if (r8 == 0) goto L_0x00db
                    U0.C4895p.R()
                L_0x00db:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zw.s0.a.f.a(t0.c, int, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        a(j.a aVar, C17642l<? super Category, C16807N> lVar) {
            this.f132716a = aVar;
            this.f132717b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(j.a aVar, C17642l lVar, C4899r0 r0Var, c2.d dVar, x xVar) {
            C17542s.j(xVar, "$this$LazyRow");
            C15987c<Category> a10 = aVar.a();
            xVar.e(a10.size(), new d(new r0(), a10), new e(c.f132722c, a10), c1.c.c(-632812321, true, new f(a10, lVar, r0Var, dVar)));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final Object f(Category category) {
            C17542s.j(category, "item");
            return category.a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(t0.C5938c r19, U0.C4889m r20, int r21) {
            /*
                r18 = this;
                r0 = r18
                r10 = r20
                r1 = r21
                java.lang.String r2 = "$this$item"
                r3 = r19
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r20.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r20.L()
                goto L_0x00dc
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r4 = "com.ingka.ikea.offerhub.impl.ui.offerTypeCategoriesCarousel.<anonymous> (OfferTypeCategoriesComposables.kt:53)"
                r5 = 1633855561(0x6162a849, float:2.6131815E20)
                U0.C4895p.S(r5, r1, r2, r4)
            L_0x002e:
                U0.I0 r1 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r1 = r10.Q(r1)
                c2.d r1 = (c2.d) r1
                r2 = 526854750(0x1f672a5e, float:4.8951198E-20)
                r10.W(r2)
                java.lang.Object r2 = r20.D()
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r5 = r4.a()
                r6 = 2
                r7 = 0
                if (r2 != r5) goto L_0x005d
                r2 = 0
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                c2.h r2 = c2.h.m(r2)
                U0.r0 r2 = U0.u1.e(r2, r7, r6, r7)
                r10.u(r2)
            L_0x005d:
                U0.r0 r2 = (U0.C4899r0) r2
                r20.P()
                androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
                r8 = 24
                float r8 = (float) r8
                float r8 = c2.h.B(r8)
                androidx.compose.foundation.layout.d$f r5 = r5.n(r8)
                androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
                r8 = 36
                float r8 = (float) r8
                float r13 = c2.h.B(r8)
                r16 = 13
                r17 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r11, r12, r13, r14, r15, r16, r17)
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                r9 = 0
                s0.E r3 = androidx.compose.foundation.layout.D.c(r3, r9, r6, r7)
                r6 = 526863428(0x1f674c44, float:4.8979238E-20)
                r10.W(r6)
                Bw.j$a r6 = r0.f132716a
                boolean r6 = r10.F(r6)
                nI.l<com.ingka.ikea.core.model.Category, XH.N> r7 = r0.f132717b
                boolean r7 = r10.V(r7)
                r6 = r6 | r7
                boolean r7 = r10.V(r1)
                r6 = r6 | r7
                Bw.j$a r7 = r0.f132716a
                nI.l<com.ingka.ikea.core.model.Category, XH.N> r9 = r0.f132717b
                java.lang.Object r11 = r20.D()
                if (r6 != 0) goto L_0x00b5
                java.lang.Object r4 = r4.a()
                if (r11 != r4) goto L_0x00bd
            L_0x00b5:
                zw.q0 r11 = new zw.q0
                r11.<init>(r7, r9, r2, r1)
                r10.u(r11)
            L_0x00bd:
                r9 = r11
                nI.l r9 = (nI.C17642l) r9
                r20.P()
                r11 = 24966(0x6186, float:3.4985E-41)
                r12 = 234(0xea, float:3.28E-43)
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r13 = 0
                r1 = r8
                r8 = r13
                r10 = r20
                t0.C5937b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00dc
                U0.C4895p.R()
            L_0x00dc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zw.s0.a.c(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.ingka.ikea.core.model.Category r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            r3 = 2
            r4 = 1859797533(0x6eda421d, float:3.377383E28)
            r5 = r33
            U0.m r15 = r5.k(r4)
            r5 = r2 & 1
            if (r5 == 0) goto L_0x0017
            r5 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x0026
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = r3
        L_0x0024:
            r5 = r5 | r1
            goto L_0x0027
        L_0x0026:
            r5 = r1
        L_0x0027:
            r3 = r3 & r2
            if (r3 == 0) goto L_0x002f
            r5 = r5 | 48
        L_0x002c:
            r6 = r32
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r32
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r5 = r5 | r7
        L_0x0041:
            r7 = r5 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0055
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            r15.L()
            r3 = r6
            r4 = r15
            goto L_0x01b3
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x005b
        L_0x005a:
            r3 = r6
        L_0x005b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0067
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.offerhub.impl.ui.OfferTypeCategoryCircle (OfferTypeCategoriesComposables.kt:90)"
            U0.C4895p.S(r4, r5, r6, r7)
        L_0x0067:
            r4 = 120(0x78, float:1.68E-43)
            float r4 = (float) r4
            float r5 = c2.h.B(r4)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r3, r5)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r8 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r8)
            int r7 = U0.C4883j.a(r15, r8)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x009e
            U0.C4883j.c()
        L_0x009e:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x00ab
            r15.p(r11)
            goto L_0x00ae
        L_0x00ab:
            r15.t()
        L_0x00ae:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r10.e()
            U0.F1.c(r11, r9, r6)
            nI.p r6 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x00d8
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x00e6
        L_0x00d8:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r11.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r6)
        L_0x00e6:
            nI.p r6 = r10.d()
            U0.F1.c(r11, r5, r6)
            s0.h r5 = s0.C5862h.f28810a
            r5 = 828784104(0x31663de8, float:3.3504595E-9)
            r15.W(r5)
            boolean r5 = r15.F(r0)
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x0107
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x010f
        L_0x0107:
            zw.o0 r6 = new zw.o0
            r6.<init>(r0)
            r15.u(r6)
        L_0x010f:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            gs.e r5 = gs.f.a(r6, r15, r8)
            com.ingka.ikea.core.model.Image r6 = r31.b()
            java.lang.String r6 = r6.A0()
            int r7 = uK.C18146a.f148160N5
            t1.c r9 = J1.e.c(r7, r15, r8)
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r14, r4)
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r7 = m1.e.a(r4, r7)
            E1.k$a r4 = E1.C4478k.f5915a
            E1.k r12 = r4.a()
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            int r8 = gs.e.f97946h
            r17 = r8 | r4
            r18 = 0
            r19 = 1896(0x768, float:2.657E-42)
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r4 = 0
            r16 = 0
            r20 = r14
            r14 = r4
            r4 = r15
            r15 = r16
            r16 = r4
            gs.C11352b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r5 = r31.d()
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            Y1.j$a r7 = Y1.j.f14783b
            int r8 = r7.a()
            r7 = 12
            float r7 = (float) r7
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r7 = 0
            r16 = r20
            r20 = r7
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            Y1.j r18 = Y1.j.h(r8)
            r29 = 0
            r30 = 261112(0x3fbf8, float:3.65896E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r4
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01b3
            U0.C4895p.R()
        L_0x01b3:
            U0.Y0 r4 = r4.n()
            if (r4 == 0) goto L_0x01c1
            zw.p0 r5 = new zw.p0
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.s0.c(com.ingka.ikea.core.model.Category, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(Category category, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(category.b().getUrl());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(Category category, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(category, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void g(x xVar, j.a aVar, C17642l<? super Category, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(aVar, "offerTypeCategories");
        C17542s.j(lVar, "onOfferTypeCategoryClicked");
        xVar.b("OfferTypeCategories", "OfferTypeCategories", c.c(1633855561, true, new a(aVar, lVar)));
    }

    public static final void h(x xVar) {
        C17542s.j(xVar, "<this>");
        xVar.b("OfferTypeCategoriesLoading", "OfferTypeCategoriesLoading", C15378x.f132743a.b());
    }
}
