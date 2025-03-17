package OC;

import E1.C4478k;
import OC.C13302d;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import c1.c;
import c2.h;
import gs.C11352b;
import gs.e;
import gs.f;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import p1.C5749w0;
import t0.C5938c;
import t0.x;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOC/d;", "uiState", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(LOC/d;Landroidx/compose/ui/d;LU0/m;II)V", "payment_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: OC.c  reason: case insensitive filesystem */
public final class C13301c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: OC.c$a */
    static final class a implements C17642l<e.a, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13302d.a f112767a;

        a(C13302d.a aVar) {
            this.f112767a = aVar;
        }

        public final void a(e.a aVar) {
            C17542s.j(aVar, "$this$ikeaImageRequest");
            aVar.j(this.f112767a.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: OC.c$b */
    public static final class b extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final b f112768c = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C13302d.a aVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: OC.c$c  reason: collision with other inner class name */
    public static final class C2782c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f112769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f112770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2782c(C17642l lVar, List list) {
            super(1);
            this.f112769c = lVar;
            this.f112770d = list;
        }

        public final Object a(int i10) {
            return this.f112769c.invoke(this.f112770d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: OC.c$d */
    public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f112771c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(4);
            this.f112771c = list;
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
                C13302d.a aVar = (C13302d.a) this.f112771c.get(i13);
                mVar2.W(-814666399);
                mVar2.W(-719014585);
                boolean V10 = mVar2.V(aVar);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(aVar);
                    mVar2.u(D10);
                }
                mVar.P();
                C11352b.b(f.a((C17642l) D10, mVar2, 0), aVar.b(), J.v(androidx.compose.ui.d.f18749a, h.B((float) 24), h.B((float) 16)), (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, 0, mVar, e.f97946h | 384, 0, 2040);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(OC.C13302d r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r0 = r33
            r1 = r36
            r2 = r37
            r3 = 2
            java.lang.String r4 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            r4 = -173815636(0xfffffffff5a3c8ac, float:-4.1524145E32)
            r5 = r35
            U0.m r15 = r5.k(r4)
            r14 = 1
            r5 = r2 & 1
            if (r5 == 0) goto L_0x001d
            r5 = r1 | 6
            goto L_0x002d
        L_0x001d:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x002c
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0029
            r5 = 4
            goto L_0x002a
        L_0x0029:
            r5 = r3
        L_0x002a:
            r5 = r5 | r1
            goto L_0x002d
        L_0x002c:
            r5 = r1
        L_0x002d:
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0035
            r5 = r5 | 48
        L_0x0032:
            r6 = r34
            goto L_0x0047
        L_0x0035:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0032
            r6 = r34
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r5 = r5 | r7
        L_0x0047:
            r7 = r5 & 19
            r8 = 18
            if (r7 != r8) goto L_0x005c
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            r15.L()
            r3 = r6
            r17 = r15
            goto L_0x01cb
        L_0x005c:
            if (r3 == 0) goto L_0x0061
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0062
        L_0x0061:
            r3 = r6
        L_0x0062:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x006e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.ui.payment.AvailablePaymentOptionsContent (AvailablePaymentOptionsContent.kt:38)"
            U0.C4895p.S(r4, r5, r6, r7)
        L_0x006e:
            java.lang.String r4 = "AvailablePaymentOptionsContent_CONTENT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            androidx.compose.foundation.layout.d r13 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r13.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r7)
            int r6 = U0.C4883j.a(r15, r7)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00a0
            U0.C4883j.c()
        L_0x00a0:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00ad
            r15.p(r9)
            goto L_0x00b0
        L_0x00ad:
            r15.t()
        L_0x00b0:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00da
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00e8
        L_0x00da:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x00e8:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            r4 = 1398098042(0x5355487a, float:9.1604399E11)
            r15.W(r4)
            boolean r4 = r33.b()
            if (r4 == 0) goto L_0x010e
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "AvailablePaymentOptionsContent_DIVIDER"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            r10 = 6
            r11 = 6
            r6 = 0
            r7 = 0
            r9 = r15
            SC.C13643u0.c(r5, r6, r7, r9, r10, r11)
        L_0x010e:
            r15.P()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = TC.e.i(r4)
            tK.u r31 = tK.C18029u.f147649a
            float r7 = r31.a()
            r10 = 13
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
            IC.e r5 = r33.c()
            int r6 = IC.C13023e.f110931a
            java.lang.String r5 = r5.a(r15, r6)
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r32 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r34 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r34
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            float r5 = r31.j()
            r6 = r32
            androidx.compose.foundation.layout.d$f r9 = r6.n(r5)
            java.lang.String r5 = "AvailablePaymentOptionsContent_PAYMENT_OPTIONS"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            r5 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r5, r7, r6)
            androidx.compose.ui.d r4 = TC.e.i(r4)
            float r8 = r31.a()
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r4, r5, r8, r7, r6)
            r4 = 1398122980(0x5355a9e4, float:9.1767833E11)
            r15 = r34
            r15.W(r4)
            boolean r4 = r15.F(r0)
            java.lang.Object r6 = r15.D()
            if (r4 != 0) goto L_0x01a1
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x01a9
        L_0x01a1:
            OC.a r6 = new OC.a
            r6.<init>(r0)
            r15.u(r6)
        L_0x01a9:
            r13 = r6
            nI.l r13 = (nI.C17642l) r13
            r15.P()
            r4 = 0
            r16 = 238(0xee, float:3.34E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r15
            r17 = r15
            r15 = r4
            t0.C5937b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r17.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01cb
            U0.C4895p.R()
        L_0x01cb:
            U0.Y0 r4 = r17.n()
            if (r4 == 0) goto L_0x01d9
            OC.b r5 = new OC.b
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OC.C13301c.c(OC.d, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C13302d dVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        List<C13302d.a> a10 = dVar.a();
        xVar.e(a10.size(), (C17642l<? super Integer, ? extends Object>) null, new C2782c(b.f112768c, a10), c.c(-632812321, true, new d(a10)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C13302d dVar, androidx.compose.ui.d dVar2, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, dVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
