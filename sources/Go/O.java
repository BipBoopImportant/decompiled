package go;

import IC.C13023e;
import J1.j;
import KJ.C15987c;
import O0.C4762x0;
import O0.e1;
import O0.g1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c1.c;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import lo.k;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import rv.C11849b;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Llo/k;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onShowError", "onClosed", "onSplitProductInfoClicked", "e", "(Llo/k;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "LKJ/c;", "Lgo/s;", "items", "g", "(LKJ/c;LnI/a;LnI/a;LU0/m;I)V", "LIC/e;", "splitDeliveryText", "Landroidx/compose/ui/d;", "modifier", "onClick", "i", "(LIC/e;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class O {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97739a;

        a(C17631a<C16807N> aVar) {
            this.f97739a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1658378035, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.DeliveryInformationScreenImpl.<anonymous> (DeliveryInformationScreen.kt:71)");
                }
                ol.p.c(v.BACK, this.f97739a, (d) null, j.b(C11849b.f102277c0, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C11334s> f97740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97741b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13023e f97742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f97743b;

            a(C13023e eVar, C17631a<C16807N> aVar) {
                this.f97742a = eVar;
                this.f97743b = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-740849505, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.DeliveryInformationScreenImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryInformationScreen.kt:100)");
                    }
                    O.i(this.f97742a, C5116k1.a(androidx.compose.ui.d.f18749a, "DeliveryInformationScreenTestTag_SPLIT_DELIVERY_INFO"), this.f97743b, mVar, C13023e.f110931a | 48, 0);
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

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: go.O$b$b  reason: collision with other inner class name */
        public static final class C2189b extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f97744c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f97745d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2189b(C17642l lVar, List list) {
                super(1);
                this.f97744c = lVar;
                this.f97745d = list;
            }

            public final Object a(int i10) {
                return this.f97744c.invoke(this.f97745d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f97746c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f97747d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C17642l lVar, List list) {
                super(1);
                this.f97746c = lVar;
                this.f97747d = list;
            }

            public final Object a(int i10) {
                return this.f97746c.invoke(this.f97747d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f97748c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a f97749d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(List list, C17631a aVar) {
                super(4);
                this.f97748c = list;
                this.f97749d = aVar;
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
                    C11334s sVar = (C11334s) this.f97748c.get(i10);
                    mVar.W(-45506173);
                    androidx.compose.ui.d k10 = D.k(C5116k1.a(androidx.compose.ui.d.f18749a, "DeliveryInformationScreenTestTag_PRODUCT"), 0.0f, h.B((float) 16), 1, (Object) null);
                    float B10 = h.B((float) 96);
                    C13023e f10 = sVar.f();
                    mVar.W(1245467918);
                    C5264a e10 = f10 == null ? null : c1.c.e(-740849505, true, new a(f10, this.f97749d), mVar, 54);
                    mVar.P();
                    r.c(sVar, k10, B10, e10, mVar, C13023e.f110931a | 432, 0);
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

        b(C15987c<C11334s> cVar, C17631a<C16807N> aVar) {
            this.f97740a = cVar;
            this.f97741b = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C15987c cVar, C17631a aVar, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            xVar.e(cVar.size(), new C2189b(new Q(), cVar), new c(new S(), cVar), c1.c.c(-632812321, true, new d(cVar, aVar)));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final Object h(C11334s sVar) {
            C17542s.j(sVar, "it");
            return Integer.valueOf(sVar.hashCode());
        }

        /* access modifiers changed from: private */
        public static final Object i(C11334s sVar) {
            C17542s.j(sVar, "it");
            return P.b(C11334s.class);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(s0.C5834E r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "paddingValues"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r0 = r15 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r14.V(r13)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r15 = r15 | r0
            L_0x0013:
                r0 = r15 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0024
                boolean r0 = r14.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0024
            L_0x0020:
                r14.L()
                goto L_0x0087
            L_0x0024:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0033
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.checkout.impl.delivery.compose.DeliveryInformationScreenImpl.<anonymous> (DeliveryInformationScreen.kt:78)"
                r2 = 305402248(0x12341188, float:5.6819594E-28)
                U0.C4895p.S(r2, r15, r0, r1)
            L_0x0033:
                androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r13 = androidx.compose.foundation.layout.D.h(r15, r13)
                androidx.compose.ui.d r0 = TC.e.i(r13)
                r13 = -1499255959(0xffffffffa6a32b69, float:-1.1322163E-15)
                r14.W(r13)
                KJ.c<go.s> r13 = r12.f97740a
                boolean r13 = r14.F(r13)
                nI.a<XH.N> r15 = r12.f97741b
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                KJ.c<go.s> r15 = r12.f97740a
                nI.a<XH.N> r1 = r12.f97741b
                java.lang.Object r2 = r14.D()
                if (r13 != 0) goto L_0x0062
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x006a
            L_0x0062:
                go.P r2 = new go.P
                r2.<init>(r15, r1)
                r14.u(r2)
            L_0x006a:
                r8 = r2
                nI.l r8 = (nI.C17642l) r8
                r14.P()
                r10 = 0
                r11 = 254(0xfe, float:3.56E-43)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = r14
                t0.C5937b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0087
                U0.C4895p.R()
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: go.O.b.e(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void e(k kVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(kVar, "viewModel");
        C17542s.j(aVar, "onShowError");
        C17542s.j(aVar2, "onClosed");
        C17542s.j(aVar3, "onSplitProductInfoClicked");
        C4889m k10 = mVar.k(-898698693);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(kVar) : k10.F(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-898698693, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.DeliveryInformationScreen (DeliveryInformationScreen.kt:47)");
            }
            C15987c<C11334s> C10 = kVar.C();
            if (C10 == null) {
                aVar.invoke();
            } else {
                int i12 = i11 >> 3;
                g(C10, aVar2, aVar3, k10, (i12 & 896) | C13023e.f110931a | (i12 & 112));
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new N(kVar, aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(k kVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        e(kVar, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(C15987c<C11334s> cVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<C11334s> cVar2 = cVar;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(cVar2, "items");
        C17542s.j(aVar3, "onClosed");
        C17542s.j(aVar4, "onSplitProductInfoClicked");
        C4889m k10 = mVar.k(-1781660041);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 4 : 2) | i12;
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
                C4895p.S(-1781660041, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.DeliveryInformationScreenImpl (DeliveryInformationScreen.kt:68)");
            }
            mVar2 = k10;
            C4762x0.a((d) null, c.e(1658378035, true, new a(aVar3), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c.e(305402248, true, new b(cVar2, aVar4), k10, 54), mVar2, 805306416, 509);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new K(cVar2, aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        g(cVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(IC.C13023e r27, androidx.compose.ui.d r28, nI.C17631a<XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r0 = r27
            r15 = r31
            r1 = 2
            r2 = 186148489(0xb186689, float:2.9351274E-32)
            r3 = r30
            U0.m r14 = r3.k(r2)
            r3 = 1
            r4 = r32 & 1
            r5 = 4
            if (r4 == 0) goto L_0x0017
            r4 = r15 | 6
            goto L_0x0030
        L_0x0017:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x002f
            r4 = r15 & 8
            if (r4 != 0) goto L_0x0024
            boolean r4 = r14.V(r0)
            goto L_0x0028
        L_0x0024:
            boolean r4 = r14.F(r0)
        L_0x0028:
            if (r4 == 0) goto L_0x002c
            r4 = r5
            goto L_0x002d
        L_0x002c:
            r4 = r1
        L_0x002d:
            r4 = r4 | r15
            goto L_0x0030
        L_0x002f:
            r4 = r15
        L_0x0030:
            r1 = r32 & 2
            r6 = 16
            if (r1 == 0) goto L_0x003b
            r4 = r4 | 48
        L_0x0038:
            r7 = r28
            goto L_0x004c
        L_0x003b:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x0038
            r7 = r28
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x004a
            r8 = 32
            goto L_0x004b
        L_0x004a:
            r8 = r6
        L_0x004b:
            r4 = r4 | r8
        L_0x004c:
            r8 = r32 & 4
            if (r8 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            r13 = r29
            goto L_0x0067
        L_0x0055:
            r8 = r15 & 384(0x180, float:5.38E-43)
            r13 = r29
            if (r8 != 0) goto L_0x0067
            boolean r8 = r14.F(r13)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r8
        L_0x0067:
            r8 = r4 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x007b
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            r14.L()
            r2 = r7
            r1 = r14
            goto L_0x01ae
        L_0x007b:
            if (r1 == 0) goto L_0x0081
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r12 = r1
            goto L_0x0082
        L_0x0081:
            r12 = r7
        L_0x0082:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x008e
            r1 = -1
            java.lang.String r7 = "com.ingka.ikea.checkout.impl.delivery.compose.SplitDeliveryInfo (DeliveryInformationScreen.kt:119)"
            U0.C4895p.S(r2, r4, r1, r7)
        L_0x008e:
            float r1 = (float) r6
            float r1 = c2.h.B(r1)
            r2 = 0
            r6 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r12, r6, r1, r3, r2)
            r2 = -2010720516(0xffffffff8826d6fc, float:-5.020652E-34)
            r14.W(r2)
            java.lang.Object r2 = r14.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r2 != r6) goto L_0x00b3
            go.L r2 = new go.L
            r2.<init>()
            r14.u(r2)
        L_0x00b3:
            nI.l r2 = (nI.C17642l) r2
            r14.P()
            androidx.compose.ui.d r1 = L1.o.c(r1, r3, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            float r3 = (float) r5
            float r3 = c2.h.B(r3)
            androidx.compose.foundation.layout.d$f r2 = r2.n(r3)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.i()
            r5 = 54
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r14, r5)
            r10 = 0
            int r3 = U0.C4883j.a(r14, r10)
            U0.y r5 = r14.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r14, r1)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r14.m()
            if (r8 != 0) goto L_0x00ef
            U0.C4883j.c()
        L_0x00ef:
            r14.I()
            boolean r8 = r14.i()
            if (r8 == 0) goto L_0x00fc
            r14.p(r7)
            goto L_0x00ff
        L_0x00fc:
            r14.t()
        L_0x00ff:
            U0.m r7 = U0.F1.a(r14)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r6.e()
            U0.F1.c(r7, r5, r2)
            nI.p r2 = r6.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x0129
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x0137
        L_0x0129:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r7.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.w(r3, r2)
        L_0x0137:
            nI.p r2 = r6.d()
            U0.F1.c(r7, r1, r2)
            s0.N r1 = s0.C5843N.f28726a
            TC.b$a$c r1 = TC.C13679b.a.c.f116681a
            int r2 = IC.C13023e.f110931a
            r2 = r2 | 48
            r3 = r4 & 14
            r23 = r2 | r3
            r24 = 0
            r25 = 262140(0x3fffc, float:3.67336E-40)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r10 = r16
            r16 = 0
            r26 = r12
            r12 = r16
            r13 = r16
            r28 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r27
            r22 = r28
            SC.C13607l.i(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r20 = 7
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r29
            androidx.compose.ui.d r5 = androidx.compose.foundation.d.d(r15, r16, r17, r18, r19, r20, r21)
            int r0 = uK.C18146a.f147999C9
            r1 = r28
            r2 = 0
            t1.c r3 = J1.e.c(r0, r1, r2)
            r9 = 48
            r10 = 8
            r4 = 0
            r6 = 0
            r8 = r1
            O0.V.a(r3, r4, r5, r6, r8, r9, r10)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ac
            U0.C4895p.R()
        L_0x01ac:
            r2 = r26
        L_0x01ae:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01c5
            go.M r7 = new go.M
            r0 = r7
            r1 = r27
            r3 = r29
            r4 = r31
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go.O.i(IC.e, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(L1.x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C13023e eVar, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        i(eVar, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
