package nj;

import E1.C4488v;
import SC.C13643u0;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import oj.C11681b;
import oj.f;
import oj.g;
import oj.h;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u0002"}, d2 = {"", "Loj/b;", "content", "Lnj/A;", "actions", "LXH/N;", "o", "(Ljava/util/List;Lnj/A;LU0/m;I)V", "g", "", "bottom", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nj.I  reason: case insensitive filesystem */
public final class C11615I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nj.I$a */
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f99730a = new a();

        /* renamed from: a */
        public final Void invoke(C11681b bVar) {
            C17542s.j(bVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nj.I$b */
    public static final class b implements C17642l<C11681b, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f99731a;

        public b(String str) {
            this.f99731a = str;
        }

        /* renamed from: a */
        public final Object invoke(C11681b bVar) {
            C17542s.j(bVar, "item");
            String str = this.f99731a;
            if (str != null) {
                String str2 = str + ":" + bVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(bVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nj.I$c */
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f99732c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f99733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f99732c = lVar;
            this.f99733d = list;
        }

        public final Object a(int i10) {
            return this.f99732c.invoke(this.f99733d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nj.I$d */
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f99734c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f99735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f99734c = lVar;
            this.f99735d = list;
        }

        public final Object a(int i10) {
            return this.f99734c.invoke(this.f99735d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: nj.I$e */
    public static final class e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f99736c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11607A f99737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, C11607A a10) {
            super(4);
            this.f99736c = list;
            this.f99737d = a10;
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
                C11681b bVar = (C11681b) this.f99736c.get(i10);
                mVar.W(765477254);
                if (bVar instanceof h) {
                    mVar.W(765499418);
                    z.g((h) bVar, mVar, 0);
                    mVar.P();
                } else if (bVar instanceof f) {
                    mVar.W(765684798);
                    C13643u0.c(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, 0, mVar, 0, 6);
                    o.d((f) bVar, this.f99737d.b(), mVar, 0);
                    mVar.P();
                } else if (bVar instanceof g) {
                    mVar.W(766014483);
                    v.h((g) bVar, this.f99737d.b(), mVar, 0);
                    mVar.P();
                } else if (bVar instanceof oj.e) {
                    mVar.W(766270450);
                    C11626k.b((oj.e) bVar, mVar, 0);
                    mVar.P();
                } else if (bVar instanceof oj.d) {
                    mVar.W(766465874);
                    C11622g.i((oj.d) bVar, mVar, 0);
                    mVar.P();
                } else if (bVar instanceof oj.c) {
                    mVar.W(-1637836997);
                    C11617b.b(mVar, 0);
                    mVar.P();
                } else {
                    mVar.W(-1637875171);
                    mVar.P();
                    throw new t();
                }
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(java.util.List<? extends oj.C11681b> r29, nj.C11607A r30, U0.C4889m r31, int r32) {
        /*
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = -1859588867(0xffffffff9128ecfd, float:-1.3325891E-28)
            r4 = r31
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r14 = 32
            if (r5 != 0) goto L_0x0039
            r5 = r2 & 64
            if (r5 != 0) goto L_0x002e
            boolean r5 = r15.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r5 = r15.F(r1)
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = r14
            goto L_0x0038
        L_0x0036:
            r5 = 16
        L_0x0038:
            r4 = r4 | r5
        L_0x0039:
            r13 = r4
            r4 = r13 & 19
            r5 = 18
            if (r4 != r5) goto L_0x004d
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0047
            goto L_0x004d
        L_0x0047:
            r15.L()
            r0 = r15
            goto L_0x02b7
        L_0x004d:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0059
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ScanAndGoBottomSheetContent (ScanAndGoBottomSheetScreen.kt:54)"
            U0.C4895p.S(r3, r13, r4, r5)
        L_0x0059:
            r3 = 557891845(0x2140c105, float:6.530759E-19)
            r15.W(r3)
            java.lang.Object r3 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r4 = r16.a()
            r12 = 0
            if (r3 != r4) goto L_0x0073
            U0.o0 r3 = U0.C4877g1.a(r12)
            r15.u(r3)
        L_0x0073:
            U0.o0 r3 = (U0.C4894o0) r3
            r15.P()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            tK.u r4 = tK.C18029u.f147649a
            float r8 = r4.d()
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c r5 = r17.o()
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r12)
            int r6 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r8 = r18.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x00af
            U0.C4883j.c()
        L_0x00af:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x00bc
            r15.p(r8)
            goto L_0x00bf
        L_0x00bc:
            r15.t()
        L_0x00bf:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r18.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r18.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x00e9
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x00f7
        L_0x00e9:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x00f7:
            nI.p r5 = r18.d()
            U0.F1.c(r8, r4, r5)
            androidx.compose.foundation.layout.j r10 = androidx.compose.foundation.layout.C5079j.f18125a
            U0.I0 r4 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r4 = r15.Q(r4)
            c2.d r4 = (c2.d) r4
            int r5 = m(r3)
            float r22 = r4.H(r5)
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            s0.E r6 = androidx.compose.foundation.layout.D.e(r19, r20, r21, r22, r23, r24)
            r4 = 1141535192(0x440a71d8, float:553.7788)
            r15.W(r4)
            boolean r4 = r15.F(r0)
            r9 = r13 & 112(0x70, float:1.57E-43)
            r8 = 1
            if (r9 == r14) goto L_0x013c
            r5 = r13 & 64
            if (r5 == 0) goto L_0x013a
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r5 = r12
            goto L_0x013d
        L_0x013c:
            r5 = r8
        L_0x013d:
            r4 = r4 | r5
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x014a
            java.lang.Object r4 = r16.a()
            if (r5 != r4) goto L_0x0152
        L_0x014a:
            nj.D r5 = new nj.D
            r5.<init>(r0, r1)
            r15.u(r5)
        L_0x0152:
            r19 = r5
            nI.l r19 = (nI.C17642l) r19
            r15.P()
            r20 = 0
            r21 = 251(0xfb, float:3.52E-43)
            r4 = 0
            r5 = 0
            r7 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r8 = r22
            r26 = r9
            r9 = r23
            r27 = r10
            r10 = r24
            r28 = r11
            r11 = r25
            r12 = r19
            r19 = r13
            r13 = r15
            r14 = r20
            r0 = r15
            r15 = r21
            t0.C5937b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            i1.c r4 = r17.b()
            r6 = r27
            r5 = r28
            androidx.compose.ui.d r4 = r6.a(r5, r4)
            r5 = 1141584830(0x440b33be, float:556.8085)
            r0.W(r5)
            java.lang.Object r5 = r0.D()
            java.lang.Object r6 = r16.a()
            if (r5 != r6) goto L_0x01a7
            nj.E r5 = new nj.E
            r5.<init>(r3)
            r0.u(r5)
        L_0x01a7:
            nI.l r5 = (nI.C17642l) r5
            r0.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.layout.c.a(r4, r5)
            androidx.compose.ui.d r3 = TC.e.i(r3)
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r4, r6, r5)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$b r7 = r17.k()
            r8 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r7, r0, r8)
            int r7 = U0.C4883j.a(r0, r8)
            U0.y r9 = r0.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r0, r3)
            nI.a r10 = r18.a()
            U0.f r11 = r0.m()
            if (r11 != 0) goto L_0x01e3
            U0.C4883j.c()
        L_0x01e3:
            r0.I()
            boolean r11 = r0.i()
            if (r11 == 0) goto L_0x01f0
            r0.p(r10)
            goto L_0x01f3
        L_0x01f0:
            r0.t()
        L_0x01f3:
            U0.m r10 = U0.F1.a(r0)
            nI.p r11 = r18.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r18.e()
            U0.F1.c(r10, r9, r4)
            nI.p r4 = r18.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x021d
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x022b
        L_0x021d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r4)
        L_0x022b:
            nI.p r4 = r18.d()
            U0.F1.c(r10, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            r3 = 979357156(0x3a5fcde4, float:8.537455E-4)
            r0.W(r3)
            r4 = r26
            r3 = 32
            if (r4 == r3) goto L_0x024d
            r3 = r19 & 64
            if (r3 == 0) goto L_0x024b
            boolean r3 = r0.F(r1)
            if (r3 == 0) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r12 = r8
            goto L_0x024e
        L_0x024d:
            r12 = r6
        L_0x024e:
            java.lang.Object r3 = r0.D()
            if (r12 != 0) goto L_0x025a
            java.lang.Object r4 = r16.a()
            if (r3 != r4) goto L_0x0262
        L_0x025a:
            nj.F r3 = new nj.F
            r3.<init>(r1)
            r0.u(r3)
        L_0x0262:
            nI.a r3 = (nI.C17631a) r3
            r0.P()
            nj.C11624i.b(r5, r3, r0, r8, r6)
            nI.a r3 = r30.c()
            r4 = 979360279(0x3a5fda17, float:8.539273E-4)
            r0.W(r4)
            if (r3 != 0) goto L_0x0277
            goto L_0x02a5
        L_0x0277:
            r4 = -1206574768(0xffffffffb8152150, float:-3.5555393E-5)
            r0.W(r4)
            boolean r4 = r0.V(r3)
            java.lang.Object r5 = r0.D()
            if (r4 != 0) goto L_0x028d
            java.lang.Object r4 = r16.a()
            if (r5 != r4) goto L_0x0295
        L_0x028d:
            nj.G r5 = new nj.G
            r5.<init>(r3)
            r0.u(r5)
        L_0x0295:
            r6 = r5
            nI.a r6 = (nI.C17631a) r6
            r0.P()
            r8 = 0
            r9 = 3
            r4 = 0
            r5 = 0
            r7 = r0
            nj.K.b(r4, r5, r6, r7, r8, r9)
            XH.N r3 = XH.C16807N.f139792a
        L_0x02a5:
            r0.P()
            r0.x()
            r0.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02b7
            U0.C4895p.R()
        L_0x02b7:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x02c7
            nj.H r3 = new nj.H
            r4 = r29
            r3.<init>(r4, r1, r2)
            r0.a(r3)
        L_0x02c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.C11615I.g(java.util.List, nj.A, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C11607A a10) {
        a10.a().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(List list, C11607A a10, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        a aVar = a.f99730a;
        xVar.e(list.size(), new c(new b("ScanAndGoBottomSheetContent"), list), new d(aVar, list), c1.c.c(-632812321, true, new e(list, a10)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C4894o0 o0Var, C4488v vVar) {
        C17542s.j(vVar, "it");
        n(o0Var, c2.r.g(vVar.a()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(List list, C11607A a10, int i10, C4889m mVar, int i11) {
        g(list, a10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final int m(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void n(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    public static final void o(List<? extends C11681b> list, C11607A a10, C4889m mVar, int i10) {
        int i11;
        C17542s.j(list, "content");
        C17542s.j(a10, "actions");
        C4889m k10 = mVar.k(-1313345488);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(a10) : k10.F(a10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1313345488, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ScanAndGoBottomSheetScreen (ScanAndGoBottomSheetScreen.kt:42)");
            }
            g(list, a10, k10, i11 & 126);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11609C(list, a10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(List list, C11607A a10, int i10, C4889m mVar, int i11) {
        o(list, a10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
