package Ed;

import A0.g;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.d;
import bI.C17035a;
import c2.h;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5843N;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "primaryContent", "secondaryContent", "f", "(LnI/p;LnI/p;LU0/m;II)V", "d", "(LU0/m;I)V", "", "isExpanded", "Lc2/h;", "primaryContentHeight", "secondaryContentHeight", "bottomSheetWidth", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements q<Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Configuration f60208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f60209b;

        a(Configuration configuration, C4899r0<h> r0Var) {
            this.f60208a = configuration;
            this.f60209b = r0Var;
        }

        public final void a(int i10, C4889m mVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= mVar.d(i10) ? 4 : 2;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1231867129, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.ResizableBottomSheet.<anonymous> (ResizableBottomSheet.kt:50)");
                }
                if (i10 == 1) {
                    o.i(this.f60209b, h.B((float) this.f60208a.screenHeightDp));
                } else if (i10 == 2) {
                    o.i(this.f60209b, h.B(h.B((float) this.f60208a.screenWidthDp) * 0.4f));
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
            a(((Number) obj).intValue(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f60210a;

        b(C4899r0<h> r0Var) {
            this.f60210a = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(a0 a0Var, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            a0.a.m(aVar, a0Var, 0, 0, 0.0f, 4, (Object) null);
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            C17542s.j(k10, "$this$Layout");
            C17542s.j(list, "measurables");
            a0 i02 = ((H) C16877v.w0(list)).i0(j10);
            o.m(this.f60210a, ((h) C17035a.k(h.m(k10.H(i02.z0())), h.m(h.B((float) 120)))).G());
            return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new p(i02), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f60211a;

        c(C4899r0<h> r0Var) {
            this.f60211a = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(a0 a0Var, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            a0.a.m(aVar, a0Var, 0, 0, 0.0f, 4, (Object) null);
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            C17542s.j(k10, "$this$Layout");
            C17542s.j(list, "measurables");
            a0 i02 = ((H) C16877v.w0(list)).i0(j10);
            o.n(this.f60211a, k10.H(i02.z0()));
            return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new q(i02), 4, (Object) null);
        }
    }

    private static final void d(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1182972512);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1182972512, i10, -1, "com.ikea.kompassmap.ui.components.bottomSheet.DragHandle (ResizableBottomSheet.kt:100)");
            }
            d.a aVar = d.f18749a;
            d m10 = D.m(androidx.compose.foundation.layout.J.h(aVar, 0.0f, 1, (Object) null), 0.0f, C18029u.f147649a.a(), 0.0f, 0.0f, 13, (Object) null);
            C5073d.f b10 = C5073d.f18068a.b();
            C5437c.a aVar2 = C5437c.f24302a;
            I b11 = G.b(b10, aVar2.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
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
            F1.c(a12, b11, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b12);
            }
            F1.c(a12, e10, aVar3.d());
            C5077h.a(androidx.compose.foundation.b.d(e.a(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.y(C5843N.f28726a.c(aVar, aVar2.i()), h.B((float) 60)), h.B((float) 4)), g.a(50)), C18030v.f147664a.a(k10, C18030v.f147665b).n0(), (i1) null, 2, (Object) null), k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new n(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(int i10, C4889m mVar, int i11) {
        d(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r0 = r34
            r1 = r37
            r2 = r38
            r3 = 6
            java.lang.String r4 = "primaryContent"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            r4 = 1914787419(0x7221565b, float:3.195615E30)
            r5 = r36
            U0.m r5 = r5.k(r4)
            r6 = 1
            r7 = r2 & 1
            r9 = 2
            if (r7 == 0) goto L_0x001e
            r7 = r1 | 6
            goto L_0x002e
        L_0x001e:
            r7 = r1 & 6
            if (r7 != 0) goto L_0x002d
            boolean r7 = r5.F(r0)
            if (r7 == 0) goto L_0x002a
            r7 = 4
            goto L_0x002b
        L_0x002a:
            r7 = r9
        L_0x002b:
            r7 = r7 | r1
            goto L_0x002e
        L_0x002d:
            r7 = r1
        L_0x002e:
            r10 = r2 & 2
            if (r10 == 0) goto L_0x0037
            r7 = r7 | 48
        L_0x0034:
            r12 = r35
            goto L_0x0049
        L_0x0037:
            r12 = r1 & 48
            if (r12 != 0) goto L_0x0034
            r12 = r35
            boolean r13 = r5.F(r12)
            if (r13 == 0) goto L_0x0046
            r13 = 32
            goto L_0x0048
        L_0x0046:
            r13 = 16
        L_0x0048:
            r7 = r7 | r13
        L_0x0049:
            r13 = r7 & 19
            r14 = 18
            if (r13 != r14) goto L_0x005b
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            r5.L()
            goto L_0x03fe
        L_0x005b:
            r13 = 0
            if (r10 == 0) goto L_0x005f
            r12 = r13
        L_0x005f:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x006b
            r10 = -1
            java.lang.String r14 = "com.ikea.kompassmap.ui.components.bottomSheet.ResizableBottomSheet (ResizableBottomSheet.kt:38)"
            U0.C4895p.S(r4, r7, r10, r14)
        L_0x006b:
            r4 = 2117186719(0x7e31b49f, float:5.90528E37)
            r5.W(r4)
            java.lang.Object r4 = r5.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r14 = r10.a()
            r15 = 0
            if (r4 != r14) goto L_0x008e
            if (r12 == 0) goto L_0x0082
            r4 = r6
            goto L_0x0083
        L_0x0082:
            r4 = r15
        L_0x0083:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            U0.r0 r4 = U0.u1.e(r4, r13, r9, r13)
            r5.u(r4)
        L_0x008e:
            U0.r0 r4 = (U0.C4899r0) r4
            r5.P()
            r14 = 2117189483(0x7e31bf6b, float:5.9066814E37)
            r5.W(r14)
            java.lang.Object r14 = r5.D()
            java.lang.Object r11 = r10.a()
            if (r14 != r11) goto L_0x00b3
            float r11 = (float) r15
            float r11 = c2.h.B(r11)
            c2.h r11 = c2.h.m(r11)
            U0.r0 r14 = U0.u1.e(r11, r13, r9, r13)
            r5.u(r14)
        L_0x00b3:
            U0.r0 r14 = (U0.C4899r0) r14
            r5.P()
            r11 = 2117191659(0x7e31c7eb, float:5.9077847E37)
            r5.W(r11)
            java.lang.Object r11 = r5.D()
            java.lang.Object r8 = r10.a()
            if (r11 != r8) goto L_0x00d8
            float r8 = (float) r15
            float r8 = c2.h.B(r8)
            c2.h r8 = c2.h.m(r8)
            U0.r0 r11 = U0.u1.e(r8, r13, r9, r13)
            r5.u(r11)
        L_0x00d8:
            U0.r0 r11 = (U0.C4899r0) r11
            r5.P()
            U0.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r8 = r5.Q(r8)
            android.content.res.Configuration r8 = (android.content.res.Configuration) r8
            int r15 = r8.screenHeightDp
            float r15 = (float) r15
            float r15 = c2.h.B(r15)
            r3 = 2117197093(0x7e31dd25, float:5.91054E37)
            r5.W(r3)
            java.lang.Object r3 = r5.D()
            java.lang.Object r6 = r10.a()
            if (r3 != r6) goto L_0x0110
            int r3 = r8.screenWidthDp
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            c2.h r3 = c2.h.m(r3)
            U0.r0 r3 = U0.u1.e(r3, r13, r9, r13)
            r5.u(r3)
        L_0x0110:
            U0.r0 r3 = (U0.C4899r0) r3
            r5.P()
            Ed.o$a r6 = new Ed.o$a
            r6.<init>(r8, r3)
            r8 = 54
            r9 = -1231867129(0xffffffffb6933307, float:-4.3868818E-6)
            r13 = 1
            c1.a r6 = c1.c.e(r9, r13, r6, r5, r8)
            r8 = 6
            defpackage.h.b(r6, r5, r8)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r8 = 4
            float r8 = (float) r8
            float r20 = c2.h.B(r8)
            r27 = 30
            r28 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r19 = r6
            androidx.compose.ui.d r8 = m1.m.b(r19, r20, r21, r22, r23, r25, r27, r28)
            float r3 = h(r3)
            r9 = 0
            r1 = 0
            r13 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.A(r8, r9, r3, r13, r1)
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.k(r3, r9, r15, r13, r1)
            tK.v r1 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r1 = r1.a(r5, r3)
            long r18 = r1.k0()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r23 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            p0.v r25 = p0.v.Vertical
            r1 = 2117219981(0x7e32368d, float:5.9221457E37)
            r5.W(r1)
            r1 = r7 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r1 != r3) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r13 = 0
        L_0x0177:
            java.lang.Object r1 = r5.D()
            if (r13 != 0) goto L_0x0183
            java.lang.Object r3 = r10.a()
            if (r1 != r3) goto L_0x018b
        L_0x0183:
            Ed.l r1 = new Ed.l
            r1.<init>(r12, r4)
            r5.u(r1)
        L_0x018b:
            nI.l r1 = (nI.C17642l) r1
            r5.P()
            r3 = 0
            p0.r r24 = p0.q.i(r1, r5, r3)
            r32 = 252(0xfc, float:3.53E-43)
            r33 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            androidx.compose.ui.d r1 = p0.q.h(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r8 = r3.o()
            r9 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r9)
            int r13 = U0.C4883j.a(r5, r9)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r5, r1)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r2 = r15.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x01cf
            U0.C4883j.c()
        L_0x01cf:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x01dc
            r5.p(r2)
            goto L_0x01df
        L_0x01dc:
            r5.t()
        L_0x01df:
            U0.m r2 = U0.F1.a(r5)
            r36 = r11
            nI.p r11 = r15.c()
            U0.F1.c(r2, r8, r11)
            nI.p r8 = r15.e()
            U0.F1.c(r2, r9, r8)
            nI.p r8 = r15.b()
            boolean r9 = r2.i()
            if (r9 != 0) goto L_0x020b
            java.lang.Object r9 = r2.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0219
        L_0x020b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r2.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r2.w(r9, r8)
        L_0x0219:
            nI.p r8 = r15.d()
            U0.F1.c(r2, r1, r8)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$b r2 = r3.k()
            r3 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r5, r3)
            int r2 = U0.C4883j.a(r5, r3)
            U0.y r3 = r5.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r5, r6)
            nI.a r9 = r15.a()
            U0.f r11 = r5.m()
            if (r11 != 0) goto L_0x024a
            U0.C4883j.c()
        L_0x024a:
            r5.I()
            boolean r11 = r5.i()
            if (r11 == 0) goto L_0x0257
            r5.p(r9)
            goto L_0x025a
        L_0x0257:
            r5.t()
        L_0x025a:
            U0.m r9 = U0.F1.a(r5)
            nI.p r11 = r15.c()
            U0.F1.c(r9, r1, r11)
            nI.p r1 = r15.e()
            U0.F1.c(r9, r3, r1)
            nI.p r1 = r15.b()
            boolean r3 = r9.i()
            if (r3 != 0) goto L_0x0284
            java.lang.Object r3 = r9.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r11)
            if (r3 != 0) goto L_0x0292
        L_0x0284:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r9.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.w(r2, r1)
        L_0x0292:
            nI.p r1 = r15.d()
            U0.F1.c(r9, r8, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 0
            d(r5, r1)
            r1 = 599013218(0x23b43762, float:1.9539095E-17)
            r5.W(r1)
            java.lang.Object r1 = r5.D()
            java.lang.Object r2 = r10.a()
            if (r1 != r2) goto L_0x02b7
            Ed.o$b r1 = new Ed.o$b
            r1.<init>(r14)
            r5.u(r1)
        L_0x02b7:
            E1.I r1 = (E1.I) r1
            r5.P()
            r2 = r7 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = 0
            int r8 = U0.C4883j.a(r5, r3)
            U0.y r3 = r5.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r5, r6)
            nI.a r11 = r15.a()
            r13 = 6
            int r2 = r2 << r13
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r13
            U0.f r13 = r5.m()
            if (r13 != 0) goto L_0x02df
            U0.C4883j.c()
        L_0x02df:
            r5.I()
            boolean r13 = r5.i()
            if (r13 == 0) goto L_0x02ec
            r5.p(r11)
            goto L_0x02ef
        L_0x02ec:
            r5.t()
        L_0x02ef:
            U0.m r11 = U0.F1.a(r5)
            nI.p r13 = r15.c()
            U0.F1.c(r11, r1, r13)
            nI.p r1 = r15.e()
            U0.F1.c(r11, r3, r1)
            nI.p r1 = r15.b()
            boolean r3 = r11.i()
            if (r3 != 0) goto L_0x0319
            java.lang.Object r3 = r11.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r13)
            if (r3 != 0) goto L_0x0327
        L_0x0319:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r11.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r11.w(r3, r1)
        L_0x0327:
            nI.p r1 = r15.d()
            U0.F1.c(r11, r9, r1)
            r1 = 6
            int r2 = r2 >> r1
            r1 = r2 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r5, r1)
            r5.x()
            r1 = 599025351(0x23b466c7, float:1.9559167E-17)
            r5.W(r1)
            boolean r1 = g(r4)
            if (r1 == 0) goto L_0x03ec
            if (r12 == 0) goto L_0x03ec
            r1 = 599030093(0x23b4794d, float:1.9567012E-17)
            r5.W(r1)
            java.lang.Object r1 = r5.D()
            java.lang.Object r2 = r10.a()
            if (r1 != r2) goto L_0x0364
            Ed.o$c r1 = new Ed.o$c
            r11 = r36
            r1.<init>(r11)
            r5.u(r1)
        L_0x0364:
            E1.I r1 = (E1.I) r1
            r5.P()
            int r2 = r7 >> 3
            r2 = r2 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = 0
            int r3 = U0.C4883j.a(r5, r3)
            U0.y r4 = r5.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r5, r6)
            nI.a r7 = r15.a()
            r8 = 6
            int r2 = r2 << r8
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r8
            U0.f r8 = r5.m()
            if (r8 != 0) goto L_0x038e
            U0.C4883j.c()
        L_0x038e:
            r5.I()
            boolean r8 = r5.i()
            if (r8 == 0) goto L_0x039b
            r5.p(r7)
            goto L_0x039e
        L_0x039b:
            r5.t()
        L_0x039e:
            U0.m r7 = U0.F1.a(r5)
            nI.p r8 = r15.c()
            U0.F1.c(r7, r1, r8)
            nI.p r1 = r15.e()
            U0.F1.c(r7, r4, r1)
            nI.p r1 = r15.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x03c8
            java.lang.Object r4 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x03d6
        L_0x03c8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.w(r3, r1)
        L_0x03d6:
            nI.p r1 = r15.d()
            U0.F1.c(r7, r6, r1)
            r1 = 6
            int r1 = r2 >> 6
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r5, r1)
            r5.x()
        L_0x03ec:
            r5.P()
            r5.x()
            r5.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x03fe
            U0.C4895p.R()
        L_0x03fe:
            U0.Y0 r1 = r5.n()
            if (r1 == 0) goto L_0x0410
            Ed.m r2 = new Ed.m
            r3 = r37
            r4 = r38
            r2.<init>(r0, r12, r3, r4)
            r1.a(r2)
        L_0x0410:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ed.o.f(nI.p, nI.p, U0.m, int, int):void");
    }

    private static final boolean g(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final float h(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final void i(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N j(p pVar, C4899r0 r0Var, float f10) {
        l(r0Var, f10 < 0.0f && pVar != null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(p pVar, p pVar2, int i10, int i11, C4889m mVar, int i12) {
        f(pVar, pVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void l(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final void m(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final void n(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }
}
