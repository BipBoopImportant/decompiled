package CD;

import GD.C12929b;
import J1.j;
import KJ.C15987c;
import Oo.b;
import SC.I1;
import SC.J1;
import SC.K0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.v;
import r0.m;
import s0.C5861g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LGD/b;", "header", "LKJ/c;", "LGD/c;", "cardInfo", "Lp0/v;", "orientation", "Lkotlin/Function0;", "LXH/N;", "onBackClick", "Lkotlin/Function1;", "onCardInfoClick", "onRemoveClick", "Landroidx/compose/ui/d;", "modifier", "b", "(LGD/b;LKJ/c;Lp0/v;LnI/a;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f108369a;

        a(C17631a<C16807N> aVar) {
            this.f108369a = aVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            int i11;
            C5861g gVar2 = gVar;
            C4889m mVar2 = mVar;
            C17542s.j(gVar, "$this$CardBackScaffold");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(gVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1764785733, i11, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.PrepaidCardBack.<anonymous> (PrepaidCardBack.kt:46)");
                }
                I1.h(j.b(b.f84437M, mVar2, 0), D.i(gVar.b(C5116k1.a(d.f18749a, "WalletTestTags-RemoveCardButton"), C5437c.f24302a.g()), h.B((float) 24)), false, (Integer) null, J1.XSmall, false, (K0) null, (m) null, this.f108369a, mVar, 24576, 236);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(GD.C12929b r20, KJ.C15987c<GD.C12930c> r21, p0.v r22, nI.C17631a<XH.C16807N> r23, nI.C17642l<? super GD.C12930c, XH.C16807N> r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r25
            r9 = r28
            java.lang.String r0 = "header"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "cardInfo"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onBackClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onCardInfoClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onRemoveClick"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            r0 = -1393702283(0xffffffffacedca75, float:-6.7584224E-12)
            r1 = r27
            U0.m r8 = r1.k(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x003c
            r1 = r9 | 6
            goto L_0x004c
        L_0x003c:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x004b
            boolean r1 = r8.V(r10)
            if (r1 == 0) goto L_0x0048
            r1 = 4
            goto L_0x0049
        L_0x0048:
            r1 = 2
        L_0x0049:
            r1 = r1 | r9
            goto L_0x004c
        L_0x004b:
            r1 = r9
        L_0x004c:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x0053
            r1 = r1 | 48
            goto L_0x0063
        L_0x0053:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x0063
            boolean r2 = r8.V(r11)
            if (r2 == 0) goto L_0x0060
            r2 = 32
            goto L_0x0062
        L_0x0060:
            r2 = 16
        L_0x0062:
            r1 = r1 | r2
        L_0x0063:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x006a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007a
        L_0x006a:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007a
            boolean r2 = r8.V(r12)
            if (r2 == 0) goto L_0x0077
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0079
        L_0x0077:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0079:
            r1 = r1 | r2
        L_0x007a:
            r2 = r29 & 8
            if (r2 == 0) goto L_0x0081
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0091
        L_0x0081:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0091
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x008e
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r1 = r1 | r2
        L_0x0091:
            r2 = r29 & 16
            if (r2 == 0) goto L_0x0098
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0098:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a8
            boolean r2 = r8.F(r14)
            if (r2 == 0) goto L_0x00a5
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r1 = r1 | r2
        L_0x00a8:
            r2 = r29 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b0
            r1 = r1 | r3
            goto L_0x00c0
        L_0x00b0:
            r2 = r9 & r3
            if (r2 != 0) goto L_0x00c0
            boolean r2 = r8.F(r15)
            if (r2 == 0) goto L_0x00bd
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r2
        L_0x00c0:
            r2 = r29 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00ca
            r1 = r1 | r3
        L_0x00c7:
            r4 = r26
            goto L_0x00dc
        L_0x00ca:
            r4 = r9 & r3
            if (r4 != 0) goto L_0x00c7
            r4 = r26
            boolean r5 = r8.V(r4)
            if (r5 == 0) goto L_0x00d9
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r5
        L_0x00dc:
            r5 = 599187(0x92493, float:8.3964E-40)
            r5 = r5 & r1
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r6) goto L_0x00f3
            boolean r5 = r8.l()
            if (r5 != 0) goto L_0x00ec
            goto L_0x00f3
        L_0x00ec:
            r8.L()
            r7 = r4
            r19 = r8
            goto L_0x0152
        L_0x00f3:
            if (r2 == 0) goto L_0x00fa
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x00fc
        L_0x00fa:
            r16 = r4
        L_0x00fc:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0108
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.common.PrepaidCardBack (PrepaidCardBack.kt:37)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0108:
            CD.c$a r0 = new CD.c$a
            r0.<init>(r15)
            r2 = 54
            r4 = 1764785733(0x69307e45, float:1.3335452E25)
            r5 = 1
            c1.a r6 = c1.c.e(r4, r5, r0, r8, r2)
            r0 = r1 & 14
            r0 = r0 | r3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            int r1 = r1 >> 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r17 = r0 | r1
            r18 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r16
            r7 = r8
            r19 = r8
            r8 = r17
            r9 = r18
            zD.C15335e.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0150
            U0.C4895p.R()
        L_0x0150:
            r7 = r16
        L_0x0152:
            U0.Y0 r9 = r19.n()
            if (r9 == 0) goto L_0x0173
            CD.b r8 = new CD.b
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r10 = r8
            r8 = r28
            r11 = r9
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r10)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: CD.c.b(GD.b, KJ.c, p0.v, nI.a, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C12929b bVar, C15987c cVar, v vVar, C17631a aVar, C17642l lVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(bVar, cVar, vVar, aVar, lVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
