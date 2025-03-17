package tk;

import O0.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pk.s;
import s0.C5848T;
import s0.a0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u0010\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpk/s$n;", "state", "LO0/F0;", "sheetState", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "Lkotlin/Function1;", "Lpk/s$n$e;", "onProductClick", "onFavouriteClick", "onEnergyLabelClick", "onRetryClick", "onSnackbarDismissed", "Landroidx/compose/ui/d;", "modifier", "e", "(Lpk/s$n;LO0/F0;LnI/a;LnI/l;LnI/l;LnI/l;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsBottomSheetKt$SimilarItemsBottomSheet$2$1$1", f = "SimilarItemsBottomSheet.kt", l = {51}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f102877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F0 f02, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f102877d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f102877d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f102876c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f102877d;
                this.f102876c = 1;
                if (f02.k(this) == f10) {
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
    static final class b implements p<C4889m, Integer, C5848T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102878a = new b();

        b() {
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(-314678503);
            if (C4895p.J()) {
                C4895p.S(-314678503, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsBottomSheet.<anonymous> (SimilarItemsBottomSheet.kt:59)");
            }
            C5848T c10 = a0.c(C5848T.f28733a, mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return c10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.n f102879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f102880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f102884f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f102885g;

        c(s.n nVar, C17631a<C16807N> aVar, C17642l<? super s.n.e, C16807N> lVar, C17642l<? super s.n.e, C16807N> lVar2, C17642l<? super s.n.e, C16807N> lVar3, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f102879a = nVar;
            this.f102880b = aVar;
            this.f102881c = lVar;
            this.f102882d = lVar2;
            this.f102883e = lVar3;
            this.f102884f = aVar2;
            this.f102885g = aVar3;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1285974266, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsBottomSheet.<anonymous> (SimilarItemsBottomSheet.kt:62)");
                }
                o.o(this.f102879a, this.f102880b, this.f102881c, this.f102882d, this.f102883e, this.f102884f, this.f102885g, (d) null, mVar, 0, 128);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(pk.s.n r30, O0.F0 r31, nI.C17631a<XH.C16807N> r32, nI.C17642l<? super pk.s.n.e, XH.C16807N> r33, nI.C17642l<? super pk.s.n.e, XH.C16807N> r34, nI.C17642l<? super pk.s.n.e, XH.C16807N> r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r8 = r30
            r15 = r31
            r14 = r32
            r13 = r33
            r12 = r34
            r11 = r35
            r10 = r36
            r9 = r37
            r7 = r40
            r6 = r41
            java.lang.String r0 = "sheetState"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onProductClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onFavouriteClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onEnergyLabelClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onRetryClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onSnackbarDismissed"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 885945002(0x34ce72aa, float:3.845392E-7)
            r1 = r39
            U0.m r5 = r1.k(r0)
            r1 = r6 & 1
            if (r1 == 0) goto L_0x0047
            r1 = r7 | 6
            goto L_0x0060
        L_0x0047:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x005f
            r1 = r7 & 8
            if (r1 != 0) goto L_0x0054
            boolean r1 = r5.V(r8)
            goto L_0x0058
        L_0x0054:
            boolean r1 = r5.F(r8)
        L_0x0058:
            if (r1 == 0) goto L_0x005c
            r1 = 4
            goto L_0x005d
        L_0x005c:
            r1 = 2
        L_0x005d:
            r1 = r1 | r7
            goto L_0x0060
        L_0x005f:
            r1 = r7
        L_0x0060:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0067
            r1 = r1 | 48
            goto L_0x0077
        L_0x0067:
            r2 = r7 & 48
            if (r2 != 0) goto L_0x0077
            boolean r2 = r5.V(r15)
            if (r2 == 0) goto L_0x0074
            r2 = 32
            goto L_0x0076
        L_0x0074:
            r2 = 16
        L_0x0076:
            r1 = r1 | r2
        L_0x0077:
            r2 = r6 & 4
            if (r2 == 0) goto L_0x007e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x008e
        L_0x007e:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x008e
            boolean r2 = r5.F(r14)
            if (r2 == 0) goto L_0x008b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x008d
        L_0x008b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x008d:
            r1 = r1 | r2
        L_0x008e:
            r2 = r6 & 8
            if (r2 == 0) goto L_0x0095
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a5
        L_0x0095:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00a5
            boolean r2 = r5.F(r13)
            if (r2 == 0) goto L_0x00a2
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x00a4
        L_0x00a2:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x00a4:
            r1 = r1 | r2
        L_0x00a5:
            r2 = r6 & 16
            if (r2 == 0) goto L_0x00ac
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bc
        L_0x00ac:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00bc
            boolean r2 = r5.F(r12)
            if (r2 == 0) goto L_0x00b9
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bb
        L_0x00b9:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00bb:
            r1 = r1 | r2
        L_0x00bc:
            r2 = r6 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00c5
            r1 = r1 | r16
            goto L_0x00d5
        L_0x00c5:
            r2 = r7 & r16
            if (r2 != 0) goto L_0x00d5
            boolean r2 = r5.F(r11)
            if (r2 == 0) goto L_0x00d2
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d4
        L_0x00d2:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00d4:
            r1 = r1 | r2
        L_0x00d5:
            r2 = r6 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00de
            r1 = r1 | r16
            goto L_0x00ee
        L_0x00de:
            r2 = r7 & r16
            if (r2 != 0) goto L_0x00ee
            boolean r2 = r5.F(r10)
            if (r2 == 0) goto L_0x00eb
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ed
        L_0x00eb:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00ed:
            r1 = r1 | r2
        L_0x00ee:
            r2 = r6 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00f7
            r1 = r1 | r16
            goto L_0x0107
        L_0x00f7:
            r2 = r7 & r16
            if (r2 != 0) goto L_0x0107
            boolean r2 = r5.F(r9)
            if (r2 == 0) goto L_0x0104
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r2
        L_0x0107:
            r2 = r6 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0112
            r1 = r1 | r16
            r4 = r38
            goto L_0x0125
        L_0x0112:
            r16 = r7 & r16
            r4 = r38
            if (r16 != 0) goto L_0x0125
            boolean r16 = r5.V(r4)
            if (r16 == 0) goto L_0x0121
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x0121:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r1 = r1 | r16
        L_0x0125:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r1 & r16
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r0) goto L_0x013d
            boolean r0 = r5.l()
            if (r0 != 0) goto L_0x0136
            goto L_0x013d
        L_0x0136:
            r5.L()
            r9 = r4
            r1 = r5
            goto L_0x0267
        L_0x013d:
            if (r2 == 0) goto L_0x0144
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r23 = r0
            goto L_0x0146
        L_0x0144:
            r23 = r4
        L_0x0146:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0155
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsBottomSheet (SimilarItemsBottomSheet.kt:38)"
            r3 = 885945002(0x34ce72aa, float:3.845392E-7)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0155:
            if (r8 != 0) goto L_0x0188
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0160
            U0.C4895p.R()
        L_0x0160:
            U0.Y0 r5 = r5.n()
            if (r5 == 0) goto L_0x0187
            tk.c r4 = new tk.c
            r0 = r4
            r1 = r30
            r2 = r31
            r3 = r32
            r14 = r4
            r4 = r33
            r13 = r5
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r23
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.a(r14)
        L_0x0187:
            return
        L_0x0188:
            java.lang.Object r0 = r5.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            if (r0 != r3) goto L_0x01a3
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r5)
            U0.B r3 = new U0.B
            r3.<init>(r0)
            r5.u(r3)
            r0 = r3
        L_0x01a3:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            int r25 = uK.C18146a.f148097J2
            r3 = 912756557(0x36678f4d, float:3.4505094E-6)
            r5.W(r3)
            boolean r3 = r5.F(r0)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r7 = 1
            r6 = 32
            if (r4 != r6) goto L_0x01be
            r4 = r7
            goto L_0x01bf
        L_0x01be:
            r4 = 0
        L_0x01bf:
            r3 = r3 | r4
            r4 = r1 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r4 != r6) goto L_0x01c8
            r6 = r7
            goto L_0x01c9
        L_0x01c8:
            r6 = 0
        L_0x01c9:
            r3 = r3 | r6
            java.lang.Object r4 = r5.D()
            if (r3 != 0) goto L_0x01d6
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01de
        L_0x01d6:
            tk.d r4 = new tk.d
            r4.<init>(r0, r15, r14)
            r5.u(r4)
        L_0x01de:
            r27 = r4
            nI.a r27 = (nI.C17631a) r27
            r5.P()
            SC.y1 r0 = new SC.y1
            r26 = 0
            r28 = 2
            r29 = 0
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29)
            SC.x1$a r6 = new SC.x1$a
            r2 = 0
            r6.<init>(r0, r2)
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r5, r2)
            long r16 = r0.k0()
            tk.g$b r18 = tk.g.b.f102878a
            tk.g$c r4 = new tk.g$c
            r0 = r4
            r19 = r1
            r1 = r30
            r2 = r32
            r3 = r33
            r8 = r4
            r4 = r34
            r14 = r5
            r5 = r35
            r20 = r6
            r6 = r36
            r9 = r7
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 54
            r1 = 1285974266(0x4ca668fa, float:8.72468E7)
            c1.a r0 = c1.c.e(r1, r9, r8, r14, r0)
            int r1 = r19 >> 6
            r1 = r1 & 14
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r2
            int r2 = r19 >> 21
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r19 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = SC.C13656x1.a.f116491c
            int r2 = r2 << 9
            r21 = r1 | r2
            r22 = 176(0xb0, float:2.47E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r9 = r32
            r10 = r23
            r11 = r31
            r12 = r20
            r13 = r1
            r1 = r14
            r14 = r2
            r15 = r16
            r17 = r3
            r19 = r0
            r20 = r1
            SC.J.d(r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0265
            U0.C4895p.R()
        L_0x0265:
            r9 = r23
        L_0x0267:
            U0.Y0 r12 = r1.n()
            if (r12 == 0) goto L_0x028a
            tk.e r13 = new tk.e
            r0 = r13
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.g.e(pk.s$n, O0.F0, nI.a, nI.l, nI.l, nI.l, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(s.n nVar, F0 f02, C17631a aVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar2, C17631a aVar3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(nVar, f02, aVar, lVar, lVar2, lVar3, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Q q10, F0 f02, C17631a aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new a(f02, (C17164e<? super a>) null), 3, (Object) null).s(new f(f02, aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(F0 f02, C17631a aVar, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(s.n nVar, F0 f02, C17631a aVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar2, C17631a aVar3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(nVar, f02, aVar, lVar, lVar2, lVar3, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
