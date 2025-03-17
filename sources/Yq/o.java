package Yq;

import B0.C4373q;
import IC.C13023e;
import IC.C13026h;
import KJ.C15988d;
import N1.G;
import N1.P;
import Qq.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.o1;
import XH.C16807N;
import Y1.j;
import Y1.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\u0004*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u0002"}, d2 = {"LQq/n;", "familyRewardsFAQ", "Lkotlin/Function1;", "", "LXH/N;", "onExpandedChanged", "d", "(LQq/n;LnI/l;LU0/m;I)V", "Lt0/x;", "", "questions", "Lkotlin/Function2;", "", "onItemExpandedChanged", "j", "(Lt0/x;Ljava/util/List;LnI/p;)V", "opened", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f89716a;

        a(n nVar) {
            this.f89716a = nVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-337325637, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.FaqQuestionRow.<anonymous>.<anonymous> (FaqQuestionRow.kt:51)");
                }
                Bl.c.c(C13026h.c(this.f89716a.g()), (androidx.compose.ui.d) null, (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, C13679b.a.C2856b.f116680a, mVar, C13023e.f110931a, 12582912, 131070);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89717a = new b();

        /* renamed from: a */
        public final Void invoke(n nVar) {
            C17542s.j(nVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C17642l<n, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f89718a;

        public c(String str) {
            this.f89718a = str;
        }

        /* renamed from: a */
        public final Object invoke(n nVar) {
            C17542s.j(nVar, "item");
            String str = this.f89718a;
            if (str != null) {
                String str2 = str + ":" + nVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(nVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f89719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f89720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f89719c = lVar;
            this.f89720d = list;
        }

        public final Object a(int i10) {
            return this.f89719c.invoke(this.f89720d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f89721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f89722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17642l lVar, List list) {
            super(1);
            this.f89721c = lVar;
            this.f89722d = list;
        }

        public final Object a(int i10) {
            return this.f89721c.invoke(this.f89722d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f89723c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f89724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list, p pVar) {
            super(4);
            this.f89723c = list;
            this.f89724d = pVar;
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
                n nVar = (n) this.f89723c.get(i10);
                mVar.W(-825006805);
                mVar.W(-1273538244);
                boolean V10 = mVar.V(this.f89724d) | mVar.F(nVar);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new g(this.f89724d, nVar);
                    mVar.u(D10);
                }
                mVar.P();
                o.d(nVar, (C17642l) D10, mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements C17642l<Boolean, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<String, Boolean, C16807N> f89725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f89726b;

        g(p<? super String, ? super Boolean, C16807N> pVar, n nVar) {
            this.f89725a = pVar;
            this.f89726b = nVar;
        }

        public final void a(boolean z10) {
            this.f89725a.invoke(this.f89726b.getId(), Boolean.valueOf(z10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(Qq.n r23, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r24, U0.C4889m r25, int r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r26
            java.lang.String r3 = "familyRewardsFAQ"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onExpandedChanged"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 54554929(0x3407131, float:5.6553666E-37)
            r4 = r25
            U0.m r13 = r4.k(r3)
            r15 = 6
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0029
            boolean r4 = r13.F(r0)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r2
            goto L_0x002a
        L_0x0029:
            r4 = r2
        L_0x002a:
            r5 = r2 & 48
            r11 = 32
            if (r5 != 0) goto L_0x003b
            boolean r5 = r13.F(r1)
            if (r5 == 0) goto L_0x0038
            r5 = r11
            goto L_0x003a
        L_0x0038:
            r5 = 16
        L_0x003a:
            r4 = r4 | r5
        L_0x003b:
            r12 = r4
            r4 = r12 & 19
            r5 = 18
            if (r4 != r5) goto L_0x004f
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            r13.L()
            r11 = r13
            goto L_0x0195
        L_0x004f:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005b
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.familyrewards.implementation.compose.faqbottomsheet.FaqQuestionRow (FaqQuestionRow.kt:38)"
            U0.C4895p.S(r3, r12, r4, r5)
        L_0x005b:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 861674538(0x335c1c2a, float:5.1248357E-8)
            r13.W(r5)
            java.lang.Object r5 = r13.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r6 = r14.a()
            if (r5 != r6) goto L_0x0078
            Yq.l r5 = new Yq.l
            r5.<init>()
            r13.u(r5)
        L_0x0078:
            r7 = r5
            nI.a r7 = (nI.C17631a) r7
            r13.P()
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r13
            java.lang.Object r4 = f1.C5301c.e(r4, r5, r6, r7, r8, r9, r10)
            U0.r0 r4 = (U0.C4899r0) r4
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r13, r3)
            int r6 = U0.C4883j.a(r13, r3)
            U0.y r7 = r13.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r13, r9)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r3 = r10.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x00b7
            U0.C4883j.c()
        L_0x00b7:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x00c4
            r13.p(r3)
            goto L_0x00c7
        L_0x00c4:
            r13.t()
        L_0x00c7:
            U0.m r3 = U0.F1.a(r13)
            nI.p r15 = r10.c()
            U0.F1.c(r3, r5, r15)
            nI.p r5 = r10.e()
            U0.F1.c(r3, r7, r5)
            nI.p r5 = r10.b()
            boolean r7 = r3.i()
            if (r7 != 0) goto L_0x00f1
            java.lang.Object r7 = r3.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r15)
            if (r7 != 0) goto L_0x00ff
        L_0x00f1:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.w(r6, r5)
        L_0x00ff:
            nI.p r5 = r10.d()
            U0.F1.c(r3, r8, r5)
            s0.h r3 = s0.C5862h.f28810a
            java.lang.String r3 = r23.h()
            boolean r21 = f(r4)
            float r22 = Rq.d.j()
            r5 = -277362043(0xffffffffef77ca85, float:-7.668763E28)
            r13.W(r5)
            boolean r5 = r13.V(r4)
            r6 = r12 & 112(0x70, float:1.57E-43)
            r7 = 1
            if (r6 != r11) goto L_0x0125
            r6 = r7
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            r5 = r5 | r6
            java.lang.Object r6 = r13.D()
            if (r5 != 0) goto L_0x0133
            java.lang.Object r5 = r14.a()
            if (r6 != r5) goto L_0x013b
        L_0x0133:
            Yq.m r6 = new Yq.m
            r6.<init>(r1, r4)
            r13.u(r6)
        L_0x013b:
            r5 = r6
            nI.l r5 = (nI.C17642l) r5
            r13.P()
            Yq.o$a r4 = new Yq.o$a
            r4.<init>(r0)
            r6 = 54
            r8 = -337325637(0xffffffffebe4d1bb, float:-5.5325102E26)
            c1.a r16 = c1.c.e(r8, r7, r4, r13, r6)
            r19 = 384(0x180, float:5.38E-43)
            r20 = 3292(0xcdc, float:4.613E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r4 = 6
            r18 = 905969664(0x36000000, float:1.9073486E-6)
            r4 = r3
            r3 = r9
            r9 = r21
            r25 = r13
            r13 = r22
            r17 = r25
            SC.C13627q.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 8
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r4)
            r11 = r25
            r4 = 6
            s0.C5844O.a(r3, r11, r4)
            androidx.compose.ui.d r4 = Rq.d.k()
            r9 = 6
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r11
            SC.C13643u0.c(r4, r5, r6, r8, r9, r10)
            r11.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0195
            U0.C4895p.R()
        L_0x0195:
            U0.Y0 r3 = r11.n()
            if (r3 == 0) goto L_0x01a3
            Yq.n r4 = new Yq.n
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yq.o.d(Qq.n, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 e() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean f(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void g(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C4899r0 r0Var, boolean z10) {
        g(r0Var, z10);
        lVar.invoke(Boolean.valueOf(f(r0Var)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(n nVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(nVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void j(x xVar, List<n> list, p<? super String, ? super Boolean, C16807N> pVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(list, "questions");
        C17542s.j(pVar, "onItemExpandedChanged");
        b bVar = b.f89717a;
        xVar.e(list.size(), new d(new c((String) null), list), new e(bVar, list), c1.c.c(-632812321, true, new f(list, pVar)));
    }
}
