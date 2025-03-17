package tk;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import O0.L0;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.H2;
import SC.Y2;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
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
import pk.s;
import r0.m;
import s0.C5834E;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18013d;
import uK.C18146a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0001\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0003*\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a]\u0010\u001b\u001a\u00020\u0003*\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aK\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lpk/s$n;", "state", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "Lkotlin/Function1;", "Lpk/s$n$e;", "onProductClick", "onFavouriteClick", "onEnergyLabelClick", "onRetryClick", "onSnackbarDismissed", "Landroidx/compose/ui/d;", "modifier", "o", "(Lpk/s$n;LnI/a;LnI/l;LnI/l;LnI/l;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "l", "(Lpk/s$n;LnI/l;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lt0/x;", "z", "(Lt0/x;Lpk/s$n;)V", "w", "(Lt0/x;)V", "j", "(Landroidx/compose/ui/d;LU0/m;II)V", "LKJ/c;", "products", "x", "(Lt0/x;LKJ/c;LnI/l;LnI/l;LnI/l;)V", "product", "onClick", "q", "(Lpk/s$n$e;LnI/a;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "h", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f102921a;

        a(C17631a<C16807N> aVar) {
            this.f102921a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-454791228, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsScreen.<anonymous> (SimilarItemsScreen.kt:99)");
                }
                androidx.compose.ui.d h10 = J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                C5073d.e c10 = C5073d.f18068a.c();
                C17631a<C16807N> aVar = this.f102921a;
                I b10 = G.b(c10, C5437c.f24302a.l(), mVar, 6);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, h10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                int i11 = C18146a.f148097J2;
                int i12 = i11;
                F0.b(i12, J1.j.b(Oo.b.f84665i, mVar, 0), (androidx.compose.ui.d) null, false, H0.Tertiary, (G0) null, (m) null, false, aVar, mVar, 24576, 236);
                mVar.x();
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
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f102922a;

        b(L0 l02) {
            this.f102922a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1643583802, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsScreen.<anonymous> (SimilarItemsScreen.kt:96)");
                }
                Y2.c(this.f102922a, (androidx.compose.ui.d) null, (r<? super O0.H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.n f102923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f102924b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102927e;

        c(s.n nVar, C17631a<C16807N> aVar, C17642l<? super s.n.e, C16807N> lVar, C17642l<? super s.n.e, C16807N> lVar2, C17642l<? super s.n.e, C16807N> lVar3) {
            this.f102923a = nVar;
            this.f102924b = aVar;
            this.f102925c = lVar;
            this.f102926d = lVar2;
            this.f102927e = lVar3;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "paddings");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-807460081, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsScreen.<anonymous> (SimilarItemsScreen.kt:109)");
                }
                if (this.f102923a instanceof s.n.c) {
                    mVar.W(1142317402);
                    o.h(this.f102924b, D.h(C5116k1.a(androidx.compose.ui.d.f18749a, "failure_content"), e10), mVar, 0, 0);
                    mVar.P();
                } else {
                    mVar.W(1142582886);
                    o.l(this.f102923a, this.f102925c, this.f102926d, this.f102927e, D.h(C5116k1.a(androidx.compose.ui.d.f18749a, "products_content"), e10), mVar, 0, 0);
                    mVar.P();
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
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f102928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f102929b;

        d(int i10, int i11) {
            this.f102928a = i10;
            this.f102929b = i11;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-317249188, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.productsLoadingSkeleton.<anonymous>.<anonymous> (SimilarItemsScreen.kt:211)");
                }
                int i11 = this.f102928a;
                int i12 = this.f102929b;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                o.j(C5116k1.a(aVar, "loading_product_item"), mVar, 6, 0);
                mVar.W(-1457565486);
                if (i11 < i12 - 1) {
                    C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                }
                mVar.P();
                mVar.x();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f102930c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f102931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar, List list) {
            super(1);
            this.f102930c = pVar;
            this.f102931d = list;
        }

        public final Object a(int i10) {
            return this.f102930c.invoke(Integer.valueOf(i10), this.f102931d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f102932c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list) {
            super(1);
            this.f102932c = list;
        }

        public final Object a(int i10) {
            this.f102932c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f102933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f102934d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f102935e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f102936f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C15987c f102937g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(List list, C17642l lVar, C17642l lVar2, C17642l lVar3, C15987c cVar) {
            super(4);
            this.f102933c = list;
            this.f102934d = lVar;
            this.f102935e = lVar2;
            this.f102936f = lVar3;
            this.f102937g = cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r9, int r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                r0 = r12 & 6
                if (r0 != 0) goto L_0x000f
                boolean r9 = r11.V(r9)
                if (r9 == 0) goto L_0x000c
                r9 = 4
                goto L_0x000d
            L_0x000c:
                r9 = 2
            L_0x000d:
                r9 = r9 | r12
                goto L_0x0010
            L_0x000f:
                r9 = r12
            L_0x0010:
                r12 = r12 & 48
                if (r12 != 0) goto L_0x0020
                boolean r12 = r11.d(r10)
                if (r12 == 0) goto L_0x001d
                r12 = 32
                goto L_0x001f
            L_0x001d:
                r12 = 16
            L_0x001f:
                r9 = r9 | r12
            L_0x0020:
                r12 = r9 & 147(0x93, float:2.06E-43)
                r0 = 146(0x92, float:2.05E-43)
                if (r12 != r0) goto L_0x0032
                boolean r12 = r11.l()
                if (r12 != 0) goto L_0x002d
                goto L_0x0032
            L_0x002d:
                r11.L()
                goto L_0x0193
            L_0x0032:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0041
                r12 = -1
                java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
                r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                U0.C4895p.S(r1, r9, r12, r0)
            L_0x0041:
                java.util.List r9 = r8.f102933c
                java.lang.Object r9 = r9.get(r10)
                r0 = r9
                pk.s$n$e r0 = (pk.s.n.e) r0
                r9 = -1514079393(0xffffffffa5c0fb5f, float:-3.3477026E-16)
                r11.W(r9)
                androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r12 = r12.g()
                i1.c$a r1 = i1.C5437c.f24302a
                i1.c$b r1 = r1.k()
                r2 = 0
                E1.I r12 = androidx.compose.foundation.layout.C5080k.a(r12, r1, r11, r2)
                int r1 = U0.C4883j.a(r11, r2)
                U0.y r2 = r11.s()
                androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r11, r9)
                G1.g$a r4 = G1.C4504g.f6515W
                nI.a r5 = r4.a()
                U0.f r6 = r11.m()
                if (r6 != 0) goto L_0x007e
                U0.C4883j.c()
            L_0x007e:
                r11.I()
                boolean r6 = r11.i()
                if (r6 == 0) goto L_0x008b
                r11.p(r5)
                goto L_0x008e
            L_0x008b:
                r11.t()
            L_0x008e:
                U0.m r5 = U0.F1.a(r11)
                nI.p r6 = r4.c()
                U0.F1.c(r5, r12, r6)
                nI.p r12 = r4.e()
                U0.F1.c(r5, r2, r12)
                nI.p r12 = r4.b()
                boolean r2 = r5.i()
                if (r2 != 0) goto L_0x00b8
                java.lang.Object r2 = r5.D()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
                if (r2 != 0) goto L_0x00c6
            L_0x00b8:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r5.u(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.w(r1, r12)
            L_0x00c6:
                nI.p r12 = r4.d()
                U0.F1.c(r5, r3, r12)
                s0.h r12 = s0.C5862h.f28810a
                java.lang.String r12 = "similar_product_item"
                androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r9, r12)
                r9 = -23165451(0xfffffffffe9e85f5, float:-1.0535678E38)
                r11.W(r9)
                nI.l r9 = r8.f102934d
                boolean r9 = r11.V(r9)
                boolean r12 = r11.V(r0)
                r9 = r9 | r12
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x00f4
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x00fe
            L_0x00f4:
                tk.o$h r12 = new tk.o$h
                nI.l r9 = r8.f102934d
                r12.<init>(r9, r0)
                r11.u(r12)
            L_0x00fe:
                r1 = r12
                nI.a r1 = (nI.C17631a) r1
                r11.P()
                r9 = -23169513(0xfffffffffe9e7617, float:-1.0531559E38)
                r11.W(r9)
                nI.l r9 = r8.f102935e
                boolean r9 = r11.V(r9)
                boolean r12 = r11.V(r0)
                r9 = r9 | r12
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x0123
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x012d
            L_0x0123:
                tk.o$i r12 = new tk.o$i
                nI.l r9 = r8.f102935e
                r12.<init>(r9, r0)
                r11.u(r12)
            L_0x012d:
                r2 = r12
                nI.a r2 = (nI.C17631a) r2
                r11.P()
                r9 = -23167335(0xfffffffffe9e7e99, float:-1.0533768E38)
                r11.W(r9)
                nI.l r9 = r8.f102936f
                boolean r9 = r11.V(r9)
                boolean r12 = r11.V(r0)
                r9 = r9 | r12
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x0152
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x015c
            L_0x0152:
                tk.o$j r12 = new tk.o$j
                nI.l r9 = r8.f102936f
                r12.<init>(r9, r0)
                r11.u(r12)
            L_0x015c:
                r3 = r12
                nI.a r3 = (nI.C17631a) r3
                r11.P()
                r6 = 24576(0x6000, float:3.4438E-41)
                r7 = 0
                r5 = r11
                tk.o.q(r0, r1, r2, r3, r4, r5, r6, r7)
                r9 = -23159032(0xfffffffffe9e9f08, float:-1.0542188E38)
                r11.W(r9)
                KJ.c r9 = r8.f102937g
                int r9 = YH.C16877v.p(r9)
                if (r10 >= r9) goto L_0x0181
                r5 = 0
                r6 = 7
                r0 = 0
                r1 = 0
                r2 = 0
                r4 = r11
                SC.C13643u0.c(r0, r1, r2, r4, r5, r6)
            L_0x0181:
                r11.P()
                r11.x()
                r11.P()
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0193
                U0.C4895p.R()
            L_0x0193:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tk.o.g.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.n.e f102939b;

        h(C17642l<? super s.n.e, C16807N> lVar, s.n.e eVar) {
            this.f102938a = lVar;
            this.f102939b = eVar;
        }

        public final void a() {
            this.f102938a.invoke(this.f102939b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.n.e f102941b;

        i(C17642l<? super s.n.e, C16807N> lVar, s.n.e eVar) {
            this.f102940a = lVar;
            this.f102941b = eVar;
        }

        public final void a() {
            this.f102940a.invoke(this.f102941b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<s.n.e, C16807N> f102942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.n.e f102943b;

        j(C17642l<? super s.n.e, C16807N> lVar, s.n.e eVar) {
            this.f102942a = lVar;
            this.f102943b = eVar;
        }

        public final void a() {
            this.f102942a.invoke(this.f102943b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.n f102944a;

        k(s.n nVar) {
            this.f102944a = nVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            d.a aVar;
            float f10;
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1264341588, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.title.<anonymous> (SimilarItemsScreen.kt:172)");
                }
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d k10 = D.k(aVar2, TC.e.g(), 0.0f, 2, (Object) null);
                s.n nVar = this.f102944a;
                C5073d dVar = C5073d.f18068a;
                C5073d.m g10 = dVar.g();
                C5437c.a aVar3 = C5437c.f24302a;
                I a10 = C5080k.a(g10, aVar3.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, k10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                float f11 = (float) 8;
                C5844O.a(J.i(aVar2, c2.h.B(f11)), mVar2, 6);
                if (nVar instanceof s.n.d) {
                    mVar2.W(-1580451940);
                    H2.b(m1.e.a(J.v(aVar2, c2.h.B((float) 230), c2.h.B((float) 24)), C18013d.f147437a.e()), false, mVar2, 0, 2);
                    mVar.P();
                    f10 = f11;
                    aVar = aVar2;
                } else {
                    mVar2.W(-1580216092);
                    I a14 = C5080k.a(dVar.g(), aVar3.k(), mVar2, 0);
                    int a15 = C4883j.a(mVar2, 0);
                    C4912y s11 = mVar.s();
                    androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, aVar2);
                    C17631a<C4504g> a16 = aVar4.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a16);
                    } else {
                        mVar.t();
                    }
                    C4889m a17 = F1.a(mVar);
                    F1.c(a17, a14, aVar4.c());
                    F1.c(a17, s11, aVar4.e());
                    p<C4504g, Integer, C16807N> b11 = aVar4.b();
                    if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                        a17.u(Integer.valueOf(a15));
                        a17.w(Integer.valueOf(a15), b11);
                    }
                    F1.c(a17, e11, aVar4.d());
                    f10 = f11;
                    aVar = aVar2;
                    C13607l.j(J1.j.b(ik.c.f98322N, mVar2, 0), C13679b.C2857b.a.f116683a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
                    C4889m mVar3 = mVar;
                    mVar3.W(415771717);
                    s.n nVar2 = nVar;
                    if (nVar2 instanceof s.n.b) {
                        int size = ((s.n.b) nVar2).d().size();
                        C13607l.j(J1.j.a(ik.b.f98307a, size, new Object[]{Integer.valueOf(size)}, mVar3, 0), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
                    }
                    mVar.P();
                    mVar.x();
                    mVar.P();
                }
                C5844O.a(J.i(aVar, c2.h.B(f10)), mVar, 6);
                mVar.x();
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
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(nI.C17631a<XH.C16807N> r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r13 = r44
            r14 = r47
            r15 = r48
            r0 = 48
            r1 = 6
            r2 = 1627991205(0x61092ca5, float:1.581513E20)
            r3 = r46
            U0.m r12 = r3.k(r2)
            r3 = 1
            r4 = r15 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001b
            r4 = r14 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r14 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r12.F(r13)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            r4 = r4 | r14
            goto L_0x002b
        L_0x002a:
            r4 = r14
        L_0x002b:
            r6 = r15 & 2
            if (r6 == 0) goto L_0x0034
            r4 = r4 | r0
        L_0x0030:
            r8 = r45
        L_0x0032:
            r11 = r4
            goto L_0x0047
        L_0x0034:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0030
            r8 = r45
            boolean r9 = r12.V(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r4 = r4 | r9
            goto L_0x0032
        L_0x0047:
            r4 = r11 & 19
            r9 = 18
            if (r4 != r9) goto L_0x005b
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r12.L()
            r16 = r12
            goto L_0x0266
        L_0x005b:
            if (r6 == 0) goto L_0x0061
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r10 = r4
            goto L_0x0062
        L_0x0061:
            r10 = r8
        L_0x0062:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x006e
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.FailedContent (SimilarItemsScreen.kt:346)"
            U0.C4895p.S(r2, r11, r4, r6)
        L_0x006e:
            r2 = 0
            r4 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.f(r10, r2, r3, r4)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r8 = r6.o()
            r9 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r9)
            int r16 = U0.C4883j.a(r12, r9)
            U0.y r1 = r12.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r12, r3)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r7 = r17.a()
            U0.f r18 = r12.m()
            if (r18 != 0) goto L_0x009a
            U0.C4883j.c()
        L_0x009a:
            r12.I()
            boolean r18 = r12.i()
            if (r18 == 0) goto L_0x00a7
            r12.p(r7)
            goto L_0x00aa
        L_0x00a7:
            r12.t()
        L_0x00aa:
            U0.m r7 = U0.F1.a(r12)
            nI.p r9 = r17.c()
            U0.F1.c(r7, r8, r9)
            nI.p r8 = r17.e()
            U0.F1.c(r7, r1, r8)
            nI.p r1 = r17.b()
            boolean r8 = r7.i()
            if (r8 != 0) goto L_0x00d4
            java.lang.Object r8 = r7.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 != 0) goto L_0x00e2
        L_0x00d4:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r7.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r7.w(r8, r1)
        L_0x00e2:
            nI.p r1 = r17.d()
            U0.F1.c(r7, r3, r1)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c r3 = r6.e()
            androidx.compose.ui.d r1 = r1.a(r9, r3)
            r3 = 40
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r3, r2, r5, r4)
            i1.c$b r2 = r6.g()
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r3, r2, r12, r0)
            r2 = 0
            int r3 = U0.C4883j.a(r12, r2)
            U0.y r2 = r12.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r1)
            nI.a r4 = r17.a()
            U0.f r5 = r12.m()
            if (r5 != 0) goto L_0x0128
            U0.C4883j.c()
        L_0x0128:
            r12.I()
            boolean r5 = r12.i()
            if (r5 == 0) goto L_0x0135
            r12.p(r4)
            goto L_0x0138
        L_0x0135:
            r12.t()
        L_0x0138:
            U0.m r4 = U0.F1.a(r12)
            nI.p r5 = r17.c()
            U0.F1.c(r4, r0, r5)
            nI.p r0 = r17.e()
            U0.F1.c(r4, r2, r0)
            nI.p r0 = r17.b()
            boolean r2 = r4.i()
            if (r2 != 0) goto L_0x0162
            java.lang.Object r2 = r4.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r2 != 0) goto L_0x0170
        L_0x0162:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4.w(r2, r0)
        L_0x0170:
            nI.p r0 = r17.d()
            U0.F1.c(r4, r1, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = uK.C18146a.f148569o
            r1 = 0
            t1.c r3 = J1.e.c(r0, r12, r1)
            E1.k$a r0 = E1.C4478k.f5915a
            E1.n r7 = r0.g()
            p1.w0$a r16 = p1.C5749w0.f27365b
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r4 = r0.a(r12, r2)
            long r17 = r4.G0()
            r20 = 2
            r21 = 0
            r19 = 0
            p1.w0 r16 = p1.C5749w0.a.b(r16, r17, r19, r20, r21)
            r4 = 32
            float r8 = (float) r4
            float r4 = c2.h.B(r8)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r9, r4)
            tK.h r0 = r0.a(r12, r2)
            long r5 = r0.m0()
            A0.f r0 = A0.g.h()
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.c(r4, r5, r0)
            r0 = 24624(0x6030, float:3.4506E-41)
            r2 = 40
            r4 = 0
            r6 = 0
            r17 = 0
            r18 = r8
            r8 = r17
            r1 = r9
            r9 = r16
            r42 = r10
            r10 = r12
            r43 = r11
            r11 = r0
            r0 = r12
            r12 = r2
            n0.C5583F.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            float r2 = c2.h.B(r18)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r1, r2)
            r3 = 6
            s0.C5844O.a(r2, r0, r3)
            int r2 = Oo.b.f84853z3
            r3 = 0
            java.lang.String r16 = J1.j.b(r2, r0, r3)
            TC.b$a$a r17 = TC.C13679b.a.C2855a.f116679a
            Y1.j$a r2 = Y1.j.f14783b
            int r2 = r2.a()
            Y1.j r29 = Y1.j.h(r2)
            r40 = 0
            r41 = 261116(0x3fbfc, float:3.65901E-40)
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r0
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r1, r2)
            r2 = 6
            s0.C5844O.a(r1, r0, r2)
            int r1 = Oo.b.f84750p7
            r2 = 0
            java.lang.String r1 = J1.j.b(r1, r0, r2)
            SC.N r3 = SC.N.Secondary
            SC.M r4 = SC.M.Medium
            int r2 = r43 << 27
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r5
            r11 = r2 | 27648(0x6c00, float:3.8743E-41)
            r12 = 486(0x1e6, float:6.81E-43)
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = r0
            r0 = r1
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r44
            r10 = r16
            SC.L.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r16.x()
            r16.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0264
            U0.C4895p.R()
        L_0x0264:
            r8 = r42
        L_0x0266:
            U0.Y0 r0 = r16.n()
            if (r0 == 0) goto L_0x0274
            tk.i r1 = new tk.i
            r1.<init>(r13, r8, r14, r15)
            r0.a(r1)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.o.h(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1516756851);
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
            dVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1516756851, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.ProductLoadingSkeleton (SimilarItemsScreen.kt:226)");
            }
            float f10 = (float) 24;
            androidx.compose.ui.d l10 = D.l(dVar3, TC.e.g(), c2.h.B(f10), TC.e.g(), c2.h.B((float) 32));
            C5073d dVar4 = C5073d.f18068a;
            C5073d.e f11 = dVar4.f();
            C5437c.a aVar = C5437c.f24302a;
            I b10 = G.b(f11, aVar.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, l10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            H2.b(J.t(aVar3, c2.h.B((float) 160)), false, k10, 6, 2);
            C5844O.a(J.y(aVar3, c2.h.B((float) 16)), k10, 6);
            I a13 = C5080k.a(dVar4.g(), aVar.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, aVar3);
            C17631a<C4504g> a15 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, a13, aVar2.c());
            F1.c(a16, s11, aVar2.e());
            p<C4504g, Integer, C16807N> b12 = aVar2.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            H2.b(J.i(J.h(aVar3, 0.0f, 1, (Object) null), c2.h.B(f10)), false, k10, 6, 2);
            float f12 = (float) 8;
            C5844O.a(J.i(aVar3, c2.h.B(f12)), k10, 6);
            H2.b(J.i(J.g(aVar3, 0.8f), c2.h.B(f10)), false, k10, 6, 2);
            C5844O.a(J.i(aVar3, c2.h.B(f12)), k10, 6);
            H2.b(J.i(J.h(aVar3, 0.0f, 1, (Object) null), c2.h.B(f10)), false, k10, 6, 2);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new m(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(pk.s.n r26, nI.C17642l<? super pk.s.n.e, XH.C16807N> r27, nI.C17642l<? super pk.s.n.e, XH.C16807N> r28, nI.C17642l<? super pk.s.n.e, XH.C16807N> r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r6 = r32
            r0 = 645683172(0x267c57e4, float:8.7549177E-16)
            r5 = r31
            U0.m r5 = r5.k(r0)
            r7 = r33 & 1
            r8 = 4
            if (r7 == 0) goto L_0x001b
            r7 = r6 | 6
            goto L_0x0034
        L_0x001b:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0033
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0028
            boolean r7 = r5.V(r1)
            goto L_0x002c
        L_0x0028:
            boolean r7 = r5.F(r1)
        L_0x002c:
            if (r7 == 0) goto L_0x0030
            r7 = r8
            goto L_0x0031
        L_0x0030:
            r7 = 2
        L_0x0031:
            r7 = r7 | r6
            goto L_0x0034
        L_0x0033:
            r7 = r6
        L_0x0034:
            r9 = r33 & 2
            r10 = 32
            r11 = 16
            if (r9 == 0) goto L_0x003f
            r7 = r7 | 48
            goto L_0x004d
        L_0x003f:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x004d
            boolean r9 = r5.F(r2)
            if (r9 == 0) goto L_0x004b
            r9 = r10
            goto L_0x004c
        L_0x004b:
            r9 = r11
        L_0x004c:
            r7 = r7 | r9
        L_0x004d:
            r9 = r33 & 4
            r12 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0056
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0056:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0065
            boolean r9 = r5.F(r3)
            if (r9 == 0) goto L_0x0062
            r9 = r12
            goto L_0x0064
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r7 = r7 | r9
        L_0x0065:
            r9 = r33 & 8
            if (r9 == 0) goto L_0x006c
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007c
            boolean r9 = r5.F(r4)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r7 = r7 | r9
        L_0x007c:
            r9 = r33 & 16
            if (r9 == 0) goto L_0x0085
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r30
            goto L_0x0097
        L_0x0085:
            r14 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r30
            boolean r15 = r5.V(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r7 = r7 | r15
        L_0x0097:
            r15 = r7 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r15 != r13) goto L_0x00a9
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r5.L()
            goto L_0x0161
        L_0x00a9:
            if (r9 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r19 = r9
            goto L_0x00b2
        L_0x00b0:
            r19 = r14
        L_0x00b2:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00be
            r9 = -1
            java.lang.String r13 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.ProductsContent (SimilarItemsScreen.kt:143)"
            U0.C4895p.S(r0, r7, r9, r13)
        L_0x00be:
            s0.T$a r0 = s0.C5848T.f28733a
            r9 = 6
            s0.T r0 = s0.a0.c(r0, r5, r9)
            s0.Y$a r9 = s0.C5853Y.f28774a
            int r9 = r9.e()
            s0.T r0 = s0.C5850V.i(r0, r9)
            r9 = 0
            s0.E r0 = s0.C5850V.f(r0, r5, r9)
            float r0 = r0.a()
            r13 = 8
            float r13 = (float) r13
            float r21 = c2.h.B(r13)
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            float r11 = r11 + r0
            float r23 = c2.h.B(r11)
            r24 = 5
            r25 = 0
            r20 = 0
            r22 = 0
            s0.E r0 = androidx.compose.foundation.layout.D.e(r20, r21, r22, r23, r24, r25)
            r11 = 1885489242(0x7062485a, float:2.8012432E29)
            r5.W(r11)
            r11 = r7 & 14
            r13 = 1
            if (r11 == r8) goto L_0x010d
            r8 = r7 & 8
            if (r8 == 0) goto L_0x010b
            boolean r8 = r5.F(r1)
            if (r8 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r8 = r9
            goto L_0x010e
        L_0x010d:
            r8 = r13
        L_0x010e:
            r11 = r7 & 112(0x70, float:1.57E-43)
            if (r11 != r10) goto L_0x0114
            r10 = r13
            goto L_0x0115
        L_0x0114:
            r10 = r9
        L_0x0115:
            r8 = r8 | r10
            r10 = r7 & 896(0x380, float:1.256E-42)
            if (r10 != r12) goto L_0x011c
            r10 = r13
            goto L_0x011d
        L_0x011c:
            r10 = r9
        L_0x011d:
            r8 = r8 | r10
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 != r11) goto L_0x0125
            r9 = r13
        L_0x0125:
            r8 = r8 | r9
            java.lang.Object r9 = r5.D()
            if (r8 != 0) goto L_0x0134
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x013c
        L_0x0134:
            tk.j r9 = new tk.j
            r9.<init>(r1, r2, r3, r4)
            r5.u(r9)
        L_0x013c:
            r15 = r9
            nI.l r15 = (nI.C17642l) r15
            r5.P()
            int r7 = r7 >> 12
            r17 = r7 & 14
            r18 = 250(0xfa, float:3.5E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r19
            r9 = r0
            r16 = r5
            t0.C5937b.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x015f
            U0.C4895p.R()
        L_0x015f:
            r14 = r19
        L_0x0161:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x017d
            tk.k r9 = new tk.k
            r0 = r9
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r14
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.o.l(pk.s$n, nI.l, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(s.n nVar, C17642l lVar, C17642l lVar2, C17642l lVar3, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        z(xVar, nVar);
        if (nVar instanceof s.n.d) {
            w(xVar);
        }
        if (nVar instanceof s.n.b) {
            x(xVar, ((s.n.b) nVar).d(), lVar, lVar2, lVar3);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(s.n nVar, C17642l lVar, C17642l lVar2, C17642l lVar3, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(nVar, lVar, lVar2, lVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(pk.s.n r34, nI.C17631a<XH.C16807N> r35, nI.C17642l<? super pk.s.n.e, XH.C16807N> r36, nI.C17642l<? super pk.s.n.e, XH.C16807N> r37, nI.C17642l<? super pk.s.n.e, XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, nI.C17631a<XH.C16807N> r40, androidx.compose.ui.d r41, U0.C4889m r42, int r43, int r44) {
        /*
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r40
            r13 = r43
            r14 = r44
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "onCloseClick"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onProductClick"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onFavouriteClick"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onEnergyLabelClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onRetryClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onSnackbarDismissed"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 164119808(0x9c84500, float:4.8213136E-33)
            r1 = r42
            U0.m r15 = r1.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0045
            r1 = r13 | 6
            goto L_0x005e
        L_0x0045:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x005d
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0052
            boolean r1 = r15.V(r6)
            goto L_0x0056
        L_0x0052:
            boolean r1 = r15.F(r6)
        L_0x0056:
            if (r1 == 0) goto L_0x005a
            r1 = 4
            goto L_0x005b
        L_0x005a:
            r1 = 2
        L_0x005b:
            r1 = r1 | r13
            goto L_0x005e
        L_0x005d:
            r1 = r13
        L_0x005e:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0065
            r1 = r1 | 48
            goto L_0x0075
        L_0x0065:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0075
            boolean r2 = r15.F(r7)
            if (r2 == 0) goto L_0x0072
            r2 = 32
            goto L_0x0074
        L_0x0072:
            r2 = 16
        L_0x0074:
            r1 = r1 | r2
        L_0x0075:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x007c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x008c
        L_0x007c:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x008c
            boolean r2 = r15.F(r8)
            if (r2 == 0) goto L_0x0089
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x008b
        L_0x0089:
            r2 = 128(0x80, float:1.794E-43)
        L_0x008b:
            r1 = r1 | r2
        L_0x008c:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x0093
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a3
        L_0x0093:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00a3
            boolean r2 = r15.F(r9)
            if (r2 == 0) goto L_0x00a0
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x00a2
        L_0x00a0:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x00a2:
            r1 = r1 | r2
        L_0x00a3:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x00aa
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ba
        L_0x00aa:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00ba
            boolean r2 = r15.F(r10)
            if (r2 == 0) goto L_0x00b7
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b9
        L_0x00b7:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00b9:
            r1 = r1 | r2
        L_0x00ba:
            r2 = r14 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00c2
            r1 = r1 | r3
            goto L_0x00d2
        L_0x00c2:
            r2 = r13 & r3
            if (r2 != 0) goto L_0x00d2
            boolean r2 = r15.F(r11)
            if (r2 == 0) goto L_0x00cf
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r2
        L_0x00d2:
            r2 = r14 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00da
            r1 = r1 | r3
            goto L_0x00ea
        L_0x00da:
            r2 = r13 & r3
            if (r2 != 0) goto L_0x00ea
            boolean r2 = r15.F(r12)
            if (r2 == 0) goto L_0x00e7
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r1 = r1 | r2
        L_0x00ea:
            r2 = r14 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00f5
            r1 = r1 | r3
        L_0x00f1:
            r3 = r41
        L_0x00f3:
            r5 = r1
            goto L_0x0107
        L_0x00f5:
            r3 = r3 & r13
            if (r3 != 0) goto L_0x00f1
            r3 = r41
            boolean r4 = r15.V(r3)
            if (r4 == 0) goto L_0x0103
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r1 = r1 | r4
            goto L_0x00f3
        L_0x0107:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r5
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r4) goto L_0x011e
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            r15.L()
            r8 = r3
            r1 = r15
            goto L_0x01ea
        L_0x011e:
            if (r2 == 0) goto L_0x0124
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r4 = r1
            goto L_0x0125
        L_0x0124:
            r4 = r3
        L_0x0125:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0131
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarItemsScreen (SimilarItemsScreen.kt:89)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x0131:
            r0 = 1509035304(0x59f20d28, float:8.5164262E15)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x014b
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r15.u(r0)
        L_0x014b:
            r3 = r0
            O0.L0 r3 = (O0.L0) r3
            r15.P()
            r0 = 0
            r2 = 1
            r1 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r4, r0, r2, r1)
            r0 = 0
            float r0 = (float) r0
            float r17 = c2.h.B(r0)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            s0.T r25 = s0.C5850V.c(r17, r18, r19, r20, r21, r22)
            tk.o$a r0 = new tk.o$a
            r0.<init>(r7)
            r1 = -454791228(0xffffffffe4e46fc4, float:-3.371129E22)
            r7 = 54
            c1.a r17 = c1.c.e(r1, r2, r0, r15, r7)
            tk.o$b r0 = new tk.o$b
            r0.<init>(r3)
            r1 = -1643583802(0xffffffff9e08e6c6, float:-7.247503E-21)
            c1.a r18 = c1.c.e(r1, r2, r0, r15, r7)
            tk.o$c r1 = new tk.o$c
            r0 = r1
            r8 = r1
            r30 = 0
            r1 = r34
            r9 = r2
            r2 = r39
            r31 = r3
            r3 = r36
            r32 = r4
            r4 = r37
            r33 = r5
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -807460081(0xffffffffcfdf230f, float:-7.4872335E9)
            c1.a r26 = c1.c.e(r0, r9, r8, r15, r7)
            r28 = 805309488(0x30000c30, float:4.658345E-10)
            r29 = 244(0xf4, float:3.42E-43)
            r0 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r1 = r15
            r15 = r16
            r16 = r17
            r17 = r0
            r27 = r1
            O0.C4762x0.a(r15, r16, r17, r18, r19, r20, r21, r23, r25, r26, r27, r28, r29)
            boolean r0 = r6 instanceof pk.s.n.b
            if (r0 == 0) goto L_0x01c9
            r0 = r6
            pk.s$n$b r0 = (pk.s.n.b) r0
            goto L_0x01cb
        L_0x01c9:
            r0 = r30
        L_0x01cb:
            if (r0 == 0) goto L_0x01d2
            pk.s$n$a r0 = r0.c()
            goto L_0x01d4
        L_0x01d2:
            r0 = r30
        L_0x01d4:
            int r2 = r33 >> 12
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 48
            r3 = r31
            tk.C11918b.b(r0, r3, r12, r1, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e8
            U0.C4895p.R()
        L_0x01e8:
            r8 = r32
        L_0x01ea:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x020c
            tk.h r9 = new tk.h
            r0 = r9
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r11 = r9
            r9 = r43
            r10 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.a(r11)
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.o.o(pk.s$n, nI.a, nI.l, nI.l, nI.l, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(s.n nVar, C17631a aVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar2, C17631a aVar3, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(nVar, aVar, lVar, lVar2, lVar3, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(pk.s.n.e r27, nI.C17631a<XH.C16807N> r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, U0.C4889m r32, int r33, int r34) {
        /*
            r6 = r33
            r0 = 16
            r1 = 2
            r2 = 4
            r3 = 6
            r4 = -2061525627(0xffffffff851f9d85, float:-7.505076E-36)
            r5 = r32
            U0.m r5 = r5.k(r4)
            r7 = 1
            r8 = r34 & 1
            if (r8 == 0) goto L_0x001a
            r8 = r6 | 6
            r15 = r27
            goto L_0x002c
        L_0x001a:
            r8 = r6 & 6
            r15 = r27
            if (r8 != 0) goto L_0x002b
            boolean r8 = r5.V(r15)
            if (r8 == 0) goto L_0x0028
            r8 = r2
            goto L_0x0029
        L_0x0028:
            r8 = r1
        L_0x0029:
            r8 = r8 | r6
            goto L_0x002c
        L_0x002b:
            r8 = r6
        L_0x002c:
            r1 = r34 & 2
            r9 = 32
            if (r1 == 0) goto L_0x0037
            r8 = r8 | 48
        L_0x0034:
            r1 = r28
            goto L_0x0047
        L_0x0037:
            r1 = r6 & 48
            if (r1 != 0) goto L_0x0034
            r1 = r28
            boolean r10 = r5.F(r1)
            if (r10 == 0) goto L_0x0045
            r10 = r9
            goto L_0x0046
        L_0x0045:
            r10 = r0
        L_0x0046:
            r8 = r8 | r10
        L_0x0047:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x0050
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r2 = r29
            goto L_0x0062
        L_0x0050:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004d
            r2 = r29
            boolean r10 = r5.F(r2)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r8 = r8 | r10
        L_0x0062:
            r10 = r34 & 8
            if (r10 == 0) goto L_0x006b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            r14 = r30
            goto L_0x007d
        L_0x006b:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            r14 = r30
            if (r10 != 0) goto L_0x007d
            boolean r10 = r5.F(r14)
            if (r10 == 0) goto L_0x007a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r8 = r8 | r10
        L_0x007d:
            r10 = r34 & 16
            if (r10 == 0) goto L_0x0087
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r11 = r31
        L_0x0085:
            r13 = r8
            goto L_0x009a
        L_0x0087:
            r11 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0083
            r11 = r31
            boolean r12 = r5.V(r11)
            if (r12 == 0) goto L_0x0096
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r8 = r8 | r12
            goto L_0x0085
        L_0x009a:
            r8 = r13 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r12) goto L_0x00ac
            boolean r8 = r5.l()
            if (r8 != 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            r5.L()
            goto L_0x02ab
        L_0x00ac:
            if (r10 == 0) goto L_0x00b2
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r12 = r8
            goto L_0x00b3
        L_0x00b2:
            r12 = r11
        L_0x00b3:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00bf
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.SimilarProduct (SimilarItemsScreen.kt:293)"
            U0.C4895p.S(r4, r13, r8, r10)
        L_0x00bf:
            r4 = 0
            r8 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r12, r4, r7, r8)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r28
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r7 = TC.e.g()
            float r8 = TC.e.g()
            float r10 = TC.e.g()
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.l(r4, r8, r7, r10, r9)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r7 = r7.f()
            i1.c$a r23 = i1.C5437c.f24302a
            i1.c$c r8 = r23.l()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.G.b(r7, r8, r5, r11)
            int r8 = U0.C4883j.a(r5, r11)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r5, r4)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r3 = r10.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x0116
            U0.C4883j.c()
        L_0x0116:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x0123
            r5.p(r3)
            goto L_0x0126
        L_0x0123:
            r5.t()
        L_0x0126:
            U0.m r3 = U0.F1.a(r5)
            nI.p r0 = r10.c()
            U0.F1.c(r3, r7, r0)
            nI.p r0 = r10.e()
            U0.F1.c(r3, r9, r0)
            nI.p r0 = r10.b()
            boolean r7 = r3.i()
            if (r7 != 0) goto L_0x0150
            java.lang.Object r7 = r3.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x015e
        L_0x0150:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.w(r7, r0)
        L_0x015e:
            nI.p r0 = r10.d()
            U0.F1.c(r3, r4, r0)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            i1.c r3 = r23.o()
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r11)
            int r4 = U0.C4883j.a(r5, r11)
            U0.y r7 = r5.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r5, r0)
            nI.a r9 = r10.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x018a
            U0.C4883j.c()
        L_0x018a:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x0197
            r5.p(r9)
            goto L_0x019a
        L_0x0197:
            r5.t()
        L_0x019a:
            U0.m r9 = U0.F1.a(r5)
            nI.p r11 = r10.c()
            U0.F1.c(r9, r3, r11)
            nI.p r3 = r10.e()
            U0.F1.c(r9, r7, r3)
            nI.p r3 = r10.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x01c4
            java.lang.Object r7 = r9.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x01d2
        L_0x01c4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r9.u(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.w(r4, r3)
        L_0x01d2:
            nI.p r3 = r10.d()
            U0.F1.c(r9, r8, r3)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            r4 = 160(0xa0, float:2.24E-43)
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            java.lang.String r7 = r27.c()
            if (r7 != 0) goto L_0x01ea
            java.lang.String r7 = ""
        L_0x01ea:
            LC.b$b r10 = new LC.b$b
            gs.h$a r8 = gs.h.a.M
            r10.<init>(r8)
            U0.I0 r8 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r8 = r5.Q(r8)
            c2.d r8 = (c2.d) r8
            gs.e$b r11 = new gs.e$b
            int r9 = r8.K0(r4)
            int r8 = r8.K0(r4)
            r11.<init>(r9, r8)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.t(r0, r4)
            int r4 = LC.C13178b.C2734b.f111820b
            int r4 = r4 << 9
            r4 = r4 | 432(0x1b0, float:6.05E-43)
            int r8 = gs.e.b.f97961c
            int r8 = r8 << 12
            r20 = r4 | r8
            r21 = 0
            r22 = 4064(0xfe0, float:5.695E-42)
            r8 = 0
            r4 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r24 = 0
            r25 = 0
            r26 = r12
            r12 = r4
            r4 = r13
            r13 = r16
            r14 = r17
            r15 = r18
            r16 = r19
            r17 = r24
            r18 = r25
            r19 = r5
            LC.h.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r7 = r27.d()
            if (r7 == 0) goto L_0x0248
            int r7 = uK.C18146a.f147965A5
            goto L_0x024a
        L_0x0248:
            int r7 = uK.C18146a.f148740z5
        L_0x024a:
            int r8 = Oo.b.f84621e
            r9 = 0
            java.lang.String r8 = J1.j.b(r8, r5, r9)
            SC.H0 r11 = SC.H0.SecondaryStatic
            i1.c r9 = r23.c()
            androidx.compose.ui.d r9 = r3.a(r0, r9)
            SC.G0 r12 = SC.G0.Small
            int r3 = r4 << 18
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r10
            r10 = 221184(0x36000, float:3.09945E-40)
            r17 = r3 | r10
            r18 = 200(0xc8, float:2.8E-43)
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = r29
            r16 = r5
            SC.F0.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.x()
            r3 = 16
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r3)
            r3 = 6
            s0.C5844O.a(r0, r5, r3)
            Op.d$h r7 = r27.f()
            Op.i1 r8 = r27.a()
            boolean r9 = r27.b()
            r14 = r4 & 7168(0x1c00, float:1.0045E-41)
            r15 = 48
            r11 = 0
            r12 = 0
            r10 = r30
            r13 = r5
            Op.F.g(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a9
            U0.C4895p.R()
        L_0x02a9:
            r11 = r26
        L_0x02ab:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x02c7
            tk.n r9 = new tk.n
            r0 = r9
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r11
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.o.q(pk.s$n$e, nI.a, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(s.n.e eVar, C17631a aVar, C17631a aVar2, C17631a aVar3, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        q(eVar, aVar, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void w(x xVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(-317249188, true, new d(i10, 4)), 3, (Object) null);
        }
    }

    private static final void x(x xVar, C15987c<s.n.e> cVar, C17642l<? super s.n.e, C16807N> lVar, C17642l<? super s.n.e, C16807N> lVar2, C17642l<? super s.n.e, C16807N> lVar3) {
        xVar.e(cVar.size(), new e(new l(), cVar), new f(cVar), c1.c.c(-1091073711, true, new g(cVar, lVar, lVar2, lVar3, cVar)));
    }

    /* access modifiers changed from: private */
    public static final Object y(int i10, s.n.e eVar) {
        C17542s.j(eVar, "item");
        return eVar.e();
    }

    private static final void z(x xVar, s.n nVar) {
        x.i(xVar, (Object) null, (Object) null, c1.c.c(-1264341588, true, new k(nVar)), 3, (Object) null);
    }
}
