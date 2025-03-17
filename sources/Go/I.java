package go;

import G1.C4504g;
import IC.C13023e;
import J1.j;
import KJ.C15987c;
import RC.v;
import SC.H2;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import dI.C17168i;
import go.T;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import lo.o;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import r0.m;
import rv.C11849b;
import s0.C5844O;
import s0.C5862h;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"", "checkoutId", "Llo/o;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onChangeDeliveryMethod", "onClose", "o", "(Ljava/lang/String;Llo/o;LnI/a;LnI/a;LU0/m;I)V", "Lgo/T;", "uiState", "r", "(Lgo/T;LnI/a;LnI/a;LU0/m;I)V", "h", "(Lgo/T;LnI/a;LU0/m;I)V", "t", "(LU0/m;I)V", "Lgo/T$a;", "l", "(Lgo/T$a;LU0/m;I)V", "j", "(LnI/a;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97715a = new a();

        /* renamed from: a */
        public final Void invoke(T.a.C2190a aVar) {
            C17542s.j(aVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l<T.a.C2190a, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97716a;

        public b(String str) {
            this.f97716a = str;
        }

        /* renamed from: a */
        public final Object invoke(T.a.C2190a aVar) {
            C17542s.j(aVar, "item");
            String str = this.f97716a;
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
        final /* synthetic */ C17642l f97717c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f97717c = lVar;
            this.f97718d = list;
        }

        public final Object a(int i10) {
            return this.f97717c.invoke(this.f97718d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f97719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f97720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f97719c = lVar;
            this.f97720d = list;
        }

        public final Object a(int i10) {
            return this.f97719c.invoke(this.f97720d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f97721c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(4);
            this.f97721c = list;
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
                T.a.C2190a aVar = (T.a.C2190a) this.f97721c.get(i10);
                mVar.W(-1272931271);
                androidx.compose.ui.d i13 = TC.e.i(androidx.compose.ui.d.f18749a);
                C13023e g10 = aVar.g();
                int i14 = C13023e.f110931a;
                v.j(g10.a(mVar, i14), (String) null, (String) null, aVar.h().a(mVar, i14), i13, aVar.i(), mVar, 432, 0);
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

    public static final void h(T t10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(t10, "uiState");
        C17542s.j(aVar, "onClose");
        C4889m k10 = mVar.k(-563353385);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(t10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-563353385, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPrices (CompareDeliveryPrices.kt:88)");
            }
            if (C17542s.e(t10, T.b.f97760a)) {
                k10.W(1586296038);
                k10.P();
                aVar.invoke();
            } else if (C17542s.e(t10, T.c.f97761a)) {
                k10.W(1586427137);
                t(k10, 0);
                k10.P();
            } else if (t10 instanceof T.a) {
                k10.W(1586503676);
                l((T.a) t10, k10, C13023e.f110931a);
                k10.P();
            } else {
                k10.W(189716692);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new D(t10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(T t10, C17631a aVar, int i10, C4889m mVar, int i11) {
        h(t10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void j(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-580401606);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-580401606, i13, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesActions (CompareDeliveryPrices.kt:159)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar5, 0.0f, 1, (Object) null);
            E1.I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar6.a();
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
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            float f10 = (float) 16;
            float f11 = f10;
            mVar2 = k10;
            L.b(j.b(C11849b.f102218O, k10, 0), D.m(J.h(aVar5, 0.0f, 1, (Object) null), h.B(f10), h.B((float) 24), h.B(f10), 0.0f, 8, (Object) null), false, N.Secondary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i13 << 27) & 1879048192) | 3072, 500);
            L.b(j.b(Oo.b.f84522U4, mVar2, 0), D.m(J.h(aVar5, 0.0f, 1, (Object) null), h.B(f11), h.B((float) 8), h.B(f11), 0.0f, 8, (Object) null), false, N.Tertiary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar2, mVar2, ((i13 << 24) & 1879048192) | 3072, 500);
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
            n10.a(new C(aVar, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        j(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l(go.T.a r32, U0.C4889m r33, int r34) {
        /*
            r0 = r32
            r1 = r34
            r2 = 857963824(0x33237d30, float:3.8065252E-8)
            r3 = r33
            U0.m r15 = r3.k(r2)
            r3 = r1 & 6
            r4 = 2
            r13 = 4
            if (r3 != 0) goto L_0x0028
            r3 = r1 & 8
            if (r3 != 0) goto L_0x001c
            boolean r3 = r15.V(r0)
            goto L_0x0020
        L_0x001c:
            boolean r3 = r15.F(r0)
        L_0x0020:
            if (r3 == 0) goto L_0x0024
            r3 = r13
            goto L_0x0025
        L_0x0024:
            r3 = r4
        L_0x0025:
            r3 = r3 | r1
            r14 = r3
            goto L_0x0029
        L_0x0028:
            r14 = r1
        L_0x0029:
            r3 = r14 & 3
            if (r3 != r4) goto L_0x0039
            boolean r3 = r15.l()
            if (r3 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            r15.L()
            goto L_0x016c
        L_0x0039:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0045
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesContent (CompareDeliveryPrices.kt:128)"
            U0.C4895p.S(r2, r14, r3, r4)
        L_0x0045:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 0
            r4 = 0
            r12 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r2, r3, r12, r4)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r11 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r11)
            int r5 = U0.C4883j.a(r15, r11)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x007a
            U0.C4883j.c()
        L_0x007a:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x0087
            r15.p(r8)
            goto L_0x008a
        L_0x0087:
            r15.t()
        L_0x008a:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r7.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r7.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00b4
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00c2
        L_0x00b4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x00c2:
            nI.p r4 = r7.d()
            U0.F1.c(r8, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d r4 = TC.e.i(r2)
            r2 = 16
            float r2 = (float) r2
            float r8 = c2.h.B(r2)
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
            int r2 = rv.C11849b.f102175D0
            java.lang.String r3 = J1.j.b(r2, r15, r11)
            TC.b$b$a r4 = TC.C13679b.C2857b.a.f116683a
            r27 = 0
            r28 = 262136(0x3fff8, float:3.67331E-40)
            r6 = 0
            r8 = 0
            r2 = 0
            r29 = r11
            r11 = r2
            r30 = r12
            r12 = r2
            r16 = 0
            r2 = r13
            r31 = r14
            r13 = r16
            r16 = 0
            r33 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 48
            r25 = r33
            SC.C13607l.j(r3, r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = -543824806(0xffffffffdf95e45a, float:-2.1601714E19)
            r15 = r33
            r15.W(r3)
            r3 = r31 & 14
            if (r3 == r2) goto L_0x0133
            r2 = r31 & 8
            if (r2 == 0) goto L_0x0130
            boolean r2 = r15.F(r0)
            if (r2 == 0) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            r12 = r29
            goto L_0x0135
        L_0x0133:
            r12 = r30
        L_0x0135:
            java.lang.Object r2 = r15.D()
            if (r12 != 0) goto L_0x0143
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x014b
        L_0x0143:
            go.F r2 = new go.F
            r2.<init>(r0)
            r15.u(r2)
        L_0x014b:
            r11 = r2
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            r13 = 0
            r14 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = r15
            t0.C5937b.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x016c
            U0.C4895p.R()
        L_0x016c:
            U0.Y0 r2 = r15.n()
            if (r2 == 0) goto L_0x017a
            go.G r3 = new go.G
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go.I.l(go.T$a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(T.a aVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        C15987c<T.a.C2190a> a10 = aVar.a();
        a aVar2 = a.f97715a;
        xVar.e(a10.size(), new c(new b((String) null), a10), new d(aVar2, a10), c1.c.c(-632812321, true, new e(a10)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(T.a aVar, int i10, C4889m mVar, int i11) {
        l(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void o(String str, o oVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "checkoutId");
        C17542s.j(oVar, "viewModel");
        C17542s.j(aVar, "onChangeDeliveryMethod");
        C17542s.j(aVar2, "onClose");
        C4889m k10 = mVar.k(1346905397);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1346905397, i12, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesWithActions (CompareDeliveryPrices.kt:48)");
            }
            r(p(j3.a.b(oVar.j(str), T.c.f97761a, (C5221y) null, (r.b) null, (C17168i) null, k10, 48, 14)), aVar, aVar2, k10, (i12 >> 3) & 1008);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new H(str, oVar, aVar, aVar2, i10));
        }
    }

    private static final T p(A1<? extends T> a12) {
        return (T) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N q(String str, o oVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        o(str, oVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void r(T t10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        T t11 = t10;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(t11, "uiState");
        C17542s.j(aVar3, "onChangeDeliveryMethod");
        C17542s.j(aVar4, "onClose");
        C4889m k10 = mVar.k(-2077346547);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(t11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2077346547, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesWithActionsContent (CompareDeliveryPrices.kt:64)");
            }
            androidx.compose.ui.d m10 = D.m(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), 0.0f, h.B((float) 32), 0.0f, h.B((float) 16), 5, (Object) null);
            E1.I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            int i13 = i11 & 14;
            int i14 = i11 >> 3;
            h(t11, aVar4, k10, i13 | (i14 & 112));
            j(aVar3, aVar4, k10, i14 & 126);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new B(t11, aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(T t10, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        r(t10, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void t(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1987793660);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1987793660, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.Loading (CompareDeliveryPrices.kt:108)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d k11 = D.k(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), 0.0f, h.B((float) 32), 1, (Object) null);
            E1.I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, k11);
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
            float f10 = (float) 24;
            H2.b(J.i(aVar, h.B(f10)), false, k10, 6, 2);
            float f11 = (float) 16;
            C5844O.a(J.i(aVar, h.B(f11)), k10, 6);
            H2.b(J.i(aVar, h.B(f10)), false, k10, 6, 2);
            C5844O.a(J.i(aVar, h.B(f11)), k10, 6);
            H2.b(J.i(aVar, h.B(f10)), false, k10, 6, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new E(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, C4889m mVar, int i11) {
        t(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
