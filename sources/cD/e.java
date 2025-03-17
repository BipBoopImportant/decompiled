package CD;

import GD.C12929b;
import GD.k;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;
import p0.v;
import s0.C5857c;
import t1.C5942c;
import xD.C15208e;
import xD.C15210g;
import xD.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LGD/b;", "header", "Lt1/c;", "qrPainter", "", "isExpired", "Lp0/v;", "orientation", "Lkotlin/Function0;", "LXH/N;", "onCardDetailsClicked", "Landroidx/compose/ui/d;", "modifier", "isLoading", "LxD/e;", "contentColor", "b", "(LGD/b;Lt1/c;ZLp0/v;LnI/a;Landroidx/compose/ui/d;ZLxD/e;LU0/m;II)V", "LGD/k$b$g;", "state", "d", "(LGD/k$b$g;LU0/m;I)Lt1/c;", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f108380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5942c f108381b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: CD.e$a$a  reason: collision with other inner class name */
        static final class C2592a implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f108382a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5942c f108383b;

            C2592a(boolean z10, C5942c cVar) {
                this.f108382a = z10;
                this.f108383b = cVar;
            }

            public final void a(C5857c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$QrCodeContainer");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(817086206, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.PrepaidCardFront.<anonymous>.<anonymous> (PrepaidCardFront.kt:43)");
                    }
                    if (this.f108382a) {
                        mVar.W(-359519700);
                        C15210g.b(J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
                        mVar.P();
                    } else {
                        mVar.W(-359441735);
                        k.d(this.f108383b, J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 48, 0);
                        mVar.P();
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
                a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        a(boolean z10, C5942c cVar) {
            this.f108380a = z10;
            this.f108381b = cVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$CardFrontScaffold");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1428234258, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.PrepaidCardFront.<anonymous> (PrepaidCardFront.kt:42)");
                }
                k.f((d) null, c.e(817086206, true, new C2592a(this.f108380a, this.f108381b), mVar, 54), mVar, 48, 1);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(GD.C12929b r25, t1.C5942c r26, boolean r27, p0.v r28, nI.C17631a<XH.C16807N> r29, androidx.compose.ui.d r30, boolean r31, xD.C15208e r32, U0.C4889m r33, int r34, int r35) {
        /*
            r14 = r25
            r15 = r26
            r13 = r27
            r12 = r28
            r11 = r29
            r10 = r34
            r8 = r35
            java.lang.String r0 = "header"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "qrPainter"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onCardDetailsClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1938779789(0xffffffff8c709173, float:-1.8532697E-31)
            r1 = r33
            U0.m r9 = r1.k(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r10 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0041
            boolean r1 = r9.V(r14)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r10
            goto L_0x0042
        L_0x0041:
            r1 = r10
        L_0x0042:
            r2 = r8 & 2
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0059
            boolean r2 = r9.F(r15)
            if (r2 == 0) goto L_0x0056
            r2 = 32
            goto L_0x0058
        L_0x0056:
            r2 = 16
        L_0x0058:
            r1 = r1 | r2
        L_0x0059:
            r2 = r8 & 4
            if (r2 == 0) goto L_0x0060
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0070
            boolean r2 = r9.b(r13)
            if (r2 == 0) goto L_0x006d
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r1 = r1 | r2
        L_0x0070:
            r2 = r8 & 8
            if (r2 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0087
            boolean r2 = r9.V(r12)
            if (r2 == 0) goto L_0x0084
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r1 = r1 | r2
        L_0x0087:
            r2 = r8 & 16
            if (r2 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008e:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x009e
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x009b
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r2
        L_0x009e:
            r2 = r8 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a8
            r1 = r1 | r3
        L_0x00a5:
            r3 = r30
            goto L_0x00b9
        L_0x00a8:
            r3 = r3 & r10
            if (r3 != 0) goto L_0x00a5
            r3 = r30
            boolean r4 = r9.V(r3)
            if (r4 == 0) goto L_0x00b6
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r4
        L_0x00b9:
            r4 = r8 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r4 == 0) goto L_0x00c3
            r1 = r1 | r5
        L_0x00c0:
            r5 = r31
            goto L_0x00d4
        L_0x00c3:
            r5 = r5 & r10
            if (r5 != 0) goto L_0x00c0
            r5 = r31
            boolean r6 = r9.b(r5)
            if (r6 == 0) goto L_0x00d1
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r1 = r1 | r6
        L_0x00d4:
            r6 = r8 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00de
            r1 = r1 | r7
        L_0x00db:
            r7 = r32
            goto L_0x00f0
        L_0x00de:
            r7 = r7 & r10
            if (r7 != 0) goto L_0x00db
            r7 = r32
            boolean r16 = r9.V(r7)
            if (r16 == 0) goto L_0x00ec
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r1 = r1 | r16
        L_0x00f0:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r0 = r1 & r16
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x010c
            boolean r0 = r9.l()
            if (r0 != 0) goto L_0x0101
            goto L_0x010c
        L_0x0101:
            r9.L()
            r6 = r30
            r8 = r7
            r24 = r9
            r7 = r5
            goto L_0x0190
        L_0x010c:
            if (r2 == 0) goto L_0x0113
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r16 = r0
            goto L_0x0115
        L_0x0113:
            r16 = r30
        L_0x0115:
            if (r4 == 0) goto L_0x011b
            r0 = 0
            r18 = r0
            goto L_0x011d
        L_0x011b:
            r18 = r5
        L_0x011d:
            if (r6 == 0) goto L_0x0124
            xD.e r0 = xD.C15208e.Light
            r19 = r0
            goto L_0x0126
        L_0x0124:
            r19 = r7
        L_0x0126:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0135
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.PrepaidCardFront (PrepaidCardFront.kt:33)"
            r3 = -1938779789(0xffffffff8c709173, float:-1.8532697E-31)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0135:
            CD.e$a r0 = new CD.e$a
            r0.<init>(r13, r15)
            r2 = 54
            r3 = -1428234258(0xffffffffaadedfee, float:-3.9590504E-13)
            r4 = 1
            c1.a r17 = c1.c.e(r3, r4, r0, r9, r2)
            r0 = r1 & 14
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 9
            r4 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r20 = r0 | r1
            r21 = 192(0xc0, float:2.69E-43)
            r6 = 0
            r22 = 0
            r0 = r25
            r1 = r28
            r2 = r16
            r3 = r18
            r4 = r29
            r5 = r19
            r24 = r9
            r8 = r22
            r10 = r17
            r11 = r24
            r12 = r20
            r13 = r21
            zD.i.d(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x018a
            U0.C4895p.R()
        L_0x018a:
            r6 = r16
            r7 = r18
            r8 = r19
        L_0x0190:
            U0.Y0 r11 = r24.n()
            if (r11 == 0) goto L_0x01ad
            CD.d r12 = new CD.d
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: CD.e.b(GD.b, t1.c, boolean, p0.v, nI.a, androidx.compose.ui.d, boolean, xD.e, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C12929b bVar, C5942c cVar, boolean z10, v vVar, C17631a aVar, d dVar, boolean z11, C15208e eVar, int i10, int i11, C4889m mVar, int i12) {
        b(bVar, cVar, z10, vVar, aVar, dVar, z11, eVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final C5942c d(k.b.g gVar, C4889m mVar, int i10) {
        C5942c cVar;
        C17542s.j(gVar, "state");
        mVar.W(-1155463114);
        if (C4895p.J()) {
            C4895p.S(-1155463114, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.rememberPrepaidQrPainter (PrepaidCardFront.kt:57)");
        }
        if (gVar instanceof k.b.g.a) {
            mVar.W(-930342545);
            cVar = xD.k.j(((k.b.g.a) gVar).a(), mVar, 0);
            mVar.P();
        } else if (gVar instanceof k.b.g.C2651b) {
            mVar.W(1224219418);
            mVar.W(-930340376);
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = C12693a.f108358g;
                mVar.u(D10);
            }
            cVar = (C12693a) D10;
            mVar.P();
            mVar.P();
        } else {
            mVar.W(-930344028);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return cVar;
    }
}
