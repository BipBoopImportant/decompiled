package ez;

import Sy.a;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import com.optimizely.ab.config.FeatureVariable;
import java.util.Iterator;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.O;
import rz.X;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&¨\u0006'"}, d2 = {"Lez/a;", "", "LkK/c;", "json", "<init>", "(LkK/c;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "model", "", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;)Ljava/lang/String;", "string", "f", "(Ljava/lang/String;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productLiteRemote", "b", "(Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;)Ljava/lang/String;", "h", "(Ljava/lang/String;)Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "LSy/a$b;", "a", "(Ljava/lang/String;)LSy/a$b;", "type", "g", "(LSy/a$b;)Ljava/lang/String;", "Lrz/O;", "i", "(Ljava/lang/String;)Lrz/O;", "scanType", "d", "(Lrz/O;)Ljava/lang/String;", "Lrz/X;", "e", "(Ljava/lang/String;)Lrz/X;", "reason", "j", "(Lrz/X;)Ljava/lang/String;", "LkK/c;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ez.a  reason: case insensitive filesystem */
public final class C14437a {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f126821a;

    public C14437a(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f126821a = cVar;
    }

    public final a.b a(String str) {
        T t10;
        Iterator<T> it = a.b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((a.b) t10).j(), str)) {
                break;
            }
        }
        return (a.b) t10;
    }

    public final String b(ProductLiteRemote productLiteRemote) {
        C17542s.j(productLiteRemote, "productLiteRemote");
        return this.f126821a.b(ProductLiteRemote.Companion.serializer(), productLiteRemote);
    }

    public final String c(ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel) {
        if (scanAndGoProductResponseDataModel != null) {
            return this.f126821a.b(ScanAndGoProductResponseDataModel.Companion.serializer(), scanAndGoProductResponseDataModel);
        }
        return null;
    }

    public final String d(O o10) {
        if (o10 != null) {
            return o10.name();
        }
        return null;
    }

    public final X e(String str) {
        T t10 = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = X.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C17542s.e(((X) next).j(), str)) {
                t10 = next;
                break;
            }
        }
        X x10 = (X) t10;
        return x10 == null ? X.COUPON_GENERIC_ERROR : x10;
    }

    public final ScanAndGoProductResponseDataModel f(String str) {
        if (str != null) {
            return (ScanAndGoProductResponseDataModel) this.f126821a.c(ScanAndGoProductResponseDataModel.Companion.serializer(), str);
        }
        return null;
    }

    public final String g(a.b bVar) {
        if (bVar != null) {
            return bVar.j();
        }
        return null;
    }

    public final ProductLiteRemote h(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        return (ProductLiteRemote) this.f126821a.c(ProductLiteRemote.Companion.serializer(), str);
    }

    public final O i(String str) {
        T t10;
        Iterator<T> it = O.j().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((O) t10).name(), str)) {
                break;
            }
        }
        return (O) t10;
    }

    public final String j(X x10) {
        if (x10 == null) {
            return null;
        }
        return x10.j();
    }
}
