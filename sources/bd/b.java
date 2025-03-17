package Bd;

import GK.C15777E;
import com.ikea.kompassmap.model.product.Product;
import com.ikea.kompassmap.model.store.Store;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.FeatureCollection;
import yd.C10444O;
import zd.C10490b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000eH@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"LBd/b;", "LBd/a;", "Lzd/b;", "kompassApi", "<init>", "(Lzd/b;)V", "", "userAgent", "token", "storeNo", "ruCode", "languageCode", "supportedStatus", "supportedPlatform", "", "extraParameters", "Lcom/ikea/kompassmap/model/store/Store;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ikea/kompassmap/model/product/Product;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "Lyd/O;", "type", "Lorg/maplibre/geojson/FeatureCollection;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyd/O;LdI/e;)Ljava/lang/Object;", "url", "LGK/E;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lzd/b;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C10490b f58904a;

    public b(C10490b bVar) {
        C17542s.j(bVar, "kompassApi");
        this.f58904a = bVar;
    }

    public Object a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, C17164e<? super Product> eVar) {
        return this.f58904a.a(str, str2, str3, str4, str5, str6, map, eVar);
    }

    public Object b(String str, C17164e<? super C15777E> eVar) {
        return this.f58904a.b(str, eVar);
    }

    public Object c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, C17164e<? super Store> eVar) {
        return this.f58904a.c(str, str2, str3, str4, str5, str6, str7, map, eVar);
    }

    public Object d(String str, String str2, String str3, String str4, C10444O o10, C17164e<? super FeatureCollection> eVar) {
        return this.f58904a.d(str, str2, str3, str4, o10.b(), eVar);
    }
}
