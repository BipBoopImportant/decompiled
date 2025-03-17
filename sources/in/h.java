package in;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hn.C11373d;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nn.C11660f;
import nn.C11661g;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lin/h;", "Lhn/d;", "Lin/e;", "browseRepository", "LjB/b;", "shoppingListRepository", "Lup/d;", "userConsentRepository", "LaA/a;", "sessionManager", "<init>", "(Lin/e;LjB/b;Lup/d;LaA/a;)V", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "productCarousel", "", "", "allProductsInShoppingLists", "Lnn/g;", "e", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;Ljava/util/Set;)Lnn/g;", "LTJ/g;", "a", "()LTJ/g;", "Lin/e;", "b", "LjB/b;", "c", "LTJ/g;", "accessoryRecommendations", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C11373d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f98491a;

    /* renamed from: b  reason: collision with root package name */
    private final C14613b f98492b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<ProductCarousel> f98493c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "personalisationConsented", "", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.RecommendedContentUseCaseImpl$accessoryRecommendations$1", f = "RecommendedContentUseCaseImpl.kt", l = {35}, m = "invokeSuspend")
    static final class a extends l implements q<Boolean, Boolean, C17164e<? super ProductCarousel>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98494c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f98495d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f98496e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f98496e = hVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super ProductCarousel> eVar) {
            a aVar = new a(this.f98496e, eVar);
            aVar.f98495d = z10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98494c;
            if (i10 == 0) {
                y.b(obj);
                boolean z10 = this.f98495d;
                if (!z10) {
                    return null;
                }
                e b10 = this.f98496e.f98491a;
                this.f98495d = z10;
                this.f98494c = 1;
                obj = b10.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (ProductCarousel) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17525a implements q<ProductCarousel, Set<? extends String>, C17164e<? super C11661g>, Object> {
        b(Object obj) {
            super(3, obj, h.class, "transform", "transform(Lcom/ingka/ikea/core/model/product/ProductCarousel;Ljava/util/Set;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/PromotionWithShoppingListData;", 4);
        }

        /* renamed from: a */
        public final Object invoke(ProductCarousel productCarousel, Set<String> set, C17164e<? super C11661g> eVar) {
            return ((h) this.f144363a).e(productCarousel, set);
        }
    }

    public h(e eVar, C14613b bVar, C12074d dVar, C13909a aVar) {
        C17542s.j(eVar, "browseRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(dVar, "userConsentRepository");
        C17542s.j(aVar, "sessionManager");
        this.f98491a = eVar;
        this.f98492b = bVar;
        this.f98493c = C16534i.n(dVar.c(C12071a.c.f103981e), aVar.n(), new a(this, (C17164e<? super a>) null));
    }

    /* access modifiers changed from: private */
    public final C11661g e(ProductCarousel productCarousel, Set<String> set) {
        if (productCarousel == null) {
            return null;
        }
        Iterable<ProductItem> c10 = productCarousel.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (ProductItem productItem : c10) {
            arrayList.add(new C11660f(productItem, set.contains(productItem.f())));
        }
        return new C11661g(productCarousel.b(), productCarousel.e(), arrayList, set);
    }

    public C16532g<C11661g> a() {
        return C16534i.n(this.f98493c, this.f98492b.f(), new b(this));
    }
}
