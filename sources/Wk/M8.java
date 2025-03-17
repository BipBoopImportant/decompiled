package wK;

import E1.C4488v;
import E1.I;
import G1.C4504g;
import L1.v;
import L1.x;
import N1.E;
import N1.P;
import N1.Y;
import O0.H;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U1.e;
import XH.C16807N;
import XH.t;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.o;
import Y1.s;
import YH.C16877v;
import YH.U;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import c2.r;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5534c;
import m0.C5546i;
import n0.C5599e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5662b;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import p1.g1;
import r0.m;
import r1.f;
import r1.g;
import s0.C5842M;
import s0.C5843N;
import s0.C5857c;
import s0.C5880z;
import tI.C17974j;
import tK.C18013d;
import tK.C18014e;
import tK.C18029u;
import wK.C18542x8;
import zK.C18766k;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aA\u0010#\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000bH\u0003¢\u0006\u0004\b#\u0010$\u001a-\u0010*\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0003¢\u0006\u0004\b*\u0010+\u001ae\u00100\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u00012\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b0\u00101\u001a\u0001\u0010:\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00107\u001a\u0002062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u00108\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0(2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010=\u001a\u00020\u000e*\u00020<H\u0003¢\u0006\u0004\b=\u0010>¨\u0006@²\u0006\u000e\u0010,\u001a\u00020\u00158\n@\nX\u0002²\u0006\u000e\u0010-\u001a\u00020\u00158\n@\nX\u0002²\u0006\f\u0010?\u001a\u00020\u000b8\nX\u0002²\u0006\f\u00104\u001a\u00020\u000b8\nX\u0002²\u0006\u000e\u0010,\u001a\u00020\u00158\n@\nX\u0002²\u0006\u000e\u0010-\u001a\u00020\u00158\n@\nX\u0002²\u0006\f\u0010?\u001a\u00020\u000b8\nX\u0002²\u0006\f\u00104\u001a\u00020\u000b8\nX\u0002²\u0006\f\u0010)\u001a\u00020\u00188\nX\u0002"}, d2 = {"T", "", "LwK/x8$a;", "textItems", "selectedKey", "Landroidx/compose/ui/d;", "modifier", "LwK/O8;", "style", "LwK/P8;", "size", "", "enabled", "Lkotlin/Function1;", "LXH/N;", "onSelect", "u", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/d;LwK/O8;LwK/P8;ZLnI/l;LU0/m;II)V", "LwK/V3;", "Q", "(LwK/P8;)LwK/V3;", "", "Lc2/d;", "density", "Lc2/h;", "P", "(ILc2/d;LU0/m;I)F", "index", "LwK/x8;", "items", "LwK/T1;", "componentStyle", "LwK/r;", "animationStates", "focused", "s", "(ILjava/util/List;LwK/T1;LwK/r;ZLU0/m;I)V", "LwK/U3;", "backgroundStyle", "adjustedBoxWidth", "Lkotlin/Function0;", "animatedOffsetX", "n", "(LwK/U3;FLnI/a;LU0/m;I)V", "boxWidth", "selectedIndex", "Ls0/M;", "content", "F", "(Landroidx/compose/ui/d;LwK/O8;Ljava/util/List;LwK/V3;ZIILnI/q;LU0/m;I)V", "item", "selected", "hover", "key", "Lr0/m;", "interactionSource", "isFluid", "onWidthMeasured", "A", "(Ls0/M;LwK/x8;LwK/T1;ZZZLjava/lang/Object;ILr0/m;LnI/l;ZLnI/p;LnI/l;LU0/m;III)V", "Ls0/c;", "q", "(Ls0/c;LU0/m;I)V", "pressed", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M8 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<C18542x8.a<T>> f149838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f149839b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O8 f149840c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ V3 f149841d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f149842e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f149843f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f149844g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4894o0 f149845h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4894o0 f149846i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.M8$a$a  reason: collision with other inner class name */
        static final class C4307a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C18542x8.a<T> f149847a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ T1 f149848b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C18461r f149849c;

            C4307a(C18542x8.a<T> aVar, T1 t12, C18461r rVar) {
                this.f149847a = aVar;
                this.f149848b = t12;
                this.f149849c = rVar;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1712656240, i11, -1, "net.ikea.skapa.ui.components.SegmentedControl.<anonymous>.<anonymous>.<anonymous> (SegmentedControl.kt:131)");
                    }
                    d1.b(this.f149847a.c(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.a()), 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, Y.c(this.f149848b.g(mVar2, 0), this.f149849c.b(mVar2, 0).getValue().y(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (h) null, 0, 0, (s) null, 16777214, (Object) null), mVar, 0, 0, 65022);
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

        a(List<C18542x8.a<T>> list, T t10, O8 o82, V3 v32, boolean z10, C17642l<? super T, C16807N> lVar, int i10, C4894o0 o0Var, C4894o0 o0Var2) {
            this.f149838a = list;
            this.f149839b = t10;
            this.f149840c = o82;
            this.f149841d = v32;
            this.f149842e = z10;
            this.f149843f = lVar;
            this.f149844g = i10;
            this.f149845h = o0Var;
            this.f149846i = o0Var2;
        }

        private static final boolean c(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        private static final boolean e(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C4894o0 o0Var, int i10) {
            M8.w(o0Var, i10);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: r0.m} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5842M r35, U0.C4889m r36, int r37) {
            /*
                r34 = this;
                r0 = r34
                r14 = r35
                r12 = r36
                java.lang.String r1 = "$this$SegmentedControlRow"
                kotlin.jvm.internal.C17542s.j(r14, r1)
                r1 = r37 & 6
                if (r1 != 0) goto L_0x001c
                boolean r1 = r12.V(r14)
                if (r1 == 0) goto L_0x0017
                r1 = 4
                goto L_0x0018
            L_0x0017:
                r1 = 2
            L_0x0018:
                r1 = r37 | r1
                r10 = r1
                goto L_0x001e
            L_0x001c:
                r10 = r37
            L_0x001e:
                r1 = r10 & 19
                r9 = 18
                if (r1 != r9) goto L_0x0030
                boolean r1 = r36.l()
                if (r1 != 0) goto L_0x002b
                goto L_0x0030
            L_0x002b:
                r36.L()
                goto L_0x0197
            L_0x0030:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x003f
                r1 = -1
                java.lang.String r2 = "net.ikea.skapa.ui.components.SegmentedControl.<anonymous> (SegmentedControl.kt:102)"
                r3 = 2104999196(0x7d77bd1c, float:2.0581327E37)
                U0.C4895p.S(r3, r10, r1, r2)
            L_0x003f:
                java.util.List<wK.x8$a<T>> r8 = r0.f149838a
                r1 = r8
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                T r7 = r0.f149839b
                wK.O8 r6 = r0.f149840c
                wK.V3 r5 = r0.f149841d
                boolean r4 = r0.f149842e
                nI.l<T, XH.N> r3 = r0.f149843f
                int r2 = r0.f149844g
                U0.o0 r11 = r0.f149845h
                U0.o0 r13 = r0.f149846i
                java.util.Iterator r24 = r1.iterator()
                r25 = 0
            L_0x005a:
                boolean r15 = r24.hasNext()
                if (r15 == 0) goto L_0x018e
                java.lang.Object r15 = r24.next()
                int r26 = r25 + 1
                if (r25 >= 0) goto L_0x006b
                YH.C16877v.x()
            L_0x006b:
                wK.x8$a r15 = (wK.C18542x8.a) r15
                r0.m r16 = r15.a()
                r9 = 1843082348(0x6ddb346c, float:8.480074E27)
                r12.W(r9)
                if (r16 != 0) goto L_0x0099
                r9 = 449153793(0x1ac58b01, float:8.1701863E-23)
                r12.W(r9)
                java.lang.Object r9 = r36.D()
                U0.m$a r16 = U0.C4889m.f14007a
                java.lang.Object r1 = r16.a()
                if (r9 != r1) goto L_0x0092
                r0.m r9 = r0.l.a()
                r12.u(r9)
            L_0x0092:
                r16 = r9
                r0.m r16 = (r0.m) r16
                r36.P()
            L_0x0099:
                r9 = r16
                r36.P()
                r1 = 0
                U0.A1 r16 = r0.p.a(r9, r12, r1)
                U0.A1 r27 = r0.i.a(r9, r12, r1)
                java.lang.Object r1 = r15.b()
                boolean r29 = kotlin.jvm.internal.C17542s.e(r7, r1)
                wK.T1 r1 = new wK.T1
                boolean r19 = c(r16)
                boolean r20 = e(r27)
                int r23 = wK.M8.x(r11)
                r30 = r15
                r15 = r1
                r16 = r6
                r17 = r5
                r18 = r29
                r21 = r4
                r22 = r25
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
                wK.r r15 = new wK.r
                r15.<init>(r1)
                boolean r18 = e(r27)
                java.lang.Object r19 = r30.b()
                wK.M8$a$a r0 = new wK.M8$a$a
                r20 = r11
                r11 = r30
                r0.<init>(r11, r1, r15)
                r21 = r1
                r1 = 54
                r22 = r3
                r3 = -1712656240(0xffffffff99eaf090, float:-2.4292195E-23)
                r23 = r4
                r4 = 1
                c1.a r0 = c1.c.e(r3, r4, r0, r12, r1)
                r1 = 449188727(0x1ac61377, float:8.192233E-23)
                r12.W(r1)
                java.lang.Object r1 = r36.D()
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r1 != r3) goto L_0x010d
                wK.L8 r1 = new wK.L8
                r1.<init>(r13)
                r12.u(r1)
            L_0x010d:
                nI.l r1 = (nI.C17642l) r1
                r27 = r13
                r13 = r1
                r36.P()
                r1 = r10 & 14
                int r3 = r2 >> 3
                r3 = r3 & 8
                r30 = 18
                int r3 = r3 << 18
                r1 = r1 | r3
                r31 = r15
                r15 = r1
                r16 = 432(0x1b0, float:6.05E-43)
                r17 = 512(0x200, float:7.175E-43)
                r1 = 0
                r3 = r11
                r11 = r1
                r4 = 0
                r1 = r35
                r28 = r2
                r2 = r3
                r3 = r21
                r4 = r29
                r29 = r5
                r5 = r23
                r32 = r6
                r6 = r18
                r18 = r7
                r7 = r19
                r19 = r8
                r8 = r25
                r37 = r9
                r33 = r10
                r10 = r22
                r12 = r0
                r14 = r36
                wK.M8.A(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r0 = r36
                r1 = r37
                r8 = 0
                U0.A1 r1 = r0.C5814f.a(r1, r0, r8)
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r5 = r1.booleanValue()
                r7 = 0
                r1 = r25
                r2 = r19
                r4 = r31
                r6 = r36
                wK.M8.s(r1, r2, r3, r4, r5, r6, r7)
                r14 = r35
                r12 = r0
                r7 = r18
                r8 = r19
                r11 = r20
                r3 = r22
                r4 = r23
                r25 = r26
                r13 = r27
                r2 = r28
                r5 = r29
                r9 = r30
                r6 = r32
                r10 = r33
                r0 = r34
                goto L_0x005a
            L_0x018e:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0197
                U0.C4895p.R()
            L_0x0197:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.M8.a.b(s0.M, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5842M f149850a;

        b(C5842M m10) {
            this.f149850a = m10;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(-831750671);
            if (C4895p.J()) {
                C4895p.S(-831750671, i10, -1, "net.ikea.skapa.ui.components.SegmentedControlItem.<anonymous> (SegmentedControl.kt:452)");
            }
            androidx.compose.ui.d e10 = C5842M.e(this.f149850a, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return e10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T1 f149851a;

        c(T1 t12) {
            this.f149851a = t12;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(932636974);
            if (C4895p.J()) {
                C4895p.S(932636974, i10, -1, "net.ikea.skapa.ui.components.SegmentedControlItem.<anonymous> (SegmentedControl.kt:463)");
            }
            androidx.compose.ui.d c10 = androidx.compose.foundation.b.c(dVar, this.f149851a.a(mVar, 0), C18013d.f147437a.f());
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return c10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149852a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f149853b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                wK.P8[] r0 = wK.P8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                wK.P8 r2 = wK.P8.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                wK.P8 r3 = wK.P8.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.P8 r3 = wK.P8.Large     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f149852a = r0
                wK.w8[] r0 = wK.C18530w8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.w8 r3 = wK.C18530w8.Medium     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                wK.w8 r1 = wK.C18530w8.Large     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f149853b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.M8.d.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void A(s0.C5842M r30, wK.C18542x8<T> r31, wK.T1 r32, boolean r33, boolean r34, boolean r35, T r36, int r37, r0.m r38, nI.C17642l<? super T, XH.C16807N> r39, boolean r40, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r41, nI.C17642l<? super java.lang.Integer, XH.C16807N> r42, U0.C4889m r43, int r44, int r45, int r46) {
        /*
            r1 = r30
            r2 = r31
            r3 = r32
            r11 = r33
            r0 = r34
            r15 = r35
            r14 = r36
            r13 = r37
            r12 = r38
            r10 = r39
            r9 = r41
            r8 = r42
            r7 = r44
            r6 = r45
            r5 = r46
            r4 = -122065537(0xfffffffff8b96d7f, float:-3.0087368E34)
            r8 = r43
            U0.m r8 = r8.k(r4)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r5 & r16
            r17 = 2
            r18 = 4
            if (r16 == 0) goto L_0x0034
            r16 = r7 | 6
            goto L_0x0048
        L_0x0034:
            r16 = r7 & 6
            if (r16 != 0) goto L_0x0046
            boolean r16 = r8.V(r1)
            if (r16 == 0) goto L_0x0041
            r16 = r18
            goto L_0x0043
        L_0x0041:
            r16 = r17
        L_0x0043:
            r16 = r7 | r16
            goto L_0x0048
        L_0x0046:
            r16 = r7
        L_0x0048:
            r19 = r5 & 1
            r20 = 16
            r21 = 32
            if (r19 == 0) goto L_0x0055
            r16 = r16 | 48
        L_0x0052:
            r4 = r16
            goto L_0x0070
        L_0x0055:
            r19 = r7 & 48
            if (r19 != 0) goto L_0x0052
            r19 = r7 & 64
            if (r19 != 0) goto L_0x0062
            boolean r19 = r8.V(r2)
            goto L_0x0066
        L_0x0062:
            boolean r19 = r8.F(r2)
        L_0x0066:
            if (r19 == 0) goto L_0x006b
            r19 = r21
            goto L_0x006d
        L_0x006b:
            r19 = r20
        L_0x006d:
            r16 = r16 | r19
            goto L_0x0052
        L_0x0070:
            r16 = r5 & 2
            r22 = 128(0x80, float:1.794E-43)
            if (r16 == 0) goto L_0x0079
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0089
        L_0x0079:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0089
            boolean r2 = r8.V(r3)
            if (r2 == 0) goto L_0x0086
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0088
        L_0x0086:
            r2 = r22
        L_0x0088:
            r4 = r4 | r2
        L_0x0089:
            r2 = r5 & 4
            if (r2 == 0) goto L_0x0090
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a0
        L_0x0090:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00a0
            boolean r2 = r8.b(r11)
            if (r2 == 0) goto L_0x009d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x009f
        L_0x009d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x009f:
            r4 = r4 | r2
        L_0x00a0:
            r2 = r5 & 8
            if (r2 == 0) goto L_0x00a7
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b7
        L_0x00a7:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b7
            boolean r2 = r8.b(r0)
            if (r2 == 0) goto L_0x00b4
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b6
        L_0x00b4:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00b6:
            r4 = r4 | r2
        L_0x00b7:
            r2 = r5 & 16
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00c0
            r4 = r4 | r16
            goto L_0x00d0
        L_0x00c0:
            r2 = r7 & r16
            if (r2 != 0) goto L_0x00d0
            boolean r2 = r8.b(r15)
            if (r2 == 0) goto L_0x00cd
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cf
        L_0x00cd:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00cf:
            r4 = r4 | r2
        L_0x00d0:
            r2 = r5 & 32
            r16 = 2097152(0x200000, float:2.938736E-39)
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00db
            r4 = r4 | r23
            goto L_0x00f4
        L_0x00db:
            r2 = r7 & r23
            if (r2 != 0) goto L_0x00f4
            r2 = r7 & r16
            if (r2 != 0) goto L_0x00e8
            boolean r2 = r8.V(r14)
            goto L_0x00ec
        L_0x00e8:
            boolean r2 = r8.F(r14)
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f3
        L_0x00f1:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00f3:
            r4 = r4 | r2
        L_0x00f4:
            r2 = r5 & 64
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00fd
            r4 = r4 | r23
            goto L_0x010d
        L_0x00fd:
            r2 = r7 & r23
            if (r2 != 0) goto L_0x010d
            boolean r2 = r8.d(r13)
            if (r2 == 0) goto L_0x010a
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r4 = r4 | r2
        L_0x010d:
            r2 = r5 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0115
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0113:
            r4 = r4 | r2
            goto L_0x0126
        L_0x0115:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 & r7
            if (r2 != 0) goto L_0x0126
            boolean r2 = r8.V(r12)
            if (r2 == 0) goto L_0x0123
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0123:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0113
        L_0x0126:
            r2 = r5 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x012f
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012c:
            r4 = r4 | r2
        L_0x012d:
            r2 = r4
            goto L_0x0140
        L_0x012f:
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 & r7
            if (r2 != 0) goto L_0x012d
            boolean r2 = r8.F(r10)
            if (r2 == 0) goto L_0x013d
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x013d:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012c
        L_0x0140:
            r4 = r5 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0149
            r17 = r6 | 6
            r3 = r40
            goto L_0x015c
        L_0x0149:
            r23 = r6 & 6
            r3 = r40
            if (r23 != 0) goto L_0x015a
            boolean r24 = r8.b(r3)
            if (r24 == 0) goto L_0x0157
            r17 = r18
        L_0x0157:
            r17 = r6 | r17
            goto L_0x015c
        L_0x015a:
            r17 = r6
        L_0x015c:
            r3 = r5 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0165
            r17 = r17 | 48
        L_0x0162:
            r3 = r17
            goto L_0x0174
        L_0x0165:
            r3 = r6 & 48
            if (r3 != 0) goto L_0x0162
            boolean r3 = r8.F(r9)
            if (r3 == 0) goto L_0x0171
            r20 = r21
        L_0x0171:
            r17 = r17 | r20
            goto L_0x0162
        L_0x0174:
            r7 = r5 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x017d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x017a:
            r7 = r42
            goto L_0x018d
        L_0x017d:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x017a
            r7 = r42
            boolean r17 = r8.F(r7)
            if (r17 == 0) goto L_0x018b
            r22 = 256(0x100, float:3.59E-43)
        L_0x018b:
            r3 = r3 | r22
        L_0x018d:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r2 & r17
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x01b0
            r5 = r3 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x01b0
            boolean r5 = r8.l()
            if (r5 != 0) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            r8.L()
            r6 = r32
            r13 = r40
            r10 = r7
            r7 = r8
            r12 = r9
            goto L_0x038d
        L_0x01b0:
            if (r4 == 0) goto L_0x01b4
            r5 = 1
            goto L_0x01b6
        L_0x01b4:
            r5 = r40
        L_0x01b6:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01c4
            java.lang.String r4 = "net.ikea.skapa.ui.components.SegmentedControlItem (SegmentedControl.kt:438)"
            r6 = -122065537(0xfffffffff8b96d7f, float:-3.0087368E34)
            U0.C4895p.S(r6, r2, r3, r4)
        L_0x01c4:
            float r6 = r32.f()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r40 = r5
            r5 = -96471830(0xfffffffffa3ff4ea, float:-2.4917404E35)
            r8.W(r5)
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r2
            r18 = r6
            r6 = 8388608(0x800000, float:1.17549435E-38)
            if (r5 != r6) goto L_0x01dd
            r5 = 1
            goto L_0x01de
        L_0x01dd:
            r5 = 0
        L_0x01de:
            java.lang.Object r6 = r8.D()
            if (r5 != 0) goto L_0x01ec
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01f4
        L_0x01ec:
            wK.G8 r6 = new wK.G8
            r6.<init>(r13)
            r8.u(r6)
        L_0x01f4:
            nI.l r6 = (nI.C17642l) r6
            r8.P()
            r5 = 1
            androidx.compose.ui.d r4 = L1.o.c(r4, r5, r6)
            L1.i$a r6 = L1.i.f8936b
            int r6 = r6.g()
            L1.i r17 = L1.i.h(r6)
            r6 = -96462496(0xfffffffffa401960, float:-2.4935892E35)
            r8.W(r6)
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r2
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r6 != r5) goto L_0x0217
            r5 = 1
            goto L_0x0218
        L_0x0217:
            r5 = 0
        L_0x0218:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r2
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r6 == r7) goto L_0x022c
            r6 = r2 & r16
            if (r6 == 0) goto L_0x022a
            boolean r6 = r8.F(r14)
            if (r6 == 0) goto L_0x022a
            goto L_0x022c
        L_0x022a:
            r6 = 0
            goto L_0x022d
        L_0x022c:
            r6 = 1
        L_0x022d:
            r5 = r5 | r6
            java.lang.Object r6 = r8.D()
            if (r5 != 0) goto L_0x023c
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0244
        L_0x023c:
            wK.H8 r6 = new wK.H8
            r6.<init>(r10, r14)
            r8.u(r6)
        L_0x0244:
            r16 = r6
            nI.a r16 = (nI.C17631a) r16
            r8.P()
            r7 = 0
            r25 = r40
            r6 = 1
            r5 = r33
            r26 = r18
            r6 = r38
            r27 = r8
            r8 = r34
            r9 = r17
            r10 = r16
            androidx.compose.ui.d r4 = androidx.compose.foundation.selection.a.a(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d r4 = zK.C18756a.i(r4, r15, r0)
            wK.M8$b r5 = new wK.M8$b
            r5.<init>(r1)
            int r6 = r3 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = r25
            r7 = r27
            androidx.compose.ui.d r4 = vK.C18205e.h(r4, r8, r5, r7, r6)
            float r5 = r32.h()
            float r6 = r32.i()
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.a(r4, r6, r5)
            r5 = -96453595(0xfffffffffa403c25, float:-2.4953522E35)
            r7.W(r5)
            r5 = r3 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x0290
            r6 = 1
            goto L_0x0291
        L_0x0290:
            r6 = 0
        L_0x0291:
            java.lang.Object r5 = r7.D()
            if (r6 != 0) goto L_0x02a3
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x02a0
            goto L_0x02a3
        L_0x02a0:
            r10 = r42
            goto L_0x02ad
        L_0x02a3:
            wK.I8 r5 = new wK.I8
            r10 = r42
            r5.<init>(r10)
            r7.u(r5)
        L_0x02ad:
            nI.l r5 = (nI.C17642l) r5
            r7.P()
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.c.a(r4, r5)
            int r2 = r2 >> 24
            r2 = r2 & 14
            U0.A1 r2 = r0.C5814f.a(r12, r7, r2)
            r5 = 24
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r19 = 40
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12 = r4
            r13 = r2
            r14 = r34
            r15 = r5
            androidx.compose.ui.d r2 = zK.C18756a.d(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = r11 ^ 1
            wK.M8$c r5 = new wK.M8$c
            r6 = r32
            r5.<init>(r6)
            r9 = 0
            androidx.compose.ui.d r2 = vK.C18205e.h(r2, r4, r5, r7, r9)
            tK.u r4 = tK.C18029u.f147649a
            float r4 = r4.f()
            r5 = r26
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.j(r2, r5, r4)
            r4 = 0
            r5 = 0
            r12 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.d(r2, r4, r12, r5)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.e()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r9)
            int r5 = U0.C4883j.a(r7, r9)
            U0.y r9 = r7.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r7, r2)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r7.m()
            if (r14 != 0) goto L_0x031e
            U0.C4883j.c()
        L_0x031e:
            r7.I()
            boolean r14 = r7.i()
            if (r14 == 0) goto L_0x032b
            r7.p(r13)
            goto L_0x032e
        L_0x032b:
            r7.t()
        L_0x032e:
            U0.m r13 = U0.F1.a(r7)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r4, r14)
            nI.p r4 = r12.e()
            U0.F1.c(r13, r9, r4)
            nI.p r4 = r12.b()
            boolean r9 = r13.i()
            if (r9 != 0) goto L_0x0358
            java.lang.Object r9 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x0366
        L_0x0358:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r13.u(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13.w(r5, r4)
        L_0x0366:
            nI.p r4 = r12.d()
            U0.F1.c(r13, r2, r4)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            r4 = 6
            q(r2, r7, r4)
            int r2 = r3 >> 3
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = r41
            r12.invoke(r7, r2)
            r7.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x038c
            U0.C4895p.R()
        L_0x038c:
            r13 = r8
        L_0x038d:
            U0.Y0 r15 = r7.n()
            if (r15 == 0) goto L_0x03c3
            wK.J8 r14 = new wK.J8
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r13
            r12 = r41
            r13 = r42
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r16 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x03c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.M8.A(s0.M, wK.x8, wK.T1, boolean, boolean, boolean, java.lang.Object, int, r0.m, nI.l, boolean, nI.p, nI.l, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(int i10, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.b0(xVar, new L1.c(1, 1, i10, 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar, Object obj) {
        lVar.invoke(obj);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar, C4488v vVar) {
        C17542s.j(vVar, "coordinates");
        lVar.invoke(Integer.valueOf(r.h(vVar.a())));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C5842M m10, C18542x8 x8Var, T1 t12, boolean z10, boolean z11, boolean z12, Object obj, int i10, m mVar, C17642l lVar, boolean z13, p pVar, C17642l lVar2, int i11, int i12, int i13, C4889m mVar2, int i14) {
        A(m10, x8Var, t12, z10, z11, z12, obj, i10, mVar, lVar, z13, pVar, lVar2, mVar2, M0.a(i11 | 1), M0.a(i12), i13);
        return C16807N.f139792a;
    }

    private static final void F(androidx.compose.ui.d dVar, O8 o82, List<? extends C18542x8<?>> list, V3 v32, boolean z10, int i10, int i11, q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i12) {
        int i13;
        C4889m mVar2;
        int i14;
        int i15;
        androidx.compose.ui.d dVar2 = dVar;
        O8 o83 = o82;
        List<? extends C18542x8<?>> list2 = list;
        V3 v33 = v32;
        boolean z11 = z10;
        int i16 = i10;
        int i17 = i11;
        q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        int i18 = i12;
        C4889m k10 = mVar.k(686861370);
        if ((i18 & 6) == 0) {
            i13 = (k10.V(dVar2) ? 4 : 2) | i18;
        } else {
            i13 = i18;
        }
        if ((i18 & 48) == 0) {
            i13 |= k10.V(o83) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i13 |= k10.F(list2) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i13 |= k10.V(v33) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i18 & 24576) == 0) {
            i13 |= k10.b(z11) ? 16384 : 8192;
        }
        if ((196608 & i18) == 0) {
            i13 |= k10.d(i16) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i18) == 0) {
            i13 |= k10.d(i17) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i18) == 0) {
            i13 |= k10.F(qVar2) ? 8388608 : 4194304;
        }
        int i19 = i13;
        if ((4793491 & i19) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(686861370, i19, -1, "net.ikea.skapa.ui.components.SegmentedControlRow (SegmentedControl.kt:388)");
            }
            P1 p12 = new P1(v33, z11);
            long a10 = p12.a(k10, 0);
            float b10 = p12.b(k10, 0);
            float P10 = P(i16, (c2.d) k10.Q(C5100f0.e()), k10, (i19 >> 15) & 14);
            k10.W(-964268240);
            boolean F10 = k10.F(list2);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C8(list2);
                k10.u(D10);
            }
            k10.P();
            long j10 = a10;
            androidx.compose.ui.d a11 = androidx.compose.foundation.layout.x.a(L1.o.d(dVar, false, (C17642l) D10, 1, (Object) null), C5880z.Max);
            k10.W(-964264381);
            boolean e10 = k10.e(j10) | k10.c(b10);
            Object D11 = k10.D();
            if (e10 || D11 == C4889m.f14007a.a()) {
                D11 = new D8(j10, b10);
                k10.u(D11);
            }
            k10.P();
            androidx.compose.ui.d i20 = D.i(androidx.compose.ui.draw.b.b(a11, (C17642l) D11), C18029u.f147649a.f());
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, i20);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, h10, aVar.c());
            F1.c(a14, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b11);
            }
            F1.c(a14, e11, aVar.d());
            C5079j jVar = C5079j.f18125a;
            float B10 = c2.h.B((float) (v33 == V3.Small ? 7 : 9));
            k10.W(1503074862);
            if (i17 != -1) {
                U3 u32 = new U3(o83, z11, i17);
                C17974j o10 = C16877v.o(list2);
                ArrayList arrayList = new ArrayList(C16877v.y(o10, 10));
                Iterator it = o10.iterator();
                while (it.hasNext()) {
                    float c10 = (float) ((U) it).c();
                    arrayList.add(c2.h.m(c2.h.B(c2.h.B(P10 * c10) + c2.h.B(c10 * B10))));
                }
                float f10 = P10;
                i15 = 0;
                i14 = i19;
                mVar2 = k10;
                A1<c2.h> c11 = C5534c.c(((c2.h) arrayList.get(i17)).G(), (C5546i<c2.h>) null, "Background animation", (C17642l<? super c2.h, C16807N>) null, k10, 384, 10);
                mVar2.W(1503087376);
                boolean V10 = mVar2.V(c11);
                Object D12 = mVar2.D();
                if (V10 || D12 == C4889m.f14007a.a()) {
                    D12 = new E8(c11);
                    mVar2.u(D12);
                }
                mVar2.P();
                n(u32, f10, (C17631a) D12, mVar2, 0);
            } else {
                i14 = i19;
                mVar2 = k10;
                i15 = 0;
            }
            mVar2.P();
            C5437c.C0386c i21 = C5437c.f24302a.i();
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            I b12 = G.b(C5073d.f18068a.f(), i21, mVar2, 48);
            int a15 = C4883j.a(mVar2, i15);
            C4912y s11 = mVar2.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, aVar2);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a16 = aVar3.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a16);
            } else {
                mVar2.t();
            }
            C4889m a17 = F1.a(mVar2);
            F1.c(a17, b12, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b13);
            }
            F1.c(a17, e12, aVar3.d());
            qVar.invoke(C5843N.f28726a, mVar2, Integer.valueOf(6 | ((i14 >> 18) & 112)));
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new F8(dVar, o82, list, v32, z10, i10, i11, qVar, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G(List list, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.a0(xVar, new L1.b(1, list.size()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(long j10, float f10, f fVar) {
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$drawBehind");
        f.L1(fVar2, j10, 0, 0, C5662b.b(fVar2.H1(f10), 0.0f, 2, (Object) null), new r1.k(fVar2.H1(C18014e.f147445a.b()), 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), 0.0f, (C5749w0) null, 0, 230, (Object) null);
        return C16807N.f139792a;
    }

    private static final float I(A1<c2.h> a12) {
        return a12.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final c2.h J(A1 a12) {
        return c2.h.m(I(a12));
    }

    /* access modifiers changed from: private */
    public static final C16807N K(androidx.compose.ui.d dVar, O8 o82, List list, V3 v32, boolean z10, int i10, int i11, q qVar, int i12, C4889m mVar, int i13) {
        F(dVar, o82, list, v32, z10, i10, i11, qVar, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    private static final float P(int i10, c2.d dVar, C4889m mVar, int i11) {
        mVar.W(545344030);
        if (C4895p.J()) {
            C4895p.S(545344030, i11, -1, "net.ikea.skapa.ui.components.toDp (SegmentedControl.kt:336)");
        }
        float H10 = dVar.H(i10);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return H10;
    }

    private static final V3 Q(P8 p82) {
        int i10 = d.f149852a[p82.ordinal()];
        if (i10 == 1) {
            return V3.Small;
        }
        if (i10 == 2) {
            return V3.Medium;
        }
        if (i10 == 3) {
            return V3.Large;
        }
        throw new t();
    }

    private static final void n(U3 u32, float f10, C17631a<c2.h> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1432960291);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(u32) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.c(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1432960291, i11, -1, "net.ikea.skapa.ui.components.BackgroundBox (SegmentedControl.kt:366)");
            }
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            k10.W(-2117074333);
            boolean z10 = (i11 & 896) == 256;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18564z8(aVar);
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d a10 = A.a(aVar2, (C17642l) D10);
            int i12 = i11 & 14;
            long a11 = u32.a(k10, i12);
            C18013d dVar = C18013d.f147437a;
            C5077h.a(J.d(J.y(C5599e.e(androidx.compose.foundation.b.c(a10, a11, dVar.f()), u32.b(k10, i12), dVar.f()), f10), 0.0f, 1, (Object) null), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new A8(u32, f10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final n o(C17631a aVar, c2.d dVar) {
        C17542s.j(dVar, "$this$offset");
        return n.b(c2.o.a(dVar.K0(((c2.h) aVar.invoke()).G()), 0));
    }

    /* access modifiers changed from: private */
    public static final C16807N p(U3 u32, float f10, C17631a aVar, int i10, C4889m mVar, int i11) {
        n(u32, f10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void q(C5857c cVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1444280992);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1444280992, i11, -1, "net.ikea.skapa.ui.components.ClickArea (SegmentedControl.kt:479)");
            }
            C5077h.a(C18766k.b(cVar.e(androidx.compose.ui.d.f18749a), 0.0f, 0.0f, 3, (Object) null), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new B8(cVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C5857c cVar, int i10, C4889m mVar, int i11) {
        q(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void s(int i10, List<? extends C18542x8<?>> list, T1 t12, C18461r rVar, boolean z10, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(1135995404);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.F(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.V(t12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= k10.V(rVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= k10.b(z10) ? 16384 : 8192;
        }
        if ((i12 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1135995404, i12, -1, "net.ikea.skapa.ui.components.Divider (SegmentedControl.kt:350)");
            }
            float B10 = t12.e() == V3.Small ? c2.h.B((float) 3) : C18029u.f147649a.f();
            if (i10 < C16877v.p(list)) {
                androidx.compose.ui.d j10 = D.j(androidx.compose.ui.d.f18749a, B10, t12.d(k10, (i12 >> 6) & 14));
                float a10 = N8.f149872a.a();
                k10.W(-1113905988);
                long h10 = z10 ? C5747v0.f27350b.h() : rVar.a(k10, (i12 >> 9) & 14).getValue().y();
                k10.P();
                H.b(j10, a10, h10, k10, 48, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new K8(i10, list, t12, rVar, z10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(int i10, List list, T1 t12, C18461r rVar, boolean z10, int i11, C4889m mVar, int i12) {
        s(i10, list, t12, rVar, z10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void u(java.util.List<wK.C18542x8.a<T>> r23, T r24, androidx.compose.ui.d r25, wK.O8 r26, wK.P8 r27, boolean r28, nI.C17642l<? super T, XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r10 = r23
            r11 = r24
            r12 = r29
            r13 = r31
            java.lang.String r0 = "textItems"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onSelect"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -1892159631(0xffffffff8f37ef71, float:-9.068711E-30)
            r1 = r30
            U0.m r14 = r1.k(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r14.F(r10)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0052
        L_0x0039:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0052
            r2 = r13 & 64
            if (r2 != 0) goto L_0x0046
            boolean r2 = r14.V(r11)
            goto L_0x004a
        L_0x0046:
            boolean r2 = r14.F(r11)
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2 = 32
            goto L_0x0051
        L_0x004f:
            r2 = 16
        L_0x0051:
            r1 = r1 | r2
        L_0x0052:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r3 = r25
            goto L_0x006d
        L_0x005b:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0058
            r3 = r25
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x006a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r4
        L_0x006d:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x0076
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r5 = r26
            goto L_0x0088
        L_0x0076:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0073
            r5 = r26
            boolean r6 = r14.V(r5)
            if (r6 == 0) goto L_0x0085
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r6
        L_0x0088:
            r6 = r32 & 16
            if (r6 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r7 = r27
            goto L_0x00a3
        L_0x0091:
            r7 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x008e
            r7 = r27
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x00a0
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r8
        L_0x00a3:
            r8 = r32 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00ad
            r1 = r1 | r9
        L_0x00aa:
            r9 = r28
            goto L_0x00be
        L_0x00ad:
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00aa
            r9 = r28
            boolean r15 = r14.b(r9)
            if (r15 == 0) goto L_0x00bb
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r15
        L_0x00be:
            r15 = r32 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c8
            r1 = r1 | r16
        L_0x00c6:
            r15 = r1
            goto L_0x00d9
        L_0x00c8:
            r15 = r13 & r16
            if (r15 != 0) goto L_0x00c6
            boolean r15 = r14.F(r12)
            if (r15 == 0) goto L_0x00d5
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r15
            goto L_0x00c6
        L_0x00d9:
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r15
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r0) goto L_0x00f1
            boolean r0 = r14.l()
            if (r0 != 0) goto L_0x00e9
            goto L_0x00f1
        L_0x00e9:
            r14.L()
            r4 = r5
            r5 = r7
            r6 = r9
            goto L_0x01fa
        L_0x00f1:
            if (r2 == 0) goto L_0x00f8
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r17 = r0
            goto L_0x00fa
        L_0x00f8:
            r17 = r3
        L_0x00fa:
            if (r4 == 0) goto L_0x0101
            wK.O8 r0 = wK.O8.Regular
            r18 = r0
            goto L_0x0103
        L_0x0101:
            r18 = r5
        L_0x0103:
            if (r6 == 0) goto L_0x010a
            wK.P8 r0 = wK.P8.Medium
            r19 = r0
            goto L_0x010c
        L_0x010a:
            r19 = r7
        L_0x010c:
            r7 = 1
            if (r8 == 0) goto L_0x0112
            r20 = r7
            goto L_0x0114
        L_0x0112:
            r20 = r9
        L_0x0114:
            boolean r0 = U0.C4895p.J()
            r1 = -1
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "net.ikea.skapa.ui.components.SegmentedControl (SegmentedControl.kt:85)"
            r2 = -1892159631(0xffffffff8f37ef71, float:-9.068711E-30)
            U0.C4895p.S(r2, r15, r1, r0)
        L_0x0123:
            r0 = 1529446653(0x5b2980fd, float:4.7711095E16)
            r14.W(r0)
            java.lang.Object r0 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            r4 = 0
            if (r0 != r3) goto L_0x013d
            U0.o0 r0 = U0.C4877g1.a(r4)
            r14.u(r0)
        L_0x013d:
            r9 = r0
            U0.o0 r9 = (U0.C4894o0) r9
            r14.P()
            wK.V3 r16 = Q(r19)
            r0 = 1529449726(0x5b298cfe, float:4.7724294E16)
            r14.W(r0)
            java.lang.Object r0 = r14.D()
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x015e
            U0.o0 r0 = U0.C4877g1.a(r1)
            r14.u(r0)
        L_0x015e:
            r8 = r0
            U0.o0 r8 = (U0.C4894o0) r8
            r14.P()
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x016b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x018d
            java.lang.Object r2 = r0.next()
            int r3 = r4 + 1
            if (r4 >= 0) goto L_0x017c
            YH.C16877v.x()
        L_0x017c:
            wK.x8$a r2 = (wK.C18542x8.a) r2
            java.lang.Object r2 = r2.b()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r11)
            if (r2 == 0) goto L_0x018b
            y(r8, r4)
        L_0x018b:
            r4 = r3
            goto L_0x016b
        L_0x018d:
            int r0 = x(r8)
            if (r0 != r1) goto L_0x019a
            java.lang.String r0 = "Skapa"
            java.lang.String r1 = "SegmentedControl - The selected key does not exist in the list of items."
            android.util.Log.e(r0, r1)
        L_0x019a:
            int r21 = v(r9)
            int r22 = x(r8)
            wK.M8$a r6 = new wK.M8$a
            r0 = r6
            r1 = r23
            r2 = r24
            r3 = r18
            r4 = r16
            r5 = r20
            r10 = r6
            r6 = r29
            r11 = r7
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 54
            r1 = 2104999196(0x7d77bd1c, float:2.0581327E37)
            c1.a r7 = c1.c.e(r1, r11, r10, r14, r0)
            int r0 = r15 >> 6
            r1 = r0 & 14
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r15 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r15 >> 3
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r9 = r0 | r1
            r0 = r17
            r1 = r18
            r2 = r23
            r3 = r16
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r14
            F(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f2
            U0.C4895p.R()
        L_0x01f2:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
        L_0x01fa:
            U0.Y0 r10 = r14.n()
            if (r10 == 0) goto L_0x0213
            wK.y8 r11 = new wK.y8
            r0 = r11
            r1 = r23
            r2 = r24
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.M8.u(java.util.List, java.lang.Object, androidx.compose.ui.d, wK.O8, wK.P8, boolean, nI.l, U0.m, int, int):void");
    }

    private static final int v(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void w(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final int x(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void y(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N z(List list, Object obj, androidx.compose.ui.d dVar, O8 o82, P8 p82, boolean z10, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        u(list, obj, dVar, o82, p82, z10, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
