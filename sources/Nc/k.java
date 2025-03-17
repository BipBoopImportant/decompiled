package NC;

import A0.g;
import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import NC.C13275d;
import O0.C4722d;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.H0;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import Y1.f;
import Y1.j;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import r0.m;
import s0.C5844O;
import s0.C5861g;
import tK.C18030v;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0012\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"LKJ/c;", "LNC/d$a;", "actions", "LNC/d$c;", "items", "LNC/d$b;", "overflowIcon", "LXH/N;", "j", "(LKJ/c;LKJ/c;LNC/d$b;LU0/m;I)V", "", "visible", "Landroidx/compose/ui/d;", "modifier", "f", "(ZLandroidx/compose/ui/d;LU0/m;II)V", "h", "(Landroidx/compose/ui/d;LU0/m;II)V", "showDropDown", "showBadge", "overflow-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C13275d.c> f112424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f112425b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: NC.k$a$a  reason: collision with other inner class name */
        static final class C2763a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13275d.c f112426a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f112427b;

            C2763a(C13275d.c cVar, int i10) {
                this.f112426a = cVar;
                this.f112427b = i10;
            }

            public final void a(C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1960953485, i11, -1, "com.ingka.ikea.ui.overflowmenu.OverflowMenu.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OverflowMenu.kt:128)");
                    }
                    String b10 = this.f112426a.b();
                    C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
                    long G02 = C18030v.f147664a.a(mVar, C18030v.f147665b).G0();
                    d.a aVar = d.f18749a;
                    int i12 = this.f112427b;
                    C13607l.j(b10, bVar, C5116k1.a(aVar, "MENU_ITEM_" + i12), G02, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262128);
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

        a(C15987c<C13275d.c> cVar, C4899r0<Boolean> r0Var) {
            this.f112424a = cVar;
            this.f112425b = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C13275d.c cVar, C4899r0 r0Var) {
            k.m(r0Var, false);
            cVar.c().invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5861g r18, U0.C4889m r19, int r20) {
            /*
                r17 = this;
                r0 = r17
                r13 = r19
                r1 = r20
                java.lang.String r2 = "$this$DropdownMenu"
                r3 = r18
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r19.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r19.L()
                goto L_0x009d
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.ui.overflowmenu.OverflowMenu.<anonymous>.<anonymous> (OverflowMenu.kt:124)"
                r4 = -272854069(0xffffffffefbc93cb, float:-1.16723705E29)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                KJ.c<NC.d$c> r1 = r0.f112424a
                U0.r0<java.lang.Boolean> r14 = r0.f112425b
                java.util.Iterator r15 = r1.iterator()
                r1 = 0
            L_0x0037:
                boolean r2 = r15.hasNext()
                if (r2 == 0) goto L_0x0094
                java.lang.Object r2 = r15.next()
                int r16 = r1 + 1
                if (r1 >= 0) goto L_0x0048
                YH.C16877v.x()
            L_0x0048:
                NC.d$c r2 = (NC.C13275d.c) r2
                boolean r6 = r2.a()
                NC.k$a$a r3 = new NC.k$a$a
                r3.<init>(r2, r1)
                r1 = 54
                r4 = -1960953485(0xffffffff8b1e3973, float:-3.0472913E-32)
                r5 = 1
                c1.a r1 = c1.c.e(r4, r5, r3, r13, r1)
                r3 = 125360405(0x778d915, float:1.8721241E-34)
                r13.W(r3)
                boolean r3 = r13.V(r2)
                java.lang.Object r4 = r19.D()
                if (r3 != 0) goto L_0x0075
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x007d
            L_0x0075:
                NC.j r4 = new NC.j
                r4.<init>(r2, r14)
                r13.u(r4)
            L_0x007d:
                r2 = r4
                nI.a r2 = (nI.C17631a) r2
                r19.P()
                r11 = 6
                r12 = 476(0x1dc, float:6.67E-43)
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = r19
                O0.C4722d.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r1 = r16
                goto L_0x0037
            L_0x0094:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x009d
                U0.C4895p.R()
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: NC.k.a.b(s0.g, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(boolean r20, androidx.compose.ui.d r21, U0.C4889m r22, int r23, int r24) {
        /*
            r9 = r20
            r10 = r23
            r11 = r24
            r0 = -2115971723(0xffffffff81e0d575, float:-8.25909E-38)
            r1 = r22
            U0.m r12 = r1.k(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.b(r9)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r3 = r21
            goto L_0x0041
        L_0x002f:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x002c
            r3 = r21
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r1 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0053
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r12.L()
            r13 = r3
            goto L_0x00b7
        L_0x0053:
            if (r2 == 0) goto L_0x0059
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r13 = r2
            goto L_0x005a
        L_0x0059:
            r13 = r3
        L_0x005a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0066
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.overflowmenu.Badge (OverflowMenu.kt:153)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0066:
            r0 = 0
            r2 = 1153138688(0x44bb8000, float:1500.0)
            r3 = 0
            r4 = 5
            m0.o0 r14 = m0.C5548j.h(r0, r2, r3, r4, r3)
            r18 = 6
            r19 = 0
            r15 = 0
            r16 = 0
            androidx.compose.animation.i r5 = androidx.compose.animation.g.s(r14, r15, r16, r18, r19)
            m0.o0 r14 = m0.C5548j.h(r0, r2, r3, r4, r3)
            androidx.compose.animation.k r3 = androidx.compose.animation.g.u(r14, r15, r16, r18, r19)
            NC.a r0 = NC.C13272a.f112384a
            s0.E r2 = r0.a()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.h(r13, r2)
            float r0 = r0.b()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r2, r0)
            NC.b r0 = NC.C13273b.f112387a
            nI.q r6 = r0.a()
            r0 = r1 & 14
            r1 = 200064(0x30d80, float:2.8035E-40)
            r7 = r0 | r1
            r8 = 16
            r4 = 0
            r0 = r20
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r12
            l0.d.g(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b7
            U0.C4895p.R()
        L_0x00b7:
            U0.Y0 r0 = r12.n()
            if (r0 == 0) goto L_0x00c5
            NC.i r1 = new NC.i
            r1.<init>(r9, r13, r10, r11)
            r0.a(r1)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: NC.k.f(boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(boolean z10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void h(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1268668212);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1268668212, i12, -1, "com.ingka.ikea.ui.overflowmenu.BadgeWithNoAnimation (OverflowMenu.kt:179)");
            }
            C13272a aVar = C13272a.f112384a;
            C5844O.a(b.c(C5116k1.a(J.t(D.h(dVar, aVar.a()), aVar.b()), "MENU_BADGE"), C18030v.f147664a.a(k10, C18030v.f147665b).v0(), g.h()), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13276e(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void j(C15987c<C13275d.a> cVar, C15987c<C13275d.c> cVar2, C13275d.b bVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C4899r0 r0Var;
        C15987c<C13275d.a> cVar3 = cVar;
        C15987c<C13275d.c> cVar4 = cVar2;
        C13275d.b bVar2 = bVar;
        int i12 = i10;
        C17542s.j(cVar3, "actions");
        C17542s.j(cVar4, "items");
        C17542s.j(bVar2, "overflowIcon");
        C4889m k10 = mVar.k(-1410830703);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(cVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(bVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1410830703, i11, -1, "com.ingka.ikea.ui.overflowmenu.OverflowMenu (OverflowMenu.kt:89)");
            }
            k10.W(411003499);
            for (C13275d.a aVar : cVar) {
                d.a aVar2 = d.f18749a;
                C5437c.a aVar3 = C5437c.f24302a;
                I h10 = C5077h.h(aVar3.o(), false);
                int a10 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, aVar2);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a11);
                } else {
                    k10.t();
                }
                C4889m a12 = F1.a(k10);
                F1.c(a12, h10, aVar4.c());
                F1.c(a12, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar4.d());
                C5079j jVar = C5079j.f18125a;
                F0.b(aVar.e(), aVar.c(), (d) null, aVar.d(), aVar.h(), (G0) null, (m) null, false, aVar.f(), k10, 0, 228);
                k10 = k10;
                f(aVar.g(), jVar.a(aVar2, aVar3.e()), k10, 0, 0);
                k10.x();
            }
            k10.P();
            if (!cVar2.isEmpty()) {
                d.a aVar5 = d.f18749a;
                I h11 = C5077h.h(C5437c.f24302a.o(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e11 = c.e(k10, aVar5);
                C4504g.a aVar6 = C4504g.f6515W;
                C17631a<C4504g> a14 = aVar6.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a14);
                } else {
                    k10.t();
                }
                C4889m a15 = F1.a(k10);
                F1.c(a15, h11, aVar6.c());
                F1.c(a15, s11, aVar6.e());
                p<C4504g, Integer, C16807N> b11 = aVar6.b();
                if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                    a15.u(Integer.valueOf(a13));
                    a15.w(Integer.valueOf(a13), b11);
                }
                F1.c(a15, e11, aVar6.d());
                C5079j jVar2 = C5079j.f18125a;
                k10.W(-1969114078);
                Object D10 = k10.D();
                C4889m.a aVar7 = C4889m.f14007a;
                if (D10 == aVar7.a()) {
                    D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                    k10.u(D10);
                }
                C4899r0 r0Var2 = (C4899r0) D10;
                k10.P();
                d a16 = C5116k1.a(aVar5, "MENU_BUTTON");
                boolean b12 = bVar.b();
                int c10 = bVar.c();
                String a17 = bVar.a();
                H0 d10 = bVar.d();
                k10.W(-1969111173);
                Object D11 = k10.D();
                if (D11 == aVar7.a()) {
                    D11 = new C13277f(r0Var2);
                    k10.u(D11);
                }
                k10.P();
                C4899r0 r0Var3 = r0Var2;
                F0.b(c10, a17, a16, b12, d10, (G0) null, (m) null, false, (C17631a) D11, k10, 100663680, 224);
                boolean l10 = l(r0Var3);
                d a18 = C5116k1.a(aVar5, "MENU_DROPDOWN");
                C4889m mVar3 = k10;
                long i13 = C18030v.f147664a.a(mVar3, C18030v.f147665b).i();
                mVar3.W(-1969091336);
                Object D12 = mVar3.D();
                if (D12 == aVar7.a()) {
                    r0Var = r0Var3;
                    D12 = new C13278g(r0Var);
                    mVar3.u(D12);
                } else {
                    r0Var = r0Var3;
                }
                mVar3.P();
                mVar2 = mVar3;
                C4722d.a(l10, (C17631a) D12, a18, 0, (o) null, (androidx.compose.ui.window.q) null, (i1) null, i13, 0.0f, 0.0f, (C5601g) null, c1.c.e(-272854069, true, new a(cVar4, r0Var), mVar3, 54), mVar2, 432, 48, 1912);
                mVar2.x();
            } else {
                mVar2 = k10;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new h(cVar3, cVar4, bVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C15987c cVar, C15987c cVar2, C13275d.b bVar, int i10, C4889m mVar, int i11) {
        j(cVar, cVar2, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final boolean l(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void m(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C4899r0 r0Var) {
        m(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C4899r0 r0Var) {
        m(r0Var, false);
        return C16807N.f139792a;
    }
}
