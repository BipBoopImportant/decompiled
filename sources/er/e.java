package er;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15987c;
import N1.P;
import Qq.r;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18030v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "e", "(Landroidx/compose/ui/d;LU0/m;II)V", "LKJ/c;", "LQq/r;", "rewardingInteractions", "g", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "rowHeight", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97176a = new a();

        /* renamed from: a */
        public final Void invoke(r rVar) {
            C17542s.j(rVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l<r, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97177a;

        public b(String str) {
            this.f97177a = str;
        }

        /* renamed from: a */
        public final Object invoke(r rVar) {
            C17542s.j(rVar, "item");
            String str = this.f97177a;
            if (str != null) {
                String str2 = str + ":" + rVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(rVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97178c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f97178c = lVar;
            this.f97179d = list;
        }

        public final Object a(int i10) {
            return this.f97178c.invoke(this.f97179d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97180c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f97180c = lVar;
            this.f97181d = list;
        }

        public final Object a(int i10) {
            return this.f97180c.invoke(this.f97181d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: er.e$e  reason: collision with other inner class name */
    public static final class C2160e extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f97182c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0 f97183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2160e(List list, C4899r0 r0Var) {
            super(4);
            this.f97182c = list;
            this.f97183d = r0Var;
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
                mVar.W(2024165788);
                fr.b.b((r) this.f97182c.get(i10), J.k(C5938c.b(cVar, androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e.j(this.f97183d), 0.0f, 2, (Object) null), mVar, 0, 0);
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

    public static final void e(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1351278803);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1351278803, i12, -1, "com.ingka.ikea.familyrewards.implementation.compose.rewards.content.RewardingInteractionsHeader (RewardingInteractionsContent.kt:33)");
            }
            I a10 = C5080k.a(C5073d.a.f18077a.c(h.B((float) 4)), C5437c.f24302a.k(), k10, 6);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            String b11 = j.b(Rq.e.f86996q, k10, 0);
            C18030v vVar = C18030v.f147664a;
            int i16 = C18030v.f147665b;
            C4889m mVar3 = k10;
            androidx.compose.ui.d dVar3 = aVar;
            C13607l.j(b11, C13679b.C2857b.e.f116687a, (androidx.compose.ui.d) null, vVar.a(k10, i16).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262132);
            C4889m mVar4 = mVar3;
            mVar2 = mVar4;
            C13607l.j(j.b(Rq.e.f86995p, mVar4, 0), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, vVar.a(mVar4, i16).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262132);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11258a(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<Qq.r> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r0 = r18
            r1 = r21
            r2 = r22
            java.lang.String r3 = "rewardingInteractions"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 1997723588(0x7712d7c4, float:2.9783265E33)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002b
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0035
            r4 = r4 | 48
        L_0x0032:
            r7 = r19
            goto L_0x0047
        L_0x0035:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0032
            r7 = r19
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0046
        L_0x0044:
            r8 = 16
        L_0x0046:
            r4 = r4 | r8
        L_0x0047:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x005c
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            r15.L()
            r3 = r7
            r16 = r15
            goto L_0x012e
        L_0x005c:
            if (r6 == 0) goto L_0x0062
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0063
        L_0x0062:
            r14 = r7
        L_0x0063:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x006f
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.familyrewards.implementation.compose.rewards.content.RewardingInteractionsHorizontalList (RewardingInteractionsContent.kt:56)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x006f:
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r3 = r15.Q(r3)
            c2.d r3 = (c2.d) r3
            r4 = 718237339(0x2acf6e9b, float:3.6847335E-13)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r7 = r6.a()
            r8 = 0
            if (r4 != r7) goto L_0x009d
            r4 = 0
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            c2.h r4 = c2.h.m(r4)
            U0.r0 r4 = U0.u1.e(r4, r8, r5, r8)
            r15.u(r4)
        L_0x009d:
            U0.r0 r4 = (U0.C4899r0) r4
            r15.P()
            r7 = 24
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r9 = 0
            s0.E r7 = androidx.compose.foundation.layout.D.c(r7, r9, r5, r8)
            androidx.compose.foundation.layout.d$a r5 = androidx.compose.foundation.layout.C5073d.a.f18077a
            r10 = 12
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.foundation.layout.d$f r10 = r5.c(r10)
            r5 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r14, r9, r5, r8)
            r8 = 718245124(0x2acf8d04, float:3.6868436E-13)
            r15.W(r8)
            boolean r8 = r15.V(r3)
            java.lang.Object r9 = r15.D()
            if (r8 != 0) goto L_0x00d6
            java.lang.Object r8 = r6.a()
            if (r9 != r8) goto L_0x00de
        L_0x00d6:
            er.b r9 = new er.b
            r9.<init>(r3, r4)
            r15.u(r9)
        L_0x00de:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.layout.g.a(r5, r9)
            r5 = 718249964(0x2acf9fec, float:3.6881555E-13)
            r15.W(r5)
            boolean r5 = r15.F(r0)
            java.lang.Object r8 = r15.D()
            if (r5 != 0) goto L_0x00fd
            java.lang.Object r5 = r6.a()
            if (r8 != r5) goto L_0x0105
        L_0x00fd:
            er.c r8 = new er.c
            r8.<init>(r0, r4)
            r15.u(r8)
        L_0x0105:
            r12 = r8
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r16 = 24960(0x6180, float:3.4976E-41)
            r17 = 234(0xea, float:3.28E-43)
            r5 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r4 = r3
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r13
            r13 = r15
            r3 = r14
            r14 = r16
            r16 = r15
            r15 = r17
            t0.C5937b.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x012e
            U0.C4895p.R()
        L_0x012e:
            U0.Y0 r4 = r16.n()
            if (r4 == 0) goto L_0x013c
            er.d r5 = new er.d
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er.e.g(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, C4899r0 r0Var, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        a aVar = a.f97176a;
        xVar.e(cVar.size(), new c(new b((String) null), cVar), new d(aVar, cVar), c1.c.c(-632812321, true, new C2160e(cVar, r0Var)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float j(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    private static final void k(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N l(c2.d dVar, C4899r0 r0Var, c2.r rVar) {
        k(r0Var, h.B(Math.max(j(r0Var), dVar.H(c2.r.g(rVar.k())))));
        return C16807N.f139792a;
    }
}
