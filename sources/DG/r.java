package DG;

import OE.q;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCatalogPage;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogItemVariants;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import rG.C17848b;
import rG.C17849c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040)8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010,R#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040.8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102¨\u0006;"}, d2 = {"LDG/r;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "LRF/r;", "variantsUseCase", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "cartUseCase", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "<init>", "(LOE/q;LRF/r;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;Lcom/sugarcube/app/base/data/user/UserRepo;)V", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "isFavorited", "LXH/N;", "G", "(Lcom/sugarcube/core/network/models/CatalogItem;Ljava/lang/Boolean;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "Lcom/sugarcube/app/base/data/Result;", "D", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "", "message", "F", "(Ljava/lang/String;)V", "", "messageId", "autoDismissDelay", "I", "(JJ)V", "m", "LOE/q;", "n", "LRF/r;", "o", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "p", "Lcom/sugarcube/app/base/data/user/UserRepo;", "LTJ/B;", "LDG/b;", "q", "LTJ/B;", "_state", "LTJ/P;", "r", "LTJ/P;", "getState", "()LTJ/P;", "state", "", "LrG/c;", "s", "_messagesFlow", "t", "E", "messagesFlow", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final q f133784m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final RF.r f133785n;

    /* renamed from: o  reason: collision with root package name */
    private final CartUseCase f133786o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final UserRepo f133787p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<C15524b> f133788q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C15524b> f133789r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<List<C17849c>> f133790s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<List<C17849c>> f133791t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerViewModel$updateProductInfoStateForItem$1", f = "ProductInfoDrawerViewModel.kt", l = {51}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f133792c;

        /* renamed from: d  reason: collision with root package name */
        Object f133793d;

        /* renamed from: e  reason: collision with root package name */
        int f133794e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r f133795f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CatalogItem f133796g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Boolean f133797h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, CatalogItem catalogItem, Boolean bool, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f133795f = rVar;
            this.f133796g = catalogItem;
            this.f133797h = bool;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f133795f, this.f133796g, this.f133797h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            LoggedInUser loggedInUser;
            Object f10 = C17187b.f();
            int i10 = this.f133794e;
            if (i10 == 0) {
                y.b(obj);
                LoggedInUser value = this.f133795f.f133787p.getUser().getValue();
                RF.r j10 = this.f133795f.f133785n;
                Integer id2 = this.f133796g.getId();
                int intValue = id2 != null ? id2.intValue() : 0;
                this.f133792c = value;
                this.f133793d = id2;
                this.f133794e = 1;
                Object a10 = j10.a(intValue, this);
                if (a10 == f10) {
                    return f10;
                }
                loggedInUser = value;
                obj2 = a10;
            } else if (i10 == 1) {
                Integer num = (Integer) this.f133793d;
                loggedInUser = (LoggedInUser) this.f133792c;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r rVar = this.f133795f;
            CatalogItem catalogItem = this.f133796g;
            Boolean bool = this.f133797h;
            if (x.e(obj2) == null) {
                C15524b.f133674o.a(rVar.f133788q, new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, catalogItem, 31, (DefaultConstructorMarker) null), (CatalogItemVariants) obj2, loggedInUser != null ? loggedInUser.getPostalCode() : null, loggedInUser != null ? loggedInUser.getPreferredStore() : null, rVar.f133784m.getCountry(), rVar.f133784m.getLanguage(), bool);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.productinfo.ProductInfoDrawerViewModel$userMessageShown$1", f = "ProductInfoDrawerViewModel.kt", l = {86}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f133799d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f133800e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f133801f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(long j10, r rVar, long j11, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f133799d = j10;
            this.f133800e = rVar;
            this.f133801f = j11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f133799d, this.f133800e, this.f133801f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133798c;
            if (i10 == 0) {
                y.b(obj);
                long j10 = this.f133799d;
                this.f133798c = 1;
                if (C16297b0.b(j10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j11 = this.f133801f;
            ArrayList arrayList = new ArrayList();
            for (Object next : (Iterable) this.f133800e.f133790s.getValue()) {
                if (((C17849c) next).a() != j11) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() != ((List) this.f133800e.f133790s.getValue()).size()) {
                this.f133800e.f133790s.a(arrayList);
            }
            return C16807N.f139792a;
        }
    }

    public r(q qVar, RF.r rVar, CartUseCase cartUseCase, UserRepo userRepo) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(rVar, "variantsUseCase");
        C17542s.j(cartUseCase, "cartUseCase");
        C17542s.j(userRepo, "userRepo");
        this.f133784m = qVar;
        this.f133785n = rVar;
        this.f133786o = cartUseCase;
        this.f133787p = userRepo;
        C16505B<C15524b> a10 = C16521S.a(null);
        this.f133788q = a10;
        this.f133789r = a10;
        C16505B<List<C17849c>> a11 = C16521S.a(C16877v.n());
        this.f133790s = a11;
        this.f133791t = C16534i.c(a11);
    }

    public static /* synthetic */ void H(r rVar, CatalogItem catalogItem, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        rVar.G(catalogItem, bool);
    }

    public static /* synthetic */ void J(r rVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 3000;
        }
        rVar.I(j10, j11);
    }

    public final Object D(CachedCatalogItem cachedCatalogItem, C17164e<? super Result<Boolean>> eVar) {
        return this.f133786o.addItemsToCart(C16877v.e(new C17848b(cachedCatalogItem, 1)), eVar);
    }

    public final C16519P<List<C17849c>> E() {
        return this.f133791t;
    }

    public final void F(String str) {
        C17542s.j(str, "message");
        this.f133790s.a(C16877v.W0(this.f133790s.getValue(), new C17849c(UUID.randomUUID().getMostSignificantBits(), str)));
    }

    public final void G(CatalogItem catalogItem, Boolean bool) {
        C17542s.j(catalogItem, "catalogItem");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, catalogItem, bool, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final void I(long j10, long j11) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(j11, this, j10, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final C16519P<C15524b> getState() {
        return this.f133789r;
    }
}
