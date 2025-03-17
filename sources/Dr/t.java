package dr;

import IC.C13023e;
import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import e5.C7786b;
import e5.C7787c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import qr.n;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKJ/c;", "LIq/a;", "rewards", "LIC/e;", "title", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LIq/a$a;", "LXH/N;", "onAction", "c", "(LKJ/c;LIC/e;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97076a = new a();

        /* renamed from: a */
        public final Void invoke(Iq.a aVar) {
            C17542s.j(aVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l<Iq.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97077a;

        public b(String str) {
            this.f97077a = str;
        }

        /* renamed from: a */
        public final Object invoke(Iq.a aVar) {
            C17542s.j(aVar, "item");
            String str = this.f97077a;
            if (str != null) {
                String str2 = str + ":" + aVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(aVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97078c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f97078c = lVar;
            this.f97079d = list;
        }

        public final Object a(int i10) {
            return this.f97078c.invoke(this.f97079d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f97080c = lVar;
            this.f97081d = list;
        }

        public final Object a(int i10) {
            return this.f97080c.invoke(this.f97081d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f97082c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f97083d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7786b f97084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, C17642l lVar, C7786b bVar) {
            super(4);
            this.f97082c = list;
            this.f97083d = lVar;
            this.f97084e = bVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                Iq.a aVar = (Iq.a) this.f97082c.get(i10);
                mVar.W(-548561918);
                n.h(aVar, this.f97083d, C17542s.e(this.f97084e.b(), C7787c.f50843c) ? C5938c.b(cVar, androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null) : androidx.compose.ui.d.f18749a, mVar, 0, 0);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<? extends Iq.a> r19, IC.C13023e r20, androidx.compose.ui.d r21, nI.C17642l<? super Iq.a.C1605a, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r0 = 4
            r3 = 6
            java.lang.String r6 = "rewards"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "title"
            kotlin.jvm.internal.C17542s.j(r2, r6)
            java.lang.String r6 = "onAction"
            kotlin.jvm.internal.C17542s.j(r4, r6)
            r6 = 1749578682(0x684873ba, float:3.7864323E24)
            r7 = r23
            U0.m r15 = r7.k(r6)
            r7 = 1
            r8 = r25 & 1
            r9 = 2
            if (r8 == 0) goto L_0x002b
            r8 = r5 | 6
            goto L_0x003b
        L_0x002b:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x003a
            boolean r8 = r15.F(r1)
            if (r8 == 0) goto L_0x0037
            r8 = r0
            goto L_0x0038
        L_0x0037:
            r8 = r9
        L_0x0038:
            r8 = r8 | r5
            goto L_0x003b
        L_0x003a:
            r8 = r5
        L_0x003b:
            r10 = r25 & 2
            if (r10 == 0) goto L_0x0042
            r8 = r8 | 48
            goto L_0x005b
        L_0x0042:
            r10 = r5 & 48
            if (r10 != 0) goto L_0x005b
            r10 = r5 & 64
            if (r10 != 0) goto L_0x004f
            boolean r10 = r15.V(r2)
            goto L_0x0053
        L_0x004f:
            boolean r10 = r15.F(r2)
        L_0x0053:
            if (r10 == 0) goto L_0x0058
            r10 = 32
            goto L_0x005a
        L_0x0058:
            r10 = 16
        L_0x005a:
            r8 = r8 | r10
        L_0x005b:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x0064
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0061:
            r10 = r21
            goto L_0x0076
        L_0x0064:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0061
            r10 = r21
            boolean r11 = r15.V(r10)
            if (r11 == 0) goto L_0x0073
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r8 = r8 | r11
        L_0x0076:
            r11 = r25 & 8
            if (r11 == 0) goto L_0x007d
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x008d
            boolean r11 = r15.F(r4)
            if (r11 == 0) goto L_0x008a
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r8 = r8 | r11
        L_0x008d:
            r11 = r8 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r11 != r13) goto L_0x00a1
            boolean r11 = r15.l()
            if (r11 != 0) goto L_0x009a
            goto L_0x00a1
        L_0x009a:
            r15.L()
            r3 = r10
            r6 = r15
            goto L_0x01c3
        L_0x00a1:
            if (r0 == 0) goto L_0x00a6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00a7
        L_0x00a6:
            r0 = r10
        L_0x00a7:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00b3
            r10 = -1
            java.lang.String r11 = "com.ingka.ikea.familyrewards.implementation.compose.rewards.HorizontalRewardList (HorizontalRewardList.kt:34)"
            U0.C4895p.S(r6, r8, r10, r11)
        L_0x00b3:
            r6 = 0
            P0.e r10 = P0.b.b(r15, r6)
            e5.b r10 = r10.a()
            s0.T$a r11 = s0.C5848T.f28733a
            s0.T r3 = s0.a0.c(r11, r15, r3)
            s0.Y$a r11 = s0.C5853Y.f28774a
            int r11 = r11.f()
            s0.T r3 = s0.C5850V.i(r3, r11)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r11 = r11.g()
            i1.c$a r13 = i1.C5437c.f24302a
            i1.c$b r13 = r13.k()
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r13, r15, r6)
            int r13 = U0.C4883j.a(r15, r6)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x00f7
            U0.C4883j.c()
        L_0x00f7:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0104
            r15.p(r12)
            goto L_0x0107
        L_0x0104:
            r15.t()
        L_0x0107:
            U0.m r12 = U0.F1.a(r15)
            nI.p r9 = r16.c()
            U0.F1.c(r12, r11, r9)
            nI.p r9 = r16.e()
            U0.F1.c(r12, r14, r9)
            nI.p r9 = r16.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x0131
            java.lang.Object r11 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x013f
        L_0x0131:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12.w(r11, r9)
        L_0x013f:
            nI.p r9 = r16.d()
            U0.F1.c(r12, r7, r9)
            s0.h r7 = s0.C5862h.f28810a
            androidx.compose.ui.d r7 = Rq.d.k()
            int r9 = IC.C13023e.f110931a
            r9 = r9 | 48
            int r11 = r8 >> 3
            r11 = r11 & 14
            r9 = r9 | r11
            dr.L.b(r2, r7, r15, r9, r6)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r7 = s0.C5851W.d(r7, r3)
            float r3 = Rq.d.j()
            r9 = 0
            r11 = 0
            r12 = 2
            s0.E r9 = androidx.compose.foundation.layout.D.c(r3, r9, r12, r11)
            androidx.compose.foundation.layout.d$a r3 = androidx.compose.foundation.layout.C5073d.a.f18077a
            float r11 = Rq.d.l()
            androidx.compose.foundation.layout.d$f r11 = r3.c(r11)
            r3 = 948260003(0x38854ca3, float:6.356209E-5)
            r15.W(r3)
            boolean r3 = r15.F(r1)
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r8 != r12) goto L_0x0184
            r6 = 1
        L_0x0184:
            r3 = r3 | r6
            boolean r6 = r15.F(r10)
            r3 = r3 | r6
            java.lang.Object r6 = r15.D()
            if (r3 != 0) goto L_0x0198
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x01a0
        L_0x0198:
            dr.r r6 = new dr.r
            r6.<init>(r1, r4, r10)
            r15.u(r6)
        L_0x01a0:
            r3 = r6
            nI.l r3 = (nI.C17642l) r3
            r15.P()
            r17 = 24960(0x6180, float:3.4976E-41)
            r18 = 234(0xea, float:3.28E-43)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6 = r15
            r15 = r3
            r16 = r6
            t0.C5937b.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01c2
            U0.C4895p.R()
        L_0x01c2:
            r3 = r0
        L_0x01c3:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x01dc
            dr.s r8 = new dr.s
            r0 = r8
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.t.c(KJ.c, IC.e, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, C17642l lVar, C7786b bVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        a aVar = a.f97076a;
        xVar.e(cVar.size(), new c(new b((String) null), cVar), new d(aVar, cVar), c1.c.c(-632812321, true, new e(cVar, lVar, bVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C13023e eVar, androidx.compose.ui.d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, eVar, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
