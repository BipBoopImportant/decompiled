package uB;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.s;
import s0.C5834E;
import s0.C5843N;
import s0.C5859e;
import tI.C17978n;
import vB.C15128a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKJ/c;", "LvB/a;", "carouselShoppingLists", "", "isExpandedWidth", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "e", "(LKJ/c;ZLandroidx/compose/ui/d;LnI/l;LU0/m;II)V", "Landroidx/compose/foundation/o;", "scrollState", "Ls0/E;", "contentPadding", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Li1/c$c;", "verticalAlignment", "Lc2/h;", "content", "c", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;Ls0/E;Landroidx/compose/foundation/layout/d$e;Li1/c$c;LnI/q;LU0/m;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f131325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f131326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f131327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5834E f131328d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5073d.e f131329e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c.C0386c f131330f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<h, C4889m, Integer, C16807N> f131331g;

        a(float f10, float f11, o oVar, C5834E e10, C5073d.e eVar, C5437c.C0386c cVar, q<? super h, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f131325a = f10;
            this.f131326b = f11;
            this.f131327c = oVar;
            this.f131328d = e10;
            this.f131329e = eVar;
            this.f131330f = cVar;
            this.f131331g = qVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(eVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-388081944, i10, -1, "com.ingka.ikea.shoppinglist.ui.ScrollableRow.<anonymous> (ShoppingListCarousel.kt:79)");
                }
                float B10 = h.B(eVar.c() - h.B(this.f131325a + this.f131326b));
                d a10 = C5116k1.a(D.h(androidx.compose.foundation.m.b(d.f18749a, this.f131327c, false, (s) null, false, 14, (Object) null), this.f131328d), "ShoppingListCarousel");
                C5073d.e eVar2 = this.f131329e;
                C5437c.C0386c cVar = this.f131330f;
                q<h, C4889m, Integer, C16807N> qVar = this.f131331g;
                I b10 = G.b(eVar2, cVar, mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, b10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar.d());
                C5843N n10 = C5843N.f28726a;
                qVar.invoke(h.m(B10), mVar, 0);
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
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<h, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f131332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<C15128a> f131333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f131334c;

        b(float f10, C15987c<C15128a> cVar, C17642l<? super String, C16807N> lVar) {
            this.f131332a = f10;
            this.f131333b = cVar;
            this.f131334c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C15128a aVar) {
            lVar.invoke(aVar.a());
            return C16807N.f139792a;
        }

        public final void b(float f10, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.c(f10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1389062086, i10, -1, "com.ingka.ikea.shoppinglist.ui.ShoppingListCarousel.<anonymous> (ShoppingListCarousel.kt:56)");
                }
                float B10 = h.B(h.B(C17978n.h(f10, this.f131332a)) - o.f131337a.b());
                C17642l<String, C16807N> lVar = this.f131334c;
                for (T t10 : C16877v.k1(this.f131333b, 3)) {
                    d z10 = J.z(d.f18749a, h.B((float) 0), B10);
                    mVar.W(-743044745);
                    boolean V10 = mVar.V(lVar) | mVar.V(t10);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new n(lVar, t10);
                        mVar.u(D10);
                    }
                    mVar.P();
                    C15112j.c(t10, z10, (C17631a) D10, mVar, 0, 0);
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
            b(((h) obj).G(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void c(androidx.compose.ui.d r23, androidx.compose.foundation.o r24, s0.C5834E r25, androidx.compose.foundation.layout.C5073d.e r26, i1.C5437c.C0386c r27, nI.q<? super c2.h, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r7 = r30
            r0 = -1153733230(0xffffffffbb3b6d92, float:-0.0028599245)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r23
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r23
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r23
            r4 = r7
        L_0x0029:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r31 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r24
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r24
        L_0x003e:
            r6 = 16
        L_0x0040:
            r4 = r4 | r6
            goto L_0x0044
        L_0x0042:
            r5 = r24
        L_0x0044:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r25
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r25
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r9
        L_0x005f:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r26
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r26
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r11
        L_0x007a:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r27
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r27
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r13
        L_0x0095:
            r13 = r31 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r4 = r4 | r14
        L_0x009c:
            r13 = r28
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            if (r13 != 0) goto L_0x009c
            r13 = r28
            boolean r14 = r1.F(r13)
            if (r14 == 0) goto L_0x00ae
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r14
        L_0x00b1:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00ca
            boolean r14 = r1.l()
            if (r14 != 0) goto L_0x00c1
            goto L_0x00ca
        L_0x00c1:
            r1.L()
            r2 = r3
            r3 = r5
            r4 = r10
            r5 = r12
            goto L_0x017e
        L_0x00ca:
            r1.G()
            r14 = r7 & 1
            r15 = 1
            if (r14 == 0) goto L_0x00ec
            boolean r14 = r1.O()
            if (r14 == 0) goto L_0x00d9
            goto L_0x00ec
        L_0x00d9:
            r1.L()
            r2 = r31 & 2
            if (r2 == 0) goto L_0x00e2
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e2:
            r2 = r3
            r3 = r5
        L_0x00e4:
            r5 = r10
            r6 = r12
        L_0x00e6:
            r22 = r8
            r8 = r4
            r4 = r22
            goto L_0x011f
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00f2
        L_0x00f1:
            r2 = r3
        L_0x00f2:
            r3 = r31 & 2
            r14 = 0
            if (r3 == 0) goto L_0x00fe
            androidx.compose.foundation.o r3 = androidx.compose.foundation.m.c(r14, r1, r14, r15)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00ff
        L_0x00fe:
            r3 = r5
        L_0x00ff:
            if (r6 == 0) goto L_0x010b
            float r5 = (float) r14
            float r5 = c2.h.B(r5)
            s0.E r5 = androidx.compose.foundation.layout.D.a(r5)
            r8 = r5
        L_0x010b:
            if (r9 == 0) goto L_0x0114
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            r10 = r5
        L_0x0114:
            if (r11 == 0) goto L_0x00e4
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.l()
            r6 = r5
            r5 = r10
            goto L_0x00e6
        L_0x011f:
            r1.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x012e
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.shoppinglist.ui.ScrollableRow (ShoppingListCarousel.kt:75)"
            U0.C4895p.S(r0, r8, r9, r10)
        L_0x012e:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r1.Q(r0)
            c2.t r0 = (c2.t) r0
            float r0 = androidx.compose.foundation.layout.D.g(r4, r0)
            U0.I0 r9 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r9 = r1.Q(r9)
            c2.t r9 = (c2.t) r9
            float r16 = androidx.compose.foundation.layout.D.f(r4, r9)
            uB.m$a r9 = new uB.m$a
            r14 = r9
            r10 = r15
            r15 = r0
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r28
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r0 = 54
            r11 = -388081944(0xffffffffe8de56e8, float:-8.399748E24)
            c1.a r11 = c1.c.e(r11, r10, r9, r1, r0)
            r0 = r8 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r14 = 6
            r9 = 0
            r10 = 0
            r8 = r2
            r12 = r1
            r13 = r0
            s0.C5858d.a(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x017b
            U0.C4895p.R()
        L_0x017b:
            r8 = r4
            r4 = r5
            r5 = r6
        L_0x017e:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0196
            uB.l r10 = new uB.l
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r8
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uB.m.c(androidx.compose.ui.d, androidx.compose.foundation.o, s0.E, androidx.compose.foundation.layout.d$e, i1.c$c, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(d dVar, o oVar, C5834E e10, C5073d.e eVar, C5437c.C0386c cVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, oVar, e10, eVar, cVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(KJ.C15987c<vB.C15128a> r16, boolean r17, androidx.compose.ui.d r18, nI.C17642l<? super java.lang.String, XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r21
            java.lang.String r0 = "carouselShoppingLists"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -482445323(0xffffffffe33e77f5, float:-3.5135252E21)
            r3 = r20
            U0.m r3 = r3.k(r0)
            r6 = r22 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0023
            r6 = r5 | 6
            goto L_0x0033
        L_0x0023:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0032
            boolean r6 = r3.V(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 4
            goto L_0x0030
        L_0x002f:
            r6 = r7
        L_0x0030:
            r6 = r6 | r5
            goto L_0x0033
        L_0x0032:
            r6 = r5
        L_0x0033:
            r8 = r22 & 2
            if (r8 == 0) goto L_0x003a
            r6 = r6 | 48
            goto L_0x004a
        L_0x003a:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x004a
            boolean r8 = r3.b(r2)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r6 = r6 | r8
        L_0x004a:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r9 = r18
            goto L_0x0065
        L_0x0053:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0050
            r9 = r18
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r6 = r6 | r10
        L_0x0065:
            r10 = r22 & 8
            if (r10 == 0) goto L_0x006c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x007c
            boolean r10 = r3.F(r4)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r10
        L_0x007c:
            r10 = r6 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008e
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r3.L()
            goto L_0x00f3
        L_0x008e:
            if (r8 == 0) goto L_0x0094
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r15 = r8
            goto L_0x0095
        L_0x0094:
            r15 = r9
        L_0x0095:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00a1
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.shoppinglist.ui.ShoppingListCarousel (ShoppingListCarousel.kt:49)"
            U0.C4895p.S(r0, r6, r8, r9)
        L_0x00a1:
            if (r2 == 0) goto L_0x00aa
            uB.o r0 = uB.o.f131337a
            float r0 = r0.a()
            goto L_0x00b0
        L_0x00aa:
            c2.h$a r0 = c2.h.f23031b
            float r0 = r0.c()
        L_0x00b0:
            tK.u r8 = tK.C18029u.f147649a
            float r9 = r8.d()
            r10 = 0
            r11 = 0
            s0.E r9 = androidx.compose.foundation.layout.D.c(r9, r10, r7, r11)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            float r8 = r8.l()
            androidx.compose.foundation.layout.d$f r10 = r7.n(r8)
            uB.m$b r7 = new uB.m$b
            r7.<init>(r0, r1, r4)
            r0 = 54
            r8 = 1389062086(0x52cb67c6, float:4.36809695E11)
            r11 = 1
            c1.a r11 = c1.c.e(r8, r11, r7, r3, r0)
            int r0 = r6 >> 6
            r0 = r0 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r13 = r0 | r6
            r14 = 18
            r7 = 0
            r0 = 0
            r6 = r15
            r8 = r9
            r9 = r10
            r10 = r0
            r12 = r3
            c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f2
            U0.C4895p.R()
        L_0x00f2:
            r9 = r15
        L_0x00f3:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x010d
            uB.k r8 = new uB.k
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r9
            r4 = r19
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uB.m.e(KJ.c, boolean, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C15987c cVar, boolean z10, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        e(cVar, z10, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
