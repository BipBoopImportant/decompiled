package Op;

import A0.f;
import GJ.C15768k;
import KJ.C15987c;
import LC.C13178b;
import SC.P1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.layout.g;
import b2.C5259a;
import c2.h;
import c2.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import s0.C5834E;
import t0.C5934A;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aY\u0010\u000e\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016\"\u001a\u0010!\u001a\u00020\u001c8\u0002X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LKJ/c;", "LOp/d1;", "products", "Lkotlin/Function1;", "LOp/c1;", "LXH/N;", "onProductItemEvent", "Landroidx/compose/ui/d;", "modifier", "Lt0/A;", "lazyListState", "", "isCompactDesign", "showLargeImage", "g", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;Lt0/A;ZZLU0/m;II)V", "", "numberOfProducts", "e", "(ZLandroidx/compose/ui/d;IZLU0/m;II)V", "Lc2/h;", "a", "F", "PRODUCT_WIDTH_COMPACT", "b", "PRODUCT_WIDTH_REGULAR", "c", "PRODUCT_WIDTH_LARGE_IMAGE", "", "d", "Ljava/lang/String;", "getLoremIpsum$annotations", "()V", "loremIpsum", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {

    /* renamed from: a  reason: collision with root package name */
    private static final float f84928a = h.B((float) 152);

    /* renamed from: b  reason: collision with root package name */
    private static final float f84929b = h.B((float) 176);

    /* renamed from: c  reason: collision with root package name */
    private static final float f84930c = h.B((float) 296);

    /* renamed from: d  reason: collision with root package name */
    private static final String f84931d = C15768k.Q(new C5259a(20).getValues(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<r, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c2.d f84932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f84933b;

        a(c2.d dVar, C4899r0<h> r0Var) {
            this.f84932a = dVar;
            this.f84933b = r0Var;
        }

        public final void a(long j10) {
            float H10 = this.f84932a.H(r.g(j10));
            if (h.v(H10, this.f84933b.getValue().G()) > 0) {
                this.f84933b.setValue(h.m(H10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final b f84934c = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(d1 d1Var) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f84935c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f84936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f84935c = lVar;
            this.f84936d = list;
        }

        public final Object a(int i10) {
            return this.f84935c.invoke(this.f84936d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f84937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f84938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f84937c = lVar;
            this.f84938d = list;
        }

        public final Object a(int i10) {
            return this.f84937c.invoke(this.f84938d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f84939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f84940d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0 f84941e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c2.d f84942f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f84943g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f84944h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13178b.a f84945i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, float f10, C4899r0 r0Var, c2.d dVar, C17642l lVar, boolean z10, C13178b.a aVar) {
            super(4);
            this.f84939c = list;
            this.f84940d = f10;
            this.f84941e = r0Var;
            this.f84942f = dVar;
            this.f84943g = lVar;
            this.f84944h = z10;
            this.f84945i = aVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            int i13 = i10;
            C4889m mVar2 = mVar;
            if ((i11 & 6) == 0) {
                i12 = i11 | (mVar2.V(cVar) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar2.d(i13) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                d1 d1Var = (d1) this.f84939c.get(i13);
                mVar2.W(1059276695);
                androidx.compose.ui.d b10 = J.b(J.y(androidx.compose.ui.d.f18749a, this.f84940d), 0.0f, ((h) this.f84941e.getValue()).G(), 1, (Object) null);
                mVar2.W(172722626);
                boolean V10 = mVar2.V(this.f84942f);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(this.f84942f, this.f84941e);
                    mVar2.u(D10);
                }
                mVar.P();
                C10872z0.y0(d1Var, this.f84943g, this.f84944h, g.a(b10, (C17642l) D10), P1.XSmall, this.f84945i, (C5834E) null, (C5834E) null, false, (f) null, (A) null, (C17631a<C16807N>) null, (C17631a<C16807N>) null, mVar, 24576 | (C13178b.a.f111819b << 15), 0, 8128);
                mVar.P();
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

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(boolean r28, androidx.compose.ui.d r29, int r30, boolean r31, U0.C4889m r32, int r33, int r34) {
        /*
            r1 = r28
            r5 = r33
            r0 = 2
            r2 = 4
            r3 = 6
            r4 = -576161600(0xffffffffdda878c0, float:-1.51745799E18)
            r6 = r32
            U0.m r6 = r6.k(r4)
            r7 = 1
            r8 = r34 & 1
            if (r8 == 0) goto L_0x0018
            r8 = r5 | 6
            goto L_0x0028
        L_0x0018:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x0027
            boolean r8 = r6.b(r1)
            if (r8 == 0) goto L_0x0024
            r8 = r2
            goto L_0x0025
        L_0x0024:
            r8 = r0
        L_0x0025:
            r8 = r8 | r5
            goto L_0x0028
        L_0x0027:
            r8 = r5
        L_0x0028:
            r0 = r34 & 2
            r9 = 16
            if (r0 == 0) goto L_0x0033
            r8 = r8 | 48
        L_0x0030:
            r10 = r29
            goto L_0x0044
        L_0x0033:
            r10 = r5 & 48
            if (r10 != 0) goto L_0x0030
            r10 = r29
            boolean r11 = r6.V(r10)
            if (r11 == 0) goto L_0x0042
            r11 = 32
            goto L_0x0043
        L_0x0042:
            r11 = r9
        L_0x0043:
            r8 = r8 | r11
        L_0x0044:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x004d
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r11 = r30
            goto L_0x005f
        L_0x004d:
            r11 = r5 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004a
            r11 = r30
            boolean r12 = r6.d(r11)
            if (r12 == 0) goto L_0x005c
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r8 = r8 | r12
        L_0x005f:
            r12 = r34 & 8
            if (r12 == 0) goto L_0x0068
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r13 = r31
            goto L_0x007a
        L_0x0068:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0065
            r13 = r31
            boolean r14 = r6.b(r13)
            if (r14 == 0) goto L_0x0077
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r8 = r8 | r14
        L_0x007a:
            r14 = r8 & 1171(0x493, float:1.641E-42)
            r15 = 1170(0x492, float:1.64E-42)
            if (r14 != r15) goto L_0x008f
            boolean r14 = r6.l()
            if (r14 != 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            r6.L()
        L_0x008a:
            r2 = r10
            r3 = r11
            r4 = r13
            goto L_0x0199
        L_0x008f:
            if (r0 == 0) goto L_0x0094
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r10 = r0
        L_0x0094:
            if (r2 == 0) goto L_0x0098
            r0 = 3
            r11 = r0
        L_0x0098:
            r0 = 0
            if (r12 == 0) goto L_0x009c
            r13 = r0
        L_0x009c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a8
            r2 = -1
            java.lang.String r12 = "com.ingka.ikea.design.ui.product.LoadingProductItemCarousel (ProductItemCarousel.kt:128)"
            U0.C4895p.S(r4, r8, r2, r12)
        L_0x00a8:
            r2 = 0
            r4 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.h(r10, r2, r7, r4)
            float r9 = (float) r9
            float r15 = c2.h.B(r9)
            r19 = 14
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.d r21 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.o r22 = androidx.compose.foundation.m.c(r0, r6, r0, r7)
            r26 = 14
            r27 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            androidx.compose.ui.d r12 = androidx.compose.foundation.m.b(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r14 = "LOADING_PRODUCT_CAROUSEL"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r12, r14)
            androidx.compose.foundation.layout.d r14 = androidx.compose.foundation.layout.C5073d.f18068a
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r9 = r14.n(r9)
            i1.c$a r14 = i1.C5437c.f24302a
            i1.c$c r14 = r14.l()
            E1.I r3 = androidx.compose.foundation.layout.G.b(r9, r14, r6, r3)
            int r9 = U0.C4883j.a(r6, r0)
            U0.y r14 = r6.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r6, r12)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r0 = r15.a()
            U0.f r16 = r6.m()
            if (r16 != 0) goto L_0x0108
            U0.C4883j.c()
        L_0x0108:
            r6.I()
            boolean r16 = r6.i()
            if (r16 == 0) goto L_0x0115
            r6.p(r0)
            goto L_0x0118
        L_0x0115:
            r6.t()
        L_0x0118:
            U0.m r0 = U0.F1.a(r6)
            nI.p r2 = r15.c()
            U0.F1.c(r0, r3, r2)
            nI.p r2 = r15.e()
            U0.F1.c(r0, r14, r2)
            nI.p r2 = r15.b()
            boolean r3 = r0.i()
            if (r3 != 0) goto L_0x0142
            java.lang.Object r3 = r0.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 != 0) goto L_0x0150
        L_0x0142:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0.w(r3, r2)
        L_0x0150:
            nI.p r2 = r15.d()
            U0.F1.c(r0, r12, r2)
            s0.N r0 = s0.C5843N.f28726a
            r0 = 863376454(0x33761446, float:5.7294777E-8)
            r6.W(r0)
            r0 = 0
        L_0x0160:
            if (r0 >= r11) goto L_0x0188
            if (r13 == 0) goto L_0x0167
            float r2 = f84930c
            goto L_0x016e
        L_0x0167:
            if (r1 == 0) goto L_0x016c
            float r2 = f84928a
            goto L_0x016e
        L_0x016c:
            float r2 = f84929b
        L_0x016e:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.y(r3, r2)
            r3 = 300(0x12c, float:4.2E-43)
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            r9 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.b(r2, r9, r3, r7, r4)
            r3 = r8 & 14
            r12 = 0
            Op.C10871z.b(r1, r2, r6, r3, r12)
            int r0 = r0 + r7
            goto L_0x0160
        L_0x0188:
            r6.P()
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x008a
            U0.C4895p.R()
            goto L_0x008a
        L_0x0199:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x01ae
            Op.G r8 = new Op.G
            r0 = r8
            r1 = r28
            r5 = r33
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.K.e(boolean, androidx.compose.ui.d, int, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, androidx.compose.ui.d dVar, int i10, boolean z11, int i11, int i12, C4889m mVar, int i13) {
        e(z10, dVar, i10, z11, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<Op.d1> r29, nI.C17642l<? super Op.c1, XH.C16807N> r30, androidx.compose.ui.d r31, t0.C5934A r32, boolean r33, boolean r34, U0.C4889m r35, int r36, int r37) {
        /*
            r8 = r29
            r7 = r30
            r6 = r36
            java.lang.String r0 = "products"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = -177274841(0xfffffffff56f0027, float:-3.0296925E32)
            r1 = r35
            U0.m r5 = r1.k(r0)
            r1 = r37 & 1
            r3 = 2
            if (r1 == 0) goto L_0x0021
            r1 = r6 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r6 & 6
            if (r1 != 0) goto L_0x0030
            boolean r1 = r5.V(r8)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = r3
        L_0x002e:
            r1 = r1 | r6
            goto L_0x0031
        L_0x0030:
            r1 = r6
        L_0x0031:
            r4 = r37 & 2
            r9 = 16
            if (r4 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x0049
        L_0x003a:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x0049
            boolean r4 = r5.F(r7)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0048
        L_0x0047:
            r4 = r9
        L_0x0048:
            r1 = r1 | r4
        L_0x0049:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r11 = r31
            goto L_0x0064
        L_0x0052:
            r11 = r6 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004f
            r11 = r31
            boolean r12 = r5.V(r11)
            if (r12 == 0) goto L_0x0061
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r12
        L_0x0064:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x007d
            r12 = r37 & 8
            if (r12 != 0) goto L_0x0077
            r12 = r32
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r12 = r32
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r13
            goto L_0x007f
        L_0x007d:
            r12 = r32
        L_0x007f:
            r13 = r37 & 16
            if (r13 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r15 = r33
            goto L_0x009b
        L_0x0088:
            r15 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0085
            r15 = r33
            boolean r16 = r5.b(r15)
            if (r16 == 0) goto L_0x0097
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r16
        L_0x009b:
            r16 = r37 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a6
            r1 = r1 | r17
            r14 = r34
            goto L_0x00b9
        L_0x00a6:
            r17 = r6 & r17
            r14 = r34
            if (r17 != 0) goto L_0x00b9
            boolean r17 = r5.b(r14)
            if (r17 == 0) goto L_0x00b5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r17
        L_0x00b9:
            r17 = 74899(0x12493, float:1.04956E-40)
            r10 = r1 & r17
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r2) goto L_0x00d5
            boolean r2 = r5.l()
            if (r2 != 0) goto L_0x00ca
            goto L_0x00d5
        L_0x00ca:
            r5.L()
            r4 = r5
            r3 = r11
            r26 = r12
            r6 = r14
            r5 = r15
            goto L_0x0275
        L_0x00d5:
            r5.G()
            r2 = r6 & 1
            r10 = 0
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r5.O()
            if (r2 == 0) goto L_0x00e4
            goto L_0x00f6
        L_0x00e4:
            r5.L()
            r2 = r37 & 8
            if (r2 == 0) goto L_0x00ed
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ed:
            r4 = r11
            r26 = r12
            r28 = r14
        L_0x00f2:
            r27 = r15
            r11 = r1
            goto L_0x0112
        L_0x00f6:
            if (r4 == 0) goto L_0x00fb
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r11 = r2
        L_0x00fb:
            r2 = r37 & 8
            if (r2 == 0) goto L_0x0107
            r2 = 3
            t0.A r2 = t0.C5935B.c(r10, r10, r5, r10, r2)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r12 = r2
        L_0x0107:
            if (r13 == 0) goto L_0x010a
            r15 = r10
        L_0x010a:
            if (r16 == 0) goto L_0x00ed
            r28 = r10
            r4 = r11
            r26 = r12
            goto L_0x00f2
        L_0x0112:
            r5.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0121
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.design.ui.product.ProductItemCarousel (ProductItemCarousel.kt:59)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x0121:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r28 == 0) goto L_0x0182
            int r12 = r29.size()
            if (r12 != r2) goto L_0x0182
            r3 = 790571581(0x2f1f2a3d, float:1.4475972E-10)
            r5.W(r3)
            java.lang.Object r3 = YH.C16877v.w0(r29)
            r9 = r3
            Op.d1 r9 = (Op.d1) r9
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r4, r0, r2, r1)
            androidx.compose.ui.d r12 = TC.e.i(r0)
            SC.P1 r13 = SC.P1.XSmall
            LC.b$a r14 = LC.C13178b.a.f111818a
            r0 = 12
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            s0.E r15 = androidx.compose.foundation.layout.D.a(r0)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r1 = 1597440(0x186000, float:2.23849E-39)
            r0 = r0 | r1
            int r1 = r11 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = LC.C13178b.a.f111819b
            int r1 = r1 << 15
            r23 = r0 | r1
            r24 = 0
            r25 = 8064(0x1f80, float:1.13E-41)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = r30
            r11 = r27
            r22 = r5
            Op.C10872z0.y0(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.P()
            r21 = r4
            r4 = r5
            goto L_0x0266
        L_0x0182:
            r12 = 791143748(0x2f27e544, float:1.5270013E-10)
            r5.W(r12)
            U0.I0 r12 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r12 = r5.Q(r12)
            c2.d r12 = (c2.d) r12
            r13 = 25521389(0x1856ced, float:4.9012785E-38)
            r5.W(r13)
            java.lang.Object r13 = r5.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r15 = r14.a()
            if (r13 != r15) goto L_0x01b4
            float r13 = (float) r10
            float r13 = c2.h.B(r13)
            c2.h r13 = c2.h.m(r13)
            U0.r0 r13 = U0.u1.e(r13, r1, r3, r1)
            r5.u(r13)
        L_0x01b4:
            U0.r0 r13 = (U0.C4899r0) r13
            r5.P()
            if (r28 == 0) goto L_0x01be
            float r15 = f84930c
            goto L_0x01c5
        L_0x01be:
            if (r27 == 0) goto L_0x01c3
            float r15 = f84928a
            goto L_0x01c5
        L_0x01c3:
            float r15 = f84929b
        L_0x01c5:
            LC.b$a r3 = LC.C13178b.a.f111818a
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.J.h(r4, r0, r2, r1)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            float r0 = (float) r10
            float r0 = c2.h.B(r0)
            androidx.compose.foundation.layout.d$f r20 = r2.n(r0)
            float r0 = (float) r9
            float r0 = c2.h.B(r0)
            r2 = 2
            r9 = 0
            s0.E r16 = androidx.compose.foundation.layout.D.c(r0, r9, r2, r1)
            r0 = 25539763(0x185b4b3, float:4.9115775E-38)
            r5.W(r0)
            r0 = r11 & 14
            r1 = 4
            if (r0 != r1) goto L_0x01ee
            r0 = 1
            goto L_0x01ef
        L_0x01ee:
            r0 = r10
        L_0x01ef:
            boolean r1 = r5.c(r15)
            r0 = r0 | r1
            boolean r1 = r5.V(r12)
            r0 = r0 | r1
            r1 = r11 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r1 != r2) goto L_0x0201
            r1 = 1
            goto L_0x0202
        L_0x0201:
            r1 = r10
        L_0x0202:
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r11
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r2) goto L_0x020c
            r10 = 1
        L_0x020c:
            r0 = r0 | r10
            boolean r1 = r5.F(r3)
            r0 = r0 | r1
            java.lang.Object r1 = r5.D()
            if (r0 != 0) goto L_0x0223
            java.lang.Object r0 = r14.a()
            if (r1 != r0) goto L_0x021f
            goto L_0x0223
        L_0x021f:
            r21 = r4
            r15 = r5
            goto L_0x023b
        L_0x0223:
            Op.H r9 = new Op.H
            r0 = r9
            r1 = r29
            r2 = r15
            r10 = r3
            r3 = r13
            r21 = r4
            r4 = r12
            r15 = r5
            r5 = r30
            r6 = r27
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.u(r9)
            r1 = r9
        L_0x023b:
            r17 = r1
            nI.l r17 = (nI.C17642l) r17
            r15.P()
            int r0 = r11 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 24960(0x6180, float:3.4976E-41)
            r1 = 232(0xe8, float:3.25E-43)
            r12 = 0
            r14 = 0
            r2 = 0
            r3 = 0
            r9 = r19
            r10 = r26
            r11 = r16
            r13 = r20
            r4 = r15
            r15 = r2
            r16 = r3
            r18 = r4
            r19 = r0
            r20 = r1
            t0.C5937b.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.P()
        L_0x0266:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x026f
            U0.C4895p.R()
        L_0x026f:
            r3 = r21
            r5 = r27
            r6 = r28
        L_0x0275:
            U0.Y0 r9 = r4.n()
            if (r9 == 0) goto L_0x028e
            Op.I r10 = new Op.I
            r0 = r10
            r1 = r29
            r2 = r30
            r4 = r26
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.K.g(KJ.c, nI.l, androidx.compose.ui.d, t0.A, boolean, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, float f10, C4899r0 r0Var, c2.d dVar, C17642l lVar, boolean z10, C13178b.a aVar, x xVar) {
        C15987c cVar2 = cVar;
        x xVar2 = xVar;
        C17542s.j(xVar2, "$this$LazyRow");
        xVar2.e(cVar.size(), new c(new J(), cVar), new d(b.f84934c, cVar), c1.c.c(-632812321, true, new e(cVar, f10, r0Var, dVar, lVar, z10, aVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object i(d1 d1Var) {
        C17542s.j(d1Var, "item");
        return Long.valueOf(d1Var.f());
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, C5934A a10, boolean z10, boolean z11, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, lVar, dVar, a10, z10, z11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
