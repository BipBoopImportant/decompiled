package ki;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mi.j;
import nI.q;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmi/j$d;", "productInformation", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Lmi/j$d;Landroidx/compose/ui/d;LU0/m;II)V", "Lt0/x;", "d", "(Lt0/x;Lmi/j$d;)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.d f75098a;

        a(j.d dVar) {
            this.f75098a = dVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-676987365, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.pipProductInformation.<anonymous> (PipProductInformation.kt:36)");
                }
                K.b(this.f75098a, D.m(d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(mi.j.d r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            java.lang.String r3 = "productInformation"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 145311413(0x8a946b5, float:1.0187941E-33)
            r4 = r33
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r14.V(r0)
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
            r6 = r32
            goto L_0x0046
        L_0x0034:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r32
            boolean r7 = r14.V(r6)
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
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r14.L()
            r3 = r14
            goto L_0x00ab
        L_0x0058:
            if (r5 == 0) goto L_0x005f
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r30 = r5
            goto L_0x0061
        L_0x005f:
            r30 = r6
        L_0x0061:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006d
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.productinformationpage.v3.compose.PipProductInformation (PipProductInformation.kt:21)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x006d:
            java.lang.String r4 = r31.g()
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d r6 = TC.e.i(r30)
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r3 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00a9
            U0.C4895p.R()
        L_0x00a9:
            r6 = r30
        L_0x00ab:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00b9
            ki.J r4 = new ki.J
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.K.b(mi.j$d, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(j.d dVar, d dVar2, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, dVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void d(x xVar, j.d dVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(dVar, "productInformation");
        xVar.b("pip:ProductInformation", "ProductInformation", c.c(-676987365, true, new a(dVar)));
    }
}
