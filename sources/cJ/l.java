package Cj;

import KJ.C15987c;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import com.ingka.ikea.core.model.product.GoodToKnow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import s0.C5844O;
import t0.C5938c;
import t0.x;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKJ/c;", "Lcom/ingka/ikea/core/model/product/GoodToKnow;", "itemsList", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f79521c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.f79521c = list;
        }

        public final Object a(int i10) {
            this.f79521c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f79522c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(4);
            this.f79522c = list;
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
                    C4895p.S(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                mVar2.W(-1532957127);
                d.a aVar = d.f18749a;
                C13607l.j(((GoodToKnow) this.f79522c.get(i13)).a(), C13679b.a.C2856b.f116680a, C5116k1.a(aVar, "GoodToKnowSectionDetails.Body." + i13), C18030v.f147664a.a(mVar2, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262128);
                C5844O.a(J.t(aVar, C18029u.f147649a.d()), mVar, 0);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<com.ingka.ikea.core.model.product.GoodToKnow> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r0 = r18
            r1 = r21
            r2 = r22
            java.lang.String r3 = "itemsList"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 516132743(0x1ec38f87, float:2.070579E-20)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r19
            goto L_0x0046
        L_0x0034:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r19
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0058
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r15.L()
            r3 = r15
            goto L_0x00ba
        L_0x0058:
            if (r5 == 0) goto L_0x005e
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x005f
        L_0x005e:
            r14 = r6
        L_0x005f:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006b
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductGooToKnowSection (ProductGoodToKnowSection.kt:29)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x006b:
            java.lang.String r3 = "GoodToKnowSectionDetails.ProductGooToKnowSection.Component"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r14, r3)
            androidx.compose.ui.d r4 = TC.e.i(r3)
            r3 = -449156926(0xffffffffe53a68c2, float:-5.501829E22)
            r15.W(r3)
            boolean r3 = r15.F(r0)
            java.lang.Object r5 = r15.D()
            if (r3 != 0) goto L_0x008d
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0095
        L_0x008d:
            Cj.j r5 = new Cj.j
            r5.<init>(r0)
            r15.u(r5)
        L_0x0095:
            r12 = r5
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r3 = 0
            r16 = 254(0xfe, float:3.56E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = r15
            r17 = r14
            r14 = r3
            r3 = r15
            r15 = r16
            t0.C5937b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b8
            U0.C4895p.R()
        L_0x00b8:
            r6 = r17
        L_0x00ba:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00c8
            Cj.k r4 = new Cj.k
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cj.l.c(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        xVar.e(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, new a(cVar), c.c(-1091073711, true, new b(cVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
