package Up;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aq.C11080b;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.discover.impl.DiscoveriesRemote;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0015H@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LUp/c;", "LTp/b;", "LUp/b;", "discoverEndpoint", "LUp/e;", "secureDiscoverEndpoint", "LCx/b;", "publisherTokenManager", "LQJ/M;", "ioDispatcher", "LGo/a;", "clientIdentityProvider", "<init>", "(LUp/b;LUp/e;LCx/b;LQJ/M;LGo/a;)V", "", "prioritiser", "Laq/b;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "recentItems", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "c", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "LUp/b;", "LUp/e;", "LCx/b;", "d", "LQJ/M;", "e", "LGo/a;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Tp.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f88334a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f88335b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Cx.b f88336c;

    /* renamed from: d  reason: collision with root package name */
    private final M f88337d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Go.a f88338e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Laq/b;", "<anonymous>", "(LQJ/Q;)Laq/b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.discover.impl.DiscoverRepositoryImpl$getDiscoverFeed$2", f = "DiscoverRepositoryImpl.kt", l = {31, 36}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C11080b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88339c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f88340d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f88341e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f88340d = cVar;
            this.f88341e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f88340d, this.f88341e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C11080b> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            DiscoveriesRemote discoveriesRemote;
            Object f10 = C17187b.f();
            int i10 = this.f88339c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f88340d.f88336c.d()) {
                    e g10 = this.f88340d.f88335b;
                    String c10 = this.f88340d.f88336c.c();
                    String str = this.f88341e;
                    this.f88339c = 1;
                    obj = g10.b(c10, str, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    b e10 = this.f88340d.f88334a;
                    String str2 = this.f88341e;
                    this.f88339c = 2;
                    obj = e10.b(str2, this);
                    if (obj == f10) {
                        return f10;
                    }
                    discoveriesRemote = (DiscoveriesRemote) obj;
                    return discoveriesRemote.b(this.f88340d.f88336c.d());
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                discoveriesRemote = (DiscoveriesRemote) obj;
                return discoveriesRemote.b(this.f88340d.f88336c.d());
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            discoveriesRemote = (DiscoveriesRemote) obj;
            return discoveriesRemote.b(this.f88340d.f88336c.d());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "<anonymous>", "(LQJ/Q;)Lcom/ingka/ikea/core/model/product/ProductCarousel;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.discover.impl.DiscoverRepositoryImpl$getRecentOnSale$2", f = "DiscoverRepositoryImpl.kt", l = {55}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super ProductCarousel>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f88343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f88343d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f88343d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super ProductCarousel> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f88342c;
            if (i10 == 0) {
                y.b(obj);
                b e10 = this.f88343d.f88334a;
                this.f88342c = 1;
                obj = e10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((ProductCarouselRemote) obj).b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "<anonymous>", "(LQJ/Q;)Lcom/ingka/ikea/core/model/product/ProductCarousel;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.discover.impl.DiscoverRepositoryImpl$getRecommendationsOrNewOnSale$2", f = "DiscoverRepositoryImpl.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: Up.c$c  reason: collision with other inner class name */
    static final class C1855c extends l implements p<Q, C17164e<? super ProductCarousel>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88344c;

        /* renamed from: d  reason: collision with root package name */
        Object f88345d;

        /* renamed from: e  reason: collision with root package name */
        Object f88346e;

        /* renamed from: f  reason: collision with root package name */
        Object f88347f;

        /* renamed from: g  reason: collision with root package name */
        Object f88348g;

        /* renamed from: h  reason: collision with root package name */
        Object f88349h;

        /* renamed from: i  reason: collision with root package name */
        int f88350i;

        /* renamed from: j  reason: collision with root package name */
        int f88351j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f88352k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ List<String> f88353l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1855c(c cVar, List<String> list, C17164e<? super C1855c> eVar) {
            super(2, eVar);
            this.f88352k = cVar;
            this.f88353l = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1855c(this.f88352k, this.f88353l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super ProductCarousel> eVar) {
            return ((C1855c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List<String> list;
            Object f10 = C17187b.f();
            int i10 = this.f88351j;
            if (i10 == 0) {
                y.b(obj);
                e g10 = this.f88352k.f88335b;
                String c10 = this.f88352k.f88338e.c();
                List<String> list2 = this.f88353l;
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(!list2.isEmpty());
                String str = null;
                List<String> list3 = a10.booleanValue() ? list2 : null;
                if (list3 != null) {
                    list = C16877v.k1(list3, 50);
                    if (list != null) {
                        str = C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
                    }
                } else {
                    list = list2;
                }
                this.f88344c = list3;
                this.f88345d = list;
                this.f88346e = list2;
                this.f88347f = g10;
                this.f88348g = c10;
                this.f88349h = a10;
                this.f88350i = 0;
                this.f88351j = 1;
                obj2 = g10.a(c10, str, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Boolean bool = (Boolean) this.f88349h;
                String str2 = (String) this.f88348g;
                e eVar = (e) this.f88347f;
                List list4 = (List) this.f88346e;
                List list5 = (List) this.f88345d;
                List list6 = (List) this.f88344c;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((ProductCarouselRemote) obj2).b();
        }
    }

    public c(b bVar, e eVar, Cx.b bVar2, M m10, Go.a aVar) {
        C17542s.j(bVar, "discoverEndpoint");
        C17542s.j(eVar, "secureDiscoverEndpoint");
        C17542s.j(bVar2, "publisherTokenManager");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(aVar, "clientIdentityProvider");
        this.f88334a = bVar;
        this.f88335b = eVar;
        this.f88336c = bVar2;
        this.f88337d = m10;
        this.f88338e = aVar;
    }

    public Object a(C17164e<? super ProductCarousel> eVar) {
        return C16310i.g(this.f88337d, new b(this, (C17164e<? super b>) null), eVar);
    }

    public Object b(String str, C17164e<? super C11080b> eVar) {
        return C16310i.g(this.f88337d, new a(this, str, (C17164e<? super a>) null), eVar);
    }

    public Object c(List<String> list, C17164e<? super ProductCarousel> eVar) {
        return C16310i.g(this.f88337d, new C1855c(this, list, (C17164e<? super C1855c>) null), eVar);
    }
}
