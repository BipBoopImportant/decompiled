package DG;

import DG.C15524b;
import E1.I;
import EG.C15589b;
import EG.C15595h;
import G1.C4504g;
import N1.P;
import N1.Y;
import O0.C4740m;
import O0.C4742n;
import O0.C4744o;
import O0.d1;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
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
import XH.y;
import Y1.j;
import Y1.k;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCatalogPage;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import r0.m;
import rF.C15002a;
import rG.C17849c;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import t0.C5934A;
import t0.C5938c;
import t0.x;
import tK.C18030v;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001ao\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a»\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00000\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00000\u0018H\u0003¢\u0006\u0004\b \u0010!\u001a3\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\"\u0010#\u001a7\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0003¢\u0006\u0004\b&\u0010'\"\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/²\u0006\f\u0010.\u001a\u00020\t8\nX\u0002"}, d2 = {"LXH/N;", "G", "(LU0/m;I)V", "LDG/r;", "viewModel", "Landroidx/compose/ui/d;", "modifier", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "", "isInShoppingLists", "Lkotlin/Function0;", "onClose", "onAddItemToFav", "Lkotlin/Function2;", "onVariantSelected", "s", "(LDG/r;Landroidx/compose/ui/d;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLnI/a;LnI/a;LnI/p;LU0/m;II)V", "LDG/b;", "state", "LU0/A1;", "", "LrG/c;", "messages", "Lkotlin/Function1;", "onMessageShown", "onAddToBag", "Lcom/sugarcube/core/network/models/CatalogItem;", "LEG/b$a;", "onBuyOptionSelected", "LDG/b$b;", "onProductInformationAction", "A", "(Landroidx/compose/ui/d;LDG/b;LU0/A1;LnI/l;LnI/a;LnI/a;LnI/a;LnI/p;LnI/l;LnI/l;LU0/m;II)V", "q", "(Landroidx/compose/ui/d;LDG/b;LnI/a;LU0/m;II)V", "showPrice", "onClick", "o", "(Landroidx/compose/ui/d;LDG/b;ZLnI/a;LU0/m;II)V", "Lc2/h;", "a", "F", "L", "()F", "marginPadding", "isScrolledToTop", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final float f133759a = c2.h.B((float) 14);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements nI.q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f133760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15524b f133761b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: DG.q$a$a  reason: collision with other inner class name */
        static final class C3295a implements nI.q<l0.e, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15524b f133762a;

            C3295a(C15524b bVar) {
                this.f133762a = bVar;
            }

            public final void a(l0.e eVar, C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                C17542s.j(eVar, "$this$AnimatedVisibility");
                if (C4895p.J()) {
                    C4895p.S(-1832665029, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.AddToBagButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:378)");
                }
                C15524b bVar = this.f133762a;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar2, 0);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
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
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                C5844O.a(J.y(aVar, c2.h.B((float) 6)), mVar2, 6);
                String f10 = bVar.g().f();
                C18030v vVar = C18030v.f147664a;
                int i11 = C18030v.f147665b;
                Y b12 = vVar.b(mVar2, i11).a().b();
                d1.b(f10, (androidx.compose.ui.d) null, vVar.a(mVar2, i11).F0(), 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, b12, mVar, ImageMetadata.EDGE_MODE, 0, 65498);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        a(boolean z10, C15524b bVar) {
            this.f133760a = z10;
            this.f133761b = bVar;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(948330487, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.AddToBagButton.<anonymous>.<anonymous> (ProductInfoDrawer.kt:365)");
                }
                androidx.compose.ui.d j10 = D.j(androidx.compose.ui.d.f18749a, c2.h.B((float) 24), c2.h.B((float) 8));
                C5437c.C0386c i12 = C5437c.f24302a.i();
                boolean z10 = this.f133760a;
                C15524b bVar = this.f133761b;
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
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar.d());
                C5843N n10 = C5843N.f28726a;
                String b12 = J1.j.b(n.f113479w1, mVar2, 0);
                C18030v vVar = C18030v.f147664a;
                int i13 = C18030v.f147665b;
                Y b13 = vVar.b(mVar2, i13).a().b();
                d1.b(b12, (androidx.compose.ui.d) null, vVar.a(mVar2, i13).F0(), 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, b13, mVar, ImageMetadata.EDGE_MODE, 0, 65498);
                l0.d.f(n10, z10, (androidx.compose.ui.d) null, (androidx.compose.animation.i) null, (androidx.compose.animation.k) null, (String) null, c1.c.e(-1832665029, true, new C3295a(bVar), mVar, 54), mVar, 1572870, 30);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerKt$ProductInfoDrawer$2$1", f = "ProductInfoDrawer.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133763c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f133764d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f133765e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f133766f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, CachedCatalogItem cachedCatalogItem, boolean z10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f133764d = rVar;
            this.f133765e = cachedCatalogItem;
            this.f133766f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f133764d, this.f133765e, this.f133766f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f133763c == 0) {
                y.b(obj);
                this.f133764d.G(this.f133765e.getCatalogItem(), kotlin.coroutines.jvm.internal.b.a(this.f133766f));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerKt$ProductInfoDrawer$4$1$1", f = "ProductInfoDrawer.kt", l = {123}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f133768d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f133769e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f133770f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar, CachedCatalogItem cachedCatalogItem, Context context, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f133768d = rVar;
            this.f133769e = cachedCatalogItem;
            this.f133770f = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f133768d, this.f133769e, this.f133770f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f133767c;
            if (i10 == 0) {
                y.b(obj);
                r rVar = this.f133768d;
                CachedCatalogItem cachedCatalogItem = this.f133769e;
                this.f133767c = 1;
                obj = rVar.D(cachedCatalogItem, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Error) {
                str = ((Result.Error) result).getMessage();
            } else if (result instanceof Result.Success) {
                Context context = this.f133770f;
                int i11 = n.f113169A1;
                String upperCase = this.f133769e.getName().toUpperCase(Locale.ROOT);
                C17542s.i(upperCase, "toUpperCase(...)");
                str = context.getString(i11, new Object[]{upperCase});
                C17542s.i(str, "getString(...)");
            } else {
                throw new t();
            }
            this.f133768d.F(str);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15524b f133771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f133772b;

        d(C15524b bVar, C17631a<C16807N> aVar) {
            this.f133771a = bVar;
            this.f133772b = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(36487630, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:211)");
                }
                q.q(D.i(J.C(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), q.L()), this.f133771a, this.f133772b, mVar, 6, 0);
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
    static final class e implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15524b f133773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f133774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f133775c;

        e(C15524b bVar, C17631a<C16807N> aVar, A1<Boolean> a12) {
            this.f133773a = bVar;
            this.f133774b = aVar;
            this.f133775c = a12;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$stickyHeader");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-371541743, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:223)");
                }
                q.o(D.j(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), q.L(), c2.h.B((float) 12)), this.f133773a, !q.D(this.f133775c), this.f133774b, mVar, 6, 0);
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
    static final class f implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15524b f133776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<CatalogItem, Boolean, C16807N> f133777b;

        f(C15524b bVar, p<? super CatalogItem, ? super Boolean, C16807N> pVar) {
            this.f133776a = bVar;
            this.f133777b = pVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(362350725, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:238)");
                }
                FG.j.i(D.k(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), q.L(), 0.0f, 2, (Object) null), (FG.l) null, this.f133776a.h(), this.f133777b, mVar, 6, 2);
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
    static final class g implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f133778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15524b f133779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C15589b.a, C16807N> f133780c;

        g(float f10, C15524b bVar, C17642l<? super C15589b.a, C16807N> lVar) {
            this.f133778a = f10;
            this.f133779b = bVar;
            this.f133780c = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(246642950, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:248)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                C5844O.a(D.k(aVar, 0.0f, this.f133778a, 1, (Object) null), mVar, 6);
                C15595h.h(J.h(aVar, 0.0f, 1, (Object) null), this.f133779b, this.f133780c, mVar, 6, 0);
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
    static final class h implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C17849c, C16807N> f133781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17849c f133782b;

        h(C17642l<? super C17849c, C16807N> lVar, C17849c cVar) {
            this.f133781a = lVar;
            this.f133782b = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1865905483, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:278)");
                }
                this.f133781a.invoke(this.f133782b);
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
    static final class i implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17849c f133783a;

        i(C17849c cVar) {
            this.f133783a = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-893515182, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent.<anonymous>.<anonymous>.<anonymous> (ProductInfoDrawer.kt:280)");
                }
                d1.b(this.f133783a.b(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
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

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void A(androidx.compose.ui.d r34, DG.C15524b r35, U0.A1<? extends java.util.List<rG.C17849c>> r36, nI.C17642l<? super rG.C17849c, XH.C16807N> r37, nI.C17631a<XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, nI.C17631a<XH.C16807N> r40, nI.p<? super com.sugarcube.core.network.models.CatalogItem, ? super java.lang.Boolean, XH.C16807N> r41, nI.C17642l<? super EG.C15589b.a, XH.C16807N> r42, nI.C17642l<? super DG.C15524b.C3294b, XH.C16807N> r43, U0.C4889m r44, int r45, int r46) {
        /*
            r8 = r35
            r9 = r37
            r11 = r45
            r12 = r46
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = 128(0x80, float:1.794E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 32
            r6 = 16
            r7 = 4
            r13 = 1268467162(0x4b9b45da, float:2.0351924E7)
            r14 = r44
            U0.m r15 = r14.k(r13)
            r14 = 1
            r16 = r12 & 1
            r10 = 2
            if (r16 == 0) goto L_0x0027
            r17 = r11 | 6
            r14 = r34
            goto L_0x003d
        L_0x0027:
            r17 = r11 & 6
            r14 = r34
            if (r17 != 0) goto L_0x003b
            boolean r17 = r15.V(r14)
            if (r17 == 0) goto L_0x0036
            r17 = r7
            goto L_0x0038
        L_0x0036:
            r17 = r10
        L_0x0038:
            r17 = r11 | r17
            goto L_0x003d
        L_0x003b:
            r17 = r11
        L_0x003d:
            r18 = r12 & 2
            if (r18 == 0) goto L_0x0046
            r17 = r17 | 48
        L_0x0043:
            r1 = r17
            goto L_0x0058
        L_0x0046:
            r18 = r11 & 48
            if (r18 != 0) goto L_0x0043
            boolean r18 = r15.F(r8)
            if (r18 == 0) goto L_0x0053
            r18 = r5
            goto L_0x0055
        L_0x0053:
            r18 = r6
        L_0x0055:
            r17 = r17 | r18
            goto L_0x0043
        L_0x0058:
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0060
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r7 = r36
            goto L_0x0073
        L_0x0060:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r36
            boolean r17 = r15.V(r7)
            if (r17 == 0) goto L_0x006f
            r17 = r4
            goto L_0x0071
        L_0x006f:
            r17 = r3
        L_0x0071:
            r1 = r1 | r17
        L_0x0073:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007a:
            r10 = r11 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x008a
            boolean r10 = r15.F(r9)
            if (r10 == 0) goto L_0x0087
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r1 = r1 | r10
        L_0x008a:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0093
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r10 = r38
            goto L_0x00a6
        L_0x0093:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0090
            r10 = r38
            boolean r17 = r15.F(r10)
            if (r17 == 0) goto L_0x00a2
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r1 = r1 | r17
        L_0x00a6:
            r5 = r5 & r12
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00b0
            r1 = r1 | r17
            r14 = r39
            goto L_0x00c3
        L_0x00b0:
            r17 = r11 & r17
            r14 = r39
            if (r17 != 0) goto L_0x00c3
            boolean r18 = r15.F(r14)
            if (r18 == 0) goto L_0x00bf
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r18
        L_0x00c3:
            r18 = r12 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00ce
            r1 = r1 | r19
            r14 = r40
            goto L_0x00e1
        L_0x00ce:
            r18 = r11 & r19
            r14 = r40
            if (r18 != 0) goto L_0x00e1
            boolean r19 = r15.F(r14)
            if (r19 == 0) goto L_0x00dd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r19
        L_0x00e1:
            r3 = r3 & r12
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00eb
            r1 = r1 | r19
        L_0x00e8:
            r3 = r41
            goto L_0x00fe
        L_0x00eb:
            r3 = r11 & r19
            if (r3 != 0) goto L_0x00e8
            r3 = r41
            boolean r19 = r15.F(r3)
            if (r19 == 0) goto L_0x00fa
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r19
        L_0x00fe:
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0105
            r1 = r1 | r2
            r4 = r42
            goto L_0x0116
        L_0x0105:
            r2 = r2 & r11
            r4 = r42
            if (r2 != 0) goto L_0x0116
            boolean r2 = r15.F(r4)
            if (r2 == 0) goto L_0x0113
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r2
        L_0x0116:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r2 & r1
            r14 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r14) goto L_0x0130
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x0126
            goto L_0x0130
        L_0x0126:
            r15.L()
            r1 = r34
            r6 = r39
            r8 = r15
            goto L_0x0496
        L_0x0130:
            if (r16 == 0) goto L_0x0135
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0137
        L_0x0135:
            r2 = r34
        L_0x0137:
            if (r5 == 0) goto L_0x013c
            r31 = 0
            goto L_0x013e
        L_0x013c:
            r31 = r39
        L_0x013e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x014a
            r5 = -1
            java.lang.String r14 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerContent (ProductInfoDrawer.kt:165)"
            U0.C4895p.S(r13, r1, r5, r14)
        L_0x014a:
            if (r8 != 0) goto L_0x017c
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0155
            U0.C4895p.R()
        L_0x0155:
            U0.Y0 r13 = r15.n()
            if (r13 == 0) goto L_0x017b
            DG.d r14 = new DG.d
            r0 = r14
            r1 = r2
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r31
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r45
            r12 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x017b:
            return
        L_0x017c:
            float r3 = (float) r6
            float r6 = c2.h.B(r3)
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            i1.c$a r28 = i1.C5437c.f24302a
            i1.c r3 = r28.o()
            r4 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r4)
            int r5 = U0.C4883j.a(r15, r4)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r13)
            G1.g$a r30 = G1.C4504g.f6515W
            nI.a r4 = r30.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x01a9
            U0.C4883j.c()
        L_0x01a9:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x01b6
            r15.p(r4)
            goto L_0x01b9
        L_0x01b6:
            r15.t()
        L_0x01b9:
            U0.m r4 = U0.F1.a(r15)
            nI.p r7 = r30.c()
            U0.F1.c(r4, r3, r7)
            nI.p r3 = r30.e()
            U0.F1.c(r4, r14, r3)
            nI.p r3 = r30.b()
            boolean r7 = r4.i()
            if (r7 != 0) goto L_0x01e3
            java.lang.Object r7 = r4.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x01f1
        L_0x01e3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.w(r5, r3)
        L_0x01f1:
            nI.p r3 = r30.d()
            U0.F1.c(r4, r0, r3)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r0.g()
            i1.c$b r4 = r28.k()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r15, r5)
            int r4 = U0.C4883j.a(r15, r5)
            U0.y r5 = r15.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r15, r2)
            r32 = r2
            nI.a r2 = r30.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0224
            U0.C4883j.c()
        L_0x0224:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0231
            r15.p(r2)
            goto L_0x0234
        L_0x0231:
            r15.t()
        L_0x0234:
            U0.m r2 = U0.F1.a(r15)
            r33 = r7
            nI.p r7 = r30.c()
            U0.F1.c(r2, r3, r7)
            nI.p r3 = r30.e()
            U0.F1.c(r2, r5, r3)
            nI.p r3 = r30.b()
            boolean r5 = r2.i()
            if (r5 != 0) goto L_0x0260
            java.lang.Object r5 = r2.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x026e
        L_0x0260:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.w(r4, r3)
        L_0x026e:
            nI.p r3 = r30.d()
            U0.F1.c(r2, r14, r3)
            s0.h r2 = s0.C5862h.f28810a
            DG.a r2 = DG.C15523a.f133671a
            nI.p r2 = r2.a()
            r3 = 3
            int r4 = r1 >> 3
            r3 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 24624(0x6030, float:3.4506E-41)
            r24 = 229(0xe5, float:3.21E-43)
            r14 = 0
            r16 = 0
            r4 = 1
            r5 = 0
            r20 = 0
            r21 = 0
            r7 = 1
            r34 = r15
            r15 = r2
            r17 = r38
            r18 = r4
            r19 = r5
            r22 = r34
            r23 = r3
            AG.C15408p.b(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r13, r2, r7, r3)
            androidx.compose.foundation.layout.d$e r0 = r0.f()
            i1.c$c r5 = r28.l()
            r14 = 0
            r15 = r34
            E1.I r0 = androidx.compose.foundation.layout.G.b(r0, r5, r15, r14)
            int r5 = U0.C4883j.a(r15, r14)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            nI.a r2 = r30.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x02ce
            U0.C4883j.c()
        L_0x02ce:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x02db
            r15.p(r2)
            goto L_0x02de
        L_0x02db:
            r15.t()
        L_0x02de:
            U0.m r2 = U0.F1.a(r15)
            nI.p r3 = r30.c()
            U0.F1.c(r2, r0, r3)
            nI.p r0 = r30.e()
            U0.F1.c(r2, r14, r0)
            nI.p r0 = r30.b()
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x0308
            java.lang.Object r3 = r2.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 != 0) goto L_0x0316
        L_0x0308:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.w(r3, r0)
        L_0x0316:
            nI.p r0 = r30.d()
            U0.F1.c(r2, r4, r0)
            s0.N r0 = s0.C5843N.f28726a
            java.util.List r2 = r35.e()
            r3 = 1034414368(0x3da7e920, float:0.08198762)
            r15.W(r3)
            if (r2 != 0) goto L_0x032d
            r7 = r15
            goto L_0x0357
        L_0x032d:
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.d(r13, r4, r7, r3)
            float r14 = f133759a
            r7 = 2
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.k(r5, r14, r4, r7, r3)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r14 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r18 = 0
            r19 = 4
            r16 = 0
            r7 = r15
            r15 = r2
            r17 = r7
            kF.C14728x.c(r14, r15, r16, r17, r18, r19)
            XH.N r2 = XH.C16807N.f139792a
        L_0x0357:
            r7.P()
            r2 = 0
            r3 = 3
            t0.A r15 = t0.C5935B.c(r2, r2, r7, r2, r3)
            r3 = 1034427832(0x3da81db8, float:0.082087934)
            r7.W(r3)
            java.lang.Object r3 = r7.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r5 = r4.a()
            if (r3 != r5) goto L_0x037e
            DG.e r3 = new DG.e
            r3.<init>(r15)
            U0.A1 r3 = U0.p1.e(r3)
            r7.u(r3)
        L_0x037e:
            r5 = r3
            U0.A1 r5 = (U0.A1) r5
            r7.P()
            r2 = 0
            r3 = 0
            r14 = 1
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.d(r13, r2, r14, r3)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r16 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r0 = 1034439096(0x3da849b8, float:0.08217186)
            r7.W(r0)
            boolean r0 = r7.F(r8)
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r3) goto L_0x03ac
            r2 = r14
            goto L_0x03ad
        L_0x03ac:
            r2 = 0
        L_0x03ad:
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r3) goto L_0x03b7
            r2 = r14
            goto L_0x03b8
        L_0x03b7:
            r2 = 0
        L_0x03b8:
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 != r3) goto L_0x03c2
            r2 = r14
            goto L_0x03c3
        L_0x03c2:
            r2 = 0
        L_0x03c3:
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 != r2) goto L_0x03cd
            r1 = r14
            goto L_0x03ce
        L_0x03cd:
            r1 = 0
        L_0x03ce:
            r0 = r0 | r1
            java.lang.Object r1 = r7.D()
            if (r0 != 0) goto L_0x03e0
            java.lang.Object r0 = r4.a()
            if (r1 != r0) goto L_0x03dc
            goto L_0x03e0
        L_0x03dc:
            r8 = r7
            r10 = r33
            goto L_0x03f9
        L_0x03e0:
            DG.f r4 = new DG.f
            r0 = r4
            r1 = r35
            r2 = r31
            r3 = r40
            r14 = r4
            r4 = r5
            r5 = r41
            r8 = r7
            r10 = r33
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.u(r14)
            r1 = r14
        L_0x03f9:
            r22 = r1
            nI.l r22 = (nI.C17642l) r22
            r8.P()
            r24 = 0
            r25 = 252(0xfc, float:3.53E-43)
            r0 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r16
            r16 = r0
            r23 = r8
            t0.C5937b.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8.x()
            r8.x()
            java.lang.Object r0 = r36.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = YH.C16877v.y0(r0)
            rG.c r0 = (rG.C17849c) r0
            r1 = -931606093(0xffffffffc878d1b3, float:-254790.8)
            r8.W(r1)
            if (r0 != 0) goto L_0x0433
            goto L_0x0483
        L_0x0433:
            i1.c r1 = r28.b()
            androidx.compose.ui.d r14 = r10.a(r13, r1)
            r1 = 12
            float r1 = (float) r1
            float r18 = c2.h.B(r1)
            r19 = 7
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            DG.q$h r1 = new DG.q$h
            r1.<init>(r9, r0)
            r2 = 1865905483(0x6f37754b, float:5.6777555E28)
            r3 = 1
            r4 = 54
            c1.a r16 = c1.c.e(r2, r3, r1, r8, r4)
            DG.q$i r1 = new DG.q$i
            r1.<init>(r0)
            r0 = -893515182(0xffffffffcabe0a52, float:-6227241.0)
            c1.a r27 = c1.c.e(r0, r3, r1, r8, r4)
            r29 = 805306752(0x30000180, float:4.656826E-10)
            r30 = 506(0x1fa, float:7.09E-43)
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r28 = r8
            O0.M0.c(r14, r15, r16, r17, r18, r19, r21, r23, r25, r27, r28, r29, r30)
            XH.N r0 = XH.C16807N.f139792a
        L_0x0483:
            r8.P()
            r8.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0492
            U0.C4895p.R()
        L_0x0492:
            r6 = r31
            r1 = r32
        L_0x0496:
            U0.Y0 r13 = r8.n()
            if (r13 == 0) goto L_0x04b9
            DG.g r14 = new DG.g
            r0 = r14
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r45
            r12 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x04b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: DG.q.A(androidx.compose.ui.d, DG.b, U0.A1, nI.l, nI.a, nI.a, nI.a, nI.p, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(androidx.compose.ui.d dVar, C15524b bVar, A1 a12, C17642l lVar, C17631a aVar, C17631a aVar2, C17631a aVar3, p pVar, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        A(dVar, bVar, a12, lVar, aVar, aVar2, aVar3, pVar, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean C(C5934A a10) {
        return a10.s() == 0;
    }

    /* access modifiers changed from: private */
    public static final boolean D(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C15524b bVar, C17631a aVar, C17631a aVar2, A1 a12, p pVar, float f10, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x xVar2 = xVar;
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(36487630, true, new d(bVar, aVar)), 3, (Object) null);
        x.l(xVar2, (Object) null, (Object) null, c1.c.c(-371541743, true, new e(bVar, aVar2, a12)), 3, (Object) null);
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(362350725, true, new f(bVar, pVar)), 3, (Object) null);
        x.i(xVar, (Object) null, (Object) null, c1.c.c(246642950, true, new g(f10, bVar, lVar)), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(androidx.compose.ui.d dVar, C15524b bVar, A1 a12, C17642l lVar, C17631a aVar, C17631a aVar2, C17631a aVar3, p pVar, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        A(dVar, bVar, a12, lVar, aVar, aVar2, aVar3, pVar, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void G(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1576136993);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1576136993, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.Separator (ProductInfoDrawer.kt:72)");
            }
            C5844O.a(androidx.compose.foundation.b.d(J.i(D.k(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), f133759a, 0.0f, 2, (Object) null), c2.h.B((float) 1)), C18030v.f147664a.a(k10, C18030v.f147665b).z0(), (i1) null, 2, (Object) null), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N H(int i10, C4889m mVar, int i11) {
        G(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final float L() {
        return f133759a;
    }

    /* access modifiers changed from: private */
    public static final void o(androidx.compose.ui.d dVar, C15524b bVar, boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        d.a aVar2;
        C4889m mVar2;
        C15524b bVar2 = bVar;
        boolean z11 = z10;
        int i13 = i10;
        C4889m k10 = mVar.k(-705280623);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(bVar2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i13 & 384) == 0) {
            i12 |= k10.b(z11) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            C17631a<C16807N> aVar3 = aVar;
        } else {
            C17631a<C16807N> aVar4 = aVar;
            if ((i13 & 3072) == 0) {
                i12 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        int i15 = i12;
        if ((i15 & 1171) != 1170 || !k10.l()) {
            aVar2 = i14 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-705280623, i15, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.AddToBagButton (ProductInfoDrawer.kt:352)");
            }
            androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), C15002a.a(k10, 0).p(), (i1) null, 2, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
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
            C4889m mVar3 = k10;
            int i16 = ((i15 >> 9) & 14) | 805306368 | ((i15 << 3) & 112);
            mVar2 = k10;
            C4744o.a(aVar, aVar2, false, (i1) null, C4740m.f11185a.b(C18030v.f147664a.a(k10, C18030v.f147665b).A0(), 0, 0, 0, k10, C4740m.f11199o << 12, 14), (C4742n) null, (C5601g) null, (C5834E) null, (m) null, c1.c.e(948330487, true, new a(z11, bVar2), k10, 54), mVar2, i16, 492);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            aVar2 = dVar2;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C15525c(aVar2, bVar, z10, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(androidx.compose.ui.d dVar, C15524b bVar, boolean z10, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        o(dVar, bVar, z10, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(androidx.compose.ui.d r34, DG.C15524b r35, nI.C17631a<XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r4 = r38
            r0 = 6
            r1 = -1778477050(0xffffffff95fe9806, float:-1.02829634E-25)
            r2 = r37
            U0.m r2 = r2.k(r1)
            r3 = 1
            r5 = r39 & 1
            r14 = 4
            r15 = 2
            if (r5 == 0) goto L_0x0019
            r6 = r4 | 6
            r7 = r6
            r6 = r34
            goto L_0x002d
        L_0x0019:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x002a
            r6 = r34
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x0027
            r7 = r14
            goto L_0x0028
        L_0x0027:
            r7 = r15
        L_0x0028:
            r7 = r7 | r4
            goto L_0x002d
        L_0x002a:
            r6 = r34
            r7 = r4
        L_0x002d:
            r8 = r39 & 2
            if (r8 == 0) goto L_0x0036
            r7 = r7 | 48
            r13 = r35
            goto L_0x0048
        L_0x0036:
            r8 = r4 & 48
            r13 = r35
            if (r8 != 0) goto L_0x0048
            boolean r8 = r2.F(r13)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r7 = r7 | r8
        L_0x0048:
            r8 = r39 & 4
            if (r8 == 0) goto L_0x0052
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r9 = r36
        L_0x0050:
            r12 = r7
            goto L_0x0065
        L_0x0052:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004e
            r9 = r36
            boolean r10 = r2.F(r9)
            if (r10 == 0) goto L_0x0061
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r7 = r7 | r10
            goto L_0x0050
        L_0x0065:
            r7 = r12 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r7 != r10) goto L_0x0079
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r2.L()
            r1 = r6
            r3 = r9
            goto L_0x0325
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x007f
        L_0x007e:
            r5 = r6
        L_0x007f:
            if (r8 == 0) goto L_0x0084
            r30 = 0
            goto L_0x0086
        L_0x0084:
            r30 = r9
        L_0x0086:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0092
            r6 = -1
            java.lang.String r7 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductDescription (ProductInfoDrawer.kt:292)"
            U0.C4895p.S(r1, r12, r6, r7)
        L_0x0092:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r1.f()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r8 = r7.l()
            r9 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r8, r2, r9)
            int r8 = U0.C4883j.a(r2, r9)
            U0.y r10 = r2.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r2, r5)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r14 = r16.a()
            U0.f r17 = r2.m()
            if (r17 != 0) goto L_0x00be
            U0.C4883j.c()
        L_0x00be:
            r2.I()
            boolean r17 = r2.i()
            if (r17 == 0) goto L_0x00cb
            r2.p(r14)
            goto L_0x00ce
        L_0x00cb:
            r2.t()
        L_0x00ce:
            U0.m r14 = U0.F1.a(r2)
            nI.p r15 = r16.c()
            U0.F1.c(r14, r6, r15)
            nI.p r6 = r16.e()
            U0.F1.c(r14, r10, r6)
            nI.p r6 = r16.b()
            boolean r10 = r14.i()
            if (r10 != 0) goto L_0x00f8
            java.lang.Object r10 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r15)
            if (r10 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r14.u(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.w(r8, r6)
        L_0x0106:
            nI.p r6 = r16.d()
            U0.F1.c(r14, r11, r6)
            s0.N r18 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r19 = r14
            androidx.compose.ui.d r6 = s0.C5842M.e(r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$b r7 = r7.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r7, r2, r9)
            int r7 = U0.C4883j.a(r2, r9)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r2, r6)
            nI.a r10 = r16.a()
            U0.f r11 = r2.m()
            if (r11 != 0) goto L_0x0144
            U0.C4883j.c()
        L_0x0144:
            r2.I()
            boolean r11 = r2.i()
            if (r11 == 0) goto L_0x0151
            r2.p(r10)
            goto L_0x0154
        L_0x0151:
            r2.t()
        L_0x0154:
            U0.m r10 = U0.F1.a(r2)
            nI.p r11 = r16.c()
            U0.F1.c(r10, r1, r11)
            nI.p r1 = r16.e()
            U0.F1.c(r10, r8, r1)
            nI.p r1 = r16.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x017e
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x018c
        L_0x017e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r1)
        L_0x018c:
            nI.p r1 = r16.d()
            U0.F1.c(r10, r6, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = -854337695(0xffffffffcd13d761, float:-1.55022864E8)
            r2.W(r1)
            java.lang.String r1 = r35.f()
            r6 = -854337231(0xffffffffcd13d931, float:-1.55030288E8)
            r2.W(r6)
            r15 = 0
            if (r1 != 0) goto L_0x01ae
            r33 = r5
            r31 = r12
            r0 = 2
            goto L_0x0209
        L_0x01ae:
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.w r8 = r6.b(r2, r7)
            tK.r r8 = r8.c()
            N1.Y r25 = r8.e()
            tK.h r6 = r6.a(r2, r7)
            long r7 = r6.G0()
            r28 = 0
            r29 = 65530(0xfffa, float:9.1827E-41)
            r6 = 0
            r10 = 0
            r9 = r10
            r11 = 0
            r0 = 0
            r16 = 0
            r31 = r12
            r12 = r16
            r13 = r16
            r18 = 0
            r32 = r14
            r0 = 2
            r14 = r18
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r33 = r5
            r5 = r1
            r26 = r2
            O0.d1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float r1 = (float) r0
            float r1 = c2.h.B(r1)
            r14 = r32
            r5 = 0
            r15 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r14, r15, r1, r3, r5)
            r5 = 6
            s0.C5844O.a(r1, r2, r5)
            XH.N r1 = XH.C16807N.f139792a
        L_0x0209:
            r2.P()
            java.lang.String r5 = r35.d()
            r1 = -854326143(0xffffffffcd140481, float:-1.55207696E8)
            r2.W(r1)
            if (r5 != 0) goto L_0x021b
            r1 = r14
            r0 = r15
            goto L_0x025d
        L_0x021b:
            tK.v r1 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.w r7 = r1.b(r2, r6)
            tK.c r7 = r7.a()
            N1.Y r25 = r7.b()
            tK.h r1 = r1.a(r2, r6)
            long r7 = r1.G0()
            r28 = 0
            r29 = 65530(0xfffa, float:9.1827E-41)
            r6 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r1 = r14
            r0 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r2
            O0.d1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            XH.N r5 = XH.C16807N.f139792a
        L_0x025d:
            r2.P()
            r5 = 4
            float r15 = (float) r5
            float r5 = c2.h.B(r15)
            r6 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r1, r0, r5, r3, r6)
            r5 = 6
            s0.C5844O.a(r3, r2, r5)
            lF.a r3 = r35.g()
            java.lang.String r5 = r3.e()
            lF.a r3 = r35.g()
            java.lang.String r6 = r3.d()
            lF.a r3 = r35.g()
            java.lang.String r7 = r3.a()
            lF.a r3 = r35.g()
            wK.t2 r8 = r3.c()
            lF.a r3 = r35.g()
            wK.r2 r11 = r3.b()
            wK.h7 r9 = wK.C18349h7.Size600
            wK.i7 r12 = wK.C18361i7.MixedSize
            r22 = 0
            r23 = 32544(0x7f20, float:4.5604E-41)
            r10 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r24 = r15
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 12607488(0xc06000, float:1.7666854E-38)
            r20 = r2
            wK.C18540x6.f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            XH.N r3 = XH.C16807N.f139792a
            r2.P()
            r2.x()
            float r3 = c2.h.B(r24)
            r5 = 2
            r6 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r1, r3, r0, r5, r6)
            r1 = 6
            s0.C5844O.a(r0, r2, r1)
            r0 = 380813960(0x16b2c288, float:2.8880217E-25)
            r2.W(r0)
            if (r30 != 0) goto L_0x02d5
            goto L_0x0312
        L_0x02d5:
            java.lang.Boolean r0 = r35.i()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x02e9
            uK.c r0 = uK.C18148c.HeartFilled
        L_0x02e3:
            int r0 = r0.m()
            r5 = r0
            goto L_0x02ec
        L_0x02e9:
            uK.c r0 = uK.C18148c.Heart
            goto L_0x02e3
        L_0x02ec:
            int r0 = OE.n.f113486x1
            r1 = 0
            java.lang.String r6 = J1.j.b(r0, r2, r1)
            wK.m3$g r9 = wK.C18405m3.g.f151252b
            wK.k3 r10 = wK.C18381k3.XSmall
            int r0 = wK.C18405m3.g.f151253c
            int r0 = r0 << 12
            r1 = 199680(0x30c00, float:2.79811E-40)
            r0 = r0 | r1
            int r1 = r31 << 18
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r3
            r15 = r0 | r1
            r16 = 196(0xc4, float:2.75E-43)
            r7 = 0
            r8 = 1
            r11 = 0
            r12 = 0
            r13 = r30
            r14 = r2
            wK.C18357i3.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0312:
            r2.P()
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0321
            U0.C4895p.R()
        L_0x0321:
            r3 = r30
            r1 = r33
        L_0x0325:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x033a
            DG.h r7 = new DG.h
            r0 = r7
            r2 = r35
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: DG.q.q(androidx.compose.ui.d, DG.b, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(androidx.compose.ui.d dVar, C15524b bVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        q(dVar, bVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: nI.p} */
    /* JADX WARNING: type inference failed for: r5v12, types: [dI.i] */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v75 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(DG.r r25, androidx.compose.ui.d r26, com.sugarcube.app.base.data.database.CachedCatalogItem r27, boolean r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, nI.p<? super com.sugarcube.app.base.data.database.CachedCatalogItem, ? super java.lang.Boolean, XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r3 = r27
            r4 = r28
            r15 = r29
            r14 = r31
            r13 = r33
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onVariantSelected"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 474205621(0x1c43cdb5, float:6.478596E-22)
            r1 = r32
            U0.m r1 = r1.k(r0)
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0034
            r2 = r34 & 1
            if (r2 != 0) goto L_0x002f
            r2 = r25
            boolean r5 = r1.F(r2)
            if (r5 == 0) goto L_0x0031
            r5 = 4
            goto L_0x0032
        L_0x002f:
            r2 = r25
        L_0x0031:
            r5 = 2
        L_0x0032:
            r5 = r5 | r13
            goto L_0x0037
        L_0x0034:
            r2 = r25
            r5 = r13
        L_0x0037:
            r16 = r34 & 2
            if (r16 == 0) goto L_0x0040
            r5 = r5 | 48
            r12 = r26
            goto L_0x0052
        L_0x0040:
            r6 = r13 & 48
            r12 = r26
            if (r6 != 0) goto L_0x0052
            boolean r6 = r1.V(r12)
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r5 = r5 | r6
        L_0x0052:
            r6 = r34 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x006a
            boolean r6 = r1.V(r3)
            if (r6 == 0) goto L_0x0067
            r6 = r11
            goto L_0x0069
        L_0x0067:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r5 = r5 | r6
        L_0x006a:
            r6 = r34 & 8
            r10 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0073
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0073:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0082
            boolean r6 = r1.b(r4)
            if (r6 == 0) goto L_0x007f
            r6 = r10
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r5 = r5 | r6
        L_0x0082:
            r6 = r34 & 16
            if (r6 == 0) goto L_0x0089
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0089:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0099
            boolean r6 = r1.F(r15)
            if (r6 == 0) goto L_0x0096
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r5 = r5 | r6
        L_0x0099:
            r17 = r34 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a3
            r5 = r5 | r6
            r9 = r30
            goto L_0x00b4
        L_0x00a3:
            r6 = r6 & r13
            r9 = r30
            if (r6 != 0) goto L_0x00b4
            boolean r6 = r1.F(r9)
            if (r6 == 0) goto L_0x00b1
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r5 = r5 | r6
        L_0x00b4:
            r6 = r34 & 64
            r8 = 1048576(0x100000, float:1.469368E-39)
            r7 = 1572864(0x180000, float:2.204052E-39)
            if (r6 == 0) goto L_0x00c0
            r5 = r5 | r7
        L_0x00bd:
            r18 = r5
            goto L_0x00d0
        L_0x00c0:
            r6 = r13 & r7
            if (r6 != 0) goto L_0x00bd
            boolean r6 = r1.F(r14)
            if (r6 == 0) goto L_0x00cc
            r6 = r8
            goto L_0x00ce
        L_0x00cc:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r5 = r5 | r6
            goto L_0x00bd
        L_0x00d0:
            r5 = 599187(0x92493, float:8.3964E-40)
            r5 = r18 & r5
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r6) goto L_0x00e7
            boolean r5 = r1.l()
            if (r5 != 0) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            r1.L()
            r6 = r9
            goto L_0x0355
        L_0x00e7:
            r1.G()
            r5 = r13 & 1
            r7 = 0
            r6 = 0
            if (r5 == 0) goto L_0x010b
            boolean r5 = r1.O()
            if (r5 == 0) goto L_0x00f7
            goto L_0x010b
        L_0x00f7:
            r1.L()
            r5 = r34 & 1
            if (r5 == 0) goto L_0x0100
            r18 = r18 & -15
        L_0x0100:
            r5 = r7
            r21 = r9
            r6 = r18
            r18 = r12
            r12 = r2
            r2 = r11
            goto L_0x0184
        L_0x010b:
            r5 = r34 & 1
            if (r5 == 0) goto L_0x016c
            r2 = 1890788296(0x70b323c8, float:4.435286E29)
            r1.C(r2)
            m3.a r2 = m3.a.f26247a
            int r5 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r2.a(r1, r5)
            if (r2 == 0) goto L_0x0164
            androidx.lifecycle.i0$c r19 = f3.a.a(r2, r1, r6)
            r5 = 1729797275(0x671a9c9b, float:7.301333E23)
            r1.C(r5)
            boolean r5 = r2 instanceof androidx.lifecycle.C5212o
            if (r5 == 0) goto L_0x0137
            r5 = r2
            androidx.lifecycle.o r5 = (androidx.lifecycle.C5212o) r5
            l3.a r5 = r5.getDefaultViewModelCreationExtras()
        L_0x0134:
            r20 = r5
            goto L_0x013a
        L_0x0137:
            l3.a$a r5 = l3.a.C0407a.f25486b
            goto L_0x0134
        L_0x013a:
            r21 = 36936(0x9048, float:5.1758E-41)
            r22 = 0
            java.lang.Class<DG.r> r5 = DG.r.class
            r23 = 0
            r6 = r2
            r2 = r7
            r7 = r23
            r2 = r8
            r8 = r19
            r9 = r20
            r2 = r10
            r10 = r1
            r2 = r11
            r11 = r21
            r12 = r22
            androidx.lifecycle.f0 r5 = m3.c.b(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.U()
            r1.U()
            DG.r r5 = (DG.r) r5
            r18 = r18 & -15
            r6 = r5
            r5 = 0
            goto L_0x0170
        L_0x0164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x016c:
            r5 = r7
            r2 = r11
            r6 = r25
        L_0x0170:
            if (r16 == 0) goto L_0x0175
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            goto L_0x0177
        L_0x0175:
            r7 = r26
        L_0x0177:
            if (r17 == 0) goto L_0x0181
            r21 = r5
        L_0x017b:
            r12 = r6
            r6 = r18
            r18 = r7
            goto L_0x0184
        L_0x0181:
            r21 = r30
            goto L_0x017b
        L_0x0184:
            r1.y()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0193
            r7 = -1
            java.lang.String r8 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawer (ProductInfoDrawer.kt:99)"
            U0.C4895p.S(r0, r6, r7, r8)
        L_0x0193:
            if (r3 != 0) goto L_0x01bf
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x019e
            U0.C4895p.R()
        L_0x019e:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x01be
            DG.j r11 = new DG.j
            r0 = r11
            r1 = r12
            r2 = r18
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r21
            r7 = r31
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x01be:
            return
        L_0x01bf:
            java.lang.Object r0 = r1.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r8 = r7.a()
            if (r0 != r8) goto L_0x01da
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r1)
            U0.B r8 = new U0.B
            r8.<init>(r0)
            r1.u(r8)
            r0 = r8
        L_0x01da:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            U0.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r1.Q(r8)
            android.content.Context r8 = (android.content.Context) r8
            TJ.P r9 = r12.getState()
            r10 = 1
            r11 = 0
            U0.A1 r9 = U0.p1.b(r9, r5, r1, r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r11 = "-"
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r11 = 400303015(0x17dc23a7, float:1.4226167E-24)
            r1.W(r11)
            boolean r11 = r1.F(r12)
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != r2) goto L_0x0219
            r17 = 1
            goto L_0x021b
        L_0x0219:
            r17 = 0
        L_0x021b:
            r11 = r11 | r17
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            r13 = 2048(0x800, float:2.87E-42)
            if (r2 != r13) goto L_0x0225
            r2 = 1
            goto L_0x0226
        L_0x0225:
            r2 = 0
        L_0x0226:
            r2 = r2 | r11
            java.lang.Object r11 = r1.D()
            if (r2 != 0) goto L_0x0236
            java.lang.Object r2 = r7.a()
            if (r11 != r2) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r2 = 0
            goto L_0x023f
        L_0x0236:
            DG.q$b r11 = new DG.q$b
            r2 = 0
            r11.<init>(r12, r3, r4, r2)
            r1.u(r11)
        L_0x023f:
            nI.p r11 = (nI.p) r11
            r1.P()
            r13 = 0
            U0.P.g(r10, r11, r1, r13)
            java.lang.Object r9 = r9.getValue()
            DG.b r9 = (DG.C15524b) r9
            TJ.P r10 = r12.E()
            r11 = 1
            U0.A1 r2 = U0.p1.b(r10, r2, r1, r13, r11)
            r10 = 400312811(0x17dc49eb, float:1.4235826E-24)
            r1.W(r10)
            boolean r10 = r1.F(r12)
            java.lang.Object r11 = r1.D()
            if (r10 != 0) goto L_0x026d
            java.lang.Object r10 = r7.a()
            if (r11 != r10) goto L_0x0275
        L_0x026d:
            DG.k r11 = new DG.k
            r11.<init>(r12)
            r1.u(r11)
        L_0x0275:
            r10 = r11
            nI.l r10 = (nI.C17642l) r10
            r1.P()
            r11 = 400318477(0x17dc600d, float:1.4241413E-24)
            r1.W(r11)
            boolean r11 = r1.F(r0)
            boolean r16 = r1.F(r12)
            r11 = r11 | r16
            r13 = 256(0x100, float:3.59E-43)
            if (r5 != r13) goto L_0x0291
            r5 = 1
            goto L_0x0292
        L_0x0291:
            r5 = 0
        L_0x0292:
            r5 = r5 | r11
            boolean r11 = r1.F(r8)
            r5 = r5 | r11
            java.lang.Object r11 = r1.D()
            if (r5 != 0) goto L_0x02a4
            java.lang.Object r5 = r7.a()
            if (r11 != r5) goto L_0x02ac
        L_0x02a4:
            DG.l r11 = new DG.l
            r11.<init>(r0, r12, r3, r8)
            r1.u(r11)
        L_0x02ac:
            nI.a r11 = (nI.C17631a) r11
            r1.P()
            r0 = 400334913(0x17dca041, float:1.4257621E-24)
            r1.W(r0)
            boolean r0 = r1.F(r12)
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r6
            r8 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r8) goto L_0x02c5
            r24 = 1
            goto L_0x02c7
        L_0x02c5:
            r24 = 0
        L_0x02c7:
            r0 = r0 | r24
            java.lang.Object r5 = r1.D()
            if (r0 != 0) goto L_0x02d5
            java.lang.Object r0 = r7.a()
            if (r5 != r0) goto L_0x02dd
        L_0x02d5:
            DG.m r5 = new DG.m
            r5.<init>(r12, r14)
            r1.u(r5)
        L_0x02dd:
            r0 = r5
            nI.p r0 = (nI.p) r0
            r1.P()
            r5 = 400343866(0x17dcc33a, float:1.4266449E-24)
            r1.W(r5)
            java.lang.Object r5 = r1.D()
            java.lang.Object r8 = r7.a()
            if (r5 != r8) goto L_0x02fb
            DG.n r5 = new DG.n
            r5.<init>()
            r1.u(r5)
        L_0x02fb:
            r13 = r5
            nI.l r13 = (nI.C17642l) r13
            r1.P()
            r5 = 400345897(0x17dccb29, float:1.4268452E-24)
            r1.W(r5)
            java.lang.Object r5 = r1.D()
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0319
            DG.o r5 = new DG.o
            r5.<init>()
            r1.u(r5)
        L_0x0319:
            r16 = r5
            nI.l r16 = (nI.C17642l) r16
            r1.P()
            int r5 = r6 >> 3
            r5 = r5 & 14
            r7 = 905969664(0x36000000, float:1.9073486E-6)
            r5 = r5 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r6
            r5 = r5 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r7
            r17 = r5 | r6
            r19 = 0
            r5 = r18
            r6 = r9
            r7 = r2
            r8 = r10
            r9 = r29
            r10 = r21
            r2 = r12
            r12 = r0
            r14 = r16
            r15 = r1
            r16 = r17
            r17 = r19
            A(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0351
            U0.C4895p.R()
        L_0x0351:
            r12 = r18
            r6 = r21
        L_0x0355:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0372
            DG.p r11 = new DG.p
            r0 = r11
            r1 = r2
            r2 = r12
            r3 = r27
            r4 = r28
            r5 = r29
            r7 = r31
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0372:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: DG.q.s(DG.r, androidx.compose.ui.d, com.sugarcube.app.base.data.database.CachedCatalogItem, boolean, nI.a, nI.a, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(r rVar, androidx.compose.ui.d dVar, CachedCatalogItem cachedCatalogItem, boolean z10, C17631a aVar, C17631a aVar2, p pVar, int i10, int i11, C4889m mVar, int i12) {
        s(rVar, dVar, cachedCatalogItem, z10, aVar, aVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C15589b.a aVar) {
        C17542s.j(aVar, "buyOption");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C15524b.C3294b bVar) {
        C17542s.j(bVar, "productInformationAction");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(r rVar, androidx.compose.ui.d dVar, CachedCatalogItem cachedCatalogItem, boolean z10, C17631a aVar, C17631a aVar2, p pVar, int i10, int i11, C4889m mVar, int i12) {
        s(rVar, dVar, cachedCatalogItem, z10, aVar, aVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(r rVar, C17849c cVar) {
        C17542s.j(cVar, "message");
        r.J(rVar, cVar.a(), 0, 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(Q q10, r rVar, CachedCatalogItem cachedCatalogItem, Context context) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new c(rVar, cachedCatalogItem, context, (C17164e<? super c>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(r rVar, p pVar, CatalogItem catalogItem, boolean z10) {
        C17542s.j(catalogItem, "variant");
        r.H(rVar, catalogItem, (Boolean) null, 2, (Object) null);
        pVar.invoke(new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, catalogItem, 31, (DefaultConstructorMarker) null), Boolean.valueOf(z10));
        return C16807N.f139792a;
    }
}
