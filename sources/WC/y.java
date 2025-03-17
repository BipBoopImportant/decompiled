package WC;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import O0.V;
import O0.X;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13607l;
import SC.H2;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XC.C13802a;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18030v;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0015\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u0018\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\b\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010!\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b!\u0010\"\u001a5\u0010&\u001a\u00020\u0004*\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b&\u0010'\u001a=\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0012H\u0003¢\u0006\u0004\b.\u0010/\u001a\u000f\u00100\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u00101¨\u00062²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"LXC/a;", "viewModel", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "C", "(LXC/a;Landroidx/compose/ui/d;LU0/m;II)V", "LXC/a$a;", "uiState", "Lkotlin/Function1;", "", "onSlotGroupClicked", "onSlotClicked", "Lkotlin/Function0;", "onConfirmClicked", "z", "(LXC/a$a;LnI/l;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lt0/x;", "LIC/e;", "title", "description", "O", "(Lt0/x;LIC/e;LIC/e;)V", "LXC/a$a$a;", "M", "(Lt0/x;LXC/a$a$a;LnI/l;LnI/l;)V", "LXC/a$a$a$a;", "bookedSlot", "n", "(LXC/a$a$a$a;LU0/m;I)V", "LKJ/c;", "LXC/a$a$a$d;", "groups", "w", "(LKJ/c;LnI/l;LU0/m;I)V", "", "LXC/a$a$a$c;", "slots", "N", "(Lt0/x;Ljava/util/List;LnI/l;)V", "", "isSelected", "slot", "t", "(ZLXC/a$a$a$c;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "text", "r", "(LIC/e;LU0/m;I)V", "p", "(LU0/m;I)V", "time-slot-picker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f117624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13802a.C2911a.C2912a.d f117625b;

        a(C17642l<? super String, C16807N> lVar, C13802a.C2911a.C2912a.d dVar) {
            this.f117624a = lVar;
            this.f117625b = dVar;
        }

        public final void a() {
            this.f117624a.invoke(this.f117625b.b());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final b f117626c = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C13802a.C2911a.C2912a.d dVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f117627c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f117628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f117627c = lVar;
            this.f117628d = list;
        }

        public final Object a(int i10) {
            return this.f117627c.invoke(this.f117628d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f117629c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f117630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, C17642l lVar) {
            super(4);
            this.f117629c = list;
            this.f117630d = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r29, int r30, U0.C4889m r31, int r32) {
            /*
                r28 = this;
                r0 = r28
                r1 = r30
                r15 = r31
                r2 = r32 & 6
                r3 = 2
                if (r2 != 0) goto L_0x0019
                r2 = r29
                boolean r2 = r15.V(r2)
                if (r2 == 0) goto L_0x0015
                r2 = 4
                goto L_0x0016
            L_0x0015:
                r2 = r3
            L_0x0016:
                r2 = r32 | r2
                goto L_0x001b
            L_0x0019:
                r2 = r32
            L_0x001b:
                r4 = r32 & 48
                r5 = 16
                if (r4 != 0) goto L_0x002c
                boolean r4 = r15.d(r1)
                if (r4 == 0) goto L_0x002a
                r4 = 32
                goto L_0x002b
            L_0x002a:
                r4 = r5
            L_0x002b:
                r2 = r2 | r4
            L_0x002c:
                r4 = r2 & 147(0x93, float:2.06E-43)
                r6 = 146(0x92, float:2.05E-43)
                if (r4 != r6) goto L_0x003e
                boolean r4 = r31.l()
                if (r4 != 0) goto L_0x0039
                goto L_0x003e
            L_0x0039:
                r31.L()
                goto L_0x0247
            L_0x003e:
                boolean r4 = U0.C4895p.J()
                if (r4 == 0) goto L_0x004d
                r4 = -1
                java.lang.String r6 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r7 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r7, r2, r4, r6)
            L_0x004d:
                java.util.List r2 = r0.f117629c
                java.lang.Object r1 = r2.get(r1)
                r14 = r1
                XC.a$a$a$d r14 = (XC.C13802a.C2911a.C2912a.d) r14
                r1 = 1089373468(0x40ee851c, float:7.4537487)
                r15.W(r1)
                boolean r1 = r14.e()
                if (r1 == 0) goto L_0x0078
                r1 = 1089370057(0x40ee77c9, float:7.452122)
                r15.W(r1)
                tK.v r1 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r1 = r1.a(r15, r2)
                long r1 = r1.Q()
                r31.P()
                goto L_0x008d
            L_0x0078:
                r1 = 1089459492(0x40efd524, float:7.494768)
                r15.W(r1)
                tK.v r1 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r1 = r1.a(r15, r2)
                long r1 = r1.m0()
                r31.P()
            L_0x008d:
                boolean r4 = r14.e()
                r6 = 1
                if (r4 == 0) goto L_0x009a
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                goto L_0x009f
            L_0x009a:
                float r3 = (float) r6
                float r3 = c2.h.B(r3)
            L_0x009f:
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r7 = 0
                r8 = 0
                androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r4, r7, r6, r8)
                O0.X r7 = O0.X.f10101a
                int r8 = O0.X.f10102b
                O0.C0 r7 = r7.b(r15, r8)
                A0.a r7 = r7.d()
                androidx.compose.ui.d r1 = n0.C5599e.g(r6, r3, r1, r7)
                boolean r2 = r14.a()
                if (r2 == 0) goto L_0x00c0
                r2 = 1065353216(0x3f800000, float:1.0)
                goto L_0x00c2
            L_0x00c0:
                r2 = 1056964608(0x3f000000, float:0.5)
            L_0x00c2:
                androidx.compose.ui.d r6 = m1.C5571a.a(r1, r2)
                boolean r7 = r14.a()
                r1 = -519022603(0xffffffffe11057f5, float:-1.6641682E20)
                r15.W(r1)
                nI.l r1 = r0.f117630d
                boolean r1 = r15.V(r1)
                boolean r2 = r15.V(r14)
                r3 = 0
                r1 = r1 | r2
                java.lang.Object r2 = r31.D()
                if (r1 != 0) goto L_0x00ea
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x00f4
            L_0x00ea:
                WC.y$a r2 = new WC.y$a
                nI.l r1 = r0.f117630d
                r2.<init>(r1, r14)
                r15.u(r2)
            L_0x00f4:
                r10 = r2
                nI.a r10 = (nI.C17631a) r10
                r31.P()
                r11 = 6
                r12 = 0
                r8 = 0
                r9 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.d.d(r6, r7, r8, r9, r10, r11, r12)
                i1.c$a r2 = i1.C5437c.f24302a
                i1.c r6 = r2.o()
                E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r3)
                int r7 = U0.C4883j.a(r15, r3)
                U0.y r8 = r31.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
                G1.g$a r9 = G1.C4504g.f6515W
                nI.a r10 = r9.a()
                U0.f r11 = r31.m()
                if (r11 != 0) goto L_0x0127
                U0.C4883j.c()
            L_0x0127:
                r31.I()
                boolean r11 = r31.i()
                if (r11 == 0) goto L_0x0134
                r15.p(r10)
                goto L_0x0137
            L_0x0134:
                r31.t()
            L_0x0137:
                U0.m r10 = U0.F1.a(r31)
                nI.p r11 = r9.c()
                U0.F1.c(r10, r6, r11)
                nI.p r6 = r9.e()
                U0.F1.c(r10, r8, r6)
                nI.p r6 = r9.b()
                boolean r8 = r10.i()
                if (r8 != 0) goto L_0x0161
                java.lang.Object r8 = r10.D()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
                if (r8 != 0) goto L_0x016f
            L_0x0161:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r10.u(r8)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r10.w(r7, r6)
            L_0x016f:
                nI.p r6 = r9.d()
                U0.F1.c(r10, r1, r6)
                androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
                float r1 = (float) r5
                float r1 = c2.h.B(r1)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r4, r1)
                androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r4 = r4.g()
                i1.c$b r2 = r2.k()
                E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r4, r2, r15, r3)
                int r3 = U0.C4883j.a(r15, r3)
                U0.y r4 = r31.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
                nI.a r5 = r9.a()
                U0.f r6 = r31.m()
                if (r6 != 0) goto L_0x01a8
                U0.C4883j.c()
            L_0x01a8:
                r31.I()
                boolean r6 = r31.i()
                if (r6 == 0) goto L_0x01b5
                r15.p(r5)
                goto L_0x01b8
            L_0x01b5:
                r31.t()
            L_0x01b8:
                U0.m r5 = U0.F1.a(r31)
                nI.p r6 = r9.c()
                U0.F1.c(r5, r2, r6)
                nI.p r2 = r9.e()
                U0.F1.c(r5, r4, r2)
                nI.p r2 = r9.b()
                boolean r4 = r5.i()
                if (r4 != 0) goto L_0x01e2
                java.lang.Object r4 = r5.D()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
                if (r4 != 0) goto L_0x01f0
            L_0x01e2:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r5.u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5.w(r3, r2)
            L_0x01f0:
                nI.p r2 = r9.d()
                U0.F1.c(r5, r1, r2)
                s0.h r1 = s0.C5862h.f28810a
                java.lang.String r1 = r14.d()
                TC.b$b$f r2 = TC.C13679b.C2857b.f.f116688a
                r25 = 0
                r26 = 262140(0x3fffc, float:3.67336E-40)
                r3 = 0
                r4 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r16 = 0
                r27 = r14
                r14 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 48
                r23 = r31
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                java.lang.String r1 = r27.c()
                TC.b$a$b r2 = TC.C13679b.a.C2856b.f116680a
                r14 = 0
                r15 = 0
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r31.x()
                r31.x()
                r31.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0247
                U0.C4895p.R()
            L_0x0247:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: WC.y.d.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13802a.C2911a.C2912a.C2913a f117631a;

        e(C13802a.C2911a.C2912a.C2913a aVar) {
            this.f117631a = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1240171083, i10, -1, "com.ingka.ikea.ui.timeslotpicker.pickerContent.<anonymous>.<anonymous> (TimeSlotPickerScreen.kt:195)");
                }
                y.n(this.f117631a, mVar, C13023e.f110931a);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13802a.C2911a.C2912a f117632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f117633b;

        f(C13802a.C2911a.C2912a aVar, C17642l<? super String, C16807N> lVar) {
            this.f117632a = aVar;
            this.f117633b = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(919559242, i10, -1, "com.ingka.ikea.ui.timeslotpicker.pickerContent.<anonymous> (TimeSlotPickerScreen.kt:201)");
                }
                y.w(C15985a.h(this.f117632a.a()), this.f117633b, mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f117634a = new g();

        /* renamed from: a */
        public final Void invoke(C13802a.C2911a.C2912a.c cVar) {
            C17542s.j(cVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C17642l<C13802a.C2911a.C2912a.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117635a;

        public h(String str) {
            this.f117635a = str;
        }

        /* renamed from: a */
        public final Object invoke(C13802a.C2911a.C2912a.c cVar) {
            C17542s.j(cVar, "item");
            String str = this.f117635a;
            if (str != null) {
                String str2 = str + ":" + cVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(cVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f117636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f117637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17642l lVar, List list) {
            super(1);
            this.f117636c = lVar;
            this.f117637d = list;
        }

        public final Object a(int i10) {
            return this.f117636c.invoke(this.f117637d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f117638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f117639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17642l lVar, List list) {
            super(1);
            this.f117638c = lVar;
            this.f117639d = list;
        }

        public final Object a(int i10) {
            return this.f117638c.invoke(this.f117639d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f117640c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f117641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(List list, C17642l lVar) {
            super(4);
            this.f117640c = list;
            this.f117641d = lVar;
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
                C13802a.C2911a.C2912a.c cVar2 = (C13802a.C2911a.C2912a.c) this.f117640c.get(i10);
                mVar.W(-1730075072);
                y.t(cVar2.i(), cVar2, D.m(TC.e.i(J.h(C5116k1.a(androidx.compose.ui.d.f18749a, "TimeSlotPickerTestTags.SLOTS"), 0.0f, 1, (Object) null)), 0.0f, 0.0f, 0.0f, c2.h.B((float) 8), 7, (Object) null), this.f117641d, mVar, 0, 0);
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
    static final class l implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f117642a;

        l(C13023e eVar) {
            this.f117642a = eVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2111725121, i11, -1, "com.ingka.ikea.ui.timeslotpicker.titleAndDescription.<anonymous> (TimeSlotPickerScreen.kt:163)");
                }
                C13607l.j(this.f117642a.a(mVar, C13023e.f110931a), C13679b.C2857b.a.f116683a, D.m(TC.e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "TimeSlotPickerTestTags.TITLE")), 0.0f, 0.0f, 0.0f, c2.h.B((float) 16), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f117643a;

        m(C13023e eVar) {
            this.f117643a = eVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(819478287, i11, -1, "com.ingka.ikea.ui.timeslotpicker.titleAndDescription.<anonymous>.<anonymous> (TimeSlotPickerScreen.kt:175)");
                }
                C13607l.j(this.f117643a.a(mVar, C13023e.f110931a), C13679b.a.C2856b.f116680a, D.m(TC.e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "TimeSlotPickerTestTags.DESCRIPTION")), 0.0f, 0.0f, 0.0f, c2.h.B((float) 16), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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

    /* access modifiers changed from: private */
    public static final C16807N A(C13802a.C2911a aVar, C17642l lVar, C17642l lVar2, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        if (aVar instanceof C13802a.C2911a.c) {
            C13802a.C2911a.c cVar = (C13802a.C2911a.c) aVar;
            O(xVar, cVar.b(), cVar.a());
            x.i(xVar, (Object) null, (Object) null, C13776a.f117573a.a(), 3, (Object) null);
        } else if (aVar instanceof C13802a.C2911a.C2912a) {
            C13802a.C2911a.C2912a aVar2 = (C13802a.C2911a.C2912a) aVar;
            O(xVar, aVar2.f(), aVar2.e());
            M(xVar, aVar2, lVar, lVar2);
        } else if (!(aVar instanceof C13802a.C2911a.b)) {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C13802a.C2911a aVar, C17642l lVar, C17642l lVar2, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(aVar, lVar, lVar2, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(XC.C13802a r10, androidx.compose.ui.d r11, U0.C4889m r12, int r13, int r14) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = -615134918(0xffffffffdb55c93a, float:-6.0175421E16)
            U0.m r12 = r12.k(r0)
            r1 = r14 & 1
            r8 = 4
            if (r1 == 0) goto L_0x0014
            r1 = r13 | 6
            goto L_0x002d
        L_0x0014:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0021
            boolean r1 = r12.V(r10)
            goto L_0x0025
        L_0x0021:
            boolean r1 = r12.F(r10)
        L_0x0025:
            if (r1 == 0) goto L_0x0029
            r1 = r8
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0035
            r1 = r1 | 48
        L_0x0033:
            r9 = r1
            goto L_0x0046
        L_0x0035:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0033
            boolean r3 = r12.V(r11)
            if (r3 == 0) goto L_0x0042
            r3 = 32
            goto L_0x0044
        L_0x0042:
            r3 = 16
        L_0x0044:
            r1 = r1 | r3
            goto L_0x0033
        L_0x0046:
            r1 = r9 & 19
            r3 = 18
            if (r1 != r3) goto L_0x0058
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r12.L()
            goto L_0x0129
        L_0x0058:
            if (r2 == 0) goto L_0x005c
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
        L_0x005c:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0068
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.ui.timeslotpicker.TimeSlotPickerScreen (TimeSlotPickerScreen.kt:68)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x0068:
            TJ.P r1 = r10.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            XC.a$a r1 = D(r0)
            r0 = -770061630(0xffffffffd219cac2, float:-1.65132927E11)
            r12.W(r0)
            r0 = r9 & 14
            r2 = 0
            r3 = 1
            if (r0 == r8) goto L_0x0093
            r4 = r9 & 8
            if (r4 == 0) goto L_0x0091
            boolean r4 = r12.F(r10)
            if (r4 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r4 = r2
            goto L_0x0094
        L_0x0093:
            r4 = r3
        L_0x0094:
            java.lang.Object r5 = r12.D()
            if (r4 != 0) goto L_0x00a2
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00aa
        L_0x00a2:
            WC.l r5 = new WC.l
            r5.<init>(r10)
            r12.u(r5)
        L_0x00aa:
            r4 = r5
            nI.l r4 = (nI.C17642l) r4
            r12.P()
            r5 = -770064163(0xffffffffd219c0dd, float:-1.65091426E11)
            r12.W(r5)
            if (r0 == r8) goto L_0x00c5
            r5 = r9 & 8
            if (r5 == 0) goto L_0x00c3
            boolean r5 = r12.F(r10)
            if (r5 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r5 = r2
            goto L_0x00c6
        L_0x00c5:
            r5 = r3
        L_0x00c6:
            java.lang.Object r6 = r12.D()
            if (r5 != 0) goto L_0x00d4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00dc
        L_0x00d4:
            WC.p r6 = new WC.p
            r6.<init>(r10)
            r12.u(r6)
        L_0x00dc:
            r5 = r6
            nI.l r5 = (nI.C17642l) r5
            r12.P()
            r6 = -770059007(0xffffffffd219d501, float:-1.65175902E11)
            r12.W(r6)
            if (r0 == r8) goto L_0x00f4
            r0 = r9 & 8
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r12.F(r10)
            if (r0 == 0) goto L_0x00f5
        L_0x00f4:
            r2 = r3
        L_0x00f5:
            java.lang.Object r0 = r12.D()
            if (r2 != 0) goto L_0x0103
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x010b
        L_0x0103:
            WC.q r0 = new WC.q
            r0.<init>(r10)
            r12.u(r0)
        L_0x010b:
            nI.a r0 = (nI.C17631a) r0
            r12.P()
            int r2 = r9 << 9
            r3 = 57344(0xe000, float:8.0356E-41)
            r7 = r2 & r3
            r8 = 0
            r2 = r4
            r3 = r5
            r4 = r0
            r5 = r11
            r6 = r12
            z(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0129
            U0.C4895p.R()
        L_0x0129:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x0137
            WC.r r0 = new WC.r
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WC.y.C(XC.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final C13802a.C2911a D(A1<? extends C13802a.C2911a> a12) {
        return (C13802a.C2911a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C13802a aVar, String str) {
        C17542s.j(str, "it");
        aVar.f(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C13802a aVar, String str) {
        C17542s.j(str, "it");
        aVar.A(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C13802a aVar) {
        aVar.r();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C13802a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        C(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void M(x xVar, C13802a.C2911a.C2912a aVar, C17642l<? super String, C16807N> lVar, C17642l<? super String, C16807N> lVar2) {
        C13802a.C2911a.C2912a.C2913a c10 = aVar.c();
        if (c10 != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(-1240171083, true, new e(c10)), 3, (Object) null);
        }
        x.i(xVar, (Object) null, (Object) null, c1.c.c(919559242, true, new f(aVar, lVar)), 3, (Object) null);
        x.i(xVar, (Object) null, (Object) null, C13776a.f117573a.b(), 3, (Object) null);
        N(xVar, aVar.b(), lVar2);
    }

    private static final void N(x xVar, List<C13802a.C2911a.C2912a.c> list, C17642l<? super String, C16807N> lVar) {
        g gVar = g.f117634a;
        xVar.e(list.size(), new i(new h((String) null), list), new j(gVar, list), c1.c.c(-632812321, true, new k(list, lVar)));
    }

    private static final void O(x xVar, C13023e eVar, C13023e eVar2) {
        x.i(xVar, (Object) null, (Object) null, c1.c.c(-2111725121, true, new l(eVar)), 3, (Object) null);
        if (eVar2 != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(819478287, true, new m(eVar2)), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void n(C13802a.C2911a.C2912a.C2913a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13802a.C2911a.C2912a.C2913a aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(515888429);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar2) : k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(515888429, i11, -1, "com.ingka.ikea.ui.timeslotpicker.BookedSlot (TimeSlotPickerScreen.kt:222)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d k11 = D.k(J.h(TC.e.i(aVar3), 0.0f, 1, (Object) null), 0.0f, c2.h.B((float) 8), 1, (Object) null);
            C5437c.a aVar4 = C5437c.f24302a;
            C5437c.C0386c i13 = aVar4.i();
            C5073d dVar = C5073d.f18068a;
            I b10 = G.b(dVar.f(), i13, k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, k11);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar5.a();
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
            F1.c(a12, b10, aVar5.c());
            F1.c(a12, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar5.d());
            C5843N n10 = C5843N.f28726a;
            androidx.compose.ui.d y10 = J.y(aVar3, c2.h.B((float) 24));
            I h10 = C5077h.h(aVar4.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, y10);
            C17631a<C4504g> a14 = aVar5.a();
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
            F1.c(a15, h10, aVar5.c());
            F1.c(a15, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b12 = aVar5.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar5.d());
            C5079j jVar = C5079j.f18125a;
            V.a(J1.e.c(aVar.b(), k10, 0), (String) null, (androidx.compose.ui.d) null, 0, k10, 48, 12);
            k10.x();
            androidx.compose.ui.d m10 = D.m(C5842M.e(n10, C5116k1.a(aVar3, "TimeSlotPickerTestTags.CURRENT_SLOT"), 1.0f, false, 2, (Object) null), c2.h.B((float) 16), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            I a16 = C5080k.a(dVar.g(), aVar4.k(), k10, 0);
            int a17 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, m10);
            C17631a<C4504g> a18 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a18);
            } else {
                k10.t();
            }
            C4889m a19 = F1.a(k10);
            F1.c(a19, a16, aVar5.c());
            F1.c(a19, s12, aVar5.e());
            p<C4504g, Integer, C16807N> b13 = aVar5.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b13);
            }
            F1.c(a19, e12, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            C13023e a20 = aVar.a();
            int i14 = C13023e.f110931a;
            mVar2 = k10;
            C4889m mVar3 = mVar2;
            C13607l.j(a20.a(k10, i14), C13679b.a.c.f116681a, (androidx.compose.ui.d) null, C18030v.f147664a.a(k10, C18030v.f147665b).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262132);
            C13607l.j(aVar.c().a(mVar2, i14), C13679b.C2857b.f.f116688a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new w(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C13802a.C2911a.C2912a.C2913a aVar, int i10, C4889m mVar, int i11) {
        n(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void p(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(2045843856);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2045843856, i10, -1, "com.ingka.ikea.ui.timeslotpicker.ContentLoading (TimeSlotPickerScreen.kt:389)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d a10 = C5116k1.a(TC.e.i(D.k(aVar, 0.0f, c2.h.B((float) 16), 1, (Object) null)), "TimeSlotPickerTestTags.LOADING");
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a11 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar3.a();
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
            F1.c(a14, a11, aVar3.c());
            F1.c(a14, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            H2.b(J.i(aVar, c2.h.B((float) 32)), false, k10, 6, 2);
            C5844O.a(J.i(aVar, c2.h.B((float) 24)), k10, 6);
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            float f10 = (float) 8;
            I b11 = G.b(dVar.n(c2.h.B(f10)), aVar2.l(), k10, 6);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, h10);
            C17631a<C4504g> a16 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, b11, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b12);
            }
            F1.c(a17, e11, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            k10.W(-1848177524);
            for (int i11 = 0; i11 < 3; i11++) {
                H2.b(m1.e.a(J.t(androidx.compose.ui.d.f18749a, c2.h.B((float) 88)), X.f10101a.b(k10, X.f10102b).d()), false, k10, 0, 2);
            }
            k10.P();
            k10.x();
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            C5844O.a(J.i(aVar4, c2.h.B((float) 56)), k10, 6);
            I a18 = C5080k.a(C5073d.f18068a.n(c2.h.B(f10)), C5437c.f24302a.k(), k10, 6);
            int a19 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, aVar4);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a20 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a20);
            } else {
                k10.t();
            }
            C4889m a21 = F1.a(k10);
            F1.c(a21, a18, aVar5.c());
            F1.c(a21, s12, aVar5.e());
            p<C4504g, Integer, C16807N> b13 = aVar5.b();
            if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                a21.u(Integer.valueOf(a19));
                a21.w(Integer.valueOf(a19), b13);
            }
            F1.c(a21, e12, aVar5.d());
            C5862h hVar2 = C5862h.f28810a;
            k10.W(-1848165330);
            for (int i12 = 0; i12 < 4; i12++) {
                H2.b(m1.e.a(J.i(androidx.compose.ui.d.f18749a, c2.h.B((float) 64)), X.f10101a.b(k10, X.f10102b).d()), false, k10, 0, 2);
            }
            k10.P();
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new x(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(int i10, C4889m mVar, int i11) {
        p(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void r(C13023e eVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13023e eVar2 = eVar;
        int i12 = i10;
        C4889m k10 = mVar.k(995726705);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(eVar2) : k10.F(eVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(995726705, i11, -1, "com.ingka.ikea.ui.timeslotpicker.FullScreenLoading (TimeSlotPickerScreen.kt:366)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i13 = TC.e.i(J.f(C5116k1.a(aVar, "TimeSlotPickerTestTags.FULL_SCREEN_LOADING"), 0.0f, 1, (Object) null));
            C5437c.a aVar2 = C5437c.f24302a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i13);
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
            F1.c(a12, h10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            mVar2 = k10;
            C13607l.j(eVar2.a(k10, (i11 & 14) | C13023e.f110931a), C13679b.a.C2856b.f116680a, jVar.a(aVar, aVar2.e()), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            C13605k1.b(D.m(jVar.a(aVar, aVar2.b()), 0.0f, 0.0f, 0.0f, c2.h.B((float) 32), 7, (Object) null), (C13597i1) null, (C13593h1) null, mVar2, 0, 6);
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
            n10.a(new m(eVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C13023e eVar, int i10, C4889m mVar, int i11) {
        r(eVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(boolean r23, XC.C13802a.C2911a.C2912a.c r24, androidx.compose.ui.d r25, nI.C17642l<? super java.lang.String, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r2 = r24
            r4 = r26
            r5 = r28
            r0 = -1696131723(0xffffffff9ae71575, float:-9.5574026E-23)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r3 = r29 & 1
            r6 = 2
            if (r3 == 0) goto L_0x001a
            r3 = r5 | 6
            r7 = r3
            r3 = r23
            goto L_0x002e
        L_0x001a:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x002b
            r3 = r23
            boolean r7 = r1.b(r3)
            if (r7 == 0) goto L_0x0028
            r7 = 4
            goto L_0x0029
        L_0x0028:
            r7 = r6
        L_0x0029:
            r7 = r7 | r5
            goto L_0x002e
        L_0x002b:
            r3 = r23
            r7 = r5
        L_0x002e:
            r8 = r29 & 2
            r9 = 32
            if (r8 == 0) goto L_0x0037
            r7 = r7 | 48
            goto L_0x0046
        L_0x0037:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0046
            boolean r8 = r1.V(r2)
            if (r8 == 0) goto L_0x0043
            r8 = r9
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r7 = r7 | r8
        L_0x0046:
            r8 = r29 & 4
            if (r8 == 0) goto L_0x004f
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r25
            goto L_0x0061
        L_0x004f:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r25
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r7 = r7 | r11
        L_0x0061:
            r11 = r29 & 8
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x006a
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x006a:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0079
            boolean r11 = r1.F(r4)
            if (r11 == 0) goto L_0x0076
            r11 = r12
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r7 = r7 | r11
        L_0x0079:
            r11 = r7 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r11 != r13) goto L_0x008b
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r1.L()
            goto L_0x0135
        L_0x008b:
            if (r8 == 0) goto L_0x0091
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r15 = r8
            goto L_0x0092
        L_0x0091:
            r15 = r10
        L_0x0092:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x009e
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.ui.timeslotpicker.TimeSlot (TimeSlotPickerScreen.kt:342)"
            U0.C4895p.S(r0, r7, r8, r10)
        L_0x009e:
            java.lang.String r0 = r24.h()
            if (r0 == 0) goto L_0x00af
            SC.l0$b r0 = new SC.l0$b
            java.lang.String r8 = r24.h()
            r10 = 0
            r0.<init>(r8, r10, r6, r10)
            goto L_0x00b1
        L_0x00af:
            SC.l0$a r0 = SC.C13608l0.a.f116343c
        L_0x00b1:
            java.lang.String r6 = "TimeSlotPickerTestTags.SLOTS"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r15, r6)
            SC.e0 r6 = new SC.e0
            java.lang.String r17 = r24.g()
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            SC.k0 r13 = SC.C13604k0.Large
            r10 = -382701535(0xffffffffe9307021, float:-1.3331279E25)
            r1.W(r10)
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            r11 = 0
            r14 = 1
            if (r10 != r12) goto L_0x00dc
            r10 = r14
            goto L_0x00dd
        L_0x00dc:
            r10 = r11
        L_0x00dd:
            r12 = r7 & 112(0x70, float:1.57E-43)
            if (r12 != r9) goto L_0x00e2
            r11 = r14
        L_0x00e2:
            r9 = r10 | r11
            java.lang.Object r10 = r1.D()
            if (r9 != 0) goto L_0x00f2
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x00fa
        L_0x00f2:
            WC.n r10 = new WC.n
            r10.<init>(r4, r2)
            r1.u(r10)
        L_0x00fa:
            r16 = r10
            nI.a r16 = (nI.C17631a) r16
            r1.P()
            r9 = 1572864(0x180000, float:2.204052E-39)
            int r10 = SC.C13580e0.f116196e
            r9 = r9 | r10
            int r10 = SC.C13608l0.f116341b
            int r10 = r10 << 9
            r9 = r9 | r10
            int r7 = r7 << 12
            r10 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r10
            r17 = r9 | r7
            r18 = 420(0x1a4, float:5.89E-43)
            r9 = 0
            r11 = 0
            r14 = 0
            r19 = 0
            r7 = r8
            r8 = r9
            r9 = r0
            r10 = r23
            r12 = r13
            r13 = r14
            r14 = r19
            r0 = r15
            r15 = r16
            r16 = r1
            SC.C13596i0.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0134
            U0.C4895p.R()
        L_0x0134:
            r10 = r0
        L_0x0135:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x014f
            WC.o r8 = new WC.o
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r10
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WC.y.t(boolean, XC.a$a$a$c, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17642l lVar, C13802a.C2911a.C2912a.c cVar) {
        lVar.invoke(cVar.getId());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(boolean z10, C13802a.C2911a.C2912a.c cVar, androidx.compose.ui.d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        t(z10, cVar, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(KJ.C15987c<XC.C13802a.C2911a.C2912a.d> r17, nI.C17642l<? super java.lang.String, XH.C16807N> r18, U0.C4889m r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = -1023028491(0xffffffffc305d2f5, float:-133.82405)
            r4 = r19
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 2
            r6 = 4
            if (r4 != 0) goto L_0x0020
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x001d
            r4 = r6
            goto L_0x001e
        L_0x001d:
            r4 = r5
        L_0x001e:
            r4 = r4 | r2
            goto L_0x0021
        L_0x0020:
            r4 = r2
        L_0x0021:
            r7 = r2 & 48
            r8 = 16
            r9 = 32
            if (r7 != 0) goto L_0x0033
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = r9
            goto L_0x0032
        L_0x0031:
            r7 = r8
        L_0x0032:
            r4 = r4 | r7
        L_0x0033:
            r7 = r4 & 19
            r10 = 18
            if (r7 != r10) goto L_0x0046
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            r15.L()
            r3 = r15
            goto L_0x00cf
        L_0x0046:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0052
            r7 = -1
            java.lang.String r10 = "com.ingka.ikea.ui.timeslotpicker.TimeSlotGroups (TimeSlotPickerScreen.kt:261)"
            U0.C4895p.S(r3, r4, r7, r10)
        L_0x0052:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            r7 = 8
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r3 = r3.n(r7)
            float r7 = TC.e.g()
            r10 = 0
            r11 = 0
            s0.E r7 = androidx.compose.foundation.layout.D.c(r7, r10, r5, r11)
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            java.lang.String r12 = "TimeSlotPickerTestTags.SLOT_GROUPS"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r5, r12)
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r12 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r5, r10, r8, r12, r11)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r5, r10, r12, r11)
            r8 = -1458830272(0xffffffffa90c0440, float:-3.108993E-14)
            r15.W(r8)
            r8 = r4 & 14
            r10 = 0
            if (r8 != r6) goto L_0x008c
            r6 = r12
            goto L_0x008d
        L_0x008c:
            r6 = r10
        L_0x008d:
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r9) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r12 = r10
        L_0x0093:
            r4 = r6 | r12
            java.lang.Object r6 = r15.D()
            if (r4 != 0) goto L_0x00a3
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00ab
        L_0x00a3:
            WC.u r6 = new WC.u
            r6.<init>(r0, r1)
            r15.u(r6)
        L_0x00ab:
            r12 = r6
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r14 = 24582(0x6006, float:3.4447E-41)
            r16 = 234(0xea, float:3.28E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r3
            r13 = r15
            r3 = r15
            r15 = r16
            t0.C5937b.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00cf
            U0.C4895p.R()
        L_0x00cf:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00dd
            WC.v r4 = new WC.v
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WC.y.w(KJ.c, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C15987c cVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        xVar.e(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, new c(b.f117626c, cVar), c1.c.c(-632812321, true, new d(cVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C15987c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        w(cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(XC.C13802a.C2911a r28, nI.C17642l<? super java.lang.String, XH.C16807N> r29, nI.C17642l<? super java.lang.String, XH.C16807N> r30, nI.C17631a<XH.C16807N> r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r0 = r31
            r15 = r34
            r4 = 16
            r5 = 2
            java.lang.String r6 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "onSlotGroupClicked"
            kotlin.jvm.internal.C17542s.j(r2, r6)
            java.lang.String r6 = "onSlotClicked"
            kotlin.jvm.internal.C17542s.j(r3, r6)
            java.lang.String r6 = "onConfirmClicked"
            kotlin.jvm.internal.C17542s.j(r0, r6)
            r6 = -1237685327(0xffffffffb63a6bb1, float:-2.7778844E-6)
            r7 = r33
            U0.m r14 = r7.k(r6)
            r7 = 1
            r8 = r35 & 1
            r9 = 4
            if (r8 == 0) goto L_0x0033
            r8 = r15 | 6
            goto L_0x0043
        L_0x0033:
            r8 = r15 & 6
            if (r8 != 0) goto L_0x0042
            boolean r8 = r14.V(r1)
            if (r8 == 0) goto L_0x003f
            r8 = r9
            goto L_0x0040
        L_0x003f:
            r8 = r5
        L_0x0040:
            r8 = r8 | r15
            goto L_0x0043
        L_0x0042:
            r8 = r15
        L_0x0043:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x004a
            r8 = r8 | 48
            goto L_0x0059
        L_0x004a:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0059
            boolean r5 = r14.F(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 32
            goto L_0x0058
        L_0x0057:
            r5 = r4
        L_0x0058:
            r8 = r8 | r5
        L_0x0059:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x0060
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0070
            boolean r5 = r14.F(r3)
            if (r5 == 0) goto L_0x006d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r8 = r8 | r5
        L_0x0070:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0077
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0087
            boolean r5 = r14.F(r0)
            if (r5 == 0) goto L_0x0084
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r8 = r8 | r5
        L_0x0087:
            r5 = r35 & 16
            if (r5 == 0) goto L_0x0090
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r12 = r32
            goto L_0x00a2
        L_0x0090:
            r12 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x008d
            r12 = r32
            boolean r13 = r14.V(r12)
            if (r13 == 0) goto L_0x009f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r8 = r8 | r13
        L_0x00a2:
            r13 = r8 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r11) goto L_0x00b5
            boolean r11 = r14.l()
            if (r11 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            r14.L()
            r5 = r14
            goto L_0x0267
        L_0x00b5:
            if (r5 == 0) goto L_0x00bb
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x00bc
        L_0x00bb:
            r13 = r12
        L_0x00bc:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00c8
            r5 = -1
            java.lang.String r11 = "com.ingka.ikea.ui.timeslotpicker.TimeSlotPickerContent (TimeSlotPickerScreen.kt:97)"
            U0.C4895p.S(r6, r8, r5, r11)
        L_0x00c8:
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.f(r13, r5, r7, r6)
            float r4 = (float) r4
            float r12 = c2.h.B(r4)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.k(r11, r5, r12, r7, r6)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r12.g()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r5 = r16.k()
            r6 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r12, r5, r14, r6)
            int r12 = U0.C4883j.a(r14, r6)
            U0.y r6 = r14.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r14, r11)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r7 = r17.a()
            U0.f r18 = r14.m()
            if (r18 != 0) goto L_0x0103
            U0.C4883j.c()
        L_0x0103:
            r14.I()
            boolean r18 = r14.i()
            if (r18 == 0) goto L_0x0110
            r14.p(r7)
            goto L_0x0113
        L_0x0110:
            r14.t()
        L_0x0113:
            U0.m r7 = U0.F1.a(r14)
            nI.p r10 = r17.c()
            U0.F1.c(r7, r5, r10)
            nI.p r5 = r17.e()
            U0.F1.c(r7, r6, r5)
            nI.p r5 = r17.b()
            boolean r6 = r7.i()
            if (r6 != 0) goto L_0x013d
            java.lang.Object r6 = r7.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x014b
        L_0x013d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r7.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r7.w(r6, r5)
        L_0x014b:
            nI.p r5 = r17.d()
            U0.F1.c(r7, r11, r5)
            s0.h r19 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r20 = r5
            androidx.compose.ui.d r6 = s0.C5861g.c(r19, r20, r21, r22, r23, r24)
            r7 = -1856907446(0xffffffff9151d74a, float:-1.6553534E-28)
            r14.W(r7)
            r7 = r8 & 14
            if (r7 != r9) goto L_0x0170
            r7 = 1
            goto L_0x0171
        L_0x0170:
            r7 = 0
        L_0x0171:
            r9 = r8 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r9 != r10) goto L_0x0179
            r9 = 1
            goto L_0x017a
        L_0x0179:
            r9 = 0
        L_0x017a:
            r7 = r7 | r9
            r9 = r8 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != r10) goto L_0x0184
            r16 = 1
            goto L_0x0186
        L_0x0184:
            r16 = 0
        L_0x0186:
            r7 = r7 | r16
            java.lang.Object r9 = r14.D()
            if (r7 != 0) goto L_0x0196
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x019e
        L_0x0196:
            WC.s r9 = new WC.s
            r9.<init>(r1, r2, r3)
            r14.u(r9)
        L_0x019e:
            r24 = r9
            nI.l r24 = (nI.C17642l) r24
            r14.P()
            r26 = 0
            r27 = 254(0xfe, float:3.56E-43)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r6
            r25 = r14
            t0.C5937b.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r6 = r1 instanceof XC.C13802a.C2911a.C2912a
            if (r6 == 0) goto L_0x022a
            r6 = -1728543764(0xffffffff98f883ec, float:-6.4239705E-24)
            r14.W(r6)
            r6 = r1
            XC.a$a$a r6 = (XC.C13802a.C2911a.C2912a) r6
            XC.a$a$a$b r6 = r6.d()
            if (r6 != 0) goto L_0x01d6
            r18 = r13
            r32 = r14
            goto L_0x0224
        L_0x01d6:
            java.lang.String r7 = "TimeSlotPickerTestTags.CONFIRM"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r5, r7)
            r7 = 1
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r5, r9, r7, r10)
            androidx.compose.ui.d r16 = TC.e.i(r5)
            float r18 = c2.h.B(r4)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            IC.e r4 = r6.b()
            int r7 = IC.C13023e.f110931a
            java.lang.String r4 = r4.a(r14, r7)
            boolean r9 = r6.a()
            int r6 = r8 << 18
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r16 = r6 & r7
            r17 = 476(0x1dc, float:6.67E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r18 = r13
            r13 = r31
            r32 = r14
            r15 = r16
            r16 = r17
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            XH.N r4 = XH.C16807N.f139792a
        L_0x0224:
            r32.P()
            r5 = r32
            goto L_0x0259
        L_0x022a:
            r18 = r13
            r32 = r14
            boolean r4 = r1 instanceof XC.C13802a.C2911a.b
            if (r4 == 0) goto L_0x024a
            r4 = -1727919579(0xffffffff99020a25, float:-6.722891E-24)
            r5 = r32
            r5.W(r4)
            r4 = r1
            XC.a$a$b r4 = (XC.C13802a.C2911a.b) r4
            IC.e r4 = r4.a()
            int r6 = IC.C13023e.f110931a
            r(r4, r5, r6)
            r5.P()
            goto L_0x0259
        L_0x024a:
            r5 = r32
            boolean r4 = r1 instanceof XC.C13802a.C2911a.c
            if (r4 == 0) goto L_0x0284
            r4 = -1856850565(0xffffffff9152b57b, float:-1.6622002E-28)
            r5.W(r4)
            r5.P()
        L_0x0259:
            r5.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0265
            U0.C4895p.R()
        L_0x0265:
            r12 = r18
        L_0x0267:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x0283
            WC.t r9 = new WC.t
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r12
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0283:
            return
        L_0x0284:
            r0 = -1856876905(0xffffffff91524e97, float:-1.6590296E-28)
            r5.W(r0)
            r5.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: WC.y.z(XC.a$a, nI.l, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
