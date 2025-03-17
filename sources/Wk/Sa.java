package wK;

import E1.H;
import E1.I;
import E1.K;
import E1.a0;
import G1.C4504g;
import J1.e;
import L1.i;
import L1.o;
import L1.v;
import L1.x;
import O0.V;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import tI.C17978n;
import tK.C18014e;
import vK.C18205e;
import wK.Ka;

@Metadata(d1 = {"\u0000N\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aW\u0010\u0011\u001a\u00020\n\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u001b\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006!²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00078\nX\u0002²\u0006\f\u0010 \u001a\u00020\u001d8\nX\u0002"}, d2 = {"", "LwK/Ka$a;", "toggleOptions", "Landroidx/compose/ui/d;", "modifier", "", "selectedIndex", "", "fluidState", "Lkotlin/Function1;", "LXH/N;", "onSelect", "t", "(Ljava/util/List;Landroidx/compose/ui/d;IZLnI/l;LU0/m;II)V", "LwK/Ka;", "T", "content", "i", "(Ljava/util/List;ILnI/l;LnI/q;LU0/m;I)V", "optionsSize", "Lkotlin/Function0;", "q", "(Landroidx/compose/ui/d;ZILnI/p;LU0/m;II)V", "LE1/H;", "measurables", "Lc2/b;", "constraints", "w", "(Ljava/util/List;JZ)J", "Lp1/v0;", "contentColor", "hover", "borderColor", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Sa {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<Ka.a> f150161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f150162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f150163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Wa f150164d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.Sa$a$a  reason: collision with other inner class name */
        static final class C4308a implements q<Ka.a, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Wa f150165a;

            C4308a(Wa wa2) {
                this.f150165a = wa2;
            }

            private static final long b(A1<C5747v0> a12) {
                return a12.getValue().y();
            }

            public final void a(Ka.a aVar, C4889m mVar, int i10) {
                C17542s.j(aVar, "item");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(aVar) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1050152652, i10, -1, "net.ikea.skapa.ui.components.Toggle.<anonymous>.<anonymous> (Toggle.kt:148)");
                    }
                    V.a(e.c(aVar.d(), mVar, 0), aVar.c(), (d) null, aVar.a() ? C5747v0.f27350b.i() : b(this.f150165a.b(aVar.a(), mVar, 0)), mVar, 0, 4);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((Ka.a) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        a(List<Ka.a> list, int i10, C17642l<? super Integer, C16807N> lVar, Wa wa2) {
            this.f150161a = list;
            this.f150162b = i10;
            this.f150163c = lVar;
            this.f150164d = wa2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1694874724, i10, -1, "net.ikea.skapa.ui.components.Toggle.<anonymous> (Toggle.kt:143)");
                }
                Sa.i(this.f150161a, this.f150162b, this.f150163c, c1.c.e(-1050152652, true, new C4308a(this.f150164d), mVar, 54), mVar, 3072);
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
    static final class b implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f150166a = new b();

        b() {
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(698624774);
            if (C4895p.J()) {
                C4895p.S(698624774, i10, -1, "net.ikea.skapa.ui.components.ToggleLayout.<anonymous> (Toggle.kt:252)");
            }
            d h10 = J.h(dVar, 0.0f, 1, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f150167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f150168b;

        c(boolean z10, int i10) {
            this.f150167a = z10;
            this.f150168b = i10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(List list, int i10, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            int i11 = 0;
            int i12 = 0;
            for (Object next : list) {
                int i13 = i11 + 1;
                if (i11 < 0) {
                    C16877v.x();
                }
                a0 a0Var = (a0) next;
                a0.a.m(aVar, a0Var, i12 - (i11 * i10), 0, 0.0f, 4, (Object) null);
                i12 += a0Var.E0();
                i11 = i13;
            }
            return C16807N.f139792a;
        }

        public final E1.J i(K k10, List<? extends H> list, long j10) {
            C17542s.j(k10, "$this$Layout");
            C17542s.j(list, "measurables");
            long v10 = Sa.w(list, j10, this.f150167a);
            Iterable<H> iterable = list;
            ArrayList<a0> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
            for (H i02 : iterable) {
                arrayList.add(i02.i0(v10));
            }
            int i10 = 0;
            for (a0 E02 : arrayList) {
                i10 += E02.E0();
            }
            int p10 = i10 - (this.f150168b * C16877v.p(arrayList));
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                int z02 = ((a0) it.next()).z0();
                while (it.hasNext()) {
                    int z03 = ((a0) it.next()).z0();
                    if (z02 < z03) {
                        z02 = z03;
                    }
                }
                return K.v0(k10, C17978n.m(p10, C5267b.n(j10), C5267b.l(j10)), C17978n.m(z02, C5267b.m(j10), C5267b.k(j10)), (Map) null, new Ta(arrayList, this.f150168b), 4, (Object) null);
            }
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(List list, d dVar, int i10, boolean z10, C17642l lVar, int i11, int i12, C4889m mVar, int i13) {
        t(list, dVar, i10, z10, lVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends wK.Ka> void i(java.util.List<? extends T> r30, int r31, nI.C17642l<? super java.lang.Integer, XH.C16807N> r32, nI.q<? super T, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, U0.C4889m r34, int r35) {
        /*
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r0 = 1
            r6 = 2021852066(0x788303a2, float:2.1258268E34)
            r7 = r34
            U0.m r13 = r7.k(r6)
            r14 = 6
            r7 = r5 & 6
            if (r7 != 0) goto L_0x0024
            boolean r7 = r13.F(r1)
            if (r7 == 0) goto L_0x0021
            r7 = 4
            goto L_0x0022
        L_0x0021:
            r7 = 2
        L_0x0022:
            r7 = r7 | r5
            goto L_0x0025
        L_0x0024:
            r7 = r5
        L_0x0025:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0035
            boolean r8 = r13.d(r2)
            if (r8 == 0) goto L_0x0032
            r8 = 32
            goto L_0x0034
        L_0x0032:
            r8 = 16
        L_0x0034:
            r7 = r7 | r8
        L_0x0035:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0045
            boolean r8 = r13.F(r3)
            if (r8 == 0) goto L_0x0042
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0055
            boolean r8 = r13.F(r4)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r7 = r7 | r8
        L_0x0055:
            r11 = r7
            r7 = r11 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0068
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x0063
            goto L_0x0068
        L_0x0063:
            r13.L()
            goto L_0x0297
        L_0x0068:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0074
            r7 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.components.ToggleContent (Toggle.kt:174)"
            U0.C4895p.S(r6, r11, r7, r8)
        L_0x0074:
            wK.Va r6 = wK.Va.f150290a
            wK.Wa r6 = r6.d(r13, r14)
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r16 = r7.iterator()
            r10 = 0
            r9 = r10
        L_0x0083:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x028e
            java.lang.Object r7 = r16.next()
            int r17 = r9 + 1
            if (r9 >= 0) goto L_0x0094
            YH.C16877v.x()
        L_0x0094:
            r8 = r7
            wK.Ka r8 = (wK.Ka) r8
            r0.m r7 = r8.b()
            r12 = 2072856981(0x7b8d4995, float:1.4672126E36)
            r13.W(r12)
            if (r7 != 0) goto L_0x00c1
            r7 = -977674054(0xffffffffc5b9e0ba, float:-5948.091)
            r13.W(r7)
            java.lang.Object r7 = r13.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r7 != r12) goto L_0x00bc
            r0.m r7 = r0.l.a()
            r13.u(r7)
        L_0x00bc:
            r0.m r7 = (r0.m) r7
            r13.P()
        L_0x00c1:
            r12 = r7
            r13.P()
            U0.A1 r27 = r0.C5814f.a(r12, r13, r10)
            U0.A1 r18 = r0.i.a(r12, r13, r10)
            if (r9 != r2) goto L_0x00d2
            r19 = r0
            goto L_0x00d4
        L_0x00d2:
            r19 = r10
        L_0x00d4:
            wK.Ua r7 = j(r1, r9)
            boolean r20 = r8.a()
            boolean r21 = l(r18)
            r22 = 0
            r14 = r7
            r23 = r19
            r7 = r6
            r28 = r8
            r8 = r20
            r15 = r9
            r9 = r23
            r10 = r21
            r29 = r11
            r11 = r13
            r20 = r12
            r12 = r22
            U0.A1 r7 = r7.a(r8, r9, r10, r11, r12)
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r9 = 3
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r8 = zK.C18766k.b(r8, r10, r10, r9, r11)
            r9 = -977659447(0xffffffffc5ba19c9, float:-5955.223)
            r13.W(r9)
            java.lang.Object r9 = r13.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r10 = r12.a()
            if (r9 != r10) goto L_0x011d
            wK.Ma r9 = new wK.Ma
            r9.<init>()
            r13.u(r9)
        L_0x011d:
            nI.l r9 = (nI.C17642l) r9
            r13.P()
            r10 = 0
            androidx.compose.ui.d r8 = L1.o.d(r8, r10, r9, r0, r11)
            tK.e r9 = tK.C18014e.f147445a
            float r9 = r9.b()
            long r0 = m(r7)
            wK.Va r7 = wK.Va.f150290a
            A0.f r10 = r7.a(r14)
            androidx.compose.ui.d r0 = n0.C5599e.g(r8, r9, r0, r10)
            float r1 = r7.c()
            r8 = 30
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.a(r0, r1, r8)
            boolean r1 = l(r18)
            boolean r8 = r28.a()
            androidx.compose.ui.d r0 = zK.C18756a.i(r0, r1, r8)
            java.lang.Object r1 = r27.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r10 = r23
            float r1 = r7.e(r10, r1)
            androidx.compose.ui.d r18 = i1.m.a(r0, r1)
            boolean r22 = r28.a()
            r0 = -977641846(0xffffffffc5ba5e8a, float:-5963.8174)
            r13.W(r0)
            r0 = r29
            r1 = r0 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r1 != r8) goto L_0x017e
            r1 = 1
            goto L_0x017f
        L_0x017e:
            r1 = 0
        L_0x017f:
            boolean r9 = r13.d(r15)
            r1 = r1 | r9
            java.lang.Object r9 = r13.D()
            if (r1 != 0) goto L_0x0190
            java.lang.Object r1 = r12.a()
            if (r9 != r1) goto L_0x0198
        L_0x0190:
            wK.Na r9 = new wK.Na
            r9.<init>(r3, r15)
            r13.u(r9)
        L_0x0198:
            r24 = r9
            nI.a r24 = (nI.C17631a) r24
            r13.P()
            r25 = 16
            r26 = 0
            r21 = 0
            r23 = 0
            r19 = r10
            androidx.compose.ui.d r18 = androidx.compose.foundation.selection.a.b(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r20 = r28.a()
            A0.f r21 = r7.b(r14)
            r26 = 120(0x78, float:1.68E-43)
            r1 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r19 = r27
            r27 = r1
            androidx.compose.ui.d r1 = zK.C18756a.b(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            tK.u r7 = tK.C18029u.f147649a
            float r7 = r7.l()
            r9 = 2
            r10 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r7, r10, r9, r11)
            r7 = -977630610(0xffffffffc5ba8a6e, float:-5969.3037)
            r13.W(r7)
            boolean r7 = r13.d(r15)
            java.lang.Object r10 = r13.D()
            if (r7 != 0) goto L_0x01ea
            java.lang.Object r7 = r12.a()
            if (r10 != r7) goto L_0x01f2
        L_0x01ea:
            wK.Oa r10 = new wK.Oa
            r10.<init>(r15)
            r13.u(r10)
        L_0x01f2:
            nI.l r10 = (nI.C17642l) r10
            r13.P()
            r7 = 0
            r12 = 1
            androidx.compose.ui.d r1 = L1.o.d(r1, r7, r10, r12, r11)
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c r10 = r10.e()
            E1.I r10 = androidx.compose.foundation.layout.C5077h.h(r10, r7)
            int r11 = U0.C4883j.a(r13, r7)
            U0.y r14 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r7 = r15.a()
            U0.f r18 = r13.m()
            if (r18 != 0) goto L_0x0222
            U0.C4883j.c()
        L_0x0222:
            r13.I()
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x022f
            r13.p(r7)
            goto L_0x0232
        L_0x022f:
            r13.t()
        L_0x0232:
            U0.m r7 = U0.F1.a(r13)
            nI.p r8 = r15.c()
            U0.F1.c(r7, r10, r8)
            nI.p r8 = r15.e()
            U0.F1.c(r7, r14, r8)
            nI.p r8 = r15.b()
            boolean r10 = r7.i()
            if (r10 != 0) goto L_0x025c
            java.lang.Object r10 = r7.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x026a
        L_0x025c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r7.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r7.w(r10, r8)
        L_0x026a:
            nI.p r8 = r15.d()
            U0.F1.c(r7, r1, r8)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            r1 = 6
            int r7 = r0 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r28
            r4.invoke(r8, r13, r7)
            r13.x()
            r11 = r0
            r14 = r1
            r0 = r12
            r9 = r17
            r10 = 0
            r1 = r30
            goto L_0x0083
        L_0x028e:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0297
            U0.C4895p.R()
        L_0x0297:
            U0.Y0 r6 = r13.n()
            if (r6 == 0) goto L_0x02b0
            wK.Pa r7 = new wK.Pa
            r0 = r7
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.Sa.i(java.util.List, int, nI.l, nI.q, U0.m, int):void");
    }

    private static final <T extends Ka> Ua j(List<? extends T> list, int i10) {
        return i10 == 0 ? Ua.Start : i10 == C16877v.p(list) ? Ua.End : Ua.Mid;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(int i10, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.b0(xVar, new L1.c(1, 1, i10, 1));
        return C16807N.f139792a;
    }

    private static final boolean l(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long m(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final C16807N n(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17642l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(List list, int i10, C17642l lVar, q qVar, int i11, C4889m mVar, int i12) {
        i(list, i10, lVar, qVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void q(d dVar, boolean z10, int i10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i11, int i12) {
        int i13;
        C4889m k10 = mVar.k(1001519728);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (k10.V(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= k10.b(z10) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= k10.d(i10) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= k10.F(pVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (i14 != 0) {
                z10 = false;
            }
            if (i15 != 0) {
                i10 = 2;
            }
            if (C4895p.J()) {
                C4895p.S(1001519728, i13, -1, "net.ikea.skapa.ui.components.ToggleLayout (Toggle.kt:245)");
            }
            int K02 = ((c2.d) k10.Q(C5100f0.e())).K0(C18014e.f147445a.b());
            k10.W(-656753406);
            boolean z11 = true;
            boolean z12 = (i13 & 896) == 256;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new Qa(i10);
                k10.u(D10);
            }
            k10.P();
            int i16 = i13 & 112;
            d h10 = C18205e.h(o.d(dVar, false, (C17642l) D10, 1, (Object) null), z10, b.f150166a, k10, i16);
            k10.W(-656748706);
            if (i16 != 32) {
                z11 = false;
            }
            boolean d10 = z11 | k10.d(K02);
            Object D11 = k10.D();
            if (d10 || D11 == C4889m.f14007a.a()) {
                D11 = new c(z10, K02);
                k10.u(D11);
            }
            I i17 = (I) D11;
            k10.P();
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, i17, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            pVar.invoke(k10, Integer.valueOf((i13 >> 9) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        boolean z13 = z10;
        int i18 = i10;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Ra(dVar, z13, i18, pVar, i11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(int i10, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.a0(xVar, new L1.b(1, i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(d dVar, boolean z10, int i10, p pVar, int i11, int i12, C4889m mVar, int i13) {
        q(dVar, z10, i10, pVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(java.util.List<wK.Ka.a> r16, androidx.compose.ui.d r17, int r18, boolean r19, nI.C17642l<? super java.lang.Integer, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r16
            r5 = r20
            r6 = r22
            java.lang.String r0 = "toggleOptions"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onSelect"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = -1031568138(0xffffffffc28384f6, float:-65.75969)
            r2 = r21
            U0.m r2 = r2.k(r0)
            r3 = r23 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r6 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r6
            goto L_0x0030
        L_0x002f:
            r3 = r6
        L_0x0030:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
        L_0x0036:
            r7 = r17
            goto L_0x004b
        L_0x0039:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x0036
            r7 = r17
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r3 = r3 | r8
        L_0x004b:
            r8 = r23 & 4
            if (r8 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r9 = r18
            goto L_0x0066
        L_0x0054:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0051
            r9 = r18
            boolean r10 = r2.d(r9)
            if (r10 == 0) goto L_0x0063
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r10
        L_0x0066:
            r10 = r23 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r11 = r19
            goto L_0x0081
        L_0x006f:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006c
            r11 = r19
            boolean r12 = r2.b(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
        L_0x0081:
            r12 = r23 & 16
            if (r12 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0088:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0098
            boolean r12 = r2.F(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r12
        L_0x0098:
            r12 = r3 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00ab
            boolean r12 = r2.l()
            if (r12 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r2.L()
            r4 = r7
            r3 = r9
            goto L_0x00ff
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00b1
        L_0x00b0:
            r4 = r7
        L_0x00b1:
            r7 = 0
            if (r8 == 0) goto L_0x00b6
            r14 = r7
            goto L_0x00b7
        L_0x00b6:
            r14 = r9
        L_0x00b7:
            if (r10 == 0) goto L_0x00bb
            r15 = r7
            goto L_0x00bc
        L_0x00bb:
            r15 = r11
        L_0x00bc:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00c8
            r7 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.components.Toggle (Toggle.kt:135)"
            U0.C4895p.S(r0, r3, r7, r8)
        L_0x00c8:
            wK.Va r0 = wK.Va.f150290a
            r7 = 6
            wK.Wa r0 = r0.d(r2, r7)
            int r9 = r16.size()
            wK.Sa$a r8 = new wK.Sa$a
            r8.<init>(r1, r14, r5, r0)
            r0 = 54
            r10 = 1694874724(0x6505bc64, float:3.947187E22)
            r11 = 1
            c1.a r10 = c1.c.e(r10, r11, r8, r2, r0)
            int r0 = r3 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r3 = r3 >> r7
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = r0 | r3
            r13 = 0
            r7 = r4
            r8 = r15
            r11 = r2
            q(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00fd
            U0.C4895p.R()
        L_0x00fd:
            r3 = r14
            r11 = r15
        L_0x00ff:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x0118
            wK.La r9 = new wK.La
            r0 = r9
            r1 = r16
            r2 = r4
            r4 = r11
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.Sa.t(java.util.List, androidx.compose.ui.d, int, boolean, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final long w(List<? extends H> list, long j10, boolean z10) {
        if (z10) {
            j10 = C5267b.d(j10, C5267b.l(j10) / list.size(), C5267b.l(j10) / list.size(), 0, 0, 12, (Object) null);
        }
        long j11 = j10;
        Iterable<H> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (H V10 : iterable) {
            arrayList.add(Integer.valueOf(V10.V(C5267b.l(j11))));
        }
        Integer num = (Integer) C16877v.P0(arrayList);
        int intValue = num != null ? num.intValue() : C5267b.m(j11);
        Integer num2 = (Integer) C16877v.M0(arrayList);
        int intValue2 = num2 != null ? num2.intValue() : C5267b.k(j11);
        return intValue != intValue2 ? C5267b.d(j11, 0, 0, intValue2, 0, 11, (Object) null) : j11;
    }
}
