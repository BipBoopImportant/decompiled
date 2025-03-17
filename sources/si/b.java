package si;

import Kf.y;
import QJ.M;
import aA.C13909a;
import bK.C17052a;
import com.ingka.ikea.app.providers.cart.db.CartItemDatabase;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nA.C14838a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001aH@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001aH@¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0014H@¢\u0006\u0004\b\"\u0010\u0010J\u0010\u0010#\u001a\u00020\u0014H@¢\u0006\u0004\b#\u0010\u0010J\u0010\u0010$\u001a\u00020\u0014H@¢\u0006\u0004\b$\u0010\u0010J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u001aH@¢\u0006\u0004\b&\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lsi/b;", "Lri/a;", "Lti/a;", "cartNetworkWrapper", "LaA/a;", "sessionManager", "Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "database", "LQJ/M;", "cartCoroutineDispatcher", "LnA/a;", "getUserIdFromTokenUseCase", "<init>", "(Lti/a;LaA/a;Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;LQJ/M;LnA/a;)V", "LLn/g;", "h", "(LdI/e;)Ljava/lang/Object;", "", "LKf/y;", "items", "LXH/N;", "j", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "item", "n", "(LKf/y;LdI/e;)Ljava/lang/Object;", "", "itemNumber", "g", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "promotionCode", "f", "code", "b", "d", "e", "c", "guestToken", "t", "Lti/a;", "i", "LaA/a;", "LnA/a;", "LbK/a;", "k", "LbK/a;", "mutex", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends ri.a {

    /* renamed from: h  reason: collision with root package name */
    private final ti.a f76562h;

    /* renamed from: i  reason: collision with root package name */
    private final C13909a f76563i;

    /* renamed from: j  reason: collision with root package name */
    private final C14838a f76564j;

    /* renamed from: k  reason: collision with root package name */
    private final C17052a f76565k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {279, 73}, m = "addToCartSuspended")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76566c;

        /* renamed from: d  reason: collision with root package name */
        Object f76567d;

        /* renamed from: e  reason: collision with root package name */
        Object f76568e;

        /* renamed from: f  reason: collision with root package name */
        Object f76569f;

        /* renamed from: g  reason: collision with root package name */
        Object f76570g;

        /* renamed from: h  reason: collision with root package name */
        Object f76571h;

        /* renamed from: i  reason: collision with root package name */
        Object f76572i;

        /* renamed from: j  reason: collision with root package name */
        int f76573j;

        /* renamed from: k  reason: collision with root package name */
        int f76574k;

        /* renamed from: l  reason: collision with root package name */
        int f76575l;

        /* renamed from: m  reason: collision with root package name */
        int f76576m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f76577n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ b f76578o;

        /* renamed from: p  reason: collision with root package name */
        int f76579p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f76578o = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76577n = obj;
            this.f76579p |= Integer.MIN_VALUE;
            return this.f76578o.j((List<y>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 171}, m = "clearCart")
    /* renamed from: si.b$b  reason: collision with other inner class name */
    static final class C1410b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76580c;

        /* renamed from: d  reason: collision with root package name */
        Object f76581d;

        /* renamed from: e  reason: collision with root package name */
        Object f76582e;

        /* renamed from: f  reason: collision with root package name */
        Object f76583f;

        /* renamed from: g  reason: collision with root package name */
        Object f76584g;

        /* renamed from: h  reason: collision with root package name */
        Object f76585h;

        /* renamed from: i  reason: collision with root package name */
        int f76586i;

        /* renamed from: j  reason: collision with root package name */
        int f76587j;

        /* renamed from: k  reason: collision with root package name */
        int f76588k;

        /* renamed from: l  reason: collision with root package name */
        int f76589l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f76590m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b f76591n;

        /* renamed from: o  reason: collision with root package name */
        int f76592o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1410b(b bVar, C17164e<? super C1410b> eVar) {
            super(eVar);
            this.f76591n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76590m = obj;
            this.f76592o |= Integer.MIN_VALUE;
            return this.f76591n.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 159}, m = "clearEmployeeDiscountAgreedTerms")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76593c;

        /* renamed from: d  reason: collision with root package name */
        Object f76594d;

        /* renamed from: e  reason: collision with root package name */
        Object f76595e;

        /* renamed from: f  reason: collision with root package name */
        Object f76596f;

        /* renamed from: g  reason: collision with root package name */
        Object f76597g;

        /* renamed from: h  reason: collision with root package name */
        Object f76598h;

        /* renamed from: i  reason: collision with root package name */
        Object f76599i;

        /* renamed from: j  reason: collision with root package name */
        Object f76600j;

        /* renamed from: k  reason: collision with root package name */
        Object f76601k;

        /* renamed from: l  reason: collision with root package name */
        Object f76602l;

        /* renamed from: m  reason: collision with root package name */
        Object f76603m;

        /* renamed from: n  reason: collision with root package name */
        Object f76604n;

        /* renamed from: o  reason: collision with root package name */
        Object f76605o;

        /* renamed from: p  reason: collision with root package name */
        int f76606p;

        /* renamed from: q  reason: collision with root package name */
        int f76607q;

        /* renamed from: r  reason: collision with root package name */
        int f76608r;

        /* renamed from: s  reason: collision with root package name */
        int f76609s;

        /* renamed from: t  reason: collision with root package name */
        int f76610t;

        /* renamed from: u  reason: collision with root package name */
        int f76611u;

        /* renamed from: v  reason: collision with root package name */
        int f76612v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f76613w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f76614x;

        /* renamed from: y  reason: collision with root package name */
        int f76615y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f76614x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76613w = obj;
            this.f76615y |= Integer.MIN_VALUE;
            return this.f76614x.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 105}, m = "deleteCartItem")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76616c;

        /* renamed from: d  reason: collision with root package name */
        Object f76617d;

        /* renamed from: e  reason: collision with root package name */
        Object f76618e;

        /* renamed from: f  reason: collision with root package name */
        Object f76619f;

        /* renamed from: g  reason: collision with root package name */
        Object f76620g;

        /* renamed from: h  reason: collision with root package name */
        Object f76621h;

        /* renamed from: i  reason: collision with root package name */
        Object f76622i;

        /* renamed from: j  reason: collision with root package name */
        Object f76623j;

        /* renamed from: k  reason: collision with root package name */
        Object f76624k;

        /* renamed from: l  reason: collision with root package name */
        Object f76625l;

        /* renamed from: m  reason: collision with root package name */
        Object f76626m;

        /* renamed from: n  reason: collision with root package name */
        Object f76627n;

        /* renamed from: o  reason: collision with root package name */
        Object f76628o;

        /* renamed from: p  reason: collision with root package name */
        Object f76629p;

        /* renamed from: q  reason: collision with root package name */
        int f76630q;

        /* renamed from: r  reason: collision with root package name */
        int f76631r;

        /* renamed from: s  reason: collision with root package name */
        int f76632s;

        /* renamed from: t  reason: collision with root package name */
        int f76633t;

        /* renamed from: u  reason: collision with root package name */
        int f76634u;

        /* renamed from: v  reason: collision with root package name */
        int f76635v;

        /* renamed from: w  reason: collision with root package name */
        int f76636w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f76637x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b f76638y;

        /* renamed from: z  reason: collision with root package name */
        int f76639z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f76638y = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76637x = obj;
            this.f76639z |= Integer.MIN_VALUE;
            return this.f76638y.g((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 133}, m = "deleteDiscount")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76640c;

        /* renamed from: d  reason: collision with root package name */
        Object f76641d;

        /* renamed from: e  reason: collision with root package name */
        Object f76642e;

        /* renamed from: f  reason: collision with root package name */
        Object f76643f;

        /* renamed from: g  reason: collision with root package name */
        Object f76644g;

        /* renamed from: h  reason: collision with root package name */
        Object f76645h;

        /* renamed from: i  reason: collision with root package name */
        Object f76646i;

        /* renamed from: j  reason: collision with root package name */
        Object f76647j;

        /* renamed from: k  reason: collision with root package name */
        Object f76648k;

        /* renamed from: l  reason: collision with root package name */
        Object f76649l;

        /* renamed from: m  reason: collision with root package name */
        Object f76650m;

        /* renamed from: n  reason: collision with root package name */
        Object f76651n;

        /* renamed from: o  reason: collision with root package name */
        Object f76652o;

        /* renamed from: p  reason: collision with root package name */
        Object f76653p;

        /* renamed from: q  reason: collision with root package name */
        int f76654q;

        /* renamed from: r  reason: collision with root package name */
        int f76655r;

        /* renamed from: s  reason: collision with root package name */
        int f76656s;

        /* renamed from: t  reason: collision with root package name */
        int f76657t;

        /* renamed from: u  reason: collision with root package name */
        int f76658u;

        /* renamed from: v  reason: collision with root package name */
        int f76659v;

        /* renamed from: w  reason: collision with root package name */
        int f76660w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f76661x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b f76662y;

        /* renamed from: z  reason: collision with root package name */
        int f76663z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f76662y = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76661x = obj;
            this.f76663z |= Integer.MIN_VALUE;
            return this.f76662y.b((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 52}, m = "fetchCartSuspended")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76664c;

        /* renamed from: d  reason: collision with root package name */
        Object f76665d;

        /* renamed from: e  reason: collision with root package name */
        Object f76666e;

        /* renamed from: f  reason: collision with root package name */
        Object f76667f;

        /* renamed from: g  reason: collision with root package name */
        Object f76668g;

        /* renamed from: h  reason: collision with root package name */
        Object f76669h;

        /* renamed from: i  reason: collision with root package name */
        Object f76670i;

        /* renamed from: j  reason: collision with root package name */
        Object f76671j;

        /* renamed from: k  reason: collision with root package name */
        Object f76672k;

        /* renamed from: l  reason: collision with root package name */
        Object f76673l;

        /* renamed from: m  reason: collision with root package name */
        Object f76674m;

        /* renamed from: n  reason: collision with root package name */
        Object f76675n;

        /* renamed from: o  reason: collision with root package name */
        Object f76676o;

        /* renamed from: p  reason: collision with root package name */
        int f76677p;

        /* renamed from: q  reason: collision with root package name */
        int f76678q;

        /* renamed from: r  reason: collision with root package name */
        int f76679r;

        /* renamed from: s  reason: collision with root package name */
        int f76680s;

        /* renamed from: t  reason: collision with root package name */
        int f76681t;

        /* renamed from: u  reason: collision with root package name */
        int f76682u;

        /* renamed from: v  reason: collision with root package name */
        int f76683v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f76684w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f76685x;

        /* renamed from: y  reason: collision with root package name */
        int f76686y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f76685x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76684w = obj;
            this.f76686y |= Integer.MIN_VALUE;
            return this.f76685x.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 212}, m = "migrateGuestCart")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76687c;

        /* renamed from: d  reason: collision with root package name */
        Object f76688d;

        /* renamed from: e  reason: collision with root package name */
        Object f76689e;

        /* renamed from: f  reason: collision with root package name */
        Object f76690f;

        /* renamed from: g  reason: collision with root package name */
        Object f76691g;

        /* renamed from: h  reason: collision with root package name */
        Object f76692h;

        /* renamed from: i  reason: collision with root package name */
        Object f76693i;

        /* renamed from: j  reason: collision with root package name */
        Object f76694j;

        /* renamed from: k  reason: collision with root package name */
        Object f76695k;

        /* renamed from: l  reason: collision with root package name */
        Object f76696l;

        /* renamed from: m  reason: collision with root package name */
        Object f76697m;

        /* renamed from: n  reason: collision with root package name */
        Object f76698n;

        /* renamed from: o  reason: collision with root package name */
        int f76699o;

        /* renamed from: p  reason: collision with root package name */
        int f76700p;

        /* renamed from: q  reason: collision with root package name */
        int f76701q;

        /* renamed from: r  reason: collision with root package name */
        int f76702r;

        /* renamed from: s  reason: collision with root package name */
        int f76703s;

        /* renamed from: t  reason: collision with root package name */
        int f76704t;

        /* renamed from: u  reason: collision with root package name */
        int f76705u;

        /* renamed from: v  reason: collision with root package name */
        int f76706v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f76707w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f76708x;

        /* renamed from: y  reason: collision with root package name */
        int f76709y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f76708x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76707w = obj;
            this.f76709y |= Integer.MIN_VALUE;
            return this.f76708x.t((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 119}, m = "putDiscount")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76710c;

        /* renamed from: d  reason: collision with root package name */
        Object f76711d;

        /* renamed from: e  reason: collision with root package name */
        Object f76712e;

        /* renamed from: f  reason: collision with root package name */
        Object f76713f;

        /* renamed from: g  reason: collision with root package name */
        Object f76714g;

        /* renamed from: h  reason: collision with root package name */
        Object f76715h;

        /* renamed from: i  reason: collision with root package name */
        Object f76716i;

        /* renamed from: j  reason: collision with root package name */
        Object f76717j;

        /* renamed from: k  reason: collision with root package name */
        Object f76718k;

        /* renamed from: l  reason: collision with root package name */
        Object f76719l;

        /* renamed from: m  reason: collision with root package name */
        Object f76720m;

        /* renamed from: n  reason: collision with root package name */
        Object f76721n;

        /* renamed from: o  reason: collision with root package name */
        Object f76722o;

        /* renamed from: p  reason: collision with root package name */
        Object f76723p;

        /* renamed from: q  reason: collision with root package name */
        int f76724q;

        /* renamed from: r  reason: collision with root package name */
        int f76725r;

        /* renamed from: s  reason: collision with root package name */
        int f76726s;

        /* renamed from: t  reason: collision with root package name */
        int f76727t;

        /* renamed from: u  reason: collision with root package name */
        int f76728u;

        /* renamed from: v  reason: collision with root package name */
        int f76729v;

        /* renamed from: w  reason: collision with root package name */
        int f76730w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f76731x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b f76732y;

        /* renamed from: z  reason: collision with root package name */
        int f76733z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f76732y = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76731x = obj;
            this.f76733z |= Integer.MIN_VALUE;
            return this.f76732y.f((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 146}, m = "setEmployeeDiscountAgreedTerms")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76734c;

        /* renamed from: d  reason: collision with root package name */
        Object f76735d;

        /* renamed from: e  reason: collision with root package name */
        Object f76736e;

        /* renamed from: f  reason: collision with root package name */
        Object f76737f;

        /* renamed from: g  reason: collision with root package name */
        Object f76738g;

        /* renamed from: h  reason: collision with root package name */
        Object f76739h;

        /* renamed from: i  reason: collision with root package name */
        Object f76740i;

        /* renamed from: j  reason: collision with root package name */
        Object f76741j;

        /* renamed from: k  reason: collision with root package name */
        Object f76742k;

        /* renamed from: l  reason: collision with root package name */
        Object f76743l;

        /* renamed from: m  reason: collision with root package name */
        Object f76744m;

        /* renamed from: n  reason: collision with root package name */
        Object f76745n;

        /* renamed from: o  reason: collision with root package name */
        Object f76746o;

        /* renamed from: p  reason: collision with root package name */
        int f76747p;

        /* renamed from: q  reason: collision with root package name */
        int f76748q;

        /* renamed from: r  reason: collision with root package name */
        int f76749r;

        /* renamed from: s  reason: collision with root package name */
        int f76750s;

        /* renamed from: t  reason: collision with root package name */
        int f76751t;

        /* renamed from: u  reason: collision with root package name */
        int f76752u;

        /* renamed from: v  reason: collision with root package name */
        int f76753v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f76754w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f76755x;

        /* renamed from: y  reason: collision with root package name */
        int f76756y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f76755x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76754w = obj;
            this.f76756y |= Integer.MIN_VALUE;
            return this.f76755x.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.CartRepositoryV2", f = "CartRepositoryV2.kt", l = {234, 89}, m = "updateCartItem")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76757c;

        /* renamed from: d  reason: collision with root package name */
        Object f76758d;

        /* renamed from: e  reason: collision with root package name */
        Object f76759e;

        /* renamed from: f  reason: collision with root package name */
        Object f76760f;

        /* renamed from: g  reason: collision with root package name */
        Object f76761g;

        /* renamed from: h  reason: collision with root package name */
        Object f76762h;

        /* renamed from: i  reason: collision with root package name */
        Object f76763i;

        /* renamed from: j  reason: collision with root package name */
        Object f76764j;

        /* renamed from: k  reason: collision with root package name */
        Object f76765k;

        /* renamed from: l  reason: collision with root package name */
        Object f76766l;

        /* renamed from: m  reason: collision with root package name */
        Object f76767m;

        /* renamed from: n  reason: collision with root package name */
        Object f76768n;

        /* renamed from: o  reason: collision with root package name */
        Object f76769o;

        /* renamed from: p  reason: collision with root package name */
        Object f76770p;

        /* renamed from: q  reason: collision with root package name */
        int f76771q;

        /* renamed from: r  reason: collision with root package name */
        int f76772r;

        /* renamed from: s  reason: collision with root package name */
        int f76773s;

        /* renamed from: t  reason: collision with root package name */
        int f76774t;

        /* renamed from: u  reason: collision with root package name */
        int f76775u;

        /* renamed from: v  reason: collision with root package name */
        int f76776v;

        /* renamed from: w  reason: collision with root package name */
        int f76777w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f76778x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b f76779y;

        /* renamed from: z  reason: collision with root package name */
        int f76780z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f76779y = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76778x = obj;
            this.f76780z |= Integer.MIN_VALUE;
            return this.f76779y.n((y) null, this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(ti.a r7, aA.C13909a r8, com.ingka.ikea.app.providers.cart.db.CartItemDatabase r9, QJ.M r10, nA.C14838a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L_0x0011
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r12 = "newSingleThreadExecutor(...)"
            kotlin.jvm.internal.C17542s.i(r10, r12)
            QJ.v0 r10 = QJ.C16340x0.c(r10)
        L_0x0011:
            r4 = r10
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.<init>(ti.a, aA.a, com.ingka.ikea.app.providers.cart.db.CartItemDatabase, QJ.M, nA.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0 A[SYNTHETIC, Splitter:B:25:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0191 A[EDGE_INSN: B:65:0x0191->B:66:? ?: BREAK  , SYNTHETIC, Splitter:B:65:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0216 A[LOOP:2: B:63:0x017a->B:90:0x0216, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0173 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof si.b.e
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$e r2 = (si.b.e) r2
            int r3 = r2.f76663z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76663z = r3
            goto L_0x001c
        L_0x0017:
            si.b$e r2 = new si.b$e
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76661x
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76663z
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x008a
            if (r5 == r7) goto L_0x0070
            if (r5 != r6) goto L_0x0068
            java.lang.Object r0 = r2.f76652o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76651n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76650m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76649l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76648k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76647j
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76646i
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76644g
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76643f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76642e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76641d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76640c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x01cc
        L_0x0065:
            r0 = move-exception
            goto L_0x01fa
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0070:
            int r0 = r2.f76654q
            java.lang.Object r5 = r2.f76643f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76642e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76641d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.f76640c
            si.b r12 = (si.b) r12
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            r10 = r5
            r5 = r11
            goto L_0x00a7
        L_0x008a:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76640c = r1
            r5 = r21
            r2.f76641d = r5
            r2.f76642e = r0
            r2.f76643f = r3
            r2.f76654q = r8
            r2.f76663z = r7
            java.lang.Object r10 = r3.e(r9, r2)
            if (r10 != r4) goto L_0x00a4
            return r4
        L_0x00a4:
            r12 = r1
            r10 = r3
            r3 = r8
        L_0x00a7:
            qv.e r11 = qv.e.DEBUG     // Catch:{ all -> 0x016f }
            qv.d r13 = qv.d.f102012a     // Catch:{ all -> 0x016f }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x016f }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x016f }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x016f }
            r15.<init>()     // Catch:{ all -> 0x016f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x016f }
        L_0x00ba:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x016f }
            if (r14 == 0) goto L_0x00d6
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00d2 }
            r7 = r14
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x00d2 }
            boolean r7 = r7.b(r11, r8)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00d0
            r15.add(r14)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            r7 = 1
            goto L_0x00ba
        L_0x00d2:
            r0 = move-exception
            r1 = r9
            goto L_0x021a
        L_0x00d6:
            java.util.Iterator r7 = r15.iterator()     // Catch:{ all -> 0x016f }
            r13 = r9
            r14 = r13
            r16 = r15
        L_0x00de:
            boolean r17 = r7.hasNext()     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0173
            java.lang.Object r19 = r7.next()     // Catch:{ all -> 0x016f }
            r16 = r19
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x016f }
            r8 = 0
            if (r13 != 0) goto L_0x0100
            java.lang.String r6 = "Delete discounts"
            java.lang.String r6 = qv.C11818a.a(r6, r8)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00fc
            r9 = r15
            r1 = r19
            goto L_0x0176
        L_0x00fc:
            java.lang.String r13 = qv.C11820c.a(r6)     // Catch:{ all -> 0x00d2 }
        L_0x0100:
            r6 = r13
            if (r14 != 0) goto L_0x0152
            java.lang.Class r13 = r12.getClass()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x00d2 }
            kotlin.jvm.internal.C17542s.g(r13)     // Catch:{ all -> 0x00d2 }
            r14 = 36
            r8 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            r1 = 46
            java.lang.String r1 = HJ.C15854t.o1(r14, r1, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            int r8 = r1.length()     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.String r8 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r1, r8)     // Catch:{ all -> 0x00d2 }
        L_0x0128:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "main"
            r14 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r14)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = "m"
            goto L_0x013e
        L_0x013c:
            java.lang.String r1 = "b"
        L_0x013e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "|"
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            r8.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x00d2 }
        L_0x0152:
            r1 = r14
            r8 = 0
            r13 = r16
            r14 = r11
            r9 = r15
            r15 = r1
            r16 = r8
            r8 = 0
            r17 = r8
            r18 = r6
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x016f }
            r14 = r1
            r13 = r6
            r15 = r9
            r16 = r19
            r6 = 2
            r8 = 0
            r9 = 0
            r1 = r20
            goto L_0x00de
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            r1 = 0
            goto L_0x021a
        L_0x0173:
            r9 = r15
            r1 = r16
        L_0x0176:
            TJ.B r6 = r12.s()     // Catch:{ all -> 0x016f }
        L_0x017a:
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x016f }
            r15 = r8
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x016f }
            r15.booleanValue()     // Catch:{ all -> 0x016f }
            r16 = r4
            r15 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x016f }
            boolean r17 = r6.e(r8, r4)     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0216
            ti.a r15 = r12.f76562h     // Catch:{ all -> 0x01f7 }
            r2.f76640c = r12     // Catch:{ all -> 0x01f7 }
            r2.f76641d = r5     // Catch:{ all -> 0x01f7 }
            r2.f76642e = r0     // Catch:{ all -> 0x01f7 }
            r2.f76643f = r10     // Catch:{ all -> 0x01f7 }
            r2.f76644g = r6     // Catch:{ all -> 0x01f7 }
            r2.f76645h = r8     // Catch:{ all -> 0x01f7 }
            r2.f76646i = r4     // Catch:{ all -> 0x01f7 }
            r2.f76647j = r12     // Catch:{ all -> 0x01f7 }
            r2.f76648k = r11     // Catch:{ all -> 0x01f7 }
            r2.f76649l = r13     // Catch:{ all -> 0x01f7 }
            r2.f76650m = r14     // Catch:{ all -> 0x01f7 }
            r2.f76651n = r9     // Catch:{ all -> 0x01f7 }
            r2.f76652o = r7     // Catch:{ all -> 0x01f7 }
            r2.f76653p = r1     // Catch:{ all -> 0x01f7 }
            r2.f76654q = r3     // Catch:{ all -> 0x01f7 }
            r1 = 0
            r2.f76655r = r1     // Catch:{ all -> 0x01f7 }
            r2.f76656s = r1     // Catch:{ all -> 0x01f7 }
            r2.f76657t = r1     // Catch:{ all -> 0x01f7 }
            r2.f76658u = r1     // Catch:{ all -> 0x01f7 }
            r2.f76659v = r1     // Catch:{ all -> 0x01f7 }
            r2.f76660w = r1     // Catch:{ all -> 0x01f7 }
            r4 = 2
            r2.f76663z = r4     // Catch:{ all -> 0x01f7 }
            java.lang.Object r3 = r15.b(r5, r2)     // Catch:{ all -> 0x01f7 }
            r8 = r16
            if (r3 != r8) goto L_0x01ca
            return r8
        L_0x01ca:
            r4 = r10
            r2 = r12
        L_0x01cc:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0065 }
            r2.u(r3)     // Catch:{ all -> 0x0065 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01d5:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01f3 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01f3 }
            r2.booleanValue()     // Catch:{ all -> 0x01f3 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01f3 }
            if (r1 == 0) goto L_0x01d5
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01f3 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01f3:
            r0 = move-exception
            r10 = r4
            goto L_0x0170
        L_0x01f7:
            r0 = move-exception
            r4 = r10
            r2 = r12
        L_0x01fa:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01fe:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01f3 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01f3 }
            r3.booleanValue()     // Catch:{ all -> 0x01f3 }
            r16 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r16)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r1.e(r2, r3)     // Catch:{ all -> 0x01f3 }
            if (r2 != 0) goto L_0x0215
            goto L_0x01fe
        L_0x0215:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x0216:
            r4 = r16
            goto L_0x017a
        L_0x021a:
            r10.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.b(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super XH.C16807N> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof si.b.C1410b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            si.b$b r0 = (si.b.C1410b) r0
            int r1 = r0.f76592o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76592o = r1
            goto L_0x0018
        L_0x0013:
            si.b$b r0 = new si.b$b
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f76590m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76592o
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0063
            if (r3 == r5) goto L_0x004e
            if (r3 != r4) goto L_0x0046
            java.lang.Object r15 = r0.f76585h
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r15 = r0.f76583f
            TJ.B r15 = (TJ.C16505B) r15
            java.lang.Object r15 = r0.f76582e
            bK.a r15 = (bK.C17052a) r15
            java.lang.Object r2 = r0.f76581d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f76580c
            si.b r0 = (si.b) r0
            XH.y.b(r1)     // Catch:{ all -> 0x0043 }
            goto L_0x00b6
        L_0x0043:
            r1 = move-exception
            goto L_0x00e3
        L_0x0046:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x004e:
            int r15 = r0.f76586i
            java.lang.Object r3 = r0.f76582e
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r8 = r0.f76581d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f76580c
            si.b r9 = (si.b) r9
            XH.y.b(r1)
            r1 = r3
            r3 = r15
            r15 = r8
            goto L_0x007b
        L_0x0063:
            XH.y.b(r1)
            bK.a r1 = r14.f76565k
            r0.f76580c = r14
            r0.f76581d = r15
            r0.f76582e = r1
            r0.f76586i = r6
            r0.f76592o = r5
            java.lang.Object r3 = r1.e(r7, r0)
            if (r3 != r2) goto L_0x0079
            return r2
        L_0x0079:
            r9 = r14
            r3 = r6
        L_0x007b:
            TJ.B r8 = r9.s()     // Catch:{ all -> 0x00fd }
        L_0x007f:
            java.lang.Object r10 = r8.getValue()     // Catch:{ all -> 0x00fd }
            r11 = r10
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00fd }
            r11.booleanValue()     // Catch:{ all -> 0x00fd }
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch:{ all -> 0x00fd }
            boolean r12 = r8.e(r10, r11)     // Catch:{ all -> 0x00fd }
            if (r12 == 0) goto L_0x007f
            ti.a r5 = r9.f76562h     // Catch:{ all -> 0x00de }
            r0.f76580c = r9     // Catch:{ all -> 0x00de }
            r0.f76581d = r15     // Catch:{ all -> 0x00de }
            r0.f76582e = r1     // Catch:{ all -> 0x00de }
            r0.f76583f = r8     // Catch:{ all -> 0x00de }
            r0.f76584g = r10     // Catch:{ all -> 0x00de }
            r0.f76585h = r11     // Catch:{ all -> 0x00de }
            r0.f76586i = r3     // Catch:{ all -> 0x00de }
            r0.f76587j = r6     // Catch:{ all -> 0x00de }
            r0.f76588k = r6     // Catch:{ all -> 0x00de }
            r0.f76589l = r6     // Catch:{ all -> 0x00de }
            r0.f76592o = r4     // Catch:{ all -> 0x00de }
            java.lang.Object r15 = r5.c(r0)     // Catch:{ all -> 0x00de }
            if (r15 != r2) goto L_0x00b2
            return r2
        L_0x00b2:
            r0 = r9
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x00b6:
            si.a r1 = (si.a) r1     // Catch:{ all -> 0x0043 }
            r0.u(r1)     // Catch:{ all -> 0x0043 }
            TJ.B r0 = r0.s()     // Catch:{ all -> 0x00db }
        L_0x00bf:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00db }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00db }
            r2.booleanValue()     // Catch:{ all -> 0x00db }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch:{ all -> 0x00db }
            boolean r1 = r0.e(r1, r2)     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x00bf
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00db }
            r15.d(r7)
            XH.N r15 = XH.C16807N.f139792a
            return r15
        L_0x00db:
            r0 = move-exception
            r1 = r15
            goto L_0x00fe
        L_0x00de:
            r15 = move-exception
            r0 = r9
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x00e3:
            TJ.B r0 = r0.s()     // Catch:{ all -> 0x00db }
        L_0x00e7:
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x00db }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00db }
            r3.booleanValue()     // Catch:{ all -> 0x00db }
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch:{ all -> 0x00db }
            boolean r2 = r0.e(r2, r3)     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00fc
            goto L_0x00e7
        L_0x00fc:
            throw r1     // Catch:{ all -> 0x00db }
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            r1.d(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.c(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2 A[SYNTHETIC, Splitter:B:25:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0166 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof si.b.i
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$i r2 = (si.b.i) r2
            int r3 = r2.f76756y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76756y = r3
            goto L_0x001c
        L_0x0017:
            si.b$i r2 = new si.b$i
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76754w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76756y
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x0080
            if (r5 == r7) goto L_0x006c
            if (r5 != r6) goto L_0x0064
            java.lang.Object r0 = r2.f76745n
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76744m
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76743l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76742k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76741j
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76740i
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76739h
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76737f
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76736e
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76735d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76734c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0061 }
            goto L_0x01ba
        L_0x0061:
            r0 = move-exception
            goto L_0x01e8
        L_0x0064:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006c:
            int r0 = r2.f76747p
            java.lang.Object r5 = r2.f76736e
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76735d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76734c
            si.b r11 = (si.b) r11
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            goto L_0x0099
        L_0x0080:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76734c = r1
            r2.f76735d = r0
            r2.f76736e = r3
            r2.f76747p = r8
            r2.f76756y = r7
            java.lang.Object r5 = r3.e(r9, r2)
            if (r5 != r4) goto L_0x0096
            return r4
        L_0x0096:
            r11 = r1
            r5 = r3
            r3 = r8
        L_0x0099:
            qv.e r10 = qv.e.DEBUG     // Catch:{ all -> 0x012d }
            qv.d r12 = qv.d.f102012a     // Catch:{ all -> 0x012d }
            java.util.List r12 = r12.a()     // Catch:{ all -> 0x012d }
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ all -> 0x012d }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            r15.<init>()     // Catch:{ all -> 0x012d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x012d }
        L_0x00ac:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00c7
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x00c3 }
            r14 = r13
            qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x00c3 }
            boolean r14 = r14.b(r10, r8)     // Catch:{ all -> 0x00c3 }
            if (r14 == 0) goto L_0x00ac
            r15.add(r13)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ac
        L_0x00c3:
            r0 = move-exception
            r1 = r9
            goto L_0x0203
        L_0x00c7:
            java.util.Iterator r14 = r15.iterator()     // Catch:{ all -> 0x012d }
            r12 = r9
            r13 = r12
            r16 = r15
        L_0x00cf:
            boolean r17 = r14.hasNext()     // Catch:{ all -> 0x012d }
            if (r17 == 0) goto L_0x0166
            java.lang.Object r18 = r14.next()     // Catch:{ all -> 0x012d }
            r16 = r18
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x012d }
            r8 = 0
            if (r12 != 0) goto L_0x00f2
            java.lang.String r7 = "Set employee discount agreed terms"
            java.lang.String r7 = qv.C11818a.a(r7, r8)     // Catch:{ all -> 0x00c3 }
            if (r7 != 0) goto L_0x00ee
            r6 = r14
            r1 = r15
            r7 = r18
            goto L_0x016a
        L_0x00ee:
            java.lang.String r12 = qv.C11820c.a(r7)     // Catch:{ all -> 0x00c3 }
        L_0x00f2:
            r7 = r12
            if (r13 != 0) goto L_0x0147
            java.lang.Class r12 = r11.getClass()     // Catch:{ all -> 0x012d }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x012d }
            kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ all -> 0x012d }
            r13 = 36
            java.lang.String r13 = HJ.C15854t.s1(r12, r13, r9, r6, r9)     // Catch:{ all -> 0x012d }
            r8 = 46
            java.lang.String r8 = HJ.C15854t.o1(r13, r8, r9, r6, r9)     // Catch:{ all -> 0x012d }
            int r13 = r8.length()     // Catch:{ all -> 0x012d }
            if (r13 != 0) goto L_0x0113
            goto L_0x0119
        L_0x0113:
            java.lang.String r12 = "Kt"
            java.lang.String r12 = HJ.C15854t.P0(r8, r12)     // Catch:{ all -> 0x012d }
        L_0x0119:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x012d }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x012d }
            java.lang.String r13 = "main"
            r9 = 1
            boolean r8 = HJ.C15854t.b0(r8, r13, r9)     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0131
            java.lang.String r8 = "m"
            goto L_0x0133
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            r1 = 0
            goto L_0x0203
        L_0x0131:
            java.lang.String r8 = "b"
        L_0x0133:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r9.<init>()     // Catch:{ all -> 0x012d }
            r9.append(r8)     // Catch:{ all -> 0x012d }
            java.lang.String r8 = "|"
            r9.append(r8)     // Catch:{ all -> 0x012d }
            r9.append(r12)     // Catch:{ all -> 0x012d }
            java.lang.String r13 = r9.toString()     // Catch:{ all -> 0x012d }
        L_0x0147:
            r8 = r13
            r9 = 0
            r12 = r16
            r13 = r10
            r6 = r14
            r14 = r8
            r1 = r15
            r15 = r9
            r9 = 0
            r16 = r9
            r17 = r7
            r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x012d }
            r15 = r1
            r14 = r6
            r12 = r7
            r13 = r8
            r16 = r18
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            r1 = r19
            goto L_0x00cf
        L_0x0166:
            r6 = r14
            r1 = r15
            r7 = r16
        L_0x016a:
            TJ.B r8 = r11.s()     // Catch:{ all -> 0x012d }
        L_0x016e:
            java.lang.Object r9 = r8.getValue()     // Catch:{ all -> 0x012d }
            r14 = r9
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x012d }
            r14.booleanValue()     // Catch:{ all -> 0x012d }
            r14 = 1
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r14)     // Catch:{ all -> 0x012d }
            boolean r16 = r8.e(r9, r15)     // Catch:{ all -> 0x012d }
            if (r16 == 0) goto L_0x016e
            ti.a r14 = r11.f76562h     // Catch:{ all -> 0x01e5 }
            r2.f76734c = r11     // Catch:{ all -> 0x01e5 }
            r2.f76735d = r0     // Catch:{ all -> 0x01e5 }
            r2.f76736e = r5     // Catch:{ all -> 0x01e5 }
            r2.f76737f = r8     // Catch:{ all -> 0x01e5 }
            r2.f76738g = r9     // Catch:{ all -> 0x01e5 }
            r2.f76739h = r15     // Catch:{ all -> 0x01e5 }
            r2.f76740i = r11     // Catch:{ all -> 0x01e5 }
            r2.f76741j = r10     // Catch:{ all -> 0x01e5 }
            r2.f76742k = r12     // Catch:{ all -> 0x01e5 }
            r2.f76743l = r13     // Catch:{ all -> 0x01e5 }
            r2.f76744m = r1     // Catch:{ all -> 0x01e5 }
            r2.f76745n = r6     // Catch:{ all -> 0x01e5 }
            r2.f76746o = r7     // Catch:{ all -> 0x01e5 }
            r2.f76747p = r3     // Catch:{ all -> 0x01e5 }
            r1 = 0
            r2.f76748q = r1     // Catch:{ all -> 0x01e5 }
            r2.f76749r = r1     // Catch:{ all -> 0x01e5 }
            r2.f76750s = r1     // Catch:{ all -> 0x01e5 }
            r2.f76751t = r1     // Catch:{ all -> 0x01e5 }
            r2.f76752u = r1     // Catch:{ all -> 0x01e5 }
            r2.f76753v = r1     // Catch:{ all -> 0x01e5 }
            r9 = 2
            r2.f76756y = r9     // Catch:{ all -> 0x01e5 }
            java.lang.Object r3 = r14.d(r2)     // Catch:{ all -> 0x01e5 }
            if (r3 != r4) goto L_0x01b8
            return r4
        L_0x01b8:
            r4 = r5
            r2 = r11
        L_0x01ba:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0061 }
            r2.u(r3)     // Catch:{ all -> 0x0061 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01e1 }
        L_0x01c3:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01e1 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01e1 }
            r2.booleanValue()     // Catch:{ all -> 0x01e1 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01e1 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01c3
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01e1 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01e1:
            r0 = move-exception
            r5 = r4
            goto L_0x012e
        L_0x01e5:
            r0 = move-exception
            r4 = r5
            r2 = r11
        L_0x01e8:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01e1 }
        L_0x01ec:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01e1 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01e1 }
            r3.booleanValue()     // Catch:{ all -> 0x01e1 }
            r15 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x01e1 }
            boolean r2 = r1.e(r2, r3)     // Catch:{ all -> 0x01e1 }
            if (r2 != 0) goto L_0x0202
            goto L_0x01ec
        L_0x0202:
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x0203:
            r5.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.d(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2 A[SYNTHETIC, Splitter:B:25:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0166 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof si.b.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$c r2 = (si.b.c) r2
            int r3 = r2.f76615y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76615y = r3
            goto L_0x001c
        L_0x0017:
            si.b$c r2 = new si.b$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76613w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76615y
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x0080
            if (r5 == r7) goto L_0x006c
            if (r5 != r6) goto L_0x0064
            java.lang.Object r0 = r2.f76604n
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76603m
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76602l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76601k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76600j
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76599i
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76598h
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76596f
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76595e
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76594d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76593c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0061 }
            goto L_0x01ba
        L_0x0061:
            r0 = move-exception
            goto L_0x01e8
        L_0x0064:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006c:
            int r0 = r2.f76606p
            java.lang.Object r5 = r2.f76595e
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76594d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76593c
            si.b r11 = (si.b) r11
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            goto L_0x0099
        L_0x0080:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76593c = r1
            r2.f76594d = r0
            r2.f76595e = r3
            r2.f76606p = r8
            r2.f76615y = r7
            java.lang.Object r5 = r3.e(r9, r2)
            if (r5 != r4) goto L_0x0096
            return r4
        L_0x0096:
            r11 = r1
            r5 = r3
            r3 = r8
        L_0x0099:
            qv.e r10 = qv.e.DEBUG     // Catch:{ all -> 0x012d }
            qv.d r12 = qv.d.f102012a     // Catch:{ all -> 0x012d }
            java.util.List r12 = r12.a()     // Catch:{ all -> 0x012d }
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ all -> 0x012d }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x012d }
            r15.<init>()     // Catch:{ all -> 0x012d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x012d }
        L_0x00ac:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00c7
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x00c3 }
            r14 = r13
            qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x00c3 }
            boolean r14 = r14.b(r10, r8)     // Catch:{ all -> 0x00c3 }
            if (r14 == 0) goto L_0x00ac
            r15.add(r13)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ac
        L_0x00c3:
            r0 = move-exception
            r1 = r9
            goto L_0x0203
        L_0x00c7:
            java.util.Iterator r14 = r15.iterator()     // Catch:{ all -> 0x012d }
            r12 = r9
            r13 = r12
            r16 = r15
        L_0x00cf:
            boolean r17 = r14.hasNext()     // Catch:{ all -> 0x012d }
            if (r17 == 0) goto L_0x0166
            java.lang.Object r18 = r14.next()     // Catch:{ all -> 0x012d }
            r16 = r18
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x012d }
            r8 = 0
            if (r12 != 0) goto L_0x00f2
            java.lang.String r7 = "Clear employee discount agreed terms"
            java.lang.String r7 = qv.C11818a.a(r7, r8)     // Catch:{ all -> 0x00c3 }
            if (r7 != 0) goto L_0x00ee
            r6 = r14
            r1 = r15
            r7 = r18
            goto L_0x016a
        L_0x00ee:
            java.lang.String r12 = qv.C11820c.a(r7)     // Catch:{ all -> 0x00c3 }
        L_0x00f2:
            r7 = r12
            if (r13 != 0) goto L_0x0147
            java.lang.Class r12 = r11.getClass()     // Catch:{ all -> 0x012d }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x012d }
            kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ all -> 0x012d }
            r13 = 36
            java.lang.String r13 = HJ.C15854t.s1(r12, r13, r9, r6, r9)     // Catch:{ all -> 0x012d }
            r8 = 46
            java.lang.String r8 = HJ.C15854t.o1(r13, r8, r9, r6, r9)     // Catch:{ all -> 0x012d }
            int r13 = r8.length()     // Catch:{ all -> 0x012d }
            if (r13 != 0) goto L_0x0113
            goto L_0x0119
        L_0x0113:
            java.lang.String r12 = "Kt"
            java.lang.String r12 = HJ.C15854t.P0(r8, r12)     // Catch:{ all -> 0x012d }
        L_0x0119:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x012d }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x012d }
            java.lang.String r13 = "main"
            r9 = 1
            boolean r8 = HJ.C15854t.b0(r8, r13, r9)     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0131
            java.lang.String r8 = "m"
            goto L_0x0133
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            r1 = 0
            goto L_0x0203
        L_0x0131:
            java.lang.String r8 = "b"
        L_0x0133:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r9.<init>()     // Catch:{ all -> 0x012d }
            r9.append(r8)     // Catch:{ all -> 0x012d }
            java.lang.String r8 = "|"
            r9.append(r8)     // Catch:{ all -> 0x012d }
            r9.append(r12)     // Catch:{ all -> 0x012d }
            java.lang.String r13 = r9.toString()     // Catch:{ all -> 0x012d }
        L_0x0147:
            r8 = r13
            r9 = 0
            r12 = r16
            r13 = r10
            r6 = r14
            r14 = r8
            r1 = r15
            r15 = r9
            r9 = 0
            r16 = r9
            r17 = r7
            r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x012d }
            r15 = r1
            r14 = r6
            r12 = r7
            r13 = r8
            r16 = r18
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            r1 = r19
            goto L_0x00cf
        L_0x0166:
            r6 = r14
            r1 = r15
            r7 = r16
        L_0x016a:
            TJ.B r8 = r11.s()     // Catch:{ all -> 0x012d }
        L_0x016e:
            java.lang.Object r9 = r8.getValue()     // Catch:{ all -> 0x012d }
            r14 = r9
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x012d }
            r14.booleanValue()     // Catch:{ all -> 0x012d }
            r14 = 1
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r14)     // Catch:{ all -> 0x012d }
            boolean r16 = r8.e(r9, r15)     // Catch:{ all -> 0x012d }
            if (r16 == 0) goto L_0x016e
            ti.a r14 = r11.f76562h     // Catch:{ all -> 0x01e5 }
            r2.f76593c = r11     // Catch:{ all -> 0x01e5 }
            r2.f76594d = r0     // Catch:{ all -> 0x01e5 }
            r2.f76595e = r5     // Catch:{ all -> 0x01e5 }
            r2.f76596f = r8     // Catch:{ all -> 0x01e5 }
            r2.f76597g = r9     // Catch:{ all -> 0x01e5 }
            r2.f76598h = r15     // Catch:{ all -> 0x01e5 }
            r2.f76599i = r11     // Catch:{ all -> 0x01e5 }
            r2.f76600j = r10     // Catch:{ all -> 0x01e5 }
            r2.f76601k = r12     // Catch:{ all -> 0x01e5 }
            r2.f76602l = r13     // Catch:{ all -> 0x01e5 }
            r2.f76603m = r1     // Catch:{ all -> 0x01e5 }
            r2.f76604n = r6     // Catch:{ all -> 0x01e5 }
            r2.f76605o = r7     // Catch:{ all -> 0x01e5 }
            r2.f76606p = r3     // Catch:{ all -> 0x01e5 }
            r1 = 0
            r2.f76607q = r1     // Catch:{ all -> 0x01e5 }
            r2.f76608r = r1     // Catch:{ all -> 0x01e5 }
            r2.f76609s = r1     // Catch:{ all -> 0x01e5 }
            r2.f76610t = r1     // Catch:{ all -> 0x01e5 }
            r2.f76611u = r1     // Catch:{ all -> 0x01e5 }
            r2.f76612v = r1     // Catch:{ all -> 0x01e5 }
            r9 = 2
            r2.f76615y = r9     // Catch:{ all -> 0x01e5 }
            java.lang.Object r3 = r14.e(r2)     // Catch:{ all -> 0x01e5 }
            if (r3 != r4) goto L_0x01b8
            return r4
        L_0x01b8:
            r4 = r5
            r2 = r11
        L_0x01ba:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0061 }
            r2.u(r3)     // Catch:{ all -> 0x0061 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01e1 }
        L_0x01c3:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01e1 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01e1 }
            r2.booleanValue()     // Catch:{ all -> 0x01e1 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01e1 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01c3
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01e1 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01e1:
            r0 = move-exception
            r5 = r4
            goto L_0x012e
        L_0x01e5:
            r0 = move-exception
            r4 = r5
            r2 = r11
        L_0x01e8:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01e1 }
        L_0x01ec:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01e1 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01e1 }
            r3.booleanValue()     // Catch:{ all -> 0x01e1 }
            r15 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x01e1 }
            boolean r2 = r1.e(r2, r3)     // Catch:{ all -> 0x01e1 }
            if (r2 != 0) goto L_0x0202
            goto L_0x01ec
        L_0x0202:
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x0203:
            r5.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.e(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0 A[SYNTHETIC, Splitter:B:25:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0191 A[EDGE_INSN: B:65:0x0191->B:66:? ?: BREAK  , SYNTHETIC, Splitter:B:65:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0216 A[LOOP:2: B:63:0x017a->B:90:0x0216, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0173 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.lang.String r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof si.b.h
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$h r2 = (si.b.h) r2
            int r3 = r2.f76733z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76733z = r3
            goto L_0x001c
        L_0x0017:
            si.b$h r2 = new si.b$h
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76731x
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76733z
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x008a
            if (r5 == r7) goto L_0x0070
            if (r5 != r6) goto L_0x0068
            java.lang.Object r0 = r2.f76722o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76721n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76720m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76719l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76718k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76717j
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76716i
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76714g
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76713f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76712e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76711d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76710c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x01cc
        L_0x0065:
            r0 = move-exception
            goto L_0x01fa
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0070:
            int r0 = r2.f76724q
            java.lang.Object r5 = r2.f76713f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76712e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76711d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.f76710c
            si.b r12 = (si.b) r12
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            r10 = r5
            r5 = r11
            goto L_0x00a7
        L_0x008a:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76710c = r1
            r5 = r21
            r2.f76711d = r5
            r2.f76712e = r0
            r2.f76713f = r3
            r2.f76724q = r8
            r2.f76733z = r7
            java.lang.Object r10 = r3.e(r9, r2)
            if (r10 != r4) goto L_0x00a4
            return r4
        L_0x00a4:
            r12 = r1
            r10 = r3
            r3 = r8
        L_0x00a7:
            qv.e r11 = qv.e.DEBUG     // Catch:{ all -> 0x016f }
            qv.d r13 = qv.d.f102012a     // Catch:{ all -> 0x016f }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x016f }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x016f }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x016f }
            r15.<init>()     // Catch:{ all -> 0x016f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x016f }
        L_0x00ba:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x016f }
            if (r14 == 0) goto L_0x00d6
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00d2 }
            r7 = r14
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x00d2 }
            boolean r7 = r7.b(r11, r8)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00d0
            r15.add(r14)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            r7 = 1
            goto L_0x00ba
        L_0x00d2:
            r0 = move-exception
            r1 = r9
            goto L_0x021a
        L_0x00d6:
            java.util.Iterator r7 = r15.iterator()     // Catch:{ all -> 0x016f }
            r13 = r9
            r14 = r13
            r16 = r15
        L_0x00de:
            boolean r17 = r7.hasNext()     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0173
            java.lang.Object r19 = r7.next()     // Catch:{ all -> 0x016f }
            r16 = r19
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x016f }
            r8 = 0
            if (r13 != 0) goto L_0x0100
            java.lang.String r6 = "Put discount"
            java.lang.String r6 = qv.C11818a.a(r6, r8)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00fc
            r9 = r15
            r1 = r19
            goto L_0x0176
        L_0x00fc:
            java.lang.String r13 = qv.C11820c.a(r6)     // Catch:{ all -> 0x00d2 }
        L_0x0100:
            r6 = r13
            if (r14 != 0) goto L_0x0152
            java.lang.Class r13 = r12.getClass()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x00d2 }
            kotlin.jvm.internal.C17542s.g(r13)     // Catch:{ all -> 0x00d2 }
            r14 = 36
            r8 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            r1 = 46
            java.lang.String r1 = HJ.C15854t.o1(r14, r1, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            int r8 = r1.length()     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.String r8 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r1, r8)     // Catch:{ all -> 0x00d2 }
        L_0x0128:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "main"
            r14 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r14)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = "m"
            goto L_0x013e
        L_0x013c:
            java.lang.String r1 = "b"
        L_0x013e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "|"
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            r8.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x00d2 }
        L_0x0152:
            r1 = r14
            r8 = 0
            r13 = r16
            r14 = r11
            r9 = r15
            r15 = r1
            r16 = r8
            r8 = 0
            r17 = r8
            r18 = r6
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x016f }
            r14 = r1
            r13 = r6
            r15 = r9
            r16 = r19
            r6 = 2
            r8 = 0
            r9 = 0
            r1 = r20
            goto L_0x00de
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            r1 = 0
            goto L_0x021a
        L_0x0173:
            r9 = r15
            r1 = r16
        L_0x0176:
            TJ.B r6 = r12.s()     // Catch:{ all -> 0x016f }
        L_0x017a:
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x016f }
            r15 = r8
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x016f }
            r15.booleanValue()     // Catch:{ all -> 0x016f }
            r16 = r4
            r15 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x016f }
            boolean r17 = r6.e(r8, r4)     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0216
            ti.a r15 = r12.f76562h     // Catch:{ all -> 0x01f7 }
            r2.f76710c = r12     // Catch:{ all -> 0x01f7 }
            r2.f76711d = r5     // Catch:{ all -> 0x01f7 }
            r2.f76712e = r0     // Catch:{ all -> 0x01f7 }
            r2.f76713f = r10     // Catch:{ all -> 0x01f7 }
            r2.f76714g = r6     // Catch:{ all -> 0x01f7 }
            r2.f76715h = r8     // Catch:{ all -> 0x01f7 }
            r2.f76716i = r4     // Catch:{ all -> 0x01f7 }
            r2.f76717j = r12     // Catch:{ all -> 0x01f7 }
            r2.f76718k = r11     // Catch:{ all -> 0x01f7 }
            r2.f76719l = r13     // Catch:{ all -> 0x01f7 }
            r2.f76720m = r14     // Catch:{ all -> 0x01f7 }
            r2.f76721n = r9     // Catch:{ all -> 0x01f7 }
            r2.f76722o = r7     // Catch:{ all -> 0x01f7 }
            r2.f76723p = r1     // Catch:{ all -> 0x01f7 }
            r2.f76724q = r3     // Catch:{ all -> 0x01f7 }
            r1 = 0
            r2.f76725r = r1     // Catch:{ all -> 0x01f7 }
            r2.f76726s = r1     // Catch:{ all -> 0x01f7 }
            r2.f76727t = r1     // Catch:{ all -> 0x01f7 }
            r2.f76728u = r1     // Catch:{ all -> 0x01f7 }
            r2.f76729v = r1     // Catch:{ all -> 0x01f7 }
            r2.f76730w = r1     // Catch:{ all -> 0x01f7 }
            r4 = 2
            r2.f76733z = r4     // Catch:{ all -> 0x01f7 }
            java.lang.Object r3 = r15.f(r5, r2)     // Catch:{ all -> 0x01f7 }
            r8 = r16
            if (r3 != r8) goto L_0x01ca
            return r8
        L_0x01ca:
            r4 = r10
            r2 = r12
        L_0x01cc:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0065 }
            r2.u(r3)     // Catch:{ all -> 0x0065 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01d5:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01f3 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01f3 }
            r2.booleanValue()     // Catch:{ all -> 0x01f3 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01f3 }
            if (r1 == 0) goto L_0x01d5
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01f3 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01f3:
            r0 = move-exception
            r10 = r4
            goto L_0x0170
        L_0x01f7:
            r0 = move-exception
            r4 = r10
            r2 = r12
        L_0x01fa:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01fe:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01f3 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01f3 }
            r3.booleanValue()     // Catch:{ all -> 0x01f3 }
            r16 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r16)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r1.e(r2, r3)     // Catch:{ all -> 0x01f3 }
            if (r2 != 0) goto L_0x0215
            goto L_0x01fe
        L_0x0215:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x0216:
            r4 = r16
            goto L_0x017a
        L_0x021a:
            r10.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.f(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0 A[SYNTHETIC, Splitter:B:25:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fb A[LOOP:2: B:65:0x017a->B:85:0x01fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0173 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0191 A[EDGE_INSN: B:98:0x0191->B:67:0x0191 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.lang.String r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof si.b.d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$d r2 = (si.b.d) r2
            int r3 = r2.f76639z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76639z = r3
            goto L_0x001c
        L_0x0017:
            si.b$d r2 = new si.b$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76637x
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76639z
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x008a
            if (r5 == r7) goto L_0x0070
            if (r5 != r6) goto L_0x0068
            java.lang.Object r0 = r2.f76628o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76627n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76626m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76625l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76624k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76623j
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76622i
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76620g
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76619f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76618e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76617d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76616c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x01cc
        L_0x0065:
            r0 = move-exception
            goto L_0x01ff
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0070:
            int r0 = r2.f76630q
            java.lang.Object r5 = r2.f76619f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76618e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76617d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.f76616c
            si.b r12 = (si.b) r12
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            r10 = r5
            r5 = r11
            goto L_0x00a7
        L_0x008a:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76616c = r1
            r5 = r21
            r2.f76617d = r5
            r2.f76618e = r0
            r2.f76619f = r3
            r2.f76630q = r8
            r2.f76639z = r7
            java.lang.Object r10 = r3.e(r9, r2)
            if (r10 != r4) goto L_0x00a4
            return r4
        L_0x00a4:
            r12 = r1
            r10 = r3
            r3 = r8
        L_0x00a7:
            qv.e r11 = qv.e.DEBUG     // Catch:{ all -> 0x016f }
            qv.d r13 = qv.d.f102012a     // Catch:{ all -> 0x016f }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x016f }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x016f }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x016f }
            r15.<init>()     // Catch:{ all -> 0x016f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x016f }
        L_0x00ba:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x016f }
            if (r14 == 0) goto L_0x00d6
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00d2 }
            r7 = r14
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x00d2 }
            boolean r7 = r7.b(r11, r8)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00d0
            r15.add(r14)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            r7 = 1
            goto L_0x00ba
        L_0x00d2:
            r0 = move-exception
            r1 = r9
            goto L_0x021a
        L_0x00d6:
            java.util.Iterator r7 = r15.iterator()     // Catch:{ all -> 0x016f }
            r13 = r9
            r14 = r13
            r16 = r15
        L_0x00de:
            boolean r17 = r7.hasNext()     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0173
            java.lang.Object r19 = r7.next()     // Catch:{ all -> 0x016f }
            r16 = r19
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x016f }
            r8 = 0
            if (r13 != 0) goto L_0x0100
            java.lang.String r6 = "Delete cart item"
            java.lang.String r6 = qv.C11818a.a(r6, r8)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00fc
            r9 = r15
            r1 = r19
            goto L_0x0176
        L_0x00fc:
            java.lang.String r13 = qv.C11820c.a(r6)     // Catch:{ all -> 0x00d2 }
        L_0x0100:
            r6 = r13
            if (r14 != 0) goto L_0x0152
            java.lang.Class r13 = r12.getClass()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x00d2 }
            kotlin.jvm.internal.C17542s.g(r13)     // Catch:{ all -> 0x00d2 }
            r14 = 36
            r8 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            r1 = 46
            java.lang.String r1 = HJ.C15854t.o1(r14, r1, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            int r8 = r1.length()     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.String r8 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r1, r8)     // Catch:{ all -> 0x00d2 }
        L_0x0128:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "main"
            r14 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r14)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = "m"
            goto L_0x013e
        L_0x013c:
            java.lang.String r1 = "b"
        L_0x013e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "|"
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            r8.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x00d2 }
        L_0x0152:
            r1 = r14
            r8 = 0
            r13 = r16
            r14 = r11
            r9 = r15
            r15 = r1
            r16 = r8
            r8 = 0
            r17 = r8
            r18 = r6
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x016f }
            r14 = r1
            r13 = r6
            r15 = r9
            r16 = r19
            r6 = 2
            r8 = 0
            r9 = 0
            r1 = r20
            goto L_0x00de
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            r1 = 0
            goto L_0x021a
        L_0x0173:
            r9 = r15
            r1 = r16
        L_0x0176:
            TJ.B r6 = r12.s()     // Catch:{ all -> 0x01f7 }
        L_0x017a:
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x01f7 }
            r15 = r8
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x01f7 }
            r15.booleanValue()     // Catch:{ all -> 0x01f7 }
            r16 = r4
            r15 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x01f7 }
            boolean r17 = r6.e(r8, r4)     // Catch:{ all -> 0x01f7 }
            if (r17 == 0) goto L_0x01fb
            ti.a r15 = r12.f76562h     // Catch:{ all -> 0x01f7 }
            r2.f76616c = r12     // Catch:{ all -> 0x01f7 }
            r2.f76617d = r5     // Catch:{ all -> 0x01f7 }
            r2.f76618e = r0     // Catch:{ all -> 0x01f7 }
            r2.f76619f = r10     // Catch:{ all -> 0x01f7 }
            r2.f76620g = r6     // Catch:{ all -> 0x01f7 }
            r2.f76621h = r8     // Catch:{ all -> 0x01f7 }
            r2.f76622i = r4     // Catch:{ all -> 0x01f7 }
            r2.f76623j = r12     // Catch:{ all -> 0x01f7 }
            r2.f76624k = r11     // Catch:{ all -> 0x01f7 }
            r2.f76625l = r13     // Catch:{ all -> 0x01f7 }
            r2.f76626m = r14     // Catch:{ all -> 0x01f7 }
            r2.f76627n = r9     // Catch:{ all -> 0x01f7 }
            r2.f76628o = r7     // Catch:{ all -> 0x01f7 }
            r2.f76629p = r1     // Catch:{ all -> 0x01f7 }
            r2.f76630q = r3     // Catch:{ all -> 0x01f7 }
            r1 = 0
            r2.f76631r = r1     // Catch:{ all -> 0x01f7 }
            r2.f76632s = r1     // Catch:{ all -> 0x01f7 }
            r2.f76633t = r1     // Catch:{ all -> 0x01f7 }
            r2.f76634u = r1     // Catch:{ all -> 0x01f7 }
            r2.f76635v = r1     // Catch:{ all -> 0x01f7 }
            r2.f76636w = r1     // Catch:{ all -> 0x01f7 }
            r4 = 2
            r2.f76639z = r4     // Catch:{ all -> 0x01f7 }
            java.lang.Object r3 = r15.g(r5, r2)     // Catch:{ all -> 0x01f7 }
            r8 = r16
            if (r3 != r8) goto L_0x01ca
            return r8
        L_0x01ca:
            r4 = r10
            r2 = r12
        L_0x01cc:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0065 }
            r2.u(r3)     // Catch:{ all -> 0x0065 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01d5:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01f3 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01f3 }
            r2.booleanValue()     // Catch:{ all -> 0x01f3 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01f3 }
            if (r1 == 0) goto L_0x01d5
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01f3 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01f3:
            r0 = move-exception
            r10 = r4
            goto L_0x0170
        L_0x01f7:
            r0 = move-exception
            r4 = r10
            r2 = r12
            goto L_0x01ff
        L_0x01fb:
            r4 = r16
            goto L_0x017a
        L_0x01ff:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x0203:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01f3 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01f3 }
            r3.booleanValue()     // Catch:{ all -> 0x01f3 }
            r3 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r1.e(r2, r5)     // Catch:{ all -> 0x01f3 }
            if (r2 != 0) goto L_0x0219
            goto L_0x0203
        L_0x0219:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x021a:
            r10.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.g(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b9 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d7 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03a4 A[Catch:{ all -> 0x0379 }, LOOP:8: B:139:0x038f->B:141:0x03a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x017f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0358 A[EDGE_INSN: B:166:0x0358->B:125:0x0358 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0199 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0248 A[SYNTHETIC, Splitter:B:88:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(dI.C17164e<? super Ln.g> r35) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            boolean r2 = r0 instanceof si.b.f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$f r2 = (si.b.f) r2
            int r3 = r2.f76686y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76686y = r3
            goto L_0x001c
        L_0x0017:
            si.b$f r2 = new si.b$f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76684w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76686y
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 1
            r14 = 2
            r15 = 0
            r11 = 0
            if (r5 == 0) goto L_0x0090
            if (r5 == r13) goto L_0x007c
            if (r5 != r14) goto L_0x0074
            java.lang.Object r0 = r2.f76675n
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76674m
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76673l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76672k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76671j
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76670i
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76669h
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76667f
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76666e
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76665d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76664c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0071 }
            r19 = r6
            r26 = r7
            r27 = r8
            goto L_0x029e
        L_0x0071:
            r0 = move-exception
            goto L_0x038b
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x007c:
            int r0 = r2.f76677p
            java.lang.Object r5 = r2.f76666e
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r12 = r2.f76665d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r14 = r2.f76664c
            si.b r14 = (si.b) r14
            XH.y.b(r3)
            r3 = r0
            r0 = r12
            goto L_0x00a9
        L_0x0090:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76664c = r1
            r2.f76665d = r0
            r2.f76666e = r3
            r2.f76677p = r15
            r2.f76686y = r13
            java.lang.Object r5 = r3.e(r11, r2)
            if (r5 != r4) goto L_0x00a6
            return r4
        L_0x00a6:
            r14 = r1
            r5 = r3
            r3 = r15
        L_0x00a9:
            qv.e r12 = qv.e.DEBUG     // Catch:{ all -> 0x00d6 }
            qv.d r19 = qv.d.f102012a     // Catch:{ all -> 0x00d6 }
            java.util.List r19 = r19.a()     // Catch:{ all -> 0x00d6 }
            java.lang.Iterable r19 = (java.lang.Iterable) r19     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00d6 }
            r13.<init>()     // Catch:{ all -> 0x00d6 }
            java.util.Iterator r19 = r19.iterator()     // Catch:{ all -> 0x00d6 }
        L_0x00bc:
            boolean r20 = r19.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r20 == 0) goto L_0x00da
            java.lang.Object r11 = r19.next()     // Catch:{ all -> 0x00d6 }
            r1 = r11
            qv.b r1 = (qv.C11819b) r1     // Catch:{ all -> 0x00d6 }
            boolean r1 = r1.b(r12, r15)     // Catch:{ all -> 0x00d6 }
            if (r1 == 0) goto L_0x00d2
            r13.add(r11)     // Catch:{ all -> 0x00d6 }
        L_0x00d2:
            r1 = r34
            r11 = 0
            goto L_0x00bc
        L_0x00d6:
            r0 = move-exception
        L_0x00d7:
            r1 = 0
            goto L_0x03a6
        L_0x00da:
            java.util.Iterator r1 = r13.iterator()     // Catch:{ all -> 0x00d6 }
            r19 = r13
            r11 = 0
            r15 = 0
        L_0x00e2:
            boolean r20 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r20 == 0) goto L_0x017f
            java.lang.Object r25 = r1.next()     // Catch:{ all -> 0x00d6 }
            r19 = r25
            qv.b r19 = (qv.C11819b) r19     // Catch:{ all -> 0x00d6 }
            r26 = r7
            r7 = 0
            if (r11 != 0) goto L_0x010d
            r27 = r8
            java.lang.String r8 = "Fetch cart"
            java.lang.String r8 = qv.C11818a.a(r8, r7)     // Catch:{ all -> 0x00d6 }
            if (r8 != 0) goto L_0x0107
            r29 = r3
            r28 = r4
            r3 = r25
            goto L_0x0189
        L_0x0107:
            java.lang.String r8 = qv.C11820c.a(r8)     // Catch:{ all -> 0x00d6 }
            r11 = r8
            goto L_0x010f
        L_0x010d:
            r27 = r8
        L_0x010f:
            if (r15 != 0) goto L_0x0161
            java.lang.Class r8 = r14.getClass()     // Catch:{ all -> 0x00d6 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ all -> 0x00d6 }
            r29 = r3
            r28 = r4
            r4 = 0
            r7 = 2
            r15 = 36
            java.lang.String r3 = HJ.C15854t.s1(r8, r15, r4, r7, r4)     // Catch:{ all -> 0x00d6 }
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r4, r7, r4)     // Catch:{ all -> 0x00d6 }
            int r4 = r3.length()     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0135
            goto L_0x0139
        L_0x0135:
            java.lang.String r8 = HJ.C15854t.P0(r3, r10)     // Catch:{ all -> 0x00d6 }
        L_0x0139:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00d6 }
            r4 = 1
            boolean r3 = HJ.C15854t.b0(r3, r9, r4)     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x014b
            r3 = r27
            goto L_0x014d
        L_0x014b:
            r3 = r26
        L_0x014d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
            r4.append(r3)     // Catch:{ all -> 0x00d6 }
            r4.append(r6)     // Catch:{ all -> 0x00d6 }
            r4.append(r8)     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00d6 }
            r15 = r3
            goto L_0x0165
        L_0x0161:
            r29 = r3
            r28 = r4
        L_0x0165:
            r22 = 0
            r20 = r12
            r21 = r15
            r3 = 0
            r23 = r3
            r24 = r11
            r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00d6 }
            r19 = r25
            r7 = r26
            r8 = r27
            r4 = r28
            r3 = r29
            goto L_0x00e2
        L_0x017f:
            r29 = r3
            r28 = r4
            r26 = r7
            r27 = r8
            r3 = r19
        L_0x0189:
            aA.a r4 = r14.f76563i     // Catch:{ all -> 0x00d6 }
            boolean r4 = r4.isLoggedIn()     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0248
            aA.a r4 = r14.f76563i     // Catch:{ all -> 0x00d6 }
            boolean r4 = r4.c()     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0248
            qv.e r0 = qv.e.DEBUG     // Catch:{ all -> 0x00d6 }
            qv.d r1 = qv.d.f102012a     // Catch:{ all -> 0x00d6 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x00d6 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00d6 }
            r2.<init>()     // Catch:{ all -> 0x00d6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d6 }
        L_0x01ac:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x01c4
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00d6 }
            r4 = r3
            qv.b r4 = (qv.C11819b) r4     // Catch:{ all -> 0x00d6 }
            r7 = 0
            boolean r4 = r4.b(r0, r7)     // Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x01ac
            r2.add(r3)     // Catch:{ all -> 0x00d6 }
            goto L_0x01ac
        L_0x01c4:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00d6 }
            r2 = 0
            r3 = 0
        L_0x01ca:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00d6 }
            r19 = r4
            qv.b r19 = (qv.C11819b) r19     // Catch:{ all -> 0x00d6 }
            r4 = 0
            if (r2 != 0) goto L_0x01e9
            java.lang.String r2 = "Fetch cart: Guest user with no cookie, no need to fetch cart"
            java.lang.String r2 = qv.C11818a.a(r2, r4)     // Catch:{ all -> 0x00d6 }
            if (r2 != 0) goto L_0x01e5
        L_0x01e3:
            r1 = 0
            goto L_0x0241
        L_0x01e5:
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ all -> 0x00d6 }
        L_0x01e9:
            if (r3 != 0) goto L_0x0233
            java.lang.Class<si.b> r3 = si.b.class
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x00d6 }
            r7 = 36
            r8 = 2
            r11 = 0
            java.lang.String r12 = HJ.C15854t.s1(r3, r7, r11, r8, r11)     // Catch:{ all -> 0x00d6 }
            r7 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r7, r11, r8, r11)     // Catch:{ all -> 0x00d6 }
            int r7 = r12.length()     // Catch:{ all -> 0x00d6 }
            if (r7 != 0) goto L_0x0209
            goto L_0x020d
        L_0x0209:
            java.lang.String r3 = HJ.C15854t.P0(r12, r10)     // Catch:{ all -> 0x00d6 }
        L_0x020d:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00d6 }
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r9, r8)     // Catch:{ all -> 0x00d6 }
            if (r7 == 0) goto L_0x021f
            r7 = r27
            goto L_0x0221
        L_0x021f:
            r7 = r26
        L_0x0221:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r8.<init>()     // Catch:{ all -> 0x00d6 }
            r8.append(r7)     // Catch:{ all -> 0x00d6 }
            r8.append(r6)     // Catch:{ all -> 0x00d6 }
            r8.append(r3)     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x00d6 }
        L_0x0233:
            r22 = 0
            r20 = r0
            r21 = r3
            r23 = r4
            r24 = r2
            r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00d6 }
            goto L_0x01ca
        L_0x0241:
            r14.u(r1)     // Catch:{ all -> 0x00d6 }
            r5.d(r1)
            return r1
        L_0x0248:
            TJ.B r4 = r14.s()     // Catch:{ all -> 0x037d }
        L_0x024c:
            java.lang.Object r7 = r4.getValue()     // Catch:{ all -> 0x037d }
            r8 = r7
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x037d }
            r8.booleanValue()     // Catch:{ all -> 0x037d }
            r19 = r6
            r8 = 1
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r8)     // Catch:{ all -> 0x037d }
            boolean r8 = r4.e(r7, r6)     // Catch:{ all -> 0x037d }
            if (r8 == 0) goto L_0x0381
            ti.a r8 = r14.f76562h     // Catch:{ all -> 0x037d }
            r2.f76664c = r14     // Catch:{ all -> 0x037d }
            r2.f76665d = r0     // Catch:{ all -> 0x037d }
            r2.f76666e = r5     // Catch:{ all -> 0x037d }
            r2.f76667f = r4     // Catch:{ all -> 0x037d }
            r2.f76668g = r7     // Catch:{ all -> 0x037d }
            r2.f76669h = r6     // Catch:{ all -> 0x037d }
            r2.f76670i = r14     // Catch:{ all -> 0x037d }
            r2.f76671j = r12     // Catch:{ all -> 0x037d }
            r2.f76672k = r11     // Catch:{ all -> 0x037d }
            r2.f76673l = r15     // Catch:{ all -> 0x037d }
            r2.f76674m = r13     // Catch:{ all -> 0x037d }
            r2.f76675n = r1     // Catch:{ all -> 0x037d }
            r2.f76676o = r3     // Catch:{ all -> 0x037d }
            r6 = r29
            r2.f76677p = r6     // Catch:{ all -> 0x037d }
            r1 = 0
            r2.f76678q = r1     // Catch:{ all -> 0x037d }
            r2.f76679r = r1     // Catch:{ all -> 0x037d }
            r2.f76680s = r1     // Catch:{ all -> 0x037d }
            r2.f76681t = r1     // Catch:{ all -> 0x037d }
            r2.f76682u = r1     // Catch:{ all -> 0x037d }
            r2.f76683v = r1     // Catch:{ all -> 0x037d }
            r0 = 2
            r2.f76686y = r0     // Catch:{ all -> 0x037d }
            java.lang.Object r3 = r8.h(r2)     // Catch:{ all -> 0x037d }
            r7 = r28
            if (r3 != r7) goto L_0x029c
            return r7
        L_0x029c:
            r4 = r5
            r2 = r14
        L_0x029e:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0071 }
            qv.e r0 = qv.e.DEBUG     // Catch:{ all -> 0x0071 }
            qv.d r1 = qv.d.f102012a     // Catch:{ all -> 0x0071 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x0071 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0071 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0071 }
            r5.<init>()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0071 }
        L_0x02b3:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0071 }
            r7 = r6
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x0071 }
            r8 = 0
            boolean r7 = r7.b(r0, r8)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x02b3
            r5.add(r6)     // Catch:{ all -> 0x0071 }
            goto L_0x02b3
        L_0x02cb:
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0071 }
            r5 = 0
            r6 = 0
        L_0x02d1:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0358
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x0071 }
            r28 = r7
            qv.b r28 = (qv.C11819b) r28     // Catch:{ all -> 0x0071 }
            r7 = 0
            if (r5 != 0) goto L_0x02f0
            java.lang.String r5 = "Cart fetched, update data"
            java.lang.String r5 = qv.C11818a.a(r5, r7)     // Catch:{ all -> 0x0071 }
            if (r5 != 0) goto L_0x02ec
            goto L_0x0358
        L_0x02ec:
            java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ all -> 0x0071 }
        L_0x02f0:
            if (r6 != 0) goto L_0x033f
            java.lang.Class r6 = r2.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0071 }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ all -> 0x0071 }
            r8 = 36
            r11 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r6, r8, r12, r11, r12)     // Catch:{ all -> 0x0071 }
            r15 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r15, r12, r11, r12)     // Catch:{ all -> 0x0071 }
            int r12 = r13.length()     // Catch:{ all -> 0x0071 }
            if (r12 != 0) goto L_0x0312
            goto L_0x0316
        L_0x0312:
            java.lang.String r6 = HJ.C15854t.P0(r13, r10)     // Catch:{ all -> 0x0071 }
        L_0x0316:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0071 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x0071 }
            r13 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r13)     // Catch:{ all -> 0x0071 }
            if (r12 == 0) goto L_0x0328
            r12 = r27
            goto L_0x032a
        L_0x0328:
            r12 = r26
        L_0x032a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r14.<init>()     // Catch:{ all -> 0x0071 }
            r14.append(r12)     // Catch:{ all -> 0x0071 }
            r12 = r19
            r14.append(r12)     // Catch:{ all -> 0x0071 }
            r14.append(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x0071 }
            goto L_0x0347
        L_0x033f:
            r12 = r19
            r8 = 36
            r11 = 2
            r13 = 1
            r15 = 46
        L_0x0347:
            r31 = 0
            r29 = r0
            r30 = r6
            r32 = r7
            r33 = r5
            r28.a(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0071 }
            r19 = r12
            goto L_0x02d1
        L_0x0358:
            r2.u(r3)     // Catch:{ all -> 0x0071 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x0379 }
        L_0x035f:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0379 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0379 }
            r2.booleanValue()     // Catch:{ all -> 0x0379 }
            r2 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x0379 }
            boolean r1 = r0.e(r1, r5)     // Catch:{ all -> 0x0379 }
            if (r1 == 0) goto L_0x035f
            r1 = 0
            r4.d(r1)
            return r3
        L_0x0379:
            r0 = move-exception
            r5 = r4
            goto L_0x00d7
        L_0x037d:
            r0 = move-exception
            r4 = r5
            r2 = r14
            goto L_0x038b
        L_0x0381:
            r16 = r19
            r8 = 36
            r17 = 46
            r6 = r16
            goto L_0x024c
        L_0x038b:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x0379 }
        L_0x038f:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x0379 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0379 }
            r3.booleanValue()     // Catch:{ all -> 0x0379 }
            r3 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ all -> 0x0379 }
            boolean r2 = r1.e(r2, r5)     // Catch:{ all -> 0x0379 }
            if (r2 != 0) goto L_0x03a5
            goto L_0x038f
        L_0x03a5:
            throw r0     // Catch:{ all -> 0x0379 }
        L_0x03a6:
            r5.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.h(dI.e):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0173 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(java.util.List<Kf.y> r17, dI.C17164e<? super XH.C16807N> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof si.b.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$a r2 = (si.b.a) r2
            int r3 = r2.f76579p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76579p = r3
            goto L_0x001c
        L_0x0017:
            si.b$a r2 = new si.b$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76577n
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76579p
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r7) goto L_0x0058
            if (r5 != r6) goto L_0x0050
            java.lang.Object r0 = r2.f76572i
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76570g
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76569f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76568e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76567d
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r2.f76566c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0176
        L_0x004d:
            r0 = move-exception
            goto L_0x01a0
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0058:
            int r0 = r2.f76573j
            java.lang.Object r5 = r2.f76569f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76568e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76567d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f76566c
            si.b r12 = (si.b) r12
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            r10 = r5
            r5 = r11
            goto L_0x013b
        L_0x0073:
            XH.y.b(r3)
            boolean r3 = r17.isEmpty()
            if (r3 == 0) goto L_0x0121
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x008f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00a6
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r0, r8)
            if (r5 == 0) goto L_0x008f
            r3.add(r4)
            goto L_0x008f
        L_0x00a6:
            java.util.Iterator r2 = r3.iterator()
            r3 = r9
            r4 = r3
        L_0x00ac:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x011e
            java.lang.Object r5 = r2.next()
            r10 = r5
            qv.b r10 = (qv.C11819b) r10
            r14 = 0
            if (r3 != 0) goto L_0x00c9
            java.lang.String r3 = "No items to add"
            java.lang.String r3 = qv.C11818a.a(r3, r14)
            if (r3 != 0) goto L_0x00c5
            goto L_0x011e
        L_0x00c5:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00c9:
            if (r4 != 0) goto L_0x0116
            java.lang.Class<si.b> r4 = si.b.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r5 = 36
            java.lang.String r5 = HJ.C15854t.s1(r4, r5, r9, r6, r9)
            r8 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r8, r9, r6, r9)
            int r8 = r5.length()
            if (r8 != 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r5, r4)
        L_0x00ed:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r8 = "main"
            boolean r5 = HJ.C15854t.b0(r5, r8, r7)
            if (r5 == 0) goto L_0x0100
            java.lang.String r5 = "m"
            goto L_0x0102
        L_0x0100:
            java.lang.String r5 = "b"
        L_0x0102:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "|"
            r8.append(r5)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
        L_0x0116:
            r13 = 0
            r11 = r0
            r12 = r4
            r15 = r3
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x00ac
        L_0x011e:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0121:
            bK.a r3 = r1.f76565k
            r2.f76566c = r1
            r5 = r17
            r2.f76567d = r5
            r2.f76568e = r0
            r2.f76569f = r3
            r2.f76573j = r8
            r2.f76579p = r7
            java.lang.Object r10 = r3.e(r9, r2)
            if (r10 != r4) goto L_0x0138
            return r4
        L_0x0138:
            r12 = r1
            r10 = r3
            r3 = r8
        L_0x013b:
            TJ.B r11 = r12.s()     // Catch:{ all -> 0x019d }
        L_0x013f:
            java.lang.Object r13 = r11.getValue()     // Catch:{ all -> 0x019d }
            r14 = r13
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x019d }
            r14.booleanValue()     // Catch:{ all -> 0x019d }
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r7)     // Catch:{ all -> 0x019d }
            boolean r15 = r11.e(r13, r14)     // Catch:{ all -> 0x019d }
            if (r15 == 0) goto L_0x013f
            ti.a r7 = r12.f76562h     // Catch:{ all -> 0x019d }
            r2.f76566c = r12     // Catch:{ all -> 0x019d }
            r2.f76567d = r5     // Catch:{ all -> 0x019d }
            r2.f76568e = r0     // Catch:{ all -> 0x019d }
            r2.f76569f = r10     // Catch:{ all -> 0x019d }
            r2.f76570g = r11     // Catch:{ all -> 0x019d }
            r2.f76571h = r13     // Catch:{ all -> 0x019d }
            r2.f76572i = r14     // Catch:{ all -> 0x019d }
            r2.f76573j = r3     // Catch:{ all -> 0x019d }
            r2.f76574k = r8     // Catch:{ all -> 0x019d }
            r2.f76575l = r8     // Catch:{ all -> 0x019d }
            r2.f76576m = r8     // Catch:{ all -> 0x019d }
            r2.f76579p = r6     // Catch:{ all -> 0x019d }
            java.lang.Object r3 = r7.addItems(r5, r2)     // Catch:{ all -> 0x019d }
            if (r3 != r4) goto L_0x0174
            return r4
        L_0x0174:
            r4 = r10
            r2 = r12
        L_0x0176:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x004d }
            r2.u(r3)     // Catch:{ all -> 0x004d }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x019b }
        L_0x017f:
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x019b }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x019b }
            r3.booleanValue()     // Catch:{ all -> 0x019b }
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r8)     // Catch:{ all -> 0x019b }
            boolean r2 = r0.e(r2, r3)     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x017f
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x019b }
            r4.d(r9)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x019b:
            r0 = move-exception
            goto L_0x01ba
        L_0x019d:
            r0 = move-exception
            r4 = r10
            r2 = r12
        L_0x01a0:
            TJ.B r2 = r2.s()     // Catch:{ all -> 0x019b }
        L_0x01a4:
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x019b }
            r5 = r3
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x019b }
            r5.booleanValue()     // Catch:{ all -> 0x019b }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r8)     // Catch:{ all -> 0x019b }
            boolean r3 = r2.e(r3, r5)     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x01b9
            goto L_0x01a4
        L_0x01b9:
            throw r0     // Catch:{ all -> 0x019b }
        L_0x01ba:
            r4.d(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.j(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: si.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0 A[SYNTHETIC, Splitter:B:25:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fb A[LOOP:2: B:65:0x017a->B:85:0x01fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0173 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0191 A[EDGE_INSN: B:98:0x0191->B:67:0x0191 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n(Kf.y r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof si.b.j
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$j r2 = (si.b.j) r2
            int r3 = r2.f76780z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76780z = r3
            goto L_0x001c
        L_0x0017:
            si.b$j r2 = new si.b$j
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76778x
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76780z
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x008a
            if (r5 == r7) goto L_0x0070
            if (r5 != r6) goto L_0x0068
            java.lang.Object r0 = r2.f76769o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76768n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76767m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76766l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76765k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76764j
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76763i
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r2.f76761g
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f76760f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76759e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76758d
            Kf.y r0 = (Kf.y) r0
            java.lang.Object r0 = r2.f76757c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x01cc
        L_0x0065:
            r0 = move-exception
            goto L_0x01ff
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0070:
            int r0 = r2.f76771q
            java.lang.Object r5 = r2.f76760f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r10 = r2.f76759e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f76758d
            Kf.y r11 = (Kf.y) r11
            java.lang.Object r12 = r2.f76757c
            si.b r12 = (si.b) r12
            XH.y.b(r3)
            r3 = r0
            r0 = r10
            r10 = r5
            r5 = r11
            goto L_0x00a7
        L_0x008a:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76757c = r1
            r5 = r21
            r2.f76758d = r5
            r2.f76759e = r0
            r2.f76760f = r3
            r2.f76771q = r8
            r2.f76780z = r7
            java.lang.Object r10 = r3.e(r9, r2)
            if (r10 != r4) goto L_0x00a4
            return r4
        L_0x00a4:
            r12 = r1
            r10 = r3
            r3 = r8
        L_0x00a7:
            qv.e r11 = qv.e.DEBUG     // Catch:{ all -> 0x016f }
            qv.d r13 = qv.d.f102012a     // Catch:{ all -> 0x016f }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x016f }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x016f }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x016f }
            r15.<init>()     // Catch:{ all -> 0x016f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x016f }
        L_0x00ba:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x016f }
            if (r14 == 0) goto L_0x00d6
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00d2 }
            r7 = r14
            qv.b r7 = (qv.C11819b) r7     // Catch:{ all -> 0x00d2 }
            boolean r7 = r7.b(r11, r8)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00d0
            r15.add(r14)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            r7 = 1
            goto L_0x00ba
        L_0x00d2:
            r0 = move-exception
            r1 = r9
            goto L_0x021a
        L_0x00d6:
            java.util.Iterator r7 = r15.iterator()     // Catch:{ all -> 0x016f }
            r13 = r9
            r14 = r13
            r16 = r15
        L_0x00de:
            boolean r17 = r7.hasNext()     // Catch:{ all -> 0x016f }
            if (r17 == 0) goto L_0x0173
            java.lang.Object r19 = r7.next()     // Catch:{ all -> 0x016f }
            r16 = r19
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x016f }
            r8 = 0
            if (r13 != 0) goto L_0x0100
            java.lang.String r6 = "Update cart item"
            java.lang.String r6 = qv.C11818a.a(r6, r8)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00fc
            r9 = r15
            r1 = r19
            goto L_0x0176
        L_0x00fc:
            java.lang.String r13 = qv.C11820c.a(r6)     // Catch:{ all -> 0x00d2 }
        L_0x0100:
            r6 = r13
            if (r14 != 0) goto L_0x0152
            java.lang.Class r13 = r12.getClass()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x00d2 }
            kotlin.jvm.internal.C17542s.g(r13)     // Catch:{ all -> 0x00d2 }
            r14 = 36
            r8 = 2
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            r1 = 46
            java.lang.String r1 = HJ.C15854t.o1(r14, r1, r9, r8, r9)     // Catch:{ all -> 0x00d2 }
            int r8 = r1.length()     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.String r8 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r1, r8)     // Catch:{ all -> 0x00d2 }
        L_0x0128:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "main"
            r14 = 1
            boolean r1 = HJ.C15854t.b0(r1, r8, r14)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = "m"
            goto L_0x013e
        L_0x013c:
            java.lang.String r1 = "b"
        L_0x013e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "|"
            r8.append(r1)     // Catch:{ all -> 0x00d2 }
            r8.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x00d2 }
        L_0x0152:
            r1 = r14
            r8 = 0
            r13 = r16
            r14 = r11
            r9 = r15
            r15 = r1
            r16 = r8
            r8 = 0
            r17 = r8
            r18 = r6
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x016f }
            r14 = r1
            r13 = r6
            r15 = r9
            r16 = r19
            r6 = 2
            r8 = 0
            r9 = 0
            r1 = r20
            goto L_0x00de
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            r1 = 0
            goto L_0x021a
        L_0x0173:
            r9 = r15
            r1 = r16
        L_0x0176:
            TJ.B r6 = r12.s()     // Catch:{ all -> 0x01f7 }
        L_0x017a:
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x01f7 }
            r15 = r8
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x01f7 }
            r15.booleanValue()     // Catch:{ all -> 0x01f7 }
            r16 = r4
            r15 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r15)     // Catch:{ all -> 0x01f7 }
            boolean r17 = r6.e(r8, r4)     // Catch:{ all -> 0x01f7 }
            if (r17 == 0) goto L_0x01fb
            ti.a r15 = r12.f76562h     // Catch:{ all -> 0x01f7 }
            r2.f76757c = r12     // Catch:{ all -> 0x01f7 }
            r2.f76758d = r5     // Catch:{ all -> 0x01f7 }
            r2.f76759e = r0     // Catch:{ all -> 0x01f7 }
            r2.f76760f = r10     // Catch:{ all -> 0x01f7 }
            r2.f76761g = r6     // Catch:{ all -> 0x01f7 }
            r2.f76762h = r8     // Catch:{ all -> 0x01f7 }
            r2.f76763i = r4     // Catch:{ all -> 0x01f7 }
            r2.f76764j = r12     // Catch:{ all -> 0x01f7 }
            r2.f76765k = r11     // Catch:{ all -> 0x01f7 }
            r2.f76766l = r13     // Catch:{ all -> 0x01f7 }
            r2.f76767m = r14     // Catch:{ all -> 0x01f7 }
            r2.f76768n = r9     // Catch:{ all -> 0x01f7 }
            r2.f76769o = r7     // Catch:{ all -> 0x01f7 }
            r2.f76770p = r1     // Catch:{ all -> 0x01f7 }
            r2.f76771q = r3     // Catch:{ all -> 0x01f7 }
            r1 = 0
            r2.f76772r = r1     // Catch:{ all -> 0x01f7 }
            r2.f76773s = r1     // Catch:{ all -> 0x01f7 }
            r2.f76774t = r1     // Catch:{ all -> 0x01f7 }
            r2.f76775u = r1     // Catch:{ all -> 0x01f7 }
            r2.f76776v = r1     // Catch:{ all -> 0x01f7 }
            r2.f76777w = r1     // Catch:{ all -> 0x01f7 }
            r4 = 2
            r2.f76780z = r4     // Catch:{ all -> 0x01f7 }
            java.lang.Object r3 = r15.i(r5, r2)     // Catch:{ all -> 0x01f7 }
            r8 = r16
            if (r3 != r8) goto L_0x01ca
            return r8
        L_0x01ca:
            r4 = r10
            r2 = r12
        L_0x01cc:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0065 }
            r2.u(r3)     // Catch:{ all -> 0x0065 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x01d5:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01f3 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01f3 }
            r2.booleanValue()     // Catch:{ all -> 0x01f3 }
            r2 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.e(r1, r3)     // Catch:{ all -> 0x01f3 }
            if (r1 == 0) goto L_0x01d5
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01f3 }
            r1 = 0
            r4.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01f3:
            r0 = move-exception
            r10 = r4
            goto L_0x0170
        L_0x01f7:
            r0 = move-exception
            r4 = r10
            r2 = r12
            goto L_0x01ff
        L_0x01fb:
            r4 = r16
            goto L_0x017a
        L_0x01ff:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x01f3 }
        L_0x0203:
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x01f3 }
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x01f3 }
            r3.booleanValue()     // Catch:{ all -> 0x01f3 }
            r3 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r1.e(r2, r5)     // Catch:{ all -> 0x01f3 }
            if (r2 != 0) goto L_0x0219
            goto L_0x0203
        L_0x0219:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x021a:
            r10.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.n(Kf.y, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: si.b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0583 A[Catch:{ all -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05a4 A[Catch:{ all -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0647 A[Catch:{ all -> 0x0659 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0669 A[Catch:{ all -> 0x0659 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cf A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x012f A[EDGE_INSN: B:280:0x012f->B:46:0x012f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0612 A[EDGE_INSN: B:322:0x0612->B:232:0x0612 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x06db A[EDGE_INSN: B:331:0x06db->B:266:0x06db ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0135 A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01aa A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object t(java.lang.String r35, dI.C17164e<? super XH.C16807N> r36) {
        /*
            r34 = this;
            r1 = r34
            r0 = r36
            boolean r2 = r0 instanceof si.b.g
            if (r2 == 0) goto L_0x0017
            r2 = r0
            si.b$g r2 = (si.b.g) r2
            int r3 = r2.f76709y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f76709y = r3
            goto L_0x001c
        L_0x0017:
            si.b$g r2 = new si.b$g
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f76707w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f76709y
            java.lang.Class<si.b> r6 = si.b.class
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 1
            r15 = 2
            r12 = 0
            if (r5 == 0) goto L_0x0096
            if (r5 == r14) goto L_0x007f
            if (r5 != r15) goto L_0x0077
            java.lang.Object r0 = r2.f76697m
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f76696l
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f76695k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76694j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76693i
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f76692h
            si.b r0 = (si.b) r0
            java.lang.Object r0 = r2.f76691g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76690f
            r4 = r0
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r0 = r2.f76689e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f76688d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f76687c
            r2 = r0
            si.b r2 = (si.b) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0070 }
            r22 = r8
            r23 = r9
            goto L_0x054c
        L_0x0070:
            r0 = move-exception
            r22 = r8
            r23 = r9
            goto L_0x0615
        L_0x0077:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x007f:
            int r0 = r2.f76699o
            java.lang.Object r5 = r2.f76690f
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r15 = r2.f76689e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r13 = r2.f76688d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f76687c
            si.b r14 = (si.b) r14
            XH.y.b(r3)
            r3 = r5
            goto L_0x00b6
        L_0x0096:
            XH.y.b(r3)
            bK.a r3 = r1.f76565k
            r2.f76687c = r1
            r5 = r35
            r2.f76688d = r5
            r2.f76689e = r0
            r2.f76690f = r3
            r2.f76699o = r12
            r13 = 1
            r2.f76709y = r13
            r13 = 0
            java.lang.Object r14 = r3.e(r13, r2)
            if (r14 != r4) goto L_0x00b2
            return r4
        L_0x00b2:
            r15 = r0
            r14 = r1
            r13 = r5
            r0 = r12
        L_0x00b6:
            qv.e r5 = qv.e.DEBUG     // Catch:{ all -> 0x00eb }
            qv.d r16 = qv.d.f102012a     // Catch:{ all -> 0x00eb }
            java.util.List r16 = r16.a()     // Catch:{ all -> 0x00eb }
            java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x00eb }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00eb }
            r12.<init>()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x00eb }
        L_0x00c9:
            boolean r17 = r16.hasNext()     // Catch:{ all -> 0x00eb }
            if (r17 == 0) goto L_0x00ef
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x00eb }
            r22 = r8
            r8 = r1
            qv.b r8 = (qv.C11819b) r8     // Catch:{ all -> 0x00eb }
            r23 = r9
            r9 = 0
            boolean r8 = r8.b(r5, r9)     // Catch:{ all -> 0x00eb }
            if (r8 == 0) goto L_0x00e4
            r12.add(r1)     // Catch:{ all -> 0x00eb }
        L_0x00e4:
            r1 = r34
            r8 = r22
            r9 = r23
            goto L_0x00c9
        L_0x00eb:
            r0 = move-exception
        L_0x00ec:
            r1 = 0
            goto L_0x06f3
        L_0x00ef:
            r22 = r8
            r23 = r9
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x00eb }
            r8 = 0
            r9 = 0
        L_0x00f9:
            boolean r12 = r1.hasNext()     // Catch:{ all -> 0x00eb }
            if (r12 == 0) goto L_0x012f
            java.lang.Object r12 = r1.next()     // Catch:{ all -> 0x00eb }
            r16 = r12
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x00eb }
            if (r8 != 0) goto L_0x013a
            if (r13 == 0) goto L_0x0114
            int r8 = r13.length()     // Catch:{ all -> 0x00eb }
            if (r8 != 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r8 = 1
            goto L_0x0115
        L_0x0114:
            r8 = 0
        L_0x0115:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r12.<init>()     // Catch:{ all -> 0x00eb }
            r36 = r1
            java.lang.String r1 = "Cart migration: Has guest session: "
            r12.append(r1)     // Catch:{ all -> 0x00eb }
            r12.append(r8)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x00eb }
            r8 = 0
            java.lang.String r1 = qv.C11818a.a(r1, r8)     // Catch:{ all -> 0x00eb }
            if (r1 != 0) goto L_0x0135
        L_0x012f:
            r25 = r0
            r24 = r4
            goto L_0x01a8
        L_0x0135:
            java.lang.String r8 = qv.C11820c.a(r1)     // Catch:{ all -> 0x00eb }
            goto L_0x013c
        L_0x013a:
            r36 = r1
        L_0x013c:
            if (r9 != 0) goto L_0x018e
            java.lang.Class r1 = r14.getClass()     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00eb }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x00eb }
            r25 = r0
            r24 = r4
            r4 = 0
            r9 = 36
            r12 = 2
            java.lang.String r0 = HJ.C15854t.s1(r1, r9, r4, r12, r4)     // Catch:{ all -> 0x00eb }
            r9 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r9, r4, r12, r4)     // Catch:{ all -> 0x00eb }
            int r4 = r0.length()     // Catch:{ all -> 0x00eb }
            if (r4 != 0) goto L_0x0162
            goto L_0x0166
        L_0x0162:
            java.lang.String r1 = HJ.C15854t.P0(r0, r11)     // Catch:{ all -> 0x00eb }
        L_0x0166:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00eb }
            r4 = 1
            boolean r0 = HJ.C15854t.b0(r0, r10, r4)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0178
            r0 = r23
            goto L_0x017a
        L_0x0178:
            r0 = r22
        L_0x017a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r4.<init>()     // Catch:{ all -> 0x00eb }
            r4.append(r0)     // Catch:{ all -> 0x00eb }
            r4.append(r7)     // Catch:{ all -> 0x00eb }
            r4.append(r1)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00eb }
            r9 = r0
            goto L_0x0192
        L_0x018e:
            r25 = r0
            r24 = r4
        L_0x0192:
            r19 = 0
            r17 = r5
            r18 = r9
            r0 = 0
            r20 = r0
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00eb }
            r1 = r36
            r4 = r24
            r0 = r25
            goto L_0x00f9
        L_0x01a8:
            if (r13 == 0) goto L_0x06e9
            int r0 = r13.length()     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x01b2
            goto L_0x06e9
        L_0x01b2:
            TJ.B r0 = r14.r()     // Catch:{ all -> 0x00eb }
        L_0x01b6:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00eb }
            r4 = r1
            Ln.g r4 = (Ln.g) r4     // Catch:{ all -> 0x00eb }
            r4 = 0
            boolean r1 = r0.e(r1, r4)     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x01b6
            TJ.B r0 = r14.s()     // Catch:{ all -> 0x0221 }
        L_0x01c8:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0221 }
            r4 = r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0221 }
            r4.booleanValue()     // Catch:{ all -> 0x0221 }
            r4 = 1
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ all -> 0x0221 }
            boolean r1 = r0.e(r1, r5)     // Catch:{ all -> 0x0221 }
            if (r1 == 0) goto L_0x01c8
            com.ingka.ikea.app.providers.cart.db.CartItemDatabase r0 = r14.q()     // Catch:{ all -> 0x0221 }
            pi.a r0 = r0.c()     // Catch:{ all -> 0x0221 }
            java.util.List r0 = r0.b()     // Catch:{ all -> 0x0221 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0221 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0221 }
            r1 = 1
            r4 = r0 ^ 1
            qv.e r1 = qv.e.DEBUG     // Catch:{ all -> 0x0221 }
            qv.d r5 = qv.d.f102012a     // Catch:{ all -> 0x0221 }
            java.util.List r5 = r5.a()     // Catch:{ all -> 0x0221 }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x0221 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0221 }
            r8.<init>()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0205:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0221 }
            if (r9 == 0) goto L_0x0226
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0221 }
            r12 = r9
            qv.b r12 = (qv.C11819b) r12     // Catch:{ all -> 0x0221 }
            r35 = r5
            r5 = 0
            boolean r12 = r12.b(r1, r5)     // Catch:{ all -> 0x0221 }
            if (r12 == 0) goto L_0x021e
            r8.add(r9)     // Catch:{ all -> 0x0221 }
        L_0x021e:
            r5 = r35
            goto L_0x0205
        L_0x0221:
            r0 = move-exception
            r4 = r3
            r2 = r14
            goto L_0x0615
        L_0x0226:
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x0221 }
            r8 = 0
            r9 = 0
        L_0x022c:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x0221 }
            if (r12 == 0) goto L_0x0254
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x0221 }
            r16 = r12
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x0221 }
            if (r8 != 0) goto L_0x025e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r8.<init>()     // Catch:{ all -> 0x0221 }
            java.lang.String r12 = "Cart migration: Check if cart has items: "
            r8.append(r12)     // Catch:{ all -> 0x0221 }
            r8.append(r4)     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0221 }
            r12 = 0
            java.lang.String r8 = qv.C11818a.a(r8, r12)     // Catch:{ all -> 0x0221 }
            if (r8 != 0) goto L_0x025a
        L_0x0254:
            r26 = r4
            r27 = r15
            goto L_0x02ca
        L_0x025a:
            java.lang.String r8 = qv.C11820c.a(r8)     // Catch:{ all -> 0x0221 }
        L_0x025e:
            if (r9 != 0) goto L_0x02ae
            java.lang.String r9 = r6.getName()     // Catch:{ all -> 0x0221 }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ all -> 0x0221 }
            r26 = r4
            r36 = r5
            r27 = r15
            r4 = 0
            r5 = 2
            r12 = 36
            java.lang.String r15 = HJ.C15854t.s1(r9, r12, r4, r5, r4)     // Catch:{ all -> 0x0221 }
            r12 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r12, r4, r5, r4)     // Catch:{ all -> 0x0221 }
            int r4 = r15.length()     // Catch:{ all -> 0x0221 }
            if (r4 != 0) goto L_0x0282
            goto L_0x0286
        L_0x0282:
            java.lang.String r9 = HJ.C15854t.P0(r15, r11)     // Catch:{ all -> 0x0221 }
        L_0x0286:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0221 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0221 }
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r10, r5)     // Catch:{ all -> 0x0221 }
            if (r4 == 0) goto L_0x0298
            r4 = r23
            goto L_0x029a
        L_0x0298:
            r4 = r22
        L_0x029a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r5.<init>()     // Catch:{ all -> 0x0221 }
            r5.append(r4)     // Catch:{ all -> 0x0221 }
            r5.append(r7)     // Catch:{ all -> 0x0221 }
            r5.append(r9)     // Catch:{ all -> 0x0221 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0221 }
            r9 = r4
            goto L_0x02b4
        L_0x02ae:
            r26 = r4
            r36 = r5
            r27 = r15
        L_0x02b4:
            r19 = 0
            r17 = r1
            r18 = r9
            r4 = 0
            r20 = r4
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0221 }
            r5 = r36
            r4 = r26
            r15 = r27
            goto L_0x022c
        L_0x02ca:
            if (r0 == 0) goto L_0x0394
            qv.e r0 = qv.e.DEBUG     // Catch:{ all -> 0x0221 }
            qv.d r1 = qv.d.f102012a     // Catch:{ all -> 0x0221 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x0221 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0221 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0221 }
            r2.<init>()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0221 }
        L_0x02df:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r4 == 0) goto L_0x02f7
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0221 }
            r5 = r4
            qv.b r5 = (qv.C11819b) r5     // Catch:{ all -> 0x0221 }
            r8 = 0
            boolean r5 = r5.b(r0, r8)     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x02df
            r2.add(r4)     // Catch:{ all -> 0x0221 }
            goto L_0x02df
        L_0x02f7:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0221 }
            r2 = 0
            r4 = 0
        L_0x02fd:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x0371
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0221 }
            r28 = r5
            qv.b r28 = (qv.C11819b) r28     // Catch:{ all -> 0x0221 }
            r5 = 0
            if (r2 != 0) goto L_0x031b
            java.lang.String r2 = "No guest items available in cart, no need to migrate"
            java.lang.String r2 = qv.C11818a.a(r2, r5)     // Catch:{ all -> 0x0221 }
            if (r2 != 0) goto L_0x0317
            goto L_0x0371
        L_0x0317:
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ all -> 0x0221 }
        L_0x031b:
            if (r4 != 0) goto L_0x0363
            java.lang.String r4 = r6.getName()     // Catch:{ all -> 0x0221 }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x0221 }
            r8 = 36
            r9 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r12, r9, r12)     // Catch:{ all -> 0x0221 }
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r12, r9, r12)     // Catch:{ all -> 0x0221 }
            int r8 = r13.length()     // Catch:{ all -> 0x0221 }
            if (r8 != 0) goto L_0x0339
            goto L_0x033d
        L_0x0339:
            java.lang.String r4 = HJ.C15854t.P0(r13, r11)     // Catch:{ all -> 0x0221 }
        L_0x033d:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0221 }
            r9 = 1
            boolean r8 = HJ.C15854t.b0(r8, r10, r9)     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x034f
            r8 = r23
            goto L_0x0351
        L_0x034f:
            r8 = r22
        L_0x0351:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r9.<init>()     // Catch:{ all -> 0x0221 }
            r9.append(r8)     // Catch:{ all -> 0x0221 }
            r9.append(r7)     // Catch:{ all -> 0x0221 }
            r9.append(r4)     // Catch:{ all -> 0x0221 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0221 }
        L_0x0363:
            r31 = 0
            r29 = r0
            r30 = r4
            r32 = r5
            r33 = r2
            r28.a(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0221 }
            goto L_0x02fd
        L_0x0371:
            TJ.B r0 = r14.s()     // Catch:{ all -> 0x0221 }
        L_0x0375:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0221 }
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0221 }
            r2.booleanValue()     // Catch:{ all -> 0x0221 }
            r2 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x0221 }
            boolean r1 = r0.e(r1, r4)     // Catch:{ all -> 0x0221 }
            if (r1 == 0) goto L_0x0375
            r14.o()     // Catch:{ all -> 0x0221 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0221 }
            r1 = 0
            r3.d(r1)
            return r0
        L_0x0394:
            qv.e r0 = qv.e.DEBUG     // Catch:{ all -> 0x0221 }
            qv.d r1 = qv.d.f102012a     // Catch:{ all -> 0x0221 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x0221 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0221 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0221 }
            r4.<init>()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0221 }
        L_0x03a7:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x03bf
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0221 }
            r8 = r5
            qv.b r8 = (qv.C11819b) r8     // Catch:{ all -> 0x0221 }
            r9 = 0
            boolean r8 = r8.b(r0, r9)     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x03a7
            r4.add(r5)     // Catch:{ all -> 0x0221 }
            goto L_0x03a7
        L_0x03bf:
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0221 }
            r9 = r4
            r5 = 0
            r8 = 0
        L_0x03c6:
            boolean r12 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r12 == 0) goto L_0x03df
            java.lang.Object r9 = r1.next()     // Catch:{ all -> 0x0221 }
            r16 = r9
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x0221 }
            r12 = 0
            if (r5 != 0) goto L_0x03e7
            java.lang.String r15 = "Cart migration: Replace cart"
            java.lang.String r15 = qv.C11818a.a(r15, r12)     // Catch:{ all -> 0x0221 }
            if (r15 != 0) goto L_0x03e3
        L_0x03df:
            r28 = r1
            goto L_0x044d
        L_0x03e3:
            java.lang.String r5 = qv.C11820c.a(r15)     // Catch:{ all -> 0x0221 }
        L_0x03e7:
            if (r8 != 0) goto L_0x0435
            java.lang.String r8 = r6.getName()     // Catch:{ all -> 0x0221 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ all -> 0x0221 }
            r28 = r1
            r36 = r9
            r9 = 0
            r12 = 2
            r15 = 36
            java.lang.String r1 = HJ.C15854t.s1(r8, r15, r9, r12, r9)     // Catch:{ all -> 0x0221 }
            r15 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r15, r9, r12, r9)     // Catch:{ all -> 0x0221 }
            int r9 = r1.length()     // Catch:{ all -> 0x0221 }
            if (r9 != 0) goto L_0x0409
            goto L_0x040d
        L_0x0409:
            java.lang.String r8 = HJ.C15854t.P0(r1, r11)     // Catch:{ all -> 0x0221 }
        L_0x040d:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0221 }
            r9 = 1
            boolean r1 = HJ.C15854t.b0(r1, r10, r9)     // Catch:{ all -> 0x0221 }
            if (r1 == 0) goto L_0x041f
            r1 = r23
            goto L_0x0421
        L_0x041f:
            r1 = r22
        L_0x0421:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r9.<init>()     // Catch:{ all -> 0x0221 }
            r9.append(r1)     // Catch:{ all -> 0x0221 }
            r9.append(r7)     // Catch:{ all -> 0x0221 }
            r9.append(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x0221 }
            r8 = r1
            goto L_0x0439
        L_0x0435:
            r28 = r1
            r36 = r9
        L_0x0439:
            r19 = 0
            r17 = r0
            r18 = r8
            r1 = 0
            r20 = r1
            r21 = r5
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0221 }
            r9 = r36
            r1 = r28
            goto L_0x03c6
        L_0x044d:
            nA.a r1 = r14.f76564j     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = r1.a(r13)     // Catch:{ all -> 0x0221 }
            int r12 = r1.length()     // Catch:{ all -> 0x0221 }
            if (r12 != 0) goto L_0x050a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0221 }
            java.lang.String r1 = "Merge user cart, user id was null"
            r0.<init>(r1)     // Catch:{ all -> 0x0221 }
            qv.e r1 = qv.e.ERROR     // Catch:{ all -> 0x0221 }
            qv.d r2 = qv.d.f102012a     // Catch:{ all -> 0x0221 }
            java.util.List r2 = r2.a()     // Catch:{ all -> 0x0221 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0221 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0221 }
            r4.<init>()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0473:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x048b
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0221 }
            r8 = r5
            qv.b r8 = (qv.C11819b) r8     // Catch:{ all -> 0x0221 }
            r9 = 0
            boolean r8 = r8.b(r1, r9)     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x0473
            r4.add(r5)     // Catch:{ all -> 0x0221 }
            goto L_0x0473
        L_0x048b:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0221 }
            r4 = 0
            r5 = 0
        L_0x0491:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x0503
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0221 }
            r16 = r8
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x0221 }
            if (r4 != 0) goto L_0x04ad
            r8 = 0
            java.lang.String r4 = qv.C11818a.a(r8, r0)     // Catch:{ all -> 0x0221 }
            if (r4 != 0) goto L_0x04a9
            goto L_0x0503
        L_0x04a9:
            java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ all -> 0x0221 }
        L_0x04ad:
            if (r5 != 0) goto L_0x04f5
            java.lang.String r5 = r6.getName()     // Catch:{ all -> 0x0221 }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ all -> 0x0221 }
            r8 = 36
            r9 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r5, r8, r12, r9, r12)     // Catch:{ all -> 0x0221 }
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r12, r9, r12)     // Catch:{ all -> 0x0221 }
            int r8 = r13.length()     // Catch:{ all -> 0x0221 }
            if (r8 != 0) goto L_0x04cb
            goto L_0x04cf
        L_0x04cb:
            java.lang.String r5 = HJ.C15854t.P0(r13, r11)     // Catch:{ all -> 0x0221 }
        L_0x04cf:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0221 }
            r9 = 1
            boolean r8 = HJ.C15854t.b0(r8, r10, r9)     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x04e1
            r8 = r23
            goto L_0x04e3
        L_0x04e1:
            r8 = r22
        L_0x04e3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r9.<init>()     // Catch:{ all -> 0x0221 }
            r9.append(r8)     // Catch:{ all -> 0x0221 }
            r9.append(r7)     // Catch:{ all -> 0x0221 }
            r9.append(r5)     // Catch:{ all -> 0x0221 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0221 }
        L_0x04f5:
            r19 = 0
            r17 = r1
            r18 = r5
            r20 = r0
            r21 = r4
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0221 }
            goto L_0x0491
        L_0x0503:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0221 }
            r1 = 0
            r3.d(r1)
            return r0
        L_0x050a:
            ti.a r12 = r14.f76562h     // Catch:{ all -> 0x0221 }
            r2.f76687c = r14     // Catch:{ all -> 0x0221 }
            r2.f76688d = r13     // Catch:{ all -> 0x0221 }
            r15 = r27
            r2.f76689e = r15     // Catch:{ all -> 0x0221 }
            r2.f76690f = r3     // Catch:{ all -> 0x0221 }
            r2.f76691g = r1     // Catch:{ all -> 0x0221 }
            r2.f76692h = r14     // Catch:{ all -> 0x0221 }
            r2.f76693i = r0     // Catch:{ all -> 0x0221 }
            r2.f76694j = r5     // Catch:{ all -> 0x0221 }
            r2.f76695k = r8     // Catch:{ all -> 0x0221 }
            r2.f76696l = r4     // Catch:{ all -> 0x0221 }
            r0 = r28
            r2.f76697m = r0     // Catch:{ all -> 0x0221 }
            r2.f76698n = r9     // Catch:{ all -> 0x0221 }
            r4 = r25
            r2.f76699o = r4     // Catch:{ all -> 0x0221 }
            r4 = 0
            r2.f76700p = r4     // Catch:{ all -> 0x0221 }
            r0 = r26
            r2.f76701q = r0     // Catch:{ all -> 0x0221 }
            r2.f76702r = r4     // Catch:{ all -> 0x0221 }
            r2.f76703s = r4     // Catch:{ all -> 0x0221 }
            r2.f76704t = r4     // Catch:{ all -> 0x0221 }
            r2.f76705u = r4     // Catch:{ all -> 0x0221 }
            r2.f76706v = r4     // Catch:{ all -> 0x0221 }
            r4 = 2
            r2.f76709y = r4     // Catch:{ all -> 0x0221 }
            java.lang.Object r0 = r12.a(r1, r2)     // Catch:{ all -> 0x0221 }
            r1 = r24
            if (r0 != r1) goto L_0x0549
            return r1
        L_0x0549:
            r4 = r3
            r2 = r14
            r3 = r0
        L_0x054c:
            si.a r3 = (si.a) r3     // Catch:{ all -> 0x0595 }
            r2.u(r3)     // Catch:{ all -> 0x0595 }
            TJ.B r0 = r2.s()     // Catch:{ all -> 0x0595 }
        L_0x0555:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0595 }
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0595 }
            r3.booleanValue()     // Catch:{ all -> 0x0595 }
            r3 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ all -> 0x0595 }
            boolean r1 = r0.e(r1, r5)     // Catch:{ all -> 0x0595 }
            if (r1 == 0) goto L_0x0555
            qv.e r0 = qv.e.DEBUG     // Catch:{ all -> 0x0595 }
            qv.d r1 = qv.d.f102012a     // Catch:{ all -> 0x0595 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x0595 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0595 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0595 }
            r3.<init>()     // Catch:{ all -> 0x0595 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0595 }
        L_0x057d:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0595 }
            if (r5 == 0) goto L_0x0598
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0595 }
            r8 = r5
            qv.b r8 = (qv.C11819b) r8     // Catch:{ all -> 0x0595 }
            r9 = 0
            boolean r8 = r8.b(r0, r9)     // Catch:{ all -> 0x0595 }
            if (r8 == 0) goto L_0x057d
            r3.add(r5)     // Catch:{ all -> 0x0595 }
            goto L_0x057d
        L_0x0595:
            r0 = move-exception
            goto L_0x0615
        L_0x0598:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0595 }
            r3 = 0
            r5 = 0
        L_0x059e:
            boolean r8 = r1.hasNext()     // Catch:{ all -> 0x0595 }
            if (r8 == 0) goto L_0x0612
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0595 }
            r16 = r8
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x0595 }
            r8 = 0
            if (r3 != 0) goto L_0x05bc
            java.lang.String r3 = "Cart migration: Completed"
            java.lang.String r3 = qv.C11818a.a(r3, r8)     // Catch:{ all -> 0x0595 }
            if (r3 != 0) goto L_0x05b8
            goto L_0x0612
        L_0x05b8:
            java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ all -> 0x0595 }
        L_0x05bc:
            if (r5 != 0) goto L_0x0604
            java.lang.String r5 = r6.getName()     // Catch:{ all -> 0x0595 }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ all -> 0x0595 }
            r9 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r5, r9, r13, r12, r13)     // Catch:{ all -> 0x0595 }
            r9 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r9, r13, r12, r13)     // Catch:{ all -> 0x0595 }
            int r9 = r14.length()     // Catch:{ all -> 0x0595 }
            if (r9 != 0) goto L_0x05da
            goto L_0x05de
        L_0x05da:
            java.lang.String r5 = HJ.C15854t.P0(r14, r11)     // Catch:{ all -> 0x0595 }
        L_0x05de:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0595 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0595 }
            r12 = 1
            boolean r9 = HJ.C15854t.b0(r9, r10, r12)     // Catch:{ all -> 0x0595 }
            if (r9 == 0) goto L_0x05f0
            r9 = r23
            goto L_0x05f2
        L_0x05f0:
            r9 = r22
        L_0x05f2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0595 }
            r12.<init>()     // Catch:{ all -> 0x0595 }
            r12.append(r9)     // Catch:{ all -> 0x0595 }
            r12.append(r7)     // Catch:{ all -> 0x0595 }
            r12.append(r5)     // Catch:{ all -> 0x0595 }
            java.lang.String r5 = r12.toString()     // Catch:{ all -> 0x0595 }
        L_0x0604:
            r19 = 0
            r17 = r0
            r18 = r5
            r20 = r8
            r21 = r3
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0595 }
            goto L_0x059e
        L_0x0612:
            r3 = r4
            goto L_0x06e0
        L_0x0615:
            TJ.B r1 = r2.s()     // Catch:{ all -> 0x0659 }
        L_0x0619:
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x0659 }
            r5 = r3
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0659 }
            r5.booleanValue()     // Catch:{ all -> 0x0659 }
            r5 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch:{ all -> 0x0659 }
            boolean r3 = r1.e(r3, r8)     // Catch:{ all -> 0x0659 }
            if (r3 == 0) goto L_0x0619
            qv.e r1 = qv.e.WARN     // Catch:{ all -> 0x0659 }
            qv.d r3 = qv.d.f102012a     // Catch:{ all -> 0x0659 }
            java.util.List r3 = r3.a()     // Catch:{ all -> 0x0659 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0659 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0659 }
            r5.<init>()     // Catch:{ all -> 0x0659 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0659 }
        L_0x0641:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0659 }
            if (r8 == 0) goto L_0x065d
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0659 }
            r9 = r8
            qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x0659 }
            r12 = 0
            boolean r9 = r9.b(r1, r12)     // Catch:{ all -> 0x0659 }
            if (r9 == 0) goto L_0x0641
            r5.add(r8)     // Catch:{ all -> 0x0659 }
            goto L_0x0641
        L_0x0659:
            r0 = move-exception
            r3 = r4
            goto L_0x00ec
        L_0x065d:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x0659 }
            r5 = 0
            r8 = 0
        L_0x0663:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x0659 }
            if (r9 == 0) goto L_0x06db
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x0659 }
            r16 = r9
            qv.b r16 = (qv.C11819b) r16     // Catch:{ all -> 0x0659 }
            if (r5 != 0) goto L_0x0680
            java.lang.String r5 = "Failed to migrate the cart."
            java.lang.String r5 = qv.C11818a.a(r5, r0)     // Catch:{ all -> 0x0659 }
            if (r5 != 0) goto L_0x067c
            goto L_0x06db
        L_0x067c:
            java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ all -> 0x0659 }
        L_0x0680:
            if (r8 != 0) goto L_0x06c9
            java.lang.String r8 = r6.getName()     // Catch:{ all -> 0x0659 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ all -> 0x0659 }
            r9 = 36
            r12 = 0
            r13 = 2
            java.lang.String r14 = HJ.C15854t.s1(r8, r9, r12, r13, r12)     // Catch:{ all -> 0x0659 }
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r12, r13, r12)     // Catch:{ all -> 0x0659 }
            int r12 = r14.length()     // Catch:{ all -> 0x0659 }
            if (r12 != 0) goto L_0x069e
            goto L_0x06a2
        L_0x069e:
            java.lang.String r8 = HJ.C15854t.P0(r14, r11)     // Catch:{ all -> 0x0659 }
        L_0x06a2:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0659 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x0659 }
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r10, r14)     // Catch:{ all -> 0x0659 }
            if (r12 == 0) goto L_0x06b4
            r12 = r23
            goto L_0x06b6
        L_0x06b4:
            r12 = r22
        L_0x06b6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0659 }
            r9.<init>()     // Catch:{ all -> 0x0659 }
            r9.append(r12)     // Catch:{ all -> 0x0659 }
            r9.append(r7)     // Catch:{ all -> 0x0659 }
            r9.append(r8)     // Catch:{ all -> 0x0659 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0659 }
            goto L_0x06cd
        L_0x06c9:
            r13 = 2
            r14 = 1
            r15 = 46
        L_0x06cd:
            r19 = 0
            r17 = r1
            r18 = r8
            r20 = r0
            r21 = r5
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0659 }
            goto L_0x0663
        L_0x06db:
            r2.l()     // Catch:{ all -> 0x0659 }
            goto L_0x0612
        L_0x06e0:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00eb }
            r1 = 0
            r3.d(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x06e9:
            r14.o()     // Catch:{ all -> 0x00eb }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00eb }
            r1 = 0
            r3.d(r1)
            return r0
        L_0x06f3:
            r3.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.b.t(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ti.a aVar, C13909a aVar2, CartItemDatabase cartItemDatabase, M m10, C14838a aVar3) {
        super(cartItemDatabase, m10);
        C17542s.j(aVar, "cartNetworkWrapper");
        C17542s.j(aVar2, "sessionManager");
        C17542s.j(cartItemDatabase, "database");
        C17542s.j(m10, "cartCoroutineDispatcher");
        C17542s.j(aVar3, "getUserIdFromTokenUseCase");
        this.f76562h = aVar;
        this.f76563i = aVar2;
        this.f76564j = aVar3;
        this.f76565k = bK.g.b(false, 1, (Object) null);
    }
}
