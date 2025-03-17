package in;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hn.C11370a;
import in.e;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nn.C11655a;
import nn.C11657c;
import nn.C11660f;
import nn.C11661g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lin/a;", "Lhn/a;", "Lin/e;", "browseRepository", "LjB/b;", "shoppingListRepository", "LQJ/M;", "ioDispatcher", "<init>", "(Lin/e;LjB/b;LQJ/M;)V", "Lnn/a;", "browseData", "", "", "allProductsInShoppingLists", "Lnn/c;", "f", "(Lnn/a;Ljava/util/Set;)Lnn/c;", "LTJ/g;", "a", "()LTJ/g;", "", "b", "(LdI/e;)Ljava/lang/Object;", "Lin/e;", "LjB/b;", "c", "LQJ/M;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: in.a  reason: case insensitive filesystem */
public final class C11407a implements C11370a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f98407a;

    /* renamed from: b  reason: collision with root package name */
    private final C14613b f98408b;

    /* renamed from: c  reason: collision with root package name */
    private final M f98409c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$a  reason: collision with other inner class name */
    /* synthetic */ class C2220a extends C17525a implements q<C11655a, Set<? extends String>, C17164e<? super C11657c>, Object> {
        C2220a(Object obj) {
            super(3, obj, C11407a.class, "transform", "transform(Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/BrowseContent;Ljava/util/Set;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/BrowseContentWithShoppingListData;", 4);
        }

        /* renamed from: a */
        public final Object invoke(C11655a aVar, Set<String> set, C17164e<? super C11657c> eVar) {
            return ((C11407a) this.f144363a).f(aVar, set);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.BrowseContentInteractorImpl$syncContent$2", f = "BrowseContentInteractorImpl.kt", l = {37}, m = "invokeSuspend")
    /* renamed from: in.a$b */
    static final class b extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98410c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11407a f98411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11407a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f98411d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f98411d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98410c;
            if (i10 == 0) {
                y.b(obj);
                e c10 = this.f98411d.f98407a;
                this.f98410c = 1;
                obj = e.a.a(c10, false, this, 1, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public C11407a(e eVar, C14613b bVar, M m10) {
        C17542s.j(eVar, "browseRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(m10, "ioDispatcher");
        this.f98407a = eVar;
        this.f98408b = bVar;
        this.f98409c = m10;
    }

    /* access modifiers changed from: private */
    public final C11657c f(C11655a aVar, Set<String> set) {
        List<ProductItem> list;
        C11661g gVar = null;
        if (aVar == null) {
            return null;
        }
        ProductCarousel b10 = aVar.b();
        if (b10 == null || (list = b10.c()) == null) {
            list = C16877v.n();
        }
        Iterable<ProductItem> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductItem productItem : iterable) {
            arrayList.add(new C11660f(productItem, set.contains(productItem.f())));
        }
        List<Category> a10 = aVar.a();
        List<Category> c10 = aVar.c();
        ProductCarousel b11 = aVar.b();
        if (b11 != null) {
            gVar = new C11661g(b11.b(), b11.e(), arrayList, set);
        }
        return new C11657c(a10, c10, gVar);
    }

    public C16532g<C11657c> a() {
        return C16534i.n(this.f98407a.b(), this.f98408b.f(), new C2220a(this));
    }

    public Object b(C17164e<? super Boolean> eVar) {
        return C16310i.g(this.f98409c, new b(this, (C17164e<? super b>) null), eVar);
    }
}
