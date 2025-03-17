package sG;

import E1.I;
import G1.C4504g;
import I0.C0;
import I0.E0;
import I0.F0;
import I0.G0;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import N1.Y;
import O0.C4762x0;
import O0.H;
import O0.d1;
import OE.n;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.B;
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
import XH.y;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import f1.C5301c;
import f1.C5309k;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import nI.r;
import rG.C17847a;
import rG.C17848b;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5848T;
import s0.C5862h;
import s0.C5880z;
import tK.C18030v;
import u0.C5968C;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a]\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0001\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001d\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u001c\u001a\u00020\u00032\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010 \u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u001f\u001a\u00020\u00032\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b \u0010\u001e\u001aY\u0010)\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0003¢\u0006\u0004\b)\u0010*¨\u0006,²\u0006\f\u0010+\u001a\u00020&8\nX\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00038\n@\nX\u0002"}, d2 = {"LsG/r;", "state", "LKJ/c;", "", "shoppingListItems", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onAddItemToFav", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "onEvent", "Lkotlin/Function0;", "onClose", "s", "(LsG/r;LKJ/c;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "LrG/a;", "onAddItemToBag", "", "onAddAllToBag", "onMessageShown", "x", "(LsG/r;LnI/l;LnI/a;LnI/l;LKJ/c;LnI/l;LnI/a;LU0/m;I)V", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "cartItems", "favorites", "D", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;LKJ/c;LnI/l;LnI/l;LU0/m;I)V", "items", "totalAmount", "L", "(LKJ/c;Ljava/lang/String;LnI/l;LU0/m;I)V", "totalPrice", "p", "item", "", "quantity", "LlF/a;", "priceData", "", "isInShoppingLists", "onAddToBag", "G", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ILlF/a;ZLnI/l;LnI/l;LU0/m;I)V", "showHeader", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f146933a;

        a(String str) {
            this.f146933a = str;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1904855971, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.AddAllToBagButton.<anonymous> (CartDrawer.kt:297)");
                }
                androidx.compose.ui.d j10 = D.j(androidx.compose.ui.d.f18749a, c2.h.B((float) 24), c2.h.B((float) 4));
                C5437c.C0386c i12 = C5437c.f24302a.i();
                String str = this.f146933a;
                I b10 = G.b(C5073d.f18068a.f(), i12, mVar2, 48);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, j10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar.c());
                F1.c(a12, s10, aVar.e());
                nI.p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar.d());
                C5843N n10 = C5843N.f28726a;
                C18030v vVar = C18030v.f147664a;
                int i13 = C18030v.f147665b;
                Y b12 = vVar.b(mVar2, i13).a().b();
                String str2 = str;
                d1.b(str2, (androidx.compose.ui.d) null, vVar.a(mVar2, i13).F0(), 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 1, 0, (C17642l<? super P, C16807N>) null, b12, mVar, ImageMetadata.EDGE_MODE, 3072, 57306);
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
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerKt$CartDrawer$1$1", f = "CartDrawer.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> f146935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, C16807N> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f146935d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f146935d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f146934c == 0) {
                y.b(obj);
                this.f146935d.invoke(a.B.f142582a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G0 f146936a;

        c(G0 g02) {
            this.f146936a = g02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1253532524, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerContent.<anonymous> (CartDrawer.kt:136)");
                }
                F0.b(this.f146936a, (androidx.compose.ui.d) null, (q<? super C0, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f146937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f146938b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f146939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17847a, C16807N> f146940d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f146941e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f146942f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<C17847a> f146943g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<List<C17847a>, C16807N> f146944h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f146945i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Q f146946j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f146947k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ G0 f146948l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<C17847a> f146949a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<List<C17847a>, C16807N> f146950b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<String> f146951c;

            a(List<C17847a> list, C17642l<? super List<C17847a>, C16807N> lVar, C4899r0<String> r0Var) {
                this.f146949a = list;
                this.f146950b = lVar;
                this.f146951c = r0Var;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1436556006, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CartDrawer.kt:149)");
                    }
                    p.L(C15985a.h(this.f146949a), p.z(this.f146951c), this.f146950b, mVar, 0);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerKt$CartDrawerContent$2$1$2$1$1", f = "CartDrawer.kt", l = {201}, m = "invokeSuspend")
        static final class b extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146952c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G0 f146953d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f146954e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f146955f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(G0 g02, String str, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f146953d = g02;
                this.f146954e = str;
                this.f146955f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f146953d, this.f146954e, this.f146955f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146952c;
                if (i10 == 0) {
                    y.b(obj);
                    G0 g02 = this.f146953d;
                    String str = this.f146954e;
                    this.f146952c = 1;
                    if (G0.e(g02, str, (String) null, (E0) null, this, 6, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f146955f.invoke();
                return C16807N.f139792a;
            }
        }

        d(r rVar, C17631a<C16807N> aVar, C15987c<String> cVar, C17642l<? super C17847a, C16807N> lVar, C17642l<? super CachedCatalogItem, C16807N> lVar2, C4899r0<Boolean> r0Var, List<C17847a> list, C17642l<? super List<C17847a>, C16807N> lVar3, C4899r0<String> r0Var2, Q q10, C17631a<C16807N> aVar2, G0 g02) {
            this.f146937a = rVar;
            this.f146938b = aVar;
            this.f146939c = cVar;
            this.f146940d = lVar;
            this.f146941e = lVar2;
            this.f146942f = r0Var;
            this.f146943g = list;
            this.f146944h = lVar3;
            this.f146945i = r0Var2;
            this.f146946j = q10;
            this.f146947k = aVar2;
            this.f146948l = g02;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: nI.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(s0.C5834E r34, U0.C4889m r35, int r36) {
            /*
                r33 = this;
                r0 = r33
                r1 = r34
                r12 = r35
                java.lang.String r2 = "padding"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r36 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r12.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r36 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r36
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r35.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r35.L()
                goto L_0x02f2
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerContent.<anonymous> (CartDrawer.kt:138)"
                r5 = 2120727325(0x7e67bb1d, float:7.7005804E37)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r3 = 0
                r4 = 1
                r14 = 0
                androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.f(r2, r3, r4, r14)
                sG.r r15 = r0.f146937a
                nI.a<XH.N> r6 = r0.f146938b
                KJ.c<java.lang.String> r11 = r0.f146939c
                nI.l<rG.a, XH.N> r10 = r0.f146940d
                nI.l<com.sugarcube.app.base.data.database.CachedCatalogItem, XH.N> r9 = r0.f146941e
                U0.r0<java.lang.Boolean> r7 = r0.f146942f
                java.util.List<rG.a> r8 = r0.f146943g
                nI.l<java.util.List<rG.a>, XH.N> r13 = r0.f146944h
                r36 = r11
                U0.r0<java.lang.String> r11 = r0.f146945i
                r16 = r10
                QJ.Q r10 = r0.f146946j
                r17 = r10
                nI.a<XH.N> r10 = r0.f146947k
                r18 = r10
                I0.G0 r10 = r0.f146948l
                i1.c$a r19 = i1.C5437c.f24302a
                i1.c r3 = r19.o()
                r21 = r10
                r10 = 0
                E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r10)
                int r22 = U0.C4883j.a(r12, r10)
                U0.y r10 = r35.s()
                androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r12, r5)
                G1.g$a r23 = G1.C4504g.f6515W
                nI.a r4 = r23.a()
                U0.f r24 = r35.m()
                if (r24 != 0) goto L_0x008f
                U0.C4883j.c()
            L_0x008f:
                r35.I()
                boolean r24 = r35.i()
                if (r24 == 0) goto L_0x009c
                r12.p(r4)
                goto L_0x009f
            L_0x009c:
                r35.t()
            L_0x009f:
                U0.m r4 = U0.F1.a(r35)
                nI.p r14 = r23.c()
                U0.F1.c(r4, r3, r14)
                nI.p r3 = r23.e()
                U0.F1.c(r4, r10, r3)
                nI.p r3 = r23.b()
                boolean r10 = r4.i()
                if (r10 != 0) goto L_0x00c9
                java.lang.Object r10 = r4.D()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r22)
                boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
                if (r10 != 0) goto L_0x00d7
            L_0x00c9:
                java.lang.Integer r10 = java.lang.Integer.valueOf(r22)
                r4.u(r10)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r22)
                r4.w(r10, r3)
            L_0x00d7:
                nI.p r3 = r23.d()
                U0.F1.c(r4, r5, r3)
                androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r2, r1)
                r2 = 0
                r3 = 1
                r4 = 0
                androidx.compose.ui.d r25 = androidx.compose.foundation.layout.J.f(r1, r2, r3, r4)
                r1 = 0
                rF.b r2 = rF.C15002a.a(r12, r1)
                long r26 = r2.p()
                r29 = 2
                r30 = 0
                r28 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r25, r26, r28, r29, r30)
                androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r2 = r2.g()
                i1.c$b r3 = r19.k()
                r10 = 0
                E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r12, r10)
                int r3 = U0.C4883j.a(r12, r10)
                U0.y r4 = r35.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r1)
                nI.a r5 = r23.a()
                U0.f r14 = r35.m()
                if (r14 != 0) goto L_0x0126
                U0.C4883j.c()
            L_0x0126:
                r35.I()
                boolean r14 = r35.i()
                if (r14 == 0) goto L_0x0133
                r12.p(r5)
                goto L_0x0136
            L_0x0133:
                r35.t()
            L_0x0136:
                U0.m r5 = U0.F1.a(r35)
                nI.p r14 = r23.c()
                U0.F1.c(r5, r2, r14)
                nI.p r2 = r23.e()
                U0.F1.c(r5, r4, r2)
                nI.p r2 = r23.b()
                boolean r4 = r5.i()
                if (r4 != 0) goto L_0x0160
                java.lang.Object r4 = r5.D()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r14)
                if (r4 != 0) goto L_0x016e
            L_0x0160:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r5.u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5.w(r3, r2)
            L_0x016e:
                nI.p r2 = r23.d()
                U0.F1.c(r5, r1, r2)
                s0.h r1 = s0.C5862h.f28810a
                boolean r5 = sG.p.y(r7)
                sG.p$d$a r1 = new sG.p$d$a
                r1.<init>(r8, r13, r11)
                r2 = 54
                r3 = 1436556006(0x55a01ae6, float:2.20046735E13)
                r4 = 1
                c1.a r2 = c1.c.e(r3, r4, r1, r12, r2)
                r13 = 48
                r14 = 229(0xe5, float:3.21E-43)
                r1 = 0
                r3 = 0
                r7 = 0
                r8 = 0
                r19 = 0
                r4 = r6
                r6 = r7
                r7 = r8
                r8 = r19
                r19 = r9
                r9 = r35
                r31 = r18
                r32 = r21
                r10 = r13
                r13 = r36
                r0 = r11
                r11 = r14
                AG.C15408p.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r1 = r15.e()
                if (r1 == 0) goto L_0x01c6
                r0 = 1054840618(0x3edf972a, float:0.43670017)
                r12.W(r0)
                r7 = 0
                rF.b r0 = rF.C15002a.a(r12, r7)
                long r0 = r0.p()
                zG.l.b(r0, r12, r7)
                r35.P()
                goto L_0x0283
            L_0x01c6:
                r7 = 0
                sG.q r1 = r15.d()
                if (r1 == 0) goto L_0x01f3
                r0 = 1055081457(0x3ee343f1, float:0.44387773)
                r12.W(r0)
                sG.q r0 = r15.d()
                com.sugarcube.common.UiText r1 = r0.a()
                tK.v r0 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r0 = r0.a(r12, r2)
                long r2 = r0.F0()
                r5 = 0
                r6 = 0
                r4 = r35
                zG.h.d(r1, r2, r4, r5, r6)
                r35.P()
                goto L_0x0283
            L_0x01f3:
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r1 = r15.c()
                if (r1 == 0) goto L_0x025e
                r1 = 1055340648(0x3ee73868, float:0.45160222)
                r12.W(r1)
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r1 = r15.c()
                lF.a r1 = r1.b()
                java.lang.String r1 = r1.f()
                sG.p.A(r0, r1)
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r0 = r15.c()
                KJ.c r0 = r0.a()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0242
                r0 = 1055457735(0x3ee901c7, float:0.45509169)
                r12.W(r0)
                com.sugarcube.common.UiText$StringResource r1 = new com.sugarcube.common.UiText$StringResource
                int r0 = OE.n.f113193E1
                r2 = 2
                r3 = 0
                r1.<init>(r0, r3, r2, r3)
                tK.v r0 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r0 = r0.a(r12, r2)
                long r2 = r0.F0()
                r5 = 0
                r6 = 0
                r4 = r35
                zG.h.d(r1, r2, r4, r5, r6)
                r35.P()
                goto L_0x025a
            L_0x0242:
                r0 = 1055821427(0x3eee8e73, float:0.46593055)
                r12.W(r0)
                com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r1 = r15.c()
                r6 = 0
                r2 = r13
                r3 = r16
                r4 = r19
                r5 = r35
                sG.p.D(r1, r2, r3, r4, r5, r6)
                r35.P()
            L_0x025a:
                r35.P()
                goto L_0x0283
            L_0x025e:
                r0 = 1056216708(0x3ef49684, float:0.47771084)
                r12.W(r0)
                com.sugarcube.common.UiText$StringResource r1 = new com.sugarcube.common.UiText$StringResource
                int r0 = OE.n.f113193E1
                r2 = 2
                r3 = 0
                r1.<init>(r0, r3, r2, r3)
                tK.v r0 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r0 = r0.a(r12, r2)
                long r2 = r0.F0()
                r5 = 0
                r6 = 0
                r4 = r35
                zG.h.d(r1, r2, r4, r5, r6)
                r35.P()
            L_0x0283:
                r35.x()
                com.sugarcube.common.UiText r0 = r15.f()
                r1 = -680727587(0xffffffffd76cebdd, float:-2.60497769E14)
                r12.W(r1)
                if (r0 != 0) goto L_0x0294
                r4 = 0
                goto L_0x0298
            L_0x0294:
                java.lang.String r4 = r0.asString(r12, r7)
            L_0x0298:
                r35.P()
                r0 = -680727029(0xffffffffd76cee0b, float:-2.60507131E14)
                r12.W(r0)
                if (r4 != 0) goto L_0x02a4
                goto L_0x02e3
            L_0x02a4:
                r0 = -658652790(0xffffffffd8bdc18a, float:-1.66911153E15)
                r12.W(r0)
                boolean r0 = r12.V(r4)
                r1 = r31
                boolean r2 = r12.V(r1)
                r0 = r0 | r2
                java.lang.Object r2 = r35.D()
                if (r0 != 0) goto L_0x02c3
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x02ce
            L_0x02c3:
                sG.p$d$b r2 = new sG.p$d$b
                r3 = r32
                r0 = 0
                r2.<init>(r3, r4, r1, r0)
                r12.u(r2)
            L_0x02ce:
                r19 = r2
                nI.p r19 = (nI.p) r19
                r35.P()
                r20 = 3
                r21 = 0
                r0 = 0
                r18 = 0
                r16 = r17
                r17 = r0
                QJ.F0 unused = QJ.C16314k.d(r16, r17, r18, r19, r20, r21)
            L_0x02e3:
                r35.P()
                r35.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x02f2
                U0.C4895p.R()
            L_0x02f2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sG.p.d.a(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements C17642l<CachedCatalogItem, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C17847a, C16807N> f146956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17847a f146957b;

        e(C17642l<? super C17847a, C16807N> lVar, C17847a aVar) {
            this.f146956a = lVar;
            this.f146957b = aVar;
        }

        public final void a(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "it");
            this.f146956a.invoke(this.f146957b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CachedCatalogItem) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements C17642l<CachedCatalogItem, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f146958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17848b f146959b;

        f(C17642l<? super CachedCatalogItem, C16807N> lVar, C17848b bVar) {
            this.f146958a = lVar;
            this.f146959b = bVar;
        }

        public final void a(CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "it");
            C17642l<CachedCatalogItem, C16807N> lVar = this.f146958a;
            if (lVar != null) {
                lVar.invoke(this.f146959b.a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CachedCatalogItem) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f146960c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f146960c = list;
        }

        public final Object a(int i10) {
            this.f146960c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f146961c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15987c f146962d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f146963e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f146964f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List list, C15987c cVar, C17642l lVar, C17642l lVar2) {
            super(4);
            this.f146961c = list;
            this.f146962d = cVar;
            this.f146963e = lVar;
            this.f146964f = lVar2;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            int i13;
            d.a aVar;
            int i14 = i10;
            C4889m mVar2 = mVar;
            if ((i11 & 6) == 0) {
                i12 = i11 | (mVar2.V(oVar) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar2.d(i14) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                }
                C17847a aVar2 = (C17847a) this.f146961c.get(i14);
                mVar2.W(1306817038);
                d.a aVar3 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d a10 = x.a(aVar3, C5880z.Min);
                C5073d dVar = C5073d.f18068a;
                C5073d.e f10 = dVar.f();
                C5437c.a aVar4 = C5437c.f24302a;
                I b10 = G.b(f10, aVar4.l(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, a10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar5.a();
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
                F1.c(a13, b10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                nI.p<C4504g, Integer, C16807N> b11 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar5.d());
                androidx.compose.ui.d e11 = C5842M.e(C5843N.f28726a, aVar3, 1.0f, false, 2, (Object) null);
                I a14 = C5080k.a(dVar.g(), aVar4.g(), mVar2, 48);
                int a15 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, e11);
                C17631a<C4504g> a16 = aVar5.a();
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
                F1.c(a17, a14, aVar5.c());
                F1.c(a17, s11, aVar5.e());
                nI.p<C4504g, Integer, C16807N> b12 = aVar5.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b12);
                }
                F1.c(a17, e12, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                C17848b a18 = aVar2.a();
                mVar2.W(-716736216);
                if (i14 < 2) {
                    i13 = 0;
                    aVar = aVar3;
                    H.a((androidx.compose.ui.d) null, 0.0f, C18030v.f147664a.a(mVar2, C18030v.f147665b).m0(), mVar, 0, 3);
                } else {
                    i13 = 0;
                    aVar = aVar3;
                }
                mVar.P();
                Object localItemNumber = aVar2.a().a().getCatalogItem().getLocalItemNumber();
                if (localItemNumber == null) {
                    localItemNumber = Integer.valueOf(i13);
                }
                CachedCatalogItem a19 = a18.a();
                int b13 = aVar2.a().b();
                C14768a b14 = aVar2.b();
                boolean l02 = C16877v.l0(this.f146962d, localItemNumber);
                mVar2.W(-716719540);
                boolean V10 = mVar2.V(this.f146963e) | mVar2.V(aVar2);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new e(this.f146963e, aVar2);
                    mVar2.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar2.W(-716717367);
                boolean V11 = mVar2.V(this.f146964f) | mVar2.V(a18);
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new f(this.f146964f, a18);
                    mVar2.u(D11);
                }
                mVar.P();
                p.G(a19, b13, b14, l02, lVar, (C17642l) D11, mVar, 0);
                C18030v vVar = C18030v.f147664a;
                int i15 = C18030v.f147665b;
                H.a((androidx.compose.ui.d) null, 0.0f, vVar.a(mVar2, i15).m0(), mVar, 0, 3);
                mVar.x();
                mVar2.W(1468156508);
                if ((i14 + 1) % 2 != 0) {
                    H.b(J.y(J.d(aVar, 0.0f, 1, (Object) null), c2.h.B((float) 1)), 0.0f, vVar.a(mVar2, i15).m0(), mVar, 6, 2);
                }
                mVar.P();
                mVar.x();
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
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void A(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C16807N B(r rVar, C17642l lVar, C17631a aVar, C17642l lVar2, C15987c cVar, C17642l lVar3, C17631a aVar2, int i10, C4889m mVar, int i11) {
        x(rVar, lVar, aVar, lVar2, cVar, lVar3, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 C() {
        return u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a r22, KJ.C15987c<java.lang.String> r23, nI.C17642l<? super rG.C17847a, XH.C16807N> r24, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r25, U0.C4889m r26, int r27) {
        /*
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r0 = 2028079622(0x78e20a06, float:3.667695E34)
            r6 = r26
            U0.m r15 = r6.k(r0)
            r6 = r5 & 6
            r7 = 2
            r8 = 4
            if (r6 != 0) goto L_0x0024
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x0021
            r6 = r8
            goto L_0x0022
        L_0x0021:
            r6 = r7
        L_0x0022:
            r6 = r6 | r5
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            r9 = r5 & 48
            r10 = 32
            if (r9 != 0) goto L_0x0036
            boolean r9 = r15.V(r2)
            if (r9 == 0) goto L_0x0033
            r9 = r10
            goto L_0x0035
        L_0x0033:
            r9 = 16
        L_0x0035:
            r6 = r6 | r9
        L_0x0036:
            r9 = r5 & 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0047
            boolean r9 = r15.F(r3)
            if (r9 == 0) goto L_0x0044
            r9 = r11
            goto L_0x0046
        L_0x0044:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r6 = r6 | r9
        L_0x0047:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r9 != 0) goto L_0x0058
            boolean r9 = r15.F(r4)
            if (r9 == 0) goto L_0x0055
            r9 = r12
            goto L_0x0057
        L_0x0055:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r6 = r6 | r9
        L_0x0058:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r9 != r13) goto L_0x006c
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            r15.L()
            r19 = r15
            goto L_0x0108
        L_0x006c:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0078
            r9 = -1
            java.lang.String r13 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartGrid (CartDrawer.kt:214)"
            U0.C4895p.S(r0, r6, r9, r13)
        L_0x0078:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r9 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r0, r9, r14, r13)
            r0 = 0
            rF.b r9 = rF.C15002a.a(r15, r0)
            long r17 = r9.p()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            java.lang.String r13 = "CATALOG_GRID_TEST_TAG"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r9, r13)
            u0.b$a r13 = new u0.b$a
            r13.<init>(r7)
            r7 = -780890547(0xffffffffd1748e4d, float:-6.5647464E10)
            r15.W(r7)
            r7 = r6 & 14
            if (r7 != r8) goto L_0x00ab
            r7 = r14
            goto L_0x00ac
        L_0x00ab:
            r7 = r0
        L_0x00ac:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != r10) goto L_0x00b2
            r8 = r14
            goto L_0x00b3
        L_0x00b2:
            r8 = r0
        L_0x00b3:
            r7 = r7 | r8
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != r11) goto L_0x00ba
            r8 = r14
            goto L_0x00bb
        L_0x00ba:
            r8 = r0
        L_0x00bb:
            r7 = r7 | r8
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r12) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r14 = r0
        L_0x00c2:
            r0 = r7 | r14
            java.lang.Object r6 = r15.D()
            if (r0 != 0) goto L_0x00d2
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x00da
        L_0x00d2:
            sG.m r6 = new sG.m
            r6.<init>(r1, r2, r3, r4)
            r15.u(r6)
        L_0x00da:
            r0 = r6
            nI.l r0 = (nI.C17642l) r0
            r15.P()
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r19 = 0
            r6 = r13
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r13 = r16
            r14 = r19
            r19 = r15
            r15 = r0
            r16 = r19
            u0.C5984h.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0108
            U0.C4895p.R()
        L_0x0108:
            U0.Y0 r6 = r19.n()
            if (r6 == 0) goto L_0x0121
            sG.n r7 = new sG.n
            r0 = r7
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sG.p.D(com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a, KJ.c, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N E(CartUseCase.a aVar, C15987c cVar, C17642l lVar, C17642l lVar2, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        C15987c<C17847a> a10 = aVar.a();
        c10.h(a10.size(), (C17642l<? super Integer, ? extends Object>) null, (nI.p<? super C5993q, ? super Integer, C5979c>) null, new g(a10), c1.c.c(1229287273, true, new h(a10, cVar, lVar, lVar2)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(CartUseCase.a aVar, C15987c cVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        D(aVar, cVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(com.sugarcube.app.base.data.database.CachedCatalogItem r50, int r51, lF.C14768a r52, boolean r53, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r54, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r55, U0.C4889m r56, int r57) {
        /*
            r1 = r50
            r2 = r51
            r4 = r53
            r5 = r54
            r6 = r55
            r7 = r57
            r0 = 1576078447(0x5df10c6f, float:2.17117249E18)
            r3 = r56
            U0.m r3 = r3.k(r0)
            r9 = 6
            r8 = r7 & 6
            if (r8 != 0) goto L_0x0025
            boolean r8 = r3.V(r1)
            if (r8 == 0) goto L_0x0022
            r8 = 4
            goto L_0x0023
        L_0x0022:
            r8 = 2
        L_0x0023:
            r8 = r8 | r7
            goto L_0x0026
        L_0x0025:
            r8 = r7
        L_0x0026:
            r10 = r7 & 48
            if (r10 != 0) goto L_0x0036
            boolean r10 = r3.d(r2)
            if (r10 == 0) goto L_0x0033
            r10 = 32
            goto L_0x0035
        L_0x0033:
            r10 = 16
        L_0x0035:
            r8 = r8 | r10
        L_0x0036:
            r10 = r7 & 384(0x180, float:5.38E-43)
            r14 = r52
            if (r10 != 0) goto L_0x0048
            boolean r10 = r3.V(r14)
            if (r10 == 0) goto L_0x0045
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r8 = r8 | r10
        L_0x0048:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0058
            boolean r10 = r3.b(r4)
            if (r10 == 0) goto L_0x0055
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r8 = r8 | r10
        L_0x0058:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0068
            boolean r10 = r3.F(r5)
            if (r10 == 0) goto L_0x0065
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r8 = r8 | r10
        L_0x0068:
            r33 = 196608(0x30000, float:2.75506E-40)
            r10 = r7 & r33
            if (r10 != 0) goto L_0x007a
            boolean r10 = r3.F(r6)
            if (r10 == 0) goto L_0x0077
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0079
        L_0x0077:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x0079:
            r8 = r8 | r10
        L_0x007a:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r8
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r9) goto L_0x008f
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r3.L()
            goto L_0x0526
        L_0x008f:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x009b
            r9 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartItem (CartDrawer.kt:320)"
            U0.C4895p.S(r0, r8, r9, r10)
        L_0x009b:
            com.sugarcube.core.network.models.CatalogItem r0 = r50.getCatalogItem()
            java.lang.String r9 = r0.getName()
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x00aa
            r29 = r10
            goto L_0x00ac
        L_0x00aa:
            r29 = r9
        L_0x00ac:
            java.lang.String r9 = r0.getDescription()
            if (r9 != 0) goto L_0x00b5
            r34 = r10
            goto L_0x00b7
        L_0x00b5:
            r34 = r9
        L_0x00b7:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c$a r35 = i1.C5437c.f24302a
            i1.c r10 = r35.o()
            r15 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5077h.h(r10, r15)
            int r17 = U0.C4883j.a(r3, r15)
            U0.y r12 = r3.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r3, r9)
            G1.g$a r36 = G1.C4504g.f6515W
            nI.a r15 = r36.a()
            U0.f r21 = r3.m()
            if (r21 != 0) goto L_0x00df
            U0.C4883j.c()
        L_0x00df:
            r3.I()
            boolean r21 = r3.i()
            if (r21 == 0) goto L_0x00ec
            r3.p(r15)
            goto L_0x00ef
        L_0x00ec:
            r3.t()
        L_0x00ef:
            U0.m r15 = U0.F1.a(r3)
            nI.p r11 = r36.c()
            U0.F1.c(r15, r10, r11)
            nI.p r10 = r36.e()
            U0.F1.c(r15, r12, r10)
            nI.p r10 = r36.b()
            boolean r11 = r15.i()
            if (r11 != 0) goto L_0x0119
            java.lang.Object r11 = r15.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x0127
        L_0x0119:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            r15.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            r15.w(r11, r10)
        L_0x0127:
            nI.p r10 = r36.d()
            U0.F1.c(r15, r13, r10)
            androidx.compose.foundation.layout.j r15 = androidx.compose.foundation.layout.C5079j.f18125a
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r9, r13, r12, r11)
            r17 = r15
            r15 = 12
            float r14 = (float) r15
            float r11 = c2.h.B(r14)
            float r13 = c2.h.B(r14)
            r15 = 32
            float r15 = (float) r15
            float r15 = c2.h.B(r15)
            float r12 = c2.h.B(r14)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.l(r10, r11, r15, r13, r12)
            androidx.compose.foundation.layout.d r37 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r11 = r37.f()
            i1.c$c r12 = r35.l()
            r13 = 0
            E1.I r11 = androidx.compose.foundation.layout.G.b(r11, r12, r3, r13)
            int r12 = U0.C4883j.a(r3, r13)
            U0.y r13 = r3.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r3, r10)
            nI.a r15 = r36.a()
            U0.f r25 = r3.m()
            if (r25 != 0) goto L_0x017b
            U0.C4883j.c()
        L_0x017b:
            r3.I()
            boolean r25 = r3.i()
            if (r25 == 0) goto L_0x0188
            r3.p(r15)
            goto L_0x018b
        L_0x0188:
            r3.t()
        L_0x018b:
            U0.m r15 = U0.F1.a(r3)
            nI.p r7 = r36.c()
            U0.F1.c(r15, r11, r7)
            nI.p r7 = r36.e()
            U0.F1.c(r15, r13, r7)
            nI.p r7 = r36.b()
            boolean r11 = r15.i()
            if (r11 != 0) goto L_0x01b5
            java.lang.Object r11 = r15.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x01c3
        L_0x01b5:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.w(r11, r7)
        L_0x01c3:
            nI.p r7 = r36.d()
            U0.F1.c(r15, r10, r7)
            s0.N r38 = s0.C5843N.f28726a
            r7 = 100
            float r7 = (float) r7
            float r10 = c2.h.B(r7)
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.v(r9, r10, r7)
            k6.h$a r7 = new k6.h$a
            U0.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r3.Q(r11)
            android.content.Context r11 = (android.content.Context) r11
            r7.<init>(r11)
            android.net.Uri r0 = r0.getThumbUrl()
            k6.h$a r0 = r7.e(r0)
            r7 = 1
            k6.h$a r0 = k6.C8442i.a(r0, r7)
            k6.h r0 = r0.c()
            r44 = r8
            r8 = r0
            int r0 = OE.C13316h.f112845a
            r15 = 0
            t1.c r11 = J1.e.c(r0, r3, r15)
            r0 = 0
            r25 = 0
            r26 = 32752(0x7ff0, float:4.5895E-41)
            r12 = 0
            r13 = r7
            r7 = 131072(0x20000, float:1.83671E-40)
            r18 = 0
            r7 = 0
            r13 = r18
            r45 = r14
            r14 = r18
            r0 = r15
            r46 = r17
            r7 = 4
            r47 = 12
            r15 = r18
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 384(0x180, float:5.38E-43)
            r0 = r9
            r7 = 6
            r9 = r29
            r23 = r3
            U5.s.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r8 = c2.h.B(r45)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.y(r0, r8)
            s0.C5844O.a(r8, r3, r7)
            androidx.compose.foundation.layout.d$m r8 = r37.g()
            i1.c$b r9 = r35.k()
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r3, r10)
            int r9 = U0.C4883j.a(r3, r10)
            U0.y r10 = r3.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r3, r0)
            nI.a r12 = r36.a()
            U0.f r13 = r3.m()
            if (r13 != 0) goto L_0x0267
            U0.C4883j.c()
        L_0x0267:
            r3.I()
            boolean r13 = r3.i()
            if (r13 == 0) goto L_0x0274
            r3.p(r12)
            goto L_0x0277
        L_0x0274:
            r3.t()
        L_0x0277:
            U0.m r12 = U0.F1.a(r3)
            nI.p r13 = r36.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r36.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r36.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x02a1
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x02af
        L_0x02a1:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x02af:
            nI.p r8 = r36.d()
            U0.F1.c(r12, r11, r8)
            s0.h r8 = s0.C5862h.f28810a
            tK.v r8 = tK.C18030v.f147664a
            int r15 = tK.C18030v.f147665b
            tK.h r9 = r8.a(r3, r15)
            long r10 = r9.G0()
            tK.w r9 = r8.b(r3, r15)
            tK.r r9 = r9.c()
            N1.Y r28 = r9.e()
            r31 = 0
            r32 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r48 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r49 = r8
            r8 = r29
            r29 = r3
            O0.d1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r8 = 4
            float r9 = (float) r8
            float r8 = c2.h.B(r9)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r0, r8)
            s0.C5844O.a(r8, r3, r7)
            r8 = r48
            r7 = r49
            tK.w r7 = r7.b(r3, r8)
            tK.c r7 = r7.a()
            N1.Y r9 = r7.b()
            r12 = 0
            r13 = 4
            r10 = 0
            r8 = r34
            r11 = r3
            zG.j.b(r8, r9, r10, r11, r12, r13)
            r7 = 0
            r8 = 0
            r15 = 1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r0, r7, r15, r8)
            i1.c$c r8 = r35.i()
            androidx.compose.foundation.layout.d$f r9 = r37.d()
            r10 = 54
            E1.I r8 = androidx.compose.foundation.layout.G.b(r9, r8, r3, r10)
            r9 = 0
            int r10 = U0.C4883j.a(r3, r9)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r3, r7)
            nI.a r11 = r36.a()
            U0.f r12 = r3.m()
            if (r12 != 0) goto L_0x0351
            U0.C4883j.c()
        L_0x0351:
            r3.I()
            boolean r12 = r3.i()
            if (r12 == 0) goto L_0x035e
            r3.p(r11)
            goto L_0x0361
        L_0x035e:
            r3.t()
        L_0x0361:
            U0.m r11 = U0.F1.a(r3)
            nI.p r12 = r36.c()
            U0.F1.c(r11, r8, r12)
            nI.p r8 = r36.e()
            U0.F1.c(r11, r9, r8)
            nI.p r8 = r36.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x038b
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0399
        L_0x038b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11.w(r9, r8)
        L_0x0399:
            nI.p r8 = r36.d()
            U0.F1.c(r11, r7, r8)
            wK.h7 r12 = wK.C18349h7.Medium
            java.lang.String r8 = r52.e()
            java.lang.String r10 = r52.a()
            wK.t2 r11 = r52.c()
            java.lang.String r9 = r52.d()
            r25 = 0
            r26 = 32736(0x7fe0, float:4.5873E-41)
            r13 = 0
            r14 = 0
            r7 = 0
            r15 = r7
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r23 = r3
            wK.C18540x6.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 1
            float r8 = (float) r7
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r39 = androidx.compose.foundation.layout.J.y(r0, r8)
            r42 = 2
            r43 = 0
            r40 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            androidx.compose.ui.d r8 = s0.C5842M.e(r38, r39, r40, r41, r42, r43)
            r9 = 0
            s0.C5844O.a(r8, r3, r9)
            r8 = 1320312160(0x4eb25d60, float:1.49623194E9)
            r3.W(r8)
            if (r6 != 0) goto L_0x03f2
            goto L_0x0456
        L_0x03f2:
            if (r4 == 0) goto L_0x03fb
            uK.c r8 = uK.C18148c.HeartFilled
        L_0x03f6:
            int r8 = r8.m()
            goto L_0x03fe
        L_0x03fb:
            uK.c r8 = uK.C18148c.Heart
            goto L_0x03f6
        L_0x03fe:
            int r9 = OE.n.f113486x1
            r10 = 0
            java.lang.String r9 = J1.j.b(r9, r3, r10)
            wK.m3$g r12 = wK.C18405m3.g.f151252b
            wK.k3 r13 = wK.C18381k3.XSmall
            r10 = -609235876(0xffffffffdbafcc5c, float:-9.8965633E16)
            r3.W(r10)
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r44 & r10
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r11) goto L_0x0419
            r15 = r7
            goto L_0x041a
        L_0x0419:
            r15 = 0
        L_0x041a:
            r10 = r44 & 14
            r11 = 4
            if (r10 != r11) goto L_0x0421
            r10 = r7
            goto L_0x0422
        L_0x0421:
            r10 = 0
        L_0x0422:
            r10 = r10 | r15
            java.lang.Object r11 = r3.D()
            if (r10 != 0) goto L_0x0431
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0439
        L_0x0431:
            sG.c r11 = new sG.c
            r11.<init>(r6, r1)
            r3.u(r11)
        L_0x0439:
            r16 = r11
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            int r10 = wK.C18405m3.g.f151253c
            int r10 = r10 << 12
            r11 = 199680(0x30c00, float:2.79811E-40)
            r18 = r10 | r11
            r19 = 196(0xc4, float:2.75E-43)
            r10 = 0
            r11 = 1
            r14 = 0
            r15 = 0
            r17 = r3
            wK.C18357i3.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            XH.N r8 = XH.C16807N.f139792a
        L_0x0456:
            r3.P()
            uK.c r8 = uK.C18148c.ShoppingBagAdd
            int r8 = r8.m()
            int r9 = OE.n.f113479w1
            r10 = 0
            java.lang.String r9 = J1.j.b(r9, r3, r10)
            wK.m3$a r12 = wK.C18405m3.a.f151235b
            wK.k3 r13 = wK.C18381k3.Small
            r11 = 1320345526(0x4eb2dfb6, float:1.50050278E9)
            r3.W(r11)
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r44 & r11
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r14) goto L_0x047b
            r15 = r7
            goto L_0x047c
        L_0x047b:
            r15 = r10
        L_0x047c:
            r11 = r44 & 14
            r14 = 4
            if (r11 != r14) goto L_0x0482
            r10 = r7
        L_0x0482:
            r10 = r10 | r15
            java.lang.Object r11 = r3.D()
            if (r10 != 0) goto L_0x0491
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0499
        L_0x0491:
            sG.d r11 = new sG.d
            r11.<init>(r5, r1)
            r3.u(r11)
        L_0x0499:
            r16 = r11
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            int r10 = wK.C18405m3.a.f151236c
            int r10 = r10 << 12
            r18 = r10 | r33
            r19 = 204(0xcc, float:2.86E-43)
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r17 = r3
            wK.C18357i3.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.x()
            r3.x()
            r3.x()
            r8 = 2140715204(0x7f98b8c4, float:NaN)
            r3.W(r8)
            if (r2 <= r7) goto L_0x0517
            i1.c r7 = r35.n()
            r8 = r46
            androidx.compose.ui.d r0 = r8.a(r0, r7)
            float r7 = c2.h.B(r45)
            float r8 = c2.h.B(r45)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.j(r0, r7, r8)
            wK.s6 r11 = wK.C18480s6.XSmall
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "x "
            r0.append(r7)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
            r0 = 2140724231(0x7f98dc07, float:NaN)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r0 != r7) goto L_0x0505
            sG.e r0 = new sG.e
            r0.<init>()
            r3.u(r0)
        L_0x0505:
            r14 = r0
            nI.a r14 = (nI.C17631a) r14
            r3.P()
            r16 = 1575936(0x180c00, float:2.208357E-39)
            r17 = 52
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = r3
            wK.C18444p6.s(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0517:
            r3.P()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0526
            U0.C4895p.R()
        L_0x0526:
            U0.Y0 r8 = r3.n()
            if (r8 == 0) goto L_0x0543
            sG.f r9 = new sG.f
            r0 = r9
            r1 = r50
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r54
            r6 = r55
            r7 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sG.p.G(com.sugarcube.app.base.data.database.CachedCatalogItem, int, lF.a, boolean, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(CachedCatalogItem cachedCatalogItem, int i10, C14768a aVar, boolean z10, C17642l lVar, C17642l lVar2, int i11, C4889m mVar, int i12) {
        G(cachedCatalogItem, i10, aVar, z10, lVar, lVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void L(C15987c<C17847a> cVar, String str, C17642l<? super List<C17847a>, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<C17847a> cVar2 = cVar;
        String str2 = str;
        C17642l<? super List<C17847a>, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1103070336);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1103070336, i13, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.HeaderContent (CartDrawer.kt:260)");
            }
            androidx.compose.ui.d k11 = D.k(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), c2.h.B((float) 12), 0.0f, 2, (Object) null);
            I b10 = G.b(C5073d.f18068a.d(), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, k11);
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
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            nI.p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            mVar2 = k10;
            d1.b(J1.j.b(n.f113238L4, k10, 0), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).c().b(), mVar2, ImageMetadata.EDGE_MODE, 0, 65502);
            p(cVar2, str2, lVar2, mVar2, i13 & 1022);
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
            n11.a(new C17894l(cVar2, str2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C15987c cVar, String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        L(cVar, str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(KJ.C15987c<rG.C17847a> r24, java.lang.String r25, nI.C17642l<? super java.util.List<rG.C17847a>, XH.C16807N> r26, U0.C4889m r27, int r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = 142513741(0x87e964d, float:7.6612022E-34)
            r5 = r27
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            r14 = 4
            if (r5 != 0) goto L_0x0021
            boolean r5 = r15.V(r0)
            if (r5 == 0) goto L_0x001e
            r5 = r14
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r5 = r5 | r3
            goto L_0x0022
        L_0x0021:
            r5 = r3
        L_0x0022:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 32
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0043
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x0040
            r6 = r12
            goto L_0x0042
        L_0x0040:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r5 = r5 | r6
        L_0x0043:
            r13 = r5
            r5 = r13 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0057
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.L()
            r4 = r15
            goto L_0x0108
        L_0x0057:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0063
            r5 = -1
            java.lang.String r6 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.AddAllToBagButton (CartDrawer.kt:283)"
            U0.C4895p.S(r4, r13, r5, r6)
        L_0x0063:
            tF.p r4 = new tF.p
            int r5 = OE.n.f113293V
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            java.util.List r18 = YH.C16877v.e(r25)
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            int r5 = tF.C15091p.f131201d
            java.lang.String r4 = tF.C15084i.a(r4, r15, r5)
            O0.m r5 = O0.C4740m.f11185a
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r15, r7)
            long r6 = r6.A0()
            int r8 = O0.C4740m.f11199o
            int r16 = r8 << 12
            r17 = 14
            r8 = 0
            r10 = 0
            r18 = 0
            r22 = r13
            r12 = r18
            r14 = r15
            r23 = r15
            r15 = r16
            r16 = r17
            O0.l r9 = r5.b(r6, r8, r10, r12, r14, r15, r16)
            r5 = 1147285336(0x44622f58, float:904.73975)
            r15 = r23
            r15.W(r5)
            r5 = r22
            r6 = r5 & 896(0x380, float:1.256E-42)
            r7 = 0
            r8 = 1
            r10 = 256(0x100, float:3.59E-43)
            if (r6 != r10) goto L_0x00bd
            r6 = r8
            goto L_0x00be
        L_0x00bd:
            r6 = r7
        L_0x00be:
            r5 = r5 & 14
            r10 = 4
            if (r5 != r10) goto L_0x00c4
            r7 = r8
        L_0x00c4:
            r5 = r6 | r7
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x00d4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00dc
        L_0x00d4:
            sG.o r6 = new sG.o
            r6.<init>(r2, r0)
            r15.u(r6)
        L_0x00dc:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            sG.p$a r6 = new sG.p$a
            r6.<init>(r4)
            r4 = 54
            r7 = -1904855971(0xffffffff8e76345d, float:-3.0347053E-30)
            c1.a r14 = c1.c.e(r7, r8, r6, r15, r4)
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r17 = 494(0x1ee, float:6.92E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r15
            O0.C4744o.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0108
            U0.C4895p.R()
        L_0x0108:
            U0.Y0 r4 = r4.n()
            if (r4 == 0) goto L_0x0116
            sG.b r5 = new sG.b
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sG.p.p(KJ.c, java.lang.String, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17642l lVar, C15987c cVar) {
        lVar.invoke(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C15987c cVar, String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        p(cVar, str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(sG.r r17, KJ.C15987c<java.lang.String> r18, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r19, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a, XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, U0.C4889m r22, int r23) {
        /*
            r9 = r17
            r10 = r18
            r11 = r20
            r12 = r21
            r13 = r23
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "shoppingListItems"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -1588363654(0xffffffffa1537e7a, float:-7.165697E-19)
            r1 = r22
            U0.m r14 = r1.k(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0036
            boolean r1 = r14.V(r9)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r13
            goto L_0x0037
        L_0x0036:
            r1 = r13
        L_0x0037:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r14.V(r10)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r13 & 384(0x180, float:5.38E-43)
            r15 = r19
            if (r2 != 0) goto L_0x0059
            boolean r2 = r14.F(r15)
            if (r2 == 0) goto L_0x0056
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r2
        L_0x0059:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x006a
            boolean r2 = r14.F(r11)
            if (r2 == 0) goto L_0x0067
            r2 = r3
            goto L_0x0069
        L_0x0067:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0069:
            r1 = r1 | r2
        L_0x006a:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x007a
            boolean r2 = r14.F(r12)
            if (r2 == 0) goto L_0x0077
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0079
        L_0x0077:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0079:
            r1 = r1 | r2
        L_0x007a:
            r2 = r1 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r4) goto L_0x008c
            boolean r2 = r14.l()
            if (r2 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r14.L()
            goto L_0x0167
        L_0x008c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0098
            r2 = -1
            java.lang.String r4 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawer (CartDrawer.kt:96)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0098:
            XH.N r0 = XH.C16807N.f139792a
            r2 = -234030071(0xfffffffff20cfc09, float:-2.792486E30)
            r14.W(r2)
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x00a8
            r6 = r5
            goto L_0x00a9
        L_0x00a8:
            r6 = r4
        L_0x00a9:
            java.lang.Object r7 = r14.D()
            if (r6 != 0) goto L_0x00b7
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00c0
        L_0x00b7:
            sG.p$b r7 = new sG.p$b
            r6 = 0
            r7.<init>(r11, r6)
            r14.u(r7)
        L_0x00c0:
            nI.p r7 = (nI.p) r7
            r14.P()
            r6 = 6
            U0.P.g(r0, r7, r14, r6)
            r0 = -234025517(0xfffffffff20d0dd3, float:-2.7938623E30)
            r14.W(r0)
            if (r2 != r3) goto L_0x00d3
            r0 = r5
            goto L_0x00d4
        L_0x00d3:
            r0 = r4
        L_0x00d4:
            java.lang.Object r6 = r14.D()
            if (r0 != 0) goto L_0x00e2
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x00ea
        L_0x00e2:
            sG.a r6 = new sG.a
            r6.<init>(r11)
            r14.u(r6)
        L_0x00ea:
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r0 = -234022156(0xfffffffff20d1af4, float:-2.794878E30)
            r14.W(r0)
            if (r2 != r3) goto L_0x00f9
            r0 = r5
            goto L_0x00fa
        L_0x00f9:
            r0 = r4
        L_0x00fa:
            java.lang.Object r7 = r14.D()
            if (r0 != 0) goto L_0x0108
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x0110
        L_0x0108:
            sG.g r7 = new sG.g
            r7.<init>(r11)
            r14.u(r7)
        L_0x0110:
            nI.l r7 = (nI.C17642l) r7
            r14.P()
            r0 = -234015060(0xfffffffff20d36ac, float:-2.7970228E30)
            r14.W(r0)
            if (r2 != r3) goto L_0x011e
            r4 = r5
        L_0x011e:
            java.lang.Object r0 = r14.D()
            if (r4 != 0) goto L_0x012c
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0134
        L_0x012c:
            sG.h r0 = new sG.h
            r0.<init>(r11)
            r14.u(r0)
        L_0x0134:
            r8 = r0
            nI.a r8 = (nI.C17631a) r8
            r14.P()
            r0 = r1 & 14
            int r2 = r1 >> 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r1 = r1 << 9
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r16 = r0 | r1
            r0 = r17
            r1 = r6
            r2 = r21
            r3 = r7
            r4 = r18
            r5 = r19
            r6 = r8
            r7 = r14
            r8 = r16
            x(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0167
            U0.C4895p.R()
        L_0x0167:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x0182
            sG.i r8 = new sG.i
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sG.p.s(sG.r, KJ.c, nI.l, nI.l, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar, C17847a aVar) {
        C17542s.j(aVar, "it");
        lVar.invoke(new a.C17125e(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17642l lVar, List list) {
        C17542s.j(list, "it");
        lVar.invoke(new a.C17126f(list));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C17642l lVar) {
        lVar.invoke(a.C17129i.f142625a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(r rVar, C15987c cVar, C17642l lVar, C17642l lVar2, C17631a aVar, int i10, C4889m mVar, int i11) {
        s(rVar, cVar, lVar, lVar2, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(r rVar, C17642l<? super C17847a, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super List<C17847a>, C16807N> lVar2, C15987c<String> cVar, C17642l<? super CachedCatalogItem, C16807N> lVar3, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        List n10;
        int i12 = i10;
        C4889m k10 = mVar.k(-1068521138);
        r rVar2 = rVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.V(rVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        C17642l<? super C17847a, C16807N> lVar4 = lVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar4) ? 32 : 16;
        }
        C17631a<C16807N> aVar3 = aVar;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        C17642l<? super List<C17847a>, C16807N> lVar5 = lVar2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C15987c<String> cVar2 = cVar;
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(cVar2) ? 16384 : 8192;
        }
        C17642l<? super CachedCatalogItem, C16807N> lVar6 = lVar3;
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar6) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        C17631a<C16807N> aVar4 = aVar2;
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1068521138, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.cart.CartDrawerContent (CartDrawer.kt:127)");
            }
            Object[] objArr = new Object[0];
            k10.W(275847597);
            Object D10 = k10.D();
            C4889m.a aVar5 = C4889m.f14007a;
            if (D10 == aVar5.a()) {
                D10 = new C17892j();
                k10.u(D10);
            }
            k10.P();
            C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, k10, 3072, 6);
            k10.W(275849140);
            Object D11 = k10.D();
            if (D11 == aVar5.a()) {
                D11 = u1.e("", (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var2 = (C4899r0) D11;
            k10.P();
            CartUseCase.a c10 = rVar.c();
            if (c10 == null || (n10 = c10.a()) == null) {
                n10 = C16877v.n();
            }
            List list = n10;
            k10.W(275852821);
            Object D12 = k10.D();
            if (D12 == aVar5.a()) {
                D12 = new G0();
                k10.u(D12);
            }
            G0 g02 = (G0) D12;
            k10.P();
            Object D13 = k10.D();
            if (D13 == aVar5.a()) {
                B b10 = new B(U0.P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D13 = b10;
            }
            mVar2 = k10;
            C4762x0.a(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), (nI.p<? super C4889m, ? super Integer, C16807N>) null, (nI.p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-1253532524, true, new c(g02), k10, 54), (nI.p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(2120727325, true, new d(rVar, aVar, cVar, lVar, lVar3, r0Var, list, lVar2, r0Var2, ((B) D13).a(), aVar2, g02), k10, 54), mVar2, 805309446, 502);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C17893k(rVar, lVar, aVar, lVar2, cVar, lVar3, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean y(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final String z(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }
}
